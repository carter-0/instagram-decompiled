package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;

public abstract class SL1 {
    public static final void A01(Context context, Uri uri, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        HashMap A00 = A00(uri);
        if (A00 == null) {
            0wb r2 = 0wb.A01;
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Invalid serverParamsString or nativeAdType to open Bloks screen from %s", str);
            0qQ.A07(formatStrLocaleSafe);
            r2.Ew0("InstantShoppingInstagramBloksScreenUtil", formatStrLocaleSafe);
            return;
        }
        C359638dF.A04(context, new C359618dD(userSession), "com.bloks.www.fam.native.ads.bloks.main.controller", A00, 7200);
    }

    public static final boolean A02(Uri uri, String str) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        if (!(uri.getQueryParameter("use_bloks") == null || (queryParameter = uri.getQueryParameter("use_bloks")) == null || !queryParameter.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION))) {
            if (uri.getQueryParameter("server_side_params") != null && (queryParameter2 = uri.getQueryParameter("server_side_params")) != null && queryParameter2.length() != 0 && uri.getQueryParameter("native_ad_type") != null && (queryParameter3 = uri.getQueryParameter("native_ad_type")) != null && queryParameter3.length() != 0) {
                return true;
            }
            0wb r2 = 0wb.A01;
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Invalid serverParamsString or nativeAdType to open Bloks screen from %s", str);
            0qQ.A07(formatStrLocaleSafe);
            r2.Ew0("InstantShoppingInstagramBloksScreenUtil", formatStrLocaleSafe);
        }
        return false;
    }

    public static final HashMap A00(Uri uri) {
        String queryParameter;
        String queryParameter2;
        if (uri.getQueryParameter("server_side_params") == null) {
            queryParameter = null;
        } else {
            queryParameter = uri.getQueryParameter("server_side_params");
        }
        if (uri.getQueryParameter("native_ad_type") == null) {
            queryParameter2 = null;
        } else {
            queryParameter2 = uri.getQueryParameter("native_ad_type");
        }
        if (queryParameter == null || queryParameter.length() == 0 || queryParameter2 == null || queryParameter2.length() == 0) {
            return null;
        }
        return Dbb.A0e("native_ad_type", queryParameter2, AnonymousClass7TE.A1L("server_params_string", queryParameter));
    }
}
