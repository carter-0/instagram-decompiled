package X;

import java.util.Iterator;

public final class TMX implements Iterator {
    public int A00;
    public final int A01 = 1;
    public final int A02;
    public final Object A03;

    public TMX(TAM tam) {
        this.A03 = tam;
        this.A00 = 0;
        this.A02 = tam.A00();
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1T(this.A00, this.A02);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        byte[] bArr;
        byte b;
        byte[] bArr2;
        int i;
        int i2 = this.A01;
        int i3 = this.A00;
        int i4 = this.A02;
        if (i2 != 0) {
            if (i3 < i4) {
                this.A00 = i3 + 1;
                R5r r5r = (R5r) ((TAM) this.A03);
                if (r5r instanceof R5q) {
                    R5q r5q = (R5q) r5r;
                    bArr2 = r5q.A00;
                    i = r5q.A01;
                } else {
                    bArr = r5r.A00;
                    b = bArr[i3];
                    return Byte.valueOf(b);
                }
            } else {
                throw Pxe.A1C();
            }
        } else if (i3 < i4) {
            this.A00 = i3 + 1;
            R36 r36 = (R36) ((TAP) this.A03);
            if (r36 instanceof R35) {
                R35 r35 = (R35) r36;
                bArr2 = r35.A00;
                i = r35.A01;
            } else {
                bArr = r36.A00;
                b = bArr[i3];
                return Byte.valueOf(b);
            }
        } else {
            throw Pxe.A1C();
        }
        b = bArr2[i + i3];
        return Byte.valueOf(b);
    }

    public final void remove() {
        int i = this.A01;
        throw C66580MXl.A11();
    }

    public TMX(TAP tap) {
        this.A03 = tap;
        this.A00 = 0;
        this.A02 = tap.A02();
    }
}
