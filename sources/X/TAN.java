package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class TAN implements Iterable, Serializable {
    public static final TAN A01 = new C8426QuH(C10132Rn9.A05);
    public int A00 = 0;

    public final int A01() {
        C8426QuH quH = (C8426QuH) this;
        if (quH instanceof C8425QuG) {
            return ((C8425QuG) quH).A00;
        }
        return quH.A00.length;
    }

    public abstract boolean equals(Object obj);

    public final /* synthetic */ Iterator iterator() {
        return new TMU(this);
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
        int i = this.A00;
        if (i == 0) {
            int A012 = A01();
            byte[] bArr = ((C8426QuH) this).A00;
            i = A012;
            Charset charset = C10132Rn9.A02;
            for (int i2 = 0; i2 < A012; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.A00 = i;
        }
        return i;
    }

    public final String toString() {
        TAN quG;
        String concat;
        Locale locale = Locale.ROOT;
        String A0h = Pxf.A0h(this);
        int A012 = A01();
        Integer valueOf = Integer.valueOf(A012);
        if (A012 <= 50) {
            concat = C9703RfM.A00(this);
        } else {
            C8426QuH quH = (C8426QuH) this;
            int A002 = A00(0, 47, quH.A01());
            if (A002 == 0) {
                quG = A01;
            } else {
                quG = new C8425QuG(quH.A00, A002);
            }
            concat = C9703RfM.A00(quG).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{A0h, valueOf, concat});
    }
}
