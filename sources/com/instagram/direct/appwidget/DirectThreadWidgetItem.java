package com.instagram.direct.appwidget;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.DbS;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class DirectThreadWidgetItem extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(60);
    public boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectThreadWidgetItem) {
                DirectThreadWidgetItem directThreadWidgetItem = (DirectThreadWidgetItem) obj;
                if (!0qQ.A0K(this.A04, directThreadWidgetItem.A04) || !0qQ.A0K(this.A05, directThreadWidgetItem.A05) || !0qQ.A0K(this.A03, directThreadWidgetItem.A03) || !0qQ.A0K(this.A01, directThreadWidgetItem.A01) || !0qQ.A0K(this.A02, directThreadWidgetItem.A02) || this.A00 != directThreadWidgetItem.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A05, AnonymousClass7TG.A0E(this.A04) * 31);
        return DbS.A06(this.A00, (((AnonymousClass7TF.A08(this.A03, A08) + AnonymousClass7TG.A0E(this.A01)) * 31) + C41845B3m.A00(this.A02)) * 31);
    }

    public DirectThreadWidgetItem(String str, String str2, String str3, String str4, String str5, boolean z) {
        AnonymousClass7TG.A1Q(str2, str3);
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A01 = str4;
        this.A02 = str5;
        this.A00 = z;
    }
}
