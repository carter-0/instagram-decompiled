package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.Jk2  reason: case insensitive filesystem */
public final class C60354Jk2 extends C232322tW {
    public final List A00;
    public final List A01;

    public final int A02() {
        return this.A00.size();
    }

    public final int A03() {
        return this.A01.size();
    }

    public final boolean A04(int i, int i2) {
        Bitmap[] bitmapArr;
        C60999Juv juv;
        C60999Juv juv2;
        0eP r0 = (0eP) this.A01.get(i);
        Bitmap[] bitmapArr2 = null;
        if (r0 == null || (juv2 = (C60999Juv) r0.A01) == null) {
            bitmapArr = null;
        } else {
            bitmapArr = juv2.A01();
        }
        0eP r02 = (0eP) this.A00.get(i2);
        if (!(r02 == null || (juv = (C60999Juv) r02.A01) == null)) {
            bitmapArr2 = juv.A01();
        }
        return 0su.A0c(bitmapArr, bitmapArr2);
    }

    public final boolean A05(int i, int i2) {
        Object obj;
        0eP r1 = (0eP) this.A01.get(i);
        Object obj2 = null;
        if (r1 != null) {
            obj = r1.A00;
        } else {
            obj = null;
        }
        0eP r12 = (0eP) this.A00.get(i2);
        if (r12 != null) {
            obj2 = r12.A00;
        }
        return 0qQ.A0K(obj, obj2);
    }

    public C60354Jk2(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
