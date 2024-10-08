package X;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.smartcapture.components.ContourView;
import com.facebook.smartcapture.components.DarkenedFrameView;
import com.facebook.smartcapture.components.DottedAlignmentView;
import com.facebook.smartcapture.docauth.CaptureState;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.TJj  reason: case insensitive filesystem */
public final class C13053TJj implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ ContourView A01;
    public final /* synthetic */ CaptureState A02;
    public final /* synthetic */ boolean A03;

    public C13053TJj(Rect rect, ContourView contourView, CaptureState captureState, boolean z) {
        this.A01 = contourView;
        this.A02 = captureState;
        this.A00 = rect;
        this.A03 = z;
    }

    public final void run() {
        int i;
        ContourView contourView = this.A01;
        CaptureState captureState = this.A02;
        CaptureState captureState2 = captureState;
        Rect rect = this.A00;
        boolean z = this.A03;
        if (captureState == CaptureState.CAPTURING_AUTOMATIC) {
            DottedAlignmentView dottedAlignmentView = contourView.A0C;
            float f = contourView.A03;
            dottedAlignmentView.setX(((float) rect.left) + f);
            dottedAlignmentView.setY(((float) rect.top) + f);
            ViewGroup.LayoutParams layoutParams = dottedAlignmentView.getLayoutParams();
            int i2 = ((int) f) * 2;
            layoutParams.width = rect.width() - i2;
            layoutParams.height = rect.height() - i2;
            dottedAlignmentView.requestLayout();
            dottedAlignmentView.setVisibility(0);
            DbY.A0G(dottedAlignmentView).start();
            dottedAlignmentView.post(new C12892TCg(dottedAlignmentView));
        } else {
            DottedAlignmentView dottedAlignmentView2 = contourView.A0C;
            if (z) {
                0qQ.A0A(dottedAlignmentView2.animate().alpha(0.0f).withEndAction(new C12891TCf(contourView)));
            } else {
                dottedAlignmentView2.post(new C12893TCh(dottedAlignmentView2));
                dottedAlignmentView2.setAlpha(0.0f);
                dottedAlignmentView2.setVisibility(8);
            }
        }
        DarkenedFrameView darkenedFrameView = contourView.A0B;
        0qQ.A0B(rect, 0);
        RectF rectF = darkenedFrameView.A04;
        float f2 = darkenedFrameView.A01;
        rectF.set(((float) rect.left) + f2, ((float) rect.top) + f2, ((float) rect.right) - f2, ((float) rect.bottom) - f2);
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setDuration(300);
            RectF rectF2 = darkenedFrameView.A03;
            valueAnimator.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("left", new float[]{rectF2.left, rectF.left}), PropertyValuesHolder.ofFloat("top", new float[]{rectF2.top, rectF.top}), PropertyValuesHolder.ofFloat("right", new float[]{rectF2.right, rectF.right}), PropertyValuesHolder.ofFloat("bottom", new float[]{rectF2.bottom, rectF.bottom})});
            valueAnimator.addUpdateListener(new C11435SUp((Object) darkenedFrameView, 4));
            valueAnimator.start();
        } else {
            RectF rectF3 = darkenedFrameView.A03;
            rectF3.set(rectF);
            Path path = darkenedFrameView.A02;
            path.reset();
            float f3 = darkenedFrameView.A00;
            path.addRoundRect(rectF3, f3, f3, Path.Direction.CW);
            darkenedFrameView.invalidate();
        }
        switch (captureState2.ordinal()) {
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = contourView.A05;
                break;
            default:
                i = 0;
                break;
        }
        if (contourView.A01 != i) {
            contourView.A01 = i;
            ValueAnimator valueAnimator2 = new ValueAnimator();
            valueAnimator2.setIntValues(new int[]{contourView.A00, contourView.A01});
            valueAnimator2.setEvaluator(new ArgbEvaluator());
            valueAnimator2.addUpdateListener(new C11435SUp((Object) contourView, 3));
            valueAnimator2.start();
        }
        int i3 = rect.left;
        int i4 = rect.right;
        ImageView imageView = contourView.A08;
        int width = i4 - imageView.getWidth();
        int i5 = rect.top;
        int height = rect.bottom - imageView.getHeight();
        ImageView imageView2 = contourView.A06;
        float height2 = (float) (imageView2.getHeight() + height);
        TextView textView = contourView.A0A;
        float A032 = (height2 + ((AnonymousClass7TE.A03(contourView) - height2) / 2.0f)) - (AnonymousClass7TE.A03(textView) / 2.0f);
        int i6 = (int) contourView.A04;
        int i7 = i3 - i6;
        int i8 = i5 - i6;
        int i9 = width + i6;
        int i10 = height + i6;
        if (z) {
            C9575RdF.A00(imageView, i7, i8);
            C9575RdF.A00(contourView.A09, i9, i8);
            C9575RdF.A00(imageView2, i7, i10);
            C9575RdF.A00(contourView.A07, i9, i10);
            textView.animate().y(A032).setDuration(300);
        } else {
            float f4 = (float) i7;
            imageView.setX(f4);
            float f5 = (float) i8;
            imageView.setY(f5);
            ImageView imageView3 = contourView.A09;
            float f6 = (float) i9;
            imageView3.setX(f6);
            imageView3.setY(f5);
            imageView2.setX(f4);
            float f7 = (float) i10;
            imageView2.setY(f7);
            ImageView imageView4 = contourView.A07;
            imageView4.setX(f6);
            imageView4.setY(f7);
            if (textView.getY() != A032) {
                textView.setY(A032);
                textView.requestLayout();
            }
        }
        if (contourView.A02) {
            DbY.A0G(contourView).start();
            contourView.A02 = false;
        }
    }
}
