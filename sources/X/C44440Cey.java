package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cey  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44440Cey {
    public static Map A00(C46316DUt dUt) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUt.getBackgroundColor() != null) {
            A1H.put("background_color", dUt.getBackgroundColor());
        }
        if (dUt.getEmoji() != null) {
            A1H.put("emoji", dUt.getEmoji());
        }
        if (dUt.CVh() != null) {
            A1H.put("is_interactive_music_sticker", dUt.CVh());
        }
        if (dUt.getQuestion() != null) {
            A1H.put("question", dUt.getQuestion());
        }
        if (dUt.getSliderId() != null) {
            A1H.put("slider_id", dUt.getSliderId());
        }
        if (dUt.Bwr() != null) {
            A1H.put("slider_vote_average", AnonymousClass7TH.A0D(dUt.Bwr()));
        }
        if (dUt.Bws() != null) {
            A1H.put("slider_vote_count", dUt.Bws());
        }
        if (dUt.getTextColor() != null) {
            A1H.put("text_color", dUt.getTextColor());
        }
        if (dUt.CEx() != null) {
            A1H.put("viewer_can_vote", dUt.CEx());
        }
        if (dUt.CFH() != null) {
            A1H.put("viewer_vote", AnonymousClass7TH.A0D(dUt.CFH()));
        }
        return 0Yt.A0B(A1H);
    }
}
