package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.List;

public final class AT5 implements C258943zt {
    public final AnonymousClass94P A00;

    public AT5(AnonymousClass94P r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        double d;
        C255463uA[] r0 = FeatureData.A0E;
        C60400gq r2 = this.A00.A00;
        if (r2 != null) {
            d = r2.Ayd(37168702814945762L);
        } else {
            d = 0.0d;
        }
        return new AnonymousClass40G(AnonymousClass7TE.A1I(new FeatureData((Type) null, "111", (String) null, (List) null, d, 16374, 0)), (String) null, true);
    }

    public final String getId() {
        return "AdsDwellThreshold";
    }
}
