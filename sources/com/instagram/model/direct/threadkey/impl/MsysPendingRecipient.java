package com.instagram.model.direct.threadkey.impl;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass170;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C317986oA;
import X.C41847B3o;
import X.C71269Ogb;
import X.DbS;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;

public final class MsysPendingRecipient extends AnonymousClass0T0 implements Parcelable, AnonymousClass170 {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(47);
    public final int A00;
    public final long A01;
    public final ImageUrl A02;
    public final FollowStatus A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final long A0I;
    public final boolean A0J;

    public final boolean CQp(C317986oA r2) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MsysPendingRecipient) {
                MsysPendingRecipient msysPendingRecipient = (MsysPendingRecipient) obj;
                if (!(0qQ.A0K(this.A07, msysPendingRecipient.A07) && this.A0I == msysPendingRecipient.A0I && this.A00 == msysPendingRecipient.A00 && 0qQ.A0K(this.A09, msysPendingRecipient.A09) && 0qQ.A0K(this.A05, msysPendingRecipient.A05) && 0qQ.A0K(this.A08, msysPendingRecipient.A08) && 0qQ.A0K(this.A06, msysPendingRecipient.A06) && 0qQ.A0K(this.A02, msysPendingRecipient.A02) && this.A03 == msysPendingRecipient.A03 && this.A0H == msysPendingRecipient.A0H && this.A0B == msysPendingRecipient.A0B && this.A0G == msysPendingRecipient.A0G && this.A0A == msysPendingRecipient.A0A && this.A0F == msysPendingRecipient.A0F && this.A0C == msysPendingRecipient.A0C && 0qQ.A0K(this.A04, msysPendingRecipient.A04) && this.A0D == msysPendingRecipient.A0D && this.A0E == msysPendingRecipient.A0E)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeLong(this.A0I);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(C41847B3o.A00(parcel, this.A04));
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
    }

    public final FollowStatus B6o() {
        return this.A03;
    }

    public final String B8Q() {
        return this.A06;
    }

    public final int BIW() {
        return this.A00;
    }

    public final Long BST() {
        return Long.valueOf(this.A01);
    }

    public final ImageUrl Bh3() {
        return this.A02;
    }

    public final Integer Bjj() {
        return this.A04;
    }

    public final boolean COa() {
        return this.A0J;
    }

    public final boolean CPV() {
        return this.A0A;
    }

    public final boolean CPm() {
        return this.A0B;
    }

    public final boolean CXO() {
        return this.A0D;
    }

    public final boolean CXR() {
        return this.A0E;
    }

    public final boolean Cdl() {
        return this.A0G;
    }

    public final String getFullName() {
        return this.A05;
    }

    public final String getId() {
        return this.A07;
    }

    public final String getShortName() {
        return this.A08;
    }

    public final String getUsername() {
        return this.A09;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A07);
        String str = this.A09;
        int A092 = AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0H, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A06, (((AnonymousClass7TF.A08(str, (AnonymousClass7TF.A01(this.A0I, A0O) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31))))))));
        return DbS.A06(this.A0E, AnonymousClass7TF.A09(this.A0D, (AnonymousClass7TF.A09(this.A0C, A092) + AnonymousClass7TE.A0L(this.A04)) * 31));
    }

    public final boolean isConnected() {
        return this.A0C;
    }

    public final boolean isRestricted() {
        return this.A0F;
    }

    public final boolean isVerified() {
        return this.A0H;
    }

    public MsysPendingRecipient(ImageUrl imageUrl, FollowStatus followStatus, Integer num, String str, String str2, String str3, String str4, String str5, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        AnonymousClass7TF.A1D(str, 1, str2);
        0qQ.A0B(str5, 7);
        AnonymousClass7TF.A1G(imageUrl, 8, followStatus);
        this.A07 = str;
        this.A0I = j;
        this.A00 = i;
        this.A09 = str2;
        this.A05 = str3;
        this.A08 = str4;
        this.A06 = str5;
        this.A02 = imageUrl;
        this.A03 = followStatus;
        this.A0H = z;
        this.A0B = z2;
        this.A0G = z3;
        this.A0A = z4;
        this.A0F = z5;
        this.A0C = z6;
        this.A04 = num;
        this.A0D = z7;
        this.A0E = z8;
        this.A01 = j;
        this.A0J = AnonymousClass7TF.A1S(i, 2);
    }
}
