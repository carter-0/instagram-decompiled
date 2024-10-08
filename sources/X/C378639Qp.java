package X;

/* renamed from: X.9Qp  reason: invalid class name and case insensitive filesystem */
public final class C378639Qp implements C342827pE {
    public final /* synthetic */ C378609Qm A00;

    public C378639Qp(C378609Qm r1) {
        this.A00 = r1;
    }

    public final void D09() {
        C2366634p r0 = this.A00.A01;
        if (r0 == null) {
            0qQ.A0F("cameraNavPerfComponent");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A01();
        }
    }

    public final void onFirstFrameRendered() {
        C2366634p r0 = this.A00.A01;
        if (r0 == null) {
            0qQ.A0F("cameraNavPerfComponent");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A05();
        }
    }

    public final void onStart() {
        C2366634p r0 = this.A00.A01;
        if (r0 == null) {
            0qQ.A0F("cameraNavPerfComponent");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A04();
        }
    }
}
