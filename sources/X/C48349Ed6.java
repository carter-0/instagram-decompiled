package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ed6  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48349Ed6 {
    public static Map A00(C253703rF r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.AvS() != null) {
            A1H.put("days", r3.AvS());
        }
        if (r3.B1c() != null) {
            A1H.put("end_time", r3.B1c());
        }
        if (r3.BKL() != null) {
            A1H.put("label", r3.BKL());
        }
        if (r3.Bym() != null) {
            A1H.put(TraceFieldType.StartTime, r3.Bym());
        }
        return 0Yt.A0B(A1H);
    }
}
