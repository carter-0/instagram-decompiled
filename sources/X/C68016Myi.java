package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Myi  reason: case insensitive filesystem */
public final class C68016Myi extends C249703kE {
    public final LinearLayout.LayoutParams A00;
    public final LinearLayout.LayoutParams A01;
    public final TextView A02;
    public final TextView A03;
    public final IgImageView A04;

    public C68016Myi(View view) {
        super(view);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.command_row_title);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.command_row_description);
        IgImageView A0b = DbX.A0b(view, R.id.command_row_image_view);
        this.A04 = A0b;
        Resources resources = A0b.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(dimensionPixelSize);
        layoutParams.setMarginEnd(dimensionPixelSize);
        layoutParams.topMargin = dimensionPixelSize2;
        layoutParams.bottomMargin = dimensionPixelSize2;
        this.A00 = layoutParams;
        int A0B = AnonymousClass7TE.A0B(resources);
        int A0F = AnonymousClass7TE.A0F(resources);
        int A0D = AnonymousClass7TE.A0D(resources);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(A0B);
        layoutParams2.setMarginEnd(A0F);
        layoutParams2.topMargin = A0D;
        layoutParams2.bottomMargin = A0D;
        this.A01 = layoutParams2;
    }
}
