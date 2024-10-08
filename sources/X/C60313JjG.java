package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.JjG  reason: case insensitive filesystem */
public final class C60313JjG extends 2YL {
    public final CallerContext A00 = CallerContext.A01("FeedXpostViewModel");
    public final UserSession A01;
    public final LE1 A02;
    public final C363378jd A03;
    public final C347407wl A04;
    public final 05G A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;
    public final 1wn A09;
    public final 1wn A0A;
    public final 1wn A0B;
    public final KO3 A0C;
    public final 1Av A0D;

    public C60313JjG(UserSession userSession, LE1 le1, KO3 ko3, C363378jd r21, C347407wl r22, 1Av r23) {
        UserSession userSession2 = userSession;
        KO3 ko32 = ko3;
        AnonymousClass7TF.A1B(userSession2, 1, ko32);
        C363378jd r7 = r21;
        0qQ.A0B(r7, 3);
        C347407wl r4 = r22;
        1Av r0 = r23;
        DbW.A1O(r0, 4, r4);
        this.A01 = userSession2;
        this.A0C = ko32;
        this.A03 = r7;
        this.A0D = r0;
        LE1 le12 = le1;
        this.A02 = le12;
        this.A04 = r4;
        02z A10 = DbS.A10(new C60995Jur((C299935wF) null, (C48153EZv) null, (String) null, false, false, false, false));
        this.A05 = A10;
        this.A07 = A10;
        02z A102 = DbS.A10(new JU0(le12, (MXB) null, 0, A03(this), true));
        this.A06 = A102;
        this.A08 = A102;
        C64698LgT A002 = C64698LgT.A00(this, 51);
        this.A09 = A002;
        C64698LgT A003 = C64698LgT.A00(this, 52);
        this.A0A = A003;
        C64698LgT A004 = C64698LgT.A00(this, 53);
        this.A0B = A004;
        if (LTP.A09(userSession2)) {
            1Ng A005 = AnonymousClass1Nd.A00(userSession2);
            A005.A01(A002, C64661Lfn.class);
            A005.A01(A003, C64652Lfe.class);
            A005.A01(A004, C64647LfZ.class);
            A00(this);
            C318136oS A006 = C318116oQ.A00(this);
            MH9 mh9 = new MH9(this, (AnonymousClass4D7) null, 3);
            19B r1 = 19B.A00;
            MH9.A03(this, r1, C51967G9n.A0M(this, r1, mh9, A006), 4);
            r4.A01();
        }
    }

    public static final void A00(C60313JjG jjG) {
        Object value;
        C60995Jur jur;
        boolean z;
        boolean z2;
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        UserSession userSession = jjG.A01;
        boolean z3 = false;
        if (!AnonymousClass5w9.A00(userSession).A0C(userSession) && C48153EZv.A05.A07(userSession) && C363558jv.A00(userSession)) {
            z3 = true;
        }
        05G r2 = jjG.A05;
        do {
            value = r2.getValue();
            jur = (C60995Jur) value;
            z = jur.A06;
            z2 = jur.A04;
        } while (!r2.AIY(value, new C60995Jur(jur.A00, jur.A01, jur.A02, z, z2, z3, jur.A05)));
    }

    public static final void A01(C60313JjG jjG) {
        Object value;
        C60995Jur jur;
        boolean A0C2;
        boolean z;
        boolean z2;
        05G r4 = jjG.A05;
        do {
            value = r4.getValue();
            jur = (C60995Jur) value;
            AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
            UserSession userSession = jjG.A01;
            A0C2 = AnonymousClass5w9.A00(userSession).A0C(userSession);
            z = jur.A06;
            z2 = jur.A04;
        } while (!r4.AIY(value, new C60995Jur(jur.A00, jur.A01, jur.A02, z, z2, jur.A03, A0C2)));
    }

    public static final void A02(C60313JjG jjG, boolean z) {
        Object value;
        JU0 ju0;
        boolean A032;
        MXB mxb;
        LE1 le1;
        05G r3 = jjG.A06;
        do {
            value = r3.getValue();
            ju0 = (JU0) value;
            A032 = A03(jjG);
            mxb = (MXB) ju0.A02;
            le1 = (LE1) ju0.A03;
            0qQ.A0B(le1, 1);
        } while (!r3.AIY(value, new JU0(le1, mxb, ju0.A01 + 1, A032, z)));
    }

    public static final boolean A03(C60313JjG jjG) {
        MXB CGy;
        String id;
        if (!AnonymousClass7TF.A1Y(DbS.A0h(jjG.A01, AnonymousClass0t1.A01).BBj(), false)) {
            return false;
        }
        C347407wl r1 = jjG.A04;
        if (!r1.A00) {
            return false;
        }
        C347427wn r0 = (C347427wn) r1.A02.getValue();
        if (r0 == null || (CGy = r0.CGy()) == null || (id = CGy.getId()) == null || id.length() == 0) {
            return true;
        }
        return false;
    }

    public final void A04() {
        KO3 ko3 = this.A0C;
        AnonymousClass3Q2 r5 = ko3.A00;
        if (r5 != null) {
            C61075JwD A022 = ko3.A02();
            LNP lnp = LNP.A00;
            UserSession userSession = this.A01;
            LE1 le1 = this.A02;
            Integer A002 = lnp.A00(userSession, r5, le1.A02, le1.A03, AnonymousClass7TF.A1V(A022.A08));
            0qQ.A0B(A002, 0);
            le1.A01 = A002;
            A02(this, AnonymousClass7TF.A1W(A002, AnonymousClass05K.A00));
        }
    }

    public final void onCleared() {
        1Ng A002 = AnonymousClass1Nd.A00(this.A01);
        A002.A02(this.A09, C64661Lfn.class);
        A002.A02(this.A0A, C64652Lfe.class);
        A002.A02(this.A0B, C64647LfZ.class);
    }
}
