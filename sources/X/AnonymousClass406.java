package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.Collections;
import java.util.List;

/* renamed from: X.406  reason: invalid class name */
public final class AnonymousClass406 implements C258943zt {
    public final AnonymousClass40G ATg(OdinContext odinContext) {
        long j;
        C255463uA[] r0 = FeatureData.A0E;
        Type type = Type.LONG;
        int ordinal = C64031Cc.A09.ordinal();
        if (ordinal == 0) {
            j = 0;
        } else if (ordinal == 1) {
            j = 1;
        } else if (ordinal != 2) {
            j = -1;
        } else {
            j = 2;
        }
        List singletonList = Collections.singletonList(new FeatureData(type, "3699", (String) null, (List) null, 0.0d, 16376, j));
        0qQ.A07(singletonList);
        return new AnonymousClass40G(singletonList, (String) null, true);
    }

    public final String getId() {
        return "AppStartType";
    }
}
