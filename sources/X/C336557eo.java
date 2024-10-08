package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7eo  reason: invalid class name and case insensitive filesystem */
public final class C336557eo {
    public int A00;
    public final List A01 = new ArrayList();
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C336567ep.A00);
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(C336577eq.A00);
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(C336587er.A00);

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004d, code lost:
        if (r6 == null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C251263mp r13, java.lang.Object r14, float r15, float r16, boolean r17) {
        /*
            r12 = this;
            r5 = r13
            r6 = r14
            if (r14 != 0) goto L_0x005b
            if (r13 == 0) goto L_0x004f
            int r4 = r13.A05
            X.0eM r3 = r12.A04
            java.lang.Object r1 = r3.getValue()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r3.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x005e
            int r0 = r0.intValue()
        L_0x0026:
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r0 = 58
            r1.append(r0)
            java.lang.Object r0 = r3.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r2)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            if (r6 != 0) goto L_0x0060
        L_0x004f:
            java.lang.String r2 = "staticId:"
            int r1 = r12.A00
            int r0 = r1 + 1
            r12.A00 = r0
            java.lang.String r6 = X.002.A0O(r2, r1)
        L_0x005b:
            if (r13 != 0) goto L_0x0060
            return
        L_0x005e:
            r0 = 0
            goto L_0x0026
        L_0x0060:
            r7 = 0
            X.7es r4 = new X.7es
            r9 = r15
            r10 = r16
            r11 = r17
            r8 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.util.List r0 = r12.A01
            r0.add(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C336557eo.A00(X.3mp, java.lang.Object, float, float, boolean):void");
    }

    public final void A01(Object obj, C62320sa r12, Object[] objArr, float f) {
        Object obj2 = obj;
        Object[] objArr2 = objArr;
        0qQ.A0B(objArr, 5);
        if (obj == null) {
            int i = this.A00;
            this.A00 = i + 1;
            obj2 = 002.A0O("staticId:", i);
        }
        this.A01.add(new C336597es((C251263mp) null, obj2, new C377179Kv(r12, 24), objArr2, -1.0f, f, false));
    }
}
