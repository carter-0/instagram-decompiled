package com.instagram.ui.widget.fixedtabbar;

import X.00k;
import X.0mk;
import X.2Yu;
import X.AnonymousClass08u;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C73149PXk;
import X.C74283PsB;
import X.C74372Ptm;
import X.DbS;
import X.DbT;
import X.OIJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.instagram.android.R;
import java.util.List;

public class FixedTabBar extends FrameLayout implements AnonymousClass08u {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public LayoutInflater A04;
    public LinearLayout A05;
    public C74372Ptm A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public int A0B = 0;
    public C74283PsB A0C = null;
    public FixedTabBarIndicator A0D;
    public Integer A0E;
    public boolean A0F;
    public boolean A0G;

    public final void onPageSelected(int i) {
    }

    private void A00() {
        Integer num;
        if (this.A0B == 0 && (num = this.A0E) != null) {
            float f = this.A00;
            if (f - ((float) ((int) f)) == 0.0f) {
                A02(num.intValue());
                this.A0E = null;
            }
        }
    }

    public final void A02(int i) {
        int i2;
        OIJ oij;
        if (this.A09) {
            i2 = DbT.A02(this.A07, 1) - i;
        } else {
            i2 = i;
        }
        for (int i3 = 0; i3 < this.A07.size(); i3++) {
            ((View) this.A07.get(i3)).setSelected(AnonymousClass7TF.A1S(i3, i2));
        }
        if (this.A0B == 0) {
            FixedTabBarIndicator fixedTabBarIndicator = this.A0D;
            fixedTabBarIndicator.A01 = i;
            List list = fixedTabBarIndicator.A02;
            if (list != null && (oij = (OIJ) 00k.A0O(list, i)) != null) {
                int i4 = oij.A06;
                if (i4 == -1) {
                    i4 = 2Yu.A0B(fixedTabBarIndicator.getContext());
                }
                AnonymousClass7TE.A1N(fixedTabBarIndicator.getContext(), fixedTabBarIndicator.A06, i4);
                if (fixedTabBarIndicator.A03) {
                    fixedTabBarIndicator.A00(i, 0.0f);
                } else {
                    fixedTabBarIndicator.post(new C73149PXk(fixedTabBarIndicator));
                }
            }
        } else {
            this.A0E = Integer.valueOf(i);
        }
    }

    public final void onPageScrollStateChanged(int i) {
        this.A0B = i;
        A00();
    }

    public final void onPageScrolled(int i, float f, int i2) {
        this.A00 = f;
        this.A0D.A00(i, f);
        A00();
    }

    public void setIndicatorEnabled(boolean z) {
        FixedTabBarIndicator fixedTabBarIndicator = this.A0D;
        int i = 4;
        if (z) {
            i = 0;
        }
        fixedTabBarIndicator.setVisibility(i);
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5, types: [android.widget.ImageView] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        if (r0 != false) goto L_0x008d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTabs(java.util.List r19) {
        /*
            r18 = this;
            r12 = r19
            int r0 = r12.size()
            r10 = r18
            r10.A03 = r0
            r17 = 1
            r13 = 0
            r11 = 2
            boolean r16 = X.C51970G9q.A1W(r0, r11)
            android.widget.LinearLayout r0 = r10.A05
            r0.removeAllViews()
            int r0 = r10.A03
            java.util.ArrayList r0 = X.DbS.A0v(r0)
            r10.A07 = r0
            r10.A02 = r13
            r9 = 0
        L_0x0022:
            int r0 = r10.A03
            if (r9 >= r0) goto L_0x01cf
            java.lang.Object r8 = r12.get(r9)
            X.OIJ r8 = (X.OIJ) r8
            android.view.View r0 = r8.A0D
            if (r0 == 0) goto L_0x0082
            android.view.View r4 = r8.A0D
            r1 = 10
            X.Ok3 r0 = new X.Ok3
            r0.<init>(r10, r9, r1)
            r4.setOnClickListener(r0)
            r1 = -2
            r0 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r3.<init>(r13, r1, r0)
            r5 = -1
            if (r9 == 0) goto L_0x004d
            int r0 = r10.A03
            int r0 = r0 - r17
            if (r9 != r0) goto L_0x007f
        L_0x004d:
            int r0 = r8.A01
            if (r0 == r5) goto L_0x007f
            android.content.res.Resources r1 = X.DbU.A05(r10)
            int r0 = r8.A01
            int r1 = X.DbS.A03(r1, r0)
            if (r9 == 0) goto L_0x0080
            r2 = r1
            r1 = 0
        L_0x005f:
            int r0 = r8.A02
            if (r0 == r5) goto L_0x006f
            if (r9 == 0) goto L_0x006f
            android.content.res.Resources r1 = X.DbU.A05(r10)
            int r0 = r8.A02
            int r1 = X.DbS.A03(r1, r0)
        L_0x006f:
            r3.setMargins(r1, r13, r2, r13)
            java.util.List r0 = r10.A07
            r0.add(r4)
            android.widget.LinearLayout r0 = r10.A05
            r0.addView(r4, r3)
        L_0x007c:
            int r9 = r9 + 1
            goto L_0x0022
        L_0x007f:
            r1 = 0
        L_0x0080:
            r2 = 0
            goto L_0x005f
        L_0x0082:
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x008d
            boolean r0 = r10.A08
            r2 = 2131625521(0x7f0e0631, float:1.8878252E38)
            if (r0 == 0) goto L_0x0090
        L_0x008d:
            r2 = 2131629601(0x7f0e1621, float:1.8886528E38)
        L_0x0090:
            android.view.LayoutInflater r1 = r10.A04
            android.widget.LinearLayout r0 = r10.A05
            android.view.View r7 = r1.inflate(r2, r0, r13)
            android.content.Context r6 = r10.getContext()
            X.0qQ.A0B(r6, r13)
            int r0 = r8.A0A
            r5 = -1
            if (r0 == r5) goto L_0x01c7
            java.lang.String r4 = X.C51967G9n.A0p(r6, r0)
        L_0x00a8:
            r3 = 0
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x0175
            boolean r0 = r10.A08
            if (r0 != 0) goto L_0x0175
            r2 = r7
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r4)
            r2.measure(r13, r13)
            int r1 = r10.A02
            int r0 = r2.getMeasuredWidth()
            if (r1 >= r0) goto L_0x00c8
            int r0 = r2.getMeasuredWidth()
            r10.A02 = r0
        L_0x00c8:
            android.content.res.Resources r14 = r6.getResources()
            r1 = 2131974927(0x7f135b0f, float:1.9586932E38)
            int r0 = r9 + 1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            int r0 = r10.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r15, r0}
            java.lang.String r0 = r14.getString(r1, r0)
            r7.setContentDescription(r0)
            int r1 = r8.A08
            if (r1 == r5) goto L_0x00f1
            android.content.Context r0 = r2.getContext()
            r2.setTextAppearance(r0, r1)
        L_0x00f1:
            int r0 = r8.A07
            if (r0 == r5) goto L_0x00f8
            r2.setGravity(r0)
        L_0x00f8:
            if (r16 == 0) goto L_0x0108
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            float r0 = r1.getDimension(r0)
            r2.setTextSize(r13, r0)
        L_0x0108:
            int r1 = r8.A09
            if (r1 == r5) goto L_0x013c
            android.content.Context r0 = r2.getContext()
            android.content.res.ColorStateList r4 = X.02K.A02(r0, r1)
            r2.setTextColor(r4)
            if (r3 == 0) goto L_0x013c
            if (r4 == 0) goto L_0x013c
            r0 = -16842913(0xfffffffffefeff5f, float:-1.6947494E38)
            int[] r1 = new int[]{r0}
            int r0 = r4.getDefaultColor()
            int r2 = r4.getColorForState(r1, r0)
            int[] r1 = new int[r11]
            r1 = {16842913, 16842910} // fill-array
            int r0 = r4.getDefaultColor()
            int r1 = r4.getColorForState(r1, r0)
            r0 = 77
            X.2eK.A00(r3, r2, r1, r0)
        L_0x013c:
            r1 = 11
            X.Ok3 r0 = new X.Ok3
            r0.<init>(r10, r9, r1)
            r7.setOnClickListener(r0)
            int r0 = r8.A00
            if (r0 == r5) goto L_0x014d
            X.DbU.A11(r6, r7, r0)
        L_0x014d:
            int r2 = r8.A05
            if (r2 == r5) goto L_0x0164
            android.content.res.Resources r0 = r6.getResources()
            int r1 = X.DbS.A03(r0, r2)
            android.content.res.Resources r0 = r6.getResources()
            int r0 = X.DbS.A03(r0, r2)
            r7.setPadding(r1, r13, r0, r13)
        L_0x0164:
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            X.2eS.A04(r7, r0)
            java.util.List r0 = r10.A07
            r0.add(r7)
            android.widget.LinearLayout r0 = r10.A05
            r0.addView(r7)
            goto L_0x007c
        L_0x0175:
            r0 = 2131442404(0x7f0b3ae4, float:1.8506847E38)
            android.widget.TextView r2 = X.DbU.A0G(r7, r0)
            r2.setText(r4)
            r2.measure(r13, r13)
            int r1 = r10.A02
            int r0 = r2.getMeasuredWidth()
            if (r1 >= r0) goto L_0x0190
            int r0 = r2.getMeasuredWidth()
            r10.A02 = r0
        L_0x0190:
            android.graphics.drawable.Drawable r0 = r8.A0B
            if (r0 != 0) goto L_0x019a
            int r0 = r8.A03
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
        L_0x019a:
            android.graphics.drawable.Drawable r1 = r8.A0C
            if (r1 != 0) goto L_0x01a6
            int r1 = r8.A04
            if (r1 == r5) goto L_0x01a7
            android.graphics.drawable.Drawable r1 = r6.getDrawable(r1)
        L_0x01a6:
            r3 = r1
        L_0x01a7:
            r1 = 2131442403(0x7f0b3ae3, float:1.8506845E38)
            android.widget.ImageView r1 = X.DbU.A0F(r7, r1)
            android.graphics.drawable.Drawable r0 = X.0ok.A02(r0, r3)
            r1.setImageDrawable(r0)
            r1.measure(r13, r13)
            int r3 = r10.A01
            int r0 = r1.getMeasuredWidth()
            int r0 = java.lang.Math.max(r3, r0)
            r10.A01 = r0
            r3 = r1
            goto L_0x00c8
        L_0x01c7:
            java.lang.String r4 = r8.A0F
            if (r4 != 0) goto L_0x00a8
            java.lang.String r4 = ""
            goto L_0x00a8
        L_0x01cf:
            com.instagram.ui.widget.fixedtabbar.FixedTabBarIndicator r0 = r10.A0D
            r0.setTabs(r12)
            com.instagram.ui.widget.fixedtabbar.FixedTabBarIndicator r2 = r10.A0D
            int r1 = r10.A02
            int r0 = r10.A01
            int r0 = java.lang.Math.max(r1, r0)
            r2.A00 = r0
            r2.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.fixedtabbar.FixedTabBar.setTabs(java.util.List):void");
    }

    public FixedTabBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context);
    }

    private void A01(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.A04 = from;
        from.inflate(R.layout.fixed_tabbar_layout, this);
        this.A05 = (LinearLayout) requireViewById(R.id.fixed_tabbar_tabs_container);
        this.A0D = (FixedTabBarIndicator) requireViewById(R.id.selected_tab_indicator);
        this.A0F = true;
        this.A09 = 0mk.A02(getContext());
        this.A07 = DbS.A0v(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r6.A08 != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            super.onMeasure(r7, r8)
            boolean r0 = r6.A0A
            if (r0 != 0) goto L_0x000b
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x0077
        L_0x000b:
            java.util.List r0 = r6.A07
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x0025
            android.widget.LinearLayout r0 = r6.A05
            int r1 = r0.getMeasuredWidth()
            java.util.List r0 = r6.A07
            int r0 = r0.size()
            int r1 = r1 / r0
            int r0 = r6.A02
            if (r1 <= r0) goto L_0x002a
        L_0x0025:
            boolean r0 = r6.A08
            r5 = 0
            if (r0 == 0) goto L_0x002b
        L_0x002a:
            r5 = 1
        L_0x002b:
            boolean r0 = r6.A0F
            if (r0 != 0) goto L_0x0033
            boolean r0 = r6.A0G
            if (r5 == r0) goto L_0x0077
        L_0x0033:
            r6.A0F = r2
            r6.A0G = r5
            X.PsB r0 = r6.A0C
            if (r5 == 0) goto L_0x0046
            if (r0 == 0) goto L_0x0046
            X.TqY r0 = (X.C14138TqY) r0
            X.8av r0 = r0.A0D()
            r0.CkK()
        L_0x0046:
            java.util.List r0 = r6.A07
            java.util.Iterator r4 = r0.iterator()
        L_0x004c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0074
            android.view.View r3 = X.JTO.A0H(r4)
            r0 = 2131442404(0x7f0b3ae4, float:1.8506847E38)
            android.view.View r2 = r3.requireViewById(r0)
            r1 = 8
            int r0 = X.DbW.A00(r5)
            r2.setVisibility(r0)
            r0 = 2131442403(0x7f0b3ae3, float:1.8506845E38)
            android.view.View r0 = r3.requireViewById(r0)
            if (r5 == 0) goto L_0x0070
            r1 = 0
        L_0x0070:
            r0.setVisibility(r1)
            goto L_0x004c
        L_0x0074:
            super.onMeasure(r7, r8)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.fixedtabbar.FixedTabBar.onMeasure(int, int):void");
    }

    public void setDelegate(C74372Ptm ptm) {
        this.A06 = ptm;
    }

    public void setForceIconFallbackTabs(boolean z) {
        this.A08 = z;
    }

    public void setGlyphsListener(C74283PsB psB) {
        this.A0C = psB;
    }

    public void setMaybeUseIconFallbackTabs(boolean z) {
        this.A0A = z;
    }

    public FixedTabBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context);
    }

    public FixedTabBar(Context context) {
        super(context);
        A01(context);
    }
}
