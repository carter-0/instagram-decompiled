package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facebook.litho.ComponentsSystrace;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3by  reason: invalid class name and case insensitive filesystem */
public abstract class C244923by {
    /* JADX WARNING: type inference failed for: r0v83, types: [X.3bj, java.lang.Object] */
    public static final 2T4 A00(2Tf r32, 2T4 r33, C244843bq r34, C243063Xg r35, int i, int i2, long j) {
        C244933bz r8;
        ArrayList arrayList;
        C244773bj r0;
        ArrayList arrayList2;
        List list;
        2V1 r28;
        int i3;
        int i4;
        RenderTreeNode renderTreeNode;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C244843bq r7 = r34;
        0qQ.A0B(r7, 0);
        C243133Xn.A06.addAndGet(1);
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        AnonymousClass3XI r30 = r7.A06;
        int i5 = i2;
        long j2 = j;
        if (isTracing) {
            try {
                C251263mp r3 = r7.A01;
                1Kb A00 = ComponentsSystrace.A00(002.A0R("layoutTree:", r3.A0J()));
                A00.ACO("treeId", i5);
                A00.ACO("rootId", r3.A00);
                A00.ACP(C245073cH.A04(j2), "sizeConstraints");
                A00.flush();
            } catch (Throwable th) {
                2VC r1 = r30.A04;
                r1.A00.A00(r1);
                if (isTracing) {
                    ComponentsSystrace.A01();
                }
                throw th;
            }
        }
        r30.A01();
        2TR r9 = r7.A03;
        Object andSet = r7.A08.getAndSet(C243153Xp.A04);
        0qQ.A07(andSet);
        C243153Xp r12 = (C243153Xp) andSet;
        2V1 r11 = r7.A02;
        2T4 r122 = r33;
        if (r33 != null) {
            r8 = new C244933bz(r122.A0X);
        } else {
            r8 = new C244933bz((Map) null);
        }
        C243153Xp r4 = new C243153Xp(r12);
        int i6 = r7.A01.A00;
        Context context = r11.A0C;
        Object systemService = context.getSystemService("accessibility");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        2V1 r20 = r11;
        C243153Xp r22 = r4;
        2VF r19 = new 2VF(r20, r32, r22, r35, r30, r8, i5, i, i6, 2VH.A00((AccessibilityManager) systemService));
        ThreadLocal threadLocal = r11.A0E;
        2VG r36 = (2VG) threadLocal.get();
        try {
            threadLocal.set(r19);
            AnonymousClass2TY A002 = AnonymousClass2VI.A00(context, r19, r9, j2);
            Point point = r19.A00;
            int i7 = point.x;
            int i8 = point.y;
            C244793bl r13 = r7.A05;
            if (r13 != null) {
                arrayList = new ArrayList(r13.A01);
                C244773bj r14 = r13.A00;
                ? obj = new Object();
                obj.A00(r14);
                r0 = obj;
            } else {
                arrayList = null;
                r0 = null;
            }
            C245323cg r192 = new C245323cg(r20, r122, r0, A002, arrayList, i7, i8, j2);
            if (A002 != null) {
                AnonymousClass2VI.A02(r11, r19, A002, r192);
            }
            C245473cx r17 = C245473cx.A00;
            if (!r19.CU9()) {
                list = r192.A0Q;
                if (list.isEmpty()) {
                    r28 = r192.A0K;
                    boolean isTracing2 = ComponentsSystrace.A00.isTracing();
                    int i9 = r192.A0G;
                    int i10 = r192.A0B;
                    AnonymousClass2Ta r123 = r192.A08;
                    if (r123 != null) {
                        i3 = r123.getWidth();
                        i4 = r123.getHeight();
                    } else {
                        i3 = 0;
                        i4 = 0;
                    }
                    int mode = View.MeasureSpec.getMode(i9);
                    if (mode == Integer.MIN_VALUE) {
                        i3 = Math.max(0, Math.min(i3, View.MeasureSpec.getSize(i9)));
                    } else if (mode != 0) {
                        if (mode != 1073741824) {
                            i3 = r192.A01;
                        } else {
                            i3 = View.MeasureSpec.getSize(i9);
                        }
                    }
                    r192.A01 = i3;
                    int mode2 = View.MeasureSpec.getMode(i10);
                    if (mode2 == Integer.MIN_VALUE) {
                        i4 = Math.max(0, Math.min(i4, View.MeasureSpec.getSize(i10)));
                    } else if (mode2 != 0) {
                        if (mode2 != 1073741824) {
                            i4 = r192.A00;
                        } else {
                            i4 = View.MeasureSpec.getSize(i10);
                        }
                    }
                    r192.A00 = i4;
                    if (r123 != null) {
                        if (r28.A02.A01.A0P) {
                            if (r123 instanceof AnonymousClass2TY) {
                                ((AnonymousClass2TY) r123).A04();
                            }
                            C245473cx.A02(r17, r192, r123);
                            renderTreeNode = (RenderTreeNode) list.get(0);
                        } else {
                            renderTreeNode = null;
                        }
                        if (isTracing2) {
                            ComponentsSystrace.A02("collectResults");
                        }
                        C245473cx.A01(r28, (2Tf) null, r19, r17, r192, r123, renderTreeNode, 0, 0);
                        if (isTracing2) {
                            ComponentsSystrace.A01();
                            ComponentsSystrace.A02("sortMountableOutputs");
                        }
                        ArrayList arrayList5 = r192.A0P;
                        arrayList3 = new ArrayList(arrayList5);
                        Comparator comparator = C245583d9.A01;
                        0qQ.A08(comparator);
                        01V.A1D(arrayList5, comparator);
                        ArrayList arrayList6 = r192.A0O;
                        arrayList4 = new ArrayList(arrayList6);
                        Comparator comparator2 = C245583d9.A00;
                        0qQ.A08(comparator2);
                        01V.A1D(arrayList6, comparator2);
                        if (isTracing2) {
                            ComponentsSystrace.A01();
                        }
                        2TR r10 = r192.A03;
                        AnonymousClass2Ta r15 = r192.A08;
                        r192.A03 = null;
                        r192.A08 = null;
                        if (2Sa.isEndToEndTestRun) {
                            r192.A03 = r10;
                        } else if (2Sa.keepLayoutResults) {
                        }
                        r192.A08 = r15;
                    }
                } else {
                    throw new IllegalStateException(0rw.A0t(002.A0R("Attempting to collect results on an already populated ReductionState.\n        | Root: ", r192.A0N)));
                }
            }
            if (r192.A0Q.isEmpty()) {
                C245473cx.A02(r17, r192, (AnonymousClass2Ta) null);
            }
            long j3 = r192.A0H;
            boolean z = r19.A0D;
            Map map = r8.A00;
            List list2 = r7.A07;
            List list3 = r19.A06;
            if (list2 == null || list2.isEmpty()) {
                list2 = list3;
            } else if (list3 != null && !list3.isEmpty()) {
                list2 = 00k.A0S(list3, list2);
            }
            if (list2 != null) {
                arrayList2 = new ArrayList(list2);
            } else {
                arrayList2 = null;
            }
            2T4 r193 = new 2T4(r192, r7, arrayList2, map, i5, j3, z);
            if (A002 != null) {
                A002.A05();
            }
            threadLocal.set(r36);
            r19.A05 = null;
            r19.A04 = null;
            r19.A02 = null;
            r19.A01 = null;
            r19.A07 = true;
            C243133Xn.A01.addAndGet(1);
            if (AnonymousClass2VL.A01()) {
                C243133Xn.A02.addAndGet(1);
            }
            if (C244803bm.A05) {
                C244803bm.A06.A00(i5);
            }
            2VC r16 = r30.A04;
            r16.A00.A00(r16);
            if (isTracing) {
                ComponentsSystrace.A01();
            }
            return r193;
        } catch (Exception e) {
            throw 2Vb.A00(r28, e);
        } catch (IllegalArgumentException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append(e2.getMessage());
            sb.append("\n");
            int size = arrayList3.size();
            sb.append(002.A0O("Error while sorting ReductionState tops. Size: ", size));
            sb.append("\n");
            Rect rect = new Rect();
            for (int i11 = 0; i11 < size; i11++) {
                ((RenderTreeNode) list.get(i11)).A01(rect);
                sb.append(002.A02(i11, rect.top, "   Index ", " top: "));
                sb.append("\n");
            }
            throw new IllegalStateException(sb.toString());
        } catch (IllegalArgumentException e3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e3.getMessage());
            sb2.append("\n");
            int size2 = arrayList4.size();
            sb2.append(002.A0O("Error while sorting ReductionState bottoms. Size: ", size2));
            sb2.append("\n");
            Rect rect2 = new Rect();
            for (int i12 = 0; i12 < size2; i12++) {
                ((RenderTreeNode) list.get(i12)).A01(rect2);
                sb2.append(002.A02(i12, rect2.bottom, "   Index ", " bottom: "));
                sb2.append("\n");
            }
            throw new IllegalStateException(sb2.toString());
        } catch (Exception e4) {
            throw 2Vb.A00(r11, e4);
        } catch (Throwable th2) {
            threadLocal.set(r36);
            r19.A05 = null;
            r19.A04 = null;
            r19.A02 = null;
            r19.A01 = null;
            r19.A07 = true;
            C243133Xn.A01.addAndGet(1);
            if (AnonymousClass2VL.A01()) {
                C243133Xn.A02.addAndGet(1);
            }
            if (C244803bm.A05) {
                C244803bm.A06.A00(i5);
            }
            throw th2;
        }
    }
}
