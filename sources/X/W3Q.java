package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.mediamap.model.MediaMapPinPreview;
import com.instagram.model.venue.LocationDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public final class W3Q {
    public boolean A00;
    public final AnonymousClass0iw A01;
    public final 0wc A02;
    public final UserSession A03;
    public final MapEntryPoint A04;
    public final String A05;
    public final HashSet A06 = new HashSet();

    public static 1Ln A01(W3Q w3q, String str) {
        return A02(w3q, str, w3q.A01.getModuleName());
    }

    public static 1Ln A02(W3Q w3q, String str, String str2) {
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(w3q.A02, "ig_discovery_map"), 214);
        r2.A0k(str);
        r2.A0R("container_module", str2);
        r2.A0R("map_session_id", w3q.A05);
        return r2;
    }

    public static void A04(0Ak r2, W3Q w3q) {
        r2.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, w3q.A04.A00);
    }

    public static void A05(1Ln r3, MediaMapPin mediaMapPin) {
        if (mediaMapPin != null) {
            C18231Vnv.A00(mediaMapPin.A09);
            String A012 = C18231Vnv.A01(mediaMapPin);
            if (A012 != null) {
                r3.A0R("location_id", A012);
                0bb r2 = new 0bb();
                r2.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A03(r2, mediaMapPin));
                r3.A0N(r2, "location_info");
            }
        }
    }

    public static void A06(1Ln r3, MediaMapPin mediaMapPin, boolean z) {
        String str = mediaMapPin.A0D;
        if (str != null) {
            r3.A0R("media_id", str);
        }
        if (z) {
            ArrayList arrayList = mediaMapPin.A0E;
            if (arrayList == null) {
                arrayList = new ArrayList();
                mediaMapPin.A0E = arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((MediaMapPinPreview) it.next()).A01);
            }
            r3.A0S("additional_media_ids", arrayList2);
        }
    }

    public static void A07(1Ln r6, Collection collection) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            MediaMapPin mediaMapPin = (MediaMapPin) it.next();
            if (mediaMapPin != null) {
                C18231Vnv.A00(mediaMapPin.A09);
                String A012 = C18231Vnv.A01(mediaMapPin);
                if (A012 != null) {
                    arrayList2.add(A012);
                    0bb r2 = new 0bb();
                    r2.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A03(r2, mediaMapPin));
                    arrayList.add(r2);
                }
            }
        }
        if (!arrayList2.isEmpty() && !arrayList.isEmpty()) {
            r6.A0S("location_ids", arrayList2);
            r6.A0S("location_infos", arrayList);
        }
    }

    public final void A08(MediaMapQuery mediaMapQuery, MediaMapPin mediaMapPin, Integer num, String str, long j) {
        String str2;
        String str3;
        LocationPageInformation locationPageInformation;
        User A002;
        1Ln A022 = A02(this, "instagram_map_tap_location_page", str);
        C13990Tnq.A12(A022, mediaMapQuery);
        if (mediaMapPin != null) {
            C18231Vnv.A00(mediaMapPin.A09);
            str2 = C18231Vnv.A01(mediaMapPin);
        } else {
            str2 = null;
        }
        A022.A0R("location_id", str2);
        if (mediaMapPin == null || (locationPageInformation = mediaMapPin.A06) == null || (A002 = locationPageInformation.A00()) == null) {
            str3 = null;
        } else {
            str3 = A002.getId();
        }
        A022.A0R("location_account_owner_id", str3);
        A04(A022, this);
        A022.A0Q("result_position", Long.valueOf(j));
        A05(A022, mediaMapPin);
        A06(A022, mediaMapPin, AnonymousClass7TF.A1W(num, AnonymousClass05K.A01));
        A022.Cgf();
    }

    public final void A09(MediaMapQuery mediaMapQuery, MediaMapPin mediaMapPin, String str, boolean z) {
        1Ln A022 = A02(this, "instagram_map_tap_location_story", str);
        C13990Tnq.A12(A022, mediaMapQuery);
        A04(A022, this);
        if (mediaMapPin != null) {
            A06(A022, mediaMapPin, z);
            A022.A0R("location_id", C18231Vnv.A01(mediaMapPin));
        }
        A022.Cgf();
    }

    public final void A0A(MediaMapQuery mediaMapQuery, C17523VZc vZc, Collection collection) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        long j = 0;
        while (it.hasNext()) {
            MediaMapPin mediaMapPin = (MediaMapPin) it.next();
            arrayList.add(mediaMapPin);
            if (mediaMapPin.A08 != null) {
                j++;
            }
        }
        if (!this.A00) {
            str = "instagram_map_load_location_pins";
        } else {
            str = "instagram_map_reload_location_pins";
        }
        1Ln A012 = A01(this, str);
        if (vZc != null) {
            0bb r4 = new 0bb();
            LatLng latLng = vZc.A01;
            r4.A04("left_lng", Double.valueOf(latLng.A01));
            r4.A04("top_lat", Double.valueOf(latLng.A00));
            LatLng latLng2 = vZc.A04;
            r4.A04("right_lng", Double.valueOf(latLng2.A01));
            r4.A04("bot_lat", Double.valueOf(latLng2.A00));
            A012.A0N(r4, "bounding_box_2");
        }
        C13990Tnq.A12(A012, mediaMapQuery);
        A012.A0Q("num_location_pins_returned", Long.valueOf((long) arrayList.size()));
        A04(A012, this);
        A012.A0Q("num_location_pins_with_stories_loaded", Long.valueOf(j));
        A07(A012, arrayList);
        A012.Cgf();
        this.A00 = true;
    }

    public final void A0B(MediaMapQuery mediaMapQuery, Collection collection, long j) {
        1Ln A012 = A01(this, "instagram_map_expand_bottom_sheet");
        C13990Tnq.A12(A012, mediaMapQuery);
        A04(A012, this);
        if (collection.size() == 1) {
            A05(A012, (MediaMapPin) collection.iterator().next());
        } else if (!collection.isEmpty()) {
            A07(A012, collection);
            ArrayList arrayList = new ArrayList();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                MediaMapPin mediaMapPin = (MediaMapPin) it.next();
                if (mediaMapPin != null) {
                    C18231Vnv.A00(mediaMapPin.A09);
                    String A013 = C18231Vnv.A01(mediaMapPin);
                    if (A013 != null) {
                        arrayList.add(A013);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                A012.A0S("location_ids", arrayList);
            }
        }
        if (j >= 0) {
            A012.A0Q("result_position", Long.valueOf(j));
        }
        A012.Cgf();
    }

    public W3Q(AnonymousClass0iw r2, UserSession userSession, MapEntryPoint mapEntryPoint, String str) {
        this.A03 = userSession;
        this.A02 = AnonymousClass0kN.A01(r2, userSession);
        this.A01 = r2;
        this.A05 = str;
        this.A04 = mapEntryPoint;
    }

    public static 1Ln A00(MediaMapQuery mediaMapQuery, W3Q w3q, MediaMapPin mediaMapPin, String str) {
        1Ln A012 = A01(w3q, str);
        C13990Tnq.A12(A012, mediaMapQuery);
        A05(A012, mediaMapPin);
        return A012;
    }

    public static String A03(0bb r2, MediaMapPin mediaMapPin) {
        r2.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, mediaMapPin.getId());
        r2.A04("lat", mediaMapPin.A0A);
        r2.A04("lng", mediaMapPin.A0B);
        LocationDict locationDict = mediaMapPin.A09;
        0qQ.A0B(locationDict, 0);
        if (locationDict.getName() == null) {
            return "";
        }
        LocationDict locationDict2 = mediaMapPin.A09;
        0qQ.A0B(locationDict2, 0);
        return locationDict2.getName();
    }
}
