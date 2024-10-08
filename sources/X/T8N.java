package X;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class T8N implements C51920G7o {
    public AnonymousClass6ST A00;

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ca, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d7, code lost:
        if (android.text.TextUtils.isEmpty(r1.getMessage()) == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d9, code lost:
        X.0wb.A03("ReactNativeRouteHandler", r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e9, code lost:
        if (r1.getMessage() == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00eb, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ed, code lost:
        X.0wb.A03("ReactNativeRouteHandler", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f3, code lost:
        r1 = r1.getMessage();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e4 A[ExcHandler: IllegalArgumentException | SecurityException (r1v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle AFW(X.AnonymousClass0wW r10, java.lang.String r11) {
        /*
            r9 = this;
            r8 = 0
            android.net.Uri r4 = X.0cp.A03(r11)     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            java.lang.String r1 = r4.getScheme()     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            java.lang.String r0 = "ig"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            if (r0 == 0) goto L_0x00e3
        L_0x0019:
            java.lang.String r1 = r4.getHost()     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            java.lang.String r0 = "react_native"
            boolean r0 = r0.equals(r1)     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = "route"
            java.lang.String r7 = r4.getQueryParameter(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            if (r0 != 0) goto L_0x00e3
            java.lang.String r0 = "title"
            java.lang.String r3 = r4.getQueryParameter(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            java.lang.String r0 = "params"
            java.lang.String r2 = r4.getQueryParameter(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            java.lang.String r0 = "is_buat_required"
            java.lang.String r5 = r4.getQueryParameter(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            java.lang.String r1 = "utf-8"
            if (r0 == 0) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            java.lang.String r6 = java.net.URLDecoder.decode(r3, r1)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            goto L_0x0058
        L_0x0056:
            java.lang.String r6 = ""
        L_0x0058:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            if (r0 == 0) goto L_0x0061
            java.lang.String r2 = "{}"
        L_0x0061:
            java.lang.String r1 = java.net.URLDecoder.decode(r2, r1)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            if (r0 != 0) goto L_0x008d
            org.json.JSONObject r3 = X.C66580MXl.A17(r1)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            java.util.Iterator r2 = r3.keys()     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
        L_0x0077:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            if (r0 == 0) goto L_0x008e
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            java.lang.Object r0 = r3.get(r1)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            r4.put(r1, r0)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            goto L_0x0077
        L_0x008d:
            r4 = r8
        L_0x008e:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            if (r4 == 0) goto L_0x00a8
            boolean r0 = r4.isEmpty()     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            if (r0 != 0) goto L_0x00a8
            java.util.Iterator r1 = X.AnonymousClass7TF.A0s(r4)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
        L_0x009e:
            boolean r0 = r1.hasNext()     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            if (r0 == 0) goto L_0x00a8
            X.Pxh.A17(r3, r1)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            goto L_0x009e
        L_0x00a8:
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            java.lang.String r0 = "bundle_param_route"
            r2.putString(r0, r7)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            java.lang.String r0 = "bundle_param_title"
            r2.putString(r0, r6)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            java.lang.String r0 = "bundle_param_props"
            r2.putBundle(r0, r3)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
            if (r0 == 0) goto L_0x00c9
            java.lang.String r1 = "bundle_param_buat_required"
            r0 = 1
            r2.putBoolean(r1, r0)     // Catch:{ IOException -> 0x00ce, SecurityException -> 0x00cc, JSONException -> 0x00ca, IllegalArgumentException | SecurityException -> 0x00e4 }
        L_0x00c9:
            return r2
        L_0x00ca:
            r1 = move-exception
            goto L_0x00cf
        L_0x00cc:
            r1 = move-exception
            goto L_0x00cf
        L_0x00ce:
            r1 = move-exception
        L_0x00cf:
            java.lang.String r0 = r1.getMessage()     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            if (r0 != 0) goto L_0x00e3
            java.lang.String r1 = r1.getMessage()     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            java.lang.String r0 = "ReactNativeRouteHandler"
            X.0wb.A03(r0, r1)     // Catch:{ IllegalArgumentException | SecurityException -> 0x00e4 }
            return r8
        L_0x00e3:
            return r8
        L_0x00e4:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            if (r0 != 0) goto L_0x00f3
            java.lang.String r1 = ""
        L_0x00ed:
            java.lang.String r0 = "ReactNativeRouteHandler"
            X.0wb.A03(r0, r1)
            return r8
        L_0x00f3:
            java.lang.String r1 = r1.getMessage()
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T8N.AFW(X.0wW, java.lang.String):android.os.Bundle");
    }

    public final boolean EHn() {
        return false;
    }

    public static void A02(FragmentActivity fragmentActivity, T8N t8n) {
        AnonymousClass6ST r1 = t8n.A00;
        if (r1 != null && r1.isShowing()) {
            r1.dismiss();
        }
        fragmentActivity.finish();
    }

    public final void CI1(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0wW r5) {
        if (r5 instanceof UserSession) {
            UserSession userSession = (UserSession) r5;
            if (bundle.getBoolean("bundle_param_buat_required", false)) {
                C18676VwZ.A01(fragmentActivity, new C12756T5q(bundle, fragmentActivity, userSession, this), userSession, "ReactNativeRouteHandler");
            } else {
                A01(bundle, fragmentActivity, userSession, this);
            }
        } else {
            A02(fragmentActivity, this);
        }
    }

    public static void A00(Bundle bundle, FragmentActivity fragmentActivity, 0lg r5, String str) {
        1WM.getInstance();
        T8B A01 = new T8B(r5).A01(str);
        String string = bundle.getString("bundle_param_title");
        if (!TextUtils.isEmpty(string)) {
            A01.A07 = string;
        }
        Bundle bundle2 = bundle.getBundle("bundle_param_props");
        if (bundle2 != null && !bundle2.isEmpty()) {
            A01.A00(bundle2);
        }
        C309516Yo F08 = A01.F08(fragmentActivity);
        F08.A0D = false;
        F08.A04();
        ((BaseFragmentActivity) fragmentActivity).A0a();
    }

    /* JADX WARNING: type inference failed for: r0v35, types: [java.lang.Object, X.RQg] */
    public static void A01(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, T8N t8n) {
        Bundle bundle2;
        T8N t8n2;
        Set set;
        int i;
        String string;
        C11372SQh A002 = C11372SQh.A00();
        synchronized (A002) {
            if (A002.A00 == null && C60960kU.A00 != null) {
                0tX A01 = 0xn.A01("RNWhiteListedRouteStore_Prefs");
                Set stringSet = A01.getStringSet("RNWhiteListedRouteStore_RL", (Set) null);
                long j = A01.getLong("RNWhiteListedRouteStore_TS", 0);
                int i2 = A01.getInt("RNWhiteListedRouteStore_RC", -1);
                if (stringSet != null && j > 0 && i2 >= 0) {
                    ? obj = new Object();
                    obj.A02 = stringSet;
                    obj.A00 = i2;
                    obj.A01 = j;
                    A002.A00 = obj;
                }
            }
            C9132RQg rQg = A002.A00;
            bundle2 = bundle;
            t8n2 = t8n;
            if (rQg != null && (set = rQg.A02) != null && !set.isEmpty() && (i = rQg.A00) < 15 && Math.abs(System.currentTimeMillis() - rQg.A01) < C11372SQh.A01) {
                rQg.A00 = i + 1;
                C11372SQh.A01(A002);
                Set set2 = rQg.A02;
                if (set2 == null) {
                    set2 = AnonymousClass7TE.A1F();
                    rQg.A02 = set2;
                }
                List unmodifiableList = Collections.unmodifiableList(AnonymousClass7TE.A1D(Collections.unmodifiableSet(set2)));
                if (unmodifiableList != null && !unmodifiableList.isEmpty() && (((string = bundle2.getString("bundle_param_route")) != null && string.equals("BillingNexusIGRoute")) || (!TextUtils.isEmpty(string) && unmodifiableList.contains(string)))) {
                    A00(bundle2, fragmentActivity, userSession, string);
                    AnonymousClass6ST r1 = t8n.A00;
                    if (r1 != null && r1.isShowing()) {
                        r1.dismiss();
                        return;
                    }
                    return;
                }
            }
        }
        1NY r2 = new 1NY(userSession);
        r2.A05();
        r2.A0A("notifications/whitelisted_react_native_routes_from_notif/");
        r2.A0R(C8748R7m.class, C11100SAb.class);
        1OC A0M = r2.A0M();
        A0M.A00 = new EDW(10, bundle2, t8n2, fragmentActivity, userSession);
        AnonymousClass6ST r12 = new AnonymousClass6ST(fragmentActivity);
        t8n.A00 = r12;
        r12.A00(fragmentActivity.getString(2131965491));
        t8n.A00.setCancelable(true);
        t8n.A00.setCanceledOnTouchOutside(false);
        t8n.A00.setOnCancelListener(new C64209LTz(6, fragmentActivity, t8n));
        AnonymousClass0fN.A00(t8n.A00);
        1ES.A00(fragmentActivity, AnonymousClass07i.A00(fragmentActivity), A0M);
    }
}
