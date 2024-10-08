package X;

/* renamed from: X.7gQ  reason: invalid class name and case insensitive filesystem */
public final class C337487gQ implements C337497gR {
    public static final C337517gT A05 = new Object();
    public static final C337507gS A06 = new C337507gS(new C338087hO());
    public int A00 = 1;
    public int A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A02 = 0;
    public C337517gT A03 = A05;
    public C337507gS A04 = A06;

    /* renamed from: A00 */
    public final C337537gV AEH() {
        int i = this.A01;
        C228432lf A002 = C337527gU.A00(i, this.A02);
        int i2 = this.A00;
        C337537gV r4 = new C337537gV(A002, this.A03, this.A04, i2, i);
        int i3 = r4.A01;
        if (r4.A00 != 1 || i3 == Integer.MIN_VALUE || i3 == -1 || i3 == Integer.MAX_VALUE) {
            return r4;
        }
        throw new UnsupportedOperationException(AnonymousClass000.A00(992));
    }

    public final /* bridge */ /* synthetic */ C337497gR E1Q(int i) {
        this.A00 = i;
        return this;
    }

    public final /* bridge */ /* synthetic */ C337497gR EB4(C337507gS r1) {
        this.A04 = r1;
        return this;
    }
}
