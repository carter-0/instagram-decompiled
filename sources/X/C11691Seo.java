package X;

/* renamed from: X.Seo  reason: case insensitive filesystem */
public final class C11691Seo implements C13809Thc {
    public long A00;
    public YBZ A01;
    public boolean A02;
    public long A03;
    public boolean A04;
    public final ST7 A05;
    public final C11389SRd A06;
    public final C11745Sfg A07;
    public final C11389SRd A08;

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    public final void EKu(long j, long j2) {
        this.A04 = false;
        this.A07.EKt();
        this.A03 = j2;
    }

    public final boolean Evx(C13910TlA tlA) {
        C11389SRd sRd;
        int i = 0;
        while (true) {
            sRd = this.A06;
            tlA.E2F(sRd.A02, 0, 10);
            sRd.A0O(0);
            if (sRd.A06() != 4801587) {
                break;
            }
            sRd.A0P(3);
            int A042 = sRd.A04();
            i += A042 + 10;
            tlA.AAu(A042);
        }
        tlA.EI7();
        tlA.AAu(i);
        if (this.A00 == -1) {
            this.A00 = (long) i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            tlA.E2F(sRd.A02, 0, 2);
            sRd.A0O(0);
            if ((sRd.A08() & 65526) == 65520) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                tlA.E2F(sRd.A02, 0, 4);
                ST7 st7 = this.A05;
                st7.A09(14);
                int A062 = st7.A06(13);
                if (A062 > 6) {
                    tlA.AAu(A062 - 6);
                    i4 += A062;
                }
            }
            i2++;
            tlA.EI7();
            tlA.AAu(i2);
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    public final void CMU(YBZ ybz) {
        this.A01 = ybz;
        this.A07.ANC(ybz, new SR8(AnonymousClass972.MUTABLE_FLAG_MASK, 0, 1));
        ybz.ASU();
    }

    public final int E67(C13910TlA tlA, C21363XYr xYr) {
        C11366SPh.A00(this.A01);
        C11389SRd sRd = this.A08;
        int read = tlA.read(sRd.A02, 0, C249703kE.FLAG_MOVED);
        boolean A1S = AnonymousClass7TF.A1S(read, -1);
        if (!this.A02) {
            C11710Sf7.A00(this.A01, -9223372036854775807L);
            this.A02 = true;
        }
        if (A1S) {
            return -1;
        }
        sRd.A0O(0);
        sRd.A0N(read);
        if (!this.A04) {
            this.A07.A09 = this.A03;
            this.A04 = true;
        }
        this.A07.AJP(sRd);
        return 0;
    }

    public C11691Seo(int i) {
        this.A07 = new C11745Sfg((String) null, 0, true);
        this.A08 = Pxe.A0P(C249703kE.FLAG_MOVED);
        this.A00 = -1;
        C11389SRd A0P = Pxe.A0P(10);
        this.A06 = A0P;
        this.A05 = new ST7(A0P.A02);
    }

    public C11691Seo() {
        this(0);
    }
}
