package X;

/* renamed from: X.EnX  reason: case insensitive filesystem */
public abstract class C48995EnX {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: X.EuG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: X.EuG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: X.EuG} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C49644F0b parseFromJson(X.16F r6) {
        /*
            r1 = 0
            X.0qQ.A0B(r6, r1)
            X.F0b r5 = new X.F0b     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            r5.<init>()     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            if (r2 == r0) goto L_0x0016
            r6.A0z()     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            goto L_0x00e1
        L_0x0016:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            if (r2 == r0) goto L_0x007d
            java.lang.String r2 = X.AnonymousClass7TE.A17(r6)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = "message_on_banner"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = "type"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "notification_type"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "in_app_url"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r6)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            r5.A04 = r0     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
        L_0x0050:
            r6.A0z()     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            goto L_0x0016
        L_0x0054:
            java.lang.String r0 = "sender"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            if (r0 == 0) goto L_0x0063
            com.instagram.user.model.User r0 = X.C41845B3m.A0a(r6, r1)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            r5.A01 = r0     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            goto L_0x0050
        L_0x0063:
            java.lang.String r0 = "extra_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r6)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            r5.A03 = r0     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            goto L_0x0050
        L_0x0072:
            X.C41846B3n.A1A(r6)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            goto L_0x0050
        L_0x0076:
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r6)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            r5.A05 = r0     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            goto L_0x0050
        L_0x007d:
            java.lang.String r2 = r5.A03     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            if (r2 == 0) goto L_0x0094
            java.lang.String r1 = "\\\""
            java.lang.String r0 = "\""
            java.lang.String r0 = r2.replace(r1, r0)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ IOException -> 0x009a }
            X.EuG r0 = X.C48996EnY.parseFromJson(r0)     // Catch:{ IOException -> 0x009a }
            r5.A00 = r0     // Catch:{ IOException -> 0x009a }
            goto L_0x00ac
        L_0x0094:
            X.EuG r0 = new X.EuG     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            r0.<init>()     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            goto L_0x00aa
        L_0x009a:
            java.lang.String r0 = "error parsing extra_info field for json string: "
            java.lang.String r1 = X.002.A0R(r0, r2)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            java.lang.String r0 = "InAppNotificationEvent"
            X.0wb.A03(r0, r1)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            X.EuG r0 = new X.EuG     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            r0.<init>()     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
        L_0x00aa:
            r5.A00 = r0     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
        L_0x00ac:
            java.lang.String r1 = "ig://"
            java.lang.String r0 = r5.A04     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            X.0bY r0 = X.FBI.A01     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            android.net.Uri r4 = X.0cp.A01(r0, r1)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            if (r4 == 0) goto L_0x00e2
            java.lang.String r0 = r4.getHost()     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            r0.getClass()     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            r5.A02 = r0     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            java.util.Set r0 = r4.getQueryParameterNames()     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
        L_0x00cd:
            boolean r0 = r3.hasNext()     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            if (r0 == 0) goto L_0x00e2
            java.lang.String r2 = X.AnonymousClass7TE.A18(r3)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            java.util.Map r1 = r5.A06     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            java.lang.String r0 = r4.getQueryParameter(r2)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            r1.put(r2, r0)     // Catch:{ IOException -> 0x00e9, Exception -> 0x00e3 }
            goto L_0x00cd
        L_0x00e1:
            r5 = 0
        L_0x00e2:
            return r5
        L_0x00e3:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x00e9:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48995EnX.parseFromJson(X.16F):X.F0b");
    }
}
