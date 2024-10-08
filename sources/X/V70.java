package X;

import com.instagram.api.schemas.AdsAPIInstagramPosition;

public abstract class V70 {
    public static final AdsAPIInstagramPosition A00(String str) {
        AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) AdsAPIInstagramPosition.A01.get(str);
        if (adsAPIInstagramPosition == null) {
            return AdsAPIInstagramPosition.UNRECOGNIZED;
        }
        return adsAPIInstagramPosition;
    }
}
