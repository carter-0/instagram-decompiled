package com.instagram.reels.question.model;

import X.0qQ;
import X.A7J;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.user.model.User;

public final class QuestionResponseReshareModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(3);
    public final int A00;
    public final MusicQuestionResponseModel A01;
    public final A7J A02;
    public final QuestionResponseType A03;
    public final QuestionMediaResponseModel A04;
    public final User A05;
    public final User A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.A7J, java.lang.Object] */
    public QuestionResponseReshareModel(MusicQuestionResponseModel musicQuestionResponseModel, QuestionResponseType questionResponseType, QuestionMediaResponseModel questionMediaResponseModel, User user, User user2, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        AnonymousClass7TG.A0w(2, str, str2, str3);
        AnonymousClass7TF.A1G(questionResponseType, 5, str5);
        this.A00 = i;
        this.A0A = str;
        this.A0C = str2;
        this.A07 = str3;
        this.A03 = questionResponseType;
        this.A08 = str4;
        this.A01 = musicQuestionResponseModel;
        this.A04 = questionMediaResponseModel;
        this.A0B = str5;
        this.A09 = z;
        this.A05 = user;
        this.A06 = user2;
        Boolean valueOf = Boolean.valueOf(z);
        ? obj = new Object();
        obj.A02 = str;
        obj.A04 = str2;
        obj.A03 = str5;
        obj.A01 = valueOf;
        obj.A00 = questionResponseType;
        this.A02 = obj;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A08);
        MusicQuestionResponseModel musicQuestionResponseModel = this.A01;
        if (musicQuestionResponseModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicQuestionResponseModel.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A06, i);
    }
}
