# Oauth2-spring-boot

OAuth 2.0 Spring Boot Course

## Section 4 : Standalone Authorization Server.

    - Keycloack - is an open source Identity and Access management solution
    - supports SSO()
    - Social Login
    - download https://www.keycloak.org/
    - Keycloack
        -  .\kc.bat start-dev
        - .\kc.bat start-dev --http-port=8082
        - Checking endpoints
            -http://localhost:8080/realms/appsdeveloperblog/.well-known/openid-configuration
        - creating user
            - http://localhost:8080/realms/appsdeveloperblog/account/#/
        - creating realm
            -http://localhost:8080/realms/appsdeveloperblog/protocol/openid-connect/auth?client_id=photo-app-code-flow-client&response_type=code&scope=openid profile&redirect_uri=http://localhost:8083/callback&state=testingthings

## Section 5: Creating Spring resource server.

    - Created resource server.
    - Access to the resource server using spring-oath2.
    - get a token object from a resource server endpoint. 

## Section 6: Scoped based access control 

    - kind of scopes
    - Access to a resource based on scope.

## Section 7: Role based access control 
    
    - Roles vs authorities.
    - roles like User Admin super Admin, are also a collection of authorities.
    - Authority priviliges that have a role.
    - Access to a resource based on Roles

## Section 8: Method Level Security

    - You can use security anotation for a method level authorization.
    - @Authorized, @PreAuthorize, @PostAuthorize.
    - You can also used this methods in a Class. 

## Section 9: Resource server behind API gateway
    
    - Architecture based on microservices.
    - Spring cloud API gateway.
    - Created two more microservices 
    - access to the microservices through the API gateway


## Resources:
    
    - https://github.com/simplyi/ResourceServer/tree/before-adding-role-based-acceess-control   
    - https://codejava.net/frameworks/spring-boot/fix-websecurityconfigureradapter-deprecated