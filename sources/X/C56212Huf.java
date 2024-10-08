package X;

import com.instagram.api.schemas.LimitedInteractionsVersions;
import java.io.IOException;

/* renamed from: X.Huf  reason: case insensitive filesystem */
public final class C56212Huf {
    public static C54051Gya parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            1XQ r2 = new 1XQ();
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("is_enabled".equals(A17)) {
                    r2.A04 = AnonymousClass7TF.A0S(r9);
                } else if (C66579MXk.A00(937).equals(A17)) {
                    r2.A00 = C54799HTg.parseFromJson(r9);
                } else if (C66579MXk.A00(938).equals(A17)) {
                    r2.A01 = C54800HTh.parseFromJson(r9);
                } else if ("reminder_date".equals(A17)) {
                    r2.A05 = AnonymousClass7TF.A0Z(r9);
                } else if ("start_date".equals(A17)) {
                    r2.A06 = AnonymousClass7TF.A0Z(r9);
                } else if ("version".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    LimitedInteractionsVersions limitedInteractionsVersions = (LimitedInteractionsVersions) LimitedInteractionsVersions.A01.get(str);
                    if (limitedInteractionsVersions == null) {
                        limitedInteractionsVersions = LimitedInteractionsVersions.UNRECOGNIZED;
                    }
                    r2.A03 = limitedInteractionsVersions;
                } else {
                    1XY.A01(r9, r2, A17);
                }
                r9.A0z();
            }
            Boolean bool = r2.A04;
            C294475mW r4 = r2.A00;
            C53446Goe goe = r2.A01;
            0qQ.A0A(goe);
            Long l = r2.A05;
            Long l2 = r2.A06;
            LimitedInteractionsVersions limitedInteractionsVersions2 = r2.A03;
            0qQ.A0A(limitedInteractionsVersions2);
            r2.A02 = new C53447Gof(r4, goe, limitedInteractionsVersions2, bool, l, l2);
            return r2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
