package X;

import java.io.IOException;

/* renamed from: X.HTv  reason: case insensitive filesystem */
public abstract class C54814HTv {
    public static C53456Goo parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            C53444Goc goc = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            C47207Dsu dsu = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("highlighted_creation_tool".equals(A17)) {
                    goc = C54796HTd.parseFromJson(r7);
                } else if ("media_selection_destination".equals(A17)) {
                    dsu = C48341Ecy.parseFromJson(r7);
                }
                r7.A0z();
            }
            if (goc == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("highlighted_creation_tool", r7, "OpenCreationToolCommandImpl");
            } else if (dsu != null || !(r7 instanceof 0c9)) {
                return new C53456Goo(goc, dsu);
            } else {
                AnonymousClass7TF.A1L("media_selection_destination", r7, "OpenCreationToolCommandImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
