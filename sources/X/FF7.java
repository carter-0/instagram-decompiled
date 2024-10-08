package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.business.fragment.InviteFollowersV2Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class FF7 {
    public InviteFollowersV2Fragment A00;
    public PR9 A01;
    public final Fragment A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass4D6 A05;

    public FF7(Fragment fragment, AnonymousClass0iw r3, UserSession userSession, AnonymousClass4D6 r5) {
        0qQ.A0B(userSession, 5);
        this.A02 = fragment;
        this.A05 = r5;
        this.A03 = r3;
        this.A04 = userSession;
    }

    public final void A02(List list, String str) {
        0qQ.A0B(str, 1);
        Fragment fragment = this.A02;
        Context requireContext = fragment.requireContext();
        UserSession userSession = this.A04;
        boolean A012 = C267044ar.A01(requireContext, userSession);
        Integer num = AnonymousClass05K.A0j;
        C51408Fte fte = new C51408Fte(this, A012);
        boolean A002 = C324536zU.A00(userSession);
        C50989Fmc fmc = new C50989Fmc(fragment.requireContext(), (View.OnClickListener) new C71355OjA(7, fte, num, this, A002), (CharSequence) str);
        fmc.A03 = R.drawable.instagram_mail_pano_outline_24;
        fmc.A09 = A002;
        list.add(fmc);
    }

    public final void A03(List list, String str) {
        0qQ.A0B(str, 1);
        boolean A002 = C324536zU.A00(this.A04);
        C50989Fmc fmc = new C50989Fmc(this.A02.requireContext(), (View.OnClickListener) new C50100FOq(12, (Object) this, A002), (CharSequence) str);
        fmc.A03 = R.drawable.instagram_user_follow_pano_outline_24;
        fmc.A09 = A002;
        list.add(fmc);
    }

    public final void A04(List list, String str) {
        0qQ.A0B(str, 1);
        Fragment fragment = this.A02;
        Context requireContext = fragment.requireContext();
        UserSession userSession = this.A04;
        boolean A012 = C267044ar.A01(requireContext, userSession);
        boolean A002 = C324536zU.A00(userSession);
        C50989Fmc fmc = new C50989Fmc(fragment.requireContext(), (View.OnClickListener) new C50069FNk(this, 2, A002, A012), (CharSequence) str);
        fmc.A03 = R.drawable.instagram_share_android_pano_outline_24;
        fmc.A09 = A002;
        list.add(fmc);
    }

    public final void A05(List list, String str) {
        0qQ.A0B(str, 1);
        Fragment fragment = this.A02;
        Context requireContext = fragment.requireContext();
        UserSession userSession = this.A04;
        boolean A012 = C267044ar.A01(requireContext, userSession);
        Integer num = AnonymousClass05K.A0Y;
        C51409Ftf ftf = new C51409Ftf(this, A012);
        boolean A002 = C324536zU.A00(userSession);
        C50989Fmc fmc = new C50989Fmc(fragment.requireContext(), (View.OnClickListener) new C71355OjA(7, ftf, num, this, A002), (CharSequence) str);
        fmc.A03 = R.drawable.instagram_sms_pano_outline_24;
        fmc.A09 = A002;
        list.add(fmc);
    }

    public final void A06(List list, String str) {
        0qQ.A0B(str, 1);
        UserSession userSession = this.A04;
        boolean A002 = C324536zU.A00(userSession);
        Fragment fragment = this.A02;
        C50989Fmc fmc = new C50989Fmc(fragment.requireContext(), (View.OnClickListener) new C50069FNk(this, 3, A002, C267044ar.A01(fragment.requireContext(), userSession)), (CharSequence) str);
        fmc.A03 = R.drawable.instagram_app_whatsapp_pano_outline_24;
        fmc.A09 = A002;
        list.add(fmc);
    }

    public static final void A00(FF7 ff7, Object obj, String str) {
        Integer num;
        InviteFollowersV2Fragment inviteFollowersV2Fragment = ff7.A00;
        if (inviteFollowersV2Fragment != null) {
            Integer[] A002 = AnonymousClass05K.A00(10);
            int length = A002.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    num = null;
                    break;
                }
                num = A002[i];
                if (0qQ.A0K(C48957Emv.A00(num), str)) {
                    break;
                }
                i++;
            }
            int intValue = num.intValue();
            if (intValue == 6) {
                FragmentActivity activity = inviteFollowersV2Fragment.getActivity();
                UserSession userSession = inviteFollowersV2Fragment.A04;
                C48755Eje.A00(activity, inviteFollowersV2Fragment.requireContext(), userSession, AnonymousClass05K.A0u, inviteFollowersV2Fragment.getString(2131964502));
            } else if (intValue == 7 && (obj instanceof F3Q)) {
                String str2 = ((F3Q) obj).A00.A02;
                String str3 = inviteFollowersV2Fragment.A05;
                E4E e4e = new E4E();
                Bundle A0B = DbX.A0B(str3);
                A0B.putString("ARG_TARGET_USER_ID", str2);
                Dbb.A12(e4e, DbU.A0I(A0B, e4e, inviteFollowersV2Fragment), inviteFollowersV2Fragment.A04);
            }
            InviteFollowersV2Fragment.A06(inviteFollowersV2Fragment, str);
            inviteFollowersV2Fragment.A06 = true;
            inviteFollowersV2Fragment.A01.setEnabled(true);
        }
    }

    public static final void A01(FF7 ff7, String str) {
        FFO.A02(ff7.A02.requireContext(), ff7.A04, str);
    }
}
