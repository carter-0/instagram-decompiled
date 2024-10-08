package X;

/* renamed from: X.Nzd  reason: case insensitive filesystem */
public abstract class C70247Nzd {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.1cE parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.1cE r1 = new X.1cE     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.<init>()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r2 == r0) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x01c8
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r2 == r0) goto L_0x01c9
            java.lang.String r2 = X.AnonymousClass7TE.A17(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            boolean r0 = X.C41845B3m.A1A(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r3 = 0
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A0L = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
        L_0x002f:
            r4.A0z()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x0016
        L_0x0033:
            java.lang.String r0 = "mentioned_user_ids"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x0056
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r2 != r0) goto L_0x0053
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
        L_0x0047:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r2 == r0) goto L_0x0053
            X.AnonymousClass7TG.A1F(r4, r3)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x0047
        L_0x0053:
            r1.A0N = r3     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x0056:
            java.lang.String r0 = "after_post_action"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A0F = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x0065:
            java.lang.String r0 = "replied_to_message"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x0074
            X.3tI r0 = X.C254933tI.A00(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A03 = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x0074:
            java.lang.String r0 = "forwarding_params"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x0083
            com.instagram.direct.model.DirectForwardingParams r0 = X.C49753F5e.parseFromJson(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A01 = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x0083:
            r0 = 1697(0x6a1, float:2.378E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A0J = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x0096:
            java.lang.String r0 = "power_up_data"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x00a5
            X.OKm r0 = X.C70066Nwi.parseFromJson(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A02 = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x00a5:
            java.lang.String r0 = "private_reply_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x00b5
            X.OCA r0 = X.OQU.parseFromJson(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A05 = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x00b5:
            java.lang.String r0 = "mentioned_entities"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x00c5
            com.instagram.direct.model.mentions.SendMentionData$MentionData r0 = X.C70084Nx0.parseFromJson(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A04 = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x00c5:
            r0 = 679(0x2a7, float:9.51E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x00d9
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A08 = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x00d9:
            java.lang.String r0 = "send_silently"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x00e9
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A0A = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x00e9:
            java.lang.String r0 = "is_x_transport_forward"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x00f9
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A09 = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x00f9:
            java.lang.String r0 = "commands"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x0123
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r2 != r0) goto L_0x011f
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
        L_0x010d:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r2 == r0) goto L_0x011f
            X.9IY r0 = X.OPw.parseFromJson(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x010d
            r3.add(r0)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x010d
        L_0x011f:
            r1.A0M = r3     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x0123:
            java.lang.String r0 = "btt_dual_send"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x0133
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A0O = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x0133:
            java.lang.String r0 = "attachment"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x0143
            X.3Q2 r0 = X.AnonymousClass3Q1.parseFromJson(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A07 = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x0143:
            r0 = 1726(0x6be, float:2.419E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x0157
            X.N49 r0 = X.OPv.parseFromJson(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A00 = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x0157:
            java.lang.String r0 = "seed"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x0167
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A0B = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x0167:
            java.lang.String r0 = "is_written_with_ai"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x0177
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A0C = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x0177:
            java.lang.String r0 = "prompt_fbid"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x0187
            java.lang.String r0 = X.AnonymousClass7TG.A0l(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A0G = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x0187:
            java.lang.String r0 = "should_skip_genai_eval"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x0197
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A0P = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x0197:
            java.lang.String r0 = "thread_label"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x01ab
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            java.lang.Integer r0 = X.OPZ.A01(r0)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            r1.A0D = r0     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x01ab:
            java.lang.String r0 = "scheduled_timestamp_sec"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r0 == 0) goto L_0x01c3
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            X.16L r0 = X.16L.A0I     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            if (r2 != r0) goto L_0x01bf
            java.lang.Long r3 = X.AnonymousClass7TF.A0Z(r4)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
        L_0x01bf:
            r1.A0E = r3     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x01c3:
            X.C66893Meb.A01(r4, r1, r2)     // Catch:{ IOException -> 0x01d0, Exception -> 0x01ca }
            goto L_0x002f
        L_0x01c8:
            r1 = 0
        L_0x01c9:
            return r1
        L_0x01ca:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x01d0:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70247Nzd.parseFromJson(X.16F):X.1cE");
    }
}
