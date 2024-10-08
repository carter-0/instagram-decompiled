package com.instagram.model.direct;

import X.0qQ;
import X.C51973G9u;
import X.C66580MXl;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collection;
import java.util.Iterator;

public final class DirectMessageSearchMessage implements DirectSearchResult {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(32);
    public long A00;
    public long A01;
    public long A02;
    public ImmutableList A03;
    public ImmutableList A04;
    public ImageUrl A05;
    public ImageUrl A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public DirectMessageSearchMessage(ImmutableList immutableList, ImmutableList immutableList2, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, String str4, String str5, long j, long j2, long j3) {
        0qQ.A0B(str3, 3);
        C51973G9u.A0u(7, str4, immutableList, immutableList2);
        this.A07 = str;
        this.A08 = str2;
        this.A0B = str3;
        this.A05 = imageUrl;
        this.A06 = imageUrl2;
        this.A02 = j;
        this.A09 = str4;
        this.A0A = str5;
        this.A03 = immutableList;
        this.A04 = immutableList2;
        this.A01 = j2;
        this.A00 = j3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeList(this.A03);
        parcel.writeList(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public final boolean A00() {
        ImmutableList immutableList = this.A04;
        if ((immutableList instanceof Collection) && immutableList.isEmpty()) {
            return false;
        }
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            PendingRecipient A0k = C66580MXl.A0k(it);
            0qQ.A0A(A0k);
            if (A0k.A02 == 1) {
                return true;
            }
        }
        return false;
    }

    public final String AEB() {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("| %-30s | name: %-50s | thread id: %-60s|", "DirectMessageSearchMessage", this.A0B, this.A09);
        0qQ.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }
}
