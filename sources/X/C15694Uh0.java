package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Uh0  reason: case insensitive filesystem */
public final class C15694Uh0 extends C252233om implements JO5 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C297015r2 A02;
    public final Set A03 = new HashSet();
    public final GX4 A04;
    public final XBt A05;

    public final void DvM() {
    }

    public final void onCreate() {
        UserSession userSession = this.A01;
        AnonymousClass0iw r4 = this.A00;
        String moduleName = r4.getModuleName();
        AnonymousClass7TG.A1O(userSession, moduleName);
        AnonymousClass34R r3 = new AnonymousClass34R(userSession, (AnonymousClass34Q) null, moduleName);
        1wY.A00(userSession).A07(new AnonymousClass34L(userSession, r4.getModuleName()), r3, r4.getModuleName());
    }

    public final void onDestroy() {
        1wY.A00(this.A01).A08(this.A00.getModuleName());
    }

    public C15694Uh0(AnonymousClass0iw r2, UserSession userSession, C297015r2 r4, GX4 gx4, XBt xBt) {
        this.A00 = r2;
        this.A01 = userSession;
        this.A02 = r4;
        this.A05 = xBt;
        this.A04 = gx4;
        gx4.A00.add(this);
    }
}
