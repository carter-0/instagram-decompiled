package X;

import android.app.Activity;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;

/* renamed from: X.74j  reason: invalid class name */
public final class AnonymousClass74j extends C232232tF {
    public FrameLayout A00;
    public FrameLayout A01;
    public IgdsFaceSwarm A02;
    public AnonymousClass5Gv A03 = null;
    public boolean A04;
    public final Activity A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final C328967Gz A08;
    public final C3258274h A09;
    public final C332907Wx A0A;
    public final AnonymousClass9HC A0B;
    public final AnonymousClass7L2 A0C;
    public final AnonymousClass9HS A0D;

    private void A00(C71662eb r4, String str, boolean z) {
        int i = 8;
        if (str != null) {
            TextView textView = (TextView) r4.A01();
            textView.setText(((C332977Xe) this.A0A).Cfz(str));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            if (z) {
                i = 0;
            }
        }
        r4.A03(i);
    }

    private boolean A01(AnonymousClass79E r4) {
        int i = r4.A01;
        if (i != 26) {
            if (i == 32 || i == 62) {
                return ((Boolean) this.A0B.A10.getValue()).booleanValue();
            }
            if (i == 1013 || i == 1003 || i == 1004) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v227, resolved type: com.instagram.common.ui.base.IgSimpleImageView} */
    /* JADX WARNING: type inference failed for: r0v151, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v159, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v162, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v163, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v226 */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0403, code lost:
        if (r1 != 62) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0422, code lost:
        if (((java.lang.Boolean) r6.A0B.A10.getValue()).booleanValue() != false) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04c6, code lost:
        if (r1 <= 1) goto L_0x04c8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05cb  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x05cf  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0261  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r26, X.C249703kE r27) {
        /*
            r25 = this;
            r4 = r27
            r5 = r26
            X.79E r5 = (X.AnonymousClass79E) r5
            X.MzT r4 = (X.C68062MzT) r4
            android.view.View r10 = r4.A00
            boolean r0 = r10 instanceof com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout
            r6 = r25
            if (r0 == 0) goto L_0x001b
            r1 = r10
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout r1 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout) r1
            X.AP0 r0 = new X.AP0
            r0.<init>(r6)
            r1.CNi(r0)
        L_0x001b:
            boolean r0 = r5.A0P
            r17 = r0
            r8 = 0
            r9 = 1
            r3 = 8
            r2 = 0
            if (r0 != 0) goto L_0x03bf
            android.widget.TextView r7 = r4.A09
            r7.setMaxLines(r9)
            java.lang.String r0 = r5.A0J
            r24 = r0
            boolean r1 = r5.A0T
            X.C46334Dcc.A00(r7, r8, r0, r1)
            X.2eb r0 = r4.A0A
            r0.A03(r3)
            if (r1 == 0) goto L_0x03b8
            com.instagram.common.session.UserSession r8 = r6.A07
            X.0qQ.A0B(r8, r2)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36322821892221404(0x810b6a002029dc, double:3.034037052680355E-306)
            boolean r0 = X.182.A06(r9, r8, r0)
            if (r0 == 0) goto L_0x03b8
            com.instagram.direct.model.messaginguser.MessagingUser r0 = r5.A03
            r0.getClass()
            java.lang.String r9 = r0.A03
            android.widget.TextView r1 = r4.A06
            X.FMy r0 = new X.FMy
            r0.<init>(r6, r9)
            X.AnonymousClass0fU.A00(r0, r1)
            X.7L2 r0 = r6.A0C
            X.7Kx r0 = r0.A04
            int r0 = r0.A04
            r1.setTextColor(r0)
            r1.setVisibility(r2)
            X.0iw r1 = r6.A06
            r0 = 3294(0xcde, float:4.616E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.F7A.A01(r1, r8, r0, r9)
        L_0x0075:
            java.lang.CharSequence r1 = r5.A08
            android.widget.TextView r0 = r4.A07
            if (r1 == 0) goto L_0x03b3
            r0.setText(r1)
            r0.setVisibility(r2)
        L_0x0081:
            r9 = 0
        L_0x0082:
            X.7L2 r0 = r6.A0C
            r23 = r0
            boolean r0 = r23.A00()
            X.C3256573p.A00(r7, r0)
            X.2eb r10 = r4.A0B
            java.lang.String r8 = r5.A0D
            if (r8 == 0) goto L_0x03af
            android.view.View r1 = r10.A01()
            r0 = 2131439938(0x7f0b3142, float:1.8501845E38)
            android.view.View r7 = r1.findViewById(r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x00b4
            r1 = 0
            android.text.Spanned r0 = android.text.Html.fromHtml(r8)
            r7.setText(r0)
            r0 = r23
            int r0 = r0.A00
            r7.setTextColor(r0)
        L_0x00b1:
            r10.A03(r1)
        L_0x00b4:
            com.instagram.common.session.UserSession r8 = r6.A07
            X.2eb r1 = r4.A0H
            java.util.List r11 = r5.A0L
            X.0qQ.A0B(r8, r2)
            r7 = 1
            X.0qQ.A0B(r1, r7)
            if (r11 == 0) goto L_0x00df
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00df
            r1.A03(r2)
            r10 = 2131625178(0x7f0e04da, float:1.8877557E38)
            android.view.View r1 = r1.A01()
            X.0qQ.A07(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r0 = r11.size()
            X.C67075Mhq.A00(r1, r8, r11, r10, r0)
        L_0x00df:
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x03a3
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x03a3
            android.widget.FrameLayout r0 = r4.A02
            r0.setVisibility(r2)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r11 = r4.A0L
            r11.setVisibility(r3)
            r6.A01 = r0
            X.7Wx r0 = r6.A0A
            X.7TQ r0 = (X.AnonymousClass7TQ) r0
            r0.Cy4(r6)
        L_0x00fa:
            r12 = 0
            r10 = 0
            if (r17 != 0) goto L_0x0338
            X.0eP r0 = r5.A0M
            java.lang.Object r1 = r0.A00
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            X.0iw r0 = r6.A06
            r11.A0F(r12, r0, r1)
            boolean r0 = r5.A0Y
            if (r0 == 0) goto L_0x0120
            android.content.Context r1 = r11.getContext()
            r0 = 2131239537(0x7f082271, float:1.8095384E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r11.setPresenceBadgeDrawable(r0)
            r0 = -1124744561(0xffffffffbcf5c28f, float:-0.03)
            r11.A02 = r0
        L_0x0120:
            int r1 = r5.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0138
            r0 = 1014(0x3f6, float:1.421E-42)
            if (r1 != r0) goto L_0x0138
            X.3t3 r0 = r5.A05
            if (r0 == 0) goto L_0x0138
            X.FLK r0 = new X.FLK
            r0.<init>(r6)
            X.AnonymousClass0fU.A00(r0, r11)
        L_0x0138:
            r11.setGradientSpinnerVisible(r2)
            r6.A00 = r11
            boolean r0 = r5.A0V
            r21 = r0
            if (r0 != 0) goto L_0x0146
            if (r9 != 0) goto L_0x0146
            r10 = 1
        L_0x0146:
            X.2eb r0 = r4.A0C
            r22 = r0
            java.lang.String r14 = r5.A0E
            boolean r0 = r5.A0X
            com.instagram.direct.model.messaginguser.MessagingUser r11 = r5.A03
            java.lang.Boolean r13 = r5.A06
            java.lang.Integer r12 = r5.A09
            r20 = 8
            if (r14 == 0) goto L_0x0232
            android.view.View r15 = r22.A01()
            android.widget.TextView r15 = (android.widget.TextView) r15
            android.content.Context r9 = r15.getContext()
            if (r0 == 0) goto L_0x0171
            if (r10 == 0) goto L_0x0171
            if (r11 == 0) goto L_0x0171
            X.17i r1 = X.17h.A00(r8)
            java.lang.String r0 = r11.A03
            r1.A02(r0)
        L_0x0171:
            X.7Wx r0 = r6.A0A
            X.7Xe r0 = (X.C332977Xe) r0
            android.text.SpannableString r14 = r0.Cfz(r14)
            if (r13 == 0) goto L_0x0224
            boolean r0 = r13.booleanValue()
            if (r0 != r7) goto L_0x0224
            if (r12 == 0) goto L_0x0224
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r12 != r0) goto L_0x0224
            if (r11 == 0) goto L_0x0335
            java.lang.String r0 = r11.A03
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
        L_0x0193:
            r1 = 2131975298(0x7f135c82, float:1.9587684E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r14}
            java.lang.String r1 = r9.getString(r1, r0)
            android.text.SpannableStringBuilder r13 = new android.text.SpannableStringBuilder
            r13.<init>(r1)
            r0 = 2130970246(0x7f040686, float:1.7549197E38)
            int r0 = X.2Yu.A0H(r9, r0)
            int r16 = r9.getColor(r0)
            java.lang.String r9 = r14.toString()
            java.util.regex.Pattern r0 = X.0mp.A00
            if (r9 == 0) goto L_0x0332
            int r14 = r9.length()
        L_0x01ba:
            if (r1 == 0) goto L_0x032f
            int r9 = r1.length()
        L_0x01c0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            X.ESl r1 = new X.ESl
            r1.<init>(r6, r0, r12)
            r0 = 34
            r13.setSpan(r1, r14, r9, r0)
            android.text.SpannableString r14 = android.text.SpannableString.valueOf(r13)
            X.74h r9 = r6.A09
            if (r9 == 0) goto L_0x0224
            java.lang.String r0 = r8.A06
            long r18 = java.lang.Long.parseLong(r0)
            X.0wc r13 = r9.A00
            java.lang.String r1 = "rai_ux_ig_view"
            X.0kJ r0 = r13.A00
            X.0Aj r13 = r13.A00(r0, r1)
            boolean r0 = r13.isSampled()
            if (r0 == 0) goto L_0x0224
            java.lang.Long r1 = java.lang.Long.valueOf(r18)
            java.lang.String r0 = "viewer_igid"
            r13.A9F(r0, r1)
            java.lang.String r1 = "ai_agent_thread"
            java.lang.String r0 = "surface"
            r13.AAJ(r0, r1)
            java.lang.String r1 = "genai_prompt"
            java.lang.String r0 = "component"
            r13.AAJ(r0, r1)
            java.lang.String r0 = "author_id"
            r13.A9F(r0, r12)
            X.0eM r0 = r9.A01
            java.lang.Object r0 = r0.getValue()
            X.3kK r0 = (X.C249763kK) r0
            java.lang.String r12 = r0.getSessionId()
            r9 = 114(0x72, float:1.6E-43)
            r1 = 10
            r0 = 118(0x76, float:1.65E-43)
            java.lang.String r0 = X.DcV.A02(r9, r1, r0)
            r13.AAJ(r0, r12)
            r13.Cgf()
        L_0x0224:
            r15.setText(r14)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r15.setMovementMethod(r0)
            if (r10 == 0) goto L_0x0232
            r20 = 0
        L_0x0232:
            r1 = r22
            r0 = r20
            r1.A03(r0)
            X.2eb r1 = r4.A0D
            java.lang.String r0 = r5.A0F
            r6.A00(r1, r0, r10)
            X.2eb r1 = r4.A0E
            java.lang.String r0 = r5.A0G
            r6.A00(r1, r0, r10)
            X.2eb r1 = r4.A0F
            java.lang.String r0 = r5.A0H
            r6.A00(r1, r0, r10)
            X.2eb r1 = r4.A0G
            java.lang.String r0 = r5.A0I
            r6.A00(r1, r0, r10)
            X.7Wx r1 = r6.A0A
            X.7YO r1 = (X.AnonymousClass7YO) r1
            X.9Ih r0 = r5.A02
            X.PuL r0 = r1.BWl(r0)
            if (r0 == 0) goto L_0x0444
            java.util.List r13 = r0.getItems()
            boolean r0 = r6.A01(r5)
            if (r0 == 0) goto L_0x0444
            X.3t3 r0 = r5.A05
            if (r0 == 0) goto L_0x0444
            boolean r0 = r5.A0Z
            if (r0 == 0) goto L_0x0444
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0444
            android.widget.LinearLayout r0 = r4.A03
            r0.setVisibility(r2)
            java.util.Iterator r16 = r13.iterator()
        L_0x0282:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0449
            java.lang.Object r14 = r16.next()
            X.PuK r14 = (X.C74404PuK) r14
            int r1 = r13.indexOf(r14)
            if (r1 == 0) goto L_0x032b
            if (r1 == r7) goto L_0x0327
            r0 = 2
            if (r1 != r0) goto L_0x0282
            X.OG6 r12 = r4.A0K
        L_0x029b:
            android.view.View r10 = r12.A00
            android.content.Context r9 = r10.getContext()
            X.N4H r1 = r14.BWk()
            int r15 = r1.A01
            r0 = -1
            if (r15 == r0) goto L_0x02ec
            boolean r0 = r23.A00()
            if (r0 == 0) goto L_0x0313
            r0 = r23
            X.7Kx r0 = r0.A04
            int r14 = r0.A0G
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r12.A04
            android.graphics.drawable.Drawable r15 = r9.getDrawable(r15)
            r0.setImageDrawable(r15)
            r0.setBackgroundColor(r14)
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r12.A03
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r12.A01
        L_0x02cc:
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r12 = r12.A02
            boolean r0 = r23.A00()
            X.C3256573p.A00(r12, r0)
            int r0 = r1.A02
            java.lang.String r0 = r9.getString(r0)
            r12.setText(r0)
            java.lang.Object r0 = r1.A03
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            X.AnonymousClass0fU.A00(r0, r10)
            r10.setVisibility(r2)
            goto L_0x0282
        L_0x02ec:
            com.instagram.common.ui.widget.imageview.CircularImageView r14 = r12.A03
            java.lang.String r15 = r1.A05
            if (r15 == 0) goto L_0x030b
            android.net.Uri r15 = X.0cp.A03(r15)
            X.0qQ.A0B(r15, r2)
            com.instagram.common.typedurl.SimpleImageUrl r15 = X.C253833rU.A00(r15, r0, r0)
            X.0iw r0 = r6.A06
            r14.setUrl(r15, r0)
        L_0x0302:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r12.A01
            r0.setVisibility(r3)
            r14.setVisibility(r2)
            goto L_0x0324
        L_0x030b:
            java.lang.Object r0 = r1.A04
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r14.setImageDrawable(r0)
            goto L_0x0302
        L_0x0313:
            com.instagram.common.ui.base.IgSimpleImageView r14 = r12.A01
            android.graphics.drawable.Drawable r0 = r9.getDrawable(r15)
            r14.setImageDrawable(r0)
            r14.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r12.A03
            r0.setVisibility(r3)
        L_0x0324:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r12.A04
            goto L_0x02cc
        L_0x0327:
            X.OG6 r12 = r4.A0J
            goto L_0x029b
        L_0x032b:
            X.OG6 r12 = r4.A0I
            goto L_0x029b
        L_0x032f:
            r9 = 0
            goto L_0x01c0
        L_0x0332:
            r14 = 0
            goto L_0x01ba
        L_0x0335:
            r12 = 0
            goto L_0x0193
        L_0x0338:
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x038c
            java.util.List r13 = r5.A0K
            if (r13 == 0) goto L_0x037b
            int r0 = r13.size()
            if (r0 <= r7) goto L_0x037b
            android.view.ViewStub r14 = r4.A01
            if (r14 == 0) goto L_0x037b
            X.0Tu r15 = X.0Tu.A05
            r0 = 36327670908205671(0x810fd300003a67, double:3.0371035899142254E-306)
            boolean r0 = X.182.A06(r15, r8, r0)
            if (r0 == 0) goto L_0x037b
            r11.setVisibility(r3)
            r11.setGradientSpinnerVisible(r2)
            android.view.ViewParent r0 = r14.getParent()
            if (r0 == 0) goto L_0x036b
            android.view.View r0 = r14.inflate()
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r0 = (com.instagram.igds.components.faceswarm.IgdsFaceSwarm) r0
            r6.A02 = r0
        L_0x036b:
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r1 = r6.A02
            if (r1 == 0) goto L_0x0138
            r1.setVisibility(r2)
            r1.A08 = r2
            X.0iw r0 = r6.A06
            r1.setImageUrls(r13, r0)
            goto L_0x0138
        L_0x037b:
            X.0iw r13 = r6.A06
            X.0eP r0 = r5.A0M
            java.lang.Object r1 = r0.A00
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.Object r0 = r0.A01
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r11.A0G(r12, r13, r1, r0)
            goto L_0x0138
        L_0x038c:
            android.view.ViewStub r0 = r4.A01
            if (r0 == 0) goto L_0x0393
            r0.setVisibility(r3)
        L_0x0393:
            r11.setVisibility(r2)
            X.0eP r0 = r5.A0M
            java.lang.Object r1 = r0.A00
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            X.0iw r0 = r6.A06
            r11.A0F(r12, r0, r1)
            goto L_0x0138
        L_0x03a3:
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r11 = r4.A0L
            r11.setVisibility(r2)
            android.widget.FrameLayout r0 = r4.A02
            r0.setVisibility(r3)
            goto L_0x00fa
        L_0x03af:
            r1 = 8
            goto L_0x00b1
        L_0x03b3:
            r0.setVisibility(r3)
            goto L_0x0081
        L_0x03b8:
            android.widget.TextView r0 = r4.A06
            r0.setVisibility(r3)
            goto L_0x0075
        L_0x03bf:
            X.3t3 r1 = r5.A05
            if (r1 != 0) goto L_0x0442
            java.lang.Boolean r0 = r5.A07
            if (r0 == 0) goto L_0x03cd
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0442
        L_0x03cd:
            android.widget.TextView r7 = r4.A09
            r0 = 2
            r7.setMaxLines(r0)
            java.lang.String r0 = r5.A0J
            r24 = r0
            boolean r0 = r5.A0W
            if (r0 == 0) goto L_0x03e2
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.Jw4 r8 = new X.Jw4
            r8.<init>((java.lang.Integer) r0)
        L_0x03e2:
            r0 = r24
            X.C46334Dcc.A00(r7, r8, r0, r2)
            X.2eb r11 = r4.A0A
            X.7Wx r0 = r6.A0A
            X.7XZ r0 = (X.AnonymousClass7XZ) r0
            X.JwA r12 = r0.BA5()
            if (r1 == 0) goto L_0x0405
            int r1 = r5.A01
            r0 = 29
            if (r1 == r0) goto L_0x0424
            r0 = 32
            if (r1 == r0) goto L_0x0414
            r0 = 47
            if (r1 == r0) goto L_0x0424
            r0 = 62
            if (r1 == r0) goto L_0x0414
        L_0x0405:
            r0 = 8
        L_0x0407:
            r11.A03(r0)
            android.widget.TextView r0 = r4.A07
            r0.setVisibility(r3)
            X.C46445Df7.A00(r10, r9)
            goto L_0x0082
        L_0x0414:
            X.9HC r0 = r6.A0B
            X.0eM r0 = r0.A10
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0405
        L_0x0424:
            int r8 = r12.A01
            if (r8 == 0) goto L_0x0405
            android.view.View r1 = r11.A01()
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r0 = r1.getContext()
            java.lang.String r0 = r0.getString(r8)
            r1.setText(r0)
            java.lang.Object r0 = r12.A02
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            X.AnonymousClass0fU.A00(r0, r1)
            r0 = 0
            goto L_0x0407
        L_0x0442:
            r9 = 0
            goto L_0x03cd
        L_0x0444:
            android.widget.LinearLayout r0 = r4.A03
            r0.setVisibility(r3)
        L_0x0449:
            java.lang.String r10 = r5.A0C
            r9 = 8
            if (r10 == 0) goto L_0x05cb
            boolean r0 = r5.A0Q
            if (r0 != 0) goto L_0x05cb
            android.widget.TextView r1 = r4.A05
            r1.setText(r10)
            X.ANf r0 = new X.ANf
            r0.<init>(r6, r5)
            X.AnonymousClass0fU.A00(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0479
            if (r21 != 0) goto L_0x0479
            if (r17 == 0) goto L_0x05c3
            X.3t3 r0 = r5.A05
            if (r0 == 0) goto L_0x05c3
        L_0x046e:
            boolean r0 = r6.A01(r5)
            if (r0 != 0) goto L_0x0479
            boolean r0 = r5.A0O
            if (r0 != 0) goto L_0x0479
            r9 = 0
        L_0x0479:
            r1.setVisibility(r9)
            if (r11 == 0) goto L_0x05e8
            if (r17 != 0) goto L_0x05e8
            X.17i r1 = X.17h.A00(r8)
            java.lang.String r0 = r11.A03
            com.instagram.user.model.User r9 = r1.A02(r0)
            if (r9 == 0) goto L_0x05cf
            X.4Cl r0 = r9.A03
            X.3Sk r0 = r0.BcS()
            if (r0 == 0) goto L_0x05cf
            X.4Cl r0 = r9.A03
            X.3Sk r0 = r0.BcS()
            java.util.List r0 = r0.BcT()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x05cf
            X.0Tu r10 = X.0Tu.A05
            r0 = 36318230570145803(0x81073d0001180b, double:3.0311334821119746E-306)
            boolean r0 = X.182.A06(r10, r8, r0)
            if (r0 == 0) goto L_0x05cf
            android.widget.TextView r10 = r4.A04
            X.4Cl r0 = r9.A03
            X.3Sk r0 = r0.BcS()
            if (r0 == 0) goto L_0x04c8
            java.util.List r0 = r0.BcT()
            int r1 = r0.size()
            r0 = 2131976616(0x7f1361a8, float:1.9590358E38)
            if (r1 > r7) goto L_0x04cb
        L_0x04c8:
            r0 = 2131976617(0x7f1361a9, float:1.959036E38)
        L_0x04cb:
            r10.setText(r0)
            X.4kA r11 = X.AnonymousClass4k9.A00(r8)
            X.0s0 r12 = r11.A0N
            X.0YZ[] r1 = X.AnonymousClass4kA.A0c
            r0 = 17
            r0 = r1[r0]
            java.lang.Object r0 = r12.CDM(r11, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x051e
            X.5Gv r0 = r6.A03
            if (r0 != 0) goto L_0x051e
            android.app.Activity r12 = r6.A05
            r0 = 2131960700(0x7f13237c, float:1.9558076E38)
            java.lang.String r1 = r12.getString(r0)
            X.6jx r0 = new X.6jx
            r0.<init>((java.lang.CharSequence) r1)
            X.5Gt r1 = new X.5Gt
            r1.<init>(r12, r0)
            X.2fy r0 = X.C226262fy.BELOW_ANCHOR
            r1.A06(r0)
            r1.A03(r10)
            r1.A0A = r7
            X.ELk r0 = new X.ELk
            r0.<init>(r6, r11)
            r1.A04 = r0
            X.5Gv r0 = r1.A00()
            r6.A03 = r0
            X.FqF r11 = new X.FqF
            r11.<init>(r6)
            r0 = 1000(0x3e8, double:4.94E-321)
            r10.postDelayed(r11, r0)
        L_0x051e:
            X.FMz r0 = new X.FMz
            r0.<init>(r6, r9)
            X.AnonymousClass0fU.A00(r0, r10)
            int r0 = r10.getVisibility()
            if (r0 != r3) goto L_0x05e5
            X.6ud r3 = X.C321706uc.A00(r8)
            X.0wc r11 = r3.A01
            java.lang.String r1 = "instagram_ibc_profile_actions"
            X.0kJ r0 = r11.A00
            X.0Aj r11 = r11.A00(r0, r1)
            boolean r0 = r11.isSampled()
            if (r0 == 0) goto L_0x05e5
            X.C321716ud.A03(r3)
            java.lang.String r1 = "instagram"
            r0 = 1668(0x684, float:2.337E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r11.AAJ(r0, r1)
            java.lang.String r1 = "dm_thread_view"
            java.lang.String r0 = "surface"
            r11.AAJ(r0, r1)
            java.lang.String r1 = "view_channel_button"
            java.lang.String r0 = "source"
            r11.AAJ(r0, r1)
            java.lang.String r1 = "impression"
            java.lang.String r0 = "action"
            r11.AAJ(r0, r1)
            java.lang.String r1 = "channel_upsell_button_rendered"
            java.lang.String r0 = "event"
            r11.AAJ(r0, r1)
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "actor_id"
            r11.AAJ(r0, r1)
            com.instagram.user.model.FollowStatus r1 = r9.B6o()
            java.lang.String r0 = r9.getId()
            java.lang.String r1 = X.C321716ud.A01(r3, r1, r0)
            java.lang.String r0 = "follower_status"
            r11.AAJ(r0, r1)
            X.17M r1 = r9.A02
            java.lang.String r0 = r9.getId()
            java.lang.String r1 = X.C321716ud.A02(r3, r1, r0)
            java.lang.String r0 = "subscriber_status"
            r11.AAJ(r0, r1)
            java.lang.String r0 = r9.getId()
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "profile_user_igid"
            r11.A9F(r0, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r0 = "extra"
            r11.A9H(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "is_test_user"
            r11.A7p(r0, r1)
            java.lang.String r9 = r3.A00
            if (r9 != 0) goto L_0x05d5
            java.lang.String r0 = "sessionId"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x05c3:
            if (r11 == 0) goto L_0x0479
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x0479
            goto L_0x046e
        L_0x05cb:
            android.widget.TextView r1 = r4.A05
            goto L_0x0479
        L_0x05cf:
            android.widget.TextView r0 = r4.A04
            r0.setVisibility(r3)
            goto L_0x05e8
        L_0x05d5:
            r3 = 114(0x72, float:1.6E-43)
            r1 = 10
            r0 = 118(0x76, float:1.65E-43)
            java.lang.String r0 = X.DcV.A02(r3, r1, r0)
            r11.AAJ(r0, r9)
            r11.Cgf()
        L_0x05e5:
            r10.setVisibility(r2)
        L_0x05e8:
            java.lang.Integer r1 = r5.A0A
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x068a
            android.widget.TextView r4 = r4.A08
            android.content.Context r10 = r4.getContext()
            android.content.res.Resources r3 = r10.getResources()
            r1 = 2131969751(0x7f1346d7, float:1.9576434E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r24}
            java.lang.String r3 = r3.getString(r1, r0)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131969752(0x7f1346d8, float:1.9576436E38)
            java.lang.String r9 = r1.getString(r0)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r3)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            android.text.SpannableStringBuilder r3 = r0.append(r9)
            r0 = 2130970246(0x7f040686, float:1.7549197E38)
            int r0 = X.2Yu.A0H(r10, r0)
            int r0 = r10.getColor(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.ESh r0 = new X.ESh
            r0.<init>(r6, r1)
            X.AnonymousClass7AV.A05(r3, r0, r9)
            r4.setVisibility(r2)
            r4.setText(r3)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r4.setMovementMethod(r0)
        L_0x0641:
            X.0iw r0 = r6.A06
            X.0qQ.A0B(r0, r7)
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r8)
            java.lang.String r1 = "privacy_disclosure_open_click"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            java.lang.String r1 = "privacy_disclosure_impression"
            java.lang.String r0 = "action"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x065c:
            X.7Gz r0 = r6.A08
            boolean r3 = r5.A0R
            X.0wc r2 = r0.A00
            java.lang.String r1 = "msg_null_thread_impression"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0689
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "is_xac_thread"
            r2.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            r0 = 140(0x8c, float:1.96E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.A7p(r0, r1)
            r2.Cgf()
        L_0x0689:
            return
        L_0x068a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x065c
            android.widget.TextView r4 = r4.A08
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources r3 = r0.getResources()
            r1 = 2131957192(0x7f1315c8, float:1.955096E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r24}
            java.lang.String r0 = r3.getString(r1, r0)
            r4.setVisibility(r2)
            r4.setText(r0)
            goto L_0x0641
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74j.bind(X.2tL, X.3kE):void");
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C68062MzT(layoutInflater.inflate(R.layout.direct_thread_context_lines, viewGroup, false));
    }

    public final Class modelClass() {
        return AnonymousClass79E.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r2) {
        ((AnonymousClass7TQ) this.A0A).DuT();
        this.A01 = null;
    }

    public AnonymousClass74j(Activity activity, AnonymousClass0iw r3, UserSession userSession, C328967Gz r5, C3258274h r6, C332907Wx r7, AnonymousClass9HC r8, AnonymousClass7L2 r9, AnonymousClass9HS r10) {
        this.A05 = activity;
        this.A07 = userSession;
        this.A0A = r7;
        this.A0B = r8;
        this.A06 = r3;
        this.A0C = r9;
        this.A08 = r5;
        this.A0D = r10;
        this.A09 = r6;
    }
}
