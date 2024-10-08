package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.UDs  reason: case insensitive filesystem */
public final class C14890UDs extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final RecyclerView A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14890UDs(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.feed_product_pivots_title);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.feed_product_pivots_title_divider);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.feed_product_pivots_title_action);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.feed_product_pivots_button);
        this.A04 = JTR.A0c(view, R.id.products_recyclerview);
    }
}
