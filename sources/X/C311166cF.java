package X;

import android.view.Choreographer;
import com.instagram.common.session.UserSession;

/* renamed from: X.6cF  reason: invalid class name and case insensitive filesystem */
public final class C311166cF implements C250603lj {
    public static final C311176cG A08 = new Object();
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final Choreographer.FrameCallback A03 = new C18854W7z(this);
    public final Choreographer A04 = Choreographer.getInstance();
    public final Integer A05;
    public final UserSession A06;
    public final C310696bT A07;

    public final void ATF(AnonymousClass30Y r4, C252093oY r5) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        int intValue = r5.CEk(r4).intValue();
        if (intValue == 0) {
            this.A07.EBl(this);
        } else if (intValue == 2) {
            this.A07.FIz(this);
        }
    }

    public C311166cF(UserSession userSession, C310696bT r3, Integer num, long j) {
        this.A06 = userSession;
        this.A05 = num;
        this.A07 = r3;
        this.A02 = j;
    }
}
