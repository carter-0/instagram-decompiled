package com.instagram.reels.question.model;

import X.1E9;
import X.D9G;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import com.instagram.user.model.User;

public interface QuestionResponseModelIntf extends Parcelable {
    public static final D9G A00 = D9G.A00;

    boolean BC5();

    QuestionMediaResponseModelIntf BQj();

    MusicQuestionResponseModelIntf BUz();

    String Bnm();

    QuestionResponseType Bnr();

    Boolean BrC();

    Boolean Bu5();

    int CA6();

    User CCd();

    QuestionResponseModelIntf EAQ(1E9 r1);

    QuestionResponseModel FGP(1E9 r1);

    TreeUpdaterJNI FHC();

    String getId();
}
