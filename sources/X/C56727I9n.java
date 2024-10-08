package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;

/* renamed from: X.I9n  reason: case insensitive filesystem */
public final class C56727I9n implements TextWatcher {
    public EditText A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final ArrayList A04 = AnonymousClass7TE.A1C();

    public C56727I9n(String str) {
        this.A01 = str;
        A00(this);
        this.A00 = null;
    }

    public final void afterTextChanged(Editable editable) {
        0qQ.A0B(editable, 0);
        EditText editText = this.A00;
        if (editText != null) {
            int selectionStart = editText.getSelectionStart();
            if (!this.A03 && !this.A02) {
                this.A02 = true;
            } else if (!this.A02) {
                this.A02 = true;
                if (this.A04.contains(Integer.valueOf(selectionStart))) {
                    while (true) {
                        if (selectionStart <= 0) {
                            break;
                        }
                        int i = selectionStart - 1;
                        if (this.A01.charAt(i) == '#') {
                            editable.delete(i, selectionStart);
                            selectionStart = i;
                            break;
                        }
                        editable.delete(i, selectionStart);
                        selectionStart--;
                    }
                }
            } else {
                return;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            int length = editable.length();
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (Character.isDigit(editable.charAt(i3))) {
                    A1A.append(editable.charAt(i3));
                    if (i3 < selectionStart) {
                        i2++;
                    }
                }
            }
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < A1A.length()) {
                String str = this.A01;
                if (i5 >= str.length()) {
                    break;
                }
                if (str.charAt(i5) == '#') {
                    A1A2.append(A1A.charAt(i4));
                    if (i4 < i2) {
                        i6++;
                    }
                    i4++;
                } else {
                    A1A2.append(this.A01.charAt(i5));
                    if (i4 <= i2) {
                        i6++;
                    }
                }
                i5++;
            }
            String substring = this.A01.substring(i5);
            0qQ.A07(substring);
            int length2 = substring.length();
            if (length2 > 0 && !00l.A0d(substring, "#", false)) {
                A1A2.append(substring);
                if (i4 <= i2) {
                    i6 += length2;
                }
            }
            editText.setText(A1A2);
            editText.setSelection(i6);
            this.A02 = false;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void A00(C56727I9n i9n) {
        int length = i9n.A01.length();
        for (int i = 0; i < length; i++) {
            if (i9n.A01.charAt(i) != '#') {
                AnonymousClass7TF.A1M(i9n.A04, i);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A03 = AnonymousClass7TF.A1T(i3, i2);
    }
}
