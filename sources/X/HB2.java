package X;

import com.instagram.common.session.UserSession;

public final class HB2 extends C322186vO {
    public final /* synthetic */ C52770GcN A00;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
        if (r0.A07 == X.C54665HMw.ALL_MEDIA_AUTO_COLLECTION) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (X.I31.A00(r0) == false) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(X.1Xj r7) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            int r0 = r7.A00
            r5 = 0
            if (r0 != 0) goto L_0x00a2
            X.1sw r1 = r7.A1u()
            X.1sw r0 = X.1sw.A04
            if (r1 == r0) goto L_0x00a2
            r1 = 1
            X.GcN r4 = r6.A00
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            java.lang.String r2 = "collection"
            if (r0 == 0) goto L_0x001f
            com.instagram.save.model.CollaborativeCollectionMetadata r0 = r0.A05
            if (r0 == 0) goto L_0x004e
            return r1
        L_0x001f:
            X.0qQ.A0F(r2)
            goto L_0x002c
        L_0x0023:
            X.HMH r1 = r4.A09
            java.lang.String r0 = "savedFeedMode"
            if (r1 != 0) goto L_0x0031
            X.0qQ.A0F(r0)
        L_0x002c:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0031:
            X.HMH r0 = X.HMH.ADD_TO_EXISTING_COLLECTION
            if (r1 == r0) goto L_0x003d
            X.HMH r0 = X.HMH.ADD_TO_FAVORITES_COLLECTION
            if (r1 == r0) goto L_0x003d
            X.HMH r0 = X.HMH.ADD_AND_CREATE_COLLECTION
            if (r1 != r0) goto L_0x006f
        L_0x003d:
            java.util.List r1 = r7.A3i()
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r0.A0F
            boolean r0 = r1.contains(r0)
            r3 = r0 ^ 1
            goto L_0x0070
        L_0x004e:
            boolean r0 = X.C52770GcN.A08(r4)
            if (r0 == 0) goto L_0x0023
            java.util.List r1 = r7.A3i()
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r0.A0F
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x006f
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            if (r0 == 0) goto L_0x001f
            X.HMw r1 = r0.A07
            X.HMw r0 = X.C54665HMw.ALL_MEDIA_AUTO_COLLECTION
            r3 = 0
            if (r1 != r0) goto L_0x0070
        L_0x006f:
            r3 = 1
        L_0x0070:
            com.instagram.save.model.SavedCollection r1 = r4.A0C
            if (r1 == 0) goto L_0x001f
            com.instagram.common.session.UserSession r0 = r4.A03
            java.lang.String r2 = "userSession"
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r0.A06
            boolean r0 = r1.A07(r0)
            if (r0 != 0) goto L_0x008d
            com.instagram.common.session.UserSession r0 = r4.A03
            if (r0 == 0) goto L_0x001f
            boolean r0 = X.I31.A00(r0)
            r1 = 1
            if (r0 != 0) goto L_0x008e
        L_0x008d:
            r1 = 0
        L_0x008e:
            if (r3 == 0) goto L_0x009e
            com.instagram.common.session.UserSession r0 = r4.A03
            if (r0 == 0) goto L_0x001f
            X.2f5 r0 = X.C225892f5.A00(r0)
            boolean r0 = r0.A0O(r7)
            if (r0 != 0) goto L_0x00a0
        L_0x009e:
            if (r1 == 0) goto L_0x00a2
        L_0x00a0:
            r5 = 1
            return r5
        L_0x00a2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB2.A00(X.1Xj):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HB2(UserSession userSession, C52770GcN gcN) {
        super(userSession);
        this.A00 = gcN;
    }
}
