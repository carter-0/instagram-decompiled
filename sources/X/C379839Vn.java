package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.io.IOException;
import java.util.HashMap;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Vn  reason: invalid class name and case insensitive filesystem */
public abstract class C379839Vn {
    public static final HashMap A00(String str) {
        String str2;
        String str3;
        0qQ.A0B(str, 0);
        HashMap A1E = AnonymousClass7TE.A1E();
        try {
            C227922kK r7 = new C227922kK(str);
            for (Integer num : AnonymousClass05K.A00(21)) {
                if (num == AnonymousClass05K.A01) {
                    int A0M = r7.A0M("SceneCaptureType", -1);
                    if (A0M == 0) {
                        str3 = "standard";
                    } else if (A0M == 1) {
                        str3 = "landscape";
                    } else if (A0M == 2) {
                        str3 = "portrait";
                    } else if (A0M != 3) {
                        str3 = "";
                    } else {
                        str3 = "night";
                    }
                    A1E.put("scene_capture_type", str3);
                } else {
                    switch (num.intValue()) {
                        case 1:
                            str2 = "SceneCaptureType";
                            break;
                        case 2:
                            str2 = AnonymousClass000.A00(4337);
                            break;
                        case 3:
                            str2 = AnonymousClass000.A00(4336);
                            break;
                        case 4:
                            str2 = AnonymousClass000.A00(2498);
                            break;
                        case 5:
                            str2 = "MakerNote";
                            break;
                        case 6:
                            str2 = "Make";
                            break;
                        case 7:
                            str2 = "Model";
                            break;
                        case 8:
                            str2 = "Xmp";
                            break;
                        case 9:
                            str2 = AnonymousClass000.A00(4365);
                            break;
                        case 10:
                            str2 = "ImageUniqueID";
                            break;
                        case 11:
                            str2 = "ExposureTime";
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                            str2 = "ApertureValue";
                            break;
                        case 13:
                            str2 = "ShutterSpeedValue";
                            break;
                        case 14:
                            str2 = "FocalLength";
                            break;
                        case 15:
                            str2 = "Flash";
                            break;
                        case 16:
                            str2 = "LensModel";
                            break;
                        case 17:
                            str2 = "MeteringMode";
                            break;
                        case EglBase14Impl.EGLExt_SDK_VERSION:
                            str2 = "FocalPlaneXResolution";
                            break;
                        case 19:
                            str2 = "FocalPlaneYResolution";
                            break;
                        case 20:
                            str2 = "FocalPlaneResolutionUnit";
                            break;
                        default:
                            str2 = "SceneType";
                            break;
                    }
                    String A0N = r7.A0N(str2);
                    if (A0N != null) {
                        A1E.put(C59903JbS.A00(num), A0N);
                    }
                }
            }
        } catch (IOException | NullPointerException e) {
            0KC.A0G("LoadExif", "Failed to read exif for shared photo", e);
        }
        return A1E;
    }
}
