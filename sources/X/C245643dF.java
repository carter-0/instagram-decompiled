package X;

import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3dF  reason: invalid class name and case insensitive filesystem */
public final class C245643dF extends C251323mv implements C251333mw, C245653dG {
    public static final C245643dF A01 = new C245643dF(true);
    public static final C245643dF A02 = new C245643dF(false);
    public final boolean A00;

    public static void A03(C245753dQ r3, Object obj) {
        C245983dn.A02((String) null);
        C245743dP r32 = r3.A00;
        C249753kJ r2 = r32.A07;
        boolean isTracing = r2.isTracing();
        if (isTracing) {
            r2.ADG("IncrementalMountExtension.recursivelyNotify");
        }
        if (!r32.A02) {
            C245863db.A03(r2, obj);
        } else {
            r32.A09.add(obj);
        }
        if (isTracing) {
            r2.ASS();
        }
    }

    public final void Cz0(2Th r1, C245753dQ r2, Object obj, Object obj2, boolean z) {
    }

    public final void Dzc(Rect rect, C245753dQ r19) {
        Object obj;
        C245983dn.A02((String) null);
        C245753dQ r6 = r19;
        C245743dP r11 = r6.A00;
        C249753kJ r4 = r11.A07;
        boolean isTracing = r4.isTracing();
        if (isTracing) {
            r4.ADG("IncrementalMountExtension.onVisibleBoundsChanged");
        }
        C245793dU r2 = (C245793dU) r6.A02;
        if (r2.A02 != null) {
            Rect rect2 = rect;
            if (!rect2.isEmpty() || !r2.A04.isEmpty()) {
                Rect rect3 = r2.A04;
                if (rect3.isEmpty() || rect2.isEmpty() || rect2.left != rect3.left || rect2.right != rect3.right) {
                    2T4 r0 = r2.A02;
                    if (r0 != null) {
                        boolean z = AnonymousClass2SY.A01;
                        Collection<C245523d3> values = r0.A0W.values();
                        if (z) {
                            ArrayList arrayList = new ArrayList(values);
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                A01(rect2, r6, (C245523d3) arrayList.get(size), true);
                            }
                        } else {
                            for (C245523d3 A012 : values) {
                                A01(rect2, r6, A012, true);
                            }
                        }
                        A02(rect2, r2);
                    }
                } else if (r2.A02 != null) {
                    boolean isTracing2 = r4.isTracing();
                    if (isTracing2) {
                        r4.ADG("performIncrementalMount");
                    }
                    2SN.A07("RenderCore.IncrementalMount.Start", new AnonymousClass4FN(r6), new AnonymousClass4FO(rect2));
                    2T4 r02 = r2.A02;
                    ArrayList arrayList2 = r02.A0O;
                    ArrayList arrayList3 = r02.A0N;
                    int size2 = r02.A0W.size();
                    if (rect2.top >= 0 || rect3.top >= 0) {
                        while (true) {
                            int i = r2.A00;
                            if (i < size2 && rect2.top >= ((C245523d3) arrayList3.get(i)).A04.bottom) {
                                C245523d3 r14 = (C245523d3) arrayList3.get(r2.A00);
                                long j = r14.A03;
                                if (r6.A03.contains(Long.valueOf(j)) && !r14.A00 && !r2.A03) {
                                    r6.A02(j, true);
                                }
                                r2.A00++;
                            }
                        }
                        while (true) {
                            int i2 = r2.A00;
                            if (i2 <= 0 || rect2.top >= ((C245523d3) arrayList3.get(i2 - 1)).A04.bottom) {
                                break;
                            }
                            long j2 = ((C245523d3) arrayList3.get(r2.A00 - 1)).A03;
                            if (rect2.bottom >= ((C245523d3) arrayList3.get(r2.A00 - 1)).A04.top) {
                                Set set = r6.A03;
                                Long valueOf = Long.valueOf(j2);
                                if (!set.contains(valueOf)) {
                                    r6.A01(j2, true);
                                    r2.A06.add(valueOf);
                                }
                            }
                            r2.A00--;
                        }
                    }
                    int height = r11.A06.A07.getHeight();
                    if (rect2.bottom < height || rect3.bottom < height) {
                        while (true) {
                            int i3 = r2.A01;
                            if (i3 < size2 && rect2.bottom >= ((C245523d3) arrayList2.get(i3)).A04.top) {
                                long j3 = ((C245523d3) arrayList2.get(r2.A01)).A03;
                                if (rect2.top <= ((C245523d3) arrayList2.get(r2.A01)).A04.bottom) {
                                    Set set2 = r6.A03;
                                    Long valueOf2 = Long.valueOf(j3);
                                    if (!set2.contains(valueOf2)) {
                                        r6.A01(j3, true);
                                        r2.A06.add(valueOf2);
                                    }
                                }
                                r2.A01++;
                            }
                        }
                        while (true) {
                            int i4 = r2.A01;
                            if (i4 <= 0 || rect2.bottom >= ((C245523d3) arrayList2.get(i4 - 1)).A04.top) {
                                break;
                            }
                            C245523d3 r112 = (C245523d3) arrayList2.get(r2.A01 - 1);
                            long j4 = r112.A03;
                            if (r6.A03.contains(Long.valueOf(j4)) && !r112.A00 && !r2.A03) {
                                r6.A02(j4, true);
                            }
                            r2.A01--;
                        }
                    }
                    HashMap hashMap = r2.A05;
                    for (Object next : hashMap.keySet()) {
                        if (!r2.A06.contains(next) && (obj = hashMap.get(next)) != null) {
                            A03(r6, obj);
                        }
                    }
                    r2.A06.clear();
                    if (isTracing2) {
                        r4.ASS();
                    }
                    2SN.A07("RenderCore.IncrementalMount.End", new AnonymousClass4FP(r6), new AnonymousClass4FQ());
                }
                rect3.set(rect2);
            }
        }
        if (isTracing) {
            r4.ASS();
        }
    }

    public final boolean Eti(2Th r2, 2Th r3, C245753dQ r4, Object obj, Object obj2) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r1 >= 30.0f) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C245873dc A00(X.C245753dQ r4) {
        /*
            X.3dP r1 = r4.A00
            X.2UL r0 = r1.A06
            X.2Ty r0 = r0.A07
            android.view.Display r0 = r0.getDisplay()
            X.3kJ r4 = r1.A07
            if (r0 == 0) goto L_0x0026
            float r1 = r0.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0026
        L_0x0018:
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r0 / r1
            long r2 = (long) r0
            X.3dc r1 = X.C245873dc.A06
            if (r1 == 0) goto L_0x0029
            boolean r0 = X.AnonymousClass2SY.A00
            if (r0 == 0) goto L_0x0029
            return r1
        L_0x0026:
            r1 = 1114636288(0x42700000, float:60.0)
            goto L_0x0018
        L_0x0029:
            X.3dc r1 = new X.3dc
            r1.<init>(r4, r2)
            X.C245873dc.A06 = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245643dF.A00(X.3dQ):X.3dc");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r6.A00 != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.graphics.Rect r4, X.C245753dQ r5, X.C245523d3 r6, boolean r7) {
        /*
            long r0 = r6.A03
            X.3dP r2 = r5.A00
            X.2UL r2 = r2.A06
            X.01c r2 = r2.A06
            java.lang.Object r2 = r2.A05(r0)
            X.3e2 r2 = (X.C246113e2) r2
            if (r2 == 0) goto L_0x0053
            java.lang.Object r3 = r2.A04
        L_0x0012:
            boolean r2 = r3 instanceof X.C70682Ty
            if (r2 == 0) goto L_0x003f
            X.2Ty r3 = (X.C70682Ty) r3
            int r2 = r3.getMountItemCount()
            if (r2 <= 0) goto L_0x003f
        L_0x001e:
            r4 = 1
        L_0x001f:
            java.util.Set r3 = r5.A03
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            boolean r2 = r3.contains(r2)
            if (r4 == 0) goto L_0x0031
            if (r2 != 0) goto L_0x0030
            r5.A01(r0, r7)
        L_0x0030:
            return
        L_0x0031:
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r5.A02
            X.3dU r2 = (X.C245793dU) r2
            boolean r2 = r2.A03
            if (r2 != 0) goto L_0x0030
            r5.A02(r0, r7)
            return
        L_0x003f:
            android.graphics.Rect r2 = r6.A04
            boolean r2 = android.graphics.Rect.intersects(r4, r2)
            if (r2 != 0) goto L_0x001e
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x001e
            boolean r2 = r6.A00
            r4 = 0
            if (r2 == 0) goto L_0x001f
            goto L_0x001e
        L_0x0053:
            r3 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245643dF.A01(android.graphics.Rect, X.3dQ, X.3d3, boolean):void");
    }

    public final /* bridge */ /* synthetic */ Object A0A() {
        return new C245793dU();
    }

    public final /* bridge */ /* synthetic */ void A0B(Rect rect, C245753dQ r10, Object obj) {
        2T4 r11 = (2T4) obj;
        C249753kJ r6 = r10.A00.A07;
        boolean isTracing = r6.isTracing();
        if (isTracing) {
            r6.ADG("IncrementalMountExtension.beforeMount");
        }
        C245793dU r5 = (C245793dU) r10.A02;
        2T4 r0 = r5.A02;
        if (r0 != null) {
            for (C245523d3 r02 : r0.A0W.values()) {
                long j = r02.A03;
                Map map = r11.A0W;
                Long valueOf = Long.valueOf(j);
                if (map.get(valueOf) == null && r10.A03.contains(valueOf)) {
                    r10.A02(j, false);
                }
            }
        }
        r5.A02 = r11;
        Rect rect2 = r5.A04;
        rect2.setEmpty();
        if (rect != null) {
            rect2.set(rect);
        }
        if (isTracing) {
            r6.ASS();
        }
    }

    public final void A0C(C245753dQ r5) {
        C249753kJ r3 = r5.A00.A07;
        boolean isTracing = r3.isTracing();
        if (isTracing) {
            r3.ADG("IncrementalMountExtension.afterMount");
        }
        C245793dU r1 = (C245793dU) r5.A02;
        A02(r1.A04, r1);
        if (isTracing) {
            r3.ASS();
        }
    }

    public final void ADA(RenderTreeNode renderTreeNode, C245753dQ r10, int i) {
        C249753kJ r7 = r10.A00.A07;
        boolean isTracing = r7.isTracing();
        if (isTracing) {
            r7.ADG("IncrementalMountExtension.beforeMountItem");
        }
        long A0H = renderTreeNode.A06.A0H();
        C245793dU r5 = (C245793dU) r10.A02;
        2T4 r0 = r5.A02;
        if (r0 != null) {
            C245523d3 r2 = (C245523d3) r0.A0W.get(Long.valueOf(A0H));
            if (r2 != null) {
                A01(r5.A04, r10, r2, false);
                if (isTracing) {
                    r7.ASS();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(002.A0e("Output with id=", " not found.", A0H));
        }
    }

    public final void DuU(2Th r5, C245753dQ r6, Object obj, Object obj2) {
        ((C245793dU) r6.A02).A07.remove(Long.valueOf(r5.A0H()));
    }

    public final void Dv4(2Th r8, C245753dQ r9, Object obj, Object obj2) {
        C245793dU r6 = (C245793dU) r9.A02;
        long A0H = r8.A0H();
        if (A0H == 0 && r9.A03.contains(Long.valueOf(A0H))) {
            r9.A02(A0H, false);
        }
        r6.A05.remove(Long.valueOf(A0H));
    }

    public C245643dF(boolean z) {
        this.A00 = z;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 142 */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        r2 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        r8 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.graphics.Rect r10, X.C245793dU r11) {
        /*
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0065
            X.2T4 r0 = r11.A02
            if (r0 == 0) goto L_0x0065
            java.util.ArrayList r7 = r0.A0O
            java.util.ArrayList r4 = r0.A0N
            java.util.Map r0 = r0.A0W
            int r9 = r0.size()
            int r6 = r10.bottom
            int r5 = r9 + -1
            r8 = r5
            r2 = 0
        L_0x001a:
            if (r2 > r5) goto L_0x0066
            int r0 = r5 - r2
            int r3 = r0 / 2
            int r3 = r3 + r2
            java.lang.Object r0 = r7.get(r3)
            X.3d3 r0 = (X.C245523d3) r0
            android.graphics.Rect r0 = r0.A04
            int r0 = r0.top
            if (r6 <= r0) goto L_0x0030
            int r2 = r3 + 1
            goto L_0x001a
        L_0x0030:
            if (r3 <= 0) goto L_0x0042
            int r1 = r3 + -1
            java.lang.Object r0 = r7.get(r1)
            X.3d3 r0 = (X.C245523d3) r0
            android.graphics.Rect r0 = r0.A04
            int r0 = r0.top
            if (r6 > r0) goto L_0x0044
            r5 = r1
            goto L_0x001a
        L_0x0042:
            if (r3 == 0) goto L_0x0067
        L_0x0044:
            int r0 = r3 + -1
            java.lang.Object r0 = r7.get(r0)
            X.3d3 r0 = (X.C245523d3) r0
            android.graphics.Rect r0 = r0.A04
            int r0 = r0.top
            if (r6 <= r0) goto L_0x001a
            goto L_0x0067
        L_0x0053:
            if (r3 == 0) goto L_0x0063
        L_0x0055:
            int r0 = r3 + -1
            java.lang.Object r0 = r4.get(r0)
            X.3d3 r0 = (X.C245523d3) r0
            android.graphics.Rect r0 = r0.A04
            int r0 = r0.bottom
            if (r5 < r0) goto L_0x006c
        L_0x0063:
            r11.A00 = r3
        L_0x0065:
            return
        L_0x0066:
            r3 = r9
        L_0x0067:
            r11.A01 = r3
            int r5 = r10.top
            r2 = 0
        L_0x006c:
            if (r2 > r8) goto L_0x0094
            int r0 = r8 - r2
            int r3 = r0 / 2
            int r3 = r3 + r2
            java.lang.Object r0 = r4.get(r3)
            X.3d3 r0 = (X.C245523d3) r0
            android.graphics.Rect r0 = r0.A04
            int r0 = r0.bottom
            if (r5 < r0) goto L_0x0082
            int r2 = r3 + 1
            goto L_0x006c
        L_0x0082:
            if (r3 <= 0) goto L_0x0053
            int r1 = r3 + -1
            java.lang.Object r0 = r4.get(r1)
            X.3d3 r0 = (X.C245523d3) r0
            android.graphics.Rect r0 = r0.A04
            int r0 = r0.bottom
            if (r5 >= r0) goto L_0x0055
            r8 = r1
            goto L_0x006c
        L_0x0094:
            r3 = r9
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245643dF.A02(android.graphics.Rect, X.3dU):void");
    }

    public final void Cy6(2Th r2, C245753dQ r3, Object obj, Object obj2) {
        if (r2.A0E()) {
            A03(r3, obj);
        }
    }

    public final void DSP(2Th r6, C245753dQ r7, Object obj, Object obj2) {
        long A0H = r6.A0H();
        if (A0H == 0 && !r7.A03.contains(Long.valueOf(A0H))) {
            r7.A01(A0H, false);
        }
        C245793dU r3 = (C245793dU) r7.A02;
        2T4 r0 = r3.A02;
        if (r0 != null) {
            Set set = r0.A0Z;
            Long valueOf = Long.valueOf(A0H);
            if (set.contains(valueOf)) {
                r3.A07.add(valueOf);
                r3.A05.put(valueOf, obj);
            }
        }
    }
}
