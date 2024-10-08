package com.instagram.direct.fragment.sharesheet.viewmodel;

import X.00k;
import X.02m;
import X.02z;
import X.05G;
import X.0Tu;
import X.0qQ;
import X.0sc;
import X.0sn;
import X.0sr;
import X.106;
import X.17i;
import X.182;
import X.19B;
import X.1Xj;
import X.2Fk;
import X.2YL;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0iw;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.BjZ;
import X.C226292g8;
import X.C229132mt;
import X.C250663lr;
import X.C290645fe;
import X.C291165gf;
import X.C318116oQ;
import X.C318136oS;
import X.C42828Bja;
import X.C42829Bjb;
import X.C47150DrR;
import X.C48091EVj;
import X.C48380Edb;
import X.C49327Eti;
import X.C49424EvQ;
import X.C49468Ew9;
import X.C50329FYj;
import X.C51151FpN;
import X.C61062Jw0;
import X.C66174MGl;
import X.C73657PhW;
import X.DbS;
import X.DbT;
import X.DbW;
import X.DbY;
import X.EJA;
import X.EQ5;
import X.EX2;
import X.ExY;
import X.FZ0;
import X.G2V;
import X.JVS;
import X.L88;
import X.MHI;
import X.QP5;
import X.T7O;
import X.UO1;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.mvvm.data.DirectShareSheetRecipientRepository;
import com.instagram.direct.fragment.sharesheet.util.DirectShareSheetApi;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class DirectShareSheetFragmentViewModel extends 2YL implements C229132mt {
    public int A00;
    public C290645fe A01;
    public AnonymousClass0iw A02;
    public 1Xj A03;
    public 1Xj A04;
    public String A05;
    public String A06;
    public String A07;
    public final 2Fk A08;
    public final 2Fk A09;
    public final 2Fk A0A;
    public final 2Fk A0B;
    public final 2Fk A0C;
    public final 2Fk A0D;
    public final 2Fk A0E;
    public final 2Fk A0F;
    public final 2Fk A0G;
    public final 2Fk A0H;
    public final 2Fk A0I;
    public final 2Fk A0J;
    public final 2Fk A0K;
    public final UserSession A0L;
    public final ExY A0M;
    public final DirectShareSheetRecipientRepository A0N;
    public final EQ5 A0O;
    public final DirectShareSheetApi A0P;
    public final L88 A0Q;
    public final FZ0 A0R;
    public final 17i A0S;
    public final T7O A0T;
    public final C49424EvQ A0U;
    public final AtomicBoolean A0V = new AtomicBoolean(false);
    public final AtomicBoolean A0W = new AtomicBoolean(false);
    public final AtomicBoolean A0X = new AtomicBoolean(false);
    public final AtomicReference A0Y = new AtomicReference((Object) null);
    public final 05G A0Z;
    public final 05G A0a;
    public final 05G A0b;
    public final 05G A0c;
    public final 05G A0d;
    public final 05G A0e;
    public final 05G A0f;
    public final 05G A0g;
    public final 05G A0h;
    public final 05G A0i;
    public final 05G A0j;
    public final 05G A0k;
    public final 05G A0l;
    public final 05G A0m;
    public final boolean A0n;
    public final boolean A0o;

    /* JADX WARNING: type inference failed for: r0v5, types: [X.L88, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.Etq, java.lang.Object] */
    public /* synthetic */ DirectShareSheetFragmentViewModel(UserSession userSession, ExY exY, DirectShareSheetApi directShareSheetApi, FZ0 fz0, 17i r9, boolean z, boolean z2) {
        DirectShareSheetRecipientRepository directShareSheetRecipientRepository = new DirectShareSheetRecipientRepository(userSession, directShareSheetApi);
        EQ5 eq5 = new EQ5(userSession);
        AnonymousClass7TG.A1P(userSession, r9);
        DbW.A1N(exY, 4, fz0);
        this.A0L = userSession;
        this.A0P = directShareSheetApi;
        this.A0S = r9;
        this.A0M = exY;
        this.A0R = fz0;
        this.A0n = z;
        this.A0o = z2;
        this.A0N = directShareSheetRecipientRepository;
        this.A0O = eq5;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ? obj = new Object();
        obj.A00 = null;
        obj.A02 = null;
        obj.A01 = null;
        obj.A03 = A1C;
        this.A0Q = obj;
        ? obj2 = new Object();
        obj2.A00 = false;
        02z A10 = DbS.A10(obj2);
        this.A0m = A10;
        19B r2 = 19B.A00;
        this.A0K = C226292g8.A00(r2, A10);
        02z A012 = 106.A01((Object) null);
        this.A0b = A012;
        this.A09 = C226292g8.A00(r2, A012);
        02z A013 = 106.A01((Object) null);
        this.A0l = A013;
        this.A0J = C226292g8.A00(r2, A013);
        02z A014 = 106.A01((Object) null);
        this.A0Z = A014;
        this.A08 = C226292g8.A00(r2, A014);
        02z A015 = 106.A01((Object) null);
        this.A0g = A015;
        this.A0E = C226292g8.A00(r2, A015);
        02z A016 = 106.A01((Object) null);
        this.A0k = A016;
        this.A0I = C226292g8.A00(r2, A016);
        02z A017 = 106.A01((Object) null);
        this.A0j = A017;
        this.A0H = C226292g8.A00(r2, A017);
        02z A102 = DbS.A10("");
        this.A0e = A102;
        this.A0C = C226292g8.A00(r2, A102);
        02z A018 = 106.A01((Object) null);
        this.A0i = A018;
        this.A0G = C226292g8.A00(r2, A018);
        02z A019 = 106.A01((Object) null);
        this.A0c = A019;
        this.A0A = C226292g8.A00(r2, A019);
        02z A0110 = 106.A01((Object) null);
        this.A0f = A0110;
        this.A0D = C226292g8.A00(r2, A0110);
        0sn r1 = 0sn.A00;
        02z A0111 = 106.A01(r1);
        this.A0h = A0111;
        this.A0F = C226292g8.A00(r2, A0111);
        this.A0a = DbS.A10(AnonymousClass7TE.A1C());
        02z A0112 = 106.A01(r1);
        this.A0d = A0112;
        this.A0B = C226292g8.A00(r2, A0112);
        this.A05 = "forwarding_recipient_sheet";
        this.A06 = "forwarding_recipient_sheet";
        this.A0U = new C49424EvQ(userSession);
        this.A0T = (T7O) userSession.A01(T7O.class, G2V.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: X.5g5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.Etq, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0C(X.C48091EVj r14, java.lang.String r15, X.AnonymousClass4D7 r16) {
        /*
            r13 = this;
            r10 = r15
            r7 = r14
            r3 = 34
            r4 = r16
            boolean r0 = X.MED.A04(r3, r4)
            if (r0 == 0) goto L_0x00c4
            r6 = r4
            X.MED r6 = (X.MED) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c4
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r6.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r9 = 0
            r4 = 1
            if (r0 == 0) goto L_0x008b
            if (r0 != r4) goto L_0x00cb
            java.lang.Object r7 = r6.A03
            java.lang.Object r10 = r6.A02
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r6.A01
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r8 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r8
            X.0eS.A00(r1)
        L_0x0033:
            r9 = r1
            X.5g5 r9 = (X.C290865g5) r9
            boolean r1 = r8.A0o
            if (r1 == 0) goto L_0x0052
            boolean r0 = A08(r8)
            if (r0 == 0) goto L_0x0052
            java.lang.String r2 = r9.A01
            java.util.List r1 = r9.A02
            X.L88 r0 = r8.A0Q
            java.util.List r0 = r0.A03
            A06(r8, r2, r1, r0)
        L_0x004b:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.A0X
            r0 = 0
            r1.set(r0)
        L_0x0051:
            return r9
        L_0x0052:
            if (r9 == 0) goto L_0x004b
            if (r1 == 0) goto L_0x006d
            java.util.List r0 = r9.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x006d
            X.6oS r0 = X.C318116oQ.A00(r8)
            r11 = 0
            r12 = 7
            X.MH6 r6 = new X.MH6
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.String) r10, (X.AnonymousClass4D7) r11, (int) r12)
            X.AnonymousClass7TE.A1Z(r6, r0)
            goto L_0x004b
        L_0x006d:
            X.2Fk r0 = r8.A0E
            java.lang.Object r1 = r0.A02()
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r0 = r9.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            r8.A0F(r1, r0)
            X.05G r1 = r8.A0g
            java.lang.String r0 = r9.A01
            r1.Epw(r0)
            X.05G r0 = r8.A0l
            r0.Epw(r9)
            goto L_0x004b
        L_0x008b:
            X.0eS.A00(r1)
            X.05G r1 = r13.A0m
            X.Etq r0 = new X.Etq
            r0.<init>()
            r0.A00 = r4
            r1.Epw(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.A0X
            boolean r0 = r0.getAndSet(r4)
            if (r0 != 0) goto L_0x0051
            com.instagram.common.session.UserSession r3 = r13.A0L
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313454566705160(0x8102e500040808, double:3.02811311830469E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00b2
            r9 = r15
        L_0x00b2:
            r6.A01 = r13
            r6.A02 = r15
            r6.A03 = r14
            r6.A00 = r4
            java.lang.Object r1 = A02(r13, r9, r6)
            if (r1 != r5) goto L_0x00c1
            return r5
        L_0x00c1:
            r8 = r13
            goto L_0x0033
        L_0x00c4:
            X.MED r6 = new X.MED
            r6.<init>(r13, r4, r3)
            goto L_0x001a
        L_0x00cb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel.A0C(X.EVj, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Etq, java.lang.Object] */
    public final void A0D(C48091EVj eVj, String str) {
        0qQ.A0B(str, 0);
        05G r2 = this.A0m;
        ? obj = new Object();
        obj.A00 = true;
        r2.Epw(obj);
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass7TE.A1Z(new C66174MGl((Object) this, (Object) eVj, str, (AnonymousClass4D7) null, 35), A002);
    }

    public final void A0E(C48091EVj eVj, String str, String str2, List list) {
        String str3 = str2;
        List list2 = list;
        DbY.A1S(list, str2);
        if (this.A0o && !list.isEmpty()) {
            AnonymousClass7TE.A1Z(new JVS(list2, eVj, this, str, str3, (AnonymousClass4D7) null, 5), C318116oQ.A00(this));
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDs, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r25, java.lang.String r26, java.lang.String r27, X.AnonymousClass4D7 r28, boolean r29, boolean r30) {
        /*
            r2 = r25
            r3 = r26
            r5 = r29
            r7 = 7
            r8 = r28
            boolean r0 = X.C66140MDs.A01(r7, r8)
            if (r0 == 0) goto L_0x025b
            r4 = r8
            X.MDs r4 = (X.C66140MDs) r4
            int r6 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r1
            if (r0 == 0) goto L_0x025b
            int r6 = r6 - r1
            r4.A00 = r6
        L_0x001d:
            java.lang.Object r6 = r4.A03
            X.1Hj r11 = X.1Hj.A02
            int r0 = r4.A00
            r9 = 3
            r12 = 2
            r10 = 1
            r18 = 0
            if (r0 == 0) goto L_0x0098
            if (r0 == r10) goto L_0x0172
            if (r0 == r12) goto L_0x0223
            if (r0 != r9) goto L_0x02d3
            boolean r5 = r4.A05
            java.lang.Object r3 = r4.A02
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r4.A01
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r2 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r2
            X.0eS.A00(r6)
        L_0x003d:
            X.3Ii r6 = (X.C239803Ii) r6
        L_0x003f:
            if (r5 == 0) goto L_0x004d
            X.FZ0 r0 = r2.A0R
            X.02m r4 = r0.A0C
            r1 = 13376502(0xcc1bf6, float:1.8744472E-38)
            java.lang.String r0 = "fetch_end"
            r4.markerPoint(r1, r0)
        L_0x004d:
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x02d2
            X.3Ih r6 = (X.C239793Ih) r6
            if (r6 == 0) goto L_0x02d2
            java.lang.Object r4 = r6.A00
            X.5gL r4 = (X.C290995gL) r4
            if (r4 == 0) goto L_0x02d2
            if (r5 == 0) goto L_0x0065
            java.util.List r0 = r4.A03
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x02d2
        L_0x0065:
            X.L88 r1 = r2.A0Q
            java.lang.String r0 = r4.A02
            r1.A01 = r0
            java.lang.String r0 = r2.A05
            r1.A00 = r0
            r1.A02 = r3
            java.util.List r7 = r1.A03
            X.5l3 r0 = r4.A00
            if (r0 == 0) goto L_0x027c
            java.util.List r0 = r0.A00
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.ArrayList r6 = X.DbV.A15(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0085:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0262
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.5gD r0 = (X.C290915gD) r0
            boolean r0 = r0.A0E
            X.DbV.A1U(r1, r6, r0)
            goto L_0x0085
        L_0x0098:
            X.0eS.A00(r6)
            if (r29 != 0) goto L_0x0154
            if (r30 == 0) goto L_0x0154
            r8 = 200(0xc8, float:2.8E-43)
        L_0x00a1:
            com.instagram.common.session.UserSession r6 = r2.A0L
            X.0Tu r7 = X.0Tu.A05
            r0 = 36320756010984256(0x81098900022340, double:3.0327305810673463E-306)
            boolean r0 = X.182.A06(r7, r6, r0)
            if (r0 == 0) goto L_0x014d
            r0 = 36602230987625060(0x82098900011264, double:3.210736489703748E-306)
            int r1 = X.DbS.A04(r7, r6, r0)
            java.lang.Integer r17 = new java.lang.Integer
            r0 = r17
            r0.<init>(r1)
            r0 = 36602230987559523(0x82098900001263, double:3.210736489662302E-306)
            int r1 = X.DbS.A04(r7, r6, r0)
            java.lang.Integer r16 = new java.lang.Integer
            r0 = r16
            r0.<init>(r1)
            java.util.HashMap r13 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "size"
            r0 = r17
            r13.put(r1, r0)
        L_0x00db:
            if (r29 == 0) goto L_0x00f8
            X.FZ0 r0 = r2.A0R
            X.02m r15 = r0.A0C
            r14 = 13376502(0xcc1bf6, float:1.8744472E-38)
            r0 = 1364(0x554, float:1.911E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r15.markerPoint(r14, r0)
            r1 = 0
            java.lang.String r0 = "count_per_page"
            r15.markerAnnotate(r14, r1, r0, r8)
            java.lang.String r0 = "is_real_time"
            r15.markerAnnotate(r14, r1, r0, r10)
        L_0x00f8:
            boolean r0 = A08(r2)
            r15 = r27
            if (r0 == 0) goto L_0x01b3
            r0 = 36313454566967307(0x8102e50008080b, double:3.0281131184704726E-306)
            boolean r0 = X.182.A06(r7, r6, r0)
            if (r0 == 0) goto L_0x01b3
            com.instagram.direct.fragment.sharesheet.mvvm.data.DirectShareSheetRecipientRepository r14 = r2.A0N
            java.lang.String r13 = r2.A05
            r0 = 36313454567098380(0x8102e5000a080c, double:3.0281131185533637E-306)
            boolean r29 = X.182.A06(r7, r6, r0)
            boolean r9 = r2.A0o
            r0 = 36876404520714348(0x8302e5000d006c, double:3.384124936037617E-306)
            java.lang.String r25 = X.182.A04(r7, r6, r0)
            r0 = 36594929543743467(0x8202e5000907eb, double:3.206119027192474E-306)
            int r28 = X.DbS.A04(r7, r6, r0)
            r4.A01 = r2
            r4.A02 = r3
            r4.A05 = r5
            r4.A00 = r10
            r26 = r4
            r27 = r8
            r30 = r9
            r19 = r14
            r20 = r17
            r21 = r16
            r22 = r13
            r23 = r3
            r24 = r15
            java.lang.Object r6 = r19.A01(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            if (r6 != r11) goto L_0x017f
            return r11
        L_0x014d:
            r17 = r18
            r16 = r18
            r13 = r18
            goto L_0x00db
        L_0x0154:
            com.instagram.common.session.UserSession r7 = r2.A0L
            X.0Tu r6 = X.0Tu.A05
            r0 = 36318234865113104(0x81073e00011810, double:3.03113619826659E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0167
            r8 = 12
            goto L_0x00a1
        L_0x0167:
            r0 = 36594929543546858(0x8202e5000607ea, double:3.2061190270681374E-306)
            int r8 = X.DbS.A04(r6, r7, r0)
            goto L_0x00a1
        L_0x0172:
            boolean r5 = r4.A05
            java.lang.Object r3 = r4.A02
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r4.A01
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r2 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r2
            X.0eS.A00(r6)
        L_0x017f:
            X.BvW r6 = (X.C43270BvW) r6
            if (r6 == 0) goto L_0x01af
            java.lang.Class<X.BvV> r4 = X.C43269BvV.class
            r0 = 153(0x99, float:2.14E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 846393017(0x3272eeb9, float:1.4140533E-8)
            X.3lr r1 = r6.A03(r4, r1, r0)
            if (r1 == 0) goto L_0x01ac
            java.lang.String r0 = "status"
            java.lang.String r1 = r1.getOptionalStringField(r12, r0)
        L_0x019a:
            java.lang.String r0 = "ok"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01af
            X.5gL r0 = X.D0S.A00(r6)
            X.3Ih r6 = X.C41845B3m.A0d(r0)
            goto L_0x003f
        L_0x01ac:
            r1 = r18
            goto L_0x019a
        L_0x01af:
            r6 = r18
            goto L_0x003f
        L_0x01b3:
            boolean r1 = A08(r2)
            java.lang.String r0 = r2.A05
            if (r1 == 0) goto L_0x0234
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            boolean r1 = r2.A0o
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            r4.A01 = r2
            r4.A02 = r3
            r4.A05 = r5
            r4.A00 = r12
            r7 = 0
            X.1NY r6 = X.AnonymousClass7TG.A0b(r6)
            java.lang.String r12 = "banyan/banyan_pg/"
            r6.A0A(r12)
            org.json.JSONArray r12 = new org.json.JSONArray
            r12.<init>(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "views"
            r6.A9m(r0, r12)
            java.lang.String r0 = "count_per_page"
            r6.A0C(r0, r8)
            java.lang.String r0 = "page_max_id"
            r6.A9m(r0, r15)
            java.lang.String r8 = "is_real_time"
            java.lang.String r0 = "true"
            r6.A9m(r8, r0)
            java.lang.Class<X.5gL> r8 = X.C290995gL.class
            java.lang.Class<X.5gM> r0 = X.C291005gM.class
            r6.A0Q(r8, r0)
            if (r26 == 0) goto L_0x0204
            java.lang.String r0 = "media_igid"
            r6.A9m(r0, r3)
        L_0x0204:
            if (r14 == 0) goto L_0x020b
            java.lang.String r0 = "is_private_share"
            r6.A0H(r0, r1)
        L_0x020b:
            if (r13 == 0) goto L_0x0216
            java.lang.String r1 = X.C290985gK.A02(r13)
            java.lang.String r0 = "IBCShareSheetParams"
            r6.A9m(r0, r1)
        L_0x0216:
            X.1OC r1 = r6.A0M()
            r0 = 623(0x26f, float:8.73E-43)
            java.lang.Object r6 = r1.A02(r4, r0, r9, r7)
            if (r6 != r11) goto L_0x0230
            return r11
        L_0x0223:
            boolean r5 = r4.A05
            java.lang.Object r3 = r4.A02
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r4.A01
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r2 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r2
            X.0eS.A00(r6)
        L_0x0230:
            X.3Ii r6 = (X.C239803Ii) r6
            goto L_0x003f
        L_0x0234:
            java.util.List r22 = X.AnonymousClass7TE.A1I(r0)
            boolean r0 = r2.A0o
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r0)
            r4.A01 = r2
            r4.A02 = r3
            r4.A05 = r5
            r4.A00 = r9
            r19 = r6
            r21 = r3
            r23 = r13
            r24 = r10
            X.1OC r1 = X.C290985gK.A01(r19, r20, r21, r22, r23, r24)
            r0 = 623(0x26f, float:8.73E-43)
            java.lang.Object r6 = r1.A00(r0, r4)
            if (r6 != r11) goto L_0x003d
            return r11
        L_0x025b:
            X.MDs r4 = new X.MDs
            r4.<init>(r2, r8, r7)
            goto L_0x001d
        L_0x0262:
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x026a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x027e
            java.lang.Object r0 = r1.next()
            X.5gD r0 = (X.C290915gD) r0
            java.lang.String r0 = r0.A09
            r3.add(r0)
            goto L_0x026a
        L_0x027c:
            X.0sn r3 = X.0sn.A00
        L_0x027e:
            r7.addAll(r3)
            X.5l3 r0 = r4.A00
            if (r0 == 0) goto L_0x02ba
            java.util.List r0 = r0.A01
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.ArrayList r6 = X.DbV.A15(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0293:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02a8
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            boolean r0 = r0.A2A()
            X.DbV.A1U(r1, r6, r0)
            goto L_0x0293
        L_0x02a8:
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x02b0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02bc
            X.DbY.A1W(r3, r1)
            goto L_0x02b0
        L_0x02ba:
            X.0sn r3 = X.0sn.A00
        L_0x02bc:
            r7.addAll(r3)
            X.5fe r0 = r2.A01
            if (r0 == 0) goto L_0x02c6
            r0.A04(r4, r5)
        L_0x02c6:
            X.05G r1 = r2.A0j
            java.lang.Boolean r0 = r4.A01
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r10)
            X.AnonymousClass7TF.A1O(r1, r0)
            return r4
        L_0x02d2:
            return r18
        L_0x02d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel.A01(com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel, java.lang.String, java.lang.String, X.4D7, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7 A[Catch:{ 3EF -> 0x00fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r11, java.lang.String r12, X.AnonymousClass4D7 r13) {
        /*
            r3 = 19
            boolean r0 = X.C66145MDx.A02(r3, r13)
            if (r0 == 0) goto L_0x002c
            r6 = r13
            X.MDx r6 = (X.C66145MDx) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A03
            X.1Hj r7 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r5) goto L_0x0032
            java.lang.Object r8 = r6.A02
            X.FYj r8 = (X.C50329FYj) r8
            java.lang.Object r11 = r6.A01
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r11 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r11
            goto L_0x00e3
        L_0x002c:
            X.MDx r6 = new X.MDx
            r6.<init>(r11, r13, r3)
            goto L_0x0016
        L_0x0032:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0037:
            X.0eS.A00(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0V
            boolean r0 = r0.getAndSet(r5)
            if (r0 != 0) goto L_0x0066
            com.instagram.common.session.UserSession r8 = r11.A0L
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313454566508550(0x8102e500010806, double:3.028113118180353E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = r11.A05
            java.lang.String r3 = "forwarding_recipient_sheet"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0083
            r0 = 36313454567229453(0x8102e5000c080d, double:3.028113118636255E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x0083
        L_0x0066:
            X.5fe r1 = r11.A01
            if (r1 == 0) goto L_0x0072
            java.lang.String r0 = r11.A05
            X.5g5 r7 = r1.A01(r0)
            if (r7 != 0) goto L_0x0082
        L_0x0072:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r1 = 0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            X.5g5 r7 = new X.5g5
            r7.<init>(r0, r4, r3)
        L_0x0082:
            return r7
        L_0x0083:
            boolean r0 = r11.A0o
            if (r0 == 0) goto L_0x00a1
            boolean r0 = A08(r11)
            if (r0 == 0) goto L_0x00a1
            r2 = 30000(0x7530, double:1.4822E-319)
        L_0x008f:
            X.6oS r9 = X.C318116oQ.A00(r11)
            r0 = 25
            X.MFW r1 = new X.MFW
            r1.<init>(r11, r12, r4, r0)
            X.19B r0 = X.19B.A00
            X.2Q8 r10 = X.1Eo.A02(r0, r1, r9)
            goto L_0x00c2
        L_0x00a1:
            java.lang.String r1 = r11.A05
            java.lang.String r0 = "story_share_sheet"
            java.lang.String[] r0 = new java.lang.String[]{r3, r0}
            java.util.Set r0 = X.0sc.A07(r0)
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00bf
            r0 = 36594929543284713(0x8202e5000207e9, double:3.206119026902356E-306)
            long r2 = X.182.A01(r2, r8, r0)
            goto L_0x008f
        L_0x00bf:
            r2 = 0
            goto L_0x008f
        L_0x00c2:
            X.FYj r8 = X.C48380Edb.A00(r8)     // Catch:{ 3EF -> 0x00fb }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ 3EF -> 0x00fb }
            boolean r9 = r8.A03     // Catch:{ 3EF -> 0x00fb }
            if (r9 == 0) goto L_0x00d0
            r8.A01 = r0     // Catch:{ 3EF -> 0x00fb }
        L_0x00d0:
            r1 = 7
            X.Pfm r0 = new X.Pfm     // Catch:{ 3EF -> 0x00fb }
            r0.<init>(r10, r4, r1)     // Catch:{ 3EF -> 0x00fb }
            r6.A01 = r11     // Catch:{ 3EF -> 0x00fb }
            r6.A02 = r8     // Catch:{ 3EF -> 0x00fb }
            r6.A00 = r5     // Catch:{ 3EF -> 0x00fb }
            java.lang.Object r0 = X.I3P.A00(r6, r0, r2)     // Catch:{ 3EF -> 0x00fb }
            if (r0 != r7) goto L_0x00e6
            goto L_0x0116
        L_0x00e3:
            X.0eS.A00(r1)     // Catch:{ 3EF -> 0x00fb }
        L_0x00e6:
            java.util.concurrent.atomic.AtomicReference r1 = r11.A0Y     // Catch:{ 3EF -> 0x00fb }
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()     // Catch:{ 3EF -> 0x00fb }
            r1.set(r0)     // Catch:{ 3EF -> 0x00fb }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ 3EF -> 0x00fb }
            boolean r0 = r8.A03     // Catch:{ 3EF -> 0x00fb }
            if (r0 == 0) goto L_0x0066
            r8.A00 = r1     // Catch:{ 3EF -> 0x00fb }
            goto L_0x0066
        L_0x00fb:
            java.util.concurrent.atomic.AtomicReference r1 = r11.A0Y
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.set(r0)
            com.instagram.common.session.UserSession r0 = r11.A0L
            X.FYj r3 = X.C48380Edb.A00(r0)
            long r1 = java.lang.System.currentTimeMillis()
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0066
            r3.A00 = r1
            goto L_0x0066
        L_0x0116:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel.A02(com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r22, java.lang.String r23, X.AnonymousClass4D7 r24) {
        /*
            r3 = r22
            r8 = 0
            r5 = 29
            r6 = r24
            boolean r0 = X.C66129MDh.A01(r5, r6)
            if (r0 == 0) goto L_0x00f5
            r4 = r6
            X.MDh r4 = (X.C66129MDh) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00f5
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001b:
            java.lang.Object r5 = r4.A02
            X.1Hj r9 = X.1Hj.A02
            int r0 = r4.A00
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0072
            if (r0 != r7) goto L_0x00fc
            java.lang.Object r3 = r4.A01
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r3 = (com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel) r3
            X.0eS.A00(r5)
        L_0x002e:
            X.BvW r5 = (X.C43270BvW) r5
            if (r5 == 0) goto L_0x0056
            java.lang.Class<X.BvV> r2 = X.C43269BvV.class
            r0 = 153(0x99, float:2.14E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 846393017(0x3272eeb9, float:1.4140533E-8)
            X.3lr r1 = r5.A03(r2, r1, r0)
            if (r1 == 0) goto L_0x0070
            java.lang.String r0 = "status"
            java.lang.String r1 = r1.A09(r0)
        L_0x0049:
            java.lang.String r0 = "ok"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0056
            X.5gL r8 = X.D0S.A00(r5)
            r6 = 1
        L_0x0056:
            X.FZ0 r0 = r3.A0R
            X.02m r2 = r0.A0C
            r1 = 13376502(0xcc1bf6, float:1.8744472E-38)
            java.lang.String r0 = "fetch_end"
            r2.markerPoint(r1, r0)
            if (r6 == 0) goto L_0x006d
            if (r8 == 0) goto L_0x006d
            X.5fe r0 = r3.A01
            if (r0 == 0) goto L_0x006d
            r0.A04(r8, r7)
        L_0x006d:
            X.0gF r9 = X.C60340gF.A00
            return r9
        L_0x0070:
            r1 = r8
            goto L_0x0049
        L_0x0072:
            X.0eS.A00(r5)
            com.instagram.common.session.UserSession r5 = r3.A0L
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320756010984256(0x81098900022340, double:3.0327305810673463E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x00f2
            r0 = 36602230987625060(0x82098900011264, double:3.210736489703748E-306)
            int r0 = X.DbS.A04(r2, r5, r0)
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r0)
            r0 = 36602230987559523(0x82098900001263, double:3.210736489662302E-306)
            int r0 = X.DbS.A04(r2, r5, r0)
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r0)
        L_0x00a0:
            X.FZ0 r0 = r3.A0R
            r10 = 200(0xc8, float:2.8E-43)
            X.02m r11 = r0.A0C
            r1 = 13376502(0xcc1bf6, float:1.8744472E-38)
            r0 = 1364(0x554, float:1.911E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r11.markerPoint(r1, r0)
            java.lang.String r0 = "count_per_page"
            r11.markerAnnotate(r1, r6, r0, r10)
            java.lang.String r0 = "is_real_time"
            r11.markerAnnotate(r1, r6, r0, r7)
            com.instagram.direct.fragment.sharesheet.mvvm.data.DirectShareSheetRecipientRepository r12 = r3.A0N
            java.lang.String r15 = r3.A05
            r0 = 36313454567098380(0x8102e5000a080c, double:3.0281131185533637E-306)
            boolean r22 = X.182.A06(r2, r5, r0)
            boolean r11 = r3.A0o
            r0 = 36876404520714348(0x8302e5000d006c, double:3.384124936037617E-306)
            java.lang.String r18 = X.182.A04(r2, r5, r0)
            r0 = 36594929543743467(0x8202e5000907eb, double:3.206119027192474E-306)
            int r21 = X.DbS.A04(r2, r5, r0)
            r4.A01 = r3
            r4.A00 = r7
            r16 = r23
            r23 = r11
            r19 = r4
            r20 = r10
            r17 = r8
            java.lang.Object r5 = r12.A01(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            if (r5 != r9) goto L_0x002e
            return r9
        L_0x00f2:
            r13 = r8
            r14 = r8
            goto L_0x00a0
        L_0x00f5:
            X.MDh r4 = new X.MDh
            r4.<init>(r3, r6, r5)
            goto L_0x001b
        L_0x00fc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel.A03(com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel, java.lang.String, X.4D7):java.lang.Object");
    }

    public static final String A04(DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel) {
        1Xj A1c;
        1Xj r3 = directShareSheetFragmentViewModel.A04;
        if (r3 == null) {
            return null;
        }
        if (!r3.A5D()) {
            return r3.A2n();
        }
        int i = directShareSheetFragmentViewModel.A0M.A00;
        if (i == -1 || (A1c = r3.A1c(i)) == null) {
            return null;
        }
        return A1c.A2n();
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [X.Etq, java.lang.Object] */
    public static final void A05(DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel, C42829Bjb bjb, String str) {
        EX2 ex2;
        C47150DrR drR;
        ImmutableList optionalCompactedTreeListField;
        DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel2 = directShareSheetFragmentViewModel;
        05G r3 = directShareSheetFragmentViewModel2.A0d;
        ArrayList A0U2 = 00k.A0U((Collection) r3.getValue());
        C42829Bjb bjb2 = bjb;
        String str2 = str;
        if (bjb == null) {
            drR = new C47150DrR((EX2) null, str2, (List) null);
        } else {
            0qQ.A0B(str2, 0);
            Class<C42828Bja> cls = C42828Bja.class;
            String A002 = AnonymousClass000.A00(1945);
            C250663lr A032 = bjb2.A03(cls, A002, 1677196193);
            ArrayList arrayList = null;
            if (A032 != null) {
                ex2 = (EX2) A032.getOptionalEnumField(0, AnonymousClass000.A00(1649), EX2.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            } else {
                ex2 = null;
            }
            C250663lr A033 = bjb2.A03(cls, A002, 1677196193);
            if (!(A033 == null || (optionalCompactedTreeListField = A033.getOptionalCompactedTreeListField(1, "prompts", BjZ.class, 237858497)) == null)) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = optionalCompactedTreeListField.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String optionalStringField = ((C250663lr) next).getOptionalStringField(0, "prompt_text");
                    if (optionalStringField != null && optionalStringField.length() > 0) {
                        A1C.add(next);
                    }
                }
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                Iterator it2 = A1C.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    String optionalStringField2 = ((C250663lr) next2).getOptionalStringField(0, "prompt_text");
                    if (optionalStringField2 != null) {
                        A1C2.add(new UO1((C61062Jw0) null, (QP5) null, (Integer) null, optionalStringField2, optionalStringField2, "", (String) null, i2));
                    }
                    i = i2;
                }
                arrayList = 00k.A0U(A1C2);
                if (DbT.A1b(arrayList)) {
                    arrayList.add(0, new UO1((C61062Jw0) null, (QP5) null, Integer.valueOf(R.drawable.instagram_icons_exceptions_genai_agent_profile_filled_24), "", "", "", (String) null, 0));
                }
            }
            drR = new C47150DrR(ex2, str2, arrayList);
        }
        A0U2.add(drR);
        r3.Epw(A0U2);
        05G r2 = directShareSheetFragmentViewModel2.A0m;
        ? obj = new Object();
        obj.A00 = false;
        r2.Epw(obj);
    }

    public static final void A06(DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel, String str, List list, List list2) {
        directShareSheetFragmentViewModel.A0F((String) directShareSheetFragmentViewModel.A0E.A02(), AnonymousClass7TE.A1b(list));
        directShareSheetFragmentViewModel.A0g.Epw(str);
        directShareSheetFragmentViewModel.A0b.Epw(new C49468Ew9(list, list2));
    }

    public static final boolean A07(DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel) {
        UserSession userSession = directShareSheetFragmentViewModel.A0L;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36324385258549309L) || 182.A06(r2, userSession, 36324385258745920L) || 182.A06(r2, userSession, 36324385258811457L)) {
            return true;
        }
        return false;
    }

    public static final boolean A08(DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel) {
        if (182.A06(0Tu.A05, directShareSheetFragmentViewModel.A0L, 36313454566770697L)) {
            if (!(!0sc.A07(new String[]{"forwarding_recipient_sheet", "story_share_sheet"}).contains(directShareSheetFragmentViewModel.A05))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A09(DirectShareSheetFragmentViewModel directShareSheetFragmentViewModel, User user) {
        UserSession userSession = directShareSheetFragmentViewModel.A0L;
        C49327Eti eti = (C49327Eti) userSession.A01(C49327Eti.class, new C73657PhW(userSession, 20));
        if (user.CPm()) {
            if (!182.A06(0Tu.A05, eti.A00, 36315541920550244L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final C51151FpN A0A() {
        ExY exY = this.A0M;
        if (exY instanceof EJA) {
            return ((EJA) exY).A00;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (X.182.A06(X.0Tu.A05, r4, 36328950808460997L) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        X.0qQ.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0B() {
        /*
            r5 = this;
            X.ExY r1 = r5.A0M
            X.2FW r2 = r1.A01
            X.Ekg r0 = X.C48818Ekg.$redex_init_class
            int r2 = r2.ordinal()
            r0 = 0
            switch(r2) {
                case 15: goto L_0x0097;
                case 16: goto L_0x008d;
                case 17: goto L_0x008d;
                case 19: goto L_0x0083;
                case 20: goto L_0x000f;
                case 28: goto L_0x005b;
                case 31: goto L_0x003f;
                case 32: goto L_0x0051;
                case 37: goto L_0x000f;
                case 46: goto L_0x000f;
                case 47: goto L_0x0048;
                case 49: goto L_0x000f;
                case 58: goto L_0x00a1;
                case 59: goto L_0x00a1;
                case 91: goto L_0x0045;
                case 97: goto L_0x006f;
                case 98: goto L_0x0065;
                case 101: goto L_0x0079;
                case 102: goto L_0x004b;
                case 107: goto L_0x0042;
                default: goto L_0x000e;
            }
        L_0x000e:
            return r0
        L_0x000f:
            boolean r1 = r5.A0G()
            if (r1 == 0) goto L_0x003c
            com.instagram.common.session.UserSession r4 = r5.A0L
            X.1Xj r3 = r5.A04
            if (r3 == 0) goto L_0x000e
            com.instagram.user.model.User r1 = r3.A2A(r4)
            r2 = 1
            if (r1 == 0) goto L_0x0029
            boolean r1 = r1.A2Q()
            if (r1 != r2) goto L_0x0029
            return r0
        L_0x0029:
            boolean r1 = r3.A5E()
            if (r1 == r2) goto L_0x000e
            X.0Tu r3 = X.0Tu.A05
            r1 = 36328950808460997(0x8110fd00003ec5, double:3.037913003989438E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x000e
        L_0x003c:
            X.1Xj r0 = r5.A04
            return r0
        L_0x003f:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectPotatoShareContentModel"
            goto L_0x004d
        L_0x0042:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectIfyContentShareContentModel"
            goto L_0x004d
        L_0x0045:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectSchoolShareContentModel"
            goto L_0x004d
        L_0x0048:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectCommentShareContentModel"
            goto L_0x004d
        L_0x004b:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectThreadShareLinksShareContentModel"
        L_0x004d:
            X.0qQ.A0C(r1, r0)
            return r1
        L_0x0051:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectLiveViewerInviteContentModel"
            X.0qQ.A0C(r1, r0)
            X.EJW r1 = (X.EJW) r1
            X.3uh r0 = r1.A00
            return r0
        L_0x005b:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectStoryShareContentModel"
            X.0qQ.A0C(r1, r0)
            X.EJY r1 = (X.EJY) r1
            X.3uh r0 = r1.A01
            return r0
        L_0x0065:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectChannelChallengeShareContentModel"
            X.0qQ.A0C(r1, r0)
            X.EJ6 r1 = (X.EJ6) r1
            com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo r0 = r1.A00
            return r0
        L_0x006f:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectInviteLinkShareContentModel"
            X.0qQ.A0C(r1, r0)
            X.EJE r1 = (X.EJE) r1
            com.instagram.direct.groupinvites.models.InviteLinkShareInfo r0 = r1.A00
            return r0
        L_0x0079:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectScreenshotAndInviteLinkShareContentModel"
            X.0qQ.A0C(r1, r0)
            X.EJM r1 = (X.EJM) r1
            com.instagram.direct.groupinvites.models.InviteLinkShareInfo r0 = r1.A00
            return r0
        L_0x0083:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectAIAgentContentModel"
            X.0qQ.A0C(r1, r0)
            X.EJ2 r1 = (X.EJ2) r1
            com.instagram.user.model.User r0 = r1.A00
            return r0
        L_0x008d:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectProfileCardContentModel"
            X.0qQ.A0C(r1, r0)
            X.EJT r1 = (X.EJT) r1
            com.instagram.user.model.User r0 = r1.A00
            return r0
        L_0x0097:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectProfileContentModel"
            X.0qQ.A0C(r1, r0)
            X.EJJ r1 = (X.EJJ) r1
            com.instagram.user.model.User r0 = r1.A00
            return r0
        L_0x00a1:
            boolean r0 = r1 instanceof X.EJ1
            if (r0 == 0) goto L_0x00aa
            X.EJ1 r1 = (X.EJ1) r1
            java.lang.String r0 = r1.A00
            return r0
        L_0x00aa:
            boolean r0 = r1 instanceof X.EJR
            if (r0 == 0) goto L_0x00b3
            X.EJR r1 = (X.EJR) r1
            java.lang.String r0 = r1.A00
            return r0
        L_0x00b3:
            boolean r0 = r1 instanceof X.EJ0
            if (r0 == 0) goto L_0x00bc
            X.EJ0 r1 = (X.EJ0) r1
            java.lang.String r0 = r1.A00
            return r0
        L_0x00bc:
            boolean r0 = r1 instanceof X.EJQ
            if (r0 == 0) goto L_0x00c5
            X.EJQ r1 = (X.EJQ) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x00c5:
            boolean r0 = r1 instanceof X.EJY
            if (r0 == 0) goto L_0x00ce
            X.EJY r1 = (X.EJY) r1
            java.lang.String r0 = r1.A02
            return r0
        L_0x00ce:
            boolean r0 = r1 instanceof X.EJP
            if (r0 == 0) goto L_0x00d7
            X.EJP r1 = (X.EJP) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x00d7:
            boolean r0 = r1 instanceof X.EJO
            if (r0 == 0) goto L_0x00e0
            X.EJO r1 = (X.EJO) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x00e0:
            boolean r0 = r1 instanceof X.EJN
            if (r0 == 0) goto L_0x00e9
            X.EJN r1 = (X.EJN) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x00e9:
            boolean r0 = r1 instanceof X.EJM
            if (r0 == 0) goto L_0x00f2
            X.EJM r1 = (X.EJM) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x00f2:
            boolean r0 = r1 instanceof X.C47827EIz
            if (r0 == 0) goto L_0x00fb
            X.EIz r1 = (X.C47827EIz) r1
            java.lang.String r0 = r1.A00
            return r0
        L_0x00fb:
            boolean r0 = r1 instanceof X.EJL
            if (r0 == 0) goto L_0x0104
            X.EJL r1 = (X.EJL) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x0104:
            boolean r0 = r1 instanceof X.EJX
            if (r0 == 0) goto L_0x010d
            X.EJX r1 = (X.EJX) r1
            java.lang.String r0 = r1.A03
            return r0
        L_0x010d:
            boolean r0 = r1 instanceof X.EJK
            if (r0 == 0) goto L_0x0116
            X.EJK r1 = (X.EJK) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x0116:
            boolean r0 = r1 instanceof X.EJJ
            if (r0 == 0) goto L_0x011f
            X.EJJ r1 = (X.EJJ) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x011f:
            boolean r0 = r1 instanceof X.EJT
            if (r0 == 0) goto L_0x0128
            X.EJT r1 = (X.EJT) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x0128:
            boolean r0 = r1 instanceof X.EJI
            if (r0 == 0) goto L_0x0131
            X.EJI r1 = (X.EJI) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x0131:
            boolean r0 = r1 instanceof X.EJH
            if (r0 == 0) goto L_0x013a
            X.EJH r1 = (X.EJH) r1
            java.lang.String r0 = r1.A00
            return r0
        L_0x013a:
            boolean r0 = r1 instanceof X.EJS
            if (r0 == 0) goto L_0x0143
            X.EJS r1 = (X.EJS) r1
            java.lang.String r0 = r1.A02
            return r0
        L_0x0143:
            boolean r0 = r1 instanceof X.C47826EIy
            if (r0 == 0) goto L_0x014c
            X.EIy r1 = (X.C47826EIy) r1
            java.lang.String r0 = r1.A00
            return r0
        L_0x014c:
            boolean r0 = r1 instanceof X.EJG
            if (r0 == 0) goto L_0x0155
            X.EJG r1 = (X.EJG) r1
            java.lang.String r0 = r1.A00
            return r0
        L_0x0155:
            boolean r0 = r1 instanceof X.EJW
            if (r0 == 0) goto L_0x015e
            X.EJW r1 = (X.EJW) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x015e:
            boolean r0 = r1 instanceof X.EJF
            if (r0 == 0) goto L_0x0167
            X.EJF r1 = (X.EJF) r1
            java.lang.String r0 = r1.A00
            return r0
        L_0x0167:
            boolean r0 = r1 instanceof X.EJE
            if (r0 == 0) goto L_0x0170
            X.EJE r1 = (X.EJE) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x0170:
            boolean r0 = r1 instanceof X.EJD
            if (r0 == 0) goto L_0x0179
            X.EJD r1 = (X.EJD) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x0179:
            boolean r0 = r1 instanceof X.EJC
            if (r0 == 0) goto L_0x0182
            X.EJC r1 = (X.EJC) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x0182:
            boolean r0 = r1 instanceof X.EJB
            if (r0 == 0) goto L_0x018b
            X.EJB r1 = (X.EJB) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x018b:
            boolean r0 = r1 instanceof X.EJA
            if (r0 == 0) goto L_0x0194
            X.EJA r1 = (X.EJA) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x0194:
            boolean r0 = r1 instanceof X.C47825EIx
            if (r0 == 0) goto L_0x019d
            X.EIx r1 = (X.C47825EIx) r1
            java.lang.String r0 = r1.A00
            return r0
        L_0x019d:
            boolean r0 = r1 instanceof X.EJV
            if (r0 == 0) goto L_0x01a6
            X.EJV r1 = (X.EJV) r1
            java.lang.String r0 = r1.A00
            return r0
        L_0x01a6:
            boolean r0 = r1 instanceof X.EJZ
            if (r0 == 0) goto L_0x01af
            X.EJZ r1 = (X.EJZ) r1
            java.lang.String r0 = r1.A00
            return r0
        L_0x01af:
            boolean r0 = r1 instanceof X.EJ9
            if (r0 == 0) goto L_0x01b8
            X.EJ9 r1 = (X.EJ9) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x01b8:
            boolean r0 = r1 instanceof X.EJU
            if (r0 == 0) goto L_0x01c1
            X.EJU r1 = (X.EJU) r1
            java.lang.String r0 = r1.A02
            return r0
        L_0x01c1:
            boolean r0 = r1 instanceof X.EJ8
            if (r0 == 0) goto L_0x01ca
            X.EJ8 r1 = (X.EJ8) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x01ca:
            boolean r0 = r1 instanceof X.EJ7
            if (r0 == 0) goto L_0x01d3
            X.EJ7 r1 = (X.EJ7) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x01d3:
            boolean r0 = r1 instanceof X.EJ6
            if (r0 == 0) goto L_0x01dc
            X.EJ6 r1 = (X.EJ6) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x01dc:
            boolean r0 = r1 instanceof X.EJ5
            if (r0 == 0) goto L_0x01e5
            X.EJ5 r1 = (X.EJ5) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x01e5:
            boolean r0 = r1 instanceof X.EJ4
            if (r0 == 0) goto L_0x01ee
            X.EJ4 r1 = (X.EJ4) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x01ee:
            boolean r0 = r1 instanceof X.EJ3
            if (r0 == 0) goto L_0x01f7
            X.EJ3 r1 = (X.EJ3) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x01f7:
            boolean r0 = r1 instanceof X.EJ2
            if (r0 == 0) goto L_0x0200
            X.EJ2 r1 = (X.EJ2) r1
            java.lang.String r0 = r1.A01
            return r0
        L_0x0200:
            java.lang.String r0 = r1.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel.A0B():java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Etq, java.lang.Object] */
    public final void A0F(String str, boolean z) {
        05G r2 = this.A0m;
        ? obj = new Object();
        obj.A00 = false;
        r2.Epw(obj);
        FZ0 fz0 = this.A0R;
        boolean z2 = this.A0o;
        UserSession userSession = this.A0L;
        long A012 = 182.A01(0Tu.A06, userSession, 36594929543284713L);
        02m r5 = fz0.A0C;
        r5.markerAnnotate(13376502, 0, "is_private_share", z2);
        r5.markerAnnotate(13376502, 0, "timeout_ms", A012);
        r5.markerPoint(13376502, "sharesheet_rendered");
        short s = 3;
        if (z) {
            s = 2;
        }
        r5.markerEnd(13376502, s);
        C50329FYj A002 = C48380Edb.A00(userSession);
        AnonymousClass0iw r3 = this.A02;
        if (r3 != null) {
            A002.A00(r3, Boolean.valueOf(z2), (Boolean) this.A0Y.getAndSet((Object) null), str, System.currentTimeMillis(), true);
            return;
        }
        0qQ.A0F("analyticsModule");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A0G() {
        1Xj r0 = this.A04;
        if (r0 != null && r0.CcK()) {
            return true;
        }
        1Xj r02 = this.A04;
        if (r02 == null || !r02.A54()) {
            return false;
        }
        return true;
    }

    public final void ACw() {
        if (!this.A0W.getAndSet(true)) {
            AnonymousClass7TE.A1Z(new MHI((Object) this, (AnonymousClass4D7) null, 0), C318116oQ.A00(this));
        }
    }

    public static final DirectShareTarget A00(User user, List list) {
        Iterator it = list.iterator();
        DirectShareTarget directShareTarget = null;
        while (it.hasNext()) {
            DirectShareTarget A0f2 = DbT.A0f(it);
            0qQ.A0B(A0f2, 1);
            if (A0f2.A0B().size() == 1 && A0f2.A0B().contains(user.getId())) {
                it.remove();
                directShareTarget = A0f2;
            }
        }
        if (directShareTarget == null) {
            return C291165gf.A01(user, (Boolean) null, (Double) null, (String) null);
        }
        return directShareTarget;
    }
}
