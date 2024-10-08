package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Xr  reason: invalid class name and case insensitive filesystem */
public final class C380359Xr extends ScaleGestureDetector.SimpleOnScaleGestureListener implements View.OnTouchListener, C317516nO {
    public float A00 = 1.0f;
    public float[] A01 = new float[9];
    public final TextureView A02;
    public final C353488Hv A03;
    public final GestureDetector A04;
    public final ScaleGestureDetector A05;
    public final UserSession A06;
    public final C41821B2b A07;

    public C380359Xr(Context context, TextureView textureView, UserSession userSession, C41821B2b b2b, C353488Hv r6) {
        AnonymousClass7TF.A1D(r6, 2, userSession);
        this.A03 = r6;
        this.A02 = textureView;
        this.A06 = userSession;
        this.A07 = b2b;
        this.A05 = new ScaleGestureDetector(context, this);
        this.A04 = new GestureDetector(context, this);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r2 < 1.0f) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScale(android.view.ScaleGestureDetector r7) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            float r5 = r7.getScaleFactor()
            float r3 = r6.A00
            float r2 = r3 * r5
            r6.A00 = r2
            r1 = 1092616192(0x41200000, float:10.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x001a
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x001e
        L_0x001a:
            r6.A00 = r1
            float r5 = r1 / r3
        L_0x001e:
            X.8Hv r4 = r6.A03
            android.graphics.Matrix r3 = r4.A0A
            android.view.TextureView r2 = r6.A02
            float r1 = r2.getPivotX()
            float r0 = r2.getPivotY()
            r3.postScale(r5, r5, r1, r0)
            r6.A00()
            android.graphics.Matrix r0 = r4.A0A
            r2.setTransform(r0)
            r2.invalidate()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380359Xr.onScale(android.view.ScaleGestureDetector):boolean");
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent2, 1);
        if (motionEvent2.getPointerCount() == 1) {
            this.A07.DhO(-f);
        } else if (motionEvent2.getPointerCount() == 2) {
            float f3 = -f;
            TextureView textureView = this.A02;
            float A022 = AnonymousClass7TE.A02(textureView);
            float A023 = AnonymousClass7TE.A02(textureView);
            C353488Hv r5 = this.A03;
            if (A023 * r5.A00 * r5.A04 * this.A00 <= A022) {
                f3 = 0.0f;
            }
            float f4 = -f2;
            if (AnonymousClass7TE.A03(textureView) * r5.A01 * r5.A05 * this.A00 <= AnonymousClass7TE.A03(textureView)) {
                f4 = 0.0f;
            }
            r5.A0A.postTranslate(f3, f4);
            A00();
            textureView.setTransform(r5.A0A);
            textureView.invalidate();
            return true;
        }
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        this.A04.onTouchEvent(motionEvent);
        if (this.A07.CV7()) {
            this.A05.onTouchEvent(motionEvent);
        }
        return false;
    }

    private final void A00() {
        C353488Hv r4 = this.A03;
        Matrix matrix = r4.A0A;
        Matrix matrix2 = matrix;
        if (!(r4.A04 == 1.0f && r4.A05 == 1.0f)) {
            matrix2 = new Matrix(matrix);
            float f = r4.A04;
            float f2 = r4.A05;
            TextureView textureView = this.A02;
            matrix2.preScale(f, f2, textureView.getPivotX(), textureView.getPivotY());
        }
        float[] fArr = this.A01;
        matrix2.getValues(fArr);
        float f3 = fArr[2];
        float f4 = fArr[5];
        TextureView textureView2 = this.A02;
        float A022 = AnonymousClass7TE.A02(textureView2);
        float A023 = AnonymousClass7TE.A02(textureView2) * r4.A00 * r4.A04 * this.A00;
        float f5 = 0.0f;
        int i = (A023 > A022 ? 1 : (A023 == A022 ? 0 : -1));
        float f6 = A022 - A023;
        float f7 = 0.0f;
        if (i <= 0) {
            f7 = f6;
            f6 = 0.0f;
        }
        if (f3 < f6) {
            f5 = (-f3) + f6;
        } else if (f3 > f7) {
            f5 = (-f3) + f7;
        }
        float A032 = AnonymousClass7TE.A03(textureView2);
        float A033 = AnonymousClass7TE.A03(textureView2) * r4.A01 * r4.A05 * this.A00;
        float f8 = 0.0f;
        int i2 = (A033 > A032 ? 1 : (A033 == A032 ? 0 : -1));
        float f9 = A032 - A033;
        float f10 = 0.0f;
        if (i2 <= 0) {
            f10 = f9;
            f9 = 0.0f;
        }
        if (f4 < f9) {
            f8 = (-f4) + f9;
        } else if (f4 > f10) {
            f8 = (-f4) + f10;
        }
        if (f5 != 0.0f || f8 != 0.0f) {
            r4.A0A.postTranslate(f5, f8);
        }
    }

    public final void A01() {
        this.A00 = 1.0f;
        C353488Hv r0 = this.A03;
        Matrix A0U = AnonymousClass7TE.A0U();
        r0.A0A = A0U;
        float f = r0.A00;
        float f2 = r0.A01;
        TextureView textureView = this.A02;
        A0U.setScale(f, f2, textureView.getPivotX(), textureView.getPivotY());
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        27r A012 = 27p.A01(this.A06);
        C59725JVj jVj = A012.A04.A0C;
        if (!(A012.A0J() == null || jVj == null)) {
            A012.A1Q(jVj, "MULTITOUCH_ON_IMPORT_PREVIEW_PLAYER");
        }
        C353488Hv r3 = this.A03;
        float f = this.A00;
        r3.A02 = f * r3.A00;
        r3.A03 = f * r3.A01;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.A07.DlF();
        return false;
    }
}
