package X;

import android.app.Activity;
import android.net.Uri;

/* renamed from: X.EcX  reason: case insensitive filesystem */
public abstract class C48314EcX {
    public static final void A00(Activity activity, String str) {
        Dba.A0o(activity, DbT.A0e().A03(activity, 67108864), new Uri.Builder().scheme("instagram").authority("direct-inbox").appendQueryParameter("filter_type", "all").appendQueryParameter("DIRECT_SOURCE_MODULE_NAME", str));
    }
}
