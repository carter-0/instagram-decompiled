package com.facebook.messaging.encryptedbackups.gdrive.flow;

import X.0qQ;
import X.1HR;
import X.C10979S3n;
import X.C11621SdP;
import X.C13264TSf;
import X.C249513ju;
import X.C69702NqO;
import X.C8366QpO;
import X.L1F;
import X.N04;
import java.util.concurrent.CancellationException;

public final class GoogleAuthController {
    public C11621SdP A00;
    public L1F A01;
    public C8366QpO A02;
    public final C249513ju A03 = new 1HR(0);
    public final C69702NqO A04;

    public GoogleAuthController(C69702NqO nqO) {
        0qQ.A0B(nqO, 1);
        this.A04 = nqO;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f9, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.1zE.A00(r1, r0);
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x009b=Splitter:B:20:0x009b, B:33:0x00cf=Splitter:B:33:0x00cf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C69551Nnv A01(android.content.Context r10, com.google.android.gms.auth.api.identity.AuthorizationResult r11) {
        /*
            r9 = this;
            r4 = 0
            X.S3n r2 = new X.S3n
            r2.<init>()
            java.lang.String r3 = r11.A03     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            if (r3 == 0) goto L_0x0143
            java.util.List r1 = r11.A04     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            java.lang.String r0 = "https://www.googleapis.com/auth/drive.appdata"
            boolean r0 = r1.contains(r0)     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            if (r0 == 0) goto L_0x013d
            X.0qQ.A0B(r10, r4)     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            X.STr.A06(r10, r3)     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            X.0qQ.A0B(r3, r4)     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            X.SIw r0 = new X.SIw     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            r0.<init>(r3)     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            X.S5E r6 = new X.S5E     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            r6.<init>(r0)     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            r8 = 0
            X.S3n r3 = new X.S3n     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            r3.<init>()     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            java.lang.String r1 = "https://www.googleapis.com/oauth2/v1/userinfo"
            java.net.URL r0 = new java.net.URL     // Catch:{ TSf -> 0x010f, all -> 0x0107 }
            r0.<init>(r1)     // Catch:{ TSf -> 0x010f, all -> 0x0107 }
            java.net.URLConnection r7 = r0.openConnection()     // Catch:{ IOException | JSONException -> 0x00fe }
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.0qQ.A0C(r7, r0)     // Catch:{ IOException | JSONException -> 0x00fe }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ IOException | JSONException -> 0x00fe }
            java.lang.String r0 = "GET"
            r7.setRequestMethod(r0)     // Catch:{ IOException | JSONException -> 0x00fe }
            r7.setUseCaches(r4)     // Catch:{ IOException | JSONException -> 0x00fe }
            r0 = 1
            r7.setDoInput(r0)     // Catch:{ IOException | JSONException -> 0x00fe }
            r7.setDoOutput(r4)     // Catch:{ IOException | JSONException -> 0x00fe }
            r0 = 2105(0x839, float:2.95E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException | JSONException -> 0x00fe }
            java.lang.String r4 = "Bearer "
            X.PwC r1 = X.C74517PwC.A00     // Catch:{ IOException | JSONException -> 0x00fe }
            X.0qQ.A08(r1)     // Catch:{ IOException | JSONException -> 0x00fe }
            X.SIw r1 = r6.A00     // Catch:{ IOException | JSONException -> 0x00fe }
            java.lang.String r1 = r1.A00     // Catch:{ IOException | JSONException -> 0x00fe }
            r1.getClass()     // Catch:{ IOException | JSONException -> 0x00fe }
            java.lang.String r1 = X.002.A0R(r4, r1)     // Catch:{ IOException | JSONException -> 0x00fe }
            r7.setRequestProperty(r0, r1)     // Catch:{ IOException | JSONException -> 0x00fe }
            r7.getResponseCode()     // Catch:{ IOException | JSONException -> 0x00fe }
            int r1 = r7.getResponseCode()     // Catch:{ IOException | JSONException -> 0x00fe }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0076
            r8 = 1
        L_0x0076:
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r8 != 0) goto L_0x00b4
            int r8 = r7.getResponseCode()     // Catch:{ IOException | JSONException -> 0x00fe }
            r6 = 58
            java.io.InputStream r4 = r7.getErrorStream()     // Catch:{ IOException | JSONException -> 0x00fe }
            X.0qQ.A07(r4)     // Catch:{ IOException | JSONException -> 0x00fe }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ IOException | JSONException -> 0x00fe }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException | JSONException -> 0x00fe }
            r1.<init>(r4, r0)     // Catch:{ IOException | JSONException -> 0x00fe }
            boolean r0 = r1 instanceof java.io.BufferedReader     // Catch:{ IOException | JSONException -> 0x00fe }
            if (r0 == 0) goto L_0x0095
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch:{ IOException | JSONException -> 0x00fe }
            goto L_0x009b
        L_0x0095:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException | JSONException -> 0x00fe }
            r0.<init>(r1, r5)     // Catch:{ IOException | JSONException -> 0x00fe }
            r1 = r0
        L_0x009b:
            java.lang.String r0 = X.1r9.A00(r1)     // Catch:{ all -> 0x00f7 }
            if (r1 == 0) goto L_0x00a4
            r1.close()     // Catch:{ IOException | JSONException -> 0x00fe }
        L_0x00a4:
            java.lang.String r0 = X.002.A0H(r0, r6, r8)     // Catch:{ IOException | JSONException -> 0x00fe }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException | JSONException -> 0x00fe }
            r3.A01(r0)     // Catch:{ IOException | JSONException -> 0x00fe }
            X.00P r4 = X.AnonymousClass00P.createAndThrow()
            goto L_0x00fd
        L_0x00b4:
            r0 = -2108319039(0xffffffff82559ac1, float:-1.5693181E-37)
            X.0fV r4 = X.0fi.A00(r7, r0)     // Catch:{ IOException | JSONException -> 0x00fe }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ IOException | JSONException -> 0x00fe }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException | JSONException -> 0x00fe }
            r1.<init>(r4, r0)     // Catch:{ IOException | JSONException -> 0x00fe }
            boolean r0 = r1 instanceof java.io.BufferedReader     // Catch:{ IOException | JSONException -> 0x00fe }
            if (r0 == 0) goto L_0x00c9
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch:{ IOException | JSONException -> 0x00fe }
            goto L_0x00cf
        L_0x00c9:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException | JSONException -> 0x00fe }
            r0.<init>(r1, r5)     // Catch:{ IOException | JSONException -> 0x00fe }
            r1 = r0
        L_0x00cf:
            java.lang.String r0 = X.1r9.A00(r1)     // Catch:{ all -> 0x00f7 }
            if (r1 == 0) goto L_0x00d8
            r1.close()     // Catch:{ IOException | JSONException -> 0x00fe }
        L_0x00d8:
            org.json.JSONObject r1 = X.C66580MXl.A17(r0)     // Catch:{ IOException | JSONException -> 0x00fe }
            java.lang.String r0 = "email"
            r1.getString(r0)     // Catch:{ IOException | JSONException -> 0x00fe }
            java.lang.String r0 = "id"
            r1.getString(r0)     // Catch:{ IOException | JSONException -> 0x00fe }
            r7.disconnect()     // Catch:{ IOException | JSONException -> 0x00fe }
            X.O5e r0 = new X.O5e     // Catch:{ IOException | JSONException -> 0x00fe }
            r0.<init>(r6)     // Catch:{ IOException | JSONException -> 0x00fe }
            r3.A00()     // Catch:{ TSf -> 0x010f, all -> 0x0107 }
            X.N05 r1 = new X.N05     // Catch:{ TSf -> 0x010f, all -> 0x0107 }
            r1.<init>(r0)     // Catch:{ TSf -> 0x010f, all -> 0x0107 }
            goto L_0x0114
        L_0x00f7:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r4 = move-exception
            X.1zE.A00(r1, r0)     // Catch:{ IOException | JSONException -> 0x00fe }
        L_0x00fd:
            throw r4     // Catch:{ IOException | JSONException -> 0x00fe }
        L_0x00fe:
            r0 = move-exception
            r3.A01(r0)     // Catch:{ TSf -> 0x010f, all -> 0x0107 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ TSf -> 0x010f, all -> 0x0107 }
            throw r0     // Catch:{ TSf -> 0x010f, all -> 0x0107 }
        L_0x0107:
            r0 = move-exception
            r3.A00()     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            X.RSG.A00(r0)     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            goto L_0x0151
        L_0x010f:
            r0 = move-exception
            X.N04 r1 = A00(r3, r0)     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
        L_0x0114:
            boolean r0 = r1 instanceof X.N05     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            if (r0 == 0) goto L_0x0130
            X.N05 r1 = (X.N05) r1     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            java.lang.Object r0 = r1.A00     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            X.N05 r1 = new X.N05     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            r1.<init>(r0)     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
        L_0x0121:
            java.lang.Object r1 = X.RSH.A00(r1, r2)     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            X.O5e r1 = (X.C70402O5e) r1     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            r2.A00()     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            X.N05 r0 = new X.N05     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            r0.<init>(r1)     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            goto L_0x013c
        L_0x0130:
            boolean r0 = r1 instanceof X.N04     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            if (r0 == 0) goto L_0x014d
            X.OnY r0 = X.C71597OnY.A00     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            X.N04 r1 = new X.N04     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            r1.<init>(r0)     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            goto L_0x0121
        L_0x013c:
            return r0
        L_0x013d:
            X.OnX r0 = X.C71596OnX.A00     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            r2.A01(r0)     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            goto L_0x0148
        L_0x0143:
            X.OnZ r0 = X.C71598OnZ.A00     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
            r2.A01(r0)     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
        L_0x0148:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0151
        L_0x014d:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
        L_0x0151:
            throw r0     // Catch:{ TSf -> 0x015a, all -> 0x0152 }
        L_0x0152:
            r0 = move-exception
            r2.A00()
            X.RSG.A00(r0)
            throw r0
        L_0x015a:
            r0 = move-exception
            X.N04 r0 = A00(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A01(android.content.Context, com.google.android.gms.auth.api.identity.AuthorizationResult):X.Nnv");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012b, code lost:
        if (r1 == null) goto L_0x012d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b1 A[Catch:{ all -> 0x00fc, TSf -> 0x014e, all -> 0x0146 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(androidx.activity.result.ActivityResult r7, android.content.Context r8, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 6
            boolean r0 = X.ME0.A02(r3, r10)
            if (r0 == 0) goto L_0x002d
            r6 = r10
            X.ME0 r6 = (X.ME0) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A05
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 != r4) goto L_0x0033
            java.lang.Object r5 = r6.A03
            X.S3n r5 = (X.C10979S3n) r5
            java.lang.Object r8 = r6.A02
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r2 = r6.A01
            X.S3n r2 = (X.C10979S3n) r2
            goto L_0x00a1
        L_0x002d:
            X.ME0 r6 = new X.ME0
            r6.<init>(r9, r10, r3)
            goto L_0x0015
        L_0x0033:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0038:
            X.0eS.A00(r1)
            X.S3n r2 = new X.S3n
            r2.<init>()
            int r3 = r7.A00     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r0 = -1
            if (r3 == r0) goto L_0x0068
            if (r3 != 0) goto L_0x0116
            android.content.Intent r0 = r7.A01     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            if (r0 == 0) goto L_0x0064
            X.SxE r0 = X.SQR.A01(r0)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            com.google.android.gms.common.api.Status r3 = r0.A01     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            int r1 = r3.A00     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r0 = 5
            if (r1 == r0) goto L_0x0060
            r0 = 16
            if (r1 == r0) goto L_0x0060
            r0 = 12501(0x30d5, float:1.7518E-41)
            if (r1 != r0) goto L_0x012d
            goto L_0x0127
        L_0x0060:
            X.OnW r1 = X.C71595OnW.A00     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            goto L_0x0129
        L_0x0064:
            X.OnY r1 = X.C71597OnY.A00     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            goto L_0x0137
        L_0x0068:
            android.content.Intent r0 = r7.A01     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            if (r0 == 0) goto L_0x0114
            X.SxE r0 = X.SQR.A01(r0)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r3 = r0.A00     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            com.google.android.gms.common.api.Status r1 = r0.A01     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            int r0 = r1.A00     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            if (r0 > 0) goto L_0x0083
            if (r3 == 0) goto L_0x0083
            X.9GD r1 = new X.9GD     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r1.<init>()     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r1.A0C(r3)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            goto L_0x008f
        L_0x0083:
            X.RKT r0 = X.C9698RfG.A00(r1)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            X.9GD r1 = new X.9GD     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r1.<init>()     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r1.A0B(r0)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
        L_0x008f:
            r6.A01 = r2     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r6.A02 = r8     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r6.A03 = r2     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r6.A04 = r9     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r6.A00 = r4     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            java.lang.Object r1 = X.C9882Riv.A00(r1, r6)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            if (r1 == r5) goto L_0x0153
            r5 = r2
            goto L_0x00a4
        L_0x00a1:
            X.0eS.A00(r1)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
        L_0x00a4:
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r1     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r0 = 0
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x00fc }
            X.0qQ.A0B(r8, r4)     // Catch:{ all -> 0x00fc }
            java.lang.String r4 = r1.A06     // Catch:{ all -> 0x00fc }
            if (r4 == 0) goto L_0x00ed
            java.lang.String r3 = "com.google"
            android.accounts.Account r0 = new android.accounts.Account     // Catch:{ all -> 0x00fc }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = "oauth2:https://www.googleapis.com/auth/drive.appdata"
            java.lang.String r0 = X.STr.A02(r0, r8, r1)     // Catch:{ all -> 0x00fc }
            if (r0 == 0) goto L_0x00c4
            X.STr.A06(r8, r0)     // Catch:{ all -> 0x00fc }
        L_0x00c4:
            android.accounts.Account r0 = new android.accounts.Account     // Catch:{ all -> 0x00fc }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = X.STr.A02(r0, r8, r1)     // Catch:{ all -> 0x00fc }
            if (r1 == 0) goto L_0x00ed
            int r0 = r1.length()     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            if (r0 == 0) goto L_0x00ed
            X.SIw r0 = new X.SIw     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r0.<init>(r1)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            X.S5E r1 = new X.S5E     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r1.<init>(r0)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            X.O5e r0 = new X.O5e     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r0.<init>(r1)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r2.A00()     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            X.N05 r5 = new X.N05     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r5.<init>(r0)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            return r5
        L_0x00ed:
            X.OnZ r1 = X.C71598OnZ.A00     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            X.QP3 r0 = new X.QP3     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r0.<init>((X.C74223PrB) r1)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r5.A01(r0)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0113
        L_0x00fc:
            r1 = move-exception
            X.RSG.A00(r1)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            boolean r0 = r1 instanceof com.google.android.gms.auth.UserRecoverableAuthException     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            if (r0 == 0) goto L_0x0113
            com.google.android.gms.auth.UserRecoverableAuthException r1 = (com.google.android.gms.auth.UserRecoverableAuthException) r1     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            X.QP3 r0 = new X.QP3     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r0.<init>((com.google.android.gms.auth.UserRecoverableAuthException) r1)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r5.A01(r0)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            throw r0     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
        L_0x0113:
            throw r1     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
        L_0x0114:
            r3 = 0
            goto L_0x0121
        L_0x0116:
            java.lang.String r0 = "GoogleDrive result code: "
            java.lang.String r1 = X.002.A0O(r0, r3)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            java.lang.String r0 = "GoogleAuthController"
            X.0KC.A0D(r0, r1)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
        L_0x0121:
            X.N4u r1 = new X.N4u     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r1.<init>(r3)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            goto L_0x0139
        L_0x0127:
            X.Ona r1 = X.C71599Ona.A00     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
        L_0x0129:
            X.PrB r1 = (X.C74223PrB) r1     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            if (r1 != 0) goto L_0x0139
        L_0x012d:
            X.RKT r0 = new X.RKT     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r0.<init>(r3)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            X.N4v r1 = new X.N4v     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r1.<init>((X.RKT) r0)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
        L_0x0137:
            X.PrB r1 = (X.C74223PrB) r1     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
        L_0x0139:
            X.QP3 r0 = new X.QP3     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r0.<init>((X.C74223PrB) r1)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            r2.A01(r0)     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
            throw r0     // Catch:{ TSf -> 0x014e, all -> 0x0146 }
        L_0x0146:
            r0 = move-exception
            r2.A00()
            X.RSG.A00(r0)
            throw r0
        L_0x014e:
            r0 = move-exception
            X.N04 r5 = A00(r2, r0)
        L_0x0153:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A02(androidx.activity.result.ActivityResult, androidx.fragment.app.FragmentActivity, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060 A[Catch:{ TSf -> 0x0110, all -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dc A[Catch:{ TSf -> 0x0110, all -> 0x0150 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(androidx.fragment.app.FragmentActivity r12, X.C10979S3n r13, X.C13422Ta8 r14, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r15, X.AnonymousClass4D7 r16) {
        /*
            r3 = 8
            r4 = r16
            boolean r0 = X.ME0.A02(r3, r4)
            if (r0 == 0) goto L_0x0149
            r5 = r4
            X.ME0 r5 = (X.ME0) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0149
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r5.A05
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x00e9
            if (r0 != r3) goto L_0x0158
            java.lang.Object r13 = r5.A04
            X.S3n r13 = (X.C10979S3n) r13
            java.lang.Object r2 = r5.A03
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r12 = r5.A02
            androidx.fragment.app.FragmentActivity r12 = (androidx.fragment.app.FragmentActivity) r12
            java.lang.Object r6 = r5.A01
            X.S3n r6 = (X.C10979S3n) r6
            X.0eS.A00(r1)
        L_0x0036:
            X.Nnv r1 = (X.C69551Nnv) r1
            java.lang.Object r0 = X.RSH.A00(r1, r13)
            androidx.activity.result.ActivityResult r0 = (androidx.activity.result.ActivityResult) r0
            r7 = 0
            X.S3n r8 = new X.S3n
            r8.<init>()
            android.content.Intent r10 = r0.A01     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.0qQ.A0B(r12, r7)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.63K r11 = X.C8365QpN.A00     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            java.lang.String r0 = X.C11139SBu.A00()     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.AnonymousClass3Qk.A04(r0)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.Sx1 r9 = new X.Sx1     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            r9.<init>(r0)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.63N r1 = X.AnonymousClass63N.A02     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.QpN r0 = new X.QpN     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            r0.<init>((android.content.Context) r12, (X.AnonymousClass63L) r9, (X.AnonymousClass63K) r11, (X.AnonymousClass63N) r1)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            if (r10 == 0) goto L_0x00dc
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.api.Status.CREATOR     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            java.lang.String r0 = "status"
            byte[] r0 = r10.getByteArrayExtra(r0)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            if (r0 != 0) goto L_0x006d
            r9 = 0
            goto L_0x0071
        L_0x006d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.A00(r1, r0)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
        L_0x0071:
            com.google.android.gms.common.api.Status r9 = (com.google.android.gms.common.api.Status) r9     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            if (r9 == 0) goto L_0x00d4
            int r0 = r9.A00     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            if (r0 > 0) goto L_0x00ce
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.identity.AuthorizationResult.CREATOR     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            java.lang.String r0 = "authorization_result"
            byte[] r0 = r10.getByteArrayExtra(r0)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            if (r0 != 0) goto L_0x0085
            r1 = 0
            goto L_0x0089
        L_0x0085:
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.A00(r1, r0)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
        L_0x0089:
            com.google.android.gms.auth.api.identity.AuthorizationResult r1 = (com.google.android.gms.auth.api.identity.AuthorizationResult) r1     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            if (r1 == 0) goto L_0x00c6
            java.lang.Object r0 = r2.A00     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r0 = (com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController) r0     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.Nnv r1 = r0.A01(r12, r1)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            boolean r0 = r1 instanceof X.N05     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            if (r0 == 0) goto L_0x00b1
            X.N05 r1 = (X.N05) r1     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            java.lang.Object r1 = r1.A00     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.N05 r0 = new X.N05     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            r0.<init>(r1)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
        L_0x00a2:
            java.lang.Object r0 = X.RSH.A00(r0, r8)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.O5e r0 = (X.C70402O5e) r0     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            r8.A00()     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.N05 r1 = new X.N05     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            r1.<init>(r0)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            goto L_0x0115
        L_0x00b1:
            boolean r0 = r1 instanceof X.N04     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            if (r0 == 0) goto L_0x00e4
            X.N04 r1 = (X.N04) r1     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            java.lang.Object r0 = r1.A00     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.PrB r0 = (X.C74223PrB) r0     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.QP3 r1 = new X.QP3     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            r1.<init>((X.C74223PrB) r0)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.N04 r0 = new X.N04     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            r0.<init>(r1)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            goto L_0x00a2
        L_0x00c6:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.A06     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.RKT r1 = new X.RKT     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            r1.<init>(r0)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            goto L_0x00e8
        L_0x00ce:
            X.RKT r1 = new X.RKT     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            r1.<init>(r9)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            goto L_0x00e8
        L_0x00d4:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.A04     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.RKT r1 = new X.RKT     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            r1.<init>(r0)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            goto L_0x00e8
        L_0x00dc:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.A06     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            X.RKT r1 = new X.RKT     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            r1.<init>(r0)     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
            goto L_0x00e8
        L_0x00e4:
            X.Wub r1 = X.AnonymousClass7TE.A1K()     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
        L_0x00e8:
            throw r1     // Catch:{ TSf -> 0x0110, all -> 0x0150 }
        L_0x00e9:
            X.0eS.A00(r1)
            X.0rm r2 = X.C51965G9l.A11()
            r2.A00 = r15
        L_0x00f2:
            X.4Cc r0 = r5.getContext()
            X.C64871Wv.A02(r0)
            java.lang.Object r0 = r2.A00
            com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r0 = (com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController) r0
            r5.A01 = r13
            r5.A02 = r12
            r5.A03 = r2
            r5.A04 = r13
            r5.A00 = r3
            java.lang.Object r1 = A06(r12, r14, r0, r5)
            if (r1 == r4) goto L_0x011d
            r6 = r13
            goto L_0x0036
        L_0x0110:
            r0 = move-exception
            X.N04 r1 = A00(r8, r0)
        L_0x0115:
            boolean r0 = r1 instanceof X.N05
            if (r0 == 0) goto L_0x011e
            X.N05 r1 = (X.N05) r1
            java.lang.Object r4 = r1.A00
        L_0x011d:
            return r4
        L_0x011e:
            boolean r0 = r1 instanceof X.N04
            if (r0 == 0) goto L_0x016f
            X.N04 r1 = (X.N04) r1
            java.lang.Object r1 = r1.A00
            X.QP3 r1 = (X.QP3) r1
            boolean r0 = X.QP3.A00(r7, r1)
            if (r0 != 0) goto L_0x0165
            boolean r0 = X.QP3.A00(r3, r1)
            if (r0 == 0) goto L_0x0160
            java.lang.Object r0 = r1.A01
            com.google.android.gms.auth.UserRecoverableAuthException r0 = (com.google.android.gms.auth.UserRecoverableAuthException) r0
            android.content.Intent r1 = r0.A00()
            if (r1 == 0) goto L_0x015d
            java.lang.Object r0 = r2.A00
            X.QPa r14 = new X.QPa
            r14.<init>(r1, r3)
            r2.A00 = r0
            r13 = r6
            goto L_0x00f2
        L_0x0149:
            X.ME0 r5 = new X.ME0
            r5.<init>(r15, r4, r3)
            goto L_0x0018
        L_0x0150:
            r0 = move-exception
            r8.A00()
            X.RSG.A00(r0)
            throw r0
        L_0x0158:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x015d:
            X.OnY r0 = X.C71597OnY.A00
            goto L_0x0167
        L_0x0160:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0165:
            java.lang.Object r0 = r1.A01
        L_0x0167:
            r6.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x016f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A03(androidx.fragment.app.FragmentActivity, X.S3n, X.Ta8, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (r8 != r7) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(androidx.fragment.app.FragmentActivity r9, X.C10979S3n r10, X.C13422Ta8 r11, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r12, X.AnonymousClass4D7 r13) {
        /*
            r3 = 9
            boolean r0 = X.ME0.A02(r3, r13)
            if (r0 == 0) goto L_0x00c3
            r6 = r13
            X.ME0 r6 = (X.ME0) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c3
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r8 = r6.A05
            X.1Hj r7 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 3
            r1 = 2
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x002c
            if (r0 == r4) goto L_0x0048
            if (r0 == r1) goto L_0x0074
            if (r0 != r5) goto L_0x00ca
            X.0eS.A00(r8)
        L_0x002b:
            return r8
        L_0x002c:
            X.0eS.A00(r8)
            X.4Cc r0 = r6.getContext()
            X.C64871Wv.A02(r0)
            r6.A01 = r12
            r6.A02 = r10
            r6.A03 = r9
            r6.A04 = r10
            r6.A00 = r4
            java.lang.Object r8 = A06(r9, r11, r12, r6)
            if (r8 == r7) goto L_0x0073
            r2 = r10
            goto L_0x005b
        L_0x0048:
            java.lang.Object r10 = r6.A04
            X.S3n r10 = (X.C10979S3n) r10
            java.lang.Object r9 = r6.A03
            androidx.fragment.app.FragmentActivity r9 = (androidx.fragment.app.FragmentActivity) r9
            java.lang.Object r2 = r6.A02
            X.S3n r2 = (X.C10979S3n) r2
            java.lang.Object r12 = r6.A01
            com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r12 = (com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController) r12
            X.0eS.A00(r8)
        L_0x005b:
            X.Nnv r8 = (X.C69551Nnv) r8
            java.lang.Object r0 = X.RSH.A00(r8, r10)
            androidx.activity.result.ActivityResult r0 = (androidx.activity.result.ActivityResult) r0
            r6.A01 = r12
            r6.A02 = r2
            r6.A03 = r9
            r6.A04 = r3
            r6.A00 = r1
            java.lang.Object r8 = A02(r0, r9, r12, r6)
            if (r8 != r7) goto L_0x0083
        L_0x0073:
            return r7
        L_0x0074:
            java.lang.Object r9 = r6.A03
            androidx.fragment.app.FragmentActivity r9 = (androidx.fragment.app.FragmentActivity) r9
            java.lang.Object r2 = r6.A02
            X.S3n r2 = (X.C10979S3n) r2
            java.lang.Object r12 = r6.A01
            com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r12 = (com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController) r12
            X.0eS.A00(r8)
        L_0x0083:
            X.Nnv r8 = (X.C69551Nnv) r8
            boolean r0 = r8 instanceof X.N05
            if (r0 == 0) goto L_0x008e
            X.N05 r8 = (X.N05) r8
            java.lang.Object r7 = r8.A00
            return r7
        L_0x008e:
            boolean r0 = r8 instanceof X.N04
            if (r0 == 0) goto L_0x00e1
            X.N04 r8 = (X.N04) r8
            java.lang.Object r1 = r8.A00
            X.QP3 r1 = (X.QP3) r1
            r0 = 0
            boolean r0 = X.QP3.A00(r0, r1)
            if (r0 != 0) goto L_0x00d7
            boolean r0 = X.QP3.A00(r4, r1)
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r0 = r1.A01
            com.google.android.gms.auth.UserRecoverableAuthException r0 = (com.google.android.gms.auth.UserRecoverableAuthException) r0
            android.content.Intent r1 = r0.A00()
            if (r1 == 0) goto L_0x00cf
            X.QPa r0 = new X.QPa
            r0.<init>(r1, r4)
            r6.A01 = r3
            r6.A02 = r3
            r6.A03 = r3
            r6.A00 = r5
            java.lang.Object r8 = A03(r9, r2, r0, r12, r6)
            if (r8 != r7) goto L_0x002b
            return r7
        L_0x00c3:
            X.ME0 r6 = new X.ME0
            r6.<init>(r12, r13, r3)
            goto L_0x0016
        L_0x00ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00cf:
            X.OnY r0 = X.C71597OnY.A00
            goto L_0x00d9
        L_0x00d2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d7:
            java.lang.Object r0 = r1.A01
        L_0x00d9:
            r2.A01(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A04(androidx.fragment.app.FragmentActivity, X.S3n, X.Ta8, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.63P, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v17, types: [X.QpO, X.63E] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A05(androidx.fragment.app.FragmentActivity r11, X.C10979S3n r12, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r13, X.AnonymousClass4D7 r14, boolean r15) {
        /*
            r3 = 12
            boolean r0 = X.MED.A04(r3, r14)
            if (r0 == 0) goto L_0x00da
            r5 = r14
            X.MED r5 = (X.MED) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00da
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            java.lang.String r10 = "googleSignInClient"
            r4 = 2
            r8 = 1
            r3 = 0
            if (r0 == 0) goto L_0x002b
            if (r0 == r8) goto L_0x0080
            if (r0 != r4) goto L_0x00e1
            X.0eS.A00(r1)
        L_0x002a:
            return r1
        L_0x002b:
            X.0eS.A00(r1)
            r9 = 0
            X.0qQ.A0B(r11, r9)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.A0C
            X.SHp r7 = new X.SHp
            r7.<init>(r0)
            java.util.Set r2 = r7.A02
            com.google.android.gms.common.api.Scope r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.A0E
            r2.add(r0)
            java.lang.String r0 = "https://www.googleapis.com/auth/drive.appdata"
            com.google.android.gms.common.api.Scope r1 = new com.google.android.gms.common.api.Scope
            r1.<init>(r8, r0)
            com.google.android.gms.common.api.Scope[] r0 = new com.google.android.gms.common.api.Scope[r9]
            r2.add(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r2.addAll(r0)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r7 = r7.A00()
            X.AnonymousClass3Qk.A02(r7)
            X.63K r2 = X.C10136RnD.A05
            X.63O r1 = new X.63O
            r1.<init>()
            X.QpO r0 = new X.QpO
            r0.<init>((android.app.Activity) r11, (X.AnonymousClass63L) r7, (X.AnonymousClass63K) r2, (X.AnonymousClass63P) r1)
            r13.A02 = r0
            if (r15 == 0) goto L_0x008f
            X.9GD r0 = r0.A03()
            X.0qQ.A07(r0)
            r5.A01 = r13
            r5.A02 = r12
            r5.A03 = r11
            r5.A00 = r8
            java.lang.Object r0 = X.C9882Riv.A00(r0, r5)
            if (r0 != r6) goto L_0x008f
            return r6
        L_0x0080:
            java.lang.Object r11 = r5.A03
            androidx.fragment.app.FragmentActivity r11 = (androidx.fragment.app.FragmentActivity) r11
            java.lang.Object r12 = r5.A02
            X.S3n r12 = (X.C10979S3n) r12
            java.lang.Object r13 = r5.A01
            com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r13 = (com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController) r13
            X.0eS.A00(r1)
        L_0x008f:
            X.QpO r8 = r13.A02
            if (r8 != 0) goto L_0x009b
            X.0qQ.A0F(r10)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x009b:
            android.content.Context r7 = r8.A01
            int r0 = X.C8366QpO.A02(r8)
            int r2 = r0 + -1
            if (r2 == r4) goto L_0x00cf
            r1 = 3
            X.63L r0 = r8.A03
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r0
            if (r2 == r1) goto L_0x00ca
            android.content.Intent r2 = X.SQR.A00(r7, r0)
            java.lang.String r0 = "com.google.android.gms.auth.NO_IMPL"
        L_0x00b2:
            r2.setAction(r0)
        L_0x00b5:
            r1 = 0
            X.QPa r0 = new X.QPa
            r0.<init>(r2, r1)
            r5.A01 = r3
            r5.A02 = r3
            r5.A03 = r3
            r5.A00 = r4
            java.lang.Object r1 = A04(r11, r12, r0, r13, r5)
            if (r1 != r6) goto L_0x002a
            return r6
        L_0x00ca:
            android.content.Intent r2 = X.SQR.A00(r7, r0)
            goto L_0x00b5
        L_0x00cf:
            X.63L r0 = r8.A03
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r0
            android.content.Intent r2 = X.SQR.A00(r7, r0)
            java.lang.String r0 = "com.google.android.gms.auth.APPAUTH_SIGN_IN"
            goto L_0x00b2
        L_0x00da:
            X.MED r5 = new X.MED
            r5.<init>(r13, r14, r3)
            goto L_0x0016
        L_0x00e1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A05(androidx.fragment.app.FragmentActivity, X.S3n, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00be A[Catch:{ TSf -> 0x00e4, all -> 0x00dc }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A06(androidx.fragment.app.FragmentActivity r11, X.C13422Ta8 r12, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r13, X.AnonymousClass4D7 r14) {
        /*
            r8 = 13
            boolean r0 = X.C66146MDy.A02(r8, r14)
            if (r0 == 0) goto L_0x002d
            r6 = r14
            X.MDy r6 = (X.C66146MDy) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r6.A03
            X.1Hj r7 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 3
            r10 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r1) goto L_0x0038
            if (r0 == r10) goto L_0x0038
            if (r0 != r5) goto L_0x0033
            java.lang.Object r4 = r6.A02
            X.S3n r4 = (X.C10979S3n) r4
            goto L_0x00bf
        L_0x002d:
            X.MDy r6 = new X.MDy
            r6.<init>(r13, r14, r8)
            goto L_0x0016
        L_0x0033:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0038:
            java.lang.Object r4 = r6.A02
            X.S3n r4 = (X.C10979S3n) r4
            java.lang.Object r13 = r6.A01
            com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r13 = (com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController) r13
            goto L_0x00ad
        L_0x0041:
            X.0eS.A00(r2)
            r2 = 0
            X.S3n r4 = new X.S3n
            r4.<init>()
            X.SdP r9 = r13.A00     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            if (r9 == 0) goto L_0x00cd
            boolean r0 = r12 instanceof X.QPa     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            if (r0 == 0) goto L_0x0079
            X.QPa r12 = (X.QPa) r12     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            boolean r0 = r12.A01     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            if (r0 != 0) goto L_0x0061
            X.L1F r0 = r13.A01     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            if (r0 == 0) goto L_0x0061
            X.KQc r0 = r0.A00     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r0.A0F()     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
        L_0x0061:
            android.content.Intent r8 = r12.A00     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r6.A01 = r13     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r6.A02 = r4     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r6.A00 = r1     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            X.07U r3 = X.07U.A05     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r2 = 0
            r0 = 12
            X.JTi r1 = new X.JTi     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r1.<init>(r8, r9, r2, r0)     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            X.19B r0 = X.19B.A00     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            X.C63499KyA.A00(r3, r11, r0, r1)     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            goto L_0x00b0
        L_0x0079:
            boolean r0 = r12 instanceof X.QPZ     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            if (r0 == 0) goto L_0x00d7
            X.L1F r0 = r13.A01     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            if (r0 == 0) goto L_0x0086
            X.KQc r0 = r0.A00     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r0.A0F()     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
        L_0x0086:
            X.QPZ r12 = (X.QPZ) r12     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            android.app.PendingIntent r0 = r12.A00     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r3 = 0
            X.0qQ.A0B(r0, r1)     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            android.content.IntentSender r1 = r0.getIntentSender()     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            X.0qQ.A07(r1)     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            androidx.activity.result.IntentSenderRequest r0 = new androidx.activity.result.IntentSenderRequest     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r0.<init>(r3, r1, r2, r2)     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r6.A01 = r13     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r6.A02 = r4     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r6.A00 = r10     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            X.07U r2 = X.07U.A05     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            X.JTi r1 = new X.JTi     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r1.<init>(r0, r9, r3, r8)     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            X.19B r0 = X.19B.A00     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            X.C63499KyA.A00(r2, r11, r0, r1)     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            goto L_0x00b0
        L_0x00ad:
            X.0eS.A00(r2)     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
        L_0x00b0:
            X.3ju r0 = r13.A03     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r6.A01 = r13     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r6.A02 = r4     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r6.A00 = r5     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            java.lang.Object r2 = r0.E6v(r6)     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            if (r2 != r7) goto L_0x00c2
            return r7
        L_0x00bf:
            X.0eS.A00(r2)     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
        L_0x00c2:
            androidx.activity.result.ActivityResult r2 = (androidx.activity.result.ActivityResult) r2     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r4.A00()     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            X.N05 r7 = new X.N05     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r7.<init>(r2)     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            return r7
        L_0x00cd:
            X.OnU r0 = X.C71593OnU.A00     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            r4.A01(r0)     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x00db
        L_0x00d7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
        L_0x00db:
            throw r0     // Catch:{ TSf -> 0x00e4, all -> 0x00dc }
        L_0x00dc:
            r0 = move-exception
            r4.A00()
            X.RSG.A00(r0)
            throw r0
        L_0x00e4:
            r0 = move-exception
            X.N04 r7 = A00(r4, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A06(androidx.fragment.app.FragmentActivity, X.Ta8, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v2, types: [X.QpN, X.63E] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063 A[LOOP:0: B:14:0x005d->B:16:0x0063, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0100 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A07(com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r20, X.AnonymousClass4D7 r21) {
        /*
            r2 = r20
            r3 = 0
            r4 = 0
            r10 = 0
            r6 = 7
            r8 = r21
            boolean r0 = X.ME0.A02(r6, r8)
            if (r0 == 0) goto L_0x012a
            r7 = r8
            X.ME0 r7 = (X.ME0) r7
            int r5 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto L_0x012a
            int r5 = r5 - r1
            r7.A00 = r5
        L_0x001c:
            java.lang.Object r0 = r7.A05
            X.1Hj r6 = X.1Hj.A02
            int r8 = r7.A00
            r5 = 3
            r1 = 2
            r12 = 1
            r15 = 0
            if (r8 == 0) goto L_0x0042
            if (r8 == r12) goto L_0x0032
            if (r8 == r1) goto L_0x0101
            if (r8 != r5) goto L_0x0131
            X.0eS.A00(r0)
        L_0x0031:
            return r0
        L_0x0032:
            java.lang.Object r10 = r7.A04
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r4 = r7.A03
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r3 = r7.A02
            X.S3n r3 = (X.C10979S3n) r3
            java.lang.Object r2 = r7.A01
            com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r2 = (com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController) r2
        L_0x0042:
            X.0eS.A00(r0)
            r8 = 0
            X.0qQ.A0B(r4, r8)
            java.lang.String r9 = "https://www.googleapis.com/auth/drive.appdata"
            java.lang.String r0 = "email"
            java.lang.String[] r0 = new java.lang.String[]{r9, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x005d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.String r11 = X.AnonymousClass7TE.A18(r13)
            com.google.android.gms.common.api.Scope r0 = new com.google.android.gms.common.api.Scope
            r0.<init>(r12, r11)
            r9.add(r0)
            goto L_0x005d
        L_0x0070:
            r14 = 0
            r12 = 0
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0079
            r12 = 1
        L_0x0079:
            java.lang.String r11 = "requestedScopes cannot be null or empty"
            X.AnonymousClass3Qk.A08(r12, r11)
            if (r10 == 0) goto L_0x0088
            java.lang.String r0 = "com.google"
            android.accounts.Account r14 = new android.accounts.Account
            r14.<init>(r10, r0)
        L_0x0088:
            com.google.android.gms.auth.api.identity.AuthorizationRequest r13 = new com.google.android.gms.auth.api.identity.AuthorizationRequest
            r16 = r15
            r17 = r15
            r18 = r9
            r19 = r8
            r20 = r8
            r21 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            X.63K r12 = X.C8365QpN.A00
            java.lang.String r0 = X.C11139SBu.A00()
            X.AnonymousClass3Qk.A04(r0)
            X.Sx1 r10 = new X.Sx1
            r10.<init>(r0)
            X.63N r0 = X.AnonymousClass63N.A02
            X.QpN r9 = new X.QpN
            r9.<init>((android.content.Context) r4, (X.AnonymousClass63L) r10, (X.AnonymousClass63K) r12, (X.AnonymousClass63N) r0)
            r14 = 0
            java.util.List r10 = r13.A04
            r12 = 0
            if (r10 == 0) goto L_0x00bb
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00bb
            r12 = 1
        L_0x00bb:
            X.AnonymousClass3Qk.A08(r12, r11)
            android.accounts.Account r0 = r13.A00
            if (r0 == 0) goto L_0x00c3
            r14 = r0
        L_0x00c3:
            X.63L r0 = r9.A03
            X.Sx1 r0 = (X.Sx1) r0
            java.lang.String r0 = r0.A00
            com.google.android.gms.auth.api.identity.AuthorizationRequest r13 = new com.google.android.gms.auth.api.identity.AuthorizationRequest
            r18 = r10
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            X.SHO r10 = X.SFC.A00()
            com.google.android.gms.common.Feature r0 = X.C10137RnE.A02
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[]{r0}
            r10.A03 = r0
            X.SxO r0 = new X.SxO
            r0.<init>(r13, r9)
            r10.A01 = r0
            r10.A02 = r8
            r0 = 1534(0x5fe, float:2.15E-42)
            X.9GD r0 = X.SHO.A00(r9, r10, r0, r8)
            X.0qQ.A07(r0)
            r7.A01 = r2
            r7.A02 = r3
            r7.A03 = r4
            r7.A04 = r15
            r7.A00 = r1
            java.lang.Object r0 = X.C9882Riv.A00(r0, r7)
            if (r0 != r6) goto L_0x0110
            return r6
        L_0x0101:
            java.lang.Object r4 = r7.A03
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r3 = r7.A02
            X.S3n r3 = (X.C10979S3n) r3
            java.lang.Object r2 = r7.A01
            com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r2 = (com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController) r2
            X.0eS.A00(r0)
        L_0x0110:
            com.google.android.gms.auth.api.identity.AuthorizationResult r0 = (com.google.android.gms.auth.api.identity.AuthorizationResult) r0
            android.app.PendingIntent r1 = r0.A00
            if (r1 == 0) goto L_0x0136
            X.QPZ r0 = new X.QPZ
            r0.<init>(r1)
            r7.A01 = r15
            r7.A02 = r15
            r7.A03 = r15
            r7.A00 = r5
            java.lang.Object r0 = A03(r4, r3, r0, r2, r7)
            if (r0 != r6) goto L_0x0031
            return r6
        L_0x012a:
            X.ME0 r7 = new X.ME0
            r7.<init>(r2, r8, r6)
            goto L_0x001c
        L_0x0131:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0136:
            X.Nnv r0 = r2.A01(r4, r0)
            java.lang.Object r6 = X.RSH.A00(r0, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A07(com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e8, code lost:
        if (r0 == null) goto L_0x00ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b1 A[Catch:{ TSf -> 0x00ff, all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00dc A[Catch:{ TSf -> 0x00ff, all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(androidx.fragment.app.FragmentActivity r10, X.AnonymousClass4D7 r11, boolean r12) {
        /*
            r9 = this;
            r3 = 13
            boolean r0 = X.MED.A04(r3, r11)
            if (r0 == 0) goto L_0x002a
            r8 = r11
            X.MED r8 = (X.MED) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002a
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r8.A04
            X.1Hj r7 = X.1Hj.A02
            int r1 = r8.A00
            r4 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r4) goto L_0x0030
            java.lang.Object r4 = r8.A03
            X.S3n r4 = (X.C10979S3n) r4
            java.lang.Object r2 = r8.A01
            X.S3n r2 = (X.C10979S3n) r2
            goto L_0x0091
        L_0x002a:
            X.MED r8 = new X.MED
            r8.<init>(r9, r11, r3)
            goto L_0x0016
        L_0x0030:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0035:
            X.0eS.A00(r0)
            r6 = 0
            X.S3n r2 = new X.S3n
            r2.<init>()
            r5 = 0
            boolean r0 = X.AnonymousClass7TF.A1P(r12)
            r8.A01 = r2     // Catch:{ all -> 0x00a1 }
            r8.A02 = r9     // Catch:{ all -> 0x00a1 }
            r8.A03 = r2     // Catch:{ all -> 0x00a1 }
            r8.A00 = r4     // Catch:{ all -> 0x00a1 }
            com.google.android.gms.common.GoogleApiAvailability r3 = com.google.android.gms.common.GoogleApiAvailability.A00     // Catch:{ all -> 0x00a1 }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x00a1 }
            int r1 = X.Pxe.A05(r10, r3)     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x0089
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A00     // Catch:{ all -> 0x00a1 }
            if (r1 == r4) goto L_0x0065
            r0 = 2
            if (r1 == r0) goto L_0x0065
            r0 = 3
            if (r1 == r0) goto L_0x0065
            r0 = 9
            if (r1 == r0) goto L_0x0065
            goto L_0x007f
        L_0x0065:
            X.SdP r0 = r9.A00     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x007f
            X.GL8 r4 = new X.GL8     // Catch:{ all -> 0x00a1 }
            r4.<init>(r1, r6, r3, r10)     // Catch:{ all -> 0x00a1 }
            X.0qQ.A0B(r10, r6)     // Catch:{ all -> 0x00a1 }
            X.07U r3 = X.07U.A05     // Catch:{ all -> 0x00a1 }
            r0 = 31
            X.JUv r1 = new X.JUv     // Catch:{ all -> 0x00a1 }
            r1.<init>(r4, r5, r0)     // Catch:{ all -> 0x00a1 }
            X.19B r0 = X.19B.A00     // Catch:{ all -> 0x00a1 }
            X.C63499KyA.A00(r3, r10, r0, r1)     // Catch:{ all -> 0x00a1 }
        L_0x007f:
            X.OnV r0 = X.C71594OnV.A00     // Catch:{ all -> 0x00a1 }
            r2.A01(r0)     // Catch:{ all -> 0x00a1 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x00a1 }
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x0089:
            java.lang.Object r0 = A05(r10, r2, r9, r8, r0)     // Catch:{ all -> 0x00a1 }
            if (r0 == r7) goto L_0x0104
            r4 = r2
            goto L_0x0094
        L_0x0091:
            X.0eS.A00(r0)     // Catch:{ all -> 0x009f }
        L_0x0094:
            X.O5e r0 = (X.C70402O5e) r0     // Catch:{ all -> 0x009f }
            r2.A00()     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            X.N05 r7 = new X.N05     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            r7.<init>(r0)     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            return r7
        L_0x009f:
            r3 = move-exception
            goto L_0x00a3
        L_0x00a1:
            r3 = move-exception
            r4 = r2
        L_0x00a3:
            X.RSG.A00(r3)     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            java.lang.String r1 = "GoogleAuthController"
            java.lang.String r0 = "catchGmsExceptions"
            X.0KC.A0G(r1, r0, r3)     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            boolean r0 = r3 instanceof java.io.IOException     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            if (r0 != 0) goto L_0x00dc
            boolean r0 = r3 instanceof java.lang.SecurityException     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            if (r0 != 0) goto L_0x00d9
            boolean r0 = r3 instanceof X.RKT     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            if (r0 == 0) goto L_0x00d1
            X.RKT r3 = (X.RKT) r3     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            com.google.android.gms.common.api.Status r0 = r3.A00     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            X.0qQ.A07(r0)     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            int r1 = r0.A00     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            r0 = 5
            if (r1 == r0) goto L_0x00ce
            r0 = 16
            if (r1 == r0) goto L_0x00ce
            r0 = 12501(0x30d5, float:1.7518E-41)
            if (r1 != r0) goto L_0x00ea
            goto L_0x00e4
        L_0x00ce:
            X.OnW r0 = X.C71595OnW.A00     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            goto L_0x00e6
        L_0x00d1:
            boolean r0 = r3 instanceof X.RKH     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            if (r0 == 0) goto L_0x00d8
            X.OnY r0 = X.C71597OnY.A00     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            goto L_0x00ef
        L_0x00d8:
            throw r3     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
        L_0x00d9:
            X.OnY r0 = X.C71597OnY.A00     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            goto L_0x00ef
        L_0x00dc:
            java.io.IOException r3 = (java.io.IOException) r3     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            X.N4v r0 = new X.N4v     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            r0.<init>((java.io.IOException) r3)     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            goto L_0x00ef
        L_0x00e4:
            X.Ona r0 = X.C71599Ona.A00     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
        L_0x00e6:
            X.PrB r0 = (X.C74223PrB) r0     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            if (r0 != 0) goto L_0x00ef
        L_0x00ea:
            X.N4v r0 = new X.N4v     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            r0.<init>((X.RKT) r3)     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
        L_0x00ef:
            r4.A01(r0)     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
            throw r0     // Catch:{ TSf -> 0x00ff, all -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            r2.A00()
            X.RSG.A00(r0)
            throw r0
        L_0x00ff:
            r0 = move-exception
            X.N04 r7 = A00(r2, r0)
        L_0x0104:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A08(androidx.fragment.app.FragmentActivity, X.4D7, boolean):java.lang.Object");
    }

    public static N04 A00(C10979S3n s3n, CancellationException cancellationException) {
        s3n.A00();
        if (cancellationException instanceof C13264TSf) {
            C13264TSf tSf = (C13264TSf) cancellationException;
            if (tSf.A00 == s3n) {
                return new N04(tSf.A01);
            }
        }
        throw cancellationException;
    }
}
