package X;

import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.QuestionResponseModelIntf;
import com.instagram.reels.question.model.QuestionResponsesModelIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CoV  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44992CoV {
    public static Map A00(QuestionResponsesModelIntf questionResponsesModelIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (questionResponsesModelIntf.getBackgroundColor() != null) {
            A1H.put("background_color", questionResponsesModelIntf.getBackgroundColor());
        }
        if (questionResponsesModelIntf.BLZ() != null) {
            A1H.put("latest_question_response_time", questionResponsesModelIntf.BLZ());
        }
        if (questionResponsesModelIntf.BP8() != null) {
            A1H.put("max_id", questionResponsesModelIntf.BP8());
        }
        questionResponsesModelIntf.BU8();
        A1H.put("more_available", Boolean.valueOf(questionResponsesModelIntf.BU8()));
        if (questionResponsesModelIntf.getQuestion() != null) {
            A1H.put("question", questionResponsesModelIntf.getQuestion());
        }
        User BiZ = questionResponsesModelIntf.BiZ();
        if (BiZ != null) {
            A1H.put("question_author", BiZ.A08());
        }
        if (questionResponsesModelIntf.Bid() != null) {
            A1H.put("question_id", questionResponsesModelIntf.Bid());
        }
        questionResponsesModelIntf.Bii();
        A1H.put("question_response_count", Integer.valueOf(questionResponsesModelIntf.Bii()));
        if (questionResponsesModelIntf.Bin() != null) {
            QuestionStickerType Bin = questionResponsesModelIntf.Bin();
            0qQ.A0B(Bin, 0);
            A1H.put("question_type", Bin.A00);
        }
        if (questionResponsesModelIntf.Bnk() != null) {
            List<QuestionResponseModelIntf> Bnk = questionResponsesModelIntf.Bnk();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (QuestionResponseModelIntf questionResponseModelIntf : Bnk) {
                if (questionResponseModelIntf != null) {
                    A1C.add(questionResponseModelIntf.FHC());
                }
            }
            A1H.put("responders", A1C);
        }
        if (questionResponsesModelIntf.getTextColor() != null) {
            A1H.put("text_color", questionResponsesModelIntf.getTextColor());
        }
        questionResponsesModelIntf.CBD();
        return C41845B3m.A0u("unanswered_response_count", Integer.valueOf(questionResponsesModelIntf.CBD()), A1H);
    }
}
