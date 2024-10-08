package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.Ugs  reason: case insensitive filesystem */
public final class C15687Ugs extends C252233om {
    public int A00;
    public C238643Cr A01;
    public final List A02;
    public final C249403jg A03 = new UB1(this, 3);
    public final RecyclerView A04;

    public C15687Ugs(Context context, RecyclerView recyclerView) {
        0qQ.A0B(context, 1);
        this.A04 = recyclerView;
        this.A02 = 0sr.A1M(new C233952wk[]{new C16296UsG(context, this)});
    }

    public final void D6z(View view) {
        C238643Cr r2 = new C238643Cr(JTP.A0C(view, 0));
        r2.setVisibility(8);
        ((ViewGroup) view).addView(r2, new ViewGroup.LayoutParams(1, 1));
        this.A01 = r2;
        this.A04.A15(this.A03);
    }

    public final void onDestroyView() {
        C238643Cr r1 = this.A01;
        if (r1 != null) {
            r1.A02.clear();
            C226952iF r0 = r1.A00;
            if (r0 != null) {
                r0.AGE();
            }
            r1.A00 = null;
            this.A04.A16(this.A03);
            this.A01 = null;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
