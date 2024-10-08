package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.UdK  reason: case insensitive filesystem */
public final class C15469UdK extends C331047Ph implements C2366034j, C361688gd, C231302rO, X3C, X3F, C361658ga {
    public static final SimpleDateFormat A0Q = new SimpleDateFormat("MMM yyyy", Locale.getDefault());
    public 1Xj A00;
    public 2bv A01;
    public boolean A02 = false;
    public final UYJ A03 = new AnonymousClass2rW();
    public final VM4 A04 = new Object();
    public final VM4 A05 = new Object();
    public final C15572Uf0 A06;
    public final C15533UeM A07;
    public final UserSession A08;
    public final String A09;
    public final ArrayList A0A = new ArrayList();
    public final List A0B = new ArrayList();
    public final List A0C = new ArrayList();
    public final Map A0D = new HashMap();
    public final Map A0E = new HashMap();
    public final Map A0F = new HashMap();
    public final C15538UeR A0G;
    public final C15539UeS A0H;
    public final C15495Udk A0I;
    public final C15566Ueu A0J;
    public final AnonymousClass2s2 A0K;
    public final List A0L = new ArrayList();
    public final Set A0M = new HashSet();
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    public final int AJv(int i) {
        return i;
    }

    public final int AJz(int i) {
        return i;
    }

    public final Object Bkf(int i) {
        return "";
    }

    public final void Ei9(List list, boolean z, UserSession userSession) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.Udk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.Udk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.Udk} */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.2rW, X.UYJ] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.VM4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.VM4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.Ueu, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15469UdK(android.app.Activity r27, android.content.Context r28, androidx.fragment.app.Fragment r29, X.X6E r30, com.instagram.archive.fragment.ArchiveReelFragment r31, com.instagram.archive.fragment.ArchiveReelFragment r32, X.AnonymousClass0iw r33, com.instagram.common.session.UserSession r34, X.2bv r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40) {
        /*
            r26 = this;
            r12 = r26
            r12.<init>()
            X.UYJ r0 = new X.UYJ
            r0.<init>()
            r12.A03 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12.A0D = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12.A0F = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12.A0E = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.A0A = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.A0C = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.A0B = r0
            X.VM4 r0 = new X.VM4
            r0.<init>()
            r12.A05 = r0
            X.VM4 r0 = new X.VM4
            r0.<init>()
            r12.A04 = r0
            r1 = 0
            r12.A02 = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.A0L = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r12.A0M = r0
            r15 = r34
            r12.A08 = r15
            X.2s2 r6 = new X.2s2
            r6.<init>()
            r12.A0K = r6
            r16 = 1
            X.Uf0 r10 = new X.Uf0
            r19 = r38
            r18 = r40
            r11 = r28
            r13 = r30
            r14 = r33
            r17 = r16
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r12.A06 = r10
            r5 = 0
            if (r38 == 0) goto L_0x011a
            X.Udk r4 = new X.Udk
            r4.<init>()
        L_0x007d:
            r12.A0I = r4
            X.Ueu r3 = new X.Ueu
            r3.<init>()
            r12.A0J = r3
            r8 = r37
            r21 = r27
            r22 = r29
            if (r37 == 0) goto L_0x0118
            r23 = r31
            r23.getClass()
            X.UeS r2 = new X.UeS
            r20 = r2
            r24 = r14
            r25 = r15
            r20.<init>(r21, r22, r23, r24, r25)
        L_0x009e:
            r12.A0H = r2
            if (r37 == 0) goto L_0x0116
            X.0qQ.A0B(r15, r1)
            X.0Tu r7 = X.0Tu.A05
            r0 = 36315864043097707(0x81051600000e6b, double:3.029636880877519E-306)
            boolean r0 = X.182.A06(r7, r15, r0)
            if (r0 == 0) goto L_0x0116
            r23 = r32
            if (r32 == 0) goto L_0x0116
            X.UeR r7 = new X.UeR
            r20 = r7
            r24 = r14
            r25 = r15
            r20.<init>(r21, r22, r23, r24, r25)
        L_0x00c1:
            r12.A0G = r7
            if (r37 == 0) goto L_0x00ca
            X.UeM r5 = new X.UeM
            r5.<init>(r14, r15)
        L_0x00ca:
            r12.A07 = r5
            X.71T r9 = new X.71T
            r9.<init>(r11)
            r0 = r36
            r12.A0P = r0
            r12.A0O = r8
            r0 = r39
            r12.A0N = r0
            r0 = 2131965491(0x7f133633, float:1.9567793E38)
            java.lang.String r0 = r11.getString(r0)
            r12.A09 = r0
            r0 = r35
            r12.A01 = r0
            java.util.ArrayList r1 = X.DbV.A14(r6)
            if (r38 == 0) goto L_0x00f1
            r1.add(r4)
        L_0x00f1:
            r1.add(r10)
            if (r2 == 0) goto L_0x00f9
            r1.add(r2)
        L_0x00f9:
            if (r7 == 0) goto L_0x00fe
            r1.add(r7)
        L_0x00fe:
            if (r5 == 0) goto L_0x0103
            r1.add(r5)
        L_0x0103:
            r1.add(r3)
            r1.add(r9)
            int r0 = r1.size()
            X.2s0[] r0 = new X.C231642s0[r0]
            r1.toArray(r0)
            r12.A0B(r0)
            return
        L_0x0116:
            r7 = r5
            goto L_0x00c1
        L_0x0118:
            r2 = r5
            goto L_0x009e
        L_0x011a:
            r4 = r5
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15469UdK.<init>(android.app.Activity, android.content.Context, androidx.fragment.app.Fragment, X.X6E, com.instagram.archive.fragment.ArchiveReelFragment, com.instagram.archive.fragment.ArchiveReelFragment, X.0iw, com.instagram.common.session.UserSession, X.2bv, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r25 = this;
            r14 = r25
            r14.A06()
            X.UYJ r13 = r14.A03
            r13.A06()
            java.util.Map r0 = r14.A0F
            r24 = r0
            r24.clear()
            java.util.Map r0 = r14.A0E
            r23 = r0
            r23.clear()
            java.util.List r0 = r14.A0B
            r22 = r0
            r22.clear()
            java.util.ArrayList r0 = r14.A0A
            r21 = r0
            r21.clear()
            java.util.List r12 = r14.A0C
            r12.clear()
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0185
            boolean r0 = r14.A0P
            r11 = 0
            if (r0 == 0) goto L_0x003b
            X.2s2 r0 = r14.A0K
            r14.A08(r0, r11)
        L_0x003b:
            X.Udk r0 = r14.A0I
            if (r0 == 0) goto L_0x0042
            r14.A08(r0, r11)
        L_0x0042:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r1 = 0
        L_0x0048:
            java.util.List r0 = r13.A01
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0062
            java.util.List r0 = r13.A01
            java.lang.Object r0 = r0.get(r1)
            X.Vbs r0 = (X.C17662Vbs) r0
            java.lang.String r0 = r0.A07
            if (r0 == 0) goto L_0x005f
            r2.add(r0)
        L_0x005f:
            int r1 = r1 + 1
            goto L_0x0048
        L_0x0062:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r2)
            int r9 = r13.A02()
            int r20 = r14.getCount()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.lang.String r19 = ""
            r7 = 0
            r2 = 0
        L_0x0078:
            if (r7 >= r9) goto L_0x0143
            X.71g r6 = X.C13989Tnp.A0e(r13, r7)
            int r5 = r7 + r20
            X.G9w.A0x(r2, r12)
            r4 = 0
        L_0x0084:
            int r0 = r6.A01()
            if (r4 >= r0) goto L_0x0116
            java.lang.Object r3 = r6.A02(r4)
            X.Vbs r3 = (X.C17662Vbs) r3
            long r0 = r3.A01
            r17 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x00ae
            java.lang.Long r15 = java.lang.Long.valueOf(r17)
            android.util.Pair r0 = X.Pxf.A0K(r15, r5)
            r1 = r22
            r1.add(r0)
            r8.add(r15)
        L_0x00ae:
            java.lang.String r1 = r3.A07
            r0 = r24
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x00bd
            r0 = r24
            X.C66580MXl.A1T(r1, r0, r5)
        L_0x00bd:
            java.lang.Integer r1 = r3.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x00cf
            X.3uh r0 = r3.A04
            r0.getClass()
            java.lang.String r1 = r0.A0j
            r0 = r23
            X.C66580MXl.A1T(r1, r0, r5)
        L_0x00cf:
            java.lang.Integer r1 = r3.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0102
            int r0 = r3.A00
            if (r0 != 0) goto L_0x0102
            r15 = 0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0113
            java.util.Date r1 = X.C13989Tnp.A0t(r17)
            java.text.SimpleDateFormat r0 = A0Q
            java.lang.String r1 = r0.format(r1)
        L_0x00e9:
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x0105
            r0 = r19
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0105
            r0 = 1
        L_0x00f8:
            int r0 = X.DbT.A02(r12, r0)
            r12.remove(r0)
            X.G9w.A0x(r2, r12)
        L_0x0102:
            int r4 = r4 + 1
            goto L_0x0084
        L_0x0105:
            r0 = r21
            r0.add(r1)
            int r2 = r21.size()
            r0 = 1
            int r2 = r2 - r0
            r19 = r1
            goto L_0x00f8
        L_0x0113:
            java.lang.String r1 = r14.A09
            goto L_0x00e9
        L_0x0116:
            java.lang.String r1 = X.AnonymousClass7TF.A0h(r6)
            java.util.Map r0 = r14.A0D
            java.lang.Object r3 = r0.get(r1)
            X.6u8 r3 = (X.AnonymousClass6u8) r3
            if (r3 != 0) goto L_0x012c
            X.Ulr r3 = new X.Ulr
            r3.<init>(r14)
            r0.put(r1, r3)
        L_0x012c:
            int r0 = r9 + -1
            boolean r0 = X.AnonymousClass7TF.A1S(r7, r0)
            r3.A00(r5, r0)
            X.VVA r1 = new X.VVA
            r1.<init>(r6, r10)
            X.Uf0 r0 = r14.A06
            r14.A09(r0, r1, r3)
            int r7 = r7 + 1
            goto L_0x0078
        L_0x0143:
            boolean r6 = r14.A0O
            if (r6 == 0) goto L_0x0189
            java.util.List r5 = r14.A0L
            int r1 = r5.size()
            r0 = 5
            if (r1 < r0) goto L_0x0189
            X.UeR r4 = r14.A0G
            if (r4 == 0) goto L_0x0189
            com.instagram.common.session.UserSession r3 = r14.A08
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36315864043097707(0x81051600000e6b, double:3.029636880877519E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0189
            X.VM4 r0 = r14.A04
            r14.A09(r4, r5, r0)
        L_0x016a:
            X.UeM r1 = r14.A07
            if (r1 == 0) goto L_0x0175
            X.4UC r0 = r1.A01
            if (r0 == 0) goto L_0x0175
            r14.A08(r1, r11)
        L_0x0175:
            boolean r0 = r14.A0N
            if (r0 != 0) goto L_0x017e
            X.Ueu r0 = r14.A0J
            r14.A08(r0, r11)
        L_0x017e:
            int r0 = X.Pxe.A0A(r21)
            X.G9w.A0x(r0, r12)
        L_0x0185:
            r14.A07()
            return
        L_0x0189:
            if (r6 == 0) goto L_0x016a
            X.1Xj r2 = r14.A00
            if (r2 == 0) goto L_0x016a
            X.VM4 r1 = r14.A05
            X.UeS r0 = r14.A0H
            r0.getClass()
            r14.A09(r0, r2, r1)
            goto L_0x016a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15469UdK.A0C():void");
    }

    public final void A0D(List list) {
        UYJ uyj = this.A03;
        uyj.A04();
        this.A0D.clear();
        int size = list.size();
        if (size > 9) {
            int i = size % 3;
            if (i != 0) {
                int i2 = 3 - i;
                for (int i3 = 0; i3 < i2; i3++) {
                    AnonymousClass2rW.A01(uyj, new C17662Vbs((Reel) null, (C255773uh) null, AnonymousClass05K.A00, 0, 0), uyj.A02.size(), true);
                }
            }
        }
        uyj.A0A(list);
        A0C();
    }

    public final int Bqm(int i) {
        if (i < 0) {
            return -1;
        }
        List list = this.A0C;
        if (i < list.size()) {
            return C51971G9r.A0I(list, i);
        }
        return -1;
    }

    public final List Bqr() {
        return this.A0A;
    }

    public final Set Brl() {
        return C64184LSr.A00(this.A08).A05.keySet();
    }

    public final int CMG(Reel reel) {
        Map map = this.A0F;
        if (map.containsKey(reel.getId())) {
            return Pxg.A06(reel.getId(), map);
        }
        return -1;
    }

    public final int CMH(Reel reel, C255773uh r5) {
        String str;
        Map map = this.A0E;
        String str2 = null;
        if (r5 != null) {
            str = r5.A0j;
        } else {
            str = null;
        }
        if (!map.containsKey(str)) {
            return -1;
        }
        if (r5 != null) {
            str2 = r5.A0j;
        }
        return Pxg.A06(str2, map);
    }

    public final void EZ4(int i) {
        this.A0K.A03 = i;
        A0C();
    }

    public final boolean isEmpty() {
        if (AnonymousClass7TE.A1b(this.A03.A01) || this.A00 != null || !this.A0L.isEmpty()) {
            return false;
        }
        return true;
    }

    public final int Bom() {
        return getCount();
    }

    public final void DQl() {
        A0C();
    }
}
