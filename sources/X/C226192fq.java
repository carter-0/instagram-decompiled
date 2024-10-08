package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.2fq  reason: invalid class name and case insensitive filesystem */
public final class C226192fq implements View.OnClickListener {
    public final UserSession A00;
    public final View A01;
    public final AnonymousClass2a4 A02;
    public final InstagramMainActivity A03;
    public final 2aC A04;
    public final 1QK A05;

    public C226192fq(View view, UserSession userSession, AnonymousClass2a4 r4, InstagramMainActivity instagramMainActivity, 2aC r6, 1QK r7) {
        0qQ.A0B(view, 4);
        0qQ.A0B(r4, 5);
        0qQ.A0B(r6, 6);
        this.A05 = r7;
        this.A03 = instagramMainActivity;
        this.A00 = userSession;
        this.A01 = view;
        this.A02 = r4;
        this.A04 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0143, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015c, code lost:
        if (r7.equals(X.1QK.A09.toString()) != false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0176, code lost:
        if (r7.equals(X.1QK.A09.toString()) != false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0178, code lost:
        r10 = X.AnonymousClass80N.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x017c, code lost:
        r8 = X.1Au.A00(r2);
        r7 = r8.A6W;
        r1 = X.1Av.A8a;
        r0 = 386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0191, code lost:
        r0 = (java.lang.String) r7.CDM(r8, r1[r0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0199, code lost:
        if (r0 == null) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x019b, code lost:
        r10 = X.C338817ia.A00(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r26) {
        /*
            r25 = this;
            r0 = 114319857(0x6d061f1, float:7.8384816E-35)
            int r3 = X.AnonymousClass0fD.A05(r0)
            r7 = r25
            com.instagram.common.session.UserSession r2 = r7.A00
            boolean r0 = X.2cg.A02(r2)
            r4 = 0
            if (r0 == 0) goto L_0x0049
            com.instagram.mainactivity.InstagramMainActivity r5 = r7.A03
            X.2b7 r0 = r5.A09
            r0.getClass()
            X.2bB r0 = r0.A02
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x0049
            X.1QK r1 = r7.A05
            X.1QK r0 = X.1QK.A0B
            if (r1 == r0) goto L_0x0295
            r9 = 0
            java.lang.String r12 = "direct_recovery"
            r22 = 0
            com.instagram.ui.swipenavigation.PositionConfig r8 = new com.instagram.ui.swipenavigation.PositionConfig
            r10 = r9
            r11 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r9
            r21 = r9
            r23 = r4
            r24 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r5.FLD(r8)
        L_0x0049:
            com.instagram.mainactivity.InstagramMainActivity r6 = r7.A03
            X.2b7 r0 = r6.A09
            r0.getClass()
            androidx.fragment.app.Fragment r8 = r0.A00()
            X.1QK r5 = r7.A05
            boolean r0 = r6.CR0(r5)
            r9 = 1
            if (r0 == 0) goto L_0x00e6
            X.1QK r0 = X.1QK.A0C
            if (r5 != r0) goto L_0x0064
            r6.A0q(r0, r9)
        L_0x0064:
            X.2b7 r1 = r6.A09
            r1.getClass()
            X.37D r0 = r6.mBottomSheetNavigator
            if (r0 == 0) goto L_0x0073
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != 0) goto L_0x00e2
        L_0x0073:
            X.2b8 r0 = r1.A01
            androidx.fragment.app.FragmentActivity r0 = r0.A02
            X.0hq r1 = r0.getSupportFragmentManager()
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            androidx.fragment.app.Fragment r0 = r1.A0P(r0)
            if (r0 == 0) goto L_0x00e2
            X.0hq r0 = r0.getChildFragmentManager()
            int r0 = r0.A0M()
            if (r0 != 0) goto L_0x00e2
            r9 = 0
        L_0x008f:
            if (r8 == 0) goto L_0x00cc
            if (r9 != 0) goto L_0x00b9
            boolean r0 = r8 instanceof X.C227532jU
            if (r0 == 0) goto L_0x00e0
            r0 = r8
            X.2jU r0 = (X.C227532jU) r0
            boolean r7 = r0.A03()
        L_0x009e:
            boolean r0 = r8 instanceof X.C227302iz
            if (r0 == 0) goto L_0x00de
            if (r7 != 0) goto L_0x00de
            r0 = r8
            X.2iz r0 = (X.C227302iz) r0
            boolean r1 = r0.EBF()
        L_0x00ab:
            boolean r0 = r8 instanceof X.C227252iu
            if (r0 == 0) goto L_0x00b9
            if (r1 != 0) goto L_0x00b9
            if (r7 != 0) goto L_0x00b9
            r0 = r8
            X.2iu r0 = (X.C227252iu) r0
            r0.EKl()
        L_0x00b9:
            boolean r0 = r8 instanceof X.C267684c2
            if (r0 == 0) goto L_0x00c3
            r0 = r8
            X.4c2 r0 = (X.C267684c2) r0
            r0.AV0(r4)
        L_0x00c3:
            boolean r0 = r8 instanceof X.C227312j0
            if (r0 == 0) goto L_0x00cc
            X.2j0 r8 = (X.C227312j0) r8
            r8.FHu()
        L_0x00cc:
            X.1QK r0 = X.1QK.A0F
            if (r5 != r0) goto L_0x00d7
            X.6ra r0 = X.C319996rZ.A00(r2)
            r0.A00(r6)
        L_0x00d7:
            r0 = -596765293(0xffffffffdc6e1593, float:-2.68059062E17)
        L_0x00da:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x00de:
            r1 = 0
            goto L_0x00ab
        L_0x00e0:
            r7 = 0
            goto L_0x009e
        L_0x00e2:
            r6.A0p(r5)
            goto L_0x008f
        L_0x00e6:
            X.1QK r0 = X.1QK.A0A
            if (r5 != r0) goto L_0x021a
            X.0Tu r5 = X.0Tu.A05
            r0 = 36315559100747114(0x8104cf00050d6a, double:3.0294440341071E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x0138
            X.8jC r10 = X.C363138jC.A00
        L_0x00f9:
            boolean r0 = X.C318996ps.A01()
            if (r0 == 0) goto L_0x01a9
            X.1q7 r0 = X.C318996ps.A00()
            boolean r0 = r0.A05(r2)
            if (r0 == 0) goto L_0x01a9
            X.0hq r0 = r6.AuV()
            r1 = 0
            if (r0 == 0) goto L_0x011e
            X.06j r0 = r0.A0U
            java.util.List r0 = r0.A04()
            if (r0 == 0) goto L_0x011e
            java.lang.Object r1 = X.00k.A0L(r0)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
        L_0x011e:
            boolean r0 = r1 instanceof X.C227332j2
            if (r0 == 0) goto L_0x01a9
            X.2j2 r1 = (X.C227332j2) r1
            if (r1 == 0) goto L_0x01a9
            boolean r0 = r1.Ez8()
            if (r0 == 0) goto L_0x01a9
            X.1q7 r0 = X.C318996ps.A00()
            X.FBp r0 = r0.A01()
            r0.A02(r6, r2)
            goto L_0x00d7
        L_0x0138:
            java.lang.Integer r0 = com.instagram.mainactivity.camerabutton.CameraButtonDestinationUtil$Companion.A00(r2, r4)
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x017c;
                case 2: goto L_0x0187;
                case 3: goto L_0x0178;
                case 4: goto L_0x01a1;
                case 5: goto L_0x01a5;
                case 6: goto L_0x0145;
                case 7: goto L_0x015f;
                default: goto L_0x0143;
            }
        L_0x0143:
            r10 = 0
            goto L_0x00f9
        L_0x0145:
            X.2cc r0 = X.C71342cb.A00(r2)
            java.lang.String r7 = r0.A05
            java.lang.String r1 = ""
            java.util.regex.Pattern r0 = X.0mp.A03
            if (r7 != 0) goto L_0x0152
            r7 = r1
        L_0x0152:
            X.1QK r0 = X.1QK.A09
            java.lang.String r0 = r0.toString()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0143
            goto L_0x0178
        L_0x015f:
            X.2cc r0 = X.C71342cb.A00(r2)
            java.lang.String r7 = r0.A05
            java.lang.String r1 = ""
            java.util.regex.Pattern r0 = X.0mp.A03
            if (r7 != 0) goto L_0x016c
            r7 = r1
        L_0x016c:
            X.1QK r0 = X.1QK.A09
            java.lang.String r0 = r0.toString()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x017c
        L_0x0178:
            X.80N r10 = X.AnonymousClass80N.A00
            goto L_0x00f9
        L_0x017c:
            X.1Av r8 = X.1Au.A00(r2)
            X.0s0 r7 = r8.A6W
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 386(0x182, float:5.41E-43)
            goto L_0x0191
        L_0x0187:
            X.1Av r8 = X.1Au.A00(r2)
            X.0s0 r7 = r8.A6E
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 385(0x181, float:5.4E-43)
        L_0x0191:
            r0 = r1[r0]
            java.lang.Object r0 = r7.CDM(r8, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0143
            X.4yO r10 = X.C338817ia.A00(r0)
            goto L_0x00f9
        L_0x01a1:
            X.9QA r10 = X.AnonymousClass9QA.A00
            goto L_0x00f9
        L_0x01a5:
            X.80K r10 = X.AnonymousClass80K.A00
            goto L_0x00f9
        L_0x01a9:
            boolean r0 = X.2cg.A01(r2)
            if (r0 == 0) goto L_0x0212
            r0 = 36318514038184150(0x81077f000418d6, double:3.0313127484408594E-306)
            boolean r1 = X.182.A06(r5, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L_0x0212
            if (r1 == 0) goto L_0x0212
            java.lang.Integer r0 = X.C338977ir.A00()
            int r0 = r0.intValue()
            long r7 = (long) r0
            r0 = 36599989014957732(0x82077f00050ea4, double:3.20931865716123E-306)
            long r11 = X.182.A01(r5, r2, r0)
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0212
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            if (r10 != 0) goto L_0x01df
            X.8jC r10 = X.C363138jC.A00
        L_0x01df:
            X.8aL[] r0 = new X.C358088aL[r4]
            com.instagram.creation.cameraconfiguration.CameraConfiguration r1 = X.C358098aM.A00(r10, r0)
            r0 = 22
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5.putParcelable(r0, r1)
            r0 = 1156(0x484, float:1.62E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.putBoolean(r0, r9)
            X.28D r1 = X.28D.A0a
            java.lang.String r0 = "camera_entry_point"
            r5.putSerializable(r0, r1)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            r0 = 713(0x2c9, float:9.99E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.AnonymousClass6W8.A02(r6, r5, r2, r1, r0)
            r0.A07()
            r0.A0C(r6)
            goto L_0x00d7
        L_0x0212:
            r1 = 0
            java.lang.String r0 = "camera_tab_bar"
            X.AB2.A00(r2, r10, r1, r6, r0)
            goto L_0x00d7
        L_0x021a:
            X.1QK r0 = X.1QK.A0B
            if (r5 != r0) goto L_0x0247
            boolean r0 = X.2bA.A07(r2)
            if (r0 == 0) goto L_0x0247
            r8 = 0
            java.lang.String r11 = "direct_tab_bar"
            r21 = 1065353216(0x3f800000, float:1.0)
            com.instagram.ui.swipenavigation.PositionConfig r7 = new com.instagram.ui.swipenavigation.PositionConfig
            r9 = r8
            r10 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r8
            r20 = r8
            r22 = r4
            r23 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r6.FLD(r7)
            goto L_0x00d7
        L_0x0247:
            X.1QK r0 = X.1QK.A0D
            if (r5 != r0) goto L_0x0264
            X.0hq r1 = r6.AuV()
            if (r1 == 0) goto L_0x0264
            java.lang.String r0 = "com.instagram.newsfeed.fragment.NewsfeedFragment"
            androidx.fragment.app.Fragment r0 = r1.A0R(r0)
            if (r0 == 0) goto L_0x0264
            boolean r0 = r0.isHidden()
            if (r0 != 0) goto L_0x0264
            r0 = -356678520(0xffffffffeabd8488, float:-1.1455642E26)
            goto L_0x00da
        L_0x0264:
            X.3kP r1 = X.C249813kP.A00
            java.lang.String r2 = r5.A05
            java.lang.String r0 = "mainActivityTabClick"
            r1.A06(r2, r0, r4)
            X.2b7 r0 = r6.A09
            r0.getClass()
            X.2b7 r1 = r6.A09
            r1.getClass()
            android.view.View r0 = r7.A01
            r1.A08(r0)
            X.2b7 r1 = r6.A09
            r1.getClass()
            java.lang.String r0 = "MainTabControllerImpl.onTabUpdated: "
            java.lang.String r0 = X.002.A0R(r0, r2)
            X.0lp r2 = X.0lq.A00(r0)
            X.2b8 r0 = r1.A01     // Catch:{ all -> 0x02ac }
            r0.A04(r5, r4, r4, r4)     // Catch:{ all -> 0x02ac }
            r2.close()
            goto L_0x00d7
        L_0x0295:
            X.2b7 r0 = r5.A09
            r0.getClass()
            X.2bB r0 = r0.A02
            X.4DH r1 = r0.A0C
            boolean r0 = r1 instanceof X.C227252iu
            if (r0 == 0) goto L_0x02a7
            X.2iu r1 = (X.C227252iu) r1
            r1.EKl()
        L_0x02a7:
            r0 = -230954780(0xfffffffff23be8e4, float:-3.7219356E30)
            goto L_0x00da
        L_0x02ac:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x02b1 }
            throw r1
        L_0x02b1:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226192fq.onClick(android.view.View):void");
    }
}
