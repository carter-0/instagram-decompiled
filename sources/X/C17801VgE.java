package X;

import android.graphics.Color;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponsesModel;

/* renamed from: X.VgE  reason: case insensitive filesystem */
public final class C17801VgE {
    public QuestionResponseModel A00;
    public final QuestionResponsesModel A01;

    public final int A00() {
        QuestionResponsesModel questionResponsesModel = this.A01;
        0qQ.A0B(questionResponsesModel, 0);
        return Color.parseColor(questionResponsesModel.A05);
    }

    public C17801VgE(QuestionResponseModel questionResponseModel, QuestionResponsesModel questionResponsesModel) {
        this.A01 = questionResponsesModel;
        this.A00 = questionResponseModel;
    }
}
