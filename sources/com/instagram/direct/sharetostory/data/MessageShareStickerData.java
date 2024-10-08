package com.instagram.direct.sharetostory.data;

import X.0qQ;
import X.2FW;
import X.AnonymousClass7TE;
import X.C51973G9u;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.capabilities.Capabilities;

public final class MessageShareStickerData extends ShareToStoryStickerData {
    public static final Parcelable.Creator CREATOR = new W6E(12);
    public int A00;
    public int A01;
    public IGAIAgentType A02;
    public ImageUrl A03;
    public Capabilities A04;
    public 2FW A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A07);
        2FW r1 = this.A05;
        if (r1 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AnonymousClass7TE.A1T(parcel, r1);
        }
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0F);
    }

    public MessageShareStickerData(IGAIAgentType iGAIAgentType, ImageUrl imageUrl, Capabilities capabilities, 2FW r5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C51973G9u.A0v(10, str4, str6, str7);
        0qQ.A0B(capabilities, 17);
        this.A00 = imageUrl;
        this.A0C = str;
        this.A0E = str2;
        this.A0D = str3;
        this.A00 = i;
        this.A03 = imageUrl;
        this.A01 = i2;
        this.A0I = z;
        this.A0K = z2;
        this.A0J = z3;
        this.A09 = str4;
        this.A0G = z4;
        this.A02 = iGAIAgentType;
        this.A07 = str5;
        this.A05 = r5;
        this.A0A = str6;
        this.A08 = str7;
        this.A04 = capabilities;
        this.A06 = str8;
        this.A0H = z5;
        this.A0B = str9;
        this.A0F = str10;
    }
}
