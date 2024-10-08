package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.EzC  reason: case insensitive filesystem */
public final class C49593EzC {
    public Runnable A00;
    public final View A01;
    public final TextView A02;
    public final IgSimpleImageView A03;

    public C49593EzC(View view) {
        this.A01 = view;
        this.A02 = DbU.A0G(view, R.id.text_steps_completed);
        this.A03 = (IgSimpleImageView) view.requireViewById(R.id.new_feature_red_dot);
    }
}
