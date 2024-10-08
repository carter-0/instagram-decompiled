package X;

import android.content.Context;
import java.net.URI;

/* renamed from: X.7Sy  reason: invalid class name and case insensitive filesystem */
public abstract class C331917Sy {
    public static final C331897Sw A00(Context context) {
        0qQ.A0B(context, 0);
        C331897Sw r1 = C331897Sw.A0A;
        if (r1 != null) {
            return r1;
        }
        Context applicationContext = context.getApplicationContext();
        0qQ.A07(applicationContext);
        C331897Sw r12 = new C331897Sw(applicationContext);
        C331897Sw.A0A = r12;
        return r12;
    }

    public static final boolean A02(String str) {
        try {
            if (URI.create(str).getPath() != null) {
                return true;
            }
            0wb.A03("illegal url in gifcache", 002.A0R("missing url path: ", str));
            return false;
        } catch (IllegalArgumentException e) {
            0wb.A06("illegal url in gifcache", 002.A0R("url: ", str), e);
            return false;
        }
    }

    public static final boolean A01(1JG r0, String str, byte[] bArr) {
        C227082ic AR2 = r0.AR2(str);
        0qQ.A07(AR2);
        if (AR2.A00 == null) {
            return false;
        }
        AnonymousClass3Ey r02 = (AnonymousClass3Ey) AR2.A00();
        r02.write(bArr);
        r02.A03();
        return true;
    }
}
