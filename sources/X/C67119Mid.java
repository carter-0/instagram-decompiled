package X;

/* renamed from: X.Mid  reason: case insensitive filesystem */
public final class C67119Mid implements C232262tL {
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C67119Mid mid = (C67119Mid) obj;
        0qQ.A0B(mid, 0);
        if (this.A02 == mid.A02 && this.A00 == mid.A00 && 0qQ.A0K(this.A01, mid.A01) && this.A05 == mid.A05 && this.A04 == mid.A04) {
            return true;
        }
        return false;
    }

    public C67119Mid(Integer num, Integer num2, String str, int i, boolean z, boolean z2) {
        this.A03 = str;
        this.A02 = num;
        this.A00 = i;
        this.A01 = num2;
        this.A05 = z;
        this.A04 = z2;
    }
}
