package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.model.venue.LocationDict;
import java.io.IOException;

/* renamed from: X.41Q  reason: invalid class name */
public abstract class AnonymousClass41Q {
    public static LocationDict parseFromJson(16F r27) {
        16F r2 = r27;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Long l = null;
            String str8 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Float f = null;
            Float f2 = null;
            Integer num4 = null;
            String str9 = null;
            Long l2 = null;
            String str10 = null;
            String str11 = null;
            Integer num5 = null;
            Integer num6 = null;
            String str12 = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("address".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r2.A1P();
                    }
                } else if ("category".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r2.A1P();
                    }
                } else if (ServerW3CShippingAddressConstants.CITY.equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r2.A1P();
                    }
                } else if ("created_at".equals(A0q)) {
                    num = Integer.valueOf(r2.A1D());
                } else if ("end_time".equals(A0q)) {
                    num2 = Integer.valueOf(r2.A1D());
                } else if ("event_category".equals(A0q)) {
                    num3 = Integer.valueOf(r2.A1D());
                } else if ("external_id".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r2.A1P();
                    }
                } else if ("external_id_source".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r2.A1P();
                    }
                } else if ("external_source".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r2.A1P();
                    }
                } else if ("facebook_events_id".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r2.A1P();
                    }
                } else if ("facebook_places_id".equals(A0q)) {
                    l = Long.valueOf(r2.A0y());
                } else if ("foursquare_v2_id".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r2.A1P();
                    }
                } else if ("has_viewer_saved".equals(A0q)) {
                    bool = Boolean.valueOf(r2.A0d());
                } else if ("is_eligible_for_guides".equals(A0q)) {
                    bool2 = Boolean.valueOf(r2.A0d());
                } else if ("lat".equals(A0q)) {
                    f = new Float(r2.A0U());
                } else if ("lng".equals(A0q)) {
                    f2 = new Float(r2.A0U());
                } else if ("minimum_age".equals(A0q)) {
                    num4 = Integer.valueOf(r2.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str9 = null;
                    } else {
                        str9 = r2.A1P();
                    }
                } else if ("pk".equals(A0q)) {
                    l2 = Long.valueOf(r2.A0y());
                } else if ("profile_pic_url".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str10 = null;
                    } else {
                        str10 = r2.A1P();
                    }
                } else if ("short_name".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str11 = null;
                    } else {
                        str11 = r2.A1P();
                    }
                } else if (TraceFieldType.StartTime.equals(A0q)) {
                    num5 = Integer.valueOf(r2.A1D());
                } else if ("time_granularity".equals(A0q)) {
                    num6 = Integer.valueOf(r2.A1D());
                } else if ("timezone".equals(A0q)) {
                    if (r2.A11() == 16L.A0G) {
                        str12 = null;
                    } else {
                        str12 = r2.A1P();
                    }
                }
                r2.A0z();
            }
            return new LocationDict(bool, bool2, f, f2, num, num2, num3, num4, num5, num6, l, l2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, LocationDict locationDict) {
        r3.A0c();
        String str = locationDict.A0C;
        if (str != null) {
            r3.A0R("address", str);
        }
        String str2 = locationDict.A0D;
        if (str2 != null) {
            r3.A0R("category", str2);
        }
        String str3 = locationDict.A0E;
        if (str3 != null) {
            r3.A0R(ServerW3CShippingAddressConstants.CITY, str3);
        }
        Integer num = locationDict.A04;
        if (num != null) {
            r3.A0P("created_at", num.intValue());
        }
        Integer num2 = locationDict.A05;
        if (num2 != null) {
            r3.A0P("end_time", num2.intValue());
        }
        Integer num3 = locationDict.A06;
        if (num3 != null) {
            r3.A0P("event_category", num3.intValue());
        }
        String str4 = locationDict.A0F;
        if (str4 != null) {
            r3.A0R("external_id", str4);
        }
        String str5 = locationDict.A0G;
        if (str5 != null) {
            r3.A0R("external_id_source", str5);
        }
        String str6 = locationDict.A0H;
        if (str6 != null) {
            r3.A0R("external_source", str6);
        }
        String str7 = locationDict.A0I;
        if (str7 != null) {
            r3.A0R("facebook_events_id", str7);
        }
        Long l = locationDict.A0A;
        if (l != null) {
            r3.A0Q("facebook_places_id", l.longValue());
        }
        String str8 = locationDict.A0J;
        if (str8 != null) {
            r3.A0R("foursquare_v2_id", str8);
        }
        Boolean bool = locationDict.A00;
        if (bool != null) {
            r3.A0S("has_viewer_saved", bool.booleanValue());
        }
        Boolean bool2 = locationDict.A01;
        if (bool2 != null) {
            r3.A0S("is_eligible_for_guides", bool2.booleanValue());
        }
        Float f = locationDict.A02;
        if (f != null) {
            r3.A0O("lat", f.floatValue());
        }
        Float f2 = locationDict.A03;
        if (f2 != null) {
            r3.A0O("lng", f2.floatValue());
        }
        Integer num4 = locationDict.A07;
        if (num4 != null) {
            r3.A0P("minimum_age", num4.intValue());
        }
        String str9 = locationDict.A0K;
        if (str9 != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str9);
        }
        Long l2 = locationDict.A0B;
        if (l2 != null) {
            r3.A0Q("pk", l2.longValue());
        }
        String str10 = locationDict.A0L;
        if (str10 != null) {
            r3.A0R("profile_pic_url", str10);
        }
        String str11 = locationDict.A0M;
        if (str11 != null) {
            r3.A0R("short_name", str11);
        }
        Integer num5 = locationDict.A08;
        if (num5 != null) {
            r3.A0P(TraceFieldType.StartTime, num5.intValue());
        }
        Integer num6 = locationDict.A09;
        if (num6 != null) {
            r3.A0P("time_granularity", num6.intValue());
        }
        String str12 = locationDict.A0N;
        if (str12 != null) {
            r3.A0R("timezone", str12);
        }
        r3.A0Z();
    }
}
