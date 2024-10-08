package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OqP  reason: case insensitive filesystem */
public final class C71763OqP implements C74437Pus {
    public int A00;
    public long A01;
    public final 1QP A02;
    public final UserSession A03;
    public final String A04;

    public final void AW1() {
        this.A00 = 0;
        1QP r4 = this.A02;
        long flowStartForMarker = r4.flowStartForMarker(867378854, "rtc", false);
        this.A01 = flowStartForMarker;
        r4.flowAnnotate(flowStartForMarker, "local_call_id", this.A04);
    }

    public final void AVq() {
        1QP r4 = this.A02;
        r4.flowAnnotate(this.A01, "local_call_id", this.A04);
        r4.flowEndSuccess(this.A01);
        this.A01 = 0;
        this.A00 = 0;
    }

    public final void CmO(String str, String str2) {
        1QP r5 = this.A02;
        long j = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        r5.flowMarkPoint(j, 002.A0G(str, '_', i), str2);
    }

    public C71763OqP(UserSession userSession, String str) {
        this.A03 = userSession;
        this.A04 = str;
        this.A02 = AnonymousClass1QO.A00(userSession);
    }
}
