package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.List;

/* renamed from: X.Snz  reason: case insensitive filesystem */
public final class C12151Snz implements C258943zt {
    public final String getId() {
        return "NetworkStatus";
    }

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        long j;
        long j2;
        0qV A04 = C61970qY.A04();
        C255463uA[] r0 = FeatureData.A0E;
        Type type = Type.LONG;
        int intValue = A04.A01.intValue();
        if (intValue == 0) {
            j = 0;
        } else if (intValue == 2) {
            j = 1;
        } else if (intValue == 1) {
            j = 2;
        } else if (intValue == 3) {
            j = 3;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        FeatureData featureData = new FeatureData(type, "3369", (String) null, (List) null, 0.0d, 16376, j);
        switch (A04.A00.intValue()) {
            case 1:
                j2 = 1;
                break;
            case 2:
                j2 = 2;
                break;
            case 3:
                j2 = 3;
                break;
            case 4:
                j2 = -1;
                break;
            default:
                j2 = 4;
                break;
        }
        return new AnonymousClass40G(0sr.A1P(new FeatureData[]{featureData, new FeatureData(type, "3757", (String) null, (List) null, 0.0d, 16376, j2)}), (String) null, true);
    }
}
