package X;

/* renamed from: X.NxZ  reason: case insensitive filesystem */
public abstract class C70119NxZ {
    public static final Integer A00(String str) {
        int i;
        int hashCode = str.hashCode();
        if (hashCode != -1212837439) {
            if (hashCode != 3415681) {
                if (hashCode != 668488878 || !str.equals("permanent")) {
                    return null;
                }
                i = 2;
            } else if (!str.equals("once")) {
                return null;
            } else {
                i = 0;
            }
        } else if (!str.equals("replayable")) {
            return null;
        } else {
            i = 1;
        }
        return Integer.valueOf(i);
    }
}
