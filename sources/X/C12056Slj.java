package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.challenge.selfiecaptchachallenge.IgSelfieCaptchaChallengeManagerImpl;

/* renamed from: X.Slj  reason: case insensitive filesystem */
public final class C12056Slj implements AnonymousClass84Q {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ 0hq A02;
    public final /* synthetic */ IgSelfieCaptchaChallengeManagerImpl A03;
    public final /* synthetic */ 0lg A04;
    public final /* synthetic */ T6A A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public C12056Slj(Activity activity, Bundle bundle, 0hq r3, IgSelfieCaptchaChallengeManagerImpl igSelfieCaptchaChallengeManagerImpl, 0lg r5, T6A t6a, String str, String str2, String str3, String str4) {
        this.A02 = r3;
        this.A01 = bundle;
        this.A00 = activity;
        this.A04 = r5;
        this.A09 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A06 = str4;
        this.A05 = t6a;
        this.A03 = igSelfieCaptchaChallengeManagerImpl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.instagram.challenge.selfiecaptchachallenge.IgFaceTrackerModelsProvider} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r25v0, types: [java.lang.Object, com.facebook.smartcapture.facetracker.FaceTrackerProvider] */
    /* JADX WARNING: type inference failed for: r29v0, types: [java.lang.Object, com.facebook.smartcapture.ui.SelfieCaptureUi] */
    /* JADX WARNING: type inference failed for: r27v0, types: [com.facebook.smartcapture.resources.ResourcesProvider, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r24v0, types: [com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider] */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a8, code lost:
        if (r3 == null) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ac, code lost:
        if (r50 != null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ae, code lost:
        r2 = r50.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01b2, code lost:
        if (r2 != null) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b4, code lost:
        r2 = "Empty error message";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b6, code lost:
        X.0wb.A03("Selfie_captcha", X.002.A0u("model path: ", r3, X.C66579MXk.A00(430), r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c8, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D51(X.AnonymousClass8LL r49, java.lang.Exception r50) {
        /*
            r48 = this;
            r0 = r48
            X.0hq r1 = r0.A02
            X.SQH.A01(r1)
            if (r49 == 0) goto L_0x01aa
            if (r50 != 0) goto L_0x01a4
            android.os.Bundle r2 = r0.A01
            java.lang.String r14 = "challenge_use_case"
            java.lang.String r9 = r2.getString(r14)
            java.lang.String r19 = "ig_age_verification"
            r1 = r19
            boolean r47 = X.0qQ.A0K(r9, r1)
            android.app.Activity r15 = r0.A00
            android.content.Context r20 = X.DbT.A05(r15)
            X.0lg r4 = r0.A04
            r23 = 0
            r31 = 0
            r32 = 0
            r42 = 0
            java.lang.Integer r34 = X.AnonymousClass05K.A00
            java.lang.String r40 = r4.getToken()
            com.facebook.facedetection.amlfacetracker.SelfieFaceTrackerProvider r25 = new com.facebook.facedetection.amlfacetracker.SelfieFaceTrackerProvider
            r25.<init>()
            com.instagram.challenge.selfiecaptchachallenge.IgFaceTrackerModelsProvider r18 = new com.instagram.challenge.selfiecaptchachallenge.IgFaceTrackerModelsProvider
            r18.<init>()
            r1 = r18
            r1.A00 = r4
            com.facebook.smartcapture.ig.logging.IgSmartCaptureLoggerProvider r17 = new com.facebook.smartcapture.ig.logging.IgSmartCaptureLoggerProvider
            r1 = r17
            r1.<init>((X.0lg) r4)
            com.facebook.smartcapture.ui.ig.IgSelfieCaptureUi r29 = new com.facebook.smartcapture.ui.ig.IgSelfieCaptureUi
            r29.<init>()
            boolean r1 = X.AnonymousClass3HA.A00(r20)
            r43 = 2132018197(0x7f140415, float:1.9674694E38)
            if (r1 == 0) goto L_0x0057
            r43 = 2132018198(0x7f140416, float:1.9674696E38)
        L_0x0057:
            com.facebook.smartcapture.ui.ig.IgSelfieResourcesProvider r27 = new com.facebook.smartcapture.ui.ig.IgSelfieResourcesProvider
            r27.<init>()
            java.lang.String r1 = r0.A09
            r39 = r1
            r46 = 0
            java.lang.String r1 = r0.A07
            r37 = r1
            java.lang.String r1 = r0.A08
            r41 = r1
            java.lang.String r1 = r0.A06
            r36 = r1
            java.lang.String r3 = "head_movements_directions_json"
            java.lang.String r1 = ""
            java.lang.String r1 = r2.getString(r3, r1)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00b6 }
            r7.<init>(r1)     // Catch:{ JSONException -> 0x00b6 }
            r3 = 0
            int r16 = r7.length()     // Catch:{ JSONException -> 0x00b6 }
        L_0x0084:
            r1 = r16
            if (r3 >= r1) goto L_0x00bd
            java.util.List r5 = com.instagram.challenge.selfiecaptchachallenge.IgSelfieCaptchaChallengeManagerImpl.A00     // Catch:{ JSONException -> 0x00b6 }
            int r1 = r7.getInt(r3)     // Catch:{ JSONException -> 0x00b6 }
            java.lang.String r13 = X.AnonymousClass7TE.A19(r5, r1)     // Catch:{ JSONException -> 0x00b6 }
            X.RFH[] r6 = X.RFH.values()     // Catch:{ JSONException -> 0x00b6 }
            int r12 = r6.length     // Catch:{ JSONException -> 0x00b6 }
            r1 = 0
        L_0x0098:
            if (r1 >= r12) goto L_0x00af
            r5 = r6[r1]     // Catch:{ JSONException -> 0x00b6 }
            java.lang.String r11 = r5.A00     // Catch:{ JSONException -> 0x00b6 }
            r10 = 1
            boolean r10 = X.00p.A0j(r11, r13, r10)     // Catch:{ JSONException -> 0x00b6 }
            if (r10 == 0) goto L_0x00a9
            r8.add(r5)     // Catch:{ JSONException -> 0x00b6 }
            goto L_0x00ac
        L_0x00a9:
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00ac:
            int r3 = r3 + 1
            goto L_0x0084
        L_0x00af:
            java.lang.String r1 = "Incorrect value argument"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r1)     // Catch:{ JSONException -> 0x00b6 }
            throw r1     // Catch:{ JSONException -> 0x00b6 }
        L_0x00b6:
            java.lang.String r3 = "IgSelfieChallengeBuilder"
            java.lang.String r1 = "JSON error"
            X.0wb.A03(r3, r1)
        L_0x00bd:
            com.facebook.smartcapture.config.ChallengeProvider r10 = new com.facebook.smartcapture.config.ChallengeProvider
            r10.<init>((java.util.List) r8)
            java.lang.String r8 = "av_session_id"
            java.lang.String r7 = r2.getString(r8)
            java.lang.String r6 = "flow_id"
            java.lang.String r5 = r2.getString(r6)
            java.lang.String r3 = "product_surface"
            java.lang.String r2 = r2.getString(r3)
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            if (r9 == 0) goto L_0x00de
            r1.put(r14, r9)
        L_0x00de:
            if (r7 == 0) goto L_0x00e3
            r1.put(r8, r7)
        L_0x00e3:
            if (r5 == 0) goto L_0x00e8
            r1.put(r6, r5)
        L_0x00e8:
            if (r2 == 0) goto L_0x00ed
            r1.put(r3, r2)
        L_0x00ed:
            boolean r2 = r4 instanceof com.instagram.common.session.UserSession
            r3 = 1
            if (r2 == 0) goto L_0x0103
            if (r47 == 0) goto L_0x0103
            java.lang.Boolean r31 = java.lang.Boolean.valueOf(r3)
            X.0Tu r5 = X.0Tu.A05
            r2 = 36316315014729953(0x81057f000110e1, double:3.0299220771536685E-306)
            java.lang.Boolean r32 = X.AnonymousClass7TF.A0R(r5, r4, r2)
        L_0x0103:
            boolean r2 = r1.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x010d
            r42 = r1
        L_0x010d:
            r2 = r19
            r1 = r39
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x012e
            java.lang.Integer r35 = X.AnonymousClass05K.A0C
        L_0x0119:
            com.facebook.smartcapture.capture.DefaultEvidenceRecorderProvider r1 = new com.facebook.smartcapture.capture.DefaultEvidenceRecorderProvider
            r1.<init>()
            java.lang.String r3 = "SELFIE.mp4"
            X.2Rs r2 = new X.2Rs
            r2.<init>(r15)
            java.io.File r2 = r2.getCacheDir()
            java.io.File r2 = X.JTO.A0s(r2, r3)
            goto L_0x0131
        L_0x012e:
            java.lang.Integer r35 = X.AnonymousClass05K.A01
            goto L_0x0119
        L_0x0131:
            java.lang.String r2 = r2.getCanonicalPath()     // Catch:{ IOException -> 0x0136 }
            goto L_0x013a
        L_0x0136:
            java.lang.String r2 = r2.toString()
        L_0x013a:
            X.0qQ.A0A(r2)
            r1.A05 = r2
            if (r47 == 0) goto L_0x017d
            java.lang.String r3 = "SELFIE_SNAPSHOT.jpg"
            X.2Rs r2 = new X.2Rs
            r2.<init>(r15)
            java.io.File r2 = r2.getCacheDir()
            java.io.File r2 = X.JTO.A0s(r2, r3)
            java.lang.String r2 = r2.getCanonicalPath()     // Catch:{ IOException -> 0x0155 }
            goto L_0x0159
        L_0x0155:
            java.lang.String r2 = r2.toString()
        L_0x0159:
            X.0qQ.A0A(r2)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r2)
            java.util.ArrayList r3 = r1.A06
            r3.clear()
            java.util.Iterator r4 = r2.iterator()
        L_0x0169:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0179
            java.lang.Object r2 = r4.next()
            if (r2 == 0) goto L_0x0169
            r3.add(r2)
            goto L_0x0169
        L_0x0179:
            r2 = 512(0x200, float:7.175E-43)
            r1.A00 = r2
        L_0x017d:
            r44 = 0
            r21 = r1
            r22 = r10
            r24 = r18
            r26 = r17
            r28 = r23
            r30 = r23
            r33 = r31
            r38 = r23
            android.content.Intent r2 = X.RhU.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r46, r47)
            r1 = 64
            X.0kR.A07(r15, r2, r1)
            X.T6A r3 = r0.A05
            X.RDG r2 = X.RDG.A04
            X.RDI r1 = X.RDI.A06
            r0 = r39
            r3.A00(r2, r1, r0)
            return
        L_0x01a4:
            java.lang.String r3 = r49.toString()
            if (r3 != 0) goto L_0x01ae
        L_0x01aa:
            java.lang.String r3 = "Empty AR model path"
            if (r50 == 0) goto L_0x01b4
        L_0x01ae:
            java.lang.String r2 = r50.toString()
            if (r2 != 0) goto L_0x01b6
        L_0x01b4:
            java.lang.String r2 = "Empty error message"
        L_0x01b6:
            java.lang.String r1 = "model path: "
            r0 = 430(0x1ae, float:6.03E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r1 = X.002.A0u(r1, r3, r0, r2)
            java.lang.String r0 = "Selfie_captcha"
            X.0wb.A03(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12056Slj.D51(X.8LL, java.lang.Exception):void");
    }
}
