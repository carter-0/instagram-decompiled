package com.instagram.ui.videothumbnail;

import X.02m;
import X.0qQ;
import X.2Bq;
import X.2Bs;
import X.AnonymousClass7TE;
import X.C51965G9l;
import X.C56520Hzr;
import X.C59580JPa;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.HashMap;

public class ThumbView extends View implements C59580JPa {
    public int A00;
    public int A01;
    public Bitmap A02;
    public Rect A03;
    public C56520Hzr A04;
    public boolean A05;
    public int A06;
    public final Path A07 = C51965G9l.A0C();
    public final Rect A08 = AnonymousClass7TE.A0W();
    public final RectF A09 = AnonymousClass7TE.A0Y();

    public final void DrO(int i, int i2) {
    }

    public static void A00(ThumbView thumbView) {
        C56520Hzr hzr = thumbView.A04;
        if (hzr != null) {
            02m A0l = C51965G9l.A0l();
            String str = hzr.A01.A0G;
            int i = thumbView.A01;
            int i2 = thumbView.A06;
            long j = hzr.A00;
            0qQ.A0B(str, 0);
            2Bs r8 = 2Bq.A0D;
            int hashCode = str.hashCode();
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("number_of_seeks", String.valueOf(i));
            A1E.put("number_of_thumbs_served", String.valueOf(i2));
            A1E.put("number_of_thumbnail_errors", String.valueOf(0));
            A1E.put("max_thumbnail_delay", String.valueOf(j));
            r8.A03(1900591, hashCode, A1E);
            A0l.markerEnd(1900591, hashCode, 2);
            hzr.A00 = 0;
        }
        thumbView.A06 = 0;
        thumbView.A01 = 0;
    }

    public final void EvP(Bitmap bitmap, Rect rect, double d, int i, int i2) {
        this.A02 = bitmap;
        this.A03 = rect;
        this.A06++;
    }

    public C56520Hzr getThumbnailController() {
        return this.A04;
    }

    public final void onDraw(Canvas canvas) {
        Rect rect = this.A08;
        rect.set(0, 0, canvas.getWidth(), canvas.getHeight());
        if (this.A00 > 0) {
            RectF rectF = this.A09;
            rectF.set(rect);
            Path path = this.A07;
            path.rewind();
            float f = (float) this.A00;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            canvas.clipPath(path);
        }
        Rect rect2 = this.A03;
        Bitmap bitmap = this.A02;
        if (!(bitmap == null || rect2 == null)) {
            canvas.drawBitmap(bitmap, rect2, rect, (Paint) null);
        }
        super.onDraw(canvas);
        postInvalidate();
    }

    public void setScrubberThumbnailCallback(C59580JPa jPa) {
        C56520Hzr hzr = this.A04;
        if (hzr != null) {
            hzr.A03.add(jPa);
        }
    }

    public ThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setBitmap(Bitmap bitmap) {
        this.A02 = bitmap;
    }

    public void setSrcRect(Rect rect) {
        this.A03 = rect;
    }

    public void setThumbRoundRadius(int i) {
        this.A00 = i;
    }

    public ThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ThumbView(Context context) {
        super(context);
    }
}
