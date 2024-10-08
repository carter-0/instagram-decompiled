package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6aF  reason: invalid class name and case insensitive filesystem */
public final class C309986aF {
    public Integer A00;
    public Integer A01;
    public int A02 = -1;
    public int A03 = -1;
    public C309996aG A04 = new C309996aG();
    public final Map A05 = new LinkedHashMap();
    public final Set A06 = new LinkedHashSet();
    public final Set A07 = new LinkedHashSet();
    public final Set A08 = new LinkedHashSet();
    public final Set A09 = new LinkedHashSet();
    public final Set A0A = new LinkedHashSet();
    public final Set A0B = new LinkedHashSet();
    public final UserSession A0C;
    public final LinkedList A0D = new LinkedList();
    public final LinkedList A0E = new LinkedList();
    public final Set A0F = new LinkedHashSet();
    public final Set A0G = new LinkedHashSet();

    public C309986aF(UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A0C = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r0.A00 != 0) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0102, code lost:
        if (X.0qQ.A0K(r1, r14.A0j) == false) goto L_0x0104;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.instagram.common.session.UserSession r22, com.instagram.model.reels.Reel r23, X.C255773uh r24, int r25) {
        /*
            r21 = this;
            r0 = 0
            r15 = r22
            X.0qQ.A0B(r15, r0)
            r19 = 1
            r12 = r23
            java.lang.String r10 = r12.getId()
            X.0qQ.A07(r10)
            r13 = r21
            java.util.Map r2 = r13.A05
            boolean r0 = r2.containsKey(r10)
            if (r0 == 0) goto L_0x01b9
            java.util.Set r9 = r13.A0F
            boolean r0 = r9.contains(r10)
            if (r0 != 0) goto L_0x01b9
            int r0 = r13.A02
            r8 = -1
            r7 = 1
            r6 = -1
            r11 = r25
            if (r0 == r8) goto L_0x0031
            r7 = 0
            int r6 = r25 - r0
            int r6 = r6 - r19
        L_0x0031:
            java.util.Set r0 = r13.A08
            r20 = r0
            int r5 = r20.size()
            int r0 = r13.A03
            if (r0 == r8) goto L_0x0041
            int r0 = r25 - r0
            int r8 = r0 + -1
        L_0x0041:
            java.util.Set r3 = r13.A0B
            int r4 = r3.size()
            r14 = r24
            boolean r0 = r14.CcK()
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x01d1
            java.lang.Object r3 = r2.get(r10)
            if (r3 == 0) goto L_0x0207
            X.6UP r3 = (X.AnonymousClass6UP) r3
            X.3Hd r0 = r12.A0X
            r18 = 0
            r17 = 0
            if (r0 == 0) goto L_0x0069
            r17 = 1
            int r0 = r0.A00
            r16 = 1
            if (r0 == 0) goto L_0x006b
        L_0x0069:
            r16 = 0
        L_0x006b:
            java.lang.Integer r0 = r13.A00
            if (r0 == 0) goto L_0x0071
            r18 = 1
        L_0x0071:
            if (r17 == 0) goto L_0x00a5
            java.util.Set r1 = r13.A09
            java.lang.String r2 = r14.A0j
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L_0x0080
            r1.remove(r2)
        L_0x0080:
            if (r16 == 0) goto L_0x00a5
            if (r18 != 0) goto L_0x00a5
            int r0 = r3.A0P
            int r0 = r25 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0B = r0
            int r0 = r1.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0A = r0
            java.util.Set r0 = r13.A06
            int r0 = r0.size()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0H = r0
        L_0x00a5:
            boolean r0 = r13.A00(r12, r14)
            if (r0 == 0) goto L_0x00d6
            java.lang.Integer r0 = r13.A00
            if (r0 == 0) goto L_0x00d6
            int r0 = r0.intValue()
            int r0 = r25 - r0
            int r0 = r0 - r19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0F = r0
            java.util.Set r0 = r13.A09
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A09 = r0
            java.util.Set r0 = r13.A06
            int r0 = r0.size()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0J = r0
        L_0x00d6:
            if (r17 == 0) goto L_0x01ca
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r13.A00 = r0
            java.util.Set r0 = r13.A09
            r0.clear()
            java.util.Set r0 = r13.A06
            r0.clear()
        L_0x00e8:
            boolean r2 = X.C297785sK.A0U(r12)
            r3.A0M = r2
            r17 = 0
            if (r2 == 0) goto L_0x0104
            X.3uh r0 = r12.A09(r15)
            if (r0 == 0) goto L_0x01c7
            java.lang.String r1 = r0.A0j
        L_0x00fa:
            java.lang.String r0 = r14.A0j
            boolean r0 = X.0qQ.A0K(r1, r0)
            r16 = 1
            if (r0 != 0) goto L_0x0106
        L_0x0104:
            r16 = 0
        L_0x0106:
            java.lang.Integer r0 = r13.A01
            if (r0 == 0) goto L_0x010c
            r17 = 1
        L_0x010c:
            if (r2 == 0) goto L_0x0140
            java.util.Set r1 = r13.A0A
            java.lang.String r15 = r14.A0j
            boolean r0 = r1.contains(r15)
            if (r0 == 0) goto L_0x011b
            r1.remove(r15)
        L_0x011b:
            if (r16 == 0) goto L_0x0140
            if (r17 != 0) goto L_0x0140
            int r0 = r3.A0P
            int r0 = r25 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0E = r0
            int r0 = r1.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0D = r0
            java.util.Set r0 = r13.A07
            int r0 = r0.size()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0I = r0
        L_0x0140:
            boolean r0 = r13.A00(r12, r14)
            if (r0 == 0) goto L_0x0171
            java.lang.Integer r0 = r13.A01
            if (r0 == 0) goto L_0x0171
            int r0 = r0.intValue()
            int r0 = r25 - r0
            int r0 = r0 - r19
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0G = r0
            java.util.Set r0 = r13.A0A
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0C = r0
            java.util.Set r0 = r13.A07
            int r0 = r0.size()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0K = r0
        L_0x0171:
            if (r2 == 0) goto L_0x01c1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r13.A01 = r0
            java.util.Set r0 = r13.A0A
            r0.clear()
            java.util.Set r0 = r13.A07
            r0.clear()
        L_0x0183:
            int r0 = r20.size()
            r3.A01 = r0
            r3.A0L = r7
            if (r7 == 0) goto L_0x01ba
            int r0 = r3.A0P
            int r0 = r25 - r0
        L_0x0191:
            r3.A04 = r0
            r3.A05 = r6
            r3.A00 = r5
            r3.A06 = r8
            r3.A02 = r4
            X.2vm r0 = r12.A0b
            r3.A08 = r0
            int r0 = r12.A01
            r3.A03 = r0
            X.3Hd r0 = r12.A0X
            r3.A07 = r0
            r20.clear()
            r13.A02 = r11
            r9.add(r10)
            java.util.LinkedList r0 = r13.A0D
            r0.add(r10)
        L_0x01b4:
            X.6aG r0 = r13.A04
            r0.EXL(r6, r8)
        L_0x01b9:
            return
        L_0x01ba:
            int r0 = r13.A02
            int r0 = r25 - r0
            int r0 = r0 - r19
            goto L_0x0191
        L_0x01c1:
            java.util.Set r0 = r13.A07
            r0.add(r10)
            goto L_0x0183
        L_0x01c7:
            r1 = 0
            goto L_0x00fa
        L_0x01ca:
            java.util.Set r0 = r13.A06
            r0.add(r10)
            goto L_0x00e8
        L_0x01d1:
            boolean r0 = r14.A1P()
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r2 = r2.get(r10)
            if (r2 == 0) goto L_0x020d
            X.6UP r2 = (X.AnonymousClass6UP) r2
            r2.A05 = r6
            r2.A00 = r5
            r2.A06 = r8
            r2.A02 = r4
            X.2vm r0 = r12.A0b
            r2.A08 = r0
            int r0 = r12.A01
            r2.A03 = r0
            r3.clear()
            r13.A03 = r11
            r9.add(r10)
            java.util.LinkedList r0 = r13.A0E
            r0.add(r10)
            java.util.Set r0 = r13.A06
            r0.add(r10)
            java.util.Set r0 = r13.A07
            r0.add(r10)
            goto L_0x01b4
        L_0x0207:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x020d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309986aF.A01(com.instagram.common.session.UserSession, com.instagram.model.reels.Reel, X.3uh, int):void");
    }

    public final void A02(C255773uh r5, int i) {
        Set set;
        0qQ.A0B(r5, 0);
        Set set2 = this.A0G;
        String str = r5.A0j;
        if (!set2.contains(str)) {
            if (!r5.CcK()) {
                boolean A1P = r5.A1P();
                set = this.A08;
                if (!A1P) {
                    0qQ.A07(str);
                    set.add(str);
                }
                0qQ.A07(str);
                set.add(str);
            }
            set = this.A0B;
            0qQ.A07(str);
            set.add(str);
        }
        0qQ.A07(str);
        set2.add(str);
        this.A09.add(str);
        this.A0A.add(str);
        this.A04.A03.A03(this.A08.size(), this.A0B.size(), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1 != 0) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (X.0qQ.A0K(r1, r8.A0j) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A00(com.instagram.model.reels.Reel r7, X.C255773uh r8) {
        /*
            r6 = this;
            boolean r5 = X.C297785sK.A0U(r7)
            r4 = 1
            if (r5 == 0) goto L_0x001a
            com.instagram.common.session.UserSession r0 = r6.A0C
            X.3uh r0 = r7.A09(r0)
            if (r0 == 0) goto L_0x0031
            java.lang.String r1 = r0.A0j
        L_0x0011:
            java.lang.String r0 = r8.A0j
            boolean r0 = X.0qQ.A0K(r1, r0)
            r3 = 1
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            X.3Hd r0 = r7.A0X
            r2 = 0
            if (r0 == 0) goto L_0x0026
            r2 = 1
            int r1 = r0.A00
            r0 = 1
            if (r1 == 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r5 != 0) goto L_0x002b
            if (r2 == 0) goto L_0x0030
        L_0x002b:
            if (r3 != 0) goto L_0x0030
            if (r0 != 0) goto L_0x0030
            r4 = 0
        L_0x0030:
            return r4
        L_0x0031:
            r1 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309986aF.A00(com.instagram.model.reels.Reel, X.3uh):boolean");
    }
}
