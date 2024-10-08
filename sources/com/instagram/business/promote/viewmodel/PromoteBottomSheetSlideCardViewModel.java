package com.instagram.business.promote.viewmodel;

import X.0qQ;
import X.AnonymousClass00P;
import X.C16678UzE;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;

public final class PromoteBottomSheetSlideCardViewModel implements Parcelable {
    public static final W6D CREATOR = new W6D(60);
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public C16678UzE A02;
    public CharSequence A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A07);
        TextUtils.writeToParcel(this.A03, parcel, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        C16678UzE uzE = this.A02;
        if (uzE != null) {
            parcel.writeString(uzE.toString());
            String str2 = this.A06;
            if (str2 != null) {
                parcel.writeString(str2);
                return;
            }
            str = "promoteComponentValue";
        } else {
            str = "promoteScreen";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public PromoteBottomSheetSlideCardViewModel(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, C16678UzE uzE, CharSequence charSequence, String str, String str2, String str3, String str4) {
        this.A07 = str;
        this.A03 = charSequence;
        this.A02 = uzE;
        this.A06 = str4;
        this.A04 = str2;
        this.A05 = str3;
        this.A00 = onClickListener;
        this.A01 = onClickListener2;
    }

    public PromoteBottomSheetSlideCardViewModel() {
    }
}
