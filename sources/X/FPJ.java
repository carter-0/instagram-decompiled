package X;

import android.text.Editable;
import android.view.View;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class FPJ implements View.OnFocusChangeListener {
    public final /* synthetic */ IgdsInlineSearchBox A00;

    public FPJ(IgdsInlineSearchBox igdsInlineSearchBox) {
        this.A00 = igdsInlineSearchBox;
    }

    public final void onFocusChange(View view, boolean z) {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A00;
        Editable text = igdsInlineSearchBox.A0E.getText();
        0qQ.A07(text);
        IgdsInlineSearchBox.A00(igdsInlineSearchBox, AnonymousClass7TF.A1Q(text.length()));
        View.OnFocusChangeListener onFocusChangeListener = igdsInlineSearchBox.A00;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }
}
