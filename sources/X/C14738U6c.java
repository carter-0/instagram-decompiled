package X;

import java.util.NoSuchElementException;

/* renamed from: X.U6c  reason: case insensitive filesystem */
public final class C14738U6c extends C20389WqV {
    public int A00;
    public boolean A01;
    public Object[] A02;

    public static final void A00(C14738U6c u6c, int i, int i2) {
        int i3 = (u6c.A00 - i2) * 5;
        while (i2 < u6c.A00) {
            Object[] objArr = u6c.A02;
            objArr[i2] = C13990Tnq.A1b(objArr, i2 - 1)[(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }

    public C14738U6c(Object[] objArr, int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A00 = i3;
        Object[] objArr2 = new Object[i3];
        this.A02 = objArr2;
        boolean A1S = AnonymousClass7TF.A1S(i, i2);
        this.A01 = A1S;
        objArr2[0] = objArr;
        A00(this, i - (A1S ? 1 : 0), 1);
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
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
            return ((Object[]) obj)[i3];
        }
        throw new NoSuchElementException();
    }
}
