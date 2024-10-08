package X;

public final class GLE implements C240963Ni {
    public final /* synthetic */ C267324bN A00;
    public final /* synthetic */ C52058GDe A01;
    public final /* synthetic */ C52019GBq A02;
    public final /* synthetic */ GD2 A03;
    public final /* synthetic */ C52078GDy A04;

    public final void DEN() {
    }

    public GLE(C267324bN r1, C52058GDe gDe, C52019GBq gBq, GD2 gd2, C52078GDy gDy) {
        this.A01 = gDe;
        this.A02 = gBq;
        this.A03 = gd2;
        this.A00 = r1;
        this.A04 = gDy;
    }

    public final void DO4(C240983Nk r5) {
        AnonymousClass3W1 r1 = this.A01.A0E;
        if (r1 != null) {
            C52019GBq gBq = this.A02;
            int position = r1.getPosition();
            C52012GBj A0N = gBq.A01.A0N();
            if (A0N.A07() <= position && position <= A0N.A09()) {
                GD2 gd2 = this.A03;
                AnonymousClass2fL A002 = AnonymousClass2fL.A00(gd2.A04);
                1Xj r0 = this.A00.A02;
                if (r0 != null) {
                    A002.A0O(r0.A2n(), gd2.A03.A0m);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            this.A04.A02().A0E = null;
        }
    }
}
