package X;

public final class TWT extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Q3K A03;
    public final /* synthetic */ Q34 A04;
    public final /* synthetic */ AnonymousClass6R6 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ 0sP A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TWT(Q3K q3k, Q34 q34, AnonymousClass6R6 r4, String str, 0sP r6, long j, long j2, long j3) {
        super(1);
        this.A07 = r6;
        this.A05 = r4;
        this.A06 = str;
        this.A02 = j;
        this.A03 = q3k;
        this.A00 = j2;
        this.A01 = j3;
        this.A04 = q34;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Q4C q4c;
        C11017S5o s5o = (C11017S5o) obj;
        0qQ.A0B(s5o, 0);
        0sP r2 = this.A07;
        AnonymousClass6R6 r5 = this.A05;
        String str = this.A06;
        long j = this.A02;
        0eP A002 = AnonymousClass6R6.A00(this.A03, this.A04, r5, s5o, str, j, this.A00, this.A01);
        if (A002 != null) {
            q4c = new Q4C(A002);
        } else {
            q4c = null;
        }
        r2.invoke(q4c);
        return C60340gF.A00;
    }
}
