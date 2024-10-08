package X;

import android.content.Context;
import com.facebook.cameracore.ardelivery.model.XplatAssetType;
import com.facebook.cameracore.ardelivery.util.hardwarebackend.chipset.ChipsetInfoUtil;
import com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataFetcher;
import com.facebook.cameracore.ardelivery.xplat.cacheprovider.XplatFileCacheCreator;
import com.facebook.cameracore.ardelivery.xplat.cacheprovider.XplatFileCacheDescriptor;
import com.facebook.cameracore.ardelivery.xplat.connectioninfo.XplatDataConnectionManager;
import com.facebook.cameracore.ardelivery.xplat.effectmanager.XplatEffectManager;
import com.facebook.cameracore.ardelivery.xplat.effectmanager.XplatFeaturesConfig;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.XplatModelMetadataFetcher;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatRemoteModelVersionFetcher;
import com.facebook.cameracore.ardelivery.xplat.scripting.XplatScriptingMetadataFetcher;
import com.facebook.cameracore.ardelivery.xplat.sparkvision.SparkVisionMetadataDownloader;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.tigon.TigonXplatService;
import com.instagram.ar.core.voltron.IgArVoltronModuleLoader;
import com.instagram.common.session.UserSession;
import com.instagram.service.tigon.IGTigonService;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.6ew  reason: invalid class name and case insensitive filesystem */
public final class C312676ew {
    public static C312876fJ A0C;
    public Boolean A00;
    public final Context A01;
    public final C312516eY A02;
    public final C312656et A03;
    public final C312156dv A04;
    public final QuickPerformanceLogger A05;
    public final IgArVoltronModuleLoader A06;
    public final 0lg A07;
    public final AnonymousClass1BJ A08 = AnonymousClass1F2.A00();
    public final 1vn A09;
    public final Executor A0A;
    public volatile C314366i5 A0B;

    /* JADX WARNING: type inference failed for: r8v12, types: [java.lang.Object, X.6fF] */
    /* JADX WARNING: type inference failed for: r0v70, types: [java.lang.Object, X.6fF] */
    public static synchronized void A00(C312676ew r48) {
        C312836fF r8;
        ChipsetInfoUtil chipsetInfoUtil;
        String str;
        C312836fF r0;
        C312856fH r13;
        C312676ew r2 = r48;
        synchronized (r2) {
            if (r2.A0B == null) {
                C312816fD r29 = null;
                C312516eY r5 = r2.A02;
                0lg r4 = ((C312506eX) r5).A01;
                0Tu r7 = 0Tu.A05;
                if (182.A06(r7, r4, 2342154110138122674L)) {
                    UserSession userSession = r2.A07;
                    if (userSession instanceof UserSession) {
                        UserSession userSession2 = userSession;
                        0qQ.A0B(userSession2, 0);
                        r29 = new C312816fD(((C312686ex) userSession2.A01(C312686ex.class, new C13347TVu((Object) userSession2, 48))).A00, userSession);
                    }
                }
                File AXT = r2.A08.AXT((1LJ) null, 1567356230);
                QuickPerformanceLogger quickPerformanceLogger = r2.A05;
                Context context = r2.A01;
                C312156dv r41 = r2.A04;
                if (A0C == null) {
                    synchronized (C312676ew.class) {
                        try {
                            if (A0C == null) {
                                synchronized (C312836fF.class) {
                                    C312836fF r02 = C312836fF.A01;
                                    r0 = r02;
                                    if (r02 == null) {
                                        ? obj = new Object();
                                        obj.A00 = context;
                                        C312836fF.A01 = obj;
                                        r0 = obj;
                                    }
                                }
                                synchronized (C312856fH.class) {
                                    r13 = C312856fH.A00;
                                    if (r13 == null) {
                                        r13 = C312856fH.A01;
                                        C312856fH.A00 = r13;
                                    }
                                }
                                A0C = new C312876fJ(r0, r5, r13, r41, quickPerformanceLogger);
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                }
                C312876fJ r27 = A0C;
                synchronized (C312836fF.class) {
                    try {
                        C312836fF r82 = C312836fF.A01;
                        r8 = r82;
                        if (r82 == null) {
                            ? obj2 = new Object();
                            obj2.A00 = context;
                            C312836fF.A01 = obj2;
                            r8 = obj2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (182.A06(r7, r4, 36316765986230909L)) {
                    synchronized (ChipsetInfoUtil.class) {
                        try {
                            if (ChipsetInfoUtil.THE_ONE == null) {
                                ChipsetInfoUtil.THE_ONE = new ChipsetInfoUtil();
                            }
                        } catch (UnsatisfiedLinkError e) {
                            0KC.A0G("ChipsetInfoUtil", "Unsatisfied link error when initializing chipsetInfoUtil", e);
                            if (e.getMessage() != null) {
                                str = e.getMessage();
                            } else {
                                str = "Unsatisfied link error when initializing chipsetInfoUtil, missing detailed error message.";
                            }
                            0wb.A03("ChipsetInfoUtil", str);
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                        chipsetInfoUtil = ChipsetInfoUtil.THE_ONE;
                    }
                } else {
                    chipsetInfoUtil = null;
                }
                0lg r42 = r2.A07;
                XplatModelMetadataFetcher xplatModelMetadataFetcher = new XplatModelMetadataFetcher(new C312926fP(r8, r27, chipsetInfoUtil, r42));
                C312936fS r1 = new C312936fS();
                C312956fU r25 = new C312956fU();
                1vn r9 = r2.A09;
                XplatRemoteModelVersionFetcher xplatRemoteModelVersionFetcher = new XplatRemoteModelVersionFetcher(new C312996fY(r1, r25, r9), 0wb.A01);
                XplatAsyncMetadataFetcher xplatAsyncMetadataFetcher = new XplatAsyncMetadataFetcher(new C313006fb(context, r9, new C278504wz(r42)));
                XplatScriptingMetadataFetcher xplatScriptingMetadataFetcher = new XplatScriptingMetadataFetcher(new C313026fe(r9));
                SparkVisionMetadataDownloader sparkVisionMetadataDownloader = new SparkVisionMetadataDownloader(r9);
                XplatDataConnectionManager xplatDataConnectionManager = new XplatDataConnectionManager(r8);
                XplatFeaturesConfig xplatFeaturesConfig = new XplatFeaturesConfig(true, true, false, true, 182.A06(r7, r42, 36325755352790215L));
                long j = 800 << 20;
                long j2 = 50 << 20;
                ArrayList arrayList = new ArrayList(Arrays.asList(new XplatFileCacheDescriptor[]{new XplatFileCacheDescriptor(XplatAssetType.AREffect.getValue(), "AREffect", j), new XplatFileCacheDescriptor(XplatAssetType.SparkVision.getValue(), "SparkVision", j), new XplatFileCacheDescriptor(XplatAssetType.Async.getValue(), "Async", j), new XplatFileCacheDescriptor(XplatAssetType.Remote.getValue(), "Remote", j), new XplatFileCacheDescriptor(XplatAssetType.ScriptingPackage.getValue(), "ScriptingPackage", 1 << 20), new XplatFileCacheDescriptor(XplatAssetType.FaceTrackerModel.getValue(), "FaceTrackerModel", j2), new XplatFileCacheDescriptor(XplatAssetType.SegmentationModel.getValue(), "SegmentationModel", j2), new XplatFileCacheDescriptor(XplatAssetType.HairSegmentationModel.getValue(), "HairSegmentationModel", j2), new XplatFileCacheDescriptor(XplatAssetType.MSuggestionsCoreModel.getValue(), "MSuggestionsCoreModel", 3 << 20)}));
                XplatFileCacheCreator xplatFileCacheCreator = new XplatFileCacheCreator(new C313066fn(r5), (C313086fq) null, r5);
                String path = AXT.getPath();
                AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
                AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory(C61560nl.A00().A00);
                TigonXplatService tigonService = IGTigonService.getTigonService(r42);
                C312656et r92 = r2.A03;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C61560nl.A00().A00;
                IgArVoltronModuleLoader igArVoltronModuleLoader = r2.A06;
                List<C312976fW> A002 = C312966fV.A00();
                C313096fr r43 = new C313096fr(context, r5, r41);
                boolean booleanValue = r2.A00.booleanValue();
                0qQ.A0B(path, 0);
                0qQ.A0B(tigonService, 10);
                0qQ.A0B(r92, 13);
                0qQ.A0B(scheduledThreadPoolExecutor, 14);
                0qQ.A0B(igArVoltronModuleLoader, 16);
                0qQ.A0B(r27, 17);
                0qQ.A0B(A002, 19);
                int A0L = 0se.A0L(0Yv.A1E(A002, 10));
                if (A0L < 16) {
                    A0L = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
                for (C312976fW r03 : A002) {
                    linkedHashMap.put(Integer.valueOf(r03.A01.getXplatValue()), Integer.valueOf(r03.A00));
                }
                r2.A0B = new C314366i5(r27, r43, r5, r92, new XplatEffectManager(androidAsyncExecutorFactory2, path, xplatModelMetadataFetcher, xplatRemoteModelVersionFetcher, xplatAsyncMetadataFetcher, xplatScriptingMetadataFetcher, sparkVisionMetadataDownloader, xplatDataConnectionManager, 1, xplatFeaturesConfig, tigonService, arrayList, xplatFileCacheCreator, 50, linkedHashMap, false, false), r29, r25, igArVoltronModuleLoader, A002, scheduledThreadPoolExecutor, booleanValue);
            }
        }
    }

    public C312676ew(Context context, C312516eY r5, C312656et r6, C312156dv r7, QuickPerformanceLogger quickPerformanceLogger, IgArVoltronModuleLoader igArVoltronModuleLoader, 0lg r10, Executor executor) {
        1vn A002;
        this.A01 = context;
        this.A07 = r10;
        this.A0A = executor;
        this.A02 = r5;
        this.A03 = r6;
        this.A06 = igArVoltronModuleLoader;
        this.A05 = quickPerformanceLogger;
        this.A04 = r7;
        if (r10 instanceof UserSession) {
            A002 = 1vm.A01((UserSession) r10);
        } else {
            A002 = 1vm.A00((AnonymousClass0aP) r10);
        }
        this.A09 = A002;
        this.A00 = Boolean.valueOf(182.A06(0Tu.A05, r10, 36325450410111969L));
    }
}
