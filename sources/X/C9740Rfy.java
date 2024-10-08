package X;

/* renamed from: X.Rfy  reason: case insensitive filesystem */
public abstract class C9740Rfy {
    public static boolean A00(AnonymousClass3W6 r6, Object obj) {
        if (obj != r6) {
            if (obj instanceof AnonymousClass3W6) {
                AnonymousClass3W6 r7 = (AnonymousClass3W6) obj;
                if (r6.size() == r7.size() && r6.entrySet().size() == r7.entrySet().size()) {
                    for (S79 s79 : r7.entrySet()) {
                        if (r6.AKq(s79.A01()) != s79.A00()) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
