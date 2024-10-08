package androidx.compose.runtime;

import X.05G;
import X.0sK;
import X.0vq;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C285025Pj;
import X.C60340gF;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {574, 585}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
public final class Recomposer$runRecomposeAndApplyChanges$2 extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public /* synthetic */ Object A09;
    public final /* synthetic */ Recomposer A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A0A = recomposer;
    }

    public static final void A00(0vq r23, 0vq r24, 0vq r25, 0vq r26, Recomposer recomposer, List list, List list2, List list3) {
        05G r0 = Recomposer.A0N;
        Recomposer recomposer2 = recomposer;
        synchronized (recomposer2.A0D) {
            list.clear();
            list2.clear();
            List list4 = list3;
            int size = list4.size();
            for (int i = 0; i < size; i++) {
                C285025Pj r02 = (C285025Pj) list4.get(i);
                r02.A6v();
                Recomposer.A02(r02, recomposer2);
            }
            list4.clear();
            0vq r12 = r23;
            Object[] objArr = r12.A03;
            long[] jArr = r12.A02;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((j & ((j ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - (((i2 - length) ^ -1) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((j & 255) < 128) {
                                C285025Pj r03 = (C285025Pj) objArr[(i2 << 3) + i4];
                                r03.A6v();
                                Recomposer.A02(r03, recomposer2);
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            r12.A05();
            0vq r122 = r24;
            Object[] objArr2 = r122.A03;
            long[] jArr2 = r122.A02;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr2[i5];
                    if ((((j2 ^ -1) << 7) & j2 & -9187201950435737472L) != -9187201950435737472L) {
                        int i6 = 8 - (((i5 - length2) ^ -1) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j2 & 255) < 128) {
                                ((C285025Pj) objArr2[(i5 << 3) + i7]).AGx();
                            }
                            j2 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length2) {
                        break;
                    }
                    i5++;
                }
            }
            r122.A05();
            r25.A05();
            0vq r123 = r26;
            Object[] objArr3 = r123.A03;
            long[] jArr3 = r123.A02;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    if ((((j3 ^ -1) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                        int i9 = 8 - (((i8 - length3) ^ -1) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j3 & 255) < 128) {
                                C285025Pj r04 = (C285025Pj) objArr3[(i8 << 3) + i10];
                                r04.A6v();
                                Recomposer.A02(r04, recomposer2);
                            }
                            j3 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length3) {
                        break;
                    }
                    i8++;
                }
            }
            r123.A05();
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.A0A, (AnonymousClass4D7) obj3);
        recomposer$runRecomposeAndApplyChanges$2.A09 = obj2;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.4D7, androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014f  */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            r32 = this;
            X.1Hj r21 = X.1Hj.A02
            r10 = r32
            int r1 = r10.A00
            r20 = 1
            if (r1 == 0) goto L_0x00a2
            java.lang.Object r9 = r10.A08
            r0 = r20
            if (r1 == r0) goto L_0x0122
            X.0vq r9 = (X.0vq) r9
            java.lang.Object r8 = r10.A07
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r2 = r10.A06
            X.0vq r2 = (X.0vq) r2
            java.lang.Object r7 = r10.A05
            X.0vq r7 = (X.0vq) r7
            java.lang.Object r6 = r10.A04
            X.0vq r6 = (X.0vq) r6
            java.lang.Object r5 = r10.A03
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r10.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r10.A01
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r1 = r10.A09
            X.5PR r1 = (X.AnonymousClass5PR) r1
            X.0eS.A00(r33)
        L_0x0035:
            androidx.compose.runtime.Recomposer r0 = r10.A0A
            r22 = r0
            X.05G r0 = androidx.compose.runtime.Recomposer.A0N
            r0 = r22
            java.lang.Object r0 = r0.A0D
            r19 = r0
            monitor-enter(r19)
            r0 = r22
            java.util.Map r11 = r0.A0I     // Catch:{ all -> 0x0186 }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x0186 }
            r0 = r0 ^ 1
            r12 = 0
            if (r0 == 0) goto L_0x0093
            java.util.Collection r0 = r11.values()     // Catch:{ all -> 0x0186 }
            java.util.ArrayList r18 = X.0Yv.A1F(r0)     // Catch:{ all -> 0x0186 }
            r11.clear()     // Catch:{ all -> 0x0186 }
            int r0 = r18.size()     // Catch:{ all -> 0x0186 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0186 }
            r11.<init>(r0)     // Catch:{ all -> 0x0186 }
            int r17 = r18.size()     // Catch:{ all -> 0x0186 }
            r13 = 0
        L_0x0068:
            r0 = r17
            if (r13 >= r0) goto L_0x008b
            r0 = r18
            r0.get(r13)     // Catch:{ all -> 0x0186 }
            r16 = 0
            r0 = r22
            java.util.Map r14 = r0.A0H     // Catch:{ all -> 0x0186 }
            r0 = r16
            java.lang.Object r0 = r14.get(r0)     // Catch:{ all -> 0x0186 }
            X.0eP r14 = new X.0eP     // Catch:{ all -> 0x0186 }
            r15 = r0
            r0 = r16
            r14.<init>(r0, r15)     // Catch:{ all -> 0x0186 }
            r11.add(r14)     // Catch:{ all -> 0x0186 }
            int r13 = r13 + 1
            goto L_0x0068
        L_0x008b:
            r0 = r22
            java.util.Map r0 = r0.A0H     // Catch:{ all -> 0x0186 }
            r0.clear()     // Catch:{ all -> 0x0186 }
            goto L_0x0095
        L_0x0093:
            X.0sn r11 = X.0sn.A00     // Catch:{ all -> 0x0186 }
        L_0x0095:
            monitor-exit(r19)
            int r0 = r11.size()
        L_0x009a:
            if (r12 >= r0) goto L_0x00d4
            r11.get(r12)
            int r12 = r12 + 1
            goto L_0x009a
        L_0x00a2:
            X.0eS.A00(r33)
            java.lang.Object r1 = r10.A09
            X.5PR r1 = (X.AnonymousClass5PR) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.0vq r0 = X.AnonymousClass01q.A00
            r0 = 6
            X.0vq r6 = new X.0vq
            r6.<init>(r0)
            X.0vq r7 = new X.0vq
            r7.<init>(r0)
            X.0vq r2 = new X.0vq
            r2.<init>(r0)
            X.5Pw r8 = new X.5Pw
            r8.<init>(r2)
            X.0vq r9 = new X.0vq
            r9.<init>(r0)
        L_0x00d4:
            androidx.compose.runtime.Recomposer r13 = r10.A0A
            java.lang.Object r12 = r13.A0D
            monitor-enter(r12)
            monitor-exit(r12)
            r10.A09 = r1
            r10.A01 = r3
            r10.A02 = r4
            r10.A03 = r5
            r10.A04 = r6
            r10.A05 = r7
            r10.A06 = r2
            r10.A07 = r8
            r10.A08 = r9
            r0 = r20
            r10.A00 = r0
            boolean r0 = androidx.compose.runtime.Recomposer.A06(r13)
            if (r0 != 0) goto L_0x0147
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.1IW.A02
            X.4D7 r14 = X.1Ey.A02(r10)
            X.1IW r11 = new X.1IW
            r0 = r20
            r11.<init>(r0, r14)
            r11.A0I()
            r14 = r11
            monitor-enter(r12)
            boolean r0 = androidx.compose.runtime.Recomposer.A06(r13)     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x0111
            r13.A05 = r11     // Catch:{ all -> 0x0189 }
            r14 = 0
        L_0x0111:
            monitor-exit(r12)
            if (r14 == 0) goto L_0x0119
            X.0gF r0 = X.C60340gF.A00
            r14.resumeWith(r0)
        L_0x0119:
            java.lang.Object r11 = r11.A0E()
            r0 = r21
            if (r11 != r0) goto L_0x0147
            return r21
        L_0x0122:
            X.0vq r9 = (X.0vq) r9
            java.lang.Object r8 = r10.A07
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r2 = r10.A06
            X.0vq r2 = (X.0vq) r2
            java.lang.Object r7 = r10.A05
            X.0vq r7 = (X.0vq) r7
            java.lang.Object r6 = r10.A04
            X.0vq r6 = (X.0vq) r6
            java.lang.Object r5 = r10.A03
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r10.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r10.A01
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r1 = r10.A09
            X.5PR r1 = (X.AnonymousClass5PR) r1
            X.0eS.A00(r33)
        L_0x0147:
            androidx.compose.runtime.Recomposer r12 = r10.A0A
            boolean r0 = androidx.compose.runtime.Recomposer.A07(r12)
            if (r0 == 0) goto L_0x00d4
            X.5tm r11 = new X.5tm
            r26 = r7
            r27 = r12
            r28 = r3
            r29 = r4
            r30 = r5
            r31 = r8
            r23 = r2
            r24 = r9
            r25 = r6
            r22 = r11
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r10.A09 = r1
            r10.A01 = r3
            r10.A02 = r4
            r10.A03 = r5
            r10.A04 = r6
            r10.A05 = r7
            r10.A06 = r2
            r10.A07 = r8
            r10.A08 = r9
            r0 = 2
            r10.A00 = r0
            java.lang.Object r11 = r1.FNV(r10, r11)
            r0 = r21
            if (r11 != r0) goto L_0x0035
            return r21
        L_0x0186:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        L_0x0189:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
