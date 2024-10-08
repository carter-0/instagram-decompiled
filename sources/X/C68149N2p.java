package X;

/* renamed from: X.N2p  reason: case insensitive filesystem */
public final class C68149N2p extends AnonymousClass0T0 {
    public final long A00;
    public final C68161N3b A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68149N2p) {
                C68149N2p n2p = (C68149N2p) obj;
                if (!0qQ.A0K(this.A03, n2p.A03) || !0qQ.A0K(this.A04, n2p.A04) || this.A02 != n2p.A02 || !0qQ.A0K(this.A01, n2p.A01) || this.A00 != n2p.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A08 = AnonymousClass7TF.A08(this.A04, AnonymousClass7TE.A0O(this.A03));
        int intValue = this.A02.intValue();
        if (1 != intValue) {
            str = "IRIS";
        } else {
            str = "MEM";
        }
        return AnonymousClass7TF.A07(this.A01, C51971G9r.A0F(str, intValue, A08)) + C51968G9o.A03(this.A00);
    }

    public /* synthetic */ C68149N2p(C68161N3b n3b, Integer num, String str, long j) {
        String A0b = AnonymousClass7TF.A0b();
        AnonymousClass7TG.A1P(A0b, num);
        this.A03 = A0b;
        this.A04 = str;
        this.A02 = num;
        this.A01 = n3b;
        this.A00 = j;
    }
}
