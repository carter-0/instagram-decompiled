package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;

/* renamed from: X.LCj  reason: case insensitive filesystem */
public final class C63918LCj {
    public final /* synthetic */ FollowersShareFragment A00;
    public final /* synthetic */ C61921KRq A01;

    public C63918LCj(FollowersShareFragment followersShareFragment, C61921KRq kRq) {
        this.A00 = followersShareFragment;
        this.A01 = kRq;
    }

    public final void A00(boolean z) {
        String A0h;
        FollowersShareFragment followersShareFragment = this.A00;
        CallerContext callerContext = FollowersShareFragment.A10;
        if (z) {
            AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
            boolean A1X = JTU.A1X(followersShareFragment);
            C48153EZv eZv = C48153EZv.A05;
            AnonymousClass3Q2 A002 = LRK.A00(followersShareFragment);
            boolean z2 = true;
            if (A1X) {
                z2 = false;
            }
            eZv.A06(A002, z2);
        }
        C61921KRq kRq = this.A01;
        Context context = followersShareFragment.getContext();
        if (!(!kRq.isLinked() || context == null || (A0h = DbW.A0h(context.getApplicationContext(), DbU.A0n(kRq.A06, AnonymousClass0t1.A01), 2131975904)) == null)) {
            followersShareFragment.A0M = A0h;
        }
        FollowersShareFragment.A0E(followersShareFragment);
    }
}
