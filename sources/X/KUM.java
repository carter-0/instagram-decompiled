package X;

import android.view.LayoutInflater;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;

public final class KUM extends C60692Jpd {
    public final LayoutInflater A00;
    public final IgLinearLayout A01;
    public final boolean A02;

    public KUM(View view, boolean z) {
        super(view);
        this.A02 = z;
        this.A01 = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.mk_insights_container);
        LayoutInflater A0D = DbV.A0D(view);
        0qQ.A07(A0D);
        this.A00 = A0D;
    }
}
