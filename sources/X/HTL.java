package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class HTL {
    public static Map A00(JSA jsa) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (jsa.Bg6() != null) {
            List<JSF> Bg6 = jsa.Bg6();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (JSF jsf : Bg6) {
                if (jsf != null) {
                    A1C.add(jsf.FHC());
                }
            }
            A1H.put("product_enum_info_text_list", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
