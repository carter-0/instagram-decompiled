package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JoB  reason: case insensitive filesystem */
public final class C60602JoB extends C249703kE {
    public final IgImageView A00;
    public final IgImageView A01;

    public C60602JoB(View view) {
        super(view);
        this.A00 = DbX.A0b(view, R.id.iglive_reactions_view_emoji);
        this.A01 = DbX.A0b(view, R.id.iglive_reactions_view_sticker);
    }
}
