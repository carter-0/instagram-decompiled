package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.OiV  reason: case insensitive filesystem */
public final class C71324OiV implements View.OnClickListener {
    public final /* synthetic */ 2Er A00;
    public final /* synthetic */ C70968OTp A01;

    public C71324OiV(2Er r1, C70968OTp oTp) {
        this.A00 = r1;
        this.A01 = oTp;
    }

    public final void onClick(View view) {
        C70968OTp oTp;
        int A05 = AnonymousClass0fD.A05(-441371564);
        2Et r4 = this.A00;
        if (r4 instanceof 2Et) {
            User user = (User) AnonymousClass7TE.A13(r4.BRZ());
            oTp = this.A01;
            AnonymousClass0eM r1 = oTp.A08;
            UserSession userSession = oTp.A04;
            Integer num = AnonymousClass05K.A01;
            if (((C49714F2z) r1.getValue()).A01(userSession, user, num)) {
                ((C49714F2z) r1.getValue()).A00(oTp.A02, userSession, user, num, "");
            }
            oTp.A07.Ct0(r4);
        } else {
            oTp = this.A01;
            oTp.A07.Ct0(r4);
        }
        AnonymousClass0fD.A0C(-1208810231, A05);
    }
}
