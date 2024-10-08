package X;

import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.SmS  reason: case insensitive filesystem */
public final class C12073SmS implements C13886Tj9 {
    public final C13886Tj9 A00;

    public final long now() {
        return this.A00.now();
    }

    public C12073SmS(C13886Tj9 tj9) {
        this.A00 = tj9;
    }

    public final void logEvent(String str, Map map) {
        LinkedHashMap A03 = 0Yt.A03(map);
        A03.put("process_id", String.valueOf(Process.myPid()));
        this.A00.logEvent(str, A03);
    }
}
