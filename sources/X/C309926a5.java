package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6a5  reason: invalid class name and case insensitive filesystem */
public final class C309926a5 implements C228132kq {
    public final /* synthetic */ ReelViewerFragment A00;

    public final void DJL(boolean z) {
    }

    public final void DcX(boolean z, boolean z2) {
    }

    public final void Dcg(Integer num, int i, long j, boolean z) {
    }

    public final void Dch(1OE r7, String str, int i, long j, boolean z, boolean z2) {
        if (i == 2) {
            ReelViewerFragment reelViewerFragment = this.A00;
            CallerContext callerContext = ReelViewerFragment.A3S;
            if (182.A06(0Tu.A05, 1NM.A00(reelViewerFragment.getSession()).A00, 36317234137666488L)) {
                ReelViewerFragment.A0F(reelViewerFragment, 2);
            }
        }
    }

    public final /* synthetic */ void Dcj() {
    }

    public C309926a5(ReelViewerFragment reelViewerFragment) {
        this.A00 = reelViewerFragment;
    }

    public final void DWD(long j, int i) {
        ReelViewerFragment reelViewerFragment = this.A00;
        C310016aI r2 = reelViewerFragment.A0p;
        AnonymousClass3BN r6 = new AnonymousClass3BN(reelViewerFragment.getSession(), 1OP.A05(reelViewerFragment.getSession()).A0U(false));
        C228102kn r7 = reelViewerFragment.A12;
        AnonymousClass3PI r3 = AnonymousClass3PI.A00;
        UserSession userSession = r2.A06;
        r3.A0C(r2.A0A, userSession, r6, r7, (Double) null, AnonymousClass05K.A0u, Integer.valueOf(i), r2.A0H, r2.A0G, j, false, false);
    }

    public final void DWE(long j) {
        ReelViewerFragment reelViewerFragment = this.A00;
        ReelViewerFragment.A0F(reelViewerFragment, -1);
        C310016aI r2 = reelViewerFragment.A0p;
        AnonymousClass3BN r6 = new AnonymousClass3BN(reelViewerFragment.getSession(), 1OP.A05(reelViewerFragment.getSession()).A0U(false));
        C228102kn r7 = reelViewerFragment.A12;
        AnonymousClass3PI r3 = AnonymousClass3PI.A00;
        UserSession userSession = r2.A06;
        r3.A0C(r2.A0A, userSession, r6, r7, (Double) null, AnonymousClass05K.A0u, (Integer) null, r2.A0H, r2.A0G, j, false, true);
    }
}
