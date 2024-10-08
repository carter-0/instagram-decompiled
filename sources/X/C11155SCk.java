package X;

import android.util.Base64;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.SCk  reason: case insensitive filesystem */
public abstract class C11155SCk {
    public static final SecretKeySpec A00;
    public static final byte[] A01;

    static {
        byte[] A1V = Pxf.A1V("iN4$aGr0m", AnonymousClass15Q.A05);
        A01 = A1V;
        A00 = new SecretKeySpec(A1V, "HmacSHA256");
    }

    public static final String A00(long j, int i, int i2) {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(i);
        A1A.append(" ");
        A1A.append(j);
        A1A.append(" ");
        A1A.append(i2);
        A1A.append(" ");
        A1A.append(System.currentTimeMillis());
        String A10 = DbT.A10(A1A);
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(A00);
            str = Base64.encodeToString(instance.doFinal(C66582MXn.A1a(A10)), 0);
        } catch (GeneralSecurityException unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return 002.A0R(str, Base64.encodeToString(C66582MXn.A1a(A10), 0));
    }
}
