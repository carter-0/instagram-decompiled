package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CRA extends 17P implements DUW {
    public List A00;

    public final List BGH() {
        return A08(-1442782083, CK6.class);
    }

    public final List BgK() {
        return this.A00;
    }

    public final List BgQ() {
        return A08(-1196402883, CNH.class);
    }

    public final DUW E9g(1E9 r4) {
        ArrayList arrayList;
        ImmutableList A08 = A08(1376807024, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1O(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CRA, X.DUW] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44735Ck3.A00(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.BIN FE2(X.1E9 r8) {
        /*
            r7 = this;
            java.util.List r0 = r7.BGH()
            r2 = 0
            if (r0 == 0) goto L_0x0023
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x000f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r1.next()
            X.3xb r0 = (X.C257563xb) r0
            X.3xa r0 = r0.F37()
            r5.add(r0)
            goto L_0x000f
        L_0x0023:
            r5 = r2
        L_0x0024:
            java.lang.String r4 = r7.A0f()
            java.lang.Class<com.instagram.feed.media.ImmutablePandoMediaDict> r1 = com.instagram.feed.media.ImmutablePandoMediaDict.class
            r0 = 1376807024(0x52106870, float:1.55056865E11)
            com.google.common.collect.ImmutableList r0 = r7.A08(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x003b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0045
            X.C41847B3o.A1O(r8, r6, r1)
            goto L_0x003b
        L_0x0045:
            if (r6 == 0) goto L_0x0059
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x004f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005a
            X.C41848B3p.A1V(r8, r3, r1)
            goto L_0x004f
        L_0x0059:
            r3 = r2
        L_0x005a:
            java.util.List r0 = r7.BgQ()
            if (r0 == 0) goto L_0x007c
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0068:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r1.next()
            X.DTM r0 = (X.DTM) r0
            X.BFz r0 = r0.F7u()
            r2.add(r0)
            goto L_0x0068
        L_0x007c:
            X.BIN r0 = new X.BIN
            r0.<init>(r4, r5, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CRA.FE2(X.1E9):X.BIN");
    }

    public final BIN FE3(1E6 r2) {
        return FE2(C41846B3n.A0S(r2));
    }

    public final String getMediaId() {
        return A0f();
    }
}
