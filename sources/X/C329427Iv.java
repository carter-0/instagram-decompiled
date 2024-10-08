package X;

import android.text.Editable;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.7Iv  reason: invalid class name and case insensitive filesystem */
public final class C329427Iv implements C329337Im {
    public String A00 = "";
    public final ComposerAutoCompleteTextView A01;

    public C329427Iv(ComposerAutoCompleteTextView composerAutoCompleteTextView) {
        0qQ.A0B(composerAutoCompleteTextView, 1);
        this.A01 = composerAutoCompleteTextView;
    }

    public final String AuW() {
        return this.A00;
    }

    public final Editable Azu() {
        return this.A01.getText();
    }
}
