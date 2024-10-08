package X;

import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.javascriptmodules.implementation.JavascriptModulesDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.location.implementation.LocationDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.platformtexture.implementation.PlatformTextureDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageChannelHybrid;
import com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkPolicyConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkPolicyConfiguration;
import com.facebook.cameracore.mediapipeline.services.persistence.implementation.PersistenceServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.implementation.PlatformAlgorithmDataServiceConfigurationHybrid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public final class ARX implements C41792B0w {
    public final ArrayList AEY(C371698yt r17) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        C371698yt r3 = r17;
        A1C.addAll(r3.A03(AnonymousClass7TE.A1D(Arrays.asList(new C371628yi[]{C380949am.A05, C371668yo.A01, C380899ah.A01, C371678yq.A01, C371828zA.A01, GalleryPickerServiceConfiguration.A01, C371918zM.A01, C371728yy.A01, C371888zI.A01, C371898zJ.A01, C371608yg.A02, C380889ag.A00, C372008zW.A01, C371948zP.A01}))));
        C372158zq r2 = r3.A01;
        if (r2 != null) {
            A1C.add(new FaceTrackerDataProviderConfigurationHybrid(r2));
        }
        C371628yi r22 = C371738z0.A01;
        HashMap hashMap = r3.A08;
        if (hashMap.containsKey(r22)) {
            A1C.add(new MotionDataProviderConfigurationHybrid((C371738z0) r3.A02(r22)));
        }
        C372128zj r23 = r3.A04;
        if (r23 != null) {
            A1C.add(new WorldTrackerDataProviderConfigurationHybrid(r23));
        }
        C371628yi r24 = C371838zD.A02;
        if (hashMap.containsKey(r24)) {
            A1C.add(new PlatformEventsDataProviderConfigurationHybrid((C371838zD) r3.A02(r24)));
        }
        C371628yi r25 = C372078ze.A01;
        if (hashMap.containsKey(r25)) {
            A1C.add(new PlatformTextureDataProviderConfigurationHybrid((C372078ze) r3.A02(r25)));
        }
        C371628yi r26 = C371848zE.A05;
        if (hashMap.containsKey(r26)) {
            A1C.add(new PersistenceServiceConfigurationHybrid((C371848zE) r3.A02(r26)));
        }
        C371978zS r27 = r3.A03;
        if (r27 != null) {
            A1C.add(new LocationDataProviderConfigurationHybrid(r27));
        }
        NetworkPolicyConfiguration networkPolicyConfiguration = r3.A07;
        if (networkPolicyConfiguration != null) {
            A1C.add(new NetworkPolicyConfigurationHybrid(networkPolicyConfiguration));
        }
        C371628yi r28 = C371988zT.A01;
        if (hashMap.containsKey(r28)) {
            A1C.add(new PlatformAlgorithmDataServiceConfigurationHybrid((C371988zT) r3.A02(r28)));
        }
        C371628yi r29 = C380929ak.A02;
        if (hashMap.containsKey(r29)) {
            A1C.add(new JavascriptModulesDataProviderConfigurationHybrid((C380929ak) r3.A02(r29)));
        }
        Iterator A0v = AnonymousClass7TF.A0v(Collections.unmodifiableMap(r3.A00));
        while (A0v.hasNext()) {
            A1C.add(new ServiceMessageChannelHybrid((C39674A4o) A0v.next()));
        }
        return A1C;
    }
}
