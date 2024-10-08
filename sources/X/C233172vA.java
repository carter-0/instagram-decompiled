package X;

/* renamed from: X.2vA  reason: invalid class name and case insensitive filesystem */
public final class C233172vA {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public final 0xa A0g;

    public final Long A00() {
        0xa r3;
        if (this.A0K == null && (r3 = this.A0g) != null) {
            long j = r3.getLong("previousInjectionTimeMillis", -1);
            if (j >= 0) {
                this.A0K = Long.valueOf(j);
            }
        }
        return this.A0K;
    }

    public C233172vA(0xa r1) {
        this.A0g = r1;
    }

    public C233172vA() {
        this((0xa) null);
    }
}
