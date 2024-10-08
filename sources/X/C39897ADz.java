package X;

/* renamed from: X.ADz  reason: case insensitive filesystem */
public final class C39897ADz {
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public long A06 = 0;
    public long A07 = 0;
    public String A08 = "";
    public boolean A09 = false;
    public boolean A0A = false;
    public final long A0B;
    public final long A0C;

    public static void A00(C39897ADz aDz) {
        aDz.A06++;
    }

    public final float A01() {
        long j = this.A06;
        if (j != 0) {
            return (((float) this.A07) / 1000000.0f) / ((float) j);
        }
        return 0.0f;
    }

    public final void A02() {
        this.A06 = 0;
        this.A07 = 0;
        this.A09 = false;
        this.A0A = false;
        this.A01 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A04 = 0;
        this.A05 = 0;
        this.A08 = "";
    }

    public C39897ADz(long j, long j2) {
        this.A0C = j;
        this.A0B = j2;
    }
}
