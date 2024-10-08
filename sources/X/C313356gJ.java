package X;

import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;

/* renamed from: X.6gJ  reason: invalid class name and case insensitive filesystem */
public final class C313356gJ implements AnonymousClass6Z1 {
    public IgShowreelCompositionView A00;
    public String A01;
    public boolean A02;
    public final C313376gL A03;
    public final C229382nI A04;
    public final UserSession A05;

    public C313356gJ(C229382nI r2, UserSession userSession) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(userSession, 2);
        this.A04 = r2;
        this.A05 = userSession;
        this.A03 = C313366gK.A00(r2);
    }

    public final void D7Q(C255773uh r2, C250973mM r3, C316026kz r4, C309426Yf r5) {
        0qQ.A0B(r2, 1);
        if (!C297785sK.A0c(r2)) {
            A00();
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

    public final /* synthetic */ void DxU() {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onDestroy() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = r4.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r4 = this;
            java.lang.String r0 = r4.A01
            if (r0 == 0) goto L_0x0012
            X.6gL r3 = r4.A03
            r2 = 1
            X.6Jw r1 = r3.A00(r0)
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = "fragment_paused"
            r3.A02(r1, r0, r2)
        L_0x0012:
            r0 = 0
            r4.A01 = r0
            r4.A00 = r0
            r0 = 0
            r4.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313356gJ.A00():void");
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
        r0 = r2.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DWT(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r1 = r2.A01
            if (r1 == 0) goto L_0x001a
            X.6gL r0 = r2.A03
            X.6Jw r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x001a
            java.util.HashMap r0 = r0.A03
            java.lang.Object r1 = r0.get(r1)
            X.Uu3 r1 = (X.C16386Uu3) r1
            if (r1 == 0) goto L_0x001a
            r0 = 1
            r1.A00(r0)
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C313356gJ.DWT(java.lang.String):void");
    }

    public final void Dfe() {
        String str = this.A01;
        if (str != null) {
            this.A03.A03(str);
            IgShowreelCompositionView igShowreelCompositionView = this.A00;
            if (igShowreelCompositionView != null) {
                igShowreelCompositionView.getCompositionController().Dy8();
            }
        }
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

    public final void DxN() {
        IgShowreelCompositionView igShowreelCompositionView;
        if (this.A01 != null && (igShowreelCompositionView = this.A00) != null) {
            igShowreelCompositionView.getCompositionController().Dy7();
        }
    }

    public final void DyN(C255773uh r2, C316036l0 r3) {
        IgShowreelCompositionView igShowreelCompositionView;
        if (this.A01 != null && (igShowreelCompositionView = this.A00) != null) {
            igShowreelCompositionView.getCompositionController().Dy9();
        }
    }

    public final void onDestroyView() {
        A00();
    }
}
