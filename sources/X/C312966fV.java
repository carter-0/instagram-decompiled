package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6fV  reason: invalid class name and case insensitive filesystem */
public abstract class C312966fV {
    public static List A00() {
        C312976fW r0 = new C312976fW(VersionedCapability.Facetracker, 14021);
        C312976fW r02 = new C312976fW(VersionedCapability.Segmentation, 1014001);
        C312976fW r03 = new C312976fW(VersionedCapability.HairSegmentation, 2003000);
        C312976fW r04 = new C312976fW(VersionedCapability.Nametag, 101020);
        C312976fW r05 = new C312976fW(VersionedCapability.BodyTracking, 149020);
        C312976fW r06 = new C312976fW(VersionedCapability.FaceExpressionFitting, 15020);
        C312976fW r07 = new C312976fW(VersionedCapability.MulticlassSegmentation, 3005021);
        C312976fW r08 = new C312976fW(VersionedCapability.HandTracker, 9028020);
        C312976fW r09 = new C312976fW(VersionedCapability.EnlightenGAN, 2020);
        C312976fW r010 = new C312976fW(VersionedCapability.SceneUnderstanding, 4020);
        return Arrays.asList(new C312976fW[]{r0, r02, r03, r04, r05, r06, r07, r08, r09, r010, new C312976fW(VersionedCapability.Ocr2goCreditCard, 1020), new C312976fW(VersionedCapability.IiIdDetector, 1020), new C312976fW(VersionedCapability.Recognition, 2020), new C312976fW(VersionedCapability.IGReelsXRay, 4020), new C312976fW(VersionedCapability.SkySegmentation, 1020), new C312976fW(VersionedCapability.DepthEstimation, 4020), new C312976fW(VersionedCapability.IiFaceTracker, IgNetworkConsentStorage.MAX_ENTRIES), new C312976fW(VersionedCapability.HandGesture, 1020), new C312976fW(VersionedCapability.FaceWave, 2020), new C312976fW(VersionedCapability.Saliency, 2020), new C312976fW(VersionedCapability.MultitaskPeopleSegmentation, 4020), new C312976fW(VersionedCapability.FaceExpressionFittingRTRRetargeting, 1), new C312976fW(VersionedCapability.VideoHighlights, 1020), new C312976fW(VersionedCapability.SegmentAnything, 1020), new C312976fW(VersionedCapability.UTwoNet, 1020), new C312976fW(VersionedCapability.BodyTracking3D, 1020)});
    }
}
