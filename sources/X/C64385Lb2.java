package X;

import java.io.File;

/* renamed from: X.Lb2  reason: case insensitive filesystem */
public final class C64385Lb2 implements C13816Thj {
    public final /* synthetic */ C7909Qcf A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ C277014uI A03;
    public final /* synthetic */ C277014uI A04;
    public final /* synthetic */ File A05;

    public final void D5G(C11286SJe sJe) {
        C11286SJe sJe2 = sJe;
        0qQ.A0B(sJe, 0);
        C7909Qcf qcf = this.A00;
        C262224Cq r0 = qcf.A04;
        if (r0 == null) {
            0qQ.A0F("uiScope");
            throw AnonymousClass00P.createAndThrow();
        } else {
            AnonymousClass7TE.A1Z(new MGO(qcf, sJe2, this.A04, this.A01, this.A03, this.A05, (AnonymousClass4D7) null, 0), r0);
        }
    }

    public final void DEX(C8989RKf rKf) {
        C8989RKf rKf2 = rKf;
        0qQ.A0B(rKf, 0);
        C7909Qcf qcf = this.A00;
        C262224Cq r0 = qcf.A04;
        if (r0 == null) {
            0qQ.A0F("uiScope");
            throw AnonymousClass00P.createAndThrow();
        } else {
            AnonymousClass7TE.A1Z(new MGM(qcf, rKf2, this.A03, this.A01, this.A05, (AnonymousClass4D7) null, 0), r0);
        }
    }

    public final void DaE(float f) {
    }

    public final void onStart() {
    }

    public C64385Lb2(C7909Qcf qcf, C307896Rx r2, C277014uI r3, C277014uI r4, C277014uI r5, File file) {
        this.A00 = qcf;
        this.A03 = r3;
        this.A01 = r2;
        this.A05 = file;
        this.A02 = r4;
        this.A04 = r5;
    }

    public final void D0e() {
        C7909Qcf qcf = this.A00;
        C262224Cq r0 = qcf.A04;
        if (r0 == null) {
            0qQ.A0F("uiScope");
            throw AnonymousClass00P.createAndThrow();
        } else {
            AnonymousClass7TE.A1Z(new C66172MGj((Object) this.A02, (Object) qcf, (Object) this.A01, (Object) this.A05, (AnonymousClass4D7) null, 4), r0);
        }
    }
}
