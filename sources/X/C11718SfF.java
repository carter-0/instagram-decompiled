package X;

import androidx.media3.common.util.Util;
import java.io.EOFException;

/* renamed from: X.SfF  reason: case insensitive filesystem */
public final class C11718SfF implements C13900TjN {
    public SJM A00;
    public C13684Tf1 A01;
    public int A02 = 0;
    public int A03 = 0;
    public byte[] A04 = Util.A07;
    public final C11389SRd A05 = new C11389SRd();
    public final C13900TjN A06;
    public final C13890TjD A07;

    public final /* synthetic */ int EJe(C13506TbX tbX, int i, boolean z) {
        return EJk(tbX, i, 0, z);
    }

    public final /* synthetic */ void EJf(C11389SRd sRd, int i) {
        EJg(sRd, i, 0);
    }

    public final int EJk(C13506TbX tbX, int i, int i2, boolean z) {
        if (this.A01 == null) {
            return this.A06.EJk(tbX, i, 0, z);
        }
        A00(i);
        int read = tbX.read(this.A04, this.A02, i);
        if (read != -1) {
            this.A02 += read;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    private void A00(int i) {
        byte[] bArr;
        byte[] bArr2 = this.A04;
        int length = bArr2.length;
        int i2 = this.A02;
        if (length - i2 < i) {
            int i3 = this.A03;
            int i4 = i2 - i3;
            int max = Math.max(i4 * 2, i + i4);
            if (max <= length) {
                bArr = bArr2;
            } else {
                bArr = new byte[max];
            }
            System.arraycopy(bArr2, i3, bArr, 0, i4);
            this.A03 = 0;
            this.A02 = i4;
            this.A04 = bArr;
        }
    }

    public final void AWO(SJM sjm) {
        C13684Tf1 tf1;
        String str = sjm.A0Y;
        str.getClass();
        C11366SPh.A01(AnonymousClass7TF.A1S(SQX.A00(str), 3));
        if (!sjm.equals(this.A00)) {
            this.A00 = sjm;
            C13890TjD tjD = this.A07;
            if (tjD.Ez6(sjm)) {
                tf1 = tjD.AKu(sjm);
            } else {
                tf1 = null;
            }
            this.A01 = tf1;
        }
        C13684Tf1 tf12 = this.A01;
        C13900TjN tjN = this.A06;
        if (tf12 != null) {
            SOW sow = new SOW(sjm);
            sow.A01("application/x-media3-cues");
            sow.A0R = str;
            sow.A0M = Long.MAX_VALUE;
            sow.A06 = this.A07.Atf(sjm);
            sjm = Pxe.A0O(sow);
        }
        tjN.AWO(sjm);
    }

    public final void EJg(C11389SRd sRd, int i, int i2) {
        if (this.A01 == null) {
            this.A06.EJg(sRd, i, i2);
            return;
        }
        A00(i);
        sRd.A0R(this.A04, this.A02, i);
        this.A02 += i;
    }

    public final void EJm(S4h s4h, int i, int i2, int i3, long j) {
        S4h s4h2 = s4h;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        long j2 = j;
        if (this.A01 == null) {
            this.A06.EJm(s4h2, i4, i5, i6, j2);
            return;
        }
        C11366SPh.A03(DbW.A1a(s4h2), "DRM on subtitles is not supported");
        int i7 = (this.A02 - i3) - i2;
        C13684Tf1 tf1 = this.A01;
        byte[] bArr = this.A04;
        tf1.E1l(new C11670SeT(this, i4, j2), C11115SAs.A00, bArr, i7, i5);
        int i8 = i7 + i2;
        this.A03 = i8;
        if (i8 == this.A02) {
            this.A03 = 0;
            this.A02 = 0;
        }
    }

    public C11718SfF(C13900TjN tjN, C13890TjD tjD) {
        this.A06 = tjN;
        this.A07 = tjD;
    }
}
