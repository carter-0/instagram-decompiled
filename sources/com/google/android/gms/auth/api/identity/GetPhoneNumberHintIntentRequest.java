package com.google.android.gms.auth.api.identity;

import X.AnonymousClass7TF;
import X.C301145yd;
import X.Pxf;
import X.SA1;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class GetPhoneNumberHintIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(94);
    public final int A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetPhoneNumberHintIntentRequest)) {
            return false;
        }
        return SA1.A01(Integer.valueOf(this.A00), Integer.valueOf(((GetPhoneNumberHintIntentRequest) obj).A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(AnonymousClass7TF.A1b(this.A00));
    }

    public GetPhoneNumberHintIntentRequest(int i) {
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A00);
        C301145yd.A06(parcel, A03);
    }
}
