package X;

import android.graphics.Bitmap;

public final class QHL extends C11910Sij implements C13532Tc4 {
    public final Class Bne() {
        return Q6Z.class;
    }

    public final int getSize() {
        C11271SIi sIi = ((Q6Z) this.A00).A09.A00;
        C11264SHy sHy = sIi.A0E;
        return sHy.A09.limit() + sHy.A0C.length + (sHy.A0G.length * 4) + sIi.A00;
    }

    public final void recycle() {
        ST0 st0;
        ST0 st02;
        ST0 st03;
        Q6Z q6z = (Q6Z) this.A00;
        q6z.stop();
        q6z.A04 = true;
        C11271SIi sIi = q6z.A09.A00;
        sIi.A0G.clear();
        Bitmap bitmap = sIi.A03;
        if (bitmap != null) {
            sIi.A0F.E5H(bitmap);
            sIi.A03 = null;
        }
        sIi.A09 = false;
        QHP qhp = sIi.A05;
        if (qhp != null) {
            sIi.A0D.A00(qhp);
            sIi.A05 = null;
        }
        QHP qhp2 = sIi.A06;
        if (qhp2 != null) {
            sIi.A0D.A00(qhp2);
            sIi.A06 = null;
        }
        QHP qhp3 = sIi.A07;
        if (qhp3 != null) {
            sIi.A0D.A00(qhp3);
            sIi.A07 = null;
        }
        C11264SHy sHy = sIi.A0E;
        sHy.A07 = null;
        byte[] bArr = sHy.A0C;
        if (!(bArr == null || (st03 = sHy.A0I.A01) == null)) {
            st03.A05(bArr);
        }
        int[] iArr = sHy.A0G;
        if (!(iArr == null || (st02 = sHy.A0I.A01) == null)) {
            st02.A05(iArr);
        }
        Bitmap bitmap2 = sHy.A06;
        if (bitmap2 != null) {
            sHy.A0I.A00.E5H(bitmap2);
        }
        sHy.A06 = null;
        sHy.A09 = null;
        sHy.A08 = null;
        byte[] bArr2 = sHy.A0B;
        if (!(bArr2 == null || (st0 = sHy.A0I.A01) == null)) {
            st0.A05(bArr2);
        }
        sIi.A08 = true;
    }
}
