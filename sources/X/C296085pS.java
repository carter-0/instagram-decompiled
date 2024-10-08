package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.5pS  reason: invalid class name and case insensitive filesystem */
public final class C296085pS {
    public final UserSession A00;
    public final C296075pR A01;
    public final 1Kv A02;
    public final C230432pc A03;

    public final void A00(C376459Ib r11, C230472pg r12, Object obj, Object obj2) {
        1Kv r2 = this.A02;
        String obj3 = UUID.randomUUID().toString();
        0qQ.A07(obj3);
        C233162v9 r7 = C233162v9.IAB_NO_BOUNCE;
        AnonymousClass4EC r6 = AnonymousClass4EC.COLLECTED_TO_MEMORY;
        C230432pc r8 = this.A03;
        C296075pR r0 = this.A01;
        r2.DUD(new AnonymousClass9IV(new AnonymousClass9J4(r0.ATz(obj, obj2), r12, r6, r7, r8, obj3), (C253513qu) r0.AU0(r11, obj, obj2)));
    }

    public /* synthetic */ C296085pS(UserSession userSession, C296075pR r4, C230432pc r5) {
        1Kv A002 = 1Kt.A00(userSession);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(A002, 3);
        this.A00 = userSession;
        this.A02 = A002;
        this.A01 = r4;
        this.A03 = r5;
    }
}
