package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.widget.ImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.77D  reason: invalid class name */
public final class AnonymousClass77D implements C231672s5 {
    public int A00;
    public AnonymousClass75D A01;
    public boolean A02 = true;
    public boolean A03 = true;
    public final C331277Qg A04;
    public final Matrix A05 = new Matrix();
    public final LayerDrawable A06;
    public final 0eP A07;
    public final 0sP A08;

    public AnonymousClass77D(Shape shape, 0sP r13) {
        0qQ.A0B(r13, 4);
        this.A08 = r13;
        AnonymousClass77F r5 = new AnonymousClass77F(shape, new WeakReference(this));
        r5.getPaint().setAlpha(0);
        AnonymousClass77F r6 = new AnonymousClass77F(shape, new WeakReference(this));
        r6.getPaint().setAlpha(0);
        AnonymousClass77F r7 = new AnonymousClass77F(shape, new WeakReference(this));
        r7.getPaint().setAlpha(0);
        ArrayList A1M = 0sr.A1M(new Drawable[]{r6, r5});
        A1M.add(r7);
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) A1M.toArray(new Drawable[0]));
        C331277Qg r4 = new C331277Qg(r5, r6, r7, shape, (AnonymousClass763) null, new WeakReference(layerDrawable));
        C331277Qg.A06.put(layerDrawable, r4);
        0eP r1 = new 0eP(layerDrawable, r4);
        this.A07 = r1;
        this.A06 = (LayerDrawable) r1.A00;
        this.A04 = (C331277Qg) r1.A01;
    }

    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        Bitmap bitmap2;
        0qQ.A0B(igImageView, 0);
        0qQ.A0B(bitmap, 1);
        AnonymousClass75D r0 = this.A01;
        if (r0 != null) {
            bitmap2 = r0.E3O(bitmap);
        } else {
            bitmap2 = bitmap;
        }
        C331277Qg r8 = this.A04;
        ShapeDrawable shapeDrawable = r8.A01;
        shapeDrawable.setIntrinsicWidth(bitmap.getWidth());
        shapeDrawable.setIntrinsicHeight(bitmap.getHeight());
        ShapeDrawable shapeDrawable2 = r8.A00;
        shapeDrawable2.setIntrinsicWidth(bitmap.getWidth());
        shapeDrawable2.setIntrinsicHeight(bitmap.getHeight());
        boolean z = this.A03;
        Shape shape = shapeDrawable.getShape();
        0qQ.A0B(shape, 1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        Paint paint = shapeDrawable.getPaint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(0.0f);
        paint.setShader(bitmapShader);
        paint.setAlpha(255);
        if (z && (shape instanceof C308496Um)) {
            C328047Df r02 = (C328047Df) ((C308496Um) shape);
            r02.A00 = 0.0f;
            r02.A03 = true;
        }
        shapeDrawable.setShaderFactory((ShapeDrawable.ShaderFactory) null);
        shapeDrawable.setShape(shape);
        bitmapShader.setLocalMatrix(this.A05);
        shapeDrawable.setAlpha(255);
        r8.A02.setAlpha(0);
        if (this.A03) {
            shapeDrawable2.setAlpha(0);
        }
        A00(this);
        igImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        igImageView.setImageDrawable((Drawable) this.A08.invoke(this.A06));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        r3 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        r2 = ((float) r8) / 2.0f;
        r0 = ((float) r5) / 2.0f;
        r5 = r9.A05;
        r5.setRotate(r6, r2, r0);
        r5.postScale(r3, 1.0f, r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass77D r9) {
        /*
            X.7Qg r0 = r9.A04
            android.graphics.drawable.ShapeDrawable r1 = r0.A01
            android.graphics.Rect r4 = r1.getBounds()
            X.0qQ.A07(r4)
            android.graphics.Paint r0 = r1.getPaint()
            android.graphics.Shader r7 = r0.getShader()
            int r8 = r1.getIntrinsicWidth()
            int r5 = r1.getIntrinsicHeight()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0057
            r0 = 1
            if (r8 < r0) goto L_0x0057
            if (r5 < r0) goto L_0x0057
            if (r7 == 0) goto L_0x0057
            boolean r0 = r9.A02
            r6 = 0
            if (r0 == 0) goto L_0x0069
            int r1 = r4.height()
            int r1 = r1 * r8
            int r0 = r4.width()
            int r0 = r0 * r5
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r1 <= r0) goto L_0x0058
            int r0 = r4.height()
            float r2 = (float) r0
            float r0 = (float) r5
            float r2 = r2 / r0
            int r0 = r4.width()
            float r6 = (float) r0
            float r0 = (float) r8
            float r0 = r0 * r2
            float r6 = r6 - r0
            float r6 = r6 * r3
            r1 = 0
        L_0x004c:
            android.graphics.Matrix r5 = r9.A05
            r5.setScale(r2, r2)
            r5.postTranslate(r6, r1)
        L_0x0054:
            r7.setLocalMatrix(r5)
        L_0x0057:
            return
        L_0x0058:
            int r0 = r4.width()
            float r2 = (float) r0
            float r0 = (float) r8
            float r2 = r2 / r0
            int r0 = r4.height()
            float r1 = (float) r0
            float r0 = (float) r5
            float r0 = r0 * r2
            float r1 = r1 - r0
            float r1 = r1 * r3
            goto L_0x004c
        L_0x0069:
            int r0 = r9.A00
            r4 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r0) {
                case 2: goto L_0x0074;
                case 3: goto L_0x0092;
                case 4: goto L_0x008f;
                case 5: goto L_0x008c;
                case 6: goto L_0x0089;
                case 7: goto L_0x0086;
                case 8: goto L_0x0083;
                default: goto L_0x0072;
            }
        L_0x0072:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0074:
            float r2 = (float) r8
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            float r0 = (float) r5
            float r0 = r0 / r1
            android.graphics.Matrix r5 = r9.A05
            r5.setRotate(r6, r2, r0)
            r5.postScale(r3, r4, r2, r0)
            goto L_0x0054
        L_0x0083:
            r6 = -1028390912(0xffffffffc2b40000, float:-90.0)
            goto L_0x0072
        L_0x0086:
            r6 = -1028390912(0xffffffffc2b40000, float:-90.0)
            goto L_0x0074
        L_0x0089:
            r6 = 1119092736(0x42b40000, float:90.0)
            goto L_0x0072
        L_0x008c:
            r6 = 1119092736(0x42b40000, float:90.0)
            goto L_0x0074
        L_0x008f:
            r6 = 1127481344(0x43340000, float:180.0)
            goto L_0x0074
        L_0x0092:
            r6 = 1127481344(0x43340000, float:180.0)
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass77D.A00(X.77D):void");
    }
}
