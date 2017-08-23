# JavaFX-OAuth
Utilising JavaFX WebViews to access Google and Facebook apis with OAuth.

Requires org.json library to parse json files, but this can be changed to your json parser of choice quite easily.
```Maven
<groupId>org.json</groupId>
<artifactId>json</artifactId>
<version>20160810</version>
```

This lightweight library makes it conveneint to add OAuth logins and api access to desktop applications built with JavaFX. 
Simply create an OAuthAuthenticator object like so:
```Java
OAuthAuthenticator authFB = new OAuthFacebookAuthenticator(FACEBOOK_clientID, FACEBOOK_redirectUri, FACEBOOK_clientSecret, FACEBOOK_fieldsString);
```
And then call:
```Java
authFB.startLogin();
```
to open a new webview for the specified service (In this case, facebook). Users can then login, and the authenticator will retrieve the access token and query the relevant api. Add an OAuthCompletedCallback to get notified when the login has completed, and the returned json data is ready to be read.

Currently supprts facebook and google.
