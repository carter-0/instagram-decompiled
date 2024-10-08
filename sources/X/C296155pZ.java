package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.5pZ  reason: invalid class name and case insensitive filesystem */
public final class C296155pZ {
    public final UserSession A00;
    public final 1Kv A01;
    public final C230432pc A02;
    public final C296145pY A03;

    public final void A00(C230472pg r11, Object obj, Object obj2, String str) {
        1Kv r2 = this.A01;
        String obj3 = UUID.randomUUID().toString();
        0qQ.A07(obj3);
        C233162v9 r7 = C233162v9.XOUT;
        AnonymousClass4EC r6 = AnonymousClass4EC.COLLECTED_TO_MEMORY;
        C230432pc r8 = this.A02;
        C296145pY r0 = this.A03;
        r2.DUD(new AnonymousClass9IV(new AnonymousClass9J4(r0.AUV(obj), r11, r6, r7, r8, obj3), (C253513qu) r0.AUW(obj, obj2, str)));
    }

    public /* synthetic */ C296155pZ(UserSession userSession, C230432pc r4, C296145pY r5) {
        1Kv A002 = 1Kt.A00(userSession);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(A002, 3);
        this.A00 = userSession;
        this.A01 = A002;
        this.A03 = r5;
        this.A02 = r4;
    }
}
