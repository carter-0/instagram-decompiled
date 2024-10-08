package X;

import com.facebook.msys.mci.Execution;
import com.instagram.common.session.UserSession;

/* renamed from: X.OLn  reason: case insensitive filesystem */
public final /* synthetic */ class C70792OLn {
    public final /* synthetic */ AnonymousClass5HJ A00;
    public final /* synthetic */ 0lg A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1XZ A03;
    public final /* synthetic */ 1XF A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ C70792OLn(AnonymousClass5HJ r1, 0lg r2, UserSession userSession, 1XZ r4, 1XF r5, Runnable runnable, String str, String str2) {
        this.A03 = r4;
        this.A06 = str;
        this.A00 = r1;
        this.A02 = userSession;
        this.A07 = str2;
        this.A04 = r5;
        this.A01 = r2;
        this.A05 = runnable;
    }

    public final void A00(boolean z) {
        1XZ r7 = this.A03;
        String str = this.A06;
        AnonymousClass5HJ r4 = this.A00;
        UserSession userSession = this.A02;
        String str2 = this.A07;
        1XF r8 = this.A04;
        0lg r5 = this.A01;
        Runnable runnable = this.A05;
        boolean equals = str.equals("ig_watch_receipts");
        boolean A1U = C51970G9q.A1U(equals ? 1 : 0);
        if (!z) {
            if (!A1U) {
                r8.A04(r4, r5, str2);
            } else if (!equals) {
                throw DbZ.A0Z(str);
            }
            C67295MlU.A02(r4, r5, "shouldSendNotification returned false", (String) null, 3);
            runnable.run();
        } else if (!A1U || equals) {
            boolean A09 = r8.A09(r4, userSession, str2);
            AnonymousClass69F A002 = AnonymousClass69E.A00(r4.A0j);
            long longValue = r4.A0K.longValue();
            if (A09) {
                A002.Clr(longValue, "prepare_for_push_notification_start");
                NSZ nsz = new NSZ(r4, r5, userSession, r7, r8, runnable, str, str2);
                if (Execution.getExecutionContext() != 0) {
                    0nY.A00().ATE(nsz);
                } else {
                    nsz.run();
                }
            } else {
                A002.Clr(longValue, "prepare_for_push_notification_skipped");
                1XZ.A00(r4, r5, r7, r8, runnable, str, str2);
            }
        } else {
            throw DbZ.A0Z(str);
        }
    }
}
