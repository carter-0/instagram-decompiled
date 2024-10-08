package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.instagram.android.R;

public final class U5X extends RatingBar {
    public final C14071TpL A00;

    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.A00.A00;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public U5X(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        C13988Tno.A0z(this);
        C14071TpL tpL = new C14071TpL(this);
        this.A00 = tpL;
        tpL.A02(attributeSet, R.attr.ratingBarStyle);
    }
}
