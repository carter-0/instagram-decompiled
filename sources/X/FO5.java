package X;

import android.view.View;

public final class FO5 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public FO5(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0145, code lost:
        r0 = new X.C47179Dru(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0164, code lost:
        r4.DgD(r0, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0167, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01be, code lost:
        r4.DPt(r2, r5, r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0200, code lost:
        r4.Dw6(new X.C47179Dru(r2), r5, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0208, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0209;
                case 1: goto L_0x01c2;
                case 2: goto L_0x010d;
                case 3: goto L_0x0179;
                case 4: goto L_0x014b;
                case 5: goto L_0x00d6;
                case 6: goto L_0x00b8;
                case 7: goto L_0x003e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r8.A02
            X.Fen r1 = (X.C50578Fen) r1
            java.lang.Object r4 = r8.A03
            X.5Gi r4 = (X.C283155Gi) r4
            java.lang.Object r3 = r8.A04
            X.G9f r3 = (X.C51959G9f) r3
            int r2 = r8.A01
            android.view.View r0 = r1.A00
            if (r0 != 0) goto L_0x001a
            X.C50578Fen.A00(r1)
        L_0x001a:
            android.view.View r1 = r1.A00
            r1.getClass()
            boolean r0 = r4.A0F()
            r0 = r0 ^ 1
            r1.setSelected(r0)
            boolean r0 = r4.A0F()
            r3.DNT(r4, r2, r0)
            boolean r0 = r4.A0F()
            r0 = r0 ^ 1
            X.5Gj r1 = r4.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A04 = r0
            return
        L_0x003e:
            java.lang.Object r5 = r8.A02
            X.5Gi r5 = (X.C283155Gi) r5
            java.lang.Object r4 = r8.A03
            X.G9f r4 = (X.C51959G9f) r4
            int r3 = r8.A01
            java.lang.Object r2 = r8.A04
            X.Exr r2 = (X.C49556Exr) r2
            java.lang.String r0 = r5.A07()
            if (r0 == 0) goto L_0x00af
            X.DgL r1 = X.C46518DgL.A30
            X.DgL r0 = r5.A03()
            if (r1 == r0) goto L_0x0145
            X.DgL r1 = X.C46518DgL.A08
            X.DgL r0 = r5.A03()
            if (r1 == r0) goto L_0x0145
            X.5Gj r0 = r5.A04
            java.lang.Boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0082
        L_0x006e:
            java.lang.String r0 = r5.A08()
            if (r0 != 0) goto L_0x0082
            java.lang.String r1 = r5.A06()
            if (r1 == 0) goto L_0x008f
            java.lang.String r0 = "clips_home"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008f
        L_0x0082:
            java.lang.String r1 = r5.A07()
            X.Dru r0 = new X.Dru
            r0.<init>(r2)
            r4.DPt(r0, r5, r1, r3)
            return
        L_0x008f:
            java.lang.String r1 = r5.A06()
            if (r1 == 0) goto L_0x00a6
            X.DgL r0 = X.C46518DgL.A0L
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0082
            X.DgL r0 = X.C46518DgL.A0M
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a6
            goto L_0x0082
        L_0x00a6:
            X.Dru r0 = new X.Dru
            r0.<init>(r2)
            r4.D4k(r0, r5, r3)
            return
        L_0x00af:
            X.Dru r0 = new X.Dru
            r0.<init>(r2)
            r4.DPx(r0, r5, r3)
            return
        L_0x00b8:
            java.lang.Object r0 = r8.A02
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r6 = r8.A03
            X.G9f r6 = (X.C51959G9f) r6
            java.lang.Object r5 = r8.A04
            X.5Gi r5 = (X.C283155Gi) r5
            int r4 = r8.A01
            android.graphics.RectF r3 = X.0nA.A0F(r0)
            r2 = 0
            X.EVf r1 = X.C48087EVf.START_AVATAR
            X.Dru r0 = new X.Dru
            r0.<init>(r2, r1, r2, r4)
            r6.Da5(r3, r0, r5, r4)
            return
        L_0x00d6:
            java.lang.Object r2 = r8.A02
            X.Fel r2 = (X.C50576Fel) r2
            java.lang.Object r6 = r8.A03
            X.G9f r6 = (X.C51959G9f) r6
            java.lang.Object r5 = r8.A04
            X.5Gi r5 = (X.C283155Gi) r5
            int r4 = r8.A01
            X.2eb r1 = r2.A06
            android.view.View r0 = r1.A01()
            if (r0 != 0) goto L_0x00f6
            X.2eb r0 = r2.A08
            android.view.View r0 = r0.A01()
            if (r0 == 0) goto L_0x010a
            X.2eb r1 = r2.A07
        L_0x00f6:
            android.view.View r0 = r1.A01()
        L_0x00fa:
            android.graphics.RectF r3 = X.0nA.A0F(r0)
            r2 = 0
            X.EVf r1 = X.C48087EVf.CONTAINER
            X.Dru r0 = new X.Dru
            r0.<init>(r2, r1, r2, r4)
            r6.DcN(r3, r0, r5, r4)
            return
        L_0x010a:
            android.view.View r0 = r2.A01
            goto L_0x00fa
        L_0x010d:
            java.lang.Object r5 = r8.A02
            X.5Gi r5 = (X.C283155Gi) r5
            java.lang.Object r4 = r8.A03
            X.G9f r4 = (X.C51959G9f) r4
            int r3 = r8.A01
            java.lang.Object r2 = r8.A04
            X.Exr r2 = (X.C49556Exr) r2
            X.5Gj r0 = r5.A04
            X.0eM r0 = r0.A1D
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0145
            boolean r0 = X.FCH.A02(r5)
            if (r0 != 0) goto L_0x013c
            X.5Gj r0 = r5.A04
            java.lang.String r1 = r0.A0f
            if (r1 != 0) goto L_0x0200
            java.lang.String r1 = "newsfeed_user_follow_null_profile_id"
            java.lang.String r0 = "Profile ID should not be null."
            X.0wb.A03(r1, r0)
            java.lang.String r1 = ""
            goto L_0x0200
        L_0x013c:
            X.Dru r0 = new X.Dru
            r0.<init>(r2)
            r4.DGV(r0, r5, r3)
            return
        L_0x0145:
            X.Dru r0 = new X.Dru
            r0.<init>(r2)
            goto L_0x0164
        L_0x014b:
            java.lang.Object r5 = r8.A02
            X.5Gi r5 = (X.C283155Gi) r5
            java.lang.Object r4 = r8.A03
            X.G9f r4 = (X.C51959G9f) r4
            int r3 = r8.A01
            java.lang.Object r7 = r8.A04
            X.Exr r7 = (X.C49556Exr) r7
            X.DgL r0 = r5.A03()
            if (r0 == 0) goto L_0x0168
            X.Dru r0 = new X.Dru
            r0.<init>(r7)
        L_0x0164:
            r4.DgD(r0, r5, r3)
            return
        L_0x0168:
            java.lang.String r6 = r5.A07()
            java.lang.String r1 = ""
            java.util.regex.Pattern r0 = X.0mp.A01
            if (r6 != 0) goto L_0x0173
            r6 = r1
        L_0x0173:
            X.Dru r2 = new X.Dru
            r2.<init>(r7)
            goto L_0x01be
        L_0x0179:
            java.lang.Object r6 = r8.A02
            X.0lg r6 = (X.0lg) r6
            java.lang.Object r5 = r8.A03
            X.5Gi r5 = (X.C283155Gi) r5
            java.lang.Object r4 = r8.A04
            X.G9f r4 = (X.C51959G9f) r4
            int r3 = r8.A01
            X.5Gj r0 = r5.A04
            java.lang.String r2 = r0.A0U
            if (r2 == 0) goto L_0x01ab
            java.lang.String r1 = "^/"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.replaceFirst(r1, r0)
            X.1NY r2 = new X.1NY
            r2.<init>(r6)
            r2.A0A(r0)
            r2.A04()
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r0 = X.DbT.A0S(r2, r1, r0)
            X.1ES.A03(r0)
        L_0x01ab:
            java.lang.String r6 = r5.A07()
            java.lang.String r1 = ""
            java.util.regex.Pattern r0 = X.0mp.A01
            if (r6 != 0) goto L_0x01b6
            r6 = r1
        L_0x01b6:
            r1 = 0
            X.EVf r0 = X.C48087EVf.CONTAINER
            X.Dru r2 = new X.Dru
            r2.<init>(r1, r0, r1, r3)
        L_0x01be:
            r4.DPt(r2, r5, r6, r3)
            return
        L_0x01c2:
            java.lang.Object r5 = r8.A02
            X.5Gi r5 = (X.C283155Gi) r5
            java.lang.Object r4 = r8.A03
            X.G9f r4 = (X.C51959G9f) r4
            int r3 = r8.A01
            java.lang.Object r2 = r8.A04
            X.Exr r2 = (X.C49556Exr) r2
            int r1 = r5.A00
            r0 = 192(0xc0, float:2.69E-43)
            if (r1 != r0) goto L_0x01f9
            com.instagram.model.hashtag.HashtagImpl r0 = r5.A02()
            if (r0 == 0) goto L_0x01f9
            com.instagram.model.hashtag.HashtagImpl r0 = r5.A02()
            if (r0 == 0) goto L_0x01f9
            com.instagram.model.hashtag.HashtagImpl r0 = r5.A02()
            java.lang.String r0 = r0.A0D
            if (r0 == 0) goto L_0x01f9
            com.instagram.model.hashtag.HashtagImpl r0 = r5.A02()
            java.lang.String r1 = r0.A0D
            X.Dru r0 = new X.Dru
            r0.<init>(r2)
            r4.DIg(r0, r5, r1, r3)
            return
        L_0x01f9:
            X.5Gj r0 = r5.A04
            java.lang.String r1 = r0.A0f
            r1.getClass()
        L_0x0200:
            X.Dru r0 = new X.Dru
            r0.<init>(r2)
            r4.Dw6(r0, r5, r1, r3)
            return
        L_0x0209:
            r0 = 1292741968(0x4d0dad50, float:1.48559104E8)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r8.A04
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.Object r4 = r8.A02
            android.widget.EditText r4 = (android.widget.EditText) r4
            X.0qQ.A0A(r4)
            java.lang.Object r3 = r8.A03
            com.instagram.common.ui.base.IgLinearLayout r3 = (com.instagram.common.ui.base.IgLinearLayout) r3
            int r2 = r8.A01
            X.DbS.A1C(r4)
            android.content.Context r1 = r5.requireContext()
            r0 = 0
            X.FC0.A00(r1, r4, r2, r0)
            r0 = 2131437883(0x7f0b293b, float:1.8497677E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 8
            r1.setVisibility(r0)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131231444(0x7f0802d4, float:1.807897E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto L_0x024f
            r3.setBackground(r0)
            r0 = -1737810393(0xffffffff986b1e27, float:-3.0388261E-24)
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x024f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FO5.onClick(android.view.View):void");
    }
}
