package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.5pp  reason: invalid class name and case insensitive filesystem */
public final class C296295pp {
    public final UserSession A00;
    public final C296285po A01;
    public final 1Kv A02;
    public final C230432pc A03;

    public final void A00(C230472pg r11, C233162v9 r12, Object obj, Object obj2) {
        1Kv r2 = this.A02;
        String obj3 = UUID.randomUUID().toString();
        0qQ.A07(obj3);
        AnonymousClass4EC r6 = AnonymousClass4EC.COLLECTED_TO_MEMORY;
        C230432pc r8 = this.A03;
        C296285po r0 = this.A01;
        r2.DUD(new AnonymousClass9IV(new AnonymousClass9J4(r0.ATv(obj, obj2), r11, r6, r12, r8, obj3), (C253513qu) r0.ATw(obj, obj2)));
    }

    public /* synthetic */ C296295pp(UserSession userSession, C296285po r4, C230432pc r5) {
        1Kv A002 = 1Kt.A00(userSession);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(A002, 3);
        this.A00 = userSession;
        this.A02 = A002;
        this.A01 = r4;
        this.A03 = r5;
    }
}
