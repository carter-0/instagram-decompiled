package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.F4o  reason: case insensitive filesystem */
public abstract class C49749F4o {
    public static final void A01(0lg r4, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass7TF.A1D(str, 1, str4);
        0xI A04 = 1Q9.A01("business_profile").A04("business_profile_action");
        A04.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A04.A0C("action", str2);
        A04.A0C("step", str3);
        A04.A0C("consumer_user_id", str4);
        A04.A0C("follow_status", str5);
        if (bool != null) {
            0xF r2 = new 0xF();
            0xF.A00(r2, bool.toString(), "should_show_public_contacts");
            A04.A05(r2, "selected_values");
        }
        DbU.A1R(A04, r4);
    }

    public static final void A00(0xF r3, 0lg r4, String str, String str2, String str3, String str4) {
        0xI A04 = 1Q9.A01("business_profile").A04("business_profile_action");
        A04.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A04.A0C("action", str2);
        A04.A0C("step", "business_profile");
        A04.A0C("consumer_user_id", str3);
        A04.A0C("follow_status", str4);
        A04.A05(r3, "selected_values");
        DbU.A1R(A04, r4);
    }
}
