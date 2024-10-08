package X;

import android.view.inputmethod.InputConnectionWrapper;

public final class U42 extends InputConnectionWrapper {
    public C20877X2e A00;
    public U66 A01;
    public String A02;
    public boolean A03;

    public final boolean beginBatchEdit() {
        this.A03 = true;
        return super.beginBatchEdit();
    }

    public final boolean endBatchEdit() {
        this.A03 = false;
        String str = this.A02;
        if (str != null) {
            A00(str);
            this.A02 = null;
        }
        return super.endBatchEdit();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.UTB, X.W0S] */
    private void A00(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        C20877X2e x2e = this.A00;
        ? w0s = new W0S(-1, this.A01.getId());
        w0s.A00 = str;
        x2e.APe(w0s);
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        A00("Backspace");
        return super.deleteSurroundingText(i, i2);
    }

    public final boolean setComposingText(CharSequence charSequence, int i) {
        String str;
        U66 u66 = this.A01;
        int selectionStart = u66.getSelectionStart();
        int selectionEnd = u66.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        int selectionStart2 = u66.getSelectionStart();
        boolean A1S = AnonymousClass7TF.A1S(selectionStart, selectionEnd);
        boolean A1S2 = AnonymousClass7TF.A1S(selectionStart2, selectionStart);
        if (selectionStart2 < selectionStart || selectionStart2 <= 0 || (!A1S && A1S2)) {
            str = "Backspace";
        } else {
            str = String.valueOf(u66.getText().charAt(selectionStart2 - 1));
        }
        if (this.A03) {
            this.A02 = str;
            return composingText;
        }
        A00(str);
        return composingText;
    }

    public final boolean commitText(CharSequence charSequence, int i) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 2) {
            if (charSequence2.equals("")) {
                charSequence2 = "Backspace";
            }
            if (this.A03) {
                this.A02 = charSequence2;
            } else {
                A00(charSequence2);
            }
        }
        return super.commitText(charSequence, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r4.getUnicodeChar() <= 47) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean sendKeyEvent(android.view.KeyEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L_0x0025
            int r1 = r4.getUnicodeChar()
            r0 = 58
            if (r1 >= r0) goto L_0x0017
            int r1 = r4.getUnicodeChar()
            r0 = 47
            r2 = 1
            if (r1 > r0) goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            int r1 = r4.getKeyCode()
            r0 = 67
            if (r1 != r0) goto L_0x002a
            java.lang.String r0 = "Backspace"
        L_0x0022:
            r3.A00(r0)
        L_0x0025:
            boolean r0 = super.sendKeyEvent(r4)
            return r0
        L_0x002a:
            int r1 = r4.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0035
            java.lang.String r0 = "Enter"
            goto L_0x0022
        L_0x0035:
            if (r2 == 0) goto L_0x0025
            char r0 = r4.getNumber()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U42.sendKeyEvent(android.view.KeyEvent):boolean");
    }
}
