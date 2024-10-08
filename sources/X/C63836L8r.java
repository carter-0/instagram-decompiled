package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.L8r  reason: case insensitive filesystem */
public final class C63836L8r {
    public TextView A00;
    public TextView A01;
    public RecyclerView A02;
    public IgdsBanner A03;
    public SpinnerImageView A04;

    public C63836L8r(Context context, AnonymousClass2tC r6, IgLinearLayout igLinearLayout, int i, boolean z) {
        RecyclerView recyclerView;
        boolean A1Y = DbW.A1Y(igLinearLayout);
        View inflate = View.inflate(context, R.layout.sticker_suggestion_hscroll_section, (ViewGroup) null);
        if (z) {
            igLinearLayout.addView(inflate, igLinearLayout.getChildCount() - (A1Y ? 1 : 0));
        } else {
            igLinearLayout.addView(inflate);
        }
        AnonymousClass7TG.A0R(inflate, R.id.suggestions_section_header).setText(i);
        this.A03 = (IgdsBanner) inflate.requireViewById(R.id.show_avatar_suggestions_banner);
        this.A01 = DbU.A0G(inflate, R.id.see_all_title);
        this.A04 = (SpinnerImageView) inflate.requireViewById(R.id.sticker_suggestion_row_loading_spinner);
        this.A00 = DbU.A0G(inflate, R.id.sticker_suggestions_no_results_text_view);
        AnonymousClass2t9 A002 = r6.A00();
        RecyclerView A0I = DbT.A0I(inflate, R.id.suggestions_hscroll_recyclerview);
        this.A02 = A0I;
        if (A0I != null) {
            A0I.setAdapter(A002);
        }
        RecyclerView recyclerView2 = this.A02;
        if (recyclerView2 != null) {
            DbV.A1A(context, recyclerView2);
        }
        RecyclerView recyclerView3 = this.A02;
        if (recyclerView3 != null) {
            recyclerView3.setNestedScrollingEnabled(false);
        }
        Resources resources = context.getResources();
        if (resources != null && (recyclerView = this.A02) != null && recyclerView.A12.size() == 0) {
            int A0D = AnonymousClass7TE.A0D(resources);
            RecyclerView recyclerView4 = this.A02;
            if (recyclerView4 != null) {
                JTP.A1D(recyclerView4, A0D * 2, A0D);
            }
        }
    }
}
