package X;

public abstract class GEB {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "flash_media";
            case 1:
                return "head_media";
            case 2:
                return "source_media";
            case 3:
                return "source_grid";
            case 4:
                return "cached_items_request";
            default:
                return "network_request";
        }
    }
}
