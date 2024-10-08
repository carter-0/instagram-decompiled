package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cms  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44902Cms {
    public static Map A00(C269824fk r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.getBackgroundColor() != null) {
            A1H.put("background_color", r3.getBackgroundColor());
        }
        if (r3.BCy() != null) {
            A1H.put("height_percentage", AnonymousClass7TH.A0D(r3.BCy()));
        }
        if (r3.Byx() != null) {
            A1H.put("start_x_position_percentage", AnonymousClass7TH.A0D(r3.Byx()));
        }
        if (r3.Byz() != null) {
            A1H.put("start_y_position_percentage", AnonymousClass7TH.A0D(r3.Byz()));
        }
        if (r3.getTextColor() != null) {
            A1H.put("text_color", r3.getTextColor());
        }
        if (r3.C5c() != null) {
            A1H.put("text_size", r3.C5c());
        }
        if (r3.CGb() != null) {
            A1H.put("width_percentage", AnonymousClass7TH.A0D(r3.CGb()));
        }
        return 0Yt.A0B(A1H);
    }
}
