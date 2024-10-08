package X;

import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;

/* renamed from: X.AUa  reason: case insensitive filesystem */
public final class C40160AUa implements C343787qn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ARL A01;
    public final /* synthetic */ C343657qa A02;
    public final /* synthetic */ C340167ko A03;
    public final /* synthetic */ AR0 A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public final void Cg3(C343837qt r6, C344297rd r7) {
        C343697qe r1;
        boolean A1U = AnonymousClass7TF.A1U(0, r6, r7);
        if (this.A06) {
            C340167ko r4 = this.A03;
            if (r4 != null) {
                B30 b30 = this.A01.A00;
                0qQ.A0A(b30);
                b30.ESb(C340437lG.A01, r4);
            }
            r7.A00(new C345587tl(this.A01, r6));
            r1 = C343837qt.A01(r6);
        } else {
            C345707tx r12 = new C345707tx(r6);
            r12.Ega(this.A00);
            r1 = r12;
        }
        r7.A00(r1);
        r7.A00(new C345847uB(r6));
        r7.A00(new C344457rt(r6));
        r7.A00(new C344387rm(r6, A1U, A1U));
        C341157mQ.A01(new C345817u8(r6, false), r6, r7);
        if (this.A05) {
            r7.A00(new C380729Zh(r6));
        }
        r7.A00(new C380699Ze(r6));
        AR0 ar0 = this.A04;
        ar0.A02 = r6;
        r7.A00(new C380719Zg(ar0, r6));
        r7.A00(ar0);
        r7.A00(new C345567tj(r6));
        C343657qa r0 = this.A02;
        if (AnonymousClass7TF.A1Y(r0.A00.get(C341297me.A01), A1U)) {
            r7.A00(new C382249dO(r6));
        }
    }

    public final /* synthetic */ void Cg5(C343837qt r1, C345427tT r2) {
    }

    public final /* synthetic */ void Cg7(C343837qt r1, C343887qy r2) {
    }

    public C40160AUa(ARL arl, C343657qa r2, C340167ko r3, AR0 ar0, int i, boolean z, boolean z2) {
        this.A02 = r2;
        this.A06 = z;
        this.A03 = r3;
        this.A01 = arl;
        this.A00 = i;
        this.A05 = z2;
        this.A04 = ar0;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.8kX, X.7tM] */
    public final void Cg4(C343837qt r4, C345347tL r5) {
        C345357tM r1;
        boolean A1Z = AnonymousClass7TG.A1Z(r4, r5);
        C343657qa r0 = this.A02;
        if (AnonymousClass7TF.A1Y(r0.A00.get(C341297me.A01), A1Z)) {
            ? r12 = new C345357tM(r4);
            r12.A01 = C390989sA.A03;
            r1 = r12;
        } else if (this.A06) {
            r1 = new C345357tM(r4);
        } else {
            return;
        }
        r5.A00(r1);
    }

    public final void Cg6(C343837qt r2, C345457tW r3) {
        AnonymousClass7TG.A1N(r2, r3);
        if (this.A06) {
            r3.A00(new BasicCameraOutputController(r2));
        }
    }
}
