package X;

import android.content.Intent;
import android.view.Choreographer;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView;

/* renamed from: X.6g8  reason: invalid class name and case insensitive filesystem */
public final class C313246g8 implements AnonymousClass6Z1 {
    public static final int A0D = C313246g8.class.hashCode();
    public float A00 = 5000.0f;
    public float A01;
    public long A02;
    public long A03;
    public C255773uh A04;
    public IgShowreelNativeProgressView A05;
    public Runnable A06;
    public boolean A07;
    public long A08 = -1;
    public final C313256g9 A09 = new C313256g9(this);
    public final C313206g3 A0A;
    public final UserSession A0B;
    public final AnonymousClass3BQ A0C;

    public C313246g8(UserSession userSession, AnonymousClass3BQ r4, C313206g3 r5) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r4, 3);
        this.A0A = r5;
        this.A0B = userSession;
        this.A0C = r4;
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
        this.A00 = (float) C313216g4.A02.A00(this.A0B, r2, r3, this.A0C, r5, r6);
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
        if (this.A07) {
            this.A07 = false;
            IgShowreelNativeProgressView igShowreelNativeProgressView = this.A05;
            if (igShowreelNativeProgressView != null) {
                igShowreelNativeProgressView.pause();
            }
            Choreographer.getInstance().removeFrameCallback(this.A09);
            this.A08 = System.currentTimeMillis();
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
        if (this.A04 != null && !this.A07) {
            this.A07 = true;
            IgShowreelNativeProgressView igShowreelNativeProgressView = this.A05;
            if (igShowreelNativeProgressView != null && igShowreelNativeProgressView.CWX()) {
                IgShowreelNativeProgressView igShowreelNativeProgressView2 = this.A05;
                if (igShowreelNativeProgressView2 != null) {
                    igShowreelNativeProgressView2.EIx();
                }
                C313256g9 r3 = this.A09;
                r3.A00.A02 = System.currentTimeMillis();
                Choreographer.getInstance().postFrameCallback(r3);
            }
            long j = this.A08;
            if (j > 0) {
                this.A03 += System.currentTimeMillis() - j;
            }
            C255773uh r5 = this.A04;
            if (r5 != null) {
                this.A0A.DKA(r5, ((double) this.A03) / 1000.0d);
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

    public final void A01() {
        A00();
        C255773uh r1 = this.A04;
        if (r1 != null) {
            this.A0A.DKB(r1);
        }
        IgShowreelNativeProgressView igShowreelNativeProgressView = this.A05;
        if (igShowreelNativeProgressView != null) {
            igShowreelNativeProgressView.stop();
        }
        IgShowreelNativeProgressView igShowreelNativeProgressView2 = this.A05;
        if (igShowreelNativeProgressView2 != null) {
            igShowreelNativeProgressView2.A02(A0D);
        }
        this.A05 = null;
        this.A01 = 0.0f;
        this.A03 = 0;
        this.A08 = -1;
        this.A06 = null;
        this.A04 = null;
    }

    public final void onDestroyView() {
        A01();
    }

    public final void DWT(String str) {
        A00();
    }
}
