package X;

import java.util.LinkedHashSet;
import java.util.Set;

public final class GBX {
    public final Set A00;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (X.0qQ.A0K(r1, "friend_su_in_reels") != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(X.C267324bN r6) {
        /*
            r5 = this;
            r4 = 0
            X.0qQ.A0B(r6, r4)
            boolean r0 = r6.A0G()
            if (r0 == 0) goto L_0x002a
            X.GmE r3 = r6.A02()
            r1 = 0
            if (r3 == 0) goto L_0x0028
            java.lang.String r2 = r3.A0B
        L_0x0013:
            java.lang.String r0 = "creators_in_reels"
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0027
            if (r3 == 0) goto L_0x001f
            java.lang.String r1 = r3.A0B
        L_0x001f:
            java.lang.String r0 = "friend_su_in_reels"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x002a
        L_0x0027:
            return r4
        L_0x0028:
            r2 = r1
            goto L_0x0013
        L_0x002a:
            X.5o2 r1 = r6.A01
            X.5o2 r0 = X.C295365o2.CATCH_UP_SUMMARY
            if (r1 == r0) goto L_0x0027
            X.5o2 r0 = X.C295365o2.CATCH_UP_COMPLETED
            if (r1 == r0) goto L_0x0027
            java.util.Set r0 = r5.A00
            boolean r4 = r0.contains(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GBX.A00(X.4bN):boolean");
    }

    public GBX() {
        C295365o2[] r5 = {C295365o2.ORGANIC, C295365o2.GHOST, C295365o2.MIDCARD, C295365o2.QPMIDCARD, C295365o2.QP, C295365o2.PREVIEW, C295365o2.NETEGO, C295365o2.NETEGO_AD4AD, C295365o2.NETEGO_THREADS_IN_REELS_UNIT_ACQUISITION, C295365o2.BRAND_SURVEY, C295365o2.AD, C295365o2.AD_PREVIEW, C295365o2.MULTI_ADS, C295365o2.UNAVAILABLE, C295365o2.BLEND_END_OF_FEED};
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            C295365o2 r2 = r5[i];
            if (r2 != null) {
                linkedHashSet.add(r2);
            }
            i++;
        } while (i < 15);
        this.A00 = linkedHashSet;
    }
}
