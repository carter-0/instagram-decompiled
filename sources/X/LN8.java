package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

public final class LN8 {
    public IgSimpleImageView A00;
    public IgSimpleImageView A01;
    public IgTextView A02;
    public IgTextView A03;
    public AnonymousClass7SR A04;
    public IgdsButton A05;
    public IgdsButton A06;
    public C262204Co A07;
    public boolean A08 = true;
    public final View A09;
    public final C262224Cq A0A = 19E.A02(AnonymousClass12T.A00.A04);

    public LN8(View view, AnonymousClass7SR r3) {
        this.A09 = view;
        this.A04 = r3;
    }

    public static final void A00(View view, String str) {
        if (view == null) {
            return;
        }
        if (str != null) {
            view.setVisibility(0);
            if (view instanceof IgdsButton) {
                ((IgdsButton) view).setText(str);
            } else if (view instanceof IgTextView) {
                ((TextView) view).setText(str);
            }
        } else {
            view.setVisibility(8);
        }
    }
}
