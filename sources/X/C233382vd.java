package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2vd  reason: invalid class name and case insensitive filesystem */
public final class C233382vd implements C233392ve {
    public int A00 = -1;
    public int A01 = -1;
    public C251373n0 A02;
    public final UserSession A03;
    public final AnonymousClass57P A04;
    public final AnonymousClass2rI A05;
    public final C228812mN A06;
    public final AnonymousClass2vK A07;
    public final Set A08 = new HashSet();
    public final C233372vc A09;
    public final boolean A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0036, code lost:
        if (X.182.A06(r2, r4, 36319377326480568L) != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C233382vd(com.instagram.common.session.UserSession r4, X.AnonymousClass57P r5, X.AnonymousClass2rI r6, X.C233372vc r7, X.C228812mN r8, X.AnonymousClass2vK r9) {
        /*
            r3 = this;
            r0 = 2
            X.0qQ.A0B(r8, r0)
            r3.<init>()
            r3.A05 = r6
            r3.A06 = r8
            r3.A07 = r9
            r3.A03 = r4
            r3.A09 = r7
            r3.A04 = r5
            r0 = -1
            r3.A00 = r0
            r3.A01 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.A08 = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319377326349495(0x81084800001cb7, double:3.031858695352806E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0038
            r0 = 36319377326480568(0x81084800021cb8, double:3.031858695435697E-306)
            boolean r1 = X.182.A06(r2, r4, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            r3.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233382vd.<init>(com.instagram.common.session.UserSession, X.57P, X.2rI, X.2vc, X.2mN, X.2vK):void");
    }

    public final float AuH() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dpi() {
        this.A02 = null;
        this.A00 = -1;
        this.A01 = -1;
        this.A08.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0201, code lost:
        if (r0 == null) goto L_0x012f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E5G(java.lang.String r39, java.util.List r40, int r41, int r42, int r43, int r44) {
        /*
            r38 = this;
            r0 = 3
            r11 = r40
            X.0qQ.A0B(r11, r0)
            r1 = 4
            r23 = r39
            r0 = r23
            X.0qQ.A0B(r0, r1)
            r12 = r38
            java.util.Set r0 = r12.A08
            java.util.List r0 = X.00k.A0W(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            X.Ijw r0 = new X.Ijw
            r0.<init>(r12)
            java.util.List r6 = X.00k.A0g(r1, r0)
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.HashMap r18 = new java.util.HashMap
            r18.<init>()
            r0 = 3395(0xd43, float:4.757E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r8 = "rti_push_up"
        L_0x0048:
            com.instagram.common.session.UserSession r3 = r12.A03
            X.0Tu r2 = X.0Tu.A06
            r0 = 36315005050031033(0x81044e00060bb9, double:3.029093650203267E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.String r17 = ""
            r10 = r41
            if (r0 == 0) goto L_0x00fd
            r5 = 1
            int r1 = r41 - r5
        L_0x005e:
            r0 = -1
            if (r0 >= r1) goto L_0x00f2
            X.2rI r0 = r12.A05
            X.1Xg r0 = r0.A04(r1)
            if (r0 == 0) goto L_0x00ee
            boolean r0 = X.AnonymousClass3VP.A01(r0)
            if (r0 == 0) goto L_0x00ee
        L_0x006f:
            X.2rI r4 = r12.A05
            X.1Xg r0 = r4.A04(r1)
            if (r0 == 0) goto L_0x00ec
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
        L_0x007d:
            int[] r1 = r4.getModelIndex(r0)
            r2 = 0
            if (r1 == 0) goto L_0x00fd
            java.lang.Integer r0 = X.03t.A04(r1, r2)
            if (r0 == 0) goto L_0x00ea
            int r3 = r0.intValue()
        L_0x008e:
            java.lang.Integer r0 = X.03t.A04(r1, r5)
            if (r0 == 0) goto L_0x00e8
            int r0 = r0.intValue()
        L_0x0098:
            if (r3 < 0) goto L_0x00fd
            if (r0 <= 0) goto L_0x00fd
            int r0 = r0 + r3
            int r1 = r4.getItemCount()
            int r1 = r1 - r5
            int[] r0 = new int[]{r0, r1}
            r2 = r0[r2]
            if (r1 >= r2) goto L_0x00ab
            r2 = r1
        L_0x00ab:
            r5 = r17
        L_0x00ad:
            if (r3 >= r2) goto L_0x0100
            int r0 = r4.getItemViewType(r3)
            int r1 = r4.getBinderGroupViewType(r0, r3)
            X.2rv[] r0 = X.C231592rv.values()
            int r0 = r0.length
            if (r1 > r0) goto L_0x00e5
            X.2rv[] r0 = X.C231592rv.values()
            r0 = r0[r1]
            if (r0 == 0) goto L_0x00e5
            int r0 = r0.ordinal()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            int r3 = r3 + 1
            goto L_0x00ad
        L_0x00e5:
            r0 = r17
            goto L_0x00ce
        L_0x00e8:
            r0 = 0
            goto L_0x0098
        L_0x00ea:
            r3 = 0
            goto L_0x008e
        L_0x00ec:
            r0 = 0
            goto L_0x007d
        L_0x00ee:
            int r1 = r1 + -1
            goto L_0x005e
        L_0x00f2:
            r1 = -1
            goto L_0x006f
        L_0x00f5:
            r0 = 4090(0xffa, float:5.731E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            goto L_0x0048
        L_0x00fd:
            r15 = r17
            goto L_0x0108
        L_0x0100:
            java.lang.CharSequence r0 = X.00l.A0B(r5)
            java.lang.String r15 = r0.toString()
        L_0x0108:
            java.util.Iterator r16 = r6.iterator()
            r5 = 0
            r24 = 0
            r4 = 0
        L_0x0110:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x020f
            java.lang.Object r7 = r16.next()
            X.4EB r7 = (X.AnonymousClass4EB) r7
            X.2rI r2 = r12.A05
            X.2mN r1 = r12.A06
            boolean r0 = r1.CYA(r7)
            r3 = r17
            if (r0 == 0) goto L_0x01e7
            X.0qQ.A0A(r7)
            java.lang.String r3 = r1.BEZ(r7)
        L_0x012f:
            r0 = r3
        L_0x0130:
            int r6 = r2.BJU(r0)
            if (r6 < r10) goto L_0x0110
            if (r6 != r10) goto L_0x0161
            X.2vl r3 = r7.A03
            X.1sS r0 = r3.A01
            if (r0 == 0) goto L_0x01e3
            java.lang.Double r0 = r0.C7G()
            if (r0 == 0) goto L_0x01e3
            double r0 = r0.doubleValue()
            float r9 = (float) r0
        L_0x0149:
            X.9Iz r1 = r3.A07
            java.lang.Object r5 = r1.A01
            java.lang.Integer r5 = (java.lang.Integer) r5
            X.1sS r0 = r3.A01
            if (r0 == 0) goto L_0x01df
            java.lang.String r0 = r0.BiN()
            if (r0 == 0) goto L_0x01df
            java.lang.Integer r24 = X.00y.A0l(r0)
        L_0x015d:
            java.lang.Object r4 = r1.A00
            java.lang.Integer r4 = (java.lang.Integer) r4
        L_0x0161:
            X.2vc r1 = r12.A09
            java.util.List r0 = r2.A07()
            r14 = r42
            int r13 = r6 - r42
            X.1Xg r3 = r7.A01
            boolean r0 = r1.Cd4(r3, r0, r13)
            if (r0 == 0) goto L_0x020f
            r1 = 1
            X.0qQ.A0B(r3, r1)
            X.2rX r2 = r2.A00
            X.2rU r2 = (X.C231352rU) r2
            java.lang.Object r0 = r2.A03
            monitor-enter(r0)
            r2.A0C(r3)     // Catch:{ all -> 0x020c }
            X.AnonymousClass2rW.A01(r2, r3, r13, r1)     // Catch:{ all -> 0x020c }
            monitor-exit(r0)
            X.57P r0 = r12.A04
            if (r0 == 0) goto L_0x019a
            X.3VX r2 = r0.A04
            r0 = 2327(0x917, float:3.261E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = " to"
            java.lang.String r0 = X.002.A0c(r1, r0, r6)
            r2.A04(r11, r13, r0)
        L_0x019a:
            X.2vl r0 = r7.A03
            r0.A00 = r14
            X.1Xn r2 = r3.A05
            X.1Xj r0 = X.1Xi.A02(r2)
            if (r0 == 0) goto L_0x01ac
            java.lang.String r1 = r0.A2R()
            if (r1 != 0) goto L_0x01ae
        L_0x01ac:
            java.lang.String r1 = r3.A09
        L_0x01ae:
            r0 = r21
            r0.add(r1)
            java.lang.String r3 = java.lang.String.valueOf(r6)
            r0 = r20
            r0.add(r3)
            java.lang.String r3 = java.lang.String.valueOf(r13)
            r0 = r19
            r0.add(r3)
            X.1Xj r0 = X.1Xi.A02(r2)
            if (r0 == 0) goto L_0x01d1
            java.lang.String r3 = r0.A2v()
            if (r3 != 0) goto L_0x01d8
        L_0x01d1:
            java.lang.String r3 = r2.C9L()
            X.0qQ.A0A(r3)
        L_0x01d8:
            r0 = r18
            r0.put(r1, r3)
            goto L_0x0110
        L_0x01df:
            r24 = 0
            goto L_0x015d
        L_0x01e3:
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0149
        L_0x01e7:
            boolean r0 = r1.CcL(r7)
            if (r0 == 0) goto L_0x012f
            boolean r1 = A01(r12)
            X.1Xg r0 = r7.A01
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
            if (r1 == 0) goto L_0x0205
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r0.A2R()
        L_0x0201:
            if (r0 != 0) goto L_0x0130
            goto L_0x012f
        L_0x0205:
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r0.getId()
            goto L_0x0201
        L_0x020c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x020f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r44)
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x026e
            X.2rI r11 = r12.A05
            r0 = -1
            r11.A0A(r0)
            int r1 = r41 + -1
            X.1Xg r7 = r11.A04(r1)
            if (r7 == 0) goto L_0x026f
            X.1Xn r3 = r7.A05
            X.1Xj r6 = X.1Xi.A02(r3)
            if (r6 == 0) goto L_0x0243
            X.2lb r1 = r11.A0S
            X.3W1 r0 = r1.BQr(r6)
            r0.A1P = r8
            X.3W1 r0 = r1.BQr(r6)
            r0.A19 = r2
            X.3W1 r0 = r1.BQr(r6)
            r0.A1T = r15
        L_0x0243:
            X.2vK r1 = r12.A07
            java.lang.String r0 = r7.A09
            java.lang.String r29 = r12.A00()
            X.1Xj r22 = X.1Xi.A02(r3)
            r30 = r23
            r31 = r15
            r32 = r18
            r33 = r21
            r34 = r20
            r35 = r19
            r36 = r9
            r37 = r43
            r21 = r1
            r23 = r5
            r25 = r4
            r26 = r2
            r27 = r8
            r28 = r0
            r21.Cgy(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
        L_0x026e:
            return
        L_0x026f:
            java.lang.String r0 = "Attempted to log an injection of an item out of bounds at position: "
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.String r0 = "feed_acp"
            X.0wb.A03(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233382vd.E5G(java.lang.String, java.util.List, int, int, int, int):void");
    }

    private final String A00() {
        StringBuilder sb;
        char c;
        int i = 0;
        String str = "";
        for (1Xg r1 : this.A05.A07()) {
            if (i >= 50) {
                break;
            }
            if (AnonymousClass3VP.A00(r1)) {
                sb = new StringBuilder();
                sb.append(str);
                c = 'A';
            } else {
                boolean A032 = AnonymousClass3VP.A03(r1);
                sb = new StringBuilder();
                if (A032) {
                    sb.append(str);
                    c = 'N';
                } else {
                    sb.append(str);
                    c = 'O';
                }
            }
            sb.append(c);
            str = sb.toString();
            i++;
        }
        return str;
    }

    public static final boolean A01(C233382vd r3) {
        UserSession userSession = r3.A03;
        if (C228342lQ.A08(userSession, 1Au.A00(userSession)) || 182.A06(0Tu.A06, userSession, 36312879040824667L)) {
            return true;
        }
        return false;
    }

    public final List AGf() {
        1Pi r0;
        AnonymousClass2rI r1 = this.A05;
        r1.A0A(-1);
        List A072 = r1.A07();
        ArrayList arrayList = new ArrayList(0Yv.A1E(A072, 10));
        for (Object next : A072) {
            C228812mN r12 = this.A06;
            if (r12.CVw(next)) {
                r0 = 1Pi.A02;
            } else if (r12.CVy(next) || r12.CVx(next)) {
                r0 = 1Pi.A04;
            } else {
                r0 = 1Pi.A03;
            }
            arrayList.add(r0);
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ void AHP(Object obj) {
        throw new UnsupportedOperationException("Ad Pod is not supported for Feed.");
    }

    public final List ANR() {
        UserSession userSession = this.A03;
        if (!182.A06(0Tu.A05, userSession, 36330879248909121L)) {
            return 0sn.A00;
        }
        List singletonList = Collections.singletonList(new C55811Hnr(userSession, this.A05));
        0qQ.A07(singletonList);
        return singletonList;
    }

    public final boolean ARN() {
        return 182.A06(0Tu.A05, this.A03, 36330879248843584L);
    }

    public final /* bridge */ /* synthetic */ Object BTe(int i) {
        AnonymousClass2rI r5 = this.A05;
        if (r5.B5I() > i) {
            for (Object next : this.A08) {
                if (0qQ.A0K(((AnonymousClass4EB) next).A01, r5.A03(i))) {
                    return next;
                }
            }
        }
        return null;
    }

    public final List BYj() {
        return 00k.A0U(this.A05.A06());
    }

    public final List BYp() {
        return 0sn.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r12.A03() != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (r13 == X.AnonymousClass3PG.A04) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer CNL(X.C251373n0 r32, X.1PW r33, int r34) {
        /*
            r31 = this;
            java.lang.String r8 = "feed_acp"
            r0 = 0
            r11 = r32
            X.0qQ.A0B(r11, r0)
            r0 = 2
            r7 = r33
            X.0qQ.A0B(r7, r0)
            java.lang.Object r4 = r11.BTb()
            X.4EB r4 = (X.AnonymousClass4EB) r4
            r6 = r31
            r5 = r34
            com.instagram.common.session.UserSession r14 = r6.A03     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            X.2mN r3 = r6.A06     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            boolean r12 = r3.CcL(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            boolean r9 = r3.CYA(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            X.3PG r13 = r4.A02     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            X.3PG r10 = X.AnonymousClass3PG.CACHED     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            r2 = 1
            if (r13 == r10) goto L_0x0030
            X.3PG r1 = X.AnonymousClass3PG.LOCAL     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            r0 = 0
            if (r13 != r1) goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            boolean r0 = X.C233832wY.A05(r14, r12, r9, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            if (r0 == 0) goto L_0x003a
            java.lang.Integer r0 = X.AnonymousClass05K.A03     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            return r0
        L_0x003a:
            X.2rI r1 = r6.A05     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            X.1Xg r12 = r4.A01     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            X.1UQ r9 = r12.A06     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            X.1UQ r0 = X.1UQ.A0T     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            if (r9 == r0) goto L_0x0057
            X.1UQ r0 = X.1UQ.A06     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            if (r9 == r0) goto L_0x0057
            X.1UQ r0 = X.1UQ.A07     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            if (r9 == r0) goto L_0x0057
            X.1UQ r0 = X.1UQ.A08     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            if (r9 == r0) goto L_0x0057
            boolean r9 = r12.A03()     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            r0 = 0
            if (r9 == 0) goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            if (r0 != 0) goto L_0x0060
            boolean r0 = r6.A0A     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            if (r0 == 0) goto L_0x0062
            if (r13 != r10) goto L_0x0062
        L_0x0060:
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            r1.A0B(r12, r5, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0149 }
            X.1Xn r13 = r12.A05
            X.1Xj r15 = X.1Xi.A02(r13)
            if (r15 == 0) goto L_0x010c
            X.1Xj r9 = X.1Xi.A02(r13)
            if (r9 == 0) goto L_0x007c
            X.2lb r0 = r1.A0S
            X.3W1 r0 = r0.BQr(r9)
            r0.A2R = r2
        L_0x007c:
            java.util.List r9 = r7.A00()
            java.lang.String r0 = "pushdown_rule_met"
            boolean r9 = r9.contains(r0)
            if (r9 == 0) goto L_0x010c
            r9 = -1
            r1.A0A(r9)
            int r9 = r34 + -1
            X.1Xg r9 = r1.A03(r9)     // Catch:{ IndexOutOfBoundsException -> 0x0103 }
            if (r9 == 0) goto L_0x010c
            java.lang.String r10 = r9.A09     // Catch:{ IndexOutOfBoundsException -> 0x0103 }
            if (r10 == 0) goto L_0x010c
            java.lang.String r8 = r15.A2R()
            if (r8 != 0) goto L_0x00a0
            java.lang.String r8 = r12.A09
        L_0x00a0:
            X.2lb r9 = r1.A0S
            X.3W1 r9 = r9.BQr(r15)
            r9.A1P = r0
            X.2vK r14 = r6.A07
            java.util.List r26 = java.util.Collections.singletonList(r8)
            X.0qQ.A07(r26)
            int r9 = r9.A0V
            int r9 = r34 - r9
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.util.List r27 = java.util.Collections.singletonList(r9)
            X.0qQ.A07(r27)
            java.lang.String r9 = java.lang.String.valueOf(r5)
            java.util.List r28 = java.util.Collections.singletonList(r9)
            X.0qQ.A07(r28)
            r29 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r12 = r7.A02
            java.lang.String r22 = r6.A00()
            java.lang.String r7 = r15.A2v()
            if (r7 != 0) goto L_0x00e0
            java.lang.String r7 = r13.C9L()
            X.0qQ.A0A(r7)
        L_0x00e0:
            X.0eP r9 = new X.0eP
            r9.<init>(r8, r7)
            X.0eP[] r7 = new X.0eP[]{r9}
            java.util.HashMap r25 = X.0Yt.A02(r7)
            r16 = 0
            r17 = r16
            r18 = r16
            r19 = r16
            r23 = r16
            r24 = r16
            r30 = r12
            r20 = r0
            r21 = r10
            r14.Cgy(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x010c
        L_0x0103:
            java.lang.String r0 = "Attempted to push down an item out of bounds at position: "
            java.lang.String r0 = X.002.A0O(r0, r5)
            X.0wb.A03(r8, r0)
        L_0x010c:
            X.1Xj r7 = X.1Xi.A02(r13)
            if (r7 == 0) goto L_0x011a
            X.2lb r0 = r1.A0S
            X.3W1 r0 = r0.BQr(r7)
            r0.A2R = r2
        L_0x011a:
            X.1Xj r1 = X.1Xi.A02(r13)
            if (r1 == 0) goto L_0x0124
            int r0 = r6.A00
            r1.A01 = r0
        L_0x0124:
            X.1Xj r1 = X.1Xi.A02(r13)
            if (r1 == 0) goto L_0x012e
            int r0 = r6.A01
            r1.A02 = r0
        L_0x012e:
            r6.A02 = r11
            java.util.Set r0 = r6.A08
            r0.add(r4)
            boolean r0 = r3.CcL(r4)
            if (r0 == 0) goto L_0x0140
            r6.A00 = r5
        L_0x013d:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            return r0
        L_0x0140:
            boolean r0 = r3.CYA(r4)
            if (r0 == 0) goto L_0x013d
            r6.A01 = r5
            goto L_0x013d
        L_0x0149:
            java.lang.String r0 = "Attempted to inject an item out of bounds at position: "
            java.lang.String r0 = X.002.A0O(r0, r5)
            X.0wb.A03(r8, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233382vd.CNL(X.3n0, X.1PW, int):java.lang.Integer");
    }

    public final /* bridge */ /* synthetic */ boolean CVS(Object obj) {
        AnonymousClass4EB r5 = (AnonymousClass4EB) obj;
        0qQ.A0B(r5, 0);
        List<1Xg> A072 = this.A05.A07();
        if (!(A072 instanceof Collection) || !A072.isEmpty()) {
            for (1Xg r0 : A072) {
                if (0qQ.A0K(r0.A09, r5.A01.A09)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C251373n0 Coa() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ void E5F(Object obj) {
        throw new UnsupportedOperationException("HP Push-Up is not supported for Feed.");
    }

    public final /* bridge */ /* synthetic */ boolean FIZ(Object obj, String str, Map map) {
        boolean z;
        String str2;
        1Xj A022;
        String str3;
        AnonymousClass4EB r9 = (AnonymousClass4EB) obj;
        0qQ.A0B(r9, 0);
        AnonymousClass2rI r3 = this.A05;
        1Xg r1 = r9.A01;
        int BJU = r3.BJU(r1.A09);
        if (r3.EDl(BJU) != null) {
            this.A08.remove(r9);
            z = true;
            if (0qQ.A0K(str, AnonymousClass000.A00(1029)) && (A022 = 1Xi.A02(r1.A05)) != null) {
                AnonymousClass3W1 BQr = r3.A0S.BQr(A022);
                if (map != null) {
                    str3 = (String) map.get("replaced_by_ad_id");
                } else {
                    str3 = null;
                }
                BQr.A1U = str3;
            }
        } else {
            z = false;
        }
        AnonymousClass57P r0 = this.A04;
        if (r0 != null) {
            AnonymousClass3VX r6 = r0.A04;
            if (z) {
                str2 = "Success";
            } else {
                str2 = "Failure";
            }
            if (str == null) {
                str = "";
            }
            List singletonList = Collections.singletonList(str);
            0qQ.A07(singletonList);
            String A0O = 002.A0O("Position ", BJU);
            List list = r6.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("Uninject ");
            sb.append(str2);
            sb.append(": ");
            sb.append(A0O);
            sb.append(' ');
            sb.append(singletonList);
            list.add(sb.toString());
            C18625VvI vvI = r6.A00;
            if (vvI != null) {
                vvI.A01();
            }
        }
        return z;
    }

    public final C251373n0 FIa() {
        throw new UnsupportedOperationException();
    }

    public final int Bdq() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final int Bdr() {
        throw AnonymousClass00P.createAndThrow();
    }
}
