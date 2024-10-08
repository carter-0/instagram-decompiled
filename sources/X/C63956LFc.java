package X;

/* renamed from: X.LFc  reason: case insensitive filesystem */
public final class C63956LFc {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final 0qV A09;
    public final Integer A0A;
    public final String A0B;

    public final void A01(C61262Jzu jzu, Integer num) {
        int i;
        0qQ.A0B(jzu, 0);
        if (jzu.A04 >= this.A08 && jzu.A03 == num) {
            String str = this.A0B;
            int hashCode = str.hashCode();
            if (hashCode != -2041073848) {
                if (hashCode == -852971718 && str.equals("server_ranking")) {
                    i = jzu.A01;
                }
                i = jzu.A00;
            } else {
                if (str.equals("server_total")) {
                    i = jzu.A02;
                }
                i = jzu.A00;
            }
            if (num != AnonymousClass05K.A0C || i > 0) {
                long j = (long) i;
                this.A01 += j;
                this.A00++;
                if (this.A0A == jzu.A07) {
                    this.A07 += j;
                    this.A06++;
                }
                Integer num2 = jzu.A06;
                0qV r4 = this.A09;
                if (num2 == r4.A01) {
                    this.A05 += j;
                    this.A04++;
                    if (jzu.A05 == r4.A00) {
                        this.A03 += j;
                        this.A02++;
                    }
                }
            }
        }
    }

    public final C63860L9p A00() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5 = this.A00;
        if (j5 > 0) {
            j = this.A01 / j5;
        } else {
            j = -1;
        }
        long j6 = this.A06;
        if (j6 >= 5) {
            j2 = this.A07 / j6;
        } else if (j5 > 0) {
            j2 = this.A01 / j5;
        } else {
            j2 = -1;
        }
        if (j6 < 5) {
            j6 = j5;
        }
        long j7 = this.A03;
        if (j7 >= 5) {
            j3 = j7 / this.A02;
        } else {
            long j8 = this.A04;
            if (j8 >= 5) {
                j3 = this.A05 / j8;
            } else if (j5 > 0) {
                j3 = this.A01 / j5;
            } else {
                j3 = -1;
            }
        }
        if (j7 >= 5) {
            j4 = this.A02;
        } else {
            j4 = this.A04;
            if (j4 < 5) {
                j4 = j5;
            }
        }
        return new C63860L9p(j, j5, j2, j6, j3, j4);
    }

    public C63956LFc(0qV r1, Integer num, String str, long j) {
        this.A08 = j;
        this.A0A = num;
        this.A09 = r1;
        this.A0B = str;
    }
}
