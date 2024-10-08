package X;

/* renamed from: X.Mo3  reason: case insensitive filesystem */
public final class C67448Mo3 {
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fc, code lost:
        if (r3 == null) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C67449Mo4 parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.Mo4 r4 = new X.Mo4     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            r4.<init>()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r1 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            goto L_0x0103
        L_0x0016:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r1 == r0) goto L_0x00ae
            java.lang.String r1 = r5.A0q()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            r5.A1J()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            java.lang.String r0 = "list"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            r2 = 0
            if (r0 == 0) goto L_0x0050
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r1 != r0) goto L_0x004d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            r2.<init>()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
        L_0x003b:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r1 == r0) goto L_0x004d
            X.Mmh r0 = X.C67364Mmg.parseFromJson(r5)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r0 == 0) goto L_0x003b
            r2.add(r0)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            goto L_0x003b
        L_0x004d:
            r4.A00 = r2     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            goto L_0x00a9
        L_0x0050:
            java.lang.String r0 = "users"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r0 == 0) goto L_0x0079
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r1 != r0) goto L_0x00a7
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            r2.<init>()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
        L_0x0065:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r1 == r0) goto L_0x00a7
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            com.instagram.user.model.User r0 = X.1aC.A00(r5, r3)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r0 == 0) goto L_0x0065
            r2.add(r0)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            goto L_0x0065
        L_0x0079:
            java.lang.String r0 = "tags"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r0 == 0) goto L_0x00a3
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r1 != r0) goto L_0x00a0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            r2.<init>()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
        L_0x008e:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r1 == r0) goto L_0x00a0
            com.instagram.model.hashtag.HashtagImpl r0 = X.C279594yt.parseFromJson(r5)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r0 == 0) goto L_0x008e
            r2.add(r0)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            goto L_0x008e
        L_0x00a0:
            r4.A02 = r2     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            goto L_0x00a9
        L_0x00a3:
            X.C67450Mo5.A00(r5, r4, r1)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            goto L_0x00a9
        L_0x00a7:
            r4.A03 = r2     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
        L_0x00a9:
            r5.A0z()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            goto L_0x0016
        L_0x00ae:
            java.util.List r1 = r4.A00     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r1 == 0) goto L_0x00ba
            X.MnB r0 = X.C67394MnB.A00     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            java.util.List r0 = X.C67393MnA.A00(r0, r1)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r0 != 0) goto L_0x00bc
        L_0x00ba:
            X.0sn r0 = X.0sn.A00     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
        L_0x00bc:
            r4.A01 = r0     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r0 == 0) goto L_0x0104
            java.util.List r0 = r4.A03     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r0 == 0) goto L_0x00f9
            java.util.List r0 = X.C67393MnA.A01(r0)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
        L_0x00cc:
            r4.A01 = r0     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r0 == 0) goto L_0x0104
            java.util.List r0 = r4.A02     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r0 == 0) goto L_0x00fe
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
        L_0x00e0:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r2.next()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            com.instagram.model.hashtag.Hashtag r0 = (com.instagram.model.hashtag.Hashtag) r0     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            com.instagram.model.hashtag.HashtagImpl r1 = r0.FEY()     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            X.Nfj r0 = new X.Nfj     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            r3.add(r0)     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            goto L_0x00e0
        L_0x00f9:
            X.0sn r0 = X.0sn.A00     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            goto L_0x00cc
        L_0x00fc:
            if (r3 != 0) goto L_0x0100
        L_0x00fe:
            X.0sn r3 = X.0sn.A00     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
        L_0x0100:
            r4.A01 = r3     // Catch:{ IOException -> 0x010b, Exception -> 0x0105 }
            return r4
        L_0x0103:
            r4 = 0
        L_0x0104:
            return r4
        L_0x0105:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x010b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67448Mo3.parseFromJson(X.16F):X.Mo4");
    }
}
