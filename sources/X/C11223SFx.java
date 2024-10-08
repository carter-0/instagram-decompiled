package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.SFx  reason: case insensitive filesystem */
public final class C11223SFx {
    public final int A00 = HZX.A00().hashCode();
    public final Snu A01 = new Snu(this, 0);
    public final Snu A02 = new Snu(this, 1);
    public final Snu A03 = new Snu(this, 2);
    public final 02m A04 = C51965G9l.A0l();
    public final UserSession A05;
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final AtomicBoolean A07 = new AtomicBoolean(false);
    public final AtomicBoolean A08 = new AtomicBoolean(false);
    public final AtomicBoolean A09 = new AtomicBoolean(false);
    public final AtomicBoolean A0A = new AtomicBoolean(false);
    public final AtomicBoolean A0B = new AtomicBoolean(false);
    public final AtomicBoolean A0C = new AtomicBoolean(false);
    public final AtomicBoolean A0D = new AtomicBoolean(false);

    public static final SessionedNotificationCenter A00(C11223SFx sFx) {
        SessionedNotificationCenter sessionedNotificationCenter = C300345wy.A02(sFx.A05, true).getSessionedNotificationCenter();
        0qQ.A07(sessionedNotificationCenter);
        return sessionedNotificationCenter;
    }

    public C11223SFx(UserSession userSession) {
        this.A05 = userSession;
    }
}
