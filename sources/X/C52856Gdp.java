package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gdp  reason: case insensitive filesystem */
public final class C52856Gdp extends ViewOutlineProvider {
    public final /* synthetic */ IgImageView A00;

    public final void getOutline(View view, Outline outline) {
        AnonymousClass7TF.A1H(view, outline);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 0nA.A04(AnonymousClass7TE.A0S(this.A00), 12));
    }

    public C52856Gdp(IgImageView igImageView) {
        this.A00 = igImageView;
    }
}
