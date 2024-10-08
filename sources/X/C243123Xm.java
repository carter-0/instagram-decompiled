package X;

import android.view.accessibility.AccessibilityManager;
import com.facebook.litho.ComponentsSystrace;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Xm  reason: invalid class name and case insensitive filesystem */
public abstract class C243123Xm {
    public static final C244843bq A00(C251263mp r21, 2V1 r22, 2TR r23, C243063Xg r24, AnonymousClass3XI r25, String str, int i, int i2) {
        C244793bl r16;
        2V1 r12 = r22;
        0qQ.A0B(r12, 0);
        C251263mp r11 = r21;
        0qQ.A0B(r11, 1);
        AnonymousClass3XI r4 = r25;
        0qQ.A0B(r4, 2);
        C243133Xn.A07.addAndGet(1);
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        String str2 = str;
        int i3 = i2;
        if (isTracing) {
            if (str != null) {
                try {
                    ComponentsSystrace.A02(002.A0R("extra:", str2));
                } catch (Throwable th) {
                    2VC r1 = r4.A05;
                    r1.A00.A00(r1);
                    if (isTracing) {
                        ComponentsSystrace.A01();
                        if (str2 != null) {
                            ComponentsSystrace.A01();
                        }
                    }
                    throw th;
                }
            }
            1Kb A00 = ComponentsSystrace.A00(002.A0R("resolveTree:", r11.A0J()));
            A00.ACO("treeId", i3);
            A00.ACO("rootId", r11.A00);
            A00.flush();
        }
        2VC r5 = r4.A05;
        AnonymousClass2V6 r2 = r5.A00;
        synchronized (r2) {
            try {
                r2.A00.add(r5);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
        C243243Xz r15 = null;
        C243153Xp r8 = new C243153Xp((C243153Xp) null);
        int i4 = r11.A00;
        Object systemService = r12.A0C.getSystemService("accessibility");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        int i5 = i;
        C243243Xz r20 = new C243243Xz(r23, r8, r24, r4, i3, i5, i4, 2VH.A00((AccessibilityManager) systemService));
        ThreadLocal threadLocal = r12.A0E;
        2VG r7 = (2VG) threadLocal.get();
        try {
            threadLocal.set(r20);
            2TR A03 = AnonymousClass3Y0.A03(r11, r12, r20);
            threadLocal.set(r7);
            if (r20.A00()) {
                r16 = null;
            } else {
                r16 = AnonymousClass3Y0.A05(A03);
                r20.A08.A00 = true;
            }
            if (C244803bm.A05) {
                synchronized (C244803bm.A06) {
                    Map map = (Map) C244803bm.A08.getValue();
                    Integer valueOf = Integer.valueOf(i3);
                    Object obj = map.get(valueOf);
                    if (obj == null) {
                        obj = new ArrayList();
                        map.put(valueOf, obj);
                    }
                    ((List) obj).add(Boolean.valueOf(AnonymousClass2VL.A01()));
                }
            }
            C243153Xp r14 = r20.A08;
            boolean A002 = r20.A00();
            List list = r20.A01;
            if (r20.A00()) {
                r15 = r20;
            }
            C244843bq r10 = new C244843bq(r11, r12, A03, r14, r15, r16, r4, list, i5, A002);
            r2.A00(r5);
            if (isTracing) {
                ComponentsSystrace.A01();
                if (str2 != null) {
                    ComponentsSystrace.A01();
                }
            }
            return r10;
        } catch (Throwable th3) {
            th = th3;
            threadLocal.set(r7);
            throw th;
        }
    }
}
