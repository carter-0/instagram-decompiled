package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5CD  reason: invalid class name */
public final class AnonymousClass5CD implements AnonymousClass5CE {
    public final 1L5 A00;
    public final AnonymousClass5CF A01;
    public final 1Kv A02;
    public final C282125Bt A03;

    public final HashMap AUJ(String str) {
        1Kv r2 = this.A02;
        List ELB = r2.ELB(this.A03);
        r2.EEd(ELB);
        return this.A01.A00(str, ELB);
    }

    public /* synthetic */ AnonymousClass5CD(UserSession userSession, 1L5 r5, C282125Bt r6) {
        1Kv A002 = 1Kt.A00(userSession);
        AnonymousClass5CF r1 = new AnonymousClass5CF(userSession, r5);
        0qQ.A0B(A002, 4);
        this.A03 = r6;
        this.A00 = r5;
        this.A02 = A002;
        this.A01 = r1;
    }
}
