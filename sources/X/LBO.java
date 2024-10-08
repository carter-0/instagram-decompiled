package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;

public final class LBO {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final Button A04;
    public final RecyclerView A05;
    public final RecyclerView A06;
    public final IgSimpleImageView A07;
    public final IgTextView A08;
    public final IgTextView A09;
    public final IgTextView A0A;
    public final IgTextView A0B;
    public final C3497981v A0C;
    public final C3497981v A0D;
    public final C3497981v A0E;
    public final IgSegmentedTabLayout A0F;

    public LBO(View view) {
        View A0G = AnonymousClass7TF.A0G(view, R.id.media_drafts_header);
        this.A02 = A0G;
        this.A0B = DbX.A0Z(A0G, R.id.media_drafts_title);
        this.A0A = DbX.A0Z(A0G, R.id.media_drafts_subtitle);
        this.A0C = new C3497981v(AnonymousClass7TF.A0G(A0G, R.id.media_drafts_back_button));
        this.A0E = new C3497981v(AnonymousClass7TF.A0G(A0G, R.id.media_drafts_multiselect_button));
        this.A0D = new C3497981v(AnonymousClass7TF.A0G(A0G, R.id.media_drafts_info_button));
        this.A08 = DbX.A0Z(view, R.id.draft_instructions);
        ViewGroup A0I = DbX.A0I(view, R.id.empty_drafts);
        this.A03 = A0I;
        this.A07 = DbX.A0Y(A0I, R.id.empty_drafts_icon);
        this.A09 = DbX.A0Z(A0I, R.id.empty_drafts_description);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.discard_drafts_container);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.discard_drafts_divider);
        this.A04 = (Button) AnonymousClass7TF.A0F(view, R.id.discard_drafts);
        this.A0F = (IgSegmentedTabLayout) AnonymousClass7TF.A0F(view, R.id.draft_tab_view);
        this.A05 = JTR.A0c(view, R.id.draft_recycler_view);
        this.A06 = JTR.A0c(view, R.id.schedule_recycler_view);
    }
}
