package X;

import java.util.NoSuchElementException;

/* renamed from: X.TqR  reason: case insensitive filesystem */
public final class C14132TqR extends AnonymousClass6BX {
    public int A00;
    public boolean A01;
    public Object[] A02;

    public C14132TqR(Object[] objArr, int i, int i2, int i3) {
        0qQ.A0B(objArr, 1);
        this.A00 = i;
        this.A01 = i2;
        this.A00 = i3;
        Object[] objArr2 = new Object[i3];
        this.A02 = objArr2;
        boolean z = i == i2;
        this.A01 = z;
        objArr2[0] = objArr;
        A00(this, i - (z ? 1 : 0), 1);
    }

    public static final void A00(C14132TqR tqR, int i, int i2) {
        int i3 = (tqR.A00 - i2) * 5;
        while (i2 < tqR.A00) {
            Object[] objArr = tqR.A02;
            Object[] objArr2 = objArr[i2 - 1];
            0qQ.A0C(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = objArr2[(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.A00 & 31;
            Object obj = this.A02[this.A00 - 1];
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
            Object obj2 = ((Object[]) obj)[i];
            int i2 = this.A00 + 1;
            this.A00 = i2;
            if (i2 == this.A01) {
                this.A01 = true;
            } else {
                int i3 = 0;
                while (((i2 >> i3) & 31) == 0) {
                    i3 += 5;
                }
                if (i3 > 0) {
                    A00(this, i2, ((this.A00 - 1) - (i3 / 5)) + 1);
                    return obj2;
                }
            }
            return obj2;
        }
        throw new NoSuchElementException();
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00 - 1;
            this.A00 = i;
            if (this.A01) {
                this.A01 = false;
            } else {
                int i2 = 0;
                while (((i >> i2) & 31) == 31) {
                    i2 += 5;
                }
                if (i2 > 0) {
                    A00(this, i, ((this.A00 - 1) - (i2 / 5)) + 1);
                }
            }
            int i3 = this.A00 & 31;
            Object obj = this.A02[this.A00 - 1];
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
            return ((Object[]) obj)[i3];
        }
        throw new NoSuchElementException();
    }
}
