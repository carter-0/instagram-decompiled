package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.modal.ModalActivity;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.Vwf  reason: case insensitive filesystem */
public abstract class C18681Vwf {
    public static void A00(Uri uri, FragmentActivity fragmentActivity, UserSession userSession, MapEntryPoint mapEntryPoint, String str) {
        String queryParameter;
        Uri uri2 = uri;
        String queryParameter2 = uri2.getQueryParameter("place_id");
        String queryParameter3 = uri2.getQueryParameter("place_name");
        String queryParameter4 = uri2.getQueryParameter("boundary_top_left");
        String queryParameter5 = uri2.getQueryParameter("boundary_bottom_right");
        Bundle bundle = new Bundle();
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        if (queryParameter2 != null) {
            String A0b = AnonymousClass7TF.A0b();
            MapEntryPoint mapEntryPoint2 = MapEntryPoint.EXTERNAL_URL;
            if (queryParameter3 == null) {
                queryParameter3 = "Place";
            }
            A01((Bundle) null, fragmentActivity2, userSession2, mapEntryPoint2, C16614UyA.PLACE, A0b, queryParameter2, queryParameter3, (ArrayList) null, (double[]) null);
            return;
        }
        if (!(queryParameter4 == null || queryParameter5 == null)) {
            String[] split = queryParameter4.split(",");
            String[] split2 = queryParameter5.split(",");
            bundle.putParcelable("arg_boundary_top_left_lat_lng", new LatLng(Double.parseDouble(split[0]), Double.parseDouble(split[1])));
            bundle.putParcelable("arg_boundary_bottom_right_lat_lng", new LatLng(Double.parseDouble(split2[0]), Double.parseDouble(split2[1])));
        }
        String queryParameter6 = uri2.getQueryParameter("query");
        String queryParameter7 = uri2.getQueryParameter(AnonymousClass000.A00(1732));
        MapEntryPoint mapEntryPoint3 = mapEntryPoint;
        String str2 = str;
        if (!(queryParameter6 == null || queryParameter7 == null)) {
            try {
                C16614UyA valueOf = C16614UyA.valueOf(queryParameter6.toUpperCase(Locale.US));
                if (uri2.getQueryParameter("label") == null) {
                    queryParameter = valueOf.name();
                } else {
                    queryParameter = uri2.getQueryParameter("label");
                }
                C16614UyA uyA = C16614UyA.POPULAR;
                boolean equals = queryParameter7.equals("17843767138059124");
                if (valueOf == uyA ? equals : !equals) {
                    A01(bundle, fragmentActivity2, userSession2, mapEntryPoint3, valueOf, str2, queryParameter7, queryParameter, (ArrayList) null, (double[]) null);
                    return;
                }
                0wb.A03("LaunchMapActionHandler:InvalidQueryTypeIdMismatch", "");
            } catch (IllegalArgumentException e) {
                0wb.A07("LaunchMapActionHandler:InvalidQueryType", e);
                A02(bundle, fragmentActivity2, userSession2, mapEntryPoint3, str2);
                return;
            }
        }
        A02(bundle, fragmentActivity2, userSession2, mapEntryPoint3, str2);
    }

    public static void A01(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, MapEntryPoint mapEntryPoint, C16614UyA uyA, String str, String str2, String str3, ArrayList arrayList, double[] dArr) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("arg_session_id", str);
        bundle2.putString("arg_hashtag_id", str2);
        bundle2.putString("arg_hashtag_name", str3);
        bundle2.putInt("arg_query_type", uyA.ordinal());
        if (dArr != null) {
            bundle2.putParcelable("arg_starting_lat_lng", new LatLng(dArr[0], dArr[1]));
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList != null) {
            bundle2.putParcelableArrayList("arg_map_pins", arrayList2);
        }
        bundle2.putParcelable(AnonymousClass000.A00(1100), mapEntryPoint);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        AnonymousClass6W8 A0Y = DbV.A0Y(fragmentActivity, bundle2, userSession, ModalActivity.class, "discovery_map");
        A0Y.A09(0);
        A0Y.A0I = true;
        A0Y.A0C(fragmentActivity);
    }

    public static void A02(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, MapEntryPoint mapEntryPoint, String str) {
        A01(bundle, fragmentActivity, userSession, mapEntryPoint, C16614UyA.POPULAR, str, "17843767138059124", "popular", (ArrayList) null, (double[]) null);
    }
}
