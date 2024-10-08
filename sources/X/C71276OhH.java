package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.OhH  reason: case insensitive filesystem */
public final class C71276OhH implements TextWatcher {
    public int A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C70669OFq A05;

    public final void afterTextChanged(Editable editable) {
        C70669OFq oFq;
        EditText editText;
        int i;
        int valueOf;
        0qQ.A0B(editable, 0);
        if (!this.A04 && editable.length() > 0 && (editText = oFq.A03) != null) {
            this.A04 = true;
            if (this.A03) {
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
            if ((oFq = this.A05).A03 != null) {
                String A002 = new 11S("\\D").A00(editable.toString(), "");
                while (true) {
                    i = 1;
                    if (A002.charAt(0) == '0' && A002.length() > 1) {
                        A002 = C66580MXl.A0z(A002, 1);
                    }
                }
                if (A002.length() == 0) {
                    valueOf = 0;
                } else {
                    valueOf = Double.valueOf(Double.parseDouble(A002));
                }
                Number number = valueOf;
                if (number.doubleValue() >= 1.0E17d) {
                    EditText editText2 = oFq.A03;
                    0qQ.A0A(editText2);
                    editText2.setSelection(0);
                    EditText editText3 = oFq.A03;
                    0qQ.A0A(editText3);
                    editText3.setText(this.A01);
                    EditText editText4 = oFq.A03;
                    0qQ.A0A(editText4);
                    editText4.setSelection(this.A01.length() - this.A00);
                } else if (number.doubleValue() >= 0.0d) {
                    NumberFormat numberFormat = oFq.A04;
                    if (numberFormat == null) {
                        EditText editText5 = oFq.A03;
                        0qQ.A0A(editText5);
                        Locale locale = DbU.A05(editText5).getConfiguration().locale;
                        0qQ.A0A(locale);
                        numberFormat = C9776RgY.A00(locale);
                        oFq.A04 = numberFormat;
                    }
                    0qQ.A0A(numberFormat);
                    String format = numberFormat.format(number);
                    EditText editText6 = oFq.A03;
                    0qQ.A0A(editText6);
                    editText6.setSelection(0);
                    EditText editText7 = oFq.A03;
                    0qQ.A0A(editText7);
                    editText7.setText(format);
                    if (number.doubleValue() != 0.0d) {
                        boolean z = this.A02;
                        Pattern pattern = 0mp.A06;
                        if (z) {
                            if (format != null) {
                                int length = format.length() - 1;
                                while (true) {
                                    if (-1 >= length) {
                                        break;
                                    } else if (Character.isDigit(format.charAt(length))) {
                                        i = length + 1;
                                        break;
                                    } else {
                                        length--;
                                    }
                                }
                            }
                            i = 0;
                        } else {
                            i = DbX.A05(format) - this.A00;
                        }
                    }
                    EditText editText8 = oFq.A03;
                    0qQ.A0A(editText8);
                    int max = Math.max(i, 0);
                    EditText editText9 = oFq.A03;
                    0qQ.A0A(editText9);
                    editText8.setSelection(Math.min(max, editText9.getText().length()));
                    EditText editText10 = oFq.A03;
                    0qQ.A0A(editText10);
                    oFq.A01 = editText10.getSelectionStart();
                    EditText editText11 = oFq.A03;
                    0qQ.A0A(editText11);
                    oFq.A00 = editText11.getSelectionEnd();
                } else {
                    editable.clear();
                    oFq.A01 = 0;
                    oFq.A00 = 0;
                }
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
        throw new UnsupportedOperationException("Method not decompiled: X.C71276OhH.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C71276OhH(C307786Rm r2, C276544tV r3) {
        C70669OFq oFq = (C70669OFq) C307476Qg.A06(r2, r3);
        if (oFq != null) {
            this.A05 = oFq;
            this.A01 = "";
            return;
        }
        throw AnonymousClass7TE.A0z("Extension mapper missing for 13713");
    }
}
