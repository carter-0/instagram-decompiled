package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

public final class U9H extends C14762U7t {
    public long A00 = -1;
    public EditText A01;
    public CharSequence A02;
    public final Runnable A03 = new C19908Whd(this);

    public final void A0I() {
        long j = this.A00;
        if (j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.A01;
            if (editText == null || !editText.isFocused() || ((InputMethodManager) this.A01.getContext().getSystemService("input_method")).showSoftInput(this.A01, 0)) {
                this.A00 = -1;
                return;
            }
            EditText editText2 = this.A01;
            Runnable runnable = this.A03;
            editText2.removeCallbacks(runnable);
            this.A01.postDelayed(runnable, 50);
        }
    }

    public final void A0H(View view) {
        super.A0H(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.A01 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.A01.setText(this.A02);
            JTR.A1F(this.A01);
            A0G();
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    public final void onCreate(Bundle bundle) {
        CharSequence charSequence;
        int A022 = AnonymousClass0fD.A02(-418290087);
        super.onCreate(bundle);
        if (bundle == null) {
            charSequence = ((EditTextPreference) A0G()).A00;
        } else {
            charSequence = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
        this.A02 = charSequence;
        AnonymousClass0fD.A09(88618178, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.A02);
    }
}
