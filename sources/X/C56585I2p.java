package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import kotlin.Deprecated;

/* renamed from: X.I2p  reason: case insensitive filesystem */
public abstract class C56585I2p {
    public static final void A00(Fragment fragment, C60100Jfg jfg) {
        0qQ.A0B(jfg, 1);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = fragment.getViewLifecycleOwner();
        AnonymousClass0xx A00 = AnonymousClass07a.A00(viewLifecycleOwner);
        AnonymousClass7TE.A1Z(new MHF(viewLifecycleOwner, fragment, r4, jfg, (AnonymousClass4D7) null, 45), A00);
    }

    public static final void A01(FragmentActivity fragmentActivity, N49 n49, AnonymousClass0iw r11, UserSession userSession, C62320sa r13, boolean z) {
        int i;
        AnonymousClass0iw r8 = r11;
        UserSession userSession2 = userSession;
        0wc A01 = AnonymousClass0kN.A01(r11, userSession);
        0Aj A0e = AnonymousClass7TE.A0e(A01, "subscription_content_public_preview_upsell_impression");
        C51969G9p.A1A(A0e, r11);
        N49 n492 = n49;
        String str = n49.A00;
        DbY.A1G(A0e, str);
        A0e.Cgf();
        C358248ab A0X = DbS.A0X(fragmentActivity);
        int i2 = R.drawable.ig_illustrations_illo_exclusive_posts_refresh;
        if (z) {
            i2 = R.drawable.ig_illustrations_illo_subscriber_crown_badge_refresh;
        }
        A0X.A0j(fragmentActivity.getDrawable(i2));
        A0X.A09(2131961978);
        DbY.A0w(fragmentActivity, A0X, n49.A01, 2131961977);
        if (C51966G9m.A1W(userSession, str)) {
            i = 2131960992;
        } else {
            A0X.A0I(new C50019FJe(3, (Object) n492, (Object) A01, (Object) userSession2, (Object) r8, (Object) fragmentActivity, (Object) r13), 2131962041);
            i = 2131968513;
        }
        A0X.A0G((DialogInterface.OnClickListener) null, i);
        DbT.A1V(A0X);
    }

    @Deprecated(message = "Use the version that takes a CreatorInfo as param instead of User")
    public static final void A02(FragmentActivity fragmentActivity, AnonymousClass0iw r7, UserSession userSession, User user, C62320sa r10, boolean z) {
        AnonymousClass7TG.A1O(userSession, r7);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        A01(fragmentActivity2, new N49(user.getId(), user.getUsername(), 46), r7, userSession, r10, z);
    }
}
