package com.facebookpay.common.models;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C10576RuV;
import X.C8911RFe;
import X.C8937RGf;
import X.C9620Rdy;
import X.Pxj;
import X.SWZ;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

public final class ErrorDialogContent implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(82);
    public final C10576RuV A00;
    public final C10576RuV A01;
    public final Integer A02;
    public final Integer A03;
    public final C8911RFe A04;
    public final C8911RFe A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;

    public final String A02(Context context) {
        0qQ.A0B(context, 0);
        String str = this.A08;
        if (str != null) {
            return str;
        }
        Integer num = this.A06;
        if (num != null) {
            return AnonymousClass7TE.A16(context, num.intValue());
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String A03(Context context) {
        0qQ.A0B(context, 0);
        C10576RuV ruV = this.A00;
        if (ruV != null) {
            return ruV.A01;
        }
        C8911RFe rFe = this.A04;
        if (rFe != null) {
            int i = rFe.A00;
            if (Integer.valueOf(i) != null) {
                return AnonymousClass7TE.A16(context, i);
            }
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String A05(Context context) {
        0qQ.A0B(context, 0);
        String str = this.A09;
        if (str != null) {
            return str;
        }
        Integer num = this.A07;
        if (num != null) {
            return AnonymousClass7TE.A16(context, num.intValue());
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A01);
        AnonymousClass7TG.A16(parcel, this.A07, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A06, 0, 1);
        Pxj.A1A(parcel, this.A04);
        Pxj.A1A(parcel, this.A05);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(C9620Rdy.A00(num));
    }

    public final C8937RGf A00() {
        C8937RGf rGf;
        C10576RuV ruV = this.A00;
        if (ruV != null) {
            return ruV.A00;
        }
        C8911RFe rFe = this.A04;
        if (rFe != null && (rGf = rFe.A01) != null) {
            return rGf;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final C8937RGf A01() {
        C10576RuV ruV = this.A01;
        if (ruV != null) {
            return ruV.A00;
        }
        C8911RFe rFe = this.A05;
        if (rFe != null) {
            return rFe.A01;
        }
        return null;
    }

    public final String A04(Context context) {
        C10576RuV ruV = this.A01;
        if (ruV != null) {
            return ruV.A01;
        }
        C8911RFe rFe = this.A05;
        if (rFe == null) {
            return null;
        }
        int i = rFe.A00;
        if (Integer.valueOf(i) != null) {
            return context.getString(i);
        }
        return null;
    }

    public final boolean A06() {
        C8937RGf rGf;
        C10576RuV ruV = this.A00;
        if (ruV != null) {
            rGf = ruV.A00;
        } else {
            rGf = null;
        }
        if (rGf == C8937RGf.DISMISS_AND_CLOSE || this.A04 == C8911RFe.A05) {
            return true;
        }
        return false;
    }

    public ErrorDialogContent(C8911RFe rFe, C8911RFe rFe2, C10576RuV ruV, C10576RuV ruV2, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2) {
        this.A09 = str;
        this.A08 = str2;
        this.A00 = ruV;
        this.A01 = ruV2;
        this.A07 = num;
        this.A06 = num2;
        this.A04 = rFe;
        this.A05 = rFe2;
        this.A02 = num3;
        this.A03 = num4;
    }

    public ErrorDialogContent() {
        this((C8911RFe) null, (C8911RFe) null, (C10576RuV) null, (C10576RuV) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null);
    }
}
