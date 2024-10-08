package X;

import android.text.Editable;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.PEm  reason: case insensitive filesystem */
public final class C72659PEm implements C3260075a {
    public final /* synthetic */ ComposerAutoCompleteTextView A00;

    public final void CJM(Editable editable) {
    }

    public final int getSpanEnd(Object obj) {
        0qQ.A0B(obj, 0);
        return this.A00.getText().getSpanEnd(obj);
    }

    public final int getSpanStart(Object obj) {
        0qQ.A0B(obj, 0);
        return this.A00.getText().getSpanStart(obj);
    }

    public final void removeSpan(Object obj) {
        0qQ.A0B(obj, 0);
        this.A00.getText().removeSpan(obj);
    }

    public C72659PEm(ComposerAutoCompleteTextView composerAutoCompleteTextView) {
        this.A00 = composerAutoCompleteTextView;
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.A00.getText().getSpans(i, i2, cls);
    }
}
