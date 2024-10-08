package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class E9K extends 2Ru implements C231272rL, C231302rO, AnonymousClass7Q7 {
    public int A00;
    public int A01;
    public UserSession A02;
    public EAY A03;
    public C46454DfI A04;
    public HashMap A05;
    public HashMap A06;
    public boolean A07;
    public boolean A08;
    public C46450DfD A09;
    public String A0A;
    public final Context A0B;
    public final AnonymousClass2s2 A0C;
    public final C39695A5l A0D;
    public final C336947fR A0E;
    public final String A0F;
    public final ArrayList A0G;
    public final ArrayList A0H;
    public final HashMap A0I;
    public final Set A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final F07 A0M;
    public final AnonymousClass2s2 A0N;
    public final C46450DfD A0O;
    public final C46437Dez A0P;
    public final C229122ms A0Q;
    public final C231762sK A0R;
    public final C47631EAr A0S;
    public final Integer A0T;
    public final boolean A0U;

    public final boolean AJe(String str) {
        0qQ.A0B(str, 0);
        return this.A0J.contains(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0153  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.E9K r17) {
        /*
            r6 = r17
            r6.clear()
            java.util.HashMap r8 = r6.A0I
            r8.clear()
            java.util.HashMap r0 = r6.A06
            if (r0 == 0) goto L_0x0011
            r0.clear()
        L_0x0011:
            r7 = 0
            r6.A00 = r7
            X.F07 r0 = r6.A0M
            X.2oe r0 = r0.A04
            java.util.Map r0 = r0.A00
            r0.clear()
            r5 = 0
            X.2s2 r0 = r6.A0N
            r6.addModel(r5, r0)
            A01(r6, r0)
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x004c
            java.lang.Integer r0 = r6.A0T
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0036
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x0036:
            X.F2L r2 = new X.F2L
            r2.<init>(r1)
            boolean r0 = r6.A0U
            r2.A00 = r0
            X.Eqk r1 = new X.Eqk
            r1.<init>()
            X.EAr r0 = r6.A0S
            r6.addModel(r1, r2, r0)
            A01(r6, r0)
        L_0x004c:
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0071
            java.util.Set r0 = r6.A0J
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0071
            android.content.Context r0 = r6.A0B
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131968486(0x7f1341e6, float:1.9573868E38)
            java.lang.String r1 = r1.getString(r0)
            X.Dez r0 = r6.A0P
        L_0x0067:
            r6.addModel(r1, r0)
            A01(r6, r0)
        L_0x006d:
            r6.notifyDataSetChangedSmart()
            return
        L_0x0071:
            int r17 = r6.getCount()
            java.util.ArrayList r4 = r6.A0G
            java.util.Iterator r16 = r4.iterator()
            r9 = 0
        L_0x007c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01e9
            int r15 = r9 + 1
            java.lang.Object r3 = r16.next()
            X.3UH r3 = (X.AnonymousClass3UH) r3
            boolean r11 = r6.A0K
            r10 = 1
            if (r11 == 0) goto L_0x00e1
            java.util.Iterator r13 = r4.iterator()
            r12 = 0
            r2 = 0
        L_0x0095:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00b0
            int r1 = r2 + 1
            java.lang.Object r0 = r13.next()
            X.3UH r0 = (X.AnonymousClass3UH) r0
            java.util.List r0 = r0.A0M
            if (r0 == 0) goto L_0x00ae
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != r10) goto L_0x00ae
            r12 = r2
        L_0x00ae:
            r2 = r1
            goto L_0x0095
        L_0x00b0:
            if (r12 != r9) goto L_0x00e1
            java.util.ArrayList r1 = r6.A0H
            java.lang.Object r0 = X.DbZ.A0g(r1, r9)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r2 = X.DbZ.A0g(r1, r9)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r1 = X.DbZ.A0g(r4, r9)
            X.3UH r1 = (X.AnonymousClass3UH) r1
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x00e1
            java.util.List r0 = r1.A0M
            if (r0 == 0) goto L_0x00db
            r0.addAll(r2)
        L_0x00db:
            r2.removeAll(r2)
            A02(r6, r2)
        L_0x00e1:
            if (r11 != 0) goto L_0x01e5
            boolean r0 = r3.A07()
            if (r0 == 0) goto L_0x01e5
            java.util.ArrayList r0 = r3.A03()
        L_0x00ed:
            if (r0 == 0) goto L_0x0119
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0119
            java.lang.Object r2 = r0.get(r7)
            if (r9 != 0) goto L_0x011c
            if (r11 == 0) goto L_0x011c
            java.lang.String r1 = r6.A0F
            if (r1 == 0) goto L_0x011c
            int r1 = r1.length()
            if (r1 == 0) goto L_0x011c
            boolean r1 = r6.A0L
            if (r1 != 0) goto L_0x011c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            X.EAY r0 = r6.A03
            r6.addModel(r2, r1, r0)
            A01(r6, r0)
            int r17 = r17 + 1
        L_0x0119:
            r9 = r15
            goto L_0x007c
        L_0x011c:
            java.lang.String r2 = r3.A0K
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x0194
            boolean r1 = r6.A03()
            if (r1 != 0) goto L_0x0130
            boolean r1 = r6.A04()
            if (r1 == 0) goto L_0x0194
        L_0x0130:
            X.DfA r3 = new X.DfA
            r3.<init>((java.lang.CharSequence) r2)
            X.A5l r2 = r6.A0D
            X.7fR r1 = r6.A0E
            r6.addModel(r3, r2, r1)
            A01(r6, r1)
            if (r11 == 0) goto L_0x0149
            X.2s2 r1 = r6.A0C
            r6.addModel(r5, r1)
            A01(r6, r1)
        L_0x0149:
            r1 = 1
        L_0x014a:
            int r17 = r17 + r1
            int r12 = r0.size()
            r3 = 0
        L_0x0151:
            if (r3 >= r12) goto L_0x01b3
            java.lang.Object r14 = r0.get(r3)
            X.3UL r14 = (X.AnonymousClass3UL) r14
            if (r11 == 0) goto L_0x018b
            java.util.HashMap r2 = r6.A05
            if (r2 == 0) goto L_0x018b
            com.instagram.user.model.User r1 = r14.A03
            java.lang.Object r1 = X.DbV.A0r(r1, r2)
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r10)
            if (r1 == 0) goto L_0x018b
            int r13 = r17 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            X.DfD r1 = r6.A09
        L_0x0173:
            r6.addModel(r14, r2, r1)
            A01(r6, r1)
            r17 = r13
            com.instagram.user.model.User r1 = r14.A03
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = r1.getId()
            r8.put(r1, r2)
            int r3 = r3 + 1
            goto L_0x0151
        L_0x018b:
            int r13 = r17 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            X.DfD r1 = r6.A0O
            goto L_0x0173
        L_0x0194:
            if (r11 != 0) goto L_0x01b1
            boolean r1 = r6.A03()
            if (r1 != 0) goto L_0x01b1
            boolean r1 = r6.A04()
            if (r1 == 0) goto L_0x01b1
            r1 = 2131974682(0x7f135a1a, float:1.9586435E38)
            X.DfA r3 = X.C46448DfA.A00(r1)
            X.A5l r2 = r6.A0D
            X.7fR r1 = r6.A0E
            r6.addModel(r3, r2, r1)
            goto L_0x0149
        L_0x01b1:
            r1 = 0
            goto L_0x014a
        L_0x01b3:
            if (r11 == 0) goto L_0x0119
            java.util.ArrayList r0 = r6.A0H
            java.lang.Object r0 = X.DbZ.A0g(r0, r9)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0119
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.DfV r3 = new X.DfV
            r3.<init>(r0)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r2.put(r1, r0)
            r3.A00 = r2
            X.DfI r0 = r6.A04
            r6.addModel(r3, r0)
            A01(r6, r0)
            goto L_0x0119
        L_0x01e5:
            java.util.List r0 = r3.A0M
            goto L_0x00ed
        L_0x01e9:
            X.2ms r1 = r6.A0Q
            if (r1 == 0) goto L_0x006d
            boolean r0 = r1.CKB()
            if (r0 == 0) goto L_0x006d
            X.2sK r0 = r6.A0R
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9K.A00(X.E9K):void");
    }

    public static void A01(E9K e9k, Object obj) {
        int i;
        String str;
        int i2 = e9k.A00;
        int i3 = 0;
        if (!e9k.A0K || (str = e9k.A0F) == null || str.length() == 0 || e9k.A0L) {
            i = 0;
        } else {
            HashMap hashMap = e9k.A06;
            if (hashMap != null) {
                Integer valueOf = Integer.valueOf(i2);
                if (obj != null) {
                    i3 = obj.hashCode();
                }
                hashMap.put(valueOf, Integer.valueOf(i3));
            }
            i = 1;
        }
        e9k.A00 = i2 + i;
    }

    public static final void A02(E9K e9k, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e9k.A0J.add(((AnonymousClass3UL) it.next()).A03.getId());
            }
        }
    }

    private final boolean A03() {
        Iterator A1G = AnonymousClass7TE.A1G(this.A0G);
        int i = 0;
        while (A1G.hasNext()) {
            AnonymousClass3UH r1 = (AnonymousClass3UH) AnonymousClass7TF.A0a(A1G);
            if (this.A0K) {
                List list = r1.A0M;
                if (list != null) {
                    if (!AnonymousClass7TE.A1b(list)) {
                    }
                }
            } else if (r1.A07() && r1.A03().isEmpty()) {
            }
            i++;
        }
        if (i > 1) {
            return true;
        }
        return false;
    }

    private final boolean A04() {
        if (!182.A06(0Tu.A06, this.A02, 36318685836679544L) && !this.A0A.equals("su_in_stories")) {
            return false;
        }
        Integer num = this.A0T;
        if (num == AnonymousClass05K.A01 || num == AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }

    public final void A05(ArrayList arrayList) {
        List A032;
        this.A0J.clear();
        ArrayList arrayList2 = this.A0G;
        arrayList2.clear();
        Iterator A1G = AnonymousClass7TE.A1G(arrayList);
        while (A1G.hasNext()) {
            AnonymousClass3UH r1 = (AnonymousClass3UH) AnonymousClass7TF.A0a(A1G);
            arrayList2.add(r1);
            if (!r1.A07()) {
                A032 = r1.A0M;
            } else if (r1.A08()) {
                A032 = r1.A03();
            }
            A02(this, A032);
        }
        A00(this);
    }

    public final void EZ4(int i) {
        this.A0N.A03 = i;
        A00(this);
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public final void FK4() {
        A00(this);
    }

    public final long getItemId(int i) {
        long itemId;
        int i2;
        String str;
        Number number;
        int A032 = AnonymousClass0fD.A03(1347496540);
        if (!this.A0K || (str = this.A0F) == null || str.length() == 0 || this.A0L) {
            itemId = E9K.super.getItemId(i);
            i2 = 746123289;
        } else {
            HashMap hashMap = this.A06;
            if (hashMap == null || (number = (Number) hashMap.get(Integer.valueOf(i))) == null) {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A0A(-932316006, A032);
                throw A0y;
            }
            itemId = (long) number.intValue();
            i2 = 554611642;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return itemId;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.2s2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.2s2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.2s2} */
    /* JADX WARNING: type inference failed for: r14v0, types: [X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v1, types: [java.lang.Object, X.A5l] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E9K(android.app.Activity r28, android.content.Context r29, X.F07 r30, X.AnonymousClass0iw r31, com.instagram.common.session.UserSession r32, X.AnonymousClass32K r33, X.G88 r34, X.C229122ms r35, X.EEF r36, java.lang.Integer r37, java.lang.String r38, java.lang.String r39, boolean r40, boolean r41, boolean r42) {
        /*
            r27 = this;
            r10 = r32
            boolean r6 = X.DbW.A1Z(r10)
            r0 = 10
            r9 = r38
            r13 = r37
            X.DbW.A1P(r9, r0, r13)
            r12 = r27
            r12.<init>(r6)
            r11 = r29
            r12.A0B = r11
            r0 = r35
            r12.A0Q = r0
            r0 = r40
            r12.A0U = r0
            r1 = r30
            r12.A0M = r1
            r12.A0T = r13
            r7 = r41
            r12.A0K = r7
            r16 = r42
            r0 = r16
            r12.A0L = r0
            r8 = r39
            r12.A0F = r8
            X.EAr r5 = new X.EAr
            r18 = r28
            r26 = r31
            r23 = r36
            r17 = r5
            r19 = r11
            r20 = r1
            r21 = r26
            r22 = r10
            r24 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r12.A0S = r5
            X.2s2 r14 = new X.2s2
            r14.<init>()
            r12.A0N = r14
            r4 = 0
            if (r41 == 0) goto L_0x0142
            X.2s2 r3 = new X.2s2
            r3.<init>()
        L_0x005c:
            r12.A0C = r3
            if (r41 != 0) goto L_0x0065
            X.2sK r4 = new X.2sK
            r4.<init>(r11)
        L_0x0065:
            r12.A0R = r4
            X.Dez r2 = new X.Dez
            r2.<init>(r11)
            r12.A0P = r2
            X.0Tu r15 = X.0Tu.A05
            r0 = 36316035841855347(0x81053e00010f73, double:3.029745527103629E-306)
            boolean r23 = X.182.A06(r15, r10, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r24 = 0
            if (r13 == r0) goto L_0x0081
            r24 = 1
        L_0x0081:
            X.DfD r0 = new X.DfD
            r21 = r33
            r1 = r34
            r19 = r26
            r20 = r10
            r22 = r1
            r25 = r6
            r17 = r0
            r18 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r12.A0O = r0
            X.7fR r13 = new X.7fR
            r13.<init>(r11)
            r12.A0E = r13
            X.A5l r15 = new X.A5l
            r15.<init>()
            r15.A01 = r6
            r12.A0D = r15
            java.util.HashSet r15 = X.AnonymousClass7TE.A1F()
            r12.A0J = r15
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            r12.A0G = r15
            java.util.ArrayList r15 = X.AnonymousClass7TE.A1C()
            r12.A0H = r15
            java.util.HashMap r15 = X.AnonymousClass7TE.A1E()
            r12.A0I = r15
            r12.A02 = r10
            r12.A0A = r9
            if (r41 == 0) goto L_0x0109
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()
            r12.A05 = r7
            r23 = 0
            X.DfD r9 = new X.DfD
            r17 = r9
            r24 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r12.A09 = r9
            java.lang.String r7 = "from_your_contacts"
            r9.A01 = r7
            if (r39 == 0) goto L_0x00e1
            r0.A01 = r8
        L_0x00e1:
            X.FnW r9 = new X.FnW
            r9.<init>(r12)
            X.DfI r7 = new X.DfI
            r7.<init>(r11, r9)
            r12.A04 = r7
            if (r39 == 0) goto L_0x0109
            int r7 = r8.length()
            if (r7 == 0) goto L_0x0109
            if (r42 != 0) goto L_0x0109
            X.EAY r9 = new X.EAY
            r7 = r26
            r9.<init>(r7, r10, r1, r8)
            r12.A03 = r9
            r12.setHasStableIds(r6)
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            r12.A06 = r1
        L_0x0109:
            java.util.ArrayList r6 = X.DbV.A14(r14)
            if (r3 == 0) goto L_0x0118
            r6.add(r3)
            int r1 = X.AnonymousClass7TH.A01(r11)
            r3.A03 = r1
        L_0x0118:
            r6.add(r2)
            if (r4 == 0) goto L_0x0120
            r6.add(r4)
        L_0x0120:
            r6.add(r0)
            r6.add(r5)
            r6.add(r13)
            X.DfD r0 = r12.A09
            if (r0 == 0) goto L_0x0130
            r6.add(r0)
        L_0x0130:
            X.DfI r0 = r12.A04
            if (r0 == 0) goto L_0x0137
            r6.add(r0)
        L_0x0137:
            X.EAY r0 = r12.A03
            if (r0 == 0) goto L_0x013e
            r6.add(r0)
        L_0x013e:
            r12.init(r6)
            return
        L_0x0142:
            r3 = r4
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E9K.<init>(android.app.Activity, android.content.Context, X.F07, X.0iw, com.instagram.common.session.UserSession, X.32K, X.G88, X.2ms, X.EEF, java.lang.Integer, java.lang.String, java.lang.String, boolean, boolean, boolean):void");
    }
}
