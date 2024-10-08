package X;

import android.view.View;
import android.widget.RelativeLayout;
import com.instagram.android.R;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.MzJ  reason: case insensitive filesystem */
public final class C68052MzJ extends C249703kE {
    public static final /* synthetic */ AnonymousClass0YZ[] A06 = {C66580MXl.A16(C68052MzJ.class, "highlightTitle", "getHighlightTitle()Landroid/widget/TextView;")};
    public SpinnerImageView A00;
    public final RelativeLayout A01;
    public final IgImageButton A02;
    public final IgImageButton A03;
    public final 0w6 A04;
    public final C71662eb A05;

    public C68052MzJ(View view) {
        super(view);
        View requireViewById = view.requireViewById(R.id.preview_highlight_thumbnail);
        IgImageButton igImageButton = (IgImageButton) requireViewById;
        igImageButton.A00 = 0.75f;
        0qQ.A07(requireViewById);
        this.A02 = igImageButton;
        C71662eb A0T = DbY.A0T(view, R.id.highlight_title_stub);
        this.A05 = A0T;
        this.A04 = new C258293ym(A0T, R.id.preview_highlight_title);
        this.A01 = (RelativeLayout) AnonymousClass7TF.A0F(view, R.id.highlight_grid_create);
        this.A03 = (IgImageButton) AnonymousClass7TF.A0F(view, R.id.highlight_grid_create_icon);
        this.A00 = (SpinnerImageView) AnonymousClass7TF.A0F(view, R.id.item_loading_spinner);
    }
}
