package com.instagram.ml.remotepresence;

import X.0KC;
import X.0qQ;
import X.0sP;
import X.AnonymousClass0eM;
import X.AnonymousClass0lh;
import X.AnonymousClass385;
import X.AnonymousClass930;
import X.C301305yu;
import X.C59723JVh;
import com.facebook.mantle.common.mantledatavalue.MantleDataValue;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class RpModelDownloadManager implements AnonymousClass0lh {
    public final UserSession A00;
    public final List A01;
    public final AnonymousClass0eM A02;

    public static final void A00(C59723JVh jVh, ImmutableMap immutableMap) {
        Object obj = null;
        if (immutableMap != null && immutableMap.containsKey("model_path")) {
            0sP r3 = (0sP) jVh.A05;
            MantleDataValue mantleDataValue = (MantleDataValue) immutableMap.get("model_path");
            if (mantleDataValue != null && ((obj = mantleDataValue.value) == null || mantleDataValue.type != C301305yu.STRING)) {
                obj = "";
            }
            r3.invoke(obj);
            immutableMap.get("model_path");
        }
        AnonymousClass930 r0 = (AnonymousClass930) jVh.A03;
        if (r0 != null) {
            r0.A00.markerPoint(331812717, "MODEL_DOWNLOAD_END");
        }
    }

    public static final void A01(C59723JVh jVh, Throwable th) {
        0qQ.A0B(jVh, 0);
        0KC.A0L("RpModelDownloadManager", "runMantleWithConfigStr callback onFailure for usecase %s", th, new Object[]{jVh.A07});
        AnonymousClass930 r4 = (AnonymousClass930) jVh.A03;
        if (r4 != null) {
            String message = th.getMessage();
            r4.A00.markerPoint(331812717, "MODEL_DOWNLOAD_END");
            AnonymousClass930.A00(r4, message, false);
        }
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, X.3tw] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.util.List r15, X.AnonymousClass4D7 r16) {
        /*
            r14 = this;
            r3 = 6
            r4 = r16
            boolean r0 = X.ME9.A03(r3, r4)
            if (r0 == 0) goto L_0x00fa
            r8 = r4
            X.ME9 r8 = (X.ME9) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00fa
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r8.A03
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r6 = 1
            if (r0 == 0) goto L_0x00f0
            if (r0 != r6) goto L_0x0103
            java.lang.Object r5 = r8.A02
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r4 = r8.A01
            com.instagram.ml.remotepresence.RpModelDownloadManager r4 = (com.instagram.ml.remotepresence.RpModelDownloadManager) r4
            X.0eS.A00(r1)
        L_0x002d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r3 = r5.next()
            X.JVh r3 = (X.C59723JVh) r3
            r8.A01 = r4
            r8.A02 = r5
            r8.A00 = r6
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x002d
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x00de
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x00de
            java.lang.Object r1 = r3.A01
            X.JV2 r1 = (X.JV2) r1
            if (r1 != 0) goto L_0x0056
            X.JV2 r1 = new X.JV2
            r1.<init>()
        L_0x0056:
            X.0eM r0 = r4.A02
            java.lang.Object r11 = r0.getValue()
            X.385 r11 = (X.AnonymousClass385) r11
            java.lang.String r10 = r3.A07
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            com.instagram.common.session.UserSession r2 = r4.A00
            boolean r13 = r1.A02
            boolean r3 = r1.A03
            int r12 = r1.A01
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.0qQ.A0B(r2, r6)
            X.9Ed r1 = new X.9Ed
            r1.<init>()
            if (r13 == 0) goto L_0x00db
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x007a:
            r1.A01(r0)
            r1.A05 = r3
            X.3ty r3 = r1.A00()
            java.lang.String r0 = "modelUseCse"
            X.0eP r13 = new X.0eP
            r13.<init>(r0, r10)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.String r0 = "maxRetries"
            X.0eP r12 = new X.0eP
            r12.<init>(r0, r1)
            java.lang.String r2 = r2.A05
            r0 = 4167(0x1047, float:5.839E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r2)
            X.0eP[] r0 = new X.0eP[]{r13, r12, r0}
            java.util.HashMap r2 = X.0Yt.A02(r0)
            java.lang.Class<com.instagram.ml.remotepresence.RpModelDownloadWorker> r0 = com.instagram.ml.remotepresence.RpModelDownloadWorker.class
            X.QFs r12 = new X.QFs
            r12.<init>(r0)
            r12.A04(r10)
            r12.A02(r3)
            X.3tw r1 = new X.3tw
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            r1.A00 = r0
            X.3DG r0 = r12.A00
            r0.A0C = r1
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r12.A03(r3, r0, r1)
            X.9En r0 = r12.A00()
            X.QFt r0 = (X.C7485QFt) r0
            r11.A02(r0, r9, r10)
            goto L_0x002d
        L_0x00db:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x007a
        L_0x00de:
            java.lang.Object r2 = r3.A04
            X.0r6 r2 = (X.AnonymousClass0r6) r2
            r1 = 18
            X.MCl r0 = new X.MCl
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r4)
            java.lang.Object r0 = r2.collect(r0, r8)
            if (r0 != r7) goto L_0x002d
            return r7
        L_0x00f0:
            X.0eS.A00(r1)
            java.util.Iterator r5 = r15.iterator()
            r4 = r14
            goto L_0x002d
        L_0x00fa:
            X.ME9 r8 = X.ME9.A00(r14, r4, r3)
            goto L_0x0017
        L_0x0100:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x0103:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ml.remotepresence.RpModelDownloadManager.A02(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d8, code lost:
        if (X.182.A06(r0, r1, 36320966464381933L) != false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0184, code lost:
        if (r4.A00() == false) goto L_0x0186;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0223  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RpModelDownloadManager(com.instagram.common.session.UserSession r36, android.content.Context r37) {
        /*
            r35 = this;
            r12 = r35
            r12.<init>()
            r1 = r36
            r12.A00 = r1
            r11 = 0
            X.0Tu r0 = X.DbS.A0J(r1, r11)
            r2 = 36602574585139884(0x8209d9000312ac, double:3.2109537821556786E-306)
            long r3 = X.182.A01(r0, r1, r2)
            r5 = 0
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0291
            r2 = 36884049561780780(0x8309d90002022c, double:3.388959690792138E-306)
            java.lang.String r26 = X.182.A04(r0, r1, r2)
            r2 = 36602574584943275(0x8209d9000012ab, double:3.210953782031342E-306)
            long r3 = X.182.A01(r0, r1, r2)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r29 = X.AnonymousClass7TF.A1R(r2)
            X.G3Y r27 = X.G3Y.A00
            X.032 r28 = X.C59686JTs.A01(r1)
            r30 = 1
            java.lang.String r25 = "bwe_mobile_congestion_characterization"
            X.JVh r24 = new X.JVh
            r24.<init>(r25, r26, r27, r28, r29, r30)
        L_0x0044:
            r2 = 36604223852581924(0x820b5900031424, double:3.2119967855270916E-306)
            long r3 = X.182.A01(r0, r1, r2)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0266
            r2 = 36885698829222548(0x830b5900020294, double:3.390002694163379E-306)
            java.lang.String r27 = X.182.A04(r0, r1, r2)
            r2 = 36604223852385315(0x820b5900001423, double:3.211996785402755E-306)
            long r3 = X.182.A01(r0, r1, r2)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r30 = X.AnonymousClass7TF.A1R(r2)
            X.G3Z r28 = X.G3Z.A00
            X.032 r29 = X.C59686JTs.A01(r1)
            r31 = 1
            java.lang.String r26 = "networking_mobile_generalized_characterization"
            X.JVh r25 = new X.JVh
            r25.<init>(r26, r27, r28, r29, r30, r31)
        L_0x0078:
            r22 = 1
            r2 = 36605293299438806(0x820c52000314d6, double:3.2126731080257006E-306)
            long r3 = X.182.A01(r0, r1, r2)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x023d
            r2 = 36886768276079324(0x830c52000202dc, double:3.390679016661921E-306)
            java.lang.String r28 = X.182.A04(r0, r1, r2)
            r2 = 36605293299242197(0x820c52000014d5, double:3.2126731079013643E-306)
            long r3 = X.182.A01(r0, r1, r2)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r31 = X.AnonymousClass7TF.A1R(r2)
            X.G3a r29 = X.C51816G3a.A00
            X.032 r30 = X.C59686JTs.A01(r1)
            java.lang.String r27 = "bwe_mobile_stable_bitrate_prediction"
            X.JVh r26 = new X.JVh
            r32 = r22
            r26.<init>(r27, r28, r29, r30, r31, r32)
        L_0x00ae:
            r2 = 36320966464381933(0x8109ba000223ed, double:3.032863672643465E-306)
            boolean r2 = X.182.A06(r0, r1, r2)
            if (r2 == 0) goto L_0x0236
            r2 = 36883916417860123(0x8309ba0003021b, double:3.388875490040587E-306)
        L_0x00be:
            java.lang.String r29 = X.182.A04(r0, r1, r2)
            r2 = 36320966464250860(0x8109ba000023ec, double:3.032863672560574E-306)
            boolean r2 = X.182.A06(r0, r1, r2)
            if (r2 != 0) goto L_0x00da
            r2 = 36320966464381933(0x8109ba000223ed, double:3.032863672643465E-306)
            boolean r2 = X.182.A06(r0, r1, r2)
            r32 = 0
            if (r2 == 0) goto L_0x00dc
        L_0x00da:
            r32 = 1
        L_0x00dc:
            r3 = 31
            X.MPB r2 = new X.MPB
            r10 = r37
            r2.<init>((int) r3, (java.lang.Object) r10, (java.lang.Object) r1)
            X.032 r31 = X.C59686JTs.A01(r1)
            java.lang.String r28 = "rtc_automos_ns"
            X.JVh r27 = new X.JVh
            r30 = r2
            r33 = r22
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r2 = 36887133348233970(0x830ca7000102f2, double:3.390909889762547E-306)
            java.lang.String r30 = X.182.A04(r0, r1, r2)
            r2 = 36324183394758523(0x810ca700002f7b, double:3.0348980723671595E-306)
            boolean r33 = X.182.A06(r0, r1, r2)
            r3 = 32
            X.MPB r2 = new X.MPB
            r2.<init>((int) r3, (java.lang.Object) r10, (java.lang.Object) r1)
            X.032 r32 = X.C59686JTs.A01(r1)
            java.lang.String r29 = "rtc_noise_suppression"
            X.JVh r28 = new X.JVh
            r31 = r2
            r34 = r22
            r28.<init>(r29, r30, r31, r32, r33, r34)
            r8 = 4
            X.5yp r4 = new X.5yp
            r4.<init>(r1)
            X.930 r7 = X.C301275yq.A00(r1)
            boolean r2 = r4.A00()
            if (r2 == 0) goto L_0x0232
            r2 = 16
            X.G2c r6 = new X.G2c
            r6.<init>(r7, r2)
            r2 = 17
            X.G2c r5 = new X.G2c
            r5.<init>(r7, r2)
            r2 = 21
            X.MP7 r3 = new X.MP7
            r3.<init>(r7, r2)
            java.lang.String r2 = "calpreload"
            X.C301285yr.A00(r10, r2, r6, r5, r3)
            com.instagram.common.session.UserSession r5 = r4.A00
            r2 = 36325527720506391(0x810de0000f3417, double:3.0357482293832765E-306)
            boolean r2 = X.182.A06(r0, r5, r2)
            if (r2 == 0) goto L_0x0227
            r2 = 36607002697274887(0x820de000101607, double:3.213754138100431E-306)
            long r15 = X.182.A01(r0, r5, r2)
            r13 = 0
            int r6 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0227
            long r2 = X.182.A01(r0, r5, r2)
        L_0x0166:
            boolean r5 = r4.A00()
            if (r5 == 0) goto L_0x0223
            com.instagram.common.session.UserSession r9 = r4.A00
            r5 = 36888477672997669(0x830de000010325, double:3.3917600461562715E-306)
            java.lang.String r18 = X.182.A04(r0, r9, r5)
            X.0qQ.A0A(r18)
        L_0x017a:
            boolean r5 = X.C301285yr.A01
            if (r5 == 0) goto L_0x0186
            boolean r5 = r4.A00()
            r21 = 1
            if (r5 != 0) goto L_0x0188
        L_0x0186:
            r21 = 0
        L_0x0188:
            X.J6m r9 = new X.J6m
            r9.<init>((int) r8, (java.lang.Object) r7, (java.lang.Object) r10, (java.lang.Object) r1)
            X.032 r20 = X.C59686JTs.A01(r1)
            boolean r6 = X.C301285yr.A01
            java.lang.String r5 = "shouldCheckMetadata"
            X.5yt r1 = com.facebook.mantle.common.mantledatavalue.MantleDataValue.Companion
            if (r6 == 0) goto L_0x0213
            X.5yu r1 = X.C301305yu.INT
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.facebook.mantle.common.mantledatavalue.MantleDataValue r6 = new com.facebook.mantle.common.mantledatavalue.MantleDataValue
            r6.<init>((X.C301305yu) r1, (java.lang.Object) r2)
            X.5yu r3 = X.C301305yu.BOOLEAN
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r22)
            com.facebook.mantle.common.mantledatavalue.MantleDataValue r1 = new com.facebook.mantle.common.mantledatavalue.MantleDataValue
            r1.<init>((X.C301305yu) r3, (java.lang.Object) r2)
            java.lang.String r2 = "modelVersion"
            com.google.common.collect.ImmutableMap r15 = com.google.common.collect.ImmutableMap.of(r2, r6, r5, r1)
        L_0x01b5:
            X.0qQ.A0A(r15)
            com.instagram.common.session.UserSession r3 = r4.A00
            r1 = 36325527719785487(0x810de00004340f, double:3.035748228927374E-306)
            boolean r23 = X.182.A06(r0, r3, r1)
            r1 = 36325527719851024(0x810de000053410, double:3.03574822896882E-306)
            boolean r5 = X.182.A06(r0, r3, r1)
            r1 = 36325527719916561(0x810de000063411, double:3.0357482290102656E-306)
            boolean r4 = X.182.A06(r0, r3, r1)
            r1 = 36607002696685062(0x820de000071606, double:3.213754137727423E-306)
            int r0 = X.DbS.A04(r0, r3, r1)
            X.JV2 r14 = new X.JV2
            r14.<init>(r0, r11, r5, r4)
            java.lang.String r17 = "speech_asr_ig_voice_memo-en_US"
            X.JVh r13 = new X.JVh
            r16 = r7
            r19 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r5 = r13
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            X.JVh[] r0 = new X.C59723JVh[]{r0, r1, r2, r3, r4, r5}
            java.util.List r0 = X.0sr.A1P(r0)
            r12.A01 = r0
            X.0eO r2 = X.0eO.A02
            r1 = 19
            X.G2c r0 = new X.G2c
            r0.<init>(r10, r1)
            X.0eM r0 = X.AnonymousClass0eN.A00(r2, r0)
            r12.A02 = r0
            return
        L_0x0213:
            X.5yu r3 = X.C301305yu.BOOLEAN
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r22)
            com.facebook.mantle.common.mantledatavalue.MantleDataValue r1 = new com.facebook.mantle.common.mantledatavalue.MantleDataValue
            r1.<init>((X.C301305yu) r3, (java.lang.Object) r2)
            com.google.common.collect.ImmutableMap r15 = com.google.common.collect.ImmutableMap.of(r5, r1)
            goto L_0x01b5
        L_0x0223:
            java.lang.String r18 = ""
            goto L_0x017a
        L_0x0227:
            boolean r2 = X.C301285yr.A01
            if (r2 == 0) goto L_0x0232
            int r2 = com.meta.cal.AudioSessionUtils.CppProxy.getModelVersion()
            long r2 = (long) r2
            goto L_0x0166
        L_0x0232:
            r2 = 0
            goto L_0x0166
        L_0x0236:
            r2 = 36883916417729050(0x8309ba0001021a, double:3.388875489957696E-306)
            goto L_0x00be
        L_0x023d:
            r2 = 36886768276013787(0x830c52000102db, double:3.3906790166204753E-306)
            java.lang.String r7 = X.182.A04(r0, r1, r2)
            r2 = 36605293299242197(0x820c52000014d5, double:3.2126731079013643E-306)
            long r3 = X.182.A01(r0, r1, r2)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r10 = X.AnonymousClass7TF.A1R(r2)
            X.5yo r8 = X.C301255yo.A00
            X.032 r9 = X.C59686JTs.A01(r1)
            java.lang.String r6 = "bwe_mobile_stable_bitrate_prediction"
            X.JVh r26 = new X.JVh
            r5 = r26
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x00ae
        L_0x0266:
            r2 = 36885698829157011(0x830b5900010293, double:3.3900026941219334E-306)
            java.lang.String r15 = X.182.A04(r0, r1, r2)
            r2 = 36604223852385315(0x820b5900001423, double:3.211996785402755E-306)
            long r3 = X.182.A01(r0, r1, r2)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r18 = X.AnonymousClass7TF.A1R(r2)
            X.5yn r16 = X.C301245yn.A00
            X.032 r17 = X.C59686JTs.A01(r1)
            java.lang.String r14 = "networking_mobile_generalized_characterization"
            X.JVh r25 = new X.JVh
            r13 = r25
            r19 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19)
            goto L_0x0078
        L_0x0291:
            r2 = 36884049561715243(0x8309d90001022b, double:3.3889596907506923E-306)
            java.lang.String r15 = X.182.A04(r0, r1, r2)
            r2 = 36602574584943275(0x8209d9000012ab, double:3.210953782031342E-306)
            long r3 = X.182.A01(r0, r1, r2)
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            boolean r18 = X.AnonymousClass7TF.A1R(r2)
            X.Dby r16 = X.C46330Dby.A00
            X.032 r17 = X.C59686JTs.A01(r1)
            java.lang.String r14 = "bwe_mobile_congestion_characterization"
            X.JVh r24 = new X.JVh
            r13 = r24
            r19 = r11
            r13.<init>(r14, r15, r16, r17, r18, r19)
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ml.remotepresence.RpModelDownloadManager.<init>(com.instagram.common.session.UserSession, android.content.Context):void");
    }

    public final void onSessionWillEnd() {
        for (C59723JVh jVh : this.A01) {
            ((AnonymousClass385) this.A02.getValue()).A04(jVh.A07);
        }
    }
}
