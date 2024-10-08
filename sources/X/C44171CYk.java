package X;

import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CYk  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44171CYk {
    public static Map A00(AnonymousClass5CX r3) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.BKL() != null) {
            A1H.put("label", r3.BKL());
        }
        if (r3.Bcs() != null) {
            IGAdTransparencyDisclaimerPlacement Bcs = r3.Bcs();
            if (Bcs != null) {
                str = Bcs.A00;
            } else {
                str = null;
            }
            A1H.put("placement", str);
        }
        return 0Yt.A0B(A1H);
    }
}
