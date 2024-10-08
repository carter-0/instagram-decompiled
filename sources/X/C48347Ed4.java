package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.DayOfTheWeek;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ed4  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48347Ed4 {
    public static Map A00(C51953G8w g8w) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (g8w.AvS() != null) {
            List<DayOfTheWeek> AvS = g8w.AvS();
            if (AvS != null) {
                arrayList = AnonymousClass7TG.A0r(AvS);
                for (DayOfTheWeek dayOfTheWeek : AvS) {
                    0qQ.A0B(dayOfTheWeek, 0);
                    arrayList.add(dayOfTheWeek.A00);
                }
            } else {
                arrayList = null;
            }
            A1H.put("days", arrayList);
        }
        if (g8w.B1c() != null) {
            A1H.put("end_time", g8w.B1c());
        }
        if (g8w.BKL() != null) {
            A1H.put("label", g8w.BKL());
        }
        if (g8w.Bym() != null) {
            A1H.put(TraceFieldType.StartTime, g8w.Bym());
        }
        return 0Yt.A0B(A1H);
    }
}
