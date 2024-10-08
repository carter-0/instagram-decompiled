package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class TAQ implements Iterable, Serializable {
    public static final TAQ A01 = new C8569Qx7(SS6.A05);
    public int A00 = 0;

    public abstract byte A02(int i);

    public abstract byte A03(int i);

    public final int A04() {
        return this.A00;
    }

    public abstract int A05();

    public abstract int A06(int i, int i2, int i3);

    public abstract TAQ A07(int i, int i2);

    public final String A08(Charset charset) {
        return A05() == 0 ? "" : A09(charset);
    }

    public abstract String A09(Charset charset);

    public abstract void A0A(SA4 sa4);

    public abstract boolean A0B();

    public abstract boolean equals(Object obj);

    public final /* synthetic */ Iterator iterator() {
        return new C13118TMc(this);
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

    public static C8569Qx7 A01(byte[] bArr, int i, int i2) {
        A00(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C8569Qx7(bArr2);
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int A05 = A05();
            i = A06(A05, 0, A05);
            if (i == 0) {
                i = 1;
            }
            this.A00 = i;
        }
        return i;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String A0h = Pxf.A0h(this);
        int A05 = A05();
        Integer valueOf = Integer.valueOf(A05);
        if (A05 <= 50) {
            concat = C9727Rfk.A00(this);
        } else {
            concat = C9727Rfk.A00(A07(0, 47)).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{A0h, valueOf, concat});
    }
}
