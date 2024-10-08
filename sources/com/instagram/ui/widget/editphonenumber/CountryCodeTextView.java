package com.instagram.ui.widget.editphonenumber;

import X.002;
import X.W6F;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.instagram.phonenumber.model.CountryCodeData;

public class CountryCodeTextView extends TextView {
    public String A00;

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new W6F(85);
        public final String A00;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.A00 = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.A00);
        }

        public SavedState(String str, Parcelable parcelable) {
            super(parcelable);
            this.A00 = str;
        }
    }

    public String getCountryCode() {
        String str = this.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getCountryCodeWithoutPlus() {
        String str = this.A00;
        if (str != null) {
            return str.replace("+", "");
        }
        return "";
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A00 = savedState.A00;
    }

    public void setCountryCodeWithPlus(String str) {
        if (str != null && !str.isEmpty()) {
            if (!str.startsWith("+")) {
                str = 002.A0R("+", str);
            }
            this.A00 = str;
            setText(str);
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        return new SavedState(this.A00, onSaveInstanceState);
    }

    public void setCountryCodeWithCountryPrefix(CountryCodeData countryCodeData) {
        this.A00 = countryCodeData.A00();
        setText(countryCodeData.A02());
    }

    public CountryCodeTextView(Context context) {
        super(context);
    }

    public CountryCodeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setCountryCodeWithPlus(CountryCodeData countryCodeData) {
        setCountryCodeWithPlus(countryCodeData.A00());
    }
}
