package X;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.4ed  reason: invalid class name and case insensitive filesystem */
public final class C269134ed {
    public static final Class[] A09 = new Class[0];
    public C11243SHd A00;
    public List A01;
    public boolean A02;
    public Class[] A03;
    public final C268854eA A04;
    public final C268894eF A05;
    public final C269144ee A06;
    public final C269054eV A07;
    public final SJu A08;

    public final C269314ev A00() {
        C269314ev A042;
        C269314ev r2 = null;
        C268854eA r1 = this.A04;
        if (!(r1 == null || (A042 = r1.A04(this.A07)) == null)) {
            r2 = A042;
        }
        C269314ev r0 = C269314ev.A07;
        if (r2 != null) {
            return r2.A00(r0);
        }
        return r0;
    }

    public final C13782Tgx A02(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof C13782Tgx) {
            return (C13782Tgx) obj;
        }
        if (obj instanceof Class) {
            Class<C12448Suf> cls = (Class) obj;
            if (cls == C12448Suf.class || C269574fL.A0I(cls)) {
                return null;
            }
            if (C13782Tgx.class.isAssignableFrom(cls)) {
                return (C13782Tgx) C269574fL.A03(cls, this.A06.A06());
            }
            throw new IllegalStateException(002.A0g("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<Converter>"));
        }
        throw new IllegalStateException(002.A0g("AnnotationIntrospector returned Converter definition of type ", obj.getClass().getName(), "; expected type Converter or Class<Converter> instead"));
    }

    public final C8208QkH A01() {
        SJu sJu = this.A08;
        if (sJu == null) {
            return null;
        }
        if (!sJu.A0A) {
            sJu.A02();
        }
        LinkedList linkedList = sJu.A09;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() <= 1) {
            return (C8208QkH) linkedList.get(0);
        }
        sJu.A06("Multiple 'as-value' properties defined (%s vs %s)", linkedList.get(0), linkedList.get(1));
        throw AnonymousClass00P.createAndThrow();
    }

    public final List A03() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        SJu sJu = this.A08;
        if (!sJu.A0A) {
            sJu.A02();
        }
        ArrayList arrayList = new ArrayList(sJu.A02.values());
        this.A01 = arrayList;
        return arrayList;
    }

    public final List A04() {
        List<C8206QkF> list = C269054eV.A00(this.A07).A02;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = null;
        for (C8206QkF qkF : list) {
            Method method = qkF.A01;
            if (this.A05.A00.isAssignableFrom(method.getReturnType())) {
                REE A032 = this.A04.A03(qkF);
                if (A032 == null || A032 == REE.DISABLED) {
                    String name = method.getName();
                    if (!"valueOf".equals(name) || qkF.A0F() != 1) {
                        if ("fromString".equals(name) && qkF.A0F() == 1) {
                            Class<String> A0I = qkF.A0I(0);
                            if (A0I != String.class && !CharSequence.class.isAssignableFrom(A0I)) {
                            }
                        }
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(qkF);
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r2 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Class[] A05() {
        /*
            r3 = this;
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r3.A02 = r0
            X.4eA r1 = r3.A04
            if (r1 != 0) goto L_0x001d
            r2 = 0
        L_0x000c:
            X.4ee r1 = r3.A06
            X.4ez r0 = X.C269354ez.DEFAULT_VIEW_INCLUSION
            boolean r0 = r1.A09(r0)
            if (r0 != 0) goto L_0x0018
            java.lang.Class[] r2 = A09
        L_0x0018:
            r3.A03 = r2
        L_0x001a:
            java.lang.Class[] r0 = r3.A03
            return r0
        L_0x001d:
            X.4eV r0 = r3.A07
            java.lang.Class[] r2 = r1.A0q(r0)
            if (r2 != 0) goto L_0x0018
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269134ed.A05():java.lang.Class[]");
    }

    public C269134ed(C268894eF r2, C269144ee r3, C269054eV r4, List list) {
        this.A05 = r2;
        C268854eA r0 = null;
        this.A08 = null;
        this.A06 = r3;
        this.A04 = r3 != null ? r3.A01() : r0;
        this.A07 = r4;
        this.A01 = list;
    }

    public C269134ed(SJu sJu) {
        C268894eF r0 = sJu.A0C;
        C269054eV r2 = sJu.A0F;
        this.A05 = r0;
        this.A08 = sJu;
        C269144ee r02 = sJu.A0D;
        this.A06 = r02;
        this.A04 = r02.A01();
        this.A07 = r2;
        C268854eA r1 = sJu.A0B;
        C11243SHd A0H = r1.A0H(r2);
        this.A00 = A0H != null ? r1.A0I(r2, A0H) : A0H;
    }
}
