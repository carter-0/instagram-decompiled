package X;

public final class GEI {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, C52140GGi.A00);

    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e8 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.content.Context r7, com.instagram.common.session.UserSession r8, X.1Xj r9) {
        /*
            r6 = this;
            r3 = 1
            X.1Xy r0 = r9.A0C
            com.instagram.feed.media.CreativeConfigIntf r0 = r0.AsO()
            if (r0 == 0) goto L_0x0109
            java.util.List r0 = r0.B02()
            if (r0 == 0) goto L_0x0109
            int r2 = r0.size()
        L_0x0013:
            X.1Xy r0 = r9.A0C
            X.1sQ r1 = r0.getClipsMetadata()
            r0 = 0
            if (r1 == 0) goto L_0x0020
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r1.BZB()
        L_0x0020:
            r1 = 1
            if (r0 != 0) goto L_0x0037
            X.1Xy r0 = r9.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x00f0
            com.instagram.api.schemas.MusicInfo r0 = r0.BUr()
            if (r0 == 0) goto L_0x00f0
            com.instagram.api.schemas.TrackData r0 = r0.BUk()
            if (r0 == 0) goto L_0x00f0
        L_0x0037:
            int r2 = r2 + r1
            java.util.ArrayList r0 = r9.A3E()
            if (r0 == 0) goto L_0x00ed
            int r0 = r0.size()
        L_0x0042:
            int r2 = r2 + r0
            X.1Xy r0 = r9.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x0059
            X.1s9 r0 = r0.BP1()
            if (r0 == 0) goto L_0x0059
            X.4bJ r0 = r0.BZ6()
            if (r0 == 0) goto L_0x0059
            int r2 = r2 + 1
        L_0x0059:
            X.1Xy r0 = r9.A0C
            com.instagram.feed.media.CreativeConfigIntf r0 = r0.AsO()
            r5 = 0
            if (r0 == 0) goto L_0x0072
            java.util.List r0 = X.C284745Nt.A07(r7, r0)
            if (r0 == 0) goto L_0x0072
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r3) goto L_0x0072
            int r2 = r2 + 1
        L_0x0072:
            com.instagram.model.venue.Venue r0 = r9.A23()
            if (r0 == 0) goto L_0x007a
            int r2 = r2 + 1
        L_0x007a:
            boolean r0 = X.B56.A01(r8, r9)
            if (r0 == 0) goto L_0x0082
            int r2 = r2 + 1
        L_0x0082:
            boolean r0 = r9.A6B()
            if (r0 == 0) goto L_0x0097
            X.0Tu r4 = X.0Tu.A05
            r0 = 36317221253223277(0x8106520007136d, double:3.030495186025976E-306)
            boolean r0 = X.182.A06(r4, r8, r0)
            if (r0 == 0) goto L_0x0097
            int r2 = r2 + 1
        L_0x0097:
            boolean r0 = r9.CcK()
            if (r0 == 0) goto L_0x00bb
            X.1Xy r0 = r9.A0C
            com.instagram.api.schemas.AppstoreMetadataDict r0 = r0.AcH()
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = r0.BXF()
            if (r0 != 0) goto L_0x00b9
        L_0x00ab:
            X.1Xy r0 = r9.A0C
            com.instagram.api.schemas.AppstoreMetadataDict r0 = r0.AcH()
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = r0.BHr()
            if (r0 == 0) goto L_0x00bb
        L_0x00b9:
            int r2 = r2 + 1
        L_0x00bb:
            X.0eM r0 = r6.A00
            r0.getValue()
            boolean r0 = X.GEJ.A01(r8, r9)
            if (r0 == 0) goto L_0x00c8
            int r2 = r2 + 1
        L_0x00c8:
            boolean r0 = r9.A6d(r8)
            if (r0 == 0) goto L_0x00d0
            int r2 = r2 + 1
        L_0x00d0:
            boolean r0 = r9.A6c(r8)
            if (r0 == 0) goto L_0x00d8
            int r2 = r2 + 1
        L_0x00d8:
            boolean r0 = r9.A6Z(r8)
            if (r0 == 0) goto L_0x00e0
            int r2 = r2 + 1
        L_0x00e0:
            boolean r0 = r9.CcK()
            if (r0 == 0) goto L_0x00ea
            if (r2 < r3) goto L_0x00e9
        L_0x00e8:
            r5 = 1
        L_0x00e9:
            return r5
        L_0x00ea:
            if (r2 <= r3) goto L_0x00e9
            goto L_0x00e8
        L_0x00ed:
            r0 = 0
            goto L_0x0042
        L_0x00f0:
            boolean r0 = r9.CcK()
            if (r0 == 0) goto L_0x0106
            X.1Xy r0 = r9.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x0106
            X.1rp r0 = r0.AZY()
            if (r0 == 0) goto L_0x0106
            goto L_0x0037
        L_0x0106:
            r1 = 0
            goto L_0x0037
        L_0x0109:
            r2 = 0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GEI.A00(android.content.Context, com.instagram.common.session.UserSession, X.1Xj):boolean");
    }
}
