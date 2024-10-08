package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cjf  reason: case insensitive filesystem */
public abstract class C44711Cjf {
    public static C65501cx parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C65501cx r1 = new C65501cx();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                ArrayList arrayList = null;
                if ("rooms_link_share".equals(A17)) {
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            C41848B3p.A1P(r4, arrayList);
                        }
                    }
                    r1.A05 = arrayList;
                } else if ("link".equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(3898).equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r4);
                } else if ("is_audio_only_call".equals(A17)) {
                    r1.A06 = r4.A0d();
                } else if (AnonymousClass000.A00(3502).equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("xma_type".equals(A17)) {
                    r1.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("direct_forwarding_params".equals(A17)) {
                    r1.A00 = C49753F5e.parseFromJson(r4);
                } else {
                    C66893Meb.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
