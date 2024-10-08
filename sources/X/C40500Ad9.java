package X;

import android.text.Editable;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.Ad9  reason: case insensitive filesystem */
public final class C40500Ad9 implements C3260075a {
    public final /* synthetic */ ComposerAutoCompleteTextView A00;

    public final void CJM(Editable editable) {
    }

    public final int getSpanEnd(Object obj) {
        Editable text;
        0qQ.A0B(obj, 0);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00;
        if (composerAutoCompleteTextView == null || (text = composerAutoCompleteTextView.getText()) == null) {
            return -1;
        }
        return text.getSpanEnd(obj);
    }

    public final int getSpanStart(Object obj) {
        Editable text;
        0qQ.A0B(obj, 0);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00;
        if (composerAutoCompleteTextView == null || (text = composerAutoCompleteTextView.getText()) == null) {
            return -1;
        }
        return text.getSpanStart(obj);
    }

    public final void removeSpan(Object obj) {
        Editable text;
        0qQ.A0B(obj, 0);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00;
        if (composerAutoCompleteTextView != null && (text = composerAutoCompleteTextView.getText()) != null) {
            text.removeSpan(obj);
        }
    }

    public C40500Ad9(ComposerAutoCompleteTextView composerAutoCompleteTextView) {
        this.A00 = composerAutoCompleteTextView;
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        Editable text;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00;
        if (composerAutoCompleteTextView == null || (text = composerAutoCompleteTextView.getText()) == null) {
            return null;
        }
        return text.getSpans(i, i2, cls);
    }
}
