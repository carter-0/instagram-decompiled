package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.SfZ  reason: case insensitive filesystem */
public final class C11738SfZ implements C22557YAo {
    public C13900TjN A00;
    public C11220SFu A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public long A05 = -9223372036854775807L;
    public long A06;
    public final C11389SRd A07 = new C11389SRd();
    public final S6P A08 = new S6P(8);
    public final S6P A09 = new S6P(6);
    public final S6P A0A = new S6P(7);
    public final C10920S0x A0B;
    public final boolean[] A0C = new boolean[3];

    public final void AJP(C11389SRd sRd) {
        C13900TjN tjN = this.A00;
        C11366SPh.A00(tjN);
        C11389SRd sRd2 = sRd;
        int i = sRd2.A01;
        int i2 = i;
        int i3 = sRd2.A00;
        byte[] bArr = sRd2.A02;
        int i4 = i3 - i;
        this.A06 += (long) i4;
        tjN.EJf(sRd2, i4);
        while (true) {
            int A012 = SS3.A01(bArr, this.A0C, i, i3);
            if (A012 == i3) {
                break;
            }
            i = A012 + 3;
            byte b = bArr[i] & 31;
            int i5 = A012 - i2;
            if (i5 > 0) {
                if (!this.A03) {
                    this.A0A.A01(bArr, i2, A012);
                    this.A08.A01(bArr, i2, A012);
                }
                this.A09.A01(bArr, i2, A012);
            }
            int i6 = i3 - A012;
            long j = this.A06 - ((long) i6);
            int i7 = 0;
            if (i5 < 0) {
                i7 = -i5;
            }
            long j2 = this.A05;
            if (!this.A03) {
                S6P s6p = this.A0A;
                s6p.A02(i7);
                S6P s6p2 = this.A08;
                s6p2.A02(i7);
                if (s6p.A01 && s6p2.A01) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    A1C.add(Arrays.copyOf(s6p.A03, s6p.A00));
                    A1C.add(Arrays.copyOf(s6p2.A03, s6p2.A00));
                    C10842Rz2 A032 = SS3.A03(s6p.A03, 4, s6p.A00);
                    SRU sru = new SRU(s6p2.A03, 4, s6p2.A00);
                    int A002 = SRU.A00(sru);
                    SRU.A00(sru);
                    sru.A04();
                    sru.A04();
                    C10147RnO rnO = new C10147RnO(A002);
                    String format = String.format("avc1.%02X%02X%02X", Pxh.A1a(A032.A0A, A032.A06, A032.A08));
                    C13900TjN tjN2 = this.A00;
                    SOW A003 = SOW.A00();
                    A003.A0T = this.A02;
                    A003.A01("video/avc");
                    A003.A0R = format;
                    A003.A0L = A032.A0C;
                    A003.A09 = A032.A07;
                    A003.A0N = new SRQ((byte[]) null, A032.A04, A032.A03, A032.A05, A032.A02 + 8, A032.A01 + 8);
                    A003.A01 = A032.A00;
                    A003.A0X = A1C;
                    A003.A0B = A032.A09;
                    C13900TjN.A00(A003, tjN2);
                    this.A03 = true;
                    C11220SFu sFu = this.A01;
                    sFu.A0A.append(A032.A0B, A032);
                    sFu.A09.append(rnO.A00, rnO);
                    s6p.A02 = false;
                    s6p.A01 = false;
                    s6p2.A02 = false;
                    s6p2.A01 = false;
                }
            }
            S6P s6p3 = this.A09;
            if (s6p3.A02(i7)) {
                int A004 = SS3.A00(s6p3.A03, s6p3.A00);
                C11389SRd sRd3 = this.A07;
                sRd3.A0Q(s6p3.A03, A004);
                sRd3.A0O(4);
                C11053S7y.A00(sRd3, this.A0B.A00, j2);
            }
            C11220SFu sFu2 = this.A01;
            boolean z = this.A03;
            if (sFu2.A00 == 9) {
                if (z && sFu2.A06) {
                    C11220SFu.A00(sFu2, i6 + ((int) (j - sFu2.A01)));
                }
                sFu2.A03 = sFu2.A01;
                sFu2.A04 = sFu2.A02;
                sFu2.A07 = false;
                sFu2.A06 = true;
            }
            boolean z2 = sFu2.A05;
            boolean z3 = sFu2.A07;
            int i8 = sFu2.A00;
            boolean z4 = true;
            if (i8 != 5 && (!z2 || i8 != 1)) {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            sFu2.A07 = z5;
            if (z5) {
                this.A04 = false;
            }
            long j3 = this.A05;
            if (!this.A03) {
                byte b2 = b;
                this.A0A.A00(b2);
                this.A08.A00(b2);
            }
            s6p3.A00(b);
            C11220SFu sFu3 = this.A01;
            boolean z6 = this.A04;
            sFu3.A00 = b;
            sFu3.A02 = j3;
            sFu3.A01 = j;
            sFu3.A05 = z6;
            i2 = i;
        }
        if (!this.A03) {
            this.A0A.A01(bArr, i, i3);
            this.A08.A01(bArr, i, i3);
        }
        this.A09.A01(bArr, i, i3);
    }

    public final void E1X(boolean z) {
        C11366SPh.A00(this.A00);
        if (z) {
            C11220SFu sFu = this.A01;
            long j = this.A06;
            boolean z2 = sFu.A05;
            boolean z3 = sFu.A07;
            int i = sFu.A00;
            boolean z4 = true;
            if (i != 5 && (!z2 || i != 1)) {
                z4 = false;
            }
            sFu.A07 = z3 | z4;
            sFu.A01 = j;
            C11220SFu.A00(sFu, 0);
            sFu.A06 = false;
        }
    }

    public final void E1Y(long j, int i) {
        this.A05 = j;
        this.A04 |= AnonymousClass7TF.A1P(i & 2);
    }

    public final void EKt() {
        this.A06 = 0;
        this.A04 = false;
        this.A05 = -9223372036854775807L;
        boolean[] zArr = this.A0C;
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
        S6P s6p = this.A0A;
        s6p.A02 = false;
        s6p.A01 = false;
        S6P s6p2 = this.A08;
        s6p2.A02 = false;
        s6p2.A01 = false;
        S6P s6p3 = this.A09;
        s6p3.A02 = false;
        s6p3.A01 = false;
        C11220SFu sFu = this.A01;
        if (sFu != null) {
            sFu.A06 = false;
        }
    }

    public C11738SfZ(C10920S0x s0x) {
        this.A0B = s0x;
    }

    public final void ANC(YBZ ybz, SR8 sr8) {
        this.A02 = SR8.A01(sr8);
        SR8.A02(sr8);
        C13900TjN FHV = ybz.FHV(sr8.A00, 2);
        this.A00 = FHV;
        this.A01 = new C11220SFu(FHV);
        this.A0B.A00(ybz, sr8);
    }
}
