package androidx.appcompat.widget;

import X.C13988Tno;
import X.C14070TpK;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.instagram.android.R;

public class AppCompatSeekBar extends SeekBar {
    public final C14070TpK A00;

    public synchronized void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        C14070TpK tpK = this.A00;
        if (tpK.A00 != null) {
            SeekBar seekBar = tpK.A05;
            int max = seekBar.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = tpK.A00.getIntrinsicWidth();
                int intrinsicHeight = tpK.A00.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                tpK.A00.setBounds(-i, -i2, i, i2);
                float width = ((float) ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) seekBar.getPaddingLeft(), (float) (seekBar.getHeight() / 2));
                int i3 = 0;
                do {
                    tpK.A00.draw(canvas);
                    canvas.translate(width, 0.0f);
                    i3++;
                } while (i3 <= max);
                canvas.restoreToCount(save);
            }
        }
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13988Tno.A0z(this);
        C14070TpK tpK = new C14070TpK(this);
        this.A00 = tpK;
        tpK.A02(attributeSet, i);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C14070TpK tpK = this.A00;
        Drawable drawable = tpK.A00;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = tpK.A05;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A00.A00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(Context context) {
        this(context, (AttributeSet) null);
    }
}
