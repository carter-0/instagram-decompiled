package X;

/* renamed from: X.5ha  reason: invalid class name and case insensitive filesystem */
public abstract class C291605ha {
    public static final C291605ha A00 = C291615hb.A00;
    public static final C291605ha A01 = C291635hd.A00;
    public static final C291605ha A02 = C291625hc.A00;

    public final int A00(C267974cY r4, AnonymousClass5Q8 r5, int i, int i2) {
        if (this instanceof C292235ic) {
            return ((C292235ic) this).A00.AAy(0, i);
        }
        if (this instanceof C291595hZ) {
            return ((C291595hZ) this).A00.AB2(r5, 0, i);
        }
        if (this instanceof C291625hc) {
            int i3 = i;
            if (r5 == AnonymousClass5Q8.Ltr) {
                return 0;
            }
            return i3;
        } else if (this instanceof C291635hd) {
            int i4 = i;
            if (r5 == AnonymousClass5Q8.Ltr) {
                return i4;
            }
            return 0;
        } else if (this instanceof C291615hb) {
            return i / 2;
        } else {
            int AWx = r4.AWx(((C52889GeP) ((C291685hi) this).A00).A00);
            if (AWx == Integer.MIN_VALUE) {
                return 0;
            }
            int i5 = i2 - AWx;
            if (r5 == AnonymousClass5Q8.Rtl) {
                return i - i5;
            }
            return i5;
        }
    }
}
