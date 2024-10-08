package X;

public final class KUU extends L9E implements C232262tL {
    public final int A00;
    public final C65329LrS A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        KUU kuu = (KUU) obj;
        0qQ.A0B(kuu, 0);
        if (0qQ.A0K(kuu.A01.getId(), this.A01.getId()) && kuu.A00 == this.A00 && kuu.A03 == this.A03) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KUU(1Xj r4, C65329LrS lrS, String str, int i, boolean z, boolean z2, boolean z3) {
        super(r4, str, 002.A0i(AnonymousClass000.A00(1572), str, r4.A30(), '_'));
        AnonymousClass7TG.A1O(str, r4);
        this.A00 = i;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = z3;
        this.A01 = lrS;
    }
}
