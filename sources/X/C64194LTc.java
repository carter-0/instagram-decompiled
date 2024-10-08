package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.LTc  reason: case insensitive filesystem */
public final class C64194LTc implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;

    public C64194LTc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 2:
                DbS.A1U(this.A01);
                return;
            case 6:
                ValueAnimator valueAnimator = (ValueAnimator) this.A01;
                valueAnimator.removeAllListeners();
                valueAnimator.removeAllUpdateListeners();
                return;
            case 9:
                ((SegmentedProgressBar) AnonymousClass7TE.A14(((C64855LjH) this.A01).A0D)).setProgress(0.0f);
                return;
            default:
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
            case 1:
                C51965G9l.A1W(this.A01, animator);
                return;
            case 3:
                C59938Jc2 jc2 = (C59938Jc2) this.A01;
                ((IgImageView) AnonymousClass7TE.A14(jc2.A09)).setVisibility(8);
                View view = jc2.A05;
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setRotationY(0.0f);
                View view2 = jc2.A04;
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setRotationY(0.0f);
                return;
            case 5:
                C378529Qd r2 = (C378529Qd) this.A01;
                r2.A04.pause();
                ImageView imageView = r2.A01;
                if (imageView == null) {
                    0qQ.A0F("animationView");
                    throw AnonymousClass00P.createAndThrow();
                }
                imageView.setVisibility(8);
                MS7 ms7 = r2.A02;
                if (ms7 != null) {
                    ms7.CvI();
                    return;
                }
                return;
            case 6:
                ValueAnimator valueAnimator = (ValueAnimator) this.A01;
                valueAnimator.removeAllListeners();
                valueAnimator.removeAllUpdateListeners();
                return;
            case 7:
                GradientSpinner gradientSpinner = ((JZB) this.A01).A01;
                if (gradientSpinner != null) {
                    gradientSpinner.setVisibility(0);
                    gradientSpinner.A06();
                    return;
                }
                return;
            case 8:
                C315496jz r22 = (C315496jz) this.A01;
                if (r22.A09 != null) {
                    C64434Lbp lbp = new C64434Lbp();
                    View view3 = r22.A09;
                    0qQ.A0A(view3);
                    C315496jz.A00(view3.findViewById(R.id.title), lbp, r22, false);
                    View view4 = r22.A09;
                    0qQ.A0A(view4);
                    C315496jz.A00(view4.findViewById(R.id.tip_tap_forward), lbp, r22, false);
                    View view5 = r22.A09;
                    0qQ.A0A(view5);
                    C315496jz.A00(view5.findViewById(R.id.tip_pause), lbp, r22, false);
                    View view6 = r22.A09;
                    0qQ.A0A(view6);
                    C315496jz.A00(view6.findViewById(R.id.tip_tap_backward), lbp, r22, false);
                    View view7 = r22.A09;
                    0qQ.A0A(view7);
                    C315496jz.A00(view7.findViewById(R.id.tip_swipe), lbp, r22, true);
                    View view8 = r22.A09;
                    0qQ.A0A(view8);
                    C315496jz.A00(view8.findViewById(R.id.pinch_to_zoom_gesture_image), lbp, r22, false);
                    View view9 = r22.A09;
                    0qQ.A0A(view9);
                    C315496jz.A00(view9.findViewById(R.id.pinch_zoom_title), lbp, r22, true);
                    CopyOnWriteArrayList copyOnWriteArrayList = lbp.A01;
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((2cs) it.next()).A06 = true;
                    }
                    lbp.A00();
                    ((2cs) copyOnWriteArrayList.get(lbp.A00)).A03();
                    return;
                }
                return;
            case 9:
                return;
            default:
                DbS.A1U(this.A01);
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        Bitmap createBitmap;
        if (8 - this.A00 == 0) {
            C315496jz r4 = (C315496jz) this.A01;
            AnonymousClass6Z4 r0 = r4.A0E;
            if (r0 != null) {
                r0.A00.DkX();
            }
            View view = r4.A0K;
            view.setDrawingCacheEnabled(true);
            view.buildDrawingCache();
            if (view.getDrawingCache() != null) {
                Bitmap drawingCache = view.getDrawingCache();
                0qQ.A07(drawingCache);
                createBitmap = BlurUtil.blur(drawingCache, 0.1f, 9);
            } else {
                createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                0qQ.A0A(createBitmap);
            }
            Canvas A0B = JTO.A0B(createBitmap);
            Context context = r4.A0J;
            A0B.drawColor(context.getColor(R.color.background), PorterDuff.Mode.DST_OVER);
            BitmapDrawable A08 = JTQ.A08(context, createBitmap);
            view.destroyDrawingCache();
            view.setDrawingCacheEnabled(false);
            IgImageView igImageView = r4.A0C;
            if (igImageView != null) {
                igImageView.setBackground(A08);
                IgImageView igImageView2 = r4.A0C;
                if (igImageView2 != null) {
                    igImageView2.setAlpha(0.0f);
                    IgImageView igImageView3 = r4.A0C;
                    0qQ.A0A(igImageView3);
                    igImageView3.setVisibility(0);
                    IgImageView igImageView4 = r4.A0C;
                    0qQ.A0A(igImageView4);
                    igImageView4.animate().withLayer().setDuration(200).alpha(1.0f);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }
}
