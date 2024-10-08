package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.2xg  reason: invalid class name and case insensitive filesystem */
public final class C234332xg {
    public int A00;
    public long A01;
    public final Context A02;
    public final UserSession A03;
    public final C234322xf A04;
    public final String A05;
    public final LinkedList A06 = new LinkedList();
    public final C62320sa A07;
    public final C234312xe A08;

    public C234332xg(Context context, UserSession userSession, C234312xe r4, C234322xf r5, String str, C62320sa r7) {
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A02 = context;
        this.A03 = userSession;
        this.A08 = r4;
        this.A04 = r5;
        this.A07 = r7;
    }

    private final boolean A01(Integer num, Object obj, int i, int i2) {
        Object obj2;
        int[] modelIndex;
        LinkedList linkedList = this.A06;
        if (linkedList.size() >= 1) {
            AnonymousClass2xS r1 = this.A04.A00;
            int i3 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            C231332rR r7 = r1.A0D;
            if (AnonymousClass3OG.A04(r1.A0A, r7, obj)) {
                Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((C292475j0) obj2).A01 == num) {
                        break;
                    }
                }
                C292475j0 r2 = (C292475j0) obj2;
                if (r2 != null) {
                    Object obj3 = r2.A02;
                    if (!0qQ.A0K(obj3, obj) && (modelIndex = r7.getModelIndex(obj)) != null) {
                        int i4 = modelIndex[0];
                        int i5 = (modelIndex[1] + i4) - 1;
                        if (i4 > i2 || i5 < i) {
                            int[] modelIndex2 = r7.getModelIndex(obj3);
                            if (modelIndex2 != null) {
                                int i6 = modelIndex2[0];
                                int intValue = num.intValue();
                                if (intValue == 1) {
                                }
                            }
                        }
                        A00(linkedList, new AnonymousClass9LR(num, 10));
                        if (linkedList.size() >= 1) {
                            linkedList.remove(r2);
                        }
                        this.A00 = 0;
                    }
                } else {
                    while (linkedList.size() >= 1) {
                        linkedList.pollLast();
                    }
                }
            }
        }
        if (linkedList.size() >= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c3, code lost:
        if (A01(r6, r13, r8, r7) != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0188, code lost:
        if (r14 == X.AnonymousClass05K.A0u) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c8, code lost:
        if (r2 == X.AnonymousClass05K.A0u) goto L_0x01ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(int r23, int r24) {
        /*
            r22 = this;
            r8 = r23
            int r24 = r24 + r23
            int r7 = r24 + -1
            r9 = r22
            X.2xe r0 = r9.A08
            java.lang.Integer r6 = r0.A01
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r9.A01
            long r10 = r1 - r3
            r3 = 100
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0056
            r9.A01 = r1
            int r0 = r6.intValue()
            r5 = 0
            r4 = 1
            if (r0 == r4) goto L_0x025a
            if (r0 == r5) goto L_0x0236
            X.2HY r2 = X.2HY.A00
        L_0x0028:
            X.2xf r0 = r9.A04
            X.2xS r0 = r0.A00
            r21 = r0
            X.2uK r0 = r0.A0G
            r20 = r0
            X.1Xj r18 = r20.A0G()
            if (r18 == 0) goto L_0x0046
            java.util.LinkedList r10 = r9.A06
            r3 = 11
            X.9LR r1 = new X.9LR
            r0 = r18
            r1.<init>(r0, r3)
            A00(r10, r1)
        L_0x0046:
            int r3 = r2.A00
            int r0 = r2.A01
            r19 = r0
            int r0 = r2.A02
            r17 = r0
            if (r0 <= 0) goto L_0x0057
            r0 = r19
            if (r3 <= r0) goto L_0x005d
        L_0x0056:
            return
        L_0x0057:
            if (r0 >= 0) goto L_0x0056
            r0 = r19
            if (r0 > r3) goto L_0x0056
        L_0x005d:
            r16 = 0
        L_0x005f:
            r0 = r21
            X.2rR r2 = r0.A0D
            java.lang.Object r1 = r2.getItem(r3)
            boolean r0 = r1 instanceof X.1Xj
            if (r0 == 0) goto L_0x022e
            r0 = r1
            X.1Xj r0 = (X.1Xj) r0
            boolean r0 = r0.A5D()
            if (r0 == 0) goto L_0x00f4
            X.1Xl r1 = (X.1Xl) r1
            X.1Xj r14 = r20.A0G()
            X.1Xj r13 = r1.BPf()
            X.1Xj r0 = r1.BPf()
            X.3W1 r1 = r2.BQr(r0)
            boolean r0 = r0.CcK()
            if (r0 == 0) goto L_0x00ef
            int r12 = r1.A01()
        L_0x0090:
            X.0qQ.A0B(r13, r5)
            X.1Xj r0 = r13.BPf()
            X.3W1 r0 = r2.BQr(r0)
            if (r0 == 0) goto L_0x00c5
            int r0 = r0.A03
            X.1Xj r11 = r13.A1c(r0)
            if (r11 == 0) goto L_0x00c5
            java.util.LinkedList r10 = r9.A06
            boolean r1 = r10 instanceof java.util.Collection
            if (r1 == 0) goto L_0x00d6
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00d6
        L_0x00b1:
            boolean r0 = X.0qQ.A0K(r14, r11)
            if (r0 != 0) goto L_0x00c5
            com.instagram.common.session.UserSession r0 = r9.A03
            boolean r0 = r11.A6W(r0)
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r9.A01(r6, r13, r8, r7)
            if (r0 != 0) goto L_0x0135
        L_0x00c5:
            int r16 = r16 + 1
            java.util.LinkedList r0 = r9.A06
            int r0 = r0.size()
            if (r0 >= r4) goto L_0x0056
            r1 = 9
            r0 = r16
            if (r0 < r1) goto L_0x022e
            return
        L_0x00d6:
            java.util.Iterator r2 = r10.iterator()
        L_0x00da:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r0 = r2.next()
            X.5j0 r0 = (X.C292475j0) r0
            X.1Xj r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 == 0) goto L_0x00da
            goto L_0x00c5
        L_0x00ef:
            int r12 = r1.getPosition()
            goto L_0x0090
        L_0x00f4:
            r13 = r1
            X.1Xl r13 = (X.1Xl) r13
            X.1Xj r1 = r13.BPf()
            r0 = r18
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x00c5
            java.util.LinkedList r10 = r9.A06
            boolean r1 = r10 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0210
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0210
        L_0x010f:
            r0 = r21
            com.instagram.common.session.UserSession r0 = r0.A0A
            boolean r0 = X.AnonymousClass3OG.A04(r0, r2, r13)
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r9.A01(r6, r13, r8, r7)
            if (r0 == 0) goto L_0x00c5
            X.1Xj r0 = r13.BPf()
            X.3W1 r2 = r2.BQr(r0)
            boolean r0 = r0.CcK()
            if (r0 == 0) goto L_0x020a
            int r12 = r2.A01()
        L_0x0131:
            X.1Xj r11 = r13.BPf()
        L_0x0135:
            boolean r0 = r10.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x014c
            if (r1 == 0) goto L_0x01f4
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x01f4
        L_0x0145:
            int r0 = r9.A00
            if (r0 != 0) goto L_0x014c
            r0 = 3
            r9.A00 = r0
        L_0x014c:
            java.lang.Object r1 = X.00k.A0J(r10)
            X.5j0 r1 = (X.C292475j0) r1
            if (r1 == 0) goto L_0x0196
            android.content.Context r0 = r9.A02
            r15 = r0
            com.instagram.common.session.UserSession r0 = r9.A03
            r14 = r0
            X.1Xj r0 = r1.A00
            X.3WR r1 = r0.CEL()
            java.lang.String r0 = r9.A05
            X.4U8 r2 = new X.4U8
            r2.<init>(r15, r14, r1, r0)
            r2.A00 = r12
            r2.A04 = r4
            r2.A02 = r4
            X.0sa r0 = r9.A07
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2.A05 = r0
            X.3WR r0 = r11.CEL()
            java.lang.Integer r14 = r0.A0E
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r14 == r0) goto L_0x018a
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r1 = 0
            if (r14 != r0) goto L_0x018b
        L_0x018a:
            r1 = 1
        L_0x018b:
            r0 = r1 ^ 1
            r2.A06 = r0
            X.4U9 r0 = r2.A00()
            X.AnonymousClass4UA.A00(r0)
        L_0x0196:
            android.content.Context r0 = r9.A02
            r14 = r0
            com.instagram.common.session.UserSession r0 = r9.A03
            r2 = r0
            X.3WR r1 = r11.CEL()
            java.lang.String r0 = r9.A05
            X.4U8 r15 = new X.4U8
            r15.<init>(r14, r2, r1, r0)
            r15.A00 = r12
            r15.A04 = r4
            r15.A02 = r4
            X.0sa r0 = r9.A07
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r15.A05 = r0
            X.3WR r0 = r11.CEL()
            java.lang.Integer r2 = r0.A0E
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r2 == r0) goto L_0x01ca
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            r0 = 0
            if (r2 != r1) goto L_0x01cb
        L_0x01ca:
            r0 = 1
        L_0x01cb:
            r0 = r0 ^ 1
            r15.A06 = r0
            X.4U9 r0 = r15.A00()
            X.AnonymousClass4UA.A00(r0)
            X.5j0 r0 = new X.5j0
            r0.<init>(r11, r6, r13)
            r10.add(r0)
            int r0 = r9.A00
            if (r0 <= 0) goto L_0x00c5
            int r0 = r0 + -1
            r9.A00 = r0
            if (r0 != 0) goto L_0x00c5
            r1 = 29
            X.MPC r0 = new X.MPC
            r0.<init>(r6, r1)
            A00(r10, r0)
            goto L_0x00c5
        L_0x01f4:
            java.util.Iterator r1 = r10.iterator()
        L_0x01f8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0145
            java.lang.Object r0 = r1.next()
            X.5j0 r0 = (X.C292475j0) r0
            java.lang.Integer r0 = r0.A01
            if (r0 != r6) goto L_0x01f8
            goto L_0x014c
        L_0x020a:
            int r12 = r2.getPosition()
            goto L_0x0131
        L_0x0210:
            java.util.Iterator r12 = r10.iterator()
        L_0x0214:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x010f
            java.lang.Object r0 = r12.next()
            X.5j0 r0 = (X.C292475j0) r0
            X.1Xj r11 = r0.A00
            X.1Xj r0 = r13.BPf()
            boolean r0 = X.0qQ.A0K(r11, r0)
            if (r0 == 0) goto L_0x0214
            goto L_0x00c5
        L_0x022e:
            r0 = r19
            if (r3 == r0) goto L_0x0056
            int r3 = r3 + r17
            goto L_0x005f
        L_0x0236:
            java.util.LinkedList r2 = r9.A06
            r1 = 7
            X.9M6 r0 = new X.9M6
            r0.<init>((int) r7, (int) r1, (java.lang.Object) r9, (java.lang.Object) r6)
            A00(r2, r0)
            X.2xf r0 = r9.A04
            X.2xS r1 = r0.A00
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.2rR r0 = r1.A0D
            int r0 = r0.getCount()
            int r0 = r0 - r4
            int r1 = java.lang.Math.min(r8, r0)
            r0 = -1
            X.2HZ r2 = new X.2HZ
            r2.<init>(r1, r5, r0)
            goto L_0x0028
        L_0x025a:
            java.util.LinkedList r2 = r9.A06
            r1 = 7
            X.9M6 r0 = new X.9M6
            r0.<init>((int) r8, (int) r1, (java.lang.Object) r9, (java.lang.Object) r6)
            A00(r2, r0)
            int r2 = java.lang.Math.max(r7, r5)
            X.2xf r0 = r9.A04
            X.2xS r1 = r0.A00
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.2rR r0 = r1.A0D
            int r0 = r0.getCount()
            X.2HY r2 = X.C229632nm.A0C(r2, r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234332xg.A02(int, int):void");
    }

    public static final void A00(LinkedList linkedList, 0sP r2) {
        Iterator it = linkedList.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            0qQ.A07(next);
            if (((Boolean) r2.invoke(next)).booleanValue()) {
                it.remove();
            }
        }
    }
}
