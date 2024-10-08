package X;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.mainactivity.InstagramMainActivity;
import com.instagram.ui.widget.proxy.ProxyFrameLayout;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.2iV  reason: invalid class name */
public final class AnonymousClass2iV extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass2iT A01;
    public final /* synthetic */ InstagramMainActivity A02;
    public final /* synthetic */ 1QK A03;
    public final /* synthetic */ ProxyFrameLayout A04;

    public AnonymousClass2iV(UserSession userSession, AnonymousClass2iT r2, InstagramMainActivity instagramMainActivity, 1QK r4, ProxyFrameLayout proxyFrameLayout) {
        this.A00 = userSession;
        this.A02 = instagramMainActivity;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = proxyFrameLayout;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean A022;
        int A002;
        long j;
        boolean z;
        UserSession userSession = this.A00;
        InstagramMainActivity instagramMainActivity = this.A02;
        Integer A003 = AnonymousClass4DY.A00(instagramMainActivity, userSession);
        Integer num = AnonymousClass05K.A00;
        if (A003 != num) {
            return true;
        }
        instagramMainActivity.A09.getClass();
        if (instagramMainActivity.A07 == null) {
            return true;
        }
        boolean A032 = AnonymousClass3EM.A03();
        if (A032) {
            A022 = C46399DeM.A07(userSession, num);
            A002 = C46399DeM.A00(userSession, num);
        } else {
            A022 = AnonymousClass3H7.A02(userSession);
            A002 = AnonymousClass3H7.A00(userSession);
        }
        Boolean valueOf = Boolean.valueOf(A032);
        String str = userSession.A06;
        Long A0n = 00y.A0n(10, str);
        Long A0n2 = 00y.A0n(10, str);
        C46400DeN.A02(C46398DeL.A0C, userSession, valueOf, A0n, A0n2, (long) A002, A022);
        C226062fZ r5 = instagramMainActivity.A07;
        r5.getClass();
        UserSession userSession2 = r5.A07;
        0tB A004 = AnonymousClass0BO.A00(userSession2);
        0tB r9 = A004;
        0qQ.A0B(userSession2, 0);
        C62880wX r8 = C61170le.A00;
        boolean z2 = false;
        if (AnonymousClass0xl.A00(r8).A00.getInt("preference_double_tap_profile_tab_education_dialog_impression_count", -1) > 0) {
            z2 = true;
        }
        0tB A005 = AnonymousClass0BO.A00(userSession2);
        Number number = (Number) A005.A02.A01.get(0eE.A00(userSession2).A00());
        if (number != null) {
            j = number.longValue();
        } else {
            j = -1;
        }
        if (j < AnonymousClass0xl.A00(r8).A00.getLong("preference_double_tap_profile_tab_tooltip_last_impression_time", -1)) {
            r9.Clm();
            z = true;
        } else {
            z = false;
        }
        if (z2 || z) {
            A004.CIe(r5.A02, userSession2, "double_tap_tab_bar");
        } else {
            C358248ab r7 = new C358248ab(r5.A02);
            r7.A08(2131961002);
            r7.A09(2131961005);
            r7.A0I(new FI8(r5, A004), 2131961004);
            r7.A0G(new FI9(r5, A004), 2131961003);
            r7.A0r(false);
            AnonymousClass0fN.A00(r7.A02());
        }
        0wc A023 = AnonymousClass0kN.A02(userSession2);
        0Aj A006 = A023.A00(A023.A00, "account_switch_button_tapped");
        ArrayList A007 = FFT.A00(userSession2);
        if (A006.isSampled()) {
            A006.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "double_tap_tab_bar");
            A006.A9F("number_of_accounts", Long.valueOf(((Number) A007.get(1)).longValue()));
            A006.A9F("number_of_logged_in_accounts", Long.valueOf(((Number) A007.get(0)).longValue()));
            A006.AAJ("module", r5.A03.getModuleName());
            A006.Cgf();
        }
        Runnable runnable = instagramMainActivity.A0D;
        if (runnable == null) {
            return true;
        }
        Handler handler = instagramMainActivity.A0g;
        0qQ.A0A(runnable);
        handler.removeCallbacks(runnable);
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        InstagramMainActivity instagramMainActivity = this.A02;
        UserSession userSession = instagramMainActivity.A05;
        if (instagramMainActivity.A07 != null && userSession != null) {
            AnonymousClass0BO.A00(userSession).A01 = false;
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        InstagramMainActivity instagramMainActivity = this.A02;
        UserSession userSession = instagramMainActivity.A05;
        AnonymousClass2iT r2 = this.A01;
        if (!(r2.A00 == 1QK.A0E || instagramMainActivity.A07 == null || userSession == null)) {
            AnonymousClass0BO.A00(userSession).A01 = false;
            C226242fw r0 = r2.A02;
            if (r0 != null) {
                r0.getViewModel().A02(true);
            }
        }
        r2.A00 = null;
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        UserSession userSession;
        AnonymousClass2iT r1 = this.A01;
        InstagramMainActivity instagramMainActivity = this.A02;
        2b7 r0 = instagramMainActivity.A09;
        r0.getClass();
        r1.A00 = r0.A01.A01();
        1QK r2 = this.A03;
        if (!instagramMainActivity.CR0(r2)) {
            2b7 r12 = instagramMainActivity.A09;
            r12.getClass();
            r12.A08(this.A04);
        }
        if (r2 != 1QK.A0E || (userSession = instagramMainActivity.A05) == null) {
            return false;
        }
        User A002 = 0eE.A00(userSession).A00();
        Boolean CYG = A002.A03.CYG();
        if (CYG == null || !CYG.booleanValue() || A002.A03.getProfilePicId() != null || instagramMainActivity.A02 >= 3 || !182.A06(0Tu.A05, userSession, 36324466862665835L)) {
            return false;
        }
        Runnable runnable = instagramMainActivity.A0C;
        if (runnable != null) {
            instagramMainActivity.A0h.removeCallbacks(runnable);
        }
        C51460FuU fuU = new C51460FuU(userSession, instagramMainActivity, A002);
        instagramMainActivity.A0h.postDelayed(fuU, 1000);
        instagramMainActivity.A0C = fuU;
        return false;
    }
}
