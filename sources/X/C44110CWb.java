package X;

import java.io.IOException;

/* renamed from: X.CWb  reason: case insensitive filesystem */
public abstract class C44110CWb {
    public static N4G parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (!"creator_tool".equals(A17)) {
                    num = C41847B3o.A13(r8, num, A17, "render_position");
                } else if (r8.A11() == 16L.A0G) {
                    str = null;
                } else {
                    str = r8.A1P();
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("creator_tool", r8, "CreatorTool");
            } else if (num != null || !(r8 instanceof 0c9)) {
                return new N4G(str, num.intValue(), 5);
            } else {
                AnonymousClass7TF.A1L("render_position", r8, "CreatorTool");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
