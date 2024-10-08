package X;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;

public final class ADN {
    public static final ADN A00 = new Object();

    public final ATC A00(Context context, C343657qa r11, C343787qn... r12) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C343647qZ r1 = new C343647qZ(r11);
        C343647qZ.A00(r1, C343827qs.A00, true);
        C343817qr r4 = new C343817qr(context, new C343657qa(r1), r12);
        ATC atc = new ATC(r4);
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
        Object obj = r11.A00.get(C343657qa.A02);
        if (obj != null) {
            C343887qy r13 = r4.A03;
            Map map = r13.A03;
            map.clear();
            map.put("plugin_list_name", obj);
            ((C344037rD) r13.A00(C344037rD.A00)).DD5(map, 27, elapsedRealtimeNanos2);
            return atc;
        }
        throw AnonymousClass7TE.A0y();
    }
}
