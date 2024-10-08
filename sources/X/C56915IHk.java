package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.appstate.gen.AppstateApi;
import com.facebook.rsys.starrating.gen.StarRatingApi;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.instagram.rtc.rsys.proxies.IGRTCFeatureProvider;

/* renamed from: X.IHk  reason: case insensitive filesystem */
public final class C56915IHk implements 2LV {
    public final int A00;

    public C56915IHk(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object AJq(McfReference mcfReference) {
        switch (this.A00) {
            case 0:
                return AppstateApi.CProxy.createFromMcfType(mcfReference);
            case 1:
                return StarRatingApi.CProxy.createFromMcfType(mcfReference);
            case 2:
                return VideoEffectCommunicationApi.CProxy.createFromMcfType(mcfReference);
            default:
                return IGRTCFeatureProvider.CProxy.createFromMcfType(mcfReference);
        }
    }

    public final Class BTf() {
        switch (this.A00) {
            case 0:
                return AppstateApi.class;
            case 1:
                return StarRatingApi.class;
            case 2:
                return VideoEffectCommunicationApi.class;
            default:
                return IGRTCFeatureProvider.class;
        }
    }

    public final long CAr() {
        switch (this.A00) {
            case 0:
                long j = AppstateApi.CProxy.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long nativeGetMcfTypeId = AppstateApi.CProxy.nativeGetMcfTypeId();
                AppstateApi.CProxy.sMcfTypeId = nativeGetMcfTypeId;
                return nativeGetMcfTypeId;
            case 1:
                long j2 = StarRatingApi.CProxy.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long nativeGetMcfTypeId2 = StarRatingApi.CProxy.nativeGetMcfTypeId();
                StarRatingApi.CProxy.sMcfTypeId = nativeGetMcfTypeId2;
                return nativeGetMcfTypeId2;
            case 2:
                long j3 = VideoEffectCommunicationApi.CProxy.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long nativeGetMcfTypeId3 = VideoEffectCommunicationApi.CProxy.nativeGetMcfTypeId();
                VideoEffectCommunicationApi.CProxy.sMcfTypeId = nativeGetMcfTypeId3;
                return nativeGetMcfTypeId3;
            default:
                long j4 = IGRTCFeatureProvider.CProxy.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long nativeGetMcfTypeId4 = IGRTCFeatureProvider.CProxy.nativeGetMcfTypeId();
                IGRTCFeatureProvider.CProxy.sMcfTypeId = nativeGetMcfTypeId4;
                return nativeGetMcfTypeId4;
        }
    }
}
