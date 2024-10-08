package X;

/* renamed from: X.HeW  reason: case insensitive filesystem */
public abstract class C55241HeW {
    public static final C59502JMa A00(Boolean bool, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (!z2) {
            return C57603IdU.A00;
        }
        boolean A1Y = AnonymousClass7TF.A1Y(bool, true);
        String str4 = str3;
        if (str == null) {
            if (A1Y) {
                return new HJL();
            }
            if (str3 != null) {
                return new C57601IdS((Integer) null, AnonymousClass05K.A00, str4, 2131953840, 2131953839);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (z) {
            if (A1Y) {
                if (z3) {
                    return new HJN();
                }
                return new HJO();
            } else if (z3) {
                if (str3 != null) {
                    return new C57601IdS(2131953862, AnonymousClass05K.A0C, str4, 2131953863, 2131953859);
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (str3 != null) {
                return new C57601IdS((Integer) null, AnonymousClass05K.A0N, str4, 2131953863, 2131953868);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (A1Y) {
            return new HJM();
        } else {
            String str5 = str2;
            if (str2 == null) {
                return new HJP();
            }
            return new C57601IdS((Integer) null, AnonymousClass05K.A01, str5, 2131953843, 2131953841);
        }
    }
}
