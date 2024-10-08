package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Uma  reason: case insensitive filesystem */
public final class C15993Uma extends C284395Mi {
    public final TextView A00;
    public final TextView A01;
    public final IgSimpleImageView A02;

    public C15993Uma(View view, Integer num, int i, int i2) {
        super(view);
        IgSimpleImageView igSimpleImageView;
        this.A01 = DbW.A0B(view, i);
        this.A00 = DbW.A0B(view, i2);
        if (num != null) {
            igSimpleImageView = (IgSimpleImageView) view.findViewById(num.intValue());
        } else {
            igSimpleImageView = null;
        }
        this.A02 = igSimpleImageView;
    }
}
