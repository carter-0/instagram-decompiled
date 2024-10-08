package X;

/* renamed from: X.Es2  reason: case insensitive filesystem */
public abstract class C49259Es2 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "IMAGE";
            case 2:
                return "FLASH_IMAGE";
            case 3:
                return "VIDEO";
            case 4:
                return "UPLOADED_IMAGE";
            case 5:
                return "FLASH_RECAP_VIDEO";
            default:
                return "UNKNOWN";
        }
    }
}
