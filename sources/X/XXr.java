package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

public abstract class XXr {
    public static final void A00(17Z r3, XMC xmc) {
        0qQ.A0B(xmc, 1);
        r3.A0c();
        String str = xmc.A0E;
        if (str != null) {
            r3.A0R("address", str);
        }
        String str2 = xmc.A0F;
        if (str2 != null) {
            r3.A0R("category", str2);
        }
        String str3 = xmc.A0G;
        if (str3 != null) {
            r3.A0R(ServerW3CShippingAddressConstants.CITY, str3);
        }
        Integer num = xmc.A04;
        if (num != null) {
            r3.A0P("created_at", num.intValue());
        }
        Integer num2 = xmc.A05;
        if (num2 != null) {
            r3.A0P("end_time", num2.intValue());
        }
        Integer num3 = xmc.A06;
        if (num3 != null) {
            r3.A0P("event_category", num3.intValue());
        }
        Long l = xmc.A0A;
        if (l != null) {
            r3.A0Q("external_id", l.longValue());
        }
        String str4 = xmc.A0H;
        if (str4 != null) {
            r3.A0R("external_id_source", str4);
        }
        String str5 = xmc.A0I;
        if (str5 != null) {
            r3.A0R("external_source", str5);
        }
        Long l2 = xmc.A0B;
        if (l2 != null) {
            r3.A0Q("facebook_events_id", l2.longValue());
        }
        Long l3 = xmc.A0C;
        if (l3 != null) {
            r3.A0Q("facebook_places_id", l3.longValue());
        }
        String str6 = xmc.A0J;
        if (str6 != null) {
            r3.A0R("foursquare_v2_id", str6);
        }
        Boolean bool = xmc.A00;
        if (bool != null) {
            r3.A0S("has_viewer_saved", bool.booleanValue());
        }
        Boolean bool2 = xmc.A01;
        if (bool2 != null) {
            r3.A0S("is_eligible_for_guides", bool2.booleanValue());
        }
        Float f = xmc.A02;
        if (f != null) {
            r3.A0O("lat", f.floatValue());
        }
        Float f2 = xmc.A03;
        if (f2 != null) {
            r3.A0O("lng", f2.floatValue());
        }
        Integer num4 = xmc.A07;
        if (num4 != null) {
            r3.A0P("minimum_age", num4.intValue());
        }
        String str7 = xmc.A0K;
        if (str7 != null) {
            r3.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str7);
        }
        Long l4 = xmc.A0D;
        if (l4 != null) {
            r3.A0Q("pk", l4.longValue());
        }
        String str8 = xmc.A0L;
        if (str8 != null) {
            r3.A0R("profile_pic_url", str8);
        }
        String str9 = xmc.A0M;
        if (str9 != null) {
            r3.A0R("short_name", str9);
        }
        Integer num5 = xmc.A08;
        if (num5 != null) {
            r3.A0P(TraceFieldType.StartTime, num5.intValue());
        }
        Integer num6 = xmc.A09;
        if (num6 != null) {
            r3.A0P("time_granularity", num6.intValue());
        }
        String str10 = xmc.A0N;
        if (str10 != null) {
            r3.A0R("timezone", str10);
        }
        r3.A0Z();
    }
}
