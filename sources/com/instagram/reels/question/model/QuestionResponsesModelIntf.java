package com.instagram.reels.question.model;

import X.1E6;
import X.1E9;
import X.D9H;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.user.model.User;
import java.util.List;

public interface QuestionResponsesModelIntf extends Parcelable {
    public static final D9H A00 = D9H.A00;

    Long BLZ();

    String BP8();

    boolean BU8();

    User BiZ();

    String Bid();

    int Bii();

    QuestionStickerType Bin();

    List Bnk();

    int CBD();

    QuestionResponsesModelIntf EAR(1E9 r1);

    QuestionResponsesModel FGQ(1E9 r1);

    QuestionResponsesModel FGR(1E6 r1);

    TreeUpdaterJNI FHC();

    String getBackgroundColor();

    String getQuestion();

    String getTextColor();
}
