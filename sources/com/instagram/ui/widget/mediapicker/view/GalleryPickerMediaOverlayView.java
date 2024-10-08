package com.instagram.ui.widget.mediapicker.view;

import X.0nA;
import X.0qQ;
import X.AnonymousClass37O;
import X.C321486uG;
import X.C59849JaQ;
import X.C59850JaR;
import X.C59897JbM;
import X.C59898JbN;
import X.JTO;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;

public final class GalleryPickerMediaOverlayView extends View {
    public static final Paint A0F;
    public static final Paint A0G;
    public Bitmap A00;
    public Drawable A01;
    public C59898JbN A02 = C59898JbN.A06;
    public C59897JbM A03 = C59897JbM.ENABLE;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C59849JaQ A0C;
    public final Paint A0D = new Paint(2);
    public final C59850JaR A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GalleryPickerMediaOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A0C = new C59849JaQ(context);
        this.A0E = new C59850JaR(context.getResources().getDimensionPixelSize(R.dimen.button_text_size));
        setWillNotDraw(false);
    }

    public final void onDraw(Canvas canvas) {
        float f;
        float width;
        float height;
        Paint paint;
        int i;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        if (this.A0B) {
            if ((this.A06 || this.A07) && this.A05) {
                Context context = getContext();
                0qQ.A07(context);
                Drawable drawable = context.getDrawable(R.drawable.instagram_circle_check_pano_filled_24);
                if (drawable != null) {
                    drawable.setColorFilter(AnonymousClass37O.A00(context.getColor(R.color.canvas_bottom_sheet_description_text_color)));
                    drawable.setBounds((canvas.getWidth() - drawable.getIntrinsicWidth()) / 2, (canvas.getHeight() - drawable.getIntrinsicHeight()) / 2, (canvas.getWidth() + drawable.getIntrinsicWidth()) / 2, (canvas.getHeight() + drawable.getIntrinsicHeight()) / 2);
                    drawable.draw(canvas);
                }
            }
            Bitmap bitmap = this.A00;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (float) (canvas.getWidth() - bitmap.getWidth()), 0.0f, this.A0D);
            } else if (this.A09 && !this.A0A && this.A03 != C59897JbM.DISABLED) {
                C321486uG r3 = this.A0C.A00;
                int i2 = r3.A00 + r3.A06;
                r3.setBounds(0, 0, i2, i2);
                canvas.save();
                float f2 = (float) r3.A07;
                canvas.translate(((float) (canvas.getWidth() - i2)) - f2, f2);
                r3.draw(canvas);
                canvas.restore();
            }
            String str = this.A04;
            if (str != null) {
                C59850JaR jaR = this.A0E;
                int width2 = canvas.getWidth();
                int i3 = jaR.A00 / 2;
                canvas.drawText(str, (float) (width2 - i3), (float) (canvas.getHeight() - i3), jaR.A01);
            }
            Drawable drawable2 = this.A01;
            if (drawable2 != null) {
                int i4 = 12;
                if (this.A08) {
                    i4 = 16;
                }
                Context context2 = getContext();
                0qQ.A07(context2);
                int A042 = (int) 0nA.A04(context2, i4);
                int A043 = (int) 0nA.A04(context2, 3);
                if (!this.A08) {
                    i = getHeight() - A043;
                } else {
                    i = A043 + A042;
                }
                int i5 = A043 + A042;
                int i6 = A043;
                if (!this.A08) {
                    i6 = i - A042;
                }
                drawable2.setBounds(A043, i6, i5, i);
                drawable2.draw(canvas);
            }
        }
        int ordinal = this.A03.ordinal();
        if (ordinal == 0) {
            f = 0.0f;
            width = (float) canvas.getWidth();
            height = (float) canvas.getHeight();
            paint = A0G;
        } else if (ordinal == 2) {
            f = 0.0f;
            width = (float) canvas.getWidth();
            height = (float) canvas.getHeight();
            paint = A0F;
        } else {
            return;
        }
        canvas2.drawRect(f, f, width, height, paint);
    }

    public final void setMediaIconType(C59898JbN jbN) {
        0qQ.A0B(jbN, 0);
        this.A02 = jbN;
    }

    public final void setViewRenderMode(C59897JbM jbM) {
        0qQ.A0B(jbM, 0);
        this.A03 = jbM;
    }

    static {
        int argb = Color.argb(204, 255, 255, 255);
        Paint A0C2 = JTO.A0C();
        Paint.Style style = Paint.Style.FILL;
        A0C2.setStyle(style);
        A0C2.setColor(Color.argb(180, 147, 147, 147));
        A0F = A0C2;
        Paint A0C3 = JTO.A0C();
        A0C3.setStyle(style);
        A0C3.setColor(argb);
        A0G = A0C3;
    }

    public final Bitmap getAlbumIndicatorBitmap() {
        return this.A00;
    }

    public final Drawable getCornerIconDrawable() {
        return this.A01;
    }

    public final boolean getEnableSelectedCheckmarks() {
        return this.A05;
    }

    public final String getFriendlyVideoDuration() {
        return this.A04;
    }

    public final C59898JbN getMediaIconType() {
        return this.A02;
    }

    public final boolean getMultiSelectEnabled() {
        return this.A09;
    }

    public final C59849JaQ getNumberedCircleDrawer() {
        return this.A0C;
    }

    public final boolean getSendingSingleMediaWithMultiSelect() {
        return this.A0A;
    }

    public final boolean getShowPrimaryOverlay() {
        return this.A0B;
    }

    public final C59897JbM getViewRenderMode() {
        return this.A03;
    }

    public final void setAlbumIndicatorBitmap(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public final void setCornerIconDrawable(Drawable drawable) {
        this.A01 = drawable;
    }

    public final void setEnableSelectedCheckmarks(boolean z) {
        this.A05 = z;
    }

    public final void setFriendlyVideoDuration(String str) {
        this.A04 = str;
    }

    public final void setItemSelected(boolean z) {
        this.A06 = z;
    }

    public final void setMultiSelectEnabled(boolean z) {
        this.A09 = z;
    }

    public final void setPreviewItem(boolean z) {
        this.A07 = z;
    }

    public final void setSendingSingleMediaWithMultiSelect(boolean z) {
        this.A0A = z;
    }

    public final void setShowPrimaryOverlay(boolean z) {
        this.A0B = z;
    }

    public final void setTopLeftIcon(boolean z) {
        this.A08 = z;
    }
}
