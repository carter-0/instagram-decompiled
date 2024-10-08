package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.rsys.devicestats.gen.BatteryStatsReader;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class NCu extends BatteryStatsReader {
    public 0sP A00;
    public final Context A01;

    public final long getBatteryLevel() {
        int i;
        boolean z;
        Intent A002 = 0DH.A00((BroadcastReceiver) null, this.A01, new IntentFilter(AnonymousClass000.A00(502)));
        int i2 = -1;
        if (A002 != null) {
            i = A002.getIntExtra("level", -1);
            i2 = A002.getIntExtra("scale", -1);
            int intExtra = A002.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, -1);
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            z = false;
        } else {
            i = -1;
            z = false;
        }
        C70589OCm oCm = new C70589OCm(z, (int) (((float) (i * 100)) / ((float) i2)));
        0sP r0 = this.A00;
        if (r0 != null) {
            r0.invoke(oCm);
        }
        return (long) oCm.A00;
    }

    public final boolean isCharging() {
        Intent A002 = 0DH.A00((BroadcastReceiver) null, this.A01, new IntentFilter(AnonymousClass000.A00(502)));
        if (A002 == null) {
            return false;
        }
        int intExtra = A002.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    public NCu(Context context, 0sP r2) {
        this.A01 = context;
        this.A00 = r2;
    }
}
