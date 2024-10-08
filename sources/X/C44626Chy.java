package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Chy  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44626Chy {
    public static Map A00(C279544yo r4) {
        TreeUpdaterJNI FHC;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r4.C5F() != null) {
            List<C248923io> C5F = r4.C5F();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C248923io r0 : C5F) {
                if (!(r0 == null || (FHC = r0.FHC()) == null)) {
                    A1C.add(FHC);
                }
            }
            A1H.put("text_info_list", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
