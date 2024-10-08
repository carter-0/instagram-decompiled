package X;

/* renamed from: X.FFn  reason: case insensitive filesystem */
public final class C49934FFn {
    public static String A00;
    public static final C49934FFn A01 = new Object();

    public static final String A01(String str) {
        int length;
        if (!(str == null || (length = str.length()) == 0)) {
            int i = 0;
            while (i < length) {
                if (Character.isDigit(str.charAt(i))) {
                    i++;
                }
            }
            return str;
        }
        return "REDACTED_UID";
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, X.FGw] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, X.FGw] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Object, X.FGw] */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.Object, X.FGw] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r9 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r1 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r9 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        if (r1 != null) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.common.util.concurrent.ListenableFuture A00(X.0lg r11, X.C368108s5 r12, X.C368238sI r13) {
        /*
            int r7 = r12.ordinal()
            java.lang.String r3 = "lite_content_provider"
            java.lang.String r10 = "IGCrossAppAuthDataFetcher"
            r6 = 2
            r5 = 0
            r0 = 60
            java.lang.String r2 = X.C273654mx.A00(r0)
            r4 = 0
            r8 = r11
            if (r7 == r4) goto L_0x00c7
            if (r7 == r6) goto L_0x0091
            r0 = 6
            java.lang.String r1 = "ig_android_access_library_caa_aymh_fetch_msgr_local_auth"
            java.lang.String r9 = "ig_android_access_library_caa_aymh_fetch_msgr_active_token"
            if (r7 == r0) goto L_0x005e
            r0 = 7
            if (r7 != r0) goto L_0x0058
            int r0 = r13.ordinal()
            if (r0 == r4) goto L_0x002e
            if (r0 != r6) goto L_0x0033
            java.lang.String r9 = A00
            if (r9 != 0) goto L_0x0039
        L_0x002c:
            r9 = r1
            goto L_0x0039
        L_0x002e:
            java.lang.String r1 = A00
            if (r1 == 0) goto L_0x0039
            goto L_0x002c
        L_0x0033:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r2)
            throw r0
        L_0x0039:
            X.FGw r6 = new X.FGw     // Catch:{ Exception -> 0x004b }
            r6.<init>()     // Catch:{ Exception -> 0x004b }
            android.content.Context r7 = X.DbT.A04()     // Catch:{ Exception -> 0x004b }
            java.util.Set r11 = X.FAQ.A00(r3, r12, r13)     // Catch:{ Exception -> 0x004b }
            com.google.common.util.concurrent.ListenableFuture r0 = r6.A08(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x004b }
            return r0
        L_0x004b:
            r1 = move-exception
            java.lang.String r0 = "Failed to fetch Messenger accounts from lite provider"
            X.0KC.A0K(r10, r0, r1)
            X.0sn r0 = X.0sn.A00
            com.google.common.util.concurrent.ListenableFuture r0 = X.C255183ti.A03(r0)
            return r0
        L_0x0058:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r2)
            throw r0
        L_0x005e:
            int r0 = r13.ordinal()
            if (r0 == r4) goto L_0x006c
            if (r0 != r6) goto L_0x0071
            java.lang.String r9 = A00
            if (r9 != 0) goto L_0x0077
        L_0x006a:
            r9 = r1
            goto L_0x0077
        L_0x006c:
            java.lang.String r1 = A00
            if (r1 == 0) goto L_0x0077
            goto L_0x006a
        L_0x0071:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r2)
            throw r0
        L_0x0077:
            X.FGw r6 = new X.FGw     // Catch:{ Exception -> 0x00f8 }
            r6.<init>()     // Catch:{ Exception -> 0x00f8 }
            android.content.Context r7 = X.DbT.A04()     // Catch:{ Exception -> 0x00f8 }
            X.FAQ r0 = new X.FAQ     // Catch:{ Exception -> 0x00f8 }
            r0.<init>(r5, r5, r12, r13)     // Catch:{ Exception -> 0x00f8 }
            java.util.Set r11 = java.util.Collections.singleton(r0)     // Catch:{ Exception -> 0x00f8 }
            X.0qQ.A07(r11)     // Catch:{ Exception -> 0x00f8 }
            com.google.common.util.concurrent.ListenableFuture r0 = r6.A08(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00f8 }
            return r0
        L_0x0091:
            int r0 = r13.ordinal()
            if (r0 != r4) goto L_0x00c1
            java.lang.String r9 = "fb_msgr_ig_access_library_caa_aymh_fetch_fblite_active_access_token"
            X.FGw r6 = new X.FGw     // Catch:{ Exception -> 0x00b1 }
            r6.<init>()     // Catch:{ Exception -> 0x00b1 }
            android.content.Context r7 = X.DbT.A04()     // Catch:{ Exception -> 0x00b1 }
            r0 = 1223(0x4c7, float:1.714E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x00b1 }
            java.util.Set r11 = X.FAQ.A00(r0, r12, r13)     // Catch:{ Exception -> 0x00b1 }
            com.google.common.util.concurrent.ListenableFuture r0 = r6.A08(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00b1 }
            return r0
        L_0x00b1:
            r1 = move-exception
            java.lang.String r0 = "Failed to fetch Facebook Lite accounts from lite provider"
            X.0KC.A0K(r10, r0, r1)
            X.0sn r0 = X.0sn.A00
            com.google.common.util.concurrent.ListenableFuture r0 = X.C255183ti.A03(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x00c1:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r2)
            throw r0
        L_0x00c7:
            int r0 = r13.ordinal()
            if (r0 == r4) goto L_0x00dc
            if (r0 != r6) goto L_0x00d6
            java.lang.String r9 = A00
            if (r9 != 0) goto L_0x00e2
            java.lang.String r9 = "ig_android_access_library_caa_aymh_fetch_fb_local_auth"
            goto L_0x00e2
        L_0x00d6:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r2)
            throw r0
        L_0x00dc:
            java.lang.String r9 = A00
            if (r9 != 0) goto L_0x00e2
            java.lang.String r9 = "ig_android_access_library_caa_aymh_fetch_fb_active_token"
        L_0x00e2:
            X.FGw r6 = new X.FGw     // Catch:{ Exception -> 0x00f4 }
            r6.<init>()     // Catch:{ Exception -> 0x00f4 }
            android.content.Context r7 = X.DbT.A04()     // Catch:{ Exception -> 0x00f4 }
            java.util.Set r11 = X.FAQ.A00(r3, r12, r13)     // Catch:{ Exception -> 0x00f4 }
            com.google.common.util.concurrent.ListenableFuture r0 = r6.A08(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00f4 }
            return r0
        L_0x00f4:
            r1 = move-exception
            java.lang.String r0 = "Failed to fetch Facebook accounts from lite provider"
            goto L_0x00fb
        L_0x00f8:
            r1 = move-exception
            java.lang.String r0 = "Failed to fetch Messenger accounts from legacy provider"
        L_0x00fb:
            X.0KC.A0K(r10, r0, r1)
            X.0sn r0 = X.0sn.A00
            com.google.common.util.concurrent.ListenableFuture r0 = X.C255183ti.A03(r0)
            X.0qQ.A0A(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49934FFn.A00(X.0lg, X.8s5, X.8sI):com.google.common.util.concurrent.ListenableFuture");
    }
}
