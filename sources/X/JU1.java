package X;

import com.instagram.feed.media.EffectActionSheetIntf;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class JU1 {
    public static Map A00(EffectActionSheetIntf effectActionSheetIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (effectActionSheetIntf.BfN() != null) {
            A1H.put("primary_actions", effectActionSheetIntf.BfN());
        }
        if (effectActionSheetIntf.BqS() != null) {
            A1H.put("secondary_actions", effectActionSheetIntf.BqS());
        }
        return 0Yt.A0B(A1H);
    }
}
