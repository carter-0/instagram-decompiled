package com.facebook.cameracore.ardelivery.xplat.cacheprovider;

import X.0Tu;
import X.0lg;
import X.0qQ;
import X.182;
import X.AnonymousClass8F1;
import X.C312506eX;
import X.C312516eY;
import X.C313066fn;
import X.C313076fo;
import X.C313086fq;
import X.C352758Ex;
import com.facebook.cameracore.ardelivery.model.XplatAssetType;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.cameracore.ardelivery.xplatcache.stash.StashARDFileCache;
import com.instagram.react.modules.base.IgReactQEModule;

public final class XplatFileCacheCreator {
    public final C312516eY arDeliveryExperimentUtil;
    public final C313086fq assetStorage;
    public final C313076fo assetsDiskCacheProviderFactory;

    public XplatFileCacheCreator(C313076fo r3, C313086fq r4, C312516eY r5) {
        0qQ.A0B(r5, 3);
        this.assetsDiskCacheProviderFactory = r3;
        this.assetStorage = r4;
        this.arDeliveryExperimentUtil = r5;
        if (r3 == null && r4 == null) {
            throw new IllegalArgumentException("No Cache Provider for Xplat File Cache Creator");
        }
    }

    public final ARDFileCache getJavaDiskCache(int i) {
        C352758Ex r4;
        long A01;
        long j;
        C313066fn r5;
        boolean A012;
        String str;
        String str2;
        StashARDFileCache stashARDFileCache;
        int i2 = -1;
        if (this.assetsDiskCacheProviderFactory != null) {
            XplatAssetType ofCppValue = XplatAssetType.ofCppValue(i);
            if (ofCppValue != null) {
                i2 = ofCppValue.ordinal();
            }
            C313076fo r52 = this.assetsDiskCacheProviderFactory;
            C312506eX r1 = (C312506eX) this.arDeliveryExperimentUtil;
            switch (i2) {
                case 1:
                    0lg r2 = r1.A01;
                    0Tu r42 = 0Tu.A05;
                    long A013 = 182.A01(r42, r2, 36592459937350199L);
                    C313066fn r53 = (C313066fn) r52;
                    C312516eY r3 = r53.A00;
                    0lg r22 = ((C312506eX) r3).A01;
                    long A014 = 182.A01(r42, r22, 36592459937219125L);
                    r4 = new C352758Ex(r53, "fe", "ard_effects", (String) null, 800 << 20, A014 << 20, 182.A01(r42, r22, 36592459937284662L) << 20, A013, r3.A01());
                    break;
                case 2:
                    A01 = 182.A01(0Tu.A05, r1.A01, 36592425577742831L);
                    j = 800;
                    r5 = (C313066fn) r52;
                    A012 = r5.A00.A01();
                    str = "ard_bundle";
                    str2 = "fb";
                    break;
                case 6:
                    A01 = 182.A01(0Tu.A05, r1.A01, 36592425577808368L);
                    j = 800;
                    r5 = (C313066fn) r52;
                    A012 = r5.A00.A01();
                    str = "ard_remote";
                    str2 = "remote";
                    break;
                case 7:
                    C313066fn r54 = (C313066fn) r52;
                    long j2 = 50 << 20;
                    long j3 = 0 << 20;
                    String str3 = "ard_facetracker";
                    long j4 = j3;
                    r4 = new C352758Ex(r54, "fm", "ard_facetracker", str3, j2, j3, j4, 182.A01(0Tu.A05, r1.A01, 36592425577611758L), r54.A00.A01());
                    break;
                case 8:
                    A01 = 182.A01(0Tu.A05, r1.A01, 36592425577611758L);
                    j = 50;
                    r5 = (C313066fn) r52;
                    A012 = r5.A00.A01();
                    str = "ard_hair_segmentation";
                    str2 = "hs";
                    break;
                case 9:
                    A01 = 182.A01(0Tu.A05, r1.A01, 36592425577611758L);
                    j = 50;
                    r5 = (C313066fn) r52;
                    A012 = r5.A00.A01();
                    str = "ard_segmentation";
                    str2 = "sm";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    182.A01(0Tu.A05, r1.A01, 36592425577611758L);
                    r4 = null;
                    break;
                case 17:
                    A01 = 182.A01(0Tu.A05, r1.A01, 36592459937350199L);
                    j = 1;
                    r5 = (C313066fn) r52;
                    A012 = r5.A00.A01();
                    str = "ard_scripting_packages";
                    str2 = "scripting";
                    break;
                default:
                    A01 = 182.A01(0Tu.A05, r1.A01, 36592425577611758L);
                    j = 50;
                    r5 = (C313066fn) r52;
                    A012 = r5.A00.A01();
                    str = "ard_shared_model_cache";
                    str2 = "sc";
                    break;
            }
            long j5 = 0 << 20;
            r4 = new C352758Ex(r5, str2, str, (String) null, j << 20, j5, j5, A01, A012);
            AnonymousClass8F1 r43 = (AnonymousClass8F1) r4.get();
            synchronized (r43) {
                stashARDFileCache = r43.A00;
                if (stashARDFileCache == null) {
                    StashARDFileCache stashARDFileCache2 = StashARDFileCache.$redex_init_class;
                    stashARDFileCache = new StashARDFileCache(r43.A01, r43.A02);
                    r43.A00 = stashARDFileCache;
                }
            }
            return stashARDFileCache;
        }
        throw new IllegalArgumentException("Asset Provider is empty");
    }
}
