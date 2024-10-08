package X;

import android.graphics.drawable.Drawable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.56k  reason: invalid class name and case insensitive filesystem */
public final class C2812256k extends C2812356l {
    public final 2VS A00 = new 2VS();
    public final C246053du A01;

    public static void A01(C2812256k r6, float f) {
        Object obj;
        2VS r4 = r6.A00;
        short s = r4.A00;
        for (int i = 0; i < s; i++) {
            Reference reference = (Reference) r4.A01[r4.A01(i)];
            if (!(reference == null || (obj = reference.get()) == null)) {
                if (!(obj instanceof Drawable) || ((Drawable) obj).getCallback() != null) {
                    r6.A01.ENI(obj, f);
                } else {
                    reference.clear();
                }
            }
        }
    }

    public static void A00(2VS r5, C2812256k r6) {
        2VS r4 = r6.A00;
        int i = 0;
        while (true) {
            Object[] objArr = r4.A01;
            if (i >= 5) {
                break;
            }
            objArr[i] = null;
            i++;
        }
        r4.A00 = 0;
        if (r5 != null) {
            short s = r5.A00;
            for (int i2 = 0; i2 < s; i2++) {
                r4.A03(r5.A01(i2), new WeakReference(r5.A01[r5.A01(i2)]));
            }
        }
    }

    public final void A03(float f) {
        this.A00 = f;
        A01(this, f);
    }

    public C2812256k(2VS r2, C246053du r3) {
        A00(r2, this);
        this.A01 = r3;
    }
}
