package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8iC  reason: invalid class name and case insensitive filesystem */
public final class C362618iC extends 0ng {
    public final /* synthetic */ C362488hz A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C362618iC(C362488hz r4) {
        super(426, 3, false, false);
        this.A00 = r4;
    }

    public final void run() {
        C362488hz r4 = this.A00;
        List list = C362488hz.A0H;
        UserSession userSession = r4.A07;
        r4.A0G = ((C362928ij) userSession.A01(C362928ij.class, new C73662Phb(userSession, 30))).A00.getBoolean("debug_key", false);
    }
}
