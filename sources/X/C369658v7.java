package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.8v7  reason: invalid class name and case insensitive filesystem */
public final class C369658v7 extends C299875vz {
    public boolean A00;
    public final int A01;
    public final LevelListDrawable A02;
    public final LwM A03;
    public final Context A04;

    public C369658v7(Context context, LwM lwM) {
        LevelListDrawable levelListDrawable;
        0qQ.A0B(lwM, 2);
        this.A04 = context;
        this.A03 = lwM;
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        Drawable drawable = context.getDrawable(lwM.A00.A00);
        if (drawable instanceof LevelListDrawable) {
            levelListDrawable = (LevelListDrawable) drawable;
        } else {
            levelListDrawable = null;
        }
        this.A02 = levelListDrawable;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A00) {
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, 1.0f);
            matrix.postTranslate((float) canvas.getWidth(), 0.0f);
            canvas.save();
            canvas.concat(matrix);
            LevelListDrawable levelListDrawable = this.A02;
            if (levelListDrawable != null) {
                levelListDrawable.draw(canvas);
            }
            canvas.restore();
            return;
        }
        LevelListDrawable levelListDrawable2 = this.A02;
        if (levelListDrawable2 != null) {
            levelListDrawable2.draw(canvas);
        }
    }

    public final List A07() {
        return 0sr.A1N(this.A02);
    }

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        LevelListDrawable levelListDrawable = this.A02;
        if (levelListDrawable != null) {
            int i5 = this.A01;
            levelListDrawable.setBounds(i, i2, i + i5, i5 + i2);
        }
    }
}
