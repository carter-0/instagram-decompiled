package X;

import android.animation.Animator;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.GMe  reason: case insensitive filesystem */
public final class C52288GMe extends C251343mx {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Animator A03;
    public final C376459Ib A04;
    public final GNY A05;
    public final 2V5 A06;
    public final 2V5 A07;
    public final 2V5 A08;
    public final AnonymousClass0iw A09;
    public final UserSession A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final C251263mp A0X(AnonymousClass3Y5 r24) {
        2V5 r1;
        2V5 r2;
        2V5 r10;
        Animator animator;
        C376459Ib r22;
        String str;
        AnonymousClass3Y5 r4 = r24;
        0qQ.A0B(r4, 0);
        2WX r8 = 2WX.A02;
        GNY gny = this.A05;
        2WX r5 = null;
        2WX A0Y = C51971G9r.A0Y(C51973G9u.A0P(C51974G9v.A0M((2WX) null, AnonymousClass05K.A00, 0, C51965G9l.A06(gny.A00)), (double) this.A00), AnonymousClass05K.A0j, 4, 0);
        boolean z = this.A0D;
        if (!(!z || !this.A0E || (r10 = this.A08) == null || (animator = this.A03) == null || (r22 = this.A04) == null || (str = this.A0B) == null)) {
            A0Y = A0Y.A00(GMY.A00.A01(animator, r22, r10, this.A0A, str, z));
        }
        if (!(!this.A0C || (r1 = this.A06) == null || (r2 = this.A07) == null)) {
            A0Y = A0Y.A00(C51971G9r.A0W(r2, C51971G9r.A0W(r1, (2WX) null, AnonymousClass05K.A0u), AnonymousClass05K.A15));
        }
        int i = this.A02;
        if (i > 0) {
            AnonymousClass9JQ A0b = C51965G9l.A0b(AnonymousClass05K.A0C, 0.0f, 1);
            if (A0Y != r8) {
                r5 = A0Y;
            }
            A0Y = C51965G9l.A0X(r5, A0b);
        }
        return new C244443bC(A0Y, this.A09, (ImageUrl) gny.A01, (AnonymousClass3NK) null, C51969G9p.A08(r4, 2Yu.A04(r4.A05.A0C)), i, this.A01, false, true, false);
    }

    public C52288GMe(Animator animator, C376459Ib r2, GNY gny, 2V5 r4, 2V5 r5, 2V5 r6, AnonymousClass0iw r7, UserSession userSession, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1U(userSession, gny, r7);
        this.A0A = userSession;
        this.A05 = gny;
        this.A09 = r7;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A0D = z;
        this.A0C = z2;
        this.A0E = z3;
        this.A08 = r4;
        this.A03 = animator;
        this.A04 = r2;
        this.A0B = str;
        this.A06 = r5;
        this.A07 = r6;
    }
}
