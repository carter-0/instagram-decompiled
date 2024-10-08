package X;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class STz {
    public static final C269114eb A07 = C269094eZ.A01;
    public final C268854eA A00;
    public final C268894eF A01;
    public final C269144ee A02;
    public final C269124ec A03;
    public final C268924eI A04;
    public final Class A05;
    public final boolean A06;

    public static C269054eV A00(C268894eF r9, C269144ee r10, C269124ec r11) {
        if (r9 instanceof AnonymousClass4iN) {
            return new C269054eV(r9.A00);
        }
        STz sTz = new STz(r9, r10, r11);
        ArrayList A0v = DbS.A0v(8);
        C268894eF r4 = sTz.A01;
        Class<Object> cls = Object.class;
        Class<Object> cls2 = r4.A00;
        if (cls2 != cls) {
            if (cls2.isInterface()) {
                A04(r4, A0v, false);
            } else {
                A05(r4, A0v, false);
            }
        }
        C269084eY r0 = C269054eV.A0D;
        Class cls3 = sTz.A05;
        C269114eb A032 = sTz.A03(A0v);
        return new C269054eV(sTz.A00, r4, sTz.A03, sTz.A04, sTz.A02.A01.A07, A032, cls3, A0v, sTz.A06);
    }

    private C269114eb A03(List list) {
        Annotation[] A0L;
        Annotation[] A0L2;
        C268854eA r9 = this.A00;
        if (r9 == null || ((this.A03 instanceof C269174eh) && !this.A06)) {
            return A07;
        }
        C269094eZ r7 = C8210QkJ.A00;
        boolean z = this.A06;
        if (z && (A0L2 = C269574fL.A0L(this.A05)) != null) {
            for (Annotation annotation : A0L2) {
                if (!r7.A03(annotation)) {
                    r7 = r7.A00(annotation);
                    if (r9.A0p(annotation)) {
                        r7 = A02(r7, annotation);
                    }
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C268894eF r1 = (C268894eF) it.next();
            if (z && (A0L = C269574fL.A0L(r1.A00)) != null) {
                for (Annotation annotation2 : A0L) {
                    if (!r7.A03(annotation2)) {
                        r7 = r7.A00(annotation2);
                        if (r9.A0p(annotation2)) {
                            r7 = A02(r7, annotation2);
                        }
                    }
                }
            }
        }
        return r7.A02();
    }

    public static void A04(C268894eF r4, List list, boolean z) {
        List<C268894eF> emptyList;
        int length;
        Class<Map> cls = r4.A00;
        if (z) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                if (((C268894eF) list.get(i)).A00 != cls) {
                    i++;
                } else {
                    return;
                }
            }
            list.add(r4);
            if (cls == List.class || cls == Map.class) {
                return;
            }
        }
        C268894eF[] r2 = ((C268944eK) r4).A02;
        if (r2 == null || (length = r2.length) == 0) {
            emptyList = Collections.emptyList();
        } else if (length != 1) {
            emptyList = Arrays.asList(r2);
        } else {
            emptyList = Collections.singletonList(r2[0]);
        }
        for (C268894eF A042 : emptyList) {
            A04(A042, list, true);
        }
    }

    public static void A05(C268894eF r4, List list, boolean z) {
        List<C268894eF> emptyList;
        int length;
        Class<Enum> cls = r4.A00;
        if (cls != Object.class && cls != Enum.class) {
            if (z) {
                int size = list.size();
                int i = 0;
                while (i < size) {
                    if (((C268894eF) list.get(i)).A00 != cls) {
                        i++;
                    } else {
                        return;
                    }
                }
                list.add(r4);
            }
            C268894eF[] r2 = ((C268944eK) r4).A02;
            if (r2 == null || (length = r2.length) == 0) {
                emptyList = Collections.emptyList();
            } else if (length != 1) {
                emptyList = Arrays.asList(r2);
            } else {
                emptyList = Collections.singletonList(r2[0]);
            }
            for (C268894eF A042 : emptyList) {
                A04(A042, list, true);
            }
            C268894eF A052 = r4.A05();
            if (A052 != null) {
                A05(A052, list, true);
            }
        }
    }

    public STz(C268894eF r4, C269144ee r5, C269124ec r6) {
        boolean z;
        this.A02 = r5;
        this.A01 = r4;
        Class cls = r4.A00;
        this.A05 = cls;
        this.A03 = r6;
        this.A04 = r4.A0G();
        C268854eA A012 = r5.A07() ? r5.A01() : null;
        this.A00 = A012;
        if (A012 == null || (C269574fL.A0J(cls) && r4.A0N())) {
            z = false;
        } else {
            z = true;
        }
        this.A06 = z;
    }

    public static C269054eV A01(C269144ee r1, C269124ec r2, Class cls) {
        if (cls.isArray()) {
            return new C269054eV(cls);
        }
        return new STz(r1, r2, cls).A06();
    }

    private C269094eZ A02(C269094eZ r6, Annotation annotation) {
        for (Annotation annotation2 : C269574fL.A0L(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !r6.A03(annotation2)) {
                r6 = r6.A00(annotation2);
                if (this.A00.A0p(annotation2)) {
                    r6 = A02(r6, annotation2);
                }
            }
        }
        return r6;
    }

    public final C269054eV A06() {
        List emptyList = Collections.emptyList();
        C269084eY r0 = C269054eV.A0D;
        Class cls = this.A05;
        C269114eb A032 = A03(emptyList);
        return new C269054eV(this.A00, (C268894eF) null, this.A03, this.A04, this.A02.A01.A07, A032, cls, emptyList, this.A06);
    }

    public STz(C269144ee r3, C269124ec r4, Class cls) {
        this.A02 = r3;
        C268854eA r1 = null;
        this.A01 = null;
        this.A05 = cls;
        this.A03 = r4;
        this.A04 = C268924eI.A04;
        r1 = r3.A07() ? r3.A01() : r1;
        this.A00 = r1;
        this.A06 = AnonymousClass7TF.A1V(r1);
    }
}
