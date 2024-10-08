package X;

import java.io.IOException;

/* renamed from: X.VnS  reason: case insensitive filesystem */
public final class C18202VnS {
    public static C15626Ufs parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C15626Ufs ufs = new C15626Ufs();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                if ("create_mes_appeal".equals(AnonymousClass7TE.A17(r3))) {
                    ufs.A00 = VCW.parseFromJson(r3);
                }
                r3.A0z();
            }
            return ufs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
