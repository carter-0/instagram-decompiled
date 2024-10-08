package X;

/* renamed from: X.KqS  reason: case insensitive filesystem */
public abstract class C63037KqS {
    public static final String A00(Integer num) {
        String str;
        switch (num.intValue()) {
            case 0:
                str = "QUERY_GIFTS_TRIGGER_REPOSITORY";
                break;
            case 1:
                str = "QUERY_GIFTS_LOAD_GIFT_IMAGE";
                break;
            default:
                str = "UPDATE_BALANCE_TRIGGER_REPOSITORY";
                break;
        }
        return 002.A0R(AnonymousClass7TF.A0j(str), "_end");
    }
}
