package X;

import androidx.compose.runtime.Recomposer;
import java.util.List;
import java.util.Set;

/* renamed from: X.5tm  reason: invalid class name and case insensitive filesystem */
public final class C298635tm extends 0Yg implements 0sP {
    public final /* synthetic */ 0vq A00;
    public final /* synthetic */ 0vq A01;
    public final /* synthetic */ 0vq A02;
    public final /* synthetic */ 0vq A03;
    public final /* synthetic */ Recomposer A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ Set A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C298635tm(0vq r2, 0vq r3, 0vq r4, 0vq r5, Recomposer recomposer, List list, List list2, List list3, Set set) {
        super(1);
        this.A04 = recomposer;
        this.A01 = r2;
        this.A00 = r3;
        this.A07 = list;
        this.A06 = list2;
        this.A03 = r4;
        this.A05 = list3;
        this.A02 = r5;
        this.A08 = set;
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r33) {
        /*
            r32 = this;
            r0 = r33
            java.lang.Number r0 = (java.lang.Number) r0
            long r10 = r0.longValue()
            r6 = r32
            androidx.compose.runtime.Recomposer r4 = r6.A04
            java.lang.Object r5 = r4.A0D
            monitor-enter(r5)
            boolean r0 = androidx.compose.runtime.Recomposer.A05(r4)     // Catch:{ all -> 0x0651 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0068
            java.lang.String r1 = "Recomposer:animation"
            r0 = 1854082573(0x6e830e0d, float:2.0279761E28)
            X.0fg.A01(r1, r0)
            X.5Pi r1 = r4.A0A     // Catch:{ all -> 0x0649 }
            java.lang.Object r9 = r1.A04     // Catch:{ all -> 0x0649 }
            monitor-enter(r9)     // Catch:{ all -> 0x0649 }
            java.util.List r8 = r1.A01     // Catch:{ all -> 0x005e }
            java.util.List r0 = r1.A02     // Catch:{ all -> 0x005e }
            r1.A01 = r0     // Catch:{ all -> 0x005e }
            r1.A02 = r8     // Catch:{ all -> 0x005e }
            X.4dV r0 = r1.A03     // Catch:{ all -> 0x005e }
            r7 = 0
            r0.set(r7)     // Catch:{ all -> 0x005e }
            int r3 = r8.size()     // Catch:{ all -> 0x005e }
        L_0x0035:
            if (r7 >= r3) goto L_0x0056
            java.lang.Object r0 = r8.get(r7)     // Catch:{ all -> 0x005e }
            X.64u r0 = (X.C3026664u) r0     // Catch:{ all -> 0x005e }
            X.4D7 r2 = r0.A00     // Catch:{ all -> 0x005e }
            X.0sP r1 = r0.A01     // Catch:{ all -> 0x004a }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r1.invoke(r0)     // Catch:{ all -> 0x004a }
            goto L_0x0050
        L_0x004a:
            r1 = move-exception
            X.0eQ r0 = new X.0eQ     // Catch:{ all -> 0x005e }
            r0.<init>(r1)     // Catch:{ all -> 0x005e }
        L_0x0050:
            r2.resumeWith(r0)     // Catch:{ all -> 0x005e }
            int r7 = r7 + 1
            goto L_0x0035
        L_0x0056:
            r8.clear()     // Catch:{ all -> 0x005e }
            monitor-exit(r9)     // Catch:{ all -> 0x0649 }
            X.AnonymousClass5PH.A05()     // Catch:{ all -> 0x0649 }
            goto L_0x0062
        L_0x005e:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0649 }
            goto L_0x0648
        L_0x0062:
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.0fg.A00(r0)
        L_0x0068:
            java.lang.String r1 = "Recomposer:recompose"
            X.0vq r0 = r6.A01
            r31 = r0
            X.0vq r0 = r6.A00
            r30 = r0
            java.util.List r0 = r6.A07
            r29 = r0
            java.util.List r0 = r6.A06
            r28 = r0
            X.0vq r3 = r6.A03
            java.util.List r0 = r6.A05
            r27 = r0
            X.0vq r2 = r6.A02
            java.util.Set r0 = r6.A08
            r26 = r0
            r0 = 1854082573(0x6e830e0d, float:2.0279761E28)
            X.0fg.A01(r1, r0)
            r1 = 0
            androidx.compose.runtime.Recomposer.A07(r4)     // Catch:{ all -> 0x0649 }
            monitor-enter(r5)     // Catch:{ all -> 0x0649 }
            X.5Pl r6 = r4.A0C     // Catch:{ all -> 0x0642 }
            int r10 = r6.A00     // Catch:{ all -> 0x0642 }
            if (r10 <= 0) goto L_0x00a7
            java.lang.Object[] r9 = r6.A02     // Catch:{ all -> 0x0642 }
            r8 = 0
        L_0x009a:
            r7 = r9[r8]     // Catch:{ all -> 0x0642 }
            X.5Pj r7 = (X.C285025Pj) r7     // Catch:{ all -> 0x0642 }
            r0 = r29
            r0.add(r7)     // Catch:{ all -> 0x0642 }
            int r8 = r8 + 1
            if (r8 < r10) goto L_0x009a
        L_0x00a7:
            r6.A01()     // Catch:{ all -> 0x0642 }
            monitor-exit(r5)     // Catch:{ all -> 0x0649 }
            r31.A05()     // Catch:{ all -> 0x0649 }
            r30.A05()     // Catch:{ all -> 0x0649 }
        L_0x00b1:
            boolean r0 = r29.isEmpty()     // Catch:{ all -> 0x0649 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00d2
            boolean r0 = r28.isEmpty()     // Catch:{ all -> 0x0649 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00d2
            boolean r0 = r27.isEmpty()     // Catch:{ all -> 0x0649 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0492
            long r6 = r4.A00     // Catch:{ all -> 0x0649 }
            r8 = 1
            long r6 = r6 + r8
            r4.A00 = r6     // Catch:{ all -> 0x0649 }
            goto L_0x044a
        L_0x00d2:
            int r17 = r29.size()     // Catch:{ Exception -> 0x061e }
            r8 = 0
        L_0x00d7:
            r0 = r17
            if (r8 >= r0) goto L_0x0194
            r0 = r29
            java.lang.Object r10 = r0.get(r8)     // Catch:{ Exception -> 0x061e }
            X.5Pj r10 = (X.C285025Pj) r10     // Catch:{ Exception -> 0x061e }
            r12 = r10
            X.5Wn r12 = (X.AnonymousClass5Wn) r12     // Catch:{ Exception -> 0x061e }
            X.5Wx r11 = r12.A05     // Catch:{ Exception -> 0x061e }
            boolean r0 = r11.A0L     // Catch:{ Exception -> 0x061e }
            if (r0 != 0) goto L_0x00fb
            boolean r0 = r12.A02     // Catch:{ Exception -> 0x061e }
            if (r0 != 0) goto L_0x00fb
            java.util.Set r0 = r4.A04     // Catch:{ Exception -> 0x061e }
            r9 = 1
            if (r0 == 0) goto L_0x0102
            boolean r0 = r0.contains(r10)     // Catch:{ Exception -> 0x061e }
            if (r0 != r9) goto L_0x0102
        L_0x00fb:
            r0 = r30
            r0.A09(r10)     // Catch:{ Exception -> 0x061e }
            goto L_0x0190
        L_0x0102:
            r0 = 35
            X.9L6 r14 = new X.9L6     // Catch:{ Exception -> 0x061e }
            r14.<init>(r10, r0)     // Catch:{ Exception -> 0x061e }
            r13 = 6
            X.9Ly r7 = new X.9Ly     // Catch:{ Exception -> 0x061e }
            r0 = r31
            r7.<init>((int) r13, (java.lang.Object) r0, (java.lang.Object) r10)     // Catch:{ Exception -> 0x061e }
            X.5PD r16 = X.AnonymousClass5PH.A00(r14, r7)     // Catch:{ Exception -> 0x061e }
            X.5P5 r13 = X.AnonymousClass5P3.A05     // Catch:{ all -> 0x05c6 }
            java.lang.Object r7 = r13.A00()     // Catch:{ all -> 0x05c6 }
            androidx.compose.runtime.snapshots.Snapshot r7 = (androidx.compose.runtime.snapshots.Snapshot) r7     // Catch:{ all -> 0x05c6 }
            r0 = r16
            r13.A01(r0)     // Catch:{ all -> 0x05c6 }
            r0 = r31
            int r0 = r0.A01     // Catch:{ all -> 0x05c1 }
            if (r0 == 0) goto L_0x0145
            r15 = 2
            X.9M0 r14 = new X.9M0     // Catch:{ all -> 0x05c1 }
            r0 = r31
            r14.<init>(r15, r10, r0)     // Catch:{ all -> 0x05c1 }
            boolean r0 = r11.A0L     // Catch:{ all -> 0x05c1 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x013d
            java.lang.String r0 = "Preparing a composition while composing is not supported"
            X.AnonymousClass5XN.A03(r0)     // Catch:{ all -> 0x05c1 }
            goto L_0x058e
        L_0x013d:
            r11.A0L = r9     // Catch:{ all -> 0x05c1 }
            r9 = 0
            r14.invoke()     // Catch:{ all -> 0x0593 }
            r11.A0L = r9     // Catch:{ all -> 0x05c1 }
        L_0x0145:
            java.lang.Object r9 = r12.A0D     // Catch:{ all -> 0x05c1 }
            monitor-enter(r9)     // Catch:{ all -> 0x05c1 }
            X.AnonymousClass5Wn.A01(r12)     // Catch:{ all -> 0x05be }
            X.5Wr r14 = r12.A00     // Catch:{ all -> 0x05a5 }
            X.5Wr r0 = new X.5Wr     // Catch:{ all -> 0x05a5 }
            r0.<init>()     // Catch:{ all -> 0x05a5 }
            r12.A00 = r0     // Catch:{ all -> 0x05a5 }
            X.5Ws r15 = r11.A0E     // Catch:{ Exception -> 0x05a1 }
            X.5Wu r0 = r15.A00     // Catch:{ Exception -> 0x05a1 }
            int r0 = r0.A02     // Catch:{ Exception -> 0x05a1 }
            if (r0 != 0) goto L_0x0597
            X.0vr r0 = r14.A00     // Catch:{ Exception -> 0x05a1 }
            int r0 = r0.A01     // Catch:{ Exception -> 0x05a1 }
            if (r0 > 0) goto L_0x016e
            java.util.List r0 = r11.A0c     // Catch:{ Exception -> 0x05a1 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x05a1 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x016e
            r0 = 0
            goto L_0x017b
        L_0x016e:
            X.C286565Wx.A0J(r11, r14, r1)     // Catch:{ Exception -> 0x05a1 }
            X.5Wu r0 = r15.A00     // Catch:{ Exception -> 0x05a1 }
            int r11 = r0.A02     // Catch:{ Exception -> 0x05a1 }
            r0 = 0
            if (r11 == 0) goto L_0x0179
            r0 = 1
        L_0x0179:
            if (r0 != 0) goto L_0x017e
        L_0x017b:
            X.AnonymousClass5Wn.A02(r12)     // Catch:{ Exception -> 0x05a1 }
        L_0x017e:
            monitor-exit(r9)     // Catch:{ all -> 0x05c1 }
            r13.A01(r7)     // Catch:{ all -> 0x05c6 }
            androidx.compose.runtime.Recomposer.A04(r16)     // Catch:{ Exception -> 0x061e }
            if (r0 == 0) goto L_0x00fb
            if (r10 == 0) goto L_0x00fb
            r0 = r27
            r0.add(r10)     // Catch:{ Exception -> 0x061e }
            goto L_0x00fb
        L_0x0190:
            int r8 = r8 + 1
            goto L_0x00d7
        L_0x0194:
            r29.clear()     // Catch:{ all -> 0x0649 }
            r0 = r31
            int r0 = r0.A01     // Catch:{ all -> 0x0649 }
            if (r0 != 0) goto L_0x01a5
            int r7 = r6.A00     // Catch:{ all -> 0x0649 }
            r0 = 0
            if (r7 == 0) goto L_0x01a3
            r0 = 1
        L_0x01a3:
            if (r0 == 0) goto L_0x029b
        L_0x01a5:
            monitor-enter(r5)     // Catch:{ all -> 0x0649 }
            java.util.List r25 = androidx.compose.runtime.Recomposer.A00(r4)     // Catch:{ all -> 0x0642 }
            int r24 = r25.size()     // Catch:{ all -> 0x0642 }
            r12 = 0
        L_0x01af:
            r0 = r24
            if (r12 >= r0) goto L_0x025f
            r0 = r25
            java.lang.Object r11 = r0.get(r12)     // Catch:{ all -> 0x0642 }
            X.5Pj r11 = (X.C285025Pj) r11     // Catch:{ all -> 0x0642 }
            r0 = r30
            boolean r0 = r0.A04(r11)     // Catch:{ all -> 0x0642 }
            if (r0 != 0) goto L_0x025b
            r13 = r11
            X.5Wn r13 = (X.AnonymousClass5Wn) r13     // Catch:{ all -> 0x0642 }
            r0 = r26
            boolean r0 = r0 instanceof X.C285135Pw     // Catch:{ all -> 0x0642 }
            if (r0 == 0) goto L_0x01e1
            r0 = r26
            X.5Pw r0 = (X.C285135Pw) r0     // Catch:{ all -> 0x0642 }
            X.01p r7 = r0.A00     // Catch:{ all -> 0x0642 }
            java.lang.Object[] r0 = r7.A03     // Catch:{ all -> 0x0642 }
            r23 = r0
            long[] r0 = r7.A02     // Catch:{ all -> 0x0642 }
            r22 = r0
            int r0 = r0.length     // Catch:{ all -> 0x0642 }
            int r15 = r0 + -2
            if (r15 < 0) goto L_0x025b
            r14 = 0
            goto L_0x0246
        L_0x01e1:
            java.util.Iterator r8 = r26.iterator()     // Catch:{ all -> 0x0642 }
        L_0x01e5:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0642 }
            if (r0 == 0) goto L_0x025b
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x0642 }
            X.5Wr r0 = r13.A0C     // Catch:{ all -> 0x0642 }
            X.0vr r0 = r0.A00     // Catch:{ all -> 0x0642 }
            boolean r0 = r0.A04(r7)     // Catch:{ all -> 0x0642 }
            if (r0 != 0) goto L_0x021d
            X.5Wr r0 = r13.A0B     // Catch:{ all -> 0x0642 }
            X.0vr r0 = r0.A00     // Catch:{ all -> 0x0642 }
            boolean r0 = r0.A04(r7)     // Catch:{ all -> 0x0642 }
            if (r0 == 0) goto L_0x01e5
            goto L_0x021d
        L_0x0204:
            int r0 = r14 << 3
            int r0 = r0 + r9
            r10 = r23[r0]     // Catch:{ all -> 0x0642 }
            X.5Wr r0 = r13.A0C     // Catch:{ all -> 0x0642 }
            X.0vr r0 = r0.A00     // Catch:{ all -> 0x0642 }
            boolean r0 = r0.A04(r10)     // Catch:{ all -> 0x0642 }
            if (r0 != 0) goto L_0x021d
            X.5Wr r0 = r13.A0B     // Catch:{ all -> 0x0642 }
            X.0vr r0 = r0.A00     // Catch:{ all -> 0x0642 }
            boolean r0 = r0.A04(r10)     // Catch:{ all -> 0x0642 }
            if (r0 == 0) goto L_0x0223
        L_0x021d:
            r0 = r29
            r0.add(r11)     // Catch:{ all -> 0x0642 }
            goto L_0x025b
        L_0x0223:
            long r20 = r20 >> r8
            int r9 = r9 + 1
            goto L_0x0233
        L_0x0228:
            int r0 = r14 - r15
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            r8 = 8
            int r7 = 8 - r0
            r9 = 0
        L_0x0233:
            if (r9 >= r7) goto L_0x0240
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r18 & r20
            r16 = 128(0x80, double:6.32E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0223
            goto L_0x0204
        L_0x0240:
            if (r7 != r8) goto L_0x025b
        L_0x0242:
            if (r14 == r15) goto L_0x025b
            int r14 = r14 + 1
        L_0x0246:
            r20 = r22[r14]     // Catch:{ all -> 0x0642 }
            r9 = -1
            long r9 = r9 ^ r20
            r0 = 7
            long r9 = r9 << r0
            long r9 = r9 & r20
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r7
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0242
            goto L_0x0228
        L_0x025b:
            int r12 = r12 + 1
            goto L_0x01af
        L_0x025f:
            int r9 = r6.A00     // Catch:{ all -> 0x0642 }
            r10 = 0
            r11 = 0
        L_0x0263:
            if (r10 >= r9) goto L_0x0291
            java.lang.Object[] r0 = r6.A02     // Catch:{ all -> 0x0642 }
            r7 = r0[r10]     // Catch:{ all -> 0x0642 }
            X.5Pj r7 = (X.C285025Pj) r7     // Catch:{ all -> 0x0642 }
            r0 = r30
            boolean r0 = r0.A04(r7)     // Catch:{ all -> 0x0642 }
            if (r0 != 0) goto L_0x0281
            r0 = r29
            boolean r0 = r0.contains(r7)     // Catch:{ all -> 0x0642 }
            if (r0 != 0) goto L_0x0281
            r0 = r29
            r0.add(r7)     // Catch:{ all -> 0x0642 }
            goto L_0x028c
        L_0x0281:
            if (r11 <= 0) goto L_0x028e
            java.lang.Object[] r8 = r6.A02     // Catch:{ all -> 0x0642 }
            int r7 = r10 - r11
            r0 = r8[r10]     // Catch:{ all -> 0x0642 }
            r8[r7] = r0     // Catch:{ all -> 0x0642 }
            goto L_0x028e
        L_0x028c:
            int r11 = r11 + 1
        L_0x028e:
            int r10 = r10 + 1
            goto L_0x0263
        L_0x0291:
            java.lang.Object[] r7 = r6.A02     // Catch:{ all -> 0x0642 }
            int r0 = r9 - r11
            X.0Yw.A0U(r7, r0, r9)     // Catch:{ all -> 0x0642 }
            r6.A00 = r0     // Catch:{ all -> 0x0642 }
            monitor-exit(r5)     // Catch:{ all -> 0x0649 }
        L_0x029b:
            boolean r0 = r29.isEmpty()     // Catch:{ all -> 0x0649 }
            if (r0 == 0) goto L_0x00b1
        L_0x02a1:
            r28.clear()     // Catch:{ Exception -> 0x060a }
            monitor-enter(r5)     // Catch:{ Exception -> 0x060a }
            java.util.List r0 = r4.A0F     // Catch:{ all -> 0x0607 }
            r21 = r0
            r8 = 0
            int r7 = r21.size()     // Catch:{ all -> 0x0607 }
        L_0x02ae:
            if (r8 >= r7) goto L_0x02bd
            r0 = r21
            r0.get(r8)     // Catch:{ all -> 0x0607 }
            r0 = r28
            r0.add(r1)     // Catch:{ all -> 0x0607 }
            int r8 = r8 + 1
            goto L_0x02ae
        L_0x02bd:
            r21.clear()     // Catch:{ all -> 0x0607 }
            monitor-exit(r5)     // Catch:{ Exception -> 0x060a }
            boolean r0 = r28.isEmpty()     // Catch:{ Exception -> 0x060a }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b1
            int r7 = r28.size()     // Catch:{ Exception -> 0x060a }
            java.util.HashMap r19 = new java.util.HashMap     // Catch:{ Exception -> 0x060a }
            r0 = r19
            r0.<init>(r7)     // Catch:{ Exception -> 0x060a }
            int r0 = r28.size()     // Catch:{ Exception -> 0x060a }
            r9 = 0
            if (r9 >= r0) goto L_0x02e8
            r0 = r28
            r0.get(r9)     // Catch:{ Exception -> 0x060a }
            java.lang.String r5 = "getComposition$runtime_release"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x060a }
            r0.<init>(r5)     // Catch:{ Exception -> 0x060a }
            throw r0     // Catch:{ Exception -> 0x060a }
        L_0x02e8:
            java.util.Set r0 = r19.entrySet()     // Catch:{ Exception -> 0x060a }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ Exception -> 0x060a }
        L_0x02f0:
            boolean r0 = r18.hasNext()     // Catch:{ Exception -> 0x060a }
            if (r0 == 0) goto L_0x042b
            java.lang.Object r0 = r18.next()     // Catch:{ Exception -> 0x060a }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x060a }
            java.lang.Object r13 = r0.getKey()     // Catch:{ Exception -> 0x060a }
            X.5Pj r13 = (X.C285025Pj) r13     // Catch:{ Exception -> 0x060a }
            java.lang.Object r11 = r0.getValue()     // Catch:{ Exception -> 0x060a }
            java.util.List r11 = (java.util.List) r11     // Catch:{ Exception -> 0x060a }
            r0 = r13
            X.5Wn r0 = (X.AnonymousClass5Wn) r0     // Catch:{ Exception -> 0x060a }
            r20 = r0
            X.5Wx r10 = r0.A05     // Catch:{ Exception -> 0x060a }
            boolean r0 = r10.A0L     // Catch:{ Exception -> 0x060a }
            r0 = r0 ^ 1
            X.AnonymousClass5XN.A06(r0)     // Catch:{ Exception -> 0x060a }
            r0 = 35
            X.9L6 r12 = new X.9L6     // Catch:{ Exception -> 0x060a }
            r12.<init>(r13, r0)     // Catch:{ Exception -> 0x060a }
            r8 = 6
            X.9Ly r7 = new X.9Ly     // Catch:{ Exception -> 0x060a }
            r0 = r31
            r7.<init>((int) r8, (java.lang.Object) r0, (java.lang.Object) r13)     // Catch:{ Exception -> 0x060a }
            X.5PD r17 = X.AnonymousClass5PH.A00(r12, r7)     // Catch:{ Exception -> 0x060a }
            X.5P5 r8 = X.AnonymousClass5P3.A05     // Catch:{ all -> 0x0602 }
            java.lang.Object r7 = r8.A00()     // Catch:{ all -> 0x0602 }
            androidx.compose.runtime.snapshots.Snapshot r7 = (androidx.compose.runtime.snapshots.Snapshot) r7     // Catch:{ all -> 0x0602 }
            r0 = r17
            r8.A01(r0)     // Catch:{ all -> 0x0602 }
            monitor-enter(r5)     // Catch:{ all -> 0x05fd }
            int r0 = r11.size()     // Catch:{ all -> 0x05f7 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x05f7 }
            r14.<init>(r0)     // Catch:{ all -> 0x05f7 }
            int r16 = r11.size()     // Catch:{ all -> 0x05f7 }
            r12 = 0
        L_0x0345:
            r0 = r16
            if (r12 >= r0) goto L_0x0377
            r11.get(r12)     // Catch:{ all -> 0x05f7 }
            java.util.Map r15 = r4.A0I     // Catch:{ all -> 0x05f7 }
            java.lang.Object r0 = r15.get(r1)     // Catch:{ all -> 0x05f7 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x05f7 }
            if (r0 == 0) goto L_0x0372
            boolean r13 = r0.isEmpty()     // Catch:{ all -> 0x05f7 }
            if (r13 != 0) goto L_0x05cb
            java.lang.Object r13 = r0.remove(r9)     // Catch:{ all -> 0x05f7 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x05f7 }
            if (r0 == 0) goto L_0x0369
            r15.remove(r1)     // Catch:{ all -> 0x05f7 }
        L_0x0369:
            X.0eP r0 = new X.0eP     // Catch:{ all -> 0x05f7 }
            r0.<init>(r1, r13)     // Catch:{ all -> 0x05f7 }
            r14.add(r0)     // Catch:{ all -> 0x05f7 }
            goto L_0x0374
        L_0x0372:
            r13 = 0
            goto L_0x0369
        L_0x0374:
            int r12 = r12 + 1
            goto L_0x0345
        L_0x0377:
            monitor-exit(r5)     // Catch:{ all -> 0x05fd }
            int r12 = r14.size()     // Catch:{ all -> 0x05fd }
            r11 = 0
        L_0x037d:
            if (r11 >= r12) goto L_0x03df
            java.lang.Object r0 = r14.get(r11)     // Catch:{ all -> 0x05fd }
            X.0eP r0 = (X.0eP) r0     // Catch:{ all -> 0x05fd }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x05fd }
            if (r0 != 0) goto L_0x038c
            int r11 = r11 + 1
            goto L_0x037d
        L_0x038c:
            int r12 = r14.size()     // Catch:{ all -> 0x05fd }
            r11 = 0
        L_0x0391:
            if (r11 >= r12) goto L_0x03df
            java.lang.Object r0 = r14.get(r11)     // Catch:{ all -> 0x05fd }
            X.0eP r0 = (X.0eP) r0     // Catch:{ all -> 0x05fd }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x05fd }
            if (r0 == 0) goto L_0x03a0
            int r11 = r11 + 1
            goto L_0x0391
        L_0x03a0:
            int r0 = r14.size()     // Catch:{ all -> 0x05fd }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x05fd }
            r12.<init>(r0)     // Catch:{ all -> 0x05fd }
            int r11 = r14.size()     // Catch:{ all -> 0x05fd }
            r0 = 0
        L_0x03ae:
            if (r0 >= r11) goto L_0x03b6
            r14.get(r0)     // Catch:{ all -> 0x05fd }
            int r0 = r0 + 1
            goto L_0x03ae
        L_0x03b6:
            monitor-enter(r5)     // Catch:{ all -> 0x05fd }
            r0 = r21
            X.018.A16(r12, r0)     // Catch:{ all -> 0x05fa }
            monitor-exit(r5)     // Catch:{ all -> 0x05fd }
            int r0 = r14.size()     // Catch:{ all -> 0x05fd }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x05fd }
            r15.<init>(r0)     // Catch:{ all -> 0x05fd }
            int r13 = r14.size()     // Catch:{ all -> 0x05fd }
            r12 = 0
        L_0x03cb:
            if (r12 >= r13) goto L_0x03de
            java.lang.Object r11 = r14.get(r12)     // Catch:{ all -> 0x05fd }
            r0 = r11
            X.0eP r0 = (X.0eP) r0     // Catch:{ all -> 0x05fd }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x05fd }
            if (r0 == 0) goto L_0x03db
            r15.add(r11)     // Catch:{ all -> 0x05fd }
        L_0x03db:
            int r12 = r12 + 1
            goto L_0x03cb
        L_0x03de:
            r14 = r15
        L_0x03df:
            int r0 = r14.size()     // Catch:{ all -> 0x05fd }
            if (r9 >= r0) goto L_0x03f1
            r14.get(r9)     // Catch:{ all -> 0x05fd }
            java.lang.String r5 = "getComposition$runtime_release"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x05fd }
            r0.<init>(r5)     // Catch:{ all -> 0x05fd }
            goto L_0x05fc
        L_0x03f1:
            X.5X5 r13 = r10.A0b     // Catch:{ all -> 0x05d7 }
            X.5Ws r0 = r10.A0G     // Catch:{ all -> 0x05d7 }
            X.5Ws r12 = r13.A05     // Catch:{ all -> 0x05d7 }
            r13.A05 = r0     // Catch:{ all -> 0x05d3 }
            X.5Wu r11 = r0.A00     // Catch:{ all -> 0x05d3 }
            X.XG4 r0 = X.XG4.A00     // Catch:{ all -> 0x05d3 }
            r11.A02(r0)     // Catch:{ all -> 0x05d3 }
            int r0 = r14.size()     // Catch:{ all -> 0x05d3 }
            if (r9 >= r0) goto L_0x0411
            r14.get(r9)     // Catch:{ all -> 0x05d3 }
            java.lang.String r5 = "getAnchor$runtime_release"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x05d3 }
            r0.<init>(r5)     // Catch:{ all -> 0x05d3 }
            throw r0     // Catch:{ all -> 0x05d3 }
        L_0x0411:
            X.5Ws r0 = r13.A05     // Catch:{ all -> 0x05d3 }
            X.5Wu r11 = r0.A00     // Catch:{ all -> 0x05d3 }
            X.XG3 r0 = X.XG3.A00     // Catch:{ all -> 0x05d3 }
            r11.A02(r0)     // Catch:{ all -> 0x05d3 }
            r13.A03 = r9     // Catch:{ all -> 0x05d3 }
            r13.A03 = r9     // Catch:{ all -> 0x05d3 }
            r13.A05 = r12     // Catch:{ all -> 0x05d7 }
            X.C286565Wx.A0H(r10)     // Catch:{ all -> 0x05dc }
            r8.A01(r7)     // Catch:{ all -> 0x0602 }
            androidx.compose.runtime.Recomposer.A04(r17)     // Catch:{ Exception -> 0x060a }
            goto L_0x02f0
        L_0x042b:
            java.util.Set r0 = r19.keySet()     // Catch:{ Exception -> 0x060a }
            java.util.List r0 = X.00k.A0a(r0)     // Catch:{ Exception -> 0x060a }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ Exception -> 0x060a }
        L_0x0437:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x060a }
            if (r0 == 0) goto L_0x02a1
            java.lang.Object r8 = r9.next()     // Catch:{ Exception -> 0x060a }
            int r7 = X.0vq.A01(r3, r8)     // Catch:{ Exception -> 0x060a }
            java.lang.Object[] r0 = r3.A03     // Catch:{ Exception -> 0x060a }
            r0[r7] = r8     // Catch:{ Exception -> 0x060a }
            goto L_0x0437
        L_0x044a:
            int r7 = r27.size()     // Catch:{ Exception -> 0x0474 }
            r6 = 0
        L_0x044f:
            if (r6 >= r7) goto L_0x045f
            r0 = r27
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x0474 }
            X.5Pj r0 = (X.C285025Pj) r0     // Catch:{ Exception -> 0x0474 }
            r2.A09(r0)     // Catch:{ Exception -> 0x0474 }
            int r6 = r6 + 1
            goto L_0x044f
        L_0x045f:
            int r7 = r27.size()     // Catch:{ Exception -> 0x0474 }
            r6 = 0
        L_0x0464:
            if (r6 >= r7) goto L_0x048f
            r0 = r27
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x0474 }
            X.5Pj r0 = (X.C285025Pj) r0     // Catch:{ Exception -> 0x0474 }
            r0.ABx()     // Catch:{ Exception -> 0x0474 }
            int r6 = r6 + 1
            goto L_0x0464
        L_0x0474:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A03(r1, r4, r0)     // Catch:{ all -> 0x048c }
            r0 = r3
            r1 = r2
            r2 = r31
            r3 = r30
            r5 = r29
            r6 = r28
            r7 = r27
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A00(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x048c }
            r27.clear()     // Catch:{ all -> 0x0649 }
            goto L_0x0634
        L_0x048c:
            r0 = move-exception
            goto L_0x0645
        L_0x048f:
            r27.clear()     // Catch:{ all -> 0x0649 }
        L_0x0492:
            int r6 = r3.A01     // Catch:{ all -> 0x0649 }
            r0 = 0
            if (r6 == 0) goto L_0x0498
            r0 = 1
        L_0x0498:
            r24 = 255(0xff, double:1.26E-321)
            r23 = 7
            r21 = -1
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = 8
            if (r0 == 0) goto L_0x050d
            r2.A07(r3)     // Catch:{ Exception -> 0x04eb }
            java.lang.Object[] r11 = r3.A03     // Catch:{ Exception -> 0x04eb }
            long[] r10 = r3.A02     // Catch:{ Exception -> 0x04eb }
            int r0 = r10.length     // Catch:{ Exception -> 0x04eb }
            int r9 = r0 + -2
            if (r9 < 0) goto L_0x050a
            r8 = 0
        L_0x04b4:
            r17 = r10[r8]     // Catch:{ Exception -> 0x04eb }
            long r13 = r17 ^ r21
            long r13 = r13 << r23
            long r6 = r17 & r13
            long r6 = r6 & r19
            int r0 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x04e6
            int r0 = r8 - r9
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r7 = 8 - r0
            r6 = 0
        L_0x04cb:
            if (r6 >= r7) goto L_0x04e4
            long r15 = r17 & r24
            r13 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x04df
            int r0 = r8 << 3
            int r0 = r0 + r6
            r0 = r11[r0]     // Catch:{ Exception -> 0x04eb }
            X.5Pj r0 = (X.C285025Pj) r0     // Catch:{ Exception -> 0x04eb }
            r0.AC3()     // Catch:{ Exception -> 0x04eb }
        L_0x04df:
            long r17 = r17 >> r12
            int r6 = r6 + 1
            goto L_0x04cb
        L_0x04e4:
            if (r7 != r12) goto L_0x050a
        L_0x04e6:
            if (r8 == r9) goto L_0x050a
            int r8 = r8 + 1
            goto L_0x04b4
        L_0x04eb:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A03(r1, r4, r0)     // Catch:{ all -> 0x0504 }
            r5 = r3
            r6 = r2
            r7 = r31
            r8 = r30
            r9 = r4
            r10 = r29
            r11 = r28
            r12 = r27
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A00(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0504 }
            r3.A05()     // Catch:{ all -> 0x0649 }
            goto L_0x0634
        L_0x0504:
            r0 = move-exception
            r3.A05()     // Catch:{ all -> 0x0649 }
            goto L_0x0648
        L_0x050a:
            r3.A05()     // Catch:{ all -> 0x0649 }
        L_0x050d:
            int r0 = r2.A01     // Catch:{ all -> 0x0649 }
            if (r0 == 0) goto L_0x0578
            java.lang.Object[] r11 = r2.A03     // Catch:{ Exception -> 0x0556 }
            long[] r10 = r2.A02     // Catch:{ Exception -> 0x0556 }
            int r0 = r10.length     // Catch:{ Exception -> 0x0556 }
            int r9 = r0 + -2
            if (r9 < 0) goto L_0x0575
            r8 = 0
        L_0x051b:
            r16 = r10[r8]     // Catch:{ Exception -> 0x0556 }
            long r12 = r16 ^ r21
            long r12 = r12 << r23
            long r6 = r16 & r12
            long r6 = r6 & r19
            int r0 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0551
            int r0 = r8 - r9
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r7 = 8 - r0
            r6 = 0
        L_0x0532:
            if (r6 >= r7) goto L_0x054d
            long r14 = r16 & r24
            r12 = 128(0x80, double:6.32E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0546
            int r0 = r8 << 3
            int r0 = r0 + r6
            r0 = r11[r0]     // Catch:{ Exception -> 0x0556 }
            X.5Pj r0 = (X.C285025Pj) r0     // Catch:{ Exception -> 0x0556 }
            r0.AGx()     // Catch:{ Exception -> 0x0556 }
        L_0x0546:
            r0 = 8
            long r16 = r16 >> r0
            int r6 = r6 + 1
            goto L_0x0532
        L_0x054d:
            r0 = 8
            if (r7 != r0) goto L_0x0575
        L_0x0551:
            if (r8 == r9) goto L_0x0575
            int r8 = r8 + 1
            goto L_0x051b
        L_0x0556:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A03(r1, r4, r0)     // Catch:{ all -> 0x056f }
            r5 = r3
            r6 = r2
            r7 = r31
            r8 = r30
            r9 = r4
            r10 = r29
            r11 = r28
            r12 = r27
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A00(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x056f }
            r2.A05()     // Catch:{ all -> 0x0649 }
            goto L_0x0634
        L_0x056f:
            r0 = move-exception
            r2.A05()     // Catch:{ all -> 0x0649 }
            goto L_0x0648
        L_0x0575:
            r2.A05()     // Catch:{ all -> 0x0649 }
        L_0x0578:
            monitor-enter(r5)     // Catch:{ all -> 0x0649 }
            androidx.compose.runtime.Recomposer.A01(r4)     // Catch:{ all -> 0x0642 }
            monitor-exit(r5)     // Catch:{ all -> 0x0649 }
            androidx.compose.runtime.snapshots.Snapshot r0 = X.AnonymousClass5P3.A00()     // Catch:{ all -> 0x0649 }
            r0.A08()     // Catch:{ all -> 0x0649 }
            r30.A05()     // Catch:{ all -> 0x0649 }
            r31.A05()     // Catch:{ all -> 0x0649 }
            r4.A04 = r1     // Catch:{ all -> 0x0649 }
            goto L_0x0634
        L_0x058e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0     // Catch:{ all -> 0x05c1 }
        L_0x0593:
            r0 = move-exception
            r11.A0L = r9     // Catch:{ all -> 0x05c1 }
            throw r0     // Catch:{ all -> 0x05c1 }
        L_0x0597:
            java.lang.String r0 = "Expected applyChanges() to have been called"
            X.AnonymousClass5XN.A03(r0)     // Catch:{ Exception -> 0x05a1 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ Exception -> 0x05a1 }
            throw r0     // Catch:{ Exception -> 0x05a1 }
        L_0x05a1:
            r0 = move-exception
            r12.A00 = r14     // Catch:{ all -> 0x05a5 }
            throw r0     // Catch:{ all -> 0x05a5 }
        L_0x05a5:
            r6 = move-exception
            java.util.Set r5 = r12.A0E     // Catch:{ Exception -> 0x05b9 }
            boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x05b9 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x05b8
            X.5bv r0 = new X.5bv     // Catch:{ Exception -> 0x05b9 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x05b9 }
            r0.A01()     // Catch:{ Exception -> 0x05b9 }
        L_0x05b8:
            throw r6     // Catch:{ Exception -> 0x05b9 }
        L_0x05b9:
            r0 = move-exception
            r12.A6v()     // Catch:{ all -> 0x05be }
            throw r0     // Catch:{ all -> 0x05be }
        L_0x05be:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x05c1 }
            throw r0     // Catch:{ all -> 0x05c1 }
        L_0x05c1:
            r0 = move-exception
            r13.A01(r7)     // Catch:{ all -> 0x05c6 }
            throw r0     // Catch:{ all -> 0x05c6 }
        L_0x05c6:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A04(r16)     // Catch:{ Exception -> 0x061e }
            throw r0     // Catch:{ Exception -> 0x061e }
        L_0x05cb:
            java.lang.String r6 = "List is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x05f7 }
            r0.<init>(r6)     // Catch:{ all -> 0x05f7 }
            throw r0     // Catch:{ all -> 0x05f7 }
        L_0x05d3:
            r0 = move-exception
            r13.A05 = r12     // Catch:{ all -> 0x05d7 }
            throw r0     // Catch:{ all -> 0x05d7 }
        L_0x05d7:
            r0 = move-exception
            X.C286565Wx.A0G(r10)     // Catch:{ all -> 0x05dc }
            throw r0     // Catch:{ all -> 0x05dc }
        L_0x05dc:
            r6 = move-exception
            r0 = r20
            java.util.Set r5 = r0.A0E     // Catch:{ Exception -> 0x05f2 }
            boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x05f2 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x05f1
            X.5bv r0 = new X.5bv     // Catch:{ Exception -> 0x05f2 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x05f2 }
            r0.A01()     // Catch:{ Exception -> 0x05f2 }
        L_0x05f1:
            throw r6     // Catch:{ Exception -> 0x05f2 }
        L_0x05f2:
            r0 = move-exception
            r20.A6v()     // Catch:{ all -> 0x05fd }
            goto L_0x05fc
        L_0x05f7:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x05fd }
            goto L_0x05fc
        L_0x05fa:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x05fd }
        L_0x05fc:
            throw r0     // Catch:{ all -> 0x05fd }
        L_0x05fd:
            r0 = move-exception
            r8.A01(r7)     // Catch:{ all -> 0x0602 }
            throw r0     // Catch:{ all -> 0x0602 }
        L_0x0602:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A04(r17)     // Catch:{ Exception -> 0x060a }
            throw r0     // Catch:{ Exception -> 0x060a }
        L_0x0607:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ Exception -> 0x060a }
            throw r0     // Catch:{ Exception -> 0x060a }
        L_0x060a:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A03(r1, r4, r0)     // Catch:{ all -> 0x0649 }
            r0 = r3
            r1 = r2
            r2 = r31
            r3 = r30
            r5 = r29
            r6 = r28
            r7 = r27
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A00(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0649 }
            goto L_0x0634
        L_0x061e:
            r0 = move-exception
            androidx.compose.runtime.Recomposer.A03(r1, r4, r0)     // Catch:{ all -> 0x063d }
            r0 = r3
            r1 = r2
            r2 = r31
            r3 = r30
            r5 = r29
            r6 = r28
            r7 = r27
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.A00(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x063d }
            r29.clear()     // Catch:{ all -> 0x0649 }
        L_0x0634:
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.0fg.A00(r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x063d:
            r0 = move-exception
            r29.clear()     // Catch:{ all -> 0x0649 }
            goto L_0x0648
        L_0x0642:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0649 }
            goto L_0x0648
        L_0x0645:
            r27.clear()     // Catch:{ all -> 0x0649 }
        L_0x0648:
            throw r0     // Catch:{ all -> 0x0649 }
        L_0x0649:
            r1 = move-exception
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.0fg.A00(r0)
            throw r1
        L_0x0651:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C298635tm.invoke(java.lang.Object):java.lang.Object");
    }
}
