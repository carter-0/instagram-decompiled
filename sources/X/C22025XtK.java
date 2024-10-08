package X;

import android.graphics.Bitmap;
import java.nio.FloatBuffer;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.XtK  reason: case insensitive filesystem */
public abstract class C22025XtK {
    public Y96 A00;

    public static Bitmap A01(List list) {
        Object obj = list.get(0);
        0qQ.A0C(obj, AnonymousClass000.A00(330));
        return ((XH4) obj).A00;
    }

    public static long[] A07(int i, int i2) {
        return new long[]{1, 3, (long) i, (long) i2};
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.XUJ, java.lang.Object] */
    public static XHE A03() {
        return new XHE(new Object());
    }

    public static void A05(AnonymousClass8CN r2, Object obj, int i) {
        r2.AUy(new C22130Xvu(obj, i), true);
    }

    public static void A06(FloatBuffer floatBuffer, float[] fArr, float f, int i, int i2) {
        floatBuffer.put(i2, f / fArr[i]);
    }

    public final boolean A08() {
        Y96 y96 = this.A00;
        if (y96 == null || y96.ACL()) {
            return true;
        }
        return false;
    }

    public static C60733JqQ A02(String str, AbstractCollection abstractCollection, float[] fArr, float f) {
        abstractCollection.add(new XH9(str, Float.valueOf(f)));
        return new C60733JqQ(str, fArr);
    }

    public static Object A04(String str, List list, int i) {
        Object obj = list.get(i);
        0qQ.A0C(obj, str);
        return obj;
    }
}
