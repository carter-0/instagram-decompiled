package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.direct.msys.reverb.InstamadilloLoggingContext;
import java.util.List;

public final class NAZ extends MailboxFeature {
    public static AnonymousClass681 A00 = new AnonymousClass670();

    public final MailboxFutureImpl A00(MailboxCallback mailboxCallback, InstamadilloLoggingContext instamadilloLoggingContext, String str, List list, List list2, boolean z) {
        AnonymousClass68L A0I = C66581MXm.A0I(this);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0I);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A01 = C3030067a.A01(A0G, "MailboxInstagramReverb", "loadMessagesByOTIDs");
        if (mailboxCallback != null) {
            A0G.Eiu(mailboxCallback);
        }
        if (!A0I.EJd(new C71692OpC(this, A0G, instamadilloLoggingContext, str, list, list2, A002, z))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A01, "MailboxInstagramReverb", "loadMessagesByOTIDs");
        }
        PlatformLogger.platformEventLog(5);
        return A0G;
    }
}
