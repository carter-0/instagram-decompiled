package X;

/* renamed from: X.O1i  reason: case insensitive filesystem */
public abstract class C70304O1i {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "scroll";
            case 1:
                return "scroll_tray";
            case 2:
                return "load_other_reel";
            case 3:
                return "pause";
            case 4:
                return "unknown";
            case 5:
                return "viewer_load_other_reel";
            case 6:
                return "viewer_pause";
            default:
                return "highlights_in_grid_new_item_selection";
        }
    }
}
