package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* renamed from: X.U7t  reason: case insensitive filesystem */
public abstract class C14762U7t extends 0SM implements DialogInterface.OnClickListener {
    public int A00;
    public int A01;
    public BitmapDrawable A02;
    public DialogPreference A03;
    public CharSequence A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;

    public final Dialog A0F(Bundle bundle) {
        View inflate;
        this.A01 = -2;
        C18080Vl9 vl9 = new C18080Vl9(requireContext());
        vl9.A08(this.A05);
        BitmapDrawable bitmapDrawable = this.A02;
        C17742VdB vdB = vl9.A01;
        vdB.A08 = bitmapDrawable;
        vl9.A06(this, this.A07);
        vl9.A05(this, this.A06);
        requireContext();
        int i = this.A00;
        if (i == 0 || (inflate = getLayoutInflater().inflate(i, (ViewGroup) null)) == null) {
            vdB.A0C = this.A04;
        } else {
            A0H(inflate);
            vl9.A07(inflate);
        }
        if (this instanceof U9G) {
            U9G u9g = (U9G) this;
            int length = u9g.A03.length;
            boolean[] zArr = new boolean[length];
            for (int i2 = 0; i2 < length; i2++) {
                zArr[i2] = u9g.A00.contains(u9g.A03[i2].toString());
            }
            CharSequence[] charSequenceArr = u9g.A02;
            W5d w5d = new W5d(u9g);
            vdB.A0J = charSequenceArr;
            vdB.A07 = w5d;
            vdB.A0K = zArr;
            vdB.A0H = true;
        } else if (this instanceof U9F) {
            U9F u9f = (U9F) this;
            CharSequence[] charSequenceArr2 = u9f.A01;
            int i3 = u9f.A00;
            W5U w5u = new W5U(u9f, 0);
            vdB.A0J = charSequenceArr2;
            vdB.A03 = w5u;
            vdB.A00 = i3;
            vdB.A0I = true;
            vl9.A06((DialogInterface.OnClickListener) null, (CharSequence) null);
        }
        C14729U5o A002 = vl9.A00();
        if (this instanceof U9H) {
            Window window = A002.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                RS7.A00(window);
            } else {
                U9H u9h = (U9H) this;
                u9h.A00 = SystemClock.currentThreadTimeMillis();
                u9h.A0I();
                return A002;
            }
        }
        return A002;
    }

    public final DialogPreference A0G() {
        Preference preference;
        PreferenceScreen preferenceScreen;
        DialogPreference dialogPreference = this.A03;
        if (dialogPreference != null) {
            return dialogPreference;
        }
        String string = requireArguments().getString("key");
        C17915Vi6 vi6 = ((U7v) getTargetFragment()).A01;
        if (vi6 == null || (preferenceScreen = vi6.A05) == null) {
            preference = null;
        } else {
            preference = preferenceScreen.A0N(string);
        }
        DialogPreference dialogPreference2 = (DialogPreference) preference;
        this.A03 = dialogPreference2;
        return dialogPreference2;
    }

    public void A0H(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.A04;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b7, code lost:
        if (r3 != null) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = 1894856040(0x70f13568, float:5.972036E29)
            int r4 = X.AnonymousClass0fD.A02(r0)
            X.C14762U7t.super.onCreate(r8)
            androidx.fragment.app.Fragment r2 = r7.getTargetFragment()
            boolean r0 = r2 instanceof X.X05
            if (r0 == 0) goto L_0x00ba
            X.X05 r2 = (X.X05) r2
            android.os.Bundle r1 = r7.requireArguments()
            java.lang.String r0 = "key"
            java.lang.String r1 = r1.getString(r0)
            r5 = 0
            if (r8 != 0) goto L_0x0087
            X.U7v r2 = (X.U7v) r2
            X.Vi6 r0 = r2.A01
            if (r0 == 0) goto L_0x0085
            androidx.preference.PreferenceScreen r0 = r0.A05
            if (r0 == 0) goto L_0x0085
            androidx.preference.Preference r1 = r0.A0N(r1)
        L_0x002f:
            androidx.preference.DialogPreference r1 = (androidx.preference.DialogPreference) r1
            r7.A03 = r1
            java.lang.CharSequence r0 = r1.A03
            r7.A05 = r0
            java.lang.CharSequence r0 = r1.A05
            r7.A07 = r0
            java.lang.CharSequence r0 = r1.A04
            r7.A06 = r0
            java.lang.CharSequence r0 = r1.A02
            r7.A04 = r0
            int r0 = r1.A00
            r7.A00 = r0
            android.graphics.drawable.Drawable r6 = r1.A01
            if (r6 == 0) goto L_0x0082
            boolean r0 = r6 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 != 0) goto L_0x0082
            int r2 = r6.getIntrinsicWidth()
            int r1 = r6.getIntrinsicHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r3)
            int r1 = r2.getWidth()
            int r0 = r2.getHeight()
            r6.setBounds(r5, r5, r1, r0)
            r6.draw(r2)
        L_0x0070:
            android.content.res.Resources r0 = X.DbV.A05(r7)
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            r6.<init>(r0, r3)
        L_0x0079:
            r7.A02 = r6
        L_0x007b:
            r0 = -994430099(0xffffffffc4ba336d, float:-1489.607)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        L_0x0082:
            android.graphics.drawable.BitmapDrawable r6 = (android.graphics.drawable.BitmapDrawable) r6
            goto L_0x0079
        L_0x0085:
            r1 = 0
            goto L_0x002f
        L_0x0087:
            java.lang.String r0 = "PreferenceDialogFragment.title"
            java.lang.CharSequence r0 = r8.getCharSequence(r0)
            r7.A05 = r0
            java.lang.String r0 = "PreferenceDialogFragment.positiveText"
            java.lang.CharSequence r0 = r8.getCharSequence(r0)
            r7.A07 = r0
            java.lang.String r0 = "PreferenceDialogFragment.negativeText"
            java.lang.CharSequence r0 = r8.getCharSequence(r0)
            r7.A06 = r0
            java.lang.String r0 = "PreferenceDialogFragment.message"
            java.lang.CharSequence r0 = r8.getCharSequence(r0)
            r7.A04 = r0
            java.lang.String r0 = "PreferenceDialogFragment.layout"
            int r0 = r8.getInt(r0, r5)
            r7.A00 = r0
            java.lang.String r0 = "PreferenceDialogFragment.icon"
            android.os.Parcelable r3 = r8.getParcelable(r0)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 == 0) goto L_0x007b
            goto L_0x0070
        L_0x00ba:
            java.lang.String r0 = "Target fragment must implement TargetFragment interface"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = 1032845014(0x3d8ff6d6, float:0.07029502)
            X.AnonymousClass0fD.A09(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14762U7t.onCreate(android.os.Bundle):void");
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        int i;
        C14762U7t.super.onDismiss(dialogInterface);
        boolean A1S = AnonymousClass7TF.A1S(this.A01, -1);
        if (this instanceof U9G) {
            U9G u9g = (U9G) this;
            if (A1S && u9g.A01) {
                ((MultiSelectListPreference) u9g.A0G()).A0N(u9g.A00);
            }
            u9g.A01 = false;
        } else if (this instanceof U9F) {
            U9F u9f = (U9F) this;
            if (A1S && (i = u9f.A00) >= 0) {
                ((ListPreference) u9f.A0G()).A0O(u9f.A02[i].toString());
            }
        } else {
            U9H u9h = (U9H) this;
            if (A1S) {
                String A0f = AnonymousClass7TF.A0f(u9h.A01);
                EditTextPreference editTextPreference = (EditTextPreference) u9h.A0G();
                boolean A0K = editTextPreference.A0K();
                editTextPreference.A00 = A0f;
                editTextPreference.A0G(A0f);
                boolean A0K2 = editTextPreference.A0K();
                if (A0K2 != A0K) {
                    editTextPreference.A0I(A0K2);
                }
                editTextPreference.A04();
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C14762U7t.super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.A05);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.A07);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.A06);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.A04);
        bundle.putInt("PreferenceDialogFragment.layout", this.A00);
        BitmapDrawable bitmapDrawable = this.A02;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
