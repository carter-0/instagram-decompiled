package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CfF  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44457CfF {
    public static Map A00(DSP dsp) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dsp.AdE() != null) {
            List<DTS> AdE = dsp.AdE();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (DTS dts : AdE) {
                if (dts != null) {
                    A1C.add(dts.FHC());
                }
            }
            A1H.put("attributions", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
