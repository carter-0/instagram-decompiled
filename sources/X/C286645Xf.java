package X;

import java.util.Arrays;

/* renamed from: X.5Xf  reason: invalid class name and case insensitive filesystem */
public abstract class C286645Xf {
    public static final C286655Xg A00 = new Object();

    public static final AnonymousClass19S A00(C286575Wy r2, C262094Cc r3) {
        AnonymousClass19G r32;
        AnonymousClass19F r1 = C262204Co.A00;
        if (r3.get(r1) != null) {
            AnonymousClass19G r33 = new AnonymousClass19G((C262204Co) null);
            r33.A0K(new 1Hd(false, new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job")));
            r32 = r33;
        } else {
            C262094Cc A08 = ((C286565Wx) r2).A0U.A08();
            r32 = A08.plus(new AnonymousClass19G((C262204Co) A08.get(r1))).plus(r3);
        }
        return 19E.A02(r32);
    }

    public static final void A01(C286575Wy r3, Object obj, Object obj2, 0sP r6) {
        if (0fL.A02()) {
            0fL.A01(402719942, "androidx.compose.runtime.DisposableEffect (Effects.kt:195)");
        }
        boolean AGu = r3.AGu(obj) | r3.AGu(obj2);
        Object ECw = r3.ECw();
        if (AGu || ECw == AnonymousClass5XT.A00) {
            r3.FLL(new AnonymousClass5Y5(r6));
        }
        if (0fL.A02()) {
            0fL.A00(-235108972);
        }
    }

    public static final void A02(C286575Wy r4, Object obj, Object obj2, 0sL r7) {
        if (0fL.A02()) {
            0fL.A01(-500544843, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        C262094Cc A08 = ((C286565Wx) r4).A0U.A08();
        boolean AGu = r4.AGu(obj) | r4.AGu(obj2);
        Object ECw = r4.ECw();
        if (AGu || ECw == AnonymousClass5XT.A00) {
            r4.FLL(new C286665Xh(A08, r7));
        }
        if (0fL.A02()) {
            0fL.A00(-2110466718);
        }
    }

    public static final void A03(C286575Wy r2, Object obj, 0sP r4) {
        if (0fL.A02()) {
            0fL.A01(-1803692365, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        boolean AGu = r2.AGu(obj);
        Object ECw = r2.ECw();
        if (AGu || ECw == AnonymousClass5XT.A00) {
            r2.FLL(new AnonymousClass5Y5(r4));
        }
        if (0fL.A02()) {
            0fL.A00(1100962876);
        }
    }

    public static final void A04(C286575Wy r3, Object obj, 0sL r5) {
        if (0fL.A02()) {
            0fL.A01(-145785844, "androidx.compose.runtime.LaunchedEffect (Effects.kt:337)");
        }
        C262094Cc A08 = ((C286565Wx) r3).A0U.A08();
        boolean AGu = r3.AGu(obj);
        Object ECw = r3.ECw();
        if (AGu || ECw == AnonymousClass5XT.A00) {
            r3.FLL(new C286665Xh(A08, r5));
        }
        if (0fL.A02()) {
            0fL.A00(933247296);
        }
    }

    public static final void A05(C286575Wy r10, C62320sa r11) {
        if (0fL.A02()) {
            0fL.A01(-1339200586, "androidx.compose.runtime.SideEffect (Effects.kt:48)");
        }
        C286535Wu r102 = ((C286565Wx) r10).A0b.A05.A00;
        C288565c7 r7 = C288565c7.A00;
        r102.A02(r7);
        C286685Xj.A01(r102, r11, 0);
        int i = r102.A03;
        int i2 = r7.A00;
        int i3 = 0;
        if (i2 != 0) {
            i3 = -1 >>> (32 - i2);
        }
        if (i == i3) {
            int i4 = r102.A04;
            int i5 = r7.A01;
            int i6 = 0;
            if (i5 != 0) {
                i6 = -1 >>> (32 - i5);
            }
            if (i4 == i6) {
                if (0fL.A02()) {
                    0fL.A00(1213087865);
                    return;
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            if (((1 << i8) & r102.A03) != 0) {
                if (i7 > 0) {
                    sb.append(", ");
                }
                sb.append(r7.A00(i8));
                i7++;
            }
        }
        String obj = sb.toString();
        0qQ.A07(obj);
        StringBuilder sb2 = new StringBuilder();
        int i9 = r7.A01;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            if (((1 << i11) & r102.A04) != 0) {
                if (i7 > 0) {
                    sb2.append(", ");
                }
                sb2.append(r7.A01(i11));
                i10++;
            }
        }
        String obj2 = sb2.toString();
        0qQ.A07(obj2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Error while pushing ");
        sb3.append(r7);
        sb3.append(". Not all arguments were provided. Missing ");
        sb3.append(i7);
        sb3.append(" int arguments (");
        sb3.append(obj);
        sb3.append(") and ");
        sb3.append(i10);
        sb3.append(" object arguments (");
        sb3.append(obj2);
        sb3.append(").");
        C18086VlG.A01(sb3.toString());
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A06(C286575Wy r5, 0sP r6, Object[] objArr) {
        if (0fL.A02()) {
            0fL.A01(-375584926, "androidx.compose.runtime.DisposableEffect (Effects.kt:276)");
        }
        boolean z = false;
        for (Object AGu : Arrays.copyOf(objArr, objArr.length)) {
            z |= r5.AGu(AGu);
        }
        Object ECw = r5.ECw();
        if (z || ECw == AnonymousClass5XT.A00) {
            r5.FLL(new AnonymousClass5Y5(r6));
        }
        if (0fL.A02()) {
            0fL.A00(255823998);
        }
    }

    public static final void A07(C286575Wy r6, 0sL r7, Object[] objArr) {
        if (0fL.A02()) {
            0fL.A01(1633019375, "androidx.compose.runtime.LaunchedEffect (Effects.kt:410)");
        }
        C262094Cc A08 = ((C286565Wx) r6).A0U.A08();
        boolean z = false;
        for (Object AGu : Arrays.copyOf(objArr, objArr.length)) {
            z |= r6.AGu(AGu);
        }
        Object ECw = r6.ECw();
        if (z || ECw == AnonymousClass5XT.A00) {
            r6.FLL(new C286665Xh(A08, r7));
        }
        if (0fL.A02()) {
            0fL.A00(1377014493);
        }
    }
}
