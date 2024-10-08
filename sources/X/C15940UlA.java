package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.UlA  reason: case insensitive filesystem */
public final class C15940UlA extends GX4 {
    public final C67757MuC A00;

    public C15940UlA(C67757MuC muC) {
        0qQ.A0B(muC, 1);
        this.A00 = muC;
    }

    /* renamed from: A06 */
    public final C296995qz B9o(C296935qt r3) {
        C296995qz r1;
        0qQ.A0B(r3, 0);
        Map map = (Map) this.A00.A06.A02();
        if (map == null || (r1 = (C296995qz) map.get(r3.getKey())) == null) {
            return new C296995qz(-1, -1);
        }
        return r1;
    }

    public final void A08(int i, int i2, Object obj) {
        Object obj2 = obj;
        int i3 = i;
        if (obj instanceof C297005r0) {
            C67757MuC muC = this.A00;
            C71108Ocm ocm = muC.A0C;
            String str = muC.A0F;
            String str2 = muC.A0G;
            C71108Ocm.A03(ocm, str, str2, new J6Y(obj2, i3, C71108Ocm.A02(ocm, str, str2).getValue(), i2, 8));
            return;
        }
        StringBuilder sb = new StringBuilder();
        Pxg.A1R(sb, "Attempt to add invalid section type ", obj);
        0wb.A03("SerpRecyclerDataSource", Pxg.A0t(" at ", sb, i));
    }

    public final void Eab(AnonymousClass07Z r5, C66626MZn mZn) {
        0qQ.A0B(mZn, 0);
        this.A00.A05.A09(new C64318LZs(43, new C74186PqS(40, (Object) this, (Object) mZn)));
    }

    public final Iterator A03() {
        Iterator it;
        List list = (List) this.A00.A05.A02();
        if (list == null || (it = list.iterator()) == null) {
            return 0sn.A00.iterator();
        }
        return it;
    }

    public final int A05() {
        return ((N4N) C67757MuC.A03(this.A00).getValue()).A0H.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.5qw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.5qw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.5qw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.5qw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C296965qw A07(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.1Xj
            if (r0 == 0) goto L_0x005b
            X.MuC r1 = r5.A00
            X.1Xj r6 = (X.1Xj) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.2Fk r0 = r1.A05
            java.lang.Object r0 = r0.A02()
            java.util.List r0 = (java.util.List) r0
            r4 = 0
            if (r0 == 0) goto L_0x005a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0020:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C296965qw
            if (r0 == 0) goto L_0x0020
            if (r1 == 0) goto L_0x0020
            r3.add(r1)
            goto L_0x0020
        L_0x0034:
            java.util.Iterator r3 = r3.iterator()
        L_0x0038:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.5qw r0 = (X.C296965qw) r0
            X.1Xj r0 = r0.BPf()
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r6.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0038
            r4 = r2
        L_0x0058:
            X.5qw r4 = (X.C296965qw) r4
        L_0x005a:
            return r4
        L_0x005b:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15940UlA.A07(java.lang.Object):X.5qw");
    }
}
