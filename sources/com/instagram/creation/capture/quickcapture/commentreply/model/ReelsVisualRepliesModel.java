package com.instagram.creation.capture.quickcapture.commentreply.model;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass6MU;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C273914nO;
import X.C317876nz;
import X.DbS;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.user.model.User;

public final class ReelsVisualRepliesModel extends AnonymousClass6MU implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(18);
    public MediaVCRTappableData A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReelsVisualRepliesModel) {
                ReelsVisualRepliesModel reelsVisualRepliesModel = (ReelsVisualRepliesModel) obj;
                if (!0qQ.A0K(this.A00, reelsVisualRepliesModel.A00) || this.A01 != reelsVisualRepliesModel.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final ReelsVisualRepliesModel A00(String str, String str2) {
        MediaVCRTappableData mediaVCRTappableData = this.A00;
        MediaVCRTappableData mediaVCRTappableData2 = null;
        if (mediaVCRTappableData != null) {
            boolean z = mediaVCRTappableData.A0A;
            Float f = mediaVCRTappableData.A01;
            User user = mediaVCRTappableData.A00;
            String str3 = mediaVCRTappableData.A04;
            String str4 = mediaVCRTappableData.A05;
            String str5 = mediaVCRTappableData.A06;
            String str6 = mediaVCRTappableData.A07;
            Float f2 = mediaVCRTappableData.A02;
            String str7 = mediaVCRTappableData.A09;
            AnonymousClass7TH.A0K();
            mediaVCRTappableData2 = new MediaVCRTappableData(user, f, f2, str2, str3, str4, str5, str6, str, str7, z);
        }
        return new ReelsVisualRepliesModel(mediaVCRTappableData2, false);
    }

    public final void A01(Float f) {
        MediaVCRTappableData mediaVCRTappableData;
        MediaVCRTappableData mediaVCRTappableData2 = this.A00;
        if (mediaVCRTappableData2 != null) {
            boolean z = mediaVCRTappableData2.A0A;
            String str = mediaVCRTappableData2.A03;
            User user = mediaVCRTappableData2.A00;
            String str2 = mediaVCRTappableData2.A04;
            String str3 = mediaVCRTappableData2.A05;
            String str4 = mediaVCRTappableData2.A06;
            String str5 = mediaVCRTappableData2.A07;
            String str6 = mediaVCRTappableData2.A08;
            Float f2 = mediaVCRTappableData2.A02;
            String str7 = mediaVCRTappableData2.A09;
            AnonymousClass7TH.A0K();
            mediaVCRTappableData = new MediaVCRTappableData(user, f, f2, str, str2, str3, str4, str5, str6, str7, z);
        } else {
            mediaVCRTappableData = null;
        }
        this.A00 = mediaVCRTappableData;
    }

    public final void A02(Float f) {
        MediaVCRTappableData mediaVCRTappableData;
        MediaVCRTappableData mediaVCRTappableData2 = this.A00;
        if (mediaVCRTappableData2 != null) {
            boolean z = mediaVCRTappableData2.A0A;
            String str = mediaVCRTappableData2.A03;
            Float f2 = mediaVCRTappableData2.A01;
            User user = mediaVCRTappableData2.A00;
            String str2 = mediaVCRTappableData2.A04;
            String str3 = mediaVCRTappableData2.A05;
            String str4 = mediaVCRTappableData2.A06;
            String str5 = mediaVCRTappableData2.A07;
            String str6 = mediaVCRTappableData2.A08;
            String str7 = mediaVCRTappableData2.A09;
            AnonymousClass7TH.A0K();
            mediaVCRTappableData = new MediaVCRTappableData(user, f2, f, str, str2, str3, str4, str5, str6, str7, z);
        } else {
            mediaVCRTappableData = null;
        }
        this.A00 = mediaVCRTappableData;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A0f;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
    }

    public ReelsVisualRepliesModel(MediaVCRTappableData mediaVCRTappableData, boolean z) {
        this.A00 = mediaVCRTappableData;
        this.A01 = z;
    }

    public final C273914nO BkW() {
        C273914nO A0C = AnonymousClass7TH.A0C();
        AnonymousClass7TG.A1J(C317876nz.A1L, A0C);
        return A0C;
    }

    public ReelsVisualRepliesModel() {
        this((MediaVCRTappableData) null, false);
    }
}
