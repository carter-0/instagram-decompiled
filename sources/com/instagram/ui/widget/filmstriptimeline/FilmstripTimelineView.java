package com.instagram.ui.widget.filmstriptimeline;

import X.0qQ;
import X.A9E;
import X.AZG;
import X.AnonymousClass000;
import X.AnonymousClass8HH;
import X.AnonymousClass8HZ;
import X.B2X;
import X.C355238Pf;
import X.C355258Ph;
import X.C355278Pj;
import X.C355298Pl;
import X.C355308Pm;
import X.C355368Ps;
import X.C355378Pt;
import X.C355428Py;
import X.C41186Apk;
import X.C60999Juv;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FilmstripTimelineView extends FrameLayout {
    public AnonymousClass8HH A00;
    public boolean A01;
    public boolean A02;
    public C355298Pl A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Drawable A07;
    public final FrameLayout A08;
    public final C355428Py A09;
    public final C355368Ps A0A;
    public final C355308Pm A0B;
    public final int A0C;
    public final C355258Ph A0D;
    public final C355238Pf A0E;
    public final C355278Pj A0F;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FilmstripTimelineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void A00() {
        C355428Py r2 = this.A09;
        ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
            r2.setLayoutParams(layoutParams);
            r2.requestLayout();
        }
    }

    public final void A01(float f, float f2) {
        if (f >= 0.0f && f <= 1.0f && f2 >= 0.0f && f2 <= 1.0f && f <= f2) {
            C355308Pm r0 = this.A0B;
            r0.A01 = f;
            r0.A02 = f2;
            r0.postInvalidate();
            this.A0A.A05(f, f2);
            C355428Py r02 = this.A09;
            r02.A01 = f;
            r02.A00 = f2;
        }
    }

    public final void A02(AnonymousClass8HZ r4, int i, int i2) {
        setSeekPosition(0.0f);
        C355308Pm r2 = this.A0B;
        B2X b2x = r2.A09;
        if (b2x != r2.A0B || r2.A07 != i || r2.A06 != i2) {
            if (b2x != null) {
                b2x.reset();
            }
            AZG azg = r2.A0B;
            if (azg == null) {
                Context context = r2.getContext();
                0qQ.A07(context);
                azg = new AZG(context, r2);
                r2.A0B = azg;
            }
            r2.A09 = azg;
            azg.A06 = r4;
            r2.A07 = i;
            r2.A06 = i2;
            r2.post(new C41186Apk(r2, i, i2));
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        int action = motionEvent.getAction();
        if (action == 0) {
            requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            requestDisallowInterceptTouchEvent(false);
        }
        C355368Ps r1 = this.A0A;
        if (r1.getVisibility() != 0 || !r1.dispatchTouchEvent(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setGeneratedVideoTimelineBitmaps(C60999Juv juv) {
        0qQ.A0B(juv, 0);
        this.A0B.setGeneratedVideoTimelineBitmaps(juv);
        requestLayout();
    }

    public final void setMeasureSpecBuilder(C355298Pl r7) {
        0qQ.A0B(r7, 0);
        this.A03 = r7;
        C355308Pm r3 = this.A0B;
        ViewGroup.LayoutParams layoutParams = r3.getLayoutParams();
        String A002 = AnonymousClass000.A00(1);
        0qQ.A0C(layoutParams, A002);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C355298Pl r0 = this.A03;
        marginLayoutParams.setMargins(0, r0.Br8(), 0, r0.Br6());
        r3.setLayoutParams(marginLayoutParams);
        C355368Ps r32 = this.A0A;
        ViewGroup.LayoutParams layoutParams2 = r32.getLayoutParams();
        0qQ.A0C(layoutParams2, A002);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        C355298Pl r02 = this.A03;
        marginLayoutParams2.setMargins(0, r02.Br8(), 0, r02.Br6());
        r32.setLayoutParams(marginLayoutParams2);
        requestLayout();
    }

    public final void setOverlaySegments(List list) {
        0qQ.A0B(list, 0);
        this.A0B.setOverlaySegments(list);
    }

    public final void setShowSeekbar(boolean z) {
        int i = 0;
        C355428Py r0 = this.A09;
        if (!z) {
            i = 8;
        }
        r0.setVisibility(i);
    }

    public final void setTrimmerSnapValues(float[] fArr) {
        0qQ.A0B(fArr, 0);
        this.A0A.A0C = fArr;
    }

    public final void setupTrimmer(A9E a9e) {
        0qQ.A0B(a9e, 0);
        a9e.A05 = this.A06;
        a9e.A02 = this.A04;
        if (this.A01) {
            int i = this.A05;
            Drawable drawable = this.A07;
            a9e.A03 = i;
            a9e.A06 = drawable;
        }
        if (this.A02) {
            int i2 = this.A05;
            Drawable drawable2 = this.A07;
            a9e.A04 = i2;
            a9e.A08 = drawable2;
        }
        this.A0A.setupTrimmer(a9e);
    }

    private final void setSeekbarMargins(FrameLayout.LayoutParams layoutParams) {
        int i;
        int i2;
        C355368Ps r4 = this.A0A;
        if (r4.getVisibility() != 8) {
            boolean z = this.A01;
            i = this.A06;
            if (z) {
                i += this.A05;
            }
        } else {
            i = 0;
        }
        if (r4.getVisibility() != 8) {
            boolean z2 = this.A02;
            i2 = this.A06;
            if (z2) {
                i2 += this.A05;
            }
        } else {
            i2 = 0;
        }
        int i3 = this.A0C / 2;
        layoutParams.setMargins(i - i3, 0, i2 - i3, 0);
    }

    public final void A03(boolean z, boolean z2, boolean z3) {
        C355428Py r0 = this.A09;
        r0.A06 = z;
        r0.A08 = z2;
        r0.A07 = z3;
    }

    public final int getAdditionalHeightFromSeekbar() {
        C355298Pl r0 = this.A03;
        return r0.Br8() + r0.Br6();
    }

    public final int getFilmstripTimelineWidth() {
        return this.A0B.getWidth();
    }

    public final boolean getIncludeLeftHandle() {
        return this.A01;
    }

    public final boolean getIncludeRightHandle() {
        return this.A02;
    }

    public final int getInnerContainerLeft() {
        return this.A08.getLeft();
    }

    public final int getInnerContainerRight() {
        return this.A08.getRight();
    }

    public final float getLeftTrimmerPosition() {
        return this.A0A.getLeftTrimmerValue();
    }

    public final int getMaxSelectedFilmstripWidth() {
        int width = this.A08.getWidth();
        boolean z = this.A01;
        int i = this.A06;
        int i2 = i;
        if (z) {
            i += this.A05;
        }
        if (this.A02) {
            i2 += this.A05;
        }
        return width - (i + i2);
    }

    public final float getRightTrimmerPosition() {
        return this.A0A.getRightTrimmerValue();
    }

    public final float getScrollXPercent() {
        return this.A0B.getScrollXPercent();
    }

    public final float getSeekPosition() {
        return this.A09.A02;
    }

    public final float getWidthScrollXPercent() {
        return this.A0B.getWidthScrollXPercent();
    }

    public final void onMeasure(int i, int i2) {
        C355298Pl r0 = this.A03;
        C355308Pm r2 = this.A0B;
        super.onMeasure(r0.AEj(this, r2, i), this.A03.AEW(this, r2, i2));
    }

    public final void setCornerRadius(int i) {
        this.A0B.setCornerRadius(i);
    }

    public final void setDragBeyondAllowed(boolean z) {
        this.A0A.A06 = z;
    }

    public final void setDurationSlidingAllowed(boolean z) {
        this.A0A.A07 = z;
    }

    public final void setFilmstripScrollX(int i) {
        C355308Pm.A03(this.A0B, (float) i, false);
    }

    public final void setFilmstripTimelineWidth(int i) {
        C355308Pm r2 = this.A0B;
        ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
        layoutParams.width = -1;
        r2.setLayoutParams(layoutParams);
        r2.A08 = i;
        r2.A05 = getMaxSelectedFilmstripWidth();
    }

    public final void setInnerContainerClipChildren(boolean z) {
        FrameLayout frameLayout = this.A08;
        frameLayout.setClipChildren(z);
        frameLayout.requestLayout();
    }

    public final void setOnlyScrollXMargin(int i) {
        this.A0B.A04 = i;
        FrameLayout frameLayout = this.A08;
        if (frameLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
            frameLayout.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setScrollXMargin(int i) {
        C355378Pt r1 = this.A0A.A04;
        if (r1 != null) {
            r1.A06(0);
        }
        C355308Pm r2 = this.A0B;
        r2.A0D = true;
        r2.postInvalidate();
        boolean z = this.A01;
        int i2 = this.A06;
        if (z) {
            i2 += this.A05;
        }
        r2.A04 = i2 + i;
        FrameLayout frameLayout = this.A08;
        if (frameLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
            frameLayout.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setScrollXPercent(float f) {
        C355308Pm r2 = this.A0B;
        C355308Pm.A03(r2, ((float) r2.A08) * f, false);
    }

    public final void setSeekPosition(float f) {
        this.A09.setSeekbarValue(f);
    }

    public final void setSeekerWidth(int i) {
        this.A09.setSeekerWidth(i);
    }

    public final void setShowTrimmer(boolean z) {
        C355368Ps r1 = this.A0A;
        int i = 8;
        if (z) {
            i = 0;
        }
        r1.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = this.A09.getLayoutParams();
        0qQ.A0C(layoutParams, AnonymousClass000.A00(1));
        setSeekbarMargins((FrameLayout.LayoutParams) layoutParams);
    }

    public final void setTrimmerMaximumRange(float f) {
        this.A0A.setMaximumRange(f);
    }

    public final void setTrimmerMinimumRange(float f) {
        this.A0A.setMinimumRange(f);
    }

    public final void setAllowSeekbarTouch(boolean z) {
        A03(z, z, z);
    }

    public final void setIncludeLeftHandle(boolean z) {
        this.A01 = z;
    }

    public final void setIncludeRightHandle(boolean z) {
        this.A02 = z;
    }

    public final void setListener(AnonymousClass8HH r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FilmstripTimelineView(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r2 = 1
            r13 = r18
            X.0qQ.A0B(r13, r2)
            r3 = r19
            r0 = r20
            r14 = r17
            r14.<init>(r13, r3, r0)
            X.8Pe r12 = new X.8Pe
            r12.<init>(r14)
            r14.A0E = r12
            X.8Pg r11 = new X.8Pg
            r11.<init>(r14)
            r14.A0D = r11
            X.8Pi r6 = new X.8Pi
            r6.<init>(r14)
            r14.A0F = r6
            r14.A01 = r2
            r14.A02 = r2
            X.8Pk r0 = new X.8Pk
            r0.<init>(r14)
            r14.A03 = r0
            android.content.Context r1 = r14.getContext()
            int[] r0 = X.C71382cm.A0l
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r3, r0)
            X.0qQ.A07(r1)
            r10 = 0
            boolean r0 = r1.getBoolean(r10, r2)
            r14.A01 = r0
            boolean r0 = r1.getBoolean(r2, r2)
            r14.A02 = r0
            r0 = 2
            int r5 = r1.getInt(r0, r10)
            r14.A04 = r5
            r0 = 3
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto L_0x0155
            r14.A07 = r0
            r1.recycle()
            android.content.res.Resources r9 = r13.getResources()
            r0 = 2131975541(0x7f135d75, float:1.9588177E38)
            java.lang.String r0 = r9.getString(r0)
            r14.setContentDescription(r0)
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r9.getDimensionPixelSize(r0)
            r14.A05 = r0
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r0 = r9.getDimensionPixelSize(r0)
            r14.A06 = r0
            r8 = -1
            r3 = 0
            r4 = 0
            r0 = 0
            r2 = 0
            r1 = 2131165195(0x7f07000b, float:1.79446E38)
            int r15 = r9.getDimensionPixelSize(r1)
            int r1 = r9.getDimensionPixelSize(r1)
            r14.A0C = r1
            X.8Pm r7 = new X.8Pm
            r7.<init>(r13)
            r14.A0B = r7
            r7.A0A = r6
            r7.setDimmerColor(r5)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r6.<init>(r8, r8)
            X.8Pl r1 = r14.A03
            int r5 = r1.Br8()
            int r1 = r1.Br6()
            r6.setMargins(r10, r5, r10, r1)
            r14.addView(r7, r6)
            android.widget.FrameLayout r7 = new android.widget.FrameLayout
            r7.<init>(r13)
            r14.A08 = r7
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r8, r8)
            r14.addView(r7, r1)
            X.8Ps r6 = new X.8Ps
            r6.<init>(r13)
            r14.A0A = r6
            int r5 = r14.A06
            int r1 = r14.A04
            r16 = r1
            boolean r1 = r14.A01
            if (r1 == 0) goto L_0x00d3
            int r4 = r14.A05
            android.graphics.drawable.Drawable r3 = r14.A07
        L_0x00d3:
            boolean r1 = r14.A02
            if (r1 == 0) goto L_0x00db
            int r2 = r14.A05
            android.graphics.drawable.Drawable r0 = r14.A07
        L_0x00db:
            X.8Pt r1 = new X.8Pt
            r1.<init>(r8, r15, r5, r10)
            if (r4 <= 0) goto L_0x00ed
            X.8Pw r15 = new X.8Pw
            r15.<init>(r4, r8)
            r15.A00(r3, r10)
            r1.A08(r15)
        L_0x00ed:
            if (r2 <= 0) goto L_0x00fa
            X.8Pw r3 = new X.8Pw
            r3.<init>(r2, r8)
            r3.A00(r0, r5)
            r1.A09(r3)
        L_0x00fa:
            r0 = r16
            r1.A06(r0)
            r6.A04 = r1
            int r0 = r6.getWidth()
            if (r0 <= 0) goto L_0x011d
            int r0 = r6.getHeight()
            if (r0 <= 0) goto L_0x011d
            X.8Pt r2 = r6.A04
            X.0qQ.A0A(r2)
            int r1 = r6.getWidth()
            int r0 = r6.getHeight()
            r2.setBounds(r10, r10, r1, r0)
        L_0x011d:
            r6.invalidate()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r9.getDimensionPixelSize(r0)
            r6.A02 = r0
            r6.A05 = r12
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r8, r8)
            X.8Pl r0 = r14.A03
            int r1 = r0.Br8()
            int r0 = r0.Br6()
            r2.setMargins(r10, r1, r10, r0)
            r7.addView(r6, r2)
            X.8Py r1 = new X.8Py
            r1.<init>(r13)
            r14.A09 = r1
            r1.A05 = r11
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r8, r8)
            r14.setSeekbarMargins(r0)
            r7.addView(r1, r0)
            return
        L_0x0155:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilmstripTimelineView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FilmstripTimelineView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
