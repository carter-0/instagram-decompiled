package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.feed.media.CameraToolInfoIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.910  reason: invalid class name */
public abstract /* synthetic */ class AnonymousClass910 {
    public static Map A00(CameraToolInfoIntf cameraToolInfoIntf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cameraToolInfoIntf.Ajp() != null) {
            CameraTool Ajp = cameraToolInfoIntf.Ajp();
            0qQ.A0B(Ajp, 0);
            linkedHashMap.put("camera_tool", Ajp.A00);
        }
        if (cameraToolInfoIntf.AzT() != null) {
            linkedHashMap.put(C273654mx.A00(2296), 012.A0p(String.valueOf(cameraToolInfoIntf.AzT())));
        }
        if (cameraToolInfoIntf.ByB() != null) {
            linkedHashMap.put(AnonymousClass000.A00(5276), 012.A0p(String.valueOf(cameraToolInfoIntf.ByB())));
        }
        if (cameraToolInfoIntf.C7W() != null) {
            linkedHashMap.put(C273654mx.A00(3429), 012.A0p(String.valueOf(cameraToolInfoIntf.C7W())));
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
