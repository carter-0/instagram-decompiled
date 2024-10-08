package X;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.Seq  reason: case insensitive filesystem */
public final class C11693Seq implements C13809Thc {
    public static final int A0D;
    public static final int[] A0E = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] A0F;
    public static final byte[] A0G;
    public static final byte[] A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public YBZ A06;
    public C13511Tbc A07;
    public C13900TjN A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final byte[] A0C;

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        A0F = iArr;
        Charset charset = AnonymousClass2RN.A05;
        A0G = "#!AMR\n".getBytes(charset);
        A0H = "#!AMR-WB\n".getBytes(charset);
        A0D = iArr[8];
    }

    private boolean A00(C13910TlA tlA) {
        byte[] bArr = A0G;
        tlA.EI7();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        tlA.E2F(bArr2, 0, length);
        if (Arrays.equals(bArr2, bArr)) {
            this.A0B = false;
        } else {
            bArr = A0H;
            tlA.EI7();
            int length2 = bArr.length;
            byte[] bArr3 = new byte[length2];
            tlA.E2F(bArr3, 0, length2);
            if (!Arrays.equals(bArr3, bArr)) {
                return false;
            }
            this.A0B = true;
        }
        tlA.Evk(bArr.length);
        return true;
    }

    public final void CMU(YBZ ybz) {
        this.A06 = ybz;
        this.A08 = ybz.FHV(0, 1);
        ybz.ASU();
    }

    public final int E67(C13910TlA tlA, C21363XYr xYr) {
        StringBuilder sb;
        String str;
        int[] iArr;
        String str2;
        int i;
        C11366SPh.A00(this.A08);
        if (tlA.Bdl() != 0 || A00(tlA)) {
            if (!this.A09) {
                this.A09 = true;
                if (this.A0B) {
                    str2 = "audio/amr-wb";
                    i = 16000;
                } else {
                    str2 = "audio/3gpp";
                    i = CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
                }
                C13900TjN tjN = this.A08;
                SOW A002 = SOW.A00();
                A002.A01(str2);
                A002.A0A = A0D;
                A002.A04 = 1;
                A002.A0G = i;
                C13900TjN.A00(A002, tjN);
            }
            int i2 = this.A00;
            int i3 = -1;
            if (i2 == 0) {
                try {
                    tlA.EI7();
                    byte[] bArr = this.A0C;
                    tlA.E2F(bArr, 0, 1);
                    byte b = bArr[0];
                    if ((b & 131) <= 0) {
                        b = (b >> 3) & 15;
                        if (b >= 0 && b <= 15) {
                            if (this.A0B) {
                                if (b >= 10) {
                                    if (b > 13) {
                                    }
                                }
                                iArr = A0F;
                            } else if (b < 12 || b > 14) {
                                iArr = A0E;
                            }
                            i2 = iArr[b];
                            this.A01 = i2;
                            this.A00 = i2;
                            int i4 = this.A02;
                            if (i4 == -1) {
                                i4 = i2;
                                this.A02 = i2;
                            }
                            if (i4 == i2) {
                                this.A03++;
                            }
                        }
                        sb = AnonymousClass7TE.A1A();
                        sb.append("Illegal AMR ");
                        if (this.A0B) {
                            str = "WB";
                        } else {
                            str = "NB";
                        }
                        sb.append(str);
                        sb.append(" frame type ");
                    } else {
                        sb = AnonymousClass7TE.A1A();
                        sb.append("Invalid padding bits for frame header ");
                    }
                    sb.append(b);
                    throw new XQX(sb.toString(), (Throwable) null, 1, true);
                } catch (EOFException unused) {
                }
            }
            int EJe = this.A08.EJe(tlA, i2, true);
            if (EJe != -1) {
                int i5 = this.A00 - EJe;
                this.A00 = i5;
                i3 = 0;
                if (i5 <= 0) {
                    this.A08.EJm((S4h) null, 1, this.A01, 0, this.A05 + this.A04);
                    this.A04 += 20000;
                }
            }
            if (!this.A0A) {
                C11710Sf7 sf7 = new C11710Sf7(-9223372036854775807L, 0);
                this.A07 = sf7;
                this.A06.EKw(sf7);
                this.A0A = true;
            }
            return i3;
        }
        throw Pxf.A0L("Could not find AMR header.", (Throwable) null);
    }

    public final void EKu(long j, long j2) {
        this.A04 = 0;
        this.A01 = 0;
        this.A00 = 0;
        if (j != 0) {
            C13511Tbc tbc = this.A07;
            if (tbc instanceof C11708Sf5) {
                C11708Sf5 sf5 = (C11708Sf5) tbc;
                this.A05 = Pxj.A0D(j - sf5.A03) / ((long) sf5.A00);
                return;
            }
        }
        this.A05 = 0;
    }

    public C11693Seq(int i) {
        this.A0C = new byte[1];
        this.A02 = -1;
    }

    public final boolean Evx(C13910TlA tlA) {
        return A00(tlA);
    }

    public C11693Seq() {
        this(0);
    }
}
