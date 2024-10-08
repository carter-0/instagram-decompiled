package X;

import java.lang.reflect.Array;
import java.util.List;

public final class S7X {
    public int A00;
    public Object[] A01;
    public C10439RsG A02;
    public C10439RsG A03;

    public final Object[] A04(Object[] objArr) {
        C10439RsG rsG = new C10439RsG((C10439RsG) null, objArr);
        if (this.A02 == null) {
            this.A03 = rsG;
            this.A02 = rsG;
        } else {
            C10439RsG rsG2 = this.A03;
            if (rsG2.A00 == null) {
                rsG2.A00 = rsG;
                this.A03 = rsG;
            } else {
                throw Pxe.A0i();
            }
        }
        int length = objArr.length;
        this.A00 += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public final void A00() {
        C10439RsG rsG = this.A03;
        if (rsG != null) {
            this.A01 = (Object[]) rsG.A01;
        }
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
    }

    public final void A01(List list, Object[] objArr, int i) {
        int i2;
        C10439RsG rsG = this.A02;
        while (true) {
            i2 = 0;
            if (rsG == null) {
                break;
            }
            Object[] objArr2 = (Object[]) rsG.A01;
            int length = objArr2.length;
            while (i2 < length) {
                list.add(objArr2[i2]);
                i2++;
            }
            rsG = rsG.A00;
        }
        while (i2 < i) {
            list.add(objArr[i2]);
            i2++;
        }
        A00();
    }

    public final void A02(Object[] objArr, int i, int i2, Object obj) {
        int i3 = 0;
        for (C10439RsG rsG = this.A02; rsG != null; rsG = rsG.A00) {
            Object[] objArr2 = (Object[]) rsG.A01;
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 != i) {
            throw AnonymousClass7TE.A0z(002.A02(i, i4, "Should have gotten ", " entries, got "));
        }
    }

    public final Object[] A06(Object[] objArr, int i, Class cls) {
        int i2 = this.A00 + i;
        Object[] objArr2 = (Object[]) Array.newInstance(cls, i2);
        A02(objArr, i2, i, objArr2);
        A00();
        return objArr2;
    }

    public final Object[] A03() {
        A00();
        Object[] objArr = this.A01;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[12];
        this.A01 = objArr2;
        return objArr2;
    }

    public final Object[] A05(Object[] objArr, int i) {
        A00();
        Object[] objArr2 = this.A01;
        if (objArr2 == null || objArr2.length < i) {
            objArr2 = new Object[Math.max(12, i)];
            this.A01 = objArr2;
        }
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return this.A01;
    }
}
