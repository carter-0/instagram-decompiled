package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.Pnk  reason: case insensitive filesystem */
public final class C74019Pnk extends 0Yg implements 0sP {
    public static final C74019Pnk A00 = new C74019Pnk();

    public C74019Pnk() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MailboxFeature mailboxFeature = (MailboxFeature) obj;
        0qQ.A0B(mailboxFeature, 0);
        AnonymousClass68L ASa = mailboxFeature.mMailboxApiHandleMetaProvider.ASa(2);
        MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A01 = C3030067a.A01(A0G, "MailboxInstagramReverb", "getNextDeletedMessagePurgeTimestamp");
        if (!ASa.EJd(new C67192Mjo(A002, 2, mailboxFeature, A0G))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A01, "MailboxInstagramReverb", "getNextDeletedMessagePurgeTimestamp");
        }
        PlatformLogger.platformEventLog(5);
        return A0G;
    }
}
