package X;

import android.text.Editable;
import android.widget.Filter;
import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.Aga  reason: case insensitive filesystem */
public final class C40660Aga implements C358588b9 {
    public final /* synthetic */ C379049Sf A00;

    public final boolean Dbf(AnonymousClass05V r2) {
        return false;
    }

    public C40660Aga(C379049Sf r1) {
        this.A00 = r1;
    }

    public final void DMp() {
        this.A00.A0J.DMp();
    }

    public final void Diq(ConstrainedEditText constrainedEditText, int i, int i2) {
        Editable text = constrainedEditText.getText();
        if (text.length() == 0) {
            return;
        }
        if (i > 0) {
            C379049Sf r1 = this.A00;
            ((Filter) r1.A0M.getValue()).filter(text);
            r1.A0H.A00(constrainedEditText);
            A6B a6b = r1.A0I;
            if (!a6b.A01) {
                a6b.A02.CkS();
                a6b.A01 = true;
                return;
            }
            return;
        }
        constrainedEditText.setSelection(1, Math.max(i2, 1));
    }
}
