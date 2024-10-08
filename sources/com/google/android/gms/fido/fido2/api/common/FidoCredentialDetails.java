package com.google.android.gms.fido.fido2.api.common;

import X.C301145yd;
import X.C8467QvC;
import X.Pxf;
import X.Pxi;
import X.SA1;
import X.SWX;
import X.TAO;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class FidoCredentialDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(98);
    public final long A00;
    public final TAO A01;
    public final TAO A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final Account A07;
    public final boolean A08;

    public FidoCredentialDetails(Account account, String str, String str2, byte[] bArr, byte[] bArr2, long j, boolean z, boolean z2, boolean z3) {
        C8467QvC A012;
        if (bArr == null) {
            A012 = null;
        } else {
            A012 = TAO.A01(bArr, bArr.length);
        }
        C8467QvC A013 = TAO.A01(bArr2, bArr2.length);
        this.A03 = str;
        this.A04 = str2;
        this.A01 = A012;
        this.A02 = A013;
        this.A05 = z;
        this.A06 = z2;
        this.A00 = j;
        this.A07 = account;
        this.A08 = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        if (!SA1.A01(this.A03, fidoCredentialDetails.A03) || !SA1.A01(this.A04, fidoCredentialDetails.A04) || !SA1.A01(this.A01, fidoCredentialDetails.A01) || !SA1.A01(this.A02, fidoCredentialDetails.A02) || this.A05 != fidoCredentialDetails.A05 || this.A06 != fidoCredentialDetails.A06 || this.A08 != fidoCredentialDetails.A08 || this.A00 != fidoCredentialDetails.A00) {
            return false;
        }
        return SA1.A00(this.A07, fidoCredentialDetails.A07);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A04, this.A01, this.A02, Boolean.valueOf(this.A05), Boolean.valueOf(this.A06), Boolean.valueOf(this.A08), Long.valueOf(this.A00), this.A07});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        boolean A1S = Pxf.A1S(parcel, this.A03);
        C301145yd.A0B(parcel, this.A04);
        C301145yd.A0F(parcel, Pxi.A1b(this.A01), 3, A1S);
        C301145yd.A0F(parcel, this.A02.A03(), 4, A1S);
        C301145yd.A09(parcel, 5, this.A05);
        C301145yd.A09(parcel, 6, this.A06);
        C301145yd.A08(parcel, 7, this.A00);
        C301145yd.A0A(parcel, this.A07, 8, i, A1S);
        C301145yd.A09(parcel, 9, this.A08);
        C301145yd.A06(parcel, A032);
    }
}
