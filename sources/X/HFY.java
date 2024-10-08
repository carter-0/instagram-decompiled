package X;

public final class HFY extends C262934Go {
    public final int A00;
    public final Object A01;

    public HFY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D9d() {
        1Ng r1;
        switch (this.A00) {
            case 0:
                r1 = ((H15) this.A01).A04;
                break;
            case 3:
                2YL A0H = DbS.A0H(((L5U) this.A01).A01);
                AnonymousClass7TE.A1Z(new MGU(A0H, (AnonymousClass4D7) null, 2), C318116oQ.A00(A0H));
                return;
            case 4:
                r1 = ((GCW) this.A01).A02;
                break;
            default:
                r1 = (1Ng) this.A01;
                break;
        }
        C57076INq.A00(r1, false);
    }
}
