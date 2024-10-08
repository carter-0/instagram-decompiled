package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FeR  reason: case insensitive filesystem */
public final class C50556FeR implements G7C {
    public final Dd4 A00;

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r9, int i) {
        0qQ.A0B(r9, 0);
        Dd4 dd4 = this.A00;
        String A09 = r9.A09("media_id");
        if (A09 != null) {
            FragmentActivity fragmentActivity = dd4.A05;
            UserSession userSession = dd4.A0A;
            0qQ.A0B(fragmentActivity, 0);
            0qQ.A0B(userSession, 1);
            C49086EpB.A00(fragmentActivity, userSession, A09, true);
        }
    }

    public C50556FeR(Dd4 dd4) {
        this.A00 = dd4;
    }

    public final boolean AFM(C48087EVf eVf, C283155Gi r4, int i) {
        AnonymousClass7TG.A1N(r4, eVf);
        if (r4.A00 != 1643) {
            return false;
        }
        if (eVf == C48087EVf.CONTAINER || eVf == C48087EVf.END_IMAGE) {
            return true;
        }
        return false;
    }
}
