package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.GjK  reason: case insensitive filesystem */
public final class C53148GjK extends C249703kE {
    public final Context A00;
    public final View A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgImageView A05;
    public final IgImageView A06;
    public final IgImageView A07;
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new C73918Ply(this, 44));

    public C53148GjK(View view) {
        super(view);
        this.A01 = view;
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A07 = DbX.A0b(view, R.id.thumbnail);
        this.A02 = DbX.A0Y(view, R.id.empty_wishlist_collection_thumbnail);
        this.A04 = DbX.A0Z(view, R.id.title);
        this.A03 = DbX.A0Z(view, R.id.subtitle);
        this.A05 = DbX.A0b(view, R.id.facepile);
        this.A06 = DbX.A0b(view, R.id.save_toggle_button);
        2eS.A01(view);
    }
}
