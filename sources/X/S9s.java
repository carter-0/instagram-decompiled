package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class S9s {
    public static HashMap A00(Bundle bundle) {
        String str;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("logger_data", Pxi.A0J(bundle));
        if (bundle != null) {
            str = bundle.getString("CREDENTIAL_ID");
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            A1E.put("FBPAY_AUTH_CREDENTIAL_ID", str);
        }
        Parcelable parcelable = bundle.getParcelable("logging_context");
        if (parcelable != null) {
            A1E.put("logging_context", parcelable);
        }
        Bundle bundle2 = bundle.getBundle("AUTH_LOGGING_EXTRA_KEY");
        if (bundle2 != null) {
            HashMap A1E2 = AnonymousClass7TE.A1E();
            Iterator A0t = Pxf.A0t(bundle2);
            while (A0t.hasNext()) {
                String A18 = AnonymousClass7TE.A18(A0t);
                A1E2.put(A18, bundle2.getString(A18));
            }
            A1E.put("AUTH_LOGGING_EXTRA_KEY", A1E2);
        }
        return A1E;
    }

    public static Map A01(Bundle bundle) {
        return Collections.unmodifiableMap(A00(bundle));
    }
}
