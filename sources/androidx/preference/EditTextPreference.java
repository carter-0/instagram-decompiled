package androidx.preference;

import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;

public class EditTextPreference extends DialogPreference {
    public String A00;

    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = C7216Pzk.A00(56);
        public String A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.A00);
        }
    }

    public final void A0A(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.A0A(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.A0A(savedState.getSuperState());
        String str = savedState.A00;
        boolean A0K = A0K();
        this.A00 = str;
        A0G(str);
        boolean A0K2 = A0K();
        if (A0K2 != A0K) {
            A0I(A0K2);
        }
        A04();
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.WEQ, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r1 = 2130969333(0x7f0402f5, float:1.7547345E38)
            r0 = 16842898(0x1010092, float:2.3693967E-38)
            int r1 = X.C18666VwO.A00(r4, r1, r0)
            r2 = 0
            r3.<init>(r4, r5, r1)
            int[] r0 = X.C17166VKv.A03
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r5, r0, r1, r2)
            boolean r0 = r1.getBoolean(r2, r2)
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 == 0) goto L_0x002e
            X.WEQ r0 = X.WEQ.A00
            if (r0 != 0) goto L_0x0029
            X.WEQ r0 = new X.WEQ
            r0.<init>()
            X.WEQ.A00 = r0
        L_0x0029:
            r3.A09 = r0
            r3.A04()
        L_0x002e:
            r1.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
