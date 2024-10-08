package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

public final class PHO implements C367608rH {
    public final /* synthetic */ C70698OGt A00;
    public final /* synthetic */ String A01;

    public PHO(C70698OGt oGt, String str) {
        this.A00 = oGt;
        this.A01 = str;
    }

    public final void onClick() {
        C70698OGt oGt = this.A00;
        C70931OSe.A00(oGt.A02, "direct_inbox_options_message_settings_click");
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = oGt.A01;
        boolean A1W = AnonymousClass7TF.A1W(r0.A01(userSession).A0J(), 16V.A05);
        FGW fgw = oGt.A04;
        if (A1W) {
            UserSession userSession2 = fgw.A02;
            C66777McN A002 = C66778McO.A00(userSession2);
            if (!A002.A02) {
                A002.A05();
            }
            C48834Ekw.A00(fgw.A01, userSession2).A00();
            C46649DiU A04 = C46649DiU.A04("com.bloks.www.business_messaging.ig.responsive_guide", AnonymousClass7TE.A1E());
            IgBloksScreenConfig A0N = DbS.A0N(userSession);
            A0N.A0U = this.A01;
            Bundle A003 = C49891FBs.A00(A0N, A04);
            FragmentActivity fragmentActivity = oGt.A00;
            AnonymousClass6W8 A03 = AnonymousClass6W8.A03(fragmentActivity, A003, userSession, ModalActivity.class, "bloks");
            A03.A07();
            A03.A0C(fragmentActivity);
            return;
        }
        fgw.A05();
    }
}
