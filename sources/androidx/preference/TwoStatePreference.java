package androidx.preference;

import X.0qQ;
import X.0xa;
import X.C7216Pzk;
import X.DbX;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.facebook.quickpromotion.sdk.devtool.QPCheckBoxPreference;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;

public abstract class TwoStatePreference extends Preference {
    public CharSequence A00;
    public CharSequence A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = C7216Pzk.A00(62);
        public boolean A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00 ? 1 : 0);
        }
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

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N(android.view.View r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0021
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r3.A02
            r2 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.CharSequence r0 = r3.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0022
            java.lang.CharSequence r1 = r3.A01
        L_0x0015:
            r4.setText(r1)
        L_0x0018:
            int r0 = r4.getVisibility()
            if (r2 == r0) goto L_0x0021
            r4.setVisibility(r2)
        L_0x0021:
            return
        L_0x0022:
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0031
            java.lang.CharSequence r0 = r3.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0031
            java.lang.CharSequence r1 = r3.A00
            goto L_0x0015
        L_0x0031:
            java.lang.CharSequence r1 = r3.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0015
            r2 = 8
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.A0N(android.view.View):void");
    }

    public final void A0O(boolean z) {
        boolean z2 = true;
        if (this.A02 == z) {
            z2 = false;
            if (this.A04) {
                return;
            }
        }
        this.A02 = z;
        this.A04 = true;
        if (this instanceof QPCheckBoxPreference) {
            QPCheckBoxPreference qPCheckBoxPreference = (QPCheckBoxPreference) this;
            if (qPCheckBoxPreference.A0L()) {
                IGDevToolPersistentStateHandler iGDevToolPersistentStateHandler = qPCheckBoxPreference.A00;
                String str = qPCheckBoxPreference.A0G;
                0qQ.A07(str);
                IGDevToolPersistentStateHandler iGDevToolPersistentStateHandler2 = iGDevToolPersistentStateHandler;
                synchronized (iGDevToolPersistentStateHandler2) {
                    DbX.A1V((0xa) iGDevToolPersistentStateHandler2.A02.getValue(), str, z);
                }
            }
        } else if (A0L() && z != A0M(!z)) {
            SharedPreferences.Editor edit = this.A0B.A00().edit();
            edit.putBoolean(this.A0G, z);
            edit.apply();
        }
        if (z2) {
            A0I(A0K());
            A04();
        }
    }
}
