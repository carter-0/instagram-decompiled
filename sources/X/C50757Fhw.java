package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Fhw  reason: case insensitive filesystem */
public final class C50757Fhw implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        HashMap A1E;
        int i;
        if (bundle == null) {
            bundle = AnonymousClass7TE.A0a();
        }
        bundle.putString(Pxd.A00(710), "quick_promotion");
        Fragment fragment = this.A00;
        bundle.putString(DialogModule.KEY_TITLE, fragment.getString(2131963000));
        UserSession userSession = this.A01;
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        if (!DbT.A0j(userSession).CPm() || !182.A06(0Tu.A05, userSession, 36316422388846956L)) {
            boolean A06 = 182.A06(0Tu.A05, userSession, 36315675064536532L);
            A1E = AnonymousClass7TE.A1E();
            if (A06) {
                i = 256;
            } else {
                i = 131;
            }
        } else {
            A1E = AnonymousClass7TE.A1E();
            i = 73;
        }
        C46649DiU A04 = C46649DiU.A04(C273654mx.A00(i), A1E);
        0qQ.A0A(A04);
        Dbc.A0M(C49891FBs.A00(A0N, A04), fragment, userSession);
    }

    public C50757Fhw(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
