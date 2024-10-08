package X;

import com.instagram.api.schemas.MediaCroppingCoordinatesIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4K {
    public static Map A00(MediaCroppingCoordinatesIntf mediaCroppingCoordinatesIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        mediaCroppingCoordinatesIntf.Asp();
        A1H.put("crop_bottom", AnonymousClass7TF.A0T(mediaCroppingCoordinatesIntf.Asp()));
        mediaCroppingCoordinatesIntf.Ass();
        A1H.put("crop_left", AnonymousClass7TF.A0T(mediaCroppingCoordinatesIntf.Ass()));
        mediaCroppingCoordinatesIntf.Asu();
        A1H.put("crop_right", AnonymousClass7TF.A0T(mediaCroppingCoordinatesIntf.Asu()));
        mediaCroppingCoordinatesIntf.Asv();
        return C41845B3m.A0u("crop_top", AnonymousClass7TF.A0T(mediaCroppingCoordinatesIntf.Asv()), A1H);
    }
}
