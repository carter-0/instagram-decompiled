package X;

/* renamed from: X.Mnz  reason: case insensitive filesystem */
public abstract class C67444Mnz {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "SUGGESTED";
            case 2:
                return "EDIT_RECENT";
            case 3:
                return "FRESH_TOPICS";
            case 4:
                return "TRUSTED_RESOURCES";
            case 5:
                return "MIXED_CONTENT_SERP_RESULTS";
            case 6:
                return "POPULAR";
            case 7:
                return "OTHER";
            case 8:
                return "SUGGESTED_USERS";
            case 9:
                return "META_AI";
            default:
                return "RECENT";
        }
    }
}
