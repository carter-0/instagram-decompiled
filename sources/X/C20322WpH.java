package X;

import android.util.ArrayMap;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WpH  reason: case insensitive filesystem */
public final class C20322WpH implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ W00 A02;
    public final /* synthetic */ String A03 = "";

    public C20322WpH(W00 w00, int i, long j) {
        this.A02 = w00;
        this.A00 = i;
        this.A01 = j;
    }

    public final void run() {
        ArrayMap arrayMap;
        int valueOf;
        Number number;
        W00 w00 = this.A02;
        int i = this.A00;
        long j = this.A01;
        if (w00.A04) {
            Map map = w00.A01;
            Integer valueOf2 = Integer.valueOf(i);
            if (map.get(valueOf2) == null) {
                map.put(valueOf2, new ArrayMap());
            }
            int i2 = 0;
            if (i != -1) {
                Map map2 = w00.A02;
                if (!map2.containsKey(valueOf2)) {
                    w00.A00.markerStart(1906462, i, j, TimeUnit.MILLISECONDS);
                    C20163WmN wmN = new C20163WmN(w00, i);
                    if (w00.A04) {
                        0no.A00().A01(new C15856Ujg(wmN), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                    }
                    map2.put(valueOf2, new HashSet());
                    if ("".length() != 0 && (arrayMap = (ArrayMap) map.get(valueOf2)) != null) {
                        valueOf = 1;
                        arrayMap.put("", valueOf);
                    }
                    return;
                }
            }
            if ("".length() != 0 && (arrayMap = (ArrayMap) map.get(valueOf2)) != null) {
                ArrayMap arrayMap2 = (ArrayMap) map.get(valueOf2);
                if (!(arrayMap2 == null || (number = (Number) arrayMap2.get("")) == null)) {
                    i2 = number.intValue();
                }
                valueOf = Integer.valueOf(i2 + 1);
                arrayMap.put("", valueOf);
            }
        }
    }
}
