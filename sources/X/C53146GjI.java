package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.GjI  reason: case insensitive filesystem */
public final class C53146GjI extends C249703kE {
    public final View A00;
    public final RecyclerView A01;
    public final IgTextView A02;
    public final C59586JPg A03;
    public final AnonymousClass0eM A04 = C58673Ivi.A00(this, 20);
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(G2Y.A00);
    public final AnonymousClass0eM A06 = C58673Ivi.A00(this, 21);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53146GjI(View view, C59586JPg jPg) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A03 = jPg;
        this.A02 = DbX.A0Z(view, R.id.creator_inspiration_hub_reels_section_header_title);
        this.A01 = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.creator_inspiration_hub_reels_hscroll_recycler_view);
    }
}
