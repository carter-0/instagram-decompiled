package X;

import com.facebook.maps.ttrc.common.MapboxTTRC;

/* renamed from: X.WhD  reason: case insensitive filesystem */
public final class C19884WhD implements Runnable {
    public final void run() {
        synchronized (MapboxTTRC.class) {
            G8K g8k = MapboxTTRC.sTTRCTrace;
            if (g8k != null) {
                g8k.Ey0("midgard_data_done");
            }
        }
    }
}
