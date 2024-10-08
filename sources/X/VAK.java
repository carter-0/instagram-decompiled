package X;

import com.instagram.api.schemas.AdGeoLocationType;

public abstract class VAK {
    public static final AdGeoLocationType A00(AdGeoLocationType adGeoLocationType) {
        int A02 = DbU.A02(adGeoLocationType, 0);
        if (A02 == 2) {
            return AdGeoLocationType.COUNTRY;
        }
        if (A02 == 3) {
            return AdGeoLocationType.REGION;
        }
        if (A02 == 4) {
            return AdGeoLocationType.CITY;
        }
        if (A02 == 5) {
            return AdGeoLocationType.ZIP;
        }
        if (A02 != 14) {
            return AdGeoLocationType.CUSTOM_LOCATION;
        }
        return AdGeoLocationType.NEIGHBORHOOD;
    }
}
