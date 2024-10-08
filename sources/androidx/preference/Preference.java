package androidx.preference;

import X.0SM;
import X.0hq;
import X.0qQ;
import X.0s1;
import X.0xa;
import X.AnonymousClass7TF;
import X.C13990Tnq;
import X.C17915Vi6;
import X.C18666VwO;
import X.C20872X1y;
import X.C20873X1z;
import X.C51968G9o;
import X.C7216Pzk;
import X.Pxg;
import X.U9G;
import X.U9H;
import X.UAT;
import X.W89;
import X.X06;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.quickpromotion.sdk.devtool.QPCheckBoxPreference;
import com.instagram.android.R;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import java.util.ArrayList;
import java.util.List;

public class Preference implements Comparable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Drawable A05;
    public Bundle A06;
    public X06 A07;
    public C20872X1y A08;
    public C20873X1z A09;
    public PreferenceGroup A0A;
    public C17915Vi6 A0B;
    public CharSequence A0C;
    public Object A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public W89 A0R;
    public CharSequence A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final Context A0a;
    public final View.OnClickListener A0b;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00f2, code lost:
        if (r6.hasValue(11) != false) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Preference(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r5 = 0
            r8.<init>()
            r7 = 2147483647(0x7fffffff, float:NaN)
            r8.A02 = r7
            r4 = 1
            r8.A0V = r4
            r8.A0P = r4
            r8.A0N = r4
            r8.A0K = r4
            r8.A0M = r4
            r8.A0Q = r4
            r8.A0T = r4
            r8.A0U = r4
            r8.A0Z = r4
            r8.A0Y = r4
            r3 = 2131628220(0x7f0e10bc, float:1.8883727E38)
            r8.A01 = r3
            r2 = 3
            X.WAz r0 = new X.WAz
            r0.<init>(r8, r2)
            r8.A0b = r0
            r8.A0a = r9
            int[] r0 = X.C17166VKv.A06
            android.content.res.TypedArray r6 = r9.obtainStyledAttributes(r10, r0, r11, r5)
            r1 = 23
            int r0 = r6.getResourceId(r5, r5)
            int r0 = r6.getResourceId(r1, r0)
            r8.A00 = r0
            r1 = 26
            r0 = 6
            java.lang.String r0 = X.C13991Tnr.A0c(r6, r1, r0)
            r8.A0G = r0
            r0 = 34
            r1 = 4
            java.lang.CharSequence r0 = r6.getText(r0)
            if (r0 != 0) goto L_0x0055
            java.lang.CharSequence r0 = r6.getText(r1)
        L_0x0055:
            r8.A0C = r0
            r0 = 33
            r1 = 7
            java.lang.CharSequence r0 = r6.getText(r0)
            if (r0 != 0) goto L_0x0064
            java.lang.CharSequence r0 = r6.getText(r1)
        L_0x0064:
            r8.A0S = r0
            r1 = 28
            r0 = 8
            int r0 = r6.getInt(r0, r7)
            int r0 = r6.getInt(r1, r0)
            r8.A02 = r0
            r1 = 22
            r0 = 13
            java.lang.String r0 = X.C13991Tnr.A0c(r6, r1, r0)
            r8.A0F = r0
            r1 = 27
            int r0 = r6.getResourceId(r2, r3)
            int r0 = r6.getResourceId(r1, r0)
            r8.A01 = r0
            r1 = 35
            r0 = 9
            int r0 = r6.getResourceId(r0, r5)
            int r0 = r6.getResourceId(r1, r0)
            r8.A03 = r0
            r1 = 21
            r0 = 2
            boolean r0 = r6.getBoolean(r0, r4)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0V = r0
            r1 = 30
            r0 = 5
            boolean r0 = r6.getBoolean(r0, r4)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0P = r0
            r1 = 29
            boolean r0 = r6.getBoolean(r4, r4)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0N = r0
            r1 = 19
            r0 = 10
            java.lang.String r0 = X.C13991Tnr.A0c(r6, r1, r0)
            r8.A0E = r0
            boolean r0 = r8.A0P
            r1 = 16
            boolean r0 = r6.getBoolean(r1, r0)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0T = r0
            boolean r0 = r8.A0P
            r1 = 17
            boolean r0 = r6.getBoolean(r1, r0)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0U = r0
            r1 = 18
            boolean r0 = r6.hasValue(r1)
            if (r0 != 0) goto L_0x00f4
            r1 = 11
            boolean r0 = r6.hasValue(r1)
            if (r0 == 0) goto L_0x0102
        L_0x00f4:
            boolean r0 = r8 instanceof androidx.preference.TwoStatePreference
            if (r0 == 0) goto L_0x0150
            boolean r0 = r6.getBoolean(r1, r5)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x0100:
            r8.A0D = r7
        L_0x0102:
            r1 = 31
            r0 = 12
            boolean r0 = r6.getBoolean(r0, r4)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0Y = r0
            r1 = 32
            boolean r0 = r6.hasValue(r1)
            r8.A0W = r0
            if (r0 == 0) goto L_0x0126
            r0 = 14
            boolean r0 = r6.getBoolean(r0, r4)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0Z = r0
        L_0x0126:
            r1 = 24
            r0 = 15
            boolean r0 = r6.getBoolean(r0, r5)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0X = r0
            r1 = 25
            boolean r0 = r6.getBoolean(r1, r4)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0Q = r0
            r1 = 20
            boolean r0 = r6.getBoolean(r1, r5)
            boolean r0 = r6.getBoolean(r1, r0)
            r8.A0J = r0
            r6.recycle()
            return
        L_0x0150:
            boolean r0 = r8 instanceof androidx.preference.SeekBarPreference
            if (r0 == 0) goto L_0x015d
            int r0 = r6.getInt(r1, r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L_0x0100
        L_0x015d:
            boolean r0 = r8 instanceof androidx.preference.MultiSelectListPreference
            if (r0 == 0) goto L_0x017a
            java.lang.CharSequence[] r3 = r6.getTextArray(r1)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            int r2 = r3.length
            r1 = 0
        L_0x016c:
            if (r1 >= r2) goto L_0x0100
            r0 = r3[r1]
            java.lang.String r0 = r0.toString()
            r7.add(r0)
            int r1 = r1 + 1
            goto L_0x016c
        L_0x017a:
            boolean r0 = r8 instanceof androidx.preference.ListPreference
            if (r0 != 0) goto L_0x0185
            boolean r0 = r8 instanceof androidx.preference.EditTextPreference
            if (r0 != 0) goto L_0x0185
            r7 = 0
            goto L_0x0100
        L_0x0185:
            java.lang.String r7 = r6.getString(r1)
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void A0A(Parcelable parcelable) {
        this.A0I = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public static void A02(Preference preference) {
        C17915Vi6 vi6;
        PreferenceScreen preferenceScreen;
        Preference A0N2;
        List list;
        String str = preference.A0E;
        if (str != null && (vi6 = preference.A0B) != null && (preferenceScreen = vi6.A05) != null && (A0N2 = preferenceScreen.A0N(str)) != null && (list = A0N2.A0H) != null) {
            list.remove(preference);
        }
    }

    public CharSequence A03() {
        C20873X1z x1z = this.A09;
        if (x1z != null) {
            return x1z.E54(this);
        }
        return this.A0S;
    }

    public void A04() {
        X06 x06 = this.A07;
        if (x06 != null) {
            UAT uat = (UAT) x06;
            int indexOf = uat.A00.indexOf(this);
            if (indexOf != -1) {
                uat.notifyItemChanged(indexOf, this);
            }
        }
    }

    public void A05() {
        PreferenceScreen preferenceScreen;
        Preference A0N2;
        String str = this.A0E;
        if (!TextUtils.isEmpty(str)) {
            C17915Vi6 vi6 = this.A0B;
            if (vi6 == null || (preferenceScreen = vi6.A05) == null || (A0N2 = preferenceScreen.A0N(str)) == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Dependency \"");
                sb.append(str);
                sb.append("\" not found for preference \"");
                sb.append(this.A0G);
                sb.append("\" (title: \"");
                sb.append(this.A0C);
                throw new IllegalStateException(AnonymousClass7TF.A0l("\"", sb));
            }
            List list = A0N2.A0H;
            if (list == null) {
                list = new ArrayList();
                A0N2.A0H = list;
            }
            list.add(this);
            boolean A0K2 = A0N2.A0K();
            if (this.A0K == A0K2) {
                this.A0K = !A0K2;
                A0I(A0K());
                A04();
            }
        }
    }

    public final void A06() {
        if (this instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) this;
            A02(preferenceGroup);
            preferenceGroup.A01 = false;
            List list = preferenceGroup.A07;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Preference) list.get(i)).A06();
            }
            return;
        }
        A02(this);
    }

    public final void A07() {
        X06 x06 = this.A07;
        if (x06 != null) {
            UAT uat = (UAT) x06;
            Handler handler = uat.A02;
            Runnable runnable = uat.A03;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public void A08(Bundle bundle) {
        Parcelable parcelable;
        if (C13990Tnq.A1a(this.A0G) && (parcelable = bundle.getParcelable(this.A0G)) != null) {
            this.A0I = false;
            A0A(parcelable);
            if (!this.A0I) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.preference.EditTextPreference$SavedState, androidx.preference.Preference$BaseSavedState] */
    /* JADX WARNING: type inference failed for: r1v1, types: [androidx.preference.Preference$BaseSavedState, androidx.preference.ListPreference$SavedState] */
    /* JADX WARNING: type inference failed for: r1v2, types: [androidx.preference.Preference$BaseSavedState, androidx.preference.MultiSelectListPreference$SavedState] */
    /* JADX WARNING: type inference failed for: r3v4, types: [androidx.preference.PreferenceGroup$SavedState, androidx.preference.Preference$BaseSavedState] */
    /* JADX WARNING: type inference failed for: r1v4, types: [androidx.preference.SeekBarPreference$SavedState, androidx.preference.Preference$BaseSavedState] */
    /* JADX WARNING: type inference failed for: r1v7, types: [androidx.preference.TwoStatePreference$SavedState, androidx.preference.Preference$BaseSavedState] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(android.os.Bundle r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.A0G
            boolean r0 = X.C13990Tnq.A1a(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 0
            r4.A0I = r0
            r2 = r4
            boolean r0 = r4 instanceof androidx.preference.TwoStatePreference
            if (r0 == 0) goto L_0x0031
            androidx.preference.TwoStatePreference r2 = (androidx.preference.TwoStatePreference) r2
            r0 = 1
            r2.A0I = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0N
            if (r0 != 0) goto L_0x0025
            androidx.preference.TwoStatePreference$SavedState r1 = new androidx.preference.TwoStatePreference$SavedState
            r1.<init>((android.os.Parcelable) r3)
            boolean r0 = r2.A02
            r1.A00 = r0
        L_0x0024:
            r3 = r1
        L_0x0025:
            boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x00ba
            if (r3 == 0) goto L_0x0030
            java.lang.String r0 = r4.A0G
            r5.putParcelable(r0, r3)
        L_0x0030:
            return
        L_0x0031:
            boolean r0 = r4 instanceof androidx.preference.SeekBarPreference
            if (r0 == 0) goto L_0x0052
            androidx.preference.SeekBarPreference r2 = (androidx.preference.SeekBarPreference) r2
            r0 = 1
            r2.A0I = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0N
            if (r0 != 0) goto L_0x0025
            androidx.preference.SeekBarPreference$SavedState r1 = new androidx.preference.SeekBarPreference$SavedState
            r1.<init>((android.os.Parcelable) r3)
            int r0 = r2.A03
            r1.A02 = r0
            int r0 = r2.A01
            r1.A01 = r0
            int r0 = r2.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x0052:
            boolean r0 = r4 instanceof androidx.preference.PreferenceGroup
            if (r0 == 0) goto L_0x0067
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2
            r0 = 1
            r2.A0I = r0
            android.view.AbsSavedState r1 = android.view.AbsSavedState.EMPTY_STATE
            int r0 = r2.A00
            androidx.preference.PreferenceGroup$SavedState r3 = new androidx.preference.PreferenceGroup$SavedState
            r3.<init>((android.os.Parcelable) r1)
            r3.A00 = r0
            goto L_0x0025
        L_0x0067:
            boolean r0 = r4 instanceof androidx.preference.MultiSelectListPreference
            if (r0 == 0) goto L_0x0080
            androidx.preference.MultiSelectListPreference r2 = (androidx.preference.MultiSelectListPreference) r2
            r0 = 1
            r2.A0I = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0N
            if (r0 != 0) goto L_0x0025
            androidx.preference.MultiSelectListPreference$SavedState r1 = new androidx.preference.MultiSelectListPreference$SavedState
            r1.<init>((android.os.Parcelable) r3)
            java.util.Set r0 = r2.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x0080:
            boolean r0 = r4 instanceof androidx.preference.ListPreference
            if (r0 == 0) goto L_0x0099
            androidx.preference.ListPreference r2 = (androidx.preference.ListPreference) r2
            r0 = 1
            r2.A0I = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0N
            if (r0 != 0) goto L_0x0025
            androidx.preference.ListPreference$SavedState r1 = new androidx.preference.ListPreference$SavedState
            r1.<init>((android.os.Parcelable) r3)
            java.lang.String r0 = r2.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x0099:
            boolean r0 = r4 instanceof androidx.preference.EditTextPreference
            if (r0 == 0) goto L_0x00b3
            androidx.preference.EditTextPreference r2 = (androidx.preference.EditTextPreference) r2
            r0 = 1
            r2.A0I = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            boolean r0 = r2.A0N
            if (r0 != 0) goto L_0x0025
            androidx.preference.EditTextPreference$SavedState r1 = new androidx.preference.EditTextPreference$SavedState
            r1.<init>((android.os.Parcelable) r3)
            java.lang.String r0 = r2.A00
            r1.A00 = r0
            goto L_0x0024
        L_0x00b3:
            r0 = 1
            r4.A0I = r0
            android.view.AbsSavedState r3 = android.view.AbsSavedState.EMPTY_STATE
            goto L_0x0025
        L_0x00ba:
            java.lang.String r1 = "Derived class did not call super.onSaveInstanceState()"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A09(android.os.Bundle):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C17915Vi6 r5) {
        /*
            r4 = this;
            r4.A0B = r5
            boolean r0 = r4.A0L
            if (r0 != 0) goto L_0x0015
            monitor-enter(r5)
            long r2 = r5.A00     // Catch:{ all -> 0x0010 }
            r0 = 1
            long r0 = r0 + r2
            r5.A00 = r0     // Catch:{ all -> 0x0010 }
            monitor-exit(r5)     // Catch:{ all -> 0x0010 }
            goto L_0x0013
        L_0x0010:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0010 }
            throw r0
        L_0x0013:
            r4.A04 = r2
        L_0x0015:
            boolean r0 = r4.A0L()
            if (r0 == 0) goto L_0x0047
            X.Vi6 r0 = r4.A0B
            if (r0 == 0) goto L_0x0045
            android.content.SharedPreferences r1 = r0.A00()
        L_0x0023:
            java.lang.String r0 = r4.A0G
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0047
            r2 = 0
        L_0x002c:
            r1 = r4
            boolean r0 = r4 instanceof androidx.preference.TwoStatePreference
            if (r0 == 0) goto L_0x0044
            androidx.preference.TwoStatePreference r1 = (androidx.preference.TwoStatePreference) r1
            if (r2 != 0) goto L_0x0039
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0u()
        L_0x0039:
            boolean r0 = X.AnonymousClass7TE.A1a(r2)
            boolean r0 = r1.A0M(r0)
            r1.A0O(r0)
        L_0x0044:
            return
        L_0x0045:
            r1 = 0
            goto L_0x0023
        L_0x0047:
            java.lang.Object r2 = r4.A0D
            if (r2 == 0) goto L_0x0044
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0C(X.Vi6):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.UEU r9) {
        /*
            r8 = this;
            android.view.View r4 = r9.itemView
            android.view.View$OnClickListener r0 = r8.A0b
            X.AnonymousClass0fU.A00(r0, r4)
            r5 = 0
            r4.setId(r5)
            r0 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r6 = r9.A00(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r3 = 0
            r2 = 8
            if (r6 == 0) goto L_0x0105
            java.lang.CharSequence r1 = r8.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0102
            r6.setText(r1)
            r6.setVisibility(r5)
            int r0 = r6.getCurrentTextColor()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x0031:
            r0 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r6 = r9.A00(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0066
            java.lang.CharSequence r1 = r8.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00fd
            r6.setText(r1)
            r6.setVisibility(r5)
            boolean r0 = r8.A0W
            if (r0 == 0) goto L_0x0053
            boolean r0 = r8.A0Z
            r6.setSingleLine(r0)
        L_0x0053:
            boolean r0 = r8.A0P
            if (r0 != 0) goto L_0x0066
            boolean r0 = r8.A0J()
            if (r0 == 0) goto L_0x0066
            if (r7 == 0) goto L_0x0066
            int r0 = r7.intValue()
            r6.setTextColor(r0)
        L_0x0066:
            r0 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r6 = r9.A00(r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r6 == 0) goto L_0x0091
            int r1 = r8.A00
            if (r1 != 0) goto L_0x0079
            android.graphics.drawable.Drawable r0 = r8.A05
            if (r0 == 0) goto L_0x008a
        L_0x0079:
            android.graphics.drawable.Drawable r0 = r8.A05
            if (r0 != 0) goto L_0x0085
            android.content.Context r0 = r8.A0a
            android.graphics.drawable.Drawable r0 = X.C323656xt.A00(r0, r1)
            r8.A05 = r0
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            r6.setImageDrawable(r0)
        L_0x008a:
            android.graphics.drawable.Drawable r0 = r8.A05
            if (r0 == 0) goto L_0x00f2
            r6.setVisibility(r5)
        L_0x0091:
            r0 = 2131434054(0x7f0b1a46, float:1.8489911E38)
            android.view.View r1 = r9.A00(r0)
            if (r1 != 0) goto L_0x00a3
            r0 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r1 = r9.A00(r0)
            if (r1 == 0) goto L_0x00aa
        L_0x00a3:
            android.graphics.drawable.Drawable r0 = r8.A05
            if (r0 == 0) goto L_0x00e9
            r1.setVisibility(r5)
        L_0x00aa:
            boolean r0 = r8.A0Y
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r8.A0J()
            r8.A01(r4, r0)
        L_0x00b5:
            boolean r2 = r8.A0P
            r4.setFocusable(r2)
            r4.setClickable(r2)
            boolean r0 = r8.A0T
            r9.A01 = r0
            boolean r0 = r8.A0U
            r9.A02 = r0
            boolean r1 = r8.A0J
            if (r1 == 0) goto L_0x00e2
            X.W89 r0 = r8.A0R
            if (r0 != 0) goto L_0x00d4
            X.W89 r0 = new X.W89
            r0.<init>(r8)
            r8.A0R = r0
        L_0x00d4:
            r4.setOnCreateContextMenuListener(r0)
            r4.setLongClickable(r1)
            if (r1 == 0) goto L_0x00e1
            if (r2 != 0) goto L_0x00e1
            r4.setBackground(r3)
        L_0x00e1:
            return
        L_0x00e2:
            r0 = r3
            goto L_0x00d4
        L_0x00e4:
            r0 = 1
            r8.A01(r4, r0)
            goto L_0x00b5
        L_0x00e9:
            boolean r0 = r8.A0X
            if (r0 == 0) goto L_0x00ee
            r2 = 4
        L_0x00ee:
            r1.setVisibility(r2)
            goto L_0x00aa
        L_0x00f2:
            boolean r1 = r8.A0X
            r0 = 8
            if (r1 == 0) goto L_0x00f9
            r0 = 4
        L_0x00f9:
            r6.setVisibility(r0)
            goto L_0x0091
        L_0x00fd:
            r6.setVisibility(r2)
            goto L_0x0066
        L_0x0102:
            r6.setVisibility(r2)
        L_0x0105:
            r7 = r3
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0D(X.UEU):void");
    }

    public final void A0E(CharSequence charSequence) {
        if (this.A09 != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.A0S, charSequence)) {
            this.A0S = charSequence;
            A04();
        }
    }

    public final void A0F(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.A0C)) {
            this.A0C = charSequence;
            A04();
        }
    }

    public final void A0H(String str) {
        this.A0G = str;
        if (this.A0O && !C13990Tnq.A1a(str)) {
            if (!TextUtils.isEmpty(this.A0G)) {
                this.A0O = true;
                return;
            }
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
    }

    public void A0I(boolean z) {
        List list = this.A0H;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Preference preference = (Preference) list.get(i);
                if (preference.A0K == z) {
                    preference.A0K = !z;
                    preference.A0I(preference.A0K());
                    preference.A04();
                }
            }
        }
    }

    public boolean A0J() {
        if (!this.A0V || !this.A0K || !this.A0M) {
            return false;
        }
        return true;
    }

    public boolean A0K() {
        if (this instanceof TwoStatePreference) {
            TwoStatePreference twoStatePreference = (TwoStatePreference) this;
            boolean z = twoStatePreference.A03;
            boolean z2 = twoStatePreference.A02;
            if (z) {
                if (z2) {
                    return true;
                }
            } else if (!z2) {
                return true;
            }
            if (!(!twoStatePreference.A0J())) {
                return false;
            }
            return true;
        } else if (!(this instanceof EditTextPreference)) {
            return !A0J();
        } else {
            EditTextPreference editTextPreference = (EditTextPreference) this;
            if (TextUtils.isEmpty(editTextPreference.A00) || (!editTextPreference.A0J())) {
                return true;
            }
            return false;
        }
    }

    public final boolean A0L() {
        if (this.A0B == null || !this.A0N || !C13990Tnq.A1a(this.A0G)) {
            return false;
        }
        return true;
    }

    public final boolean A0M(boolean z) {
        if (this instanceof QPCheckBoxPreference) {
            QPCheckBoxPreference qPCheckBoxPreference = (QPCheckBoxPreference) this;
            IGDevToolPersistentStateHandler iGDevToolPersistentStateHandler = qPCheckBoxPreference.A00;
            String str = qPCheckBoxPreference.A0G;
            0qQ.A07(str);
            return ((0xa) iGDevToolPersistentStateHandler.A02.getValue()).getBoolean(str, z);
        } else if (A0L()) {
            return this.A0B.A00().getBoolean(this.A0G, z);
        } else {
            return z;
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.A02;
        int i2 = preference.A02;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.A0C;
        CharSequence charSequence2 = preference.A0C;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.A0C.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.A0C;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence A032 = A03();
        if (!TextUtils.isEmpty(A032)) {
            sb.append(A032);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    private void A01(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    A01(viewGroup.getChildAt(childCount), z);
                } else {
                    return;
                }
            }
        }
    }

    public void A0B(View view) {
        String str;
        Fragment u9g;
        Fragment fragment;
        Fragment fragment2;
        if (A0J() && this.A0P) {
            if (this instanceof TwoStatePreference) {
                TwoStatePreference twoStatePreference = (TwoStatePreference) this;
                twoStatePreference.A0O(!twoStatePreference.A02);
            } else if (this instanceof PreferenceScreen) {
                PreferenceGroup preferenceGroup = (PreferenceGroup) this;
                if (!(preferenceGroup.A0F != null || preferenceGroup.A07.size() == 0 || (fragment = preferenceGroup.A0B.A03) == null)) {
                    Fragment fragment3 = fragment;
                    Fragment fragment4 = fragment3;
                    do {
                        fragment4 = fragment4.mParentFragment;
                    } while (fragment4 != null);
                    fragment3.getContext();
                }
            } else if (this instanceof DialogPreference) {
                DialogPreference dialogPreference = (DialogPreference) this;
                if (dialogPreference instanceof DropDownPreference) {
                    ((DropDownPreference) dialogPreference).A00.performClick();
                } else {
                    Fragment fragment5 = dialogPreference.A0B.A02;
                    if (fragment5 != null) {
                        Fragment fragment6 = fragment5;
                        Fragment fragment7 = fragment6;
                        do {
                            fragment7 = fragment7.mParentFragment;
                        } while (fragment7 != null);
                        fragment6.getContext();
                        if (fragment6.getParentFragmentManager().A0R("androidx.preference.PreferenceFragment.DIALOG") == null) {
                            if (dialogPreference instanceof EditTextPreference) {
                                str = dialogPreference.A0G;
                                u9g = new U9H();
                            } else if (dialogPreference instanceof ListPreference) {
                                str = dialogPreference.A0G;
                                u9g = new 0SM();
                            } else if (dialogPreference instanceof MultiSelectListPreference) {
                                str = dialogPreference.A0G;
                                u9g = new U9G();
                            } else {
                                throw Pxg.A0c("Cannot display dialog for an unknown Preference type: ", C51968G9o.A16(dialogPreference), ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                            }
                            Bundle bundle = new Bundle(1);
                            bundle.putString("key", str);
                            u9g.setArguments(bundle);
                            u9g.setTargetFragment(fragment6, 0);
                            u9g.A0B(fragment6.getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
                        }
                    }
                }
            }
            C20872X1y x1y = this.A08;
            if (x1y != null) {
                x1y.DYi(this);
                return;
            }
            C17915Vi6 vi6 = this.A0B;
            if (vi6 != null && (fragment2 = vi6.A04) != null) {
                Fragment fragment8 = fragment2;
                String str2 = this.A0F;
                if (str2 != null) {
                    Fragment fragment9 = fragment8;
                    do {
                        fragment9 = fragment9.mParentFragment;
                    } while (fragment9 != null);
                    fragment8.getContext();
                    Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                    0hq parentFragmentManager = fragment8.getParentFragmentManager();
                    Bundle bundle2 = this.A06;
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        this.A06 = bundle2;
                    }
                    Fragment A012 = parentFragmentManager.A0S().A01(fragment8.requireActivity().getClassLoader(), str2);
                    A012.setArguments(bundle2);
                    A012.setTargetFragment(fragment8, 0);
                    0s1 r1 = new 0s1(parentFragmentManager);
                    r1.A0A(A012, ((View) fragment8.requireView().getParent()).getId());
                    r1.A0I((String) null);
                    r1.A00();
                }
            }
        }
    }

    public final void A0G(String str) {
        if (A0L()) {
            String str2 = null;
            if (A0L()) {
                str2 = this.A0B.A00().getString(this.A0G, (String) null);
            }
            if (!TextUtils.equals(str, str2)) {
                SharedPreferences.Editor edit = this.A0B.A00().edit();
                edit.putString(this.A0G, str);
                edit.apply();
            }
        }
    }

    public class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = C7216Pzk.A00(59);

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C18666VwO.A00(context, R.attr.preferenceStyle, 16842894));
    }
}
