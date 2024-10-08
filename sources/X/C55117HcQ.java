package X;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: X.HcQ  reason: case insensitive filesystem */
public abstract class C55117HcQ {
    public static final H1N A00(Bundle bundle) {
        C55115HcO.A00();
        String A01 = C320236s2.A01(bundle, "IgSessionManager.SESSION_TOKEN_KEY");
        String A012 = C320236s2.A01(bundle, "prior_module");
        Serializable serializable = bundle.getSerializable("SaveFragment.SAVE_HOME_TAB_MODE", HMH.class);
        DbY.A1S(A01, A012);
        H1N h1n = new H1N();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("IgSessionManager.SESSION_TOKEN_KEY", A01);
        A0a.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", (Parcelable) null);
        A0a.putString("prior_module", A012);
        if (serializable == null) {
            serializable = HMH.COLLECTION_FEED;
        }
        A0a.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", serializable);
        h1n.setArguments(A0a);
        return h1n;
    }
}
