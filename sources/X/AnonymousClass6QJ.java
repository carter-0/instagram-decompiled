package X;

import android.net.Uri;
import android.util.Base64;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.6QJ  reason: invalid class name */
public abstract class AnonymousClass6QJ {
    public static final Uri A00(Uri uri) {
        0qQ.A0B(uri, 0);
        String A00 = AnonymousClass6QE.A00(new C11847ShZ(uri), AnonymousClass6QE.A02);
        if (A00 == null) {
            return uri;
        }
        Uri A03 = 0cp.A03(A00);
        0qQ.A07(A03);
        return A03;
    }

    public static final Uri A01(Uri uri, boolean z) {
        0qQ.A0B(uri, 0);
        AnonymousClass6QE r6 = AnonymousClass6QE.A02;
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        0qQ.A07(schemeSpecificPart);
        uri.getPath();
        SecretKey secretKey = AnonymousClass6QF.A00;
        String str = null;
        if (0qQ.A0K(scheme, "file")) {
            if (z) {
                1Kn.A02("BloksFilePathSecurityFailure", "[BKFileURLObfuscation] Unexpected file URI encountered, expected bkfileurl or other scheme. ");
                throw new RuntimeException("Unexpected file URI encountered, expected bkfileurl or other scheme. ");
            }
        } else if (0qQ.A0K(scheme, "bkfileurl")) {
            try {
                Charset charset = AnonymousClass15Q.A05;
                byte[] bytes = schemeSpecificPart.getBytes(charset);
                0qQ.A07(bytes);
                byte[] decode = Base64.decode(bytes, 9);
                0qQ.A0A(decode);
                byte[] A0v = 00k.A0v(03t.A0B(new 2HY(0, 11), decode));
                byte[] A0v2 = 00k.A0v(03t.A0B(C229632nm.A0C(12, decode.length), decode));
                IvParameterSpec ivParameterSpec = new IvParameterSpec(A0v);
                Cipher instance = Cipher.getInstance(AnonymousClass000.A00(858));
                instance.init(2, r6.A01, ivParameterSpec);
                byte[] doFinal = instance.doFinal(A0v2);
                0qQ.A07(doFinal);
                str = new String(doFinal, charset);
            } catch (Exception e) {
                throw new RuntimeException(002.A0R("Failed to decrypt encrypted file path URL: ", e.getMessage()));
            }
        }
        if (str == null) {
            return uri;
        }
        Uri A03 = 0cp.A03(str);
        0qQ.A07(A03);
        return A03;
    }
}
