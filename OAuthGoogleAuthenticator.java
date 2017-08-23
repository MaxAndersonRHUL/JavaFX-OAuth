/**
 * Created by max on 13/08/2017.
 */
public class OAuthGoogleAuthenticator extends OAuthAuthenticator{

    private String GOOGLE_apiScope = "https://www.googleapis.com/auth/userinfo.profile";

    public OAuthGoogleAuthenticator(String clientID, String redirectUri, String clientSecret, String apiScope) {
        super(clientID, redirectUri, clientSecret);
        GOOGLE_apiScope = apiScope;
    }

    @Override
    String getWebUrl() {
        return "https://accounts.google.com/o/oauth2/v2/auth?scope=" + GOOGLE_apiScope + "&access_type=offline&redirect_uri=" + getRedirectUri() + "&response_type=code&client_id=" + getClientID();
    }

    @Override
    String getApiTokenUrl() {
        return "https://www.googleapis.com/oauth2/v2/userinfo?access_token=" + getAccessToken();
    }

    @Override
    String getApiAccessUrl() {
        return "https://www.googleapis.com/oauth2/v4/token";
    }

    @Override
    String getApiAccessParams() {
        return "client_id=" + getClientID() + "&redirect_uri=" + getRedirectUri() + "&client_secret=" + getClientSecret() + "&grant_type=authorization_code&code=" + getAccessCode();
    }
}