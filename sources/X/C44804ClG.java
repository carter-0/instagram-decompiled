package X;

import java.io.IOException;

/* renamed from: X.ClG  reason: case insensitive filesystem */
public abstract class C44804ClG {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.Cvh, java.lang.Object] */
    public static C45401Cvh parseFromJson(16F r3) {
        String str;
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                if (C41846B3n.A1Y(r3, A0q)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    obj.A03 = str;
                } else if ("owner".equals(A0q)) {
                    obj.A02 = C44805ClH.parseFromJson(r3);
                } else if (AnonymousClass000.A00(3472).equals(A0q)) {
                    obj.A04 = r3.A0d();
                } else if (AnonymousClass000.A00(1928).equals(A0q)) {
                    r3.A1D();
                } else if ("edge_media_preview_like".equals(A0q)) {
                    obj.A01 = C44801ClD.parseFromJson(r3);
                } else if ("edge_media_preview_comment".equals(A0q)) {
                    obj.A00 = C44801ClD.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
