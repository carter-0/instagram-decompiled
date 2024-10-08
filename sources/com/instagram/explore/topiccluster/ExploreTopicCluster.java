package com.instagram.explore.topiccluster;

import X.0qQ;
import X.1Xj;
import X.AnonymousClass05K;
import X.C296865qm;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;

public final class ExploreTopicCluster implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(6);
    public int A00;
    public C296865qm A01;
    public 1Xj A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;

    public ExploreTopicCluster(C296865qm r3, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, boolean z, boolean z2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        0qQ.A0B(num, 12);
        0qQ.A0B(r3, 13);
        this.A06 = str;
        this.A0A = str2;
        this.A09 = str3;
        this.A02 = null;
        this.A05 = str4;
        this.A00 = i;
        this.A0B = z;
        this.A0C = z2;
        this.A04 = str5;
        this.A07 = str6;
        this.A08 = str7;
        this.A03 = num;
        this.A01 = r3;
        this.A0D = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        switch (this.A03.intValue()) {
            case 1:
                str = "HASHTAG";
                break;
            case 2:
                str = "HASHTAG_INSPIRED";
                break;
            case 3:
                str = "MAP";
                break;
            case 4:
                str = "NEARBY";
                break;
            case 5:
                str = "POPULAR_REELS";
                break;
            case 6:
                str = "SHOPPING";
                break;
            case 7:
                str = "TRENDING";
                break;
            case 8:
                str = "INTEREST_KEYWORD";
                break;
            case 9:
                str = "TOPIC";
                break;
            case 10:
                str = "UNKNOWN";
                break;
            default:
                str = "EXPLORE_ALL";
                break;
        }
        parcel.writeString(str);
        parcel.writeString(this.A01.name());
        parcel.writeInt(this.A0D);
    }

    public final Integer A00() {
        Integer num = this.A03;
        if (num != AnonymousClass05K.A1F || this.A01 == C296865qm.NOT_A_TOPIC) {
            return num;
        }
        return AnonymousClass05K.A1I;
    }

    public ExploreTopicCluster() {
        this(C296865qm.NOT_A_TOPIC, AnonymousClass05K.A02, "", "", "", (String) null, (String) null, (String) null, (String) null, 0, 0, false, false);
    }
}
