package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.9Yq  reason: invalid class name and case insensitive filesystem */
public final class C380559Yq extends C249703kE {
    public final U10 A00;
    public final IgImageView A01;
    public final IgImageView A02;
    public final RoundedCornerFrameLayout A03;
    public final Context A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C380559Yq(View view, Context context) {
        super(view);
        0qQ.A0B(view, 1);
        this.A04 = context;
        this.A03 = (RoundedCornerFrameLayout) AnonymousClass7TE.A0b(view, R.id.canvas_templates_item_container);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.canvas_template_image);
        IgImageView A0F = AnonymousClass7TF.A0F(view, R.id.canvas_templates_item_dim);
        this.A01 = A0F;
        int A0F2 = AnonymousClass7TE.A0F(context.getResources());
        U10 u10 = new U10();
        this.A00 = u10;
        u10.A01 = A0F2;
        u10.A02 = 77;
        A0F.setImageDrawable(u10);
    }
}
