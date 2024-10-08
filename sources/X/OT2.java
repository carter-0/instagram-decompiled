package X;

import android.content.Context;
import android.os.PowerManager;

public final class OT2 {
    public static final O1P A01 = new Object();
    public static volatile OT2 A02;
    public final PowerManager A00;

    public OT2(Context context) {
        PowerManager powerManager;
        Object systemService = context.getSystemService("power");
        if (systemService instanceof PowerManager) {
            powerManager = (PowerManager) systemService;
        } else {
            powerManager = null;
        }
        this.A00 = powerManager;
    }
}
