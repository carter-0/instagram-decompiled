package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;

public final class Q9x extends LinearLayout implements C13601TdT {
    public C8030Qfa A00;

    public void setViewModel(C8030Qfa qfa) {
        0qQ.A0B(qfa, 0);
        this.A00 = qfa;
        View A0G = AnonymousClass7TF.A0G(this, R.id.card_scan_container);
        A0G.setOnClickListener(C11496SbJ.A00(this, 2));
        Context A0S = AnonymousClass7TE.A0S(this);
        int A002 = SSH.A00(A0S, R.attr.fbpay_ui_card_scan_cell_padding);
        int A003 = SSH.A00(A0S, R.attr.fbpay_ui_card_scan_cell_padding_top);
        int A004 = SSH.A00(A0S, R.attr.fbpay_ui_card_scan_cell_padding_left);
        C8030Qfa qfa2 = this.A00;
        if (qfa2 == null) {
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        if (qfa2.A00) {
            A004 = 0;
        } else {
            A003 = A002;
        }
        Integer valueOf = Integer.valueOf(A004);
        Integer valueOf2 = Integer.valueOf(A002);
        SSH.A02(A0G, valueOf, valueOf2, Integer.valueOf(A003), valueOf2);
    }
}
