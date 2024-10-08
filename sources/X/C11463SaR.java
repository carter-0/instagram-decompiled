package X;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import com.facebook.phonenumbers.PhoneNumberUtil;

/* renamed from: X.SaR  reason: case insensitive filesystem */
public final class C11463SaR implements TextWatcher {
    public SUK A00;
    public boolean A01;
    public boolean A02 = false;

    public final synchronized void afterTextChanged(Editable editable) {
        int i;
        boolean z = true;
        Editable editable2 = editable;
        if (this.A01) {
            if (editable2.length() == 0) {
                z = false;
            }
            this.A01 = z;
        } else if (!this.A02) {
            int selectionEnd = Selection.getSelectionEnd(editable2) - 1;
            SUK suk = this.A00;
            suk.A0B();
            int length = editable2.length();
            String str = null;
            char c = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = editable2.charAt(i2);
                if (PhoneNumberUtils.isNonSeparator(charAt)) {
                    if (c != 0) {
                        boolean z3 = false;
                        if (z2) {
                            z3 = true;
                        }
                        str = SUK.A04(suk, c, z3);
                        suk.A04 = str;
                        z2 = false;
                    }
                    c = charAt;
                }
                if (i2 == selectionEnd) {
                    z2 = true;
                }
            }
            if (c != 0) {
                boolean z4 = false;
                if (z2) {
                    z4 = true;
                }
                str = SUK.A04(suk, c, z4);
                suk.A04 = str;
            }
            if (str != null) {
                if (!suk.A0C) {
                    i = suk.A00;
                } else {
                    int i3 = 0;
                    i = 0;
                    while (i3 < suk.A01 && i < suk.A04.length()) {
                        if (suk.A07.charAt(i3) == suk.A04.charAt(i)) {
                            i3++;
                        }
                        i++;
                    }
                }
                this.A02 = true;
                editable2.replace(0, editable2.length(), str, 0, str.length());
                if (JTQ.A1Y(editable2, str)) {
                    Selection.setSelection(editable2, i);
                }
                this.A02 = false;
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A02 && !this.A01 && i2 > 0) {
            for (int i4 = i; i4 < i + i2; i4++) {
                if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                    this.A01 = true;
                    this.A00.A0B();
                    return;
                }
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.A02 && !this.A01 && i3 > 0) {
            for (int i4 = i; i4 < i + i3; i4++) {
                if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                    this.A01 = true;
                    this.A00.A0B();
                    return;
                }
            }
        }
    }

    public C11463SaR(Context context, String str) {
        if (str != null) {
            this.A00 = new SUK(PhoneNumberUtil.A01(context), str);
            return;
        }
        throw Pxe.A0g();
    }
}
