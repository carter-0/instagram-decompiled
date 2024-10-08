package X;

import android.content.Intent;
import android.view.Choreographer;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;

/* renamed from: X.6gA  reason: invalid class name and case insensitive filesystem */
public final class C313266gA implements AnonymousClass6Z1 {
    public float A00 = 5000.0f;
    public float A01;
    public long A02;
    public long A03;
    public C255773uh A04;
    public A4P A05;
    public IgShowreelCompositionView A06;
    public Runnable A07;
    public boolean A08;
    public long A09 = -1;
    public final C313276gB A0A = new C313276gB(this);
    public final C313206g3 A0B;
    public final UserSession A0C;
    public final AnonymousClass3BQ A0D;

    public C313266gA(UserSession userSession, AnonymousClass3BQ r4, C313206g3 r5) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r4, 3);
        this.A0B = r5;
        this.A0C = userSession;
        this.A0D = r4;
    }

    public final void D7Q(C255773uh r8, C250973mM r9, C316026kz r10, C309426Yf r11) {
        C316026kz r5 = r10;
        0qQ.A0B(r10, 0);
        C255773uh r2 = r8;
        0qQ.A0B(r8, 1);
        C309426Yf r6 = r11;
        0qQ.A0B(r11, 2);
        C250973mM r3 = r9;
        0qQ.A0B(r9, 3);
        if ((!r8.equals(this.A04)) || r11.A0m) {
            A01();
        }
        this.A00 = (float) C313216g4.A02.A00(this.A0C, r2, r3, this.A0D, r5, r6);
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

    public final void A00() {
        if (this.A08) {
            this.A08 = false;
            IgShowreelCompositionView igShowreelCompositionView = this.A06;
            if (igShowreelCompositionView != null) {
                igShowreelCompositionView.pause();
            }
            Choreographer.getInstance().removeFrameCallback(this.A0A);
            this.A09 = System.currentTimeMillis();
        }
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

    public final void Dfe() {
        if (this.A04 != null && !this.A08) {
            this.A08 = true;
            IgShowreelCompositionView igShowreelCompositionView = this.A06;
            if (igShowreelCompositionView == null || igShowreelCompositionView.getCompositionController().CWX()) {
                IgShowreelCompositionView igShowreelCompositionView2 = this.A06;
                if (igShowreelCompositionView2 != null) {
                    igShowreelCompositionView2.EIx();
                }
                C313276gB r3 = this.A0A;
                r3.A00.A02 = System.currentTimeMillis();
                Choreographer.getInstance().postFrameCallback(r3);
            }
            long j = this.A09;
            if (j > 0) {
                this.A03 += System.currentTimeMillis() - j;
            }
            C313206g3 r5 = this.A0B;
            C255773uh r4 = this.A04;
            if (r4 != null) {
                r5.DKA(r4, ((double) this.A03) / 1000.0d);
                return;
            }
            throw new IllegalStateException("Required value was null.");
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

    public final void A01() {
        IgShowreelCompositionView igShowreelCompositionView;
        A00();
        C255773uh r1 = this.A04;
        if (r1 != null) {
            this.A0B.DKB(r1);
        }
        IgShowreelCompositionView igShowreelCompositionView2 = this.A06;
        if (igShowreelCompositionView2 != null) {
            igShowreelCompositionView2.stop();
        }
        A4P a4p = this.A05;
        if (!(a4p == null || (igShowreelCompositionView = this.A06) == null)) {
            igShowreelCompositionView.A02.remove(a4p);
        }
        this.A05 = null;
        this.A06 = null;
        this.A01 = 0.0f;
        this.A03 = 0;
        this.A09 = -1;
        this.A07 = null;
        this.A04 = null;
    }

    public final void onDestroyView() {
        A01();
    }

    public final void DWT(String str) {
        A00();
    }
}
