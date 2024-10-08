package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.imageview.ShapeableImageView;

public final class U3t extends ViewOutlineProvider {
    public final Rect A00 = new Rect();
    public final /* synthetic */ ShapeableImageView A01;

    public U3t(ShapeableImageView shapeableImageView) {
        this.A01 = shapeableImageView;
    }

    public final void getOutline(View view, Outline outline) {
        ShapeableImageView shapeableImageView = this.A01;
        C297895sX r1 = shapeableImageView.A07;
        if (r1 != null) {
            if (shapeableImageView.A06 == null) {
                shapeableImageView.A06 = new C297875sV(r1);
            }
            RectF rectF = shapeableImageView.A0E;
            Rect rect = this.A00;
            rectF.round(rect);
            shapeableImageView.A06.setBounds(rect);
            shapeableImageView.A06.getOutline(outline);
        }
    }
}
