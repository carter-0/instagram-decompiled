package com.instagram.reels.question.model;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.C44992CoV;
import X.C51969G9p;
import X.DbW;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

public final class QuestionResponsesModel extends AnonymousClass0T0 implements QuestionResponsesModelIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(4);
    public final int A00;
    public final int A01;
    public final QuestionStickerType A02;
    public final User A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final boolean A0B;

    public QuestionResponsesModel(QuestionStickerType questionStickerType, User user, Long l, String str, String str2, String str3, String str4, String str5, List list, int i, int i2, boolean z) {
        DbW.A1N(str, 1, str3);
        0qQ.A0B(str4, 7);
        C51969G9p.A1N(questionStickerType, 9, list);
        0qQ.A0B(str5, 11);
        this.A05 = str;
        this.A04 = l;
        this.A06 = str2;
        this.A0B = z;
        this.A07 = str3;
        this.A03 = user;
        this.A08 = str4;
        this.A00 = i;
        this.A02 = questionStickerType;
        this.A0A = list;
        this.A09 = str5;
        this.A01 = i2;
    }

    public final QuestionResponsesModel FGQ(1E9 r1) {
        return this;
    }

    public final QuestionResponsesModel FGR(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QuestionResponsesModel) {
                QuestionResponsesModel questionResponsesModel = (QuestionResponsesModel) obj;
                if (!0qQ.A0K(this.A05, questionResponsesModel.A05) || !0qQ.A0K(this.A04, questionResponsesModel.A04) || !0qQ.A0K(this.A06, questionResponsesModel.A06) || this.A0B != questionResponsesModel.A0B || !0qQ.A0K(this.A07, questionResponsesModel.A07) || !0qQ.A0K(this.A03, questionResponsesModel.A03) || !0qQ.A0K(this.A08, questionResponsesModel.A08) || this.A00 != questionResponsesModel.A00 || this.A02 != questionResponsesModel.A02 || !0qQ.A0K(this.A0A, questionResponsesModel.A0A) || !0qQ.A0K(this.A09, questionResponsesModel.A09) || this.A01 != questionResponsesModel.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A05);
        AnonymousClass7TG.A15(parcel, this.A04);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        Iterator A1F = C41848B3p.A1F(parcel, this.A0A);
        while (A1F.hasNext()) {
            ((QuestionResponseModel) A1F.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A09);
        parcel.writeInt(this.A01);
    }

    public final Long BLZ() {
        return this.A04;
    }

    public final String BP8() {
        return this.A06;
    }

    public final boolean BU8() {
        return this.A0B;
    }

    public final User BiZ() {
        return this.A03;
    }

    public final String Bid() {
        return this.A08;
    }

    public final int Bii() {
        return this.A00;
    }

    public final QuestionStickerType Bin() {
        return this.A02;
    }

    public final List Bnk() {
        return this.A0A;
    }

    public final int CBD() {
        return this.A01;
    }

    public final QuestionResponsesModelIntf EAR(1E9 r1) {
        return this;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryQuestionResponderInfoDict", C44992CoV.A00(this));
    }

    public final String getBackgroundColor() {
        return this.A05;
    }

    public final String getQuestion() {
        return this.A07;
    }

    public final String getTextColor() {
        return this.A09;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0B, (((AnonymousClass7TE.A0O(this.A05) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31);
        String str = this.A08;
        return AnonymousClass7TF.A08(this.A09, AnonymousClass7TF.A07(this.A0A, AnonymousClass7TF.A07(this.A02, (AnonymousClass7TF.A08(str, (AnonymousClass7TF.A08(this.A07, A092) + AnonymousClass7TE.A0L(this.A03)) * 31) + this.A00) * 31))) + this.A01;
    }
}
