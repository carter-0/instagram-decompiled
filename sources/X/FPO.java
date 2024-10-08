package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.instagram.igds.components.form.IgFormField;

public final class FPO implements View.OnKeyListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FPO(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.A00 != 0) {
            if (i != 67 || ((IgFormField) this.A01).getMEditText().getText().length() != 0) {
                return false;
            }
            ((0r1) this.A02).A00 = false;
            return true;
        } else if (i != 67) {
            return false;
        } else {
            E4V e4v = (E4V) this.A02;
            if (E4V.A01(e4v) != EV0.Social) {
                return false;
            }
            EditText editText = (EditText) this.A01;
            if (!0qQ.A0K(AnonymousClass7TF.A0f(editText), e4v.getString(2131959372))) {
                return false;
            }
            editText.getText().clear();
            return false;
        }
    }
}
