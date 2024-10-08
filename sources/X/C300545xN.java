package X;

import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreel.IgShowreelCompositionImpl;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import java.io.IOException;

/* renamed from: X.5xN  reason: invalid class name and case insensitive filesystem */
public abstract class C300545xN {
    public static C257633xi parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            IgShowreelCompositionImpl igShowreelCompositionImpl = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            IgShowreelNativeAnimation igShowreelNativeAnimation = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("showreel_composition".equals(A0q)) {
                    igShowreelCompositionImpl = AnonymousClass4iY.parseFromJson(r4);
                } else if ("showreel_native_animation".equals(A0q)) {
                    igShowreelNativeAnimation = AnonymousClass5HA.parseFromJson(r4);
                }
                r4.A0z();
            }
            return new C257633xi(igShowreelCompositionImpl, igShowreelNativeAnimation);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, C257633xi r3) {
        r2.A0c();
        IgShowreelComposition igShowreelComposition = r3.A00;
        if (igShowreelComposition != null) {
            r2.A0q("showreel_composition");
            AnonymousClass4iY.A00(r2, igShowreelComposition.FFx());
        }
        IgShowreelNativeAnimation igShowreelNativeAnimation = r3.A01;
        if (igShowreelNativeAnimation != null) {
            r2.A0q("showreel_native_animation");
            AnonymousClass5HA.A00(r2, igShowreelNativeAnimation);
        }
        r2.A0Z();
    }
}
