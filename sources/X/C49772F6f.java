package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.F6f  reason: case insensitive filesystem */
public final class C49772F6f {
    public static ENM parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r0 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if (Dbj.A04(39, 17, 26).equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("autoconfirmation_sources".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    r0.A03 = arrayList;
                } else if ("gdpr_required".equals(A17)) {
                    r0.A05 = r5.A0d();
                } else if ("gdpr_s".equals(A17)) {
                    r0.A00 = AnonymousClass7TG.A0l(r5);
                } else if ("tos_version".equals(A17)) {
                    r0.A01 = AnonymousClass7TG.A0l(r5);
                } else if ("age_required".equals(A17)) {
                    r0.A04 = r5.A0d();
                } else {
                    C49027Eo3.A00(r5, r0, A17);
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
