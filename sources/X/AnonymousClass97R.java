package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.97R  reason: invalid class name */
public abstract class AnonymousClass97R implements Iterable, Serializable {
    public static final AnonymousClass97R A01 = new AnonymousClass97V(AnonymousClass97S.A05);
    public static final AnonymousClass97Z A02;
    public int A00 = 0;

    public final int A02() {
        AnonymousClass97V r1 = (AnonymousClass97V) this;
        if (r1 instanceof AnonymousClass9CJ) {
            return ((AnonymousClass9CJ) r1).A00;
        }
        return r1.A00.length;
    }

    public final AnonymousClass97R A03(int i) {
        AnonymousClass97V r2 = (AnonymousClass97V) this;
        int A002 = A00(0, i, r2.A02());
        if (A002 == 0) {
            return A01;
        }
        return new AnonymousClass9CJ(r2.A00, r2.A05(), A002);
    }

    public abstract boolean equals(Object obj);

    /* JADX WARNING: type inference failed for: r0v3, types: [X.97Z] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        /*
            byte[] r1 = X.AnonymousClass97S.A05
            X.97V r0 = new X.97V
            r0.<init>(r1)
            A01 = r0
            java.lang.Class r0 = X.AnonymousClass97X.A00
            if (r0 == 0) goto L_0x0019
            boolean r0 = X.AnonymousClass97X.A01
            if (r0 != 0) goto L_0x0019
            X.97Y r0 = new X.97Y
            r0.<init>()
        L_0x0016:
            A02 = r0
            return
        L_0x0019:
            X.AWy r0 = new X.AWy
            r0.<init>()
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass97R.<clinit>():void");
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

    public static AnonymousClass97V A01(byte[] bArr, int i, int i2) {
        A00(i, i + i2, bArr.length);
        return new AnonymousClass97V(A02.AKl(bArr, i, i2));
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int A022 = A02();
            AnonymousClass97V r0 = (AnonymousClass97V) this;
            byte[] bArr = r0.A00;
            int A05 = r0.A05();
            i = A022;
            Charset charset = AnonymousClass97S.A04;
            for (int i2 = A05; i2 < A05 + A022; i2++) {
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
        return new C41292ArY(this);
    }

    public final String toString() {
        String A0R;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int A022 = A02();
        Integer valueOf = Integer.valueOf(A022);
        if (A022 <= 50) {
            A0R = C393279wB.A00(this);
        } else {
            A0R = 002.A0R(C393279wB.A00(A03(47)), "...");
        }
        return String.format(locale, Pxd.A00(342), new Object[]{hexString, valueOf, A0R});
    }

    public final byte[] A04() {
        int A022 = A02();
        if (A022 == 0) {
            return AnonymousClass97S.A05;
        }
        byte[] bArr = new byte[A022];
        AnonymousClass97V r3 = (AnonymousClass97V) this;
        if (r3 instanceof AnonymousClass9CJ) {
            AnonymousClass9CJ r32 = (AnonymousClass9CJ) r3;
            System.arraycopy(r32.A00, r32.A01, bArr, 0, A022);
            return bArr;
        }
        System.arraycopy(r3.A00, 0, bArr, 0, A022);
        return bArr;
    }
}
