package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class TAM implements Iterable, Serializable {
    public static final TAM A01 = new R5r(SDA.A05);
    public int A00 = 0;

    public final int A00() {
        R5r r5r = (R5r) this;
        if (r5r instanceof R5q) {
            return ((R5q) r5r).A00;
        }
        return r5r.A00.length;
    }

    public final TAM A01(int i) {
        int i2;
        R5r r5r = (R5r) this;
        int A002 = r5r.A00();
        if ((i | i | (A002 - i)) >= 0) {
            byte[] bArr = r5r.A00;
            if (r5r instanceof R5q) {
                i2 = ((R5q) r5r).A01;
            } else {
                i2 = 0;
            }
            return new R5q(bArr, i2, i);
        } else if (i < 0) {
            throw C51969G9p.A0p("Beginning index larger than ending index: ", ", ", 0, i);
        } else {
            throw C51969G9p.A0p("End index: ", " >= ", i, A002);
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i;
        int i2 = this.A00;
        if (i2 == 0) {
            int A002 = A00();
            R5r r5r = (R5r) this;
            byte[] bArr = r5r.A00;
            if (r5r instanceof R5q) {
                i = ((R5q) r5r).A01;
            } else {
                i = 0;
            }
            i2 = A002;
            Charset charset = SDA.A04;
            for (int i3 = i; i3 < i + A002; i3++) {
                i2 = (i2 * 31) + bArr[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.A00 = i2;
        }
        return i2;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new TMX(this);
    }

    public final String toString() {
        String A0R;
        Locale locale = Locale.ROOT;
        String A0h = Pxf.A0h(this);
        int A002 = A00();
        Integer valueOf = Integer.valueOf(A002);
        if (A002 <= 50) {
            A0R = C9754RgC.A00(this);
        } else {
            A0R = 002.A0R(C9754RgC.A00(A01(47)), "...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{A0h, valueOf, A0R});
    }
}
