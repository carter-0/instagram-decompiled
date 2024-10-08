package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.igds.components.button.IgdsButton;

public abstract class O33 {
    public static final void A00(IgdsButton igdsButton, int i) {
        Context A0C = JTP.A0C(igdsButton, 0);
        Drawable drawable = A0C.getDrawable(i);
        int A02 = DbS.A02(A0C, 16);
        if (drawable != null) {
            drawable.setBounds(0, 0, A02, A02);
        }
        igdsButton.setIcon(drawable, C273084lx.START);
        igdsButton.setIconPadding(AnonymousClass7TG.A03(A0C));
    }
}
