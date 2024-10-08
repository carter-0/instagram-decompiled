package com.instagram.guides.intf;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.EZL;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.guides.intf.model.MinimalGuide;
import com.instagram.guides.intf.model.MinimalGuideItem;

public final class GuideFragmentConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(65);
    public final EZL A00;
    public final GuideCreationLoggerState A01;
    public final MinimalGuide A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final MinimalGuideItem[] A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        switch (this.A03.intValue()) {
            case 0:
                str = "CREATION";
                break;
            case 1:
                str = "DRAFT";
                break;
            case 2:
                str = "PREVIEW";
                break;
            case 3:
                str = "EDIT_ONLY";
                break;
            case 4:
                str = "VIEW_EDIT";
                break;
            default:
                str = "SHARE";
                break;
        }
        parcel.writeString(str);
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeParcelable(this.A02, i);
        MinimalGuideItem[] minimalGuideItemArr = this.A06;
        if (minimalGuideItemArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            int length = minimalGuideItemArr.length;
            parcel.writeInt(length);
            for (int i2 = 0; i2 != length; i2++) {
                parcel.writeParcelable(minimalGuideItemArr[i2], i);
            }
        }
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        GuideCreationLoggerState guideCreationLoggerState = this.A01;
        if (guideCreationLoggerState == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        guideCreationLoggerState.writeToParcel(parcel, i);
    }

    public GuideFragmentConfig(EZL ezl, GuideCreationLoggerState guideCreationLoggerState, MinimalGuide minimalGuide, Integer num, String str, String str2, MinimalGuideItem[] minimalGuideItemArr) {
        AnonymousClass7TG.A1U(num, ezl, minimalGuide);
        this.A03 = num;
        this.A00 = ezl;
        this.A02 = minimalGuide;
        this.A06 = minimalGuideItemArr;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = guideCreationLoggerState;
    }
}
