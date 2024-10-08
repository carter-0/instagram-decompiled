package X;

import com.instagram.api.schemas.OnboardingEntryPointPriority;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4Z {
    public static Map A00(C245403cq r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.AYX() != null) {
            C41846B3n.A1I(r3.AYX(), A1H);
        }
        if (r3.Bfg() != null) {
            OnboardingEntryPointPriority Bfg = r3.Bfg();
            0qQ.A0B(Bfg, 0);
            A1H.put("priority", Bfg.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
