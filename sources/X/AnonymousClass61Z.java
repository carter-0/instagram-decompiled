package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.ui.widget.typeaheadpill.TypeaheadPill;

/* renamed from: X.61Z  reason: invalid class name */
public final class AnonymousClass61Z implements TextWatcher {
    public final /* synthetic */ TypeaheadPill A00;

    public final void afterTextChanged(Editable editable) {
        0qQ.A0B(editable, 0);
        TypeaheadPill typeaheadPill = this.A00;
        if (!00p.A0j(typeaheadPill.A01, editable.toString(), true)) {
            String obj = editable.toString();
            typeaheadPill.A01 = obj;
            G6Y g6y = typeaheadPill.A00;
            if (g6y != null) {
                0qQ.A0B(obj, 0);
                ((C49916FEq) ((C51013Fn4) g6y).A00.A06.A01).A05.Dhx(obj, true);
            }
        }
        TypeaheadPill.A00(editable, typeaheadPill);
        String str = typeaheadPill.A01;
        if (str == null || str.length() == 0) {
            typeaheadPill.A01();
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass61Z(TypeaheadPill typeaheadPill) {
        this.A00 = typeaheadPill;
    }
}
