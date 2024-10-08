package X;

import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.facebook.onecamera.outputcontrollers.touchgesture.basic.BasicTouchGestureOutputController;
import java.util.Map;

/* renamed from: X.7l9  reason: invalid class name and case insensitive filesystem */
public final class C340367l9 implements C343787qn {
    public final /* synthetic */ C343657qa A00;
    public final /* synthetic */ boolean A01;

    public final void Cg3(C343837qt r5, C344297rd r6) {
        C340467lJ r2;
        C344317rf r0;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        if (this.A01) {
            r2 = new C340457lI();
        } else {
            r2 = new C342947pQ();
        }
        r6.A00(new C344307re(r5, r2));
        r6.A00(new C344347ri(r5));
        r6.A00(new C344317rf(r5));
        r6.A00(new C344387rm(r5, true, false));
        r6.A00(new C341107mL(r5));
        r6.A00(new C344457rt(r5));
        r6.A00(new C341157mQ(r5));
        r6.A00(new C345157t1(r5));
        r6.A00(new C345227t8(r5));
        r6.A00(new C345247tB(r5));
        C343657qa r02 = this.A00;
        C343667qb r3 = C341297me.A01;
        Map map = r02.A00;
        if (0qQ.A0K(map.get(r3), true)) {
            r0 = new C344317rf(r5);
        } else {
            r0 = new C344317rf(r5);
        }
        r6.A00(r0);
        if (0qQ.A0K(map.get(r3), true)) {
            r6.A00(new C382249dO(r5));
        }
        r6.A00(new C345307tH(r5));
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.8kX, X.7tM] */
    public final void Cg4(C343837qt r4, C345347tL r5) {
        C345357tM r1;
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        C343657qa r0 = this.A00;
        if (0qQ.A0K(r0.A00.get(C341297me.A01), true)) {
            ? r12 = new C345357tM(r4);
            r12.A01 = C390989sA.A03;
            r1 = r12;
        } else {
            r1 = new C345357tM(r4);
        }
        r5.A00(r1);
        r5.A00(new C345357tM(r4));
        r5.A00(new C345387tP(r4));
        r5.A00(new C345407tR(r4));
    }

    public final void Cg5(C343837qt r2, C345427tT r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        r3.A00(new C345437tU(r2));
        r3.A00(new C345447tV(r2));
    }

    public final void Cg6(C343837qt r2, C345457tW r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        r3.A00(new C345477tY(r2));
        r3.A00(new BasicCameraOutputController(r2));
        r3.A00(new BasicTouchGestureOutputController(r2));
        if (this.A01) {
            r3.A00(new C345517te(r2));
        }
    }

    public final /* synthetic */ void Cg7(C343837qt r1, C343887qy r2) {
    }

    public C340367l9(C343657qa r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }
}
