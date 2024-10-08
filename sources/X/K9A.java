package X;

import android.content.Context;
import com.instagram.creation.fragment.ManageDraftsFragment;
import java.util.ArrayList;
import java.util.Map;

public final class K9A extends C331047Ph {
    public boolean A00;
    public final ArrayList A01 = AnonymousClass7TE.A1C();
    public final ArrayList A02 = AnonymousClass7TE.A1C();
    public final Map A03 = AnonymousClass7TE.A1E();
    public final KA0 A04;

    public K9A(Context context, AnonymousClass8XV r3, ManageDraftsFragment manageDraftsFragment) {
        KA0 ka0 = new KA0(context, r3, manageDraftsFragment);
        this.A04 = ka0;
        A0B(ka0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.L3g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.L3g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.L3g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.K9A r4) {
        /*
            r4.A06()
            java.util.ArrayList r0 = r4.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r2 = r3.next()
            java.util.Map r0 = r4.A03
            java.lang.Object r1 = r0.get(r2)
            X.L3g r1 = (X.C63696L3g) r1
            if (r1 != 0) goto L_0x0025
            X.L3g r1 = new X.L3g
            r1.<init>()
            r0.put(r2, r1)
        L_0x0025:
            boolean r0 = r4.A00
            r1.A00 = r0
            java.util.ArrayList r0 = r4.A02
            boolean r0 = r0.contains(r2)
            r1.A01 = r0
            X.KA0 r0 = r4.A04
            r4.A09(r0, r2, r1)
            goto L_0x0009
        L_0x0037:
            r4.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K9A.A00(X.K9A):void");
    }
}
