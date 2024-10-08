package X;

import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.android.R;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.trustly.android.sdk.views.TrustlyView;
import org.json.JSONObject;

public final class R8O extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "TrustlyAuthenticationFragment";
    public C50320FYa A00;
    public String A01;
    public Map A02 = 0Yt.A0E();
    public TrustlyView A03;
    public TeY A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final String A06 = "trustly_authentication_fragment";

    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r0 = java.net.URLEncoder.encode(r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0241 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x024d */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f7 A[Catch:{ Exception -> 0x025f }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x020f A[Catch:{ Exception -> 0x025f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r10 = 0
            r11 = r21
            X.0qQ.A0B(r11, r10)
            r0 = 2131435422(0x7f0b1f9e, float:1.8492686E38)
            android.view.View r9 = r11.findViewById(r0)
            net.trustly.android.sdk.views.TrustlyView r9 = (net.trustly.android.sdk.views.TrustlyView) r9
            r12 = r20
            r12.A03 = r9
            if (r9 != 0) goto L_0x001e
            X.DbT.A1K(r12)
        L_0x0018:
            r0 = r22
            super.onViewCreated(r11, r0)
            return
        L_0x001e:
            java.util.Map r7 = r12.A02
            java.lang.String r5 = "metadata.integrationContext"
            r0 = 2996(0xbb4, float:4.198E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r9.A00 = r0
            java.util.HashMap r0 = X.Pxe.A19(r7)
            r9.A03 = r0
            java.lang.String r4 = "index"
            java.lang.String r8 = "env"
            java.lang.Object r0 = r7.get(r8)
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = X.DbT.A11(r8, r7)
            java.lang.String r1 = r0.toLowerCase()
        L_0x0045:
            java.lang.String r0 = "localUrl"
            java.lang.String r14 = X.DbT.A11(r0, r7)
            if (r1 == 0) goto L_0x00bc
            java.lang.String r0 = "prod"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bc
            r0 = 3793(0xed1, float:5.315E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bc
            java.lang.String r0 = "."
            java.lang.String r15 = X.002.A0R(r1, r0)
        L_0x0068:
            java.lang.String r0 = "paymentType"
            java.lang.Object r1 = r7.get(r0)
            java.lang.String r0 = "Verification"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0083
            java.lang.String r0 = "paymentProviderId"
            java.lang.Object r0 = r7.get(r0)
            if (r0 == 0) goto L_0x0083
            java.lang.String r4 = "selectBank"
        L_0x0083:
            java.lang.String r6 = "-android-sdk"
            java.lang.String r13 = "?v="
            java.lang.String r2 = "/start/selectBank/"
            if (r14 == 0) goto L_0x00a9
            java.lang.String r0 = "local."
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00a9
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "http://"
            X.Pxj.A1M(r0, r14, r2, r4, r1)
            r1.append(r13)
        L_0x009f:
            java.lang.String r4 = "3.1.0"
            r1.append(r4)
            java.lang.String r15 = X.AnonymousClass7TF.A0l(r6, r1)
            goto L_0x00c2
        L_0x00a9:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "https://"
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = "paywithmybank.com"
            X.Pxj.A1M(r0, r2, r4, r13, r1)
            goto L_0x009f
        L_0x00bc:
            java.lang.String r15 = ""
            goto L_0x0068
        L_0x00bf:
            java.lang.String r1 = r9.A07
            goto L_0x0045
        L_0x00c2:
            java.lang.String r1 = X.DbT.A11(r3, r7)     // Catch:{ Exception -> 0x025f }
            if (r1 == 0) goto L_0x01b7
            java.lang.String r0 = ":android:native"
            java.lang.String r2 = X.002.A0R(r1, r0)     // Catch:{ Exception -> 0x025f }
        L_0x00ce:
            java.lang.String r0 = "metadata.lang"
            java.lang.String r6 = X.DbT.A11(r0, r7)     // Catch:{ Exception -> 0x025f }
            if (r6 == 0) goto L_0x00de
            java.util.Map r1 = r9.A03     // Catch:{ Exception -> 0x025f }
            java.lang.String r0 = "lang"
            r1.put(r0, r6)     // Catch:{ Exception -> 0x025f }
        L_0x00de:
            java.lang.String r0 = X.DbT.A11(r5, r7)     // Catch:{ Exception -> 0x025f }
            if (r0 == 0) goto L_0x00ea
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x025f }
            if (r0 == 0) goto L_0x00f1
        L_0x00ea:
            java.util.Map r1 = r9.A03     // Catch:{ Exception -> 0x025f }
            java.lang.String r0 = "InAppBrowser"
            r1.put(r5, r0)     // Catch:{ Exception -> 0x025f }
        L_0x00f1:
            java.util.Map r1 = r9.A03     // Catch:{ Exception -> 0x025f }
            java.lang.String r0 = "metadata.sdkAndroidVersion"
            r1.put(r0, r4)     // Catch:{ Exception -> 0x025f }
            java.util.Map r0 = r9.A03     // Catch:{ Exception -> 0x025f }
            r0.put(r3, r2)     // Catch:{ Exception -> 0x025f }
            java.util.Map r2 = r9.A03     // Catch:{ Exception -> 0x025f }
            java.lang.String r1 = "returnUrl"
            java.lang.String r0 = r9.A02     // Catch:{ Exception -> 0x025f }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x025f }
            java.util.Map r2 = r9.A03     // Catch:{ Exception -> 0x025f }
            java.lang.String r1 = "cancelUrl"
            java.lang.String r0 = r9.A01     // Catch:{ Exception -> 0x025f }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x025f }
            java.util.Map r2 = r9.A03     // Catch:{ Exception -> 0x025f }
            java.lang.String r1 = "grp"
            int r0 = net.trustly.android.sdk.views.TrustlyView.A08     // Catch:{ Exception -> 0x025f }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x025f }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x025f }
            java.util.Map r1 = r9.A03     // Catch:{ Exception -> 0x025f }
            java.lang.String r0 = "paymentProviderId"
            boolean r0 = r1.containsKey(r0)     // Catch:{ Exception -> 0x025f }
            if (r0 == 0) goto L_0x0134
            java.util.Map r2 = r9.A03     // Catch:{ Exception -> 0x025f }
            java.lang.String r1 = "widgetLoaded"
            java.lang.String r0 = "true"
            r2.put(r1, r0)     // Catch:{ Exception -> 0x025f }
        L_0x0134:
            android.content.Context r7 = r9.getContext()     // Catch:{ Exception -> 0x025f }
            java.lang.String r6 = "CID"
            java.lang.String r5 = "CID_STORAGE"
            android.content.SharedPreferences r0 = r7.getSharedPreferences(r5, r10)     // Catch:{ Exception -> 0x025f }
            r2 = 0
            java.lang.String r1 = r0.getString(r6, r2)     // Catch:{ Exception -> 0x025f }
            r19 = r1
            java.lang.String r4 = "SESSION_CID"
            android.content.SharedPreferences r0 = r7.getSharedPreferences(r5, r10)     // Catch:{ Exception -> 0x025f }
            java.lang.String r13 = r0.getString(r4, r2)     // Catch:{ Exception -> 0x025f }
            if (r13 == 0) goto L_0x01bc
            java.lang.String r3 = "-"
            java.lang.String[] r0 = r13.split(r3)     // Catch:{ Exception -> 0x025f }
            r18 = 2
            r0 = r0[r18]     // Catch:{ Exception -> 0x025f }
            java.util.Calendar r14 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x025f }
            r2 = 36
            long r0 = java.lang.Long.parseLong(r0, r2)     // Catch:{ Exception -> 0x025f }
            r14.setTimeInMillis(r0)     // Catch:{ Exception -> 0x025f }
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x025f }
            long r0 = r0.getTimeInMillis()     // Catch:{ Exception -> 0x025f }
            long r16 = r14.getTimeInMillis()     // Catch:{ Exception -> 0x025f }
            long r0 = r0 - r16
            r16 = 3600000(0x36ee80, double:1.7786363E-317)
            long r0 = r0 / r16
            int r14 = (int) r0     // Catch:{ Exception -> 0x025f }
            r0 = 1
            if (r14 < r0) goto L_0x01bd
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ Exception -> 0x025f }
            java.lang.String r0 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r0)     // Catch:{ Exception -> 0x025f }
            r0 = 4
            java.lang.String r0 = r1.substring(r10, r0)     // Catch:{ Exception -> 0x025f }
            java.lang.String r14 = r0.toUpperCase()     // Catch:{ Exception -> 0x025f }
            java.lang.String r0 = X.AnonymousClass7TF.A0b()     // Catch:{ Exception -> 0x025f }
            java.lang.String[] r0 = r0.split(r3)     // Catch:{ Exception -> 0x025f }
            r0 = r0[r18]     // Catch:{ Exception -> 0x025f }
            java.lang.String r13 = r0.toUpperCase()     // Catch:{ Exception -> 0x025f }
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x025f }
            long r0 = r0.getTimeInMillis()     // Catch:{ Exception -> 0x025f }
            java.lang.String r0 = java.lang.Long.toString(r0, r2)     // Catch:{ Exception -> 0x025f }
            java.lang.String r0 = r0.toUpperCase()     // Catch:{ Exception -> 0x025f }
            java.lang.String r1 = X.002.A11(r14, r3, r13, r3, r0)     // Catch:{ Exception -> 0x025f }
            goto L_0x01bc
        L_0x01b7:
            java.lang.String r2 = "mobile:android:native"
            goto L_0x00ce
        L_0x01bc:
            r13 = r1
        L_0x01bd:
            android.content.SharedPreferences r0 = r7.getSharedPreferences(r5, r10)     // Catch:{ Exception -> 0x025f }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x025f }
            X.Pxf.A13(r0, r4, r13)     // Catch:{ Exception -> 0x025f }
            r0 = r19
            java.util.HashMap r3 = X.Dba.A0f(r6, r0)     // Catch:{ Exception -> 0x025f }
            r3.put(r4, r13)     // Catch:{ Exception -> 0x025f }
            java.util.Map r2 = r9.A03     // Catch:{ Exception -> 0x025f }
            java.lang.String r1 = "sessionCid"
            java.lang.String r0 = X.DbS.A0r(r4, r3)     // Catch:{ Exception -> 0x025f }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x025f }
            java.util.Map r2 = r9.A03     // Catch:{ Exception -> 0x025f }
            java.lang.String r1 = "metadata.cid"
            java.lang.String r0 = X.DbS.A0r(r6, r3)     // Catch:{ Exception -> 0x025f }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x025f }
            java.lang.String r1 = "local"
            java.util.Map r0 = r9.A03     // Catch:{ Exception -> 0x025f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ Exception -> 0x025f }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x025f }
            if (r0 == 0) goto L_0x01fd
            r0 = 1
            android.webkit.WebView.setWebContentsDebuggingEnabled(r0)     // Catch:{ Exception -> 0x025f }
            net.trustly.android.sdk.views.TrustlyView.A09 = r0     // Catch:{ Exception -> 0x025f }
        L_0x01fd:
            android.webkit.WebView r2 = r9.A06     // Catch:{ Exception -> 0x025f }
            java.util.Map r0 = r9.A03     // Catch:{ Exception -> 0x025f }
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()     // Catch:{ Exception -> 0x025f }
            java.util.Iterator r5 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ Exception -> 0x025f }
        L_0x0209:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x025f }
            if (r0 == 0) goto L_0x0252
            java.util.Map$Entry r3 = X.AnonymousClass7TE.A1J(r5)     // Catch:{ Exception -> 0x025f }
            int r0 = r4.length()     // Catch:{ Exception -> 0x025f }
            if (r0 <= 0) goto L_0x021e
            java.lang.String r0 = "&"
            r4.append(r0)     // Catch:{ Exception -> 0x025f }
        L_0x021e:
            java.lang.String r1 = X.DbT.A13(r3)     // Catch:{ Exception -> 0x025f }
            if (r1 != 0) goto L_0x0246
            java.lang.String r0 = ""
        L_0x0226:
            r4.append(r0)     // Catch:{ Exception -> 0x025f }
            java.lang.String r0 = "="
            r4.append(r0)     // Catch:{ Exception -> 0x025f }
            java.lang.String r1 = X.DbS.A0s(r3)     // Catch:{ Exception -> 0x025f }
            if (r1 != 0) goto L_0x023a
            java.lang.String r0 = ""
        L_0x0236:
            r4.append(r0)     // Catch:{ Exception -> 0x025f }
            goto L_0x0209
        L_0x023a:
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x0241 }
            goto L_0x0236
        L_0x0241:
            java.lang.String r0 = java.net.URLEncoder.encode(r1)     // Catch:{ Exception -> 0x025f }
            goto L_0x0236
        L_0x0246:
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ Exception -> 0x024d }
            goto L_0x0226
        L_0x024d:
            java.lang.String r0 = java.net.URLEncoder.encode(r1)     // Catch:{ Exception -> 0x025f }
            goto L_0x0226
        L_0x0252:
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x025f }
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{ Exception -> 0x025f }
            r2.postUrl(r15, r0)     // Catch:{ Exception -> 0x025f }
        L_0x025f:
            X.TPY r0 = new X.TPY
            r0.<init>(r12)
            r9.A05 = r0
            X.TPZ r0 = new X.TPZ
            r0.<init>(r12)
            r9.A04 = r0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R8O.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(R8O r8o, String str, Map map, boolean z) {
        LruCache lruCache = 0cp.A00;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            buildUpon.appendQueryParameter(DbT.A13(A1J), DbS.A0s(A1J));
        }
        String A10 = DbT.A10(buildUpon.build());
        TeY teY = r8o.A04;
        if (teY != null) {
            teY.Cwy(A10, z);
        }
        DbT.A1K(r8o);
    }

    public final String getModuleName() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final boolean onBackPressed() {
        Object obj = this.A02.get("cancelUrl");
        DbS.A1Y(obj);
        A00(this, (String) obj, 0Yt.A0E(), true);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        int A022 = AnonymousClass0fD.A02(1791188585);
        R8O.super.onCreate(bundle);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && bundle3.containsKey("redirected_from_deeplink") && (bundle2 = this.mArguments) != null && bundle2.getBoolean("redirected_from_deeplink")) {
            DbT.A1K(this);
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 == null || !bundle4.containsKey("establishData")) {
            DbT.A1K(this);
        } else {
            String str = null;
            Bundle bundle5 = this.mArguments;
            if (bundle5 != null) {
                str = bundle5.getString("establishData");
            }
            this.A01 = str;
        }
        String str2 = this.A01;
        if (str2 != null) {
            str2 = URLDecoder.decode(str2, ReactWebViewManager.HTML_ENCODING);
        }
        JSONObject A17 = C66580MXl.A17(str2);
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator<String> keys = A17.keys();
        0qQ.A07(keys);
        while (keys.hasNext()) {
            String A18 = AnonymousClass7TE.A18(keys);
            A1E.put(A18, Pxe.A0y(A18, A17));
        }
        this.A02 = A1E;
        0lg A0X = DbT.A0X(this.A05);
        0qQ.A0B(A0X, 0);
        C50320FYa fYa = (C50320FYa) A0X.A01(C50320FYa.class, new MMG(A0X, 1));
        this.A00 = fYa;
        if (fYa == null) {
            0qQ.A0F("callbackManager");
            throw AnonymousClass00P.createAndThrow();
        }
        TeY teY = fYa.A00;
        if (teY == null) {
            teY = new C12750T5k(this);
        }
        this.A04 = teY;
        AnonymousClass0fD.A09(1837345711, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1496130500);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.trustly_lightbox, viewGroup, false);
        AnonymousClass0fD.A09(2063760536, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(273188879);
        this.A03 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-256034844, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1198088040);
        super.onResume();
        TrustlyView trustlyView = this.A03;
        if (trustlyView != null) {
            trustlyView.A06.loadUrl("javascript:Paywithmybank.proceedToChooseAccount();");
        }
        AnonymousClass0fD.A09(899725450, A022);
    }
}
