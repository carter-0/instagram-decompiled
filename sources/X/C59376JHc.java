package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JHc  reason: case insensitive filesystem */
public final class C59376JHc extends 0Yg implements 0sK {
    public final /* synthetic */ C61014JvE A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C62626Kix A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ 0sP A09;
    public final /* synthetic */ 0sP A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59376JHc(C61014JvE jvE, UserSession userSession, C62626Kix kix, String str, C62320sa r6, C62320sa r7, C62320sa r8, 0sP r9, 0sP r10, 0sP r11, 0sP r12, boolean z, boolean z2, boolean z3) {
        super(3);
        this.A0C = z;
        this.A00 = jvE;
        this.A01 = userSession;
        this.A03 = str;
        this.A0B = z2;
        this.A08 = r9;
        this.A09 = r10;
        this.A0D = z3;
        this.A0A = r11;
        this.A07 = r12;
        this.A02 = kix;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r8;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C59485JLj jLj;
        float f;
        float f2;
        C59485JLj jLj2;
        C59485JLj jLj3;
        C286575Wy r0 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(obj, 0);
        if ((A0M & 17) != 16 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1726028975, "com.instagram.aistudio.editor.AiSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AiSettingsScreen.kt:124)");
            }
            boolean z = this.A0C;
            C61014JvE jvE = this.A00;
            UserSession userSession = this.A01;
            String str = this.A03;
            boolean z2 = this.A0B;
            0sP r6 = this.A08;
            0sP r7 = this.A09;
            boolean z3 = this.A0D;
            0sP r13 = this.A0A;
            0sP r43 = this.A07;
            C62626Kix kix = this.A02;
            C62320sa r41 = this.A05;
            C62320sa r40 = this.A06;
            C62320sa r39 = this.A04;
            C285245Qk r11 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r0, 0);
            int A002 = C287425a7.A00(r0);
            C286565Wx r4 = (C286565Wx) r0;
            AnonymousClass5RM A042 = C286565Wx.A04(r4);
            Modifier A012 = C287435a8.A01(r0, r11);
            C51973G9u.A0z(r0, r4, C287485aD.A00);
            C51971G9r.A12(r0, A0Z, A042);
            0sL r5 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r5, A002);
            }
            C51965G9l.A18(r0, A012);
            if (z) {
                r0.ExS(1156119522);
                C54791HSy.A00(r0, (Modifier) null, C288035bG.A00(r0, 2131967976), 0, 1);
                C286565Wx.A0L(r4, false);
            } else {
                r0.ExS(1156240360);
                String str2 = jvE.A07;
                String A003 = C288035bG.A00(r0, 2131967976);
                int A013 = LST.A01(userSession);
                if (str2.length() > LST.A01(userSession)) {
                    jLj = new C53510Gpg(str);
                } else if (!C51966G9m.A1X(str2) || !z2) {
                    jLj = IPY.A00;
                } else {
                    jLj = IPW.A00;
                }
                C59485JLj jLj4 = jLj;
                boolean A1Y = C51967G9n.A1Y(r0, r6, 2115516697);
                Object ECw = r0.ECw();
                if (A1Y || ECw == AnonymousClass5XT.A00) {
                    ECw = new C66308MMr(r6, 49);
                    r0.FLL(ECw);
                }
                0sP r1 = (0sP) ECw;
                Boolean A0f = C51967G9n.A0f(r4, true);
                Integer valueOf = Integer.valueOf(A013);
                Integer valueOf2 = Integer.valueOf(R.drawable.instagram_arrow_cw_pano_outline_24);
                boolean A1Y2 = G9t.A1Y(r0, r7, userSession, 2115531053);
                Object ECw2 = r0.ECw();
                if (A1Y2 || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = G9w.A0u(r0, r7, userSession, 44);
                }
                I7P.A01((C287605aT) null, (I4S) null, (I23) null, r0, r11, jLj4, A0f, valueOf, valueOf2, str2, A003, (String) null, C51965G9l.A0y(r4, ECw2, false), r1, 0, 1, 1575936, 48, 10144, false);
                C286565Wx.A0L(r4, false);
            }
            if (z3) {
                r0.ExS(1157339713);
                f = 16.0f;
                f2 = 0.0f;
                C54791HSy.A00(r0, C287195Zj.A0B(r11, 0.0f, 16.0f, 0.0f, 0.0f), C288035bG.A00(r0, 2131952812), 6, 0);
                C286565Wx.A0L(r4, false);
            } else {
                r0.ExS(1157550110);
                String str3 = jvE.A09;
                String A004 = C288035bG.A00(r0, 2131952812);
                f = 16.0f;
                f2 = 0.0f;
                Modifier A0B2 = C287195Zj.A0B(r11, 0.0f, 16.0f, 0.0f, 0.0f);
                int A022 = LST.A02(userSession);
                if (str3.length() > LST.A02(userSession)) {
                    jLj2 = new C53510Gpg(str);
                } else if (!C51966G9m.A1X(str3) || !z2) {
                    jLj2 = IPY.A00;
                } else {
                    jLj2 = IPW.A00;
                }
                C59485JLj jLj5 = jLj2;
                boolean A1Y3 = C51967G9n.A1Y(r0, r13, 2115560642);
                Object ECw3 = r0.ECw();
                if (A1Y3 || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = C51975G9x.A0w(r0, r13, 0);
                }
                0sP r12 = (0sP) ECw3;
                Boolean A0f2 = C51967G9n.A0f(r4, true);
                Integer valueOf3 = Integer.valueOf(A022);
                Integer valueOf4 = Integer.valueOf(R.drawable.instagram_arrow_cw_pano_outline_24);
                boolean A1Y4 = C51967G9n.A1Y(r0, r7, 2115575287);
                Object ECw4 = r0.ECw();
                if (A1Y4 || ECw4 == AnonymousClass5XT.A00) {
                    ECw4 = G9w.A0r(r0, r7, 32);
                }
                I7P.A01((C287605aT) null, (I4S) null, (I23) null, r0, A0B2, jLj5, A0f2, valueOf3, valueOf4, str3, A004, (String) null, C51965G9l.A0y(r4, ECw4, false), r12, 0, 1, 1575936, 48, 10144, false);
                C286565Wx.A0L(r4, false);
            }
            String str4 = jvE.A06;
            String A005 = C288035bG.A00(r0, 2131952790);
            Modifier A092 = C287195Zj.A09(r11, f2, f);
            int A043 = DbS.A04(AnonymousClass7TF.A0H(userSession), userSession, 36605550998525190L);
            int A044 = DbS.A04(AnonymousClass7TF.A0H(userSession), userSession, 36605550998525190L);
            int A006 = LST.A00(userSession);
            if (str4.length() > LST.A00(userSession)) {
                jLj3 = new C53510Gpg(str);
            } else {
                00l.A0W(str4);
                jLj3 = IPY.A00;
            }
            C59485JLj jLj6 = jLj3;
            boolean A1Y5 = C51967G9n.A1Y(r0, r43, 2115596142);
            Object ECw5 = r0.ECw();
            if (A1Y5 || ECw5 == AnonymousClass5XT.A00) {
                ECw5 = C51975G9x.A0w(r0, r43, 1);
            }
            C286575Wy r16 = r0;
            C59485JLj jLj7 = jLj6;
            I7P.A06(r16, A092, jLj7, Integer.valueOf(A006), str4, A005, C51965G9l.A0z(r4, ECw5), A043, A044, 3072);
            C56629I5i.A01(r0, jvE, kix, r41, 0);
            r0.ExS(2115610496);
            if (jvE.A0L) {
                C54789HSw.A00(r0, (ImageUrl) null, C288035bG.A00(r0, 2131952714), (String) null, r40, 0, 6);
            }
            C286565Wx.A0L(r4, false);
            r0.ExS(2115617640);
            if (182.A06(DbS.A0J(userSession, 0), userSession, 36324076024311571L)) {
                C56629I5i.A02(r0, jvE, r39, 0);
            }
            if (C51971G9r.A1S(r0, r4, false)) {
                0fL.A00(-872493961);
            }
        } else {
            r0.Evl();
        }
        return C60340gF.A00;
    }
}
