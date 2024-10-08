package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.VXr  reason: case insensitive filesystem */
public final class C17488VXr {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final IgImageView A03;

    public C17488VXr(View view) {
        this.A00 = view;
        this.A03 = DbX.A0b(view, R.id.header_image);
        this.A02 = DbX.A0J(view, R.id.back_button);
        this.A01 = DbX.A0J(view, R.id.audio_button);
    }
}
