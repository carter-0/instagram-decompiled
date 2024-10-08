package X;

public final class OR4 {
    /* JADX WARNING: type inference failed for: r4v0, types: [X.Gyv, X.NfZ] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        if (r3 == null) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C69150NfZ parseFromJson(X.16F r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.NfZ r4 = new X.NfZ     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            r4.<init>()     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            if (r1 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            r4 = 0
            return r4
        L_0x0016:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            if (r1 == r0) goto L_0x0053
            java.lang.String r1 = X.AnonymousClass7TE.A17(r5)     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            java.lang.String r0 = "results"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            if (r0 == 0) goto L_0x004c
            r2 = 0
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            if (r1 != r0) goto L_0x0049
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
        L_0x0037:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            if (r1 == r0) goto L_0x0049
            com.instagram.model.hashtag.HashtagImpl r0 = X.C279594yt.parseFromJson(r5)     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            if (r0 == 0) goto L_0x0037
            r2.add(r0)     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            goto L_0x0037
        L_0x0049:
            r4.A00 = r2     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            goto L_0x004f
        L_0x004c:
            X.C55140Hco.A00(r5, r4, r1)     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
        L_0x004f:
            r5.A0z()     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            goto L_0x0016
        L_0x0053:
            java.util.List r0 = r4.A00     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            if (r0 == 0) goto L_0x007a
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
        L_0x005f:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r2.next()     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            com.instagram.model.hashtag.Hashtag r0 = (com.instagram.model.hashtag.Hashtag) r0     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            com.instagram.model.hashtag.HashtagImpl r1 = r0.FEY()     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            X.Nfj r0 = new X.Nfj     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            r3.add(r0)     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            goto L_0x005f
        L_0x0078:
            if (r3 != 0) goto L_0x007c
        L_0x007a:
            X.0sn r3 = X.0sn.A00     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
        L_0x007c:
            r4.A09 = r3     // Catch:{ IOException -> 0x0085, Exception -> 0x007f }
            return r4
        L_0x007f:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x0085:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OR4.parseFromJson(X.16F):X.NfZ");
    }
}
