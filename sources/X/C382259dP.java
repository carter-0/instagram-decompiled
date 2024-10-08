package X;

import android.graphics.SurfaceTexture;
import android.view.SurfaceView;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.9dP  reason: invalid class name and case insensitive filesystem */
public final class C382259dP extends C344317rf implements C344397rn, B34 {
    public C341827na A00;
    public CountDownLatch A01;
    public final C344337rh A02 = new AU4(this, 2);
    public final C341047mF A03 = new AV4(this);
    public final Object A04 = new Object();
    public volatile SurfaceTexture A05;
    public volatile SurfaceView A06;

    public final void A09() {
        this.A01 = new CountDownLatch(1);
        C343717qg r1 = C345547th.A00;
        if (this.A00.CQN(r1)) {
            ((C345547th) A0A(r1)).A9s(this.A02);
        }
    }

    public final void A9j(C346027uT r1) {
    }

    public final void AAM(C341027mD r1) {
    }

    public final void AQS(Runnable runnable) {
    }

    public final boolean CKl() {
        return false;
    }

    public final boolean EAg() {
        return true;
    }

    public final void EEN(C346027uT r1) {
    }

    public final void EEg(C341027mD r1) {
    }

    public final /* synthetic */ void Eeo(C341907ni r1, Object obj) {
    }

    public final void EgY(boolean z) {
    }

    public final /* synthetic */ void Egk(C341837nb r1) {
    }

    public final void EqK(C341827na r2) {
        0qQ.A0B(r2, 0);
        this.A00 = r2;
    }

    public final C343717qg BJt() {
        C343717qg r0 = C344397rn.A00;
        0qQ.A08(r0);
        return r0;
    }

    public final C341047mF C3L() {
        return this.A03;
    }

    public C382259dP(C343837qt r3) {
        super(r3);
    }
}
