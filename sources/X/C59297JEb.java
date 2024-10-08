package X;

/* renamed from: X.JEb  reason: case insensitive filesystem */
public final class C59297JEb extends 0Yg implements 0sL {
    public static final C59297JEb A00 = new C59297JEb();

    public C59297JEb() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        HM1 hm1;
        C286015Tp r0;
        AnonymousClass6HK r8 = (AnonymousClass6HK) obj;
        C3022062b r9 = (C3022062b) obj2;
        boolean A1U = AnonymousClass7TF.A1U(0, r8, r9);
        Object obj3 = r9.A02;
        if (obj3 instanceof AnonymousClass5ZC) {
            hm1 = HM1.Paragraph;
        } else if (obj3 instanceof AnonymousClass5ZB) {
            hm1 = HM1.Span;
        } else if (obj3 instanceof C52947Gfy) {
            hm1 = HM1.VerbatimTts;
        } else if (obj3 instanceof C56050Hrz) {
            hm1 = HM1.Url;
        } else {
            hm1 = HM1.String;
        }
        int ordinal = hm1.ordinal();
        if (ordinal == 0) {
            0qQ.A0C(obj3, C273654mx.A00(3071));
            r0 = C56494HzQ.A06;
        } else if (ordinal == A1U) {
            0qQ.A0C(obj3, C273654mx.A00(3072));
            r0 = C56494HzQ.A08;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                0qQ.A0C(obj3, C273654mx.A00(3073));
                r0 = C56494HzQ.A0C;
            }
            return 0sr.A1L(new Object[]{hm1, obj3, Integer.valueOf(r9.A01), Integer.valueOf(r9.A00), r9.A03});
        } else {
            0qQ.A0C(obj3, C273654mx.A00(3074));
            r0 = C56494HzQ.A0D;
        }
        obj3 = C56494HzQ.A00(r0, r8, obj3);
        return 0sr.A1L(new Object[]{hm1, obj3, Integer.valueOf(r9.A01), Integer.valueOf(r9.A00), r9.A03});
    }
}
