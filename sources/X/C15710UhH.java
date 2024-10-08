package X;

import android.os.Bundle;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;

/* renamed from: X.UhH  reason: case insensitive filesystem */
public final class C15710UhH extends C228042kh {
    public final Bundle A00;
    public final UserSession A01;
    public final String A02 = "ig_boost_create_audience_screen";

    public C15710UhH(Bundle bundle) {
        this.A00 = bundle;
        this.A01 = DbS.A0U(bundle);
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        XIGIGBoostDestination xIGIGBoostDestination;
        Bundle bundle = this.A00;
        String A012 = C320236s2.A01(bundle, "media_id");
        String string = bundle.getString("audience_id");
        String string2 = bundle.getString("destination");
        if (string2 != null) {
            xIGIGBoostDestination = C16852V8h.A00(AnonymousClass7TF.A0k(string2));
        } else {
            xIGIGBoostDestination = null;
        }
        boolean z = bundle.getBoolean(C273654mx.A00(770), false);
        return new U92(xIGIGBoostDestination, new C17326VRf(), this.A01, A012, string, this.A02, z);
    }
}
