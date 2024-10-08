package X;

/* renamed from: X.52G  reason: invalid class name */
public abstract class AnonymousClass52G {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "end_of_favorites_demarcator";
            case 1:
                return "end_of_feed_demarcator";
            case 2:
                return "no_favorites_demarcator";
            case 3:
                return "end_of_feed_merged_demarcator";
            default:
                return "suggested_posts_header";
        }
    }
}
