package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.KLu  reason: case insensitive filesystem */
public final class C61781KLu extends C60680JpR {
    public final UserSession A00;
    public final IgTextView A01;
    public final IgImageView A02;

    public C61781KLu(View view, UserSession userSession) {
        super(view);
        this.A00 = userSession;
        IgImageView A0i = JTR.A0i(view, R.id.color_filter_image_view);
        this.A02 = A0i;
        this.A01 = Dba.A0E(view, R.id.color_filter_name_text);
        A0i.setScaleType(ImageView.ScaleType.CENTER_CROP);
        A0i.setForeground(view.getContext().getDrawable(R.drawable.color_filter_image_forground));
    }
}
