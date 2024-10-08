package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Map;
import java.util.Set;

/* renamed from: X.NKq  reason: case insensitive filesystem */
public final class C68497NKq extends AnonymousClass8ZF {
    public 05G A00;
    public final 2Fk A01;
    public final 05G A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;
    public final AnonymousClass0Ud A05;
    public final AnonymousClass0Ud A06;

    public C68497NKq(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = 106.A01(C69991NvV.A00(userSession).A00.A02);
        02z A012 = 106.A01(00k.A0j(C2612048r.A00(userSession).A00));
        this.A02 = A012;
        C2611948q r5 = C2611948q.ALL;
        Object value = this.A00.getValue();
        String str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        0eP A1L = AnonymousClass7TE.A1L("all", value == r5 ? str : "0");
        C69415Nkv nkv = C69415Nkv.BUSINESS;
        0eP A1L2 = AnonymousClass7TE.A1L(nkv.A02, ((Set) A012.getValue()).contains(nkv) ? str : "0");
        C69415Nkv nkv2 = C69415Nkv.CREATOR;
        0eP A1L3 = AnonymousClass7TE.A1L(nkv2.A02, ((Set) A012.getValue()).contains(nkv2) ? str : "0");
        0eP A1L4 = AnonymousClass7TE.A1L("relevant", this.A00.getValue() == C2611948q.RELEVANT ? str : "0");
        C69415Nkv nkv3 = C69415Nkv.SUBSCRIBER;
        0eP A1L5 = AnonymousClass7TE.A1L(nkv3.A02, ((Set) A012.getValue()).contains(nkv3) ? str : "0");
        C69415Nkv nkv4 = C69415Nkv.VERIFIED;
        02z A013 = 106.A01(0Yt.A05(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, AnonymousClass7TE.A1L(nkv4.A02, !((Set) A012.getValue()).contains(nkv4) ? "0" : str)}));
        this.A03 = A013;
        05G r1 = this.A00;
        this.A06 = 10b.A03(r1);
        this.A04 = 10b.A03(A012);
        this.A05 = 10b.A03(A013);
        this.A01 = C66582MXn.A0G(new C49476EwH(r5, 0sl.A00), C318116oQ.A00(this), C66193MHj.A01(r1, A012, 25), AnonymousClass10A.A01);
    }

    public static final void A00(C2611948q r6, C68497NKq nKq) {
        if (r6 == C2611948q.ALL) {
            05G r1 = nKq.A03;
            ((Map) r1.getValue()).put("all", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            ((Map) r1.getValue()).put("relevant", "0");
        } else if (r6 == C2611948q.RELEVANT) {
            05G r12 = nKq.A03;
            ((Map) r12.getValue()).put("all", "0");
            ((Map) r12.getValue()).put("relevant", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
    }
}
