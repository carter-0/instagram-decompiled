package androidx.preference;

import X.C7216Pzk;
import X.Pxf;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference {
    public Set A00 = new HashSet();
    public CharSequence[] A01;
    public CharSequence[] A02;

    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = C7216Pzk.A00(58);
        public Set A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00.size());
            Set set = this.A00;
            parcel.writeStringArray(Pxf.A1b(set, set.size()));
        }
    }

    public final void A0A(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.A0A(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.A0A(savedState.getSuperState());
        A0N(savedState.A00);
    }

    public final void A0N(Set set) {
        Set set2 = this.A00;
        set2.clear();
        set2.addAll(set);
        if (A0L()) {
            Set<String> set3 = null;
            if (A0L()) {
                set3 = this.A0B.A00().getStringSet(this.A0G, (Set) null);
            }
            if (!set.equals(set3)) {
                SharedPreferences.Editor edit = this.A0B.A00().edit();
                edit.putStringSet(this.A0G, set);
                edit.apply();
            }
        }
        A04();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r1 = 2130969250(0x7f0402a2, float:1.7547177E38)
            r0 = 16842897(0x1010091, float:2.3693964E-38)
            int r2 = X.C18666VwO.A00(r4, r1, r0)
            r1 = 0
            r3.<init>(r4, r5, r2)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.A00 = r0
            int[] r0 = X.C17166VKv.A05
            android.content.res.TypedArray r2 = r4.obtainStyledAttributes(r5, r0, r2, r1)
            r0 = 2
            java.lang.CharSequence[] r0 = r2.getTextArray(r0)
            if (r0 != 0) goto L_0x0026
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
        L_0x0026:
            r3.A01 = r0
            r0 = 3
            r1 = 1
            java.lang.CharSequence[] r0 = r2.getTextArray(r0)
            if (r0 != 0) goto L_0x0034
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
        L_0x0034:
            r3.A02 = r0
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
