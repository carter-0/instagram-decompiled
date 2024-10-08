package X;

import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import com.instagram.actionbar.ActionButton;
import com.instagram.ui.widget.progressbutton.ProgressButton;

public final class FKo implements TextWatcher {
    public boolean A00;
    public final EditText A01;
    public final C47448E2u A02;

    public FKo(EditText editText, C47448E2u e2u) {
        0qQ.A0B(editText, 1);
        this.A01 = editText;
        this.A02 = e2u;
    }

    public final void afterTextChanged(Editable editable) {
        EditText editText;
        int i;
        ActionButton actionButton;
        0qQ.A0B(editable, 0);
        if (!this.A00) {
            String A002 = new 11S("\\D+").A00(editable.toString(), "");
            int length = A002.length();
            boolean z = true;
            this.A00 = true;
            if (length == 0) {
                editText = this.A01;
                editText.setText("");
            } else if (length > 6) {
                editText = this.A01;
                editText.setText(editText.getText().subSequence(0, 14));
                editText.setSelection(14);
            } else {
                StringBuilder sb = new StringBuilder(14);
                int i2 = 6 - length;
                for (int i3 = 0; i3 < i2; i3++) {
                    A002 = 002.A0C(A002, '#');
                }
                int length2 = A002.length();
                int i4 = 0;
                for (int i5 = 0; i5 < length2; i5++) {
                    if (Character.isDigit(A002.charAt(i5))) {
                        i4 += 2;
                    }
                    sb.append(A002.charAt(i5));
                    sb.append(" ");
                    if (i5 == 2) {
                        if (Character.isDigit(A002.charAt(i5))) {
                            i4 += 2;
                        }
                        sb.append("   ");
                    }
                }
                String A10 = DbT.A10(sb);
                int length3 = A10.length() - 1;
                int i6 = 0;
                boolean z2 = false;
                while (i6 <= length3) {
                    int i7 = length3;
                    if (!z2) {
                        i7 = i6;
                    }
                    boolean A13 = Dbc.A13(A10, i7);
                    if (z2) {
                        if (!A13) {
                            break;
                        }
                        length3--;
                    } else if (!A13) {
                        z2 = true;
                    } else {
                        i6++;
                    }
                }
                SpannableString spannableString = new SpannableString(Dba.A0c(A10, length3, i6));
                editText = this.A01;
                spannableString.setSpan(new ForegroundColorSpan(editText.getCurrentHintTextColor()), i4, spannableString.length(), 33);
                editText.setText(spannableString);
                if (length <= 3) {
                    i = Math.max((length * 2) - 1, 0);
                } else {
                    i = (length + 1) * 2;
                }
                editText.setSelection(i);
            }
            this.A00 = false;
            C47448E2u e2u = this.A02;
            if (new 11S("\\D+").A00(AnonymousClass7TF.A0f(editText), "").length() != 6) {
                z = false;
            }
            if (e2u.mView != null && (actionButton = e2u.A05) != null) {
                actionButton.setEnabled(z);
                ProgressButton progressButton = e2u.A0F;
                if (progressButton != null) {
                    progressButton.setEnabled(z);
                }
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
