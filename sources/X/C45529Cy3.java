package X;

/* renamed from: X.Cy3  reason: case insensitive filesystem */
public final class C45529Cy3 {
    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C43811CEd parseFromJson(X.16F r10) {
        /*
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.CEd r1 = new X.CEd     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            r1.<init>()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            X.16L r2 = r10.A11()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r2 == r0) goto L_0x0016
            r10.A0z()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            r1 = 0
            return r1
        L_0x0016:
            X.16L r2 = r10.A1J()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r2 == r0) goto L_0x00df
            java.lang.String r2 = X.AnonymousClass7TE.A17(r10)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            java.lang.String r0 = "balance"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r0 == 0) goto L_0x0034
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r10)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            r1.A04 = r0     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
        L_0x0030:
            r10.A0z()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            goto L_0x0016
        L_0x0034:
            java.lang.String r0 = "can_send_message"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r0 == 0) goto L_0x0043
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r10)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            r1.A02 = r0     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            goto L_0x0030
        L_0x0043:
            java.lang.String r0 = "disclaimer_type"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            r3 = 0
            if (r0 == 0) goto L_0x0067
            X.16L r2 = r10.A11()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r2 == r0) goto L_0x0058
            java.lang.String r3 = r10.A1P()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
        L_0x0058:
            java.util.Map r0 = com.instagram.api.schemas.ContentAppreciationDisclaimerType.A01     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            com.instagram.api.schemas.ContentAppreciationDisclaimerType r0 = (com.instagram.api.schemas.ContentAppreciationDisclaimerType) r0     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r0 != 0) goto L_0x0064
            com.instagram.api.schemas.ContentAppreciationDisclaimerType r0 = com.instagram.api.schemas.ContentAppreciationDisclaimerType.UNRECOGNIZED     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
        L_0x0064:
            r1.A00 = r0     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            goto L_0x0030
        L_0x0067:
            java.lang.String r0 = "fan_offers_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r0 == 0) goto L_0x0090
            X.16L r2 = r10.A11()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r2 != r0) goto L_0x008d
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
        L_0x007b:
            X.16L r2 = r10.A1J()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r2 == r0) goto L_0x008d
            X.JVf r0 = X.CWF.parseFromJson(r10)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r0 == 0) goto L_0x007b
            r3.add(r0)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            goto L_0x007b
        L_0x008d:
            r1.A06 = r3     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            goto L_0x0030
        L_0x0090:
            java.lang.String r0 = "gifts"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r0 == 0) goto L_0x00ba
            X.16L r2 = r10.A11()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r2 != r0) goto L_0x00b6
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
        L_0x00a4:
            X.16L r2 = r10.A1J()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r2 == r0) goto L_0x00b6
            X.JuC r0 = X.CWJ.parseFromJson(r10)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r0 == 0) goto L_0x00a4
            r3.add(r0)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            goto L_0x00a4
        L_0x00b6:
            r1.A07 = r3     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            goto L_0x0030
        L_0x00ba:
            java.lang.String r0 = "has_purchased_stars"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r0 == 0) goto L_0x00ca
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r10)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            r1.A03 = r0     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            goto L_0x0030
        L_0x00ca:
            java.lang.String r0 = "selected_gift_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            if (r0 == 0) goto L_0x00da
            java.lang.Long r0 = X.AnonymousClass7TF.A0Z(r10)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            r1.A05 = r0     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            goto L_0x0030
        L_0x00da:
            X.1XY.A01(r10, r1, r2)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            goto L_0x0030
        L_0x00df:
            java.lang.Integer r0 = r1.A04     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            X.0qQ.A0A(r0)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            int r6 = r0.intValue()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            java.lang.Boolean r0 = r1.A02     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            boolean r9 = X.C41845B3m.A14(r0)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            com.instagram.api.schemas.ContentAppreciationDisclaimerType r3 = r1.A00     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            X.0qQ.A0A(r3)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            java.util.List r4 = r1.A06     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            java.util.List r5 = r1.A07     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            X.0qQ.A0A(r5)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            java.lang.Boolean r0 = r1.A03     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            boolean r10 = X.C41845B3m.A14(r0)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            java.lang.Long r0 = r1.A05     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            X.0qQ.A0A(r0)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            long r7 = r0.longValue()     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            X.Ju8 r2 = new X.Ju8     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            r2.<init>(r3, r4, r5, r6, r7, r9, r10)     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            r1.A01 = r2     // Catch:{ IOException -> 0x0117, Exception -> 0x0111 }
            return r1
        L_0x0111:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x0117:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45529Cy3.parseFromJson(X.16F):X.CEd");
    }
}
