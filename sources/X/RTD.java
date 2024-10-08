package X;

public abstract class RTD {
    public static final String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return "media_type = 1";
        }
        if (intValue == 1) {
            return "media_type = 3";
        }
        if (intValue == 2) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append('(');
            A1A.append(A00(AnonymousClass05K.A00));
            A1A.append(" OR ");
            return C51975G9x.A0i(A00(AnonymousClass05K.A01), A1A);
        }
        throw AnonymousClass7TE.A1K();
    }
}
