package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.rtc.RtcCallKey;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Neo  reason: case insensitive filesystem */
public final class C69109Neo extends C71135OdY {
    public N93 A00;
    public String A01;
    public List A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = AnonymousClass7TF.A1Z(this.A0Z);
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public N93 A0E;
    public Long A0F;
    public boolean A0G;
    public final Activity A0H;
    public final Context A0I;
    public final AnonymousClass0iw A0J;
    public final UserSession A0K;
    public final C71078Oax A0L;
    public final OMP A0M;
    public final 1Av A0N;
    public final 1a0 A0O;
    public final OKY A0P;
    public final C71111Ocu A0Q;
    public final C70942OSp A0R;
    public final OLG A0S;
    public final C70516O9p A0T;
    public final C74578PxR A0U;
    public final OVG A0V;
    public final OZx A0W;
    public final AnonymousClass0eM A0X = C73906Plh.A00(this, 9);
    public final AnonymousClass0eM A0Y = C73906Plh.A00(this, 10);
    public final AnonymousClass0eM A0Z = C73906Plh.A00(this, 11);

    public static final void A03(C69109Neo neo, boolean z) {
        C68295N9i n9i;
        boolean z2 = z;
        neo.A04 = z;
        C68295N9i n9i2 = (C68295N9i) neo.A01;
        if (n9i2 != null) {
            n9i = C68295N9i.A00((C74438Put) null, (ImageUrl) null, n9i2, (AnonymousClass3TO) null, (Integer) null, (Integer) null, (List) null, 0.0f, 0, -268435457, 2047, false, false, false, false, z2, false, false, false);
        } else {
            n9i = null;
        }
        neo.A0J(n9i);
        if (z) {
            C71111Ocu.A02(neo.A0Q, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r25 != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (((X.N54) r4).A04 != r12) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r0 != null) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.N93 r41) {
        /*
            r40 = this;
            r6 = 0
            r10 = r41
            X.0qQ.A0B(r10, r6)
            X.N36 r9 = r10.A00
            r7 = r40
            X.N93 r0 = r7.A00
            r2 = 0
            if (r0 == 0) goto L_0x0289
            X.N36 r8 = r0.A00
        L_0x0011:
            r7.A0E = r0
            r7.A00 = r10
            r21 = 0
            boolean r0 = r10.A02
            r7.A08 = r0
            r5 = 1
            r20 = 2
            if (r9 != 0) goto L_0x0029
            r7.A04(r5)
        L_0x0023:
            X.PxR r0 = r7.A0U
            r0.ECV()
        L_0x0028:
            return
        L_0x0029:
            X.Put r4 = r9.A00
            java.lang.Integer r14 = r9.A02
            if (r8 == 0) goto L_0x011e
            java.lang.Integer r0 = r8.A02
        L_0x0031:
            boolean r25 = X.C51966G9m.A1a(r14, r0)
            if (r8 == 0) goto L_0x011b
            X.Put r0 = r8.A00
        L_0x0039:
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x0043
            r19 = 0
            if (r25 == 0) goto L_0x0045
        L_0x0043:
            r19 = 1
        L_0x0045:
            java.lang.Long r0 = r9.A03
            if (r0 == 0) goto L_0x0118
            long r0 = r0.longValue()
            int r3 = (int) r0
        L_0x004e:
            java.lang.Integer r0 = r4.Aqk()
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            if (r0 != r12) goto L_0x0063
            boolean r0 = r4 instanceof X.N54
            if (r0 == 0) goto L_0x0063
            r0 = r4
            X.N54 r0 = (X.N54) r0
            java.lang.Integer r0 = r0.A04
            r18 = 1
            if (r0 == r12) goto L_0x0065
        L_0x0063:
            r18 = 0
        L_0x0065:
            X.OZx r0 = r7.A0W
            r39 = r0
            X.OKY r0 = r0.A04
            r22 = r0
            java.lang.String r11 = r4.Aqe()
            java.lang.Integer r27 = X.OZx.A00(r4)
            boolean r13 = r4 instanceof X.N54
            r16 = 0
            if (r13 == 0) goto L_0x010d
            r0 = r4
            X.N54 r0 = (X.N54) r0
            X.N2c r0 = r0.A02
            if (r0 == 0) goto L_0x0086
        L_0x0082:
            long r0 = r0.A01
            r16 = r0
        L_0x0086:
            java.lang.Integer r0 = r9.A01
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0107;
                case 2: goto L_0x010a;
                default: goto L_0x008f;
            }
        L_0x008f:
            java.lang.String r29 = "PLAY"
        L_0x0091:
            X.PKH r15 = new X.PKH
            r26 = r15
            r28 = r11
            r30 = r16
            r26.<init>(r27, r28, r29, r30)
            r1 = r22
            r1.A00(r15)
            r1 = r20
            if (r0 == r1) goto L_0x027e
            if (r0 == r6) goto L_0x0121
            if (r0 != r5) goto L_0x0028
            boolean r0 = r4.CeS()
            if (r0 == 0) goto L_0x0028
            if (r19 == 0) goto L_0x00c0
            java.lang.String r0 = r9.A05
            r22 = r2
            r23 = r14
            r24 = r0
            r20 = r7
            r21 = r4
            r20.A00(r21, r22, r23, r24, r25)
        L_0x00c0:
            X.Pry r0 = r7.A01
            X.N9i r0 = (X.C68295N9i) r0
            if (r0 == 0) goto L_0x0105
            r27 = 0
            r29 = -32769(0xffffffffffff7fff, float:NaN)
            r30 = 2047(0x7ff, float:2.868E-42)
            r21 = r2
            r23 = r2
            r24 = r2
            r25 = r2
            r26 = r2
            r28 = r6
            r31 = r6
            r32 = r6
            r33 = r6
            r34 = r5
            r35 = r6
            r36 = r6
            r37 = r6
            r38 = r6
            r20 = r2
            r22 = r0
            X.N9i r0 = X.C68295N9i.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
        L_0x00f1:
            r7.A0J(r0)
            X.PxR r0 = r7.A0U
            r0.CML()
            r39.A03()
            if (r19 != 0) goto L_0x0028
            r0.E29()
            r0.ETb(r3)
            return
        L_0x0105:
            r0 = 0
            goto L_0x00f1
        L_0x0107:
            java.lang.String r29 = "PAUSE"
            goto L_0x0091
        L_0x010a:
            java.lang.String r29 = "STOP"
            goto L_0x0091
        L_0x010d:
            boolean r0 = r4 instanceof X.N53
            if (r0 == 0) goto L_0x0086
            r0 = r4
            X.N53 r0 = (X.N53) r0
            X.N2c r0 = r0.A01
            goto L_0x0082
        L_0x0118:
            r3 = 0
            goto L_0x004e
        L_0x011b:
            r0 = r2
            goto L_0x0039
        L_0x011e:
            r0 = r2
            goto L_0x0031
        L_0x0121:
            if (r19 != 0) goto L_0x016a
            boolean r0 = r7.A0B
            if (r0 != 0) goto L_0x016a
            X.PxR r5 = r7.A0U
            r5.FM2()
            r5.EJA()
            X.Pry r1 = r7.A01
            X.N9i r1 = (X.C68295N9i) r1
            if (r1 == 0) goto L_0x0168
            r0 = -32769(0xffffffffffff7fff, float:NaN)
            X.N9i r0 = X.C68295N9i.A00((X.C74438Put) null, (com.instagram.common.typedurl.ImageUrl) null, r1, (X.AnonymousClass3TO) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.List) null, 0.0f, 0, r0, 2047, false, false, false, false, false, false, false, false)
        L_0x013c:
            r7.A0J(r0)
            r0 = r39
            X.OH9 r2 = r0.A01
            if (r2 == 0) goto L_0x014f
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A01 = r0
        L_0x014f:
            r5.CMK()
        L_0x0152:
            java.util.List r0 = r7.A02
            if (r0 != 0) goto L_0x0028
            boolean r0 = r4.CeS()
            X.PxR r1 = r7.A0U
            if (r0 != 0) goto L_0x028c
            r0 = 338(0x152, float:4.74E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.EyO(r0)
            return
        L_0x0168:
            r0 = 0
            goto L_0x013c
        L_0x016a:
            r7.A0B = r6
            java.util.List r0 = r7.A02
            if (r0 == 0) goto L_0x019a
            if (r13 == 0) goto L_0x0187
            r1 = r4
            X.N54 r1 = (X.N54) r1
            java.lang.Integer r1 = r1.A04
            if (r1 != r12) goto L_0x0187
            java.lang.String r1 = r9.A04
            if (r1 != 0) goto L_0x01f0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x01d5
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x01d5
        L_0x0187:
            r7.A03 = r2
            r7.A02 = r2
            A01(r4, r7)
            X.Ocu r1 = r7.A0Q
            X.PNL r0 = new X.PNL
            r0.<init>(r6)
            r1.A05(r0)
        L_0x0198:
            r7.A06 = r5
        L_0x019a:
            java.lang.String r1 = r10.A01
            if (r18 == 0) goto L_0x01c0
            java.util.List r0 = r7.A02
            if (r0 != 0) goto L_0x01c0
            X.0eM r0 = r7.A0Z
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x01c0
            if (r1 == 0) goto L_0x01c0
            java.lang.String r0 = r9.A04
            if (r0 == 0) goto L_0x01b5
            X.PxR r0 = r7.A0U
            r0.Ee6()
        L_0x01b5:
            X.OLG r0 = r7.A0S
            r0.A00(r11)
            java.lang.Long r0 = X.C51968G9o.A0u()
            r7.A0F = r0
        L_0x01c0:
            java.lang.String r0 = r9.A05
            if (r8 == 0) goto L_0x01c6
            X.Put r2 = r8.A00
        L_0x01c6:
            r22 = r2
            r23 = r14
            r24 = r0
            r20 = r7
            r21 = r4
            r20.A00(r21, r22, r23, r24, r25)
            goto L_0x0152
        L_0x01d5:
            java.util.Iterator r1 = r0.iterator()
        L_0x01d9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0187
            java.lang.Object r0 = r1.next()
            X.Put r0 = (X.C74438Put) r0
            java.lang.String r0 = r0.Aqe()
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 == 0) goto L_0x01d9
            goto L_0x0198
        L_0x01f0:
            X.N93 r1 = r7.A0E
            if (r1 == 0) goto L_0x0028
            X.N36 r1 = r1.A00
            if (r1 == 0) goto L_0x0028
            X.Put r1 = r1.A00
            if (r1 == 0) goto L_0x0028
            java.util.Iterator r15 = r0.iterator()
            r12 = 0
        L_0x0201:
            boolean r0 = r15.hasNext()
            r6 = -1
            if (r0 == 0) goto L_0x021f
            java.lang.Object r0 = r15.next()
            X.Put r0 = (X.C74438Put) r0
            java.lang.String r13 = r0.Aqe()
            java.lang.String r0 = r1.Aqe()
            boolean r0 = X.0qQ.A0K(r13, r0)
            if (r0 != 0) goto L_0x0220
            int r12 = r12 + 1
            goto L_0x0201
        L_0x021f:
            r12 = -1
        L_0x0220:
            java.util.List r0 = r7.A02
            if (r0 == 0) goto L_0x025d
            java.util.Iterator r1 = r0.iterator()
        L_0x0228:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0241
            java.lang.Object r0 = r1.next()
            X.Put r0 = (X.C74438Put) r0
            java.lang.String r0 = r0.Aqe()
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 != 0) goto L_0x0243
            int r21 = r21 + 1
            goto L_0x0228
        L_0x0241:
            r21 = -1
        L_0x0243:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            if (r0 == 0) goto L_0x025d
            int r1 = r0.intValue()
            if (r1 <= r12) goto L_0x025d
            java.util.List r0 = r7.A02
            if (r0 == 0) goto L_0x0256
            r0.remove(r1)
        L_0x0256:
            java.util.List r0 = r7.A03
            if (r0 == 0) goto L_0x025d
            r0.remove(r1)
        L_0x025d:
            if (r12 == r6) goto L_0x0277
            java.util.List r1 = r7.A02
            if (r1 == 0) goto L_0x0268
            int r0 = r12 + 1
            r1.add(r0, r4)
        L_0x0268:
            java.util.List r6 = r7.A03
            if (r6 == 0) goto L_0x0277
            int r1 = r12 + 1
            X.OVG r0 = r7.A0V
            X.N9i r0 = r0.A01(r4, r14)
            r6.add(r1, r0)
        L_0x0277:
            X.PxR r0 = r7.A0U
            r0.Ee6()
            goto L_0x0198
        L_0x027e:
            r7.A04(r5)
            r7.A00 = r2
            r7.A02 = r2
            r7.A03 = r2
            goto L_0x0023
        L_0x0289:
            r8 = r2
            goto L_0x0011
        L_0x028c:
            r1.ETb(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69109Neo.A0M(X.N93):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69109Neo(Activity activity, Context context, AnonymousClass0iw r16, UserSession userSession, OKY oky, C71111Ocu ocu, C74578PxR pxR, OZx oZx) {
        super(DbS.A0z(N93.class));
        C70516O9p o9p = new C70516O9p(context);
        C70942OSp oSp = new C70942OSp(context);
        UserSession userSession2 = userSession;
        1Av A002 = 1Au.A00(userSession2);
        OZx oZx2 = oZx;
        OLG olg = new OLG(context, userSession2, oZx2);
        1a0 A032 = C46447Df9.A03();
        C71111Ocu ocu2 = ocu;
        OKY oky2 = oky;
        C51973G9u.A0s(5, ocu2, oky2, oZx2);
        0qQ.A0B(A002, 11);
        this.A0H = activity;
        this.A0I = context;
        this.A0K = userSession2;
        this.A0U = pxR;
        this.A0Q = ocu2;
        this.A0J = r16;
        this.A0P = oky2;
        this.A0W = oZx2;
        this.A0T = o9p;
        this.A0R = oSp;
        this.A0N = A002;
        this.A0S = olg;
        this.A0O = A032;
        this.A0V = new OVG(context, userSession2);
        this.A0L = C69830Nsr.A00(userSession2);
        this.A0M = new OMP(context, userSession2);
        this.A0U.EqX(new OK5(this));
        olg.A00 = new C70517O9q(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0243, code lost:
        if (X.AnonymousClass7TE.A1b(r0) == true) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r0.A0b == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (((X.N54) r4).A04 != X.AnonymousClass05K.A01) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0142, code lost:
        if (r5.A0A == false) goto L_0x0254;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.C74438Put r42, X.C74438Put r43, java.lang.Integer r44, java.lang.String r45, boolean r46) {
        /*
            r41 = this;
            r4 = r42
            r3 = 0
            r5 = r41
            boolean r0 = A06(r5, r3)
            if (r0 != 0) goto L_0x02ce
            boolean r0 = r4 instanceof X.N54
            r20 = r0
            r2 = 1
            if (r0 == 0) goto L_0x001c
            r0 = r4
            X.N54 r0 = (X.N54) r0
            java.lang.Integer r1 = r0.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r15 = 1
            if (r1 == r0) goto L_0x001d
        L_0x001c:
            r15 = 0
        L_0x001d:
            X.Pry r1 = r5.A01
            X.N9i r1 = (X.C68295N9i) r1
            if (r1 == 0) goto L_0x01d8
            boolean r7 = r1.A0O
        L_0x0025:
            r6 = r45
            if (r46 != 0) goto L_0x01d2
            java.lang.String r0 = "in_call"
            boolean r0 = X.0mp.A0G(r6, r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "in_call_sharesheet"
            boolean r0 = X.0mp.A0G(r6, r0)
            if (r0 == 0) goto L_0x01d2
        L_0x0039:
            r11 = 0
        L_0x003a:
            com.instagram.common.session.UserSession r9 = r5.A0K
            X.0Tu r8 = X.0Tu.A05
            r0 = 36310555463516348(0x810042000000bc, double:3.0262797137743335E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x0055
            X.Pry r0 = r5.A01
            X.N9i r0 = (X.C68295N9i) r0
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.A0b
            r37 = 1
            if (r0 != 0) goto L_0x0057
        L_0x0055:
            r37 = 0
        L_0x0057:
            X.OVG r0 = r5.A0V
            r8 = r44
            X.N9i r1 = r0.A01(r4, r8)
            X.Pry r0 = r5.A01
            X.N9i r0 = (X.C68295N9i) r0
            r10 = 0
            if (r0 == 0) goto L_0x01cf
            boolean r0 = r0.A0Q
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
        L_0x006c:
            boolean r0 = X.AnonymousClass7TF.A1Y(r9, r2)
            if (r0 != 0) goto L_0x007e
            boolean r0 = X.AnonymousClass7TF.A1Y(r9, r3)
            if (r0 != 0) goto L_0x01cb
            int r0 = X.C70942OSp.A00()
            if (r0 == 0) goto L_0x01cb
        L_0x007e:
            r34 = 1
        L_0x0080:
            java.lang.String r0 = r4.Aqe()
            r21 = r43
            if (r43 == 0) goto L_0x01c8
            java.lang.String r9 = r21.Aqe()
        L_0x008c:
            boolean r9 = X.0qQ.A0K(r0, r9)
            if (r9 == 0) goto L_0x01bd
            if (r44 == 0) goto L_0x01b3
            int r8 = r8.intValue()
        L_0x0098:
            java.lang.String r9 = r5.A01
            boolean r9 = X.0qQ.A0K(r9, r0)
            if (r9 != 0) goto L_0x00a2
            com.instagram.common.typedurl.ImageUrl r10 = r1.A07
        L_0x00a2:
            java.lang.String r9 = r5.A01
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 == 0) goto L_0x01af
            X.3TO r0 = X.AnonymousClass3TO.GONE
        L_0x00ac:
            boolean r9 = r5.A09
            r38 = r9 ^ 1
            java.util.List r12 = r5.A03
            r19 = 0
            r29 = 0
            r31 = -272631329(0xffffffffefbff9df, float:-1.18827425E29)
            r32 = 491(0x1eb, float:6.88E-43)
            r24 = r1
            r25 = r0
            r26 = r19
            r27 = r19
            r28 = r12
            r30 = r8
            r33 = r11
            r35 = r3
            r36 = r3
            r39 = r3
            r40 = r9
            r22 = r19
            r23 = r10
            X.N9i r0 = X.C68295N9i.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r5.A0J(r0)
            java.lang.Integer r18 = r4.Aqk()
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = r18
            if (r0 != r1) goto L_0x0100
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x0100
            X.1Av r0 = r5.A0N
            X.0xa r1 = r0.A01
            java.lang.String r0 = "video_call_cowatch_navigate_to_profile_tooltip_display_count"
            int r1 = r1.getInt(r0, r3)
            r0 = 3
            if (r1 >= r0) goto L_0x0100
            X.Ocu r10 = r5.A0Q
            X.PO6 r9 = X.PO6.A00
            r0 = 300(0x12c, double:1.48E-321)
            r10.A06(r9, r0)
        L_0x0100:
            if (r7 != 0) goto L_0x01a2
            X.Ocu r1 = r5.A0Q
            X.PNs r0 = X.C72882PNs.A00
            r1.A05(r0)
            X.PN6 r0 = new X.PN6
            r0.<init>(r2)
            r1.A05(r0)
            X.PN8 r0 = new X.PN8
            r0.<init>(r2)
            r1.A05(r0)
            X.PN9 r0 = new X.PN9
            r0.<init>(r2)
            r1.A05(r0)
            X.C71111Ocu.A01(r1, r3)
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x012f
            X.OKY r1 = r5.A0P
            X.PLD r0 = X.PLD.A00
            r1.A00(r0)
        L_0x012f:
            if (r15 == 0) goto L_0x0144
            X.OKY r1 = r5.A0P
            X.PLJ r0 = X.PLJ.A00
            r1.A00(r0)
            X.0eM r0 = r5.A0Z
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0144
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x0254
        L_0x0144:
            X.OZx r11 = r5.A0W
            r11.A02()
            X.N93 r0 = r5.A00
            if (r0 == 0) goto L_0x01a0
            X.N36 r0 = r0.A00
            if (r0 == 0) goto L_0x01a0
            X.Put r1 = r0.A00
        L_0x0153:
            boolean r0 = r1 instanceof X.N54
            if (r0 == 0) goto L_0x019e
            X.N54 r1 = (X.N54) r1
            java.util.List r0 = r1.A08
            if (r0 == 0) goto L_0x019e
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r2) goto L_0x019e
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
        L_0x0167:
            boolean r0 = r4 instanceof X.N4z
            if (r0 != 0) goto L_0x0248
            X.Oap r0 = X.N2H.A00
            java.lang.String r17 = X.C71070Oap.A02(r4, r12)
            X.OKY r9 = r11.A04
            java.lang.Integer r8 = X.OZx.A00(r4)
            X.PKD r7 = new X.PKD
            r1 = r17
            r7.<init>(r1, r8, r6)
            r9.A00(r7)
            java.lang.Integer r16 = X.C70321O1z.A00(r6)
            r1 = 11
            java.lang.Integer[] r10 = X.AnonymousClass05K.A00(r1)
            int r9 = r10.length
            r8 = 0
        L_0x018d:
            if (r8 >= r9) goto L_0x01db
            r7 = r10[r8]
            java.lang.String r1 = X.C70897OQp.A00(r7)
            boolean r1 = X.0qQ.A0K(r1, r6)
            if (r1 != 0) goto L_0x01dc
            int r8 = r8 + 1
            goto L_0x018d
        L_0x019e:
            r12 = 0
            goto L_0x0167
        L_0x01a0:
            r1 = 0
            goto L_0x0153
        L_0x01a2:
            X.OKY r1 = r5.A0P
            X.PLK r0 = X.PLK.A00
            r1.A00(r0)
            X.OZx r0 = r5.A0W
            r0.A02()
            goto L_0x012f
        L_0x01af:
            X.3TO r0 = r1.A08
            goto L_0x00ac
        L_0x01b3:
            X.Pry r8 = r5.A01
            X.N9i r8 = (X.C68295N9i) r8
            if (r8 == 0) goto L_0x01c5
            int r8 = r8.A03
            goto L_0x0098
        L_0x01bd:
            if (r44 == 0) goto L_0x01c5
            int r8 = r8.intValue()
            goto L_0x0098
        L_0x01c5:
            r8 = 0
            goto L_0x0098
        L_0x01c8:
            r9 = r10
            goto L_0x008c
        L_0x01cb:
            r34 = 0
            goto L_0x0080
        L_0x01cf:
            r9 = r10
            goto L_0x006c
        L_0x01d2:
            if (r1 == 0) goto L_0x0039
            boolean r11 = r1.A0S
            goto L_0x003a
        L_0x01d8:
            r7 = 0
            goto L_0x0025
        L_0x01db:
            r7 = 0
        L_0x01dc:
            X.Nmk r14 = X.C69502Nmk.A0C
            X.Oax r13 = r11.A03
            if (r7 == 0) goto L_0x02f4
            int r7 = r7.intValue()
            r1 = 5
            if (r7 == r1) goto L_0x02f0
            r1 = 2
            if (r7 == r1) goto L_0x02ec
            r1 = 6
            if (r7 == r1) goto L_0x02e8
            r1 = 7
            if (r7 == r1) goto L_0x02e4
            r10 = 0
        L_0x01f3:
            java.lang.String r7 = X.C71070Oap.A02(r4, r12)
            java.lang.String r1 = "_"
            java.lang.String r9 = X.00l.A0L(r7, r1, r7)
            X.Nlt r8 = X.C71070Oap.A00(r18)
            X.NmT r7 = r0.A03(r4, r12)
            r1 = 0
        L_0x0206:
            X.1Ln r0 = X.C71078Oax.A00(r13)
            boolean r16 = X.DbT.A1Y(r0)
            if (r16 == 0) goto L_0x021f
            X.C66582MXn.A17(r14, r0, r1)
            java.lang.String r10 = X.C71078Oax.A01(r10, r0, r13)
            java.lang.String r1 = "server_info"
            r0.A0R(r1, r10)
            X.C71078Oax.A02(r8, r7, r0, r13, r9)
        L_0x021f:
            long r26 = android.os.SystemClock.elapsedRealtime()
            X.OFZ r0 = new X.OFZ
            r23 = r12
            r24 = r17
            r25 = r6
            r22 = r0
            r22.<init>(r23, r24, r25, r26)
            r11.A00 = r0
            boolean r0 = r4 instanceof X.N53
            if (r0 != 0) goto L_0x0248
            if (r20 == 0) goto L_0x02cf
            r0 = r4
            X.N54 r0 = (X.N54) r0
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x0248
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r2) goto L_0x0248
        L_0x0245:
            r11.A04(r4)
        L_0x0248:
            X.Ocu r7 = r5.A0Q
            X.N9l r1 = new X.N9l
            r0 = r19
            r1.<init>(r15, r0)
            r7.A05(r1)
        L_0x0254:
            r0 = r21
            boolean r1 = r0 instanceof X.N50
            if (r1 != 0) goto L_0x026d
            java.lang.String r0 = "share_sheet"
            boolean r0 = X.0mp.A0G(r6, r0)
            if (r0 != 0) goto L_0x026d
            java.util.List r0 = r5.A02
            if (r0 != 0) goto L_0x0268
            if (r46 != 0) goto L_0x026d
        L_0x0268:
            X.Ocu r0 = r5.A0Q
            X.C71111Ocu.A02(r0, r3)
        L_0x026d:
            X.Ocu r7 = r5.A0Q
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.PNC r0 = new X.PNC
            r0.<init>(r8)
            r7.A05(r0)
            boolean r0 = r4 instanceof X.N50
            if (r0 != 0) goto L_0x027f
            if (r1 != 0) goto L_0x0287
        L_0x027f:
            java.lang.String r0 = "share_sheet"
            boolean r0 = X.0mp.A0G(r6, r0)
            if (r0 == 0) goto L_0x028e
        L_0x0287:
            X.POB r6 = X.POB.A00
            r0 = 5000(0x1388, double:2.4703E-320)
            r7.A06(r6, r0)
        L_0x028e:
            boolean r0 = r5.A0G
            if (r0 != 0) goto L_0x02a9
            boolean r0 = r4 instanceof X.N53
            if (r0 != 0) goto L_0x02a0
            if (r20 == 0) goto L_0x02a9
            X.N54 r4 = (X.N54) r4
            java.lang.Integer r1 = r4.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x02a9
        L_0x02a0:
            X.PPD r4 = X.PPD.A00
            r0 = 4000(0xfa0, double:1.9763E-320)
            r7.A04(r4, r0)
            r5.A0G = r2
        L_0x02a9:
            X.N93 r0 = r5.A00
            if (r0 == 0) goto L_0x02bf
            X.N36 r0 = r0.A00
            if (r0 == 0) goto L_0x02bf
            java.lang.String r1 = r0.A04
            if (r1 == 0) goto L_0x02bf
            if (r46 != 0) goto L_0x02bf
            X.PPX r0 = new X.PPX
            r0.<init>(r8, r1, r3)
            r7.A03(r0)
        L_0x02bf:
            X.POD r0 = X.POD.A00
            r7.A05(r0)
            X.PNu r0 = X.C72884PNu.A00
            r7.A05(r0)
            X.PNm r0 = X.C72876PNm.A00
            r7.A05(r0)
        L_0x02ce:
            return
        L_0x02cf:
            boolean r0 = r4 instanceof X.N52
            if (r0 != 0) goto L_0x0248
            boolean r0 = r4 instanceof X.N51
            if (r0 != 0) goto L_0x0245
            boolean r0 = r4 instanceof X.N50
            if (r0 != 0) goto L_0x0248
            java.lang.String r1 = "RtcCoWatchAnalyticsLogger"
            java.lang.String r0 = "needsToLoad(): Unknown content type"
            X.0KC.A0E(r1, r0)
            goto L_0x0245
        L_0x02e4:
            X.Nme r10 = X.C69496Nme.DIRECT_SHARE_LOCAL_ENTRYPOINT
            goto L_0x01f3
        L_0x02e8:
            X.Nme r10 = X.C69496Nme.DIRECT_SHARE_ENTRYPOINT
            goto L_0x01f3
        L_0x02ec:
            X.Nme r10 = X.C69496Nme.SHARE_SHEET_ENTRYPOINT
            goto L_0x01f3
        L_0x02f0:
            X.Nme r10 = X.C69496Nme.IN_THREAD_ENTRYPOINT_SINGLE_FEED
            goto L_0x01f3
        L_0x02f4:
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            X.Nme r10 = X.C71070Oap.A01(r16)
            java.lang.String r8 = X.C71070Oap.A02(r4, r12)
            java.lang.String r7 = "_"
            java.lang.String r9 = X.00l.A0L(r8, r7, r8)
            X.Nlt r8 = X.C71070Oap.A00(r18)
            X.NmT r7 = r0.A03(r4, r12)
            goto L_0x0206
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69109Neo.A00(X.Put, X.Put, java.lang.Integer, java.lang.String, boolean):void");
    }

    public static final void A01(C74438Put put, C69109Neo neo) {
        String str;
        Integer num;
        String str2;
        C69449Nlt nlt;
        Long l = neo.A0F;
        if (l != null) {
            long A072 = C51966G9m.A07(l.longValue());
            OZx oZx = neo.A0W;
            boolean z = neo.A08;
            OKY oky = oZx.A04;
            Integer num2 = null;
            if (put != null) {
                str = put.Aqe();
                num = OZx.A00(put);
                num2 = OZx.A01(put, (Integer) null);
            } else {
                str = null;
                num = null;
            }
            oky.A00(new PKI(num, num2, str, A072));
            if (!z) {
                HashMap A0e = Dbb.A0e("reels_watch_time", String.valueOf(A072), AnonymousClass7TE.A1L("tab_source", "reels_swipe_up"));
                C71078Oax oax = oZx.A03;
                C69502Nmk nmk = C69502Nmk.A0G;
                C69496Nme nme = C69496Nme.REELS;
                String str3 = null;
                if (put != null) {
                    String Aqe = put.Aqe();
                    str2 = 00l.A0L(Aqe, "_", Aqe);
                    nlt = C71070Oap.A00(put.Aqk());
                } else {
                    str2 = null;
                    nlt = null;
                }
                C69485NmT nmT = C69485NmT.REELS;
                1Ln A002 = C71078Oax.A00(oax);
                if (DbT.A1Y(A002)) {
                    C66582MXn.A17(nmk, A002, A0e);
                    A002.A0M(nme, "source");
                    RtcCallKey rtcCallKey = oax.A00;
                    if (rtcCallKey != null) {
                        str3 = rtcCallKey.A00;
                    }
                    A002.A0R("server_info", str3);
                    C71078Oax.A02(nlt, nmT, A002, oax, str2);
                }
            }
        }
        neo.A0F = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (X.AnonymousClass7TE.A1b(r0) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C69109Neo r20, boolean r21) {
        /*
            r2 = r20
            boolean r1 = r2.A04
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x001a
            X.Pry r0 = r2.A01
            X.N9i r0 = (X.C68295N9i) r0
            if (r0 == 0) goto L_0x001a
            java.util.List r0 = r0.A0K
            if (r0 == 0) goto L_0x001a
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            r20 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001a:
            r20 = 0
        L_0x001c:
            X.Pry r5 = r2.A01
            X.N9i r5 = (X.C68295N9i) r5
            if (r5 == 0) goto L_0x0046
            r11 = 0
            r3 = 0
            r10 = 1064514355(0x3f733333, float:0.95)
            r12 = -268437537(0xffffffffeffff7df, float:-1.5843667E29)
            r13 = 1663(0x67f, float:2.33E-42)
            r14 = r21
            r4 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r15 = r11
            r16 = r11
            r17 = r11
            r19 = r11
            r21 = r11
            r18 = r1
            X.N9i r0 = X.C68295N9i.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0042:
            r2.A0J(r0)
            return
        L_0x0046:
            r0 = 0
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69109Neo.A02(X.Neo, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.Ps0, java.lang.Object] */
    private final void A04(boolean z) {
        C74438Put put;
        N36 n36;
        C71111Ocu ocu = this.A0Q;
        ocu.A05(new PN6(false));
        ocu.A05(new PN9(false));
        C71111Ocu.A01(ocu, true);
        C71111Ocu.A02(ocu, true);
        ocu.A05(new PN8(false));
        ocu.A05(new PNC(AnonymousClass05K.A00));
        ocu.A05(C72884PNu.A00);
        ocu.A05(new PNL(false));
        ocu.A05(new Object());
        ocu.A05(C72876PNm.A00);
        ocu.A05(C72877PNn.A00);
        if (z) {
            this.A0W.A02();
        }
        C68295N9i n9i = null;
        if (!this.A08) {
            this.A0P.A00(PLE.A00);
            N93 n93 = this.A00;
            if (n93 == null || (n36 = n93.A00) == null) {
                put = null;
            } else {
                put = n36.A00;
            }
            A01(put, this);
        }
        this.A04 = false;
        C68295N9i n9i2 = (C68295N9i) this.A01;
        if (n9i2 != null) {
            n9i = C68295N9i.A00((C74438Put) null, (ImageUrl) null, n9i2, (AnonymousClass3TO) null, (Integer) null, (Integer) null, (List) null, 0.0f, 0, -2, 2047, false, false, false, false, false, false, false, false);
        }
        A0J(n9i);
    }

    public static final boolean A05(C69109Neo neo) {
        C74438Put put;
        N36 n36;
        N93 n93 = neo.A00;
        if (n93 == null || (n36 = n93.A00) == null) {
            put = null;
        } else {
            put = n36.A00;
        }
        if (!(put instanceof N54) || ((N54) put).A04 != AnonymousClass05K.A01 || !AnonymousClass7TF.A1Z(neo.A0Z) || !neo.A0A) {
            return false;
        }
        return true;
    }

    public static final boolean A06(C69109Neo neo, boolean z) {
        N93 n93;
        N36 n36;
        C74438Put put;
        if (!A05(neo)) {
            return false;
        }
        C68295N9i n9i = (C68295N9i) neo.A01;
        if (n9i != null && n9i.A0O) {
            neo.A04(false);
            neo.A0U.ECV();
        }
        String str = null;
        if (!(!z || (n93 = neo.A00) == null || (n36 = n93.A00) == null || (put = n36.A00) == null)) {
            str = put.Aqe();
        }
        neo.A0Q.A05(new C68298N9l(true, str));
        return true;
    }
}
