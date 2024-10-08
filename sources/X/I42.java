package X;

public abstract class I42 {
    public static final C74589Pxc A00 = new C52395GQu(0.5f, 1.75f);
    public static final C74589Pxc A01 = new C52395GQu(-5.0f, 5.0f);
    public static final C74589Pxc A02 = new C52395GQu(-5.0f, 5.0f);
    public static final AnonymousClass2Ha A03 = new C58025IkI(C51965G9l.A0T(3.0f), C51965G9l.A0T(6.0f));
    public static final AnonymousClass2Ha A04 = new C58025IkI(C51965G9l.A0T(3.0f), C51965G9l.A0T(-3.0f));

    public static final float A00(C74589Pxc pxc) {
        float A042 = AnonymousClass7TE.A04(pxc.Byc());
        float A043 = AnonymousClass7TE.A04(pxc.B1S());
        float A022 = 2SP.A01.A02();
        return ((1.0f - A022) * A042) + (A022 * A043);
    }

    public static final float A01(AnonymousClass2Ha r3, float f) {
        return ((1.0f - f) * ((C289095d0) r3.Byc()).A00) + (f * ((C289095d0) r3.B1S()).A00);
    }
}
