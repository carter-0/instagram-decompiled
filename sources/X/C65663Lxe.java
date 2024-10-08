package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;

/* renamed from: X.Lxe  reason: case insensitive filesystem */
public final class C65663Lxe implements C66463MSr {
    public final int A00;
    public final Object A01;

    public C65663Lxe(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DfE(Integer num) {
        Context context;
        switch (this.A00) {
            case 0:
                0qQ.A0B(num, 0);
                if (num == AnonymousClass05K.A00) {
                    C65171Loa loa = (C65171Loa) this.A01;
                    UserSession userSession = loa.A07;
                    if (C64373Lap.A04(userSession)) {
                        Context requireContext = loa.A06.requireContext();
                        String A02 = AnonymousClass6SR.A02();
                        0qQ.A07(A02);
                        C64373Lap.A01(requireContext, userSession, (C66461MSp) null, A02);
                        AnonymousClass5Gv r1 = loa.A08.A0K.A00;
                        if (r1 != null && r1.A09()) {
                            r1.A08(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                0qQ.A0B(num, 0);
                if (num == AnonymousClass05K.A00) {
                    FollowersShareFragment followersShareFragment = (FollowersShareFragment) this.A01;
                    CallerContext callerContext = FollowersShareFragment.A10;
                    FragmentActivity activity = followersShareFragment.getActivity();
                    if (activity != null && (context = followersShareFragment.getContext()) != null) {
                        C61921KRq A002 = C63266KuB.A00(DbT.A05(context), AnonymousClass7TE.A0l(followersShareFragment.A0f), "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL");
                        if (!A002.isUpsellEligible()) {
                            FollowersShareFragment.A0E(followersShareFragment);
                            return;
                        }
                        A002.A00 = new C63918LCj(followersShareFragment, A002);
                        A002.showUpsell((C66520MUy) null, activity);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                0qQ.A0B(num, 0);
                if (num == AnonymousClass05K.A01) {
                    LFW lfw = (LFW) this.A01;
                    lfw.A05.A00 = false;
                    lfw.A01(false);
                    return;
                }
                return;
            default:
                C65302Lqv lqv = (C65302Lqv) this.A01;
                if (num == AnonymousClass05K.A00) {
                    C65302Lqv.A00(lqv);
                    return;
                }
                return;
        }
    }
}
