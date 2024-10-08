package com.instagram.camera.effect.mq;

import X.0nY;
import X.AnonymousClass6e9;
import X.AnonymousClass82G;
import X.AnonymousClass82H;
import X.AnonymousClass82I;
import X.AnonymousClass82J;
import X.AnonymousClass82K;
import X.AnonymousClass82M;
import X.AnonymousClass82N;
import X.AnonymousClass82P;
import X.AnonymousClass82S;
import X.AnonymousClass82T;
import X.C312146dt;
import X.C312156dv;
import X.C312196dz;
import X.C312206e0;
import X.C312336eF;
import X.C312346eH;
import X.C312366eJ;
import X.C312396eM;
import X.C340307l3;
import X.C340397lC;
import X.C3496181b;
import X.C3496481e;
import X.C3497681r;
import X.C357638Yz;
import X.C357848Zx;
import X.C361848gv;
import X.C371458yK;
import X.C371698yt;
import X.C371978zS;
import X.C3726491t;
import X.C60340gF;
import X.C61480nO;
import X.QLM;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class IgCameraEffectsController extends AnonymousClass82G {
    public C371458yK A00;
    public C357848Zx A01;
    public AnonymousClass6e9 A02;
    public C312366eJ A03;
    public C312346eH A04;
    public C312396eM A05;
    public C312336eF A06;
    public C361848gv A07;
    public C340307l3 A08;
    public CameraAREffect A09 = null;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public QLM A0E;
    public final Context A0F;
    public final AnonymousClass82S A0G;
    public final AnonymousClass82P A0H;
    public final C312156dv A0I;
    public final AnonymousClass82K A0J;
    public final C3496181b A0K;
    public final C312196dz A0L;
    public final AnonymousClass82T A0M;
    public final UserSession A0N;
    public final C61480nO A0O;
    public final Set A0P = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final Set A0Q = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final Set A0R = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final Set A0S = new CopyOnWriteArraySet(Collections.newSetFromMap(new WeakHashMap()));
    public final SortedMap A0T = Collections.synchronizedSortedMap(new TreeMap());
    public final AnonymousClass82N A0U;
    public final AnonymousClass82I A0V = new AnonymousClass82H(this);
    public final C3497681r A0W;
    public final C357638Yz A0X;
    public final C3496481e A0Y;

    private CameraAREffect A00() {
        C312206e0 B0C;
        C312196dz r0 = this.A0L;
        if (r0 != null) {
            CameraAREffect cameraAREffect = this.A09;
            if (cameraAREffect == null || ((B0C = r0.B0C()) != null && C312206e0.A00(cameraAREffect, B0C))) {
                return cameraAREffect;
            }
            this.A0W.AVd(cameraAREffect.A0K, "effect_not_available", (String) null);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.6eH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.6eJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.6eM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.6eF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.6eH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: X.6eJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: X.6eM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: X.6eF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: X.6eF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: X.6eM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: X.6eJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.6eH} */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.8xz, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0129, code lost:
        if (r2.CSz(r9) == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012d, code lost:
        if (r7 != null) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0133, code lost:
        if (r7.A0I() == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0135, code lost:
        r26 = r2.Adn();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0139, code lost:
        r12 = r7.A0K;
        r8 = r4.A04;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013f, code lost:
        if (r8 != null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0141, code lost:
        r8 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0146, code lost:
        r5 = r4.A03;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0148, code lost:
        if (r5 != null) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014a, code lost:
        r5 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014f, code lost:
        r1 = r4.A05;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0151, code lost:
        if (r1 != null) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0153, code lost:
        r1 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0158, code lost:
        r0 = r4.A06;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015a, code lost:
        if (r0 != null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015c, code lost:
        r0 = new java.lang.Object();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0161, code lost:
        r35 = new X.C371608yg(r5, r8, r1, r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0170, code lost:
        r22 = r14;
        r5 = r3.AMo(r13, r16, r4.A0G, r4.A0M, (X.C367648rL) null, r11, r10, r22, r23, r15, r25, r26, r4, r7, r6, r30, r30, r17, r9, r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0192, code lost:
        if (r5 == null) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0194, code lost:
        if (r7 == null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0196, code lost:
        r4.A0W.Clp(r7.A0K, r4.A0D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x019f, code lost:
        r2.ELe(r5);
        r1 = X.AnonymousClass05K.A01;
        r0 = new java.lang.Object();
        r0.A00 = r1;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ab, code lost:
        r2.ELe(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ae, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01af, code lost:
        r0 = r3.ANF(r4.A0B);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b5, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b8, code lost:
        r26 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ba, code lost:
        if (r7 != null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01bc, code lost:
        r25 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C312596el r36, com.instagram.camera.effect.mq.IgCameraEffectsController r37, java.lang.String r38, boolean r39, boolean r40) {
        /*
            r4 = r37
            com.instagram.camera.effect.models.CameraAREffect r1 = r4.A09
            r19 = 0
            if (r1 == 0) goto L_0x01e4
            java.lang.String r5 = r1.A0K
        L_0x000a:
            X.6dz r3 = r4.A0L
            java.lang.String r7 = "IgCameraEffectsController"
            r18 = 0
            if (r3 != 0) goto L_0x0021
            java.lang.String r0 = "refreshMQEffectSetup() EffectManager does not exist"
            X.0KC.A0C(r7, r0)
            X.81r r1 = r4.A0W
            java.lang.String r0 = "effect_manager_is_null"
        L_0x001b:
            r2 = r38
            r1.AVd(r5, r0, r2)
        L_0x0020:
            return
        L_0x0021:
            X.81b r0 = r4.A0K
            X.7lC r2 = r0.A04
            if (r2 != 0) goto L_0x0035
            if (r39 == 0) goto L_0x002b
            if (r5 == 0) goto L_0x0020
        L_0x002b:
            java.lang.String r0 = "refreshMQEffectSetup() mediaPipeController is null"
            X.0KC.A0C(r7, r0)
            X.81r r1 = r4.A0W
            java.lang.String r0 = "media_pipe_controller_is_null"
            goto L_0x001b
        L_0x0035:
            r11 = r36
            if (r1 != 0) goto L_0x004f
            if (r39 == 0) goto L_0x004f
            X.6el r0 = X.C312596el.SYSTEM
            if (r11 != r0) goto L_0x004f
            com.instagram.common.session.UserSession r6 = r4.A0N
            X.0Tu r5 = X.0Tu.A05
            r0 = 36321589234574922(0x810a4b0001264a, double:3.0332575150212056E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x004f
            return
        L_0x004f:
            X.8yK r6 = r4.A00
            com.instagram.camera.effect.models.CameraAREffect r5 = r4.A09
            if (r40 == 0) goto L_0x009c
            if (r5 == 0) goto L_0x009c
            if (r6 == 0) goto L_0x009c
            X.81r r9 = r4.A0W
            com.instagram.common.session.UserSession r0 = r4.A0N
            X.27r r0 = X.27p.A01(r0)
            X.283 r0 = r0.A04
            java.lang.String r8 = r0.A0L
            X.8Yz r0 = r4.A0X
            if (r0 == 0) goto L_0x01e0
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.4yO r1 = (X.C279284yO) r1
        L_0x006f:
            X.81e r0 = r4.A0Y
            if (r0 == 0) goto L_0x01dc
            X.80R r0 = r0.A00
            X.28D r0 = r0.A01
        L_0x0077:
            java.lang.String r17 = "camera_resumed"
            r15 = r5
            r16 = r8
            r12 = r9
            r13 = r0
            r14 = r1
            r12.Ewa(r13, r14, r15, r16, r17)
            java.lang.String r0 = r5.A0K
            r3.CjU(r0)
            X.7l3 r0 = r4.A08
            if (r0 == 0) goto L_0x01d0
            X.8Eo r0 = r0.ALQ()
        L_0x008f:
            java.lang.String r1 = r5.A0Q
            if (r1 == 0) goto L_0x0095
            r0.A04 = r1
        L_0x0095:
            X.8Ep r0 = r0.A00()
            r3.CkZ(r6, r0, r5)
        L_0x009c:
            com.instagram.camera.effect.models.CameraAREffect r0 = r4.A00()
            if (r0 == 0) goto L_0x01c7
            X.8gv r0 = r4.A07
            if (r0 != 0) goto L_0x01c7
            android.content.Context r7 = r4.A0F
            com.instagram.common.session.UserSession r6 = r4.A0N
            X.82K r5 = r4.A0J
            X.82I r1 = r4.A0V
            com.facebook.gputimer.GPUTimerImpl r14 = r2.B8n()
            X.6dv r0 = r4.A0I
            r15 = r1
            r16 = r0
            r17 = r6
            r12 = r7
            r13 = r5
            X.8gv r6 = X.C368558sq.A00(r12, r13, r14, r15, r16, r17, r18)
            X.8Zx r0 = r4.A01
            r6.A0F(r0)
            boolean r0 = r4.A0C
            r6.A0I(r0)
            r4.A07 = r6
            java.util.SortedMap r5 = r4.A0T
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.8tQ r0 = new X.8tQ
            r0.<init>(r6)
            r5.put(r1, r0)
            A02(r4)
        L_0x00dd:
            X.7l3 r0 = r4.A08
            if (r0 == 0) goto L_0x01c3
            X.8xw r10 = new X.8xw
            r10.<init>(r0)
        L_0x00e6:
            com.instagram.camera.effect.models.CameraAREffect r7 = r4.A00()
            com.instagram.common.session.UserSession r6 = r4.A0N
            X.0Tu r5 = X.0Tu.A05
            r0 = 36325179827172015(0x810d8f000032af, double:3.035528220237763E-306)
            boolean r5 = X.182.A06(r5, r6, r0)
            if (r7 == 0) goto L_0x01bf
            boolean r0 = r7.A0J()
            if (r0 == 0) goto L_0x01bf
            java.util.Map r1 = r7.A0Z
            java.lang.String r0 = "audioFBA"
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L_0x010b
            if (r5 == 0) goto L_0x01bf
        L_0x010b:
            com.facebook.cameracore.audiograph.AudioGraphClientProvider r16 = r2.getAudioGraphClientProvider()
        L_0x010f:
            X.82N r0 = r4.A0U
            r23 = r0
            java.lang.String r0 = r4.A0A
            r17 = r0
            X.82P r15 = r4.A0H
            java.lang.Integer r30 = X.AnonymousClass05K.A00
            X.6e9 r14 = r4.A02
            X.8yK r13 = r4.A00
            java.lang.String r9 = r4.A0B
            if (r7 == 0) goto L_0x012b
            boolean r0 = r2.CSz(r9)
            r34 = 1
            if (r0 != 0) goto L_0x012f
        L_0x012b:
            r34 = 0
            if (r7 == 0) goto L_0x01b8
        L_0x012f:
            boolean r0 = r7.A0I()
            if (r0 == 0) goto L_0x01b8
            com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer r26 = r2.Adn()
        L_0x0139:
            X.8yg r25 = new X.8yg
            java.lang.String r12 = r7.A0K
            X.6eH r8 = r4.A04
            if (r8 != 0) goto L_0x0146
            X.6eG r8 = new X.6eG
            r8.<init>()
        L_0x0146:
            X.6eJ r5 = r4.A03
            if (r5 != 0) goto L_0x014f
            X.6eI r5 = new X.6eI
            r5.<init>()
        L_0x014f:
            X.6eM r1 = r4.A05
            if (r1 != 0) goto L_0x0158
            X.6eK r1 = new X.6eK
            r1.<init>()
        L_0x0158:
            X.6eF r0 = r4.A06
            if (r0 != 0) goto L_0x0161
            X.6eE r0 = new X.6eE
            r0.<init>()
        L_0x0161:
            r35 = r25
            r36 = r5
            r37 = r8
            r38 = r1
            r39 = r0
            r40 = r12
            r35.<init>(r36, r37, r38, r39, r40)
        L_0x0170:
            X.82T r1 = r4.A0M
            X.82S r0 = r4.A0G
            r24 = r15
            r27 = r4
            r28 = r7
            r29 = r6
            r31 = r30
            r32 = r17
            r33 = r9
            r18 = r1
            r20 = r11
            r21 = r10
            r22 = r14
            r14 = r3
            r15 = r13
            r17 = r0
            X.7yO r5 = r14.AMo(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            if (r5 == 0) goto L_0x01af
            if (r7 == 0) goto L_0x019f
            X.81r r3 = r4.A0W
            java.lang.String r1 = r7.A0K
            boolean r0 = r4.A0D
            r3.Clp(r1, r0)
        L_0x019f:
            r2.ELe(r5)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.8xz r0 = new X.8xz
            r0.<init>()
            r0.A00 = r1
        L_0x01ab:
            r2.ELe(r0)
            return
        L_0x01af:
            java.lang.String r0 = r4.A0B
            X.7yO r0 = r3.ANF(r0)
            if (r0 == 0) goto L_0x0020
            goto L_0x01ab
        L_0x01b8:
            r26 = r19
            if (r7 != 0) goto L_0x0139
            r25 = r19
            goto L_0x0170
        L_0x01bf:
            r16 = r19
            goto L_0x010f
        L_0x01c3:
            r10 = r19
            goto L_0x00e6
        L_0x01c7:
            X.6el r0 = X.C312596el.SYSTEM
            if (r11 != r0) goto L_0x00dd
            A02(r4)
            goto L_0x00dd
        L_0x01d0:
            java.lang.String r0 = "mCameraController is unexpectedly null"
            X.0kD.A01(r7, r0)
            X.8Eo r0 = new X.8Eo
            r0.<init>()
            goto L_0x008f
        L_0x01dc:
            X.28D r0 = X.28D.A5J
            goto L_0x0077
        L_0x01e0:
            X.80L r1 = X.AnonymousClass80L.A00
            goto L_0x006f
        L_0x01e4:
            r5 = r19
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.IgCameraEffectsController.A01(X.6el, com.instagram.camera.effect.mq.IgCameraEffectsController, java.lang.String, boolean, boolean):void");
    }

    public static void A02(IgCameraEffectsController igCameraEffectsController) {
        C340397lC r2 = igCameraEffectsController.A0K.A04;
        if (r2 != null) {
            r2.ErK(new ArrayList(igCameraEffectsController.A0T.values()));
        }
    }

    public final void A08(EffectAttribution effectAttribution, EffectManifest effectManifest, EffectServiceHost effectServiceHost, String str) {
        C371978zS r0;
        LocationDataProvider locationDataProvider;
        C371698yt r02 = effectServiceHost.mServicesHostConfiguration;
        if (r02 != null && (r0 = r02.A03) != null && (locationDataProvider = r0.A00) != null) {
            QLM qlm = new QLM(this.A0F, this.A0N);
            this.A0E = qlm;
            locationDataProvider.setDataSource(qlm);
        }
    }

    public final void A09(String str) {
        QLM qlm = this.A0E;
        if (qlm != null) {
            qlm.A01();
            this.A0E = null;
        }
    }

    public final void A0A(String str, Throwable th) {
        for (C3726491t r0 : this.A0P) {
            if (r0 != null) {
                r0.A00.A0J.A0A(C60340gF.A00);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.82K, java.lang.Object] */
    public IgCameraEffectsController(Context context, C3497681r r4, C3496181b r5, C312196dz r6, UserSession userSession, C357638Yz r8, C3496481e r9, String str) {
        this.A0F = context.getApplicationContext();
        this.A0N = userSession;
        this.A0K = r5;
        this.A0W = r4;
        this.A0X = r8;
        this.A0Y = r9;
        r5.A07.A00 = new AnonymousClass82J(this);
        this.A0J = new Object();
        this.A0U = new AnonymousClass82M(userSession);
        this.A0H = new AnonymousClass82P();
        this.A0I = C312146dt.A00(userSession);
        this.A0L = r6;
        this.A0B = str;
        AnonymousClass82S r1 = new AnonymousClass82S();
        this.A0G = r1;
        this.A0M = new AnonymousClass82T(r1, userSession);
        this.A0O = 0nY.A00();
    }
}
