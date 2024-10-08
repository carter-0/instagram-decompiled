package com.google.android.gms.auth.api.identity;

import X.C301145yd;
import X.Pxf;
import X.SA1;
import X.SWX;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(0);
    public final PendingIntent A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final int A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = this.A03;
        int size = list.size();
        List list2 = saveAccountLinkingTokenRequest.A03;
        if (size != list2.size() || !list.containsAll(list2) || !SA1.A01(this.A00, saveAccountLinkingTokenRequest.A00) || !SA1.A01(this.A01, saveAccountLinkingTokenRequest.A01) || !SA1.A01(this.A02, saveAccountLinkingTokenRequest.A02) || !SA1.A01(this.A05, saveAccountLinkingTokenRequest.A05) || this.A04 != saveAccountLinkingTokenRequest.A04) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A0C(this.A00, this.A01, this.A02, this.A03, this.A05);
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, String str3, List list, int i) {
        this.A00 = pendingIntent;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A05 = str3;
        this.A04 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0A(parcel, this.A00, 1, i, false);
        C301145yd.A0B(parcel, this.A01);
        C301145yd.A0C(parcel, this.A02, 3, false);
        C301145yd.A0D(parcel, this.A03, 4);
        C301145yd.A0C(parcel, this.A05, 5, false);
        C301145yd.A07(parcel, 6, this.A04);
        C301145yd.A06(parcel, A032);
    }
}
