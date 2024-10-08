package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5pc  reason: invalid class name and case insensitive filesystem */
public final class C296185pc implements C296195pd {
    public final 1L5 A00;
    public final 1Kv A01;
    public final C282125Bt A02;
    public final C296205pe A03;

    public final HashMap AUX(String str) {
        1Kv r2 = this.A01;
        List ELB = r2.ELB(this.A02);
        r2.EEd(ELB);
        return this.A03.A00(str, ELB);
    }

    public /* synthetic */ C296185pc(UserSession userSession, 1L5 r5, C282125Bt r6) {
        1Kv A002 = 1Kt.A00(userSession);
        C296205pe r1 = new C296205pe(r5);
        0qQ.A0B(A002, 4);
        this.A02 = r6;
        this.A00 = r5;
        this.A01 = A002;
        this.A03 = r1;
    }
}
