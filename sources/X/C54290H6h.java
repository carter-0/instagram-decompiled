package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.H6h  reason: case insensitive filesystem */
public final class C54290H6h extends C228042kh {
    public final UserSession A00;
    public final 1Xj A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public C54290H6h(UserSession userSession, 1Xj r3, List list, List list2, List list3) {
        DbW.A1N(userSession, 1, r3);
        this.A00 = userSession;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = list3;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        String str;
        UserSession userSession = this.A00;
        C62037KWw A002 = C55122HcV.A00(userSession);
        1Xj r2 = this.A01;
        C67231sQ A0n = C51966G9m.A0n(r2);
        if (A0n != null) {
            str = A0n.getMusicCanonicalId();
        } else {
            str = null;
        }
        return new C53009Gh0(userSession, r2, A002, new C55685Hli(userSession, str), this.A02, this.A03, this.A04);
    }
}
