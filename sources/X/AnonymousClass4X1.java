package X;

/* renamed from: X.4X1  reason: invalid class name */
public abstract class AnonymousClass4X1 {
    /* JADX WARNING: type inference failed for: r1v39, types: [X.JZg] */
    /* JADX WARNING: type inference failed for: r1v40, types: [X.KWF] */
    /* JADX WARNING: type inference failed for: r1v41, types: [X.9q0] */
    /* JADX WARNING: type inference failed for: r1v44, types: [X.KWE] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r1 == com.instagram.api.schemas.StoryPromptType.STORY_TEMPLATE) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0161, code lost:
        if (X.C364778lz.A00(r4).booleanValue() != false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e6, code lost:
        if (r1.A0A != false) goto L_0x01e8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r29, X.AnonymousClass3BQ r30, X.C249693kD r31, X.C265964Wz r32, X.AnonymousClass4X0 r33, java.lang.String r34, boolean r35, boolean r36) {
        /*
            r1 = 1
            r3 = r33
            X.0qQ.A0B(r3, r1)
            r15 = r31
            X.1Xj r0 = r15.BPf()
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.A5G()
            if (r0 != r1) goto L_0x0038
            X.3WT r0 = X.AnonymousClass3WT.PROMPT
            java.util.List r0 = r15.Bkd(r0)
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3ui r0 = (X.C255783ui) r0
            if (r0 == 0) goto L_0x0036
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r0.A0F()
            if (r0 == 0) goto L_0x0036
            com.instagram.api.schemas.StoryPromptType r1 = r0.A03()
        L_0x002e:
            com.instagram.api.schemas.StoryPromptType r0 = com.instagram.api.schemas.StoryPromptType.STORY_TEMPLATE
            if (r1 != r0) goto L_0x0038
        L_0x0032:
            r3.A06()
            return
        L_0x0036:
            r1 = 0
            goto L_0x002e
        L_0x0038:
            X.3WT r0 = X.AnonymousClass3WT.PROMPT
            java.util.List r0 = r15.Bkd(r0)
            if (r0 == 0) goto L_0x0032
            java.lang.Object r6 = X.00k.A0J(r0)
            X.3ui r6 = (X.C255783ui) r6
            if (r6 == 0) goto L_0x0032
            r2 = 0
            r5 = 1
            X.3oV r14 = r3.A0G
            boolean r0 = r14.CVM()
            if (r0 != 0) goto L_0x00cb
            android.view.View r1 = r14.getView()
            r0 = 2131438766(0x7f0b2cae, float:1.8499468E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A0B(r0, r2)
            r3.A01 = r0
            r0 = 2131438787(0x7f0b2cc3, float:1.849951E38)
            android.view.View r7 = r1.requireViewById(r0)
            com.instagram.common.ui.base.IgSimpleImageView r7 = (com.instagram.common.ui.base.IgSimpleImageView) r7
            android.content.Context r4 = r7.getContext()
            r0 = 2131970879(0x7f134b3f, float:1.9578722E38)
            java.lang.String r0 = r4.getString(r0)
            r7.setContentDescription(r0)
            r3.A03 = r7
            r0 = 2131438606(0x7f0b2c0e, float:1.8499144E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r2, r2)
            r3.A05 = r0
            r0 = 2131438783(0x7f0b2cbf, float:1.8499503E38)
            android.view.View r0 = r1.requireViewById(r0)
            r3.A00 = r0
            r0 = 2131438763(0x7f0b2cab, float:1.8499462E38)
            android.view.View r7 = r1.requireViewById(r0)
            android.content.Context r4 = r7.getContext()
            r0 = 2131970877(0x7f134b3d, float:1.9578717E38)
            java.lang.String r0 = r4.getString(r0)
            r7.setContentDescription(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.2eS.A04(r7, r0)
            X.3oV r0 = X.2b1.A01(r7, r2, r2)
            r3.A04 = r0
            r0 = 2131438784(0x7f0b2cc0, float:1.8499505E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r2, r2)
            r3.A06 = r0
            r0 = 2131438786(0x7f0b2cc2, float:1.8499509E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r2, r2)
            r3.A07 = r0
        L_0x00cb:
            android.animation.ValueAnimator r0 = r3.A0D
            r0.cancel()
            r0.removeAllUpdateListeners()
            android.animation.ValueAnimator r0 = r3.A0E
            r0.cancel()
            r0.removeAllUpdateListeners()
            X.Gcp r0 = r3.A02
            if (r0 == 0) goto L_0x00e2
            r0.A01()
        L_0x00e2:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r6.A0F()
            if (r0 == 0) goto L_0x053c
            r3.A0B = r0
            java.lang.String r19 = "model"
            int r28 = r0.A00()
            java.util.Map r8 = r3.A0H
            com.instagram.reels.prompt.model.PromptStickerModel r7 = r3.A0B
            if (r7 == 0) goto L_0x0537
            java.lang.Object r1 = r8.get(r7)
            r4 = r29
            if (r1 != 0) goto L_0x011f
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r3.A0B
            if (r1 == 0) goto L_0x0537
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x04c0
            android.view.View r0 = r3.A05()
            android.content.Context r9 = r0.getContext()
            X.0qQ.A07(r9)
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0B
            if (r0 == 0) goto L_0x0537
            X.KWE r1 = new X.KWE
            r1.<init>(r9, r4, r0)
        L_0x011a:
            X.8Nl r1 = (X.C354808Nl) r1
            r8.put(r7, r1)
        L_0x011f:
            X.8Nl r1 = (X.C354808Nl) r1
            r0 = 1050253722(0x3e99999a, float:0.3)
            r1.EVv(r0)
            r3.A0A = r1
            r0 = r30
            r3.A09 = r0
            android.view.View r1 = r3.A05()
            X.8Nl r0 = r3.A0A
            java.lang.String r18 = "sticker"
            if (r0 == 0) goto L_0x04bb
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            int r0 = r0.getIntrinsicWidth()
            X.0nA.A0f(r1, r0)
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0B
            if (r0 == 0) goto L_0x0537
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x0163
            X.0Tu r7 = X.0Tu.A05
            r0 = 36319918495768327(0x8108c600361f07, double:3.03220093307239E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 != 0) goto L_0x0163
            java.lang.Boolean r0 = X.C364778lz.A00(r4)
            boolean r0 = r0.booleanValue()
            r26 = 1
            if (r0 == 0) goto L_0x0165
        L_0x0163:
            r26 = 0
        L_0x0165:
            com.instagram.common.ui.base.IgSimpleImageView r1 = r3.A03
            if (r1 != 0) goto L_0x0173
            java.lang.String r17 = "stickerView"
        L_0x016b:
            X.0qQ.A0F(r17)
        L_0x016e:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0173:
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r1.setImageDrawable(r0)
            X.9Ui r0 = new X.9Ui
            r24 = r32
            r7 = r0
            r8 = r6
            r9 = r15
            r10 = r24
            r11 = r3
            r12 = r26
            r7.<init>(r8, r9, r10, r11, r12)
            X.AnonymousClass0fU.A00(r0, r1)
            X.3oV r0 = r3.A04
            java.lang.String r17 = "buttonViewStubber"
            if (r0 == 0) goto L_0x016b
            android.view.View r1 = r0.getView()
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            java.lang.Integer r0 = r0.Ail()
            if (r0 == 0) goto L_0x04aa
            int r0 = r0.intValue()
        L_0x01a6:
            X.0nA.A0V(r1, r0)
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            java.lang.Integer r0 = r0.Aiy()
            if (r0 == 0) goto L_0x049e
            int r0 = r0.intValue()
        L_0x01b7:
            X.0nA.A0f(r1, r0)
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r0.BTZ()
            int r0 = r0.A01
            r1 = 0
            if (r0 == 0) goto L_0x01c8
            r1 = 1
        L_0x01c8:
            X.3oV r0 = r3.A04
            if (r1 != 0) goto L_0x0493
            if (r0 == 0) goto L_0x016b
            android.view.View r7 = r0.getView()
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r3.A0B
            if (r1 == 0) goto L_0x0537
            boolean r0 = r1.A0G()
            if (r0 != 0) goto L_0x01e8
            boolean r0 = r1.A0M()
            if (r0 != 0) goto L_0x01e8
            boolean r1 = r1.A0A
            r0 = 80
            if (r1 == 0) goto L_0x01eb
        L_0x01e8:
            r0 = 8388613(0x800005, float:1.175495E-38)
        L_0x01eb:
            X.0nA.A0W(r7, r0)
            android.view.View r0 = r14.getView()
            android.view.ViewGroup r12 = X.C3019160o.A01(r0)
            com.instagram.reels.prompt.model.PromptStickerModel r8 = r3.A0B
            if (r8 == 0) goto L_0x0537
            X.3oV r0 = r3.A04
            if (r0 == 0) goto L_0x016b
            android.view.View r13 = r0.getView()
            X.5Gv r0 = r3.A08
            if (r0 != 0) goto L_0x027d
            r9 = 2
            int[] r1 = new int[r9]
            X.3oV r0 = r3.A04
            if (r0 == 0) goto L_0x016b
            android.view.View r0 = r0.getView()
            r0.getLocationInWindow(r1)
            android.content.Context r0 = r3.A0F
            android.content.res.Resources r10 = r0.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r16 = r10.getDimensionPixelSize(r0)
            r11 = r1[r2]
            X.3oV r0 = r3.A04
            if (r0 == 0) goto L_0x016b
            android.view.View r0 = r0.getView()
            int r0 = r0.getWidth()
            int r0 = r0 / r9
            int r11 = r11 + r0
            r10 = r1[r5]
            X.3oV r0 = r3.A04
            if (r0 == 0) goto L_0x016b
            android.view.View r0 = r0.getView()
            int r0 = r0.getHeight()
            int r0 = r0 + r16
            int r10 = r10 + r0
            X.3oV r0 = r3.A04
            if (r0 == 0) goto L_0x016b
            android.view.View r0 = r0.getView()
            android.content.Context r9 = r0.getContext()
            X.0qQ.A07(r9)
            r0 = 2131970838(0x7f134b16, float:1.9578638E38)
            X.6jx r1 = new X.6jx
            r1.<init>((int) r0)
            X.5Gt r0 = new X.5Gt
            r0.<init>(r9, r12, r1)
            X.3oV r1 = r3.A04
            if (r1 == 0) goto L_0x016b
            android.view.View r1 = r1.getView()
            r0.A04(r1, r11, r10, r5)
            X.2fy r1 = X.C226262fy.BELOW_ANCHOR
            r0.A06(r1)
            r0.A0A = r2
            X.9Uk r1 = new X.9Uk
            r1.<init>(r4)
            r0.A04 = r1
            X.5Gv r0 = r0.A00()
            r3.A08 = r0
        L_0x027d:
            if (r0 == 0) goto L_0x0432
            boolean r0 = r0.A09()
            if (r0 != r5) goto L_0x0432
        L_0x0285:
            r7.setClickable(r5)
            X.9Uj r0 = new X.9Uj
            r20 = r0
            r21 = r7
            r22 = r6
            r23 = r15
            r25 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26)
            X.AnonymousClass0fU.A00(r0, r7)
        L_0x029a:
            X.8Nl r1 = r3.A0A
            if (r1 == 0) goto L_0x04bb
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            boolean r0 = r1 instanceof X.C59812JZg
            if (r0 == 0) goto L_0x042c
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.reels.prompt.view.PromptStickerDrawable"
            X.0qQ.A0C(r1, r0)
            X.JZg r1 = (X.C59812JZg) r1
            int r7 = r1.A03
        L_0x02ad:
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            int r1 = r0.getIntrinsicHeight()
            int r1 = r1 - r7
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0B
            if (r0 == 0) goto L_0x0537
            boolean r7 = X.AnonymousClass4X0.A03(r0)
            r8 = 8
            java.lang.String r10 = "secondaryCardViewStubber"
            X.3oV r0 = r3.A06
            if (r7 == 0) goto L_0x0425
            if (r0 == 0) goto L_0x04b6
            android.view.View r9 = r0.getView()
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            android.content.Context r7 = r3.A0F
            r29 = 2131165218(0x7f070022, float:1.7944647E38)
            X.7jA r0 = new X.7jA
            r26 = r0
            r27 = r7
            r30 = r5
            r31 = r2
            r32 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32)
            r9.setImageDrawable(r0)
            X.3oV r0 = r3.A06
            if (r0 == 0) goto L_0x04b6
            android.view.View r7 = r0.getView()
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            int r0 = r0.getIntrinsicWidth()
            X.0nA.A0f(r7, r0)
            X.3oV r0 = r3.A06
            if (r0 == 0) goto L_0x04b6
            android.view.View r7 = r0.getView()
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            int r0 = r0.getIntrinsicHeight()
            X.0nA.A0V(r7, r0)
            X.3oV r0 = r3.A06
            if (r0 == 0) goto L_0x04b6
            android.view.View r0 = r0.getView()
            X.0nA.A0c(r0, r1)
            X.3oV r0 = r3.A06
            if (r0 == 0) goto L_0x04b6
            r0.setVisibility(r2)
        L_0x0323:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0B
            if (r0 == 0) goto L_0x0537
            boolean r7 = X.AnonymousClass4X0.A04(r0)
            java.lang.String r10 = "tertiaryCardViewStubber"
            X.3oV r0 = r3.A07
            if (r7 == 0) goto L_0x041e
            if (r0 == 0) goto L_0x04b6
            android.view.View r8 = r0.getView()
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.content.Context r7 = r3.A0F
            r29 = 2131165218(0x7f070022, float:1.7944647E38)
            X.7jA r0 = new X.7jA
            r26 = r0
            r27 = r7
            r30 = r5
            r31 = r2
            r32 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32)
            r8.setImageDrawable(r0)
            X.3oV r0 = r3.A07
            if (r0 == 0) goto L_0x04b6
            android.view.View r5 = r0.getView()
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            int r0 = r0.getIntrinsicWidth()
            X.0nA.A0f(r5, r0)
            X.3oV r0 = r3.A07
            if (r0 == 0) goto L_0x04b6
            android.view.View r5 = r0.getView()
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            int r0 = r0.getIntrinsicHeight()
            X.0nA.A0V(r5, r0)
            X.3oV r0 = r3.A07
            if (r0 == 0) goto L_0x04b6
            android.view.View r0 = r0.getView()
            X.0nA.A0c(r0, r1)
            X.3oV r0 = r3.A07
            if (r0 == 0) goto L_0x04b6
            r0.setVisibility(r2)
        L_0x038c:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0B
            if (r0 == 0) goto L_0x0537
            boolean r0 = X.AnonymousClass4X0.A02(r4, r0)
            if (r0 == 0) goto L_0x03f7
            android.content.Context r0 = r3.A0F
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r5 = r1.getDimensionPixelSize(r0)
            android.view.View r1 = r3.A05()
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            int r0 = r0.getIntrinsicWidth()
            int r5 = r5 * 2
            int r0 = r0 + r5
            X.0nA.A0f(r1, r0)
            android.view.View r1 = r3.A05()
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            int r0 = r0.getIntrinsicHeight()
            int r0 = r0 + r5
            X.0nA.A0V(r1, r0)
            X.3oV r0 = r3.A05
            java.lang.String r10 = "progressViewStubber"
            if (r0 == 0) goto L_0x04b6
            android.view.View r1 = r0.getView()
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            int r0 = r0.getIntrinsicWidth()
            int r0 = r0 + r5
            X.0nA.A0f(r1, r0)
            X.3oV r0 = r3.A05
            if (r0 == 0) goto L_0x04b6
            android.view.View r1 = r0.getView()
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            int r0 = r0.getIntrinsicHeight()
            int r0 = r0 + r5
            X.0nA.A0V(r1, r0)
        L_0x03f7:
            android.view.View r1 = r3.A05()
            r12 = r35
            if (r36 == 0) goto L_0x0410
            X.WBW r0 = new X.WBW
            r7 = r0
            r8 = r4
            r9 = r6
            r10 = r15
            r11 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            r1.addOnLayoutChangeListener(r0)
        L_0x040c:
            r14.setVisibility(r2)
            return
        L_0x0410:
            X.Tta r0 = new X.Tta
            r7 = r0
            r8 = r4
            r9 = r6
            r10 = r15
            r11 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            X.0nA.A0q(r1, r0)
            goto L_0x040c
        L_0x041e:
            if (r0 == 0) goto L_0x04b6
            r0.setVisibility(r8)
            goto L_0x038c
        L_0x0425:
            if (r0 == 0) goto L_0x04b6
            r0.setVisibility(r8)
            goto L_0x0323
        L_0x042c:
            int r7 = r1.getIntrinsicHeight()
            goto L_0x02ad
        L_0x0432:
            X.1Av r0 = X.1Au.A00(r4)
            X.0xa r11 = r0.A01
            java.lang.String r0 = "clips_prompt_tooltip_impression_count"
            int r10 = r11.getInt(r0, r2)
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = "last_seen_timestamp_for_clips_prompt_tooltip"
            r0 = 0
            long r0 = r11.getLong(r9, r0)
            long r16 = r16 - r0
            r0 = 3
            if (r10 >= r0) goto L_0x0285
            if (r10 == 0) goto L_0x045d
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.DAYS
            r0 = 1
            long r9 = r9.toMillis(r0)
            int r0 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0285
        L_0x045d:
            java.lang.String r1 = "clips_creator_invite"
            java.lang.String r0 = r8.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0285
            boolean r0 = r8.A0H()
            if (r0 == 0) goto L_0x0285
            com.instagram.user.model.User r0 = r8.A02
            if (r0 == 0) goto L_0x0491
            java.lang.String r1 = r0.getId()
        L_0x0475:
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r4)
            java.lang.String r0 = r0.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0285
            X.AoB r8 = new X.AoB
            r8.<init>(r4, r3)
            r0 = 500(0x1f4, double:2.47E-321)
            r13.postDelayed(r8, r0)
            goto L_0x0285
        L_0x0491:
            r1 = 0
            goto L_0x0475
        L_0x0493:
            if (r0 == 0) goto L_0x016b
            android.view.View r0 = r0.getView()
            r0.setClickable(r2)
            goto L_0x029a
        L_0x049e:
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            int r0 = r0.getIntrinsicWidth()
            goto L_0x01b7
        L_0x04aa:
            X.8Nl r0 = r3.A0A
            if (r0 == 0) goto L_0x04bb
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            int r0 = r0.getIntrinsicHeight()
            goto L_0x01a6
        L_0x04b6:
            X.0qQ.A0F(r10)
            goto L_0x016e
        L_0x04bb:
            X.0qQ.A0F(r18)
            goto L_0x016e
        L_0x04c0:
            boolean r0 = r1.A0G()
            r9 = r34
            if (r0 != 0) goto L_0x0513
            boolean r0 = r1.A0M()
            if (r0 != 0) goto L_0x0513
            boolean r0 = r1.A0A
            if (r0 != 0) goto L_0x0513
            com.instagram.reels.prompt.model.PromptStickerModel r1 = r3.A0B
            if (r1 == 0) goto L_0x0537
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x04f0
            X.9q0 r1 = new X.9q0
            android.view.View r0 = r3.A05()
            android.content.Context r9 = r0.getContext()
            X.0qQ.A07(r9)
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0B
            if (r0 == 0) goto L_0x0537
            r1.<init>(r9, r4, r0, r2)
            goto L_0x011a
        L_0x04f0:
            boolean r1 = r1.A0B
            android.view.View r0 = r3.A05()
            android.content.Context r10 = r0.getContext()
            X.0qQ.A07(r10)
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0B
            if (r1 == 0) goto L_0x050a
            if (r0 == 0) goto L_0x0537
            X.KWF r1 = new X.KWF
            r1.<init>(r10, r4, r0, r9)
            goto L_0x011a
        L_0x050a:
            if (r0 == 0) goto L_0x0537
            X.JZg r1 = new X.JZg
            r1.<init>(r10, r4, r0, r9)
            goto L_0x011a
        L_0x0513:
            android.view.View r0 = r3.A05()
            android.content.Context r21 = r0.getContext()
            X.0qQ.A07(r21)
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r3.A0B
            if (r0 == 0) goto L_0x0537
            r25 = 112(0x70, float:1.57E-43)
            X.8Nk r1 = new X.8Nk
            r23 = r0
            r24 = r9
            r26 = r2
            r27 = r2
            r20 = r1
            r22 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x011a
        L_0x0537:
            X.0qQ.A0F(r19)
            goto L_0x016e
        L_0x053c:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4X1.A00(com.instagram.common.session.UserSession, X.3BQ, X.3kD, X.4Wz, X.4X0, java.lang.String, boolean, boolean):void");
    }
}
