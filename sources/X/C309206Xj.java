package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.6Xj  reason: invalid class name and case insensitive filesystem */
public abstract class C309206Xj extends ProgressBar {
    public int A00;
    public int A01 = 4;
    public C309296Xs A02;
    public C309276Xq A03;
    public boolean A04 = false;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final C309246Xn A08 = new C309256Xo(this);
    public final C309246Xn A09 = new C309236Xm(this);
    public final Runnable A0A = new C309226Xl(this);
    public final Runnable A0B = new C309216Xk(this);

    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    public final synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        C309336Xw currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            int A022 = currentDrawingDelegate.A02();
            int A012 = currentDrawingDelegate.A01();
            if (A022 < 0) {
                i3 = getMeasuredWidth();
            } else {
                i3 = A022 + getPaddingLeft() + getPaddingRight();
            }
            if (A012 < 0) {
                i4 = getMeasuredHeight();
            } else {
                i4 = A012 + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(i3, i4);
        }
    }

    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            if (!A03() || !z) {
                C309306Xt r1 = (C309306Xt) getCurrentDrawable();
                if (r1 != null) {
                    r1.A03(false, false, false);
                }
                super.setIndeterminate(z);
                C309306Xt r2 = (C309306Xt) getCurrentDrawable();
                if (r2 != null) {
                    r2.A03(A03(), false, false);
                }
                this.A04 = false;
            } else {
                throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
            }
        }
    }

    public void setIndicatorColor(int... iArr) {
        int i;
        if (iArr.length == 0) {
            TypedValue A022 = C298035sl.A02(getContext(), R.attr.colorPrimary);
            if (A022 != null) {
                i = A022.data;
            } else {
                i = -1;
            }
            iArr = new int[]{i};
        }
        C309276Xq r1 = this.A03;
        if (!Arrays.equals(r1.A05, iArr)) {
            r1.A05 = iArr;
            ((AnonymousClass6Y1) super.getIndeterminateDrawable()).A01.A01();
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            A02(i, false);
        }
    }

    public int getHideAnimationBehavior() {
        return this.A03.A00;
    }

    public int[] getIndicatorColor() {
        return this.A03.A05;
    }

    public int getShowAnimationBehavior() {
        return this.A03.A01;
    }

    public int getTrackColor() {
        return this.A03.A02;
    }

    public int getTrackCornerRadius() {
        return this.A03.A03;
    }

    public int getTrackThickness() {
        return this.A03.A04;
    }

    public void setAnimatorDurationScaleProvider(C309296Xs r2) {
        this.A02 = r2;
        if (super.getProgressDrawable() != null) {
            ((C309306Xt) super.getProgressDrawable()).A04 = r2;
        }
        if (super.getIndeterminateDrawable() != null) {
            ((C309306Xt) super.getIndeterminateDrawable()).A04 = r2;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.A03.A00 = i;
        invalidate();
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof AnonymousClass6Y1) {
            ((C309306Xt) drawable).A03(false, false, false);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
        super.setIndeterminateDrawable(drawable);
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof AnonymousClass6Y6) {
            C309306Xt r3 = (C309306Xt) drawable;
            r3.A03(false, false, false);
            super.setProgressDrawable(r3);
            r3.setLevel((int) ((((float) getProgress()) / ((float) getMax())) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.A03.A01 = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        C309276Xq r1 = this.A03;
        if (r1.A02 != i) {
            r1.A02 = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        C309276Xq r1 = this.A03;
        if (r1.A03 != i) {
            r1.A03 = Math.min(i, r1.A04 / 2);
        }
    }

    public void setTrackThickness(int i) {
        C309276Xq r1 = this.A03;
        if (r1.A04 != i) {
            r1.A04 = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.A01 = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.6Xs, java.lang.Object] */
    public C309206Xj(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C297835sR.A00(context, attributeSet, i, 2132018559), attributeSet, i);
        Context context2 = getContext();
        this.A03 = A01(context2, attributeSet);
        TypedArray A002 = C297855sT.A00(context2, attributeSet, C297865sU.A03, new int[0], i, i2);
        A002.getInt(5, -1);
        this.A07 = Math.min(A002.getInt(3, -1), IgNetworkConsentStorage.MAX_ENTRIES);
        A002.recycle();
        this.A02 = new Object();
        this.A05 = true;
    }

    public static void A00(C309206Xj r3) {
        ((C309306Xt) r3.getCurrentDrawable()).A03(false, false, true);
        if (super.getProgressDrawable() != null && super.getProgressDrawable().isVisible()) {
            return;
        }
        if (super.getIndeterminateDrawable() == null || !super.getIndeterminateDrawable().isVisible()) {
            r3.setVisibility(4);
        }
    }

    private C309336Xw getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (super.getIndeterminateDrawable() != null) {
                return ((AnonymousClass6Y1) super.getIndeterminateDrawable()).A00;
            }
            return null;
        } else if (super.getProgressDrawable() != null) {
            return ((AnonymousClass6Y6) super.getProgressDrawable()).A01;
        } else {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.6Xq, X.6Xp] */
    public C309276Xq A01(Context context, AttributeSet attributeSet) {
        ? r3 = new C309276Xq(context, attributeSet, R.attr.circularProgressIndicatorStyle, 2132018523);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        TypedArray A002 = C297855sT.A00(context, attributeSet, C297865sU.A08, new int[0], R.attr.circularProgressIndicatorStyle, 2132018523);
        r3.A02 = Math.max(C309286Xr.A00(context, A002, 2, dimensionPixelSize), r3.A04 * 2);
        r3.A01 = C309286Xr.A00(context, A002, 1, dimensionPixelSize2);
        r3.A00 = A002.getInt(0, 0);
        A002.recycle();
        return r3;
    }

    public void A02(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (super.getProgressDrawable() != null && !z) {
                super.getProgressDrawable().jumpToCurrentState();
            }
        } else if (super.getProgressDrawable() != null) {
            this.A00 = i;
            this.A06 = z;
            this.A04 = true;
            if (!super.getIndeterminateDrawable().isVisible() || Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                C309246Xn r0 = this.A09;
                super.getIndeterminateDrawable();
                r0.A00();
                return;
            }
            ((AnonymousClass6Y1) super.getIndeterminateDrawable()).A01.A02();
        }
    }

    public final boolean A03() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() == 0) {
                    return true;
                }
                return false;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return super.getIndeterminateDrawable();
        }
        return super.getProgressDrawable();
    }

    public final void invalidate() {
        int A032 = AnonymousClass0fD.A03(1215123895);
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
        AnonymousClass0fD.A0A(1267403212, A032);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1794676808);
        super.onAttachedToWindow();
        if (!(super.getProgressDrawable() == null || super.getIndeterminateDrawable() == null)) {
            ((AnonymousClass6Y1) super.getIndeterminateDrawable()).A01.A05(this.A09);
        }
        if (super.getProgressDrawable() != null) {
            C309306Xt r2 = (C309306Xt) super.getProgressDrawable();
            C309246Xn r1 = this.A08;
            List list = r2.A05;
            if (list == null) {
                list = new ArrayList();
                r2.A05 = list;
            }
            if (!list.contains(r1)) {
                r2.A05.add(r1);
            }
        }
        if (super.getIndeterminateDrawable() != null) {
            C309306Xt r22 = (C309306Xt) super.getIndeterminateDrawable();
            C309246Xn r12 = this.A08;
            List list2 = r22.A05;
            if (list2 == null) {
                list2 = new ArrayList();
                r22.A05 = list2;
            }
            if (!list2.contains(r12)) {
                r22.A05.add(r12);
            }
        }
        if (A03()) {
            if (this.A07 > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
        AnonymousClass0fD.A0D(-1474763308, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-678117808);
        removeCallbacks(this.A0A);
        removeCallbacks(this.A0B);
        ((C309306Xt) getCurrentDrawable()).A03(false, false, false);
        if (super.getIndeterminateDrawable() != null) {
            C309306Xt r2 = (C309306Xt) super.getIndeterminateDrawable();
            C309246Xn r1 = this.A08;
            List list = r2.A05;
            if (list != null && list.contains(r1)) {
                r2.A05.remove(r1);
                if (r2.A05.isEmpty()) {
                    r2.A05 = null;
                }
            }
            ((AnonymousClass6Y1) super.getIndeterminateDrawable()).A01.A04();
        }
        if (super.getProgressDrawable() != null) {
            C309306Xt r22 = (C309306Xt) super.getProgressDrawable();
            C309246Xn r12 = this.A08;
            List list2 = r22.A05;
            if (list2 != null && list2.contains(r12)) {
                r22.A05.remove(r12);
                if (r22.A05.isEmpty()) {
                    r22.A05 = null;
                }
            }
        }
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(-738072773, A062);
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        if (this.A05) {
            ((C309306Xt) getCurrentDrawable()).A03(A03(), false, z);
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        int A062 = AnonymousClass0fD.A06(-935244027);
        super.onWindowVisibilityChanged(i);
        if (this.A05) {
            ((C309306Xt) getCurrentDrawable()).A03(A03(), false, false);
        }
        AnonymousClass0fD.A0D(-130662281, A062);
    }

    public AnonymousClass6Y1 getIndeterminateDrawable() {
        return (AnonymousClass6Y1) super.getIndeterminateDrawable();
    }

    public AnonymousClass6Y6 getProgressDrawable() {
        return (AnonymousClass6Y6) super.getProgressDrawable();
    }
}
