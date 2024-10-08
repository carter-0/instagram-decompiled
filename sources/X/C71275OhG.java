package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.text.NumberFormat;
import java.util.regex.Pattern;

/* renamed from: X.OhG  reason: case insensitive filesystem */
public final class C71275OhG implements TextWatcher {
    public int A00;
    public String A01 = "";
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C70668OFp A05;

    public final void afterTextChanged(Editable editable) {
        int i;
        C70668OFp oFp;
        EditText editText;
        0qQ.A0B(editable, 0);
        if (!this.A04) {
            this.A04 = true;
            if (this.A03 && (oFp = this.A05) != null && (editText = oFp.A03) != null) {
                int selectionStart = editText.getSelectionStart();
                while (true) {
                    if (selectionStart <= 0) {
                        break;
                    }
                    int i2 = selectionStart - 1;
                    if (Character.isDigit(editable.charAt(i2))) {
                        editable.delete(i2, selectionStart);
                        break;
                    } else {
                        editable.delete(i2, selectionStart);
                        selectionStart = i2;
                    }
                }
            }
            String str = "";
            String A002 = new 11S("\\D").A00(editable.toString(), str);
            int i3 = 0;
            if (A002.length() > 0) {
                i3 = Double.valueOf(Double.parseDouble(A002));
            }
            Number number = i3;
            if (number.doubleValue() >= 1.0E17d) {
                C70668OFp oFp2 = this.A05;
                EditText editText2 = oFp2.A03;
                if (editText2 != null) {
                    editText2.setText(this.A01);
                }
                EditText editText3 = oFp2.A03;
                if (editText3 != null) {
                    editText3.setSelection(this.A01.length() - this.A00);
                }
            } else if (number.doubleValue() > 0.0d) {
                C70668OFp oFp3 = this.A05;
                NumberFormat numberFormat = oFp3.A04;
                if (numberFormat != null) {
                    str = numberFormat.format(i3);
                    EditText editText4 = oFp3.A03;
                    if (editText4 != null) {
                        editText4.setText(str);
                    } else {
                        1Kn.A02(C273654mx.A00(1393), "EditText is null");
                    }
                }
                boolean z = this.A02;
                Pattern pattern = 0mp.A06;
                int A052 = DbX.A05(str);
                if (z) {
                    int i4 = A052 - 1;
                    while (true) {
                        if (-1 >= i4) {
                            i = 0;
                            break;
                        } else if (Character.isDigit(str.charAt(i4))) {
                            i = i4 + 1;
                            break;
                        } else {
                            i4--;
                        }
                    }
                } else {
                    i = A052 - this.A00;
                }
                EditText editText5 = oFp3.A03;
                if (editText5 != null) {
                    if (i < 0) {
                        i = 0;
                    }
                    editText5.setSelection(i);
                    oFp3.A01 = editText5.getSelectionStart();
                    oFp3.A00 = editText5.getSelectionEnd();
                }
            } else {
                editable.clear();
                C70668OFp oFp4 = this.A05;
                oFp4.A01 = 0;
                oFp4.A00 = 0;
            }
            this.A04 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (java.lang.Character.isDigit(r4.charAt(r5)) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void beforeTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = r4.toString()
            r3.A01 = r0
            int r1 = r4.length()
            int r1 = r1 - r5
            r2 = 0
            r0 = 0
            if (r7 != 0) goto L_0x0018
            r0 = r6
        L_0x0018:
            int r1 = r1 - r0
            r3.A00 = r1
            if (r7 >= r6) goto L_0x0028
            char r0 = r4.charAt(r5)
            boolean r1 = java.lang.Character.isDigit(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r3.A03 = r0
            int r0 = r4.length()
            if (r0 != 0) goto L_0x0032
            r2 = 1
        L_0x0032:
            r3.A02 = r2
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71275OhG.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C71275OhG(C307786Rm r2, C276544tV r3) {
        Object A06 = C307476Qg.A06(r2, r3);
        A06.getClass();
        this.A05 = (C70668OFp) A06;
    }
}
