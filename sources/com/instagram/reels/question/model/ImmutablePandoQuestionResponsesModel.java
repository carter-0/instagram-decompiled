package com.instagram.reels.question.model;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;
import X.C44992CoV;
import X.C46162DOp;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoQuestionResponsesModel extends 17P implements QuestionResponsesModelIntf {
    public static final C3035269k CREATOR = CTA.A00(73);
    public User A00;
    public List A01;

    public final User BiZ() {
        return this.A00;
    }

    public final QuestionStickerType Bin() {
        return (QuestionStickerType) A0M(-1030321165, C46162DOp.A00);
    }

    public final List Bnk() {
        List list = this.A01;
        if (list == null) {
            return A0o(-633584463, ImmutablePandoQuestionResponseModel.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.question.model.ImmutablePandoQuestionResponsesModel, com.instagram.reels.question.model.QuestionResponsesModelIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44992CoV.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final Long BLZ() {
        return A0L(739279658);
    }

    public final String BP8() {
        return A0j(-1081138730);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.question.model.ImmutablePandoQuestionResponsesModel] */
    public final boolean BU8() {
        return getBooleanValueByHashCode(1024940639);
    }

    public final String Bid() {
        return A0k(964289556);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.question.model.ImmutablePandoQuestionResponsesModel] */
    public final int Bii() {
        return getIntValueByHashCode(1781202186);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.question.model.ImmutablePandoQuestionResponsesModel] */
    public final int CBD() {
        return getIntValueByHashCode(14453882);
    }

    public final QuestionResponsesModelIntf EAR(1E9 r4) {
        this.A00 = C41848B3p.A1B(r4, this, 1451283460);
        List<QuestionResponseModelIntf> Bnk = Bnk();
        ArrayList A0r = AnonymousClass7TG.A0r(Bnk);
        for (QuestionResponseModelIntf questionResponseModelIntf : Bnk) {
            questionResponseModelIntf.EAQ(r4);
            A0r.add(questionResponseModelIntf);
        }
        this.A01 = A0r;
        return this;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.question.model.ImmutablePandoQuestionResponsesModel, X.17P] */
    public final QuestionResponsesModel FGQ(1E9 r15) {
        User user;
        User A0b;
        String A0h = A0h(2036780306);
        Long A0L = A0L(739279658);
        String A0j = A0j(-1081138730);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1024940639);
        String A0h2 = A0h(-1165870106);
        ImmutablePandoUserDict A0Z = C41845B3m.A0Z(this, 1451283460);
        if (A0Z == null || (A0b = C41845B3m.A0b(r15, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r15, A0b);
        }
        String A0k = A0k(964289556);
        int intValueByHashCode = getIntValueByHashCode(1781202186);
        QuestionStickerType Bin = Bin();
        List<QuestionResponseModelIntf> Bnk = Bnk();
        ArrayList A0r = AnonymousClass7TG.A0r(Bnk);
        for (QuestionResponseModelIntf FGP : Bnk) {
            A0r.add(FGP.FGP(r15));
        }
        return new QuestionResponsesModel(Bin, user, A0L, A0h, A0j, A0h2, A0k, A0h(-2115337775), A0r, intValueByHashCode, getIntValueByHashCode(14453882), booleanValueByHashCode);
    }

    public final QuestionResponsesModel FGR(1E6 r2) {
        return FGQ(C41847B3o.A0q(r2));
    }

    public final String getBackgroundColor() {
        return A0h(2036780306);
    }

    public final String getQuestion() {
        return A0h(-1165870106);
    }

    public final String getTextColor() {
        return A0h(-2115337775);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.reels.question.model.ImmutablePandoQuestionResponsesModel] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
