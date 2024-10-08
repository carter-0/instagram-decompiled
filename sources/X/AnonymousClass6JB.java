package X;

/* renamed from: X.6JB  reason: invalid class name */
public abstract class AnonymousClass6JB {
    public static final void A00(AnonymousClass6J1 r9, C286575Wy r10, Object obj, Object obj2, int i, int i2) {
        int i3;
        r10.ExV(1439843069);
        int i4 = i2;
        AnonymousClass6J1 r7 = r9;
        if ((i2 & 6) == 0) {
            int i5 = 2;
            if (r10.AGu(r9)) {
                i5 = 4;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        Object obj3 = obj;
        if ((i2 & 48) == 0) {
            int i6 = 16;
            if (r10.AGu(obj)) {
                i6 = 32;
            }
            i3 |= i6;
        }
        int i7 = i;
        if ((i2 & 384) == 0) {
            int i8 = 128;
            if (r10.AGs(i)) {
                i8 = 256;
            }
            i3 |= i8;
        }
        Object obj4 = obj2;
        if ((i2 & 3072) == 0) {
            int i9 = 1024;
            if (r10.AGu(obj2)) {
                i9 = C249703kE.FLAG_MOVED;
            }
            i3 |= i9;
        }
        if ((i3 & 1171) != 1170 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1793582144, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:133)");
            }
            ((AnonymousClass6I0) obj3).A6s(r10, obj2, AnonymousClass5PI.A01(r10, new AnonymousClass9M7(i, 0, r7, obj2), 980966366), 48);
            if (0fL.A02()) {
                0fL.A00(-2077600726);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i4, i7, 1, r7, obj3, obj4);
        }
    }
}
