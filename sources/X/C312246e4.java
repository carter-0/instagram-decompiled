package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource;
import com.facebook.cameracore.recognizer.logger.RecognizerLogger;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.6e4  reason: invalid class name and case insensitive filesystem */
public final class C312246e4 implements C312196dz {
    public static final AnonymousClass6e9 A0K = new AnonymousClass6e8(0);
    public static final String __redex_internal_original_name = "IgCameraEffectManager";
    public GalleryPickerServiceDataSource A00;
    public final Context A01;
    public final C314366i5 A02;
    public final C312206e0 A03;
    public final UserSession A04;
    public final C61480nO A05;
    public final Object A06 = new Object();
    public final Map A07;
    public final Handler A08 = new Handler(Looper.getMainLooper());
    public final C312706ez A09;
    public final MusicServiceDataSource A0A;
    public final C312356eI A0B = new Object();
    public final AnonymousClass6eG A0C = new Object();
    public final C312376eK A0D = new Object();
    public final C312326eE A0E = new Object();
    public final C312156dv A0F;
    public final C312306eC A0G = new C312306eC();
    public final Object A0H = new Object();
    public volatile Boolean A0I;
    public volatile Boolean A0J;
    public RecognizerLogger mLogger;

    public final C348407yO ANF(String str) {
        return new C348407yO((C371298xy) null, (AnonymousClass82G) null);
    }

    public final AnonymousClass6i7 Cg9(AnonymousClass8yN r10, C352728Ep r11, CameraAREffect cameraAREffect, C371218xo r13) {
        if (cameraAREffect == null) {
            r13.DBV((C371458yK) null, (C8993RKl) null, (CameraAREffect) null);
            return null;
        }
        C352728Ep r6 = r11;
        r13.Deo(r11, cameraAREffect.A0K);
        Map map = this.A07;
        if (!map.containsKey(cameraAREffect)) {
            map.clear();
        }
        C371458yK r4 = (C371458yK) map.get(cameraAREffect);
        if (r4 != null) {
            this.A02.A05(r11, cameraAREffect.A0K, cameraAREffect.A0M);
            String str = r11.A00;
            String str2 = r11.A01;
            r4.A02 = str;
            r4.A01 = str2;
            r13.DBV(r4, (C8993RKl) null, cameraAREffect);
            return null;
        }
        ARRequestAsset A002 = C370338wE.A00(cameraAREffect, false);
        C312206e0.A00(cameraAREffect, this.A03);
        C314366i5 r5 = this.A02;
        C371468yL r0 = new C371468yL(r10, cameraAREffect, this, r13);
        Handler handler = this.A08;
        List singletonList = Collections.singletonList(A002);
        0qQ.A07(singletonList);
        return C314366i5.A00(handler, new C371488yO(r0), r5.A04, r5, r6, singletonList, false);
    }

    public final synchronized void onUserSessionWillEnd(boolean z) {
    }

    public final void A8U(C312136ds r2) {
        this.A02.A04(r2);
    }

    public final C312206e0 B0C() {
        return this.A03;
    }

    public final boolean CKk(CameraAREffect cameraAREffect) {
        if (this.A0J == null) {
            synchronized (this.A0H) {
                if (this.A0J == null) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        0kD.A01(__redex_internal_original_name, "hasSufficientStorageToApplyEffect() executed in UI thread");
                    }
                    boolean z = false;
                    if (!0JN.A01().A0A()) {
                        z = true;
                    }
                    this.A0J = Boolean.valueOf(z);
                }
            }
        }
        return Boolean.TRUE.equals(this.A0J);
    }

    public final boolean CRl(CameraAREffect cameraAREffect) {
        if (TextUtils.isEmpty(cameraAREffect.A0K)) {
            return false;
        }
        ARRequestAsset A002 = C370338wE.A00(cameraAREffect, false);
        C314366i5 r3 = this.A02;
        boolean z = false;
        if (A002.A02.A02 == ARAssetType.EFFECT) {
            z = true;
        }
        17k.A0I(z, "ARD operate publicly only at effect level", new Object[0]);
        return r3.A05.isEffectCached(new XplatRemoteAsset(A002), false);
    }

    public final void CjU(String str) {
        C314366i5 r1 = this.A02;
        0qQ.A0B(str, 0);
        for (Map.Entry key : r1.A02.A03.entrySet()) {
            C344037rD B46 = ((C312136ds) key.getKey()).B46();
            if (B46 != null) {
                C313096fr.A02(B46.BY6().onEvent(14, str, true));
            }
        }
    }

    public final void CkZ(C371458yK r4, C352728Ep r5, CameraAREffect cameraAREffect) {
        this.A02.A05(r5, cameraAREffect.A0K, cameraAREffect.A0M);
        String str = r5.A00;
        String str2 = r5.A01;
        r4.A02 = str;
        r4.A01 = str2;
    }

    public final void E3c(String str, List list) {
        Context context = this.A01;
        UserSession userSession = this.A04;
        C39738A7e a7e = new C39738A7e(context, this.A02, new A37(context), new A3X(list), userSession, this.A05);
        boolean A0G2 = C61970qY.A0G(a7e.A01);
        a7e.A00 = A0G2;
        A3X a3x = a7e.A04;
        int i = 6;
        if (A0G2) {
            i = 25;
        }
        List list2 = a3x.A00;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : list2) {
            if (((CameraAREffect) next).CbC()) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        ArrayList A0S = 00k.A0S(00k.A0d(arrayList2, i), 00k.A0d(arrayList, 3));
        ArrayList arrayList3 = new ArrayList();
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            CameraAREffect cameraAREffect = (CameraAREffect) it.next();
            if (cameraAREffect == null || cameraAREffect.A0K == null) {
                0kD.A07("EffectPrefetchService", "Invalid effect found in cached metadata", (Throwable) null);
            } else {
                arrayList3.add(C370338wE.A00(cameraAREffect, false));
            }
        }
        List A0a = 00k.A0a(new LinkedHashSet(arrayList3));
        if (A0a.isEmpty()) {
            0kD.A07("EffectPrefetchService", "Attempting to prefetch empty list of assets", (Throwable) null);
        } else {
            a7e.A06.ATE(new C386809lC(a7e, str, A0a));
        }
    }

    public final void EyC(String str) {
        this.A02.A06(str);
    }

    public final String getModuleName() {
        return "unknown_ig_composer";
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.6eE] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.6eG] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.6eI, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.6eK] */
    public C312246e4(Context context, C312136ds r4, C312156dv r5, UserSession userSession) {
        this.A01 = context;
        this.A04 = userSession;
        this.A0F = r5;
        this.A05 = 0nY.A00();
        this.A02 = C312406eN.A00(context, r5, userSession).A00(r4);
        this.A09 = C392459uq.A00(userSession);
        this.A03 = new C312206e0(this);
        this.A07 = Collections.synchronizedMap(new HashMap());
        this.A0A = new C314396iB(context);
        if (0tS.A01(context).A02() <= 0) {
            0tS.A01(this.A01).A0B(C278524x1.A00(this.A04));
        }
    }

    public final void ENN(TextView textView) {
    }

    public final void EXK(GalleryPickerServiceDataSource galleryPickerServiceDataSource) {
        this.A00 = galleryPickerServiceDataSource;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: X.7yO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: X.8zo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: com.facebook.cameracore.ardelivery.model.ModelPathsHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v48, resolved type: X.8zo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v49, resolved type: X.8zo} */
    /* JADX WARNING: type inference failed for: r5v12, types: [X.8yq, java.lang.Object, X.8yh] */
    /* JADX WARNING: type inference failed for: r12v1, types: [com.facebook.cameracore.mediapipeline.services.locale.LocaleDataSource, X.8yr, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v7, types: [com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetLocalDataSource, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v13, types: [com.facebook.cameracore.mediapipeline.services.memoryinfo.MemoryInfoServiceImpl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v15, types: [X.8zS, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v17, types: [com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v3, types: [X.82G, X.8xy] */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r12v9, types: [java.lang.Object, X.A8o] */
    /* JADX WARNING: type inference failed for: r10v25 */
    /* JADX WARNING: type inference failed for: r10v26 */
    /* JADX WARNING: type inference failed for: r12v32, types: [java.lang.Object, X.A8o] */
    /* JADX WARNING: type inference failed for: r12v41, types: [java.lang.Object, X.A8o] */
    /* JADX WARNING: type inference failed for: r12v45, types: [java.lang.Object, X.A8o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C348407yO AMo(X.C371458yK r44, com.facebook.cameracore.audiograph.AudioGraphClientProvider r45, X.AnonymousClass82S r46, X.AnonymousClass82U r47, X.C367648rL r48, X.C312596el r49, com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate r50, X.AnonymousClass6e9 r51, X.AnonymousClass82N r52, X.AnonymousClass82P r53, X.C371608yg r54, com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer r55, X.AnonymousClass82G r56, com.instagram.camera.effect.models.CameraAREffect r57, com.instagram.common.session.UserSession r58, java.lang.Integer r59, java.lang.Integer r60, java.lang.String r61, java.lang.String r62, boolean r63) {
        /*
            r43 = this;
            r3 = r51
            r7 = r54
            r1 = 0
            r2 = r57
            if (r57 == 0) goto L_0x075b
            r4 = r43
            X.6e0 r5 = r4.A03
            com.instagram.common.session.UserSession r0 = r4.A04
            r40 = r0
            boolean r0 = X.C312206e0.A00(r2, r5)
            if (r0 == 0) goto L_0x075b
            r23 = r44
            if (r44 == 0) goto L_0x075b
            r0 = r23
            java.util.List r5 = r0.A05
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x028e
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            X.8yY r0 = (X.C371528yY) r0
            java.lang.String r0 = r0.A01
            r20 = r0
        L_0x0030:
            java.util.Set r5 = r2.A0a
            java.lang.String r0 = "faceTracker"
            boolean r22 = r5.contains(r0)
            java.util.Set r5 = r2.A0a
            java.lang.String r0 = "segmentation"
            boolean r21 = r5.contains(r0)
            java.util.Set r5 = r2.A0a
            java.lang.String r0 = "hairSegmentation"
            boolean r27 = r5.contains(r0)
            java.util.Set r5 = r2.A0a
            java.lang.String r0 = "Recognition"
            boolean r26 = r5.contains(r0)
            java.util.Set r5 = r2.A0a
            java.lang.String r0 = "bodyTracking"
            boolean r19 = r5.contains(r0)
            java.util.Set r5 = r2.A0a
            java.lang.String r0 = "handTracker"
            boolean r28 = r5.contains(r0)
            java.util.Set r5 = r2.A0a
            java.lang.String r0 = "multiclassSegmentation"
            boolean r18 = r5.contains(r0)
            java.util.Map r5 = r2.A0Z
            java.lang.String r0 = "genericML"
            java.lang.Object r0 = r5.get(r0)
            r17 = 0
            if (r0 == 0) goto L_0x0076
            r17 = 1
        L_0x0076:
            java.util.Map r5 = r2.A0Z
            java.lang.String r0 = "avatarSDK"
            java.lang.Object r0 = r5.get(r0)
            r15 = 0
            if (r0 == 0) goto L_0x0082
            r15 = 1
        L_0x0082:
            java.util.Map r5 = r2.A0Z
            java.lang.String r0 = "bodyTracking3D"
            java.lang.Object r0 = r5.get(r0)
            r16 = 0
            if (r0 == 0) goto L_0x0090
            r16 = 1
        L_0x0090:
            r0 = r50
            if (r50 == 0) goto L_0x0099
            X.8yo r1 = new X.8yo
            r1.<init>(r0)
        L_0x0099:
            if (r51 != 0) goto L_0x009d
            X.6e9 r3 = A0K
        L_0x009d:
            X.8yq r5 = new X.8yq
            r5.<init>()
            r5.A00 = r3
            X.8yr r12 = new X.8yr
            r12.<init>()
            android.content.Context r9 = r4.A01
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r0 = r0.toString()
            r12.setDeviceLocaleIdentifier(r0)
            boolean r0 = X.C340267kz.A00(r9)
            r0 = r0 ^ 1
            X.8yu r0 = X.C371698yt.A00(r9, r0)
            X.8yi r3 = X.C371678yq.A01
            r0.A00(r3, r5)
            X.8yi r5 = X.C371728yy.A01
            X.8yy r3 = new X.8yy
            r6 = r52
            r3.<init>(r6)
            r0.A00(r5, r3)
            X.8yi r10 = X.C371738z0.A01
            r6 = 0
            r8 = 1
            X.8z1 r5 = new X.8z1
            r3 = r60
            r5.<init>(r9, r3, r6)
            X.8z0 r3 = new X.8z0
            r3.<init>(r5)
            r0.A00(r10, r3)
            X.8yi r3 = X.C371668yo.A01
            r0.A00(r3, r1)
            X.8yi r5 = X.C371828zA.A01
            com.facebook.cameracore.mediapipeline.services.externalasset.ExampleExternalAssetLocalDataSource r3 = new com.facebook.cameracore.mediapipeline.services.externalasset.ExampleExternalAssetLocalDataSource
            r3.<init>()
            X.8zA r1 = new X.8zA
            r1.<init>(r3)
            r0.A00(r5, r1)
            X.8yi r3 = X.C371838zD.A02
            X.8zD r1 = new X.8zD
            r10 = r46
            r5 = r47
            r1.<init>(r5, r10)
            r0.A00(r3, r1)
            X.8yi r11 = X.C371848zE.A05
            java.lang.String r3 = r2.A0K
            X.8zF r10 = new X.8zF
            r1 = r40
            r10.<init>(r1, r3)
            r31 = r53
            r31.getClass()
            X.8zG r32 = new X.8zG
            r32.<init>()
            java.lang.String r14 = r2.A0K
            X.6ez r1 = r4.A09
            com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache r13 = r1.A01()
            com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache r5 = r1.A02()
            com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory r1 = com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory.$redex_init_class
            X.0nl r1 = X.C61560nl.A00()
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.A00
            com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory r3 = new com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory
            r3.<init>(r1)
            X.8zH r1 = new X.8zH
            r1.<init>(r14, r13, r5, r3)
            X.8zG r34 = new X.8zG
            r34.<init>()
            X.8zE r3 = new X.8zE
            r29 = r3
            r30 = r10
            r33 = r1
            r29.<init>(r30, r31, r32, r33, r34)
            r0.A00(r11, r3)
            X.8yi r3 = X.C371888zI.A01
            X.8zI r1 = new X.8zI
            r1.<init>(r12)
            r0.A00(r3, r1)
            X.8yi r5 = X.C371898zJ.A01
            com.facebook.cameracore.mediapipeline.services.memoryinfo.MemoryInfoServiceImpl r3 = new com.facebook.cameracore.mediapipeline.services.memoryinfo.MemoryInfoServiceImpl
            r3.<init>()
            X.8zJ r1 = new X.8zJ
            r1.<init>(r3)
            r0.A00(r5, r1)
            X.8yi r5 = X.C371908zL.A01
            com.facebook.cameracore.mediapipeline.services.music.MusicServiceDataSource r3 = r4.A0A
            X.8zL r1 = new X.8zL
            r1.<init>(r3)
            r0.A00(r5, r1)
            X.8yi r5 = X.C371918zM.A01
            X.8zN r3 = new X.8zN
            r3.<init>(r9)
            X.8zM r1 = new X.8zM
            r1.<init>(r3)
            r0.A00(r5, r1)
            X.8yi r5 = X.C371948zP.A01
            X.8zQ r3 = new X.8zQ
            r3.<init>(r9)
            X.8zP r1 = new X.8zP
            r1.<init>(r3)
            r0.A00(r5, r1)
            X.8zS r1 = new X.8zS
            r1.<init>()
            r0.A02 = r1
            X.8yi r5 = X.C371988zT.A01
            X.8zU r3 = new X.8zU
            r3.<init>()
            X.8zT r1 = new X.8zT
            r1.<init>(r3)
            r0.A00(r5, r1)
            X.8yi r12 = X.C371608yg.A02
            if (r54 != 0) goto L_0x01ca
            java.lang.String r11 = r2.A0K
            X.6eG r10 = r4.A0C
            X.6eI r5 = r4.A0B
            X.6eK r3 = r4.A0D
            X.6eE r1 = r4.A0E
            X.8yg r7 = new X.8yg
            r29 = r7
            r30 = r5
            r31 = r10
            r32 = r3
            r33 = r1
            r34 = r11
            r29.<init>(r30, r31, r32, r33, r34)
        L_0x01ca:
            r0.A00(r12, r7)
            X.8yi r5 = X.C372008zW.A01
            X.8zX r3 = new X.8zX
            r3.<init>()
            X.8zW r1 = new X.8zW
            r1.<init>(r3)
            r0.A00(r5, r1)
            X.1CU r1 = X.AnonymousClass1CT.A00(r40)
            java.lang.String r11 = r1.A04
            if (r11 == 0) goto L_0x020a
            X.8yi r10 = X.C372058zb.A04
            java.lang.String r7 = X.1Ch.A00()
            boolean r1 = X.1Ma.A08()
            java.lang.String r5 = ""
            if (r1 == 0) goto L_0x0200
            java.lang.String r3 = X.1Ma.A02()
            r1 = 1468(0x5bc, float:2.057E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r5 = r3.replace(r1, r5)
        L_0x0200:
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            X.8zb r1 = new X.8zb
            r1.<init>(r3, r11, r7, r5)
            r0.A00(r10, r1)
        L_0x020a:
            if (r15 == 0) goto L_0x0245
            if (r11 == 0) goto L_0x0245
            java.lang.String r3 = "Bearer"
            boolean r1 = r11.startsWith(r3)
            if (r1 == 0) goto L_0x021e
            int r1 = r3.length()
            java.lang.String r11 = r11.substring(r1)
        L_0x021e:
            java.lang.String r15 = r11.trim()
            r1 = r23
            X.8yX r1 = r1.A04
            X.8yN r1 = r1.A00
            if (r1 == 0) goto L_0x028c
            X.B1j r1 = r1.A00
            X.ARo r5 = new X.ARo
            r5.<init>(r1, r4)
        L_0x0231:
            X.8yi r3 = X.C380949am.A05
            r1 = r40
            java.lang.String r7 = r1.A06
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            r12 = 0
            X.9am r1 = new X.9am
            r10 = r1
            r11 = r5
            r14 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            r0.A00(r3, r1)
        L_0x0245:
            boolean r1 = X.C340267kz.A00(r9)
            if (r1 == 0) goto L_0x0251
            boolean r1 = r2.A0J()
            if (r1 == 0) goto L_0x025e
        L_0x0251:
            X.8yv r1 = new X.8yv
            r5 = r55
            r3 = r63
            r7 = r45
            r1.<init>(r9, r7, r5, r3)
            r0.A05 = r1
        L_0x025e:
            com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource r5 = r4.A00
            if (r5 == 0) goto L_0x026c
            X.8yi r3 = com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration.A01
            com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration r1 = new com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration
            r1.<init>(r5)
            r0.A00(r3, r1)
        L_0x026c:
            r1 = r23
            X.8LL r1 = r1.A00
            java.lang.String r25 = "ARModelPaths is null"
            java.lang.String r5 = "IgCameraEffectManager"
            if (r22 == 0) goto L_0x02e0
            if (r1 == 0) goto L_0x0553
            r30 = 0
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Facetracker
            java.util.Map r14 = r1.A00
            java.lang.Object r7 = r14.get(r3)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r7 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r7
            if (r7 != 0) goto L_0x0292
            java.lang.String r0 = "AREngineEffect is missing FaceTracker assets"
            X.0kD.A01(r5, r0)
            return r30
        L_0x028c:
            r5 = 0
            goto L_0x0231
        L_0x028e:
            r20 = 0
            goto L_0x0030
        L_0x0292:
            java.util.HashMap r13 = X.C372228zz.A00(r7)
            java.util.Set r10 = r13.keySet()
            java.lang.String[] r3 = new java.lang.String[r6]
            java.lang.Object[] r12 = r10.toArray(r3)
            java.lang.String[] r12 = (java.lang.String[]) r12
            int r11 = r12.length
            java.lang.String[] r15 = new java.lang.String[r11]
            r10 = 0
        L_0x02a6:
            if (r10 >= r11) goto L_0x02b3
            r3 = r12[r10]
            java.lang.Object r3 = r13.get(r3)
            r15[r10] = r3
            int r10 = r10 + 1
            goto L_0x02a6
        L_0x02b3:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.FaceExpressionFitting
            java.lang.Object r24 = r14.get(r3)
            r3 = r24
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r3 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r3
            r24 = r3
            if (r3 == 0) goto L_0x02dd
            X.8LN r10 = X.AnonymousClass8LN.ExpressionFitting
            java.lang.String r34 = r3.getModelPath(r10)
        L_0x02c7:
            X.8zq r3 = new X.8zq
            r31 = r59
            r29 = r3
            r32 = r30
            r33 = r30
            r35 = r12
            r36 = r15
            r37 = r8
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37)
            r0.A00 = r3
            goto L_0x02e3
        L_0x02dd:
            r34 = 0
            goto L_0x02c7
        L_0x02e0:
            r7 = 0
            r24 = 0
        L_0x02e3:
            if (r21 != 0) goto L_0x0301
            if (r18 != 0) goto L_0x0301
            r3 = 0
        L_0x02e8:
            java.lang.String r13 = "AREngineEffect is missing Body tracking assets"
            r11 = 256(0x100, float:3.59E-43)
            if (r19 == 0) goto L_0x03fb
            if (r1 == 0) goto L_0x0553
            r14 = 0
            com.facebook.cameracore.ardelivery.model.VersionedCapability r12 = com.facebook.cameracore.ardelivery.model.VersionedCapability.BodyTracking
            java.util.Map r10 = r1.A00
            java.lang.Object r15 = r10.get(r12)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r15 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r15
            if (r15 != 0) goto L_0x03b3
            X.0kD.A01(r5, r13)
            return r14
        L_0x0301:
            if (r1 == 0) goto L_0x0553
            r12 = 0
            com.facebook.cameracore.ardelivery.model.VersionedCapability r3 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Segmentation
            java.util.Map r11 = r1.A00
            java.lang.Object r3 = r11.get(r3)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r3 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r3
            com.facebook.cameracore.ardelivery.model.VersionedCapability r10 = com.facebook.cameracore.ardelivery.model.VersionedCapability.MulticlassSegmentation
            java.lang.Object r15 = r11.get(r10)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r15 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r15
            if (r3 != 0) goto L_0x0320
            if (r15 != 0) goto L_0x0320
            java.lang.String r0 = "AREngineEffect is missing Segmentation assets"
            X.0kD.A01(r5, r0)
            return r12
        L_0x0320:
            r11 = 512(0x200, float:7.175E-43)
            X.9ZR r10 = X.AnonymousClass9ZR.A00
            X.AHF r14 = new X.AHF
            r14.<init>(r10, r11)
            if (r3 != 0) goto L_0x0397
            r12 = 0
            r11 = 0
        L_0x032d:
            if (r15 != 0) goto L_0x037c
            r13 = 0
            r15 = 0
        L_0x0331:
            r10 = 6
            r14.A08(r10)
            r10 = 3
            r14.A0A(r10, r15)
            r10 = 2
            r14.A0A(r10, r13)
            r14.A0A(r8, r11)
            r14.A0A(r6, r12)
            r12 = 5
            r14.A0B(r8, r6)
            java.nio.ByteBuffer r11 = r14.A07
            int r10 = r14.A03
            int r10 = r10 + -1
            r14.A03 = r10
            r11.put(r10, r8)
            r14.A07(r12)
            int r10 = r14.A01()
            r14.A06(r10)
            java.lang.Class<X.9ZU> r12 = X.AnonymousClass9ZU.class
            r14.A04()
            java.nio.ByteBuffer r11 = r14.A07
            X.ACv r10 = new X.ACv
            r10.<init>(r12, r11)
            X.A8o r12 = new X.A8o
            r12.<init>()
            r12.A00(r10)
            X.6eR r11 = X.C312446eR.PersonSegmentationDataProvider
            X.A4o r10 = new X.A4o
            r10.<init>(r11, r12)
            r0.A01(r10)
            goto L_0x02e8
        L_0x037c:
            X.8LN r10 = X.AnonymousClass8LN.MulticlassInitNet
            java.lang.String r10 = r15.getModelPath(r10)
            r10.getClass()
            int r13 = r14.A03(r10)
            X.8LN r10 = X.AnonymousClass8LN.MulticlassPredictNet
            java.lang.String r10 = r15.getModelPath(r10)
            r10.getClass()
            int r15 = r14.A03(r10)
            goto L_0x0331
        L_0x0397:
            X.8LN r10 = X.AnonymousClass8LN.Caffe2InitNet
            java.lang.String r10 = r3.getModelPath(r10)
            r10.getClass()
            int r12 = r14.A03(r10)
            X.8LN r10 = X.AnonymousClass8LN.Caffe2PredictNet
            java.lang.String r10 = r3.getModelPath(r10)
            r10.getClass()
            int r11 = r14.A03(r10)
            goto L_0x032d
        L_0x03b3:
            X.9ZR r10 = X.AnonymousClass9ZR.A00
            X.AHF r14 = new X.AHF
            r14.<init>(r10, r11)
            X.8LN r10 = X.AnonymousClass8LN.Caffe2InitNet
            java.lang.String r10 = r15.getModelPath(r10)
            r10.getClass()
            int r12 = r14.A03(r10)
            X.8LN r10 = X.AnonymousClass8LN.Caffe2PredictNet
            java.lang.String r10 = r15.getModelPath(r10)
            r10.getClass()
            int r11 = r14.A03(r10)
            int r10 = r15.mVersion
            int r10 = X.AnonymousClass9ZV.A00(r14, r12, r11, r10)
            r14.A06(r10)
            java.lang.Class<X.9ZV> r12 = X.AnonymousClass9ZV.class
            r14.A04()
            java.nio.ByteBuffer r11 = r14.A07
            X.ACv r10 = new X.ACv
            r10.<init>(r12, r11)
            X.A8o r12 = new X.A8o
            r12.<init>()
            r12.A00(r10)
            X.6eR r11 = X.C312446eR.BodyTrackingDataProvider
            X.A4o r10 = new X.A4o
            r10.<init>(r11, r12)
            r0.A01(r10)
        L_0x03fb:
            if (r16 == 0) goto L_0x046b
            if (r1 == 0) goto L_0x0553
            r12 = 0
            com.facebook.cameracore.ardelivery.model.VersionedCapability r11 = com.facebook.cameracore.ardelivery.model.VersionedCapability.BodyTracking3D
            java.util.Map r10 = r1.A00
            java.lang.Object r10 = r10.get(r11)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r10 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r10
            if (r10 == 0) goto L_0x05f8
            X.9ZR r13 = X.AnonymousClass9ZR.A00
            r12 = 256(0x100, float:3.59E-43)
            X.AHF r11 = new X.AHF
            r11.<init>(r13, r12)
            X.8LN r12 = X.AnonymousClass8LN.BodyTracking3DDetection
            java.lang.String r12 = r10.getModelPath(r12)
            r12.getClass()
            int r15 = r11.A03(r12)
            X.8LN r12 = X.AnonymousClass8LN.BodyTracking3DLandmark
            java.lang.String r12 = r10.getModelPath(r12)
            r12.getClass()
            int r12 = r11.A03(r12)
            int r14 = r10.mVersion
            r13 = 45000(0xafc8, float:6.3058E-41)
            r10 = 4
            r11.A08(r10)
            r10 = 3
            r11.A09(r10, r14)
            r10 = 2
            r11.A09(r10, r13)
            r11.A0A(r8, r12)
            r11.A0A(r6, r15)
            int r10 = r11.A01()
            r11.A06(r10)
            java.lang.Class<X.QJV> r12 = X.QJV.class
            r11.A04()
            java.nio.ByteBuffer r11 = r11.A07
            X.ACv r10 = new X.ACv
            r10.<init>(r12, r11)
            X.A8o r12 = new X.A8o
            r12.<init>()
            r12.A00(r10)
            X.6eR r11 = X.C312446eR.BodyTracking3DDataProvider
            X.A4o r10 = new X.A4o
            r10.<init>(r11, r12)
            r0.A01(r10)
        L_0x046b:
            java.lang.String[] r10 = X.C372068zd.A00
            java.util.List r19 = java.util.Arrays.asList(r10)
            if (r17 == 0) goto L_0x054d
            X.9ZR r11 = X.AnonymousClass9ZR.A00
            r10 = 256(0x100, float:3.59E-43)
            X.AHF r14 = new X.AHF
            r14.<init>(r11, r10)
            java.util.Map r11 = r1.A01
            com.google.common.collect.ImmutableMap r10 = com.google.common.collect.ImmutableMap.copyOf(r11)
            int r13 = r10.size()
            int[] r12 = new int[r13]
            com.google.common.collect.ImmutableMap r10 = com.google.common.collect.ImmutableMap.copyOf(r11)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r18 = r10.iterator()
            r17 = 0
        L_0x0496:
            boolean r10 = r18.hasNext()
            if (r10 == 0) goto L_0x04e3
            java.lang.Object r15 = r18.next()
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15
            java.lang.Object r11 = r15.getKey()
            r10 = r19
            int r10 = r10.indexOf(r11)
            byte r11 = (byte) r10
            r10 = -1
            if (r10 == r11) goto L_0x0496
            int r16 = r17 + 1
            java.lang.Object r10 = r15.getValue()
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            int r15 = r14.A03(r10)
            r10 = 2
            r14.A08(r10)
            r14.A0A(r8, r15)
            if (r11 == r6) goto L_0x04da
            r14.A0B(r8, r6)
            java.nio.ByteBuffer r10 = r14.A07
            r29 = r10
            int r10 = r14.A03
            int r15 = r10 + -1
            r14.A03 = r15
            r10 = r29
            r10.put(r15, r11)
            r14.A07(r6)
        L_0x04da:
            int r10 = r14.A01()
            r12[r17] = r10
            r17 = r16
            goto L_0x0496
        L_0x04e3:
            r11 = 4
            boolean r10 = r14.A09
            if (r10 != 0) goto L_0x0500
            r14.A04 = r13
            int r10 = r13 * 4
            r14.A0B(r11, r10)
            r14.A0B(r11, r10)
            r14.A09 = r8
            int r11 = r13 + -1
        L_0x04f6:
            if (r11 < 0) goto L_0x050c
            r10 = r12[r11]
            r14.A05(r10)
            int r11 = r11 + -1
            goto L_0x04f6
        L_0x0500:
            r0 = 951(0x3b7, float:1.333E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x050c:
            int r11 = r14.A02()
            r10 = 2
            r14.A08(r10)
            r14.A0A(r8, r11)
            r14.A0B(r8, r6)
            java.nio.ByteBuffer r11 = r14.A07
            int r10 = r14.A03
            int r10 = r10 + -1
            r14.A03 = r10
            r11.put(r10, r8)
            r14.A07(r6)
            int r10 = r14.A01()
            r14.A06(r10)
            java.lang.Class<X.QJW> r12 = X.QJW.class
            r14.A04()
            java.nio.ByteBuffer r11 = r14.A07
            X.ACv r10 = new X.ACv
            r10.<init>(r12, r11)
            X.A8o r12 = new X.A8o
            r12.<init>()
            r12.A00(r10)
            X.6eR r11 = X.C312446eR.GenericMLService
            X.A4o r10 = new X.A4o
            r10.<init>(r11, r12)
            r0.A01(r10)
        L_0x054d:
            if (r28 == 0) goto L_0x0564
            if (r1 != 0) goto L_0x057e
            java.lang.String r25 = "AREngineEffect:HT - ARModelPaths is null"
        L_0x0553:
            r0 = r25
            X.0kD.A01(r5, r0)
            r10 = 0
        L_0x0559:
            X.7yO r12 = new X.7yO
            r12.<init>(r10, r10)
            return r12
        L_0x055f:
            java.lang.String r10 = "AREngineEffect:HT - Could not create and set HandTrackingDataProviderConfiguration"
            X.0kD.A01(r5, r10)
        L_0x0564:
            r10 = 0
            if (r27 == 0) goto L_0x05db
            if (r1 != 0) goto L_0x056f
            r0 = r25
            X.0kD.A01(r5, r0)
            goto L_0x0559
        L_0x056f:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r12 = com.facebook.cameracore.ardelivery.model.VersionedCapability.HairSegmentation
            java.util.Map r11 = r1.A00
            java.lang.Object r12 = r11.get(r12)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r12 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r12
            if (r12 != 0) goto L_0x05bf
            java.lang.String r0 = "AREngineEffect is missing hair segmentation assets"
            goto L_0x058d
        L_0x057e:
            r10 = 0
            com.facebook.cameracore.ardelivery.model.VersionedCapability r12 = com.facebook.cameracore.ardelivery.model.VersionedCapability.HandTracker
            java.util.Map r11 = r1.A00
            java.lang.Object r12 = r11.get(r12)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r12 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r12
            if (r12 != 0) goto L_0x0591
            java.lang.String r0 = "AREngineEffect:HT - AREngineEffect is missing Hand Tracking assets"
        L_0x058d:
            X.0kD.A01(r5, r0)
            return r10
        L_0x0591:
            X.8LN r13 = X.AnonymousClass8LN.Caffe2InitNet
            java.lang.String r11 = r12.getModelPath(r13)
            if (r11 == 0) goto L_0x05a2
            X.8LN r11 = X.AnonymousClass8LN.Caffe2PredictNet
            java.lang.String r14 = r12.getModelPath(r11)
            if (r14 == 0) goto L_0x05a2
            goto L_0x05a5
        L_0x05a2:
            java.lang.String r0 = "AREngineEffect:HT - At least one Hand Tracking model path is null"
            goto L_0x058d
        L_0x05a5:
            java.lang.String r14 = r12.getModelPath(r13)     // Catch:{ Exception -> 0x055f }
            java.lang.String r15 = r12.getModelPath(r11)     // Catch:{ Exception -> 0x055f }
            java.lang.String r16 = r12.getModelPath(r13)     // Catch:{ Exception -> 0x055f }
            java.lang.String r17 = r12.getModelPath(r11)     // Catch:{ Exception -> 0x055f }
            X.8zr r10 = new X.8zr     // Catch:{ Exception -> 0x055f }
            r12 = r10
            r13 = r9
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x055f }
            r0.A01 = r10     // Catch:{ Exception -> 0x055f }
            goto L_0x0564
        L_0x05bf:
            X.8yi r14 = X.C380939al.A03
            X.8LN r11 = X.AnonymousClass8LN.Caffe2InitNet
            java.lang.String r13 = r12.getModelPath(r11)
            r13.getClass()
            X.8LN r11 = X.AnonymousClass8LN.Caffe2PredictNet
            java.lang.String r12 = r12.getModelPath(r11)
            r12.getClass()
            X.9al r11 = new X.9al
            r11.<init>(r13, r12, r6)
            r0.A00(r14, r11)
        L_0x05db:
            X.8yi r12 = X.C372078ze.A01
            X.8ze r11 = new X.8ze
            r13 = r48
            r11.<init>(r13)
            r0.A00(r12, r11)
            if (r26 == 0) goto L_0x05fc
            if (r1 == 0) goto L_0x0553
            r12 = 0
            com.facebook.cameracore.ardelivery.model.VersionedCapability r13 = com.facebook.cameracore.ardelivery.model.VersionedCapability.Recognition
            java.util.Map r11 = r1.A00
            java.lang.Object r11 = r11.get(r13)
            if (r11 != 0) goto L_0x05fc
            java.lang.String r13 = "AREngineEffect is missing Target recognition assets"
        L_0x05f8:
            X.0kD.A01(r5, r13)
            return r12
        L_0x05fc:
            int r12 = X.C278524x1.A00(r40)
            r11 = 15
            if (r12 > r11) goto L_0x060c
            int r12 = X.AnonymousClass0Ke.A00(r9)
            r11 = 2016(0x7e0, float:2.825E-42)
            if (r12 < r11) goto L_0x0629
        L_0x060c:
            X.6eC r11 = r4.A0G
            X.0eM r11 = r11.A00
            java.lang.Object r11 = r11.getValue()
            X.8zg r11 = (X.C372098zg) r11
            X.ADx r11 = r11.A01
            if (r11 == 0) goto L_0x0754
            X.A9V r11 = r11.A01
            if (r11 == 0) goto L_0x0754
            com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig r12 = X.C372088zf.A00(r11)
            X.8zi r11 = new X.8zi
            r11.<init>(r9, r12)
        L_0x0627:
            r0.A03 = r11
        L_0x0629:
            r12 = r61
            if (r61 == 0) goto L_0x0637
            X.8yi r11 = X.C380899ah.A01
            X.9ah r9 = new X.9ah
            r9.<init>(r12)
            r0.A00(r11, r9)
        L_0x0637:
            r11 = 0
            r31 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            java.lang.String r14 = r2.A0K
            if (r14 == 0) goto L_0x064e
            boolean r9 = r14.isEmpty()
            if (r9 == 0) goto L_0x0650
        L_0x064e:
            java.lang.String r14 = "0"
        L_0x0650:
            java.lang.String r13 = r2.A0M
            if (r13 == 0) goto L_0x065a
            boolean r9 = r13.isEmpty()
            if (r9 == 0) goto L_0x065c
        L_0x065a:
            java.lang.String r13 = "0"
        L_0x065c:
            java.lang.String r9 = r2.A0S
            r19 = r9
            java.util.ArrayList r41 = r2.A0E()
            X.6i5 r2 = r4.A02
            if (r2 != 0) goto L_0x074d
            java.lang.String r2 = "onAsyncAssetRequested before EffectManager is initialized."
            X.0kD.A01(r5, r2)
            X.AQI r12 = new X.AQI
            r12.<init>()
        L_0x0672:
            X.27r r2 = X.27p.A01(r40)
            X.283 r2 = r2.A04
            java.lang.String r2 = r2.A0L
            r18 = r2
            r2 = r23
            java.lang.String r2 = r2.A01
            r17 = r2
            r2 = r23
            java.lang.String r2 = r2.A02
            r16 = r2
            X.8yt r15 = new X.8yt
            r15.<init>(r0)
            r0 = r23
            X.8yW r0 = r0.A03
            java.util.Map r0 = r0.A00
            com.google.common.collect.ImmutableMap r42 = com.google.common.collect.ImmutableMap.copyOf(r0)
            if (r22 == 0) goto L_0x06aa
            if (r7 != 0) goto L_0x0711
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
        L_0x06a0:
            if (r24 == 0) goto L_0x06aa
            X.8LN r2 = X.AnonymousClass8LN.ExpressionFitting
            r0 = r24
            java.lang.String r31 = r0.getModelPath(r2)
        L_0x06aa:
            com.facebook.cameracore.ardelivery.model.VersionedCapability r0 = com.facebook.cameracore.ardelivery.model.VersionedCapability.FaceExpressionFittingRTRRetargeting
            java.util.Map r1 = r1.A00
            java.lang.Object r1 = r1.get(r0)
            com.facebook.cameracore.ardelivery.model.ModelPathsHolder r1 = (com.facebook.cameracore.ardelivery.model.ModelPathsHolder) r1
            if (r1 == 0) goto L_0x06bc
            X.8LN r0 = X.AnonymousClass8LN.RuntimeRigRetargetingConfig
            java.lang.String r39 = r1.getModelPath(r0)
        L_0x06bc:
            if (r21 == 0) goto L_0x06e8
            if (r3 == 0) goto L_0x06e8
            X.8LN r0 = X.AnonymousClass8LN.Caffe2InitNet
            java.lang.String r37 = r3.getModelPath(r0)
            X.8LN r0 = X.AnonymousClass8LN.Caffe2PredictNet
            java.lang.String r38 = r3.getModelPath(r0)
            X.8LN r1 = X.AnonymousClass8LN.MulticlassInitNet
            java.util.Map r0 = r3.mModelPaths
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x06da
            java.lang.String r35 = r3.getModelPath(r1)
        L_0x06da:
            X.8LN r1 = X.AnonymousClass8LN.MulticlassPredictNet
            java.util.Map r0 = r3.mModelPaths
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x06e8
            java.lang.String r36 = r3.getModelPath(r1)
        L_0x06e8:
            X.8xy r0 = new X.8xy
            r24 = r49
            r25 = r62
            r21 = r0
            r22 = r12
            r23 = r15
            r26 = r18
            r27 = r17
            r28 = r20
            r29 = r16
            r30 = r10
            r32 = r14
            r33 = r13
            r34 = r19
            r40 = r11
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            X.7yO r12 = new X.7yO
            r1 = r56
            r12.<init>(r0, r1)
            return r12
        L_0x0711:
            X.8LN r0 = X.AnonymousClass8LN.FaceTrackerFaceDetect
            java.lang.String r11 = r7.getModelPath(r0)
            X.8LN r0 = X.AnonymousClass8LN.FaceTrackerFaceAlign
            java.lang.String r9 = r7.getModelPath(r0)
            X.8LN r0 = X.AnonymousClass8LN.FaceTrackerFaceContour
            java.lang.String r2 = r7.getModelPath(r0)
            X.8LN r0 = X.AnonymousClass8LN.FaceTrackerFaceMesh
            java.lang.String r4 = r7.getModelPath(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String[] r7 = X.AnonymousClass901.A00
            r5 = r7[r6]
            r0.put(r5, r11)
            r5 = r7[r8]
            r0.put(r5, r9)
            r5 = 2
            r5 = r7[r5]
            r0.put(r5, r2)
            r2 = 3
            r2 = r7[r2]
            r0.put(r2, r4)
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>(r0)
            goto L_0x06a0
        L_0x074d:
            X.8zo r12 = new X.8zo
            r12.<init>(r2)
            goto L_0x0672
        L_0x0754:
            X.8zi r11 = new X.8zi
            r11.<init>(r9)
            goto L_0x0627
        L_0x075b:
            X.7yO r12 = new X.7yO
            r12.<init>(r1, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C312246e4.AMo(X.8yK, com.facebook.cameracore.audiograph.AudioGraphClientProvider, X.82S, X.82U, X.8rL, X.6el, com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate, X.6e9, X.82N, X.82P, X.8yg, com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer, X.82G, com.instagram.camera.effect.models.CameraAREffect, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, boolean):X.7yO");
    }
}
