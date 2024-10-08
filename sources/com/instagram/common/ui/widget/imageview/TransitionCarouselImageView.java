package com.instagram.common.ui.widget.imageview;

import X.0qQ;
import X.1NK;
import X.1OO;
import X.2PP;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass1MK;
import X.AnonymousClass3LX;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C226952iF;
import X.C240963Ni;
import X.C240983Nk;
import X.C254673sr;
import X.C51970G9q;
import X.DbW;
import X.JTT;
import X.X1L;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class TransitionCarouselImageView extends View implements AnonymousClass1MK, X1L {
    public int A00;
    public Bitmap A01;
    public Bitmap A02;
    public List A03;
    public float A04;
    public float A05;
    public float A06;
    public long A07;
    public long A08;
    public long A09;
    public Handler A0A;
    public C240963Ni A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public final ValueAnimator A0F;
    public final ValueAnimator A0G;
    public final ValueAnimator A0H;
    public final Rect A0I;
    public final Rect A0J;
    public final boolean A0K;
    public final Paint A0L;
    public final Rect A0M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        if (r9.A05 != 1.0f) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TransitionCarouselImageView(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r2 = 1
            X.0qQ.A0B(r10, r2)
            r9.<init>(r10, r11, r12)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r9.A0L = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.A0I = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.A0J = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.A0M = r0
            r3 = 1065353216(0x3f800000, float:1.0)
            r9.A04 = r3
            if (r11 != 0) goto L_0x00b0
            r0 = 800(0x320, double:3.953E-321)
            r9.A07 = r0
            r0 = 3000(0xbb8, double:1.482E-320)
            r9.A09 = r0
            r9.A06 = r3
            r9.A05 = r3
        L_0x0035:
            r0 = 13
            X.W4Q r5 = new X.W4Q
            r5.<init>((java.lang.Object) r9, (int) r0)
            float r4 = r9.A06
            r8 = 0
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x004a
            float r0 = r9.A05
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L_0x004b
        L_0x004a:
            r0 = 1
        L_0x004b:
            r9.A0K = r0
            r6 = 2
            float[] r1 = new float[r6]
            r1[r8] = r4
            float r0 = r9.A05
            r1[r2] = r0
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r1)
            r9.A0F = r7
            X.C51969G9p.A10(r7)
            long r3 = r9.A09
            long r0 = r9.A07
            long r3 = r3 + r0
            r7.setDuration(r3)
            r7.addUpdateListener(r5)
            float[] r1 = new float[r6]
            float r0 = r9.A06
            r1[r8] = r0
            float r0 = r9.A05
            r1[r2] = r0
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r1)
            r9.A0H = r4
            X.C51969G9p.A10(r4)
            long r2 = r9.A09
            long r0 = r9.A07
            long r2 = r2 + r0
            r4.setDuration(r2)
            r4.addUpdateListener(r5)
            int[] r0 = new int[r6]
            r0 = {0, 255} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            r9.A0G = r2
            X.C51969G9p.A10(r2)
            long r0 = r9.A07
            r2.setDuration(r0)
            r2.addUpdateListener(r5)
            r0 = 16
            X.U0N.A00(r2, r9, r0)
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1 = 4
            X.U1x r0 = new X.U1x
            r0.<init>(r2, r9, r1)
            r9.A0A = r0
            return
        L_0x00b0:
            android.content.Context r1 = r9.getContext()
            int[] r0 = X.C71382cm.A2M
            android.content.res.TypedArray r4 = r1.obtainStyledAttributes(r11, r0)
            X.0qQ.A07(r4)
            r1 = 0
            r0 = 800(0x320, float:1.121E-42)
            int r0 = r4.getInt(r1, r0)
            long r0 = (long) r0
            r9.A07 = r0
            r0 = 3000(0xbb8, float:4.204E-42)
            int r0 = r4.getInt(r2, r0)
            long r0 = (long) r0
            r9.A09 = r0
            r0 = 3
            float r0 = r4.getFloat(r0, r3)
            r9.A06 = r0
            r0 = 2
            float r0 = r4.getFloat(r0, r3)
            r9.A05 = r0
            r4.recycle()
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.imageview.TransitionCarouselImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void A04(List list, boolean z) {
        if (!2PP.A00(list, list) || this.A0E != z) {
            A03(this);
            this.A01 = null;
            this.A02 = null;
            this.A0I.setEmpty();
            this.A0J.setEmpty();
            this.A03 = list;
            this.A00 = 0;
            this.A0E = z;
            A02(this);
        }
    }

    public final void CyF(C226952iF r14, AnonymousClass3LX r15) {
        int A1U = AnonymousClass7TF.A1U(0, r14, r15);
        Bitmap bitmap = r15.A01;
        if (bitmap != null) {
            if (this.A01 == null) {
                this.A01 = bitmap;
                if (this.A0K) {
                    this.A0F.start();
                }
                List list = this.A03;
                if (list != null && list.size() > A1U) {
                    this.A00 = (this.A00 + 1) % list.size();
                    A01(this);
                }
                invalidate();
            } else {
                this.A02 = bitmap;
                this.A0A.sendEmptyMessageDelayed(0, Math.max(this.A09 - (SystemClock.elapsedRealtime() - this.A08), 0));
            }
            C240963Ni r1 = this.A0B;
            if (r1 != null) {
                r1.DO4(new C240983Nk(bitmap, r14.BRH().CCJ(), r15.A04, bitmap.getWidth(), bitmap.getHeight()));
            }
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void onDraw(Canvas canvas) {
        float f;
        0qQ.A0B(canvas, 0);
        if (this.A01 != null) {
            boolean z = this.A0K;
            float f2 = 1.0f;
            if (z) {
                f = C51970G9q.A04(this.A0F.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
            } else {
                f = 1.0f;
            }
            Bitmap bitmap = this.A01;
            if (bitmap != null) {
                Rect rect = this.A0I;
                A00(bitmap, rect, f);
                canvas.drawBitmap(bitmap, rect, this.A0M, (Paint) null);
            }
            if (this.A02 != null) {
                ValueAnimator valueAnimator = this.A0G;
                if (valueAnimator.isStarted()) {
                    Paint paint = this.A0L;
                    paint.setAlpha(DbW.A04(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int"));
                    if (z) {
                        f2 = C51970G9q.A04(this.A0H.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
                    }
                    Bitmap bitmap2 = this.A02;
                    if (bitmap2 != null) {
                        Rect rect2 = this.A0J;
                        A00(bitmap2, rect2, f2);
                        canvas.drawBitmap(bitmap2, rect2, this.A0M, paint);
                    }
                }
            }
        }
    }

    public final void setSource(String str) {
        0qQ.A0B(str, 0);
        this.A0C = str;
    }

    public final void setUrls(List list) {
        0qQ.A0B(list, 0);
        A04(list, false);
    }

    public static final void A02(TransitionCarouselImageView transitionCarouselImageView) {
        if (!transitionCarouselImageView.A0D && transitionCarouselImageView.A03 != null) {
            A01(transitionCarouselImageView);
            transitionCarouselImageView.A0D = true;
        }
    }

    public static final void A03(TransitionCarouselImageView transitionCarouselImageView) {
        if (transitionCarouselImageView.A0D) {
            transitionCarouselImageView.A0A.removeMessages(0);
            transitionCarouselImageView.A0G.cancel();
            transitionCarouselImageView.A0F.cancel();
            transitionCarouselImageView.A0H.cancel();
            transitionCarouselImageView.A0D = false;
        }
    }

    public final void DJx(C226952iF r2, C254673sr r3) {
        C240963Ni r0 = this.A0B;
        if (r0 != null) {
            r0.DEN();
        }
    }

    public final void setOnLoadListener(C240963Ni r1) {
        this.A0B = r1;
    }

    private final void A00(Bitmap bitmap, Rect rect, float f) {
        float f2;
        float f3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f4 = (float) width;
        float f5 = this.A04;
        float f6 = (float) height;
        if (f4 * f5 < f6) {
            f2 = f4 / f;
            f3 = f5 * f2;
        } else {
            float f7 = f6 / f;
            f2 = f7 / f5;
            f3 = f7;
        }
        float f8 = (f4 - f2) / 2.0f;
        float f9 = (f6 - f3) / 2.0f;
        rect.set((int) f8, (int) f9, (int) (f2 + f8), (int) (f3 + f9));
    }

    public static final void A01(TransitionCarouselImageView transitionCarouselImageView) {
        ImageUrl imageUrl;
        transitionCarouselImageView.A08 = SystemClock.elapsedRealtime();
        1NK A002 = 1NK.A00();
        List list = transitionCarouselImageView.A03;
        if (list == null || (imageUrl = (ImageUrl) list.get(transitionCarouselImageView.A00)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        String str = transitionCarouselImageView.A0C;
        if (str == null) {
            0qQ.A0F("source");
            throw AnonymousClass00P.createAndThrow();
        }
        1OO A0J2 = A002.A0J(imageUrl, str);
        A0J2.A0I = false;
        A0J2.A0L = transitionCarouselImageView.A0E;
        A0J2.A02(transitionCarouselImageView);
        A0J2.A01();
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1405122271);
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            A02(this);
        }
        AnonymousClass0fD.A0D(1302733278, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(285830448);
        super.onDetachedFromWindow();
        A03(this);
        AnonymousClass0fD.A0D(773365920, A062);
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (getVisibility() == 0) {
            A02(this);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-1217109100);
        Rect rect = this.A0M;
        rect.set(0, 0, getWidth(), getHeight());
        this.A04 = ((float) rect.height()) / ((float) rect.width());
        AnonymousClass0fD.A0D(-210138676, A062);
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        A03(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TransitionCarouselImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TransitionCarouselImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ TransitionCarouselImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
