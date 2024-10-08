package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5Bv  reason: invalid class name and case insensitive filesystem */
public final class C282145Bv implements C282155Bw {
    public final AnonymousClass5Bx A00;
    public final 1L5 A01;
    public final 1Kv A02;
    public final C282125Bt A03;

    public final HashMap AUQ(String str) {
        1Kv r2 = this.A02;
        List ELB = r2.ELB(this.A03);
        r2.EEd(ELB);
        return this.A00.A00(str, ELB);
    }

    public /* synthetic */ C282145Bv(UserSession userSession, 1L5 r5, C282125Bt r6) {
        1Kv A002 = 1Kt.A00(userSession);
        AnonymousClass5Bx r1 = new AnonymousClass5Bx(r5);
        0qQ.A0B(A002, 4);
        this.A03 = r6;
        this.A01 = r5;
        this.A02 = A002;
        this.A00 = r1;
    }
}
