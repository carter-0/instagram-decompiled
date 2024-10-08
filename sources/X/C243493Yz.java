package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* renamed from: X.3Yz  reason: invalid class name and case insensitive filesystem */
public final class C243493Yz {
    public AnonymousClass3V7 A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final ConstraintLayout A08;
    public final ColorFilterAlphaImageView A09;
    public final HorizontalRecyclerPager A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (r0 == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C243493Yz(android.content.Context r6, android.view.View r7, com.instagram.common.session.UserSession r8) {
        /*
            r5 = this;
            r0 = 3
            X.0qQ.A0B(r7, r0)
            r5.<init>()
            android.content.res.Resources r3 = r6.getResources()
            r0 = 2131436841(0x7f0b2529, float:1.8495564E38)
            android.view.View r4 = r7.requireViewById(r0)
            r5.A02 = r4
            boolean r0 = X.AnonymousClass3HA.A00(r6)
            if (r0 == 0) goto L_0x002a
            X.0Tu r2 = X.0Tu.A06
            r0 = 36316577007669762(0x8105bc00001202, double:3.0300877625437646E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            r2 = 2130970127(0x7f04060f, float:1.7548955E38)
            if (r0 != 0) goto L_0x002d
        L_0x002a:
            r2 = 2130970130(0x7f040612, float:1.7548961E38)
        L_0x002d:
            int r0 = X.2Yu.A0H(r6, r2)
            int r0 = r6.getColor(r0)
            r4.setBackgroundColor(r0)
            r0 = 2131436844(0x7f0b252c, float:1.849557E38)
            android.view.View r0 = r7.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A07 = r0
            r0 = 2131436843(0x7f0b252b, float:1.8495568E38)
            android.view.View r0 = r7.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A06 = r0
            r0 = 2131436838(0x7f0b2526, float:1.8495558E38)
            android.view.View r1 = r7.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 2131436842(0x7f0b252a, float:1.8495566E38)
            android.view.View r0 = r7.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A05 = r0
            r0 = 2131627994(0x7f0e0fda, float:1.8883268E38)
            r1.setLayoutResource(r0)
            android.view.View r1 = r1.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.0qQ.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.A04 = r1
            r0 = 2131436840(0x7f0b2528, float:1.8495562E38)
            android.view.View r0 = r7.requireViewById(r0)
            X.0qQ.A07(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            X.0qQ.A0C(r1, r0)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r5.A08 = r1
            r0 = 2131428914(0x7f0b0632, float:1.8479486E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A03 = r0
            r0 = 2131436845(0x7f0b252d, float:1.8495572E38)
            android.view.View r4 = r7.requireViewById(r0)
            com.instagram.ui.recyclerpager.HorizontalRecyclerPager r4 = (com.instagram.ui.recyclerpager.HorizontalRecyclerPager) r4
            r5.A0A = r4
            int r0 = X.2Yu.A0H(r6, r2)
            int r0 = r6.getColor(r0)
            r4.setBackgroundColor(r0)
            r0 = 2131433087(0x7f0b167f, float:1.848795E38)
            android.view.View r1 = r7.requireViewById(r0)
            r5.A01 = r1
            int r0 = X.2Yu.A0H(r6, r2)
            int r0 = r6.getColor(r0)
            r1.setBackgroundColor(r0)
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r2 = r3.getDimensionPixelSize(r0)
            r0 = 2131436836(0x7f0b2524, float:1.8495554E38)
            android.view.View r1 = r7.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 2131627992(0x7f0e0fd8, float:1.8883264E38)
            r1.setLayoutResource(r0)
            android.view.View r1 = r1.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView"
            X.0qQ.A0C(r1, r0)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r1
            r5.A09 = r1
            r0 = 8
            r1.setVisibility(r0)
            X.3V7 r0 = new X.3V7
            r0.<init>(r2, r2)
            r5.A00 = r0
            r4.A11(r0)
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r3.getDimensionPixelSize(r0)
            r4.A01 = r0
            X.3AS r1 = r4.A0C
            if (r1 == 0) goto L_0x010d
            X.3AR r1 = (X.AnonymousClass3AR) r1
            r0 = 0
            r1.A00 = r0
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243493Yz.<init>(android.content.Context, android.view.View, com.instagram.common.session.UserSession):void");
    }
}
