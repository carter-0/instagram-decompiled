package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.GvP  reason: case insensitive filesystem */
public final class C53858GvP extends C251343mx {
    public final UserSession A00;
    public final C247003fc A01;
    public final C247453gM A02;
    public final AnonymousClass4DU A03;
    public final WeakReference A04;
    public final 0sP A05;
    public final 0sP A06;
    public final long A07;
    public final 2WX A08;
    public final AnonymousClass33C A09;
    public final C247413gI A0A;

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        0qQ.A0B(r13, 0);
        2WX r1 = this.A08;
        UserSession userSession = this.A00;
        AnonymousClass4DU r6 = this.A03;
        WeakReference weakReference = this.A04;
        long j = this.A07;
        return new C53957Gx1(r1, userSession, new C57133IPw(this), this.A09, this.A0A, r6, weakReference, new C58684Ivt(this, 34), new J6H(this, 40), j);
    }

    public C53858GvP(2WX r2, UserSession userSession, C247003fc r4, AnonymousClass33C r5, C247413gI r6, C247453gM r7, AnonymousClass4DU r8, WeakReference weakReference, 0sP r10, 0sP r11, long j) {
        C51974G9v.A1N(r6, userSession, r8);
        0qQ.A0B(r4, 8);
        0qQ.A0B(r5, 11);
        this.A07 = j;
        this.A08 = r2;
        this.A04 = weakReference;
        this.A02 = r7;
        this.A0A = r6;
        this.A00 = userSession;
        this.A03 = r8;
        this.A01 = r4;
        this.A06 = r10;
        this.A05 = r11;
        this.A09 = r5;
    }
}
