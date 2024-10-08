package X;

import java.io.IOException;

/* renamed from: X.CkO  reason: case insensitive filesystem */
public abstract class C44752CkO {
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.3UI] */
    public static AnonymousClass3UI parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            AnonymousClass3UJ r7 = null;
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            C266544Zk r6 = null;
            C266544Zk r5 = null;
            C266544Zk r4 = null;
            C266544Zk r3 = null;
            C266544Zk r2 = null;
            C250533lb r1 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("user_card".equals(A17)) {
                    r7 = C41907B6f.parseFromJson(r9);
                } else if ("upsell_fbc_card".equals(A17)) {
                    r6 = C266534Zj.parseFromJson(r9);
                } else if (AnonymousClass000.A00(816).equals(A17)) {
                    r5 = C266534Zj.parseFromJson(r9);
                } else if ("upsell_invite_card".equals(A17)) {
                    r4 = C266534Zj.parseFromJson(r9);
                } else if ("upsell_see_all_su_card".equals(A17)) {
                    r3 = C266534Zj.parseFromJson(r9);
                } else if ("upsell_complete_profile_card".equals(A17)) {
                    r2 = C266534Zj.parseFromJson(r9);
                } else if (C41845B3m.A1Y(A17)) {
                    r9.A1D();
                } else if ("item_client_gap_rules".equals(A17)) {
                    r1 = C250523la.parseFromJson(r9);
                }
                r9.A0z();
            }
            ? obj = new Object();
            if (r7 != null) {
                obj.A08 = r7;
            }
            if (r6 != null) {
                obj.A02 = r6;
            }
            if (r5 != null) {
                obj.A00 = r5;
            }
            if (r4 != null) {
                obj.A03 = r4;
            }
            if (r3 != null) {
                obj.A04 = r3;
            }
            if (r2 != null) {
                obj.A01 = r2;
            }
            if (r1 != null) {
                obj.A05 = r1;
            }
            obj.A01();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
