package X;

import android.animation.Animator;
import com.instagram.common.session.UserSession;

/* renamed from: X.GHa  reason: case insensitive filesystem */
public final class C52158GHa extends C251343mx {
    public final float A00;
    public final long A01;
    public final long A02;
    public final Animator A03;
    public final C61047Jvl A04;
    public final 2Wa A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C247003fc A08;
    public final GFO A09;
    public final C59626JQu A0A;
    public final boolean A0B;

    public final C251263mp A0X(AnonymousClass3Y5 r16) {
        0qQ.A0B(r16, 0);
        C61047Jvl jvl = this.A04;
        if (C61047Jvl.A00(4, jvl)) {
            C59626JQu jQu = this.A0A;
            UserSession userSession = this.A07;
            AnonymousClass0iw r4 = this.A06;
            long j = this.A01;
            long j2 = this.A02;
            float f = this.A00;
            boolean z = this.A0B;
            return new C52161GHd(this.A03, jvl, this.A05, r4, userSession, this.A08, this.A09, jQu, f, j, j2, z);
        }
        throw AnonymousClass7TE.A1K();
    }

    public C52158GHa(Animator animator, C61047Jvl jvl, 2Wa r4, AnonymousClass0iw r5, UserSession userSession, C247003fc r7, GFO gfo, C59626JQu jQu, float f, long j, long j2, boolean z) {
        C51974G9v.A1L(jQu, jvl, r5);
        0qQ.A0B(r7, 9);
        this.A0A = jQu;
        this.A04 = jvl;
        this.A07 = userSession;
        this.A06 = r5;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = f;
        this.A0B = z;
        this.A08 = r7;
        this.A03 = animator;
        this.A05 = r4;
        this.A09 = gfo;
    }
}
