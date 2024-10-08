package X;

/* renamed from: X.NuH  reason: case insensitive filesystem */
public abstract class C69915NuH {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "direct_v2/icebreakers/create/";
            case 1:
                return "direct_v2/icebreakers/update/%s/";
            default:
                return "direct_v2/icebreakers/delete/%s/";
        }
    }
}
