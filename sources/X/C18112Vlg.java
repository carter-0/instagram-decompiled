package X;

import java.io.IOException;

/* renamed from: X.Vlg  reason: case insensitive filesystem */
public final class C18112Vlg {
    public static C15236UWw parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("ad_id".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r7);
                } else if ("ads_group_id".equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r7);
                } else if ("campaign_control".equals(A17)) {
                    r1.A01 = V7D.parseFromJson(r7);
                } else if (C66579MXk.A00(891).equals(A17)) {
                    r1.A05 = AnonymousClass7TG.A0l(r7);
                } else if ("should_banner_dismissed".equals(A17)) {
                    r1.A02 = AnonymousClass7TF.A0S(r7);
                } else {
                    1XY.A01(r7, r1, A17);
                }
                r7.A0z();
            }
            String str = r1.A03;
            String str2 = r1.A04;
            r1.A00 = new C381489bq(r1.A01, r1.A02, str, str2, r1.A05);
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
