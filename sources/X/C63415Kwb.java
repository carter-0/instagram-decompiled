package X;

/* renamed from: X.Kwb  reason: case insensitive filesystem */
public abstract class C63415Kwb {
    public static final String A00(C66460MSo mSo, Integer num) {
        String str;
        AnonymousClass7TG.A1N(mSo, num);
        String BOI = mSo.BOI();
        switch (num.intValue()) {
            case 0:
                str = "boolean_setting";
                break;
            case 1:
                str = "single_selection_enum_setting";
                break;
            case 2:
                str = "sleep_mode_custom_setting";
                break;
            case 3:
                str = "your_account_header_custom_setting";
                break;
            case 4:
                str = "banner_request_pending";
                break;
            default:
                str = "banner_request_pending_undo_click";
                break;
        }
        return 002.A0T(BOI, str, '_');
    }
}
