package com.instagram.reels.questionv2.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44995CoY;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpritesheetInfo;
import java.util.Iterator;
import java.util.List;

public final class QuestionMediaResponseModel extends AnonymousClass0T0 implements Parcelable, QuestionMediaResponseModelIntf {
    public static final Parcelable.Creator CREATOR = new W6F(5);
    public final ImageInfo A00;
    public final SpritesheetInfo A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;

    public final QuestionMediaResponseModel FGS() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QuestionMediaResponseModel) {
                QuestionMediaResponseModel questionMediaResponseModel = (QuestionMediaResponseModel) obj;
                if (!0qQ.A0K(this.A02, questionMediaResponseModel.A02) || !0qQ.A0K(this.A07, questionMediaResponseModel.A07) || !0qQ.A0K(this.A00, questionMediaResponseModel.A00) || !0qQ.A0K(this.A03, questionMediaResponseModel.A03) || !0qQ.A0K(this.A04, questionMediaResponseModel.A04) || !0qQ.A0K(this.A05, questionMediaResponseModel.A05) || !0qQ.A0K(this.A06, questionMediaResponseModel.A06) || !0qQ.A0K(this.A01, questionMediaResponseModel.A01) || !0qQ.A0K(this.A08, questionMediaResponseModel.A08) || !0qQ.A0K(this.A09, questionMediaResponseModel.A09) || !0qQ.A0K(this.A0A, questionMediaResponseModel.A0A) || !0qQ.A0K(this.A0B, questionMediaResponseModel.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        C41848B3p.A1I(parcel, this.A02);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A00, i);
        AnonymousClass7TG.A16(parcel, this.A03, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A04, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A05, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A06, 0, 1);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        List list = this.A0B;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A1G = C41848B3p.A1G(parcel, list);
        while (A1G.hasNext()) {
            C41847B3o.A1I(parcel, A1G, i);
        }
    }

    public final Boolean BAZ() {
        return this.A02;
    }

    public final ImageInfo BGO() {
        return this.A00;
    }

    public final Integer BR8() {
        return this.A04;
    }

    public final Integer BZ3() {
        return this.A05;
    }

    public final Integer BZH() {
        return this.A06;
    }

    public final SpritesheetInfo C78() {
        return this.A01;
    }

    public final String CEE() {
        return this.A0A;
    }

    public final List CEY() {
        return this.A0B;
    }

    public final Integer CRC() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryQuestionMediaResponseDict", C44995CoY.A00(this));
    }

    public final String getId() {
        return this.A07;
    }

    public final String getVideoCodec() {
        return this.A08;
    }

    public final String getVideoDashManifest() {
        return this.A09;
    }

    public final int hashCode() {
        return (((((((((((((((((((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TE.A0L(this.A0B);
    }

    public QuestionMediaResponseModel(ImageInfo imageInfo, SpritesheetInfo spritesheetInfo, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, List list) {
        this.A02 = bool;
        this.A07 = str;
        this.A00 = imageInfo;
        this.A03 = num;
        this.A04 = num2;
        this.A05 = num3;
        this.A06 = num4;
        this.A01 = spritesheetInfo;
        this.A08 = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A0B = list;
    }
}
