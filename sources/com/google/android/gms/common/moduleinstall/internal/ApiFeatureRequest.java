package com.google.android.gms.common.moduleinstall.internal;

import X.AnonymousClass3Qk;
import X.C13110TLt;
import X.C301145yd;
import X.Pxf;
import X.Pxh;
import X.Pxi;
import X.SA1;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Comparator;
import java.util.List;

public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Comparator A04 = C13110TLt.A00;
    public static final Parcelable.Creator CREATOR = SWX.A00(36);
    public final List A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        if (this.A03 != apiFeatureRequest.A03 || !SA1.A01(this.A00, apiFeatureRequest.A00) || !SA1.A01(this.A01, apiFeatureRequest.A01)) {
            return false;
        }
        return SA1.A00(this.A02, apiFeatureRequest.A02);
    }

    public final int hashCode() {
        return Pxh.A0A(Boolean.valueOf(this.A03), this.A00, this.A01, this.A02);
    }

    public ApiFeatureRequest(List list, boolean z, String str, String str2) {
        AnonymousClass3Qk.A02(list);
        this.A00 = list;
        this.A03 = z;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0E(parcel, this.A00, 1, false);
        C301145yd.A09(parcel, 2, this.A03);
        C301145yd.A0C(parcel, this.A01, 3, false);
        Pxi.A14(parcel, this.A02, A032, false);
    }
}
