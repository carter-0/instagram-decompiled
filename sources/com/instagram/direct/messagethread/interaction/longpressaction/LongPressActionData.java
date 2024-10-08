package com.instagram.direct.messagethread.interaction.longpressaction;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C51971G9r;
import X.C51974G9v;
import X.C69376NkG;
import X.LIt;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class LongPressActionData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(87);
    public final LongPressActionLabelSpan A00;
    public final C69376NkG A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LongPressActionData) {
                LongPressActionData longPressActionData = (LongPressActionData) obj;
                if (this.A03 != longPressActionData.A03 || !0qQ.A0K(this.A04, longPressActionData.A04) || !0qQ.A0K(this.A02, longPressActionData.A02) || this.A01 != longPressActionData.A01 || !0qQ.A0K(this.A00, longPressActionData.A00) || !0qQ.A0K(this.A05, longPressActionData.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(LIt.A01(this.A03));
        parcel.writeString(this.A04);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        AnonymousClass7TE.A1T(parcel, this.A01);
        LongPressActionLabelSpan longPressActionLabelSpan = this.A00;
        if (longPressActionLabelSpan == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            longPressActionLabelSpan.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        Integer num = this.A03;
        int A0D = C51971G9r.A0D(num, LIt.A01(num)) * 31;
        return ((AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A08(this.A04, A0D) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A05);
    }

    public LongPressActionData(LongPressActionLabelSpan longPressActionLabelSpan, C69376NkG nkG, Integer num, Integer num2, String str, String str2) {
        C51974G9v.A1L(num, str, nkG);
        this.A03 = num;
        this.A04 = str;
        this.A02 = num2;
        this.A01 = nkG;
        this.A00 = longPressActionLabelSpan;
        this.A05 = str2;
    }
}
