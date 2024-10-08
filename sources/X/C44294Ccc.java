package X;

import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ccc  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44294Ccc {
    public static Map A00(C46321DUy dUy) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dUy.getBackgroundColor() != null) {
            A1H.put("background_color", dUy.getBackgroundColor());
        }
        if (dUy.CQE() != null) {
            A1H.put(C273654mx.A00(314), dUy.CQE());
        }
        if (dUy.getMediaId() != null) {
            C41845B3m.A13(dUy.getMediaId(), A1H);
        }
        if (dUy.getProfilePicUrl() != null) {
            A1H.put("profile_pic_url", dUy.getProfilePicUrl());
        }
        if (dUy.getQuestion() != null) {
            A1H.put("question", dUy.getQuestion());
        }
        if (dUy.Bid() != null) {
            A1H.put("question_id", dUy.Bid());
        }
        if (dUy.Bij() != null) {
            A1H.put("question_response_count", dUy.Bij());
        }
        ArrayList arrayList = null;
        if (dUy.Bin() != null) {
            QuestionStickerType Bin = dUy.Bin();
            if (Bin != null) {
                str = Bin.A00;
            } else {
                str = null;
            }
            A1H.put("question_type", str);
        }
        if (dUy.Bns() != null) {
            List<QuestionResponseType> Bns = dUy.Bns();
            if (Bns != null) {
                arrayList = AnonymousClass7TG.A0r(Bns);
                for (QuestionResponseType questionResponseType : Bns) {
                    0qQ.A0B(questionResponseType, 0);
                    arrayList.add(questionResponseType.A00);
                }
            }
            A1H.put(AnonymousClass000.A00(5191), arrayList);
        }
        if (dUy.getTextColor() != null) {
            A1H.put("text_color", dUy.getTextColor());
        }
        if (dUy.CEv() != null) {
            A1H.put("viewer_can_interact", dUy.CEv());
        }
        return 0Yt.A0B(A1H);
    }
}
