package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cgf  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44545Cgf {
    public static Map A00(TrackOrOriginalSoundSchemaIntf trackOrOriginalSoundSchemaIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        TreeUpdaterJNI treeUpdaterJNI3 = null;
        if (trackOrOriginalSoundSchemaIntf.BSi() != null) {
            TrackMetadata BSi = trackOrOriginalSoundSchemaIntf.BSi();
            if (BSi != null) {
                treeUpdaterJNI2 = BSi.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1H.put("metadata", treeUpdaterJNI2);
        }
        if (trackOrOriginalSoundSchemaIntf.BZA() != null) {
            OriginalSoundDataIntf BZA = trackOrOriginalSoundSchemaIntf.BZA();
            if (BZA != null) {
                treeUpdaterJNI = BZA.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("original_sound", treeUpdaterJNI);
        }
        if (trackOrOriginalSoundSchemaIntf.C92() != null) {
            TrackData C92 = trackOrOriginalSoundSchemaIntf.C92();
            if (C92 != null) {
                treeUpdaterJNI3 = C92.FHC();
            }
            A1H.put("track", treeUpdaterJNI3);
        }
        return 0Yt.A0B(A1H);
    }
}
