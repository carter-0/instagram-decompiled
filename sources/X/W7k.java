package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.textinput.ReactTextInputManager;

public final class W7k implements TextWatcher {
    public String A00 = null;
    public final int A01;
    public final C20877X2e A02;
    public final U66 A03;
    public final /* synthetic */ ReactTextInputManager A04;

    public final void afterTextChanged(Editable editable) {
    }

    public W7k(Q6H q6h, U66 u66, ReactTextInputManager reactTextInputManager) {
        this.A04 = reactTextInputManager;
        this.A02 = C13990Tnq.A0K(u66, q6h);
        this.A03 = u66;
        this.A01 = UIManagerHelper.A00(q6h);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.W0S, X.UTE] */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        U66 u66 = this.A03;
        if (u66.A0F) {
            return;
        }
        if (i3 != 0 || i2 != 0) {
            0Sd.A00(this.A00);
            String substring = charSequence.toString().substring(i, i + i3);
            String substring2 = this.A00.substring(i, i + i2);
            if (i3 != i2 || !substring.equals(substring2)) {
                C20877X2e x2e = this.A02;
                int i4 = this.A01;
                int id = u66.getId();
                String charSequence2 = charSequence.toString();
                int i5 = u66.A02 + 1;
                u66.A02 = i5;
                ? w0s = new W0S(i4, id);
                w0s.A01 = charSequence2;
                w0s.A00 = i5;
                x2e.APe(w0s);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = charSequence.toString();
    }
}
