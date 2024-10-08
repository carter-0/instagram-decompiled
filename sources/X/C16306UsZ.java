package X;

import android.text.Editable;
import android.widget.EditText;

/* renamed from: X.UsZ  reason: case insensitive filesystem */
public final class C16306UsZ extends W7f {
    public String A00 = "";
    public boolean A01;
    public int A02;
    public String A03 = "";
    public final int A04 = 3;
    public final EditText A05;

    public C16306UsZ(EditText editText) {
        0qQ.A0B(editText, 1);
        this.A05 = editText;
    }

    public final void A00(String str) {
        0qQ.A0B(str, 0);
        String str2 = this.A00;
        this.A00 = str;
        EditText editText = this.A05;
        String A0f = AnonymousClass7TF.A0f(editText);
        int length = A0f.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A13 = Dbc.A13(A0f, i2);
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
        String A0c = Dba.A0c(A0f, length, i);
        if (A0c == null || A0c.length() == 0 || 0qQ.A0K(str2, A0c)) {
            A01(this.A00);
            editText.setSelection(this.A00.length());
            Editable text = editText.getText();
            0qQ.A0A(text);
            C263324Kh.A05(text, C17284VPl.class);
            text.setSpan(new C17284VPl(this.A00), 0, text.length(), 34);
        }
    }

    public final void afterTextChanged(Editable editable) {
        0qQ.A0B(editable, 0);
        if (0qQ.A0K(editable.toString(), this.A00)) {
            this.A02 = this.A05.getLineCount();
        } else if (this.A01) {
            for (C17284VPl vPl : (C17284VPl[]) C263324Kh.A06(editable, C17284VPl.class)) {
                int spanStart = editable.getSpanStart(vPl);
                int spanEnd = editable.getSpanEnd(vPl);
                String A0c = C13988Tno.A0c(editable, spanStart, spanEnd);
                String str = vPl.A00;
                if (00p.A0k(str, A0c, false) && !0qQ.A0K(str, A0c)) {
                    editable.delete(spanStart, spanEnd);
                }
                editable.removeSpan(vPl);
            }
        }
        this.A01 = false;
        if (this.A05.getLineCount() > Math.max(this.A04, this.A02)) {
            editable.replace(0, editable.length(), this.A03);
        } else {
            this.A03 = editable.toString();
        }
    }

    public final void A01(String str) {
        Editable text = this.A05.getText();
        text.replace(0, text.length(), str);
    }
}
