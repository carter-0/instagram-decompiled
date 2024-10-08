package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.2fZ  reason: invalid class name and case insensitive filesystem */
public final class C226062fZ {
    public Activity A00;
    public View A01;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final 1wn A04 = new C226092fc(this);
    public final 1wn A05 = new C226072fa(this);
    public final 1wn A06 = new C226082fb(this);
    public final UserSession A07;
    public final AnonymousClass2Zl A08;
    public final 2aC A09;
    public final boolean A0A;

    public static void A00(C226062fZ r6) {
        IgImageView findViewById;
        View view = r6.A01;
        if (view != null && (findViewById = view.findViewById(R.id.tab_avatar)) != null) {
            findViewById.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            UserSession userSession = r6.A07;
            findViewById.setUrl(userSession, AnonymousClass0t1.A01.A01(userSession).Bh3(), r6.A03, 1Tw.A04);
            findViewById.setVisibility(0);
            view.setOnLongClickListener(new C292775jV(r6));
        }
    }

    public final void A01(Context context, Intent intent, String str, String str2, boolean z, boolean z2, boolean z3) {
        UserSession userSession = this.A07;
        String str3 = userSession.A05;
        0qQ.A0B(str3, 0);
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str3);
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        bundle.putBoolean(C273654mx.A00(93), z3);
        if (intent != null) {
            bundle.putParcelable(AnonymousClass000.A00(647), intent);
        }
        bundle.putBoolean(AnonymousClass000.A00(627), z);
        bundle.putBoolean(AnonymousClass000.A00(628), z2);
        C331127Pr r0 = new C331127Pr(userSession);
        r0.A0d = str;
        C331157Pu A002 = r0.A00();
        E6S e6s = new E6S();
        e6s.setArguments(bundle);
        A002.A03(context, e6s);
        if ("long_press_tab_bar".equals(str2)) {
            0xm A003 = AnonymousClass0xl.A00(C61170le.A00);
            long currentTimeMillis = System.currentTimeMillis();
            0xY AR4 = A003.A00.AR4();
            AR4.E5c("preference_long_press_avatar_account_switcher_last_impression_time", currentTimeMillis);
            AR4.apply();
        }
    }

    public C226062fZ(Context context, AnonymousClass0iw r5, UserSession userSession, AnonymousClass2Zl r7, 2aC r8, String str, boolean z) {
        boolean z2;
        this.A07 = userSession;
        this.A02 = context;
        this.A03 = r5;
        this.A09 = r8;
        this.A0A = z;
        this.A08 = r7;
        if (C226102fd.A00.contains(str)) {
            int BNv = AnonymousClass0BO.A00(userSession).BNv();
            0tB A002 = AnonymousClass0BO.A00(userSession);
            if (BNv > 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            A002.A01 = z2;
        }
    }

    public final void A02(User user, Set set) {
        if (set.size() > 1 && !AnonymousClass0xl.A00(C61170le.A00).A00.getBoolean("reg_existing_login_snackbar_shown", false)) {
            Fd2 fd2 = new Fd2(this);
            Resources resources = this.A02.getResources();
            0qQ.A0B(resources, 0);
            C310336ap r4 = new C310336ap();
            r4.A0A(fd2);
            r4.A01();
            String string = resources.getString(2131967736);
            0qQ.A07(string);
            r4.A0G = string;
            r4.A01 = 5000;
            r4.A02 = resources.getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
            r4.A0B(C310356ar.CIRCULAR);
            r4.A09 = user.Bh3();
            int size = set.size() - 1;
            r4.A0D = 0bC.A02(resources, new String[]{user.getUsername(), String.valueOf(size)}, R.plurals.multiple_accounts_logged_in_snackbar_message, size);
            1xC.A01.A00(new AnonymousClass3GP(r4.A00()));
        }
        C62880wX r3 = C61170le.A00;
        0xY AR4 = AnonymousClass0xl.A00(r3).A00.AR4();
        AR4.E5h(AnonymousClass000.A00(1741), (Set) null);
        AR4.apply();
        0xY AR42 = AnonymousClass0xl.A00(r3).A00.AR4();
        AR42.E5T(AnonymousClass000.A00(3213), false);
        AR42.apply();
    }
}
