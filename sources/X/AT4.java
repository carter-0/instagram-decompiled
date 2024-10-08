package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.List;

public final class AT4 implements C258943zt {
    public final C2604745u A00;

    public AT4(C2604745u r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        long now;
        if (C64031Cc.A09 == 1CS.A03) {
            now = C64031Cc.A02();
        } else {
            long A002 = this.A00.A00("last_cold_start_key", -1);
            if (A002 != -1) {
                now = AwakeTimeSinceBootClock.INSTANCE.now() - A002;
            }
            return new AnonymousClass40G(0sn.A00, "no record of previous cold start", false);
        }
        if (now != -1) {
            return new AnonymousClass40G(AnonymousClass7TE.A1I(new FeatureData(Type.LONG, "3615", (String) null, (List) null, 0.0d, 16376, now)), (String) null, true);
        }
        return new AnonymousClass40G(0sn.A00, "no record of previous cold start", false);
    }

    public final String getId() {
        return "TimeSpentSinceColdStart";
    }
}
