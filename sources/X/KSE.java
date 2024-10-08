package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

public final class KSE extends IgdsMediaButton {
    public KSE(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        if (getBackground() != null && !isEnabled()) {
            Drawable background = getBackground();
            int i = 255;
            if (!z) {
                i = 77;
            }
            background.setAlpha(i);
        }
    }
}
