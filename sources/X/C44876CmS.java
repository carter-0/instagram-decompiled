package X;

import java.io.IOException;

/* renamed from: X.CmS  reason: case insensitive filesystem */
public abstract class C44876CmS {
    public static AnonymousClass9JE parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            C233492vo r3 = null;
            C239613Hd r4 = null;
            Integer num = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                if (C41846B3n.A1Y(r8, A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("client_gap_rules".equals(A0q)) {
                    r3 = C250043ko.parseFromJson(r8);
                } else if ("ad_pod_rules".equals(A0q)) {
                    r4 = C254953tL.parseFromJson(r8);
                } else if ("priority_index".equals(A0q)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if (C41845B3m.A1W(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new AnonymousClass9JE(r3, r4, num, str, str2, 1);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
