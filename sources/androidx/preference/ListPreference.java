package androidx.preference;

import X.C13991Tnr;
import X.C17166VKv;
import X.C18666VwO;
import X.C20873X1z;
import X.C7216Pzk;
import X.WER;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import com.instagram.android.R;

public class ListPreference extends DialogPreference {
    public String A00;
    public CharSequence[] A01;
    public CharSequence[] A02;
    public String A03;
    public boolean A04;

    /* JADX WARNING: type inference failed for: r0v14, types: [X.WER, java.lang.Object] */
    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17166VKv.A04, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.A01 = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.A02 = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            WER wer = WER.A00;
            WER wer2 = wer;
            if (wer == null) {
                ? obj = new Object();
                WER.A00 = obj;
                wer2 = obj;
            }
            this.A09 = wer2;
            A04();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C17166VKv.A06, i, 0);
        this.A03 = C13991Tnr.A0c(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = C7216Pzk.A00(57);
        public String A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.A00);
        }
    }

    public final CharSequence A03() {
        C20873X1z x1z = this.A09;
        if (x1z != null) {
            return x1z.E54(this);
        }
        Object A0N = A0N();
        CharSequence A032 = super.A03();
        String str = this.A03;
        if (str != null) {
            if (A0N == null) {
                A0N = "";
            }
            String format = String.format(str, new Object[]{A0N});
            if (!TextUtils.equals(format, A032)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return A032;
    }

    public final void A0A(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.A0A(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.A0A(savedState.getSuperState());
        A0O(savedState.A00);
    }

    public final CharSequence A0N() {
        CharSequence[] charSequenceArr;
        String str = this.A00;
        if (str == null || (charSequenceArr = this.A02) == null) {
            return null;
        }
        int length = charSequenceArr.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
        } while (!TextUtils.equals(charSequenceArr[length].toString(), str));
        CharSequence[] charSequenceArr2 = this.A01;
        if (charSequenceArr2 != null) {
            return charSequenceArr2[length];
        }
        return null;
    }

    public final void A0O(String str) {
        boolean z = !TextUtils.equals(this.A00, str);
        if (z || !this.A04) {
            this.A00 = str;
            this.A04 = true;
            A0G(str);
            if (z) {
                A04();
            }
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C18666VwO.A00(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
