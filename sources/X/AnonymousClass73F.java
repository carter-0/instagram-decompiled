package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.73F  reason: invalid class name */
public final class AnonymousClass73F extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C320416sL A01;
    public final /* synthetic */ C320426sM A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass73F(C320416sL r2, C320426sM r3, long j, boolean z, boolean z2) {
        super(1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = j;
        this.A03 = z;
        this.A04 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3JC r9 = (AnonymousClass3JC) obj;
        0qQ.A0B(r9, 0);
        C320416sL r4 = this.A01;
        boolean z = r4 instanceof C320406sK;
        if (z) {
            C321666uY r2 = ((C320406sK) r4).A00;
            if (r2.A00 == AnonymousClass05K.A00) {
                r2.A00 = AnonymousClass05K.A01;
                r2.A0E("graphql_model_conversion_start");
            }
        }
        UserSession userSession = r4.A03;
        0qQ.A0B(userSession, 0);
        XEI A002 = AnonymousClass73D.A00(userSession, r9);
        if (z) {
            C321666uY r22 = ((C320406sK) r4).A00;
            if (r22.A00 == AnonymousClass05K.A01) {
                r22.A00 = AnonymousClass05K.A0C;
                r22.A0E("graphql_model_conversion_end");
            }
        }
        if (r9.A00.isFinal) {
            02m.A0p.markEventBuilder(224331318, "clips_fetch").annotate("isRefreshing", this.A04).annotate("isHeadLoad", this.A03).annotate(TraceFieldType.Duration, System.currentTimeMillis() - this.A00).report();
        }
        return A002;
    }
}
