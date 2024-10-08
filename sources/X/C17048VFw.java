package X;

import android.content.Context;
import android.graphics.Color;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.reels.question.model.QuestionResponsesModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;

/* renamed from: X.VFw  reason: case insensitive filesystem */
public abstract class C17048VFw {
    public static final void A00(AnonymousClass0iw r10, UserSession userSession, C17801VgE vgE, C20961X6o x6o, UDA uda, Integer num, int i) {
        Integer num2;
        0qQ.A0B(uda, 0);
        C51974G9v.A0d(3, x6o, userSession, num, r10);
        C14901UEg uEg = uda.A02;
        QuestionResponsesModel questionResponsesModel = vgE.A01;
        0qQ.A0B(questionResponsesModel, 0);
        Color.parseColor(questionResponsesModel.A09);
        C17047VFv.A00(vgE, x6o, uEg, num, i);
        if (vgE.A00.A03 == null) {
            uda.A01.setVisibility(8);
            return;
        }
        Context A07 = DbS.A07(uda);
        int dimensionPixelSize = A07.getResources().getDimensionPixelSize(R.dimen.intent_aware_ad_rifu_card_large_width);
        QuestionMediaResponseModel questionMediaResponseModel = vgE.A00.A03;
        0qQ.A0C(questionMediaResponseModel, "null cannot be cast to non-null type com.instagram.reels.questionv2.model.QuestionMediaResponseModel");
        Integer num3 = questionMediaResponseModel.A04;
        int i2 = 1iA.A0a.A00;
        if (num3 != null && num3.intValue() == i2) {
            uda.A00.setVisibility(0);
        }
        ImageInfo imageInfo = questionMediaResponseModel.A00;
        if (imageInfo != null) {
            Integer num4 = questionMediaResponseModel.A06;
            if (num4 != null) {
                int intValue = num4.intValue();
                Integer num5 = questionMediaResponseModel.A05;
                if (num5 != null) {
                    int intValue2 = num5.intValue();
                    if (intValue2 <= 0 || intValue <= 0 || intValue != intValue2) {
                        num2 = AnonymousClass05K.A01;
                    } else {
                        num2 = AnonymousClass05K.A0C;
                    }
                    ExtendedImageUrl A05 = 1iI.A05(imageInfo, num2, dimensionPixelSize);
                    C252063oV r0 = uda.A01;
                    if (A05 != null) {
                        r0.setVisibility(0);
                        ((IgProgressImageView) r0.getView().requireViewById(R.id.question_response_card_media_preview)).setUrl(A05, r10);
                        uEg.A0E.setBackgroundResource(R.drawable.question_response_media_card_outline);
                        DbT.A17(A07, uEg.A08, 2Yu.A0A(A07));
                        return;
                    }
                    r0.setVisibility(8);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
