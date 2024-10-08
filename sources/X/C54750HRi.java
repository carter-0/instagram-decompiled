package X;

/* renamed from: X.HRi  reason: case insensitive filesystem */
public abstract class C54750HRi {
    public static final C56535I0i A00(C286575Wy r8) {
        boolean z = true;
        if (0fL.A02()) {
            0fL.A01(218784619, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:45)");
        }
        C286305Uu r5 = (C286305Uu) r8.AJO(AnonymousClass5YA.A03);
        C268024cd A0Y = C51968G9o.A0Y(r8);
        AnonymousClass5Q8 r3 = (AnonymousClass5Q8) C51966G9m.A15(r8);
        boolean A1X = C51972G9s.A1X(r8, A0Y, r3, r8.AGu(r5));
        if (!r8.AGs(8)) {
            z = false;
        }
        boolean z2 = A1X | z;
        Object ECw = r8.ECw();
        if (z2 || ECw == AnonymousClass5XT.A00) {
            ECw = new C56535I0i(r5, A0Y, r3);
            r8.FLL(ECw);
        }
        C56535I0i i0i = (C56535I0i) ECw;
        if (0fL.A02()) {
            0fL.A00(2033026127);
        }
        return i0i;
    }
}
