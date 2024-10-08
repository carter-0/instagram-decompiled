package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.Su9  reason: case insensitive filesystem */
public final class C12425Su9 implements C13606TdY {
    public final int A00;
    public final SparseArray A01;

    public final C7465QEu D75(ViewGroup viewGroup) {
        RecyclerView recyclerView;
        0qQ.A0B(viewGroup, 0);
        if (viewGroup instanceof RecyclerView) {
            Context context = viewGroup.getContext();
            RecyclerView recyclerView2 = new RecyclerView(new ContextThemeWrapper(context, this.A00));
            DbV.A1B(context, recyclerView2);
            recyclerView = recyclerView2;
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout frameLayout = new FrameLayout(new ContextThemeWrapper(viewGroup.getContext(), this.A00));
            frameLayout.setLayoutParams(viewGroup.getLayoutParams());
            recyclerView = frameLayout;
        } else {
            recyclerView = viewGroup;
        }
        View inflate = Pxi.A0F(viewGroup.getContext(), this.A00).inflate(R.layout.container_cell_item_row, recyclerView, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C8108Qh0(inflate, this.A01);
    }

    public C12425Su9(SparseArray sparseArray, int i) {
        this.A00 = i;
        this.A01 = sparseArray;
    }
}
