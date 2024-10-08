package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import java.util.Map;

public abstract class LPU {
    public static boolean A02(Object obj, Map map) {
        return 0qQ.A0I((Float) map.get(obj), 0.0f);
    }

    public static final boolean A00(FilterModel filterModel) {
        if (!(filterModel instanceof ValueMapFilterModel)) {
            return false;
        }
        Map map = ((ValueMapFilterModel) filterModel).A01.A02;
        if (!0qQ.A0I((Float) map.get("highlights"), 0.0f) || !A02("shadows", map) || !A02("sharpen", map)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(FilterModel filterModel) {
        if (!(filterModel instanceof ValueMapFilterModel)) {
            return false;
        }
        TypedParameterMap typedParameterMap = ((ValueMapFilterModel) filterModel).A01;
        Map map = typedParameterMap.A02;
        if (0qQ.A0I((Float) map.get("brightness"), 0.0f) && A02("contrast", map) && A02("saturation", map) && A02("temperature", map) && A02("vignette", map) && A02("fade", map)) {
            Map map2 = typedParameterMap.A01;
            C62580KiD A01 = LSj.A01((float[]) map2.get("tint_shadows_color"));
            C62580KiD kiD = C62580KiD.A06;
            if (A01 == kiD && LSj.A01((float[]) map2.get("tint_highlights_color")) == kiD) {
                return false;
            }
            return true;
        }
        return true;
    }
}
