package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.FeT  reason: case insensitive filesystem */
public final class C50558FeT implements G7C {
    public final Dd4 A00;

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r19, int i) {
        C48087EVf eVf2 = eVf;
        C283155Gi r9 = r19;
        boolean A1U = AnonymousClass7TF.A1U(0, r9, eVf2);
        Dd4 dd4 = this.A00;
        C47179Dru A002 = C47179Dru.A00(jv7, eVf2, i);
        UserSession userSession = dd4.A0A;
        AnonymousClass4DH r5 = dd4.A07;
        FragmentActivity fragmentActivity = dd4.A05;
        String str = r9.A04.A0b;
        str.getClass();
        String str2 = r9.A04.A0c;
        str2.getClass();
        String str3 = r9.A04.A0f;
        str3.getClass();
        String str4 = r9.A04.A0h;
        str4.getClass();
        ImageUrl imageUrl = r9.A04.A0E;
        imageUrl.getClass();
        28D r2 = 28D.A5S;
        0qQ.A0B(userSession, 0);
        AnonymousClass7TF.A1B(r5, A1U ? 1 : 0, fragmentActivity);
        1Au.A00(userSession).A0M();
        User user = new User(str3, str4);
        user.A0l(imageUrl);
        C56044Hrt A0C = C250563lf.A0C(r2);
        A0C.A05 = I4D.A00(user, str, str2);
        I3M.A00(fragmentActivity, A0C.A00(), r5, r2, userSession);
        Dd4.A0C(dd4, A002, r9);
    }

    public C50558FeT(Dd4 dd4) {
        this.A00 = dd4;
    }

    public final boolean AFM(C48087EVf eVf, C283155Gi r4, int i) {
        AnonymousClass7TG.A1N(r4, eVf);
        if (eVf == C48087EVf.REPLY_WITH_REEL_BUTTON) {
            C283165Gj r1 = r4.A04;
            if (r1.A0b == null || r1.A0c == null || r1.A0f == null || r1.A0h == null || r1.A0E == null) {
                return false;
            }
            return true;
        }
        return false;
    }
}
