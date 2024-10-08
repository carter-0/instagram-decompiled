package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.Pno  reason: case insensitive filesystem */
public final class C74023Pno extends 0Yg implements 0sP {
    public static final C74023Pno A00 = new C74023Pno();

    public C74023Pno() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MailboxFeature mailboxFeature = (MailboxFeature) obj;
        0qQ.A0B(mailboxFeature, 0);
        AnonymousClass68L A0I = C66581MXm.A0I(mailboxFeature);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0I);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A01 = C3030067a.A01(A0G, "MailboxInstagramReverb", "purgeDeletedMessages");
        if (!A0I.EJd(new C67192Mjo(A002, 1, mailboxFeature, A0G))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A01, "MailboxInstagramReverb", "purgeDeletedMessages");
        }
        PlatformLogger.platformEventLog(5);
        return A0G;
    }
}
