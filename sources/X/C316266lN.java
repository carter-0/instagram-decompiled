package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.6lN  reason: invalid class name and case insensitive filesystem */
public final class C316266lN extends ViewOutlineProvider {
    public final /* synthetic */ RoundedCornerImageView A00;

    public final void getOutline(View view, Outline outline) {
        0qQ.A0B(view, 0);
        0qQ.A0B(outline, 1);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00.A00);
    }

    public C316266lN(RoundedCornerImageView roundedCornerImageView) {
        this.A00 = roundedCornerImageView;
    }
}
