package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public abstract class VAC {
    public static void A00(VVM vvm, 0wc r4, String str) {
        String str2;
        0Aj A00 = r4.A00(r4.A00, str);
        A00.AAJ("event", str);
        A00.AAJ("flow", "ig_professional_access_token_library");
        A00.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, vvm.A02);
        int intValue = vvm.A01.intValue();
        if (intValue == 0) {
            str2 = "business_user_access_token";
        } else if (intValue == 1) {
            str2 = null;
        } else {
            throw new RuntimeException();
        }
        A00.AAJ("token_type", str2);
        A00.Cgf();
    }
}
