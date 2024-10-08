package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import java.util.List;

/* renamed from: X.Ib6  reason: case insensitive filesystem */
public final class C57462Ib6 implements C331117Pq {
    public Integer A00 = AnonymousClass05K.A00;
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final UserSession A04;
    public final SimpleVideoLayout A05;
    public final AnonymousClass0eM A06 = C58709IwI.A01(this, 14);
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A00(0eO.A02, new C58709IwI(this, 15));
    public final C55561Hjh A08;

    public C57462Ib6(Context context, UserSession userSession, SimpleVideoLayout simpleVideoLayout, C55561Hjh hjh, int i) {
        0qQ.A0B(simpleVideoLayout, 3);
        this.A03 = context;
        this.A04 = userSession;
        this.A05 = simpleVideoLayout;
        this.A02 = i;
        this.A08 = hjh;
    }

    public final void DxV(C263754Nf r1) {
    }

    public final void Dxx(C263754Nf r6) {
        0qQ.A0B(r6, 0);
        if (this.A00 != AnonymousClass05K.A0N) {
            Integer num = AnonymousClass05K.A0C;
            this.A00 = num;
            1Xj r0 = (1Xj) r6.A03;
            if (r0 == null || r0.getId() == null) {
                throw AnonymousClass7TE.A0y();
            }
            AnonymousClass0eM r3 = this.A06;
            r3.getValue();
            if (this.A01 && this.A00 == num) {
                AnonymousClass0eM r2 = this.A07;
                ((C14044Tol) r2.getValue()).A03(1.0f, 0);
                ((C14044Tol) r2.getValue()).A05(0, false);
                ((C14044Tol) r2.getValue()).A0C("recycler view scroll", false);
                r3.getValue();
                r3.getValue();
                UserSession userSession = this.A04;
                C55604HkP hkP = (C55604HkP) userSession.A01(C55604HkP.class, new C58710IwJ(userSession, 28));
                C51965G9l.A0a(hkP.A01).flowEndSuccess(hkP.A00);
            }
        }
    }

    public final void Dyj(int i, int i2) {
    }

    public final void onCompletion() {
    }

    public final void onCues(List list) {
    }

    public final void onLoop(int i) {
    }

    public final void onProgressStateChanged(boolean z) {
    }

    public final void onProgressUpdate(int i, int i2, boolean z) {
    }

    public final void onStopVideo(String str, boolean z) {
    }

    public final void onVideoDownloading(C263754Nf r1) {
    }

    public final void onVideoPlayerError(C263754Nf r1, String str) {
    }

    public final /* synthetic */ void onVideoStartedPlaying(C263754Nf r1) {
    }

    public final void onVideoViewPrepared(C263754Nf r1) {
    }

    public final void A00() {
        ((C14044Tol) this.A07.getValue()).A0B("recycler view recycled");
        this.A00 = AnonymousClass05K.A0N;
    }

    public final void Dxy(C263754Nf r4) {
        if (this.A00 != AnonymousClass05K.A0N) {
            this.A00 = AnonymousClass05K.A0C;
            ((C14044Tol) this.A07.getValue()).A03(1.0f, 0);
        }
    }

    public final void onPrepare(C263754Nf r3) {
        this.A00 = AnonymousClass05K.A01;
        this.A08.A00.A0B.setVisibility(0);
    }
}
