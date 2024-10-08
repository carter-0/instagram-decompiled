package X;

import com.facebook.msys.mca.Mailbox;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.function.Consumer;

/* renamed from: X.MZd  reason: case insensitive filesystem */
public final class C66617MZd implements Consumer {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ MZB A01;
    public final /* synthetic */ MZ9 A02;
    public final /* synthetic */ 1aD A03;
    public final /* synthetic */ 2I1 A04;
    public final /* synthetic */ IGFOAMessagingReadyLogger A05;
    public final /* synthetic */ String A06;

    public C66617MZd(UserSession userSession, MZB mzb, MZ9 mz9, 1aD r4, 2I1 r5, IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger, String str) {
        this.A02 = mz9;
        this.A06 = str;
        this.A01 = mzb;
        this.A04 = r5;
        this.A05 = iGFOAMessagingReadyLogger;
        this.A00 = userSession;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        MZ9 mz9 = this.A02;
        String str = this.A06;
        mz9.A00(002.A0R("Attempted ACT init from callsite=", str));
        MZB mzb = this.A01;
        mzb.A02(002.A0R("Attempted ACT init from callsite=", str));
        2I1 r5 = this.A04;
        r5.A04("rx_act_callback_start");
        IGFOAMessagingReadyLogger iGFOAMessagingReadyLogger = this.A05;
        if (iGFOAMessagingReadyLogger != null) {
            iGFOAMessagingReadyLogger.onLogRxActCallbackStart();
        }
        C66794Mcg mcg = new C66794Mcg(mailbox);
        AnonymousClass6AO A002 = AnonymousClass6AN.A00(1aU.A09(mcg), this.A00, this.A03.A04, (String) null, str);
        1a8 r3 = new 1a8((C269794fh) null);
        r3.A02(A002.A00(), new PUC(11, (Object) r3, (Object) mzb, (Object) mz9));
        r5.A04("rx_act_callback_end");
        if (iGFOAMessagingReadyLogger != null) {
            iGFOAMessagingReadyLogger.onLogRxActCallbackEnd();
        }
    }
}
