package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Qkc  reason: case insensitive filesystem */
public final class C8229Qkc extends C12444Sua {
    public final Map A00;
    public final boolean A01;
    public final C269144ee A02;
    public final ConcurrentHashMap A03;

    public C8229Qkc(C268894eF r2, C269144ee r3, HashMap hashMap, ConcurrentHashMap concurrentHashMap) {
        super(r2, r3.A01.A07);
        this.A02 = r3;
        this.A03 = concurrentHashMap;
        this.A00 = hashMap;
        this.A01 = r3.A09(C269354ez.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r1 == null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(java.lang.Class r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0004
            r1 = 0
        L_0x0003:
            return r1
        L_0x0004:
            java.lang.String r4 = r6.getName()
            java.util.concurrent.ConcurrentHashMap r3 = r5.A03
            java.lang.String r1 = X.DbS.A0r(r4, r3)
            if (r1 != 0) goto L_0x0003
            X.4eE r0 = r5.A01
            X.4eF r0 = r0.A09(r6)
            java.lang.Class r2 = r0.A00
            X.4ee r1 = r5.A02
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0030
            X.4ed r0 = r1.A03(r2)
            X.4eA r1 = r1.A01()
            X.4eV r0 = r0.A07
            java.lang.String r1 = r1.A0j(r0)
            if (r1 != 0) goto L_0x0040
        L_0x0030:
            java.lang.String r1 = r2.getName()
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 < 0) goto L_0x0040
            java.lang.String r1 = X.Pxe.A0v(r0, r1)
        L_0x0040:
            r3.put(r4, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8229Qkc.A00(java.lang.Class):java.lang.String");
    }

    public final String AwR() {
        TreeSet treeSet = new TreeSet();
        Iterator A0u = AnonymousClass7TF.A0u(this.A00);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            C268894eF r1 = (C268894eF) A1J.getValue();
            if (!(r1 instanceof AnonymousClass4iN)) {
                Class cls = r1.A00;
                if ((cls.getModifiers() & 1536) != 0 && !cls.isPrimitive()) {
                }
            }
            treeSet.add(A1J.getKey());
        }
        return treeSet.toString();
    }

    public final String CLy(Class cls, Object obj) {
        if (obj == null) {
            return A00(cls);
        }
        return A00(obj.getClass());
    }

    public final C268894eF FIK(C269514fF r2, String str) {
        if (this.A01) {
            str = str.toLowerCase();
        }
        return (C268894eF) this.A00.get(str);
    }

    public final String CLx(Object obj) {
        return A00(obj.getClass());
    }

    public final String toString() {
        return String.format("[%s; id-to-type=%s]", new Object[]{C66581MXm.A0y(this), this.A00});
    }
}
