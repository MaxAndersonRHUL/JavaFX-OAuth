/**
 * Created by max on 15/08/2017.
 */
public class OAuthGithubAuthenticator extends OAuthAuthenticator {

    private String GITHUB_SCOPE;

    public OAuthGithubAuthenticator(String clientID, String redirectUri, String clientSecret, String scope) {
        super(clientID, redirectUri, clientSecret);
        GITHUB_SCOPE = scope;
    }

    @Override
    String getWebUrl() {
        return "https://github.com/login/oauth/authorize?client_id=" + getClientID() + "&redirect_uri=" + getRedirectUri() + "&scope=" + GITHUB_SCOPE;
    }

    @Override
    String getApiTokenUrl() {
        return "https://api.github.com/user?access_token=" + getAccessToken();
    }

    @Override
    String getApiAccessUrl() {
        return "https://github.com/login/oauth/access_token";
    }

    @Override
    String getApiAccessParams() {
        return "client_id=" + getClientID() + "&redirect_uri=" + getRedirectUri() + "&client_secret=" + getClientSecret() + "&grant_type=authorization_code&code=" + getAccessCode();
    }
}
