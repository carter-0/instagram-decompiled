package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class U8V extends 2YL {
    public final 2Fk A00;
    public final N4R A01;
    public final List A02;
    public final 05G A03;
    public final boolean A04;
    public final boolean A05;
    public final UserSession A06;

    public U8V(C319836rJ r5, N4R n4r, UserSession userSession, List list) {
        AnonymousClass7TG.A1U(userSession, list, n4r);
        this.A06 = userSession;
        this.A02 = list;
        this.A01 = n4r;
        boolean z = false;
        this.A05 = AnonymousClass7TG.A1X((Boolean) r5.A00(AnonymousClass000.A00(1102)));
        Boolean bool = (Boolean) r5.A00(AnonymousClass000.A00(1107));
        this.A04 = bool != null ? bool.booleanValue() : z;
        02z r3 = new 02z("");
        this.A03 = r3;
        this.A00 = DbT.A0G(10q.A01(new C20592WvV(this, (AnonymousClass4D7) null, 25), r3));
    }
}
