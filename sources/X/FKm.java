package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class FKm implements TextWatcher {
    public final /* synthetic */ IgdsInlineSearchBox A00;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        0qQ.A0B(charSequence, 0);
        IgdsInlineSearchBox igdsInlineSearchBox = this.A00;
        IgdsInlineSearchBox.A00(igdsInlineSearchBox, AnonymousClass7TF.A1Q(charSequence.length()));
        String A01 = 0mp.A01(charSequence);
        if (igdsInlineSearchBox.A06 && A01 != null) {
            charSequence = A01;
        }
        G77 g77 = igdsInlineSearchBox.A02;
        if (g77 != null) {
            g77.onSearchTextChanged(charSequence.toString());
        }
    }

    public FKm(IgdsInlineSearchBox igdsInlineSearchBox) {
        this.A00 = igdsInlineSearchBox;
    }
}
