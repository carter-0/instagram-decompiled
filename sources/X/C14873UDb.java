package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.UDb  reason: case insensitive filesystem */
public final class C14873UDb extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final RecyclerView A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14873UDb(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.ad_tools_highlights_hub_see_all);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.ad_tools_highlights_hub_title);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.ad_tools_list_description);
        this.A04 = JTR.A0c(view, R.id.ad_tools_highlights_hub_recycler_view);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.ad_tools_list_divider);
    }
}
