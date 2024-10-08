package X;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Jf6  reason: case insensitive filesystem */
public final class C60073Jf6 extends ConstraintLayout {
    public View A00;
    public ImageView A01;
    public IgdsButton A02;

    public final void setButton(IgdsButton igdsButton) {
        0qQ.A0B(igdsButton, 0);
        this.A02 = igdsButton;
    }

    public final void setDivider(View view) {
        0qQ.A0B(view, 0);
        this.A00 = view;
    }

    public final void setIcon(ImageView imageView) {
        0qQ.A0B(imageView, 0);
        this.A01 = imageView;
    }

    public final IgdsButton getButton() {
        return this.A02;
    }

    public final View getDivider() {
        return this.A00;
    }

    public final ImageView getIcon() {
        return this.A01;
    }
}
