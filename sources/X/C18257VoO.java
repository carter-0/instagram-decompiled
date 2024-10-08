package X;

import java.io.IOException;

/* renamed from: X.VoO  reason: case insensitive filesystem */
public final class C18257VoO {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.Uqm, X.UY2] */
    public static C16223Uqm parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? uy2 = new UY2();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("header".equals(A17)) {
                    uy2.A01 = C44927CnK.parseFromJson(r3);
                } else if ("pivot".equals(A17)) {
                    uy2.A02 = C17058VGg.parseFromJson(r3);
                } else if ("footer".equals(A17)) {
                    uy2.A00 = C63339KvM.parseFromJson(r3);
                } else {
                    C18691Vwp.A00(r3, uy2, A17);
                }
                r3.A0z();
            }
            return uy2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
