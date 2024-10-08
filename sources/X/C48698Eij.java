package X;

/* renamed from: X.Eij  reason: case insensitive filesystem */
public abstract class C48698Eij {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r7, X.AnonymousClass6Tm r8) {
        /*
            java.lang.Object r1 = r8.A01()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>"
            X.0qQ.A0C(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            X.C48953Emr.A00()
            java.util.HashMap r0 = X.C308206Td.A0H(r1)
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r0)
        L_0x001a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0042
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r2)
            java.lang.String r0 = "\""
            r3.append(r0)
            java.lang.String r0 = X.DbT.A13(r1)
            r3.append(r0)
            java.lang.String r0 = "\":\""
            r3.append(r0)
            java.lang.String r0 = X.DbS.A0s(r1)
            r3.append(r0)
            java.lang.String r0 = "\","
            r3.append(r0)
            goto L_0x001a
        L_0x0042:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x006d
            int r0 = r3.length()
            int r0 = r0 + -1
            r3.deleteCharAt(r0)
            java.lang.String r2 = "{"
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "}"
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            X.16F r0 = X.16P.A00(r0)     // Catch:{ IOException -> 0x0066 }
            com.instagram.infocenter.model.InfoCenterFactShareInfo r6 = X.VEG.parseFromJson(r0)     // Catch:{ IOException -> 0x0066 }
            goto L_0x006e
        L_0x0066:
            java.lang.String r1 = "InfoCenterPluginImpl"
            java.lang.String r0 = "Unable to parse info center fact."
            X.0wb.A03(r1, r0)
        L_0x006d:
            r6 = 0
        L_0x006e:
            r5 = 0
            if (r6 == 0) goto L_0x009d
            com.instagram.common.session.UserSession r4 = X.DbX.A0W(r7)
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = X.C308206Td.A04(r7)
            X.37D r3 = r1.A01(r0)
            if (r3 == 0) goto L_0x009d
            X.1as r0 = X.1as.A04
            X.1ap r2 = r0.A02
            X.2FW r1 = X.2FW.A11
            X.0iw r0 = X.C308206Td.A08(r7)
            X.F3w r2 = r2.A07(r0, r4, r1)
            android.os.Bundle r1 = r2.A07
            java.lang.String r0 = "DirectShareSheetConstants.info_center_fact"
            r1.putParcelable(r0, r6)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = r2.A00()
            r3.A0J(r0)
        L_0x009d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48698Eij.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
