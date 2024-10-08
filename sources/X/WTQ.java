package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import com.instagram.android.R;

public final class WTQ implements C262424Dq {
    public final ImageView A00;

    public final void CyE(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        ImageView imageView = this.A00;
        Context context = imageView.getContext();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        AnonymousClass7TE.A1N(context, paint, R.color.design_dark_default_color_on_background);
        paint.setStrokeWidth(0.0f);
        OvalShape ovalShape = new OvalShape();
        boolean z = 1MF.A02;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Pxi.A0v(paint, PorterDuff.Mode.SRC_OUT);
        ovalShape.resize((float) width, (float) height);
        ovalShape.draw(canvas, paint);
        imageView.setImageBitmap(createBitmap);
    }

    public WTQ(ImageView imageView) {
        this.A00 = imageView;
    }
}
