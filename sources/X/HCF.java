package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.GradientDrawable;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.gradient.IGGradientView;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

public final class HCF extends GIH {
    public Path A00 = C51965G9l.A0C();
    public final int A01;
    public final GradientDrawable A02;

    public HCF(Context context, ImageUrl imageUrl, boolean z) {
        super(context, (GJO) null, context.getResources().getDimensionPixelSize(R.dimen.intent_aware_ad_rifu_card_large_width), 0, 0, 0, 0, -1, z);
        A04(imageUrl);
        this.A01 = DbY.A01(context);
        this.A02 = IGGradientView.A00.A01(GradientDrawable.Orientation.BOTTOM_TOP, 178);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        int save = canvas.save();
        canvas.clipPath(this.A00);
        super.draw(canvas);
        this.A02.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Deprecated(message = "Use the version that takes a ColorFilter instead.", replaceWith = @ReplaceWith(expression = "setColorFilter", imports = {}))
    public final int getOpacity() {
        return -2;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A02.setBounds(i, (this.A08 / 3) + i2, i3, i4);
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = (float) i3;
        float f4 = (float) i4;
        Path A0C = C51965G9l.A0C();
        float f5 = (float) this.A01;
        float f6 = f5 + f;
        A0C.moveTo(f6, f2);
        A0C.lineTo(f3 - f5, f2);
        float f7 = f5 + f2;
        A0C.quadTo(f3, f2, f3, f7);
        A0C.lineTo(f3, f4);
        A0C.lineTo(f, f4);
        A0C.lineTo(f, f7);
        A0C.quadTo(f, f2, f6, f2);
        this.A00 = A0C;
    }
}
