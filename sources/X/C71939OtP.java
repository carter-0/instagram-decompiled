package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.service.OngoingCallServiceWithMic;

/* renamed from: X.OtP  reason: case insensitive filesystem */
public final class C71939OtP implements C61110lV {
    public final /* synthetic */ AnonymousClass38Y A00;

    public C71939OtP(AnonymousClass38Y r1) {
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        AnonymousClass0fD.A0A(-877821141, AnonymousClass0fD.A03(-46444453));
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(399917422);
        AnonymousClass38Y r6 = this.A00;
        if (!AnonymousClass7TF.A1Z(r6.A0B) && r6.A02) {
            UserSession userSession = r6.A06;
            Context context = r6.A04;
            N9N n9n = (N9N) C66953Mfm.A00(context, userSession).A09.A0H.A01.getValue();
            OJ9 oj9 = OngoingCallServiceWithMic.A05;
            boolean z = n9n.A05;
            oj9.A00(context, n9n.A01, n9n.A03, z);
            r6.A02 = false;
        }
        AnonymousClass0fD.A0A(395516840, A03);
    }
}
