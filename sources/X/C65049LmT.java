package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.LmT  reason: case insensitive filesystem */
public final class C65049LmT implements B21, B20 {
    public int A00;
    public int A01;
    public IgEditText A02;
    public IgSimpleImageView A03;
    public IgSimpleImageView A04;
    public IgSimpleImageView A05;
    public IgSimpleImageView A06;
    public IgTextView A07;
    public IgTextView A08;
    public PromptStickerModel A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Activity A0E;
    public final Context A0F;
    public final View.OnFocusChangeListener A0G;
    public final UserSession A0H;
    public final AnonymousClass80U A0I;
    public final AnonymousClass87F A0J;
    public final String A0K;
    public final List A0L;
    public final AnonymousClass0eM A0M;
    public final AnonymousClass0eM A0N;
    public final AnonymousClass0eM A0O = C66295MMe.A00(this, 6);
    public final AnonymousClass0eM A0P;
    public final AnonymousClass0eM A0Q;
    public final C354538Mk A0R;
    public final AnonymousClass8MF A0S;
    public final AnonymousClass8Z3 A0T;

    public C65049LmT(Activity activity, View view, UserSession userSession, AnonymousClass3E6 r11, C354538Mk r12, AnonymousClass80U r13, AnonymousClass8MF r14, String str) {
        0qQ.A0B(str, 3);
        0qQ.A0B(r12, 8);
        this.A0H = userSession;
        this.A0E = activity;
        this.A0K = str;
        this.A0I = r13;
        this.A0S = r14;
        this.A0R = r12;
        Context context = view.getContext();
        this.A0F = context;
        this.A0M = C66295MMe.A00(view, 3);
        this.A0Q = C66295MMe.A00(view, 8);
        this.A0P = C66295MMe.A00(view, 7);
        this.A0N = C66295MMe.A00(view, 5);
        C19731WeY weY = new C19731WeY(this, 3);
        this.A0T = weY;
        0qQ.A07(context);
        this.A0J = new AnonymousClass87F(context, r11, weY);
        this.A0G = new LYN(this, 4);
        this.A0A = AnonymousClass7TE.A1C();
        this.A0L = 0sr.A1P(new Integer[]{DbV.A0n(context, R.color.design_dark_default_color_on_background), DbV.A0n(context, R.color.black)});
    }

    public static final void A00(C65049LmT lmT, int i) {
        Integer num;
        PromptStickerModel promptStickerModel = lmT.A09;
        String str = "model";
        if (promptStickerModel != null) {
            int i2 = i;
            promptStickerModel.A09(0nH.A0F(i));
            Drawable mutate = AnonymousClass7TE.A0c(lmT.A0Q).getBackground().mutate();
            0qQ.A0C(mutate, C273654mx.A00(0));
            ((GradientDrawable) mutate).setColor(i);
            IgEditText igEditText = lmT.A02;
            if (igEditText == null) {
                str = "stickerEditText";
            } else {
                igEditText.setTextColor(0nH.A08(i, 1.0f));
                Drawable mutate2 = AnonymousClass7TE.A0c(lmT.A0O).getBackground().mutate();
                0qQ.A0C(mutate2, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                Context context = lmT.A0F;
                0qQ.A06(context);
                ((ColorDrawable) mutate2).setColor(context.getColor(LJC.A00(context, i)));
                PromptStickerModel promptStickerModel2 = lmT.A09;
                if (promptStickerModel2 != null) {
                    if (promptStickerModel2.A0H()) {
                        num = AnonymousClass05K.A01;
                    } else {
                        num = AnonymousClass05K.A0C;
                    }
                    IgSimpleImageView igSimpleImageView = lmT.A06;
                    if (igSimpleImageView != null) {
                        String str2 = lmT.A0K;
                        PromptStickerModel promptStickerModel3 = lmT.A09;
                        if (promptStickerModel3 != null) {
                            igSimpleImageView.setImageDrawable(new C339177jB(context, promptStickerModel3, num, str2, i2, 0, 224));
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View Azx() {
        return AnonymousClass7TE.A0c(this.A0Q);
    }

    public final Class Bza() {
        return C59812JZg.class;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x030b, code lost:
        if (r8 == null) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01da, code lost:
        if (r2.A0D != false) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0263, code lost:
        if (r9 == false) goto L_0x0265;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DCS(java.lang.Object r25) {
        /*
            r24 = this;
            r9 = r25
            r1 = 0
            X.0qQ.A0B(r9, r1)
            r2 = r24
            r2.A0D = r1
            X.0eE r5 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r2.A0H
            com.instagram.user.model.User r11 = r5.A01(r0)
            boolean r3 = r9 instanceof X.AnonymousClass8T9
            r6 = 1
            if (r3 == 0) goto L_0x02ce
            com.instagram.api.schemas.StoryPromptType r10 = com.instagram.api.schemas.StoryPromptType.DEFAULT
            X.8T9 r9 = (X.AnonymousClass8T9) r9
            com.instagram.reels.prompt.model.PromptStickerModel r8 = r9.A00
            if (r8 != 0) goto L_0x003d
            java.util.List r18 = X.AnonymousClass7TE.A1I(r11)
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            r9 = 0
            java.lang.String r13 = ""
            com.instagram.reels.prompt.model.PromptStickerModel r8 = new com.instagram.reels.prompt.model.PromptStickerModel
            r14 = r13
            r15 = r9
            r16 = r9
            r17 = r9
            r20 = r1
            r21 = r1
            r22 = r1
            r23 = r1
            r19 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x003d:
            r2.A09 = r8
            X.8Mk r4 = r2.A0R
            boolean r3 = r8.A0H()
            if (r3 == 0) goto L_0x02ca
            r3 = 71
            java.lang.String r3 = X.C273654mx.A00(r3)
        L_0x004d:
            r4.DnE(r3)
            X.0eM r7 = r2.A0P
            java.lang.Object r3 = r7.getValue()
            X.3oV r3 = (X.C252063oV) r3
            boolean r3 = r3.CVM()
            if (r3 != 0) goto L_0x0178
            android.view.View r4 = X.AnonymousClass7TG.A0Q(r7)
            r3 = 2131438773(0x7f0b2cb5, float:1.8499482E38)
            android.view.View r6 = r4.requireViewById(r3)
            com.instagram.common.ui.base.IgEditText r6 = (com.instagram.common.ui.base.IgEditText) r6
            X.0qQ.A0A(r6)
            X.9qZ r3 = new X.9qZ
            r3.<init>(r6)
            r6.addTextChangedListener(r3)
            r4 = 3
            X.UsV r3 = new X.UsV
            r3.<init>(r6, r4)
            r6.addTextChangedListener(r3)
            android.view.View$OnFocusChangeListener r3 = r2.A0G
            r6.setOnFocusChangeListener(r3)
            r2.A02 = r6
            java.lang.String r8 = "model"
            boolean r3 = r2.A0C
            if (r3 == 0) goto L_0x00de
            com.instagram.reels.prompt.model.PromptStickerModel r3 = r2.A09
            if (r3 == 0) goto L_0x017e
            com.instagram.user.model.User r3 = r3.A02
            if (r3 == 0) goto L_0x00de
            android.content.Context r6 = r2.A0F
            X.0qQ.A06(r6)
            java.lang.String r4 = r2.A0K
            com.instagram.reels.prompt.model.PromptStickerModel r3 = r2.A09
            if (r3 == 0) goto L_0x017e
            com.instagram.user.model.User r3 = r3.A02
            if (r3 == 0) goto L_0x030e
            X.KWL r8 = new X.KWL
            r8.<init>(r6, r3, r4)
            android.view.View r4 = X.AnonymousClass7TG.A0Q(r7)
            r3 = 2131438768(0x7f0b2cb0, float:1.8499472E38)
            android.view.View r3 = r4.requireViewById(r3)
            r4 = r3
            com.instagram.common.ui.base.IgSimpleImageView r4 = (com.instagram.common.ui.base.IgSimpleImageView) r4
            r2.A04 = r4
            X.0qQ.A07(r3)
            r4.setImageDrawable(r8)
            int r3 = r8.A08()
            int r3 = -r3
            X.0nA.A0e(r4, r3)
            com.instagram.common.ui.base.IgEditText r6 = r2.A02
            java.lang.String r3 = "stickerEditText"
            if (r6 != 0) goto L_0x00d4
            X.0qQ.A0F(r3)
        L_0x00cf:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d4:
            int r4 = r6.getPaddingTop()
            int r3 = r8.A01
            int r4 = r4 + r3
            X.0nA.A0c(r6, r4)
        L_0x00de:
            boolean r3 = r2.A0C
            if (r3 != 0) goto L_0x00ef
            android.view.View r4 = X.AnonymousClass7TG.A0Q(r7)
            r3 = 2131438777(0x7f0b2cb9, float:1.849949E38)
            com.instagram.common.ui.base.IgSimpleImageView r3 = X.JTP.A0T(r4, r3)
            r2.A06 = r3
        L_0x00ef:
            android.view.View r4 = X.AnonymousClass7TG.A0Q(r7)
            r3 = 2131438762(0x7f0b2caa, float:1.849946E38)
            android.view.View r9 = r4.requireViewById(r3)
            r8 = r9
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.content.Context r6 = X.AnonymousClass7TE.A0S(r8)
            android.app.Activity r3 = r2.A0E
            int r4 = X.2Yu.A0D(r3)
            X.JZh r3 = new X.JZh
            r3.<init>(r6, r4)
            r8.setImageDrawable(r3)
            X.0qQ.A07(r9)
            android.view.View r4 = X.AnonymousClass7TG.A0Q(r7)
            r3 = 2131438778(0x7f0b2cba, float:1.8499493E38)
            com.instagram.common.ui.base.IgTextView r3 = X.DbT.A0a(r4, r3)
            r2.A07 = r3
            android.view.View r4 = X.AnonymousClass7TG.A0Q(r7)
            r3 = 2131438769(0x7f0b2cb1, float:1.8499474E38)
            com.instagram.common.ui.base.IgSimpleImageView r3 = X.JTP.A0T(r4, r3)
            r2.A05 = r3
            android.view.View r4 = X.AnonymousClass7TG.A0Q(r7)
            r3 = 2131440943(0x7f0b352f, float:1.8503884E38)
            com.instagram.common.ui.base.IgTextView r3 = X.DbT.A0a(r4, r3)
            r2.A08 = r3
            android.view.View r4 = X.AnonymousClass7TG.A0Q(r7)
            r3 = 2131438764(0x7f0b2cac, float:1.8499464E38)
            com.instagram.common.ui.base.IgSimpleImageView r10 = X.JTP.A0T(r4, r3)
            r3 = 2131238397(0x7f081dfd, float:1.8093072E38)
            r10.setImageResource(r3)
            r9 = 2
            X.0eM r3 = r2.A0Q
            android.view.View r3 = X.AnonymousClass7TE.A0c(r3)
            android.view.View[] r8 = new android.view.View[]{r10, r3}
            r3 = 4
            X.MMe r6 = new X.MMe
            r6.<init>(r2, r3)
            X.3NG r4 = X.AnonymousClass7TE.A0m(r10)
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r8, r9)
            android.view.View[] r3 = (android.view.View[]) r3
            r4.A02(r3)
            r3 = 22
            X.C61685KHt.A00(r4, r6, r3)
            r2.A03 = r10
            X.87F r4 = r2.A0J
            android.view.View r3 = X.AnonymousClass7TG.A0Q(r7)
            r4.A03(r3)
        L_0x0178:
            com.instagram.reels.prompt.model.PromptStickerModel r3 = r2.A09
            if (r3 != 0) goto L_0x0183
            java.lang.String r8 = "model"
        L_0x017e:
            X.0qQ.A0F(r8)
            goto L_0x00cf
        L_0x0183:
            boolean r3 = r3.A0H()
            java.lang.String r8 = "seeMorePromptsTextView"
            r6 = 8
            com.instagram.common.ui.base.IgTextView r4 = r2.A08
            if (r3 == 0) goto L_0x0269
            if (r4 == 0) goto L_0x017e
            boolean r3 = r2.A0D
            if (r3 != 0) goto L_0x0196
            r6 = 0
        L_0x0196:
            r4.setVisibility(r6)
            r3 = 60
            X.LY0.A00(r4, r3, r2)
            X.27r r4 = X.27p.A01(r0)
            X.JVj r3 = X.C59725JVj.POST_CAPTURE
            r4.A1G(r3)
        L_0x01a7:
            android.content.Context r8 = r2.A0F
            r3 = 2131886088(0x7f120008, float:1.9406745E38)
            X.61R r9 = X.C303756Aq.A00(r8, r3)
            if (r9 == 0) goto L_0x01e1
            com.instagram.common.ui.base.IgSimpleImageView r6 = r2.A05
            if (r6 != 0) goto L_0x01bd
            java.lang.String r4 = "diceIconView"
        L_0x01b8:
            X.0qQ.A0F(r4)
            goto L_0x00cf
        L_0x01bd:
            r6.setImageDrawable(r9)
            android.content.Context r4 = r6.getContext()
            r3 = 2131970883(0x7f134b43, float:1.957873E38)
            X.DbU.A12(r4, r6, r3)
            r3 = 64
            X.LY8.A00(r6, r3, r9, r2)
            java.util.List r3 = r2.A0A
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x01dc
            boolean r4 = r2.A0D
            r3 = 0
            if (r4 == 0) goto L_0x01de
        L_0x01dc:
            r3 = 8
        L_0x01de:
            r6.setVisibility(r3)
        L_0x01e1:
            java.lang.String r10 = "model"
            com.instagram.common.ui.base.IgEditText r6 = r2.A02
            java.lang.String r4 = "stickerEditText"
            if (r6 == 0) goto L_0x01b8
            com.instagram.reels.prompt.model.PromptStickerModel r3 = r2.A09
            if (r3 == 0) goto L_0x02c5
            com.instagram.api.schemas.StoryPromptTappableDataIntf r3 = r3.A00
            java.lang.String r3 = r3.getText()
            if (r3 != 0) goto L_0x01f7
            java.lang.String r3 = ""
        L_0x01f7:
            r6.setText(r3)
            com.instagram.common.ui.base.IgEditText r3 = r2.A02
            if (r3 == 0) goto L_0x01b8
            X.JTR.A1F(r3)
            com.instagram.common.ui.base.IgTextView r6 = r2.A07
            if (r6 != 0) goto L_0x0208
            java.lang.String r4 = "infoTextView"
            goto L_0x01b8
        L_0x0208:
            java.lang.Integer r4 = X.JTQ.A0R(r0, r5)
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            boolean r9 = X.AnonymousClass7TF.A1W(r4, r3)
            com.instagram.reels.prompt.model.PromptStickerModel r3 = r2.A09
            if (r3 == 0) goto L_0x02c5
            boolean r3 = r3.A0H()
            if (r3 == 0) goto L_0x0236
            X.0Tu r5 = X.0Tu.A05
            r3 = 36314837546568514(0x810427000a0b42, double:3.028987720339088E-306)
            boolean r0 = X.182.A06(r5, r0, r3)
            if (r0 == 0) goto L_0x0236
            r0 = 2131955636(0x7f130fb4, float:1.9547805E38)
        L_0x022c:
            r6.setText(r0)
            com.instagram.common.ui.base.IgSimpleImageView r3 = r2.A03
            if (r3 != 0) goto L_0x0270
            java.lang.String r4 = "colorButton"
            goto L_0x01b8
        L_0x0236:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r2.A09
            if (r0 == 0) goto L_0x02c5
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x0246
            if (r9 == 0) goto L_0x0246
            r0 = 2131955634(0x7f130fb2, float:1.95478E38)
            goto L_0x022c
        L_0x0246:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r2.A09
            if (r0 == 0) goto L_0x02c5
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x0256
            if (r9 != 0) goto L_0x0256
            r0 = 2131955635(0x7f130fb3, float:1.9547803E38)
            goto L_0x022c
        L_0x0256:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r2.A09
            if (r0 == 0) goto L_0x02c5
            boolean r0 = r0.A0H()
            if (r0 != 0) goto L_0x0265
            r0 = 2131970880(0x7f134b40, float:1.9578724E38)
            if (r9 != 0) goto L_0x022c
        L_0x0265:
            r0 = 2131970881(0x7f134b41, float:1.9578726E38)
            goto L_0x022c
        L_0x0269:
            if (r4 == 0) goto L_0x017e
            r4.setVisibility(r6)
            goto L_0x01a7
        L_0x0270:
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r2.A09
            if (r0 == 0) goto L_0x02c5
            boolean r0 = r0.A0H()
            int r0 = X.DbW.A01(r0)
            r3.setVisibility(r0)
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r2.A09
            if (r0 == 0) goto L_0x02c5
            boolean r4 = r0.A0H()
            android.content.res.Resources r3 = r8.getResources()
            r0 = 2131165359(0x7f0700af, float:1.7944933E38)
            if (r4 == 0) goto L_0x0293
            r0 = 2131165226(0x7f07002a, float:1.7944663E38)
        L_0x0293:
            int r3 = r3.getDimensionPixelSize(r0)
            X.0eM r0 = r2.A0Q
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            X.0nA.A0f(r0, r3)
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r2.A09
            if (r0 == 0) goto L_0x02c5
            int r0 = r0.A00()
            A00(r2, r0)
            X.0eM r0 = r2.A0M
            android.view.View r3 = X.AnonymousClass7TE.A0c(r0)
            android.view.View r0 = X.AnonymousClass7TG.A0Q(r7)
            android.view.View[] r3 = new android.view.View[]{r3, r0}
            r0 = 0
            X.C294975nL.A04(r0, r3, r1)
            X.87F r1 = r2.A0J
            android.view.View r0 = r1.A01
            r1.A02(r0)
            return
        L_0x02c5:
            X.0qQ.A0F(r10)
            goto L_0x00cf
        L_0x02ca:
            java.lang.String r3 = "prompt_sticker_bundle_id"
            goto L_0x004d
        L_0x02ce:
            boolean r8 = r9 instanceof X.AnonymousClass8UV
            X.0Tu r7 = X.0Tu.A05
            r3 = 36318922059815676(0x8107de00001afc, double:3.031570782963608E-306)
            boolean r3 = X.182.A06(r7, r0, r3)
            r2.A0C = r3
            if (r8 == 0) goto L_0x0307
            r2.A0D = r6
        L_0x02e1:
            r9 = 0
            java.util.List r18 = X.AnonymousClass7TE.A1I(r11)
            boolean r3 = r2.A0C
            java.lang.Integer r12 = X.C51967G9n.A0l(r3)
            java.lang.String r13 = ""
            com.instagram.api.schemas.StoryPromptType r10 = com.instagram.api.schemas.StoryPromptType.DEFAULT
            com.instagram.reels.prompt.model.PromptStickerModel r8 = new com.instagram.reels.prompt.model.PromptStickerModel
            r14 = r13
            r15 = r9
            r16 = r9
            r17 = r9
            r20 = r1
            r21 = r6
            r22 = r1
            r23 = r1
            r19 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x003d
        L_0x0307:
            X.8UU r9 = (X.AnonymousClass8UU) r9
            com.instagram.reels.prompt.model.PromptStickerModel r8 = r9.A00
            if (r8 != 0) goto L_0x003d
            goto L_0x02e1
        L_0x030e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65049LmT.DCS(java.lang.Object):void");
    }

    public final void DDW() {
        String str;
        PromptStickerModel promptStickerModel = this.A09;
        String str2 = "model";
        if (promptStickerModel != null) {
            IgEditText igEditText = this.A02;
            if (igEditText == null) {
                str2 = "stickerEditText";
            } else {
                Editable text = igEditText.getText();
                0qQ.A07(text);
                promptStickerModel.A0B(DbV.A12(text));
                AnonymousClass0eM r3 = this.A0P;
                if (((C252063oV) r3.getValue()).CVM()) {
                    C294975nL.A05(new View[]{(View) this.A0M.getValue(), AnonymousClass7TG.A0Q(r3)}, false);
                }
                this.A0B = false;
                PromptStickerModel promptStickerModel2 = this.A09;
                if (promptStickerModel2 != null) {
                    if (promptStickerModel2.A0H()) {
                        str = C273654mx.A00(71);
                    } else {
                        str = "prompt_sticker_bundle_id";
                    }
                    this.A0R.Dn9(str);
                    AnonymousClass8MF r1 = this.A0S;
                    PromptStickerModel promptStickerModel3 = this.A09;
                    if (promptStickerModel3 != null) {
                        r1.Dn8(promptStickerModel3, str);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
