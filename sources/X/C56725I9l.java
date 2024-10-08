package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;

/* renamed from: X.I9l  reason: case insensitive filesystem */
public final class C56725I9l implements TextWatcher {
    public boolean A00;
    public boolean A01;
    public final String A02;
    public final ArrayList A03 = AnonymousClass7TE.A1C();
    public final EditText A04;

    public final void afterTextChanged(Editable editable) {
        0qQ.A0B(editable, 0);
        EditText editText = this.A04;
        int selectionStart = editText.getSelectionStart();
        if (!this.A01) {
            this.A01 = true;
            if (this.A00 && this.A03.contains(Integer.valueOf(selectionStart))) {
                while (true) {
                    if (selectionStart <= 0) {
                        break;
                    }
                    int i = selectionStart - 1;
                    if (this.A02.charAt(i) == '#') {
                        editable.delete(i, selectionStart);
                        selectionStart = i;
                        break;
                    }
                    editable.delete(i, selectionStart);
                    selectionStart--;
                }
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
                String str = this.A02;
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
                    A1A2.append(str.charAt(i5));
                    if (i4 <= i2) {
                        i6++;
                    }
                }
                i5++;
            }
            String substring = this.A02.substring(i5);
            0qQ.A07(substring);
            int length2 = substring.length();
            if (length2 > 0 && !00l.A0d(substring, String.valueOf('#'), false)) {
                A1A2.append(substring);
                if (i4 <= i2) {
                    i6 += length2;
                }
            }
            editable.replace(0, editable.length(), A1A2);
            editText.setSelection(i6);
            this.A01 = false;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C56725I9l(EditText editText, String str) {
        this.A04 = editText;
        this.A02 = str;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != '#') {
                AnonymousClass7TF.A1M(this.A03, i);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = AnonymousClass7TF.A1T(i3, i2);
    }
}
