package X;

import com.facebook.cameracore.mediapipeline.dataproviders.slam.interfaces.SlamLibraryProvider;
import java.io.File;

/* renamed from: X.ARi  reason: case insensitive filesystem */
public final class C40096ARi implements SlamLibraryProvider {
    public String getLibraryPath() {
        0dV.A0C("slam-native");
        try {
            File A01 = 0dV.A01("slam-native");
            A01.getAbsolutePath();
            return A01.getAbsolutePath();
        } catch (Exception e) {
            0KC.A0F("SLAMManager", "Fail to unpack SLAM library", e);
            return "";
        }
    }
}
