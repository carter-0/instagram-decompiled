package X;

import android.os.Handler;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter;
import com.facebook.cameracore.ardelivery.xplat.effectmanager.XplatEffectManager;
import com.facebook.cameracore.ardelivery.xplat.models.XplatEffectLoggingInfo;
import com.facebook.common.callercontext.CallerContextable;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.ar.core.voltron.IgArVoltronModuleLoader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.6i5  reason: invalid class name and case insensitive filesystem */
public final class C314366i5 implements CallerContextable {
    public static final String __redex_internal_original_name = "XplatCameraCoreEffectManager";
    public AnonymousClass6i7 A00;
    public String A01;
    public final C313096fr A02;
    public final C312516eY A03;
    public final AREngineMaskEffectAdapter A04 = new Object();
    public final XplatEffectManager A05;
    public final C312956fU A06;
    public final List A07;
    public final ScheduledExecutorService A08;
    public final AnonymousClass6i7 A09 = new C314376i6();
    public final C314386iA A0A;
    public final C312816fD A0B;
    public final boolean A0C;

    public static final AnonymousClass6i7 A00(Handler handler, C371478yM r3, AREngineMaskEffectAdapter aREngineMaskEffectAdapter, C314366i5 r5, C352728Ep r6, List list, boolean z) {
        AnonymousClass6i7 A012;
        C314366i5 r1 = r5;
        boolean z2 = r5.A0C;
        C352728Ep r52 = r6;
        List list2 = list;
        boolean z3 = z;
        if (!z2) {
            return r1.A01(handler, r3, aREngineMaskEffectAdapter, r52, list2, z3);
        }
        synchronized (r1) {
            A012 = r1.A01(handler, r3, aREngineMaskEffectAdapter, r52, list2, z3);
        }
        return A012;
    }

    public final void A03(AnonymousClass84Q r9, List list, boolean z) {
        0qQ.A0B(list, 0);
        C352718Eo r0 = new C352718Eo();
        r0.A06 = z;
        C352728Ep A002 = r0.A00();
        C314386iA r4 = this.A0A;
        C312516eY r6 = r4.A01;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2809455e mLFrameworkType = ((VersionedCapability) it.next()).getMLFrameworkType();
            if (mLFrameworkType != C2809455e.CAFFE2 && mLFrameworkType == C2809455e.PYTORCH && 0oI.A0C(((C312506eX) r6).A00)) {
                hashSet.add(C312656et.PYTORCH_VOLTRON_MODULE_NAME);
            }
        }
        ListenableFuture A003 = C314386iA.A00(r4, A002, new ArrayList(hashSet));
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((VersionedCapability) it2.next()).getXplatValue()));
        }
        this.A05.fetchLatestModels(arrayList, new XplatEffectLoggingInfo(z), z, new C352748Es(r9, this, A003));
    }

    public final void A04(C312136ds r4) {
        0qQ.A0B(r4, 0);
        C313096fr r2 = this.A02;
        WeakHashMap weakHashMap = new WeakHashMap(r2.A03);
        weakHashMap.put(r4, true);
        r2.A03 = weakHashMap;
        r2.A03.size();
    }

    public final void A05(C352728Ep r21, String str, String str2) {
        String str3 = str;
        0qQ.A0B(str3, 1);
        C313096fr r1 = this.A02;
        C352728Ep r0 = r21;
        if (!r0.A02) {
            String str4 = r0.A03;
            C368758tH A002 = C313096fr.A00(r1, str4);
            String str5 = str2;
            if (A002 != null) {
                C313096fr.A02(A002.onStartEvent(0, r0.A00, r0.A01, str4, r0.A06, str3, str5, r0.A04));
            } else {
                C312156dv r10 = r1.A00;
                if (r10 != null) {
                    String str6 = r0.A00;
                    long instanceIdWithString = r10.getInstanceIdWithString(16321564, str6);
                    r10.startWithFlowInstanceId(instanceIdWithString, str6, r0.A01, str4, r0.A06, str3, str5, r0.A04);
                    r10.markPoint(instanceIdWithString, 0, str6);
                    r10.annotate(instanceIdWithString, "oc_ar_xlogger", "false", str6);
                }
            }
            C313096fr.A01(r1, r0.A00);
        }
    }

    public final void A06(String str) {
        AnonymousClass6i7 r0;
        AnonymousClass6i7 r02;
        0qQ.A0B(str, 0);
        if (this.A0C) {
            synchronized (this) {
                if (str.equals(this.A01) && (r02 = this.A00) != null) {
                    r02.cancel();
                    this.A00 = null;
                    this.A01 = null;
                }
            }
        } else if (str.equals(this.A01) && (r0 = this.A00) != null) {
            r0.cancel();
            this.A00 = null;
            this.A01 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [java.lang.Object, X.S1g] */
    /* JADX WARNING: type inference failed for: r1v25, types: [java.lang.Object, X.S1g] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r1 != X.C312746f6.WITHDRAWN) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass6i7 A01(android.os.Handler r28, X.C371478yM r29, com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter r30, X.C352728Ep r31, java.util.List r32, boolean r33) {
        /*
            r27 = this;
            r2 = r31
            r0 = r33
            r2.A02 = r0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r32.iterator()
        L_0x000f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r3 = r4.next()
            com.facebook.cameracore.ardelivery.model.ARRequestAsset r3 = (com.facebook.cameracore.ardelivery.model.ARRequestAsset) r3
            X.80A r0 = r3.A02
            com.facebook.cameracore.ardelivery.model.ARAssetType r1 = r0.A02
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = com.facebook.cameracore.ardelivery.model.ARAssetType.EFFECT
            if (r1 != r0) goto L_0x000f
            r6.add(r3)
            goto L_0x000f
        L_0x0027:
            int r0 = r6.size()
            r7 = 1
            r3 = r27
            r26 = r28
            r25 = r29
            if (r0 == r7) goto L_0x0059
            X.S1g r1 = new X.S1g
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass05K.A07
            r1.A00 = r0
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "effect asset is missing"
        L_0x0045:
            r1.A01 = r0
            X.Apn r4 = new X.Apn
            r0 = r25
            r4.<init>(r0, r1, r3, r2)
        L_0x004e:
            r0 = r26
            X.C371548ya.A00(r0, r4)
            X.6i7 r1 = r3.A09
        L_0x0055:
            return r1
        L_0x0056:
            java.lang.String r0 = "can't load more than one effect at once"
            goto L_0x0045
        L_0x0059:
            X.6fD r5 = r3.A0B
            r14 = 0
            if (r5 == 0) goto L_0x0105
            java.lang.Object r10 = r6.get(r14)
            com.facebook.cameracore.ardelivery.model.ARRequestAsset r10 = (com.facebook.cameracore.ardelivery.model.ARRequestAsset) r10
            X.0qQ.A0B(r10, r14)
            X.80A r9 = r10.A02
            com.facebook.cameracore.ardelivery.model.ARAssetType r1 = r9.A02
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = com.facebook.cameracore.ardelivery.model.ARAssetType.EFFECT
            r11 = 1
            if (r1 != r0) goto L_0x029f
            com.google.common.collect.ImmutableSet r0 = r5.A01
            java.lang.String r8 = r9.A09
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x00a4
            X.6fE r1 = r5.A00
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x008c
            X.6f1 r0 = r1.A00
            X.6f6 r1 = r0.A04
            if (r1 != 0) goto L_0x0088
            X.6f6 r1 = X.C312746f6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
        L_0x0088:
            X.6f6 r0 = X.C312746f6.WITHDRAWN
            if (r1 == r0) goto L_0x00a4
        L_0x008c:
            r11 = 0
        L_0x008d:
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0105
            if (r11 == 0) goto L_0x0105
            X.S1g r1 = new X.S1g
            r1.<init>()
            java.lang.Integer r0 = X.AnonymousClass05K.A0A
            r1.A00 = r0
            X.Apo r4 = new X.Apo
            r0 = r25
            r4.<init>(r0, r1, r3, r2)
            goto L_0x004e
        L_0x00a4:
            r1 = 0
            java.lang.String r0 = "ar_delivery_invalidated_effect"
            r0.getClass()
            X.0xI r4 = X.0xI.A01(r0, r1)
            boolean r0 = r10.A0B
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = "effect_id"
            r4.A0C(r0, r8)
            java.lang.String r1 = r9.A0A
            r0 = 1294(0x50e, float:1.813E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0C(r0, r1)
        L_0x00c2:
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "effect_session_id"
            r4.A0C(r0, r1)
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "operation_id"
            r4.A0C(r0, r1)
            boolean r0 = r2.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_prefetch"
            r4.A09(r0, r1)
            java.lang.String r1 = r2.A06
            java.lang.String r0 = "product_session_id"
            r4.A0C(r0, r1)
            java.lang.String r1 = r2.A04
            java.lang.String r0 = "product_name"
            r4.A0C(r0, r1)
            java.lang.String r1 = r2.A05
            java.lang.String r0 = "request_source"
            r4.A0C(r0, r1)
            boolean r0 = r5.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_log_only"
            r4.A09(r0, r1)
            X.0lg r0 = r5.A02
            X.0xN r0 = X.C60510iO.A00(r0)
            r0.EFq(r4)
            goto L_0x008d
        L_0x0105:
            java.lang.Object r12 = r6.get(r14)
            com.facebook.cameracore.ardelivery.model.ARRequestAsset r12 = (com.facebook.cameracore.ardelivery.model.ARRequestAsset) r12
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x011a
            X.6i7 r0 = r3.A00
            if (r0 == 0) goto L_0x011a
            java.lang.String r0 = r3.A01
            if (r0 == 0) goto L_0x011a
            r3.A06(r0)
        L_0x011a:
            boolean r0 = r32.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x013c
            java.util.Iterator r5 = r32.iterator()
        L_0x0125:
            r6 = r4
        L_0x0126:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0145
            java.lang.Object r4 = r5.next()
            com.facebook.cameracore.ardelivery.model.ARRequestAsset r4 = (com.facebook.cameracore.ardelivery.model.ARRequestAsset) r4
            X.80A r0 = r4.A02
            com.facebook.cameracore.ardelivery.model.ARAssetType r1 = r0.A02
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = com.facebook.cameracore.ardelivery.model.ARAssetType.EFFECT
            if (r1 != r0) goto L_0x0126
            if (r6 == 0) goto L_0x0125
        L_0x013c:
            X.AoO r4 = new X.AoO
            r0 = r25
            r4.<init>(r0, r3, r2)
            goto L_0x004e
        L_0x0145:
            if (r6 == 0) goto L_0x013c
            com.facebook.cameracore.ardelivery.xplat.models.XplatEffectModel r5 = new com.facebook.cameracore.ardelivery.xplat.models.XplatEffectModel
            r5.<init>(r6)
            com.facebook.cameracore.ardelivery.xplat.models.XplatEffectLoggingInfo r4 = new com.facebook.cameracore.ardelivery.xplat.models.XplatEffectLoggingInfo
            r4.<init>(r2, r12)
            X.6fr r11 = r3.A02
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0189
            java.lang.String r13 = r2.A03
            X.8tH r15 = X.C313096fr.A00(r11, r13)
            if (r15 == 0) goto L_0x023e
            java.lang.String r0 = r2.A00
            r17 = r0
            java.lang.String r10 = r2.A01
            java.lang.String r9 = r2.A06
            X.80A r0 = r12.A02
            java.lang.String r8 = r0.A09
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = r2.A04
            r20 = r9
            r21 = r8
            r22 = r1
            r23 = r0
            r16 = r14
            r18 = r10
            r19 = r13
            boolean r0 = r15.onStartEvent(r16, r17, r18, r19, r20, r21, r22, r23)
            X.C313096fr.A02(r0)
        L_0x0184:
            java.lang.String r0 = r2.A00
            X.C313096fr.A01(r11, r0)
        L_0x0189:
            X.6iA r11 = r3.A0A
            X.6et r10 = r11.A02
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            X.80A r8 = r12.A02
            com.facebook.cameracore.ardelivery.model.ARAssetType r1 = r8.A02
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = com.facebook.cameracore.ardelivery.model.ARAssetType.EFFECT
            if (r1 != r0) goto L_0x01a5
            java.lang.String r1 = r12.A08
            java.lang.String r0 = r8.A09
            java.util.Collection r0 = r10.getVoltronModulesForManifest(r1, r0)
            r9.addAll(r0)
        L_0x01a5:
            com.google.common.util.concurrent.ListenableFuture r18 = X.C314386iA.A00(r11, r2, r9)
            com.facebook.cameracore.ardelivery.xplat.effectmanager.XplatEffectManager r10 = r3.A05
            java.util.List r0 = r5.capabilitiesMinVersionModels
            if (r0 == 0) goto L_0x027b
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r14 = r0.iterator()
        L_0x01b8:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0279
            java.lang.Object r9 = r14.next()
            com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling r9 = (com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling) r9
            X.6eY r0 = r3.A03
            X.6eX r0 = (X.C312506eX) r0
            X.0lg r12 = r0.A01
            X.0Tu r13 = X.0Tu.A06
            r0 = 2342156798787717368(0x20810333000208f8, double:4.06031996582489E-152)
            boolean r0 = X.182.A06(r13, r12, r0)
            if (r0 == 0) goto L_0x0239
            X.6fX r13 = X.C312986fX.NMLML
            X.6fU r0 = r3.A06
            com.facebook.cameracore.ardelivery.model.VersionedCapability r1 = r9.mCapability
            X.0qQ.A07(r1)
            java.util.Map r0 = r0.A01
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x01ea
            X.6fX r0 = X.C312986fX.ARD
        L_0x01ea:
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0239
            r0 = 36316156100874244(0x81055a00001004, double:3.0298215793914234E-306)
            X.1AA r13 = X.182.A02(r12, r0)
            if (r13 == 0) goto L_0x0232
            X.0Tu r12 = new X.0Tu
            r12.<init>()
            X.0Tu r12 = X.0Tu.A00(r12)
            r12.A01 = r7
            boolean r0 = r13.Ah0(r12, r0)
        L_0x020a:
            if (r0 != 0) goto L_0x0239
            com.facebook.cameracore.ardelivery.model.VersionedCapability r12 = r9.mCapability
            int r9 = r9.mMinVersion
            java.lang.String r1 = "00"
            java.lang.String r0 = "0"
            java.lang.String r0 = X.002.A04(r9, r1, r0)
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0221 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0221 }
            goto L_0x0225
        L_0x0221:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
        L_0x0225:
            int r1 = r0.intValue()
            com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling r0 = new com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling
            r0.<init>((com.facebook.cameracore.ardelivery.model.VersionedCapability) r12, (int) r1)
            r11.add(r0)
            goto L_0x01b8
        L_0x0232:
            X.0Tu r13 = X.0Tu.A05
            boolean r0 = X.182.A06(r13, r12, r0)
            goto L_0x020a
        L_0x0239:
            r11.add(r9)
            goto L_0x01b8
        L_0x023e:
            X.6dv r10 = r11.A00
            if (r10 == 0) goto L_0x0184
            r0 = 16321564(0xf90c1c, float:2.2871383E-38)
            java.lang.String r9 = r2.A00
            long r0 = r10.getInstanceIdWithString(r0, r9)
            java.lang.String r8 = r2.A01
            r19 = r8
            java.lang.String r8 = r2.A06
            r21 = r8
            X.80A r15 = r12.A02
            java.lang.String r8 = r15.A09
            r22 = r8
            java.lang.String r8 = r15.A0A
            r23 = r8
            java.lang.String r8 = r2.A04
            r15 = r10
            r16 = r0
            r18 = r9
            r20 = r13
            r24 = r8
            r15.startWithFlowInstanceId(r16, r18, r19, r20, r21, r22, r23, r24)
            r10.markPoint(r0, r14, r9)
            java.lang.String r16 = "oc_ar_xlogger"
            java.lang.String r17 = "false"
            r13 = r10
            r14 = r0
            r13.annotate(r14, r16, r17, r18)
            goto L_0x0184
        L_0x0279:
            r5.capabilitiesMinVersionModels = r11
        L_0x027b:
            X.8yT r11 = new X.8yT
            r15 = r30
            r12 = r26
            r13 = r25
            r14 = r6
            r16 = r3
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            com.facebook.cameracore.ardelivery.listener.xplatimpl.CancelableTokenJNI r0 = r10.loadEffect(r5, r4, r11)
            X.8yV r1 = new X.8yV
            r1.<init>(r0, r3, r2)
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0055
            r3.A00 = r1
            java.lang.String r0 = r8.A09
            r3.A01 = r0
            return r1
        L_0x029f:
            java.lang.String r1 = "EffectValidityChecker should only be invoked on effect asset"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314366i5.A01(android.os.Handler, X.8yM, com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter, X.8Ep, java.util.List, boolean):X.6i7");
    }

    public static final void A02(C371478yM r10, C8993RKl rKl, C314366i5 r12, C352728Ep r13) {
        C313096fr r1 = r12.A02;
        if (!r13.A02) {
            C368758tH A002 = C313096fr.A00(r1, r13.A03);
            String str = "";
            if (A002 != null) {
                String str2 = r13.A00;
                int intValue = rKl.A00.intValue();
                if (rKl.getMessage() != null) {
                    str = rKl.getMessage();
                }
                C313096fr.A02(A002.onFailureEvent(1, str2, "ar_delivery", intValue, 002.A0R("Effect fetch failed, reason: ", str)));
            } else {
                C312156dv r4 = r1.A00;
                if (r4 != null) {
                    long instanceIdWithString = r4.getInstanceIdWithString(16321564, r13.A00);
                    int intValue2 = rKl.A00.intValue();
                    if (rKl.getMessage() != null) {
                        str = rKl.getMessage();
                    }
                    r4.endFail(instanceIdWithString, "ar_delivery", intValue2, 002.A0R("Effect fetch failed, reason: ", str));
                }
            }
        }
        r10.DEV(rKl);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.facebook.cameracore.ardelivery.xplat.effectmanager.AREngineMaskEffectAdapter, java.lang.Object] */
    public C314366i5(C312876fJ r7, C313096fr r8, C312516eY r9, C312656et r10, XplatEffectManager xplatEffectManager, C312816fD r12, C312956fU r13, IgArVoltronModuleLoader igArVoltronModuleLoader, List list, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.A05 = xplatEffectManager;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        this.A08 = scheduledExecutorService2;
        this.A03 = r9;
        this.A07 = list;
        this.A02 = r8;
        this.A06 = r13;
        this.A0B = r12;
        this.A0C = z;
        this.A0A = new C314386iA(r7, r9, r10, igArVoltronModuleLoader, scheduledExecutorService2);
    }
}
