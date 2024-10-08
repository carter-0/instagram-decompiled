package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.5uo  reason: invalid class name and case insensitive filesystem */
public final class C299245uo extends ReplacementSpan implements Drawable.Callback {
    public static final ContextChain A07 = new ContextChain((ContextChain) null, "i", "BloksRichTextImageSpan");
    public View A00;
    public C62320sa A01;
    public final Resources A02;
    public final C226742hm A03;
    public final C14701U2b A04;
    public final C307786Rm A05;
    public final C276544tV A06;

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        0qQ.A0B(canvas, 0);
        Paint paint2 = paint;
        0qQ.A0B(paint2, 8);
        this.A04.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint2);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        0qQ.A0B(paint, 0);
        return this.A04.getSize(paint, charSequence, i, i2, fontMetricsInt);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        View view = this.A00;
        if (view != null) {
            view.postDelayed(runnable, j - SystemClock.uptimeMillis());
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        View view = this.A00;
        if (view != null) {
            view.removeCallbacks(runnable);
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        View view = this.A00;
        if (view != null) {
            view.invalidate();
        }
    }

    public /* synthetic */ C299245uo(Rect rect, C307786Rm r6, C276544tV r7, int i, int i2) {
        C226742hm r3 = (C226742hm) C226722hk.A00().ALv();
        0qQ.A0B(r3, 6);
        Resources resources = r6.A00.getResources();
        0qQ.A07(resources);
        Drawable drawable = (Drawable) r3;
        UV9 uv9 = new UV9(rect, drawable, i2, i);
        this.A02 = resources;
        this.A03 = r3;
        this.A04 = uv9;
        drawable.setCallback(this);
        this.A05 = r6;
        this.A06 = r7;
    }
}
