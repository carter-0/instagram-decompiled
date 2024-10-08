package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5pr  reason: invalid class name and case insensitive filesystem */
public final class C296315pr implements C296325ps {
    public final C296345pu A00;
    public final 1L5 A01;
    public final 1Kv A02;
    public final C282125Bt A03;

    public final HashMap ATx(C233162v9 r4, String str) {
        1Kv r1 = this.A02;
        List ELB = r1.ELB(this.A03);
        r1.EEd(ELB);
        return this.A00.A00(C293865lT.A00(r4), str, ELB);
    }

    public /* synthetic */ C296315pr(UserSession userSession, 1L5 r6, C233162v9 r7, List list) {
        1Kv A002 = 1Kt.A00(userSession);
        C296335pt r2 = new C296335pt(r7, C230432pc.FEED, list);
        C296345pu r1 = new C296345pu(r6);
        0qQ.A0B(A002, 5);
        this.A01 = r6;
        this.A02 = A002;
        this.A03 = r2;
        this.A00 = r1;
    }
}
