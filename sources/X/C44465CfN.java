package X;

import com.instagram.api.schemas.StoryTrendingPromptMediaSubType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CfN  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44465CfN {
    public static Map A00(C46265DSu dSu) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dSu.getMediaId() != null) {
            C41845B3m.A13(dSu.getMediaId(), A1H);
        }
        if (dSu.BQy() != null) {
            StoryTrendingPromptMediaSubType BQy = dSu.BQy();
            0qQ.A0B(BQy, 0);
            A1H.put(AnonymousClass000.A00(1584), BQy.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
