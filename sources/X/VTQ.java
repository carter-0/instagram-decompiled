package X;

import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;

public final class VTQ {
    public final View A00;
    public final IgMultiImageButton A01;

    public VTQ(FrameLayout frameLayout, IgMultiImageButton igMultiImageButton) {
        this.A01 = igMultiImageButton;
        this.A00 = AnonymousClass7TE.A0b(frameLayout, R.id.overlay_text);
        igMultiImageButton.setEnableTouchOverlay(false);
    }
}
