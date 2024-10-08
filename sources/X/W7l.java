package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.igds.components.form.IgFormField;

public final class W7l implements TextWatcher {
    public int A00;
    public boolean A01;
    public final /* synthetic */ IgFormField A02;
    public final /* synthetic */ V4Q A03;
    public final /* synthetic */ VOK A04;

    public final void afterTextChanged(Editable editable) {
        0qQ.A0B(editable, 0);
        if (!this.A01) {
            this.A01 = true;
            IgFormField igFormField = this.A02;
            igFormField.setText(this.A03.A01(editable.toString()));
            igFormField.setSelection(this.A00);
            Un0 un0 = this.A04.A00;
            un0.A07 = true;
            igFormField.A0E();
            un0.A07 = false;
            this.A01 = false;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = i + i3;
    }

    public W7l(IgFormField igFormField, V4Q v4q, VOK vok) {
        this.A02 = igFormField;
        this.A03 = v4q;
        this.A04 = vok;
    }
}
