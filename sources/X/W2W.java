package X;

import android.content.Context;
import android.location.Location;
import com.facebook.android.maps.model.LatLng;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.DistanceUnit;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class W2W {
    public static final DistanceUnit A01(Context context) {
        Locale locale = Pxf.A0G(context).getLocales().get(0);
        if (locale == null || !C17149VKb.A01.contains(locale.getCountry())) {
            return DistanceUnit.KILOMETER;
        }
        return DistanceUnit.MILE;
    }

    public static final boolean A04(List list) {
        return list != null && !list.isEmpty() && list.size() == 1 && ((AudienceGeoLocation) list.get(0)).A03 == AdGeoLocationType.CUSTOM_LOCATION;
    }

    public static final LatLng A00(UserSession userSession) {
        Location lastLocation;
        1Wr r1 = 1Wr.A00;
        if (r1 == null || (lastLocation = r1.getLastLocation(userSession, "PromoteLocationUtil")) == null) {
            return new LatLng(0.0d, 0.0d);
        }
        return new LatLng(lastLocation.getLatitude(), lastLocation.getLongitude());
    }

    public static final String A02(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((AudienceGeoLocation) it.next()).A05;
            if (str != null) {
                arrayList.add(str);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        String A00 = C9873Rim.A00(context, arrayList, Pxf.A0G(context).locale);
        0qQ.A07(A00);
        return A00;
    }

    public static final boolean A03(AudienceGeoLocation audienceGeoLocation, List list) {
        String str;
        String str2;
        boolean A1Z = AnonymousClass7TG.A1Z(audienceGeoLocation, list);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AudienceGeoLocation audienceGeoLocation2 = (AudienceGeoLocation) it.next();
                W2W w2w = C17149VKb.A00;
                AudienceGeoLocation audienceGeoLocation3 = audienceGeoLocation;
                AudienceGeoLocation audienceGeoLocation4 = audienceGeoLocation2;
                0qQ.A0B(audienceGeoLocation2, A1Z ? 1 : 0);
                if (audienceGeoLocation.equals(audienceGeoLocation2)) {
                    return true;
                }
                AdGeoLocationType adGeoLocationType = audienceGeoLocation.A03;
                if (adGeoLocationType != null) {
                    AdGeoLocationType adGeoLocationType2 = audienceGeoLocation2.A03;
                    if (adGeoLocationType2 != null) {
                        if (adGeoLocationType.compareTo(adGeoLocationType2) >= 0) {
                            audienceGeoLocation4 = audienceGeoLocation;
                            audienceGeoLocation3 = audienceGeoLocation2;
                        }
                        AdGeoLocationType adGeoLocationType3 = audienceGeoLocation3.A03;
                        if (adGeoLocationType3 != null) {
                            int ordinal = adGeoLocationType3.ordinal();
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal == 4 && audienceGeoLocation4.A03 != AdGeoLocationType.CITY) {
                                        if (0qQ.A0K(audienceGeoLocation3.A06, audienceGeoLocation4.A07)) {
                                            return true;
                                        }
                                        str = audienceGeoLocation3.A07;
                                        str2 = audienceGeoLocation4.A07;
                                    }
                                } else if (audienceGeoLocation4.A03 == AdGeoLocationType.REGION) {
                                    continue;
                                } else if (0qQ.A0K(audienceGeoLocation3.A06, audienceGeoLocation4.A08)) {
                                    return true;
                                } else {
                                    str = audienceGeoLocation3.A08;
                                    str2 = audienceGeoLocation4.A08;
                                }
                            } else if (audienceGeoLocation4.A03 == AdGeoLocationType.COUNTRY) {
                                continue;
                            } else if (0qQ.A0K(audienceGeoLocation3.A06, audienceGeoLocation4.A04)) {
                                return true;
                            } else {
                                str = audienceGeoLocation3.A04;
                                str2 = audienceGeoLocation4.A04;
                            }
                            if (0qQ.A0K(str, str2)) {
                                return true;
                            }
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        return false;
    }
}
