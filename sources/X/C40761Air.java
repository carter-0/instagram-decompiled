package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Air  reason: case insensitive filesystem */
public final class C40761Air implements Runnable {
    public final /* synthetic */ AnonymousClass1Li A00;

    public C40761Air(AnonymousClass1Li r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass1Li r7 = this.A00;
        1B7 A01 = r7.A01.A01();
        if (A01 == null) {
            r7.A03();
            return;
        }
        Iterator A0s = AnonymousClass7TF.A0s(r7.A02());
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            String str = (String) A1J.getKey();
            1S5 r2 = (1S5) A1J.getValue();
            if (!1Lk.A01(r2, r7, str)) {
                1BF r8 = r2.A00;
                if (!r8.A04) {
                    String str2 = "__invalid__";
                    String str3 = r2.A01.A00;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    if (!"__unknown__".equals(str2) && !str2.equals(A01.A01) && !str2.equals(A01.A00)) {
                        if (r8.A03) {
                            long j = r2.A00;
                            if (j >= 0 && System.currentTimeMillis() - j < 1209600000) {
                            }
                        }
                        r7.A04(str);
                    }
                }
            }
        }
    }
}
