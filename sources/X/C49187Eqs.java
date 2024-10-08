package X;

/* renamed from: X.Eqs  reason: case insensitive filesystem */
public abstract class C49187Eqs {
    public static final String A00(String str, String str2) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("user_list_group_");
        A1A.append(str);
        if (str2 != null && str2.length() > 0) {
            A1A.append("_");
            A1A.append(str2);
        }
        return DbT.A10(A1A);
    }
}
