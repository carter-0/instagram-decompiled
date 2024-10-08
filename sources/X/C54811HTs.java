package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HTs  reason: case insensitive filesystem */
public abstract class C54811HTs {
    public static C59721JVf parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("media_ids".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r8, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("top_users".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C41846B3n.A1E(r8, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                r8.A0z();
            }
            if (arrayList == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("media_ids", r8, "MusicPageSocialContext");
            } else if (arrayList2 != null || !(r8 instanceof 0c9)) {
                return new C59721JVf((List) arrayList, (List) arrayList2, 14);
            } else {
                AnonymousClass7TF.A1L("top_users", r8, "MusicPageSocialContext");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
