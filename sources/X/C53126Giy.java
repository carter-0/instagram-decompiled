package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Giy  reason: case insensitive filesystem */
public final class C53126Giy extends C249703kE {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgImageView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53126Giy(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = DbX.A0b(view, R.id.earned_achievement_list_item_image);
        this.A01 = DbX.A0Z(view, R.id.earned_achievement_list_item_title);
        this.A00 = DbX.A0Z(view, R.id.earned_achievement_list_item_date_earned);
    }
}
