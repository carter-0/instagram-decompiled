package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import java.util.List;

/* renamed from: X.MpJ  reason: case insensitive filesystem */
public final class C67524MpJ extends C272124k8 {
    public final /* synthetic */ AnonymousClass43G A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67524MpJ(UserSession userSession, AnonymousClass43G r2) {
        super(userSession);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.1qK, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void A04(UserSession userSession, Object obj) {
        int A03 = AnonymousClass0fD.A03(-1731872400);
        NH6 nh6 = (NH6) obj;
        int A032 = AnonymousClass0fD.A03(1034367442);
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, nh6);
        List list = nh6.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C370538wd r2 = ((O8D) list.get(i)).A00;
            if (r2 != null) {
                2Dm r1 = this.A00.A0B;
                r1.CnE("NetworkTaskCallback");
                r1.EKE(r1.FKy(r2, r2.A0o, r2, A1Z).BJz());
            }
        }
        AnonymousClass1Nd.A00(userSession).A00(new Object());
        for (String str : nh6.A00) {
            ThreadFetchReason threadFetchReason = ThreadFetchReason.BROADCAST_CHANNEL_INBOX_UPDATE;
            0qQ.A0B(str, A1Z ? 1 : 0);
            C71129OdS.A04(userSession, threadFetchReason, (C74484Pve) null, str, A1Z);
        }
        AnonymousClass0fD.A0A(-1061961095, A032);
        AnonymousClass0fD.A0A(1994926609, A03);
    }
}
