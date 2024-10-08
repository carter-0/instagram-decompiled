package X;

import com.instagram.api.schemas.StoryTrendingPromptSubType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CfL  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44463CfL {
    public static Map A00(C46264DSt dSt) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str = null;
        if (dSt.BQX() != null) {
            List<C46265DSu> BQX = dSt.BQX();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C46265DSu dSu : BQX) {
                if (dSu != null) {
                    A1C.add(dSu.FHC());
                }
            }
            A1H.put(AnonymousClass000.A00(1579), A1C);
        }
        if (dSt.Bht() != null) {
            StoryTrendingPromptSubType Bht = dSt.Bht();
            if (Bht != null) {
                str = Bht.A00;
            }
            A1H.put(AnonymousClass000.A00(1728), str);
        }
        return 0Yt.A0B(A1H);
    }
}
