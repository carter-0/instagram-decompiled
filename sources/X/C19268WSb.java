package X;

/* renamed from: X.WSb  reason: case insensitive filesystem */
public final class C19268WSb implements C232262tL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C19268WSb wSb = (C19268WSb) obj;
        0qQ.A0B(wSb, 0);
        if (0qQ.A0K(this.A06, wSb.A06) && 0qQ.A0K(this.A04, wSb.A04) && 0qQ.A0K(this.A03, wSb.A03)) {
            String str = this.A05;
            String str2 = wSb.A05;
            if (0qQ.A0K(str, str2) && 0qQ.A0K(str, str2) && this.A00 == wSb.A00 && this.A01 == wSb.A01 && this.A02 == wSb.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C19268WSb(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        C51974G9v.A1P(str, str2, str3, str4);
        this.A06 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
