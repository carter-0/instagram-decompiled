package com.instagram.creation.base.ui.feedcolorfilterpicker;

import X.C60060Jeb;
import X.C64168LRo;
import X.C66501MUf;
import X.JTR;
import X.JTT;
import X.LVP;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.List;

public class FeedColorFilterPicker extends HorizontalScrollView implements View.OnClickListener {
    public static int A09 = -1887089959;
    public int A00;
    public int A01;
    public int A02;
    public LinearLayout A03;
    public C64168LRo A04;
    public C66501MUf A05;
    public List A06;
    public boolean A07;
    public boolean A08;

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = LVP.A00(8);
        public int A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    public FeedColorFilterPicker(Context context) {
        super(context);
        JTT.A1K(this);
    }

    public final int A01(C60060Jeb jeb) {
        int left = ((jeb.getLeft() - jeb.getWidth()) - getScrollX()) + getPaddingLeft();
        int right = (((jeb.getRight() + jeb.getWidth()) - getWidth()) - getScrollX()) + getPaddingLeft();
        if (right > 0) {
            left = right;
        } else if (left >= 0) {
            left = 0;
        }
        return Math.max(0, Math.min(getScrollX() + left, Math.max(0, JTR.A0B(getChildAt(0), this)))) - getScrollX();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        if (r4 != X.C66568MWw.A00(((X.C60060Jeb) r1.getChildAt(r1.getChildCount() - 2)).A05)) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r6) {
        /*
            r5 = this;
            r0 = -1265154930(0xffffffffb497448e, float:-2.8175822E-7)
            int r2 = X.AnonymousClass0fD.A05(r0)
            X.Jeb r6 = (X.C60060Jeb) r6
            r3 = 1
            X.Jez r0 = r6.A05
            int r4 = X.C66568MWw.A00(r0)
            r1 = r5
            boolean r0 = r5 instanceof com.instagram.creation.base.ui.feedcolorfilterpicker.FilterPicker
            if (r0 == 0) goto L_0x0036
            com.instagram.creation.base.ui.feedcolorfilterpicker.FilterPicker r1 = (com.instagram.creation.base.ui.feedcolorfilterpicker.FilterPicker) r1
            android.widget.LinearLayout r0 = r1.A03
            r0.getClass()
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0036
            android.widget.LinearLayout r1 = r1.A03
            int r0 = r1.getChildCount()
            int r0 = r0 + -2
            android.view.View r0 = r1.getChildAt(r0)
            X.Jeb r0 = (X.C60060Jeb) r0
            X.Jez r0 = r0.A05
            int r0 = X.C66568MWw.A00(r0)
            if (r4 == r0) goto L_0x003e
        L_0x0036:
            int r1 = r5.A01(r6)
            r0 = 0
            r5.smoothScrollBy(r1, r0)
        L_0x003e:
            X.MUf r0 = r5.A05
            if (r0 == 0) goto L_0x0045
            r0.Drd(r6, r3)
        L_0x0045:
            r0 = -535519141(0xffffffffe014a05b, float:-4.283864E19)
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker.onClick(android.view.View):void");
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() > 0) {
            int i5 = this.A00;
            if (i5 == -1 && this.A01 >= 0) {
                LinearLayout linearLayout = this.A03;
                linearLayout.getClass();
                i5 = A01((C60060Jeb) linearLayout.getChildAt(this.A01));
                this.A00 = i5;
            }
            if (i5 != -1) {
                this.A00 = -1;
                this.A01 = -1;
                scrollTo(i5, 0);
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        Parcelable superState = savedState.getSuperState();
        superState.getClass();
        super.onRestoreInstanceState(superState);
        this.A00 = savedState.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker$SavedState] */
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        ? baseSavedState = new View.BaseSavedState(onSaveInstanceState);
        baseSavedState.A00 = getScrollX();
        return baseSavedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006d, code lost:
        if (r4 == 0) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setEffects(java.util.List r12, boolean r13, com.instagram.common.session.UserSession r14) {
        /*
            r11 = this;
            android.content.Context r2 = r11.getContext()
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r2)
            r11.A03 = r0
            r3 = 0
            r0.setOrientation(r3)
            android.widget.LinearLayout r1 = r11.A03
            r0 = 16
            r1.setGravity(r0)
            java.util.List r7 = r11.A06
            r7.clear()
            android.widget.LinearLayout r6 = r11.A03
            boolean r5 = r11 instanceof com.instagram.creation.base.ui.feedcolorfilterpicker.FilterPicker
            if (r5 == 0) goto L_0x00f1
            if (r13 == 0) goto L_0x00ed
            X.KiP r8 = X.C62592KiP.FILTER_DARK
        L_0x0025:
            int r0 = X.C63994LHs.A00(r2, r8)
            r11.A02 = r0
            r4 = 0
        L_0x002c:
            int r0 = r12.size()
            if (r4 >= r0) goto L_0x0100
            android.content.Context r0 = r6.getContext()
            X.Jeb r2 = new X.Jeb
            r2.<init>(r0)
            r2.setConfig(r8)
            X.LRo r0 = r11.A04
            r2.A00 = r0
            boolean r0 = r11.A07
            r2.A02 = r0
            java.lang.Object r1 = r12.get(r4)
            X.MWw r1 = (X.C66568MWw) r1
            r0 = 1
            r2.A03(r1, r0)
            java.lang.Object r0 = r12.get(r4)
            X.MWw r0 = (X.C66568MWw) r0
            java.lang.String r0 = r0.getName()
            r2.setContentDescription(r0)
            r2.setOnClickListener(r11)
            java.lang.Object r0 = r12.get(r4)
            X.MWw r0 = (X.C66568MWw) r0
            if (r5 == 0) goto L_0x006f
            boolean r0 = r0 instanceof X.C64944Lkj
            if (r0 != 0) goto L_0x006f
            r0 = 1
            if (r4 != 0) goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            r2.setDraggable(r0)
            boolean r0 = r11.A08
            X.Jez r10 = r2.A05
            r10.A07 = r0
            r10.invalidate()
            int r1 = A09
            int r0 = r1 + 1
            A09 = r0
            r2.setId(r1)
            X.MWw r0 = r10.A01
            X.0qQ.A07(r0)
            boolean r0 = r0 instanceof X.C64943Lki
            if (r0 == 0) goto L_0x00d0
            android.content.Context r9 = r2.getContext()
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = new com.instagram.ui.widget.spinner.SpinnerImageView
            r1.<init>(r9)
            r2.A01 = r1
            r0 = 2131239961(0x7f082419, float:1.8096244E38)
            r1.setImageResource(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r2.A01
            int r0 = r2.getHeight()
            android.widget.FrameLayout$LayoutParams r0 = X.C60060Jeb.A00(r2, r0)
            r2.addView(r1, r0)
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x00e9
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.C66568MWw.A03(r2, r10, r1)
            X.LRo r0 = r2.A00
            if (r0 == 0) goto L_0x00fb
            X.0qQ.A0A(r0)
            X.0qQ.A07(r9)
            r0.A07(r9, r1)
        L_0x00c4:
            android.os.Handler r1 = X.AnonymousClass7TF.A0D()
            X.M2F r0 = new X.M2F
            r0.<init>(r2)
            r1.post(r0)
        L_0x00d0:
            r7.add(r2)
            r9 = -2
            r1 = -1
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r9, r1)
            r6.addView(r2, r0)
            X.MUf r0 = r11.A05
            r0.getClass()
            r0.Drc(r2)
            int r4 = r4 + 1
            goto L_0x002c
        L_0x00e9:
            r2.A02()
            goto L_0x00c4
        L_0x00ed:
            X.KiP r8 = X.C62592KiP.FILTER
            goto L_0x0025
        L_0x00f1:
            if (r13 == 0) goto L_0x00f7
            X.KiP r8 = X.C62592KiP.TOOL_DARK
            goto L_0x0025
        L_0x00f7:
            X.KiP r8 = X.C62592KiP.TOOL
            goto L_0x0025
        L_0x00fb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0100:
            r6.setClipChildren(r3)
            android.content.res.Resources r2 = r11.getResources()
            int r1 = X.JTP.A03(r2)
            r0 = 2131165255(0x7f070047, float:1.7944722E38)
            int r0 = r2.getDimensionPixelSize(r0)
            int r1 = r1 + r0
            r11.setClipToPadding(r3)
            r11.setPadding(r1, r3, r1, r3)
            int r0 = r11.getChildCount()
            if (r0 != 0) goto L_0x0124
            android.widget.LinearLayout r0 = r11.A03
            r11.addView(r0)
        L_0x0124:
            int r0 = r11.getWidth()
            if (r0 <= 0) goto L_0x0136
            int r1 = r11.A00
            r0 = -1
            if (r1 == r0) goto L_0x0136
            r11.A00 = r0
            r11.A01 = r0
            r11.scrollTo(r1, r3)
        L_0x0136:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker.setEffects(java.util.List, boolean, com.instagram.common.session.UserSession):void");
    }

    private void setRestoreScrollPosition(int i) {
        this.A00 = i;
    }

    public void setBlurIconCache(C64168LRo lRo) {
        this.A04 = lRo;
    }

    public void setFilterListener(C66501MUf mUf) {
        this.A05 = mUf;
    }

    public void setRestoreSelectedIndex(int i) {
        this.A01 = i;
    }

    public void setShouldUseBlurIcons(boolean z) {
        this.A07 = z;
    }

    public void setShowOverlayText(boolean z) {
        this.A08 = z;
    }

    public FeedColorFilterPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        JTT.A1K(this);
    }

    public FeedColorFilterPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        JTT.A1K(this);
    }
}
