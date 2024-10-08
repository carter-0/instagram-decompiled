package X;

/* renamed from: X.Kp0  reason: case insensitive filesystem */
public abstract class C62948Kp0 {
    public final String A01() {
        if (this instanceof C59790JYj) {
            return "com.facebook.stella";
        }
        if (this instanceof C62157KbF) {
            return "com.wearable.facebook.monza";
        }
        if (this instanceof C59789JYi) {
            return "com.facebook.mwa.ai";
        }
        if (this instanceof C62156KbE) {
            return "com.facebook.horizon";
        }
        if (this instanceof C59788JYh) {
            return "com.facebook.hammerhead";
        }
        return "com.facebook.greatwhite";
    }

    public final String A02() {
        if (this instanceof C59790JYj) {
            return "Stella";
        }
        if (this instanceof C62157KbF) {
            return null;
        }
        if (this instanceof C59789JYi) {
            return "Hammerhead";
        }
        if (this instanceof C62156KbE) {
            return null;
        }
        if (!(this instanceof C59788JYh)) {
            return "greatwhite";
        }
        return "Hammerhead";
    }

    public final boolean A03() {
        if ((this instanceof C59790JYj) || (this instanceof C59789JYi) || (this instanceof C59788JYh) || (this instanceof C62155KbD)) {
            return true;
        }
        return false;
    }
}
