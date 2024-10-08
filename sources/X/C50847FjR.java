package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FjR  reason: case insensitive filesystem */
public final class C50847FjR implements G6H {
    public final FragmentActivity A00;
    public final 0lg A01;

    public final void CI0(Uri uri, Bundle bundle) {
        1OC A0S;
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("use_case");
        0lg r4 = this.A01;
        if (queryParameter == null) {
            1NY A0a = AnonymousClass7TG.A0a(r4);
            A0a.A0A("security_checkup/start/");
            A0S = DbU.A0S(A0a, DwC.class, C49814F8b.class);
        } else {
            Integer A0l = 00y.A0l(queryParameter);
            1NY A0L = DbZ.A0L(r4);
            A0L.A0A("security_checkup/start/");
            A0L.A09(A0l, "use_case");
            A0S = DbU.A0S(A0L, DwC.class, C49814F8b.class);
        }
        IgFragmentActivity igFragmentActivity = this.A00;
        0hq A0F = DbT.A0F(igFragmentActivity);
        0qQ.A0C(igFragmentActivity, Pxd.A00(9));
        IgFragmentActivity igFragmentActivity2 = igFragmentActivity;
        AnonymousClass7TG.A1U(A0F, igFragmentActivity2, r4);
        1P0 h4j = new H4J(A0F);
        h4j.A00 = A0F;
        h4j.A01 = igFragmentActivity2;
        h4j.A02 = r4;
        A0S.A00 = h4j;
        1ES.A03(A0S);
    }

    public C50847FjR(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
