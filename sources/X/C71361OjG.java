package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.OjG  reason: case insensitive filesystem */
public final class C71361OjG implements View.OnClickListener {
    public final /* synthetic */ C71029OZg A00;
    public final /* synthetic */ C274694ou A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C71361OjG(C71029OZg oZg, C274694ou r2, User user, String str, String str2, boolean z) {
        this.A02 = user;
        this.A01 = r2;
        this.A00 = oZg;
        this.A05 = z;
        this.A04 = str;
        this.A03 = str2;
    }

    public final void onClick(View view) {
        String str;
        int A052 = AnonymousClass0fD.A05(-559757563);
        User user = this.A02;
        if (!(user == null || (str = this.A01.A01) == null || !str.equals("appointment_booking_cta"))) {
            C71029OZg oZg = this.A00;
            if (this.A05) {
                UserSession userSession = oZg.A08;
                if (182.A06(0Tu.A05, userSession, 36317036569170702L)) {
                    OZW ozw = OZW.A00;
                    FragmentActivity fragmentActivity = oZg.A05;
                    DbS.A1X(fragmentActivity);
                    ozw.A02(fragmentActivity, oZg.A07, userSession, "com.bloks.www.services.ig.appointment.customer", userSession.A06, user.getId(), (String) null, "composer", "");
                    AnonymousClass0fD.A0C(-1822892809, A052);
                }
            }
        }
        C329127Hr r0 = this.A00.A09;
        r0.A00.A1i.A06((C70766OKm) null, this.A04, this.A03);
        AnonymousClass0fD.A0C(-1822892809, A052);
    }
}
