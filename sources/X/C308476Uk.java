package X;

import android.animation.LayoutTransition;
import android.animation.TimeInterpolator;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.6Uk  reason: invalid class name and case insensitive filesystem */
public final class C308476Uk {
    public int A00 = 8;
    public final IgFrameLayout A01;
    public final IgSimpleImageView A02;
    public final ColorFilterAlphaImageView A03;

    public C308476Uk(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 1);
        View requireViewById = viewGroup.requireViewById(R.id.row_thread_composer_send_button_container);
        0qQ.A07(requireViewById);
        IgFrameLayout igFrameLayout = (IgFrameLayout) requireViewById;
        this.A01 = igFrameLayout;
        View requireViewById2 = viewGroup.requireViewById(R.id.row_thread_composer_send_button_background);
        0qQ.A07(requireViewById2);
        this.A03 = (ColorFilterAlphaImageView) requireViewById2;
        View requireViewById3 = igFrameLayout.requireViewById(R.id.row_thread_composer_send_button_icon);
        0qQ.A07(requireViewById3);
        this.A02 = (IgSimpleImageView) requireViewById3;
    }

    public final void A01(Boolean bool, boolean z, boolean z2) {
        IgFrameLayout igFrameLayout;
        float f;
        TimeInterpolator overshootInterpolator;
        float rotation;
        ViewGroup viewGroup;
        float f2 = 1.0f;
        int i = this.A00;
        if (!z ? i == 0 : i == 8) {
            int i2 = 8;
            if (z) {
                i2 = 0;
            }
            this.A00 = i2;
            if (z2) {
                IgFrameLayout igFrameLayout2 = this.A01;
                ViewParent parent = igFrameLayout2.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.setLayoutTransition((LayoutTransition) null);
                }
                if (C294975nL.A01(igFrameLayout2, 1).A0W()) {
                    f = igFrameLayout2.getScaleX();
                } else {
                    f = 1.0f;
                    if (z) {
                        f = 0.3f;
                    }
                }
                if (!z) {
                    f2 = 0.0f;
                }
                long A022 = AnonymousClass1GB.A02((double) (Math.abs(f - f2) * 140.0f));
                if (this.A00 == 0) {
                    IgSimpleImageView igSimpleImageView = this.A02;
                    if (C294975nL.A01(igSimpleImageView, 1).A0W() || igFrameLayout2.getVisibility() == 0) {
                        rotation = igSimpleImageView.getRotation();
                    } else {
                        rotation = 120.0f;
                    }
                    igSimpleImageView.setRotation(rotation);
                    C294975nL A012 = C294975nL.A01(igSimpleImageView, 1);
                    A012.A0G();
                    C294975nL A0C = A012.A0C(140);
                    A0C.A0O(rotation, 0.0f);
                    A0C.A0D(new OvershootInterpolator(1.2f)).A0H();
                }
                C294975nL A013 = C294975nL.A01(igFrameLayout2, 1);
                A013.A0G();
                C294975nL A0C2 = A013.A0C(A022);
                A0C2.A0U(f, f2, -1.0f);
                A0C2.A0V(f, f2, -1.0f);
                A0C2.A0I(f2);
                A0C2.A05 = new PQL(this, bool);
                A0C2.A06 = new PQR(this);
                if (this.A00 == 8) {
                    overshootInterpolator = new C3020561i();
                } else {
                    overshootInterpolator = new OvershootInterpolator(1.2f);
                }
                A0C2.A0D(overshootInterpolator);
                A0C2.A0H();
                return;
            }
            igFrameLayout = this.A01;
            if (i2 == 0) {
                igFrameLayout.setVisibility(0);
            } else {
                igFrameLayout.setVisibility(8);
            }
            if (bool == null) {
                return;
            }
        } else if (bool != null) {
            igFrameLayout = this.A01;
        } else {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        igFrameLayout.setEnabled(booleanValue);
        if (booleanValue) {
            igFrameLayout.setAlpha(1.0f);
        } else {
            igFrameLayout.setAlpha(0.5f);
        }
    }

    public final void A00(int i, boolean z) {
        float dimensionPixelSize = (float) this.A01.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize}, (RectF) null, (float[]) null));
        C308486Ul.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, i);
        int i2 = 255;
        if (z) {
            i2 = 77;
        }
        shapeDrawable.setAlpha(i2);
        this.A03.setBackground(shapeDrawable);
    }
}
