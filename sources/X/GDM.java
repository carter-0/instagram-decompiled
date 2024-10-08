package X;

import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GDM {
    public boolean A00;
    public final JU4 A01;
    public final GDK A02;
    public final UserSession A03;
    public final C262224Cq A04;

    public GDM(UserSession userSession, C262224Cq r5) {
        this.A03 = userSession;
        this.A04 = r5;
        JU4 ju4 = new JU4((DefaultConstructorMarker) null, (C249513ju) null, 1);
        this.A01 = ju4;
        this.A02 = new GDK(0u9.A04(ju4));
    }
}
