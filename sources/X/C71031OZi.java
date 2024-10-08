package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.OZi  reason: case insensitive filesystem */
public final class C71031OZi {
    public final void A02(UserSession userSession, int i, long j) {
        long j2 = j;
        if (i <= 0) {
            A01(userSession).A02(j2);
            return;
        }
        C68314NAb A01 = A01(userSession);
        long millis = TimeUnit.SECONDS.toMillis((long) i);
        AnonymousClass68L A0F = C66580MXl.A0F(A01, 0);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
        int A00 = C3030067a.A00(A0G);
        TraceInfo A012 = C3030067a.A01(A0G, "MailboxTam", "runTamTransportHybridThreadMuteUntil");
        if (!A0F.EJd(new C71675Oou(A0G, A01, A00, 0, j2, millis))) {
            A0G.cancel(false);
            C3030067a.A02(A00);
            C3030067a.A03(A012, "MailboxTam", "runTamTransportHybridThreadMuteUntil");
        }
        PlatformLogger.platformEventLog(5);
        0qQ.A0A(A0G);
    }

    public final void A03(UserSession userSession, long j) {
        0qQ.A0B(userSession, 0);
        C68314NAb A01 = A01(userSession);
        AnonymousClass68L A0F = C66580MXl.A0F(A01, 0);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
        int A00 = C3030067a.A00(A0G);
        TraceInfo A012 = C3030067a.A01(A0G, "MailboxTam", "runTamClientThreadBannerDismiss");
        if (!A0F.EJd(new C71724Opi(A0G, A01, A00, 15, j))) {
            A0G.cancel(false);
            C3030067a.A02(A00);
            C3030067a.A03(A012, "MailboxTam", "runTamClientThreadBannerDismiss");
        }
        PlatformLogger.platformEventLog(5);
    }

    public final void A04(UserSession userSession, long j) {
        0qQ.A0B(userSession, 0);
        C68314NAb A01 = A01(userSession);
        AnonymousClass68L A0F = C66580MXl.A0F(A01, 0);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
        int A00 = C3030067a.A00(A0G);
        TraceInfo A012 = C3030067a.A01(A0G, "MailboxTam", "runTamClientThreadBannerRecordImpression");
        if (!A0F.EJd(new C71724Opi(A0G, A01, A00, 14, j))) {
            A0G.cancel(false);
            C3030067a.A02(A00);
            C3030067a.A03(A012, "MailboxTam", "runTamClientThreadBannerRecordImpression");
        }
        PlatformLogger.platformEventLog(5);
    }

    public static MailboxFutureImpl A00(UserSession userSession, String str, String str2) {
        return A01(userSession).A00(str, str2);
    }

    public static final C68314NAb A01(UserSession userSession) {
        return ((C70948OSv) 1y0.A00(userSession).A01(C70948OSv.class, C73911Plm.A00(userSession, 23))).A00;
    }
}
