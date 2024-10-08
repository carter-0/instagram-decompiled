package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

public final class LWT implements TextWatcher {
    public boolean A00 = false;
    public boolean A01 = false;
    public final C63623L0l A02;
    public final C358448av A03;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        boolean z = this.A00;
        if (!z || !this.A01) {
            IgAutoCompleteTextView igAutoCompleteTextView = this.A02.A00.A07;
            if (igAutoCompleteTextView == null) {
                0qQ.A0F("editText");
                throw AnonymousClass00P.createAndThrow();
            }
            if (!z && C294435mR.A04(igAutoCompleteTextView, igAutoCompleteTextView.A05, 1, false)) {
                this.A03.CkQ();
                this.A00 = true;
            }
            if (!this.A01) {
                String A032 = C294435mR.A03(igAutoCompleteTextView, igAutoCompleteTextView.A05, false);
                if (!TextUtils.isEmpty(A032) && A032.length() > 1) {
                    this.A03.CkS();
                    this.A01 = true;
                }
            }
        }
    }

    public LWT(C63623L0l l0l, C358448av r3) {
        this.A02 = l0l;
        this.A03 = r3;
    }
}
