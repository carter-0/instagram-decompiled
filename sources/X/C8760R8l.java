package X;

import com.instagram.common.session.UserSession;
import org.json.JSONObject;

/* renamed from: X.R8l  reason: case insensitive filesystem */
public final class C8760R8l extends 1P0 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 2IP A01;

    public C8760R8l(UserSession userSession, 2IP r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, 1837110651);
        C8760R8l.super.onFail(r5);
        0f9 AEf = 0wj.A01.AEf("IAB maybeSendQueryUserConsentRequest GraphQL result failed.", 817903741);
        AEf.ERJ(r5.A01());
        AEf.report();
        AnonymousClass0fD.A0A(-480445804, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass3FZ A002;
        int A03 = AnonymousClass0fD.A03(-1428912911);
        AnonymousClass3JC r7 = (AnonymousClass3JC) obj;
        int A0D = AnonymousClass7TG.A0D(r7, 712209234);
        AnonymousClass3FZ r2 = (AnonymousClass3FZ) r7.A01;
        if (!(r2 == null || (A002 = r2.A00(C7594QNk.class, "ig_user_consent")) == null)) {
            JSONObject jSONObject = A002.A00;
            if ((!jSONObject.isNull("has_consent_choices")) && A002.A06("has_consent_choices")) {
                boolean z = !jSONObject.isNull("third_party_tracking_opt_in");
                boolean z2 = true;
                if (z && A002.A06("third_party_tracking_opt_in")) {
                    z2 = false;
                }
                2IP.A00 = z2;
            }
        }
        AnonymousClass0fD.A0A(-1284207060, A0D);
        AnonymousClass0fD.A0A(220304041, A03);
    }
}
