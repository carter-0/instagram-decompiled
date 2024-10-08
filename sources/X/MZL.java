package X;

import android.content.Context;
import com.facebook.msys.mca.Mailbox;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.impl.MsysMailboxSessionManagerImpl;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

public final class MZL implements Consumer {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ MZB A01;
    public final /* synthetic */ MZ9 A02;
    public final /* synthetic */ MsysMailboxSessionManagerImpl A03;
    public final /* synthetic */ 1aD A04;
    public final /* synthetic */ 2I1 A05;
    public final /* synthetic */ IGFOAMessagingReadyLogger A06;

    public MZL(UserSession userSession, MZB mzb, MZ9 mz9, MsysMailboxSessionManagerImpl msysMailboxSessionManagerImpl, 1aD r5, 2I1 r6, IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger) {
        this.A05 = r6;
        this.A06 = iGFOAMessagingReadyLogger;
        this.A02 = mz9;
        this.A01 = mzb;
        this.A00 = userSession;
        this.A03 = msysMailboxSessionManagerImpl;
        this.A04 = r5;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str;
        Mailbox mailbox = (Mailbox) obj;
        2I1 r5 = this.A05;
        r5.A04("mailbox_bootstrap_end");
        IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = this.A06;
        if (iGFOAMessagingReadyLogger != null) {
            iGFOAMessagingReadyLogger.onLogMailboxBootstrapEnd();
        }
        this.A02.A00("Mailbox activated");
        this.A01.A02("Mailbox activated");
        r5.A04("mailbox_dep_callback_start");
        if (iGFOAMessagingReadyLogger != null) {
            iGFOAMessagingReadyLogger.onLogMailboxDepCallbackStart();
        }
        Context context = C60960kU.A00;
        0qQ.A07(context);
        UserSession userSession = this.A00;
        0qQ.A0A(mailbox);
        C3031167l r6 = new C3031167l(context, mailbox, userSession);
        ConcurrentHashMap concurrentHashMap = this.A03.activationSteps;
        String str2 = userSession.A06;
        AnonymousClass68G r8 = this.A04.A04;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new Object());
        if (r8.A03) {
            str = "ig_advanced_crypto_transport";
        } else {
            str = "ig_django";
        }
        0LA.A05(AnonymousClass0LO.A9w, str);
        UserSession userSession2 = r6.A02;
        0LA.A05(AnonymousClass0LO.A0M, AnonymousClass7TF.A0R(0Tu.A06, userSession2, 36318892001860283L).toString());
        A1C.add(new C3031467o(r6.A01, 28c.A00(userSession2)));
        A1C.add(new Object());
        A1C.add(new Object());
        if (r8.A04) {
            A1C.add(new Object());
        }
        AnonymousClass2HN A002 = 2HM.A00(userSession2);
        if (A002.A02() && AnonymousClass7TE.A1a(A002.A01.A00())) {
            A1C.add(new PCI());
        }
        AnonymousClass68F r82 = r8.A01;
        boolean z = !C66581MXm.A1a(AnonymousClass7TE.A1a(r82.A0O.get()));
        List list = (List) r82.A07.get();
        if (z && list != null && !list.isEmpty()) {
            A1C.add(new Object());
        }
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            ((C3031367n) it.next()).EpW(r6);
        }
        concurrentHashMap.put(str2, A1C);
        r5.A04("mailbox_dep_callback_end");
        if (iGFOAMessagingReadyLogger != null) {
            iGFOAMessagingReadyLogger.onLogMailboxDepCallbackEnd();
        }
    }
}
