package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.List;

/* renamed from: X.Nh4  reason: case insensitive filesystem */
public final class C69204Nh4 extends C16294UsC implements AnonymousClass08u {
    public final ViewPager A00;
    public final TabLayout A01;
    public final XBP A02;
    public final List A03;
    public final O32 A04;

    public final void onPageScrollStateChanged(int i) {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C69204Nh4(X.0hq r18, androidx.viewpager.widget.ViewPager r19, com.google.android.material.tabs.TabLayout r20, X.XBP r21, X.O32 r22, java.util.List r23) {
        /*
            r17 = this;
            r2 = r20
            r1 = r23
            X.AnonymousClass7TG.A1R(r2, r1)
            r4 = r19
            android.content.Context r0 = r4.getContext()
            X.0mk.A02(r0)
            r3 = r18
            r0 = r21
            r5 = r17
            r5.<init>(r3, r0, r1)
            r5.A02 = r0
            r5.A00 = r4
            r5.A01 = r2
            r5.A03 = r1
            r0 = r22
            r5.A04 = r0
            androidx.viewpager.widget.ViewPager r2 = r5.A05()
            r5.mContainer = r2
            r2.setAdapter(r5)
            r1 = 2
            X.FR9 r0 = new X.FR9
            r0.<init>(r5, r1)
            r2.A0J(r0)
            java.util.List r2 = r5.A03
            int r0 = r2.size()
            r8 = 1
            com.google.android.material.tabs.TabLayout r3 = r5.A01
            if (r0 <= r8) goto L_0x011d
            r0 = 4
            r3.setVisibility(r0)
            androidx.viewpager.widget.ViewPager r6 = r5.A00
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r6)
            r0 = 1082130432(0x40800000, float:4.0)
            X.0nA.A00(r1, r0)
            java.util.Iterator r16 = r2.iterator()
        L_0x0055:
            boolean r0 = r16.hasNext()
            r9 = 0
            if (r0 == 0) goto L_0x0101
            java.lang.Object r1 = r16.next()
            java.util.ArrayList r7 = r3.A0c
            int r10 = r7.size()
            X.XBP r0 = r5.A02
            X.OIJ r12 = r0.AN9(r1)
            X.0qQ.A0B(r12, r8)
            android.view.LayoutInflater r1 = X.DbV.A0D(r3)
            r0 = 2131625521(0x7f0e0631, float:1.8878252E38)
            android.view.View r2 = X.DbT.A0D(r1, r3, r0, r9)
            android.content.res.Resources r13 = X.DbU.A05(r2)
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            android.content.Context r14 = X.AnonymousClass7TE.A0S(r11)
            int r0 = r12.A0A
            r1 = -1
            if (r0 == r1) goto L_0x00fa
            java.lang.String r0 = X.C51967G9n.A0p(r14, r0)
        L_0x008e:
            r11.setText(r0)
            r0 = 2132018633(0x7f1405c9, float:1.9675578E38)
            r11.setTextAppearance(r0)
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            float r0 = r13.getDimension(r0)
            r11.setTextSize(r9, r0)
            r11.setSingleLine(r8)
            int r0 = r12.A09
            if (r0 == r1) goto L_0x00b1
            android.content.res.ColorStateList r0 = X.02K.A02(r14, r0)
            if (r0 == 0) goto L_0x00b1
            r11.setTextColor(r0)
        L_0x00b1:
            int r0 = r12.A08
            if (r0 == r1) goto L_0x00b8
            r11.setTextAppearance(r14, r0)
        L_0x00b8:
            int r0 = r12.A07
            if (r0 == r1) goto L_0x00bf
            r11.setGravity(r0)
        L_0x00bf:
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            r0 = 0
            X.0oh.A07(r14, r0, r11, r15)
            int r0 = r12.A00
            if (r0 == r1) goto L_0x00cc
            X.DbU.A11(r14, r11, r0)
        L_0x00cc:
            int r0 = r12.A05
            if (r0 == r1) goto L_0x00db
            int r1 = X.DbS.A03(r13, r0)
            int r0 = X.DbS.A03(r13, r0)
            r11.setPadding(r1, r9, r0, r9)
        L_0x00db:
            java.lang.String r0 = r12.A0E
            r11.setContentDescription(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            X.2eS.A04(r2, r0)
            r0 = 12
            X.C71404Ok3.A01(r2, r5, r10, r0)
            X.6zp r1 = r3.A06()
            r1.A03(r2)
            boolean r0 = r7.isEmpty()
            r3.A0E(r1, r0)
            goto L_0x0055
        L_0x00fa:
            java.lang.String r0 = r12.A0F
            if (r0 != 0) goto L_0x008e
            java.lang.String r0 = ""
            goto L_0x008e
        L_0x0101:
            android.view.ViewTreeObserver r2 = r3.getViewTreeObserver()
            r1 = 3
            X.Okj r0 = new X.Okj
            r0.<init>(r5, r1)
            r2.addOnGlobalLayoutListener(r0)
            r3.setTabMode(r9)
            X.6yA r0 = new X.6yA
            r0.<init>(r6)
            r3.A0D(r0)
            X.0ok.A07(r3, r9)
            goto L_0x0122
        L_0x011d:
            r0 = 8
            r3.setVisibility(r0)
        L_0x0122:
            r4.A0J(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69204Nh4.<init>(X.0hq, androidx.viewpager.widget.ViewPager, com.google.android.material.tabs.TabLayout, X.XBP, X.O32, java.util.List):void");
    }

    public static final ViewGroup A00(C69204Nh4 nh4, int i) {
        View view;
        ViewGroup viewGroup;
        TabLayout tabLayout = nh4.A01;
        if (tabLayout.getChildCount() <= 0) {
            return null;
        }
        View childAt = tabLayout.getChildAt(0);
        if (!(childAt instanceof ViewGroup) || (viewGroup = (ViewGroup) childAt) == null) {
            view = null;
        } else {
            view = viewGroup.getChildAt(i);
        }
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public final View A04(int i) {
        C324746zp A07 = this.A01.A07(i);
        if (A07 != null) {
            return A07.A03;
        }
        return null;
    }

    public final ViewPager A05() {
        return this.A00;
    }

    public final void onPageScrolled(int i, float f, int i2) {
        this.A01.A0A(f, i, false, true);
    }

    public final void onPageSelected(int i) {
        TabLayout tabLayout = this.A01;
        tabLayout.A0F(tabLayout.A07(i), true);
    }
}
