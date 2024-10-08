package X;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

public final class FQd implements TextView.OnEditorActionListener {
    public final /* synthetic */ C47712EDv A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;
    public final /* synthetic */ C277014uI A03;
    public final /* synthetic */ ConfirmationCodeEditText A04;

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 6 || (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        C277014uI r3 = this.A03;
        if (r3 != null) {
            C276544tV r2 = this.A02;
            C308276Tl A0P = DbS.A0P();
            A0P.A03(DbV.A0x(textView), 0);
            C307886Rw.A03(this.A01, r2, A0P.A00(), r3);
            return true;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.A04.getContext().getSystemService("input_method");
        if (inputMethodManager == null) {
            return true;
        }
        inputMethodManager.hideSoftInputFromWindow(textView.getWindowToken(), 0);
        return true;
    }

    public FQd(C47712EDv eDv, C307786Rm r2, C276544tV r3, C277014uI r4, ConfirmationCodeEditText confirmationCodeEditText) {
        this.A00 = eDv;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = confirmationCodeEditText;
    }
}
