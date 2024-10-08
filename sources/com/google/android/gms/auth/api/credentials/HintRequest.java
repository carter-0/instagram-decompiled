package com.google.android.gms.auth.api.credentials;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(88);
    public final int A00;
    public final CredentialPickerConfig A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final String[] A06;
    public final boolean A07;

    public HintRequest(CredentialPickerConfig credentialPickerConfig, String str, String str2, String[] strArr, int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        AnonymousClass3Qk.A02(credentialPickerConfig);
        this.A01 = credentialPickerConfig;
        this.A04 = z;
        this.A07 = z2;
        AnonymousClass3Qk.A02(strArr);
        this.A06 = strArr;
        if (i < 2) {
            this.A05 = true;
            return;
        }
        this.A05 = z3;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0A(parcel, this.A01, 1, i, false);
        C301145yd.A09(parcel, 2, this.A04);
        C301145yd.A09(parcel, 3, this.A07);
        C301145yd.A0H(parcel, this.A06, 4);
        C301145yd.A09(parcel, 5, this.A05);
        C301145yd.A0C(parcel, this.A02, 6, false);
        C301145yd.A0C(parcel, this.A03, 7, false);
        Pxf.A17(parcel, this.A00, A032);
    }
}
