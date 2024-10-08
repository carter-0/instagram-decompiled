package X;

import android.view.View;

public final class LY0 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public LY0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new LY0(obj, i), view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.JvT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: X.JvT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v112, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: X.KkX} */
    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v5 */
    /* JADX WARNING: type inference failed for: r1v123, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v12 */
    /* JADX WARNING: type inference failed for: r14v13 */
    /* JADX WARNING: type inference failed for: r14v14 */
    /* JADX WARNING: type inference failed for: r14v15 */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00ca: MOVE  (r1v258 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v257 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void onClick(android.view.View r23) {
        /*
            r22 = this;
            r1 = r22
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0db7;
                case 1: goto L_0x0da3;
                case 2: goto L_0x0d8f;
                case 3: goto L_0x0d79;
                case 4: goto L_0x0d65;
                case 5: goto L_0x0ca5;
                case 6: goto L_0x0bf0;
                case 7: goto L_0x0ae5;
                case 8: goto L_0x0aad;
                case 9: goto L_0x0a9a;
                case 10: goto L_0x0a86;
                case 11: goto L_0x0a71;
                case 12: goto L_0x0a4f;
                case 13: goto L_0x09fb;
                case 14: goto L_0x09a9;
                case 15: goto L_0x0992;
                case 16: goto L_0x097b;
                case 17: goto L_0x093f;
                case 18: goto L_0x0928;
                case 19: goto L_0x08df;
                case 20: goto L_0x08c8;
                case 21: goto L_0x08b7;
                case 22: goto L_0x089d;
                case 23: goto L_0x083f;
                case 24: goto L_0x081d;
                case 25: goto L_0x07e7;
                case 26: goto L_0x07c6;
                case 27: goto L_0x07b1;
                case 28: goto L_0x079e;
                case 29: goto L_0x076a;
                case 30: goto L_0x0746;
                case 31: goto L_0x0716;
                case 32: goto L_0x0705;
                case 33: goto L_0x06ef;
                case 34: goto L_0x06bb;
                case 35: goto L_0x0684;
                case 36: goto L_0x065e;
                case 37: goto L_0x05c4;
                case 38: goto L_0x05b1;
                case 39: goto L_0x0598;
                case 40: goto L_0x0587;
                case 41: goto L_0x0572;
                case 42: goto L_0x055b;
                case 43: goto L_0x0540;
                case 44: goto L_0x0525;
                case 45: goto L_0x050a;
                case 46: goto L_0x04ef;
                case 47: goto L_0x04b7;
                case 48: goto L_0x04a2;
                case 49: goto L_0x0008;
                case 50: goto L_0x0491;
                case 51: goto L_0x0457;
                case 52: goto L_0x0444;
                case 53: goto L_0x0431;
                case 54: goto L_0x03ef;
                case 55: goto L_0x03dc;
                case 56: goto L_0x03bf;
                case 57: goto L_0x0372;
                case 58: goto L_0x035b;
                case 59: goto L_0x0344;
                case 60: goto L_0x00fc;
                case 61: goto L_0x02ec;
                case 62: goto L_0x01f1;
                case 63: goto L_0x01da;
                case 64: goto L_0x01bb;
                case 65: goto L_0x01a4;
                case 66: goto L_0x0185;
                case 67: goto L_0x0133;
                case 68: goto L_0x00e9;
                case 69: goto L_0x0072;
                case 70: goto L_0x005b;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r2 = r1.A01
            X.L6E r2 = (X.L6E) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.JYl r4 = r2.A01
            java.util.LinkedList r1 = r4.A08
            X.LAc r0 = r2.A02
            int r3 = r1.indexOf(r0)
            if (r3 < 0) goto L_0x0007
            X.Jpf r0 = r4.A00
            if (r0 == 0) goto L_0x0027
            int r0 = r0.getLayoutPosition()
            if (r0 != r3) goto L_0x0027
            r0 = 0
            r4.A00 = r0
        L_0x0027:
            java.lang.Object r2 = r1.remove(r3)
            X.LAc r2 = (X.C63873LAc) r2
            r2.getClass()
            java.lang.String r1 = r2.A06
            if (r1 == 0) goto L_0x0039
            java.util.Map r0 = r4.A09
            r0.remove(r1)
        L_0x0039:
            android.graphics.Bitmap r0 = r2.A00
            if (r0 == 0) goto L_0x0040
            r0.recycle()
        L_0x0040:
            r4.notifyItemRemoved(r3)
            X.MV4 r2 = r4.A06
            X.JYD r2 = (X.JYD) r2
            X.JYD.A07(r2)
            X.8Yz r0 = r2.A0J
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0007
            r1 = 0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.A0C
            X.JYG.A01(r0, r2, r1)
            return
        L_0x005b:
            r0 = 1346740947(0x5045a2d3, float:1.32631296E10)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LxB r0 = (X.C65634LxB) r0
            X.K7n r1 = r0.A05
            X.Ki2 r0 = X.C62571Ki2.OPAL
            r1.A08(r0)
            r0 = 1290337223(0x4ce8fbc7, float:1.22150456E8)
            goto L_0x0dca
        L_0x0072:
            r0 = -1380827222(0xffffffffadb23faa, float:-2.026453E-11)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.LxB r7 = (X.C65634LxB) r7
            com.instagram.common.session.UserSession r6 = r7.A02
            r5 = 0
            android.os.Bundle r4 = X.DbY.A09(r6)
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r1 = r7.A03
            r0 = 59
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putParcelable(r0, r1)
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r1 = r7.A04
            r0 = 223(0xdf, float:3.12E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putParcelable(r0, r1)
            r3 = 1
            r0 = 28
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r4.putBoolean(r0, r3)
            r1 = 1058642330(0x3f19999a, float:0.6)
            java.lang.String r0 = "DirectPrivateStoryRecipientFragment.DIRECT_BOTTOM_SHEET_LAYOUT_HEIGHT_RATIO"
            r4.putFloat(r0, r1)
            java.lang.String r0 = "DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHOW_BOTTOM_SHEET_DRAG_HANDLE"
            r4.putBoolean(r0, r5)
            r0 = 913(0x391, float:1.28E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putBoolean(r0, r3)
            X.K6L r5 = new X.K6L
            r5.<init>()
            r5.setArguments(r4)
            X.K7n r4 = r7.A05
            androidx.fragment.app.Fragment r1 = r4.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x00e4
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x00e4
            X.7Pu r3 = r1.A02
            if (r3 == 0) goto L_0x00e4
            X.7Pr r1 = X.DbS.A0W(r6)
            r0 = 2131959811(0x7f132003, float:1.9556273E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A0d = r0
            r1.A0T = r5
            r3.A0F(r5, r1)
        L_0x00e4:
            r0 = -1149579071(0xffffffffbb7ad0c1, float:-0.00382714)
            goto L_0x0dca
        L_0x00e9:
            r0 = -1048605852(0xffffffffc17f8b64, float:-15.971531)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K7Z r0 = (X.K7Z) r0
            X.K7Z.A00(r0)
            r0 = -1617535051(0xffffffff9f965fb5, float:-6.3685805E-20)
            goto L_0x0dca
        L_0x00fc:
            r0 = -1208640757(0xffffffffb7f59b0b, float:-2.9278473E-5)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.LmT r5 = (X.C65049LmT) r5
            com.instagram.common.session.UserSession r4 = r5.A0H
            X.27r r0 = X.27p.A01(r4)
            X.JVj r3 = X.C59725JVj.POST_CAPTURE
            r0.A1H(r3)
            com.instagram.common.ui.base.IgEditText r0 = r5.A02
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "stickerEditText"
            goto L_0x0802
        L_0x011a:
            X.DbS.A1C(r0)
            X.80U r1 = r5.A0I
            X.8T3 r0 = X.AnonymousClass8T3.A00
            r1.E3H(r0)
            android.app.Activity r1 = r5.A0E
            X.Lt2 r0 = new X.Lt2
            r0.<init>(r5)
            X.C63306Kup.A00(r1, r3, r4, r0)
            r0 = -101245010(0xfffffffff9f71fae, float:-1.6039248E35)
            goto L_0x0dca
        L_0x0133:
            r0 = -1036806259(0xffffffffc233978d, float:-44.898)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.K7Z r6 = (X.K7Z) r6
            com.instagram.model.reels.Reel r5 = r6.A04
            if (r5 == 0) goto L_0x0180
            java.lang.String r4 = X.JTP.A0r(r5)
            java.lang.String r1 = r5.A0r
            X.Ki3 r0 = X.Ki3.DIRECT_RECIPIENT_PICKER
            java.lang.String r0 = r0.A00
            r3 = 1
            X.8VT r1 = X.C64133LPh.A01(r4, r1, r0, r3)
            X.0eM r0 = r6.A06
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.8VS r0 = X.AnonymousClass8VR.A00(r0)
            r0.A00 = r1
            com.instagram.igds.components.button.IgdsButton r1 = r6.A03
            java.lang.String r0 = "shareButton"
            if (r1 == 0) goto L_0x0802
            r1.setLoading(r3)
            com.instagram.igds.components.button.IgdsButton r1 = r6.A03
            if (r1 == 0) goto L_0x0802
            r0 = 0
            r1.setEnabled(r0)
            X.K7n r3 = r6.A02
            if (r3 == 0) goto L_0x0180
            java.lang.String r1 = X.JTP.A0r(r5)
            X.Ki2 r0 = X.C62571Ki2.HIGHLIGHTS
            r3.A08(r0)
            r3.A06 = r1
            X.C61438K7n.A03(r3)
        L_0x0180:
            r0 = -1480599062(0xffffffffa7bfd9ea, float:-5.3249412E-15)
            goto L_0x0dca
        L_0x0185:
            r0 = -141290207(0xfffffffff7941521, float:-6.006941E33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LxB r0 = (X.C65634LxB) r0
            com.instagram.common.session.UserSession r5 = r0.A02
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            androidx.fragment.app.FragmentActivity r1 = r0.A00
            java.lang.String r0 = "fan_club_member_list"
            X.Dbb.A0i(r1, r3, r5, r4, r0)
            r0 = 1198670944(0x47724460, float:62020.375)
            goto L_0x0dca
        L_0x01a4:
            r0 = 629686305(0x25884021, float:2.3635695E-16)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LxB r0 = (X.C65634LxB) r0
            X.K7n r1 = r0.A05
            X.Ki2 r0 = X.C62571Ki2.EXCLUSIVE_STORY
            r1.A08(r0)
            r0 = -1670663461(0xffffffff9c6bb2db, float:-7.7986143E-22)
            goto L_0x0dca
        L_0x01bb:
            r0 = 1152814403(0x44b68d43, float:1460.4144)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LxB r0 = (X.C65634LxB) r0
            com.instagram.common.session.UserSession r5 = r0.A02
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            androidx.fragment.app.FragmentActivity r1 = r0.A00
            java.lang.String r0 = "fan_club_member_list"
            X.Dbb.A0i(r1, r3, r5, r4, r0)
            r0 = -1097301662(0xffffffffbe988162, float:-0.2978621)
            goto L_0x0dca
        L_0x01da:
            r0 = -660842357(0xffffffffd89c588b, float:-1.37523282E15)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LxB r0 = (X.C65634LxB) r0
            X.K7n r1 = r0.A05
            X.Ki2 r0 = X.C62571Ki2.CLOSE_FRIENDS
            r1.A08(r0)
            r0 = 1276518753(0x4c162161, float:3.935578E7)
            goto L_0x0dca
        L_0x01f1:
            r0 = -1161376093(0xffffffffbac6cea3, float:-0.0015167784)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.LxB r4 = (X.C65634LxB) r4
            com.instagram.common.session.UserSession r6 = r4.A02
            X.K7n r5 = r4.A05
            X.LFo r1 = new X.LFo
            r1.<init>(r5, r6)
            X.KkX r3 = X.C62671KkX.LIST_SHEET
            r1.A01(r3)
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            X.KhK r2 = X.C62528KhK.SHARE_TO_STORY_BUTTON
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r1 = r4.A03
            r9.put(r2, r1)
            X.KhK r15 = X.C62528KhK.UPPER_RIGHT_CREATE_AUDIENCE_LIST_BUTTON
            r12 = 0
            r9.put(r15, r12)
            X.KhK r14 = X.C62528KhK.BACK_BUTTON_ENABLED
            r9.put(r14, r12)
            X.KhK r13 = X.C62528KhK.CAN_SELECT_AUDIENCE_LISTS
            r9.put(r13, r12)
            X.KhK r11 = X.C62528KhK.DELETE_OPTION_ENABLED
            r9.put(r11, r12)
            X.KhK r10 = X.C62528KhK.LOGGING_ENTRY_POINT
            r9.put(r10, r3)
            X.KhK r8 = X.C62528KhK.IS_FROM_SHARE_SHEET
            r9.put(r8, r12)
            r17 = r5
            boolean r1 = r5 instanceof X.MTR
            if (r1 != 0) goto L_0x023c
            r17 = r12
        L_0x023c:
            r16 = 0
            android.os.Bundle r7 = X.AnonymousClass7TE.A0a()
            boolean r1 = r9.containsKey(r2)
            r4 = 0
            if (r1 == 0) goto L_0x025a
            java.lang.String r3 = r2.toString()
            java.lang.Object r2 = r9.get(r2)
            boolean r1 = r2 instanceof android.os.Parcelable
            if (r1 == 0) goto L_0x02b5
            android.os.Parcelable r2 = (android.os.Parcelable) r2
        L_0x0257:
            r7.putParcelable(r3, r2)
        L_0x025a:
            X.JTU.A0l(r7, r15, r9)
            X.JTU.A0l(r7, r14, r9)
            X.JTU.A0l(r7, r13, r9)
            X.KhK r2 = X.C62528KhK.FILTER_AUDIENCE_LISTS
            boolean r1 = r9.containsKey(r2)
            if (r1 == 0) goto L_0x0282
            java.lang.String r3 = r2.toString()
            java.lang.Object r2 = r9.get(r2)
            boolean r1 = r2 instanceof java.util.List
            if (r1 == 0) goto L_0x027f
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x027f
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1D(r2)
        L_0x027f:
            r7.putStringArrayList(r3, r12)
        L_0x0282:
            X.KhK r1 = X.C62528KhK.SET_TITLE_SHARED_TO
            X.JTU.A0l(r7, r1, r9)
            X.JTU.A0l(r7, r11, r9)
            boolean r1 = r9.containsKey(r10)
            if (r1 == 0) goto L_0x02a2
            java.lang.String r3 = r10.toString()
            java.lang.Object r2 = r9.get(r10)
            boolean r1 = r2 instanceof X.C62671KkX
            if (r1 == 0) goto L_0x029f
            r4 = r2
            X.KkX r4 = (X.C62671KkX) r4
        L_0x029f:
            r7.putSerializable(r3, r4)
        L_0x02a2:
            X.JTU.A0l(r7, r8, r9)
            X.C227642jf.A04(r7, r6)
            X.K8H r4 = new X.K8H
            r4.<init>()
            r4.setArguments(r7)
            r1 = r17
            r4.A01 = r1
            goto L_0x02b7
        L_0x02b5:
            r2 = r12
            goto L_0x0257
        L_0x02b7:
            androidx.fragment.app.Fragment r2 = r5.mParentFragment     // Catch:{ IllegalArgumentException -> 0x02d8 }
            boolean r1 = r2 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment     // Catch:{ IllegalArgumentException -> 0x02d8 }
            if (r1 == 0) goto L_0x02e7
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r2 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r2     // Catch:{ IllegalArgumentException -> 0x02d8 }
            if (r2 == 0) goto L_0x02e7
            X.7Pu r3 = r2.A02     // Catch:{ IllegalArgumentException -> 0x02d8 }
            if (r3 == 0) goto L_0x02e7
            X.7Pr r2 = X.DbS.A0W(r6)     // Catch:{ IllegalArgumentException -> 0x02d8 }
            r1 = r16
            r2.A1O = r1     // Catch:{ IllegalArgumentException -> 0x02d8 }
            r1 = 1058642330(0x3f19999a, float:0.6)
            r2.A04 = r1     // Catch:{ IllegalArgumentException -> 0x02d8 }
            r2.A0T = r4     // Catch:{ IllegalArgumentException -> 0x02d8 }
            r3.A0F(r4, r2)     // Catch:{ IllegalArgumentException -> 0x02d8 }
            goto L_0x02e7
        L_0x02d8:
            androidx.fragment.app.Fragment r2 = r5.mParentFragment
            boolean r1 = r2 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r1 == 0) goto L_0x02e7
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r2 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r2
            if (r2 == 0) goto L_0x02e7
            X.7Pu r1 = r2.A02
            X.DbW.A1K(r1)
        L_0x02e7:
            r1 = 164191138(0x9c95ba2, float:4.847516E-33)
            goto L_0x0d5c
        L_0x02ec:
            r0 = 935946317(0x37c9684d, float:2.4009636E-5)
            int r2 = X.AnonymousClass0fD.A05(r0)
            X.K6T r4 = new X.K6T
            r4.<init>()
            java.lang.Object r5 = r1.A01
            X.WUZ r5 = (X.WUZ) r5
            com.instagram.common.session.UserSession r6 = r5.A05
            r3 = 0
            r0 = 23
            X.MMe r1 = new X.MMe
            r1.<init>(r6, r0)
            java.lang.Class<X.KKo> r0 = X.C61749KKo.class
            java.lang.Object r0 = r6.A01(r0, r1)
            X.6hw r0 = (X.C314276hw) r0
            X.0qQ.A0B(r0, r3)
            r4.A02 = r0
            X.WUN r0 = new X.WUN
            r0.<init>(r5)
            r4.A01 = r0
            X.7Pr r3 = X.DbS.A0W(r6)
            android.content.Context r1 = r5.A03
            r0 = 2131099794(0x7f060092, float:1.7811951E38)
            int r0 = r1.getColor(r0)
            r3.A06 = r0
            r3.A0T = r4
            r0 = 1060320051(0x3f333333, float:0.7)
            r3.A03 = r0
            r0 = 1
            r3.A0k = r0
            X.DbS.A1S(r3, r0)
            X.7Pu r1 = r3.A00()
            android.app.Activity r0 = r5.A02
            r1.A02(r0, r4)
            r0 = -406546190(0xffffffffe7c498f2, float:-1.8568103E24)
            goto L_0x0dca
        L_0x0344:
            r0 = 348535465(0x14c63aa9, float:2.0016028E-26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Jid r1 = X.JTR.A0l(r0)
            X.LmH r0 = X.C65038LmH.A00
            r1.A01(r0)
            r0 = 1889310536(0x709c9748, float:3.877004E29)
            goto L_0x0dca
        L_0x035b:
            r0 = 932667763(0x37976173, float:1.8045981E-5)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Jid r1 = X.JTR.A0l(r0)
            X.LmH r0 = X.C65038LmH.A00
            r1.A01(r0)
            r0 = -2119116620(0xffffffff81b0d8b4, float:-6.4963143E-38)
            goto L_0x0dca
        L_0x0372:
            r0 = -1167226085(0xffffffffba6d8b1b, float:-9.061561E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.LmU r2 = (X.C65050LmU) r2
            com.instagram.music.common.model.MusicAssetModel r1 = r2.A00
            if (r1 != 0) goto L_0x03b9
            X.0eM r2 = r2.A0M
            android.view.View r1 = X.AnonymousClass7TH.A06(r2)
            float r7 = r1.getRotation()
            java.lang.Object r6 = X.AnonymousClass7TE.A14(r2)
            android.util.Property r5 = android.view.View.ROTATION
            r1 = 5
            float[] r4 = new float[r1]
            r1 = 0
            r4[r1] = r7
            r3 = 1
            r1 = 1082130432(0x40800000, float:4.0)
            float r2 = r7 - r1
            r4[r3] = r2
            r1 = 2
            r4[r1] = r7
            r1 = 3
            r4[r1] = r2
            r1 = 4
            r4[r1] = r7
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r6, r5, r4)
            r1 = 300(0x12c, double:1.48E-321)
            android.animation.ObjectAnimator r1 = r3.setDuration(r1)
            r1.start()
        L_0x03b4:
            r1 = 581692951(0x22abee17, float:4.660173E-18)
            goto L_0x0d5c
        L_0x03b9:
            X.8MF r1 = r2.A09
            r1.D9o()
            goto L_0x03b4
        L_0x03bf:
            r0 = 188523063(0xb3ca237, float:3.632952E-32)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LmU r0 = (X.C65050LmU) r0
            X.0eM r0 = r0.A0P
            java.lang.Object r3 = r0.getValue()
            X.89k r3 = (X.C3515789k) r3
            r1 = 0
            r0 = 0
            r3.A0A(r1, r1, r0, r0)
            r0 = 1950183967(0x743d721f, float:6.0037766E31)
            goto L_0x0dca
        L_0x03dc:
            r0 = 288796002(0x1136ad62, float:1.4410696E-28)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LmU r0 = (X.C65050LmU) r0
            X.C65050LmU.A00(r0)
            r0 = 2080694855(0x7c04e247, float:2.7598905E36)
            goto L_0x0dca
        L_0x03ef:
            r0 = 140251532(0x85c118c, float:6.622447E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K7u r2 = (X.C61443K7u) r2
            X.847 r3 = r2.A02
            if (r3 != 0) goto L_0x0402
            java.lang.String r0 = "brandedContentTaggingUpsellController"
            goto L_0x0802
        L_0x0402:
            com.instagram.common.session.UserSession r7 = r2.getSession()
            android.content.Context r4 = r2.requireContext()
            java.lang.String r8 = X.C61443K7u.A00(r2)
            java.util.ArrayList r10 = r2.A04
            r1 = 42
            X.LV3 r5 = X.LV3.A00(r2, r1)
            r1 = 43
            X.LV3 r6 = X.LV3.A00(r2, r1)
            java.lang.String r9 = "live"
            boolean r1 = r3.A04(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x0429
            r1 = 163776032(0x9c30620, float:4.6950302E-33)
            goto L_0x0d5c
        L_0x0429:
            X.C61443K7u.A01(r2)
            r1 = 376380035(0x166f1a83, float:1.9314632E-25)
            goto L_0x0d5c
        L_0x0431:
            r0 = 484385149(0x1cdf217d, float:1.4765559E-21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K7u r0 = (X.C61443K7u) r0
            X.C61443K7u.A02(r0)
            r0 = 1884286959(0x704fefef, float:2.5741384E29)
            goto L_0x0dca
        L_0x0444:
            r0 = 1741589548(0x67ce8c2c, float:1.9507864E24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K4c r0 = (X.C61360K4c) r0
            X.C61360K4c.A01(r0)
            r0 = -1446197615(0xffffffffa9ccc691, float:-9.093866E-14)
            goto L_0x0dca
        L_0x0457:
            r0 = -1422416683(0xffffffffab37a4d5, float:-6.524341E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K4c r5 = (X.C61360K4c) r5
            X.0eM r2 = r5.A0H
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            boolean r1 = X.C324536zU.A00(r1)
            if (r1 == 0) goto L_0x0480
            android.content.Context r3 = r5.requireContext()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r1 = "closed_friends"
            X.FFO.A02(r3, r2, r1)
        L_0x047b:
            r1 = 1059943699(0x3f2d7513, float:0.67756766)
            goto L_0x0d5c
        L_0x0480:
            X.30l r4 = r5.A01
            if (r4 != 0) goto L_0x0488
            java.lang.String r0 = "closeFriendsController"
            goto L_0x0802
        L_0x0488:
            X.Ki7 r3 = X.C62574Ki7.LIVE_COMPOSER
            r2 = 2002(0x7d2, float:2.805E-42)
            r1 = 0
            r4.A00(r5, r3, r2, r1)
            goto L_0x047b
        L_0x0491:
            r0 = 1000426337(0x3ba14b61, float:0.004922316)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = -1802407525(0xffffffff9491719b, float:-1.4686068E-26)
            goto L_0x0dca
        L_0x04a2:
            r0 = 157947705(0x96a1739, float:2.8177645E-33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Lh1 r1 = (X.C64724Lh1) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.C64724Lh1.A09(r1, r0)
            r0 = 1102060795(0x41b01cfb, float:22.01415)
            goto L_0x0dca
        L_0x04b7:
            r0 = 25480129(0x184cbc1, float:4.8781514E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KG4 r1 = (X.KG4) r1
            X.Joy r1 = r1.A00
            if (r1 == 0) goto L_0x04ea
            android.widget.EditText r4 = r1.A01
            java.lang.String r3 = X.AnonymousClass7TF.A0f(r4)
            X.9cn r1 = r1.A00
            if (r1 == 0) goto L_0x04ea
            java.lang.String r2 = r1.A01
            if (r2 == 0) goto L_0x04ea
            boolean r1 = X.LQE.A01(r3)
            if (r1 != 0) goto L_0x04e2
            int r1 = r2.length()
            java.lang.String r2 = X.LQE.A00(r1)
        L_0x04e2:
            android.widget.TextView$BufferType r1 = android.widget.TextView.BufferType.EDITABLE
            r4.setText(r2, r1)
            X.JTR.A1F(r4)
        L_0x04ea:
            r1 = 1656915973(0x62c28805, float:1.7942348E21)
            goto L_0x0d5c
        L_0x04ef:
            r0 = -1497066679(0xffffffffa6c49349, float:-1.3640154E-15)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LmS r1 = (X.C65048LmS) r1
            X.KiQ r0 = X.C62593KiQ.RUPERT
            X.C65048LmS.A02(r1, r0)
            X.C65048LmS.A00(r1)
            X.C65048LmS.A01(r1)
            r0 = -1857556573(0xffffffff9147efa3, float:-1.5772176E-28)
            goto L_0x0dca
        L_0x050a:
            r0 = 905197106(0x35f43632, float:1.819519E-6)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LmS r1 = (X.C65048LmS) r1
            X.KiQ r0 = X.C62593KiQ.ZIGGY
            X.C65048LmS.A02(r1, r0)
            X.C65048LmS.A00(r1)
            X.C65048LmS.A01(r1)
            r0 = -1600845269(0xffffffffa0950a2b, float:-2.524831E-19)
            goto L_0x0dca
        L_0x0525:
            r0 = -2083161214(0xffffffff83d57b82, float:-1.2547371E-36)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LmS r1 = (X.C65048LmS) r1
            X.KiQ r0 = X.C62593KiQ.HUGO
            X.C65048LmS.A02(r1, r0)
            X.C65048LmS.A00(r1)
            X.C65048LmS.A01(r1)
            r0 = 2061968502(0x7ae72476, float:6.0008004E35)
            goto L_0x0dca
        L_0x0540:
            r0 = -174281924(0xfffffffff59cab3c, float:-3.972028E32)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LmS r1 = (X.C65048LmS) r1
            X.KiQ r0 = X.C62593KiQ.LUNA
            X.C65048LmS.A02(r1, r0)
            X.C65048LmS.A00(r1)
            X.C65048LmS.A01(r1)
            r0 = 1754006474(0x688c03ca, float:5.2896096E24)
            goto L_0x0dca
        L_0x055b:
            r0 = -1277277149(0xffffffffb3de4c23, float:-1.035153E-7)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LmS r0 = (X.C65048LmS) r0
            X.80U r1 = r0.A0D
            X.8T3 r0 = X.AnonymousClass8T3.A00
            r1.E3H(r0)
            r0 = -1535511371(0xffffffffa479f4b5, float:-5.4200543E-17)
            goto L_0x0dca
        L_0x0572:
            r0 = -525173716(0xffffffffe0b27c2c, float:-1.0288962E20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Jvo r0 = (X.C61050Jvo) r0
            java.lang.Object r0 = r0.A01
            X.DbS.A1U(r0)
            r0 = 1922946721(0x729dd6a1, float:6.252623E30)
            goto L_0x0dca
        L_0x0587:
            r0 = 215879246(0xcde0e4e, float:3.4213125E-31)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 502625929(0x1df57689, float:6.4973523E-21)
            goto L_0x0dca
        L_0x0598:
            r0 = 470833132(0x1c1057ec, float:4.775924E-22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Jpi r3 = (X.C60697Jpi) r3
            X.8gh r2 = r3.A00
            if (r2 == 0) goto L_0x05ac
            X.8ge r1 = r3.A0B
            X.C63151KsK.A00(r3, r2, r1)
        L_0x05ac:
            r1 = -1738918887(0xffffffff985a3419, float:-2.8202142E-24)
            goto L_0x0d5c
        L_0x05b1:
            r0 = 1834673501(0x6d5ae55d, float:4.2340635E27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LN1 r0 = (X.LN1) r0
            X.LN1.A00(r0)
            r0 = 1050384535(0x3e9b9897, float:0.30389854)
            goto L_0x0dca
        L_0x05c4:
            r0 = 904643007(0x35ebc1bf, float:1.7565252E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r10 = r1.A01
            X.Jpu r10 = (X.C60709Jpu) r10
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.Koz r1 = r10.A01
            com.instagram.model.reels.Reel r8 = r10.A02
            X.K71 r5 = r10.A00
            if (r5 == 0) goto L_0x0659
            if (r8 == 0) goto L_0x0659
            if (r1 == 0) goto L_0x0659
            int r7 = r10.getBindingAdapterPosition()
            com.instagram.model.effect.AttributedAREffect r2 = r8.A0G
            if (r2 == 0) goto L_0x0600
            X.0eM r1 = r5.A0B
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.4Om r6 = X.C264044Oj.A00(r1)
            java.lang.String r4 = r5.A07
            if (r4 != 0) goto L_0x05f7
            java.lang.String r0 = "profileTabSessionId"
            goto L_0x0802
        L_0x05f7:
            java.lang.String r3 = r2.A09
            int r2 = r7 % 2
            int r1 = r7 / 2
            r6.Cjh(r4, r3, r2, r1)
        L_0x0600:
            java.util.List r11 = X.AnonymousClass7TE.A1I(r8)
            X.JlM r1 = r5.A03
            if (r1 != 0) goto L_0x060c
            java.lang.String r0 = "adapter"
            goto L_0x0802
        L_0x060c:
            X.1Xj r6 = r1.A00(r7)
            if (r6 == 0) goto L_0x0633
            X.HkC r4 = r5.A01
            if (r4 != 0) goto L_0x061a
            java.lang.String r0 = "previewImpressionsTracker"
            goto L_0x0802
        L_0x061a:
            android.view.View r3 = r10.itemView
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            java.lang.String r1 = r6.getId()
            X.30a r2 = X.AnonymousClass30Y.A00(r6, r2, r1)
            X.H8e r1 = r4.A00
            r2.A00(r1)
            X.2el r1 = r4.A01
            X.C51967G9n.A0z(r3, r2, r1)
        L_0x0633:
            X.32A r7 = r5.A06
            if (r7 != 0) goto L_0x063b
            java.lang.String r0 = "reelViewerLauncher"
            goto L_0x0802
        L_0x063b:
            X.2pH r1 = r5.A05
            if (r1 != 0) goto L_0x0643
            java.lang.String r0 = "reelTrayLogger"
            goto L_0x0802
        L_0x0643:
            java.lang.String r1 = r1.A04
            r7.A0C = r1
            X.KWI r1 = new X.KWI
            r1.<init>(r5, r10)
            r7.A05 = r1
            java.util.List r12 = r5.A09
            if (r12 != 0) goto L_0x0653
            r12 = r11
        L_0x0653:
            X.3BQ r9 = X.AnonymousClass3BQ.AR_EFFECT_PROFILE
            r13 = r12
            r7.A05(r8, r9, r10, r11, r12, r13)
        L_0x0659:
            r1 = -239823213(0xfffffffff1b49693, float:-1.7884587E30)
            goto L_0x0d5c
        L_0x065e:
            r0 = -706228740(0xffffffffd5e7cdfc, float:-3.18589853E13)
            int r2 = X.AnonymousClass0fD.A05(r0)
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            X.Kgn r3 = X.C62497Kgn.STORY
            java.lang.String r0 = "ARGUMENT_CAMERA_SETTINGS_MODE"
            r5.putSerializable(r0, r3)
            java.lang.Object r0 = r1.A01
            X.LlO r0 = (X.C64985LlO) r0
            com.instagram.common.session.UserSession r4 = r0.A03
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.app.Activity r1 = r0.A01
            java.lang.String r0 = "camera_settings"
            X.Dbb.A0i(r1, r5, r4, r3, r0)
            r0 = 398536577(0x17c12f81, float:1.2484324E-24)
            goto L_0x0dca
        L_0x0684:
            r0 = -1451564781(0xffffffffa97ae113, float:-5.5706372E-14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.LlO r6 = (X.C64985LlO) r6
            com.instagram.common.session.UserSession r5 = r6.A03
            X.27p.A01(r5)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            X.Kgn r1 = X.C62497Kgn.REELS
            java.lang.String r0 = "ARGUMENT_CAMERA_SETTINGS_MODE"
            r4.putSerializable(r0, r1)
            android.content.Context r1 = r6.A02
            r0 = 2131971814(0x7f134ee6, float:1.9580618E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "title"
            r4.putString(r0, r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.app.Activity r1 = r6.A01
            java.lang.String r0 = "camera_settings"
            X.Dbb.A0i(r1, r4, r5, r3, r0)
            r0 = 1073594064(0x3ffdbed0, float:1.9823856)
            goto L_0x0dca
        L_0x06bb:
            r0 = -476737309(0xffffffffe39590e3, float:-5.51801E21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            X.Kgn r3 = X.C62497Kgn.LIVE
            java.lang.String r0 = "ARGUMENT_CAMERA_SETTINGS_MODE"
            r6.putSerializable(r0, r3)
            java.lang.Object r5 = r1.A01
            X.LlO r5 = (X.C64985LlO) r5
            android.content.Context r1 = r5.A02
            r0 = 2131965365(0x7f1335b5, float:1.9567538E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "title"
            r6.putString(r0, r1)
            com.instagram.common.session.UserSession r4 = r5.A03
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.app.Activity r1 = r5.A01
            java.lang.String r0 = "camera_settings"
            X.Dbb.A0i(r1, r6, r4, r3, r0)
            r0 = -169621321(0xfffffffff5e3c8b7, float:-5.7750116E32)
            goto L_0x0dca
        L_0x06ef:
            r0 = 448330176(0x1ab8f9c0, float:7.650411E-23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LlO r0 = (X.C64985LlO) r0
            X.A99 r1 = r0.A04
            r0 = 0
            r1.A00(r0)
            r0 = 968621379(0x39bbfd43, float:3.5856114E-4)
            goto L_0x0dca
        L_0x0705:
            r0 = -1770255921(0xffffffff967c09cf, float:-2.0359493E-25)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 1731401090(0x67331582, float:8.4570035E23)
            goto L_0x0dca
        L_0x0716:
            r0 = -1473988711(0xffffffffa824b799, float:-9.14364E-15)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Jpb r1 = (X.C60690Jpb) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.JhU r4 = r1.A0E
            r0 = 1418(0x58a, float:1.987E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            X.6oS r1 = X.C318116oQ.A00(r4)
            r0 = 37
            X.MGE.A01(r4, r3, r1, r0)
            com.instagram.common.session.UserSession r0 = r4.A03
            X.27r r3 = X.27p.A01(r0)
            java.lang.String r1 = "ACR_BROWSER_THREE_DOTS_MENU_MORE_INFO_BUTTON"
            X.JVj r0 = X.C59725JVj.ACR_BROWSER
            r3.A1Q(r0, r1)
            r0 = 1181393525(0x466aa275, float:15016.614)
            goto L_0x0dca
        L_0x0746:
            r0 = 1353955915(0x50b3ba4b, float:2.41226445E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Jpb r1 = (X.C60690Jpb) r1
            X.Jub r6 = r1.A01
            if (r6 == 0) goto L_0x0765
            X.JhU r5 = r1.A0E
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r2 = 4
            X.MH1 r1 = new X.MH1
            r1.<init>(r6, r5, r3, r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
        L_0x0765:
            r1 = -42184956(0xfffffffffd7c4f04, float:-2.0960983E37)
            goto L_0x0d5c
        L_0x076a:
            r0 = 19409085(0x12828bd, float:3.0885955E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K5V r2 = (X.K5V) r2
            X.0eP r1 = X.K5V.A00(r2)
            if (r1 == 0) goto L_0x0799
            java.lang.Object r1 = r1.A00
            X.Jpb r1 = (X.C60690Jpb) r1
            if (r1 == 0) goto L_0x0799
            X.Jub r6 = r1.A01
            if (r6 == 0) goto L_0x0799
            X.0eM r1 = r2.A0G
            X.2YL r5 = X.DbS.A0H(r1)
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r2 = 4
            X.MH1 r1 = new X.MH1
            r1.<init>(r6, r5, r3, r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
        L_0x0799:
            r1 = -117357203(0xfffffffff901456d, float:-4.19509E34)
            goto L_0x0d5c
        L_0x079e:
            r0 = 1912283091(0x71fb1fd3, float:2.4870147E30)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5V r0 = (X.K5V) r0
            r0.onBackPressed()
            r0 = -333472196(0xffffffffec1f9e3c, float:-7.718658E26)
            goto L_0x0dca
        L_0x07b1:
            r0 = -33010588(0xfffffffffe084c64, float:-4.5292913E37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Lmv r0 = (X.C65075Lmv) r0
            X.0sa r0 = r0.A09
            r0.invoke()
            r0 = -673132007(0xffffffffd7e0d219, float:-4.94385934E14)
            goto L_0x0dca
        L_0x07c6:
            r0 = 1197612694(0x47621e96, float:57886.586)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.KKY r2 = (X.KKY) r2
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r2 = r2.A04
            boolean r1 = r2.A08()
            if (r1 == 0) goto L_0x07e3
            r2.A06()
        L_0x07de:
            r1 = 1179988067(0x46553063, float:13644.097)
            goto L_0x0d5c
        L_0x07e3:
            r2.A04()
            goto L_0x07de
        L_0x07e7:
            r0 = -942396468(0xffffffffc7d42bcc, float:-108631.59)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.K6F r4 = (X.K6F) r4
            com.instagram.common.gallery.model.GalleryItem r1 = r4.A04
            if (r1 == 0) goto L_0x0811
            com.instagram.common.gallery.Medium r1 = r1.A00
            if (r1 == 0) goto L_0x0811
            com.instagram.common.gallery.metadata.MediaUploadMetadata r3 = r1.A0G
            X.JWz r2 = r4.A06
            if (r2 != 0) goto L_0x080a
            java.lang.String r0 = "cropImageController"
        L_0x0802:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x080a:
            android.content.Context r1 = r4.requireContext()
            r2.A02(r1, r3)
        L_0x0811:
            X.0hq r1 = X.DbV.A0I(r4)
            r1.A0c()
            r1 = -1107474122(0xffffffffbdfd4936, float:-0.123674795)
            goto L_0x0d5c
        L_0x081d:
            r0 = 1275477665(0x4c063ea1, float:3.5191428E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JW7 r1 = (X.JW7) r1
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r3 = r1.A0J
            r2 = 1
            if (r3 == 0) goto L_0x0836
            boolean r1 = r3.A08()
            if (r1 != r2) goto L_0x083b
            r3.A06()
        L_0x0836:
            r1 = 784436864(0x2ec18e80, float:8.801937E-11)
            goto L_0x0d5c
        L_0x083b:
            r3.A04()
            goto L_0x0836
        L_0x083f:
            r0 = 1182659242(0x467df2aa, float:16252.666)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.JW7 r5 = (X.JW7) r5
            com.instagram.common.session.UserSession r3 = r5.A0z
            X.JaN r2 = X.JW1.A00(r3)
            X.28D r1 = r5.A0q
            r2.A02(r1)
            X.27r r2 = X.27p.A01(r3)
            X.4yP r1 = X.C279294yP.FEED
            r4 = 0
            r2.A10(r1, r4)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r3)
            X.8aE r1 = new X.8aE
            r1.<init>()
            boolean r1 = r2.A05(r1)
            if (r1 != 0) goto L_0x0898
            X.JaN r3 = X.JW1.A00(r3)
            X.29E r6 = r3.A0B
            long r10 = r3.A01
            java.lang.String r7 = java.lang.String.valueOf(r4)
            r9 = 288435480(0x11312d18, float:1.3976734E-28)
            java.lang.String r8 = ""
            long r1 = r6.A07(r7, r8, r9, r10)
            r3.A01 = r1
            java.lang.String r2 = "GalleryPickerView"
            java.lang.String r1 = "@haydenkai UnifiedCameraDismissFeedGalleryEvent failed"
            X.0kD.A0A(r2, r1, r4)
            android.content.Context r3 = r5.getContext()
            r2 = 2131975831(0x7f135e97, float:1.9588765E38)
            java.lang.String r1 = "unable_to_open_camera"
            X.C59689JTv.A0F(r3, r1, r2)
        L_0x0898:
            r1 = -697067953(0xffffffffd673964f, float:-6.6956724E13)
            goto L_0x0d5c
        L_0x089d:
            r0 = 134991089(0x80bccf1, float:4.20697E-34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.JW8 r3 = (X.JW8) r3
            X.JWM r0 = r3.A0F
            boolean r0 = r0.A07
            r1 = 1
            r0 = r0 ^ 1
            r3.A0L(r0, r1)
            r0 = -50732595(0xfffffffffcf9e1cd, float:-1.03796936E37)
            goto L_0x0dca
        L_0x08b7:
            r0 = -671290851(0xffffffffd7fcea1d, float:-5.56164878E14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = -600219061(0xffffffffdc39624b, float:-2.0872378E17)
            goto L_0x0dca
        L_0x08c8:
            r0 = 1814859451(0x6c2c8ebb, float:8.344371E26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Ll0 r0 = (X.C64961Ll0) r0
            X.8MV r0 = r0.A08
            X.8ME r0 = (X.AnonymousClass8ME) r0
            r0.onBackPressed()
            r0 = -473435789(0xffffffffe3c7f173, float:-7.3766006E21)
            goto L_0x0dca
        L_0x08df:
            r0 = -709103371(0xffffffffd5bbf0f5, float:-2.58304471E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.JZf r4 = (X.C59811JZf) r4
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r4.A04
            if (r1 == 0) goto L_0x08f1
            X.DbS.A1T(r1)
        L_0x08f1:
            X.Kgm r1 = r4.A0F
            int r3 = r1.ordinal()
            r2 = 0
            r1 = 1
            if (r3 == r2) goto L_0x0913
            if (r3 != r1) goto L_0x090e
            X.6tY r1 = r4.A0H
            X.0Ud r1 = r1.A07
            java.util.Map r1 = X.JTO.A19(r1)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x090e
            r4.ACw()
        L_0x090e:
            r1 = -1721870243(0xffffffff995e585d, float:-1.1494976E-23)
            goto L_0x0d5c
        L_0x0913:
            X.6tY r3 = r4.A0H
            X.0Ud r1 = r3.A08
            java.util.Map r1 = X.JTO.A19(r1)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x090e
            r2 = 0
            r1 = 20
            r3.A01(r1, r2)
            goto L_0x090e
        L_0x0928:
            r0 = -2023353091(0xffffffff876614fd, float:-1.7309445E-34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Lky r0 = (X.C64959Lky) r0
            X.8MU r0 = r0.A03
            X.8ME r0 = (X.AnonymousClass8ME) r0
            r0.A1D()
            r0 = 1209358393(0x48155839, float:152928.89)
            goto L_0x0dca
        L_0x093f:
            r0 = -1917219439(0xffffffff8db98d91, float:-1.1435586E-30)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Lky r0 = (X.C64959Lky) r0
            X.8MU r0 = r0.A03
            X.8ME r0 = (X.AnonymousClass8ME) r0
            X.4DH r6 = r0.A0l
            androidx.fragment.app.FragmentActivity r5 = r6.requireActivity()
            com.instagram.common.session.UserSession r4 = r0.A0r
            X.0iw r0 = r0.A0o
            java.lang.String r1 = r0.getModuleName()
            android.os.Bundle r3 = X.DbY.A09(r4)
            java.lang.String r0 = "prior_module_name"
            r3.putString(r0, r1)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            r0 = 3332(0xd04, float:4.669E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r1 = X.DbS.A0b(r5, r3, r4, r1, r0)
            r0 = 17
            r1.A0D(r6, r0)
            r0 = -31494854(0xfffffffffe1f6d3a, float:-5.2978597E37)
            goto L_0x0dca
        L_0x097b:
            r0 = -1768001261(0xffffffff969e7113, float:-2.5597637E-25)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Lky r0 = (X.C64959Lky) r0
            X.8MU r0 = r0.A03
            X.8ME r0 = (X.AnonymousClass8ME) r0
            X.AnonymousClass8ME.A0T(r0)
            r0 = 1319535387(0x4ea6831b, float:1.39680499E9)
            goto L_0x0dca
        L_0x0992:
            r0 = -501485362(0xffffffffe21bf0ce, float:-7.191493E20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Lky r0 = (X.C64959Lky) r0
            X.8MU r0 = r0.A03
            X.8ME r0 = (X.AnonymousClass8ME) r0
            r0.onBackPressed()
            r0 = -463578524(0xffffffffe45e5a64, float:-1.6406762E22)
            goto L_0x0dca
        L_0x09a9:
            r0 = 525814715(0x1f574bbb, float:4.5590664E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Ll2 r4 = (X.C64963Ll2) r4
            java.lang.String r1 = X.C64963Ll2.A00(r4)
            if (r1 == 0) goto L_0x09ef
            int r1 = r1.length()
            if (r1 == 0) goto L_0x09ef
            android.app.Activity r2 = r4.A03
            boolean r1 = r2.isFinishing()
            if (r1 != 0) goto L_0x09ef
            X.8ab r3 = X.DbS.A0Y(r2)
            r1 = 2131975992(0x7f135f38, float:1.9589092E38)
            r3.A09(r1)
            r1 = 2131975991(0x7f135f37, float:1.958909E38)
            r3.A08(r1)
            r2 = 2131976948(0x7f1362f4, float:1.959103E38)
            r1 = 35
            X.LV3.A01(r3, r4, r1, r2)
            r2 = 2131968381(0x7f13417d, float:1.9573655E38)
            r1 = 0
            r3.A0G(r1, r2)
            X.DbT.A1V(r3)
        L_0x09ea:
            r1 = 1176144657(0x461a8b11, float:9890.767)
            goto L_0x0d5c
        L_0x09ef:
            X.8MT r1 = r4.A07
            X.8ME r1 = (X.AnonymousClass8ME) r1
            r1.onBackPressed()
            r1 = 0
            X.C64963Ll2.A02(r4, r1)
            goto L_0x09ea
        L_0x09fb:
            r0 = 1052417374(0x3eba9d5e, float:0.36448187)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Ll2 r5 = (X.C64963Ll2) r5
            boolean r1 = r5.A02
            if (r1 != 0) goto L_0x0a3e
            java.lang.String r2 = X.C64963Ll2.A00(r5)
            if (r2 == 0) goto L_0x0a43
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0a43
            java.lang.String r4 = X.LIL.A01(r2)
            X.0qQ.A07(r4)
            X.1O8 r1 = r5.A00
            if (r1 == 0) goto L_0x0a24
            r1.A00()
        L_0x0a24:
            X.1O8 r1 = new X.1O8
            r1.<init>()
            r5.A00 = r1
            com.instagram.common.session.UserSession r2 = r5.A06
            X.1O9 r1 = r1.A00
            X.1OC r3 = X.1NP.A00(r1, r2, r4)
            r2 = 2
            X.Ufe r1 = new X.Ufe
            r1.<init>(r4, r5, r2)
            r3.A00 = r1
            X.1ES.A03(r3)
        L_0x0a3e:
            r1 = 108550817(0x6785aa1, float:4.67102E-35)
            goto L_0x0d5c
        L_0x0a43:
            X.8MT r1 = r5.A07
            X.8ME r1 = (X.AnonymousClass8ME) r1
            r1.onBackPressed()
            r1 = 0
            X.C64963Ll2.A02(r5, r1)
            goto L_0x0a3e
        L_0x0a4f:
            r0 = 1616152227(0x605486a3, float:6.1256427E19)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.LB5 r3 = (X.LB5) r3
            android.view.View r1 = r3.A03
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r1 = r3.A02
            r0 = 0
            r1.setVisibility(r0)
            com.instagram.common.ui.base.IgEditText r0 = r3.A05
            r0.requestFocus()
            r0 = -2001477371(0xffffffff88b3e105, float:-1.08260725E-33)
            goto L_0x0dca
        L_0x0a71:
            r0 = 1181914305(0x467294c1, float:15525.188)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Ll1 r0 = (X.C64962Ll1) r0
            X.8MI r0 = r0.A08
            r0.D7c()
            r0 = 1415766697(0x5462e2a9, float:3.89786134E12)
            goto L_0x0dca
        L_0x0a86:
            r0 = -1362739540(0xffffffffaec63eac, float:-9.01513E-11)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Ll7 r1 = (X.C64968Ll7) r1
            r0 = 1
            X.C64968Ll7.A06(r1, r0, r0)
            r0 = -30128121(0xfffffffffe344807, float:-5.9908757E37)
            goto L_0x0dca
        L_0x0a9a:
            r0 = -40152981(0xfffffffffd9b506b, float:-2.5805987E37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Ll7 r0 = (X.C64968Ll7) r0
            X.C64968Ll7.A03(r0)
            r0 = -1120771762(0xffffffffbd32614e, float:-0.04354983)
            goto L_0x0dca
        L_0x0aad:
            r0 = -969820899(0xffffffffc631b51d, float:-11373.278)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Ll4 r3 = (X.C64965Ll4) r3
            java.lang.Integer r2 = r3.A0D
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            boolean r9 = X.AnonymousClass7TF.A1W(r2, r1)
            X.8N2 r6 = r3.A0S
            android.app.Activity r1 = r3.A0I
            java.lang.ref.WeakReference r5 = X.C51965G9l.A0v(r1)
            X.6oS r1 = X.C318116oQ.A00(r6)
            r7 = 0
            r8 = 5
            X.JTe r4 = new X.JTe
            r4.<init>(r5, r6, r7, r8, r9)
            X.2Q8 r1 = X.JTO.A1E(r4, r1)
            r6.A04 = r1
            if (r9 != 0) goto L_0x0ae0
            X.8MI r1 = r3.A0R
            r1.D7e()
        L_0x0ae0:
            r1 = 1815362456(0x6c343b98, float:8.715523E26)
            goto L_0x0d5c
        L_0x0ae5:
            r0 = -1700265106(0xffffffff9aa8036e, float:-6.948871E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Ll4 r5 = (X.C64965Ll4) r5
            X.L05 r3 = r5.A04
            boolean r1 = r3 instanceof X.KK0
            r10 = 0
            if (r1 == 0) goto L_0x0beb
            X.KK0 r3 = (X.KK0) r3
            if (r3 == 0) goto L_0x0beb
            X.8N2 r11 = r5.A0S
            java.lang.Integer r1 = r5.A0D
            r6 = 1
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r1
            r16 = r6
            android.graphics.Bitmap r4 = r11.A0E(r12, r13, r14, r15, r16)
            if (r4 != 0) goto L_0x0b11
            r1 = 123815920(0x76147f0, float:1.6948259E-34)
            goto L_0x0d5c
        L_0x0b11:
            X.0eM r1 = r5.A0a
            java.lang.Object r1 = r1.getValue()
            long r1 = X.AnonymousClass7TE.A0R(r1)
            float r9 = (float) r1
            X.0eM r1 = r5.A0Z
            java.lang.Object r1 = r1.getValue()
            long r1 = X.AnonymousClass7TE.A0R(r1)
            float r7 = (float) r1
            android.util.SizeF r8 = new android.util.SizeF
            r8.<init>(r9, r7)
            int r1 = X.C56445Hyd.A00
            float r2 = X.JTO.A02(r4)
            float r1 = X.JTO.A01(r4)
            android.util.SizeF r9 = new android.util.SizeF
            r9.<init>(r2, r1)
            float r2 = r9.getWidth()
            float r1 = r8.getWidth()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0bdd
            float r2 = r9.getHeight()
            float r1 = r8.getHeight()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0bdd
            float r7 = r9.getWidth()
            float r1 = r9.getHeight()
            float r7 = r7 / r1
            float r2 = r8.getWidth()
            float r1 = r8.getHeight()
            float r2 = r2 / r1
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0bd3
            float r1 = r8.getHeight()
            float r2 = r7 * r1
            float r1 = r8.getHeight()
        L_0x0b73:
            android.util.SizeF r7 = new android.util.SizeF
            r7.<init>(r2, r1)
        L_0x0b78:
            float r1 = r7.getWidth()
            int r2 = (int) r1
            float r1 = r7.getHeight()
            int r1 = (int) r1
            android.graphics.Bitmap r6 = X.0fO.A00(r4, r2, r1, r6)
            X.0qQ.A07(r6)
            X.C64965Ll4.A03(r5)
            X.8MI r1 = r5.A0R
            X.0Ud r4 = r11.A0I
            java.lang.Object r2 = r4.getValue()
            X.8N5 r2 = (X.AnonymousClass8N5) r2
            X.JvT r2 = r2.A03
            if (r2 == 0) goto L_0x0bd1
            java.lang.String r9 = r2.A05
        L_0x0b9c:
            com.instagram.common.gallery.Medium r8 = r3.A02
            long r13 = r3.A01
            long r15 = r3.A00
            int r11 = r6.getWidth()
            int r12 = r6.getHeight()
            java.lang.Object r2 = r4.getValue()
            X.8N5 r2 = (X.AnonymousClass8N5) r2
            X.JvT r2 = r2.A03
            if (r2 == 0) goto L_0x0bb8
            java.lang.Object r10 = r2.A03
            java.util.List r10 = (java.util.List) r10
        L_0x0bb8:
            java.lang.Object r2 = r4.getValue()
            X.8N5 r2 = (X.AnonymousClass8N5) r2
            android.graphics.Bitmap r7 = r2.A01
            boolean r2 = r3.A03
            X.9bz r5 = new X.9bz
            r17 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r17)
            r1.D7f(r5)
            r1 = 781426636(0x2e939fcc, float:6.713172E-11)
            goto L_0x0d5c
        L_0x0bd1:
            r9 = r10
            goto L_0x0b9c
        L_0x0bd3:
            float r2 = r8.getWidth()
            float r1 = r8.getWidth()
            float r1 = r1 / r7
            goto L_0x0b73
        L_0x0bdd:
            float r2 = r9.getWidth()
            float r1 = r9.getHeight()
            android.util.SizeF r7 = new android.util.SizeF
            r7.<init>(r2, r1)
            goto L_0x0b78
        L_0x0beb:
            r1 = 629403799(0x2583f097, float:2.2887908E-16)
            goto L_0x0d5c
        L_0x0bf0:
            r0 = -1774385886(0xffffffff963d0522, float:-1.5268918E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Ll4 r5 = (X.C64965Ll4) r5
            X.0eM r1 = r5.A0X
            java.lang.Object r4 = r1.getValue()
            X.8aR r4 = (X.C358148aR) r4
            java.lang.Integer r3 = r5.A0T
            X.L05 r1 = r5.A04
            boolean r1 = r1 instanceof X.C61734KJz
            java.lang.Integer r2 = X.JTP.A0j(r1)
            java.lang.Integer r1 = r5.A0D
            X.AnonymousClass7TG.A1N(r3, r2)
            java.lang.String r21 = "manual_selection_redo_button_tapped"
            r20 = 0
            r16 = r4
            r17 = r3
            r18 = r2
            r19 = r1
            X.C358148aR.A00(r16, r17, r18, r19, r20, r21)
            X.8N2 r4 = r5.A0S
            X.LGc r3 = r4.A00
            if (r3 == 0) goto L_0x0c9e
            boolean r1 = r3.A04()
            if (r1 == 0) goto L_0x0c9e
            boolean r1 = r3.A04()
            if (r1 == 0) goto L_0x0c39
            int r1 = r3.A00
            int r1 = r1 + 1
            r3.A00 = r1
        L_0x0c39:
            X.05G r2 = r4.A0H
        L_0x0c3b:
            java.lang.Object r5 = r2.getValue()
            r6 = r5
            X.8N5 r6 = (X.AnonymousClass8N5) r6
            android.graphics.Bitmap r12 = r3.A01()
            android.graphics.Bitmap r13 = r3.A00()
            X.JvT r11 = r6.A03
            r14 = 0
            if (r11 == 0) goto L_0x0c81
            X.0Ud r8 = r4.A0I
            java.lang.Object r1 = r8.getValue()
            X.8N5 r1 = (X.AnonymousClass8N5) r1
            X.JvT r1 = r1.A03
            if (r1 == 0) goto L_0x0ca3
            int r1 = r1.A02
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
        L_0x0c61:
            java.lang.Object r1 = r8.getValue()
            X.8N5 r1 = (X.AnonymousClass8N5) r1
            X.JvT r1 = r1.A03
            if (r1 == 0) goto L_0x0c71
            int r1 = r1.A01
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
        L_0x0c71:
            java.util.List r10 = r3.A03(r7, r14)
            java.lang.String r9 = r11.A05
            java.lang.String r8 = r11.A04
            int r7 = r11.A02
            int r1 = r11.A01
            X.JvT r14 = X.C61029JvT.A00(r9, r8, r10, r7, r1)
        L_0x0c81:
            java.lang.Integer r16 = X.AnonymousClass05K.A0j
            boolean r18 = r3.A05()
            boolean r19 = r3.A04()
            android.graphics.Bitmap r11 = r6.A02
            float[] r1 = r6.A08
            X.8N6 r15 = r6.A04
            X.8N5 r10 = new X.8N5
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r1 = r2.AIY(r5, r10)
            if (r1 == 0) goto L_0x0c3b
        L_0x0c9e:
            r1 = 1562187384(0x5d1d1678, float:7.0746042E17)
            goto L_0x0d5c
        L_0x0ca3:
            r7 = r14
            goto L_0x0c61
        L_0x0ca5:
            r0 = 1741638299(0x67cf4a9b, float:1.9578122E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Ll4 r5 = (X.C64965Ll4) r5
            X.0eM r1 = r5.A0X
            java.lang.Object r4 = r1.getValue()
            X.8aR r4 = (X.C358148aR) r4
            java.lang.Integer r3 = r5.A0T
            X.L05 r1 = r5.A04
            boolean r1 = r1 instanceof X.C61734KJz
            java.lang.Integer r2 = X.JTP.A0j(r1)
            java.lang.Integer r1 = r5.A0D
            X.AnonymousClass7TG.A1N(r3, r2)
            java.lang.String r21 = "manual_selection_undo_button_tapped"
            r20 = 0
            r16 = r4
            r17 = r3
            r18 = r2
            r19 = r1
            X.C358148aR.A00(r16, r17, r18, r19, r20, r21)
            X.8N2 r4 = r5.A0S
            X.LGc r3 = r4.A00
            if (r3 == 0) goto L_0x0d59
            boolean r1 = r3.A05()
            if (r1 == 0) goto L_0x0d59
            boolean r1 = r3.A05()
            if (r1 == 0) goto L_0x0cee
            int r1 = r3.A00
            int r1 = r1 + -1
            r3.A00 = r1
        L_0x0cee:
            X.05G r2 = r4.A0H
        L_0x0cf0:
            java.lang.Object r5 = r2.getValue()
            r6 = r5
            X.8N5 r6 = (X.AnonymousClass8N5) r6
            boolean r1 = r3.A05()
            if (r1 == 0) goto L_0x0d62
            android.graphics.Bitmap r12 = r3.A01()
        L_0x0d01:
            android.graphics.Bitmap r13 = r3.A00()
            X.JvT r11 = r6.A03
            r14 = 0
            if (r11 == 0) goto L_0x0d3c
            X.0Ud r8 = r4.A0I
            java.lang.Object r1 = r8.getValue()
            X.8N5 r1 = (X.AnonymousClass8N5) r1
            X.JvT r1 = r1.A03
            if (r1 == 0) goto L_0x0d60
            int r1 = r1.A02
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
        L_0x0d1c:
            java.lang.Object r1 = r8.getValue()
            X.8N5 r1 = (X.AnonymousClass8N5) r1
            X.JvT r1 = r1.A03
            if (r1 == 0) goto L_0x0d2c
            int r1 = r1.A01
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
        L_0x0d2c:
            java.util.List r10 = r3.A03(r7, r14)
            java.lang.String r9 = r11.A05
            java.lang.String r8 = r11.A04
            int r7 = r11.A02
            int r1 = r11.A01
            X.JvT r14 = X.C61029JvT.A00(r9, r8, r10, r7, r1)
        L_0x0d3c:
            java.lang.Integer r16 = X.AnonymousClass05K.A0j
            boolean r18 = r3.A05()
            boolean r19 = r3.A04()
            android.graphics.Bitmap r11 = r6.A02
            float[] r1 = r6.A08
            X.8N6 r15 = r6.A04
            X.8N5 r10 = new X.8N5
            r17 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r1 = r2.AIY(r5, r10)
            if (r1 == 0) goto L_0x0cf0
        L_0x0d59:
            r1 = -32107636(0xfffffffffe16138c, float:-4.9871423E37)
        L_0x0d5c:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0d60:
            r7 = r14
            goto L_0x0d1c
        L_0x0d62:
            android.graphics.Bitmap r12 = r3.A02
            goto L_0x0d01
        L_0x0d65:
            r0 = 35255863(0x219f637, float:1.1311325E-37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Ll4 r0 = (X.C64965Ll4) r0
            X.8MI r0 = r0.A0R
            r0.D7c()
            r0 = 1327881255(0x4f25dc27, float:2.78266854E9)
            goto L_0x0dca
        L_0x0d79:
            r0 = -440261107(0xffffffffe5c2260d, float:-1.1460513E23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.JyC r0 = (X.C61160JyC) r0
            X.0sP r1 = r0.A02
            java.lang.String r0 = r0.A01
            r1.invoke(r0)
            r0 = 842283174(0x323438a6, float:1.0490259E-8)
            goto L_0x0dca
        L_0x0d8f:
            r0 = 2027226102(0x78d503f6, float:3.4563737E34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Jy4 r0 = (X.Jy4) r0
            X.0sa r0 = r0.A00
            r0.invoke()
            r0 = 730432791(0x2b898517, float:9.771375E-13)
            goto L_0x0dca
        L_0x0da3:
            r0 = -615257029(0xffffffffdb53ec3b, float:-5.9650958E16)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.KGV r0 = (X.KGV) r0
            X.0sa r0 = r0.A00
            r0.invoke()
            r0 = 1353800602(0x50b15b9a, float:2.38045635E10)
            goto L_0x0dca
        L_0x0db7:
            r0 = 1212734718(0x4848dcfe, float:205683.97)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Ll3 r0 = (X.C64964Ll3) r0
            X.8MK r0 = r0.A0M
            r0.Cur()
            r0 = 1951540655(0x745225af, float:6.6598307E31)
        L_0x0dca:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LY0.onClick(android.view.View):void");
    }
}
