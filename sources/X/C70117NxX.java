package X;

import android.net.Uri;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.RedactedString;

/* renamed from: X.NxX  reason: case insensitive filesystem */
public abstract class C70117NxX {
    public static final String A00(AuthData authData, Long l, String str, String str2) {
        String str3 = null;
        if (str == null) {
            return null;
        }
        if (l == null || l.longValue() >= System.currentTimeMillis()) {
            return str;
        }
        if (str2 == null) {
            return null;
        }
        RedactedString accessToken = authData.getAccessToken();
        if (accessToken != null) {
            str3 = accessToken.getOriginalString();
        }
        return Uri.parse("https://web.facebook.com").buildUpon().appendEncodedPath(002.A11(C66580MXl.A0z(str2, 1), "&access_token=", str3, "&device_id=", authData.getDeviceID())).build().toString();
    }
}
