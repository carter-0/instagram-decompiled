package X;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.ComposeView;
import java.lang.ref.WeakReference;

/* renamed from: X.54O  reason: invalid class name */
public abstract class AnonymousClass54O extends ViewGroup {
    public AnonymousClass5PL A00;
    public WeakReference A01;
    public IBinder A02;
    public C285035Pk A03;
    public C62320sa A04 = C284845Om.A00.CNb(this);
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public void A05(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public void A06(C286575Wy r5, int i) {
        int i2;
        ComposeView composeView = (ComposeView) this;
        r5.ExV(420213850);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (r5.AGw(composeView)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-943498961, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:439)");
            }
            0sL r1 = (0sL) composeView.A01.getValue();
            if (r1 == null) {
                r5.ExS(358373017);
            } else {
                r5.ExS(150107752);
                r1.invoke(r5, 0);
            }
            C286565Wx.A0L((C286565Wx) r5, false);
            if (0fL.A02()) {
                0fL.A00(-2118539315);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C377329Lk(composeView, i, 1);
        }
    }

    public void A07(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public abstract boolean getShouldCreateCompositionOnAttachedToWindow();

    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    private final void A00() {
        if (!this.A05) {
            throw new UnsupportedOperationException(002.A0g("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r5 != null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r8 = this;
            X.5Pk r0 = r8.A03
            if (r0 != 0) goto L_0x00b7
            r4 = 0
            r2 = 1
            r8.A05 = r2     // Catch:{ all -> 0x00b1 }
            X.5PL r6 = r8.A00     // Catch:{ all -> 0x00b1 }
            if (r6 != 0) goto L_0x0035
            X.5PL r6 = X.AnonymousClass5PK.A00(r8)     // Catch:{ all -> 0x00b1 }
            if (r6 != 0) goto L_0x00ad
            java.lang.ref.WeakReference r0 = r8.A01     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x00b1 }
            X.5PL r6 = (X.AnonymousClass5PL) r6     // Catch:{ all -> 0x00b1 }
            if (r6 == 0) goto L_0x00a9
            boolean r0 = r6 instanceof androidx.compose.runtime.Recomposer     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0035
            r0 = r6
            androidx.compose.runtime.Recomposer r0 = (androidx.compose.runtime.Recomposer) r0     // Catch:{ all -> 0x00b1 }
            X.05G r0 = r0.A0K     // Catch:{ all -> 0x00b1 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x00b1 }
            X.4e5 r1 = (X.AnonymousClass4e5) r1     // Catch:{ all -> 0x00b1 }
            X.4e5 r0 = X.AnonymousClass4e5.ShuttingDown     // Catch:{ all -> 0x00b1 }
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x00b1 }
            if (r0 <= 0) goto L_0x00a9
        L_0x0035:
            r0 = 11
            X.9LZ r1 = new X.9LZ     // Catch:{ all -> 0x00b1 }
            r1.<init>(r8, r0)     // Catch:{ all -> 0x00b1 }
            r0 = -656146368(0xffffffffd8e40040, float:-2.0055178E15)
            X.5PJ r7 = new X.5PJ     // Catch:{ all -> 0x00b1 }
            r7.<init>(r0, r2, r1)     // Catch:{ all -> 0x00b1 }
            android.view.ViewGroup$LayoutParams r0 = X.AnonymousClass5Py.A00     // Catch:{ all -> 0x00b1 }
            X.C285155Pz.A00()     // Catch:{ all -> 0x00b1 }
            int r0 = r8.getChildCount()     // Catch:{ all -> 0x00b1 }
            if (r0 <= 0) goto L_0x00a5
            android.view.View r5 = r8.getChildAt(r4)     // Catch:{ all -> 0x00b1 }
            boolean r0 = r5 instanceof androidx.compose.ui.platform.AndroidComposeView     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x005b
            androidx.compose.ui.platform.AndroidComposeView r5 = (androidx.compose.ui.platform.AndroidComposeView) r5     // Catch:{ all -> 0x00b1 }
            if (r5 != 0) goto L_0x006d
        L_0x005b:
            android.content.Context r1 = r8.getContext()     // Catch:{ all -> 0x00b1 }
            X.4Cc r0 = r6.A08()     // Catch:{ all -> 0x00b1 }
            androidx.compose.ui.platform.AndroidComposeView r5 = new androidx.compose.ui.platform.AndroidComposeView     // Catch:{ all -> 0x00b1 }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x00b1 }
            android.view.ViewGroup$LayoutParams r0 = X.AnonymousClass5Py.A00     // Catch:{ all -> 0x00b1 }
            r8.addView((android.view.View) r5, (android.view.ViewGroup.LayoutParams) r0)     // Catch:{ all -> 0x00b1 }
        L_0x006d:
            X.5R6 r1 = r5.A0Y     // Catch:{ all -> 0x00b1 }
            X.5Wk r0 = new X.5Wk     // Catch:{ all -> 0x00b1 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b1 }
            X.5Wn r3 = new X.5Wn     // Catch:{ all -> 0x00b1 }
            r3.<init>(r0, r6)     // Catch:{ all -> 0x00b1 }
            r1 = 2131444055(0x7f0b4157, float:1.8510196E38)
            java.lang.Object r2 = r5.getTag(r1)     // Catch:{ all -> 0x00b1 }
            boolean r0 = r2 instanceof X.AnonymousClass5XC     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0088
            X.5XC r2 = (X.AnonymousClass5XC) r2     // Catch:{ all -> 0x00b1 }
            if (r2 != 0) goto L_0x0090
        L_0x0088:
            X.5XC r2 = new X.5XC     // Catch:{ all -> 0x00b1 }
            r2.<init>(r3, r5)     // Catch:{ all -> 0x00b1 }
            r5.setTag(r1, r2)     // Catch:{ all -> 0x00b1 }
        L_0x0090:
            r2.ESi(r7)     // Catch:{ all -> 0x00b1 }
            X.4Cc r0 = r5.A05     // Catch:{ all -> 0x00b1 }
            X.4Cc r1 = r6.A08()     // Catch:{ all -> 0x00b1 }
            boolean r0 = X.0qQ.A0K(r0, r1)     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x00a2
            r5.setCoroutineContext(r1)     // Catch:{ all -> 0x00b1 }
        L_0x00a2:
            r8.A03 = r2     // Catch:{ all -> 0x00b1 }
            goto L_0x00b5
        L_0x00a5:
            r8.removeAllViews()     // Catch:{ all -> 0x00b1 }
            goto L_0x005b
        L_0x00a9:
            androidx.compose.runtime.Recomposer r6 = X.AnonymousClass5PK.A02(r8)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r8.A02(r6)     // Catch:{ all -> 0x00b1 }
            goto L_0x0035
        L_0x00b1:
            r0 = move-exception
            r8.A05 = r4
            throw r0
        L_0x00b5:
            r8.A05 = r4
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54O.A01():void");
    }

    private final void A02(AnonymousClass5PL r3) {
        if ((!(r3 instanceof Recomposer) || ((AnonymousClass4e5) ((Recomposer) r3).A0K.getValue()).compareTo(AnonymousClass4e5.ShuttingDown) > 0) && r3 != null) {
            this.A01 = new WeakReference(r3);
        }
    }

    private final void setParentContext(AnonymousClass5PL r3) {
        if (this.A00 != r3) {
            this.A00 = r3;
            if (r3 != null) {
                this.A01 = null;
            }
            C285035Pk r0 = this.A03;
            if (r0 != null) {
                r0.dispose();
                this.A03 = null;
                if (isAttachedToWindow()) {
                    A01();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.A02 != iBinder) {
            this.A02 = iBinder;
            this.A01 = null;
        }
    }

    public final void A03() {
        if (this.A00 != null || isAttachedToWindow()) {
            A01();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
    }

    public final void A04() {
        C285035Pk r0 = this.A03;
        if (r0 != null) {
            r0.dispose();
        }
        this.A03 = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        if (this.A03 != null) {
            return true;
        }
        return false;
    }

    public final boolean getShowLayoutBounds() {
        return this.A07;
    }

    public final boolean isTransitionGroup() {
        if (!this.A06 || super.isTransitionGroup()) {
            return true;
        }
        return false;
    }

    public final void setShowLayoutBounds(boolean z) {
        this.A07 = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((AndroidComposeView) ((C268124co) childAt)).A0A = z;
        }
    }

    public final void setViewCompositionStrategy(C284855On r2) {
        C62320sa r0 = this.A04;
        if (r0 != null) {
            r0.invoke();
        }
        this.A04 = r2.CNb(this);
    }

    public AnonymousClass54O(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void addView(View view) {
        A00();
        super.addView(view);
    }

    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A00();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1154412312);
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            A01();
        }
        AnonymousClass0fD.A0D(-2031975127, A062);
    }

    public final void onMeasure(int i, int i2) {
        A01();
        A05(i, i2);
    }

    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.A06 = true;
    }

    public final void setParentCompositionContext(AnonymousClass5PL r1) {
        setParentContext(r1);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        A07(z, i, i2, i3, i4);
    }

    public final void addView(View view, int i, int i2) {
        A00();
        super.addView(view, i, i2);
    }

    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        A00();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public final void addView(View view, int i) {
        A00();
        super.addView(view, i);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        A00();
        super.addView(view, layoutParams);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A00();
        super.addView(view, i, layoutParams);
    }
}
