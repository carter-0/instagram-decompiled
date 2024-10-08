package X;

import android.os.Debug;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.4kK  reason: invalid class name and case insensitive filesystem */
public final class C272214kK implements 0LW {
    public static final C272214kK A00 = new Object();

    public static C272214kK A00() {
        return A00;
    }

    public final Integer BVJ() {
        return AnonymousClass05K.A0O;
    }

    public final void E34(0AV r6, 0M7 r7) {
        0i1 r4 = AnonymousClass0LO.A79;
        JSONObject jSONObject = new JSONObject();
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            for (Map.Entry next : memoryInfo.getMemoryStats().entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
        } catch (Throwable unused) {
        }
        r6.A03(r4, jSONObject.toString());
    }

    public final /* synthetic */ boolean CJn(Integer num) {
        return false;
    }
}
