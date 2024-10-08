package X;

import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2vh  reason: invalid class name and case insensitive filesystem */
public abstract class C233422vh implements C233432vi {
    public int A00;
    public C233452vk A01 = new C233442vj();
    public final C228812mN A02;
    public final LinkedHashSet A03 = new LinkedHashSet();
    public final C249863kU A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (r11 != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ed, code lost:
        if (r14 != false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ef, code lost:
        r15 = X.AnonymousClass05K.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.1PW A0G(X.C251373n0 r28, java.lang.Integer r29, java.lang.Object r30, int r31, int r32, int r33) {
        /*
            r27 = this;
            r8 = 0
            r2 = 2
            r23 = r29
            r0 = r23
            X.0qQ.A0B(r0, r2)
            r1 = r28
            java.lang.Object r7 = r1.BTb()
            r9 = r27
            X.2vl r6 = r9.A07(r7)
            if (r6 == 0) goto L_0x01f3
            int r5 = r9.A05(r1, r6)
            r4 = r9
            boolean r0 = r9 instanceof X.C271904jm
            r18 = r32
            if (r0 == 0) goto L_0x007b
            X.4jm r4 = (X.C271904jm) r4
            r3 = r18
            java.lang.Object r0 = r1.BTb()
            X.9Ie r0 = (X.C376489Ie) r0
            boolean r0 = X.C271904jm.A03(r0, r4)
            if (r0 == 0) goto L_0x0036
            int r3 = X.C271904jm.A00(r4)
        L_0x0036:
            int r4 = r5 - r31
            int r0 = r4 - r3
        L_0x003a:
            int r17 = r0 + -1
            X.2mN r3 = r9.A02
            boolean r0 = r3.CcL(r7)
            if (r0 == 0) goto L_0x0078
            java.lang.Integer r16 = X.AnonymousClass05K.A0C
        L_0x0046:
            r24 = r17
            r25 = r5
            r26 = r18
            r19 = r9
            r20 = r1
            r21 = r6
            r22 = r16
            r19.A0A(r20, r21, r22, r23, r24, r25, r26)
            boolean r15 = r9.A0D(r6, r7)
            boolean r0 = r9.A0E(r7)
            r11 = 0
            if (r0 != 0) goto L_0x00b0
            int r1 = r23.intValue()
            r14 = 1
            r0 = 3
            r10 = r33
            if (r1 == r0) goto L_0x00b9
            if (r1 == r2) goto L_0x00b9
            if (r1 == r8) goto L_0x0080
            if (r1 == r14) goto L_0x0080
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0078:
            java.lang.Integer r16 = X.AnonymousClass05K.A0N
            goto L_0x0046
        L_0x007b:
            int r4 = r5 - r31
            int r0 = r4 - r32
            goto L_0x003a
        L_0x0080:
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0088
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x0094
        L_0x0088:
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x0094
            boolean r0 = r6.A0C
            if (r0 != 0) goto L_0x0094
            java.lang.Integer r15 = X.AnonymousClass05K.A01
        L_0x0092:
            r13 = 0
            goto L_0x00d4
        L_0x0094:
            boolean r0 = r9.A0C(r6, r7)
            if (r0 != 0) goto L_0x009d
            java.lang.Integer r15 = X.AnonymousClass05K.A0Y
            goto L_0x0092
        L_0x009d:
            if (r15 != 0) goto L_0x00a2
            java.lang.Integer r15 = X.AnonymousClass05K.A0N
            goto L_0x0092
        L_0x00a2:
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x00b0
            int r0 = r9.A04(r5)
            int r0 = r0 + r4
            if (r10 < r0) goto L_0x00b0
            java.lang.Integer r15 = X.AnonymousClass05K.A0u
            goto L_0x0092
        L_0x00b0:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.1PW r12 = new X.1PW
            r12.<init>(r0)
            goto L_0x01a2
        L_0x00b9:
            boolean r12 = r9.A0D
            r2 = r23
            r1 = r16
            r0 = r17
            boolean r11 = r6.A0D(r2, r1, r0)
            if (r12 == 0) goto L_0x01e8
            r13 = 1
            if (r11 == 0) goto L_0x01ef
        L_0x00ca:
            if (r31 <= 0) goto L_0x01c9
            boolean r0 = r9.A0F(r7)
            if (r0 == 0) goto L_0x01c9
            java.lang.Integer r15 = X.AnonymousClass05K.A0C
        L_0x00d4:
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            X.1PW r12 = new X.1PW
            r12.<init>(r14)
            r12.A0B = r15
            java.lang.String r0 = X.C55160HdC.A00(r15)
            r12.A01(r0)
            r10 = r30
            if (r30 == 0) goto L_0x0103
            boolean r0 = r3.CVw(r10)
            if (r0 == 0) goto L_0x0103
            java.lang.String r2 = "last sponsored item iaa, position: "
            java.lang.String r1 = ", id: "
            java.lang.String r0 = r3.BJS(r10)
            r10 = r2
            r2 = r1
            r1 = r18
            java.lang.String r0 = X.002.A05(r1, r10, r2, r0)
            X.0qQ.A0B(r0, r8)
            r12.A0F = r0
        L_0x0103:
            if (r15 != r14) goto L_0x0191
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x0191
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r12.A0F
            r1.append(r0)
            java.lang.String r0 = ", MIN_GAP_ENFORCEMENT_FAILURE, isGapMet: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", isGapWithLastOverlayAdMet: "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = ", currentGap: "
            r1.append(r0)
            r0 = r17
            r1.append(r0)
            java.lang.String r0 = ", lastSeenItemType: "
            r1.append(r0)
            java.lang.String r0 = X.C266914aY.A01(r23)
            r1.append(r0)
            java.lang.String r0 = ", lastSeenItemPosition: "
            r1.append(r0)
            r0 = r18
            r1.append(r0)
            java.lang.String r0 = ", currentItemType: "
            r1.append(r0)
            java.lang.String r0 = X.C266914aY.A01(r16)
            r1.append(r0)
            java.lang.String r0 = ", minAdAdGap: "
            r1.append(r0)
            int r0 = r6.A05()
            r1.append(r0)
            java.lang.String r0 = ", minGapAdNetego: "
            r1.append(r0)
            int r0 = r6.A04
            r1.append(r0)
            java.lang.String r0 = ", minGapNetegoNetego: "
            r1.append(r0)
            int r0 = r6.A05
            r1.append(r0)
            java.lang.String r0 = ", to be inserted id: "
            r1.append(r0)
            java.lang.String r0 = r3.BEZ(r7)
            r1.append(r0)
            java.lang.String r0 = ", targetPosition: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            X.0qQ.A0B(r1, r8)
            r12.A0F = r1
            java.lang.String r0 = ", "
            X.00l.A0F(r0, r1)
        L_0x0191:
            X.2vk r0 = r9.A01
            X.3VX r3 = r0.BtU()
            int r2 = r12.A03
            java.util.List r1 = r12.A00()
            java.lang.String r0 = "Insert fail"
            r3.A04(r1, r2, r0)
        L_0x01a2:
            int r0 = r9.A04(r5)
            int r4 = r4 + r0
            r12.A03 = r4
            X.2vk r0 = r9.A01
            r0.ETU(r6)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.lang.Integer r0 = r12.A0C
            if (r1 != r0) goto L_0x01c6
            java.lang.String r3 = "Insert success"
        L_0x01b6:
            X.2vk r0 = r9.A01
            X.3VX r2 = r0.BtU()
            int r1 = r12.A03
            java.util.List r0 = r12.A00()
            r2.A04(r0, r1, r3)
            return r12
        L_0x01c6:
            java.lang.String r3 = "Insert fail"
            goto L_0x01b6
        L_0x01c9:
            boolean r0 = r9.A0C(r6, r7)
            if (r0 != 0) goto L_0x01d3
            java.lang.Integer r15 = X.AnonymousClass05K.A0Y
            goto L_0x00d4
        L_0x01d3:
            if (r15 != 0) goto L_0x01d9
            java.lang.Integer r15 = X.AnonymousClass05K.A0N
            goto L_0x00d4
        L_0x01d9:
            boolean r0 = r9.A06
            if (r0 == 0) goto L_0x00b0
            int r0 = r9.A04(r5)
            int r0 = r0 + r4
            if (r10 < r0) goto L_0x00b0
            java.lang.Integer r15 = X.AnonymousClass05K.A0u
            goto L_0x00d4
        L_0x01e8:
            if (r11 == 0) goto L_0x01eb
            r14 = 0
        L_0x01eb:
            r11 = 0
            r13 = 0
            if (r14 == 0) goto L_0x00ca
        L_0x01ef:
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            goto L_0x00d4
        L_0x01f3:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233422vh.A0G(X.3n0, java.lang.Integer, java.lang.Object, int, int, int):X.1PW");
    }

    public final void ATF(AnonymousClass30Y r1, C252093oY r2) {
    }

    public final String B4s() {
        return "";
    }

    public final void CJE(C376459Ib r1, List list) {
    }

    public final void CNn() {
    }

    public final void Crv(int i) {
    }

    public final /* synthetic */ void Dpb() {
    }

    public final /* synthetic */ void Dpe() {
    }

    public final /* synthetic */ void Dpg(String str) {
    }

    public final /* synthetic */ void Dpk() {
    }

    public final void EBI() {
    }

    public final void EDQ(C233602vz r2) {
        0qQ.A0B(r2, 0);
        this.A03.remove(r2);
    }

    public final void EIr() {
    }

    public final void EIs(1PW r1) {
    }

    public final void EO6(C233452vk r2) {
        0qQ.A0B(r2, 0);
        this.A01 = r2;
    }

    public int A04(int i) {
        if ((this instanceof C271874jj) || (this instanceof C233412vg)) {
            return 0;
        }
        C54575HJk hJk = ((C271904jm) this).A05;
        List A0K = hJk.A0K(C295365o2.SURVEY);
        ArrayList arrayList = new ArrayList();
        for (Object next : A0K) {
            if (hJk.A0B((C267324bN) next) > i) {
                break;
            }
            arrayList.add(next);
        }
        return arrayList.size();
    }

    public final int A05(C251373n0 r6, C233462vl r7) {
        if (this instanceof C271904jm) {
            C271904jm r1 = (C271904jm) this;
            C376489Ie r4 = (C376489Ie) r6.BTb();
            if (C271904jm.A03(r4, r1)) {
                int i = 0;
                for (C267324bN id : r1.A05.A0I()) {
                    if (0qQ.A0K(id.getId(), ((C267324bN) r4.A03).A06().A0f)) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }
        }
        return r7.A09();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00df, code lost:
        if (X.182.A06(X.0Tu.A05, r5, 36318556990019849L) != false) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A06(X.C251373n0 r9, X.C233462vl r10, java.lang.Integer r11, int r12) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C233412vg
            if (r0 == 0) goto L_0x0099
            r4 = r8
            X.2vg r4 = (X.C233412vg) r4
            r0 = 2
            X.0qQ.A0B(r11, r0)
            X.2rI r0 = r4.A03
            java.util.List r7 = r0.A08()
            java.util.Iterator r6 = r7.iterator()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
        L_0x0019:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r6.next()
            int r3 = r5 + 1
            if (r5 >= 0) goto L_0x002f
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002f:
            X.1Xg r0 = (X.1Xg) r0
            X.1UQ r1 = r0.A06
            X.1UQ r0 = X.1UQ.A0F
            if (r1 != r0) goto L_0x0038
            r2 = r5
        L_0x0038:
            r5 = r3
            goto L_0x0019
        L_0x003a:
            X.2mN r1 = r4.A05
            java.lang.Object r0 = r9.BTb()
            boolean r0 = r1.CcL(r0)
            if (r0 == 0) goto L_0x0096
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
        L_0x0048:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r11 != r0) goto L_0x008a
            if (r1 != r0) goto L_0x008a
            int r3 = r10.A05()
        L_0x0052:
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x0088
            int r1 = r4.A00
            if (r1 <= 0) goto L_0x0088
        L_0x005a:
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0120
            if (r2 < r12) goto L_0x0120
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r12 = r12 + r3
            int r12 = r12 + r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            int r0 = r7.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r2, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.lang.Object r0 = java.util.Collections.min(r0)
            X.0qQ.A07(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            return r7
        L_0x0088:
            r1 = 0
            goto L_0x005a
        L_0x008a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r11 != r0) goto L_0x0093
            if (r1 != r0) goto L_0x0093
            int r3 = r10.A05
            goto L_0x0052
        L_0x0093:
            int r3 = r10.A04
            goto L_0x0052
        L_0x0096:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x0048
        L_0x0099:
            boolean r0 = r8 instanceof X.C271904jm
            if (r0 == 0) goto L_0x012b
            r4 = r8
            X.4jm r4 = (X.C271904jm) r4
            X.HJk r3 = r4.A05
            int r0 = r3.A0A()
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0119
            int r0 = r3.A0A()
            int r0 = r0 + -1
            X.4bN r0 = r3.A0E(r0)
            X.5o2 r1 = r0.A01
            X.5o2 r0 = X.C295365o2.GHOST
            if (r1 == r0) goto L_0x0119
            int r7 = r3.A0A()
        L_0x00be:
            java.lang.Object r0 = r9.BTb()
            X.9Ie r0 = (X.C376489Ie) r0
            java.lang.Object r0 = r0.A03
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x00e2
            com.instagram.common.session.UserSession r5 = r4.A02
            boolean r0 = X.C231122qu.A0R(r5, r0)
            if (r0 == 0) goto L_0x00e2
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318556990019849(0x81078900251909, double:3.0313399113547087E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x00e2
        L_0x00e1:
            return r7
        L_0x00e2:
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x00f5
            long r1 = r4.A00
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f5
            int r0 = (int) r1
            int r12 = r12 + r0
            int r7 = java.lang.Math.min(r12, r7)
            return r7
        L_0x00f5:
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x00e1
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x00e1
            boolean r0 = r4.A0D
            r2 = 0
            if (r0 == 0) goto L_0x0117
            int r1 = r4.A00
            if (r1 <= 0) goto L_0x0117
        L_0x0106:
            X.2vo r0 = r10.A00
            java.lang.Integer r0 = r0.A09
            if (r0 == 0) goto L_0x0110
            int r2 = r0.intValue()
        L_0x0110:
            int r12 = r12 + r2
            int r12 = r12 + r1
            int r0 = r3.A0A()
            goto L_0x0126
        L_0x0117:
            r1 = 0
            goto L_0x0106
        L_0x0119:
            int r0 = r3.A0A()
            int r7 = r0 + -1
            goto L_0x00be
        L_0x0120:
            int r12 = r12 + r3
            int r12 = r12 + r1
            int r0 = r7.size()
        L_0x0126:
            int r7 = java.lang.Math.min(r12, r0)
            return r7
        L_0x012b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233422vh.A06(X.3n0, X.2vl, java.lang.Integer, int):int");
    }

    public C233462vl A07(Object obj) {
        Object obj2;
        if (this instanceof C271874jj) {
            C376509Ig r2 = (C376509Ig) obj;
            0qQ.A0B(r2, 0);
            obj2 = r2.A04;
        } else if (this instanceof C233412vg) {
            AnonymousClass4EB r22 = (AnonymousClass4EB) obj;
            0qQ.A0B(r22, 0);
            return r22.A03;
        } else {
            C376489Ie r23 = (C376489Ie) obj;
            0qQ.A0B(r23, 0);
            obj2 = r23.A04;
        }
        return (C233462vl) obj2;
    }

    public List A08() {
        if (this instanceof C271874jj) {
            return 0sn.A00;
        }
        if (this instanceof C233412vg) {
            return ((C233412vg) this).A03.A07();
        }
        return ((C271904jm) this).A05.A0I();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.C251373n0 r22, X.1PW r23, X.C233462vl r24, java.lang.Integer r25, int r26) {
        /*
            r21 = this;
            r1 = r21
            boolean r0 = r1 instanceof X.C233412vg
            r2 = r23
            r6 = r24
            r5 = r25
            if (r0 == 0) goto L_0x0062
            r7 = r1
            X.2vg r7 = (X.C233412vg) r7
            r0 = 1
            X.0qQ.A0B(r2, r0)
            r0 = 4
            X.0qQ.A0B(r5, r0)
            X.2mN r0 = r7.A05
            java.lang.Object r3 = r22.BTb()
            boolean r0 = r0.CcL(r3)
            if (r0 == 0) goto L_0x005f
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
        L_0x0025:
            java.lang.Integer r1 = r2.A0C
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x005e
            boolean r0 = X.C266914aY.A02(r5)
            r11 = 0
            if (r0 != 0) goto L_0x00d8
            com.instagram.common.session.UserSession r0 = r7.A01
            X.3VK r1 = X.AnonymousClass3VI.A00(r0)
            X.3VL r4 = X.AnonymousClass3VL.FEED
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
            r7 = 0
            int r0 = r2.A03
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            X.4EB r3 = (X.AnonymousClass4EB) r3
            X.1Xg r0 = r3.A01
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
        L_0x004d:
            if (r0 == 0) goto L_0x0053
            java.lang.String r11 = r0.getId()
        L_0x0053:
            X.GXs r3 = new X.GXs
            r8 = r7
            r9 = r7
            r10 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x005b:
            r1.A07(r3)
        L_0x005e:
            return
        L_0x005f:
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            goto L_0x0025
        L_0x0062:
            boolean r0 = r1 instanceof X.C271904jm
            if (r0 == 0) goto L_0x005e
            r7 = r1
            X.4jm r7 = (X.C271904jm) r7
            r0 = 1
            X.0qQ.A0B(r2, r0)
            r0 = 4
            X.0qQ.A0B(r5, r0)
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x005e
            X.2mN r1 = r7.A04
            java.lang.Object r3 = r22.BTb()
            boolean r0 = r1.CcL(r3)
            if (r0 == 0) goto L_0x00aa
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
        L_0x0083:
            java.lang.Integer r1 = r2.A0C
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x005e
            boolean r0 = X.C266914aY.A02(r5)
            r11 = 0
            if (r0 != 0) goto L_0x00b3
            com.instagram.common.session.UserSession r0 = r7.A02
            X.3VK r1 = X.AnonymousClass3VI.A00(r0)
            X.3VL r4 = X.AnonymousClass3VL.REELS
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
            r7 = 0
            int r0 = r2.A03
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            X.9Ie r3 = (X.C376489Ie) r3
            java.lang.Object r0 = r3.A03
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            goto L_0x004d
        L_0x00aa:
            boolean r0 = r1.CYA(r3)
            if (r0 == 0) goto L_0x005e
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            goto L_0x0083
        L_0x00b3:
            int r0 = r2.A03
            int r0 = r0 - r26
            int r0 = r0 + -1
            boolean r0 = r6.A0D(r5, r4, r0)
            if (r0 == 0) goto L_0x005e
            com.instagram.common.session.UserSession r0 = r7.A02
            X.3VK r1 = X.AnonymousClass3VI.A00(r0)
            X.3VL r13 = X.AnonymousClass3VL.REELS
            java.lang.Integer r14 = X.AnonymousClass05K.A0j
            int r4 = r2.A03
            int r0 = r4 - r26
            int r2 = r0 + -1
            X.9Ie r3 = (X.C376489Ie) r3
            java.lang.Object r0 = r3.A03
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            goto L_0x00fe
        L_0x00d8:
            int r0 = r2.A03
            int r0 = r0 - r26
            int r0 = r0 + -1
            boolean r0 = r6.A0D(r5, r4, r0)
            if (r0 == 0) goto L_0x005e
            com.instagram.common.session.UserSession r0 = r7.A01
            X.3VK r1 = X.AnonymousClass3VI.A00(r0)
            X.3VL r13 = X.AnonymousClass3VL.FEED
            java.lang.Integer r14 = X.AnonymousClass05K.A0j
            int r4 = r2.A03
            int r0 = r4 - r26
            int r2 = r0 + -1
            X.4EB r3 = (X.AnonymousClass4EB) r3
            X.1Xg r0 = r3.A01
            X.1Xn r0 = r0.A05
            X.1Xj r0 = X.1Xi.A02(r0)
        L_0x00fe:
            if (r0 == 0) goto L_0x0104
            java.lang.String r11 = r0.getId()
        L_0x0104:
            r16 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r2)
            X.GXs r3 = new X.GXs
            r12 = r3
            r17 = r16
            r19 = r16
            r20 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233422vh.A09(X.3n0, X.1PW, X.2vl, java.lang.Integer, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C251373n0 r11, X.C233462vl r12, java.lang.Integer r13, java.lang.Integer r14, int r15, int r16, int r17) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C233412vg
            r2 = r17
            if (r0 == 0) goto L_0x0060
            r3 = r10
            X.2vg r3 = (X.C233412vg) r3
            r0 = 3
            X.0qQ.A0B(r13, r0)
            java.lang.Object r1 = r11.BTb()
            X.4EB r1 = (X.AnonymousClass4EB) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.1Xg r1 = r1.A01
            boolean r0 = r3.A0H(r1)
            if (r0 != 0) goto L_0x005d
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r14 == r0) goto L_0x0027
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r14 != r0) goto L_0x005d
        L_0x0027:
            boolean r0 = r12.A0D(r14, r13, r15)
            if (r0 != 0) goto L_0x005d
            r0 = 2
            if (r15 >= r0) goto L_0x005d
            int r0 = r12.A06
            if (r2 >= r0) goto L_0x005d
            com.instagram.common.session.UserSession r0 = r3.A01
            X.3VK r0 = X.AnonymousClass3VI.A00(r0)
            X.3VL r2 = X.AnonymousClass3VL.FEED
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r5 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            X.1Xn r1 = r1.A05
            X.1Xj r1 = X.1Xi.A02(r1)
            if (r1 == 0) goto L_0x005e
            java.lang.String r9 = r1.getId()
        L_0x004f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
        L_0x0053:
            X.GXs r1 = new X.GXs
            r6 = r5
            r8 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.A07(r1)
        L_0x005d:
            return
        L_0x005e:
            r9 = 0
            goto L_0x004f
        L_0x0060:
            boolean r0 = r10 instanceof X.C271904jm
            if (r0 == 0) goto L_0x005d
            r3 = r10
            X.4jm r3 = (X.C271904jm) r3
            r0 = 3
            X.0qQ.A0B(r13, r0)
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x005d
            java.lang.Object r1 = r11.BTb()
            X.9Ie r1 = (X.C376489Ie) r1
            boolean r0 = r3.A0H(r1)
            if (r0 != 0) goto L_0x005d
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r14 == r0) goto L_0x0083
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r14 != r0) goto L_0x005d
        L_0x0083:
            boolean r0 = r12.A0D(r14, r13, r15)
            if (r0 != 0) goto L_0x005d
            int r0 = r12.A06
            if (r2 >= r0) goto L_0x005d
            com.instagram.common.session.UserSession r0 = r3.A02
            X.3VK r0 = X.AnonymousClass3VI.A00(r0)
            X.3VL r2 = X.AnonymousClass3VL.REELS
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            java.lang.Object r1 = r1.A03
            X.4bN r1 = (X.C267324bN) r1
            X.1Xj r1 = r1.A02
            if (r1 == 0) goto L_0x00ad
            java.lang.String r9 = r1.getId()
        L_0x00a7:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r5 = 0
            goto L_0x0053
        L_0x00ad:
            r9 = 0
            goto L_0x00a7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233422vh.A0A(X.3n0, X.2vl, java.lang.Integer, java.lang.Integer, int, int, int):void");
    }

    public void A0B(Object obj, int i, int i2, int i3) {
        1Xj r1;
        AnonymousClass3W1 BQr;
        if (this instanceof C233412vg) {
            C233412vg r2 = (C233412vg) this;
            AnonymousClass4EB r6 = (AnonymousClass4EB) obj;
            0qQ.A0B(r6, 0);
            1Xj A022 = 1Xi.A02(r6.A01.A05);
            if (A022 != null) {
                BQr = r2.A03.A0S.BQr(A022);
            } else {
                return;
            }
        } else if (this instanceof C271904jm) {
            C271904jm r4 = (C271904jm) this;
            C376489Ie r62 = (C376489Ie) obj;
            0qQ.A0B(r62, 0);
            if (!182.A06(0Tu.A05, r4.A02, 36318556989888776L) || (r1 = ((C267324bN) r62.A03).A02) == null || (BQr = r4.A01.BQr(r1)) == null) {
                return;
            }
        } else {
            return;
        }
        BQr.A0V = i;
        BQr.A0G = i2;
        BQr.A0R = i3;
    }

    public final boolean A0C(C233462vl r6, Object obj) {
        C233372vc r4;
        Object A0O;
        Object A0O2;
        Object obj2;
        if (this instanceof C233412vg) {
            C233412vg r1 = (C233412vg) this;
            AnonymousClass4EB r7 = (AnonymousClass4EB) obj;
            0qQ.A0B(r7, 0);
            r4 = r1.A04;
            AnonymousClass2rI r2 = r1.A03;
            A0O = 00k.A0O(r2.A08(), r6.A09());
            A0O2 = 00k.A0O(r2.A08(), r6.A09() - 1);
            obj2 = r7.A01;
        } else if (!(this instanceof C271904jm)) {
            return true;
        } else {
            C271904jm r12 = (C271904jm) this;
            C376489Ie r72 = (C376489Ie) obj;
            0qQ.A0B(r72, 0);
            r4 = r12.A03;
            C54575HJk hJk = r12.A05;
            A0O = 00k.A0O(hJk.A0I(), r6.A09());
            A0O2 = 00k.A0O(hJk.A0I(), r6.A09() - 1);
            obj2 = r72.A03;
        }
        return r4.CPX(A0O, A0O2, obj2);
    }

    public boolean A0D(C233462vl r9, Object obj) {
        Integer num;
        Integer num2;
        ArrayList arrayList;
        1Xj r0;
        BrandSafetyContentBlocklistBitmapQLObj AiG;
        List Afw;
        1Xj r02;
        BrandSafetyContentBlocklistBitmapQLObj AiG2;
        List Afw2;
        if (this instanceof C271874jj) {
            return true;
        }
        if (this instanceof C233412vg) {
            C233412vg r1 = (C233412vg) this;
            AnonymousClass4EB r10 = (AnonymousClass4EB) obj;
            0qQ.A0B(r10, 0);
            return r1.A04.Cd4(r10.A01, r1.A03.A08(), r9.A09());
        }
        C271904jm r5 = (C271904jm) this;
        C376489Ie r102 = (C376489Ie) obj;
        0qQ.A0B(r102, 0);
        C267324bN r4 = (C267324bN) r102.A03;
        1Xj r12 = r4.A02;
        int A092 = r9.A09();
        if (r12 != null) {
            AnonymousClass3W1 BQr = r5.A06.BQr(r12);
            int i = A092 - 1;
            Integer A012 = C271904jm.A01(r5, i);
            Integer A013 = C271904jm.A01(r5, A092);
            BQr.A18 = A012;
            BQr.A17 = A013;
            String A022 = C271904jm.A02(r5, i);
            String A023 = C271904jm.A02(r5, A092);
            BQr.A1S = A022;
            BQr.A1O = A023;
            C54575HJk hJk = r5.A05;
            C267324bN r2 = (C267324bN) 00k.A0O(hJk.A0I(), i);
            C267324bN r7 = (C267324bN) 00k.A0O(hJk.A0I(), A092);
            ArrayList arrayList2 = null;
            if (r2 != null) {
                num = C52192GIj.A00(r2);
            } else {
                num = null;
            }
            if (r7 != null) {
                num2 = C52192GIj.A00(r7);
            } else {
                num2 = null;
            }
            BQr.A0a(num, num2);
            if (r5.A09) {
                if (r2 == null || (r02 = r2.A02) == null || (AiG2 = r02.A0C.AiG()) == null || (Afw2 = AiG2.Afw()) == null) {
                    arrayList = null;
                } else {
                    arrayList = C271914jn.A00.A01(Afw2);
                }
                if (!(r7 == null || (r0 = r7.A02) == null || (AiG = r0.A0C.AiG()) == null || (Afw = AiG.Afw()) == null)) {
                    arrayList2 = C271914jn.A00.A01(Afw);
                }
                if (arrayList != null) {
                    BQr.A1i = arrayList;
                }
                if (arrayList2 != null) {
                    BQr.A1h = arrayList2;
                }
            }
        }
        return r5.A03.Cd4(r4, r5.A05.A0I(), r9.A09());
    }

    public boolean A0E(Object obj) {
        if (this instanceof C271874jj) {
            C271874jj r2 = (C271874jj) this;
            C376509Ig r4 = (C376509Ig) obj;
            0qQ.A0B(r4, 0);
            1Xj A002 = ((C295745oq) r4.A02).A00();
            if (A002 != null) {
                return C231122qu.A0R(r2.A00, A002);
            }
            return false;
        } else if (!(this instanceof C233412vg)) {
            return ((C271904jm) this).A0H((C376489Ie) obj);
        } else {
            AnonymousClass4EB r42 = (AnonymousClass4EB) obj;
            0qQ.A0B(r42, 0);
            return ((C233412vg) this).A0H(r42.A01);
        }
    }

    public boolean A0F(Object obj) {
        if (!(this instanceof C233412vg) && (this instanceof C271904jm)) {
            C271904jm r1 = (C271904jm) this;
            C376489Ie r3 = (C376489Ie) obj;
            0qQ.A0B(r3, 0);
            if (r1.A07 || C271904jm.A03(r3, r1)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A7t(C233602vz r2) {
        if (r2 != null) {
            this.A03.add(r2);
        }
    }

    public final C233612w1 AMC() {
        return new AnonymousClass2w0();
    }

    public final AnonymousClass4lJ AN3() {
        return new C57364IYv();
    }

    public final Set Bsw() {
        return 0sl.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0213, code lost:
        r10 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x028b, code lost:
        r10 = X.AnonymousClass05K.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x028e, code lost:
        r35 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d5, code lost:
        if (r17 > 0) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0103, code lost:
        if (r2 < r3) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0105, code lost:
        r5.A0B(r5.A09() - r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01bb, code lost:
        if ((r12 instanceof X.C271904jm) == false) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c9, code lost:
        if (X.C271904jm.A03((X.C376489Ie) r8.BTb(), (X.C271904jm) r10) == false) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01cd, code lost:
        if (r12.A07 == false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d3, code lost:
        if (r5.A09() == r4) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d5, code lost:
        r2.A01("pushdown_rule_met");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01dc, code lost:
        if (r12.A00 != 0) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01de, code lost:
        r12.A00 = r5.A09() - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e5, code lost:
        if (r7 == false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01eb, code lost:
        if (r8.Bo5() == false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01ed, code lost:
        r2.A01("delay_pushdown_retry");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f2, code lost:
        A0B(r6, r5.A09() - r4, r3, r0);
        r12.A01.BtU().A04(r2.A00(), r5.A09(), "Insert push down");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0211, code lost:
        if (r11.CcL(r6) == false) goto L_0x028b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Crm(int r38) {
        /*
            r37 = this;
            r12 = r37
            X.3kU r4 = r12.A04
            java.util.LinkedList r0 = r4.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02c2
            r2 = 0
            r12.A00 = r2
            X.3n0 r0 = r4.A00()
            java.lang.Object r0 = r0.BTb()
            X.2vl r0 = r12.A07(r0)
            java.lang.String r21 = "Required value was null."
            if (r0 == 0) goto L_0x02ba
            boolean r0 = r0.A0A
            r36 = r0
            java.util.List r1 = r12.A08()
            X.2mN r11 = r12.A02
            X.4jl r3 = X.C271884jk.A00(r11, r1, r0)
            java.lang.Integer r10 = r3.A01
            boolean r0 = r12.A0C
            if (r0 == 0) goto L_0x0087
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r10 == r0) goto L_0x0087
            java.util.List r1 = r12.A08()
            int r0 = r3.A00
            java.lang.Object r25 = X.00k.A0O(r1, r0)
        L_0x0041:
            int r0 = r3.A00
            r35 = r0
            java.util.Collection r5 = r4.A03()
            boolean r0 = r12 instanceof X.C233412vg
            r20 = r0
            if (r0 == 0) goto L_0x008d
            r0 = r12
            X.2vg r0 = (X.C233412vg) r0
            X.0qQ.A0B(r5, r2)
            java.util.Map r6 = r0.A07
            r0 = 10
            int r0 = X.0Yv.A1E(r5, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r3 = r5.iterator()
        L_0x0066:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r3.next()
            X.3n0 r0 = (X.C251373n0) r0
            java.lang.Object r1 = r0.BTb()
            X.4EB r1 = (X.AnonymousClass4EB) r1
            X.1Xg r0 = r1.A01
            java.lang.String r2 = r0.A09
            X.2vl r1 = r1.A03
            X.0eP r0 = new X.0eP
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x0066
        L_0x0087:
            r25 = 0
            goto L_0x0041
        L_0x008a:
            X.0Yt.A0F(r4, r6)
        L_0x008d:
            java.util.Iterator r19 = r5.iterator()
            r17 = 0
            r18 = 0
            r26 = 0
            r9 = 0
            r33 = 0
        L_0x009a:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x02c2
            java.lang.Object r8 = r19.next()
            X.3n0 r8 = (X.C251373n0) r8
            boolean r7 = r12.A09
            r15 = 1
            if (r7 == 0) goto L_0x00b1
            if (r18 == 0) goto L_0x00b1
            r8.Eiv(r15)
            goto L_0x009a
        L_0x00b1:
            java.lang.Object r6 = r8.BTb()
            X.2vl r5 = r12.A07(r6)
            if (r5 == 0) goto L_0x02b2
            if (r17 > 0) goto L_0x00d7
            int r1 = r5.A06
            int r0 = r5.A03
            int r0 = r0 + 1
            int r1 = java.lang.Math.min(r1, r0)
            int r17 = r5.A09()
            int r0 = r5.A00
            int r0 = r17 - r0
            int r0 = java.lang.Math.max(r1, r0)
            int r17 = r17 - r0
            if (r17 <= 0) goto L_0x010e
        L_0x00d7:
            int r3 = r5.A09()
            if (r20 == 0) goto L_0x010e
            r1 = r12
            X.2vg r1 = (X.C233412vg) r1
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x010e
            X.2rI r0 = r1.A03
            java.util.List r0 = r0.A08()
            java.util.Iterator r4 = r0.iterator()
            r2 = 0
        L_0x00ef:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r4.next()
            X.1Xg r0 = (X.1Xg) r0
            X.1UQ r1 = r0.A06
            X.1UQ r0 = X.1UQ.A0F
            if (r1 != r0) goto L_0x01b1
            if (r2 < 0) goto L_0x0105
            if (r2 < r3) goto L_0x010e
        L_0x0105:
            int r0 = r5.A09()
            int r0 = r0 - r17
            r5.A0B(r0)
        L_0x010e:
            boolean r0 = r12.A0B
            if (r0 == 0) goto L_0x011c
            int r1 = r5.A09()
            int r0 = r12.A00
            int r1 = r1 + r0
            r5.A0B(r1)
        L_0x011c:
            X.1PW r16 = X.1PW.A0K
            r2 = r16
            int r4 = r5.A09()
            r3 = -1
            r0 = -1
        L_0x0126:
            boolean r1 = r12.A0A
            if (r1 == 0) goto L_0x0132
            r1 = r16
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x013c
        L_0x0132:
            int r13 = r5.A09()
            int r1 = r12.A06(r8, r5, r10, r4)
            if (r13 > r1) goto L_0x0215
        L_0x013c:
            r1 = r38
            r22 = r12
            r23 = r8
            r24 = r10
            r27 = r35
            r28 = r1
            X.1PW r2 = r22.A0G(r23, r24, r25, r26, r27, r28)
            r2.A02 = r1
            if (r7 == 0) goto L_0x0163
            java.lang.Integer r13 = r2.A0C
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r13 != r1) goto L_0x0163
            java.lang.Integer r13 = r2.A0B
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            if (r13 != r1) goto L_0x0163
            r8.Eiv(r15)
            r18 = 1
            goto L_0x009a
        L_0x0163:
            r1 = r16
            r2.equals(r1)
            java.lang.Integer r13 = r2.A0C
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r13 == r1) goto L_0x01b8
            java.lang.Integer r13 = r2.A0C
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            if (r13 == r1) goto L_0x01b8
            boolean r13 = r12.A07
            if (r13 == 0) goto L_0x01b5
            java.lang.Integer r14 = r2.A0B
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            if (r14 == r13) goto L_0x0184
            java.lang.Integer r14 = r2.A0B
            java.lang.Integer r13 = X.AnonymousClass05K.A0Y
            if (r14 != r13) goto L_0x0188
        L_0x0184:
            boolean r13 = r12.A05
            if (r13 == 0) goto L_0x01b5
        L_0x0188:
            java.lang.Integer r13 = r2.A0B
            if (r13 == r1) goto L_0x01b5
            if (r9 == 0) goto L_0x01af
            int r1 = r9.A03
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
        L_0x0194:
            r1 = -1
            if (r3 != r1) goto L_0x01a4
            if (r13 == 0) goto L_0x01a4
            int r0 = r5.A09()
            int r1 = r13.intValue()
            int r3 = r0 - r1
            int r3 = r3 - r15
        L_0x01a4:
            int r1 = r5.A09()
            int r1 = r1 + 1
            r5.A0B(r1)
            goto L_0x0126
        L_0x01af:
            r13 = 0
            goto L_0x0194
        L_0x01b1:
            int r2 = r2 + 1
            goto L_0x00ef
        L_0x01b5:
            int r26 = r26 + 1
            goto L_0x0215
        L_0x01b8:
            r10 = r12
            boolean r1 = r12 instanceof X.C271904jm
            if (r1 == 0) goto L_0x028e
            X.4jm r10 = (X.C271904jm) r10
            java.lang.Object r1 = r8.BTb()
            X.9Ie r1 = (X.C376489Ie) r1
            boolean r1 = X.C271904jm.A03(r1, r10)
            if (r1 == 0) goto L_0x028e
        L_0x01cb:
            boolean r1 = r12.A07
            if (r1 == 0) goto L_0x020d
            int r1 = r5.A09()
            if (r1 == r4) goto L_0x020d
            java.lang.String r1 = "pushdown_rule_met"
            r2.A01(r1)
            int r1 = r12.A00
            if (r1 != 0) goto L_0x01e5
            int r1 = r5.A09()
            int r1 = r1 - r4
            r12.A00 = r1
        L_0x01e5:
            if (r7 == 0) goto L_0x01f2
            boolean r1 = r8.Bo5()
            if (r1 == 0) goto L_0x01f2
            java.lang.String r1 = "delay_pushdown_retry"
            r2.A01(r1)
        L_0x01f2:
            int r1 = r5.A09()
            int r1 = r1 - r4
            r12.A0B(r6, r1, r3, r0)
            X.2vk r0 = r12.A01
            X.3VX r10 = r0.BtU()
            int r3 = r5.A09()
            java.util.List r1 = r2.A00()
            java.lang.String r0 = "Insert push down"
            r10.A04(r1, r3, r0)
        L_0x020d:
            boolean r0 = r11.CcL(r6)
            if (r0 == 0) goto L_0x028b
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
        L_0x0215:
            java.lang.Integer r3 = r2.A0C
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r3 == r1) goto L_0x027e
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r3 == r0) goto L_0x027e
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x022a
            r5.A0B(r4)
            r2.A03 = r4
            int r26 = r26 + 1
        L_0x022a:
            if (r9 == 0) goto L_0x026e
            int r3 = r9.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L_0x026e
            if (r33 == 0) goto L_0x026e
            r29 = r12
            r30 = r8
            r31 = r2
            r32 = r5
            r34 = r3
            r29.A09(r30, r31, r32, r33, r34)
        L_0x0243:
            if (r7 == 0) goto L_0x0250
            boolean r0 = r8.Bo5()
            if (r0 == 0) goto L_0x0250
            java.lang.String r0 = "delay_pushdown_retry"
            r2.A01(r0)
        L_0x0250:
            java.util.LinkedHashSet r0 = r12.A03
            java.util.Iterator r4 = r0.iterator()
        L_0x0256:
            r3 = 1
        L_0x0257:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0294
            java.lang.Object r0 = r4.next()
            X.2vz r0 = (X.C233602vz) r0
            if (r3 == 0) goto L_0x026c
            boolean r0 = r0.DKi(r2)
            if (r0 == 0) goto L_0x026c
            goto L_0x0256
        L_0x026c:
            r3 = 0
            goto L_0x0257
        L_0x026e:
            r27 = r12
            r28 = r8
            r29 = r2
            r30 = r5
            r31 = r10
            r32 = r35
            r27.A09(r28, r29, r30, r31, r32)
            goto L_0x0243
        L_0x027e:
            boolean r0 = r11.CcL(r6)
            if (r0 == 0) goto L_0x0288
            java.lang.Integer r33 = X.AnonymousClass05K.A0C
        L_0x0286:
            r9 = r2
            goto L_0x0250
        L_0x0288:
            java.lang.Integer r33 = X.AnonymousClass05K.A0N
            goto L_0x0286
        L_0x028b:
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            goto L_0x0215
        L_0x028e:
            int r1 = r2.A03
            r35 = r1
            goto L_0x01cb
        L_0x0294:
            boolean r0 = r12.A08
            if (r0 == 0) goto L_0x009a
            if (r3 != 0) goto L_0x009a
            java.lang.Integer r0 = r2.A0C
            if (r0 != r1) goto L_0x009a
            java.util.List r1 = r12.A08()
            r0 = r36
            X.4jl r0 = X.C271884jk.A00(r11, r1, r0)
            java.lang.Integer r10 = r0.A01
            int r0 = r0.A00
            r35 = r0
            int r26 = r26 + 1
            goto L_0x009a
        L_0x02b2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r21
            r1.<init>(r0)
            throw r1
        L_0x02ba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r21
            r1.<init>(r0)
            throw r1
        L_0x02c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233422vh.Crm(int):void");
    }

    public C233422vh(C228812mN r2, C249863kU r3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A04 = r3;
        this.A02 = r2;
        this.A07 = z;
        this.A0A = z2;
        this.A05 = z3;
        this.A08 = z4;
        this.A0C = z5;
        this.A0D = z6;
        this.A06 = z7;
        this.A09 = z8;
        this.A0B = z9;
    }

    public final 1PW AGd(List list) {
        return 1PW.A0K;
    }
}
