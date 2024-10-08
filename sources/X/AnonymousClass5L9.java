package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: X.5L9  reason: invalid class name */
public abstract class AnonymousClass5L9 implements Iterable, Serializable {
    public static final AnonymousClass5LE A01;
    public static final AnonymousClass5L9 A02 = new AnonymousClass5LA(C284045Ks.A04);
    public int A00 = 0;

    public byte A01(int i) {
        return ((AnonymousClass5LA) this).A00[i];
    }

    public byte A02(int i) {
        return ((AnonymousClass5LA) this).A00[i];
    }

    public int A03() {
        return ((AnonymousClass5LA) this).A00.length;
    }

    public abstract boolean equals(Object obj);

    /* JADX WARNING: type inference failed for: r0v3, types: [X.5LE] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            byte[] r1 = X.C284045Ks.A04
            X.5LA r0 = new X.5LA
            r0.<init>(r1)
            A02 = r0
            java.lang.Class r0 = X.AnonymousClass5LC.A00
            if (r0 == 0) goto L_0x0019
            boolean r0 = X.AnonymousClass5LC.A01
            if (r0 != 0) goto L_0x0019
            X.5LD r0 = new X.5LD
            r0.<init>()
        L_0x0016:
            A01 = r0
            return
        L_0x0019:
            X.FQi r0 = new X.FQi
            r0.<init>()
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5L9.<clinit>():void");
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(002.A0c(Pxd.A00(128), " < 0", i));
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException(002.A02(i, i2, Pxd.A00(127), ", "));
        } else {
            throw new IndexOutOfBoundsException(002.A02(i2, i3, Pxd.A00(146), " >= "));
        }
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int A03 = A03();
            AnonymousClass5LA r0 = (AnonymousClass5LA) this;
            byte[] bArr = r0.A00;
            int A04 = r0.A04();
            i = A03;
            Charset charset = C284045Ks.A03;
            for (int i2 = A04; i2 < A04 + A03; i2++) {
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
        return new TMT(this);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(A03())});
    }
}
