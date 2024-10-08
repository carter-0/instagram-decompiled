package com.instagram.reels.question.model;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.C44990CoT;
import X.C51965G9l;
import X.DbW;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import com.instagram.user.model.User;

public final class QuestionResponseModel extends AnonymousClass0T0 implements Parcelable, QuestionResponseModelIntf {
    public static final Parcelable.Creator CREATOR = new W6F(2);
    public final int A00;
    public final MusicQuestionResponseModel A01;
    public final QuestionResponseType A02;
    public final QuestionMediaResponseModel A03;
    public final User A04;
    public final Boolean A05;
    public final Boolean A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public QuestionResponseModel(MusicQuestionResponseModel musicQuestionResponseModel, QuestionResponseType questionResponseType, QuestionMediaResponseModel questionMediaResponseModel, User user, Boolean bool, Boolean bool2, String str, String str2, int i, boolean z) {
        DbW.A1O(str, 2, questionResponseType);
        0qQ.A0B(user, 10);
        this.A09 = z;
        this.A07 = str;
        this.A03 = questionMediaResponseModel;
        this.A01 = musicQuestionResponseModel;
        this.A08 = str2;
        this.A02 = questionResponseType;
        this.A05 = bool;
        this.A06 = bool2;
        this.A00 = i;
        this.A04 = user;
    }

    public final QuestionResponseModel FGP(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QuestionResponseModel) {
                QuestionResponseModel questionResponseModel = (QuestionResponseModel) obj;
                if (this.A09 != questionResponseModel.A09 || !0qQ.A0K(this.A07, questionResponseModel.A07) || !0qQ.A0K(this.A03, questionResponseModel.A03) || !0qQ.A0K(this.A01, questionResponseModel.A01) || !0qQ.A0K(this.A08, questionResponseModel.A08) || this.A02 != questionResponseModel.A02 || !0qQ.A0K(this.A05, questionResponseModel.A05) || !0qQ.A0K(this.A06, questionResponseModel.A06) || this.A00 != questionResponseModel.A00 || !0qQ.A0K(this.A04, questionResponseModel.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A03, i);
        MusicQuestionResponseModel musicQuestionResponseModel = this.A01;
        if (musicQuestionResponseModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicQuestionResponseModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A02, i);
        C41848B3p.A1I(parcel, this.A05);
        C41848B3p.A1I(parcel, this.A06);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A04, i);
    }

    public final boolean BC5() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ QuestionMediaResponseModelIntf BQj() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ MusicQuestionResponseModelIntf BUz() {
        return this.A01;
    }

    public final String Bnm() {
        return this.A08;
    }

    public final QuestionResponseType Bnr() {
        return this.A02;
    }

    public final Boolean BrC() {
        return this.A05;
    }

    public final Boolean Bu5() {
        return this.A06;
    }

    public final int CA6() {
        return this.A00;
    }

    public final User CCd() {
        return this.A04;
    }

    public final QuestionResponseModelIntf EAQ(1E9 r1) {
        return this;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryQuestionResponderDict", C44990CoT.A00(this));
    }

    public final String getId() {
        return this.A07;
    }

    public final int hashCode() {
        int A052 = C51965G9l.A05(this.A09);
        QuestionResponseType questionResponseType = this.A02;
        return AnonymousClass7TE.A0N(this.A04, (((((AnonymousClass7TF.A07(questionResponseType, (((((AnonymousClass7TF.A08(this.A07, A052) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A06)) * 31) + this.A00) * 31);
    }
}
