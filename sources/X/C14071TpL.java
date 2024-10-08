package X;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import org.webrtc.CameraCapturer;

/* renamed from: X.TpL  reason: case insensitive filesystem */
public class C14071TpL {
    public static final int[] A02 = {16843067, 16843068};
    public Bitmap A00;
    public final ProgressBar A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: android.graphics.drawable.ShapeDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.graphics.drawable.LayerDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: android.graphics.drawable.ShapeDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: android.graphics.drawable.ShapeDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable A01(android.graphics.drawable.Drawable r9, boolean r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof android.graphics.drawable.LayerDrawable
            r3 = 1
            if (r0 == 0) goto L_0x007e
            android.graphics.drawable.LayerDrawable r9 = (android.graphics.drawable.LayerDrawable) r9
            int r2 = r9.getNumberOfLayers()
            android.graphics.drawable.Drawable[] r7 = new android.graphics.drawable.Drawable[r2]
            r1 = 0
            r6 = 0
        L_0x000f:
            if (r6 >= r2) goto L_0x002e
            int r5 = r9.getId(r6)
            android.graphics.drawable.Drawable r4 = r9.getDrawable(r6)
            r0 = 16908301(0x102000d, float:2.3877265E-38)
            if (r5 == r0) goto L_0x0024
            r3 = 16908303(0x102000f, float:2.387727E-38)
            r0 = 0
            if (r5 != r3) goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            android.graphics.drawable.Drawable r0 = r8.A01(r4, r0)
            r7[r6] = r0
            int r6 = r6 + 1
            goto L_0x000f
        L_0x002e:
            android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable
            r5.<init>(r7)
        L_0x0033:
            if (r1 >= r2) goto L_0x00c8
            int r0 = r9.getId(r1)
            r5.setId(r1, r0)
            int r0 = r9.getLayerGravity(r1)
            r5.setLayerGravity(r1, r0)
            int r0 = r9.getLayerWidth(r1)
            r5.setLayerWidth(r1, r0)
            int r0 = r9.getLayerHeight(r1)
            r5.setLayerHeight(r1, r0)
            int r0 = r9.getLayerInsetLeft(r1)
            r5.setLayerInsetLeft(r1, r0)
            int r0 = r9.getLayerInsetRight(r1)
            r5.setLayerInsetRight(r1, r0)
            int r0 = r9.getLayerInsetTop(r1)
            r5.setLayerInsetTop(r1, r0)
            int r0 = r9.getLayerInsetBottom(r1)
            r5.setLayerInsetBottom(r1, r0)
            int r0 = r9.getLayerInsetStart(r1)
            r5.setLayerInsetStart(r1, r0)
            int r0 = r9.getLayerInsetEnd(r1)
            r5.setLayerInsetEnd(r1, r0)
            int r1 = r1 + 1
            goto L_0x0033
        L_0x007e:
            boolean r0 = r9 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x00c9
            android.graphics.drawable.BitmapDrawable r9 = (android.graphics.drawable.BitmapDrawable) r9
            android.graphics.Bitmap r4 = r9.getBitmap()
            android.graphics.Bitmap r0 = r8.A00
            if (r0 != 0) goto L_0x008e
            r8.A00 = r4
        L_0x008e:
            r0 = 8
            float[] r2 = new float[r0]
            r2 = {1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584, 1084227584} // fill-array
            r1 = 0
            android.graphics.drawable.shapes.RoundRectShape r0 = new android.graphics.drawable.shapes.RoundRectShape
            r0.<init>(r2, r1, r1)
            android.graphics.drawable.ShapeDrawable r5 = new android.graphics.drawable.ShapeDrawable
            r5.<init>(r0)
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r1 = new android.graphics.BitmapShader
            r1.<init>(r4, r2, r0)
            android.graphics.Paint r0 = r5.getPaint()
            r0.setShader(r1)
            android.graphics.Paint r1 = r5.getPaint()
            android.graphics.Paint r0 = r9.getPaint()
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            r1.setColorFilter(r0)
            if (r10 == 0) goto L_0x00c8
            r1 = 3
            android.graphics.drawable.ClipDrawable r0 = new android.graphics.drawable.ClipDrawable
            r0.<init>(r5, r1, r3)
            return r0
        L_0x00c8:
            return r5
        L_0x00c9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14071TpL.A01(android.graphics.drawable.Drawable, boolean):android.graphics.drawable.Drawable");
    }

    public void A02(AttributeSet attributeSet, int i) {
        ProgressBar progressBar = this.A01;
        2Yi A002 = 2Yi.A00(progressBar.getContext(), attributeSet, A02, i, 0);
        Drawable A03 = A002.A03(0);
        if (A03 != null) {
            if (A03 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) A03;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable A012 = A01(animationDrawable.getFrame(i2), true);
                    A012.setLevel(CameraCapturer.OPEN_CAMERA_TIMEOUT);
                    animationDrawable2.addFrame(A012, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(CameraCapturer.OPEN_CAMERA_TIMEOUT);
                A03 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(A03);
        }
        Drawable A032 = A002.A03(1);
        if (A032 != null) {
            progressBar.setProgressDrawable(A01(A032, false));
        }
        A002.A02.recycle();
    }

    public C14071TpL(ProgressBar progressBar) {
        this.A01 = progressBar;
    }
}
