package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.thumbnailview.ThumbnailView;

/* renamed from: X.Hoy  reason: case insensitive filesystem */
public final class C55877Hoy {
    public IgTextView A00;
    public IgImageView A01;
    public final int A02;
    public final int A03;
    public final ViewGroup A04;
    public final ImageView A05;
    public final TextView A06;
    public final C252063oV A07;
    public final C252063oV A08;
    public final ThumbnailView A09;

    public C55877Hoy(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 1);
        this.A04 = viewGroup;
        this.A09 = (ThumbnailView) AnonymousClass7TF.A0F(viewGroup, R.id.saved_collection_thumbnail);
        this.A06 = AnonymousClass7TG.A0R(viewGroup, R.id.saved_collection_name);
        this.A08 = 2b1.A00(viewGroup.requireViewById(R.id.saved_collection_glyph_stub));
        C252063oV A002 = 2b1.A00(viewGroup.requireViewById(R.id.saved_collection_context_stub));
        this.A07 = A002;
        A002.EeU(new C72245OzD(this, 7));
        this.A05 = DbU.A0F(viewGroup, R.id.saved_collection_icon);
        this.A02 = AnonymousClass7TE.A0B(viewGroup.getResources());
        this.A03 = 2Yu.A09(viewGroup.getContext());
        2eS.A01(viewGroup);
    }
}
