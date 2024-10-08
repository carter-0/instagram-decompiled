package X;

import java.io.IOException;

/* renamed from: X.6LG  reason: invalid class name */
public abstract class AnonymousClass6LG {
    public static C283405Hn parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("emoji".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("viewer_has_reacted".equals(A0q)) {
                    bool = Boolean.valueOf(r8.A0d());
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("emoji", "ReactionStickerModel");
            } else if (bool != null || !(r8 instanceof 0c9)) {
                return new C283405Hn(str, bool.booleanValue());
            } else {
                ((0c9) r8).A03.A00("viewer_has_reacted", "ReactionStickerModel");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C283405Hn r3) {
        r2.A0c();
        String str = r3.A00;
        if (str != null) {
            r2.A0R("emoji", str);
        }
        r2.A0S("viewer_has_reacted", r3.A01);
        r2.A0Z();
    }
}
