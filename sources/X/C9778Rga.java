package X;

/* renamed from: X.Rga  reason: case insensitive filesystem */
public abstract class C9778Rga {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.instagram.challenge.selfiecaptchachallenge.IgFaceTrackerModelsProvider} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.content.Context, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r34v0, types: [java.lang.Object, com.facebook.smartcapture.facetracker.FaceTrackerProvider] */
    /* JADX WARNING: type inference failed for: r38v1, types: [com.facebook.smartcapture.ui.SelfieCaptureUi] */
    /* JADX WARNING: type inference failed for: r36v1, types: [com.facebook.smartcapture.resources.ResourcesProvider] */
    /* JADX WARNING: type inference failed for: r33v0, types: [com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider] */
    /* JADX WARNING: type inference failed for: r38v3 */
    /* JADX WARNING: type inference failed for: r36v3 */
    /* JADX WARNING: type inference failed for: r38v4 */
    /* JADX WARNING: type inference failed for: r36v4 */
    /* JADX WARNING: Can't wrap try/catch for region: R(36:7|(1:9)|10|11|12|(1:14)(1:16)|15|17|(2:18|(2:20|(1:26)(2:114|24))(4:115|27|(1:29)|(2:33|(2:34|(2:36|(1:41)(3:118|40|42))(1:119)))(0)))|25|43|44|45|46|47|48|49|50|51|52|(1:55)|56|(1:(11:59|60|61|62|63|64|(1:66)|67|(4:70|(2:72|125)(1:124)|122|68)|123|74))(1:73)|75|(1:77)(1:84)|78|(1:80)|81|(7:83|85|86|87|(6:90|(2:92|(2:128|94)(1:95))|126|96|97|88)|127|98)|101|102|103|104|(1:106)|107|108) */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02d6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02d7, code lost:
        r3.logError("OpenSelfieCapture call failed", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02dc, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0258, code lost:
        if (r8 != null) goto L_0x0277;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x017e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0199 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x01c8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r55, X.AnonymousClass6Tm r56) {
        /*
            r13 = 1
            r29 = r55
            X.0lg r0 = X.C308206Td.A0B(r29)
            X.0qQ.A0B(r0, r13)
            X.C308206Td.A04(r29)
            X.SqZ r3 = new X.SqZ
            r3.<init>(r0)
            r1 = r56
            java.util.List r0 = r1.A00
            java.lang.Object r4 = r0.get(r13)
            boolean r2 = r4 instanceof java.lang.Number
            if (r2 != 0) goto L_0x001f
            r4 = 0
        L_0x001f:
            java.lang.String r8 = java.lang.String.valueOf(r4)
            r14 = 2
            java.lang.String r7 = X.DbU.A0t(r0, r14)
            android.os.Parcelable$Creator r2 = com.facebook.smartcapture.logging.CommonLoggingFields.CREATOR
            X.RF2 r5 = X.RF2.LOW_END
            X.0qQ.A0A(r7)
            r11 = 0
            java.lang.String r6 = "v1_selfie"
            com.facebook.smartcapture.logging.CommonLoggingFields r2 = new com.facebook.smartcapture.logging.CommonLoggingFields
            r4 = r2
            r9 = r11
            r10 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r3.setCommonFields(r2)
            java.lang.String r5 = "bloks_action_called"
            r3.logEvent(r5)
            androidx.fragment.app.FragmentActivity r2 = X.C308206Td.A04(r29)
            boolean r4 = r2 instanceof com.instagram.base.activity.IgFragmentActivity
            if (r4 == 0) goto L_0x02dd
            com.instagram.base.activity.IgFragmentActivity r2 = (com.instagram.base.activity.IgFragmentActivity) r2
            if (r2 == 0) goto L_0x02dd
            X.0lg r6 = X.C308206Td.A0B(r29)
            r16 = 0
            X.0qQ.A0B(r6, r14)
            java.lang.Integer r43 = X.AnonymousClass05K.A00
            java.lang.String r49 = r6.getToken()
            com.facebook.facedetection.amlfacetracker.SelfieFaceTrackerProvider r34 = new com.facebook.facedetection.amlfacetracker.SelfieFaceTrackerProvider
            r34.<init>()
            com.instagram.challenge.selfiecaptchachallenge.IgFaceTrackerModelsProvider r28 = new com.instagram.challenge.selfiecaptchachallenge.IgFaceTrackerModelsProvider
            r28.<init>()
            r4 = r28
            r4.A00 = r6
            com.facebook.smartcapture.ig.logging.IgSmartCaptureLoggerProvider r27 = new com.facebook.smartcapture.ig.logging.IgSmartCaptureLoggerProvider
            r4 = r27
            r4.<init>((X.0lg) r6)
            com.facebook.smartcapture.ui.ig.IgSelfieCaptureUi r38 = new com.facebook.smartcapture.ui.ig.IgSelfieCaptureUi
            r38.<init>()
            boolean r4 = X.AnonymousClass3HA.A00(r2)
            r52 = 2132018197(0x7f140415, float:1.9674694E38)
            if (r4 == 0) goto L_0x0084
            r52 = 2132018198(0x7f140416, float:1.9674696E38)
        L_0x0084:
            com.facebook.smartcapture.ui.ig.IgSelfieResourcesProvider r36 = new com.facebook.smartcapture.ui.ig.IgSelfieResourcesProvider
            r36.<init>()
            r3.logEvent(r5)
            r7 = 0
            java.lang.Object r5 = r0.get(r13)     // Catch:{ all -> 0x02d6 }
            boolean r4 = r5 instanceof java.lang.Number     // Catch:{ all -> 0x02d6 }
            if (r4 == 0) goto L_0x00ef
            long r53 = X.AnonymousClass7TE.A0R(r5)     // Catch:{ all -> 0x02d6 }
        L_0x0099:
            java.lang.String r26 = X.DbU.A0t(r0, r14)     // Catch:{ all -> 0x02d6 }
            r4 = 3
            java.lang.Object r15 = r0.get(r4)     // Catch:{ all -> 0x02d6 }
            java.util.List r15 = (java.util.List) r15     // Catch:{ all -> 0x02d6 }
            r4 = 4
            X.4uI r25 = X.DbW.A0P(r1, r4)     // Catch:{ all -> 0x02d6 }
            r4 = 5
            X.4uI r24 = X.DbV.A0R(r0, r4)     // Catch:{ all -> 0x02d6 }
            r0 = 6
            java.lang.Object r6 = r1.A03(r0)     // Catch:{ all -> 0x02d6 }
            X.4tV r6 = (X.C276544tV) r6     // Catch:{ all -> 0x02d6 }
            r0 = 35
            r6.A0R(r0, r13)     // Catch:{ all -> 0x02d6 }
            r0 = 49
            boolean r23 = r6.A0R(r0, r7)     // Catch:{ all -> 0x02d6 }
            r0 = 58
            boolean r22 = r6.A0R(r0, r7)     // Catch:{ all -> 0x02d6 }
            r0 = 59
            boolean r55 = r6.A0R(r0, r7)     // Catch:{ all -> 0x02d6 }
            r0 = 50
            boolean r21 = r6.A0R(r0, r7)     // Catch:{ all -> 0x02d6 }
            r0 = 52
            java.lang.String r20 = r6.A0K(r0)     // Catch:{ all -> 0x02d6 }
            r0 = 36
            boolean r19 = r6.A0R(r0, r7)     // Catch:{ all -> 0x02d6 }
            boolean r18 = r6.A0T(r7)     // Catch:{ all -> 0x02d6 }
            r1 = 42
            r0 = 512(0x200, float:7.175E-43)
            int r17 = r6.A03(r1, r0)     // Catch:{ all -> 0x02d6 }
            X.0rm r5 = X.C51965G9l.A11()     // Catch:{ all -> 0x02d6 }
            goto L_0x00f2
        L_0x00ef:
            r53 = 0
            goto L_0x0099
        L_0x00f2:
            r1 = 0
        L_0x00f3:
            android.util.SparseArray r4 = r6.A05     // Catch:{ all -> 0x02d6 }
            int r0 = r4.size()     // Catch:{ all -> 0x02d6 }
            if (r1 >= r0) goto L_0x013a
            java.lang.Object r0 = r4.valueAt(r1)     // Catch:{ all -> 0x02d6 }
            if (r0 == 0) goto L_0x0137
            int r8 = r4.keyAt(r1)     // Catch:{ all -> 0x02d6 }
            r4 = 51
            if (r8 != r4) goto L_0x0137
            r5.A00 = r0     // Catch:{ all -> 0x02d6 }
        L_0x010b:
            java.lang.Object r8 = r5.A00     // Catch:{ all -> 0x02d6 }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x02d6 }
            r0 = 62
            boolean r10 = r6.A0R(r0, r7)     // Catch:{ all -> 0x02d6 }
            X.0qQ.A0A(r26)     // Catch:{ all -> 0x02d6 }
            X.0qQ.A0A(r15)     // Catch:{ all -> 0x02d6 }
            r0 = r26
            X.AnonymousClass7TF.A1C(r0, r14, r15)     // Catch:{ all -> 0x02d6 }
            java.lang.String r47 = java.lang.String.valueOf(r53)     // Catch:{ all -> 0x02d6 }
            java.lang.String r9 = ".jpg"
            X.2Rs r0 = new X.2Rs     // Catch:{ all -> 0x02d6 }
            r0.<init>(r2)     // Catch:{ all -> 0x02d6 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ all -> 0x02d6 }
            java.lang.String r5 = "selfie"
            java.io.File r0 = X.Pxf.A0U(r5, r9, r0)     // Catch:{ all -> 0x02d6 }
            goto L_0x0179
        L_0x0137:
            int r1 = r1 + 1
            goto L_0x00f3
        L_0x013a:
            X.4tk r10 = X.C276674ti.A00()     // Catch:{ all -> 0x02d6 }
            java.lang.ThreadLocal r0 = X.C276684tj.A01     // Catch:{ all -> 0x02d6 }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x02d6 }
            X.4tl r4 = (X.C276704tl) r4     // Catch:{ all -> 0x02d6 }
            if (r4 != 0) goto L_0x014a
            X.4tl r4 = X.C276704tl.DEFAULT     // Catch:{ all -> 0x02d6 }
        L_0x014a:
            if (r10 == 0) goto L_0x010b
            X.4tl r0 = X.C276704tl.UNBOUND     // Catch:{ all -> 0x02d6 }
            if (r4 == r0) goto L_0x010b
            X.4ta r0 = r6.A06     // Catch:{ all -> 0x02d6 }
            java.lang.Object r1 = r0.A00()     // Catch:{ all -> 0x02d6 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x02d6 }
            r0 = 0
        L_0x0159:
            int r8 = r1.size()     // Catch:{ all -> 0x02d6 }
            if (r0 >= r8) goto L_0x010b
            int r9 = r1.keyAt(r0)     // Catch:{ all -> 0x02d6 }
            X.TPR r8 = new X.TPR     // Catch:{ all -> 0x02d6 }
            r8.<init>(r6, r9)     // Catch:{ all -> 0x02d6 }
            java.lang.Object r8 = X.C276674ti.A01(r4, r10, r8)     // Catch:{ all -> 0x02d6 }
            if (r8 == 0) goto L_0x0173
            r12 = 51
            if (r9 != r12) goto L_0x0173
            goto L_0x0176
        L_0x0173:
            int r0 = r0 + 1
            goto L_0x0159
        L_0x0176:
            r5.A00 = r8     // Catch:{ all -> 0x02d6 }
            goto L_0x010b
        L_0x0179:
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x017e }
            goto L_0x0182
        L_0x017e:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x02d6 }
        L_0x0182:
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x02d6 }
            java.lang.String r4 = ".mp4"
            X.2Rs r0 = new X.2Rs     // Catch:{ all -> 0x02d6 }
            r0.<init>(r2)     // Catch:{ all -> 0x02d6 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ all -> 0x02d6 }
            java.io.File r0 = X.Pxf.A0U(r5, r4, r0)     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0199 }
            goto L_0x019d
        L_0x0199:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02d6 }
        L_0x019d:
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x02d6 }
            java.lang.String r6 = "Failed to create temp file"
            if (r1 == 0) goto L_0x01a6
            if (r0 != 0) goto L_0x01a9
        L_0x01a6:
            r3.logError(r6, r11)     // Catch:{ all -> 0x02d6 }
        L_0x01a9:
            com.facebook.smartcapture.capture.DefaultEvidenceRecorderProvider r4 = new com.facebook.smartcapture.capture.DefaultEvidenceRecorderProvider     // Catch:{ all -> 0x02d6 }
            r4.<init>()     // Catch:{ all -> 0x02d6 }
            r4.A05 = r0     // Catch:{ all -> 0x02d6 }
            r4.A04 = r1     // Catch:{ all -> 0x02d6 }
            if (r19 != 0) goto L_0x01f1
            if (r18 == 0) goto L_0x01fa
            X.2Rs r0 = new X.2Rs     // Catch:{ all -> 0x02d6 }
            r0.<init>(r2)     // Catch:{ all -> 0x02d6 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ all -> 0x02d6 }
            java.io.File r0 = X.Pxf.A0U(r5, r9, r0)     // Catch:{ all -> 0x02d6 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x01c8 }
            goto L_0x01cc
        L_0x01c8:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02d6 }
        L_0x01cc:
            X.0qQ.A0A(r0)     // Catch:{ all -> 0x02d6 }
            if (r0 != 0) goto L_0x01d4
            r3.logError(r6, r11)     // Catch:{ all -> 0x02d6 }
        L_0x01d4:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)     // Catch:{ all -> 0x02d6 }
            java.util.ArrayList r1 = r4.A06     // Catch:{ all -> 0x02d6 }
            r1.clear()     // Catch:{ all -> 0x02d6 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x02d6 }
        L_0x01e1:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02d6 }
            if (r0 == 0) goto L_0x01f4
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x02d6 }
            if (r0 == 0) goto L_0x01e1
            r1.add(r0)     // Catch:{ all -> 0x02d6 }
            goto L_0x01e1
        L_0x01f1:
            r4.A04 = r1     // Catch:{ all -> 0x02d6 }
            goto L_0x01fa
        L_0x01f4:
            r0 = r17
            r4.A00 = r0     // Catch:{ all -> 0x02d6 }
            r4.A04 = r11     // Catch:{ all -> 0x02d6 }
        L_0x01fa:
            java.lang.Boolean r39 = java.lang.Boolean.valueOf(r21)     // Catch:{ all -> 0x02d6 }
            java.lang.Boolean r40 = java.lang.Boolean.valueOf(r23)     // Catch:{ all -> 0x02d6 }
            java.lang.Integer r44 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x02d6 }
            if (r10 == 0) goto L_0x021c
            X.REX r32 = X.REX.NONE     // Catch:{ all -> 0x02d6 }
        L_0x0208:
            java.lang.Boolean r41 = java.lang.Boolean.valueOf(r22)     // Catch:{ all -> 0x02d6 }
            if (r8 == 0) goto L_0x0215
            com.facebook.smartcapture.resources.stringoverride.bloks.BloksStringOverrideFactory r16 = new com.facebook.smartcapture.resources.stringoverride.bloks.BloksStringOverrideFactory     // Catch:{ all -> 0x02d6 }
            r0 = r16
            r0.<init>(r8)     // Catch:{ all -> 0x02d6 }
        L_0x0215:
            boolean r0 = r15.isEmpty()     // Catch:{ all -> 0x02d6 }
            if (r0 != 0) goto L_0x025a
            goto L_0x021f
        L_0x021c:
            X.REX r32 = X.REX.ICON     // Catch:{ all -> 0x02d6 }
            goto L_0x0208
        L_0x021f:
            r8 = 0
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()     // Catch:{ IllegalArgumentException -> 0x0258 }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ IllegalArgumentException -> 0x0258 }
        L_0x0228:
            boolean r0 = r15.hasNext()     // Catch:{ IllegalArgumentException -> 0x0258 }
            if (r0 == 0) goto L_0x0252
            java.lang.String r12 = X.AnonymousClass7TE.A18(r15)     // Catch:{ IllegalArgumentException -> 0x0258 }
            X.RFH[] r5 = X.RFH.values()     // Catch:{ IllegalArgumentException -> 0x0258 }
            int r10 = r5.length     // Catch:{ IllegalArgumentException -> 0x0258 }
            r0 = 0
        L_0x0238:
            if (r0 >= r10) goto L_0x024b
            r1 = r5[r0]     // Catch:{ IllegalArgumentException -> 0x0258 }
            java.lang.String r9 = r1.A00     // Catch:{ IllegalArgumentException -> 0x0258 }
            boolean r9 = X.00p.A0j(r9, r12, r13)     // Catch:{ IllegalArgumentException -> 0x0258 }
            if (r9 == 0) goto L_0x0248
            r6.add(r1)     // Catch:{ IllegalArgumentException -> 0x0258 }
            goto L_0x0228
        L_0x0248:
            int r0 = r0 + 1
            goto L_0x0238
        L_0x024b:
            java.lang.String r0 = "Incorrect value argument"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IllegalArgumentException -> 0x0258 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0258 }
        L_0x0252:
            com.facebook.smartcapture.config.ChallengeProvider r0 = new com.facebook.smartcapture.config.ChallengeProvider     // Catch:{ IllegalArgumentException -> 0x0258 }
            r0.<init>((java.util.List) r6)     // Catch:{ IllegalArgumentException -> 0x0258 }
            r8 = r0
        L_0x0258:
            if (r8 != 0) goto L_0x0277
        L_0x025a:
            java.lang.String r0 = "Couldn't parse raw head movements"
            r3.logError(r0, r11)     // Catch:{ all -> 0x02d6 }
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x02d6 }
            X.RFH r1 = X.RFH.LEFT     // Catch:{ all -> 0x02d6 }
            r0.add(r1)     // Catch:{ all -> 0x02d6 }
            X.RFH r1 = X.RFH.RIGHT     // Catch:{ all -> 0x02d6 }
            r0.add(r1)     // Catch:{ all -> 0x02d6 }
            X.RFH r1 = X.RFH.UP     // Catch:{ all -> 0x02d6 }
            r0.add(r1)     // Catch:{ all -> 0x02d6 }
            com.facebook.smartcapture.config.ChallengeProvider r8 = new com.facebook.smartcapture.config.ChallengeProvider     // Catch:{ all -> 0x02d6 }
            r8.<init>((java.util.List) r0)     // Catch:{ all -> 0x02d6 }
        L_0x0277:
            java.lang.String r1 = "XMDS"
            r0 = r20
            boolean r0 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x02d6 }
            if (r0 == 0) goto L_0x0290
            java.lang.Integer r43 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x02d6 }
            com.facebook.smartcapture.ui.ig.XMDSIgSelfieCaptureUi r38 = new com.facebook.smartcapture.ui.ig.XMDSIgSelfieCaptureUi     // Catch:{ all -> 0x02d6 }
            r38.<init>()     // Catch:{ all -> 0x02d6 }
            com.facebook.smartcapture.ui.ig.XMDSIgSelfieResourcesProvider r36 = new com.facebook.smartcapture.ui.ig.XMDSIgSelfieResourcesProvider     // Catch:{ all -> 0x02d6 }
            r36.<init>()     // Catch:{ all -> 0x02d6 }
            r52 = 2132018199(0x7f140417, float:1.9674698E38)
        L_0x0290:
            r0 = r29
            X.6Rm r6 = r0.A03     // Catch:{ all -> 0x02d6 }
            X.0qQ.A0A(r6)     // Catch:{ all -> 0x02d6 }
            X.RwI r9 = new X.RwI     // Catch:{ all -> 0x02d6 }
            r1 = r25
            r9.<init>(r6, r0, r1)     // Catch:{ all -> 0x02d6 }
            X.0qQ.A0A(r6)     // Catch:{ all -> 0x02d6 }
            X.RuF r5 = new X.RuF     // Catch:{ all -> 0x02d6 }
            r1 = r0
            r0 = r24
            r5.<init>(r6, r1, r0)     // Catch:{ all -> 0x02d6 }
            X.T73 r0 = new X.T73     // Catch:{ all -> 0x02d6 }
            r0.<init>(r14, r5, r9, r2)     // Catch:{ all -> 0x02d6 }
            r2.registerOnActivityResultListener(r0)     // Catch:{ all -> 0x02d6 }
            r29 = r2
            r30 = r4
            r31 = r8
            r33 = r28
            r35 = r27
            r37 = r16
            r42 = r40
            r45 = r11
            r46 = r11
            r48 = r26
            r50 = r11
            r51 = r11
            r56 = r7
            android.content.Intent r1 = X.RhU.A00(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r55, r56)     // Catch:{ all -> 0x02d6 }
            r0 = 41262(0xa12e, float:5.782E-41)
            X.AnonymousClass0b5.A00(r2, r1, r0)     // Catch:{ all -> 0x02d6 }
            return r11
        L_0x02d6:
            r1 = move-exception
            java.lang.String r0 = "OpenSelfieCapture call failed"
            r3.logError(r0, r1)
            throw r1
        L_0x02dd:
            java.lang.String r0 = "Activity is not IgFragmentActivity"
            r3.logError(r0, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9778Rga.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
