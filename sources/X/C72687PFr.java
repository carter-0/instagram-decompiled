package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.PFr  reason: case insensitive filesystem */
public final class C72687PFr implements C74463PvI {
    public int A00;
    public AnonymousClass2t9 A01;
    public 1a8 A02 = C66580MXl.A0O();
    public 2EM A03 = AnonymousClass4iZ.A00;
    public C43850CFq A04;
    public C71966Otr A05;
    public List A06 = AnonymousClass7TE.A1C();
    public boolean A07;
    public boolean A08;
    public NP9 A09;
    public C71965Otq A0A;
    public boolean A0B;
    public final Context A0C;
    public final AnonymousClass2tB A0D;
    public final AnonymousClass1aS A0E = 1aF.A00();
    public final UserSession A0F;
    public final C70751OJx A0G;
    public final OMG A0H;
    public final C70940OSn A0I;
    public final C322776wO A0J;
    public final Map A0K = AnonymousClass7TE.A1H();
    public final boolean A0L;
    public final AnonymousClass0iw A0M;
    public final C74398PuE A0N;
    public final C74491Pvl A0O;
    public final C70841ONs A0P;
    public final OH3 A0Q;
    public final C74350PtQ A0R;
    public final C70771OKr A0S;
    public final C70750OJw A0T;
    public final C70489O8o A0U;
    public final C70490O8p A0V;
    public final C70492O8r A0W;
    public final C70493O8s A0X;
    public final C70494O8t A0Y;
    public final C70496O8v A0Z;
    public final P3T A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;

    private final void A00(ViewModelListUpdate viewModelListUpdate) {
        boolean z = false;
        int A0A2 = AnonymousClass7TG.A0A(C51966G9m.A14(C271084hs.A00, this.A0K));
        C43850CFq cFq = this.A04;
        if (cFq != null) {
            z = cFq.A01;
        }
        viewModelListUpdate.A00(new C71976Ou1(A0A2, z, this.A08));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r5 != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00db, code lost:
        if (r0.A07() == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 <= 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(com.instagram.common.recyclerview.ViewModelListUpdate r12, boolean r13) {
        /*
            r11 = this;
            java.util.List r0 = r11.A06
            int r6 = r0.size()
            X.CFq r0 = r11.A04
            r4 = 0
            if (r0 == 0) goto L_0x0131
            long r1 = r0.A00
        L_0x000e:
            boolean r0 = r11.A0B
            if (r0 == 0) goto L_0x0021
            X.2EM r3 = r11.A03
            X.4iZ r0 = X.AnonymousClass4iZ.A00
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x0021
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r10 = 1
            if (r0 > 0) goto L_0x0022
        L_0x0021:
            r10 = 0
        L_0x0022:
            boolean r0 = r11.A0d
            if (r0 == 0) goto L_0x0044
            X.2EM r3 = r11.A03
            X.43H r0 = X.AnonymousClass43H.A00
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x0044
            java.util.Map r3 = r11.A0K
            X.MkM r0 = X.C67226MkM.A00
            java.lang.Number r0 = X.C51966G9m.A14(r0, r3)
            int r3 = X.AnonymousClass7TG.A0A(r0)
            X.Otj r0 = new X.Otj
            r0.<init>(r3)
            r12.A00(r0)
        L_0x0044:
            if (r6 <= 0) goto L_0x009b
            r7 = 0
            r9 = 0
        L_0x0048:
            java.util.List r0 = r11.A06
            java.lang.Object r8 = r0.get(r7)
            X.PwB r8 = (X.C74516PwB) r8
            X.3sy r0 = r8.CBV()
            java.lang.String r0 = X.C66647MaG.A0B(r0)
            if (r0 == 0) goto L_0x0135
            if (r10 == 0) goto L_0x006a
            if (r9 != 0) goto L_0x006a
            long r3 = r8.BKe()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x006a
            r11.A00(r12)
            r9 = 1
        L_0x006a:
            boolean r5 = X.C66640Ma9.A02(r8)
            X.OKr r4 = r11.A0S
            boolean r0 = r11.A08
            if (r0 == 0) goto L_0x0077
            r3 = 1
            if (r5 == 0) goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            boolean r0 = r11.A0L
            X.OuA r0 = r4.A00(r8, r7, r3, r0)
            r12.A00(r0)
            int r7 = r7 + 1
            if (r7 < r6) goto L_0x0048
            if (r9 != 0) goto L_0x009a
        L_0x0087:
            if (r10 == 0) goto L_0x009a
            X.OMG r1 = r11.A0H
            X.OeR r0 = r1.A00
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x009a
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x009a
        L_0x0097:
            r11.A00(r12)
        L_0x009a:
            return
        L_0x009b:
            if (r10 == 0) goto L_0x00a6
            X.OMG r0 = r11.A0H
            X.OeR r0 = r0.A00
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x00a6
            goto L_0x0097
        L_0x00a6:
            if (r13 == 0) goto L_0x0087
            X.2EM r0 = r11.A03
            X.43H r2 = X.AnonymousClass43H.A00
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x00bb
            com.instagram.common.session.UserSession r0 = r11.A0F
            boolean r0 = X.C272094k5.A01(r0)
            if (r0 == 0) goto L_0x00bb
            goto L_0x0087
        L_0x00bb:
            X.OMG r0 = r11.A0H
            boolean r1 = r0.A00()
            X.2EM r0 = r11.A03
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r1 != 0) goto L_0x0114
            if (r0 == 0) goto L_0x00f8
            com.instagram.common.session.UserSession r1 = r11.A0F
            com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager r0 = X.AnonymousClass92E.A00(r1)
            android.content.Context r4 = r11.A0C
            r3 = 1
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r0.A07()
            r2 = 1
            if (r0 != 0) goto L_0x00de
        L_0x00dd:
            r2 = 0
        L_0x00de:
            boolean r1 = X.2Iw.A00(r1)
            X.6wO r0 = r11.A0J
            X.72b r2 = X.C71053OaV.A03(r4, r0, r2, r1, r3)
        L_0x00e8:
            X.6rr r1 = X.C320156rr.EMPTY
            X.NPA r0 = new X.NPA
            r0.<init>(r2, r1)
            r12.A00(r0)
            X.OJx r0 = r11.A0G
            r0.A00()
            goto L_0x0087
        L_0x00f8:
            android.content.Context r4 = r11.A0C
            com.instagram.common.session.UserSession r3 = r11.A0F
            X.Otr r0 = r11.A05
            if (r0 == 0) goto L_0x010d
            X.NkF r2 = r0.A01
        L_0x0102:
            boolean r1 = X.2Iw.A00(r3)
            X.6wO r0 = r11.A0J
            X.72b r2 = X.C71053OaV.A01(r4, r3, r2, r0, r1)
            goto L_0x00e8
        L_0x010d:
            X.2EM r0 = r11.A03
            X.NkF r2 = X.C70889OQh.A00(r0)
            goto L_0x0102
        L_0x0114:
            android.content.Context r2 = r11.A0C
            com.instagram.common.session.UserSession r1 = r11.A0F
            if (r0 == 0) goto L_0x012a
            X.72b r2 = X.C71053OaV.A00(r2)
        L_0x011e:
            X.6rr r1 = X.C320156rr.ERROR
            X.NPA r0 = new X.NPA
            r0.<init>(r2, r1)
            r12.A00(r0)
            goto L_0x0087
        L_0x012a:
            X.OSn r0 = r11.A0I
            X.72b r2 = X.C71053OaV.A02(r2, r1, r0)
            goto L_0x011e
        L_0x0131:
            r1 = 0
            goto L_0x000e
        L_0x0135:
            java.lang.String r0 = "Thread id, Direct or Msys, should be always non null for permissions inbox"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72687PFr.A01(com.instagram.common.recyclerview.ViewModelListUpdate, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0.A01 != X.C69375NkF.A0G) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A02() {
        /*
            r4 = this;
            boolean r0 = r4.A0L
            r3 = 1
            if (r0 == 0) goto L_0x0010
            X.Otr r0 = r4.A05
            if (r0 == 0) goto L_0x0024
            X.NkF r1 = r0.A01
            X.NkF r0 = X.C69375NkF.A0G
            r2 = 1
            if (r1 == r0) goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            X.OMG r1 = r4.A0H
            X.OeR r0 = r1.A00
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x0022
            if (r2 != 0) goto L_0x0021
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            return r3
        L_0x0022:
            r3 = 0
            return r3
        L_0x0024:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72687PFr.A02():boolean");
    }

    public final void AF6() {
        ViewModelListUpdate A0R2 = DbS.A0R();
        OH3 oh3 = this.A0Q;
        AnonymousClass2bO.A00();
        AnonymousClass4AA A002 = MhW.A00(oh3.A00);
        if (A002 != null) {
            A0R2.A00(A002);
        }
        C232262tL r1 = this.A09;
        if ((r1 != null && this.A07) || ((r1 = this.A0A) != null && this.A07)) {
            A0R2.A00(r1);
        }
        C71966Otr otr = this.A05;
        if (otr != null) {
            A0R2.A00(otr);
        }
        if (this.A0f) {
            UserSession userSession = this.A0F;
            if (C272094k5.A0A(userSession, true)) {
                A0R2.A00(new C71959Otk(00k.A0a(C2612048r.A00(this.A0P.A00).A00)));
            }
            Context context = this.A0C;
            Map map = this.A0K;
            ArrayList A0q = AnonymousClass7TF.A0q(map, 2);
            Iterator it = new C70841ONs(userSession).A02().iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                2EM r6 = (2EM) it.next();
                int A0A2 = AnonymousClass7TG.A0A(C51966G9m.A14(r6, map));
                int i = 100;
                if (0qQ.A0K(r6, AnonymousClass43H.A00)) {
                    i = 20;
                }
                String A003 = C66786McX.A00(context, userSession, r6);
                int i2 = A0A2;
                if (A0A2 > i) {
                    i2 = i;
                }
                if (A0A2 <= i) {
                    z = false;
                }
                A0q.add(new C66787McY(r6, A003, i2, z));
            }
            A0R2.A00(new C66788McZ(AnonymousClass4iZ.A00, A0q, true));
            if (!this.A06.isEmpty()) {
                2EM r12 = this.A03;
                if (r12.equals(C67225MkL.A00) || r12.equals(C67226MkM.A00) || (r12.equals(AnonymousClass43H.A00) && !C272094k5.A01(userSession))) {
                    A0R2.A00(new C71960Otl(r12));
                }
            }
        }
        if (this.A0e) {
            OMG omg = this.A0H;
            if (!omg.A01() && this.A06.isEmpty()) {
                A0R2.A00(new C71975Ou0(AnonymousClass7TE.A16(this.A0C, 2131959958), this.A00, !this.A08));
            }
            A01(A0R2, A02());
            C71153OeR oeR = omg.A00;
            if ((!oeR.A0G || !oeR.A0F) && omg.A01() && !omg.A00()) {
                A0R2.A00(new C68603NOz(this.A06.isEmpty()));
            }
            if (omg.A01() || AnonymousClass7TE.A1b(this.A06)) {
                A0R2.A00(new C71975Ou0(AnonymousClass7TE.A16(this.A0C, 2131959960), this.A00, !this.A08));
            }
        } else {
            A01(A0R2, A02());
        }
        this.A0E.accept(A0R2);
    }

    public final ImmutableList AMu() {
        Object nob;
        ImmutableList.Builder builder = ImmutableList.builder();
        OH3 oh3 = this.A0Q;
        1YN A002 = AnonymousClass2bO.A00();
        UserSession userSession = oh3.A04;
        C231002qi r1 = oh3.A01;
        if (r1 == null) {
            0qQ.A0F("quickPromotionPresenter");
            throw AnonymousClass00P.createAndThrow();
        }
        builder.addAll(A002.A05(oh3.A03, userSession, r1));
        if (!this.A0c) {
            boolean z = this.A0b;
            C70750OJw oJw = this.A0T;
            if (z) {
                nob = new NOA(oJw);
            } else {
                nob = new NOB(oJw);
            }
            builder.add(nob);
        }
        if (this.A0L) {
            builder.add(new NOF(this.A0Z));
        }
        C69375NkF nkF = null;
        if (this.A0f) {
            UserSession userSession2 = this.A0F;
            if (C272094k5.A0A(userSession2, true)) {
                builder.add(new NOO(this.A0C, this.A0X));
            }
            builder.add(new C67168MjQ(userSession2, this.A0O));
            builder.add(new NOH(this.A0R));
            if (this.A0d) {
                builder.add(new NOC(this.A0Y));
            }
            if (this.A0B) {
                builder.add(new NOG(this.A0W));
            }
        }
        builder.add(new Object());
        if (this.A0e) {
            UserSession userSession3 = this.A0F;
            AnonymousClass0iw r2 = this.A0M;
            C70489O8o o8o = this.A0U;
            C71966Otr otr = this.A05;
            if (otr != null) {
                nkF = otr.A01;
            }
            builder.add(new NOX(r2, userSession3, nkF, o8o));
            builder.add(new NOD(this.A0V));
        }
        Context context = this.A0C;
        UserSession userSession4 = this.A0F;
        builder.add(new C68578NOa(context, this.A0M, userSession4, this.A0N, this.A0a));
        return DbZ.A0K(builder);
    }

    public final void ENv(AnonymousClass2t9 r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00ed, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36317161123353392L) == false) goto L_0x00ef;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C72687PFr(android.content.Context r27, X.AnonymousClass0iw r28, X.AnonymousClass2tB r29, com.instagram.common.session.UserSession r30, X.C74398PuE r31, X.C74491Pvl r32, X.C69375NkF r33, X.OH3 r34, X.C74350PtQ r35, X.C70771OKr r36, X.C70750OJw r37, X.C70489O8o r38, X.C70490O8p r39, X.C70751OJx r40, X.C70492O8r r41, X.C70493O8s r42, X.C70494O8t r43, X.OMG r44, X.C70496O8v r45, X.P3T r46, X.C70940OSn r47, X.C322776wO r48, boolean r49, boolean r50, boolean r51) {
        /*
            r26 = this;
            r1 = 1
            r10 = r27
            r8 = r30
            X.AnonymousClass7TF.A1B(r10, r1, r8)
            r3 = 3
            r9 = r28
            X.0qQ.A0B(r9, r3)
            r16 = r44
            r21 = r34
            r2 = r16
            r0 = r21
            X.AnonymousClass7TG.A1S(r0, r2)
            r4 = r48
            r5 = r47
            r6 = r46
            r24 = r31
            r0 = r24
            X.C51974G9v.A1Q(r6, r0, r4, r5)
            r2 = 12
            r14 = r45
            r22 = r33
            r0 = r22
            X.C51969G9p.A1O(r0, r2, r14)
            r7 = 14
            r19 = r37
            r18 = r40
            r2 = r18
            r0 = r19
            X.C51969G9p.A1R(r2, r7, r0)
            r0 = 18
            r13 = r38
            r12 = r39
            X.C66581MXm.A1P(r13, r0, r12)
            r2 = 20
            r20 = r35
            r0 = r20
            X.0qQ.A0B(r0, r2)
            r15 = 21
            r7 = r41
            r17 = r42
            r25 = r29
            r23 = r32
            r11 = r25
            r2 = r23
            r0 = r17
            X.C66583MXo.A0q(r15, r7, r11, r2, r0)
            r2 = 26
            r15 = r43
            X.0qQ.A0B(r15, r2)
            r11 = r26
            r11.<init>()
            X.1aS r0 = X.1aF.A00()
            r11.A0E = r0
            X.1a8 r0 = X.C66580MXl.A0O()
            r11.A02 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r11.A06 = r0
            X.4iZ r0 = X.AnonymousClass4iZ.A00
            r11.A03 = r0
            java.util.LinkedHashMap r0 = X.AnonymousClass7TE.A1H()
            r11.A0K = r0
            X.ONs r0 = new X.ONs
            r0.<init>(r8)
            r11.A0P = r0
            boolean r2 = X.C272094k5.A06(r8)
            r11.A0C = r10
            r11.A0F = r8
            r11.A0M = r9
            r0 = r21
            r11.A0Q = r0
            r11.A0a = r6
            r0 = r24
            r11.A0N = r0
            r11.A0Z = r14
            r0 = r19
            r11.A0T = r0
            r11.A0U = r13
            r11.A0V = r12
            r0 = r36
            r11.A0S = r0
            r0 = r49
            r11.A08 = r0
            r11.A0L = r2
            r6 = 0
            boolean r0 = X.C272094k5.A0C(r8, r1)
            r11.A0f = r0
            r0 = r50
            r11.A0e = r0
            r11.A0J = r4
            r11.A0I = r5
            r0 = r16
            r11.A0H = r0
            r0 = r20
            r11.A0R = r0
            r11.A0W = r7
            r0 = r25
            r11.A0D = r0
            com.instagram.user.model.User r0 = X.DbT.A0j(r8)
            boolean r0 = X.2Ek.A01(r0)
            if (r0 == 0) goto L_0x00ef
            X.0Tu r4 = X.0Tu.A05
            r0 = 36317161123353392(0x81064400021330, double:3.0304571596541373E-306)
            boolean r0 = X.182.A06(r4, r8, r0)
            r1 = 1
            if (r0 != 0) goto L_0x00f0
        L_0x00ef:
            r1 = 0
        L_0x00f0:
            r11.A0c = r1
            r0 = r17
            r11.A0X = r0
            if (r1 != 0) goto L_0x0123
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r8)
            boolean r0 = X.2Ek.A03(r0)
            r0 = r0 ^ 1
            r11.A0b = r0
            if (r0 == 0) goto L_0x0143
            X.Ocn r0 = new X.Ocn
            r0.<init>(r9, r8, r6)
            r0.A04(r3)
            r0 = 2131959942(0x7f132086, float:1.9556539E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r10, r0)
            r0 = 2131959940(0x7f132084, float:1.9556535E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r10, r0)
            X.NP9 r0 = new X.NP9
            r0.<init>(r3, r1)
            r11.A09 = r0
        L_0x0123:
            r0 = r18
            r11.A0G = r0
            r0 = r23
            r11.A0O = r0
            if (r2 == 0) goto L_0x0134
            X.Otr r6 = new X.Otr
            r0 = r22
            r6.<init>(r8, r0)
        L_0x0134:
            r11.A05 = r6
            boolean r0 = X.C272094k5.A07(r8)
            r11.A0B = r0
            r0 = r51
            r11.A0d = r0
            r11.A0Y = r15
            return
        L_0x0143:
            r0 = 2131959942(0x7f132086, float:1.9556539E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r10, r0)
            r0 = 2131959939(0x7f132083, float:1.9556533E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r10, r0)
            X.Otq r0 = new X.Otq
            r0.<init>(r3, r1)
            r11.A0A = r0
            goto L_0x0123
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72687PFr.<init>(android.content.Context, X.0iw, X.2tB, com.instagram.common.session.UserSession, X.PuE, X.Pvl, X.NkF, X.OH3, X.PtQ, X.OKr, X.OJw, X.O8o, X.O8p, X.OJx, X.O8r, X.O8s, X.O8t, X.OMG, X.O8v, X.P3T, X.OSn, X.6wO, boolean, boolean, boolean):void");
    }
}
