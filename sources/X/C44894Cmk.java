package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cmk  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44894Cmk {
    public static Map A00(C239643Hk r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.AgB() != null) {
            A1H.put("bloks_app_id", r3.AgB());
        }
        if (r3.AtC() != null) {
            A1H.put("cta_button_text", r3.AtC());
        }
        if (r3.AtP() != null) {
            A1H.put("cta_style", r3.AtP());
        }
        r3.getDuration();
        A1H.put(TraceFieldType.Duration, Integer.valueOf(r3.getDuration()));
        r3.B7I();
        A1H.put(AnonymousClass000.A00(609), Boolean.valueOf(r3.B7I()));
        if (r3.getId() != null) {
            C41845B3m.A0x(r3.getId(), A1H);
        }
        r3.CQv();
        A1H.put(AnonymousClass000.A00(671), Boolean.valueOf(r3.CQv()));
        if (r3.Bax() != null) {
            A1H.put("payload", r3.Bax());
        }
        if (r3.getTitle() != null) {
            C41845B3m.A12(r3.getTitle(), A1H);
        }
        if (r3.C9L() != null) {
            A1H.put("tracking_token", r3.C9L());
        }
        return 0Yt.A0B(A1H);
    }
}
