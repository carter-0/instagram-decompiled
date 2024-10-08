package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class LWR implements TextWatcher {
    public String A00;
    public final /* synthetic */ EditText A01;
    public final /* synthetic */ MRX A02;

    public final void afterTextChanged(Editable editable) {
        0qQ.A0B(editable, 0);
        String str = this.A00;
        if (str != null) {
            String obj = editable.toString();
            int length = obj.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A13 = Dbc.A13(obj, i2);
                if (z) {
                    if (!A13) {
                        break;
                    }
                    length--;
                } else if (!A13) {
                    z = true;
                } else {
                    i++;
                }
            }
            String A0c = Dba.A0c(obj, length, i);
            if (!str.equals(A0c)) {
                if (Character.codePointCount(A0c, 0, A0c.length()) > 16) {
                    EditText editText = this.A01;
                    editText.setText(str);
                    JTR.A1F(editText);
                } else {
                    str = A0c;
                }
                MRX mrx = this.A02;
                if (mrx != null) {
                    mrx.AAw(str);
                    return;
                }
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        0qQ.A0B(charSequence, 0);
        this.A00 = charSequence.toString();
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public LWR(EditText editText, MRX mrx) {
        this.A01 = editText;
        this.A02 = mrx;
    }
}
