package X;

import android.util.Property;

/* renamed from: X.6Y0  reason: invalid class name */
public final class AnonymousClass6Y0 extends Property {
    public AnonymousClass6Y0() {
        super(Float.class, "completeEndFraction");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Property property = C309346Xx.A08;
        return Float.valueOf(((C309346Xx) obj).A01);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float floatValue = ((Number) obj2).floatValue();
        Property property = C309346Xx.A08;
        ((C309346Xx) obj).A01 = floatValue;
    }
}
