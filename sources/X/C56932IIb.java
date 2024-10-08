package X;

/* renamed from: X.IIb  reason: case insensitive filesystem */
public final class C56932IIb implements C337497gR {
    public static final HSL A06 = new Object();
    public static final C337507gS A07 = new C337507gS(new C338087hO());
    public int A00 = 2;
    public int A01 = 1;
    public int A02 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A03 = 0;
    public HSL A04 = A06;
    public C337507gS A05 = A07;

    public final /* bridge */ /* synthetic */ C337547gW AEH() {
        int i = this.A02;
        C228432lf A002 = C337527gU.A00(i, this.A03);
        int i2 = this.A01;
        int i3 = this.A00;
        C56933IIc iIc = new C56933IIc(A002, this.A04, this.A05, i2, i3, i);
        int i4 = iIc.A01;
        if (iIc.A00 != 1 || i4 == Integer.MIN_VALUE || i4 == -1) {
            return iIc;
        }
        throw AnonymousClass7TE.A1B(AnonymousClass000.A00(992));
    }

    public final /* bridge */ /* synthetic */ C337497gR E1Q(int i) {
        this.A01 = i;
        return this;
    }

    public final /* bridge */ /* synthetic */ C337497gR EB4(C337507gS r1) {
        this.A05 = r1;
        return this;
    }
}
