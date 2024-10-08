package X;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.Arrays;
import java.util.concurrent.locks.ReadWriteLock;

public final class W7i implements TextWatcher {
    public int A00 = 0;
    public int A01 = Integer.MAX_VALUE;
    public V26 A02;
    public final EditText A03;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.A03;
        if (!editText.isInEditMode() && i2 <= i3) {
            CharSequence charSequence2 = charSequence;
            if (charSequence instanceof Spannable) {
                int A012 = W0M.A00().A01();
                if (A012 != 0) {
                    if (A012 == 1) {
                        W0M.A00().A03(charSequence2, i, i + i3, this.A01, this.A00);
                        return;
                    } else if (A012 != 3) {
                        return;
                    }
                }
                W0M A002 = W0M.A00();
                V26 v26 = this.A02;
                if (v26 == null) {
                    v26 = new C14756U7n(editText);
                    this.A02 = v26;
                }
                ReadWriteLock readWriteLock = A002.A05;
                readWriteLock.writeLock().lock();
                try {
                    int i4 = A002.A00;
                    if (i4 == 1 || i4 == 2) {
                        A002.A01.post(new C20267WoI((Throwable) null, Arrays.asList(new V26[]{v26}), i4));
                    } else {
                        A002.A04.add(v26);
                    }
                } finally {
                    C13988Tno.A1V(readWriteLock);
                }
            }
        }
    }

    public W7i(EditText editText) {
        this.A03 = editText;
    }
}
