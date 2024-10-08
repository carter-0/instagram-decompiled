package X;

/* renamed from: X.Kp6  reason: case insensitive filesystem */
public abstract class C62954Kp6 {
    public static final boolean A00(C62448Kfy kfy, C64124LOv lOv, C64124LOv lOv2) {
        0qQ.A0B(lOv, 0);
        if (lOv2 == null) {
            return true;
        }
        if ((lOv2 instanceof C60350Jjy) && (lOv instanceof C60351Jjz)) {
            return true;
        }
        if ((lOv instanceof C60350Jjy) && (lOv2 instanceof C60351Jjz)) {
            return false;
        }
        if (lOv.A00 == lOv2.A00 && lOv.A01 == lOv2.A01 && lOv2.A01(kfy) <= lOv.A01(kfy)) {
            return false;
        }
        return true;
    }
}
