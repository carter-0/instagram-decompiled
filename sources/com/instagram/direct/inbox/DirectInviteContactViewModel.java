package com.instagram.direct.inbox;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C232262tL;
import X.C41845B3m;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.DirectSearchResult;

public final class DirectInviteContactViewModel extends AnonymousClass0T0 implements C232262tL, Parcelable, DirectSearchResult {
    public static final Parcelable.Creator CREATOR = new LVP(76);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final String A06;
    public final String A07;

    public final String AEB() {
        return "Failed to show contact to invite";
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectInviteContactViewModel) {
                DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) obj;
                if (!(this.A02 == directInviteContactViewModel.A02 && 0qQ.A0K(this.A07, directInviteContactViewModel.A07) && 0qQ.A0K(this.A06, directInviteContactViewModel.A06) && this.A01 == directInviteContactViewModel.A01 && this.A00 == directInviteContactViewModel.A00 && this.A03 == directInviteContactViewModel.A03 && this.A04 == directInviteContactViewModel.A04 && this.A05 == directInviteContactViewModel.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
    }

    public final int hashCode() {
        return (((((((((((((this.A02 * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + C41845B3m.A00(this.A06)) * 31) + this.A01) * 31) + this.A00) * 31) + this.A03) * 31) + this.A04) * 31) + this.A05;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) obj;
        0qQ.A0B(directInviteContactViewModel, 0);
        return 0qQ.A0K(this.A06, directInviteContactViewModel.A06);
    }

    public DirectInviteContactViewModel(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A02 = i;
        this.A07 = str;
        this.A06 = str2;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = i6;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass7TG.A0j();
    }
}
