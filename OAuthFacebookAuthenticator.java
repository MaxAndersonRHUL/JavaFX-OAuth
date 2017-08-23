/**
 * Created by max on 13/08/2017.
 */
public class OAuthFacebookAuthenticator extends OAuthAuthenticator{

    private String FACEBOOK_fieldsString = "name,gender,id";

    public OAuthFacebookAuthenticator(String clientID, String redirectUri, String clientSecret, String apiFields) {
        super(clientID, redirectUri, clientSecret);
        FACEBOOK_fieldsString = apiFields;
    }

    @Override
    String getWebUrl() {
        return "https://www.facebook.com/dialog/oauth?client_id=" + getClientID() + "&redirect_uri=" + getRedirectUri();
    }

    @Override
    String getApiTokenUrl() {
        return "https://graph.facebook.com/me?fields=" + FACEBOOK_fieldsString + "&access_token=" + getAccessToken();
    }

    @Override
    String getApiAccessUrl() {
        return "https://graph.facebook.com/oauth/access_token";
    }

    @Override
    String getApiAccessParams() {
        return  "client_id=" + getClientID() + "&redirect_uri=" + getRedirectUri() + "&client_secret=" + getClientSecret() + "&code=" + getAccessCode();
    }


}
