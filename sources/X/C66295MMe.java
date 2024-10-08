package X;

import android.content.res.Resources;

/* renamed from: X.MMe  reason: case insensitive filesystem */
public final class C66295MMe extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66295MMe(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C66295MMe(obj, i));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0282: MOVE  (r1v37 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r1v36 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x04b3;
                case 1: goto L_0x04ac;
                case 2: goto L_0x0483;
                case 3: goto L_0x0477;
                case 4: goto L_0x045c;
                case 5: goto L_0x0450;
                case 6: goto L_0x043e;
                case 7: goto L_0x0432;
                case 8: goto L_0x0426;
                case 9: goto L_0x040d;
                case 10: goto L_0x0405;
                case 11: goto L_0x03ff;
                case 12: goto L_0x03ff;
                case 13: goto L_0x03d8;
                case 14: goto L_0x03ac;
                case 15: goto L_0x037a;
                case 16: goto L_0x035a;
                case 17: goto L_0x034a;
                case 18: goto L_0x0321;
                case 19: goto L_0x02f8;
                case 20: goto L_0x02ef;
                case 21: goto L_0x02e6;
                case 22: goto L_0x0477;
                case 23: goto L_0x02dc;
                case 24: goto L_0x04ba;
                case 25: goto L_0x04b3;
                case 26: goto L_0x04ac;
                case 27: goto L_0x02cc;
                case 28: goto L_0x02b3;
                case 29: goto L_0x01ad;
                case 30: goto L_0x01a4;
                case 31: goto L_0x0192;
                case 32: goto L_0x0177;
                case 33: goto L_0x0162;
                case 34: goto L_0x014e;
                case 35: goto L_0x0146;
                case 36: goto L_0x012e;
                case 37: goto L_0x011a;
                case 38: goto L_0x0111;
                case 39: goto L_0x010a;
                case 40: goto L_0x0101;
                case 41: goto L_0x00b4;
                case 42: goto L_0x0058;
                case 43: goto L_0x0005;
                case 44: goto L_0x004c;
                case 45: goto L_0x0040;
                case 46: goto L_0x0029;
                case 47: goto L_0x001d;
                case 48: goto L_0x000e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            X.07f r8 = r0.getViewModelStore()
            return r8
        L_0x000e:
            java.lang.Object r0 = r15.A01
            X.Jc0 r0 = (X.C59936Jc0) r0
            X.0eM r0 = r0.A03
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r1 = 2131440048(0x7f0b31b0, float:1.8502068E38)
            goto L_0x019f
        L_0x001d:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131440047(0x7f0b31af, float:1.8502066E38)
            android.view.View r8 = X.DbY.A0F(r1, r0)
            return r8
        L_0x0029:
            java.lang.Object r0 = r15.A01
            X.Jc0 r0 = (X.C59936Jc0) r0
            r3 = 750(0x2ee, float:1.051E-42)
            X.MBk r2 = new X.MBk
            r2.<init>(r0)
            X.MBj r1 = new X.MBj
            r1.<init>(r0)
            r0 = 4
            X.8JB r8 = new X.8JB
            r8.<init>(r1, r2, r0, r3)
            return r8
        L_0x0040:
            java.lang.Object r0 = r15.A01
            X.Jc1 r0 = (X.C59937Jc1) r0
            com.instagram.common.session.UserSession r0 = r0.A07
            X.9W0 r8 = new X.9W0
            r8.<init>(r0)
            return r8
        L_0x004c:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131440072(0x7f0b31c8, float:1.8502117E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r1, r0)
            return r8
        L_0x0058:
            java.lang.Object r3 = r15.A01
            X.Jc1 r3 = (X.C59937Jc1) r3
            X.Jc2 r2 = r3.A08
            X.7l2 r5 = r2.A06
            X.7l1 r0 = r5.A0H
            android.view.SurfaceView r0 = r0.A00
            if (r0 == 0) goto L_0x008d
            r0 = 1
            r2.A01 = r0
            int r4 = r2.A03
            r1 = 12
            X.K04 r0 = new X.K04
            r0.<init>(r2, r1)
            r5.A0L(r0, r4, r4)
        L_0x0075:
            X.7l2 r0 = r3.A06
            X.7l1 r0 = r0.A0H
            android.view.View r1 = r0.A00()
            r0 = 4
            r1.setVisibility(r0)
            r1 = 41
            X.MMe r0 = new X.MMe
            r0.<init>(r3, r1)
            r2.A01(r0)
            goto L_0x0474
        L_0x008d:
            android.view.View r0 = r2.A05
            int r1 = r0.getMeasuredWidth()
            int r0 = r0.getMeasuredHeight()
            android.graphics.Bitmap r1 = r5.A0A(r1, r0)
            boolean r0 = X.AnonymousClass7TF.A1V(r1)
            r2.A02 = r0
            if (r1 == 0) goto L_0x00a6
            X.C59938Jc2.A00(r1, r2)
        L_0x00a6:
            X.0eM r0 = r2.A09
            java.lang.Object r1 = X.AnonymousClass7TE.A14(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0075
        L_0x00b4:
            java.lang.Object r2 = r15.A01
            X.Jc1 r2 = (X.C59937Jc1) r2
            X.80U r1 = r2.A0B
            X.80V r0 = X.AnonymousClass80V.ROLL_CALL_SEQUENTIAL_CAPTURE
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x0474
            X.Jc0 r3 = r2.A09
            X.0eM r0 = r3.A03
            android.view.View r2 = X.AnonymousClass7TH.A06(r0)
            r0 = 0
            r2.setVisibility(r0)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r3.A01
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            X.JTQ.A0w(r2, r1, r0)
            X.0eM r4 = r3.A02
            java.lang.Object r3 = r4.getValue()
            X.8JB r3 = (X.AnonymousClass8JB) r3
            r2 = 4
            android.os.Handler r1 = r3.A02
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            r3.A01 = r2
            java.lang.Object r0 = r4.getValue()
            X.8JB r0 = (X.AnonymousClass8JB) r0
            android.os.Handler r1 = r0.A02
            android.os.Message r0 = android.os.Message.obtain()
            r1.sendMessage(r0)
            goto L_0x0474
        L_0x0101:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131440053(0x7f0b31b5, float:1.8502079E38)
            goto L_0x0439
        L_0x010a:
            java.lang.Object r0 = r15.A01
            X.Jc1 r0 = (X.C59937Jc1) r0
            X.0eM r0 = r0.A0G
            goto L_0x0120
        L_0x0111:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131440052(0x7f0b31b4, float:1.8502076E38)
            goto L_0x0439
        L_0x011a:
            java.lang.Object r0 = r15.A01
            X.Jc1 r0 = (X.C59937Jc1) r0
            X.0eM r0 = r0.A0E
        L_0x0120:
            android.view.View r8 = X.AnonymousClass7TG.A0Q(r0)
            r0 = 10
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r8, r0)
            return r8
        L_0x012e:
            java.lang.Object r2 = r15.A01
            X.Jc1 r2 = (X.C59937Jc1) r2
            X.80U r1 = r2.A0B
            X.80V r0 = X.AnonymousClass80V.ROLL_CALL_SEQUENTIAL_CAPTURE
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x0474
            r0 = 0
            r2.A00 = r0
            java.lang.Runnable r0 = r2.A0C
            r0.run()
            goto L_0x0474
        L_0x0146:
            java.lang.Object r0 = r15.A01
            android.view.View r0 = (android.view.View) r0
            r1 = 2131440051(0x7f0b31b3, float:1.8502074E38)
            goto L_0x019f
        L_0x014e:
            java.lang.Object r0 = r15.A01
            X.Jc2 r0 = (X.C59938Jc2) r0
            X.0eM r0 = r0.A0A
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            r1 = 2131440050(0x7f0b31b2, float:1.8502072E38)
            goto L_0x019f
        L_0x0162:
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            java.lang.Object r0 = r15.A01
            X.Jc2 r0 = (X.C59938Jc2) r0
            X.0eM r0 = r0.A07
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            android.animation.Animator r0 = (android.animation.Animator) r0
            r8.play(r0)
            return r8
        L_0x0177:
            float[] r0 = X.C51965G9l.A1b()
            r0 = {0, 1127481344} // fill-array
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofFloat(r0)
            java.lang.Object r2 = r15.A01
            r0 = 400(0x190, double:1.976E-321)
            r8.setDuration(r0)
            r0 = 0
            r8.setRepeatCount(r0)
            r0 = 6
            X.C64205LTv.A01(r8, r2, r0)
            return r8
        L_0x0192:
            java.lang.Object r0 = r15.A01
            X.L91 r0 = (X.L91) r0
            X.0eM r0 = r0.A00
            android.view.View r0 = X.AnonymousClass7TG.A0Q(r0)
            r1 = 2131433543(0x7f0b1847, float:1.8488875E38)
        L_0x019f:
            android.view.View r8 = r0.requireViewById(r1)
            return r8
        L_0x01a4:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131433544(0x7f0b1848, float:1.8488877E38)
            goto L_0x0439
        L_0x01ad:
            java.lang.Object r2 = r15.A01
            X.K7n r2 = (X.C61438K7n) r2
            r1 = 0
            X.C61438K7n.A06(r2, r1)
            X.LxB r9 = r2.A04
            if (r9 != 0) goto L_0x01c1
            X.JTO.A1K()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01c1:
            java.lang.String r0 = r2.A06
            boolean r11 = X.AnonymousClass7TF.A1V(r0)
            X.8BA r0 = r2.A00
            if (r0 == 0) goto L_0x01d1
            boolean r0 = X.AnonymousClass8BA.A0L(r0)
            r1 = r0 ^ 1
        L_0x01d1:
            X.8BA r0 = r2.A00
            if (r0 == 0) goto L_0x028e
            java.util.HashMap r3 = r0.A0W()
        L_0x01d9:
            X.K7n r8 = r9.A05
            android.content.Context r6 = r8.getContext()
            if (r6 == 0) goto L_0x0474
            if (r11 != 0) goto L_0x01e8
            com.instagram.common.session.UserSession r0 = r9.A02
            X.LT8.A06(r0)
        L_0x01e8:
            com.instagram.common.session.UserSession r7 = r9.A02
            r5 = 0
            android.os.Bundle r2 = X.DbY.A09(r7)
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r4 = r9.A03
            r0 = 59
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putParcelable(r0, r4)
            com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r4 = r9.A04
            r0 = 223(0xdf, float:3.12E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putParcelable(r0, r4)
            com.instagram.archive.intf.ArchivePendingUpload r4 = r9.A01
            r0 = 135(0x87, float:1.89E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putParcelable(r0, r4)
            com.instagram.pendingmedia.model.UserStoryTarget r0 = r8.A07()
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1D(r0)
            java.lang.String r0 = "bundle_extra_user_story_targets"
            r2.putParcelableArrayList(r0, r4)
            r4 = 1
            r0 = 28
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.putBoolean(r0, r4)
            boolean r0 = r9.A08
            if (r0 != 0) goto L_0x0232
            r10 = 1
            if (r11 == 0) goto L_0x0233
        L_0x0232:
            r10 = 0
        L_0x0233:
            r0 = 436(0x1b4, float:6.11E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r10)
            r0 = 435(0x1b3, float:6.1E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r4)
            r0 = 222(0xde, float:3.11E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r1)
            X.8it r0 = r9.A06
            boolean r1 = r0.A06()
            r0 = 25
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r1)
            r1 = 1058642330(0x3f19999a, float:0.6)
            java.lang.String r0 = "DirectPrivateStoryRecipientFragment.DIRECT_BOTTOM_SHEET_LAYOUT_HEIGHT_RATIO"
            r2.putFloat(r0, r1)
            java.lang.String r0 = "DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHOW_BOTTOM_SHEET_DRAG_HANDLE"
            r2.putBoolean(r0, r5)
            java.lang.String r0 = "DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_FORCE_SHOW_DONE_BUTTON"
            r2.putBoolean(r0, r4)
            java.lang.String r0 = "DirectPrivateStoryRecipientFragment.DIRECT_PINNED_ELEMENTS_AND_COUNT"
            r2.putSerializable(r0, r3)
            X.K6L r3 = new X.K6L
            r3.<init>()
            r3.setArguments(r2)
            androidx.fragment.app.Fragment r1 = r8.mParentFragment
            boolean r0 = r1 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x02ae
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r1 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r1
            if (r1 == 0) goto L_0x02ae
            X.7Pu r2 = r1.A02
            if (r2 == 0) goto L_0x02ae
            r2.A05()
            goto L_0x0294
        L_0x028e:
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            goto L_0x01d9
        L_0x0294:
            X.7Pr r1 = X.DbS.A0W(r7)     // Catch:{ IllegalArgumentException -> 0x02a8 }
            r0 = 2131952922(0x7f13051a, float:1.95423E38)
            java.lang.CharSequence r0 = r6.getText(r0)     // Catch:{ IllegalArgumentException -> 0x02a8 }
            r1.A0d = r0     // Catch:{ IllegalArgumentException -> 0x02a8 }
            r1.A0T = r3     // Catch:{ IllegalArgumentException -> 0x02a8 }
            r2.A0G(r3, r1, r5, r4)     // Catch:{ IllegalArgumentException -> 0x02a8 }
            goto L_0x0474
        L_0x02a8:
            r0 = 0
            r2.A0L(r0)
            goto L_0x0474
        L_0x02ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02b3:
            java.lang.Object r0 = r15.A01
            X.K7n r0 = (X.C61438K7n) r0
            X.8BA r0 = r0.A00
            if (r0 == 0) goto L_0x02ca
            X.0eK r0 = r0.A1v
            java.lang.Object r0 = r0.get()
            X.8Wi r0 = (X.C357068Wi) r0
            if (r0 == 0) goto L_0x02ca
            android.graphics.Bitmap r8 = r0.A05()
            return r8
        L_0x02ca:
            r8 = 0
            return r8
        L_0x02cc:
            java.lang.Object r0 = r15.A01
            X.K7Z r0 = (X.K7Z) r0
            X.0eM r0 = r0.A06
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBQ r8 = new X.KBQ
            r8.<init>(r0)
            return r8
        L_0x02dc:
            java.lang.Object r0 = r15.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.KKo r8 = new X.KKo
            r8.<init>(r0)
            return r8
        L_0x02e6:
            java.lang.Object r1 = r15.A01
            r0 = 3
            X.Lez r8 = new X.Lez
            r8.<init>(r1, r0)
            return r8
        L_0x02ef:
            java.lang.Object r1 = r15.A01
            r0 = 2
            X.Lez r8 = new X.Lez
            r8.<init>(r1, r0)
            return r8
        L_0x02f8:
            java.lang.Object r2 = r15.A01
            X.Jd2 r2 = (X.C59993Jd2) r2
            android.content.Context r1 = r2.A0D
            int r0 = r2.A06
            X.6Ly r8 = X.AnonymousClass7TE.A0s(r1, r0)
            X.82m r0 = r2.A0F
            java.lang.String r0 = r0.A05
            r8.A0M(r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            A01(r1, r2, r8, r0)
            java.lang.String r0 = "…"
            r1 = 1
            r8.A0N(r0, r1, r1)
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            r8.A0J(r0, r1)
            return r8
        L_0x0321:
            java.lang.Object r2 = r15.A01
            X.Jd2 r2 = (X.C59993Jd2) r2
            android.content.Context r1 = r2.A0D
            int r0 = r2.A06
            X.6Ly r8 = X.AnonymousClass7TE.A0s(r1, r0)
            X.82m r0 = r2.A0F
            java.lang.String r0 = r0.A04
            r8.A0M(r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
            A01(r1, r2, r8, r0)
            java.lang.String r0 = "…"
            r1 = 1
            r8.A0N(r0, r1, r1)
            android.graphics.Typeface r0 = android.graphics.Typeface.SANS_SERIF
            r8.A0J(r0, r1)
            return r8
        L_0x034a:
            java.lang.Object r0 = r15.A01
            X.Jd2 r0 = (X.C59993Jd2) r0
            android.content.Context r2 = r0.A0D
            r1 = 2131238735(0x7f081f4f, float:1.8093757E38)
            int r0 = r0.A08
            android.graphics.drawable.Drawable r8 = X.AnonymousClass3JT.A05(r2, r1, r0)
            return r8
        L_0x035a:
            java.lang.Object r2 = r15.A01
            X.Jd2 r2 = (X.C59993Jd2) r2
            int r11 = r2.A09
            android.content.Context r1 = r2.A0D
            int r12 = X.AnonymousClass7TG.A04(r1)
            r0 = 2130970259(0x7f040693, float:1.7549223E38)
            int r13 = X.AnonymousClass7TF.A03(r1, r0)
            X.82m r0 = r2.A0F
            com.instagram.common.typedurl.ImageUrl r9 = r0.A01
            r14 = 0
            java.lang.String r10 = "public_collections_story"
            X.3ay r8 = new X.3ay
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x037a:
            java.lang.Object r5 = r15.A01
            X.Jd2 r5 = (X.C59993Jd2) r5
            android.content.Context r4 = r5.A0D
            android.content.res.Resources r3 = r4.getResources()
            r1 = 2131820948(0x7f110194, float:1.9274625E38)
            X.82m r0 = r5.A0F
            int r0 = r0.A00
            r2 = 1
            java.lang.String r1 = X.DbY.A0d(r3, r0, r1)
            X.0qQ.A07(r1)
            int r0 = r5.A06
            X.6Ly r8 = X.AnonymousClass7TE.A0s(r4, r0)
            r8.A0M(r1)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            A01(r1, r5, r8, r0)
            java.lang.String r0 = "…"
            r8.A0N(r0, r2, r2)
            return r8
        L_0x03ac:
            android.graphics.Paint r8 = X.JTO.A0C()
            java.lang.Object r3 = r15.A01
            X.Jd2 r3 = (X.C59993Jd2) r3
            int r0 = r3.A00
            float r4 = (float) r0
            android.content.Context r1 = r3.A0D
            r0 = 140(0x8c, float:1.96E-43)
            float r0 = X.0nA.A04(r1, r0)
            float r4 = r4 + r0
            int r2 = r3.A07
            r1 = 0
            int r0 = r3.A0A
            int[] r5 = new int[]{r2, r1, r1, r0}
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.CLAMP
            r1 = 0
            r6 = 0
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.setShader(r0)
            return r8
        L_0x03d8:
            java.lang.Object r0 = r15.A01
            X.Jd2 r0 = (X.C59993Jd2) r0
            android.graphics.Bitmap r2 = r0.A0E
            int r4 = r2.getWidth()
            int r5 = r2.getHeight()
            int r6 = r0.A01
            int r7 = r0.A00
            r8 = 0
            boolean r0 = X.1MF.A02
            android.graphics.Matrix r3 = X.AnonymousClass7TE.A0U()
            r9 = r8
            X.1MF.A0J(r3, r4, r5, r6, r7, r8, r9)
            r1 = 15
            r0 = 1103101952(0x41c00000, float:24.0)
            X.Jcu r8 = new X.Jcu
            r8.<init>(r2, r3, r0, r1)
            return r8
        L_0x03ff:
            java.lang.Object r0 = r15.A01
            X.DbS.A1U(r0)
            goto L_0x0474
        L_0x0405:
            java.lang.Object r0 = r15.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbZ.A15(r0)
            goto L_0x0474
        L_0x040d:
            java.lang.Object r0 = r15.A01
            X.K3q r0 = (X.C61348K3q) r0
            X.DbZ.A15(r0)
            X.1Y8 r2 = X.C55115HcO.A00()
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            r2.A04(r1, r0)
            goto L_0x0474
        L_0x0426:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131438765(0x7f0b2cad, float:1.8499466E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r1, r0)
            return r8
        L_0x0432:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131438774(0x7f0b2cb6, float:1.8499484E38)
        L_0x0439:
            X.3oV r8 = X.DbU.A0Z(r1, r0)
            return r8
        L_0x043e:
            java.lang.Object r0 = r15.A01
            X.LmT r0 = (X.C65049LmT) r0
            X.0eM r0 = r0.A0Q
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131438772(0x7f0b2cb4, float:1.849948E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r1, r0)
            return r8
        L_0x0450:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131436546(0x7f0b2402, float:1.8494965E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r1, r0)
            return r8
        L_0x045c:
            java.lang.Object r3 = r15.A01
            X.LmT r3 = (X.C65049LmT) r3
            int r0 = r3.A00
            int r2 = r0 + 1
            java.util.List r1 = r3.A0L
            int r0 = r1.size()
            int r2 = r2 % r0
            r3.A00 = r2
            int r0 = X.C51971G9r.A0I(r1, r2)
            X.C65049LmT.A00(r3, r0)
        L_0x0474:
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x0477:
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131442628(0x7f0b3bc4, float:1.8507301E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r1, r0)
            return r8
        L_0x0483:
            java.lang.Object r3 = r15.A01
            X.K4N r3 = (X.K4N) r3
            android.os.Bundle r2 = r3.requireArguments()
            java.lang.String r1 = "arg_potato_capture_photo_path"
            java.lang.String r0 = ""
            java.lang.String r2 = r2.getString(r1, r0)
            X.0qQ.A07(r2)
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "arg_potato_media_id"
            java.lang.String r1 = r1.getString(r0)
            X.0eM r0 = r3.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KDK r8 = new X.KDK
            r8.<init>(r0, r2, r1)
            return r8
        L_0x04ac:
            java.lang.Object r0 = r15.A01
            X.07f r8 = X.DbY.A0I(r0)
            return r8
        L_0x04b3:
            java.lang.Object r0 = r15.A01
            java.lang.Object r8 = X.DbT.A0r(r0)
            return r8
        L_0x04ba:
            java.lang.Object r8 = r15.A01
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66295MMe.invoke():java.lang.Object");
    }

    public static void A01(Resources resources, C59993Jd2 jd2, C306386Ly r3, int i) {
        r3.A0A(resources.getDimension(i));
        r3.A0F(jd2.A0B);
        r3.A0D(5.0f, 0.0f, 0.0f, jd2.A0C);
    }
}
