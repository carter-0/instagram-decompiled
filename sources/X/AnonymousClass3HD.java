package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.3HD  reason: invalid class name */
public final class AnonymousClass3HD implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass38U A00;

    public AnonymousClass3HD(AnonymousClass38U r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        C331537Rj r3;
        int A05 = AnonymousClass0fD.A05(671341732);
        AnonymousClass38U r2 = this.A00;
        AnonymousClass38Y r6 = r2.A08;
        UserSession userSession = r6.A06;
        C72192OyC A01 = C66953Mfm.A01(userSession);
        if (A01 == null || !A01.A09()) {
            0KC.A0D(r2.A0A, "Ongoing call bar clicked, but no active call");
        } else {
            int intValue = r2.A09.intValue();
            if (intValue == 1) {
                r3 = C331537Rj.DIRECT_INBOX_ONGOING_CALL_BAR;
            } else if (intValue == 2) {
                r3 = C331537Rj.MAIN_ACTIVITY_ONGOING_CALL_BAR;
            } else if (intValue == 0) {
                r3 = C331537Rj.DIRECT_THREAD_ONGOING_CALL_BAR;
            } else {
                throw new RuntimeException();
            }
            new C70810OMf(r6.A04, r2.A04, userSession).A01(r3.A00);
        }
        AnonymousClass0fD.A0C(692705550, A05);
    }
}
