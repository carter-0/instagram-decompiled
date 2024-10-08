package X;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public final class TS7<E> extends AbstractQueue<E> {
    public int A00;
    public int A01;
    public Object[] A02;
    public final S6B A03;
    public final S6B A04;
    public final int maximumSize;

    public TS7(Comparator comparator, int i, int i2) {
        C264654Qt A002 = C264654Qt.A00(comparator);
        S6B s6b = new S6B(this, A002);
        this.A04 = s6b;
        S6B s6b2 = new S6B(this, A002.A01());
        this.A03 = s6b2;
        s6b.A00 = s6b2;
        s6b2.A00 = s6b;
        this.maximumSize = i;
        this.A02 = new Object[i2];
    }

    public static int initialQueueSize(int i, int i2, Iterable iterable) {
        if (i == -1) {
            i = 11;
        }
        if (iterable instanceof Collection) {
            i = Math.max(i, ((Collection) iterable).size());
        }
        return Math.min(i - 1, i2) + 1;
    }

    public static boolean isEvenLevel(int i) {
        int i2 = ((i + 1) ^ -1) ^ -1;
        17k.A0H(AnonymousClass7TF.A1R(i2), "negative index");
        return (1431655765 & i2) > (i2 & -1431655766);
    }

    public final void clear() {
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = null;
        }
        this.A01 = 0;
    }

    public boolean isIntact() {
        S6B s6b;
        int i;
        int i2 = 1;
        while (i2 < this.A01) {
            if (isEvenLevel(i2)) {
                s6b = this.A04;
            } else {
                s6b = this.A03;
            }
            int i3 = i2 * 2;
            int i4 = i3 + 1;
            TS7 ts7 = s6b.A02;
            if ((i4 >= ts7.A01 || s6b.A00(i2, i4) <= 0) && ((i = i3 + 2) >= ts7.A01 || s6b.A00(i2, i) <= 0)) {
                if (i2 > 0) {
                    int i5 = (i2 - 1) / 2;
                    if (s6b.A00(i2, i5) <= 0) {
                        if (i2 > 2 && s6b.A00((i5 - 1) / 2, i2) > 0) {
                        }
                    }
                }
                i2++;
            }
            return false;
        }
        return true;
    }

    public static Object A00(TS7 ts7, int i) {
        Object obj = ts7.A02[i];
        obj.getClass();
        return obj;
    }

    public int capacity() {
        return this.A02.length;
    }

    public final Iterator iterator() {
        return new C13116TMa(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C10474Rsp removeAt(int r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            X.17k.A02(r12, r0)
            int r0 = r11.A00
            int r0 = r0 + 1
            r11.A00 = r0
            int r0 = r11.A01
            int r1 = r0 + -1
            r11.A01 = r1
            r9 = 0
            if (r1 != r12) goto L_0x0019
            java.lang.Object[] r0 = r11.A02
        L_0x0016:
            r0[r1] = r9
        L_0x0018:
            return r9
        L_0x0019:
            java.lang.Object r8 = A00(r11, r1)
            int r0 = r11.A01
            boolean r0 = isEvenLevel(r0)
            if (r0 == 0) goto L_0x005f
            X.S6B r4 = r11.A04
        L_0x0027:
            X.TS7 r3 = r4.A02
            int r2 = r3.A01
            int r0 = r2 + -1
            int r1 = r0 / 2
            if (r1 == 0) goto L_0x005c
            int r0 = r1 + -1
            int r0 = r0 / 2
            int r0 = r0 * 2
            int r7 = r0 + 2
            if (r7 == r1) goto L_0x005c
            int r0 = r7 * 2
            int r0 = r0 + 1
            if (r0 < r2) goto L_0x005c
            java.lang.Object r2 = A00(r3, r7)
            X.4Qt r0 = r4.A01
            int r0 = r0.compare(r2, r8)
            if (r0 >= 0) goto L_0x005c
            java.lang.Object[] r1 = r3.A02
            r1[r7] = r8
            int r0 = r3.A01
            r1[r0] = r2
        L_0x0055:
            if (r7 != r12) goto L_0x0062
            java.lang.Object[] r0 = r11.A02
            int r1 = r11.A01
            goto L_0x0016
        L_0x005c:
            int r7 = r3.A01
            goto L_0x0055
        L_0x005f:
            X.S6B r4 = r11.A03
            goto L_0x0027
        L_0x0062:
            int r0 = r11.A01
            java.lang.Object r6 = A00(r11, r0)
            java.lang.Object[] r1 = r11.A02
            int r0 = r11.A01
            r1[r0] = r9
            r3 = r12
            boolean r0 = isEvenLevel(r12)
            if (r0 == 0) goto L_0x00b0
            X.S6B r5 = r11.A04
        L_0x0077:
            r4 = r12
        L_0x0078:
            int r0 = r3 * 2
            int r0 = r0 + 1
            if (r0 < 0) goto L_0x00b3
            int r0 = r0 * 2
            int r3 = r0 + 1
            r2 = 4
            X.TS7 r10 = r5.A02
            int r1 = r10.A01
            if (r3 >= r1) goto L_0x00b3
            boolean r0 = X.AnonymousClass7TF.A1R(r3)
            X.17k.A0F(r0)
            int r0 = X.Pxh.A04(r1, r2, r3)
            int r2 = r0 + 4
            int r1 = r3 + 1
        L_0x0098:
            if (r1 >= r2) goto L_0x00a4
            int r0 = r5.A00(r1, r3)
            if (r0 >= 0) goto L_0x00a1
            r3 = r1
        L_0x00a1:
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00a4:
            if (r3 <= 0) goto L_0x00b3
            java.lang.Object[] r1 = r10.A02
            java.lang.Object r0 = X.Pxe.A0t(r1, r3)
            r1[r4] = r0
            r4 = r3
            goto L_0x0078
        L_0x00b0:
            X.S6B r5 = r11.A03
            goto L_0x0077
        L_0x00b3:
            int r0 = r5.A01(r6, r4)
            if (r0 != r4) goto L_0x00fa
            int r0 = r4 * 2
            int r3 = r0 + 1
            r10 = 2
            X.TS7 r2 = r5.A02
            int r1 = r2.A01
            if (r3 >= r1) goto L_0x0106
            boolean r0 = X.AnonymousClass7TF.A1R(r3)
            X.17k.A0F(r0)
            int r0 = X.Pxh.A04(r1, r10, r3)
            int r10 = r0 + 2
            int r1 = r3 + 1
        L_0x00d3:
            if (r1 >= r10) goto L_0x00df
            int r0 = r5.A00(r1, r3)
            if (r0 >= 0) goto L_0x00dc
            r3 = r1
        L_0x00dc:
            int r1 = r1 + 1
            goto L_0x00d3
        L_0x00df:
            if (r3 <= 0) goto L_0x0106
            X.4Qt r1 = r5.A01
            java.lang.Object r0 = A00(r2, r3)
            int r0 = r1.compare(r0, r6)
            if (r0 >= 0) goto L_0x0106
            java.lang.Object[] r1 = r2.A02
            java.lang.Object r0 = X.Pxe.A0t(r1, r3)
            r1[r4] = r0
            java.lang.Object[] r0 = r2.A02
            r0[r3] = r6
            goto L_0x010a
        L_0x00fa:
            if (r0 >= r12) goto L_0x0122
            java.lang.Object r0 = A00(r11, r12)
            X.Rsp r9 = new X.Rsp
            r9.<init>(r6, r0)
            goto L_0x0122
        L_0x0106:
            int r3 = r5.A02(r6, r4)
        L_0x010a:
            if (r3 == r4) goto L_0x0122
            if (r3 >= r12) goto L_0x012e
            java.lang.Object[] r0 = r2.A02
            r1 = r0[r12]
        L_0x0112:
            r1.getClass()
            X.S6B r0 = r5.A00
            int r0 = r0.A01(r6, r3)
            if (r0 >= r12) goto L_0x0122
            X.Rsp r9 = new X.Rsp
            r9.<init>(r6, r1)
        L_0x0122:
            if (r7 >= r12) goto L_0x0018
            if (r9 == 0) goto L_0x0128
            java.lang.Object r6 = r9.A00
        L_0x0128:
            X.Rsp r9 = new X.Rsp
            r9.<init>(r8, r6)
            return r9
        L_0x012e:
            int r0 = r12 + -1
            int r1 = r0 / 2
            java.lang.Object[] r0 = r2.A02
            r1 = r0[r1]
            goto L_0x0112
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TS7.removeAt(int):X.Rsp");
    }

    public final int size() {
        return this.A01;
    }

    public final Object[] toArray() {
        int i = this.A01;
        Object[] objArr = new Object[i];
        System.arraycopy(this.A02, 0, objArr, 0, i);
        return objArr;
    }

    public final boolean add(Object obj) {
        offer(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        boolean z = false;
        for (Object offer : collection) {
            offer(offer);
            z = true;
        }
        return z;
    }

    public final boolean offer(Object obj) {
        S6B s6b;
        int i;
        obj.getClass();
        this.A00++;
        int i2 = this.A01;
        int i3 = i2 + 1;
        this.A01 = i3;
        int length = this.A02.length;
        if (i3 > length) {
            if (length < 64) {
                i = (length + 1) * 2;
            } else {
                int i4 = length / 2;
                long j = ((long) i4) * 3;
                i = (int) j;
                C9742Rg0.A00(i4, 3, "checkedMultiply", AnonymousClass7TF.A1Q((j > ((long) i) ? 1 : (j == ((long) i) ? 0 : -1))));
            }
            Object[] objArr = new Object[(Math.min(i - 1, this.maximumSize) + 1)];
            Object[] objArr2 = this.A02;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.A02 = objArr;
        }
        if (isEvenLevel(i2)) {
            s6b = this.A04;
        } else {
            s6b = this.A03;
        }
        int A022 = s6b.A02(obj, i2);
        if (A022 == i2) {
            A022 = i2;
        } else {
            s6b = s6b.A00;
        }
        s6b.A01(obj, A022);
        if (this.A01 <= this.maximumSize || isEmpty()) {
            return true;
        }
        int i5 = this.A01;
        int i6 = 1;
        if (i5 == 1) {
            i6 = 0;
        } else if (i5 != 2 && this.A03.A00(1, 2) > 0) {
            i6 = 2;
        }
        Object A002 = A00(this, i6);
        removeAt(i6);
        if (A002 == obj) {
            return false;
        }
        return true;
    }

    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return A00(this, 0);
    }

    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        Object A002 = A00(this, 0);
        removeAt(0);
        return A002;
    }
}
