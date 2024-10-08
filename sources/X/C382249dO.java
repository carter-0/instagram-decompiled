package X;

/* renamed from: X.9dO  reason: invalid class name and case insensitive filesystem */
public final class C382249dO extends C344317rf implements B3R {
    public int A00;
    public int A01 = 720;
    public int A02 = 1280;
    public int A03 = 1920;
    public int A04;
    public int A05 = 1080;
    public C345107sw A06;
    public final C341027mD A07 = new AUD(this);

    public final void A09() {
        ((C344397rn) this.A00.Ape(C344397rn.A00)).AAM(this.A07);
    }

    public final C345067ss A0C() {
        C345067ss A012;
        C345107sw r3 = this.A06;
        if (r3 != null) {
            if (r3 instanceof C346247ur) {
                0qQ.A0C(r3, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.inputoutput.GlSurfaceInput");
                A012 = ((C346247ur) r3).FKc(this.A02, this.A01, this.A05, this.A03, this.A04, this.A00, 0, true);
            } else if (r3 instanceof C40138ATe) {
                0qQ.A0C(r3, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.inputoutput.GlBlankInput");
                A012 = ((C40138ATe) r3).A01(this.A02, this.A01, 0);
            } else {
                throw AnonymousClass7TE.A15("Input type not supported! For now, only GlSurfaceInput, GLBitmapinput, or GlBlankInput are supported");
            }
            0qQ.A07(A012);
            return A012;
        }
        0qQ.A0F("input");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C343717qg BJt() {
        return B3R.A00;
    }

    public C382249dO(C343837qt r2) {
        super(r2);
    }
}
