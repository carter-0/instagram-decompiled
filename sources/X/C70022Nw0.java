package X;

/* renamed from: X.Nw0  reason: case insensitive filesystem */
public abstract class C70022Nw0 {
    public static final String A00(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 112) {
            if (hashCode != 3714) {
                if (hashCode != 3496474 || !str.equals("reel")) {
                    return null;
                }
                return "clips";
            } else if (!str.equals("tv")) {
                return null;
            } else {
                return "tv";
            }
        } else if (str.equals("p")) {
            return "media";
        } else {
            return null;
        }
    }
}
