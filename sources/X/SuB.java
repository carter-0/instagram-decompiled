package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class SuB implements C13606TdY {
    public final C13605TdX A00;
    public final C13605TdX A01;

    public final C7465QEu D75(ViewGroup viewGroup) {
        View inflate = Pxi.A0F(JTP.A0C(viewGroup, 0), 0).inflate(R.layout.card_cell_item_row, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        C8109Qh1 qh1 = new C8109Qh1(inflate);
        C13605TdX tdX = this.A01;
        if (tdX != null) {
            qh1.A01 = tdX.D74(qh1.A03);
        }
        C13605TdX tdX2 = this.A00;
        if (tdX2 != null) {
            qh1.A00 = tdX2.D74(qh1.A02);
        }
        return qh1;
    }

    public SuB(C13605TdX tdX, C13605TdX tdX2) {
        this.A01 = tdX;
        this.A00 = tdX2;
    }

    public SuB() {
        this((C13605TdX) null, (C13605TdX) null);
    }
}
