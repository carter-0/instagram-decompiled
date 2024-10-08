package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.8PT  reason: invalid class name */
public abstract class AnonymousClass8PT {
    public static final IgdsMediaButton A00(Context context, Integer num) {
        int generateViewId;
        IgdsMediaButton igdsMediaButton = new IgdsMediaButton(context, (AttributeSet) null, 0);
        igdsMediaButton.setSize(C296245pk.LARGE);
        igdsMediaButton.setButtonStyle(C296235pj.CREATION_FLOW);
        igdsMediaButton.setLayoutParams(new C71492dQ(-2, -2));
        if (num != null) {
            generateViewId = num.intValue();
        } else {
            generateViewId = View.generateViewId();
        }
        igdsMediaButton.setId(generateViewId);
        return igdsMediaButton;
    }
}
