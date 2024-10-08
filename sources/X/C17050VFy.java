package X;

import android.graphics.Color;
import android.widget.TextView;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponsesModel;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;

/* renamed from: X.VFy  reason: case insensitive filesystem */
public abstract class C17050VFy {
    public static void A00(C17801VgE vgE, C20961X6o x6o, UDB udb, Integer num, int i) {
        int i2;
        vgE.A00();
        C19477WaP.A00(DbS.A07(udb));
        C14901UEg uEg = udb.A02;
        if (vgE.A00.A02 != QuestionResponseType.MUSIC) {
            QuestionResponsesModel questionResponsesModel = vgE.A01;
            0qQ.A0B(questionResponsesModel, 0);
            Color.parseColor(questionResponsesModel.A09);
        }
        C17047VFv.A00(vgE, x6o, uEg, num, i);
        QuestionResponseModel questionResponseModel = vgE.A00;
        if (questionResponseModel.A02.ordinal() != 3) {
            i2 = -16777216;
        } else {
            i2 = udb.A00;
        }
        TextView textView = udb.A01;
        String str = questionResponseModel.A08;
        if (str == null) {
            str = "";
        }
        textView.setText(str, TextView.BufferType.SPANNABLE);
        0nA.A0q(textView, new C20241Wng(textView, i2));
    }
}
