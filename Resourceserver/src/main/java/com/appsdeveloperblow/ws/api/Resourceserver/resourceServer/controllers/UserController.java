package com.appsdeveloperblow.ws.api.resourceServer.resourceServer.controllers;

import com.appsdeveloperblow.ws.api.resourceServer.resourceServer.models.UserModel;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

  @GetMapping("/status/check")
  public String status() {
    return "Working...";
  }

  // @Secured("ROLE_developer")
  @PreAuthorize("hasAuthority('ROLE_developer') or #id == #jwt.subject")
  @DeleteMapping(path = "/{id}")
  public String deleteUser(@PathVariable("id") String id, @AuthenticationPrincipal Jwt jwt) {
    return "Delete use with id " + id + "and JWT subject " + jwt.getSubject();
  }

  @PostAuthorize("returnObject.userId == #jwt.subject")
  @GetMapping("/{id}")
  public UserModel createUser(@PathVariable String id, @AuthenticationPrincipal Jwt jwt) {
    return new UserModel("Daniel", "Bautista", "0d6f1a24-787a-448b-a8b4-d6fdb4d3e09a");
  }
}
