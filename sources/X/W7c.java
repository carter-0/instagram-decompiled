package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.Currency;
import java.util.Locale;

public final class W7c implements NoCopySpan, TextWatcher {
    public String A00;
    public final int A01 = 0;
    public final Object A02;

    public W7c(C18742VzN vzN) {
        this.A02 = vzN;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.A01 == 0) {
            ((C60049JeH) this.A02).A01.put(this.A00, editable.toString());
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A01 != 0) {
            this.A00 = charSequence.toString();
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A01 != 0) {
            String str = this.A00;
            if (charSequence.toString().replaceAll("\\D", "").length() <= 9 || str == null) {
                String charSequence2 = charSequence.toString();
                Locale A022 = AnonymousClass1Q2.A02();
                C18742VzN vzN = (C18742VzN) this.A02;
                String CCj = vzN.A0L.CCj();
                CCj.getClass();
                Currency instance = Currency.getInstance(CCj);
                String replaceAll = charSequence2.replaceAll("\\D", "");
                if (!replaceAll.equals("")) {
                    replaceAll = C18237Vo4.A01(Double.valueOf(Double.parseDouble(replaceAll)), instance, A022);
                }
                C18742VzN.A00(vzN, replaceAll);
                boolean equals = replaceAll.equals("");
                EditText editText = vzN.A03;
                editText.getClass();
                int i4 = 17;
                if (equals) {
                    i4 = 8388611;
                }
                editText.setGravity(i4);
                C18742VzN.A01(vzN);
                return;
            }
            C18742VzN.A00((C18742VzN) this.A02, str);
        }
    }

    public W7c(C60049JeH jeH, String str) {
        this.A02 = jeH;
        this.A00 = str;
    }
}
