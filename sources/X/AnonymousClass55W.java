package X;

import com.instagram.api.schemas.CameraTool;
import java.io.IOException;

/* renamed from: X.55W  reason: invalid class name */
public abstract class AnonymousClass55W {
    public static AnonymousClass55X parseFromJson(16F r11) {
        String str;
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Integer num = null;
            CameraTool cameraTool = null;
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("segment_index".equals(A0q)) {
                    num = Integer.valueOf(r11.A1D());
                } else if ("camera_tool".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                    cameraTool = C2807253k.A00(str);
                } else if ("duration_selector_seconds".equals(A0q)) {
                    f = new Float(r11.A0U());
                } else if ("speed_selector".equals(A0q)) {
                    f2 = new Float(r11.A0U());
                } else if ("timer_selector_seconds".equals(A0q)) {
                    f3 = new Float(r11.A0U());
                }
                r11.A0z();
            }
            if (num == null && (r11 instanceof 0c9)) {
                ((0c9) r11).A03.A00("segment_index", "CameraToolInfoWithSegmentIndex");
            } else if (cameraTool != null || !(r11 instanceof 0c9)) {
                return new AnonymousClass55X(cameraTool, f, f2, f3, num.intValue());
            } else {
                ((0c9) r11).A03.A00("camera_tool", "CameraToolInfoWithSegmentIndex");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, AnonymousClass55X r3) {
        r2.A0c();
        r2.A0P("segment_index", r3.A00);
        CameraTool cameraTool = r3.A01;
        if (cameraTool != null) {
            r2.A0R("camera_tool", cameraTool.A00);
        }
        Float f = r3.A02;
        if (f != null) {
            r2.A0O("duration_selector_seconds", f.floatValue());
        }
        Float f2 = r3.A03;
        if (f2 != null) {
            r2.A0O("speed_selector", f2.floatValue());
        }
        Float f3 = r3.A04;
        if (f3 != null) {
            r2.A0O("timer_selector_seconds", f3.floatValue());
        }
        r2.A0Z();
    }
}
