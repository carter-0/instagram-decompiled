package X;

import com.instagram.api.schemas.StoryTextAttributionType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CfD  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44455CfD {
    public static Map A00(DTS dts) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dts.AdA() != null) {
            StoryTextAttributionType AdA = dts.AdA();
            0qQ.A0B(AdA, 0);
            A1H.put(AnonymousClass000.A00(514), AdA.A00);
        }
        if (dts.Agp() != null) {
            List<C46263DSs> Agp = dts.Agp();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C46263DSs dSs : Agp) {
                if (dSs != null) {
                    A1C.add(dSs.FHC());
                }
            }
            A1H.put("bold_ranges", A1C);
        }
        if (dts.getText() != null) {
            C41845B3m.A10(dts.getText(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
