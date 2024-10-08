package X;

import com.instagram.model.showreel.IgShowreelCompositionImpl;
import java.io.IOException;

/* renamed from: X.5xM  reason: invalid class name and case insensitive filesystem */
public abstract class C300535xM {
    public static C257613xg parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            IgShowreelCompositionImpl igShowreelCompositionImpl = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            BGP bgp = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("showreel_composition".equals(A0q)) {
                    igShowreelCompositionImpl = AnonymousClass4iY.parseFromJson(r4);
                } else if ("showreel_native_animation".equals(A0q)) {
                    bgp = C44352CdY.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new C257613xg(bgp, igShowreelCompositionImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
