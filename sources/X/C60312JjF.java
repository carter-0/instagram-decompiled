package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.user.model.User;

/* renamed from: X.JjF  reason: case insensitive filesystem */
public final class C60312JjF extends 2YL {
    public LEQ A00;
    public String A01;
    public boolean A02;
    public C262204Co A03;
    public boolean A04;
    public final int A05;
    public final 2cc A06;
    public final AnonymousClass0iw A07;
    public final UserSession A08;
    public final C357638Yz A09;
    public final C339737k5 A0A;
    public final C273004lm A0B;
    public final C339657jx A0C;
    public final MonetizationRepository A0D;
    public final 1Av A0E;
    public final User A0F;
    public final 17i A0G;
    public final 1pS A0H;
    public final C249513ju A0I;
    public final AnonymousClass0r6 A0J;
    public final 05G A0K;
    public final 05G A0L = DbS.A10(false);
    public final 05G A0M = DbS.A10(false);
    public final 05G A0N = DbS.A10(false);
    public final 05G A0O = DbS.A10(false);
    public final 05G A0P = JTQ.A0r(0);
    public final 05G A0Q = DbS.A10(Double.valueOf(0.0d));
    public final 05G A0R;
    public final 05G A0S;
    public final AnonymousClass0Ud A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final Context A0b;
    public final boolean A0c;

    private final void A00() {
        C51970G9q.A1S(this.A03);
        LEQ leq = this.A00;
        this.A03 = AnonymousClass11O.A03(C318116oQ.A00(this), new MC1(2, this, JTS.A1b(new AnonymousClass0Ud[]{leq.A0A, this.A0Q, leq.A0J, leq.A0C, this.A0N, this.A0O, this.A0M, this.A0L, this.A0R, this.A0S, leq.A0H, leq.A0B, this.A0P})));
    }

    public static final void A01(AnonymousClass3NV r2, C60312JjF jjF) {
        if (r2 != AnonymousClass3NV.A08) {
            LEQ leq = jjF.A00;
            0qQ.A0B(r2, 0);
            C66169MGg.A01(r2, jjF, JTP.A0K(jjF, r2, leq.A00), 32);
            AnonymousClass7TF.A1O(jjF.A0M, jjF.A0W);
        }
    }

    public static final void A02(C60312JjF jjF) {
        if (jjF.A0c) {
            jjF.A00 = C357488Yc.A03.A00(jjF.A0b, jjF.A08).A01();
            jjF.A00();
        }
        if (!jjF.A04) {
            MGU.A02(jjF, C318116oQ.A00(jjF), 21);
            A01((AnonymousClass3NV) jjF.A00.A0A.getValue(), jjF);
            jjF.A04 = true;
        }
    }

    public static final void A03(C60312JjF jjF) {
        MGU.A02(jjF, C318116oQ.A00(jjF), 29);
        jjF.A0Q.Epw(Double.valueOf(0.0d));
        05G r0 = jjF.A0L;
        Boolean A0u = AnonymousClass7TE.A0u();
        r0.Epw(A0u);
        jjF.A0N.Epw(A0u);
    }

    public C60312JjF(Context context, 2cc r5, AnonymousClass0iw r6, UserSession userSession, C357638Yz r8, C339737k5 r9, C273004lm r10, C339657jx r11, MonetizationRepository monetizationRepository, 1Av r13, User user, 17i r15, 1pS r16, LEQ leq, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        LEQ leq2 = leq;
        C51974G9v.A1P(leq2, monetizationRepository, r8, context);
        C51969G9p.A1N(r6, 6, r11);
        0qQ.A0B(r13, 12);
        C51969G9p.A1P(r15, 13, r10);
        0qQ.A0B(r9, 15);
        this.A00 = leq2;
        this.A0D = monetizationRepository;
        this.A09 = r8;
        this.A0b = context;
        this.A08 = userSession;
        this.A07 = r6;
        this.A0F = user;
        this.A05 = i;
        this.A0H = r16;
        this.A0C = r11;
        this.A06 = r5;
        this.A0E = r13;
        this.A0G = r15;
        this.A0B = r10;
        this.A0A = r9;
        this.A0a = z;
        this.A0V = z2;
        this.A0Y = z3;
        this.A0U = z4;
        this.A0X = z5;
        this.A0Z = z6;
        this.A0W = z7;
        this.A0c = z8;
        this.A0R = JTQ.A0s(AnonymousClass7TF.A1V(r11.A00));
        this.A0S = 106.A01(r11.A00(userSession));
        1HR A1G = JTO.A1G(0);
        this.A0I = A1G;
        this.A0J = 0u9.A04(A1G);
        02z A012 = 106.A01((Object) null);
        this.A0K = A012;
        this.A0T = 10b.A03(A012);
        A00();
    }
}
