package X;

import android.app.Activity;
import android.content.pm.Signature;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.spotify.sdk.android.auth.AuthorizationRequest;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class SNS {
    public static final String[] A03 = {".debug", ".canary", ".partners", ""};
    public static final String[] A04 = {"25a9b2d2745c098361edaa3b87936dc29a28e7f1", "80abdd17dcc4cb3a33815d354355bf87c9378624", "88df4d670ed5e01fc7b3eff13b63258628ff5a00", "d834ae340d1e854c5f4092722f9788216d9221e5", "1cbedd9e7345f64649bad2b493a20d9eea955352", "4b3d76a2de89033ea830f476a1f815692938e33b"};
    public final Activity A00;
    public final AuthorizationRequest A01;
    public final C10330RqT A02;

    public static boolean A00(C10330RqT rqT, Signature[] signatureArr) {
        int length;
        String str;
        if (signatureArr == null || (length = signatureArr.length) == 0) {
            return false;
        }
        int i = 0;
        do {
            String charsString = signatureArr[i].toCharsString();
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                byte[] bytes = charsString.getBytes(ReactWebViewManager.HTML_ENCODING);
                instance.update(bytes, 0, bytes.length);
                byte[] digest = instance.digest();
                int length2 = digest.length;
                char[] cArr = new char[(length2 * 2)];
                for (int i2 = 0; i2 < length2; i2++) {
                    byte b = digest[i2] & 255;
                    int i3 = i2 * 2;
                    char[] cArr2 = rqT.A00;
                    cArr[i3] = cArr2[b >>> 4];
                    Pxe.A1a(cArr2, cArr, b, i3 + 1);
                }
                str = new String(cArr);
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
                str = null;
            }
            String[] strArr = A04;
            int i4 = 0;
            while (!strArr[i4].equalsIgnoreCase(str)) {
                i4++;
                if (i4 >= 6) {
                    return false;
                }
            }
            i++;
        } while (i < length);
        return true;
    }

    public SNS(Activity activity, AuthorizationRequest authorizationRequest, C10330RqT rqT) {
        this.A00 = activity;
        this.A01 = authorizationRequest;
        this.A02 = rqT;
    }
}
