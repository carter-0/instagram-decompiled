package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

public final class T7C implements C61110lV, AnonymousClass0lh {
    public 0hq A00;
    public AnonymousClass2Zc A01;
    public WeakReference A02;
    public boolean A03;
    public final 02m A04 = C51965G9l.A0l();
    public final UserSession A05;

    public T7C(UserSession userSession) {
        this.A05 = userSession;
        14i.A05(this);
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(302526174);
        1Av A002 = 1Au.A00(this.A05);
        long currentTimeMillis = System.currentTimeMillis();
        0xY AR4 = A002.A01.AR4();
        AR4.E5c("app_reset_background_time", currentTimeMillis);
        AR4.apply();
        1Gq.A00(C638918c.A01(C61170le.A00).A0C()).markerStart(25113516);
        this.A04.markerStart(728434865);
        this.A03 = true;
        AnonymousClass0fD.A0A(1761643274, A032);
    }

    public final void onAppForegrounded() {
        int i;
        int A032 = AnonymousClass0fD.A03(-26313019);
        if (!this.A03) {
            i = -509003003;
        } else {
            UserSession userSession = this.A05;
            String str = C71342cb.A00(userSession).A0B;
            if (str != null) {
                long A0P = AnonymousClass7TE.A0P(System.currentTimeMillis() - DbW.A06(AnonymousClass7TE.A0q(userSession), "app_reset_background_time"));
                18g A012 = C638918c.A01(C61170le.A00);
                A012.A0C().A01(25113516, "app_entry_last_interacted_surface", str);
                1Gq.A00(A012.A0C()).markerAnnotate(25113516, "app_entry_background_duration", A0P);
                1Gq.A00(A012.A0C()).markerEnd(25113516, 2);
                02m r2 = this.A04;
                r2.markerAnnotate(728434865, "AppEntryLastInteractedSurface", str);
                r2.markerEnd(728434865, 2);
                try {
                    C11343SOa sOa = C11343SOa.A01;
                    0hq r5 = this.A00;
                    WeakReference weakReference = this.A02;
                    AnonymousClass2Zc r7 = this.A01;
                    if (r7 == null) {
                        0qQ.A0F("appEntryUIInterface");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    sOa.A01(r5, userSession, r7, str, weakReference, A0P);
                } catch (Exception e) {
                    r2.markerAnnotate(728434865, AnonymousClass000.A00(871), e.toString());
                    r2.markerAnnotate(728434865, AnonymousClass000.A00(870), str);
                }
            }
            i = 1046601396;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onSessionWillEnd() {
        14i.A06(this);
    }
}
