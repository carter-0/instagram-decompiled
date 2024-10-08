package X;

/* renamed from: X.Rd8  reason: case insensitive filesystem */
public abstract class C9568Rd8 {
    public static Integer A00(String str) {
        if (str.equals("USER_SELECTED")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("FULL_ACCESS")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("UNSPECIFIED")) {
            return AnonymousClass05K.A0C;
        }
        throw AnonymousClass7TE.A0w(str);
    }
}
