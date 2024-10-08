package com.instagram.creation.capture.quickcapture.superlativesticker.model;

import X.0Yt;
import X.0eP;
import X.0qQ;
import X.C16522UwR;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.List;

public final class SuperlativeStickerClientModel implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(36);
    public final C16522UwR A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public SuperlativeStickerClientModel(C16522UwR uwR, String str, String str2, List list, List list2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(uwR, 4);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A00 = uwR;
        this.A04 = list2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        List<SuperlativeMentionSticker> list = this.A03;
        parcel.writeInt(list.size());
        for (SuperlativeMentionSticker writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A00.name());
        List<SuperlativeNotifyToUsers> list2 = this.A04;
        parcel.writeInt(list2.size());
        for (SuperlativeNotifyToUsers writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        SuperlativeStickerClientModel superlativeStickerClientModel = (SuperlativeStickerClientModel) obj;
        0qQ.A0B(superlativeStickerClientModel, 0);
        LinkedHashMap A06 = 0Yt.A06(new 0eP[]{new 0eP(C16522UwR.INTRO, 0), new 0eP(C16522UwR.LOTS_OF_HEART, 1), new 0eP(C16522UwR.MOST_TAGGED, 2), new 0eP(C16522UwR.TOP_CREATOR, 3), new 0eP(C16522UwR.LONGEST_FOLLOWER, 4), new 0eP(C16522UwR.TOP_POST, 5), new 0eP(C16522UwR.END_SUMMARY, 6)});
        C16522UwR uwR = this.A00;
        Number number = (Number) A06.get(uwR);
        if (number == null) {
            return uwR.compareTo(superlativeStickerClientModel.A00);
        }
        int intValue = number.intValue();
        C16522UwR uwR2 = superlativeStickerClientModel.A00;
        Number number2 = (Number) A06.get(uwR2);
        if (number2 != null) {
            return 0qQ.A00(intValue, number2.intValue());
        }
        return uwR2.compareTo(uwR2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SuperlativeStickerClientModel)) {
            return false;
        }
        SuperlativeStickerClientModel superlativeStickerClientModel = (SuperlativeStickerClientModel) obj;
        if (!0qQ.A0K(this.A01, superlativeStickerClientModel.A01) || !0qQ.A0K(this.A02, superlativeStickerClientModel.A02) || !0qQ.A0K(this.A03, superlativeStickerClientModel.A03) || this.A00 != superlativeStickerClientModel.A00 || !0qQ.A0K(this.A04, superlativeStickerClientModel.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode() + this.A02.hashCode() + this.A03.hashCode() + this.A00.hashCode() + this.A04.hashCode();
    }
}
