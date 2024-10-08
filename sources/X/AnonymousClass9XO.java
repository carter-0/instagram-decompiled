package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.util.List;

/* renamed from: X.9XO  reason: invalid class name */
public final class AnonymousClass9XO extends LayerDrawable {
    public final float A00;
    public final Bitmap A01;
    public final List A02;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Rect A0X = AnonymousClass7TE.A0X(this);
        int width = this.A01.getWidth();
        int height = A0X.height();
        int i = (int) (((float) width) * this.A00);
        float f = (float) i;
        int intrinsicHeight = (int) ((((float) getDrawable(0).getIntrinsicHeight()) / ((float) getDrawable(0).getIntrinsicWidth())) * f);
        int i2 = A0X.left + ((width - i) / 2);
        int i3 = A0X.top + ((height - intrinsicHeight) / 2);
        int i4 = i2 + i;
        int i5 = i3 + intrinsicHeight;
        Drawable drawable = getDrawable(0);
        drawable.setBounds(i2, i3, i4, i5);
        drawable.draw(canvas);
        Drawable drawable2 = getDrawable(1);
        drawable2.setBounds(i2 + ((int) (f * 0.04f)), ((int) (((float) intrinsicHeight) * 0.02f)) + i5, i4 + i, i5 + 200);
        drawable2.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass9XO(android.graphics.Bitmap r6, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r7, java.lang.String r8, java.util.List r9) {
        /*
            r5 = this;
            if (r8 == 0) goto L_0x0064
            android.text.Spannable r0 = X.C306386Ly.A0d
            android.content.Context r1 = r7.getContext()
            int r0 = r7.getWidth()
            X.6Ly r3 = X.AnonymousClass7TE.A0s(r1, r0)
            int r0 = X.2Yu.A0A(r1)
            int r4 = r1.getColor(r0)
            int r2 = X.AnonymousClass7TE.A08(r1)
            r3.A0M(r8)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165228(0x7f07002c, float:1.7944667E38)
            float r0 = r1.getDimension(r0)
            r3.A0A(r0)
            r3.A0F(r4)
            r1 = 1084227584(0x40a00000, float:5.0)
            r0 = 0
            r3.A0D(r1, r0, r0, r2)
            java.lang.String r1 = "…"
            r0 = 1
            r3.A0N(r1, r0, r0)
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF
            r0 = 0
            r3.A0J(r1, r0)
            android.content.res.Resources r2 = r7.getResources()
            X.0qQ.A07(r2)
            r1 = 1103101952(0x41c00000, float:24.0)
            X.8DU r0 = new X.8DU
            r0.<init>(r2, r6)
            r0.A02(r1)
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r0, r3}
            r5.<init>(r0)
            r5.A01 = r6
            r5.A02 = r9
            r0 = 1062836634(0x3f59999a, float:0.85)
            r5.A00 = r0
            return
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XO.<init>(android.graphics.Bitmap, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, java.lang.String, java.util.List):void");
    }
}
