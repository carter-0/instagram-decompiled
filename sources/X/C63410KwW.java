package X;

/* renamed from: X.KwW  reason: case insensitive filesystem */
public abstract class C63410KwW {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "IMAGE";
                break;
            case 2:
                str = "SUBTITLE";
                break;
            case 3:
                str = "END_SCENE_ICON";
                break;
            case 4:
                str = "END_SCENE_TITLE";
                break;
            case 5:
                str = "SPONSORED_LABEL";
                break;
            case 6:
                str = "SOCIAL_CONTEXT_FOLLOWED_BY";
                break;
            case 7:
                str = "HEADER_POPULARITY_PROOF";
                break;
            default:
                str = "TITLE";
                break;
        }
        return C51966G9m.A04(str, intValue);
    }
}
