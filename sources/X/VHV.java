package X;

public abstract class VHV {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass05K.A00(3)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "BUSINESS_MANAGER";
                    break;
                case 2:
                    str2 = "SHARED_WITH_BUSINESS";
                    break;
                default:
                    str2 = "FACEBOOK_PAGE";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        0wb.A03("CatalogSource", 002.A0R("Unexpected review status: ", str));
        return AnonymousClass05K.A00;
    }
}
