package X;

import com.facebook.AccessToken;
import java.util.Date;
import org.json.JSONException;

public final class QHX extends SQM {
    public AccessToken A00;
    public Date A01 = new Date(0);
    public final AnonymousClass07t A02;
    public final C10178Rnt A03;

    public QHX(AnonymousClass07t r4, C10178Rnt rnt) {
        this.A02 = r4;
        this.A03 = rnt;
        String str = rnt.A00;
        0qQ.A0B(str, 0);
        0tX A002 = 1Al.A00(1An.A1J, str);
        AccessToken accessToken = null;
        String string = A002.getString("com.facebook.AccessTokenManager.CachedAccessToken", (String) null);
        if (string != null) {
            try {
                accessToken = S88.A00(C66580MXl.A17(string));
            } catch (JSONException unused) {
            }
        }
        this.A00 = accessToken;
    }
}
