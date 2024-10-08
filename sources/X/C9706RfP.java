package X;

/* renamed from: X.RfP  reason: case insensitive filesystem */
public abstract class C9706RfP {
    public static void A00(Object obj, Object obj2) {
        if (obj == null) {
            throw AnonymousClass7TE.A11("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
        } else if (obj2 == null) {
            throw AnonymousClass7TE.A11(002.A0g("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
