package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hqc  reason: case insensitive filesystem */
public final class C55971Hqc {
    public final UserSession A00;
    public final JPZ A01;
    public final 1Kv A02;
    public final C230432pc A03;

    public final void A00(C53251Gkz gkz, C230472pg r12, Object obj, Object obj2) {
        1Kv r2 = this.A02;
        String A0j = AnonymousClass7TG.A0j();
        C233162v9 r7 = C233162v9.AFI;
        AnonymousClass4EC r6 = AnonymousClass4EC.COLLECTED_TO_MEMORY;
        C230432pc r8 = this.A03;
        JPZ jpz = this.A01;
        r2.DUD(new AnonymousClass9IV(new AnonymousClass9J4(jpz.ATi(obj, obj2), r12, r6, r7, r8, A0j), (C253513qu) jpz.ATj(gkz, obj, obj2)));
    }

    public /* synthetic */ C55971Hqc(UserSession userSession, JPZ jpz, C230432pc r4) {
        1Kv A002 = 1Kt.A00(userSession);
        AnonymousClass7TG.A1P(userSession, A002);
        this.A00 = userSession;
        this.A02 = A002;
        this.A01 = jpz;
        this.A03 = r4;
    }
}
