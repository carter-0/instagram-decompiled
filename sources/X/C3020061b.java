package X;

import android.view.View;
import com.instagram.ui.widget.typeaheadpill.TypeaheadPill;

/* renamed from: X.61b  reason: invalid class name and case insensitive filesystem */
public final class C3020061b implements View.OnClickListener {
    public final /* synthetic */ TypeaheadPill A00;

    public C3020061b(TypeaheadPill typeaheadPill) {
        this.A00 = typeaheadPill;
    }

    public final void onClick(View view) {
        G6Y g6y;
        int A05 = AnonymousClass0fD.A05(-1504685810);
        TypeaheadPill typeaheadPill = this.A00;
        String str = typeaheadPill.A02;
        if (!(str == null || str.length() <= 0 || (g6y = typeaheadPill.A00) == null)) {
            g6y.DpQ(str);
        }
        AnonymousClass0fD.A0C(2134796643, A05);
    }
}
