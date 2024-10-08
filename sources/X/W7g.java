package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

public final class W7g implements TextWatcher {
    public final /* synthetic */ U66 A00;

    public W7g(U66 u66) {
        this.A00 = u66;
    }

    public final void afterTextChanged(Editable editable) {
        ArrayList arrayList;
        U66 u66 = this.A00;
        if (!u66.A0G && (arrayList = u66.A0C) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList arrayList;
        U66 u66 = this.A00;
        if (!u66.A0G && (arrayList = u66.A0C) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ArrayList arrayList;
        KeyListener keyListener = U66.A0V;
        U66 u66 = this.A00;
        if (!u66.A0G && (arrayList = u66.A0C) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
            }
        }
        U66.A01(u66);
    }
}
