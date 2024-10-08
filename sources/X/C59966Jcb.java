package X;

/* renamed from: X.Jcb  reason: case insensitive filesystem */
public final class C59966Jcb implements C3493580b {
    public final int A00;
    public final Object A01;

    public C59966Jcb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x017e: MOVE  (r1v18 X.4DH) = (r3v2 X.4DH)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a0  */
    public final /* bridge */ /* synthetic */ void Dmx(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0284;
                case 1: goto L_0x026b;
                case 2: goto L_0x021c;
                case 3: goto L_0x0207;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.MQf r9 = (X.C66399MQf) r9
            X.MQf r10 = (X.C66399MQf) r10
            java.lang.Object r2 = r8.A01
            X.LQk r2 = (X.C64147LQk) r2
            X.0qQ.A0A(r9)
            X.0qQ.A0A(r10)
            X.0qQ.A0A(r11)
            r1 = 1
            X.0qQ.A0B(r10, r1)
            boolean r0 = r10 instanceof X.C65392LsY
            if (r0 == 0) goto L_0x01b7
            X.KiE r5 = X.C62581KiE.A0B
        L_0x0020:
            com.instagram.igtv.uploadflow.common.IGTVUploadProgress r4 = r2.A01
            int r3 = r5.A00
            X.KiE r0 = r4.A00
            int r0 = r0.A00
            if (r3 <= r0) goto L_0x002c
            r4.A00 = r5
        L_0x002c:
            boolean r0 = r11 instanceof X.C66400MQg
            if (r0 == 0) goto L_0x00a0
            androidx.fragment.app.FragmentActivity r4 = r2.A03
            r0 = 0
            X.0qQ.A0B(r11, r0)
            boolean r0 = r10 instanceof X.MSS
            if (r0 == 0) goto L_0x02d5
            boolean r0 = r11 instanceof X.MST
            if (r0 == 0) goto L_0x004f
            r1 = r11
            X.MST r1 = (X.MST) r1
            r0 = r10
            X.MSS r0 = (X.MSS) r0
            X.LMk r0 = r1.B7s(r0)
            int r1 = r0.A00
            int r0 = r0.A01
            r4.overridePendingTransition(r1, r0)
        L_0x004f:
            X.MSS r10 = (X.MSS) r10
            androidx.fragment.app.Fragment r3 = r10.B7q(r11)
            android.os.Bundle r5 = X.DbY.A08(r3)
            com.instagram.common.session.UserSession r0 = r2.A05
            X.AnonymousClass0Dg.A00(r5, r0)
            X.0eM r2 = r2.A0A
            java.lang.Object r0 = r2.getValue()
            X.L6i r0 = (X.C63776L6i) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "igtv_creation_session_id_arg"
            r5.putString(r0, r1)
            java.lang.Object r0 = r2.getValue()
            X.L6i r0 = (X.C63776L6i) r0
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "igtv_viewer_session_id_arg"
            r5.putString(r0, r1)
            r3.setArguments(r5)
            X.0s1 r1 = X.DbW.A0D(r4)
            r0 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            r1.A0A(r3, r0)
            r1.A00()
            android.os.Bundle r1 = X.DbU.A06(r4)
            if (r1 == 0) goto L_0x0098
            java.lang.String r0 = "uploadflow.extra.is_upload_flow_embedded"
            boolean r0 = r1.getBoolean(r0)
            if (r0 != 0) goto L_0x009f
        L_0x0098:
            boolean r0 = r3 instanceof X.AnonymousClass4DU
            if (r0 == 0) goto L_0x009f
            r2.getValue()
        L_0x009f:
            return
        L_0x00a0:
            boolean r0 = r11 instanceof X.C66396MQc
            if (r0 == 0) goto L_0x0107
            androidx.fragment.app.FragmentActivity r4 = r2.A03
            X.DbY.A1S(r11, r9)
            X.C64147LQk.A01(r9, r11)
            boolean r0 = r11 instanceof X.KT0
            r5 = 2
            if (r0 != 0) goto L_0x00be
            X.KSz r0 = X.C61950KSz.A00
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x00be
            boolean r0 = r11 instanceof X.KT1
            if (r0 == 0) goto L_0x00e3
            r5 = 3
        L_0x00be:
            android.os.Bundle r3 = X.DbU.A06(r4)
            if (r3 == 0) goto L_0x00cc
            java.lang.String r0 = "uploadflow.extra.is_upload_flow_embedded"
            boolean r0 = r3.getBoolean(r0)
            if (r0 != 0) goto L_0x00da
        L_0x00cc:
            com.instagram.igtv.uploadflow.common.IGTVUploadProgress r0 = r2.A01
            X.KiE r0 = r0.A00
            java.lang.String r0 = r0.A01
            X.0qQ.A0B(r0, r1)
            X.0eM r0 = r2.A0A
            r0.getValue()
        L_0x00da:
            com.instagram.igtv.uploadflow.common.IGTVUploadProgress r0 = r2.A01
            X.C64147LQk.A00(r4, r2, r0, r5)
            r4.finish()
            return
        L_0x00e3:
            boolean r0 = r11 instanceof X.C61948KSx
            if (r0 != 0) goto L_0x0105
            X.KSw r0 = X.C61947KSw.A00
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0105
            boolean r0 = r11 instanceof X.C61949KSy
            if (r0 == 0) goto L_0x00f5
            r5 = 5
            goto L_0x00be
        L_0x00f5:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected action "
            java.lang.String r3 = X.AnonymousClass7TG.A0m(r11, r0, r3)
            java.lang.String r0 = "IGTVUploadNavigator.finishFlow"
            X.0wb.A03(r0, r3)
            goto L_0x00be
        L_0x0105:
            r5 = 4
            goto L_0x00be
        L_0x0107:
            boolean r0 = r11 instanceof X.LLS
            if (r0 == 0) goto L_0x0136
            androidx.fragment.app.FragmentActivity r4 = r2.A03
            X.DbY.A1S(r11, r9)
            X.C64147LQk.A01(r9, r11)
            android.os.Bundle r3 = X.DbU.A06(r4)
            if (r3 == 0) goto L_0x0121
            java.lang.String r0 = "uploadflow.extra.is_upload_flow_embedded"
            boolean r0 = r3.getBoolean(r0)
            if (r0 != 0) goto L_0x012f
        L_0x0121:
            com.instagram.igtv.uploadflow.common.IGTVUploadProgress r0 = r2.A01
            X.KiE r0 = r0.A00
            java.lang.String r0 = r0.A01
            X.0qQ.A0B(r0, r1)
            X.0eM r0 = r2.A0A
            r0.getValue()
        L_0x012f:
            com.instagram.igtv.uploadflow.common.IGTVUploadProgress r1 = r2.A01
            r0 = 4
            X.C64147LQk.A00(r4, r2, r1, r0)
            return
        L_0x0136:
            boolean r0 = r11 instanceof X.MST
            if (r0 == 0) goto L_0x019d
            boolean r0 = r10 instanceof X.MSS
            if (r0 == 0) goto L_0x02ec
            X.MSS r10 = (X.MSS) r10
            androidx.fragment.app.Fragment r3 = r10.B7q(r11)
            X.MST r11 = (X.MST) r11
            X.LMk r7 = r11.B7s(r10)
            androidx.fragment.app.FragmentActivity r6 = r2.A03
            com.instagram.common.session.UserSession r0 = r2.A04
            X.6Yo r4 = X.DbV.A0M(r3, r6, r0)
            int r5 = r7.A00
            int r2 = r7.A01
            int r1 = r7.A02
            int r0 = r7.A03
            r4.A0A(r5, r2, r1, r0)
            android.os.Bundle r1 = r3.mArguments
            if (r1 == 0) goto L_0x0199
            r0 = 151(0x97, float:2.12E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            android.os.Bundle r1 = r1.getBundle(r0)
            if (r1 == 0) goto L_0x0199
            java.lang.String r0 = "IgReactFragment.ARGUMENT_SHOULD_INSET_ACTION_BAR_HEIGHT"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x0199
            int r2 = X.AnonymousClass3D4.A00(r6)
            boolean r0 = r3 instanceof X.AnonymousClass4DH
            if (r0 == 0) goto L_0x0186
            r1 = r3
            X.4DH r1 = (X.AnonymousClass4DH) r1
            r0 = 0
            if (r1 == 0) goto L_0x0186
            r1.setContentInset(r0, r2, r0, r0)
        L_0x0186:
            boolean r0 = r3 instanceof X.AnonymousClass32G
            if (r0 == 0) goto L_0x0199
            X.32G r3 = (X.AnonymousClass32G) r3
            if (r3 == 0) goto L_0x0199
            r1 = 0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1, r2, r1, r1)
            r3.A00 = r0
            r3.A0a()
        L_0x0199:
            r4.A04()
            return
        L_0x019d:
            boolean r0 = r11 instanceof X.C66397MQd
            if (r0 == 0) goto L_0x01ab
            androidx.fragment.app.FragmentActivity r0 = r2.A03
            X.0hq r0 = r0.getSupportFragmentManager()
            r0.A0c()
            return
        L_0x01ab:
            boolean r0 = r11 instanceof X.C66398MQe
            if (r0 == 0) goto L_0x009f
            r2.A02 = r1
            androidx.fragment.app.FragmentActivity r0 = r2.A03
            r0.onBackPressed()
            return
        L_0x01b7:
            boolean r0 = r10 instanceof X.C65402Lsi
            if (r0 == 0) goto L_0x01bf
            X.KiE r5 = X.C62581KiE.A0C
            goto L_0x0020
        L_0x01bf:
            boolean r0 = r10 instanceof X.C65385LsR
            if (r0 == 0) goto L_0x01c7
            X.KiE r5 = X.C62581KiE.A05
            goto L_0x0020
        L_0x01c7:
            boolean r0 = r10 instanceof X.C65388LsU
            if (r0 == 0) goto L_0x01cf
            X.KiE r5 = X.C62581KiE.A07
            goto L_0x0020
        L_0x01cf:
            boolean r0 = r10 instanceof X.C65393LsZ
            if (r0 == 0) goto L_0x01d7
            X.KiE r5 = X.C62581KiE.A06
            goto L_0x0020
        L_0x01d7:
            boolean r0 = r10 instanceof X.C65404Lsk
            if (r0 == 0) goto L_0x01e3
            com.instagram.igtv.uploadflow.common.IGTVUploadProgress r0 = r2.A01
            X.L8E r0 = r0.A01
            r0.A02 = r1
            goto L_0x002c
        L_0x01e3:
            boolean r0 = r10 instanceof X.C65389LsV
            if (r0 == 0) goto L_0x01ef
            com.instagram.igtv.uploadflow.common.IGTVUploadProgress r0 = r2.A01
            X.L8E r0 = r0.A01
            r0.A01 = r1
            goto L_0x002c
        L_0x01ef:
            boolean r0 = r10 instanceof X.C65386LsS
            if (r0 == 0) goto L_0x01fb
            com.instagram.igtv.uploadflow.common.IGTVUploadProgress r0 = r2.A01
            X.L8E r0 = r0.A01
            r0.A00 = r1
            goto L_0x002c
        L_0x01fb:
            boolean r0 = r10 instanceof X.C65397Lsd
            if (r0 == 0) goto L_0x002c
            com.instagram.igtv.uploadflow.common.IGTVUploadProgress r0 = r2.A01
            X.L8E r0 = r0.A01
            r0.A03 = r1
            goto L_0x002c
        L_0x0207:
            X.MQf r10 = (X.C66399MQf) r10
            X.Lsm r0 = X.C65406Lsm.A00
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 == 0) goto L_0x009f
            java.lang.Object r1 = r8.A01
            X.KZv r1 = (X.C62091KZv) r1
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r1.A00 = r10
            return
        L_0x021c:
            X.80V r0 = X.AnonymousClass80V.ROLL_CALL_SEQUENTIAL_CAPTURE
            if (r9 != r0) goto L_0x009f
            X.80V r0 = X.AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY
            if (r10 != r0) goto L_0x009f
            java.lang.Object r4 = r8.A01
            X.Jc1 r4 = (X.C59937Jc1) r4
            X.Jc2 r5 = r4.A08
            X.0eM r3 = r5.A08
            java.lang.Object r0 = r3.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.removeAllListeners()
            java.lang.Object r2 = r3.getValue()
            android.animation.Animator r2 = (android.animation.Animator) r2
            r1 = 3
            X.LTc r0 = new X.LTc
            r0.<init>(r5, r1)
            r2.addListener(r0)
            java.lang.Object r0 = r3.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.cancel()
            X.Jc0 r2 = r4.A09
            X.0eM r0 = r2.A02
            java.lang.Object r0 = r0.getValue()
            X.8JB r0 = (X.AnonymousClass8JB) r0
            android.os.Handler r1 = r0.A02
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            X.0eM r0 = r2.A03
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            X.C51969G9p.A1M(r0)
            r0 = 1
            X.C59937Jc1.A02(r4, r0)
            return
        L_0x026b:
            X.80X r0 = X.AnonymousClass80X.POST_CAPTURE
            if (r9 != r0) goto L_0x009f
            java.lang.Object r0 = r8.A01
            X.Llp r0 = (X.C65012Llp) r0
            X.JlY r1 = r0.A0C
            int r0 = r1.getItemCount()
            if (r0 <= 0) goto L_0x009f
            java.util.ArrayList r0 = r1.A05
            r0.clear()
            r1.notifyDataSetChanged()
            return
        L_0x0284:
            X.80V r3 = X.AnonymousClass80V.POST_CAPTURE_LAYOUT_EDIT
            r2 = 1
            if (r9 != r3) goto L_0x02b7
            boolean r0 = r11 instanceof X.AnonymousClass8T3
            if (r0 == 0) goto L_0x029f
            java.lang.Object r1 = r8.A01
            X.Llp r1 = (X.C65012Llp) r1
            X.0eM r0 = r1.A0F
            java.lang.Object r0 = r0.getValue()
            android.app.Dialog r0 = (android.app.Dialog) r0
            X.AnonymousClass0fN.A00(r0)
            X.C65012Llp.A01(r1)
        L_0x029f:
            java.lang.Object r1 = r8.A01
            X.Llp r1 = (X.C65012Llp) r1
            X.2eb r0 = r1.A07
            android.view.View r0 = r0.A01()
            X.AnonymousClass7TE.A1U(r0, r2)
            X.0eM r0 = r1.A0E
            java.lang.Object r0 = r0.getValue()
            X.8Hc r0 = (X.C353308Hc) r0
            r0.CL9(r2)
        L_0x02b7:
            if (r10 != r3) goto L_0x009f
            java.lang.Object r1 = r8.A01
            X.Llp r1 = (X.C65012Llp) r1
            X.2eb r0 = r1.A07
            android.view.View r0 = r0.A01()
            X.0qQ.A07(r0)
            X.AnonymousClass7TG.A1A(r0, r2)
            X.0eM r0 = r1.A0E
            java.lang.Object r0 = r0.getValue()
            X.8Hc r0 = (X.C353308Hc) r0
            r0.A01(r2)
            return
        L_0x02d5:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Start IGTV upload navigation with action: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", but destination is not a FragmentDestination: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r10, r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x02ec:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "In state: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", on FragmentNavigationAction: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", but destination is not a FragmentDestination: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r10, r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59966Jcb.Dmx(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }
}
