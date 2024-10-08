package X;

/* renamed from: X.Trb  reason: case insensitive filesystem */
public final class C14196Trb {
    public final 1Xj A00;
    public final Integer A01;
    public final Long A02;
    public final String A03;
    public final boolean A04;

    public C14196Trb(1Xj r3, Integer num, String str, String str2, boolean z) {
        this.A00 = r3;
        this.A04 = z;
        this.A01 = num;
        this.A03 = str2;
        Long l = null;
        if (str != null) {
            try {
                l = 00y.A0n(10, str);
            } catch (NumberFormatException unused) {
            }
        }
        this.A02 = l;
    }
}
