package X;

import java.util.List;

/* renamed from: X.Oap  reason: case insensitive filesystem */
public final class C71070Oap {
    public static final C69496Nme A01(Integer num) {
        if (num == null) {
            return null;
        }
        switch (num.intValue()) {
            case 1:
                return C69496Nme.LIKED;
            case 2:
                return C69496Nme.SAVED;
            case 3:
                return C69496Nme.SUGGESTED;
            case 4:
                return C69496Nme.IGTV;
            case 5:
                return C69496Nme.FACEBOOK_WATCH;
            case 6:
                return C69496Nme.REELS;
            case 7:
                return C69496Nme.SUGGESTED_REELS_SUBPAGE;
            case 8:
                return C69496Nme.SUGGESTED_REELS_CAROUSEL;
            default:
                return null;
        }
    }

    public static final String A02(C74438Put put, Integer num) {
        if ((put instanceof N54) && num != null) {
            int intValue = num.intValue();
            List list = ((N54) put).A08;
            if (list != null && intValue < list.size() && intValue >= 0) {
                return ((N54) list.get(intValue)).A05;
            }
        }
        return put.Aqe();
    }

    public final C69485NmT A03(C74438Put put, Integer num) {
        if (!(put instanceof N54)) {
            return null;
        }
        N54 n54 = (N54) put;
        if (n54.A04 == AnonymousClass05K.A01) {
            return C69485NmT.REELS;
        }
        int intValue = n54.A03.intValue();
        if (intValue == 0) {
            return C69485NmT.PHOTO;
        }
        if (intValue == 1) {
            return C69485NmT.VIDEO;
        }
        if (intValue == 2) {
            return C69485NmT.IGTV;
        }
        if (intValue != 3) {
            return null;
        }
        if (num != null) {
            int intValue2 = num.intValue();
            List list = n54.A08;
            if (list != null && intValue2 < list.size() && intValue2 >= 0) {
                int intValue3 = ((N54) list.get(intValue2)).A03.intValue();
                if (intValue3 == 0) {
                    return C69485NmT.CAROUSEL_PHOTO;
                }
                if (intValue3 == 1) {
                    return C69485NmT.CAROUSEL_VIDEO;
                }
                return null;
            }
        }
        return C69485NmT.CAROUSEL;
    }

    public static final C69449Nlt A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 1 || intValue == 3) {
            return C69449Nlt.INSTAGRAM;
        }
        if (intValue != 2) {
            return null;
        }
        return C69449Nlt.FACEBOOK;
    }
}
