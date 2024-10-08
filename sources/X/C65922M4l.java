package X;

/* renamed from: X.M4l  reason: case insensitive filesystem */
public final class C65922M4l implements Runnable {
    public final /* synthetic */ K7b A00;

    public C65922M4l(K7b k7b) {
        this.A00 = k7b;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x011c: MOVE  (r4v20 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r4v19 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02fb  */
    public final void run() {
        /*
            r34 = this;
            r0 = r34
            X.K7b r0 = r0.A00
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            if (r1 == 0) goto L_0x0168
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L_0x0168
            r10 = 2
            android.view.View r1 = r0.requireView()
            int r5 = r1.getHeight()
            X.JuR r3 = r0.A03
            java.lang.String r12 = "response"
            r33 = r12
            if (r3 == 0) goto L_0x0395
            X.MWS r1 = r3.A05
            X.JxX r1 = (X.C61121JxX) r1
            com.instagram.user.model.User r1 = r1.A00
            r2 = 0
            if (r1 != 0) goto L_0x0384
            X.MWR r1 = r3.A03
            if (r1 != 0) goto L_0x0384
            r9 = 0
        L_0x002f:
            X.JuR r3 = r0.A03
            if (r3 == 0) goto L_0x0395
            com.instagram.api.schemas.StoryPromptDisablementState r1 = r3.A04
            com.instagram.api.schemas.StoryPromptDisablementState r6 = com.instagram.api.schemas.StoryPromptDisablementState.ENABLED
            if (r1 == r6) goto L_0x02da
            r1 = 2131165258(0x7f07004a, float:1.7944728E38)
            int r3 = X.Dbb.A07(r0, r1)
            int r3 = r3 + r9
        L_0x0041:
            r2 = 1
            android.animation.ValueAnimator r1 = X.JTQ.A05(r5, r3)
            r3 = 250(0xfa, double:1.235E-321)
            android.animation.ValueAnimator r3 = r1.setDuration(r3)
            r1 = 13
            X.C64205LTv.A01(r3, r0, r1)
            X.Kb2 r1 = new X.Kb2
            r1.<init>(r0, r2)
            r3.addListener(r1)
            r3.start()
            android.view.View r3 = r0.requireView()
            r1 = 2131441592(0x7f0b37b8, float:1.85052E38)
            X.DbX.A1B(r3, r1)
            X.JuR r3 = r0.A03
            r7 = 0
            if (r3 == 0) goto L_0x0395
            X.MWS r1 = r3.A05
            X.JxX r1 = (X.C61121JxX) r1
            com.instagram.user.model.User r9 = r1.A00
            X.MWR r8 = r3.A03
            r1 = 0
            if (r9 == 0) goto L_0x02ba
            java.lang.String r5 = r9.getUsername()
            r4 = 2131970893(0x7f134b4d, float:1.957875E38)
            java.lang.String r3 = r9.getUsername()
            android.text.SpannableStringBuilder r7 = X.DbY.A0E(r0, r3, r4)
            X.JdP r3 = new X.JdP
            r3.<init>(r2, r9, r0)
        L_0x008a:
            X.AnonymousClass7AV.A05(r7, r3, r5)
        L_0x008d:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
        L_0x008f:
            android.view.View r4 = r0.requireView()
            r3 = 2131438767(0x7f0b2caf, float:1.849947E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r4, r3)
            android.view.View r4 = r0.requireView()
            r3 = 2131431953(0x7f0b1211, float:1.848565E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r4, r3)
            if (r7 == 0) goto L_0x00b0
            X.DbX.A1G(r5, r7)
            r5.setVisibility(r1)
            r3.setVisibility(r1)
        L_0x00b0:
            X.JuR r4 = r0.A03
            r11 = 0
            if (r4 == 0) goto L_0x0399
            com.instagram.api.schemas.StoryPromptDisablementState r3 = r4.A04
            if (r3 == r6) goto L_0x0175
            android.view.View r4 = r0.requireView()
            r3 = 2131438770(0x7f0b2cb2, float:1.8499476E38)
            android.widget.ImageView r5 = X.DbU.A0F(r4, r3)
            android.content.Context r26 = r0.requireContext()
            java.lang.String r4 = r0.A09
            X.0eM r3 = r0.A0C
            java.lang.Object r3 = r3.getValue()
            com.instagram.reels.musicpick.model.MusicPickStickerModel r3 = (com.instagram.reels.musicpick.model.MusicPickStickerModel) r3
            com.instagram.api.schemas.StoryMusicPickTappableData r3 = r3.A00
            java.util.List r3 = r3.A09
            java.lang.String r15 = ""
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            com.instagram.api.schemas.StoryPromptType r12 = com.instagram.api.schemas.StoryPromptType.DEFAULT
            com.instagram.reels.prompt.model.PromptStickerModel r10 = new com.instagram.reels.prompt.model.PromptStickerModel
            r13 = r11
            r16 = r15
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r3
            r21 = r1
            r22 = r1
            r23 = r1
            r24 = r1
            r25 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r32 = 240(0xf0, float:3.36E-43)
            X.7jB r3 = new X.7jB
            r27 = r10
            r28 = r14
            r29 = r4
            r30 = r1
            r31 = r1
            r25 = r3
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r5.setImageDrawable(r3)
            android.view.View r4 = r0.requireView()
            r3 = 2131431872(0x7f0b11c0, float:1.8485485E38)
            X.DbT.A1F(r4, r3, r1)
        L_0x0116:
            androidx.fragment.app.Fragment r4 = r0.mParentFragment
            boolean r3 = r4 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r3 == 0) goto L_0x0168
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r4 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r4
            if (r4 == 0) goto L_0x0168
            X.7Pu r5 = r4.A02
            if (r5 == 0) goto L_0x0168
            X.3uh r4 = r0.A02
            r6 = 1
            if (r4 == 0) goto L_0x0169
            X.0eM r3 = r0.A0G
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r3)
            boolean r3 = r4.A1n(r3)
            if (r3 != r2) goto L_0x0169
        L_0x0135:
            r4 = 0
            if (r6 == 0) goto L_0x015a
            java.lang.String r9 = ""
            X.7Ps r6 = new X.7Ps
            r7 = r11
            r8 = r11
            r10 = r1
            r11 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r1 = 2131238568(0x7f081ea8, float:1.8093418E38)
            r6.A02 = r1
            r3 = 28
            X.FP2 r1 = new X.FP2
            r1.<init>((java.lang.Object) r0, (int) r3)
            r6.A05 = r1
            r6.A0A = r2
            X.7Pt r1 = r6.A00()
            r5.A0K(r1, r2)
        L_0x015a:
            X.JuR r0 = r0.A03
            if (r0 == 0) goto L_0x0399
            com.instagram.api.schemas.StoryPromptDisablementState r1 = r0.A04
            com.instagram.api.schemas.StoryPromptDisablementState r0 = com.instagram.api.schemas.StoryPromptDisablementState.DISABLED
            if (r1 == r0) goto L_0x0165
            r4 = 1
        L_0x0165:
            r5.A0Q(r4)
        L_0x0168:
            return
        L_0x0169:
            X.JuR r3 = r0.A03
            if (r3 == 0) goto L_0x0399
            com.instagram.api.schemas.MediaPromptPrefType r4 = r3.A00
            com.instagram.api.schemas.MediaPromptPrefType r3 = com.instagram.api.schemas.MediaPromptPrefType.NOT_APPLICABLE
            if (r4 != r3) goto L_0x0135
            r6 = 0
            goto L_0x0135
        L_0x0175:
            java.util.List r3 = r4.A07
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01e2
            boolean r3 = X.K7b.A02(r0)
            if (r3 == 0) goto L_0x01e2
            android.view.View r4 = r0.requireView()
            r3 = 2131438775(0x7f0b2cb7, float:1.8499486E38)
            android.widget.ImageView r5 = X.DbU.A0F(r4, r3)
            android.content.Context r26 = r0.requireContext()
            java.lang.String r4 = r0.A09
            X.0eM r3 = r0.A0C
            java.lang.Object r3 = r3.getValue()
            com.instagram.reels.musicpick.model.MusicPickStickerModel r3 = (com.instagram.reels.musicpick.model.MusicPickStickerModel) r3
            com.instagram.api.schemas.StoryMusicPickTappableData r3 = r3.A00
            java.util.List r3 = r3.A09
            java.lang.String r15 = ""
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            com.instagram.api.schemas.StoryPromptType r12 = com.instagram.api.schemas.StoryPromptType.DEFAULT
            com.instagram.reels.prompt.model.PromptStickerModel r10 = new com.instagram.reels.prompt.model.PromptStickerModel
            r13 = r11
            r16 = r15
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r3
            r21 = r1
            r22 = r1
            r23 = r1
            r24 = r1
            r25 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r32 = 240(0xf0, float:3.36E-43)
            X.7jB r3 = new X.7jB
            r27 = r10
            r28 = r14
            r29 = r4
            r30 = r1
            r31 = r1
            r25 = r3
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r5.setImageDrawable(r3)
            android.view.View r4 = r0.requireView()
            r3 = 2131432364(0x7f0b13ac, float:1.8486483E38)
            X.DbT.A1F(r4, r3, r1)
            goto L_0x0116
        L_0x01e2:
            android.content.Context r4 = r0.requireContext()
            r3 = 3
            com.instagram.reels.prompt.adapter.PromptGridLayoutManager r5 = new com.instagram.reels.prompt.adapter.PromptGridLayoutManager
            r5.<init>(r4, r3)
            r4 = 6
            X.JkE r3 = new X.JkE
            r3.<init>(r0, r4)
            r5.A01 = r3
            android.view.View r4 = r0.requireView()
            r3 = 2131438782(0x7f0b2cbe, float:1.84995E38)
            androidx.recyclerview.widget.RecyclerView r4 = X.DbT.A0I(r4, r3)
            X.0eM r6 = r0.A0A
            X.Dba.A17(r4, r6)
            r4.setLayoutManager(r5)
            r4.setVisibility(r1)
            r0.A01 = r4
            r3 = 9
            X.LrI r15 = new X.LrI
            r15.<init>(r0, r3)
            X.71i r16 = X.C3251771i.A06
            java.lang.String r12 = "recyclerView"
            X.3pI r14 = r4.A0D
            X.71j r13 = new X.71j
            r17 = r1
            r18 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            androidx.recyclerview.widget.RecyclerView r3 = r0.A01
            if (r3 == 0) goto L_0x0395
            r3.A15(r13)
            X.JuR r3 = r0.A03
            r12 = r33
            if (r3 == 0) goto L_0x0395
            java.util.List r3 = r3.A07
            java.util.ArrayList r9 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r10 = r3.iterator()
        L_0x0239:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x026e
            java.lang.Object r3 = r10.next()
            X.MWT r3 = (X.MWT) r3
            X.JxY r3 = (X.C61122JxY) r3
            java.lang.String r8 = r3.A01
            com.instagram.user.model.User r4 = r3.A00
            X.1Nr r7 = new X.1Nr
            r7.<init>(r4)
            X.0eM r5 = r0.A0G
            java.lang.String r3 = X.DbU.A0u(r5)
            boolean r3 = X.DbV.A1Z(r4, r3)
            com.instagram.model.reels.Reel r4 = new com.instagram.model.reels.Reel
            r4.<init>(r7, r8, r3)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.reels.store.ReelStore r3 = com.instagram.reels.store.ReelStore.A03(r3)
            r3.A0X(r4)
            r9.add(r4)
            goto L_0x0239
        L_0x026e:
            java.util.ArrayList r7 = X.00k.A0U(r9)
            X.JuR r3 = r0.A03
            if (r3 == 0) goto L_0x02a9
            X.MWP r8 = r3.A02
            if (r8 == 0) goto L_0x02a9
            r3 = r8
            X.JxU r3 = (X.C61118JxU) r3
            com.instagram.api.schemas.StoryMusicPickAggregationVisibility r4 = r3.A00
            com.instagram.api.schemas.StoryMusicPickAggregationVisibility r3 = com.instagram.api.schemas.StoryMusicPickAggregationVisibility.VISIBLE
            if (r4 != r3) goto L_0x02a9
            java.lang.Object r5 = r6.getValue()
            X.JlZ r5 = (X.C60441JlZ) r5
            X.JxU r8 = (X.C61118JxU) r8
            java.util.List r4 = r8.A01
            X.0qQ.A0B(r4, r1)
            java.util.List r3 = r5.A00
            if (r3 != 0) goto L_0x029a
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            r5.A00 = r3
        L_0x029a:
            java.lang.String r12 = "aggregationItems"
            r3.clear()
            java.util.List r3 = r5.A00
            if (r3 == 0) goto L_0x0395
            r3.addAll(r4)
            r5.notifyDataSetChanged()
        L_0x02a9:
            java.lang.Object r4 = r6.getValue()
            X.JlZ r4 = (X.C60441JlZ) r4
            X.0eM r3 = r0.A0G
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r3)
            r4.Ei9(r7, r1, r3)
            goto L_0x0116
        L_0x02ba:
            if (r8 == 0) goto L_0x008f
            r3 = r8
            X.JxW r3 = (X.C61120JxW) r3
            java.lang.String r5 = r3.A00
            if (r5 == 0) goto L_0x02d6
            java.lang.String r4 = r3.A02
            r3 = 32
            java.lang.String r3 = X.002.A0T(r4, r5, r3)
            android.text.SpannableStringBuilder r7 = X.DbS.A0C(r3)
            X.JdP r3 = new X.JdP
            r3.<init>(r10, r8, r0)
            goto L_0x008a
        L_0x02d6:
            java.lang.String r7 = r3.A02
            goto L_0x008d
        L_0x02da:
            java.util.List r1 = r3.A07
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x034e
            boolean r1 = X.K7b.A02(r0)
            if (r1 == 0) goto L_0x034e
            r1 = 2131165258(0x7f07004a, float:1.7944728E38)
            int r11 = X.Dbb.A07(r0, r1)
            r1 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r1 = X.Dbb.A07(r0, r1)
        L_0x02f6:
            int r11 = r11 + r1
        L_0x02f7:
            X.JuR r1 = r0.A03
            if (r1 == 0) goto L_0x0395
            java.util.List r1 = r1.A07
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x031e
            boolean r1 = X.K7b.A02(r0)
            if (r1 == 0) goto L_0x031e
        L_0x0309:
            int r9 = r9 + r11
            int r9 = r9 + r2
            r2 = 1056964608(0x3f000000, float:0.5)
            android.content.Context r1 = r0.requireContext()
            int r1 = X.0nA.A05(r1)
            float r1 = (float) r1
            float r1 = r1 * r2
            int r1 = (int) r1
            r3 = r9
            if (r9 <= r1) goto L_0x0041
            r3 = r1
            goto L_0x0041
        L_0x031e:
            X.JuR r1 = r0.A03
            if (r1 == 0) goto L_0x0309
            X.MWP r4 = r1.A02
            if (r4 == 0) goto L_0x0309
            X.JxU r4 = (X.C61118JxU) r4
            com.instagram.api.schemas.StoryMusicPickAggregationVisibility r3 = r4.A00
            com.instagram.api.schemas.StoryMusicPickAggregationVisibility r1 = com.instagram.api.schemas.StoryMusicPickAggregationVisibility.VISIBLE
            if (r3 != r1) goto L_0x0309
            java.util.List r1 = r4.A01
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x033e
            r1 = 2131165289(0x7f070069, float:1.794479E38)
            int r2 = X.Dbb.A07(r0, r1)
            goto L_0x0309
        L_0x033e:
            r1 = 2131165352(0x7f0700a8, float:1.7944919E38)
            int r2 = X.Dbb.A07(r0, r1)
            r1 = 2131165193(0x7f070009, float:1.7944596E38)
            int r1 = X.Dbb.A07(r0, r1)
            int r2 = r2 + r1
            goto L_0x0309
        L_0x034e:
            X.JuR r1 = r0.A03
            if (r1 == 0) goto L_0x0395
            java.util.List r1 = r1.A07
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            if (r1 == 0) goto L_0x0381
            r1 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r1 = X.Dbb.A07(r0, r1)
            int r11 = r1 * 2
            X.JuR r1 = r0.A03
            if (r1 == 0) goto L_0x0395
            java.util.List r1 = r1.A07
            int r1 = r1.size()
            double r3 = (double) r1
            r7 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r3 = r3 / r7
            double r7 = java.lang.Math.ceil(r3)
            r1 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r1 = X.Dbb.A07(r0, r1)
            double r3 = (double) r1
            double r7 = r7 * r3
            int r1 = (int) r7
            goto L_0x02f6
        L_0x0381:
            r11 = 0
            goto L_0x02f7
        L_0x0384:
            r1 = 2131165219(0x7f070023, float:1.7944649E38)
            int r9 = X.Dbb.A07(r0, r1)
            r1 = 2131165252(0x7f070044, float:1.7944716E38)
            int r1 = X.Dbb.A07(r0, r1)
            int r9 = r9 + r1
            goto L_0x002f
        L_0x0395:
            X.0qQ.A0F(r12)
            goto L_0x039c
        L_0x0399:
            X.0qQ.A0F(r33)
        L_0x039c:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65922M4l.run():void");
    }
}
