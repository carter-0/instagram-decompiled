package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class TAO implements Iterable, Serializable {
    public static final TAO A01 = new C8467QvC(C10133RnA.A05);
    public int A00 = 0;

    public static C8467QvC A01(byte[] bArr, int i) {
        A00(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new C8467QvC(bArr2);
    }

    public final int A02() {
        C8467QvC qvC = (C8467QvC) this;
        if (qvC instanceof C8466QvB) {
            return ((C8466QvB) qvC).A01;
        }
        return qvC.A00.length;
    }

    public abstract boolean equals(Object obj);

    public final /* synthetic */ Iterator iterator() {
        return new TMV(this);
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw Pxg.A0g(i);
        } else if (i2 < i) {
            throw C51969G9p.A0p("Beginning index larger than ending index: ", ", ", i, i2);
        } else {
            throw C51969G9p.A0p("End index: ", " >= ", i2, i3);
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.A00;
        if (i2 == 0) {
            int A02 = A02();
            i2 = A02;
            C8467QvC qvC = (C8467QvC) this;
            if (qvC instanceof C8466QvB) {
                i = ((C8466QvB) qvC).A00;
            } else {
                i = 0;
            }
            Charset charset = C10133RnA.A02;
            for (int i3 = i; i3 < i + A02; i3++) {
                i2 = (i2 * 31) + qvC.A00[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.A00 = i2;
        }
        return i2;
    }

    public final String toString() {
        int i;
        TAO qvB;
        String concat;
        Locale locale = Locale.ROOT;
        String A0h = Pxf.A0h(this);
        int A02 = A02();
        Integer valueOf = Integer.valueOf(A02);
        if (A02 <= 50) {
            concat = C9710RfT.A00(this);
        } else {
            C8467QvC qvC = (C8467QvC) this;
            int A002 = A00(0, 47, qvC.A02());
            if (A002 == 0) {
                qvB = A01;
            } else {
                byte[] bArr = qvC.A00;
                if (qvC instanceof C8466QvB) {
                    i = ((C8466QvB) qvC).A00;
                } else {
                    i = 0;
                }
                qvB = new C8466QvB(bArr, i, A002);
            }
            concat = C9710RfT.A00(qvB).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{A0h, valueOf, concat});
    }

    public final byte[] A03() {
        int A02 = A02();
        if (A02 == 0) {
            return C10133RnA.A05;
        }
        byte[] bArr = new byte[A02];
        C8467QvC qvC = (C8467QvC) this;
        if (qvC instanceof C8466QvB) {
            C8466QvB qvB = (C8466QvB) qvC;
            System.arraycopy(qvB.A00, qvB.A00, bArr, 0, A02);
            return bArr;
        }
        System.arraycopy(qvC.A00, 0, bArr, 0, A02);
        return bArr;
    }
}
