package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.MhR  reason: case insensitive filesystem */
public final class C67054MhR implements C74462PvH {
    public final AnonymousClass1aS A00 = 1aF.A00();
    public final AnonymousClass1aS A01 = 1aF.A00();
    public final 1a8 A02 = C66581MXm.A0P();
    public final UserSession A03;
    public final AtomicBoolean A04 = JTQ.A0k();
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A00(0eO.A02, new C73914Plp(this, 27));
    public final 1aU A06;

    public final 1aU BbW() {
        return this.A01;
    }

    public final void start() {
        this.A04.set(true);
        1aU r3 = this.A06;
        PU7.A00(C66789Mca.A00(r3, C66991MgP.A00, 18).A0H(), this.A02, this, 22);
    }

    public final void stop() {
        this.A04.set(false);
        this.A02.A01();
    }

    public C67054MhR(1aU r4, UserSession userSession) {
        this.A03 = userSession;
        this.A06 = r4;
    }
}
