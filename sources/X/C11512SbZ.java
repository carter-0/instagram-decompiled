package X;

import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.facebookpay.widget.navibar.NavigationBar;
import com.instagram.android.R;

/* renamed from: X.SbZ  reason: case insensitive filesystem */
public final class C11512SbZ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;

    public C11512SbZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onGlobalLayout() {
        Animatable animatable;
        String str;
        FrameLayout.LayoutParams layoutParams;
        boolean A1V;
        switch (this.A00) {
            case 0:
                RQW rqw = (RQW) this.A01;
                Rect A0W = AnonymousClass7TE.A0W();
                rqw.A01.getWindowVisibleDisplayFrame(A0W);
                int i = A0W.bottom - A0W.top;
                if (i != rqw.A00) {
                    View view = rqw.A01;
                    int height = view.getRootView().getHeight();
                    int i2 = height - i;
                    if (i2 > height / 4) {
                        layoutParams = rqw.A02;
                        height -= i2;
                    } else {
                        layoutParams = rqw.A02;
                    }
                    layoutParams.height = height;
                    view.requestLayout();
                    rqw.A00 = i;
                    return;
                }
                return;
            case 1:
                NavigationBar navigationBar = (NavigationBar) this.A01;
                C51967G9n.A0y(navigationBar, this);
                LinearLayout linearLayout = navigationBar.A07;
                str = "navbarCenterContainer";
                if (linearLayout != null) {
                    if (linearLayout.getMeasuredWidth() != navigationBar.A00) {
                        NavigationBar.A01(navigationBar);
                        navigationBar.A00 = linearLayout.getMeasuredWidth();
                        return;
                    }
                    return;
                }
                break;
            case 2:
                NavigationBar navigationBar2 = (NavigationBar) this.A01;
                C51967G9n.A0y(navigationBar2, this);
                LinearLayout linearLayout2 = navigationBar2.A08;
                str = "navbarLeftContainer";
                if (linearLayout2 != null) {
                    if (linearLayout2.getMeasuredWidth() != navigationBar2.A01) {
                        NavigationBar.A01(navigationBar2);
                        navigationBar2.A01 = linearLayout2.getMeasuredWidth();
                        return;
                    }
                    return;
                }
                break;
            case 3:
                NavigationBar navigationBar3 = (NavigationBar) this.A01;
                C51967G9n.A0y(navigationBar3, this);
                LinearLayout linearLayout3 = navigationBar3.A09;
                str = "navbarRightContainer";
                if (linearLayout3 != null) {
                    if (linearLayout3.getMeasuredWidth() != navigationBar3.A02) {
                        NavigationBar.A01(navigationBar3);
                        navigationBar3.A02 = linearLayout3.getMeasuredWidth();
                        return;
                    }
                    return;
                }
                break;
            case 4:
                ProgressBar progressBar = (ProgressBar) this.A01;
                C51967G9n.A0y(progressBar, this);
                Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                0qQ.A0C(indeterminateDrawable, C273654mx.A00(16));
                Drawable findDrawableByLayerId = ((LayerDrawable) indeterminateDrawable).findDrawableByLayerId(R.id.layer_item_icon);
                if ((findDrawableByLayerId instanceof Animatable) && (animatable = (Animatable) findDrawableByLayerId) != null) {
                    animatable.start();
                    return;
                }
                return;
            case 5:
                C11380SQs sQs = (C11380SQs) this.A01;
                View view2 = sQs.A04;
                if (view2 != null) {
                    int[] iArr = sQs.A09;
                    view2.getLocationOnScreen(iArr);
                    int height2 = view2.getHeight();
                    int i3 = iArr[1] + height2;
                    int i4 = sQs.A02;
                    if (i4 == -1) {
                        sQs.A02 = i3;
                        sQs.A00 = i3;
                        sQs.A01 = height2;
                        if (!sQs.A08.isEmpty()) {
                            C11380SQs.A02(sQs, 0);
                            return;
                        }
                        return;
                    }
                    if (!(sQs.A00 == i3 || sQs.A01 == height2)) {
                        if (i4 < i3) {
                            sQs.A02 = i3;
                            i4 = i3;
                        }
                        int max = Math.max(i4 - i3, 0);
                        if (!sQs.A08.isEmpty()) {
                            C11380SQs.A02(sQs, max);
                        }
                    }
                    sQs.A00 = i3;
                    sQs.A01 = height2;
                    return;
                }
                return;
            default:
                C46656Dib dib = (C46656Dib) ((C47691EDa) this.A01).A01;
                View view3 = dib.mView;
                if (view3 != null) {
                    C51967G9n.A0y(view3, this);
                    T8A t8a = (T8A) 1WM.getInstance().getPerformanceLogger(dib.A0V);
                    synchronized (t8a) {
                        A1V = AnonymousClass7TF.A1V(t8a.A01);
                    }
                    if (A1V) {
                        Pxh.A1S(t8a.A0K);
                        t8a.Cje();
                        return;
                    }
                    return;
                }
                return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
