package X;

import android.view.ViewGroup;

/* renamed from: X.HFb  reason: case insensitive filesystem */
public final class C54473HFb extends C262934Go {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ AnonymousClass338 A01;
    public final /* synthetic */ C55865Hom A02;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r2 == 3) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dx6(X.C61065Jw3 r10) {
        /*
            r9 = this;
            r0 = 0
            X.0qQ.A0B(r10, r0)
            int r2 = r10.A00
            java.lang.String r4 = "swipe_vertical"
            r1 = 2
            r0 = 1
            if (r2 == r0) goto L_0x0062
            if (r2 == r1) goto L_0x005f
            r7 = r4
        L_0x000f:
            int r3 = r10.A01
            if (r3 == r0) goto L_0x005c
            if (r3 == r1) goto L_0x0059
            r0 = 4
            if (r3 == r0) goto L_0x0056
            java.lang.String r8 = "partial_sheet"
        L_0x001a:
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L_0x002c
            X.338 r0 = r9.A01
            int r2 = r0.A00
            java.lang.String r7 = "swipe_down"
            r1 = 4
            r0 = 3
            if (r3 != r1) goto L_0x004a
            if (r2 != r0) goto L_0x0054
        L_0x002c:
            X.338 r2 = r9.A01
            int r0 = r2.A00
            if (r3 != r0) goto L_0x0034
            java.lang.String r8 = "no_change"
        L_0x0034:
            r2.A00 = r3
            X.1Xj r4 = r9.A00
            com.instagram.common.session.UserSession r3 = r2.A06
            X.4DU r5 = r2.A07
            java.lang.Object r1 = r10.A02
            X.GlP r1 = (X.C53277GlP) r1
            android.content.Context r0 = r2.A04
            X.5sM r6 = X.C55170HdM.A00(r0, r1)
            X.C263264Jy.A04(r3, r4, r5, r6, r7, r8)
            return
        L_0x004a:
            if (r3 != r0) goto L_0x0054
            r0 = 2
            if (r2 == r0) goto L_0x002c
            if (r2 != r1) goto L_0x0054
            java.lang.String r7 = "swipe_up"
            goto L_0x002c
        L_0x0054:
            r7 = r4
            goto L_0x002c
        L_0x0056:
            java.lang.String r8 = "collapse"
            goto L_0x001a
        L_0x0059:
            java.lang.String r8 = "fullscreen"
            goto L_0x001a
        L_0x005c:
            java.lang.String r8 = "dismiss"
            goto L_0x001a
        L_0x005f:
            java.lang.String r7 = "swipe_down"
            goto L_0x000f
        L_0x0062:
            java.lang.String r7 = "swipe_up"
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54473HFb.Dx6(X.Jw3):void");
    }

    public C54473HFb(1Xj r1, AnonymousClass338 r2, C55865Hom hom) {
        this.A02 = hom;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void Cv6(float f) {
        ViewGroup viewGroup;
        this.A01.A01 = false;
        C55865Hom hom = this.A02;
        C54512HGy hGy = hom.A06;
        if (hGy != null && hGy.A0B && (viewGroup = hom.A03) != null && !hGy.A0E) {
            hom.A04.A00.A0E.invoke(48, viewGroup);
        }
        0sP r2 = hom.A04.A00.A0A;
        AnonymousClass3Uy r0 = hom.A05;
        C51967G9n.A0w(r0.A00 + C51972G9s.A08(r0.A01), r2);
        hom.A01 = true;
    }

    public final void DHB(Integer num) {
        C232722uK r1;
        AnonymousClass338 r3 = this.A01;
        r3.A01 = true;
        AnonymousClass2xS r0 = r3.A08;
        if (!(r0 == null || (r1 = r0.A0G) == null)) {
            r1.A0T("bottom_sheet");
        }
        r3.A03 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DYG(int r12, int r13) {
        /*
            r11 = this;
            X.Hom r4 = r11.A02
            boolean r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x0107
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x000f
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0107
        L_0x000f:
            r2 = 1
        L_0x0010:
            X.3fb r0 = r4.A04
            X.4Jl r7 = r0.A00
            X.0sP r0 = r7.A0C
            X.HGy r9 = r4.A06
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00e2
            int r10 = r0.intValue()
            X.3Uy r6 = r4.A05
            int r1 = r6.A00
            int r5 = r10 - r1
            if (r9 == 0) goto L_0x0094
            boolean r0 = r9.A0B
            if (r0 != r3) goto L_0x0094
            if (r12 <= r5) goto L_0x0041
            if (r2 != 0) goto L_0x0041
            android.view.ViewGroup r0 = r4.A03
            if (r0 == 0) goto L_0x0041
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x0041
            int r1 = r1 + r12
            r0.height = r1
        L_0x0041:
            android.view.ViewGroup r2 = r4.A03
            if (r2 == 0) goto L_0x0048
            r2.requestLayout()
        L_0x0048:
            if (r12 <= r5) goto L_0x0057
            if (r2 == 0) goto L_0x0057
            X.0sL r1 = r7.A0E
            r0 = 17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.invoke(r0, r2)
        L_0x0057:
            com.instagram.watchandbrowse.ui.WatchAndBrowseMainView r8 = r4.A07
            if (r8 == 0) goto L_0x0094
            boolean r0 = r9.A0F
            if (r0 == r3) goto L_0x0060
            r3 = 0
        L_0x0060:
            boolean r0 = X.AnonymousClass1GD.A03()
            if (r0 != 0) goto L_0x0094
            if (r3 != 0) goto L_0x0094
            com.instagram.common.ui.base.IgSimpleImageView r3 = r8.A06
            if (r3 == 0) goto L_0x0094
            int r2 = r3.getHeight()
            int r0 = r3.getPaddingTop()
            int r2 = r2 + r0
            int r0 = r3.getPaddingBottom()
            int r2 = r2 + r0
            r1 = 0
            int r0 = r10 + r2
            if (r12 < r0) goto L_0x0091
            android.content.Context r1 = r8.getContext()
            r0 = 2131100470(0x7f060336, float:1.7813322E38)
            int r0 = r1.getColor(r0)
            android.graphics.ColorFilter r1 = X.AnonymousClass37O.A00(r0)
            r3.setColorFilter(r1)
        L_0x0091:
            r3.setColorFilter(r1)
        L_0x0094:
            if (r12 <= r5) goto L_0x0104
            android.view.ViewGroup r0 = r4.A03
            if (r0 == 0) goto L_0x00fb
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x00fb
            int r2 = r0.height
            int r0 = r2 - r10
            int r0 = r0 / 2
            int r2 = r2 - r0
            int r2 = r2 - r12
        L_0x00a8:
            if (r2 <= 0) goto L_0x00fb
            if (r12 <= r5) goto L_0x00b8
            X.0sP r1 = r7.A0A
            android.content.Context r0 = r6.A01
            int r0 = X.C51972G9s.A08(r0)
            int r2 = r2 + r0
        L_0x00b5:
            X.C51967G9n.A0w(r2, r1)
        L_0x00b8:
            com.instagram.watchandbrowse.ui.WatchAndBrowseMainView r3 = r4.A07
            if (r3 == 0) goto L_0x00e2
            com.instagram.common.ui.base.IgView r2 = r3.A02
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x00e2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.0qQ.A0C(r1, r0)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.height
            int r12 = r12 - r0
            java.lang.Integer r0 = r3.A03
            if (r0 == 0) goto L_0x00db
            int r0 = r0.intValue()
            int r12 = r12 + r0
        L_0x00db:
            r0 = 0
            r1.setMargins(r0, r12, r0, r0)
            r2.setLayoutParams(r1)
        L_0x00e2:
            X.338 r1 = r11.A01
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00fa
            X.2xS r0 = r1.A08
            if (r0 == 0) goto L_0x00f7
            X.2uK r0 = r0.A0G
            if (r0 == 0) goto L_0x00f7
            r0.A0M()
        L_0x00f7:
            r0 = 0
            r1.A03 = r0
        L_0x00fa:
            return
        L_0x00fb:
            X.0sP r1 = r7.A0A
            android.content.Context r0 = r6.A01
            int r2 = X.C51972G9s.A08(r0)
            goto L_0x00b5
        L_0x0104:
            int r2 = r10 - r12
            goto L_0x00a8
        L_0x0107:
            r2 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54473HFb.DYG(int, int):void");
    }
}
