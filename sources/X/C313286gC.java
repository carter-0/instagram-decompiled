package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.6gC  reason: invalid class name and case insensitive filesystem */
public final class C313286gC implements C313296gD {
    public C255773uh A00;
    public C250973mM A01;
    public final UserSession A02;
    public final C313306gE A03;
    public final ReelViewerFragment A04;

    public final void D7Q(C255773uh r2, C250973mM r3, C316026kz r4, C309426Yf r5) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r5, 2);
        if (!r2.equals(this.A00) || r5.A0m) {
            this.A03.A04();
            this.A00 = null;
            this.A01 = null;
        }
    }

    public final /* synthetic */ void DLs(Reel reel) {
    }

    public final /* synthetic */ void DMq(int i) {
    }

    public final /* synthetic */ void DNx() {
    }

    public final /* synthetic */ void DNy() {
    }

    public final /* synthetic */ void DVL() {
    }

    public final void DWT(String str) {
        0qQ.A0B(str, 0);
        if (!str.equals("end_scene")) {
            this.A03.A01();
        }
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final /* synthetic */ void DxL() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final /* synthetic */ void DxU() {
    }

    public final /* synthetic */ void DyN(C255773uh r1, C316036l0 r2) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dfe() {
        /*
            r2 = this;
            X.3uh r0 = r2.A00
            if (r0 == 0) goto L_0x000d
            X.6gE r1 = r2.A03
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x000d
            X.C313306gE.A00(r1, r0)
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313286gC.Dfe():void");
    }

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final /* synthetic */ boolean Dqd() {
        return false;
    }

    public final void onDestroyView() {
        this.A03.A04();
        this.A00 = null;
        this.A01 = null;
    }

    public C313286gC(Context context, UserSession userSession, ReelViewerFragment reelViewerFragment, String str) {
        this.A02 = userSession;
        this.A04 = reelViewerFragment;
        this.A03 = new C313306gE(context, userSession, reelViewerFragment, str, "reel_feed_timeline");
    }
}
