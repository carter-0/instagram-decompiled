package X;

import android.widget.AutoCompleteTextView;

/* renamed from: X.FfI  reason: case insensitive filesystem */
public final class C50602FfI implements G61 {
    public final /* synthetic */ AutoCompleteTextView A00;
    public final /* synthetic */ C50515Fdb A01;
    public final /* synthetic */ E3Y A02;
    public final /* synthetic */ C46634DiE A03;

    public C50602FfI(AutoCompleteTextView autoCompleteTextView, C50515Fdb fdb, E3Y e3y, C46634DiE diE) {
        this.A02 = e3y;
        this.A00 = autoCompleteTextView;
        this.A03 = diE;
        this.A01 = fdb;
    }

    public final void Ct3(G8G g8g) {
        DbS.A1C(this.A00);
        C49669F1b f1b = C49669F1b.A00;
        E3Y e3y = this.A02;
        G8G g8g2 = g8g;
        f1b.A00(e3y, e3y.A05, this.A01, g8g2, new C50603FfJ(this, 1), this.A03);
    }
}
