package X;

import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import java.util.List;

/* renamed from: X.7gs  reason: invalid class name and case insensitive filesystem */
public final class C337767gs extends C337587ga {
    public 2Sg A00;
    public 2Sg A01;
    public 2Sg A02;
    @Prop(optional = true, resType = C54606HKp.A0A)
    @Comparable(type = 13)
    public Boolean A03;
    @Prop(optional = false, resType = C54606HKp.A0A)
    @Comparable(type = 5)
    public List A04;

    public C337767gs() {
        super("DataDiffSection");
    }

    /* JADX WARNING: type inference failed for: r0v88, types: [X.7h4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v119, types: [X.7h4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v120, types: [X.7h2, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x027f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C337797gv r29, X.C337587ga r30, X.C337587ga r31, X.C337557gX r32, X.C337557gX r33, X.C337557gX r34) {
        /*
            r28 = this;
            r0 = r31
            r1 = r30
            X.7gs r1 = (X.C337767gs) r1
            X.7gs r0 = (X.C337767gs) r0
            r3 = 0
            if (r1 != 0) goto L_0x00fe
            r6 = r3
        L_0x000c:
            if (r0 != 0) goto L_0x00f8
            r5 = r3
        L_0x000f:
            r27 = r32
            X.7ga r0 = r27.A0E()
            if (r0 != 0) goto L_0x00ee
            r1 = 0
        L_0x0018:
            X.7gw r7 = new X.7gw
            r0 = r27
            r7.<init>(r1, r0)
            X.7gx r4 = new X.7gx
            r8 = r29
            r4.<init>(r8)
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r2 = r0.isTracing()
            X.7gy r1 = new X.7gy
            r0 = r27
            r1.<init>(r0, r6, r5)
            if (r5 == 0) goto L_0x0046
            if (r3 == 0) goto L_0x0046
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x0046
            X.7ga r0 = r8.A02
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = r0.A09
        L_0x0043:
            X.C9249RVa.A00(r1, r0, r5)
        L_0x0046:
            if (r2 == 0) goto L_0x004d
            java.lang.String r0 = "DiffUtil.calculateDiff"
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x004d:
            r17 = 1
            X.2ta r0 = X.C232332tX.A00(r1)
            if (r2 == 0) goto L_0x0058
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x0058:
            X.7h1 r3 = new X.7h1
            r3.<init>(r7, r4, r6, r5)
            r0.A02(r3)
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r16 = r0.isTracing()
            java.util.List r6 = r3.A04
            java.lang.String r5 = "renderInfo:"
            r4 = 0
            if (r6 == 0) goto L_0x01e1
            int r1 = r6.size()
            java.util.List r0 = r3.A06
            r24 = r0
            int r0 = r24.size()
            if (r1 == r0) goto L_0x01e1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Inconsistent size between mPlaceholders("
            r2.append(r0)
            int r0 = r24.size()
            r2.append(r0)
            java.lang.String r0 = ") and mNextData("
            r2.append(r0)
            int r0 = r6.size()
            r2.append(r0)
            java.lang.String r0 = "); "
            r2.append(r0)
            java.lang.String r0 = "mOperations: ["
            r2.append(r0)
            java.util.List r11 = r3.A05
            int r9 = r11.size()
            r8 = 0
            r1 = 0
        L_0x00aa:
            java.lang.String r7 = "], "
            if (r1 >= r9) goto L_0x0102
            java.lang.Object r10 = r11.get(r1)
            X.7h3 r10 = (X.C337877h3) r10
            java.lang.String r0 = "[type="
            r2.append(r0)
            int r0 = r10.A02
            r2.append(r0)
            java.lang.String r0 = ", index="
            r2.append(r0)
            int r0 = r10.A00
            r2.append(r0)
            java.lang.String r0 = ", toIndex="
            r2.append(r0)
            int r0 = r10.A01
            r2.append(r0)
            java.util.List r0 = r10.A03
            if (r0 == 0) goto L_0x00e4
            java.lang.String r0 = ", count="
            r2.append(r0)
            java.util.List r0 = r10.A03
            int r0 = r0.size()
            r2.append(r0)
        L_0x00e4:
            r2.append(r7)
            int r1 = r1 + 1
            goto L_0x00aa
        L_0x00ea:
            java.lang.String r0 = "null"
            goto L_0x0043
        L_0x00ee:
            X.7ga r0 = r27.A0E()
            X.7gs r0 = (X.C337767gs) r0
            X.2Sg r1 = r0.A02
            goto L_0x0018
        L_0x00f8:
            java.util.List r5 = r0.A04
            java.lang.Boolean r3 = r0.A03
            goto L_0x000f
        L_0x00fe:
            java.util.List r6 = r1.A04
            goto L_0x000c
        L_0x0102:
            java.lang.String r0 = "]; "
            r2.append(r0)
            java.lang.String r0 = "mNextData: ["
            r2.append(r0)
            int r1 = r6.size()
        L_0x0110:
            if (r8 >= r1) goto L_0x0124
            java.lang.String r0 = "["
            r2.append(r0)
            java.lang.Object r0 = r6.get(r8)
            r2.append(r0)
            r2.append(r7)
            int r8 = r8 + 1
            goto L_0x0110
        L_0x0124:
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.Integer r14 = X.AnonymousClass05K.A01
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "RecyclerBinderUpdateCallback:InconsistentSize"
            X.2W6.A00(r0, r14, r1)
            r11.clear()
            java.util.List r13 = r3.A03
            r13.clear()
            r24.clear()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r2 = 0
        L_0x0145:
            int r1 = r3.A00
            r12 = 0
            if (r2 >= r1) goto L_0x015b
            java.util.List r0 = r3.A07
            java.lang.Object r1 = r0.get(r2)
            X.2TP r0 = new X.2TP
            r0.<init>(r1, r12)
            r7.add(r0)
            int r2 = r2 + 1
            goto L_0x0145
        L_0x015b:
            r13.addAll(r7)
            r21 = 2
            X.7h3 r0 = new X.7h3
            r20 = r7
            r22 = r4
            r23 = r1
            r18 = r0
            r19 = r12
            r18.<init>(r19, r20, r21, r22, r23)
            r11.add(r0)
            int r15 = r6.size()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r15)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r15)
            r8 = 0
        L_0x0181:
            if (r8 >= r15) goto L_0x0251
            java.lang.Object r7 = r6.get(r8)
            if (r16 == 0) goto L_0x0194
            if (r7 != 0) goto L_0x01d0
            java.lang.String r0 = ""
        L_0x018d:
            java.lang.String r0 = X.002.A0R(r5, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0194:
            X.7gw r0 = r3.A01
            X.2Sg r1 = r0.A00
            X.7h4 r0 = new X.7h4
            r0.<init>()
            r0.A00 = r8
            r0.A01 = r7
            java.lang.Object r1 = r1.A00(r0)
            X.7hq r1 = (X.C338367hq) r1
            if (r1 != 0) goto L_0x01b4
            java.lang.String r1 = "DataDiffSection:RenderInfoNull"
            java.lang.String r0 = "RenderInfo has returned null. Returning ComponentRenderInfo.createEmpty() as default."
            X.2W6.A00(r1, r14, r0)
            X.7ho r1 = X.C338347ho.A00()
        L_0x01b4:
            if (r16 == 0) goto L_0x01b9
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x01b9:
            X.7h2 r0 = new X.7h2
            r0.<init>()
            r0.A00 = r1
            r0.A01 = r4
            r10.add(r8, r0)
            X.2TP r0 = new X.2TP
            r0.<init>(r12, r7)
            r9.add(r0)
            int r8 = r8 + 1
            goto L_0x0181
        L_0x01d0:
            java.lang.String r2 = "<cls>"
            java.lang.Class r0 = r7.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "</cls>"
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            goto L_0x018d
        L_0x01e1:
            java.util.List r9 = r3.A06
            int r8 = r9.size()
        L_0x01e7:
            if (r4 >= r8) goto L_0x026b
            java.lang.Object r0 = r9.get(r4)
            X.7h2 r0 = (X.C337867h2) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x023d
            java.lang.Object r7 = r6.get(r4)
            if (r16 == 0) goto L_0x0204
            if (r7 != 0) goto L_0x0240
            java.lang.String r0 = ""
        L_0x01fd:
            java.lang.String r0 = X.002.A0R(r5, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0204:
            java.lang.Object r10 = r9.get(r4)
            X.7h2 r10 = (X.C337867h2) r10
            X.7gw r0 = r3.A01
            X.2Sg r1 = r0.A00
            X.7h4 r0 = new X.7h4
            r0.<init>()
            r0.A00 = r4
            r0.A01 = r7
            java.lang.Object r0 = r1.A00(r0)
            X.7hq r0 = (X.C338367hq) r0
            if (r0 != 0) goto L_0x022c
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r1 = "DataDiffSection:RenderInfoNull"
            java.lang.String r0 = "RenderInfo has returned null. Returning ComponentRenderInfo.createEmpty() as default."
            X.2W6.A00(r1, r2, r0)
            X.7ho r0 = X.C338347ho.A00()
        L_0x022c:
            r10.A00 = r0
            if (r16 == 0) goto L_0x0233
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x0233:
            java.util.List r0 = r3.A03
            java.lang.Object r0 = r0.get(r4)
            X.2TP r0 = (X.2TP) r0
            r0.A00 = r7
        L_0x023d:
            int r4 = r4 + 1
            goto L_0x01e7
        L_0x0240:
            java.lang.String r2 = "<cls>"
            java.lang.Class r0 = r7.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "</cls>"
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            goto L_0x01fd
        L_0x0251:
            r0 = r24
            r0.addAll(r10)
            r13.addAll(r9)
            r23 = -1
            X.7h3 r0 = new X.7h3
            r19 = r10
            r20 = r9
            r21 = r4
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23)
            r11.add(r0)
        L_0x026b:
            if (r16 == 0) goto L_0x0272
            java.lang.String r0 = "executeOperations"
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0272:
            X.7gx r4 = r3.A02
            java.util.List r0 = r3.A05
            r15 = r0
            int r5 = r0.size()
            r3 = 0
            r2 = 0
        L_0x027d:
            if (r2 >= r5) goto L_0x04c3
            java.lang.Object r8 = r15.get(r2)
            X.7h3 r8 = (X.C337877h3) r8
            java.util.List r11 = r8.A03
            java.util.List r7 = r8.A04
            if (r11 != 0) goto L_0x04bd
            r6 = 1
        L_0x028c:
            int r1 = r8.A02
            r0 = r17
            if (r1 == 0) goto L_0x0400
            if (r1 == r0) goto L_0x031d
            r0 = 2
            if (r1 == r0) goto L_0x02c9
            X.7gv r1 = r4.A00
            int r9 = r8.A00
            int r6 = r8.A01
            java.lang.Object r0 = r7.get(r3)
            X.2TP r0 = (X.2TP) r0
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x02c6
            java.util.List r21 = java.util.Collections.singletonList(r0)
        L_0x02ab:
            r19 = 0
            X.7h5 r0 = new X.7h5
            r20 = r19
            r22 = r21
            r23 = r3
            r24 = r9
            r25 = r6
            r26 = r17
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x02c0:
            r1.A01(r0)
            int r2 = r2 + 1
            goto L_0x027d
        L_0x02c6:
            r21 = 0
            goto L_0x02ab
        L_0x02c9:
            int r6 = r8.A01
            X.7gv r1 = r4.A00
            r0 = r17
            int r9 = r8.A00
            if (r6 != r0) goto L_0x02e6
            java.lang.Object r0 = r7.get(r3)
            X.2TP r0 = (X.2TP) r0
            java.lang.Object r8 = r0.A01
            X.7ho r7 = X.C338347ho.A00()
            r6 = 3
            r0 = 0
            X.7h5 r0 = X.C337897h5.A00(r7, r8, r0, r6, r9)
            goto L_0x02c0
        L_0x02e6:
            int r0 = r7.size()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L_0x02f3:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0305
            java.lang.Object r0 = r7.next()
            X.2TP r0 = (X.2TP) r0
            java.lang.Object r0 = r0.A01
            r8.add(r0)
            goto L_0x02f3
        L_0x0305:
            java.util.List r20 = X.C337897h5.A08
            r19 = 0
            r23 = -3
            r25 = -1
            X.7h5 r0 = new X.7h5
            r21 = r8
            r22 = r19
            r24 = r9
            r26 = r6
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x02c0
        L_0x031d:
            if (r6 != r0) goto L_0x0353
            X.7gv r1 = r4.A00
            int r10 = r8.A00
            java.lang.Object r0 = r11.get(r3)
            X.7h2 r0 = (X.C337867h2) r0
            X.7hq r11 = r0.A00
            r0 = r27
            X.2VJ r0 = r0.A07
            if (r0 != 0) goto L_0x034e
            r9 = 0
        L_0x0332:
            java.lang.Object r0 = r7.get(r3)
            X.2TP r0 = (X.2TP) r0
            java.lang.Object r8 = r0.A01
            java.lang.Object r0 = r7.get(r3)
            X.2TP r0 = (X.2TP) r0
            java.lang.Object r7 = r0.A00
            X.7hu r6 = new X.7hu
            r6.<init>(r9, r11)
            r0 = 2
            X.7h5 r0 = X.C337897h5.A00(r6, r8, r7, r0, r10)
            goto L_0x02c0
        L_0x034e:
            X.2VJ r9 = X.AnonymousClass3XP.A00(r0)
            goto L_0x0332
        L_0x0353:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r6)
            java.util.Iterator r11 = r11.iterator()
            r10 = 0
        L_0x035d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0374
            java.lang.Object r0 = r11.next()
            X.7h2 r0 = (X.C337867h2) r0
            int r1 = r10 + 1
            if (r10 == r6) goto L_0x0374
            X.7hq r0 = r0.A00
            r9.add(r0)
            r10 = r1
            goto L_0x035d
        L_0x0374:
            X.7gv r1 = r4.A00
            int r0 = r8.A00
            r14 = r0
            r0 = r27
            X.2VJ r0 = r0.A07
            if (r0 != 0) goto L_0x039f
            r13 = 0
        L_0x0380:
            int r0 = r7.size()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            java.util.Iterator r8 = r7.iterator()
        L_0x038d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x03a4
            java.lang.Object r0 = r8.next()
            X.2TP r0 = (X.2TP) r0
            java.lang.Object r0 = r0.A01
            r10.add(r0)
            goto L_0x038d
        L_0x039f:
            X.2VJ r13 = X.AnonymousClass3XP.A00(r0)
            goto L_0x0380
        L_0x03a4:
            int r0 = r7.size()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L_0x03b1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x03c3
            java.lang.Object r0 = r7.next()
            X.2TP r0 = (X.2TP) r0
            java.lang.Object r0 = r0.A00
            r8.add(r0)
            goto L_0x03b1
        L_0x03c3:
            if (r13 == 0) goto L_0x03e7
            int r0 = r9.size()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r0)
            r11 = 0
        L_0x03cf:
            int r0 = r9.size()
            if (r11 >= r0) goto L_0x03e6
            java.lang.Object r7 = r9.get(r11)
            X.7hq r7 = (X.C338367hq) r7
            X.7hu r0 = new X.7hu
            r0.<init>(r13, r7)
            r12.add(r0)
            int r11 = r11 + 1
            goto L_0x03cf
        L_0x03e6:
            r9 = r12
        L_0x03e7:
            r23 = -2
            r19 = 0
            r25 = -1
            X.7h5 r0 = new X.7h5
            r20 = r9
            r21 = r10
            r22 = r8
            r24 = r14
            r26 = r6
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x02c0
        L_0x0400:
            if (r6 != r0) goto L_0x0430
            X.7gv r1 = r4.A00
            int r10 = r8.A00
            java.lang.Object r0 = r11.get(r3)
            X.7h2 r0 = (X.C337867h2) r0
            X.7hq r9 = r0.A00
            r0 = r27
            X.2VJ r0 = r0.A07
            if (r0 != 0) goto L_0x042b
            r6 = 0
        L_0x0415:
            java.lang.Object r0 = r7.get(r3)
            X.2TP r0 = (X.2TP) r0
            java.lang.Object r8 = r0.A00
            X.7hu r7 = new X.7hu
            r7.<init>(r6, r9)
            r6 = 0
            r0 = r17
            X.7h5 r0 = X.C337897h5.A00(r7, r6, r8, r0, r10)
            goto L_0x02c0
        L_0x042b:
            X.2VJ r6 = X.AnonymousClass3XP.A00(r0)
            goto L_0x0415
        L_0x0430:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r6)
            java.util.Iterator r11 = r11.iterator()
            r10 = 0
        L_0x043a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0451
            java.lang.Object r0 = r11.next()
            X.7h2 r0 = (X.C337867h2) r0
            int r1 = r10 + 1
            if (r10 == r6) goto L_0x0451
            X.7hq r0 = r0.A00
            r9.add(r0)
            r10 = r1
            goto L_0x043a
        L_0x0451:
            X.7gv r1 = r4.A00
            int r8 = r8.A00
            r0 = r27
            X.2VJ r0 = r0.A07
            if (r0 != 0) goto L_0x047b
            r13 = 0
        L_0x045c:
            int r0 = r7.size()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            java.util.Iterator r7 = r7.iterator()
        L_0x0469:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0480
            java.lang.Object r0 = r7.next()
            X.2TP r0 = (X.2TP) r0
            java.lang.Object r0 = r0.A00
            r10.add(r0)
            goto L_0x0469
        L_0x047b:
            X.2VJ r13 = X.AnonymousClass3XP.A00(r0)
            goto L_0x045c
        L_0x0480:
            if (r13 == 0) goto L_0x04a4
            int r0 = r9.size()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r0)
            r11 = 0
        L_0x048c:
            int r0 = r9.size()
            if (r11 >= r0) goto L_0x04a3
            java.lang.Object r7 = r9.get(r11)
            X.7hq r7 = (X.C338367hq) r7
            X.7hu r0 = new X.7hu
            r0.<init>(r13, r7)
            r12.add(r0)
            int r11 = r11 + 1
            goto L_0x048c
        L_0x04a3:
            r9 = r12
        L_0x04a4:
            r19 = 0
            r23 = -1
            X.7h5 r0 = new X.7h5
            r20 = r9
            r21 = r19
            r22 = r10
            r24 = r8
            r25 = r23
            r26 = r6
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x02c0
        L_0x04bd:
            int r6 = r11.size()
            goto L_0x028c
        L_0x04c3:
            if (r16 == 0) goto L_0x04c8
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x04c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337767gs.A03(X.7gv, X.7ga, X.7ga, X.7gX, X.7gX, X.7gX):void");
    }
}
