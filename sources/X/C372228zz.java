package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import java.util.HashMap;

/* renamed from: X.8zz  reason: invalid class name and case insensitive filesystem */
public abstract class C372228zz {
    public static HashMap A00(ModelPathsHolder modelPathsHolder) {
        HashMap hashMap = new HashMap();
        hashMap.put("face_tracker_model.bin", modelPathsHolder.getModelPath(AnonymousClass8LN.FaceTrackerFaceAlign));
        hashMap.put("face_detector_model.bin", modelPathsHolder.getModelPath(AnonymousClass8LN.FaceTrackerFaceDetect));
        hashMap.put("features_model.bin", modelPathsHolder.getModelPath(AnonymousClass8LN.FaceTrackerFaceContour));
        hashMap.put("pdm_multires.bin", modelPathsHolder.getModelPath(AnonymousClass8LN.FaceTrackerFaceMesh));
        return hashMap;
    }
}
