package X;

import java.io.IOException;

/* renamed from: X.KvF  reason: case insensitive filesystem */
public abstract class C63332KvF {
    public static C61224JzH parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C61223JzG jzG = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("incentive".equals(AnonymousClass7TE.A17(r3))) {
                    jzG = C63331KvE.parseFromJson(r3);
                }
                r3.A0z();
            }
            return new C61224JzH(jzG);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
