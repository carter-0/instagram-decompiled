package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class SuC implements C13606TdY {
    public final int A00;
    public final C13605TdX A01;
    public final C13605TdX A02;
    public final C13605TdX A03;

    public final C7465QEu D75(ViewGroup viewGroup) {
        RecyclerView recyclerView;
        0qQ.A0B(viewGroup, 0);
        if (viewGroup instanceof RecyclerView) {
            Context context = viewGroup.getContext();
            RecyclerView recyclerView2 = new RecyclerView(new ContextThemeWrapper(context, this.A00));
            DbV.A1B(context, recyclerView2);
            recyclerView = recyclerView2;
        } else if (viewGroup instanceof LinearLayout) {
            LinearLayout linearLayout = new LinearLayout(new ContextThemeWrapper(viewGroup.getContext(), this.A00));
            linearLayout.setLayoutParams(viewGroup.getLayoutParams());
            recyclerView = linearLayout;
        } else {
            recyclerView = viewGroup;
        }
        View inflate = Pxi.A0F(viewGroup.getContext(), this.A00).inflate(R.layout.list_cell_item_row, recyclerView, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        C8110Qh2 qh2 = new C8110Qh2(inflate);
        C13605TdX tdX = this.A01;
        if (tdX != null) {
            qh2.A00 = tdX.D74(qh2.A03);
        }
        C13605TdX tdX2 = this.A02;
        if (tdX2 != null) {
            qh2.A01 = tdX2.D74(qh2.A04);
        }
        C13605TdX tdX3 = this.A03;
        if (tdX3 != null) {
            qh2.A02 = tdX3.D74(qh2.A05);
        }
        return qh2;
    }

    public SuC(C13605TdX tdX, C13605TdX tdX2, C13605TdX tdX3, int i) {
        this.A00 = i;
        this.A01 = tdX;
        this.A02 = tdX2;
        this.A03 = tdX3;
    }

    public SuC() {
        this((C13605TdX) null, (C13605TdX) null, (C13605TdX) null, 0);
    }
}
