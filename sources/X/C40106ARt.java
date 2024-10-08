package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import com.meta.arfx.engine.interfaces.IARExperimentUtilBinding;
import go.Seq;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.ARt  reason: case insensitive filesystem */
public final class C40106ARt implements C312576ei {
    public IARExperimentUtilBinding A00;
    public final Map A01 = AnonymousClass7TE.A1H();

    public final boolean Ags(AnonymousClass933 r4, boolean z) {
        0qQ.A0B(r4, 0);
        if (r4 != AnonymousClass933.Dummy) {
            switch (r4.ordinal()) {
                case 1:
                case 4:
                case EglBase14Impl.EGLExt_SDK_VERSION:
                case 19:
                case 28:
                case 59:
                case 73:
                case 136:
                    return true;
                case 2:
                case 6:
                case 15:
                case 31:
                case 32:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case Seq.NULL_REFNUM:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 55:
                case 57:
                case 175:
                case 177:
                    Map map = this.A01;
                    if (map.containsKey(r4)) {
                        Boolean bool = (Boolean) map.get(r4);
                        if (bool != null) {
                            return bool.booleanValue();
                        }
                    } else {
                        IARExperimentUtilBinding iARExperimentUtilBinding = this.A00;
                        if (iARExperimentUtilBinding != null) {
                            boolean Agr = iARExperimentUtilBinding.Agr(r4.A00, z);
                            map.put(r4, Boolean.valueOf(Agr));
                            return Agr;
                        }
                    }
                    break;
                case 7:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 13:
                case 16:
                case 17:
                case 21:
                case 24:
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                case 30:
                case 35:
                    return false;
            }
        }
        return z;
    }

    public final boolean Agu(AnonymousClass933 r1, boolean z) {
        return z;
    }

    public final double Ayf(Integer num, double d) {
        return d;
    }

    public final long BOQ(Integer num, long j) {
        return j;
    }

    public final String C1l(Integer num, String str) {
        0qQ.A0B(num, 0);
        if (num.intValue() == 2) {
            return C273654mx.A00(1172);
        }
        return str;
    }
}
