package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.instagram.creation.photo.crop.CropImageView;

/* renamed from: X.JbH  reason: case insensitive filesystem */
public abstract class C59892JbH {
    public static final RectF A00(RectF rectF, CropImageView cropImageView, int i, int i2, int i3) {
        float width;
        float width2;
        float height;
        Matrix matrix = cropImageView.A07;
        Matrix matrix2 = cropImageView.A08;
        C59894JbJ jbJ = cropImageView.A0G;
        float f = 0.0f;
        RectF rectF2 = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        matrix2.mapRect(rectF2);
        RectF A0Y = AnonymousClass7TE.A0Y();
        matrix.mapRect(A0Y, rectF);
        int A01 = jbJ.A01();
        int A00 = jbJ.A00();
        if (cropImageView.A00 < 1.0f) {
            float A002 = C51967G9n.A00(A0Y.width(), A0Y.height() * cropImageView.A00);
            A0Y.left += A002;
            A0Y.right -= A002;
        }
        float f2 = rectF2.left;
        float f3 = A0Y.left;
        if (f2 > f3) {
            width2 = (float) A01;
            width = 0.0f;
        } else {
            float f4 = (float) A01;
            width = ((f3 - f2) * f4) / rectF2.width();
            width2 = width + (((A0Y.right - A0Y.left) * f4) / rectF2.width());
        }
        if (cropImageView.A00 > 1.0f) {
            float A003 = C51967G9n.A00(A0Y.height(), A0Y.width() / cropImageView.A00);
            A0Y.top += A003;
            A0Y.bottom -= A003;
        }
        float f5 = rectF2.top;
        float f6 = A0Y.top;
        if (f5 > f6) {
            height = (float) A00;
        } else {
            float f7 = f6 - f5;
            float f8 = (float) A00;
            f = (f7 * f8) / rectF2.height();
            height = (((A0Y.bottom - A0Y.top) * f8) / rectF2.height()) + f;
        }
        A0Y.set(width, f, width2, height);
        if (i3 != 0) {
            Matrix A0U = AnonymousClass7TE.A0U();
            A0U.reset();
            if (jbJ.A00 != 0) {
                A0U.postTranslate(((float) (-jbJ.A01())) / 2.0f, ((float) (-jbJ.A00())) / 2.0f);
                A0U.postRotate(-((float) jbJ.A00));
                Bitmap bitmap = jbJ.A01;
                if (bitmap != null) {
                    float A02 = JTO.A02(bitmap) / 2.0f;
                    Bitmap bitmap2 = jbJ.A01;
                    if (bitmap2 != null) {
                        A0U.postTranslate(A02, JTO.A01(bitmap2) / 2.0f);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            A0U.mapRect(A0Y);
        }
        return A0Y;
    }

    public static final AnonymousClass34S A01(Bitmap bitmap, float f, int i) {
        int height;
        int width;
        float f2;
        float f3;
        if ((i / 90) % 2 == 0) {
            height = bitmap.getWidth();
            width = bitmap.getHeight();
        } else {
            height = bitmap.getHeight();
            width = bitmap.getWidth();
        }
        if (height < width) {
            f2 = ((float) height) / ((float) width);
            f3 = 0.8f;
        } else {
            f2 = ((float) width) / ((float) height);
            f3 = 0.5235602f;
        }
        float max = Math.max(f2, f3);
        return new AnonymousClass34S(Float.valueOf(max), Float.valueOf(Math.max(max, f / 320.0f)));
    }
}
