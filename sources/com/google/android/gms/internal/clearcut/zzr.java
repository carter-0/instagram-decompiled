package com.google.android.gms.internal.clearcut;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C301145yd;
import X.Pxf;
import X.SA1;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(19);
    public final int A00;
    public final String A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzr) {
                zzr zzr = (zzr) obj;
                if (!(SA1.A01(this.A04, zzr.A04) && this.A03 == zzr.A03 && this.A00 == zzr.A00 && SA1.A01(this.A01, zzr.A01) && SA1.A01(this.A05, zzr.A05) && SA1.A01(this.A06, zzr.A06) && this.A07 == zzr.A07 && this.A08 == zzr.A08 && this.A02 == zzr.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, Integer.valueOf(this.A03), Integer.valueOf(this.A00), this.A01, this.A05, this.A06, Boolean.valueOf(this.A07), Boolean.valueOf(this.A08), Integer.valueOf(this.A02)});
    }

    public zzr(String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2) {
        this.A04 = str;
        this.A03 = i;
        this.A00 = i2;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = z;
        this.A01 = str4;
        this.A08 = z2;
        this.A02 = i3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PlayLoggerContext[");
        A1A.append("package=");
        A1A.append(this.A04);
        A1A.append(',');
        A1A.append("packageVersionCode=");
        A1A.append(this.A03);
        A1A.append(',');
        A1A.append("logSource=");
        A1A.append(this.A00);
        A1A.append(',');
        A1A.append("logSourceName=");
        A1A.append(this.A01);
        A1A.append(',');
        A1A.append("uploadAccount=");
        A1A.append(this.A05);
        A1A.append(',');
        A1A.append("loggingId=");
        A1A.append(this.A06);
        A1A.append(',');
        A1A.append("logAndroidId=");
        A1A.append(this.A07);
        A1A.append(',');
        A1A.append("isAnonymous=");
        A1A.append(this.A08);
        A1A.append(',');
        A1A.append("qosTier=");
        A1A.append(this.A02);
        return AnonymousClass7TF.A0l("]", A1A);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0B(parcel, this.A04);
        C301145yd.A07(parcel, 3, this.A03);
        C301145yd.A07(parcel, 4, this.A00);
        C301145yd.A0C(parcel, this.A05, 5, false);
        C301145yd.A0C(parcel, this.A06, 6, false);
        C301145yd.A09(parcel, 7, this.A07);
        C301145yd.A0C(parcel, this.A01, 8, false);
        C301145yd.A09(parcel, 9, this.A08);
        C301145yd.A07(parcel, 10, this.A02);
        C301145yd.A06(parcel, A032);
    }
}
