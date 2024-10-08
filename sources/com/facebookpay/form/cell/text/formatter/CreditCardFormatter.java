package com.facebookpay.form.cell.text.formatter;

import X.0pe;
import X.0qQ;
import X.0sC;
import X.C8946RGo;
import X.SWV;
import X.U2Z;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;

public final class CreditCardFormatter implements TextFormatter {
    public static final Parcelable.Creator CREATOR = SWV.A00(77);
    public int A00;
    public int A01;
    public boolean A02;

    public final void afterTextChanged(Editable editable) {
        int[] iArr;
        0qQ.A0B(editable, 0);
        if (!this.A02) {
            this.A02 = true;
            0sC A002 = 0pe.A00(editable.getSpans(0, editable.length(), U2Z.class));
            while (A002.hasNext()) {
                editable.removeSpan(A002.next());
            }
            C8946RGo A022 = C8946RGo.A06.A02(editable.toString());
            if (editable.length() > A022.A00) {
                int i = this.A01;
                editable.delete(i, this.A00 + i);
            }
            if (A022 == C8946RGo.AMERICAN_EXPRESS) {
                iArr = C8946RGo.A07;
            } else {
                iArr = C8946RGo.A08;
            }
            int length = editable.length();
            for (int i2 : iArr) {
                if (i2 <= length) {
                    editable.setSpan(new U2Z(" "), i2 - 1, i2, 33);
                }
            }
            this.A02 = false;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i3;
    }
}
