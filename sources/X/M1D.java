package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

public final class M1D implements G7U {
    public final int A00;
    public final Object A01;

    public M1D(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAuthorizeFail() {
        if (3 - this.A00 == 0) {
            C64986LlP llP = (C64986LlP) this.A01;
            PR9 pr9 = llP.A05;
            pr9.getClass();
            pr9.A0D = false;
            llP.A03.A05(false, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE);
        }
    }

    public final void onAuthorizeSuccess(String str, String str2) {
        switch (this.A00) {
            case 0:
                K5Y k5y = (K5Y) this.A01;
                K5Y.A01(k5y, true);
                AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
                AnonymousClass0eM r3 = k5y.A0C;
                if (AnonymousClass5w9.A01(JTS.A0J(r3))) {
                    JTT.A0R(r3).A09((C3034168s) null, "advanced_setting_relink");
                }
                C65641LxI lxI = new C65641LxI(k5y, 1);
                FragmentActivity requireActivity = k5y.requireActivity();
                UserSession A0l = AnonymousClass7TE.A0l(r3);
                C63427Kwn.A00(requireActivity, k5y.getContext(), k5y, AnonymousClass818.IG_FEED_COMPOSER_ADVANCED_SETTINGS_TOGGLE_ENABLE_POST_ACCOUNT_LINK, A0l, lxI);
                return;
            case 1:
                C65228LpY lpY = (C65228LpY) this.A01;
                C65228LpY.A02(lpY, true);
                AnonymousClass5w9 r02 = AnonymousClass5w8.A05;
                UserSession userSession = lpY.A05;
                if (AnonymousClass5w9.A01(userSession)) {
                    AnonymousClass5w9.A00(userSession).A09((C3034168s) null, "advanced_setting_relink");
                }
                C65641LxI lxI2 = new C65641LxI(lpY, 4);
                AnonymousClass4DH r2 = lpY.A04;
                C63427Kwn.A00(r2.requireActivity(), r2.requireContext(), r2, AnonymousClass818.IG_FEED_COMPOSER_ADVANCED_SETTINGS_TOGGLE_ENABLE_POST_ACCOUNT_LINK, userSession, lxI2);
                return;
            case 2:
                DirectPrivateStoryRecipientController directPrivateStoryRecipientController = (DirectPrivateStoryRecipientController) this.A01;
                AnonymousClass4DH r7 = directPrivateStoryRecipientController.A0w;
                FragmentActivity activity = r7.getActivity();
                if (activity != null) {
                    if (!DbY.A1Y(0Tu.A05, directPrivateStoryRecipientController.A0B, 36326618641545090L)) {
                        C65642LxJ lxJ = new C65642LxJ(activity, this);
                        UserSession userSession2 = directPrivateStoryRecipientController.A0B;
                        AnonymousClass818 r8 = AnonymousClass818.IG_STORY_AFTER_SHARE_SHEET_POST_ACCOUNT_LINK;
                        Context context = r7.getContext();
                        0qQ.A0B(userSession2, 2);
                        C63427Kwn.A00(activity, context, r7, r8, userSession2, lxJ);
                        return;
                    }
                    return;
                }
                return;
            default:
                C64986LlP llP = (C64986LlP) this.A01;
                PR9 pr9 = llP.A05;
                pr9.getClass();
                pr9.A0D = true;
                llP.A03.A05(true, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE);
                FragmentActivity fragmentActivity = llP.A0B;
                C65641LxI lxI3 = new C65641LxI(this, 7);
                C47518E6c e6c = llP.A0E;
                UserSession userSession3 = llP.A0C;
                AnonymousClass818 r5 = AnonymousClass818.IG_STORY_SETTINGS_MAIN_CAMERA_SETTINGS_BUTTON_POST_ACCOUNT_LINK;
                Context context2 = llP.A09;
                0qQ.A0B(userSession3, 2);
                C63427Kwn.A00(fragmentActivity, context2, e6c, r5, userSession3, lxI3);
                return;
        }
    }
}
