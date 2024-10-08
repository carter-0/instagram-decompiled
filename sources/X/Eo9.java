package X;

public abstract class Eo9 {
    public static final Integer A00(String str) {
        0qQ.A0B(str, 0);
        String A0k = AnonymousClass7TF.A0k(str);
        if (A0k.equals("HEADER")) {
            return AnonymousClass05K.A00;
        }
        if (A0k.equals("PARAGRAPH")) {
            return AnonymousClass05K.A01;
        }
        if (A0k.equals("BULLETED_LIST")) {
            return AnonymousClass05K.A0C;
        }
        throw AnonymousClass7TE.A0w(A0k);
    }
}
