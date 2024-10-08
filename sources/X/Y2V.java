package X;

import android.os.Handler;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;

public final class Y2V implements Runnable {
    public final /* synthetic */ C22252XyA A00;
    public final /* synthetic */ C22253XyB A01;

    public Y2V(C22252XyA xyA, C22253XyB xyB) {
        this.A01 = xyB;
        this.A00 = xyA;
    }

    public final void run() {
        C22253XyB xyB = this.A01;
        C22252XyA xyA = this.A00;
        Handler A002 = xyA.A00();
        StringBuilder sb = xyB.A06;
        sb.append("asyncStop, ");
        try {
            if (xyB.A00 != null) {
                if (xyB.A0C) {
                    xyB.A00.signalEndOfInputStream();
                    C22253XyB.A03(xyB, true);
                } else {
                    xyB.A03 = true;
                }
            }
            Surface surface = xyB.A02;
            if (surface != null) {
                surface.release();
            }
            if (xyB.A00 != null) {
                if (xyB.A0C) {
                    0fX.A06(xyB.A00, -1400516943);
                }
                0fX.A03(xyB.A00, 358803077);
            }
            xyB.A0B = AnonymousClass05K.A0N;
            xyB.A00 = null;
            xyB.A02 = null;
            xyB.A01 = null;
            sb.append("asyncStop end, ");
            if (xyB.A03) {
                C18097VlR.A01(xyA, A002);
                return;
            }
            C391719tX r2 = new C391719tX(23001, "Codec not in End-Of-Stream stage when stopping");
            r2.A00(TraceFieldType.CurrentState, XVF.A00(xyB.A0B));
            r2.A00("method_invocation", sb.toString());
            C18097VlR.A00(A002, r2, xyA);
        } catch (Exception e) {
            C391719tX r1 = new C391719tX(23001, (Throwable) e);
            C22253XyB.A02(r1, xyB, e);
            xyB.A0B = AnonymousClass05K.A0N;
            xyB.A00 = null;
            xyB.A02 = null;
            xyB.A01 = null;
            C18097VlR.A00(A002, r1, xyA);
        }
    }
}
