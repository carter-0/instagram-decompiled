package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.GHj  reason: case insensitive filesystem */
public final class C52167GHj implements C233012uo, C270674h7, C290515fR {
    public int A00;
    public int A01;
    public 1OC A02;
    public C233042ur A03 = new C233032uq();
    public C233072uu A04;
    public Integer A05;
    public Integer A06 = AnonymousClass05K.A00;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E = true;
    public boolean A0F;
    public boolean A0G;
    public int A0H;
    public boolean A0I = true;
    public boolean A0J;
    public final long A0K;
    public final Context A0L;
    public final 0bY A0M;
    public final C270694h9 A0N;
    public final GEP A0O;
    public final UserSession A0P;
    public final C233172vA A0Q;
    public final AnonymousClass4DU A0R;
    public final C233212vI A0S;
    public final B57 A0T;
    public final GM9 A0U;
    public final C54575HJk A0V;
    public final AnonymousClass93T A0W;
    public final GD9 A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final List A0c = AnonymousClass7TE.A1C();
    public final List A0d = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0e;
    public final AnonymousClass0eM A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final long A0i;
    public final C61410nE A0j;
    public final C52053GCz A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;

    public C52167GHj(Context context, C270694h9 r8, GEP gep, UserSession userSession, C233172vA r11, AnonymousClass4DU r12, C233212vI r13, C52053GCz gCz, C54575HJk hJk, AnonymousClass93T r16, GD9 gd9, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A0P = userSession;
        this.A0W = r16;
        this.A0L = context;
        this.A0N = r8;
        this.A0V = hJk;
        this.A0Y = str;
        this.A0b = str2;
        this.A0Z = str3;
        this.A0a = str4;
        this.A0S = r13;
        this.A0R = r12;
        this.A0O = gep;
        this.A0g = z;
        this.A0n = z2;
        this.A0k = gCz;
        this.A0X = gd9;
        this.A0Q = r11;
        0Tu r2 = 0Tu.A05;
        this.A0o = 182.A06(r2, userSession, 36318556987594982L);
        this.A0p = 182.A06(r2, userSession, 36318556987660519L);
        this.A0l = 182.A06(r2, userSession, 36318556988446963L);
        this.A0m = 182.A06(r2, userSession, 36318556988643574L);
        this.A0q = 182.A06(r2, userSession, 36320541262815818L);
        0Tu r5 = 0Tu.A06;
        this.A0h = 182.A06(r5, userSession, 36320541263798869L);
        this.A0K = 182.A01(r5, userSession, 36602016240570795L);
        this.A0M = DbW.A0G();
        this.A0i = 182.A01(r2, userSession, 36600031965744809L);
        this.A0e = C58679Ivo.A00(this, 3);
        this.A0f = AnonymousClass0eN.A00(0eO.A02, new C58679Ivo(this, 4));
        this.A0r = 182.A06(r2, userSession, 36318556989364480L);
        this.A0j = C61410nE.A00;
        this.A0U = C52166GHi.A00(userSession);
        this.A0T = new B57(context, new C57342IXz(this, 0), userSession);
        C52170GHm gHm = (C52170GHm) this.A0e.getValue();
        if (gHm != null && gCz != null) {
            gCz.A00 = gHm;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0205, code lost:
        if (r3.A0G != false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02d1, code lost:
        if (r3.A0G != false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f5, code lost:
        if (r0 != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0184, code lost:
        if (r3.A0G != false) goto L_0x0186;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.util.List r49, boolean r50, boolean r51) {
        /*
            r48 = this;
            r10 = 0
            r3 = r48
            X.HJk r9 = r3.A0V
            int r0 = r9.A0A()
            if (r0 <= 0) goto L_0x036a
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x0013
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x036a
        L_0x0013:
            boolean r19 = r3.CTb()
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            r3.A06 = r8
            r18 = 1
            X.C52170GHm.A0B = r18
            X.2ur r0 = r3.A03
            int r6 = r0.Au2()
            X.GD9 r0 = r3.A0X
            X.0sa r0 = r0.A00
            int r0 = X.C52012GBj.A01(r0)
            if (r6 >= r0) goto L_0x0030
            r6 = r0
        L_0x0030:
            boolean r0 = r3.A09
            r7 = r49
            r31 = r50
            if (r0 != 0) goto L_0x0123
            com.instagram.common.session.UserSession r5 = r3.A0P
            X.0Tu r4 = X.0Tu.A05
            r0 = 36318556988119278(0x810789000818ee, double:3.03133991015278E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0123
            if (r6 < 0) goto L_0x0123
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r0 = 36318556989626628(0x810789001f1904, double:3.031339911106034E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            r11 = 0
            if (r0 == 0) goto L_0x00b4
            r0 = r31
            java.util.ArrayList r0 = r3.A00(r7, r6, r10, r0)
            r2.addAll(r0)
        L_0x0062:
            com.instagram.common.session.UserSession r4 = r3.A0P
            X.0Tu r5 = X.0Tu.A05
            r0 = 36318509745903809(0x81077e002d18c1, double:3.031310033985488E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x016f
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x016f
            int r0 = r3.A00
            if (r0 == 0) goto L_0x016f
            java.util.ArrayList r13 = X.00k.A0U(r2)
            r12 = 2147483647(0x7fffffff, float:NaN)
            java.util.Iterator r17 = X.C52009GBg.A07(r9)
            r14 = 0
        L_0x0085:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0126
            java.lang.Object r11 = r17.next()
            int r16 = r14 + 1
            if (r14 < 0) goto L_0x0316
            X.4bN r11 = (X.C267324bN) r11
            java.util.Iterator r15 = r2.iterator()
        L_0x0099:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r1 = r15.next()
            java.lang.String r0 = r11.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0099
            if (r12 <= r14) goto L_0x0099
            r12 = r14
            goto L_0x0099
        L_0x00b1:
            r14 = r16
            goto L_0x0085
        L_0x00b4:
            java.util.Iterator r5 = X.C52009GBg.A07(r9)
        L_0x00b8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r4 = r5.next()
            int r1 = r11 + 1
            if (r11 < 0) goto L_0x0316
            X.4bN r4 = (X.C267324bN) r4
            if (r11 <= r6) goto L_0x00e5
            java.lang.Integer r0 = r4.A03
            if (r0 == r8) goto L_0x00d8
            java.lang.String r0 = r4.getId()
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x00e5
        L_0x00d8:
            X.1Xj r0 = r4.A02
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x00e5
            r2.add(r0)
        L_0x00e5:
            r11 = r1
            goto L_0x00b8
        L_0x00e7:
            int r1 = r2.size()
            int r0 = r7.size()
            if (r1 <= r0) goto L_0x00f9
            boolean r0 = r2.containsAll(r7)
            if (r0 == 0) goto L_0x00f9
            goto L_0x0062
        L_0x00f9:
            int r1 = r2.size()
            int r0 = r7.size()
            if (r1 <= r0) goto L_0x0123
            X.0wj r4 = X.0wj.A01
            r1 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r0 = "NewOrganicContentIds_Does_Not_Cover"
            X.0f9 r4 = r4.AEf(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "ClipsSponsoredContentFetcher: newOrganicContentIds does not cover organicContentIds, newOrganicContentIds: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", organicContentIds: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r7, r0, r1)
            X.C51969G9p.A1K(r4, r0)
        L_0x0123:
            r2 = r7
            goto L_0x0062
        L_0x0126:
            if (r12 <= 0) goto L_0x016b
            int r0 = r9.A0A()
            if (r12 >= r0) goto L_0x016b
            int r11 = r12 + -1
            int r0 = r3.A00
            int r12 = r12 - r0
            if (r12 >= r10) goto L_0x0136
            r12 = 0
        L_0x0136:
            int r0 = r6 + 1
            if (r12 >= r0) goto L_0x013b
            r12 = r0
        L_0x013b:
            if (r12 > r11) goto L_0x016b
        L_0x013d:
            int r0 = r9.A0A()
            if (r11 >= r0) goto L_0x0166
            X.4bN r0 = r9.A0E(r11)
            java.lang.String r0 = r0.getId()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x0166
            X.4bN r0 = r9.A0E(r11)
            X.5o2 r1 = r0.A01
            X.5o2 r0 = X.C295365o2.ORGANIC
            if (r1 != r0) goto L_0x0166
            X.4bN r0 = r9.A0E(r11)
            java.lang.String r0 = r0.getId()
            r13.add(r10, r0)
        L_0x0166:
            if (r11 == r12) goto L_0x016b
            int r11 = r11 + -1
            goto L_0x013d
        L_0x016b:
            java.util.List r2 = X.00k.A0a(r13)
        L_0x016f:
            X.0Tu r13 = X.0Tu.A06
            r0 = 36315133898787845(0x81046c00020c05, double:3.029175134675907E-306)
            boolean r1 = X.182.A06(r13, r4, r0)
            boolean r0 = r3.A0F
            if (r1 == 0) goto L_0x01ff
            if (r0 == 0) goto L_0x0186
            boolean r0 = r3.A0G
            r28 = 1
            if (r0 == 0) goto L_0x0188
        L_0x0186:
            r28 = 0
        L_0x0188:
            java.lang.String r12 = r3.A0b
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r19)
            java.lang.String r0 = r3.A0Y
            r38 = r0
            X.2vA r0 = r3.A0Q
            r19 = r4
            r20 = r0
            r21 = r9
            r23 = r12
            r24 = r38
            r25 = r2
            r26 = r6
            r27 = r10
            r29 = r31
            X.GLA r11 = X.GL9.A03(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x01aa:
            int r0 = r11.A02
            r3.A01 = r0
            boolean r0 = X.1KU.A04(r4)
            r33 = 0
            if (r0 == 0) goto L_0x0250
            boolean r0 = r3.A0I
            if (r0 == 0) goto L_0x0250
            r16 = 0
            r0 = 36881459699712379(0x83077e0033017b, double:3.387321851591544E-306)
            java.lang.String r0 = X.182.A04(r5, r4, r0)
            java.util.List r1 = X.DbX.A0x(r0)
            com.instagram.clips.intf.ClipsViewerSource r0 = X.AnonymousClass5M0.A02(r38)
            java.lang.String r0 = r0.name()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0250
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x0256
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r7.iterator()
        L_0x01e3:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x022a
            java.lang.Object r7 = r15.next()
            int r14 = r16 + 1
            if (r16 < 0) goto L_0x0316
            if (r16 != 0) goto L_0x01f9
            boolean r0 = X.0qQ.A0K(r7, r12)
            if (r0 != 0) goto L_0x01fc
        L_0x01f9:
            r1.add(r7)
        L_0x01fc:
            r16 = r14
            goto L_0x01e3
        L_0x01ff:
            if (r0 == 0) goto L_0x0207
            boolean r0 = r3.A0G
            r27 = 1
            if (r0 == 0) goto L_0x0209
        L_0x0207:
            r27 = 0
        L_0x0209:
            java.lang.String r12 = r3.A0b
            java.lang.Boolean r22 = java.lang.Boolean.valueOf(r19)
            java.lang.String r0 = r3.A0Y
            r38 = r0
            X.2vA r0 = r3.A0Q
            r19 = r4
            r20 = r0
            r21 = r9
            r23 = r12
            r24 = r38
            r25 = r2
            r26 = r6
            r28 = r31
            X.GLA r11 = X.GL9.A02(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x01aa
        L_0x022a:
            java.lang.String r14 = r1.toString()
            r0 = 36318509746886860(0x81077e003c18cc, double:3.0313100346071736E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x024d
            X.GM9 r0 = r3.A0U
            int r1 = r0.A00
            r0 = -1
            if (r1 == r0) goto L_0x0244
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x024d
        L_0x0244:
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0259
            if (r18 != 0) goto L_0x0259
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            goto L_0x0259
        L_0x024d:
            r18 = 0
            goto L_0x0244
        L_0x0250:
            r14 = r33
            r8 = r14
            r23 = r14
            goto L_0x026c
        L_0x0256:
            r14 = r33
            r8 = r14
        L_0x0259:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 36599984722808482(0x82077e00300ea2, double:3.2093159427887614E-306)
            long r0 = X.182.A01(r5, r4, r0)
            long r0 = r7.toMillis(r0)
            java.lang.Long r23 = java.lang.Long.valueOf(r0)
        L_0x026c:
            X.2ur r7 = r3.A03
            boolean r0 = r3.A0F
            r18 = r0
            java.lang.Integer r0 = r3.A05
            r17 = r0
            int r0 = r3.A01
            java.lang.Integer r36 = java.lang.Integer.valueOf(r0)
            boolean r0 = r3.A0G
            r16 = r0
            r32 = 0
            boolean r15 = r3.A0B
            if (r8 == 0) goto L_0x0312
            java.lang.String r41 = X.1Oy.A00(r8)
        L_0x028a:
            r0 = 36318556990347534(0x810789002a190e, double:3.031339911561938E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            if (r0 == 0) goto L_0x030f
            java.lang.String r42 = r11.A00()
        L_0x0299:
            X.4LN r0 = new X.4LN
            r34 = r0
            r35 = r17
            r37 = r33
            r39 = r33
            r40 = r14
            r43 = r2
            r44 = r18
            r45 = r16
            r46 = r15
            r47 = r10
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r7.DFK(r0)
            X.GLD r16 = X.GLD.A00
            X.93T r1 = r3.A0W
            java.lang.String r0 = r1.A00
            r19 = r0
            java.lang.String r0 = r1.A01
            r18 = r0
            android.content.Context r0 = r3.A0L
            r17 = r0
            java.lang.String r15 = r3.A0Z
            java.lang.String r7 = r3.A0a
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x02d3
            boolean r0 = r3.A0G
            r30 = 1
            if (r0 == 0) goto L_0x02d5
        L_0x02d3:
            r30 = 0
        L_0x02d5:
            r24 = r4
            r25 = r9
            r27 = r12
            r28 = r38
            r29 = r6
            r26 = r22
            boolean r0 = X.GL9.A08(r24, r25, r26, r27, r28, r29, r30, r31)
            if (r0 == 0) goto L_0x031e
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = X.C52009GBg.A07(r9)
        L_0x02ef:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x031e
            java.lang.Object r5 = r6.next()
            X.4bN r5 = (X.C267324bN) r5
            X.5o2 r1 = r5.A01
            X.5o2 r0 = X.C295365o2.ORGANIC
            if (r1 != r0) goto L_0x02ef
            X.1Xj r0 = r5.A02
            if (r0 == 0) goto L_0x02ef
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x02ef
            r2.add(r0)
            goto L_0x02ef
        L_0x030f:
            r42 = r33
            goto L_0x0299
        L_0x0312:
            r41 = r33
            goto L_0x028a
        L_0x0316:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x031e:
            r0 = 36315133898787845(0x81046c00020c05, double:3.029175134675907E-306)
            boolean r35 = X.182.A06(r13, r4, r0)
            X.4h9 r5 = r3.A0N
            X.GEP r1 = r3.A0O
            X.2uu r0 = r3.A04
            if (r0 == 0) goto L_0x0333
            java.util.Map r33 = r0.Bk0()
        L_0x0333:
            r36 = r51
            r24 = r19
            r25 = r18
            r26 = r12
            r27 = r15
            r28 = r7
            r29 = r38
            r30 = r14
            r31 = r2
            r34 = r10
            r18 = r5
            r19 = r11
            r20 = r1
            r21 = r4
            r22 = r8
            X.1OC r5 = r16.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.B57 r4 = r3.A0T
            int r1 = r3.A01
            r2 = 2
            X.B5C r0 = new X.B5C
            r0.<init>(r4, r14, r1, r2)
            r5.A00 = r0
            r1 = 1908846494(0x71c6af9e, float:1.9676909E30)
            r0 = 1
            X.1ES.A05(r5, r1, r2, r0, r0)
            r3.A02 = r5
        L_0x036a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52167GHj.A05(java.util.List, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0058, code lost:
        if (r8.A0n != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A7L(X.C233632w4 r9, X.C233042ur r10, X.C233072uu r11) {
        /*
            r8 = this;
            r4 = 0
            boolean r3 = X.C51973G9u.A1b(r11, r10, r9)
            r8.A08 = r3
            r8.A04 = r11
            X.0eM r0 = r8.A0e
            java.lang.Object r0 = r0.getValue()
            X.GHm r0 = (X.C52170GHm) r0
            if (r0 == 0) goto L_0x0015
            r0.A00 = r11
        L_0x0015:
            r8.A03 = r10
            int r5 = r9.A01
            r8.A0H = r5
            com.instagram.common.session.UserSession r6 = r8.A0P
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318509744658609(0x81077e001a18b1, double:3.0313100331980187E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0053
            boolean r0 = r8.A0F
            if (r0 == 0) goto L_0x0053
            X.0wj r7 = X.0wj.A01
            r1 = 817895520(0x30c01860, float:1.3976766E-9)
            java.lang.String r0 = "sync flow is enabled upon acp activation"
            X.0f9 r7 = r7.AEf(r0, r1)
            java.lang.String r1 = r8.A0Y
            java.lang.String r0 = "Container Module"
            r7.ABQ(r0, r1)
            java.util.List r0 = r9.A03
            int r1 = r0.size()
            java.lang.String r0 = "Entry organic list size"
            r7.ABO(r0, r1)
            java.lang.String r0 = "Entry point index"
            r7.ABO(r0, r5)
            r7.report()
        L_0x0053:
            if (r5 == 0) goto L_0x005a
            boolean r0 = r8.A0n
            r7 = 0
            if (r0 == 0) goto L_0x005b
        L_0x005a:
            r7 = 1
        L_0x005b:
            r0 = 36318556989102332(0x810789001718fc, double:3.031339910774467E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0084
            long r0 = r8.A0i
            int r2 = (int) r0
        L_0x0069:
            java.util.List r6 = r9.A03
            int r0 = r6.size()
            if (r0 < r2) goto L_0x0083
            if (r7 == 0) goto L_0x0083
            boolean r0 = r8.A0l
            if (r0 == 0) goto L_0x008b
            X.HJk r2 = r8.A0V
            java.lang.String r1 = r8.A0Y
            java.lang.String r0 = "reels list already contains ads when entering surface"
            boolean r0 = X.GL9.A09(r2, r0, r1)
            if (r0 == 0) goto L_0x008b
        L_0x0083:
            return r3
        L_0x0084:
            boolean r0 = r8.A0m
            r2 = 1
            if (r0 != 0) goto L_0x0069
            r2 = 2
            goto L_0x0069
        L_0x008b:
            boolean r0 = X.AnonymousClass7TF.A1Q(r5)
            r8.A05(r6, r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52167GHj.A7L(X.2w4, X.2ur, X.2uu):boolean");
    }

    public final /* synthetic */ void CJE(C376459Ib r1, List list) {
    }

    public final void Cmr() {
    }

    public final void Cn7(C233632w4 r1, C238523Ce r2, boolean z) {
    }

    public final void Cn9(int i) {
    }

    public final void D3t(C52228GJt gJt) {
        0qQ.A0B(gJt, 0);
        this.A0c.clear();
        UserSession userSession = this.A0P;
        if (!182.A06(0Tu.A06, userSession, 36315133899901965L)) {
            this.A0d.clear();
        }
        this.A0J = false;
        this.A0G = false;
        this.A09 = false;
        if (gJt.A01 && 182.A06(0Tu.A05, userSession, 36325416050701256L)) {
            1OC r0 = this.A02;
            if (r0 != null) {
                r0.cancel();
            }
            this.A02 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x020b, code lost:
        if (r0.A0c.contains(r6.getId()) != false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x020d, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020f, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0211, code lost:
        if (r5 == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x021b, code lost:
        if (r11 != false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0224, code lost:
        if (X.1KU.A05(r2) != false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0248, code lost:
        if (java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(X.C51966G9m.A07(r16)) <= r14) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0281, code lost:
        r0.A00 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0283, code lost:
        r13 = r0.A0V;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x028f, code lost:
        if (X.182.A06(r7, r2, 36318509744265387L) != false) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0291, code lost:
        r11 = r13.A0c();
        r6 = r13.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0299, code lost:
        if (r6 != 0) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x029b, code lost:
        r6 = X.C295325ny.A06(r2, r1.A01.Ao2(), r32, r5);
        r4 = r1.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02a9, code lost:
        if (r4 == null) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02ab, code lost:
        r8 = X.DbS.A0x(X.0se.A0L(r4.size()));
        r12 = X.AnonymousClass7TF.A0s(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02bf, code lost:
        if (r12.hasNext() == false) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c1, code lost:
        r3 = (java.util.Map.Entry) r12.next();
        r8.put(r3.getKey(), java.lang.Long.valueOf((long) ((java.lang.Number) r3.getValue()).intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02de, code lost:
        if (r11 >= r6) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e0, code lost:
        r12 = r13.A0E(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02e8, code lost:
        if (r12.A01 == X.C295365o2.GHOST) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f0, code lost:
        if (r32.contains(r12) != false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f4, code lost:
        if (r12.A09 != false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0300, code lost:
        if (r0.A0c.contains(r12.getId()) != false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0302, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0304, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0307, code lost:
        A03(r0, r6, r1.A08, r8);
        r34 = X.C51965G9l.A0p(r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0310, code lost:
        if (r34 == null) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0312, code lost:
        r14 = r0.A0E;
        r12 = X.AnonymousClass7TE.A1C();
        r11 = X.AnonymousClass7TE.A1C();
        r15 = r32.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0328, code lost:
        if (r15.hasNext() == false) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x032a, code lost:
        r8 = r15.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0335, code lost:
        if (((X.C267324bN) r8).A01 != X.C295365o2.ORGANIC) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0337, code lost:
        r11.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x033b, code lost:
        r4 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0343, code lost:
        if (r4.hasNext() == false) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0345, code lost:
        r12.add(((X.C267324bN) r4.next()).getId());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0353, code lost:
        r11 = r0.A0F;
        r8 = r0.A05;
        r22 = java.lang.Integer.valueOf(r13.A0c());
        r3 = r0.A0G;
        r23 = java.lang.Integer.valueOf(r5);
        r4 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0367, code lost:
        if (r4 == null) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0369, code lost:
        r33 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0371, code lost:
        if (r4.longValue() != -1) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0373, code lost:
        r33 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0375, code lost:
        r34.Ch2(new X.AnonymousClass4LN(r8, r22, r23, r41, r31, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r12, r11, r3, false, r33), r6, 200, -1, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0399, code lost:
        if (r0.A0r == false) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x039d, code lost:
        if (r0.A0I != false) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x039f, code lost:
        r0.A03.CsA();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03a4, code lost:
        r4 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03a6, code lost:
        if (r4 == null) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03a8, code lost:
        r4.Dlz(X.AnonymousClass05K.A00, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03ad, code lost:
        r9 = r0.A0F;
        r8 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03ba, code lost:
        if (X.182.A06(r7, r2, 36318509745117366L) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03bc, code lost:
        r2 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03c6, code lost:
        if (r2.Ao2().isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03c8, code lost:
        r3 = r2.Ao2().iterator();
        r4 = false;
        r12 = 0;
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03d7, code lost:
        if (r3.hasNext() == false) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03d9, code lost:
        r2 = (X.DU5) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03e3, code lost:
        if (r2.AZ7() == null) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03e5, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03ec, code lost:
        if (r2.BVn() == null) goto L_0x03d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03ee, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03f1, code lost:
        if (r6 == null) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03f3, code lost:
        r3 = r6.iterator();
        r7 = 0;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03fd, code lost:
        if (r3.hasNext() == false) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03ff, code lost:
        r2 = (X.C267324bN) ((X.C376489Ie) r3.next()).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x040f, code lost:
        if (X.GDZ.A01(r2.A01) == false) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0411, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0418, code lost:
        if (r2.A0G() == false) goto L_0x03f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x041a, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x041d, code lost:
        r7 = 0;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x041f, code lost:
        if (r12 != r7) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0421, code lost:
        if (r11 != r6) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0425, code lost:
        if (r0.A04 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0427, code lost:
        r3 = X.0wj.A01;
        r5 = X.AnonymousClass7TE.A1A();
        r5.append("Sponsored Item Delivery Discrepancy, adCountInResponse: ");
        r5.append(r12);
        r5.append(", netegoCountInResponse: ");
        r5.append(r11);
        r5.append(", adCountDelivery: ");
        r5.append(r7);
        r5.append(", netegoCountDelivery: ");
        r5.append(r6);
        r5.append(", shouldEnableSyncFlow: ");
        r5.append(r9);
        r5.append(", shouldFallBackToAsync: ");
        r5.append(r8);
        r5.append(", isPrefetch: ");
        r5.append(r19);
        r5.append(", isHeadLoad: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x046f, code lost:
        if (r18 != false) goto L_0x0474;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0471, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0472, code lost:
        if (r10 == false) goto L_0x0475;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0474, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0475, code lost:
        r5.append(r1);
        r5.append(", current_module: ");
        r5.append(r41);
        r5.append(", responseCallback is null: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0489, code lost:
        if (r0.A04 != null) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x048b, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x048c, code lost:
        r5.append(r4);
        X.DbT.A1Q(r3, r5.toString(), 817895520);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        if (r10 != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b8, code lost:
        if (r0.A0o == false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ba, code lost:
        if (r5 != false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01bc, code lost:
        r0.A0J = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r1.A0G != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01be, code lost:
        r6 = X.0sn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c2, code lost:
        if (r0.A0F == false) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c6, code lost:
        if (r0.A0G != false) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d1, code lost:
        if (X.182.A06(r7, r2, 36318509745903809L) == false) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d3, code lost:
        if (r5 == false) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d5, code lost:
        if (r19 != false) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d7, code lost:
        r12 = X.C52009GBg.A07(r0.A0V);
        r11 = 0;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e3, code lost:
        if (r12.hasNext() == false) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e5, code lost:
        r6 = r12.next();
        r5 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01eb, code lost:
        if (r4 >= 0) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ed, code lost:
        X.0sr.A1T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f4, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f5, code lost:
        r6 = (X.C267324bN) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01fb, code lost:
        if (r6.A03 != X.AnonymousClass05K.A01) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ff, code lost:
        if (r6.A09 != false) goto L_0x020f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3u(X.C52263GLe r43) {
        /*
            r42 = this;
            r9 = 0
            r1 = r43
            X.0qQ.A0B(r1, r9)
            r0 = r42
            boolean r2 = r0.A0F
            r6 = 1
            if (r2 == 0) goto L_0x001a
            boolean r2 = r0.A0I
            if (r2 == 0) goto L_0x001a
            boolean r2 = r1.A0D
            if (r2 != 0) goto L_0x001a
            boolean r3 = r1.A0G
            r2 = 1
            if (r3 == 0) goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            r0.A0D = r2
            java.util.List r2 = r1.A09
            r32 = r2
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r32.iterator()
        L_0x0029:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0040
            java.lang.Object r4 = r5.next()
            r2 = r4
            X.4bN r2 = (X.C267324bN) r2
            X.5o2 r3 = r2.A01
            X.5o2 r2 = X.C295365o2.ORGANIC
            if (r3 != r2) goto L_0x0029
            r7.add(r4)
            goto L_0x0029
        L_0x0040:
            java.util.Iterator r8 = r7.iterator()
            r16 = 0
        L_0x0046:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x007e
            java.lang.Object r2 = r8.next()
            X.4bN r2 = (X.C267324bN) r2
            java.lang.String r7 = r2.getId()
            com.instagram.common.session.UserSession r5 = r0.A0P
            X.0Tu r4 = X.0Tu.A05
            r2 = 36318556990806293(0x81078900311915, double:3.031339911852059E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            java.util.List r3 = r0.A0c
            if (r2 == 0) goto L_0x006d
            boolean r2 = r3.contains(r7)
            if (r2 != 0) goto L_0x0072
        L_0x006d:
            r3.add(r7)
            int r16 = r16 + 1
        L_0x0072:
            boolean r2 = X.GCI.A00(r5)
            if (r2 == 0) goto L_0x0046
            java.util.List r2 = r0.A0d
            r2.add(r7)
            goto L_0x0046
        L_0x007e:
            r8 = 0
            boolean r2 = r1.A0F
            r19 = r2
            boolean r10 = r1.A0G
            boolean r2 = r1.A0D
            r18 = r2
            if (r19 == 0) goto L_0x0271
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x008d:
            r0.A05 = r2
            r2 = r19
            r0.A0C = r2
            if (r18 != 0) goto L_0x0098
            r5 = 0
            if (r10 == 0) goto L_0x0099
        L_0x0098:
            r5 = 1
        L_0x0099:
            r0.A0I = r5
            com.instagram.common.session.UserSession r2 = r0.A0P
            X.0Tu r7 = X.0Tu.A05
            r3 = 36318556987988204(0x810789000618ec, double:3.031339910069888E-306)
            boolean r3 = X.182.A06(r7, r2, r3)
            if (r3 == 0) goto L_0x0252
            if (r10 == 0) goto L_0x00c9
            X.2ur r3 = r0.A03
            r3.Dpi()
            r0.A0H = r9
            r3 = 36318556989233406(0x810789001918fe, double:3.031339910857359E-306)
            boolean r3 = X.182.A06(r7, r2, r3)
            if (r3 == 0) goto L_0x00c7
            X.1OC r3 = r0.A02
            if (r3 == 0) goto L_0x00c5
            r3.cancel()
        L_0x00c5:
            r0.A02 = r8
        L_0x00c7:
            r0.A0A = r9
        L_0x00c9:
            java.lang.String r3 = r0.A0Y
            r41 = r3
            java.lang.String r3 = r1.A06
            r31 = r3
            boolean r3 = r0.A0A
            r20 = r2
            r21 = r41
            r22 = r31
            r23 = r8
            r24 = r19
            r25 = r9
            r26 = r5
            r27 = r3
            r28 = r10
            boolean r3 = X.AnonymousClass93X.A03(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0.A0F = r3
            X.0eM r3 = r0.A0f
            r30 = r3
            X.93a r13 = X.C51965G9l.A0p(r30)
            if (r13 == 0) goto L_0x016b
            java.lang.Integer r14 = r0.A05
            boolean r12 = r0.A0F
            boolean r3 = r1.A0A
            r20 = r3
            java.lang.String r11 = r1.A04
            boolean r3 = r1.A0H
            r17 = r3
            boolean r3 = r13.A00
            if (r3 != 0) goto L_0x016b
            X.0XK r3 = new X.0XK
            r3.<init>()
            java.lang.String r15 = "analytics_module"
            r4 = r41
            r3.A00(r15, r4, r6)
            java.lang.String r15 = java.lang.String.valueOf(r12)
            java.lang.String r4 = "is_sync"
            r12 = 8
            r3.A00(r4, r15, r12)
            if (r14 == 0) goto L_0x024f
            java.lang.String r14 = X.AnonymousClass93b.A01(r14)
        L_0x0124:
            java.lang.String r4 = "delivery_context"
            r3.A00(r4, r14, r6)
            java.lang.String r15 = java.lang.String.valueOf(r16)
            r14 = 2
            java.lang.String r4 = "organic_count"
            r3.A00(r4, r15, r14)
            java.lang.String r14 = "response_module"
            r4 = r31
            r3.A00(r14, r4, r6)
            java.lang.String r14 = java.lang.String.valueOf(r20)
            java.lang.String r4 = "is_cached_response"
            r3.A00(r4, r14, r12)
            java.lang.String r4 = "cache_key_used"
            r3.A00(r4, r11, r6)
            java.lang.String r11 = java.lang.String.valueOf(r17)
            java.lang.String r4 = "is_request_cache_enabled"
            r3.A00(r4, r11, r12)
            X.02m r20 = X.C3728893a.A00(r13)
            r21 = 976032351(0x3a2d125f, float:6.602164E-4)
            r23 = 7
            long r26 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r28 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r24 = "received_organic"
            r22 = r9
            r25 = r3
            r29 = r9
            r20.markerPoint(r21, r22, r23, r24, r25, r26, r28, r29)
        L_0x016b:
            r11 = 0
            r0.A0G = r9
            r3 = 36318509747214545(0x81077e004118d1, double:3.031310034814403E-306)
            boolean r4 = X.182.A06(r7, r2, r3)
            r12 = 0
            boolean r3 = r0.A0F
            if (r4 == 0) goto L_0x021e
            if (r3 == 0) goto L_0x018b
            boolean r3 = r1.A0A
            if (r3 == 0) goto L_0x018b
            boolean r3 = X.1KU.A05(r2)
            if (r3 != 0) goto L_0x0226
            r0.A0G = r6
        L_0x018b:
            boolean r3 = r0.A0F
            if (r3 == 0) goto L_0x0193
            boolean r3 = r0.A0G
            if (r3 == 0) goto L_0x01ae
        L_0x0193:
            boolean r3 = X.1KU.A04(r2)
            if (r3 == 0) goto L_0x01ae
            boolean r3 = r1.A0H
            if (r3 == 0) goto L_0x01a8
            java.lang.String r4 = "clips_viewer_clips_tab"
            r3 = r41
            boolean r3 = X.0qQ.A0K(r3, r4)
            if (r3 != 0) goto L_0x01a8
            r11 = 1
        L_0x01a8:
            r0.A0B = r11
            java.lang.String r3 = r1.A04
            r0.A07 = r3
        L_0x01ae:
            boolean r11 = r1.A0I
            if (r11 == 0) goto L_0x0214
            boolean r3 = r0.A0p
            if (r3 != 0) goto L_0x0211
            boolean r3 = r0.A0o
            if (r3 != 0) goto L_0x0214
        L_0x01ba:
            if (r5 != 0) goto L_0x01be
        L_0x01bc:
            r0.A0J = r6
        L_0x01be:
            X.0sn r6 = X.0sn.A00
            boolean r3 = r0.A0F
            if (r3 == 0) goto L_0x03ad
            boolean r3 = r0.A0G
            if (r3 != 0) goto L_0x03ad
            r3 = 36318509745903809(0x81077e002d18c1, double:3.031310033985488E-306)
            boolean r3 = X.182.A06(r7, r2, r3)
            if (r3 == 0) goto L_0x0283
            if (r5 == 0) goto L_0x0283
            if (r19 != 0) goto L_0x0283
            X.HJk r3 = r0.A0V
            java.util.Iterator r12 = X.C52009GBg.A07(r3)
            r11 = 0
            r4 = 0
        L_0x01df:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0281
            java.lang.Object r6 = r12.next()
            int r5 = r4 + 1
            if (r4 >= 0) goto L_0x01f5
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01f5:
            X.4bN r6 = (X.C267324bN) r6
            java.lang.Integer r4 = r6.A03
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            if (r4 != r3) goto L_0x020f
            boolean r3 = r6.A09
            if (r3 != 0) goto L_0x020f
            java.util.List r4 = r0.A0c
            java.lang.String r3 = r6.getId()
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x020f
            int r11 = r11 + 1
        L_0x020f:
            r4 = r5
            goto L_0x01df
        L_0x0211:
            if (r5 != 0) goto L_0x0214
            goto L_0x01bc
        L_0x0214:
            boolean r4 = r0.A0I
            boolean r3 = r0.A0C
            r0.A04(r4, r3)
            if (r11 == 0) goto L_0x01be
            goto L_0x01ba
        L_0x021e:
            if (r3 == 0) goto L_0x018b
            boolean r3 = X.1KU.A05(r2)
            if (r3 == 0) goto L_0x018b
        L_0x0226:
            java.lang.Long r3 = r1.A02
            if (r3 == 0) goto L_0x018b
            long r16 = r3.longValue()
            r3 = 36599984722808482(0x82077e00300ea2, double:3.2093159427887614E-306)
            long r14 = X.182.A01(r7, r2, r3)
            int r3 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x024a
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = X.C51966G9m.A07(r16)
            long r12 = r12.toSeconds(r3)
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r3 = 1
            if (r4 > 0) goto L_0x024b
        L_0x024a:
            r3 = 0
        L_0x024b:
            r0.A0G = r3
            goto L_0x018b
        L_0x024f:
            r14 = 0
            goto L_0x0124
        L_0x0252:
            if (r5 == 0) goto L_0x00c9
            X.2ur r3 = r0.A03
            r3.Dpi()
            r0.A0A = r9
            r3 = 36318556989233406(0x810789001918fe, double:3.031339910857359E-306)
            boolean r3 = X.182.A06(r7, r2, r3)
            if (r3 == 0) goto L_0x00c9
            X.1OC r3 = r0.A02
            if (r3 == 0) goto L_0x026d
            r3.cancel()
        L_0x026d:
            r0.A02 = r8
            goto L_0x00c9
        L_0x0271:
            if (r10 == 0) goto L_0x0277
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x008d
        L_0x0277:
            if (r2 == 0) goto L_0x027d
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x008d
        L_0x027d:
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            goto L_0x008d
        L_0x0281:
            r0.A00 = r11
        L_0x0283:
            X.HJk r13 = r0.A0V
            r3 = 36318509744265387(0x81077e001418ab, double:3.0313100329493435E-306)
            boolean r3 = X.182.A06(r7, r2, r3)
            r5 = 0
            if (r3 != 0) goto L_0x029b
            int r11 = r13.A0c()
            int r6 = r13.A0A()
            if (r6 != 0) goto L_0x02de
        L_0x029b:
            X.5u7 r3 = r1.A01
            java.util.List r4 = r3.Ao2()
            r3 = r32
            java.util.List r6 = X.C295325ny.A06(r2, r4, r3, r5)
            java.util.HashMap r4 = r1.A07
            if (r4 == 0) goto L_0x0307
            int r3 = r4.size()
            int r3 = X.0se.A0L(r3)
            java.util.LinkedHashMap r8 = X.DbS.A0x(r3)
            java.util.Iterator r12 = X.AnonymousClass7TF.A0s(r4)
        L_0x02bb:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x0307
            java.lang.Object r3 = r12.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r11 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            long r3 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r8.put(r11, r3)
            goto L_0x02bb
        L_0x02de:
            if (r11 >= r6) goto L_0x029b
            X.4bN r12 = r13.A0E(r11)
            X.5o2 r4 = r12.A01
            X.5o2 r3 = X.C295365o2.GHOST
            if (r4 == r3) goto L_0x0304
            r3 = r32
            boolean r3 = r3.contains(r12)
            if (r3 != 0) goto L_0x0304
            boolean r3 = r12.A09
            if (r3 != 0) goto L_0x0304
            java.util.List r4 = r0.A0c
            java.lang.String r3 = r12.getId()
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L_0x0304
            int r5 = r5 + 1
        L_0x0304:
            int r11 = r11 + 1
            goto L_0x02de
        L_0x0307:
            java.util.List r3 = r1.A08
            A03(r0, r6, r3, r8)
            X.93a r34 = X.C51965G9l.A0p(r30)
            if (r34 == 0) goto L_0x0397
            r37 = 200(0xc8, float:2.8E-43)
            boolean r14 = r0.A0E
            r38 = -1
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r32.iterator()
        L_0x0324:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x033b
            java.lang.Object r8 = r15.next()
            r3 = r8
            X.4bN r3 = (X.C267324bN) r3
            X.5o2 r4 = r3.A01
            X.5o2 r3 = X.C295365o2.ORGANIC
            if (r4 != r3) goto L_0x0324
            r11.add(r8)
            goto L_0x0324
        L_0x033b:
            java.util.Iterator r4 = r11.iterator()
        L_0x033f:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0353
            java.lang.Object r3 = r4.next()
            X.4bN r3 = (X.C267324bN) r3
            java.lang.String r3 = r3.getId()
            r12.add(r3)
            goto L_0x033f
        L_0x0353:
            boolean r11 = r0.A0F
            java.lang.Integer r8 = r0.A05
            int r3 = r13.A0c()
            java.lang.Integer r22 = java.lang.Integer.valueOf(r3)
            boolean r3 = r0.A0G
            java.lang.Integer r23 = java.lang.Integer.valueOf(r5)
            java.lang.Long r4 = r1.A02
            if (r4 == 0) goto L_0x0373
            long r15 = r4.longValue()
            int r4 = (r15 > r38 ? 1 : (r15 == r38 ? 0 : -1))
            r33 = 1
            if (r4 != 0) goto L_0x0375
        L_0x0373:
            r33 = 0
        L_0x0375:
            r26 = 0
            X.4LN r20 = new X.4LN
            r24 = r41
            r25 = r31
            r27 = r26
            r28 = r26
            r29 = r12
            r30 = r11
            r31 = r3
            r32 = r9
            r21 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r35 = r20
            r36 = r6
            r40 = r14
            r34.Ch2(r35, r36, r37, r38, r40)
        L_0x0397:
            boolean r3 = r0.A0r
            if (r3 == 0) goto L_0x03a4
            boolean r3 = r0.A0I
            if (r3 != 0) goto L_0x03a4
            X.2ur r3 = r0.A03
            r3.CsA()
        L_0x03a4:
            X.2uu r4 = r0.A04
            if (r4 == 0) goto L_0x03ad
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r4.Dlz(r3, r6)
        L_0x03ad:
            boolean r9 = r0.A0F
            boolean r8 = r0.A0G
            r3 = 36318509745117366(0x81077e002118b6, double:3.0313100334881385E-306)
            boolean r2 = X.182.A06(r7, r2, r3)
            if (r2 == 0) goto L_0x0496
            X.5u7 r2 = r1.A01
            java.util.List r1 = r2.Ao2()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0496
            java.util.List r1 = r2.Ao2()
            java.util.Iterator r3 = r1.iterator()
            r4 = 0
            r12 = 0
            r11 = 0
        L_0x03d3:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x03f1
            java.lang.Object r2 = r3.next()
            X.DU5 r2 = (X.DU5) r2
            X.YCC r1 = r2.AZ7()
            if (r1 == 0) goto L_0x03e8
            int r12 = r12 + 1
            goto L_0x03d3
        L_0x03e8:
            X.DV1 r1 = r2.BVn()
            if (r1 == 0) goto L_0x03d3
            int r11 = r11 + 1
            goto L_0x03d3
        L_0x03f1:
            if (r6 == 0) goto L_0x041d
            java.util.Iterator r3 = r6.iterator()
            r7 = 0
            r6 = 0
        L_0x03f9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x041f
            java.lang.Object r1 = r3.next()
            X.9Ie r1 = (X.C376489Ie) r1
            java.lang.Object r2 = r1.A03
            X.4bN r2 = (X.C267324bN) r2
            X.5o2 r1 = r2.A01
            boolean r1 = X.GDZ.A01(r1)
            if (r1 == 0) goto L_0x0414
            int r7 = r7 + 1
            goto L_0x03f9
        L_0x0414:
            boolean r1 = r2.A0G()
            if (r1 == 0) goto L_0x03f9
            int r6 = r6 + 1
            goto L_0x03f9
        L_0x041d:
            r7 = 0
            r6 = 0
        L_0x041f:
            if (r12 != r7) goto L_0x0427
            if (r11 != r6) goto L_0x0427
            X.2uu r1 = r0.A04
            if (r1 != 0) goto L_0x0496
        L_0x0427:
            X.0wj r3 = X.0wj.A01
            r2 = 817895520(0x30c01860, float:1.3976766E-9)
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Sponsored Item Delivery Discrepancy, adCountInResponse: "
            r5.append(r1)
            r5.append(r12)
            java.lang.String r1 = ", netegoCountInResponse: "
            r5.append(r1)
            r5.append(r11)
            java.lang.String r1 = ", adCountDelivery: "
            r5.append(r1)
            r5.append(r7)
            java.lang.String r1 = ", netegoCountDelivery: "
            r5.append(r1)
            r5.append(r6)
            java.lang.String r1 = ", shouldEnableSyncFlow: "
            r5.append(r1)
            r5.append(r9)
            java.lang.String r1 = ", shouldFallBackToAsync: "
            r5.append(r1)
            r5.append(r8)
            java.lang.String r1 = ", isPrefetch: "
            r5.append(r1)
            r1 = r19
            r5.append(r1)
            java.lang.String r1 = ", isHeadLoad: "
            r5.append(r1)
            if (r18 != 0) goto L_0x0474
            r1 = 0
            if (r10 == 0) goto L_0x0475
        L_0x0474:
            r1 = 1
        L_0x0475:
            r5.append(r1)
            java.lang.String r1 = ", current_module: "
            r5.append(r1)
            r1 = r41
            r5.append(r1)
            java.lang.String r1 = ", responseCallback is null: "
            r5.append(r1)
            X.2uu r0 = r0.A04
            if (r0 != 0) goto L_0x048c
            r4 = 1
        L_0x048c:
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            X.DbT.A1Q(r3, r0, r2)
        L_0x0496:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52167GHj.D3u(X.GLe):void");
    }

    public final boolean D69(int i, int i2) {
        return false;
    }

    public final void DsJ(int i) {
    }

    private final void A01(1Xj r5) {
        UserSession userSession = this.A0P;
        if (!182.A06(0Tu.A05, userSession, 36318355124197473L) || r5.CeS() || r5.A5h()) {
            C255593uO.A00(userSession).A01(new C256203vO(r5.CEL(), this.A0R.getModuleName()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b1, code lost:
        if (r8.A0G != false) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C52167GHj r42, java.util.List r43) {
        /*
            r8 = r42
            r32 = r43
            java.util.List r15 = r8.A0d
            boolean r0 = X.AnonymousClass7TE.A1b(r15)
            if (r0 == 0) goto L_0x0039
            com.instagram.common.session.UserSession r7 = r8.A0P
            boolean r0 = X.GCI.A00(r7)
            if (r0 == 0) goto L_0x0039
            if (r43 != 0) goto L_0x0018
            r32 = 0
        L_0x0018:
            X.0Tu r2 = X.0Tu.A06
            r0 = 36315133898918919(0x81046c00040c07, double:3.029175134758799E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            r6 = 1
            if (r0 != 0) goto L_0x0064
            X.HJk r0 = r8.A0V
            java.util.List r1 = r0.A0I()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x003a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x003a
        L_0x0036:
            r15.clear()
        L_0x0039:
            return
        L_0x003a:
            java.util.Iterator r2 = r1.iterator()
        L_0x003e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r2.next()
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x003e
            X.1Xy r0 = r0.A0C
            X.DTm r0 = r0.BoM()
            if (r0 == 0) goto L_0x003e
            java.lang.Boolean r1 = r0.CX0()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != r6) goto L_0x003e
        L_0x0064:
            X.HJk r10 = r8.A0V
            int r0 = r10.A0A()
            if (r0 <= 0) goto L_0x0036
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r8.A06 = r0
            X.2ur r1 = r8.A03
            r5 = 0
            r26 = 0
            X.4LN r0 = new X.4LN
            r16 = r0
            r17 = r5
            r18 = r5
            r19 = r5
            r20 = r5
            r21 = r5
            r22 = r5
            r23 = r5
            r24 = r5
            r25 = r15
            r27 = r26
            r28 = r26
            r29 = r26
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1.DFK(r0)
            X.GLD r16 = X.GLD.A00
            X.93T r0 = r8.A0W
            java.lang.String r14 = r0.A00
            java.lang.String r13 = r0.A01
            android.content.Context r12 = r8.A0L
            java.lang.String r4 = r8.A0b
            java.lang.String r3 = r8.A0Z
            java.lang.String r2 = r8.A0a
            java.lang.String r1 = r8.A0Y
            boolean r0 = r8.A0F
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r8.A0G
            r42 = 1
            if (r0 == 0) goto L_0x00b5
        L_0x00b3:
            r42 = 0
        L_0x00b5:
            r0 = -1
            X.2vA r9 = r8.A0Q
            java.lang.String r38 = ""
            r33 = r7
            r34 = r9
            r35 = r10
            r36 = r5
            r37 = r5
            r39 = r15
            r40 = r0
            r41 = r6
            r43 = r26
            X.GLA r19 = X.GL9.A03(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            X.4h9 r11 = r8.A0N
            X.GEP r10 = r8.A0O
            X.2uu r9 = r8.A04
            if (r9 == 0) goto L_0x0114
            java.util.Map r33 = r9.Bk0()
        L_0x00dc:
            boolean r9 = r8.A0C
            r30 = r5
            r31 = r15
            r34 = r6
            r35 = r6
            r36 = r9
            r26 = r4
            r27 = r3
            r28 = r2
            r29 = r1
            r24 = r14
            r25 = r13
            r20 = r10
            r21 = r7
            r18 = r11
            r17 = r12
            X.1OC r4 = r16.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.B57 r3 = r8.A0T
            r2 = 2
            X.B5C r1 = new X.B5C
            r1.<init>(r3, r5, r0, r2)
            r4.A00 = r1
            r0 = 907995904(0x361eeb00, float:2.3680623E-6)
            X.1ES.A05(r4, r0, r2, r6, r6)
            r8.A02 = r4
            goto L_0x0036
        L_0x0114:
            r33 = r5
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52167GHj.A02(X.GHj, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0296, code lost:
        if (r10.isEmpty() != false) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x031f, code lost:
        if (r26 != null) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0321, code lost:
        r9 = r4.A0V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0327, code lost:
        if (r9.A0Y() != false) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0329, code lost:
        r8 = X.AnonymousClass7TE.A1C();
        r7 = X.AnonymousClass7TE.A1C();
        r10 = X.AnonymousClass7TE.A1E();
        r11 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x033d, code lost:
        if (r11.hasNext() == false) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x033f, code lost:
        r0 = (com.instagram.api.schemas.MediaIdToBrandSafetyContentBlocklistBitmapMapImpl) r11.next();
        r1 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0347, code lost:
        if (r1 == null) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0349, code lost:
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x034b, code lost:
        if (r0 == null) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x034d, code lost:
        r10.put(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x035d, code lost:
        if (r26.isEmpty() != false) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0363, code lost:
        r0 = r9.A0K(X.C295365o2.ORGANIC);
        r11 = X.AnonymousClass7TG.A0r(r0);
        r13 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0375, code lost:
        if (r13.hasNext() == false) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0377, code lost:
        r12 = ((X.C267324bN) r13.next()).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x037f, code lost:
        if (r12 == null) goto L_0x039d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0381, code lost:
        r9 = r12.A2n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0385, code lost:
        if (r9 == null) goto L_0x039d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x038b, code lost:
        if (r10.containsKey(r9) == false) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x038d, code lost:
        r1 = (com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj) r10.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0393, code lost:
        if (r1 == null) goto L_0x039a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0395, code lost:
        r12.A0C.EQ5(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x039a, code lost:
        r7.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x039d, code lost:
        r11.add(X.C60340gF.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03a7, code lost:
        if (r10.containsKey(r9) != false) goto L_0x039d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03a9, code lost:
        r8.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03b1, code lost:
        if (X.DbT.A1b(r8) == false) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03bc, code lost:
        if (X.182.A06(r3, r15, 36317925627401873L) == false) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03be, code lost:
        r2 = X.0wj.A01.AEf("UNMATCHED_ORGANIC_MEDIA", 817903741);
        r1 = X.AnonymousClass7TE.A1A();
        r1.append(r8.size());
        r1.append(" Unmatched organic media ids in adapter: ");
        r1.append(r8);
        r2.ABQ(com.facebook.react.modules.dialog.DialogModule.KEY_MESSAGE, X.AnonymousClass7TG.A0m(r7, " organic media ids in brs severity map: ", r1));
        r2.report();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03e7, code lost:
        if (r4.A0F == false) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03eb, code lost:
        if (r4.A0G == false) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03ed, code lost:
        A02(r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03f0, code lost:
        r7 = r6.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03f8, code lost:
        if (r7.hasNext() == false) goto L_0x047d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03fa, code lost:
        r6 = (X.C267324bN) ((X.C376489Ie) r7.next()).A03;
        r0 = r6.A02;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0407, code lost:
        if (r0 == null) goto L_0x047b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0409, code lost:
        r1 = r0.A0C.BMi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x040f, code lost:
        if (r1 == null) goto L_0x047b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0411, code lost:
        r5 = X.0cp.A01(r4.A0M, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x041b, code lost:
        if (r6.CcK() == false) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x041d, code lost:
        r0 = r6.A06().A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0425, code lost:
        if (r0 == null) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0427, code lost:
        r0 = (com.instagram.model.androidlink.AndroidLink) X.00k.A0J(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x042d, code lost:
        if (r0 == null) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x042f, code lost:
        r2 = X.C271714jT.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0435, code lost:
        if (r2 != X.AnonymousClass47L.AD_DESTINATION_CANVAS) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0437, code lost:
        if (r5 == null) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x043f, code lost:
        if (X.SL1.A02(r5, "clips_canvas_bloks_prefetch") == false) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0441, code lost:
        r1 = r6.A06().A0K.A0C.Aok();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x044d, code lost:
        if (r1 == null) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0451, code lost:
        if ((r1 instanceof java.util.Collection) == false) goto L_0x045a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0457, code lost:
        if (r1.isEmpty() == false) goto L_0x045a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x045a, code lost:
        r2 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0462, code lost:
        if (r2.hasNext() == false) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0472, code lost:
        if (((X.1Xj) r2.next()).A0C.Aom() != com.instagram.api.schemas.CollectionMediaRole.THUMBNAIL_MEDIA) goto L_0x045e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0474, code lost:
        X.SL1.A01(r4.A0L, r5, r15, "clips_canvas_bloks_prefetch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x047b, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x047d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b8, code lost:
        if (r8 == 0) goto L_0x01ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C52167GHj r24, java.util.List r25, java.util.List r26, java.util.Map r27) {
        /*
            r4 = r24
            com.instagram.common.session.UserSession r15 = r4.A0P
            X.0Tu r3 = X.0Tu.A05
            r0 = 36318509745641661(0x81077e002918bd, double:3.031310033819705E-306)
            boolean r0 = X.182.A06(r3, r15, r0)
            r6 = r25
            if (r0 == 0) goto L_0x002c
            java.util.Iterator r2 = r6.iterator()
        L_0x0017:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r1 = r2.next()
            X.9Ie r1 = (X.C376489Ie) r1
            java.lang.Integer r0 = r4.A05
            r1.A00 = r0
            boolean r0 = r4.A0F
            r1.A01 = r0
            goto L_0x0017
        L_0x002c:
            boolean r0 = r4.A0F
            r5 = 9
            if (r0 == 0) goto L_0x007a
            r0 = 36318509745445050(0x81077e002618ba, double:3.031310033695367E-306)
        L_0x0037:
            boolean r0 = X.182.A06(r3, r15, r0)
            if (r0 != 0) goto L_0x0226
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r6.iterator()
        L_0x0045:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r7 = r9.next()
            r0 = r7
            X.9Ie r0 = (X.C376489Ie) r0
            java.lang.Object r2 = r0.A03
            X.4bN r2 = (X.C267324bN) r2
            X.5o2 r0 = r2.A01
            int r1 = r0.ordinal()
            if (r1 == r5) goto L_0x0073
            r0 = 16
            if (r1 == r0) goto L_0x006e
            X.3OA r0 = r2.A06()
            X.1Xj r0 = r0.A0K
        L_0x0068:
            if (r0 == 0) goto L_0x0045
        L_0x006a:
            r8.add(r7)
            goto L_0x0045
        L_0x006e:
            X.Cw7 r0 = r2.A04()
            goto L_0x0068
        L_0x0073:
            X.1Xj r0 = r2.A02
            if (r0 != 0) goto L_0x006a
            java.util.List r0 = r2.A0T
            goto L_0x0068
        L_0x007a:
            r0 = 36318509745510587(0x81077e002718bb, double:3.031310033736813E-306)
            goto L_0x0037
        L_0x0080:
            java.util.Iterator r12 = r8.iterator()
        L_0x0084:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0226
            java.lang.Object r0 = r12.next()
            X.9Ie r0 = (X.C376489Ie) r0
            java.lang.Object r8 = r0.A03
            X.4bN r8 = (X.C267324bN) r8
            boolean r0 = r8.A0F()
            if (r0 == 0) goto L_0x00f9
            X.ILx r0 = r8.A03()
            X.9Iz r0 = r0.A01
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x00b3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r0 = r1.next()
            X.3OA r0 = (X.AnonymousClass3OA) r0
            X.1Xj r0 = r0.A0K
            r2.add(r0)
            goto L_0x00b3
        L_0x00c5:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00ce:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.1Xj r0 = (X.1Xj) r0
            boolean r0 = r0.CeS()
            if (r0 == 0) goto L_0x00ce
            r5.add(r1)
            goto L_0x00ce
        L_0x00e5:
            java.util.Iterator r1 = r5.iterator()
        L_0x00e9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r1.next()
            X.1Xj r0 = (X.1Xj) r0
            r4.A01(r0)
            goto L_0x00e9
        L_0x00f9:
            boolean r0 = r4.A0q
            if (r0 == 0) goto L_0x01f3
            X.5o2 r1 = r8.A01
            X.5o2 r0 = X.C295365o2.AD
            if (r1 != r0) goto L_0x01f3
            X.3OA r0 = r8.A06()
            X.3y4 r0 = r0.A0I
            if (r0 == 0) goto L_0x01f3
            X.3OA r0 = r8.A06()
            X.3y4 r0 = r0.A0I
            if (r0 == 0) goto L_0x0084
            X.XB5 r11 = r0.BUi()
            if (r11 == 0) goto L_0x0084
            com.instagram.music.common.model.MusicDataSource r2 = X.C55162HdE.A00(r11)
            java.lang.String r1 = X.C271584jF.A02(r15, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            X.4im r10 = new X.4im
            r10.<init>(r0, r1)
            java.lang.String r0 = r2.A04
            r10.A08 = r0
            r5 = 1
            r10.A0H = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r10.A07 = r0
            r0 = -1
            r10.A02 = r0
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.IG_REELS_AUDIO_AD
            r10.A04 = r0
            boolean r9 = r4.A0h
            long r0 = r4.A0K
            int r2 = (int) r0
            r7 = 0
            if (r9 == 0) goto L_0x0149
            r10.A01 = r7
            r10.A00 = r2
        L_0x0149:
            X.3WR r1 = r10.A00()
            X.4DU r0 = r4.A0R
            java.lang.String r0 = r0.getModuleName()
            X.3vO r2 = new X.3vO
            r2.<init>(r1, r0)
            r0 = 36320541263077966(0x8109570009224e, double:3.032594773626688E-306)
            boolean r0 = X.182.A06(r3, r15, r0)
            if (r0 == 0) goto L_0x01e5
            X.3OA r0 = r8.A06()
            java.lang.String r8 = r0.A0S
            r0 = 36314721581927183(0x81040c00020b0f, double:3.028914383832958E-306)
            boolean r0 = X.182.A06(r3, r15, r0)
            if (r0 == 0) goto L_0x01f1
            r9 = -1
            if (r8 == 0) goto L_0x01ee
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r8)
            if (r0 == 0) goto L_0x01ee
            long r0 = r0.longValue()
        L_0x0184:
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r15.A06
            java.lang.String r21 = "clips_viewer_clips_tab"
            X.93T r0 = r4.A0W
            java.lang.String r0 = r0.A01
            X.0qQ.A0B(r0, r7)
            java.lang.String r8 = r11.getId()
            if (r8 == 0) goto L_0x01a5
            r7 = 10
            java.lang.Long r7 = X.00y.A0n(r7, r8)
            if (r7 == 0) goto L_0x01a5
            long r9 = r7.longValue()
        L_0x01a5:
            java.lang.Long r17 = java.lang.Long.valueOf(r9)
            java.lang.Long r19 = r11.Bz0()
            java.lang.String r7 = r11.BhY()
            if (r7 == 0) goto L_0x01ba
            int r8 = r7.length()
            r7 = 0
            if (r8 != 0) goto L_0x01bb
        L_0x01ba:
            r7 = 1
        L_0x01bb:
            r24 = r7 ^ 1
            java.lang.Long r18 = r11.AzI()
            java.util.List r23 = r11.Afe()
            if (r23 != 0) goto L_0x01c9
            X.0sn r23 = X.0sn.A00
        L_0x01c9:
            r20 = r1
            r22 = r0
            r25 = r5
            X.XAx r5 = X.C55161HdD.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x01d3:
            r0 = 2
            X.PRk r1 = new X.PRk
            r1.<init>(r5, r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r2.A03 = r0
            if (r5 == 0) goto L_0x01e5
            r5.CiK()
        L_0x01e5:
            X.3uP r0 = X.C255593uO.A00(r15)
            r0.A01(r2)
            goto L_0x0084
        L_0x01ee:
            r0 = -1
            goto L_0x0184
        L_0x01f1:
            r5 = 0
            goto L_0x01d3
        L_0x01f3:
            X.5o2 r1 = r8.A01
            X.5o2 r0 = X.C295365o2.BRAND_SURVEY
            if (r1 == r0) goto L_0x0084
            java.util.List r0 = r8.A0T
            if (r0 != 0) goto L_0x0084
            X.5o2 r0 = X.C295365o2.NETEGO
            if (r1 != r0) goto L_0x020f
            X.1Xj r2 = r8.A02
        L_0x0203:
            if (r2 != 0) goto L_0x0216
            java.lang.String r2 = "ClipsSponsoredContentFetcher"
            java.lang.String r1 = "Media item is not available for prefetch"
            r0 = 0
            X.0kD.A07(r2, r1, r0)
            goto L_0x0084
        L_0x020f:
            X.3OA r0 = r8.A06()
            X.1Xj r2 = r0.A0K
            goto L_0x0203
        L_0x0216:
            r0 = 36330771874595595(0x8112a50000430b, double:3.039064653545803E-306)
            boolean r0 = X.182.A06(r3, r15, r0)
            if (r0 != 0) goto L_0x0084
            r4.A01(r2)
            goto L_0x0084
        L_0x0226:
            r10 = r27
            if (r27 != 0) goto L_0x0289
            java.lang.String r7 = "null"
        L_0x022c:
            r1 = 1
        L_0x022d:
            java.lang.String r5 = "message"
            r2 = 817903741(0x30c0387d, float:1.3985894E-9)
            if (r1 == 0) goto L_0x0237
            X.G9w.A1H(r3, r15, r7)
        L_0x0237:
            if (r27 == 0) goto L_0x0305
            X.HJk r12 = r4.A0V
            boolean r0 = r12.A0Y()
            if (r0 != 0) goto L_0x0305
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            X.5o2 r11 = X.C295365o2.ORGANIC
            java.util.List r0 = r12.A0K(r11)
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r14 = r0.iterator()
        L_0x0257:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x029c
            java.lang.Object r0 = r14.next()
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x0283
            java.lang.String r13 = r0.A2n()
            if (r13 == 0) goto L_0x0283
            boolean r1 = r10.containsKey(r13)
            if (r1 == 0) goto L_0x0283
            java.lang.Object r1 = r10.get(r13)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L_0x0280
            X.1Xy r0 = r0.A0C
            r0.EQ6(r1)
        L_0x0280:
            r8.add(r13)
        L_0x0283:
            X.0gF r0 = X.C60340gF.A00
            r7.add(r0)
            goto L_0x0257
        L_0x0289:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0299
            java.lang.String r7 = "empty"
        L_0x0291:
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x022d
            goto L_0x022c
        L_0x0299:
            java.lang.String r7 = "valid"
            goto L_0x0291
        L_0x029c:
            java.util.List r0 = r12.A0K(r11)
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x02a8:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02cd
            java.lang.Object r0 = r10.next()
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x02c7
            java.lang.String r1 = r0.A2n()
            if (r1 == 0) goto L_0x02c7
            java.lang.Integer r0 = r0.A2I()
            if (r0 != 0) goto L_0x02c7
            r9.add(r1)
        L_0x02c7:
            X.0gF r0 = X.C60340gF.A00
            r7.add(r0)
            goto L_0x02a8
        L_0x02cd:
            boolean r0 = X.DbT.A1b(r9)
            if (r0 == 0) goto L_0x0305
            r0 = 36317925627401873(0x8106f600001691, double:3.0309406350928074E-306)
            boolean r0 = X.182.A06(r3, r15, r0)
            if (r0 == 0) goto L_0x0305
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "UNMATCHED_ORGANIC_MEDIA"
            X.0f9 r7 = r1.AEf(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            int r0 = r9.size()
            r1.append(r0)
            java.lang.String r0 = " Unmatched organic media ids in adapter: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " organic media ids in brs severity map: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r8, r0, r1)
            r7.ABQ(r5, r0)
            r7.report()
        L_0x0305:
            if (r26 != 0) goto L_0x0351
            java.lang.String r8 = "null"
        L_0x0309:
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "AD_REELS_BRS_ERROR"
            X.0f9 r7 = r1.AEf(r0, r2)
            java.lang.String r1 = "Received "
            java.lang.String r0 = " brs blocklist map"
            java.lang.String r0 = X.002.A0g(r1, r8, r0)
            r7.ABQ(r5, r0)
            r7.report()
            if (r26 == 0) goto L_0x03e5
        L_0x0321:
            X.HJk r9 = r4.A0V
            boolean r0 = r9.A0Y()
            if (r0 != 0) goto L_0x03e5
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r11 = r26.iterator()
        L_0x0339:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0363
            java.lang.Object r0 = r11.next()
            com.instagram.api.schemas.MediaIdToBrandSafetyContentBlocklistBitmapMapImpl r0 = (com.instagram.api.schemas.MediaIdToBrandSafetyContentBlocklistBitmapMapImpl) r0
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x0339
            com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj r0 = r0.A00
            if (r0 == 0) goto L_0x0339
            r10.put(r1, r0)
            goto L_0x0339
        L_0x0351:
            boolean r0 = r26.isEmpty()
            if (r0 == 0) goto L_0x0360
            java.lang.String r8 = "empty"
        L_0x0359:
            boolean r0 = r26.isEmpty()
            if (r0 == 0) goto L_0x0321
            goto L_0x0309
        L_0x0360:
            java.lang.String r8 = "valid"
            goto L_0x0359
        L_0x0363:
            X.5o2 r0 = X.C295365o2.ORGANIC
            java.util.List r0 = r9.A0K(r0)
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x0371:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x03ad
            java.lang.Object r0 = r13.next()
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r12 = r0.A02
            if (r12 == 0) goto L_0x039d
            java.lang.String r9 = r12.A2n()
            if (r9 == 0) goto L_0x039d
            boolean r0 = r10.containsKey(r9)
            if (r0 == 0) goto L_0x03a3
            java.lang.Object r1 = r10.get(r9)
            com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj r1 = (com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj) r1
            if (r1 == 0) goto L_0x039a
            X.1Xy r0 = r12.A0C
            r0.EQ5(r1)
        L_0x039a:
            r7.add(r9)
        L_0x039d:
            X.0gF r0 = X.C60340gF.A00
            r11.add(r0)
            goto L_0x0371
        L_0x03a3:
            boolean r0 = r10.containsKey(r9)
            if (r0 != 0) goto L_0x039d
            r8.add(r9)
            goto L_0x039d
        L_0x03ad:
            boolean r0 = X.DbT.A1b(r8)
            if (r0 == 0) goto L_0x03e5
            r0 = 36317925627401873(0x8106f600001691, double:3.0309406350928074E-306)
            boolean r0 = X.182.A06(r3, r15, r0)
            if (r0 == 0) goto L_0x03e5
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = "UNMATCHED_ORGANIC_MEDIA"
            X.0f9 r2 = r1.AEf(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            int r0 = r8.size()
            r1.append(r0)
            java.lang.String r0 = " Unmatched organic media ids in adapter: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " organic media ids in brs severity map: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r7, r0, r1)
            r2.ABQ(r5, r0)
            r2.report()
        L_0x03e5:
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x03ed
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x03f0
        L_0x03ed:
            A02(r4, r6)
        L_0x03f0:
            java.util.Iterator r7 = r6.iterator()
        L_0x03f4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x047d
            java.lang.Object r0 = r7.next()
            X.9Ie r0 = (X.C376489Ie) r0
            java.lang.Object r6 = r0.A03
            X.4bN r6 = (X.C267324bN) r6
            X.1Xj r0 = r6.A02
            r2 = 0
            if (r0 == 0) goto L_0x047b
            X.1Xy r0 = r0.A0C
            java.lang.String r1 = r0.BMi()
            if (r1 == 0) goto L_0x047b
            X.0bY r0 = r4.A0M
            android.net.Uri r5 = X.0cp.A01(r0, r1)
        L_0x0417:
            boolean r0 = r6.CcK()
            if (r0 == 0) goto L_0x03f4
            X.3OA r0 = r6.A06()
            java.util.List r0 = r0.A04()
            if (r0 == 0) goto L_0x0433
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            if (r0 == 0) goto L_0x0433
            X.47L r2 = X.C271714jT.A01(r0)
        L_0x0433:
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_CANVAS
            if (r2 != r0) goto L_0x03f4
            if (r5 == 0) goto L_0x03f4
            java.lang.String r3 = "clips_canvas_bloks_prefetch"
            boolean r0 = X.SL1.A02(r5, r3)
            if (r0 == 0) goto L_0x03f4
            X.3OA r0 = r6.A06()
            X.1Xj r0 = r0.A0K
            X.1Xy r0 = r0.A0C
            java.util.List r1 = r0.Aok()
            if (r1 == 0) goto L_0x03f4
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x045a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x045a
            goto L_0x03f4
        L_0x045a:
            java.util.Iterator r2 = r1.iterator()
        L_0x045e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03f4
            java.lang.Object r0 = r2.next()
            X.1Xj r0 = (X.1Xj) r0
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.CollectionMediaRole r1 = r0.Aom()
            com.instagram.api.schemas.CollectionMediaRole r0 = com.instagram.api.schemas.CollectionMediaRole.THUMBNAIL_MEDIA
            if (r1 != r0) goto L_0x045e
            android.content.Context r0 = r4.A0L
            X.SL1.A01(r0, r5, r15, r3)
            goto L_0x03f4
        L_0x047b:
            r5 = r2
            goto L_0x0417
        L_0x047d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52167GHj.A03(X.GHj, java.util.List, java.util.List, java.util.Map):void");
    }

    private final void A04(boolean z, boolean z2) {
        if (this.A0r && !z) {
            this.A03.CsA();
            List list = this.A0c;
            int Au2 = this.A03.Au2();
            int A012 = C52012GBj.A01(this.A0X.A00);
            if (Au2 < A012) {
                Au2 = A012;
            }
            ArrayList A002 = A00(list, Au2, true, z);
            list.clear();
            list.addAll(A002);
        }
        List list2 = this.A0c;
        A05(list2, z, z2);
        list2.clear();
    }

    public final /* synthetic */ boolean AFi() {
        return false;
    }

    public final /* synthetic */ AnonymousClass4lJ AN3() {
        return new C57364IYv();
    }

    public final /* synthetic */ String B4s() {
        return "";
    }

    public final int BWK() {
        return 0;
    }

    public final int BfG() {
        return 0;
    }

    public final Map Bk0() {
        C233072uu r0 = this.A04;
        if (r0 != null) {
            return r0.Bk0();
        }
        return null;
    }

    public final boolean CJo() {
        return this.A0A;
    }

    public final boolean CTb() {
        return C51969G9p.A1a(this.A06, AnonymousClass05K.A00);
    }

    public final /* synthetic */ void Cmj(boolean z) {
        0kD.A07("ClipsSponsoredContentFetcher", "Call of unsupported method maybeCarryOverFirstResponse", (Throwable) null);
    }

    public final void D3r(H3D h3d) {
        this.A0c.clear();
        this.A0d.clear();
        this.A0J = true;
    }

    public final void D3s() {
        if (!AnonymousClass7TE.A1b(this.A0c)) {
            return;
        }
        if (!this.A0p || this.A0J) {
            A04(this.A0I, this.A0C);
        }
    }

    public final void deactivate() {
        1OC r0 = this.A02;
        if (r0 != null) {
            r0.cancel();
        }
        this.A02 = null;
        this.A08 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        if (X.C51969G9p.A1Y(r7.A0E(r6), r8.A0b) != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ae, code lost:
        if (r8.A0H != 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList A00(java.util.List r9, int r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r4 = r8.A0P
            X.0Tu r3 = X.0Tu.A05
            r0 = 36318556989692165(0x81078900201905, double:3.03133991114748E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00a9
            if (r10 == 0) goto L_0x00a9
        L_0x0017:
            int r5 = r10 + 1
        L_0x0019:
            X.HJk r7 = r8.A0V
            java.util.List r0 = r7.A0I()
            int r6 = X.DbT.A02(r0, r3)
            if (r5 > r6) goto L_0x009e
        L_0x0025:
            X.4bN r0 = r7.A0E(r6)
            java.lang.String r0 = r0.getId()
            boolean r0 = r9.contains(r0)
            if (r0 != 0) goto L_0x0049
            X.4bN r0 = r7.A0E(r6)
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0049
            java.lang.String r1 = r8.A0b
            X.4bN r0 = r7.A0E(r6)
            boolean r0 = X.C51969G9p.A1Y(r0, r1)
            if (r0 == 0) goto L_0x0062
        L_0x0049:
            java.util.List r0 = r7.A0I()
            java.lang.Object r0 = X.00k.A0O(r0, r6)
            X.4bN r0 = (X.C267324bN) r0
            if (r0 == 0) goto L_0x0062
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0062
            r2.add(r4, r0)
        L_0x0062:
            X.4bN r0 = r7.A0E(r6)
            X.0qQ.A0B(r0, r4)
            boolean r0 = X.GDZ.A00(r0)
            if (r0 != 0) goto L_0x009e
            X.4bN r0 = r7.A0E(r6)
            X.0qQ.A0B(r0, r4)
            X.5o2 r1 = r0.A01
            X.5o2 r0 = X.C295365o2.NETEGO
            if (r1 == r0) goto L_0x009e
            X.4bN r0 = r7.A0E(r6)
            X.5o2 r1 = r0.A01
            X.5o2 r0 = X.C295365o2.ORGANIC
            if (r1 != r0) goto L_0x00a3
            X.4bN r0 = r7.A0E(r6)
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x00a3
            X.4bN r0 = r7.A0E(r6)
            java.lang.String r0 = r0.getId()
            boolean r0 = r9.contains(r0)
            if (r0 != 0) goto L_0x00a3
        L_0x009e:
            if (r11 == 0) goto L_0x00a2
            r8.A09 = r3
        L_0x00a2:
            return r2
        L_0x00a3:
            if (r6 == r5) goto L_0x009e
            int r6 = r6 + -1
            goto L_0x0025
        L_0x00a9:
            if (r12 == 0) goto L_0x0017
            int r0 = r8.A0H
            r5 = 0
            if (r0 == 0) goto L_0x0019
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52167GHj.A00(java.util.List, int, boolean, boolean):java.util.ArrayList");
    }

    public final /* synthetic */ Set Bsw() {
        return AnonymousClass7TE.A1F();
    }

    public final /* synthetic */ void Cn8(AnonymousClass9J0 r1, C233632w4 r2, C238523Ce r3, String str, String str2, double d, boolean z) {
        AnonymousClass7TG.A1P(r2, r3);
    }
}
