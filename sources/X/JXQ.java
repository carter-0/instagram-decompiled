package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class JXQ {
    public static final JXQ A00 = new Object();

    public static final C59738JVw A00(IgImageView igImageView) {
        0qQ.A0B(igImageView, 0);
        return new C59738JVw(new PorterDuffColorFilter(igImageView.getContext().getColor(R.color.action_bar_semi_transparent_white), PorterDuff.Mode.SRC_ATOP), igImageView);
    }

    public static final void A02(C376529Ii r2, C59738JVw jVw) {
        0qQ.A0B(jVw, 0);
        jVw.A06 = false;
        if (r2.A03 == AnonymousClass05K.A00) {
            IgImageView igImageView = jVw.A07;
            igImageView.setBackgroundColor(igImageView.getContext().getColor(R.color.baseline_neutral_80));
        }
        View.OnLayoutChangeListener onLayoutChangeListener = jVw.A02;
        if (onLayoutChangeListener != null) {
            jVw.A07.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        jVw.A07.setImageResource(R.color.fds_transparent);
    }

    public final void A03(Bitmap bitmap, C376529Ii r16, C59738JVw jVw, C62320sa r18, int i) {
        C59738JVw jVw2 = jVw;
        0qQ.A0B(jVw2, 0);
        jVw2.A06 = true;
        C376529Ii r3 = r16;
        if (r3.A03 == AnonymousClass05K.A00) {
            IgImageView igImageView = jVw2.A07;
            igImageView.setBackgroundColor(igImageView.getContext().getColor(R.color.baseline_neutral_80));
        }
        View.OnLayoutChangeListener onLayoutChangeListener = jVw2.A02;
        if (onLayoutChangeListener != null) {
            jVw2.A07.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        IgImageView igImageView2 = jVw2.A07;
        Bitmap bitmap2 = bitmap;
        C62320sa r5 = r18;
        int i2 = i;
        if (igImageView2.getParent().isLayoutRequested() || igImageView2.getWidth() <= 0 || igImageView2.getHeight() <= 0) {
            JYQ jyq = new JYQ(bitmap, r3, igImageView2, jVw2, r5, i2);
            igImageView2.addOnLayoutChangeListener(jyq);
            jVw2.A02 = jyq;
            return;
        }
        A01(bitmap2, r3, jVw2, r5, i2, igImageView2.getWidth(), igImageView2.getHeight());
    }

    public static final void A01(Bitmap bitmap, C376529Ii r12, C59738JVw jVw, C62320sa r14, int i, int i2, int i3) {
        Matrix matrix;
        IgImageView igImageView = jVw.A07;
        int intValue = ((Number) r12.A04).intValue();
        int i4 = i2;
        int i5 = i3;
        if (intValue == 0) {
            float f = (float) i;
            float width = (float) bitmap.getWidth();
            float height = (float) bitmap.getHeight();
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            float f2 = (float) i4;
            float f3 = f2 / width;
            float f4 = (float) i5;
            float f5 = f4 / height;
            if (f3 < f5) {
                f3 = f5;
            }
            float f6 = width * f3;
            float f7 = f3 * height;
            float f8 = (f2 - f6) / 2.0f;
            float f9 = (f4 - f7) / 2.0f;
            RectF rectF2 = new RectF(f8, f9, f6 + f8, f7 + f9);
            matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            matrix.postRotate(f, f2 / 2.0f, f4 / 2.0f);
        } else if (intValue == 1) {
            matrix = AnonymousClass8XE.A03(i, bitmap.getWidth(), bitmap.getHeight(), i4, i5);
        } else {
            throw new RuntimeException();
        }
        igImageView.setImageMatrix(matrix);
        igImageView.setImageBitmap(bitmap);
        if (r14 != null) {
            r14.invoke();
        }
    }
}
