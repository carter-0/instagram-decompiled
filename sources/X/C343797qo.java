package X;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;

/* renamed from: X.7qo  reason: invalid class name and case insensitive filesystem */
public final class C343797qo {
    public static final C343797qo A00 = new Object();

    public final C344207rU A00(Context context, C343657qa r9, C343787qn... r10) {
        0qQ.A0B(r10, 2);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C343817qr r6 = new C343817qr(context, r9, r10);
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
        Object obj = r9.A00.get(C343657qa.A02);
        if (obj != null) {
            C343887qy r1 = r6.A03;
            Map map = r1.A03;
            map.clear();
            map.put("plugin_list_name", obj);
            ((C344037rD) r1.A00(C344037rD.A00)).DD5(map, 27, elapsedRealtimeNanos2);
            return new C344207rU(r6);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
