package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2yw  reason: invalid class name and case insensitive filesystem */
public final class C234962yw implements C250603lj {
    public final AnonymousClass4DU A00;
    public final C229842oQ A01;
    public final C234902yq A02;
    public final C234932yt A03;
    public final 0sL A04;
    public final boolean A05;
    public final UserSession A06;
    public final boolean A07;

    public C234962yw(UserSession userSession, AnonymousClass4DU r3, C229842oQ r4, C234902yq r5, C234932yt r6, 0sL r7, boolean z, boolean z2) {
        0qQ.A0B(r4, 4);
        0qQ.A0B(r7, 7);
        this.A00 = r3;
        this.A06 = userSession;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A07 = z;
        this.A05 = z2;
    }

    public final void ATF(AnonymousClass30Y r13, C252093oY r14) {
        float f;
        Integer num;
        C254243sA r9;
        C229842oQ r3;
        AnonymousClass30Y r7 = r13;
        0qQ.A0B(r13, 0);
        C252093oY r8 = r14;
        0qQ.A0B(r14, 1);
        Integer CEk = r14.CEk(r13);
        0qQ.A07(CEk);
        int intValue = CEk.intValue();
        if (intValue == 0) {
            C234902yq r5 = this.A02;
            r3 = this.A01;
            r9 = r5.E4r(r13, r14, r3.B3I((String) this.A04.invoke(r13.A03, r13.A04)));
            if (!this.A05) {
                f = r14.CFe(r13);
            } else {
                f = 0.0f;
            }
            num = AnonymousClass05K.A00;
        } else if (intValue != 1) {
            C234902yq r52 = this.A02;
            C229842oQ r4 = this.A01;
            C254353sL EAj = r4.EAj(this.A00, A00(r7, r8, r52.E4s(r13, r14, r4.B3I((String) this.A04.invoke(r13.A03, r13.A04))), AnonymousClass05K.A01, 0.0f), "feed", true);
            if (EAj != null) {
                this.A03.A7J(EAj, r13, r14);
                return;
            }
            return;
        } else if (!this.A05) {
            C234902yq r53 = this.A02;
            r3 = this.A01;
            r9 = r53.E4t(r13, r14, r3.B3I((String) this.A04.invoke(r13.A03, r13.A04)));
            f = r14.CFe(r13);
            num = AnonymousClass05K.A0C;
        } else {
            return;
        }
        r3.EAj(this.A00, A00(r7, r8, r9, num, f), "feed", false);
    }

    private final C254263sC A00(AnonymousClass30Y r12, C252093oY r13, C254243sA r14, Integer num, float f) {
        long BlK = r13.BlK();
        return new C254263sC(r14, num, AnonymousClass05K.A0N, (String) this.A04.invoke(r12.A03, r12.A04), 0sn.A00, f, BlK, this.A07, true);
    }
}
