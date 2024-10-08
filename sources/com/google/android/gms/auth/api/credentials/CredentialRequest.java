package com.google.android.gms.auth.api.credentials;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(87);
    public final int A00;
    public final CredentialPickerConfig A01;
    public final CredentialPickerConfig A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final String[] A07;
    public final boolean A08;

    public CredentialRequest(CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, String str, String str2, String[] strArr, int i, boolean z, boolean z2, boolean z3) {
        CredentialPickerConfig credentialPickerConfig3 = credentialPickerConfig2;
        CredentialPickerConfig credentialPickerConfig4 = credentialPickerConfig;
        int i2 = i;
        this.A00 = i2;
        this.A05 = z;
        String[] strArr2 = strArr;
        AnonymousClass3Qk.A02(strArr2);
        this.A07 = strArr2;
        this.A01 = credentialPickerConfig == null ? new CredentialPickerConfig(2, 1, false, true, false) : credentialPickerConfig4;
        this.A02 = credentialPickerConfig2 == null ? new CredentialPickerConfig(2, 1, false, true, false) : credentialPickerConfig3;
        if (i2 < 3) {
            this.A06 = true;
        } else {
            this.A06 = z2;
            this.A03 = str;
            this.A04 = str2;
        }
        this.A08 = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A09(parcel, 1, this.A05);
        C301145yd.A0H(parcel, this.A07, 2);
        C301145yd.A0A(parcel, this.A01, 3, i, false);
        C301145yd.A0A(parcel, this.A02, 4, i, false);
        C301145yd.A09(parcel, 5, this.A06);
        C301145yd.A0C(parcel, this.A03, 6, false);
        C301145yd.A0C(parcel, this.A04, 7, false);
        C301145yd.A09(parcel, 8, this.A08);
        Pxf.A17(parcel, this.A00, A032);
    }
}
