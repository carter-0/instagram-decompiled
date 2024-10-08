package X;

/* renamed from: X.Glq  reason: case insensitive filesystem */
public final class C53304Glq extends AnonymousClass0T0 {
    public final float A00;
    public final long A01;
    public final C254253sB A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C53304Glq(C254253sB r2, Integer num, String str, String str2, String str3, String str4, float f, long j) {
        0qQ.A0B(str2, 2);
        this.A06 = str;
        this.A04 = str2;
        this.A00 = f;
        this.A03 = num;
        this.A01 = j;
        this.A07 = str3;
        this.A02 = r2;
        this.A05 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53304Glq) {
                C53304Glq glq = (C53304Glq) obj;
                if (!0qQ.A0K(this.A06, glq.A06) || !0qQ.A0K(this.A04, glq.A04) || Float.compare(this.A00, glq.A00) != 0 || this.A03 != glq.A03 || this.A01 != glq.A01 || !0qQ.A0K(this.A07, glq.A07) || !0qQ.A0K(this.A02, glq.A02) || !0qQ.A0K(this.A05, glq.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A002 = AnonymousClass7TF.A00(AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A06)), this.A00);
        Integer num = this.A03;
        return ((AnonymousClass7TF.A08(this.A07, C51972G9s.A07(this.A01, AnonymousClass7TG.A0B(num, C55211He1.A00(num), A002))) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A05);
    }
}
