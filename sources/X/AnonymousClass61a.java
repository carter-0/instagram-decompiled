package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.instagram.ui.widget.typeaheadpill.TypeaheadPill;

/* renamed from: X.61a  reason: invalid class name */
public final class AnonymousClass61a implements TextView.OnEditorActionListener {
    public final /* synthetic */ TypeaheadPill A00;

    public AnonymousClass61a(TypeaheadPill typeaheadPill) {
        this.A00 = typeaheadPill;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        TypeaheadPill typeaheadPill = this.A00;
        String str = typeaheadPill.A02;
        if (str == null || str.length() <= 0) {
            return false;
        }
        G6Y g6y = typeaheadPill.A00;
        if (g6y != null) {
            g6y.DpQ(str);
        }
        return true;
    }
}
