package X;

/* renamed from: X.9yW  reason: invalid class name and case insensitive filesystem */
public abstract class C394689yW {
    public static final boolean A00(AnonymousClass51M r4, boolean z, boolean z2) {
        int i = z;
        if (z2) {
            i = (z ? 1 : 0) + true;
        }
        for (C391219sX r0 : A2K.A00) {
            String str = r0.A02;
            if (0qQ.A0K(str, r4.A0L) && !z) {
                i++;
            }
            if (0qQ.A0K(str, r4.A0M) && !z2) {
                i++;
            }
        }
        if (r4.A08 - r4.A09 >= i * C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION) {
            return true;
        }
        return false;
    }
}
