package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Fj8  reason: case insensitive filesystem */
public final class C50828Fj8 implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String A0h = DbZ.A0h(uri);
        if (A0h == null) {
            A0h = "megaphone";
        }
        FragmentActivity fragmentActivity = this.A00;
        boolean A1V = AnonymousClass7TF.A1V(fragmentActivity.findViewById(R.id.layout_container_main));
        C49765F5y.A01();
        UserSession userSession = this.A01;
        Integer num = AnonymousClass05K.A01;
        if (A1V) {
            C49765F5y.A01();
            Bundle A002 = C49766F5z.A00(userSession, num, A0h, A1V);
            C47881ELb eLb = new C47881ELb();
            eLb.setArguments(A002);
            C309516Yo A0M = DbV.A0M(eLb, fragmentActivity, userSession);
            A0M.A0A = "GDPR.Fragment.Entrance";
            A0M.A0G = true;
            A0M.A04();
        } else if (0Gl.A02(userSession) != null) {
            DbU.A0w(fragmentActivity, C49766F5z.A00(userSession, num, A0h, A1V), userSession, ModalActivity.class, "gdpr_consent");
        } else {
            throw AnonymousClass7TE.A0z("Must call setUserId() with non-null userId first");
        }
    }

    public C50828Fj8(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
