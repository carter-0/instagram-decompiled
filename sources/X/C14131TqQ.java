package X;

import java.util.NoSuchElementException;

/* renamed from: X.TqQ  reason: case insensitive filesystem */
public final class C14131TqQ extends AnonymousClass6BX {
    public final C14132TqR A00;
    public final Object[] A01;

    public C14131TqQ(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        0qQ.A0B(objArr, 1);
        0qQ.A0B(objArr2, 2);
        this.A00 = i;
        this.A01 = i2;
        this.A01 = objArr2;
        int i4 = (i2 - 1) & -32;
        this.A00 = new C14132TqR(objArr, i > i4 ? i4 : i, i4, i3);
    }

    public final Object next() {
        if (hasNext()) {
            C14132TqR tqR = this.A00;
            if (tqR.hasNext()) {
                this.A00++;
                return tqR.next();
            }
            Object[] objArr = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return objArr[i - tqR.A01];
        }
        throw new NoSuchElementException();
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00;
            C14132TqR tqR = this.A00;
            int i2 = tqR.A01;
            if (i > i2) {
                Object[] objArr = this.A01;
                int i3 = i - 1;
                this.A00 = i3;
                return objArr[i3 - i2];
            }
            this.A00 = i - 1;
            return tqR.previous();
        }
        throw new NoSuchElementException();
    }
}
