package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

public abstract class TAP implements Iterable, Serializable {
    public static final TAP A01 = new R36(SD9.A05);
    public static final C13659TeQ A02;
    public int A00 = 0;

    public final int A02() {
        R36 r36 = (R36) this;
        if (r36 instanceof R35) {
            return ((R35) r36).A00;
        }
        return r36.A00.length;
    }

    public final TAP A03(int i) {
        R36 r36 = (R36) this;
        int A002 = A00(0, i, r36.A02());
        if (A002 == 0) {
            return A01;
        }
        return new R35(r36.A00, r36.A06(), A002);
    }

    public abstract boolean equals(Object obj);

    /* JADX WARNING: type inference failed for: r0v3, types: [X.TeQ] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            byte[] r1 = X.SD9.A05
            X.R36 r0 = new X.R36
            r0.<init>(r1)
            A01 = r0
            java.lang.Class r0 = X.C10094RmW.A00
            if (r0 == 0) goto L_0x0019
            boolean r0 = X.C10094RmW.A01
            if (r0 != 0) goto L_0x0019
            X.T5F r0 = new X.T5F
            r0.<init>()
        L_0x0016:
            A02 = r0
            return
        L_0x0019:
            X.T5E r0 = new X.T5E
            r0.<init>()
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TAP.<clinit>():void");
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

    public static R36 A01(byte[] bArr, int i, int i2) {
        A00(i, i + i2, bArr.length);
        return new R36(A02.AKl(bArr, i, i2));
    }

    public final String A04() {
        Charset charset = SD9.A04;
        if (A02() == 0) {
            return "";
        }
        R36 r36 = (R36) this;
        return Pxe.A11(charset, r36.A00, r36.A06(), r36.A02());
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int A022 = A02();
            R36 r36 = (R36) this;
            byte[] bArr = r36.A00;
            int A06 = r36.A06();
            i = A022;
            Charset charset = SD9.A04;
            for (int i2 = A06; i2 < A06 + A022; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                i = 1;
            }
            this.A00 = i;
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new TMX(this);
    }

    public final String toString() {
        String A0R;
        Locale locale = Locale.ROOT;
        String A0h = Pxf.A0h(this);
        int A022 = A02();
        Integer valueOf = Integer.valueOf(A022);
        if (A022 <= 50) {
            A0R = C9750Rg8.A00(this);
        } else {
            A0R = 002.A0R(C9750Rg8.A00(A03(47)), "...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{A0h, valueOf, A0R});
    }

    public final byte[] A05() {
        int A022 = A02();
        if (A022 == 0) {
            return SD9.A05;
        }
        byte[] bArr = new byte[A022];
        R36 r36 = (R36) this;
        if (r36 instanceof R35) {
            R35 r35 = (R35) r36;
            System.arraycopy(r35.A00, r35.A01, bArr, 0, A022);
            return bArr;
        }
        System.arraycopy(r36.A00, 0, bArr, 0, A022);
        return bArr;
    }
}
