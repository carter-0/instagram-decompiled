package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjN  reason: case insensitive filesystem */
public final class C50843FjN implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        String str;
        UserSession userSession = this.A01;
        if (!DbT.A0j(userSession).A1d()) {
            str = AnonymousClass000.A00(46);
        } else {
            str = "com.instagram.wa_linking.ig_whatsapp_linking_detail.DetailScreen";
        }
        Dbc.A0M(C49891FBs.A00(DbS.A0N(userSession), C46649DiU.A04(str, Dbb.A0d("ContactOptionsEntryPoint", "whatsapp_linking_in_quick_promotion"))), this.A00, userSession);
    }

    public C50843FjN(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
