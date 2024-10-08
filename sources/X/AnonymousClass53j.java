package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.feed.media.CameraToolInfo;
import java.io.IOException;

/* renamed from: X.53j  reason: invalid class name */
public abstract class AnonymousClass53j {
    public static CameraToolInfo parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            CameraTool cameraTool = null;
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            while (r9.A1J() != 16L.A09) {
                String A0q = r9.A0q();
                r9.A1J();
                if ("camera_tool".equals(A0q)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    cameraTool = C2807253k.A00(str);
                } else if ("duration_selector_seconds".equals(A0q)) {
                    f = new Float(r9.A0U());
                } else if ("speed_selector".equals(A0q)) {
                    f2 = new Float(r9.A0U());
                } else if ("timer_selector_seconds".equals(A0q)) {
                    f3 = new Float(r9.A0U());
                }
                r9.A0z();
            }
            if (cameraTool != null || !(r9 instanceof 0c9)) {
                return new CameraToolInfo(cameraTool, f, f2, f3);
            }
            ((0c9) r9).A03.A00("camera_tool", "CameraToolInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, CameraToolInfo cameraToolInfo) {
        r2.A0c();
        CameraTool cameraTool = cameraToolInfo.A00;
        if (cameraTool != null) {
            r2.A0R("camera_tool", cameraTool.A00);
        }
        Float f = cameraToolInfo.A01;
        if (f != null) {
            r2.A0O("duration_selector_seconds", f.floatValue());
        }
        Float f2 = cameraToolInfo.A02;
        if (f2 != null) {
            r2.A0O("speed_selector", f2.floatValue());
        }
        Float f3 = cameraToolInfo.A03;
        if (f3 != null) {
            r2.A0O("timer_selector_seconds", f3.floatValue());
        }
        r2.A0Z();
    }
}
