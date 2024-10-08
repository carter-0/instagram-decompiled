package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.UpR  reason: case insensitive filesystem */
public final class C16140UpR extends VTC {
    public final Drawable A00;
    public final TextView A01;
    public final IgImageView A02;
    public final IgImageView A03;

    public C16140UpR(FrameLayout frameLayout, UserSession userSession) {
        super(frameLayout);
        0Tu r5 = 0Tu.A05;
        boolean booleanValue = AnonymousClass7TF.A0R(r5, userSession, 36322521242413288L).booleanValue();
        int i = R.id.image_view;
        if (booleanValue) {
            DbT.A1F(frameLayout, R.id.rounded_corner_frame_layout, 0);
            i = R.id.rounded_corner_image_view;
        }
        IgImageView A0b = DbT.A0b(frameLayout, i);
        this.A02 = A0b;
        A0b.setVisibility(0);
        this.A01 = DbU.A0G(frameLayout, R.id.text_view);
        this.A03 = DbT.A0b(frameLayout, R.id.private_story_image_view);
        boolean booleanValue2 = AnonymousClass7TF.A0R(r5, userSession, 36322521242413288L).booleanValue();
        Context context = frameLayout.getContext();
        if (booleanValue2) {
            Drawable mutate = context.getDrawable(R.drawable.instagram_eye_pano_outline_24).mutate();
            DbX.A11(context, mutate, R.color.design_dark_default_color_on_background);
            Paint paint = AnonymousClass3JT.A00;
            Bitmap A0B = AnonymousClass7TF.A0B(mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
            Canvas canvas = new Canvas(A0B);
            mutate.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            mutate.draw(canvas);
            Resources resources = frameLayout.getResources();
            this.A00 = new BitmapDrawable(resources, C9161RRm.A00(A0B, Math.round(TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()))));
            return;
        }
        Drawable mutate2 = context.getDrawable(R.drawable.viewers_icon).mutate();
        this.A00 = mutate2;
        DbX.A11(context, mutate2, R.color.design_dark_default_color_on_background);
    }
}
