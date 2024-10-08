package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.List;

/* renamed from: X.So0  reason: case insensitive filesystem */
public final class C12152So0 implements C258943zt {
    public final 1Cn A00;

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        C255463uA[] r0 = FeatureData.A0E;
        Type type = Type.DOUBLE;
        1Cn r2 = this.A00;
        1Cn.A00(r2);
        FeatureData featureData = new FeatureData(type, "2619", (String) null, (List) null, ((double) r2.A00) / 100.0d, 16372, 0);
        Type type2 = Type.LONG;
        1Cn.A00(r2);
        String str = r2.A01;
        long j = -1;
        switch (str.hashCode()) {
            case -1054830049:
                if (str.equals("Unplugged")) {
                    j = 0;
                    break;
                }
                break;
            case 2201263:
                if (str.equals("Full")) {
                    j = 2;
                    break;
                }
                break;
            case 1500759697:
                if (str.equals("Charging")) {
                    j = 1;
                    break;
                }
                break;
        }
        return new AnonymousClass40G(0sr.A1P(new FeatureData[]{featureData, new FeatureData(type2, "2618", (String) null, (List) null, 0.0d, 16376, j)}), (String) null, true);
    }

    public final String getId() {
        return "BatteryStatusAndLevel";
    }

    public C12152So0(1Cn r1) {
        this.A00 = r1;
    }
}
