package X;

/* renamed from: X.LeV  reason: case insensitive filesystem */
public final class C64587LeV implements C323156x2 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C61992KUp A01;
    public final /* synthetic */ String A02;

    public final void Cja() {
    }

    public final void Cki() {
    }

    public C64587LeV(C61992KUp kUp, String str, int i) {
        this.A01 = kUp;
        this.A02 = str;
        this.A00 = i;
    }

    public final void Cgr() {
        AnonymousClass0eM r4 = this.A01.A0F;
        29H A0K = JTS.A0K(r4);
        String str = this.A02;
        A0K.A05(this.A00, "http task aborted");
        JTS.A0K(r4).A08(str);
    }

    public final void Chv(String str) {
        JTS.A0K(this.A01.A0F).A09(this.A02);
    }

    public final void Ci4(String str) {
        JTS.A0K(this.A01.A0F).A09(this.A02);
    }

    public final void CjV() {
        AnonymousClass0eM r4 = this.A01.A0F;
        29H A0K = JTS.A0K(r4);
        String str = this.A02;
        A0K.A05(this.A00, "http task cancelled");
        JTS.A0K(r4).A08(str);
    }

    public final void CjW() {
        JTS.A0K(this.A01.A0F).A0A(this.A02);
    }

    public final void Ck9() {
        JTS.A0K(this.A01.A0F).A04(this.A00);
    }

    public final void CkA() {
        JTS.A0K(this.A01.A0F).A03(this.A00);
    }
}
