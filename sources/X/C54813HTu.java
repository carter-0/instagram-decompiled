package X;

import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.IOException;

/* renamed from: X.HTu  reason: case insensitive filesystem */
public abstract class C54813HTu {
    public static C52657GaV parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            ClipsCameraCommandAction clipsCameraCommandAction = null;
            Integer num = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("action".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    clipsCameraCommandAction = (ClipsCameraCommandAction) ClipsCameraCommandAction.A01.get(str);
                    if (clipsCameraCommandAction == null) {
                        clipsCameraCommandAction = ClipsCameraCommandAction.UNRECOGNIZED;
                    }
                } else {
                    num = C41847B3o.A13(r8, num, A17, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                }
                r8.A0z();
            }
            if (clipsCameraCommandAction == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L("action", r8, "OpenClipsCameraCommandImpl");
            } else if (num != null || !(r8 instanceof 0c9)) {
                return new C52657GaV(clipsCameraCommandAction, num.intValue());
            } else {
                AnonymousClass7TF.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r8, "OpenClipsCameraCommandImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
