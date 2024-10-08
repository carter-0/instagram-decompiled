package X;

public final class TX0 extends 0Yg implements 0sP {
    public static final TX0 A00 = new TX0();

    public TX0() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String valueOf;
        String str = (String) obj;
        0qQ.A0B(str, 0);
        String lowerCase = str.toLowerCase(Pxh.A0w());
        if (C66580MXl.A06(lowerCase) <= 0) {
            return lowerCase;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        char charAt = lowerCase.charAt(0);
        if (Character.isLowerCase(charAt)) {
            valueOf = 11R.A00(Pxh.A0w(), charAt);
        } else {
            valueOf = String.valueOf(charAt);
        }
        A1A.append(valueOf);
        return AnonymousClass7TF.A0l(C66580MXl.A0z(lowerCase, 1), A1A);
    }
}
