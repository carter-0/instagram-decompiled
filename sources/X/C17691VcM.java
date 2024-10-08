package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.VcM  reason: case insensitive filesystem */
public final class C17691VcM {
    public final View A00;
    public final ViewGroup A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final IgFrameLayout A06;
    public final C14879UDh A07;
    public final IgdsListCell A08;
    public final IgdsListCell A09;
    public final IgdsListCell A0A;

    public C17691VcM(ViewGroup viewGroup, View view) {
        0qQ.A0B(view, 1);
        this.A01 = viewGroup;
        this.A05 = DbW.A0B(view, R.id.inform_message_title);
        this.A03 = DbW.A0B(view, R.id.inform_message_body);
        this.A02 = DbW.A0B(view, R.id.actions_title);
        this.A08 = (IgdsListCell) AnonymousClass7TE.A0b(view, R.id.resource_section_one);
        this.A0A = (IgdsListCell) AnonymousClass7TE.A0b(view, R.id.resource_section_two);
        this.A09 = (IgdsListCell) AnonymousClass7TE.A0b(view, R.id.resource_section_three);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.divider);
        this.A04 = DbW.A0B(view, R.id.see_results_footer);
        this.A06 = (IgFrameLayout) AnonymousClass7TE.A0b(view, R.id.inner_container);
        this.A07 = new C14879UDh(view);
    }
}
