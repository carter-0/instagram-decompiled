package com.instagram.reels.question.model;

import X.17P;
import X.1E9;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C44990CoT;
import X.C46161DOo;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.ImmutablePandoQuestionMediaResponseModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import com.instagram.user.model.User;

public final class ImmutablePandoQuestionResponseModel extends 17P implements QuestionResponseModelIntf {
    public static final C3035269k CREATOR = CTA.A00(72);
    public MusicQuestionResponseModelIntf A00;
    public User A01;

    public final QuestionMediaResponseModelIntf BQj() {
        return (QuestionMediaResponseModelIntf) A05(-649955780, ImmutablePandoQuestionMediaResponseModel.class);
    }

    public final MusicQuestionResponseModelIntf BUz() {
        MusicQuestionResponseModelIntf musicQuestionResponseModelIntf = this.A00;
        if (musicQuestionResponseModelIntf == null) {
            return (MusicQuestionResponseModelIntf) A05(493777179, ImmutablePandoMusicQuestionResponseModel.class);
        }
        return musicQuestionResponseModelIntf;
    }

    public final QuestionResponseType Bnr() {
        return (QuestionResponseType) A0M(1676784760, C46161DOo.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.question.model.ImmutablePandoQuestionResponseModel] */
    public final int CA6() {
        return getIntValueByHashCode(3711);
    }

    public final User CCd() {
        User user = this.A01;
        if (user != null) {
            return user;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'user' field.");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.reels.question.model.QuestionResponseModelIntf, com.facebook.pando.TreeJNI, com.instagram.reels.question.model.ImmutablePandoQuestionResponseModel] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44990CoT.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.question.model.ImmutablePandoQuestionResponseModel] */
    public final boolean BC5() {
        return getBooleanValueByHashCode(39923510);
    }

    public final String Bnm() {
        return A0i(-340323263);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.question.model.ImmutablePandoQuestionResponseModel] */
    public final Boolean BrC() {
        return getOptionalBooleanValueByHashCode(3526267);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.question.model.ImmutablePandoQuestionResponseModel] */
    public final Boolean Bu5() {
        return getOptionalBooleanValueByHashCode(-1224792764);
    }

    public final QuestionResponseModelIntf EAQ(1E9 r2) {
        MusicQuestionResponseModelIntf BUz = BUz();
        if (BUz != null) {
            BUz.EAP(r2);
        } else {
            BUz = null;
        }
        this.A00 = BUz;
        this.A01 = C41846B3n.A0c(r2, this, 3599307);
        return this;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.reels.question.model.ImmutablePandoQuestionResponseModel] */
    public final QuestionResponseModel FGP(1E9 r12) {
        QuestionMediaResponseModel questionMediaResponseModel;
        boolean booleanValueByHashCode = getBooleanValueByHashCode(39923510);
        String A0g = A0g();
        QuestionMediaResponseModelIntf BQj = BQj();
        MusicQuestionResponseModel musicQuestionResponseModel = null;
        if (BQj != null) {
            questionMediaResponseModel = BQj.FGS();
        } else {
            questionMediaResponseModel = null;
        }
        MusicQuestionResponseModelIntf BUz = BUz();
        if (BUz != null) {
            musicQuestionResponseModel = BUz.FGO(r12);
        }
        return new QuestionResponseModel(musicQuestionResponseModel, Bnr(), questionMediaResponseModel, C41847B3o.A0r(r12, this, 3599307), getOptionalBooleanValueByHashCode(3526267), getOptionalBooleanValueByHashCode(-1224792764), A0g, A0i(-340323263), getIntValueByHashCode(3711), booleanValueByHashCode);
    }

    public final String getId() {
        return A0g();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.question.model.ImmutablePandoQuestionResponseModel] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
