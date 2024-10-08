package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.ShareLaterFragment;
import com.instagram.model.sharelater.ShareLaterMedia;

/* renamed from: X.Lpk  reason: case insensitive filesystem */
public final class C65240Lpk implements C363658k8 {
    public final int A00;
    public final Object A01;

    public C65240Lpk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ void Dcq() {
    }

    public final void Dcr() {
        FragmentActivity requireActivity;
        AnonymousClass818 r6;
        Context requireContext;
        switch (this.A00) {
            case 0:
                ShareLaterFragment shareLaterFragment = (ShareLaterFragment) this.A01;
                C48153EZv eZv = C48153EZv.A05;
                ShareLaterMedia shareLaterMedia = shareLaterFragment.A04;
                0qQ.A0A(shareLaterMedia);
                eZv.A06(shareLaterMedia, true);
                AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
                UserSession userSession = shareLaterFragment.A00;
                if (userSession != null) {
                    if (AnonymousClass5w9.A01(userSession)) {
                        UserSession userSession2 = shareLaterFragment.A00;
                        if (userSession2 != null) {
                            AnonymousClass5w9.A00(userSession2).A09((C3034168s) null, "share_later_relink");
                        }
                    }
                    C60058JeZ jeZ = shareLaterFragment.appShareTable;
                    if (jeZ != null) {
                        jeZ.A06(shareLaterFragment.A04);
                    }
                    ShareLaterFragment.A00(shareLaterFragment);
                    FragmentActivity requireActivity2 = shareLaterFragment.requireActivity();
                    UserSession userSession3 = shareLaterFragment.A00;
                    if (userSession3 != null) {
                        C63427Kwn.A00(requireActivity2, shareLaterFragment.getContext(), shareLaterFragment, AnonymousClass818.IG_FEED_SHARE_LATER_POST_ACCOUNT_LINK, userSession3, new C65641LxI(shareLaterFragment, 0));
                        return;
                    }
                }
                0qQ.A0F("userSession");
                throw AnonymousClass00P.createAndThrow();
            case 1:
                C65171Loa loa = (C65171Loa) this.A01;
                UserSession userSession4 = loa.A07;
                if (LTP.A09(userSession4)) {
                    AnonymousClass1Nd.A00(userSession4).A05(new C64661Lfn(true));
                    return;
                }
                C48153EZv eZv2 = C48153EZv.A05;
                C61822KNl kNl = loa.A08;
                eZv2.A06(LP2.A01(kNl), true);
                if (eZv2.A09(userSession4, LP2.A01(kNl)) && 182.A06(0Tu.A05, userSession4, 36312518263571608L)) {
                    1Av A002 = 1Au.A00(userSession4);
                    DbS.A1a(A002, "on", A002.A7j, 1Av.A8a, 241);
                }
                AnonymousClass5w9 r02 = AnonymousClass5w8.A05;
                if (AnonymousClass5w9.A01(userSession4)) {
                    AnonymousClass5w8 A003 = AnonymousClass5w9.A00(userSession4);
                    A003.A09(new C65249Lpt(loa, A003), "share_sheet_relink");
                } else {
                    C60058JeZ jeZ2 = loa.A04;
                    if (jeZ2 != null) {
                        jeZ2.A06(LP2.A01(kNl));
                    }
                }
                0Tu r2 = 0Tu.A05;
                if (!182.A06(r2, userSession4, 36326618641807238L)) {
                    C65641LxI lxI = new C65641LxI(loa, 2);
                    boolean A06 = 182.A06(r2, userSession4, 36325768237692109L);
                    AnonymousClass4DH r5 = loa.A06;
                    if (A06) {
                        requireContext = r5.getContext();
                        requireActivity = r5.getActivity();
                        if (requireContext != null && requireActivity != null) {
                            r6 = AnonymousClass818.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_ENABLE_POST_ACCOUNT_LINK;
                        } else {
                            return;
                        }
                    } else {
                        requireActivity = r5.requireActivity();
                        r6 = AnonymousClass818.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_ENABLE_POST_ACCOUNT_LINK;
                        requireContext = r5.requireContext();
                    }
                    C63427Kwn.A00(requireActivity, requireContext, r5, r6, userSession4, lxI);
                    return;
                }
                return;
            default:
                C61921KRq kRq = (C61921KRq) this.A01;
                C363558jv r4 = C363548ju.A03;
                UserSession userSession5 = kRq.A06;
                if (!C363558jv.A00(userSession5)) {
                    r4.A01(userSession5, (Integer) null, "upsell", true, true);
                    C363548ju r03 = kRq.A01;
                    if (r03 == null) {
                        r03 = LJr.A00(userSession5);
                        kRq.A01 = r03;
                    }
                    r03.A01(userSession5, "upsell", true);
                }
                C63918LCj lCj = kRq.A00;
                if (lCj != null) {
                    lCj.A00(true);
                }
                AnonymousClass1Nd.A00(userSession5).A02(kRq.A05, C64655Lfh.class);
                return;
        }
    }
}
