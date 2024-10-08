package com.google.android.gms.auth;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.SA1;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(21);
    public final int A00;
    public final String A01;
    public final Long A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.A01, tokenData.A01) || !SA1.A01(this.A02, tokenData.A02) || this.A05 != tokenData.A05 || this.A06 != tokenData.A06 || !SA1.A01(this.A04, tokenData.A04)) {
            return false;
        }
        return SA1.A00(this.A03, tokenData.A03);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, Boolean.valueOf(this.A05), Boolean.valueOf(this.A06), this.A04, this.A03});
    }

    public TokenData(Long l, String str, String str2, List list, int i, boolean z, boolean z2) {
        this.A00 = i;
        AnonymousClass3Qk.A04(str);
        this.A01 = str;
        this.A02 = l;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = list;
        this.A03 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A0B(parcel, this.A01);
        Long l = this.A02;
        if (l != null) {
            parcel.writeInt(524291);
            Pxf.A18(parcel, l);
        }
        C301145yd.A09(parcel, 4, this.A05);
        C301145yd.A09(parcel, 5, this.A06);
        C301145yd.A0D(parcel, this.A04, 6);
        C301145yd.A0C(parcel, this.A03, 7, false);
        C301145yd.A06(parcel, A032);
    }
}
