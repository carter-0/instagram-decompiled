package X;

/* renamed from: X.Enk  reason: case insensitive filesystem */
public abstract class C49008Enk {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "TRACK";
            case 2:
                return "MOOD";
            case 3:
                return "GENRE";
            case 4:
                return "PLAYLIST_SPOTLIGHT";
            case 5:
                return "PLAYLIST_PREVIEW";
            case 6:
                return "PLAYLIST";
            case 7:
                return "CATEGORY_PREVIEW";
            case 8:
                return "ARTIST";
            case 9:
                return "COLLECTION";
            default:
                return "UNKNOWN";
        }
    }
}
