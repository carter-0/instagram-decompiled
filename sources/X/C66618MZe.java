package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.Map;

/* renamed from: X.MZe  reason: case insensitive filesystem */
public final class C66618MZe implements AnonymousClass66d {
    public final /* synthetic */ UserSession A00;

    public C66618MZe(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onNewNotification(String str, AnonymousClass2Lq r8, Map map) {
        Object obj;
        UserSession userSession = this.A00;
        2I1 A002 = 2Hz.A00(userSession);
        int i = 0;
        if (!(map == null || (obj = map.get("MEMOfflineHandlingCompletionNotificationMessageCountKey")) == null)) {
            A002.A06("message_count", obj.toString());
            i = C51967G9n.A04(00y.A0l(obj.toString()), 0);
        }
        IGFOAMessagingReadyLogger A003 = 2Hi.A00(userSession);
        if (A003 != null) {
            A003.onOfflineCompletion(i);
        }
        A002.A03(i);
        C262454Eg.A00(userSession).A00("Armadillo");
        0qQ.A0B(userSession, 0);
        MZQ mzq = (MZQ) userSession.A01(MZQ.class, C73911Plm.A00(userSession, 42));
        02m r3 = mzq.A02;
        int i2 = mzq.A01;
        r3.markerPoint(20127518, i2, "xplat_offline_sync_end");
        r3.markerEnd(20127518, i2, 2);
        C296405q0.A00.A00(userSession);
        C300345wy.A02(userSession, true).getSessionedNotificationCenter().removeObserver(this, "MEMOfflineHandlingCompletionNotification", (AnonymousClass2Lq) null);
    }
}
