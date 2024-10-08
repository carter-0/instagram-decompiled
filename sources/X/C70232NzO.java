package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.IOException;

/* renamed from: X.NzO  reason: case insensitive filesystem */
public abstract class C70232NzO {
    public static AnonymousClass1dD parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            AnonymousClass1dD r1 = new AnonymousClass1dD();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("share_target".equals(A17)) {
                    r1.A01 = C330897Or.parseFromJson(r3);
                } else if ("reel_id".equals(A17)) {
                    r1.A03 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(3515).equals(A17)) {
                    r1.A00 = C70878OPs.parseFromJson(r3);
                } else if (ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY.equals(A17)) {
                    r1.A02 = AnonymousClass7TG.A0l(r3);
                } else {
                    C66893Meb.A01(r3, r1, A17);
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
