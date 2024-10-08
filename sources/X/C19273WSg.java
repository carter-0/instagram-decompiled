package X;

/* renamed from: X.WSg  reason: case insensitive filesystem */
public final class C19273WSg implements C232262tL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final C62320sa A0A;

    public C19273WSg(Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, C62320sa r9, int i, int i2, int i3) {
        0qQ.A0B(str2, 7);
        this.A01 = i;
        this.A02 = i2;
        this.A04 = num;
        this.A05 = num2;
        this.A03 = num3;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A09 = str4;
        this.A00 = i3;
        this.A0A = r9;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return String.valueOf(this.A02);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C19273WSg wSg = (C19273WSg) obj;
        if (wSg == null || this.A01 != wSg.A01 || this.A02 != wSg.A02 || !0qQ.A0K(this.A04, wSg.A04)) {
            return false;
        }
        return true;
    }
}
