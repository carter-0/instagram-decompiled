package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.user.model.User;

/* renamed from: X.41I  reason: invalid class name */
public final class AnonymousClass41I implements AnonymousClass41J {
    public boolean A00;
    public final 0hq A01;
    public final Fragment A02;
    public final UserSession A03;
    public final 2el A04;
    public final AnonymousClass4DU A05;
    public final C2356230o A06;
    public final User A07;

    public final void DKm(1Xj r6) {
        0qQ.A0B(r6, 0);
        UserSession userSession = this.A03;
        AnonymousClass4DU r3 = this.A05;
        AnonymousClass0kM r0 = new AnonymousClass0kM(userSession);
        r0.A00 = r3;
        C48734EjJ.A00(r0.A00(), AnonymousClass000.A00(4203), "single_feed");
        C48899Elz.A00(this.A02, userSession, r6, r3.getModuleName());
    }

    public final void DaY(View view, 1Xj r8) {
        1Xj r3 = r8;
        0qQ.A0B(r8, 0);
        C2356230o r0 = this.A06;
        if (r0 != null) {
            r0.A00(view, this.A04, r3, QPTooltipAnchor.PROMOTE_CTA, Trigger.A0Y);
        }
    }

    public final void DaZ(View view, 1Xj r16, AnonymousClass3W1 r17, String str, String str2, String str3, String str4) {
        String str5 = str;
        0qQ.A0B(str5, 3);
        Fragment fragment = this.A02;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null && !(!AnonymousClass06S.A01(this.A01))) {
            UserSession userSession = this.A03;
            C18662VwK A002 = VA1.A00(userSession);
            1Xj r10 = r16;
            if (r10.A5t()) {
                0wc r2 = A002.A00;
                0Aj A003 = r2.A00(r2.A00, "ads_manager_finish_step");
                A003.AAJ("step", "promotion_media");
                A003.AAJ("waterfall_id", A002.A00());
                A003.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str5);
                A003.Cgf();
                C48732EjH.A00().A02(activity, userSession, str5, (String) null, false);
                return;
            }
            C18138VmE.A00().A07(fragment, (G7V) null, PromoteLaunchOrigin.FEED_LIST, this.A05, userSession, r10, str5, (String) null, false);
        }
    }

    public final void Ev5(View view, 1Xj r11, AnonymousClass3W1 r12, Integer num, String str) {
        0qQ.A0B(num, 3);
        Fragment fragment = this.A02;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            UserSession userSession = this.A03;
            C40560Ae7 ae7 = new C40560Ae7(this);
            int intValue = num.intValue();
            int i = 2131970585;
            if (intValue != 1) {
                i = 2131966727;
            }
            String string = fragment.getString(i);
            0qQ.A07(string);
            C51509FvH fvH = new C51509FvH(activity, view, ae7, string);
            View view2 = fragment.mView;
            if (view2 != null) {
                if (intValue != 1) {
                    0xY AR4 = 1Au.A00(userSession).A01.AR4();
                    AR4.E5T("reel_boost_with_instagram_effect_seen_tooltip_on_more_button", true);
                    AR4.apply();
                } else {
                    1Av A002 = 1Au.A00(userSession);
                    A002.A4c.Epx(A002, true, 1Av.A8a[110]);
                }
                view2.postDelayed(fvH, 500);
            }
        }
    }

    public final boolean Ca5() {
        return this.A00;
    }

    public AnonymousClass41I(Fragment fragment, 0hq r2, UserSession userSession, 2el r4, AnonymousClass4DU r5, C2356230o r6, User user) {
        this.A03 = userSession;
        this.A05 = r5;
        this.A02 = fragment;
        this.A07 = user;
        this.A06 = r6;
        this.A04 = r4;
        this.A01 = r2;
    }
}
