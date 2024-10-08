package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

public final class P3B implements C74451Pv6 {
    public final /* synthetic */ OLZ A00;

    public P3B(OLZ olz) {
        this.A00 = olz;
    }

    public final void Doi(List list, String str) {
        OLZ olz = this.A00;
        if (olz.A00 == C69286Nim.SEARCH) {
            C71020OYv.A01(olz.A02.A00, str, list, 2131968420);
        }
    }

    public final void onFail(C268654dm r5) {
        C71020OYv oYv = this.A00.A02.A00;
        View view = oYv.A00;
        if (view != null) {
            view.setVisibility(8);
        }
        RecyclerView recyclerView = oYv.A01;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        View view2 = oYv.A00;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        AnonymousClass7TF.A16(oYv.A02);
        IgTextView igTextView = oYv.A02;
        if (igTextView != null) {
            C66581MXm.A15(oYv.A05, igTextView, 2131968420);
        }
    }

    public final void onStart() {
        C71020OYv oYv = this.A00.A02.A00;
        RecyclerView recyclerView = oYv.A01;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        IgTextView igTextView = oYv.A02;
        if (igTextView != null) {
            igTextView.setVisibility(8);
        }
        AnonymousClass7TF.A16(oYv.A00);
    }
}
