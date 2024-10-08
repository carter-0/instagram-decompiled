package X;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public final class WEU implements X0A {
    public VUK A00 = new Object();
    public List A01 = new ArrayList();
    public List A02 = new ArrayList();
    public final UAE A03;
    public final X0C A04;
    public final X0D A05;
    public final IdentityHashMap A06 = new IdentityHashMap();

    public static int A00(WEU weu, C17549Va2 va2) {
        C17549Va2 va22;
        Iterator it = weu.A02.iterator();
        int i = 0;
        while (it.hasNext() && (va22 = (C17549Va2) it.next()) != va2) {
            i += va22.A00;
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.VUK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.VUK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.VUK} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.VUK A01(X.WEU r5, int r6) {
        /*
            X.VUK r4 = r5.A00
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x002d
            X.VUK r4 = new X.VUK
            r4.<init>()
        L_0x000b:
            java.util.List r0 = r5.A02
            java.util.Iterator r3 = r0.iterator()
            r2 = r6
        L_0x0012:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r1 = r3.next()
            X.Va2 r1 = (X.C17549Va2) r1
            int r0 = r1.A00
            if (r0 <= r2) goto L_0x002b
            r4.A01 = r1
            r4.A00 = r2
        L_0x0026:
            X.Va2 r0 = r4.A01
            if (r0 == 0) goto L_0x0031
            return r4
        L_0x002b:
            int r2 = r2 - r0
            goto L_0x0012
        L_0x002d:
            r0 = 1
            r4.A02 = r0
            goto L_0x000b
        L_0x0031:
            java.lang.String r0 = "Cannot find wrapper for "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WEU.A01(X.WEU, int):X.VUK");
    }

    public static void A02(WEU weu) {
        C231372rZ r2;
        Iterator it = weu.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                r2 = C231372rZ.ALLOW;
                break;
            }
            C17549Va2 va2 = (C17549Va2) it.next();
            C231372rZ r1 = va2.A03.mStateRestorationPolicy;
            r2 = C231372rZ.PREVENT;
            if (r1 == r2 || (r1 == C231372rZ.PREVENT_WHEN_EMPTY && va2.A00 == 0)) {
                break;
            }
        }
        UAE uae = weu.A03;
        if (r2 != uae.mStateRestorationPolicy) {
            uae.A00(r2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.VUK, java.lang.Object] */
    public WEU(UAE uae) {
        this.A03 = uae;
        this.A05 = new WEZ();
        this.A04 = new WEX();
    }
}
