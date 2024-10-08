package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.8Co  reason: invalid class name and case insensitive filesystem */
public final class C352248Co extends IgFrameLayout {
    public int A00 = R.drawable.instagram_circle_block_pano_outline_24;
    public boolean A01 = true;
    public final IgFrameLayout A02;
    public final IgImageView A03;

    public C352248Co(Context context, int i) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.immersive_photo_control_button, this);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout");
        IgFrameLayout igFrameLayout = (IgFrameLayout) inflate;
        this.A02 = igFrameLayout;
        IgImageView requireViewById = igFrameLayout.requireViewById(R.id.immersive_photo_control_button_icon);
        0qQ.A07(requireViewById);
        this.A03 = requireViewById;
        A00();
        this.A00 = i;
    }

    private final void A00() {
        IgImageView igImageView;
        int i;
        boolean z = this.A01;
        IgFrameLayout igFrameLayout = this.A02;
        if (z) {
            igFrameLayout.setScaleX(1.25f);
            igFrameLayout.setScaleY(1.25f);
            Context context = getContext();
            0qQ.A07(context);
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), this.A00);
            0qQ.A07(decodeResource);
            Bitmap A002 = C267014am.A00(context, decodeResource);
            igImageView = this.A03;
            igImageView.setImageBitmap(A002);
            igImageView.clearColorFilter();
            i = R.drawable.immersive_photo_control_button_active_background;
        } else {
            igFrameLayout.setScaleX(1.0f);
            igFrameLayout.setScaleY(1.0f);
            igImageView = this.A03;
            igImageView.setImageResource(this.A00);
            Context context2 = getContext();
            igImageView.setColorFilter(context2.getColor(2Yu.A0H(context2, R.attr.igds_color_icon_on_media)));
            i = R.drawable.immersive_photo_control_button_inactive_background;
        }
        igImageView.setBackgroundResource(i);
    }

    public final void setActive(boolean z) {
        this.A01 = z;
        A00();
    }
}
