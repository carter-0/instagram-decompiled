package X;

import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.facebook.onecamera.outputcontrollers.touchgesture.basic.BasicTouchGestureOutputController;

public final class AUW implements C343787qn {
    public final /* synthetic */ C343657qa A00;

    public final void Cg3(C343837qt r4, C344297rd r5) {
        boolean A1U = AnonymousClass7TF.A1U(0, r4, r5);
        r5.A00(C343837qt.A01(r4));
        r5.A00(new C345847uB(r4));
        r5.A00(new C344347ri(r4));
        r5.A00(new C344387rm(r4, A1U, false));
        r5.A00(new C341107mL(r4));
        C341157mQ.A01(new C344457rt(r4), r4, r5);
        r5.A00(new C345227t8(r4));
        C343657qa r0 = this.A00;
        if (AnonymousClass7TF.A1Y(r0.A00.get(C341297me.A01), A1U)) {
            r5.A00(new C382249dO(r4));
        }
        r5.A00(new C345307tH(r4));
    }

    public final /* synthetic */ void Cg7(C343837qt r1, C343887qy r2) {
    }

    public AUW(C343657qa r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.8kX, X.7tM] */
    public final void Cg4(C343837qt r4, C345347tL r5) {
        C345357tM r1;
        boolean A1Z = AnonymousClass7TG.A1Z(r4, r5);
        C343657qa r0 = this.A00;
        if (AnonymousClass7TF.A1Y(r0.A00.get(C341297me.A01), A1Z)) {
            ? r12 = new C345357tM(r4);
            r12.A01 = C390989sA.A03;
            r1 = r12;
        } else {
            r1 = new C345357tM(r4);
        }
        r5.A00(r1);
        r5.A00(new C345357tM(r4));
        r5.A00(new C345387tP(r4));
    }

    public final void Cg5(C343837qt r2, C345427tT r3) {
        AnonymousClass7TG.A1N(r2, r3);
        r3.A00(new C345437tU(r2));
        r3.A00(new C345447tV(r2));
    }

    public final void Cg6(C343837qt r2, C345457tW r3) {
        AnonymousClass7TG.A1N(r2, r3);
        r3.A00(new C345477tY(r2));
        r3.A00(new BasicCameraOutputController(r2));
        r3.A00(new BasicTouchGestureOutputController(r2));
        r3.A00(new C345517te(r2));
        r3.A00(new C345477tY(r2));
    }
}
