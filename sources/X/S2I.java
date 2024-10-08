package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class S2I {
    public final Context A00;
    public final QuickPerformanceLogger A01;
    public final 0fA A02;
    public final Map A03;

    public S2I(Context context) {
        0eP A1L;
        String str;
        String str2;
        this.A00 = context;
        UserSession userSession = C11159SCp.A01;
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36322860551907966L)) {
            str = "80a627fe78ffc546051fe99aeb5223c9874f0787.js";
            str2 = "autofill_contact_nonce_experiment";
        } else if (182.A06(r2, userSession, 36322860551711355L)) {
            str = "80a627fe78ffc546051fe99aeb5223c9874f0787.js";
            str2 = "autofill_contact_js_v2";
        } else {
            A1L = AnonymousClass7TE.A1L("autofill_contact_enhanced", "80a627fe78ffc546051fe99aeb5223c9874f0787.js");
            this.A03 = 0se.A0M(A1L);
            this.A01 = C51965G9l.A0l();
            0wj r0 = 0wj.A01;
            0qQ.A07(r0);
            this.A02 = r0;
        }
        A1L = AnonymousClass7TE.A1L(str2, str);
        this.A03 = 0se.A0M(A1L);
        this.A01 = C51965G9l.A0l();
        0wj r02 = 0wj.A01;
        0qQ.A07(r02);
        this.A02 = r02;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.SKG, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0109, code lost:
        if (X.0oI.A0I(r15, r14) != false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011e, code lost:
        if (X.0oI.A0H(r16, r14, r0.intValue()) != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0158, code lost:
        r15 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r22 = this;
            java.util.UUID r0 = X.AnonymousClass0HM.A00()
            int r9 = r0.hashCode()
            com.instagram.common.session.UserSession r3 = X.C11159SCp.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36892738280555454(0x8311c0000103be, double:3.394454471531904E-306)
            java.lang.String r20 = X.182.A04(r2, r3, r0)
            java.lang.String r19 = "url"
            java.lang.String r8 = "version"
            r10 = r22
            com.facebook.quicklog.QuickPerformanceLogger r7 = r10.A01
            r6 = 646449185(0x26880821, float:9.439099E-16)
            r7.markerStart(r6, r9)
            boolean r0 = X.00l.A0W(r20)
            r5 = 646448358(0x268804e6, float:9.438223E-16)
            r4 = 2
            if (r0 == 0) goto L_0x0058
            java.lang.String r1 = "sv_js_resources_empty"
            r7.markerPoint(r6, r9, r1)
            r7.markerEnd(r6, r9, r4)
            X.0fA r0 = r10.A02
            X.0f9 r0 = r0.AEf(r1, r5)
            r0.report()
            X.0sm r3 = X.0Yt.A0E()
        L_0x0045:
            X.SKG r4 = new X.SKG
            r4.<init>()
            android.content.Context r2 = r10.A00
            r0 = 0
            X.R9B r1 = new X.R9B
            r1.<init>(r2, r4, r3)
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.A02(r0)
            return
        L_0x0058:
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            org.json.JSONObject r18 = X.C66580MXl.A17(r20)     // Catch:{ JSONException -> 0x0186 }
            java.util.Iterator r17 = r18.keys()     // Catch:{ JSONException -> 0x0186 }
            X.0qQ.A07(r17)     // Catch:{ JSONException -> 0x0186 }
        L_0x0067:
            boolean r0 = r17.hasNext()     // Catch:{ JSONException -> 0x0186 }
            if (r0 == 0) goto L_0x01b5
            java.lang.String r2 = X.AnonymousClass7TE.A18(r17)     // Catch:{ JSONException -> 0x0186 }
            java.util.Map r1 = r10.A03     // Catch:{ JSONException -> 0x0186 }
            boolean r0 = r1.containsKey(r2)     // Catch:{ JSONException -> 0x0186 }
            if (r0 == 0) goto L_0x0067
            r0 = r18
            org.json.JSONObject r11 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x0186 }
            X.0qQ.A0A(r11)     // Catch:{ JSONException -> 0x0186 }
            java.lang.String r14 = "minAppVersion"
            java.lang.String r13 = "IG4A"
            java.lang.String r15 = "FB4A"
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()     // Catch:{ JSONException -> 0x0186 }
            boolean r0 = r11.has(r14)     // Catch:{ JSONException -> 0x00b2 }
            if (r0 == 0) goto L_0x00ed
            org.json.JSONObject r14 = r11.getJSONObject(r14)     // Catch:{ JSONException -> 0x00b2 }
            boolean r0 = r14.has(r15)     // Catch:{ JSONException -> 0x00b2 }
            if (r0 == 0) goto L_0x00a4
            int r0 = r14.getInt(r15)     // Catch:{ JSONException -> 0x00b2 }
            X.C66581MXm.A1S(r15, r12, r0)     // Catch:{ JSONException -> 0x00b2 }
        L_0x00a4:
            boolean r0 = r14.has(r13)     // Catch:{ JSONException -> 0x00b2 }
            if (r0 == 0) goto L_0x00ed
            int r0 = r14.getInt(r13)     // Catch:{ JSONException -> 0x00b2 }
            X.C66581MXm.A1S(r13, r12, r0)     // Catch:{ JSONException -> 0x00b2 }
            goto L_0x00ed
        L_0x00b2:
            r16 = move-exception
            java.lang.String r14 = "sv_min_app_version_parse_error"
            r7.markerPoint(r6, r9, r14)     // Catch:{ JSONException -> 0x0186 }
            java.lang.String r0 = r16.getMessage()     // Catch:{ JSONException -> 0x0186 }
            java.lang.String r15 = "unknown reason"
            if (r0 != 0) goto L_0x00c3
            r0 = r15
        L_0x00c3:
            r7.markerAnnotate(r6, r9, r14, r0)     // Catch:{ JSONException -> 0x0186 }
            X.0fA r0 = r10.A02     // Catch:{ JSONException -> 0x0186 }
            r21 = r0
            java.lang.StringBuilder r14 = X.AnonymousClass7TE.A1A()     // Catch:{ JSONException -> 0x0186 }
            java.lang.String r0 = "sv_min_app_version_parse_error "
            r14.append(r0)     // Catch:{ JSONException -> 0x0186 }
            java.lang.String r0 = r16.getMessage()     // Catch:{ JSONException -> 0x0186 }
            if (r0 == 0) goto L_0x00db
            r15 = r0
        L_0x00db:
            r14.append(r15)     // Catch:{ JSONException -> 0x0186 }
            java.lang.String r0 = " for json "
            java.lang.String r14 = X.AnonymousClass7TG.A0m(r11, r0, r14)     // Catch:{ JSONException -> 0x0186 }
            r0 = r21
            X.0f9 r0 = r0.AEf(r14, r5)     // Catch:{ JSONException -> 0x0186 }
            r0.report()     // Catch:{ JSONException -> 0x0186 }
        L_0x00ed:
            android.content.Context r0 = r10.A00     // Catch:{ JSONException -> 0x0186 }
            r16 = r0
            android.net.Uri r0 = X.0oI.A01     // Catch:{ JSONException -> 0x0186 }
            android.content.pm.PackageManager r15 = r16.getPackageManager()     // Catch:{ JSONException -> 0x0186 }
            java.lang.String r14 = "com.instagram.android"
            boolean r0 = X.0oI.A0I(r15, r14)     // Catch:{ JSONException -> 0x0186 }
            if (r0 != 0) goto L_0x010b
            r0 = 2846(0xb1e, float:3.988E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)     // Catch:{ JSONException -> 0x0186 }
            boolean r0 = X.0oI.A0I(r15, r14)     // Catch:{ JSONException -> 0x0186 }
            if (r0 == 0) goto L_0x0158
        L_0x010b:
            r15 = 1
            java.lang.Object r0 = r12.get(r13)     // Catch:{ JSONException -> 0x0186 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ JSONException -> 0x0186 }
            if (r0 == 0) goto L_0x0120
            int r12 = r0.intValue()     // Catch:{ JSONException -> 0x0186 }
            r0 = r16
            boolean r0 = X.0oI.A0H(r0, r14, r12)     // Catch:{ JSONException -> 0x0186 }
            if (r0 == 0) goto L_0x0158
        L_0x0120:
            java.lang.String r0 = " getIsAppAtLeastVersion"
            java.lang.String r0 = X.002.A0R(r2, r0)     // Catch:{ JSONException -> 0x0186 }
            r7.markerPoint(r6, r9, r0)     // Catch:{ JSONException -> 0x0186 }
            java.lang.String r13 = r11.getString(r8)     // Catch:{ JSONException -> 0x0186 }
            X.AnonymousClass7TG.A1N(r2, r13)     // Catch:{ JSONException -> 0x0186 }
            X.0xa r12 = X.C11159SCp.A02     // Catch:{ JSONException -> 0x0186 }
            java.lang.String r0 = ""
            java.lang.String r0 = r12.getString(r2, r0)     // Catch:{ JSONException -> 0x0186 }
            boolean r12 = X.C51966G9m.A1a(r0, r13)     // Catch:{ JSONException -> 0x0186 }
            java.lang.String r0 = " getIsScriptVersionMismatch"
            java.lang.String r0 = X.002.A0R(r2, r0)     // Catch:{ JSONException -> 0x0186 }
            r7.markerPoint(r6, r9, r0)     // Catch:{ JSONException -> 0x0186 }
            java.lang.String r0 = " meets min app version"
            java.lang.String r0 = X.002.A0R(r2, r0)     // Catch:{ JSONException -> 0x0186 }
            r7.markerAnnotate(r6, r9, r0, r15)     // Catch:{ JSONException -> 0x0186 }
            java.lang.String r0 = " script version mismatch"
            java.lang.String r0 = X.002.A0R(r2, r0)     // Catch:{ JSONException -> 0x0186 }
            r7.markerAnnotate(r6, r9, r0, r12)     // Catch:{ JSONException -> 0x0186 }
            goto L_0x015a
        L_0x0158:
            r15 = 0
            goto L_0x0120
        L_0x015a:
            if (r15 == 0) goto L_0x0067
            if (r12 == 0) goto L_0x0067
            java.lang.String r0 = r11.getString(r8)     // Catch:{ JSONException -> 0x0186 }
            X.0eP r12 = X.AnonymousClass7TE.A1L(r8, r0)     // Catch:{ JSONException -> 0x0186 }
            r0 = r19
            java.lang.String r11 = r11.getString(r0)     // Catch:{ JSONException -> 0x0186 }
            X.0eP r13 = X.AnonymousClass7TE.A1L(r0, r11)     // Catch:{ JSONException -> 0x0186 }
            java.lang.String r11 = "file_name"
            java.lang.Object r0 = r1.get(r2)     // Catch:{ JSONException -> 0x0186 }
            if (r0 != 0) goto L_0x0179
            r0 = r2
        L_0x0179:
            X.0eP[] r0 = X.Pxg.A1b(r11, r0, r12, r13)     // Catch:{ JSONException -> 0x0186 }
            java.util.LinkedHashMap r0 = X.0Yt.A07(r0)     // Catch:{ JSONException -> 0x0186 }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x0186 }
            goto L_0x0067
        L_0x0186:
            r12 = move-exception
            java.lang.String r1 = "sv_json_parse_error"
            r7.markerPoint(r6, r9, r1)
            java.lang.String r0 = r12.getMessage()
            java.lang.String r11 = "unknown reason"
            if (r0 != 0) goto L_0x0197
            r0 = r11
        L_0x0197:
            r7.markerAnnotate(r6, r9, r1, r0)
            X.0fA r8 = r10.A02
            java.lang.String r2 = "sv_json_parse_error "
            java.lang.String r0 = r12.getMessage()
            if (r0 == 0) goto L_0x01a6
            r11 = r0
        L_0x01a6:
            java.lang.String r1 = " for json "
            r0 = r20
            java.lang.String r0 = X.002.A0u(r2, r11, r1, r0)
            X.0f9 r0 = r8.AEf(r0, r5)
            r0.report()
        L_0x01b5:
            java.util.Set r1 = r3.keySet()
            r0 = 0
            java.lang.String[] r1 = X.Pxf.A1b(r1, r0)
            java.lang.String r0 = "script_to_download"
            r7.markerAnnotate(r6, r9, r0, r1)
            r7.markerEnd(r6, r9, r4)
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S2I.A00():void");
    }
}
