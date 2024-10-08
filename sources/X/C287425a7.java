package X;

/* renamed from: X.5a7  reason: invalid class name and case insensitive filesystem */
public abstract class C287425a7 {
    public static final AnonymousClass5Q1 A01(C286575Wy r12) {
        AnonymousClass6IG r1;
        C286575Wy r8 = r12;
        if (0fL.A02()) {
            0fL.A01(1552493093, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:484)");
        }
        C286565Wx r82 = (C286565Wx) r8;
        C286565Wx.A0K(r82, AnonymousClass5XN.A04, (Object) null, 206, 0);
        C286555Ww r9 = null;
        if (r82.A0K) {
            AnonymousClass5X4 r7 = r82.A0D;
            int i = r7.A08;
            int A00 = AnonymousClass5X4.A00(r7, i);
            int[] iArr = r7.A0I;
            int i2 = (A00 * 5) + 1;
            int i3 = iArr[i2];
            if ((i3 & 134217728) == 0) {
                int i4 = i3 | 134217728;
                iArr[i2] = i4;
                if ((i4 & 67108864) == 0) {
                    AnonymousClass5X4.A08(r7, AnonymousClass5X4.A02(r7, iArr, i));
                }
            }
        }
        Object A0P = r82.A0P();
        if (!(A0P instanceof AnonymousClass6IG) || (r1 = (AnonymousClass6IG) A0P) == null) {
            int i5 = r82.A02;
            boolean z = r82.A0J;
            boolean z2 = r82.A0P;
            AnonymousClass5Wn r0 = (AnonymousClass5Wn) r82.A0V;
            if (r0 != null) {
                r9 = r0.A07;
            }
            r1 = new AnonymousClass6IG(new AnonymousClass5Q1(r82, r9, i5, z, z2));
            r82.A0Q(r1);
        }
        AnonymousClass5Q1 r2 = r1.A00;
        r2.A02.Epw(C286565Wx.A04(r82));
        C286565Wx.A0L(r82, false);
        if (0fL.A02()) {
            0fL.A00(-1173500548);
        }
        return r2;
    }

    public static final int A00(C286575Wy r2) {
        if (0fL.A02()) {
            0fL.A01(-1973211340, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:228)");
        }
        int i = ((C286565Wx) r2).A02;
        if (0fL.A02()) {
            0fL.A00(621651807);
        }
        return i;
    }
}
