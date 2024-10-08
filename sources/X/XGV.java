package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

public final class XGV extends C270324gY {
    public int A00;
    public ArrayList A01;

    public final void A07() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A01;
            if (i < arrayList.size()) {
                ((C270324gY) arrayList.get(i)).A07();
                i++;
            } else {
                return;
            }
        }
    }

    public final void A08() {
        this.A06 = null;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((C270324gY) it.next()).A08();
        }
    }

    public final long A05() {
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C270324gY r2 = (C270324gY) arrayList.get(i);
            j = j + ((long) r2.A04.A00) + r2.A05() + ((long) r2.A03.A00);
        }
        return j;
    }

    public final void A06() {
        C22054Xuf A02;
        int A012;
        2d6 r0;
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C270324gY) it.next()).A06();
        }
        int size = arrayList.size();
        if (size >= 1) {
            2d3 A002 = A00(arrayList, 0);
            2d3 A003 = A00(arrayList, size - 1);
            if (this.A01 != 0) {
                2d6 r02 = A002.A0g;
                2d6 r6 = A003.A0a;
                C22054Xuf A022 = C270324gY.A02(r02, 1);
                int A013 = r02.A01();
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    2d3 A004 = A00(arrayList, i);
                    if (A004.A0R != 8) {
                        A013 = A004.A0g.A01();
                        break;
                    }
                    i++;
                }
                if (A022 != null) {
                    C270324gY.A03(this.A04, A022, A013);
                }
                A02 = C270324gY.A02(r6, 1);
                A012 = r6.A01();
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    }
                    2d3 A005 = A00(arrayList, size2);
                    if (A005.A0R != 8) {
                        r0 = A005.A0a;
                        break;
                    }
                }
            } else {
                2d6 r03 = A002.A0e;
                2d6 r62 = A003.A0f;
                C22054Xuf A023 = C270324gY.A02(r03, 0);
                int A014 = r03.A01();
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    2d3 A006 = A00(arrayList, i2);
                    if (A006.A0R != 8) {
                        A014 = A006.A0e.A01();
                        break;
                    }
                    i2++;
                }
                if (A023 != null) {
                    C270324gY.A03(this.A04, A023, A014);
                }
                A02 = C270324gY.A02(r62, 0);
                A012 = r62.A01();
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    }
                    2d3 A007 = A00(arrayList, size3);
                    if (A007.A0R != 8) {
                        r0 = A007.A0f;
                        break;
                    }
                }
            }
            A012 = r0.A01();
            if (A02 != null) {
                C270324gY.A03(this.A03, A02, -A012);
            }
            this.A04.A03 = this;
            this.A03.A03 = this;
        }
    }

    public final boolean A0B() {
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((C270324gY) arrayList.get(i)).A0B()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:165:0x024e, code lost:
        if (r9 != false) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x02d3, code lost:
        if (r9 != false) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0360, code lost:
        if (r9 != false) goto L_0x032e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0367  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FJM(X.C270334gZ r27) {
        /*
            r26 = this;
            r12 = r26
            X.Xuf r3 = r12.A04
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x036d
            X.Xuf r2 = r12.A03
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x036d
            X.2d3 r0 = r12.A02
            X.2d3 r1 = r0.A0h
            boolean r0 = r1 instanceof X.2d1
            if (r0 == 0) goto L_0x003a
            X.2d1 r1 = (X.2d1) r1
            boolean r9 = r1.A0H
        L_0x001a:
            int r0 = r2.A02
            r22 = r0
            int r10 = r3.A02
            int r8 = r0 - r10
            java.util.ArrayList r7 = r12.A01
            int r6 = r7.size()
            r5 = 0
        L_0x0029:
            r21 = -1
            r4 = 8
            if (r5 >= r6) goto L_0x003c
            X.2d3 r0 = A00(r7, r5)
            int r0 = r0.A0R
            if (r0 != r4) goto L_0x003d
            int r5 = r5 + 1
            goto L_0x0029
        L_0x003a:
            r9 = 0
            goto L_0x001a
        L_0x003c:
            r5 = -1
        L_0x003d:
            int r20 = r6 + -1
            r1 = r20
        L_0x0041:
            if (r1 < 0) goto L_0x0050
            X.2d3 r0 = A00(r7, r1)
            int r0 = r0.A0R
            if (r0 != r4) goto L_0x004e
            int r1 = r1 + -1
            goto L_0x0041
        L_0x004e:
            r21 = r1
        L_0x0050:
            r17 = 0
        L_0x0052:
            r19 = 2
            r3 = 1
            r1 = r19
            r0 = r17
            if (r0 >= r1) goto L_0x00e7
            r14 = 0
            r1 = 0
            r11 = 0
            r2 = 0
            r18 = 0
        L_0x0061:
            if (r14 >= r6) goto L_0x00df
            java.lang.Object r13 = r7.get(r14)
            X.4gY r13 = (X.C270324gY) r13
            X.2d3 r0 = r13.A02
            int r0 = r0.A0R
            if (r0 == r4) goto L_0x00c3
            int r2 = r2 + 1
            if (r14 <= 0) goto L_0x007a
            if (r14 < r5) goto L_0x007a
            X.Xuf r0 = r13.A04
            int r0 = r0.A00
            int r1 = r1 + r0
        L_0x007a:
            X.XGS r0 = r13.A05
            r23 = r0
            int r0 = r0.A02
            r16 = r0
            java.lang.Integer r0 = r13.A07
            r15 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r15 == r0) goto L_0x00a5
            int r15 = r12.A01
            if (r15 != 0) goto L_0x0098
            X.2d3 r0 = r13.A02
            X.4gX r0 = r0.A0k
            X.XGS r0 = r0.A05
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0098
            return
        L_0x0098:
            if (r15 != r3) goto L_0x00b3
            X.2d3 r0 = r13.A02
            X.4ga r0 = r0.A0l
            X.XGS r0 = r0.A05
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00b3
            return
        L_0x00a5:
            int r0 = r13.A00
            if (r0 != r3) goto L_0x00c6
            if (r17 != 0) goto L_0x00c6
            r0 = r23
            int r0 = r0.A00
            r16 = r0
            int r11 = r11 + 1
        L_0x00b3:
            int r1 = r1 + r16
        L_0x00b5:
            r0 = r20
            if (r14 >= r0) goto L_0x00c3
            r0 = r21
            if (r14 >= r0) goto L_0x00c3
            X.Xuf r0 = r13.A03
            int r0 = r0.A00
            int r0 = -r0
            int r1 = r1 + r0
        L_0x00c3:
            int r14 = r14 + 1
            goto L_0x0061
        L_0x00c6:
            r0 = r23
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00b3
            int r11 = r11 + 1
            X.2d3 r0 = r13.A02
            float[] r0 = r0.A0y
            r15 = r0
            int r0 = r12.A01
            r15 = r15[r0]
            r0 = 0
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00b5
            float r18 = r18 + r15
            goto L_0x00b5
        L_0x00df:
            if (r1 < r8) goto L_0x00ec
            if (r11 == 0) goto L_0x00ec
            int r17 = r17 + 1
            goto L_0x0052
        L_0x00e7:
            r2 = 0
            r1 = 0
            r11 = 0
            r18 = 0
        L_0x00ec:
            if (r9 == 0) goto L_0x00f0
            r10 = r22
        L_0x00f0:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r1 <= r8) goto L_0x00ff
            r13 = 1073741824(0x40000000, float:2.0)
            int r0 = r1 - r8
            float r0 = (float) r0
            float r0 = r0 / r13
            float r0 = r0 + r14
            int r0 = (int) r0
            if (r9 == 0) goto L_0x0188
            int r10 = r10 + r0
        L_0x00ff:
            if (r11 <= 0) goto L_0x01c9
            int r0 = r8 - r1
            float r0 = (float) r0
            r17 = r0
            float r0 = (float) r11
            float r0 = r17 / r0
            float r0 = r0 + r14
            int r0 = (int) r0
            r25 = r0
            r13 = 0
            r16 = 0
        L_0x0110:
            if (r13 >= r6) goto L_0x018b
            java.lang.Object r15 = r7.get(r13)
            X.4gY r15 = (X.C270324gY) r15
            X.2d3 r0 = r15.A02
            int r0 = r0.A0R
            if (r0 == r4) goto L_0x0178
            java.lang.Integer r14 = r15.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r14 != r0) goto L_0x0178
            X.XGS r0 = r15.A05
            r24 = r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0178
            r0 = 0
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0185
            X.2d3 r0 = r15.A02
            float[] r14 = r0.A0y
            int r0 = r12.A01
            r14 = r14[r0]
            float r14 = r14 * r17
            float r14 = r14 / r18
            r0 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 + r0
            int r0 = (int) r14
            r23 = r0
        L_0x0143:
            int r0 = r12.A01
            if (r0 != 0) goto L_0x017e
            X.2d3 r0 = r15.A02
            int r14 = r0.A0J
            int r0 = r0.A0L
        L_0x014d:
            r22 = r0
            int r0 = r15.A00
            if (r0 != r3) goto L_0x017b
            r0 = r24
            int r15 = r0.A00
            r0 = r23
            int r15 = java.lang.Math.min(r0, r15)
        L_0x015d:
            r0 = r22
            int r15 = java.lang.Math.max(r0, r15)
            if (r14 <= 0) goto L_0x0169
            int r15 = java.lang.Math.min(r14, r15)
        L_0x0169:
            r0 = r23
            if (r15 == r0) goto L_0x0171
            int r16 = r16 + 1
            r23 = r15
        L_0x0171:
            r14 = r24
            r0 = r23
            r14.A02(r0)
        L_0x0178:
            int r13 = r13 + 1
            goto L_0x0110
        L_0x017b:
            r15 = r23
            goto L_0x015d
        L_0x017e:
            X.2d3 r0 = r15.A02
            int r14 = r0.A0I
            int r0 = r0.A0K
            goto L_0x014d
        L_0x0185:
            r23 = r25
            goto L_0x0143
        L_0x0188:
            int r10 = r10 - r0
            goto L_0x00ff
        L_0x018b:
            if (r16 <= 0) goto L_0x01be
            int r11 = r11 - r16
            r13 = 0
            r1 = 0
        L_0x0191:
            if (r13 >= r6) goto L_0x01be
            java.lang.Object r14 = r7.get(r13)
            X.4gY r14 = (X.C270324gY) r14
            X.2d3 r0 = r14.A02
            int r0 = r0.A0R
            if (r0 == r4) goto L_0x01bb
            if (r13 <= 0) goto L_0x01a8
            if (r13 < r5) goto L_0x01a8
            X.Xuf r0 = r14.A04
            int r0 = r0.A00
            int r1 = r1 + r0
        L_0x01a8:
            X.XGS r0 = r14.A05
            int r0 = r0.A02
            int r1 = r1 + r0
            r0 = r20
            if (r13 >= r0) goto L_0x01bb
            r0 = r21
            if (r13 >= r0) goto L_0x01bb
            X.Xuf r0 = r14.A03
            int r0 = r0.A00
            int r0 = -r0
            int r1 = r1 + r0
        L_0x01bb:
            int r13 = r13 + 1
            goto L_0x0191
        L_0x01be:
            int r13 = r12.A00
            r0 = r19
            if (r13 != r0) goto L_0x01c9
            if (r16 != 0) goto L_0x01c9
            r0 = 0
            r12.A00 = r0
        L_0x01c9:
            if (r1 <= r8) goto L_0x01cf
            r0 = r19
            r12.A00 = r0
        L_0x01cf:
            if (r2 <= 0) goto L_0x01db
            if (r11 != 0) goto L_0x01db
            r0 = r21
            if (r5 != r0) goto L_0x01db
            r0 = r19
            r12.A00 = r0
        L_0x01db:
            int r13 = r12.A00
            if (r13 != r3) goto L_0x025e
            if (r2 <= r3) goto L_0x0257
            int r8 = r8 - r1
            int r2 = r2 - r3
        L_0x01e3:
            int r8 = r8 / r2
        L_0x01e4:
            if (r11 <= 0) goto L_0x01e7
            r8 = 0
        L_0x01e7:
            r1 = 0
        L_0x01e8:
            if (r1 >= r6) goto L_0x036d
            r0 = r1
            if (r9 == 0) goto L_0x01f1
            int r0 = r1 + 1
            int r0 = r6 - r0
        L_0x01f1:
            java.lang.Object r11 = r7.get(r0)
            X.4gY r11 = (X.C270324gY) r11
            X.2d3 r0 = r11.A02
            int r0 = r0.A0R
            if (r0 != r4) goto L_0x020a
            X.Xuf r0 = r11.A04
            r0.A02(r10)
            X.Xuf r0 = r11.A03
            r0.A02(r10)
        L_0x0207:
            int r1 = r1 + 1
            goto L_0x01e8
        L_0x020a:
            if (r1 <= 0) goto L_0x024e
            if (r9 == 0) goto L_0x024c
            int r10 = r10 - r8
        L_0x020f:
            if (r1 < r5) goto L_0x024e
            X.Xuf r0 = r11.A04
            int r0 = r0.A00
            if (r9 == 0) goto L_0x0251
            int r10 = r10 - r0
        L_0x0218:
            X.Xuf r0 = r11.A03
        L_0x021a:
            r0.A02(r10)
            X.XGS r13 = r11.A05
            int r12 = r13.A02
            java.lang.Integer r2 = r11.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 != r0) goto L_0x022d
            int r0 = r11.A00
            if (r0 != r3) goto L_0x022d
            int r12 = r13.A00
        L_0x022d:
            if (r9 == 0) goto L_0x0248
            int r10 = r10 - r12
            X.Xuf r0 = r11.A04
        L_0x0232:
            r0.A02(r10)
            r11.A09 = r3
            r0 = r20
            if (r1 >= r0) goto L_0x0207
            r0 = r21
            if (r1 >= r0) goto L_0x0207
            X.Xuf r0 = r11.A03
            int r0 = r0.A00
            int r0 = -r0
            if (r9 == 0) goto L_0x0255
            int r10 = r10 - r0
            goto L_0x0207
        L_0x0248:
            int r10 = r10 + r12
            X.Xuf r0 = r11.A03
            goto L_0x0232
        L_0x024c:
            int r10 = r10 + r8
            goto L_0x020f
        L_0x024e:
            if (r9 == 0) goto L_0x0252
            goto L_0x0218
        L_0x0251:
            int r10 = r10 + r0
        L_0x0252:
            X.Xuf r0 = r11.A04
            goto L_0x021a
        L_0x0255:
            int r10 = r10 + r0
            goto L_0x0207
        L_0x0257:
            if (r2 != r3) goto L_0x025c
            int r8 = r8 - r1
            r2 = 2
            goto L_0x01e3
        L_0x025c:
            r8 = 0
            goto L_0x01e4
        L_0x025e:
            if (r13 != 0) goto L_0x02dc
            int r8 = r8 - r1
            int r0 = r2 + 1
            int r8 = r8 / r0
            if (r11 <= 0) goto L_0x0267
            r8 = 0
        L_0x0267:
            r1 = 0
        L_0x0268:
            if (r1 >= r6) goto L_0x036d
            r0 = r1
            if (r9 == 0) goto L_0x0271
            int r0 = r1 + 1
            int r0 = r6 - r0
        L_0x0271:
            java.lang.Object r2 = r7.get(r0)
            X.4gY r2 = (X.C270324gY) r2
            X.2d3 r0 = r2.A02
            int r0 = r0.A0R
            if (r0 != r4) goto L_0x028a
            X.Xuf r0 = r2.A04
            r0.A02(r10)
            X.Xuf r0 = r2.A03
            r0.A02(r10)
        L_0x0287:
            int r1 = r1 + 1
            goto L_0x0268
        L_0x028a:
            int r12 = r10 + r8
            if (r9 == 0) goto L_0x0290
            int r12 = r10 - r8
        L_0x0290:
            if (r1 <= 0) goto L_0x02d3
            if (r1 < r5) goto L_0x02d3
            X.Xuf r0 = r2.A04
            int r0 = r0.A00
            if (r9 == 0) goto L_0x02d6
            int r12 = r12 - r0
        L_0x029b:
            X.Xuf r0 = r2.A03
        L_0x029d:
            r0.A02(r12)
            X.XGS r13 = r2.A05
            int r11 = r13.A02
            java.lang.Integer r10 = r2.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r10 != r0) goto L_0x02b4
            int r0 = r2.A00
            if (r0 != r3) goto L_0x02b4
            int r0 = r13.A00
            int r11 = java.lang.Math.min(r11, r0)
        L_0x02b4:
            if (r9 == 0) goto L_0x02ce
            int r10 = r12 - r11
            X.Xuf r0 = r2.A04
        L_0x02ba:
            r0.A02(r10)
            r0 = r20
            if (r1 >= r0) goto L_0x0287
            r0 = r21
            if (r1 >= r0) goto L_0x0287
            X.Xuf r0 = r2.A03
            int r0 = r0.A00
            int r0 = -r0
            if (r9 == 0) goto L_0x02da
            int r10 = r10 - r0
            goto L_0x0287
        L_0x02ce:
            int r10 = r12 + r11
            X.Xuf r0 = r2.A03
            goto L_0x02ba
        L_0x02d3:
            if (r9 == 0) goto L_0x02d7
            goto L_0x029b
        L_0x02d6:
            int r12 = r12 + r0
        L_0x02d7:
            X.Xuf r0 = r2.A04
            goto L_0x029d
        L_0x02da:
            int r10 = r10 + r0
            goto L_0x0287
        L_0x02dc:
            r0 = r19
            if (r13 != r0) goto L_0x036d
            int r2 = r12.A01
            X.2d3 r0 = r12.A02
            if (r2 != 0) goto L_0x0369
            float r2 = r0.A02
        L_0x02e8:
            if (r9 == 0) goto L_0x02ee
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r0 - r2
        L_0x02ee:
            int r8 = r8 - r1
            float r1 = (float) r8
            float r1 = r1 * r2
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            if (r0 < 0) goto L_0x02f9
            if (r11 <= 0) goto L_0x02fa
        L_0x02f9:
            r0 = 0
        L_0x02fa:
            int r1 = r10 + r0
            if (r9 == 0) goto L_0x0300
            int r1 = r10 - r0
        L_0x0300:
            r2 = 0
        L_0x0301:
            if (r2 >= r6) goto L_0x036d
            r0 = r2
            if (r9 == 0) goto L_0x030a
            int r0 = r2 + 1
            int r0 = r6 - r0
        L_0x030a:
            java.lang.Object r11 = r7.get(r0)
            X.4gY r11 = (X.C270324gY) r11
            X.2d3 r0 = r11.A02
            int r0 = r0.A0R
            if (r0 != r4) goto L_0x0323
            X.Xuf r0 = r11.A04
            r0.A02(r1)
            X.Xuf r0 = r11.A03
            r0.A02(r1)
        L_0x0320:
            int r2 = r2 + 1
            goto L_0x0301
        L_0x0323:
            if (r2 <= 0) goto L_0x0360
            if (r2 < r5) goto L_0x0360
            X.Xuf r0 = r11.A04
            int r0 = r0.A00
            if (r9 == 0) goto L_0x0363
            int r1 = r1 - r0
        L_0x032e:
            X.Xuf r0 = r11.A03
        L_0x0330:
            r0.A02(r1)
            X.XGS r12 = r11.A05
            int r10 = r12.A02
            java.lang.Integer r8 = r11.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r8 != r0) goto L_0x0343
            int r0 = r11.A00
            if (r0 != r3) goto L_0x0343
            int r10 = r12.A00
        L_0x0343:
            if (r9 == 0) goto L_0x035c
            int r1 = r1 - r10
            X.Xuf r0 = r11.A04
        L_0x0348:
            r0.A02(r1)
            r0 = r20
            if (r2 >= r0) goto L_0x0320
            r0 = r21
            if (r2 >= r0) goto L_0x0320
            X.Xuf r0 = r11.A03
            int r0 = r0.A00
            int r0 = -r0
            if (r9 == 0) goto L_0x0367
            int r1 = r1 - r0
            goto L_0x0320
        L_0x035c:
            int r1 = r1 + r10
            X.Xuf r0 = r11.A03
            goto L_0x0348
        L_0x0360:
            if (r9 == 0) goto L_0x0364
            goto L_0x032e
        L_0x0363:
            int r1 = r1 + r0
        L_0x0364:
            X.Xuf r0 = r11.A04
            goto L_0x0330
        L_0x0367:
            int r1 = r1 + r0
            goto L_0x0320
        L_0x0369:
            float r2 = r0.A06
            goto L_0x02e8
        L_0x036d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XGV.FJM(X.4gZ):void");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.A01 == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            sb.append("<");
            sb.append(next);
            sb.append("> ");
        }
        return sb.toString();
    }

    public XGV(2d3 r6, int i) {
        super(r6);
        2d6 r2;
        Object obj;
        2d6 r22;
        int i2;
        Object obj2;
        2d6 r23;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A01 = A1C;
        this.A01 = i;
        2d3 r3 = this.A02;
        while (true) {
            if (i == 0) {
                r2 = r3.A0e;
            } else {
                r2 = r3.A0g;
            }
            2d6 r1 = r2.A04;
            if (r1 == null || r1.A04 != r2) {
                this.A02 = r3;
            } else {
                r3 = r1.A08;
            }
        }
        this.A02 = r3;
        if (i == 0) {
            obj = r3.A0k;
        } else {
            obj = r3.A0l;
        }
        A1C.add(obj);
        if (i == 0) {
            r22 = r3.A0f;
        } else {
            r22 = r3.A0a;
        }
        while (true) {
            2d6 r12 = r22.A04;
            if (r12 == null || r12.A04 != r22) {
                Iterator it = A1C.iterator();
            } else {
                2d3 r13 = r12.A08;
                if (i == 0) {
                    obj2 = r13.A0k;
                } else {
                    obj2 = r13.A0l;
                }
                A1C.add(obj2);
                if (i == 0) {
                    r23 = r13.A0f;
                } else {
                    r23 = r13.A0a;
                }
            }
        }
        Iterator it2 = A1C.iterator();
        while (it2.hasNext()) {
            C270324gY r14 = (C270324gY) it2.next();
            int i3 = this.A01;
            if (i3 == 0) {
                r14.A02.A0i = this;
            } else if (i3 == 1) {
                r14.A02.A0j = this;
            }
        }
        int i4 = this.A01;
        if (i4 == 0 && this.A02.A0h.A0H && A1C.size() > 1) {
            this.A02 = A00(A1C, A1C.size() - 1);
        }
        2d3 r0 = this.A02;
        if (i4 == 0) {
            i2 = r0.A0C;
        } else {
            i2 = r0.A0P;
        }
        this.A00 = i2;
    }

    public static 2d3 A00(AbstractList abstractList, int i) {
        return ((C270324gY) abstractList.get(i)).A02;
    }
}
