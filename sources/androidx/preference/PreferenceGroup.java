package androidx.preference;

import X.002;
import X.01r;
import X.AnonymousClass7TF;
import X.C13990Tnq;
import X.C17166VKv;
import X.C19910Whf;
import X.C51968G9o;
import X.C7216Pzk;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.List;

public abstract class PreferenceGroup extends Preference {
    public int A00;
    public boolean A01;
    public boolean A02;
    public int A03;
    public final Handler A04;
    public final 01r A05;
    public final Runnable A06;
    public final List A07;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = new 01r(0);
        this.A04 = AnonymousClass7TF.A0D();
        this.A02 = true;
        this.A03 = 0;
        this.A01 = false;
        this.A00 = Integer.MAX_VALUE;
        this.A06 = new C19910Whf(this);
        this.A07 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17166VKv.A08, i, 0);
        this.A02 = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i2 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i2 != Integer.MAX_VALUE && !C13990Tnq.A1a(this.A0G)) {
                Log.e("PreferenceGroup", 002.A0R(C51968G9o.A16(this), " should have a key defined if it contains an expandable preference"));
            }
            this.A00 = i2;
        }
        obtainStyledAttributes.recycle();
    }

    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = C7216Pzk.A00(60);
        public int A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    public final void A0A(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            this.A00 = savedState.A00;
            parcelable = savedState.getSuperState();
        }
        super.A0A(parcelable);
    }

    public final Preference A0N(CharSequence charSequence) {
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(this.A0G, charSequence)) {
            return this;
        } else {
            List list = this.A07;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Preference preference = (Preference) list.get(i);
                if (TextUtils.equals(preference.A0G, charSequence) || ((preference instanceof PreferenceGroup) && (preference = ((PreferenceGroup) preference).A0N(charSequence)) != null)) {
                    return preference;
                }
            }
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(androidx.preference.Preference r8) {
        /*
            r7 = this;
            java.util.List r3 = r7.A07
            boolean r0 = r3.contains(r8)
            r6 = 1
            if (r0 != 0) goto L_0x00bf
            java.lang.String r4 = r8.A0G
            if (r4 == 0) goto L_0x0028
            r0 = r7
        L_0x000e:
            androidx.preference.PreferenceGroup r1 = r0.A0A
            if (r1 == 0) goto L_0x0015
            androidx.preference.PreferenceGroup r0 = r0.A0A
            goto L_0x000e
        L_0x0015:
            androidx.preference.Preference r0 = r0.A0N(r4)
            if (r0 == 0) goto L_0x0028
            java.lang.String r2 = "PreferenceGroup"
            java.lang.String r1 = "Found duplicated key: \""
            java.lang.String r0 = "\". This can cause unintended behaviour, please use unique keys for every preference."
            java.lang.String r0 = X.002.A0g(r1, r4, r0)
            android.util.Log.e(r2, r0)
        L_0x0028:
            int r2 = r8.A02
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r0) goto L_0x004b
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0040
            int r1 = r7.A03
            int r0 = r1 + 1
            r7.A03 = r0
            if (r1 == r2) goto L_0x0040
            r8.A02 = r1
            r8.A07()
        L_0x0040:
            boolean r0 = r8 instanceof androidx.preference.PreferenceGroup
            if (r0 == 0) goto L_0x004b
            r1 = r8
            androidx.preference.PreferenceGroup r1 = (androidx.preference.PreferenceGroup) r1
            boolean r0 = r7.A02
            r1.A02 = r0
        L_0x004b:
            int r2 = java.util.Collections.binarySearch(r3, r8)
            if (r2 >= 0) goto L_0x0053
            int r2 = -r2
            int r2 = r2 - r6
        L_0x0053:
            boolean r1 = r7.A0K()
            boolean r0 = r8.A0M
            if (r0 != r1) goto L_0x0069
            r0 = r1 ^ 1
            r8.A0M = r0
            boolean r0 = r8.A0K()
            r8.A0I(r0)
            r8.A04()
        L_0x0069:
            monitor-enter(r7)
            r3.add(r2, r8)     // Catch:{ all -> 0x00bc }
            monitor-exit(r7)     // Catch:{ all -> 0x00bc }
            X.Vi6 r5 = r7.A0B
            java.lang.String r4 = r8.A0G
            if (r4 == 0) goto L_0x008d
            X.01r r1 = r7.A05
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r1.get(r4)
            long r2 = X.AnonymousClass7TE.A0R(r0)
            r1.remove(r4)
        L_0x0087:
            r8.A04 = r2
            r8.A0L = r6
            r1 = 0
            goto L_0x0097
        L_0x008d:
            monitor-enter(r5)
            long r2 = r5.A00     // Catch:{ all -> 0x00b9 }
            r0 = 1
            long r0 = r0 + r2
            r5.A00 = r0     // Catch:{ all -> 0x00b9 }
            monitor-exit(r5)     // Catch:{ all -> 0x00b9 }
            goto L_0x0087
        L_0x0097:
            r8.A0C(r5)     // Catch:{ all -> 0x00b5 }
            r8.A0L = r1
            androidx.preference.PreferenceGroup r0 = r8.A0A
            if (r0 != 0) goto L_0x00ad
            r8.A0A = r7
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x00a9
            r8.A05()
        L_0x00a9:
            r7.A07()
            return
        L_0x00ad:
            java.lang.String r0 = "This preference already has a parent. You must remove the existing parent before assigning a new one."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x00b5:
            r0 = move-exception
            r8.A0L = r1
            throw r0
        L_0x00b9:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b9 }
            throw r1
        L_0x00bc:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00bc }
            throw r1
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceGroup.A0O(androidx.preference.Preference):void");
    }

    public final void A05() {
        super.A05();
        this.A01 = true;
        List list = this.A07;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A05();
        }
    }

    public final void A08(Bundle bundle) {
        super.A08(bundle);
        List list = this.A07;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A08(bundle);
        }
    }

    public final void A09(Bundle bundle) {
        super.A09(bundle);
        List list = this.A07;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).A09(bundle);
        }
    }

    public final void A0I(boolean z) {
        super.A0I(z);
        List list = this.A07;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) list.get(i);
            if (preference.A0M == z) {
                preference.A0M = !z;
                preference.A0I(preference.A0K());
                preference.A04();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
