package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.OQr  reason: case insensitive filesystem */
public abstract class C70899OQr {
    public static final C240563Lj A00(Context context) {
        0qQ.A0B(context, 0);
        Drawable drawable = context.getDrawable(R.drawable.instagram_heart_pano_filled_24);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            mutate.setTint(AnonymousClass7TF.A03(context, R.attr.igds_color_icon_badge));
            int A08 = C51972G9s.A08(context);
            int A03 = AnonymousClass7TG.A03(context);
            int i = (A03 * 2) + A08;
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(context.getColor(2Yu.A0C(context)));
            int i2 = A08 + A03;
            mutate.setBounds(A03, A03, i2, i2);
            mutate.draw(canvas);
            0qQ.A07(createBitmap);
            return new C240563Lj(createBitmap, false);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A01(View view, ViewGroup viewGroup, AnonymousClass61R r10, IgSimpleImageView igSimpleImageView) {
        0qQ.A0B(r10, 0);
        if (r10.isPlaying()) {
            r10.stop();
            r10.EL2(0.0f);
        }
        igSimpleImageView.setImageDrawable(r10);
        int dimensionPixelSize = DbU.A05(igSimpleImageView).getDimensionPixelSize(R.dimen.album_preview_view_width);
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        igSimpleImageView.setTranslationX(((float) (iArr[0] - iArr2[0])) - (((float) (dimensionPixelSize - view.getWidth())) / 2.0f));
        igSimpleImageView.setTranslationY(((float) (iArr[1] - iArr2[1])) - ((float) dimensionPixelSize));
        r10.A8s(new C69202Nh0(viewGroup, 3));
        viewGroup.setVisibility(0);
        r10.E2p();
    }
}
