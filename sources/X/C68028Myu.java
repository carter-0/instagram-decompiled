package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.Myu  reason: case insensitive filesystem */
public final class C68028Myu extends C249703kE {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final ConstraintLayout A04;
    public final C252063oV A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68028Myu(View view, boolean z) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A03 = AnonymousClass7TG.A0R(view, R.id.prompts_title);
        this.A02 = DbX.A0J(view, R.id.prompts_face_pile);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.prompts_divider);
        this.A05 = 2b1.A01(view.requireViewById(R.id.prompts_featured_prompt_preview_image_stub), false, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.requireViewById(R.id.prompts_button_container);
        this.A04 = constraintLayout;
        if (z) {
            view.getLayoutParams().width = DbU.A05(this.itemView).getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
            DbT.A1B(DbU.A05(this.itemView), view.getLayoutParams(), R.dimen.clips_grid_page_thumbnail_height_vertical);
            ((RoundedCornerConstraintLayout) view).setStrokeColor(0);
            DbT.A1B(DbU.A05(this.itemView), constraintLayout.getLayoutParams(), R.dimen.album_preview_add_item_margin);
        }
    }
}
