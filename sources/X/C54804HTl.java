package X;

import com.instagram.api.schemas.MidCardClipsClickedAction;
import java.io.IOException;

/* renamed from: X.HTl  reason: case insensitive filesystem */
public abstract class C54804HTl {
    public static C53448Gog parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            MidCardClipsClickedAction midCardClipsClickedAction = null;
            C53457Gop gop = null;
            C53459Gor gor = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("action".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    midCardClipsClickedAction = (MidCardClipsClickedAction) MidCardClipsClickedAction.A01.get(str);
                    if (midCardClipsClickedAction == null) {
                        midCardClipsClickedAction = MidCardClipsClickedAction.UNRECOGNIZED;
                    }
                } else if ("open_draft".equals(A17)) {
                    gop = C54815HTw.parseFromJson(r8);
                } else if ("open_reels_chain".equals(A17)) {
                    gor = C54818HTz.parseFromJson(r8);
                }
                r8.A0z();
            }
            if (midCardClipsClickedAction != null || !(r8 instanceof 0c9)) {
                return new C53448Gog(midCardClipsClickedAction, gop, gor);
            }
            AnonymousClass7TF.A1L("action", r8, "MidCardClipsClickedActionInfoImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
