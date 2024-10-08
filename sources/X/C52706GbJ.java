package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.GbJ  reason: case insensitive filesystem */
public final class C52706GbJ {
    public KeyListener A00;
    public C52707GbK A01 = new C52707GbK();
    public TextInputView A02;
    public C52711GbO A03;
    public CharSequence A04;
    public CharSequence A05;
    public 0eP A06;

    public final void A01() {
        String str = null;
        C245983dn.A02((String) null);
        TextInputView textInputView = this.A02;
        if (textInputView == null) {
            str = "";
        } else {
            Editable text = textInputView.getText();
            if (text != null) {
                text.clear();
            }
        }
        this.A04 = str;
    }

    public final void A02() {
        C245983dn.A02((String) null);
        TextInputView textInputView = this.A02;
        if (textInputView != null) {
            textInputView.clearFocus();
            new AnonymousClass03a(textInputView).A00.A01();
        }
    }

    public final void A03() {
        C245983dn.A02((String) null);
        TextInputView textInputView = this.A02;
        if (textInputView != null && textInputView.requestFocus()) {
            new AnonymousClass03a(textInputView).A00.A02();
        }
    }

    public final void A04(TextWatcher textWatcher) {
        C245983dn.A02((String) null);
        this.A01.A02.add(textWatcher);
    }

    public final void A05(TextWatcher textWatcher) {
        C245983dn.A02((String) null);
        this.A01.A02.remove(textWatcher);
    }

    public final void A06(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        boolean z = true;
        C245983dn.A02((String) null);
        TextInputView textInputView = this.A02;
        this.A04 = null;
        if (textInputView == null) {
            this.A04 = charSequence;
            return;
        }
        int length = textInputView.getText().length() - textInputView.getSelectionEnd();
        if (textInputView.getSelectionEnd() != 0) {
            z = false;
        }
        textInputView.setText(charSequence);
        if (!z) {
            int length2 = charSequence.length();
            int length3 = charSequence.length();
            if (length2 >= length) {
                length3 -= length;
            }
            textInputView.setSelection(length3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        if (r2 != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r2 = 0
            X.C245983dn.A02(r2)
            com.facebook.primitive.textinput.TextInputView r0 = r3.A02
            java.lang.CharSequence r1 = r3.A04
            if (r0 != 0) goto L_0x0022
            if (r1 == 0) goto L_0x0020
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            r0.append(r1)
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r4, r0)
            if (r2 == 0) goto L_0x0020
        L_0x001d:
            r3.A04 = r2
            return
        L_0x0020:
            r2 = r4
            goto L_0x001d
        L_0x0022:
            if (r1 == 0) goto L_0x0032
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            r0.append(r1)
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r4, r0)
            if (r0 == 0) goto L_0x0032
            r4 = r0
        L_0x0032:
            com.facebook.primitive.textinput.TextInputView r0 = r3.A02
            if (r0 == 0) goto L_0x001d
            r0.append(r4)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52706GbJ.A07(java.lang.String):void");
    }

    public final CharSequence A00() {
        CharSequence charSequence;
        TextInputView textInputView = this.A02;
        if (textInputView == null || (charSequence = textInputView.getText()) == null) {
            CharSequence charSequence2 = this.A05;
            if (charSequence2 != null) {
                return charSequence2;
            }
            charSequence = "";
        }
        return charSequence;
    }
}
