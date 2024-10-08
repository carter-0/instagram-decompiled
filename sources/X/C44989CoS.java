package X;

import com.instagram.reels.question.model.MusicQuestionResponseModelIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CoS  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44989CoS {
    public static Map A00(MusicQuestionResponseModelIntf musicQuestionResponseModelIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (musicQuestionResponseModelIntf.BUk() != null) {
            A1H.put("music_asset_info", musicQuestionResponseModelIntf.BUk().FHC());
        }
        if (musicQuestionResponseModelIntf.BUp() != null) {
            A1H.put("music_consumption_info", musicQuestionResponseModelIntf.BUp().FHC());
        }
        return 0Yt.A0B(A1H);
    }
}
