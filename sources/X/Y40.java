package X;

import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class Y40 implements Map.Entry {
    public int A00 = -1;
    public int A01;
    public int A02;
    public final /* synthetic */ Y44 A03;

    public Y40(Y44 y44) {
        this.A03 = y44;
        this.A01 = y44.A00;
        this.A02 = y44.A04(-1);
    }

    public final void A00() {
        int i = this.A01;
        Y44 y44 = this.A03;
        if (i == y44.A00) {
            int i2 = this.A02;
            if (i2 >= 0) {
                this.A00 = i2;
                this.A02 = y44.A04(i2);
                return;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r2 = 0
            if (r0 == 0) goto L_0x0020
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r1 = r4.getKey()
            java.lang.Object r0 = r3.getKey()
            if (r1 != 0) goto L_0x0028
            if (r0 != 0) goto L_0x0020
        L_0x0013:
            java.lang.Object r1 = r4.getValue()
            java.lang.Object r0 = r3.getValue()
            if (r1 != 0) goto L_0x0021
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r2 = 1
        L_0x0020:
            return r2
        L_0x0021:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            goto L_0x001f
        L_0x0028:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y40.equals(java.lang.Object):boolean");
    }

    public final Object getKey() {
        int i = this.A00;
        if (i >= 0) {
            return this.A03.A05(i);
        }
        throw AnonymousClass7TE.A0z("Iterator not pointing to any element.");
    }

    public final Object getValue() {
        int i = this.A00;
        if (i >= 0) {
            return this.A03.A06(i);
        }
        throw AnonymousClass7TE.A0z("Iterator not pointing to any element.");
    }

    public final boolean hasNext() {
        return Pxf.A1R(this.A02);
    }

    public final void remove() {
        int i = this.A00;
        if (i >= 0) {
            int i2 = this.A01;
            Y44 y44 = this.A03;
            if (i2 == y44.A00) {
                this.A01 = i2 + 1;
                y44.remove(y44.A05(i));
                Object[] objArr = y44.A03;
                int i3 = this.A00;
                if (objArr[i3 << 1] != null) {
                    this.A02 = i3;
                }
                this.A00 = -1;
                return;
            }
            throw new ConcurrentModificationException();
        }
        throw AnonymousClass7TE.A0z("Iterator not pointing to any element.");
    }

    public final Object setValue(Object obj) {
        int i = this.A00;
        if (i >= 0) {
            int i2 = (i << 1) + 1;
            Object[] objArr = this.A03.A03;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        throw AnonymousClass7TE.A0z("Iterator not pointing to any element.");
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(getKey()) ^ AnonymousClass7TE.A0L(getValue());
    }
}
