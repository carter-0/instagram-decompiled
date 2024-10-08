package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cet  reason: case insensitive filesystem */
public abstract class C44435Cet {
    public static BHF parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("emoji".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if ("reactors".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C41846B3n.A1E(r8, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("emoji", r8, "StoryReactionStickerReactorsImpl");
            } else if (arrayList != null || !(r8 instanceof 0c9)) {
                return new BHF(str, arrayList);
            } else {
                AnonymousClass7TF.A1L("reactors", r8, "StoryReactionStickerReactorsImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
