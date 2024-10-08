package X;

import android.widget.EditText;
import android.widget.TextView;

public final class P0d implements C74442Pux {
    public final /* synthetic */ NJS A00;

    public P0d(NJS njs) {
        this.A00 = njs;
    }

    public final void CtL() {
        String str;
        NJS njs = this.A00;
        C69863NtR.A00(njs.requireContext(), 2131959204);
        2dZ.A0t.A03(njs.getActivity()).setIsLoading(false);
        EditText editText = njs.A03;
        if (editText == null) {
            str = "messageField";
        } else {
            editText.setEnabled(true);
            EditText editText2 = njs.A04;
            if (editText2 == null) {
                str = "shortcutField";
            } else {
                editText2.setEnabled(true);
                TextView textView = njs.A05;
                if (textView != null) {
                    textView.setEnabled(true);
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CtU() {
        NJS.A01(this.A00);
    }

    public final void CtV() {
        NJS njs = this.A00;
        njs.A0C = false;
        DbT.A1J(njs);
    }
}
