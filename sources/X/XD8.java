package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.model.venue.LocationDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class XD8 {
    public static Map A00(LocationDictIntf locationDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (locationDictIntf.getAddress() != null) {
            A1H.put("address", locationDictIntf.getAddress());
        }
        if (locationDictIntf.getCategory() != null) {
            A1H.put("category", locationDictIntf.getCategory());
        }
        if (locationDictIntf.getCity() != null) {
            A1H.put(ServerW3CShippingAddressConstants.CITY, locationDictIntf.getCity());
        }
        if (locationDictIntf.AsB() != null) {
            A1H.put("created_at", locationDictIntf.AsB());
        }
        if (locationDictIntf.B1c() != null) {
            A1H.put("end_time", locationDictIntf.B1c());
        }
        if (locationDictIntf.B2G() != null) {
            A1H.put("event_category", locationDictIntf.B2G());
        }
        if (locationDictIntf.B39() != null) {
            A1H.put("external_id", locationDictIntf.B39());
        }
        if (locationDictIntf.B3A() != null) {
            A1H.put("external_id_source", locationDictIntf.B3A());
        }
        if (locationDictIntf.getExternalSource() != null) {
            A1H.put("external_source", locationDictIntf.getExternalSource());
        }
        if (locationDictIntf.B3X() != null) {
            A1H.put("facebook_events_id", locationDictIntf.B3X());
        }
        if (locationDictIntf.B3Y() != null) {
            A1H.put("facebook_places_id", locationDictIntf.B3Y());
        }
        if (locationDictIntf.B7n() != null) {
            A1H.put("foursquare_v2_id", locationDictIntf.B7n());
        }
        if (locationDictIntf.BCR() != null) {
            A1H.put("has_viewer_saved", locationDictIntf.BCR());
        }
        if (locationDictIntf.CRz() != null) {
            A1H.put("is_eligible_for_guides", locationDictIntf.CRz());
        }
        if (locationDictIntf.BLV() != null) {
            A1H.put("lat", 012.A0p(String.valueOf(locationDictIntf.BLV())));
        }
        if (locationDictIntf.BNV() != null) {
            A1H.put("lng", 012.A0p(String.valueOf(locationDictIntf.BNV())));
        }
        if (locationDictIntf.BTM() != null) {
            A1H.put("minimum_age", locationDictIntf.BTM());
        }
        if (locationDictIntf.getName() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, locationDictIntf.getName());
        }
        if (locationDictIntf.Bcn() != null) {
            A1H.put("pk", locationDictIntf.Bcn());
        }
        if (locationDictIntf.getProfilePicUrl() != null) {
            A1H.put("profile_pic_url", locationDictIntf.getProfilePicUrl());
        }
        if (locationDictIntf.getShortName() != null) {
            A1H.put("short_name", locationDictIntf.getShortName());
        }
        if (locationDictIntf.Bym() != null) {
            A1H.put(TraceFieldType.StartTime, locationDictIntf.Bym());
        }
        if (locationDictIntf.C7L() != null) {
            A1H.put("time_granularity", locationDictIntf.C7L());
        }
        if (locationDictIntf.C7d() != null) {
            A1H.put("timezone", locationDictIntf.C7d());
        }
        return 0Yt.A0B(A1H);
    }
}
