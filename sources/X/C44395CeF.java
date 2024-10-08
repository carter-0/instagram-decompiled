package X;

import java.io.IOException;

/* renamed from: X.CeF  reason: case insensitive filesystem */
public abstract class C44395CeF {
    public static C42089BGs parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("tap_state".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if ("tap_state_str_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (num == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("tap_state", r8, "StoryFeatureLinkingStickerTapModel");
            } else if (str != null || !(r8 instanceof 0c9)) {
                return new C42089BGs(num.intValue(), str);
            } else {
                AnonymousClass7TF.A1L("tap_state_str_id", r8, "StoryFeatureLinkingStickerTapModel");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
