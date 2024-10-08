package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5pU  reason: invalid class name and case insensitive filesystem */
public final class C296105pU implements C296115pV {
    public final C296135pX A00;
    public final 1Kv A01;
    public final C282125Bt A02;

    public final HashMap AUQ(String str) {
        1Kv r2 = this.A01;
        List ELB = r2.ELB(this.A02);
        r2.EEd(ELB);
        return this.A00.A00(str, ELB);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.5Bt] */
    public /* synthetic */ C296105pU(UserSession userSession, 1L5 r6) {
        1Kv A002 = 1Kt.A00(userSession);
        ? obj = new Object();
        C296135pX r1 = new C296135pX(r6);
        0qQ.A0B(A002, 4);
        this.A01 = A002;
        this.A02 = obj;
        this.A00 = r1;
    }
}
