package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.8oe  reason: invalid class name and case insensitive filesystem */
public final class C366298oe implements AnonymousClass86i {
    public final /* synthetic */ C366258oa A00;

    public C366298oe(C366258oa r1) {
        this.A00 = r1;
    }

    public final void DBU() {
        C366068o8.A01(AnonymousClass84B.EFFECT_FOOTER, this.A00.A07);
    }

    public final void DBc(CameraAREffect cameraAREffect) {
        C366258oa r5 = this.A00;
        C366068o8 r4 = r5.A07;
        cameraAREffect.A01 = 1;
        C318136oS A002 = C318116oQ.A00(r4);
        1Eo.A05(19B.A00, new MH1(cameraAREffect, r4, (AnonymousClass4D7) null, 10), A002);
        ((C366308of) r5.A0A.getValue()).A00();
    }

    public final void DBf(CameraAREffect cameraAREffect) {
        C366258oa r5 = this.A00;
        C366068o8 r4 = r5.A07;
        cameraAREffect.A01 = 0;
        C318136oS A002 = C318116oQ.A00(r4);
        1Eo.A05(19B.A00, new MH1(cameraAREffect, r4, (AnonymousClass4D7) null, 11), A002);
        ((C366308of) r5.A0A.getValue()).A00();
    }
}
