package com.facebookpay.form.cell.label.paymentmethod;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.label.LabelCellParams;
import java.util.Iterator;
import java.util.List;

public final class PaymentMethodLabelCellParams extends LabelCellParams {
    public static final Parcelable.Creator CREATOR = SWV.A00(69);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final List A05;

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        Iterator A1F = C41848B3p.A1F(parcel, this.A05);
        while (A1F.hasNext()) {
            parcel.writeInt(AnonymousClass7TG.A0F(A1F));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PaymentMethodLabelCellParams(java.util.List r3, int r4, int r5, int r6, int r7, int r8) {
        /*
            r2 = this;
            X.QfI r1 = new X.QfI
            r1.<init>(r4)
            r1.A03 = r5
            r1.A02 = r8
            r0 = 1
            r1.A07 = r0
            r2.<init>((X.C8028QfI) r1)
            r2.A01 = r4
            r2.A03 = r5
            r2.A04 = r6
            r2.A00 = r7
            r2.A02 = r8
            r2.A05 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams.<init>(java.util.List, int, int, int, int, int):void");
    }
}
