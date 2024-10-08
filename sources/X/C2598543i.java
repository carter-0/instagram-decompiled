package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.43i  reason: invalid class name and case insensitive filesystem */
public final class C2598543i implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public C2598543i(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6BN E4Y(X.AnonymousClass651 r16, X.AnonymousClass653 r17, java.util.List r18, java.util.Map r19, X.0sL r20, X.0sL r21, boolean r22) {
        /*
            r15 = this;
            r0 = 0
            r1 = r19
            X.0qQ.A0B(r1, r0)
            r0 = 1
            r4 = r16
            X.0qQ.A0B(r4, r0)
            r0 = 2
            r3 = r17
            X.0qQ.A0B(r3, r0)
            r0 = 5
            r5 = r20
            X.0qQ.A0B(r5, r0)
            r0 = 6
            r6 = r21
            X.0qQ.A0B(r6, r0)
            java.lang.String r0 = "direct_v2_thread_id"
            java.lang.Object r12 = r1.get(r0)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x014c
            java.lang.String r2 = r3.A00
            if (r2 == 0) goto L_0x014c
            int r1 = r2.hashCode()
            r0 = -934610812(0xffffffffc84af884, float:-207842.06)
            r8 = r22
            if (r1 == r0) goto L_0x0082
            r0 = 96417(0x178a1, float:1.35109E-40)
            if (r1 == r0) goto L_0x0052
            r0 = 1094496948(0x413cb2b4, float:11.793629)
            if (r1 != r0) goto L_0x014c
            java.lang.String r0 = "replace"
        L_0x0043:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r5.invoke(r12, r4)
            if (r0 != 0) goto L_0x0055
            X.XPd r0 = X.C21215XPd.A00
            return r0
        L_0x0052:
            java.lang.String r0 = "add"
            goto L_0x0043
        L_0x0055:
            X.0c5 r2 = X.0c9.A04     // Catch:{ IOException -> 0x0073 }
            com.instagram.common.session.UserSession r1 = r15.A00     // Catch:{ IOException -> 0x0073 }
            java.lang.String r0 = r3.A02     // Catch:{ IOException -> 0x0073 }
            X.0qQ.A06(r0)     // Catch:{ IOException -> 0x0073 }
            X.0c9 r0 = r2.A01(r1, r0)     // Catch:{ IOException -> 0x0073 }
            X.5xS r1 = X.C300595xT.parseFromJson(r0)     // Catch:{ IOException -> 0x0073 }
            X.0qQ.A07(r1)     // Catch:{ IOException -> 0x0073 }
            X.2Dm r0 = r15.A01     // Catch:{ IOException -> 0x0073 }
            X.2Dr r0 = (X.2Dr) r0     // Catch:{ IOException -> 0x0073 }
            r0.A0M(r1, r8)     // Catch:{ IOException -> 0x0073 }
            X.6BL r0 = X.AnonymousClass6BL.A00     // Catch:{ IOException -> 0x0073 }
            return r0
        L_0x0073:
            r3 = move-exception
            r0 = 1
            java.lang.String r2 = "invalid_thread_metadata_format"
            java.lang.String r1 = "Invalid DirectThreadMetadataResult format"
            X.0wb.A05(r2, r1, r0, r3)
            X.6BQ r0 = new X.6BQ
            r0.<init>(r3, r2, r1)
            return r0
        L_0x0082:
            java.lang.String r0 = "remove"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r6.invoke(r12, r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0099
            X.XPc r0 = X.C21214XPc.A00
            return r0
        L_0x0099:
            r0 = 0
            com.instagram.model.direct.DirectThreadKey r7 = new com.instagram.model.direct.DirectThreadKey
            r7.<init>(r12, r0)
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x00b5
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b5 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x00b5 }
            java.lang.String r0 = "deletion_watermark_ms"
            long r4 = r1.getLong(r0)     // Catch:{ JSONException -> 0x00b5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ JSONException -> 0x00b5 }
            if (r0 == 0) goto L_0x00b5
            goto L_0x00b9
        L_0x00b5:
            long r4 = java.lang.System.currentTimeMillis()
        L_0x00b9:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r13 = r0.toMicros(r4)
            X.2Dm r6 = r15.A01
            r3 = r6
            X.2Dr r3 = (X.2Dr) r3
            X.3U9 r11 = r3.A0N(r12)
            if (r11 == 0) goto L_0x00da
            java.lang.Long r0 = r11.C6I()
            r9 = -1
            if (r0 == 0) goto L_0x00fd
            long r1 = r0.longValue()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x00fd
        L_0x00da:
            java.lang.String r1 = "cannot find threadJid: "
            java.lang.String r0 = " for deletion"
            java.lang.String r1 = X.002.A0g(r1, r12, r0)
            java.lang.String r0 = "NewThreadDeltaProcessor"
            X.0KC.A0C(r0, r1)
        L_0x00e7:
            X.3su r0 = r6.BLN(r7)
            if (r0 == 0) goto L_0x0143
            long r1 = r0.C7c()
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0143
            X.48S r6 = r3.A0P(r7)
            if (r6 == 0) goto L_0x0149
            monitor-enter(r6)
            goto L_0x010d
        L_0x00fd:
            X.0nO r1 = X.0nY.A00()
            X.0qQ.A07(r1)
            X.NSL r0 = new X.NSL
            r0.<init>(r11, r15, r4)
            r1.ATE(r0)
            goto L_0x00e7
        L_0x010d:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0140 }
            r5.<init>()     // Catch:{ all -> 0x0140 }
            java.util.List r0 = r6.A0K     // Catch:{ all -> 0x0140 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0140 }
        L_0x0118:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0140 }
            if (r0 == 0) goto L_0x0133
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0140 }
            X.3su r3 = (X.C254703su) r3     // Catch:{ all -> 0x0140 }
            long r1 = r3.C7c()     // Catch:{ all -> 0x0140 }
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0133
            r5.add(r3)     // Catch:{ all -> 0x0140 }
            r4.remove()     // Catch:{ all -> 0x0140 }
            goto L_0x0118
        L_0x0133:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0140 }
            if (r0 != 0) goto L_0x0148
            r6.A0U()     // Catch:{ all -> 0x0140 }
            X.AnonymousClass48S.A0D(r6, r5)     // Catch:{ all -> 0x0140 }
            goto L_0x0148
        L_0x0140:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0143:
            r0 = 0
            r6.EEl(r7, r8, r0)
            goto L_0x0149
        L_0x0148:
            monitor-exit(r6)
        L_0x0149:
            X.6BL r0 = X.AnonymousClass6BL.A00
            return r0
        L_0x014c:
            X.6BO r0 = X.AnonymousClass6BO.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2598543i.E4Y(X.651, X.653, java.util.List, java.util.Map, X.0sL, X.0sL, boolean):X.6BN");
    }
}
