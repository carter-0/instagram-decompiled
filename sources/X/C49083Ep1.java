package X;

/* renamed from: X.Ep1  reason: case insensitive filesystem */
public abstract class C49083Ep1 {
    public static Integer A00(String str) {
        if (str.equals("VIEW")) {
            return AnonymousClass05K.A00;
        }
        if (str.equals("PRIMARY")) {
            return AnonymousClass05K.A01;
        }
        if (str.equals("SECONDARY")) {
            return AnonymousClass05K.A0C;
        }
        if (str.equals("DISMISS")) {
            return AnonymousClass05K.A0N;
        }
        throw AnonymousClass7TE.A0w(str);
    }
}
