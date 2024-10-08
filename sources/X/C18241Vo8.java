package X;

/* renamed from: X.Vo8  reason: case insensitive filesystem */
public abstract class C18241Vo8 {
    public static final C16522UwR A00(String str) {
        0qQ.A0B(str, 0);
        C16522UwR uwR = (C16522UwR) C16522UwR.A00.get(str);
        if (uwR != null) {
            return uwR;
        }
        throw Pxg.A0c("Provided TemplateId ", str, " not supported");
    }

    public static final String A01(C16522UwR uwR) {
        switch (uwR.ordinal()) {
            case 0:
                return "intro";
            case 1:
                return "supportive_superstar";
            case 2:
                return "most_tagged";
            case 3:
                return "longest_follower";
            case 4:
                return "most_liked_post";
            case 5:
                return "top_creator";
            case 6:
                return "end";
            default:
                throw new RuntimeException();
        }
    }
}
