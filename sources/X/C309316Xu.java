package X;

import android.util.Property;

/* renamed from: X.6Xu  reason: invalid class name and case insensitive filesystem */
public final class C309316Xu extends Property {
    public C309316Xu() {
        super(Float.class, "growFraction");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        float f;
        C309306Xt r3 = (C309306Xt) obj;
        C309276Xq r1 = r3.A09;
        if (r1.A01 == 0 && r1.A00 == 0) {
            f = 1.0f;
        } else {
            f = r3.A00;
        }
        return Float.valueOf(f);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        C309306Xt r3 = (C309306Xt) obj;
        float floatValue = ((Number) obj2).floatValue();
        if (r3.A00 != floatValue) {
            r3.A00 = floatValue;
            r3.invalidateSelf();
        }
    }
}
