package X;

import android.view.View;
import android.widget.EditText;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;

public final class P0b implements C74442Pux {
    public final /* synthetic */ NJ5 A00;

    public P0b(NJ5 nj5) {
        this.A00 = nj5;
    }

    public final void CtL() {
        NJ5 nj5 = this.A00;
        C69863NtR.A00(nj5.requireContext(), 2131974093);
        C70932OSf oSf = nj5.A07;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(TraceFieldType.ErrorCode, "MODIFY_QUESTIONS_REQUEST_FAILURE");
        C70932OSf.A00(oSf, "icebreaker_settings_error_screen_impression", "There was a HTTP request failure to modify icebreaker questions", A1E);
        2dZ.A0t.A03(nj5.requireActivity()).setIsLoading(false);
        nj5.A03.setEnabled(true);
        EditText editText = nj5.A04;
        if (editText != null) {
            editText.setEnabled(true);
        }
        View view = nj5.A01;
        if (view != null) {
            view.setEnabled(true);
        }
    }

    public final void CtU() {
        NJ5 nj5 = this.A00;
        2dZ.A0t.A03(nj5.requireActivity()).setIsLoading(true);
        nj5.A03.setEnabled(false);
        EditText editText = nj5.A04;
        if (editText != null) {
            editText.setEnabled(false);
        }
        View view = nj5.A01;
        if (view != null) {
            view.setEnabled(false);
        }
    }

    public final void CtV() {
        NJ5 nj5 = this.A00;
        nj5.requireActivity().setResult(-1, nj5.A00);
        DbT.A1K(nj5);
    }
}
