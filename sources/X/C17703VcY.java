package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.VcY  reason: case insensitive filesystem */
public final class C17703VcY {
    public C365368mz A00;
    public C365398n2 A01;
    public WGC A02;
    public boolean A03;
    public final C365388n1 A04;
    public final C368528sn A05;
    public final UserSession A06;
    public final WXO A07 = new WXO();
    public final Object A08 = new Object();
    public final AtomicBoolean A09;
    public final boolean A0A;

    public C17703VcY(C365388n1 r3, C368528sn r4, UserSession userSession, boolean z) {
        this.A06 = userSession;
        this.A04 = r3;
        this.A05 = r4;
        this.A0A = z;
        r4.A04 = this;
        this.A09 = new AtomicBoolean(true);
    }
}
