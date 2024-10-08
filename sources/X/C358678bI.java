package X;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.View;

/* renamed from: X.8bI  reason: invalid class name and case insensitive filesystem */
public final class C358678bI implements TextWatcher {
    public int A00;
    public boolean A01;
    public final C71662eb A02;
    public final C358668bH A03;

    public final void afterTextChanged(Editable editable) {
        0qQ.A0B(editable, 0);
        if (this.A01) {
            int A002 = C379039Se.A00(editable);
            int[] iArr = AnonymousClass91M.A02;
            CharSequence A05 = AnonymousClass91M.A05(Selection.getSelectionEnd(editable) - 1, editable);
            if (A002 >= 0 || !(A05 == null || A05.length() == 0)) {
                C71662eb r2 = this.A02;
                C294975nL.A04((C295005nO) null, new View[]{r2.A01()}, true);
                r2.A01().setTranslationY((float) this.A00);
                C358368an r0 = this.A03.A00;
                C358368an.A0I(r0, true);
                C294975nL.A05(new View[]{r0.A1m}, true);
                return;
            }
            C294975nL.A05(new View[]{this.A02.A01()}, true);
            C358368an r02 = this.A03.A00;
            C358368an.A0C(r02);
            C294975nL.A04((C295005nO) null, new View[]{r02.A1m}, true);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C358678bI(C71662eb r1, C358668bH r2) {
        this.A03 = r2;
        this.A02 = r1;
    }
}
