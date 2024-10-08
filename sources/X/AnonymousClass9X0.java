package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.9X0  reason: invalid class name */
public final class AnonymousClass9X0 extends Drawable implements C300645xY {
    public final int A00;
    public final Activity A01;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final L6C A05;
    public final AnonymousClass8D7 A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final int A09;
    public final View A0A;
    public final String A0B;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.drawPath((Path) this.A08.getValue(), (Paint) this.A07.getValue());
        canvas.save();
        AnonymousClass7TG.A0z(canvas, this);
        this.A0A.draw(canvas);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        AnonymousClass0eM r1 = this.A08;
        ((Path) r1.getValue()).reset();
        RectF rectF = new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        float f = (float) this.A09;
        ((Path) r1.getValue()).addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9X0(android.app.Activity r15, android.content.Context r16, X.AnonymousClass0iw r17, com.instagram.common.session.UserSession r18, X.L6C r19, X.AnonymousClass8D7 r20) {
        /*
            r14 = this;
            r2 = r16
            r0 = r18
            X.AnonymousClass7TG.A1U(r15, r2, r0)
            r7 = 4
            r1 = r17
            X.0qQ.A0B(r1, r7)
            r14.<init>()
            r14.A01 = r15
            r14.A02 = r2
            r14.A04 = r0
            r14.A03 = r1
            r1 = r20
            r14.A06 = r1
            r0 = r19
            r14.A05 = r0
            android.content.res.Resources r0 = r2.getResources()
            int r0 = X.AnonymousClass7TE.A0D(r0)
            r14.A00 = r0
            android.content.res.Resources r0 = r2.getResources()
            int r0 = X.AnonymousClass7TE.A0F(r0)
            r14.A09 = r0
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0228
            r2 = 2131624058(0x7f0e007a, float:1.8875285E38)
            android.app.Activity r11 = r14.A01
            android.view.LayoutInflater r1 = r11.getLayoutInflater()
            r0 = 0
            r8 = 0
            android.view.View r6 = r1.inflate(r2, r0, r8)
            r0 = 2131436236(0x7f0b22cc, float:1.8494337E38)
            android.view.View r2 = r6.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            X.8D7 r5 = r14.A06
            com.instagram.common.typedurl.ImageUrl r1 = r5.A03
            if (r1 == 0) goto L_0x005d
            X.0iw r0 = r14.A03
            r2.setUrl(r1, r0)
        L_0x005d:
            r0 = 2131436243(0x7f0b22d3, float:1.849435E38)
            android.widget.TextView r3 = X.AnonymousClass7TE.A0d(r6, r0)
            X.0qQ.A0A(r3)
            r12 = 1
            X.0qQ.A0B(r3, r12)
            r0 = 2132018633(0x7f1405c9, float:1.9675578E38)
            r3.setTextAppearance(r0)
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r6)
            r10 = 3
            r9 = 2
            com.instagram.api.schemas.IGAIAgentType r4 = r5.A01
            if (r4 == 0) goto L_0x0091
            int r0 = r4.ordinal()
            if (r0 == r10) goto L_0x021a
            if (r0 == r9) goto L_0x021a
            if (r0 != r7) goto L_0x0091
            java.lang.String r0 = r5.A01()
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
        L_0x008e:
            r3.setText(r1)
        L_0x0091:
            android.content.Context r3 = r14.A02
            X.0qQ.A0B(r3, r8)
            r0 = 2131436242(0x7f0b22d2, float:1.8494349E38)
            android.widget.TextView r2 = X.AnonymousClass7TE.A0d(r6, r0)
            if (r4 == 0) goto L_0x00c4
            int r0 = r4.ordinal()
            if (r0 == r10) goto L_0x0215
            if (r0 == r9) goto L_0x020c
            if (r0 != r7) goto L_0x00c4
            java.lang.String r13 = r5.A05
            if (r13 == 0) goto L_0x0203
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0203
            r1 = 2131952570(0x7f1303ba, float:1.9541586E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r13}
            java.lang.String r0 = r3.getString(r1, r0)
        L_0x00be:
            X.0qQ.A0A(r0)
        L_0x00c1:
            r2.setText(r0)
        L_0x00c4:
            com.instagram.common.session.UserSession r2 = r14.A04
            X.0qQ.A0B(r2, r12)
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A08
            if (r4 == r0) goto L_0x01f9
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A05
            if (r4 == r0) goto L_0x01f9
            X.0Tu r12 = X.0Tu.A05
            r0 = 36325613618869325(0x810df40000344d, double:3.035802551853881E-306)
            boolean r1 = X.182.A06(r12, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
        L_0x00e3:
            if (r1 == 0) goto L_0x00fd
            r0 = 2131436240(0x7f0b22d0, float:1.8494345E38)
            android.view.View r1 = r6.findViewById(r0)
            r0 = 8
            r1.setVisibility(r0)
            if (r4 == 0) goto L_0x00fd
            int r0 = r4.ordinal()
            if (r0 == r10) goto L_0x01a7
            if (r0 == r9) goto L_0x015b
            if (r0 == r7) goto L_0x015b
        L_0x00fd:
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A06
            if (r4 == r0) goto L_0x010b
            r0 = 2131431959(0x7f0b1217, float:1.8485662E38)
            android.view.View r0 = r6.findViewById(r0)
            r0.setVisibility(r8)
        L_0x010b:
            r0 = 2131436241(0x7f0b22d1, float:1.8494347E38)
            android.view.View r1 = r6.findViewById(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r0 = r5.A00
            r1.addView(r0)
            boolean r0 = X.0mk.A02(r3)
            r6.setLayoutDirection(r0)
            r1 = -2
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1)
            r11.addContentView(r6, r0)
            android.view.ViewTreeObserver r0 = r6.getViewTreeObserver()
            r0.dispatchOnPreDraw()
            r0 = 2
            X.LZ3 r1 = new X.LZ3
            r1.<init>(r0, r6, r14)
            android.view.ViewTreeObserver r0 = r6.getViewTreeObserver()
            r0.addOnPreDrawListener(r1)
            r14.A0A = r6
            X.MMd r0 = new X.MMd
            r0.<init>(r14, r7)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r14.A07 = r0
            X.Axq r0 = X.C41638Axq.A00
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r14.A08 = r0
            r0 = 84
            java.lang.String r0 = X.C273654mx.A00(r0)
            r14.A0B = r0
            return
        L_0x015b:
            r0 = 2131443355(0x7f0b3e9b, float:1.8508776E38)
            android.view.View r0 = r6.findViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r8, r8)
            android.view.View r10 = r0.getView()
            com.instagram.igds.components.button.IgdsButton r10 = (com.instagram.igds.components.button.IgdsButton) r10
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131966210(0x7f133902, float:1.9569252E38)
            java.lang.String r0 = r1.getString(r0)
            r10.setText((java.lang.String) r0)
            X.4lo r0 = X.C273014lo.PRIMARY_LINK
            r10.setStyle(r0)
            android.widget.TextView r9 = r10.A0A
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r9.setTypeface(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165572(0x7f070184, float:1.7945365E38)
            float r0 = X.AnonymousClass7TE.A01(r1, r0)
            r9.setTextSize(r8, r0)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36327065318799505(0x810f46000f3891, double:3.036720612735253E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x00fd
            X.AqL r0 = new X.AqL
            r0.<init>(r3, r6, r10, r5)
            goto L_0x01e5
        L_0x01a7:
            r0 = 2131436280(0x7f0b22f8, float:1.8494426E38)
            android.view.View r0 = r6.findViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r8, r8)
            android.view.View r10 = r0.getView()
            com.instagram.igds.components.button.IgdsButton r10 = (com.instagram.igds.components.button.IgdsButton) r10
            X.2FW r1 = r5.A04
            X.2FW r0 = X.2FW.A1A
            X.0Tu r9 = X.0Tu.A05
            if (r1 != r0) goto L_0x01ea
            r0 = 36325613618934862(0x810df40001344e, double:3.035802551895327E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x01d1
            r0 = 2131966212(0x7f133904, float:1.9569256E38)
        L_0x01ce:
            r10.setText((int) r0)
        L_0x01d1:
            android.content.Context r12 = X.AnonymousClass7TE.A0S(r10)
            r0 = 36327065318799505(0x810f46000f3891, double:3.036720612735253E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x00fd
            X.AqL r0 = new X.AqL
            r0.<init>(r12, r6, r10, r5)
        L_0x01e5:
            X.0nA.A0q(r6, r0)
            goto L_0x00fd
        L_0x01ea:
            r0 = 36325613619000399(0x810df40002344f, double:3.0358025519367726E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x01d1
            r0 = 2131966211(0x7f133903, float:1.9569254E38)
            goto L_0x01ce
        L_0x01f9:
            java.lang.Boolean r0 = X.C70306O1k.A00(r2)
            boolean r1 = r0.booleanValue()
            goto L_0x00e3
        L_0x0203:
            r0 = 2131952569(0x7f1303b9, float:1.9541584E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x00be
        L_0x020c:
            r0 = 2131952571(0x7f1303bb, float:1.9541589E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x00c1
        L_0x0215:
            X.AnonymousClass7TH.A0R(r2)
            goto L_0x00c4
        L_0x021a:
            java.lang.String r0 = r5.A01()
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            X.C244273av.A08(r2, r1, r12)
            goto L_0x008e
        L_0x0228:
            android.app.Activity r11 = r14.A01
            android.view.LayoutInflater r1 = r11.getLayoutInflater()
            r0 = 2131624488(0x7f0e0228, float:1.8876157E38)
            r3 = 0
            r8 = 0
            android.view.View r6 = r1.inflate(r0, r3, r8)
            r0 = 2131436236(0x7f0b22cc, float:1.8494337E38)
            android.view.View r2 = r6.findViewById(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r2 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r2
            X.8D7 r5 = r14.A06
            com.instagram.common.typedurl.ImageUrl r1 = r5.A03
            if (r1 == 0) goto L_0x024b
            X.0iw r0 = r14.A03
            r2.A0F(r3, r0, r1)
        L_0x024b:
            r0 = 2131436243(0x7f0b22d3, float:1.849435E38)
            android.view.View r3 = r6.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            X.UOB r4 = r5.A0E
            if (r4 == 0) goto L_0x025c
            com.instagram.reels.chat.model.ChatStickerChannelType r1 = r4.A03
            if (r1 != 0) goto L_0x025e
        L_0x025c:
            com.instagram.reels.chat.model.ChatStickerChannelType r1 = com.instagram.reels.chat.model.ChatStickerChannelType.BROADCAST
        L_0x025e:
            com.instagram.reels.chat.model.ChatStickerChannelType r0 = com.instagram.reels.chat.model.ChatStickerChannelType.BROADCAST
            if (r1 != r0) goto L_0x02b6
            int r1 = r5.A00()
            r0 = 2
            if (r1 != r0) goto L_0x02b6
            X.0qQ.A0A(r3)
            java.lang.String r2 = r5.A01()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.Jw4 r0 = new X.Jw4
            r0.<init>((java.lang.Integer) r1)
            X.C46334Dcc.A00(r3, r0, r2, r8)
        L_0x027a:
            r0 = 2131436242(0x7f0b22d2, float:1.8494349E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r6, r0)
            android.content.Context r3 = r14.A02
            if (r4 == 0) goto L_0x02b4
            java.lang.Integer r0 = r4.A0B
            if (r0 == 0) goto L_0x02b4
            int r0 = r0.intValue()
        L_0x028d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.C66637Ma6.A00(r3, r0)
            r1.setText(r0)
            r0 = 2131436237(0x7f0b22cd, float:1.8494339E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r6, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.instagram.common.session.UserSession r0 = r14.A04
            int r0 = X.C17030VFe.A00(r0)
            r1.setText(r0)
            X.Apd r0 = new X.Apd
            r0.<init>(r6, r1, r14)
            X.0nA.A0q(r6, r0)
            goto L_0x010b
        L_0x02b4:
            r0 = 0
            goto L_0x028d
        L_0x02b6:
            java.lang.String r0 = r5.A01()
            r3.setText(r0)
            goto L_0x027a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9X0.<init>(android.app.Activity, android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.L6C, X.8D7):void");
    }

    public final String C4F() {
        return this.A0B;
    }

    public final int getIntrinsicHeight() {
        return this.A0A.getMeasuredHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A0A.getMeasuredWidth();
    }
}
