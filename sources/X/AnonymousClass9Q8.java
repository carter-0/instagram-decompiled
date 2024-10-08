package X;

/* renamed from: X.9Q8  reason: invalid class name */
public abstract class AnonymousClass9Q8 {
    public static final C351988Bf A00(String str) {
        int hashCode;
        if (!(str == null || (hashCode = str.hashCode()) == -1212837439)) {
            if (hashCode != 3415681) {
                if (hashCode == 668488878 && str.equals("permanent")) {
                    return C351988Bf.KEEP_IN_CHAT;
                }
            } else if (str.equals("once")) {
                return C351988Bf.ONE_VIEW;
            }
        }
        return C351988Bf.ALLOW_REPLAY;
    }
}
