package com.instagram.ui.widget.imageview;

import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.C240963Ni;
import X.C240983Nk;
import X.C278214wU;
import X.C278224wV;
import X.C278234wW;
import X.C71382cm;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.ArrayList;
import java.util.List;

public class PulsingMultiImageView extends CircularImageView implements C240963Ni {
    public int A00;
    public Matrix A01;
    public Drawable A02;
    public List A03;
    public boolean A04;
    public long A05;
    public AnonymousClass0iw A06;
    public final ValueAnimator A07;
    public final ValueAnimator A08;
    public final Handler A09;
    public final boolean A0A;

    public PulsingMultiImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void DEN() {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.widget.ImageView] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.instagram.ui.widget.imageview.PulsingMultiImageView r2) {
        /*
            java.util.List r0 = r2.A03
            if (r0 == 0) goto L_0x002f
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L_0x002f
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            r2.A02 = r0
            android.graphics.Matrix r1 = r2.getImageMatrix()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r1)
            r2.A01 = r0
            int r0 = r2.A00
            int r1 = r0 + 1
            java.util.List r0 = r2.A03
            r0.getClass()
            int r0 = r0.size()
            int r1 = r1 % r0
            r2.A00 = r1
            r2.A00()
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.imageview.PulsingMultiImageView.A01(com.instagram.ui.widget.imageview.PulsingMultiImageView):void");
    }

    public final void A0I() {
        if (this.A04) {
            this.A04 = false;
            Handler handler = this.A09;
            handler.removeMessages(0);
            handler.removeMessages(1);
            this.A07.cancel();
            this.A08.cancel();
            this.A02 = null;
            this.A01 = null;
        }
    }

    public final void DO4(C240983Nk r9) {
        if (!this.A04) {
            return;
        }
        if (this.A02 == null) {
            if (this.A0A) {
                List list = this.A03;
                list.getClass();
                if (list.size() > 1 && !this.A08.isStarted()) {
                    this.A09.sendEmptyMessage(1);
                    this.A07.start();
                    return;
                }
            }
            A01(this);
            this.A07.start();
            return;
        }
        this.A09.sendEmptyMessageDelayed(0, Math.max(3000 - (SystemClock.elapsedRealtime() - this.A05), 0));
    }

    public void setAnimatingImageUrl(ImageUrl imageUrl, AnonymousClass0iw r3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(imageUrl);
        setAnimatingImageUrls(arrayList, r3);
    }

    public void setPulseDurationMs(long j) {
        this.A07.setDuration(j / 2);
    }

    private void A00() {
        this.A05 = SystemClock.elapsedRealtime();
        if (this.A06 != null) {
            List list = this.A03;
            list.getClass();
            setUrl((ImageUrl) list.get(this.A00), this.A06);
            return;
        }
        throw new IllegalStateException("mAnalyticsModule can't be null in PulsingMultiImageView");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-25695805);
        PulsingMultiImageView.super.onAttachedToWindow();
        if (getVisibility() == 0 && !this.A04 && this.A03 != null) {
            this.A04 = true;
            A00();
        }
        AnonymousClass0fD.A0D(-1118463951, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1739088936);
        PulsingMultiImageView.super.onDetachedFromWindow();
        A0I();
        AnonymousClass0fD.A0D(1963775678, A062);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    public final void onDraw(Canvas canvas) {
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        Drawable drawable = this.A02;
        if (drawable != null) {
            canvas.save();
            ValueAnimator valueAnimator = this.A08;
            if (!valueAnimator.isStarted()) {
                valueAnimator = this.A07;
            }
            float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
            canvas.scale(floatValue, floatValue, width, height);
            canvas.concat(this.A01);
            drawable.draw(canvas);
        } else {
            ValueAnimator valueAnimator2 = this.A08;
            if (!valueAnimator2.isStarted()) {
                valueAnimator2 = this.A07;
                if (!valueAnimator2.isStarted()) {
                    return;
                }
            }
            float floatValue2 = ((Number) valueAnimator2.getAnimatedValue()).floatValue();
            canvas.save();
            canvas.scale(floatValue2, floatValue2, width, height);
            super.onDraw(canvas);
        }
        canvas.restore();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    public final void onFinishTemporaryDetach() {
        PulsingMultiImageView.super.onFinishTemporaryDetach();
        if (getVisibility() == 0 && !this.A04 && this.A03 != null) {
            this.A04 = true;
            A00();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    public final void onStartTemporaryDetach() {
        PulsingMultiImageView.super.onStartTemporaryDetach();
        A0I();
    }

    public void setAnimatingImageUrls(List list, AnonymousClass0iw r3) {
        A0I();
        this.A03 = list;
        this.A06 = r3;
        this.A00 = 0;
        if (!this.A04 && list != null) {
            this.A04 = true;
            A00();
        }
    }

    public PulsingMultiImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = new C278214wU(Looper.getMainLooper(), this);
        this.A0E = this;
        C278224wV r5 = new C278224wV(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1r);
        this.A0A = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.A08 = ofFloat;
        ofFloat.setDuration(400);
        ofFloat.addUpdateListener(r5);
        ofFloat.addListener(new C278234wW(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.95f});
        this.A07 = ofFloat2;
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        ofFloat2.setDuration(400);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.addUpdateListener(r5);
    }

    public PulsingMultiImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
