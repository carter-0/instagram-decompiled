package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Fjj  reason: case insensitive filesystem */
public final class C50865Fjj implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final Context A02;

    public final void CI0(Uri uri, Bundle bundle) {
        String str;
        List list;
        0qQ.A0B(uri, 0);
        String A0h = DbZ.A0h(uri);
        if (A0h == null) {
            Locale locale = Locale.US;
            0qQ.A08(locale);
            A0h = DbT.A12(locale, "IGPC_BLOCKING_INTERSTITIAL");
        }
        C51130Fp2 fp2 = new C51130Fp2(this, 6);
        UserSession userSession = this.A01;
        AccountFamily A09 = Dba.A09(AnonymousClass9BG.A01(userSession), userSession);
        if (A09 == null || (list = A09.A04) == null || list.get(0) == null) {
            str = "";
        } else {
            str = DbS.A0q(A09.A04.get(0));
        }
        C48922EmM.A00(userSession, A0h, str);
        FG9.A00(userSession, "linking_flow_initiated", A0h);
        C48920EmK.A00().A00(this.A00, userSession, fp2).A04(A0h);
    }

    public C50865Fjj(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        this.A02 = context;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }
}
