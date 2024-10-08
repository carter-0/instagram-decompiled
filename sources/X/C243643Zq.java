package X;

import com.facebook.litho.ComponentsSystrace;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Zq  reason: invalid class name and case insensitive filesystem */
public abstract class C243643Zq {
    public static final 2Wa A00(AnonymousClass3Y5 r14, C62320sa r15) {
        2VC r0;
        2TB r2;
        2VC r02;
        Object obj;
        2TB r5;
        2VC r4;
        C243653Zr r03;
        C243653Zr r1;
        2VC r04;
        2V1 r3 = r14.A05;
        String A08 = r3.A08();
        int i = r14.A01;
        r14.A01 = i + 1;
        C243243Xz r05 = r14.A02;
        if (r05 != null) {
            AnonymousClass3XI r6 = r05.A00;
            AnonymousClass3XH r06 = r3.A03;
            if (r06 != null) {
                C251243mn r10 = r06.A03;
                boolean z = r3.A0A;
                if (z) {
                    r0 = r6.A04;
                } else {
                    r0 = r6.A05;
                }
                C243653Zr r07 = (C243653Zr) r0.A08.get(A08);
                if (r07 != null) {
                    r2 = r07.A01;
                } else {
                    r2 = null;
                }
                2W0 r22 = (2W0) r2;
                if (r22 != null) {
                    List list = r22.A00;
                    if (list.size() > i) {
                        2Vz r08 = r3.A05;
                        r08.getClass();
                        r08.A02 = r22;
                        if (i == 0) {
                            if (z) {
                                r04 = r6.A04;
                            } else {
                                r04 = r6.A05;
                            }
                            r04.A03.add(A08);
                        }
                        return new 2Wa(r3.A01, r10, list.get(i), A08, i, z);
                    }
                }
                2Vz r09 = r3.A05;
                r09.getClass();
                String A0J = r09.A03.A0J();
                0qQ.A07(A0J);
                if (z) {
                    r02 = r6.A04;
                } else {
                    r02 = r6.A05;
                }
                AnonymousClass2V6 r12 = r02.A00;
                synchronized (r12) {
                    Map map = r12.A01;
                    obj = map.get(A08);
                    if (obj == null) {
                        obj = new Object();
                        map.put(A08, obj);
                    }
                }
                synchronized (obj) {
                    Map map2 = r12.A02;
                    C243653Zr r8 = (C243653Zr) map2.get(A08);
                    2TB r52 = null;
                    if (r8 != null) {
                        r52 = r8.A01;
                    }
                    r5 = (2W0) r52;
                    if (r5 == null || r5.A00.size() <= i) {
                        boolean isTracing = ComponentsSystrace.A00.isTracing();
                        if (isTracing) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("create-initial-state:");
                            sb.append(A0J);
                            sb.append('[');
                            sb.append(i);
                            sb.append(']');
                            ComponentsSystrace.A02(sb.toString());
                        }
                        Object invoke = r15.invoke();
                        if (isTracing) {
                            ComponentsSystrace.A01();
                        }
                        2TB r23 = new 2W0(r5, invoke);
                        List list2 = r23.A00;
                        if (i < list2.size()) {
                            if (r8 != null) {
                                r5 = r23;
                                r1 = new C243653Zr(r8.A00, r23);
                            } else {
                                r5 = r23;
                                r1 = new C243653Zr((AnonymousClass2Si) null, r23);
                            }
                            map2.put(A08, r1);
                        } else {
                            throw new IllegalStateException(002.A0n("Unexpected useState hook sequence encountered: ", " (states size: ", "). This usually indicates that the useState hook is being called from within a conditional, loop, or after an early-exit condition. See https://fblitho.com/docs/mainconcepts/hooks-intro/#rules-for-hooks for more information on the Rules of Hooks.", i, list2.size()));
                        }
                    }
                }
                if (z) {
                    r4 = r6.A04;
                } else {
                    r4 = r6.A05;
                }
                synchronized (r4) {
                    r4.A03.add(A08);
                    Map map3 = r4.A08;
                    C243653Zr r010 = (C243653Zr) map3.get(A08);
                    if (r010 != null) {
                        r03 = new C243653Zr(r010.A00, r5);
                    } else {
                        r03 = new C243653Zr((AnonymousClass2Si) null, r5);
                    }
                    map3.put(A08, r03);
                }
                2Vz r011 = r3.A05;
                r011.getClass();
                r011.A02 = r5;
                return new 2Wa(r3.A01, r10, r5.A00.get(i), A08, i, z);
            }
            throw new IllegalStateException("LithoTree is null");
        }
        throw new IllegalStateException("Cannot create state outside of layout calculation");
    }
}
