package X;

import java.io.IOException;

/* renamed from: X.CgH  reason: case insensitive filesystem */
public abstract class C44521CgH {
    public static C42114BHs parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            C42113BHr bHr = null;
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("entity".equals(A17)) {
                    bHr = C44522CgI.parseFromJson(r8);
                } else if ("length".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r8);
                } else {
                    num = C41847B3o.A13(r8, num, A17, "offset");
                }
                r8.A0z();
            }
            if (bHr == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("entity", r8, "TextEntityRange");
            } else if (num != null || !(r8 instanceof 0c9)) {
                return new C42114BHs(bHr, num2, num.intValue());
            } else {
                AnonymousClass7TF.A1L("offset", r8, "TextEntityRange");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
