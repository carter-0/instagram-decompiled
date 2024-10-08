package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.MzE  reason: case insensitive filesystem */
public final class C68047MzE extends C249703kE {
    public C68852NZk A00;
    public String A01;
    public final View A02;
    public final UserSession A03;
    public final IgTextView A04;
    public final CircularImageView A05;
    public final C252063oV A06;
    public final C252063oV A07;
    public final C252063oV A08;
    public final C252063oV A09;
    public final C252063oV A0A;
    public final C252063oV A0B;
    public final C252063oV A0C;
    public final OE1 A0D;
    public final MediaFrameLayout A0E;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.0bY] */
    /* JADX WARNING: type inference failed for: r6v4, types: [X.NZk, X.7Di, android.view.View$OnTouchListener] */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0243, code lost:
        if (r0 == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0245, code lost:
        r9 = r3.getContext();
        r1 = X.AnonymousClass7TE.A16(r9, 2131958884);
        r5 = X.DbV.A0u(r9, r5, r1, 2131964456);
        X.0qQ.A07(r5);
        r4 = X.00l.A08(r5, r1, 0, false);
        r0 = X.0mp.A06;
        r1 = r5.length();
        r5 = X.C66580MXl.A0D(r5);
        r5.setSpan(new android.text.style.StyleSpan(1), r4, r1, 33);
        r5.setSpan(X.C66580MXl.A0E(X.AnonymousClass7TF.A03(r9, com.instagram.android.R.attr.igds_color_list_badge)), r4, r1, 33);
        r5 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(androidx.fragment.app.Fragment r13, X.C71979OuB r14, X.C67743Mtw r15) {
        /*
            r12 = this;
            r11 = 0
            android.view.View r3 = r12.A02
            boolean r1 = r14.A0E
            r2 = 1065353216(0x3f800000, float:1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x000d
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x000d:
            r3.setAlpha(r0)
            r10 = 1
            r3.setEnabled(r10)
            X.NZk r0 = r12.A00
            if (r0 != 0) goto L_0x0046
            X.OE1 r6 = r12.A0D
            if (r6 == 0) goto L_0x0046
            r0 = 3
            X.P88 r5 = new X.P88
            r5.<init>(r6, r0)
            X.P8R r4 = new X.P8R
            r4.<init>(r6)
            X.O86 r1 = new X.O86
            r1.<init>(r6)
            X.7XA r0 = r6.A01
            X.P9Z r8 = new X.P9Z
            r8.<init>(r0)
            android.view.View r7 = X.JTO.A0F(r12)
            X.PA6 r9 = new X.PA6
            r9.<init>(r5, r4, r1, r12)
            X.NZk r6 = new X.NZk
            r6.<init>(r7, r8, r9, r10, r11)
            r12.A00 = r6
            r3.setOnTouchListener(r6)
        L_0x0046:
            X.NZk r0 = r12.A00
            if (r0 == 0) goto L_0x004c
            r0.A00 = r14
        L_0x004c:
            com.instagram.user.model.User r7 = r14.A03
            if (r7 == 0) goto L_0x008a
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r12.A05
            com.instagram.common.typedurl.ImageUrl r1 = r7.Bh3()
            r0 = r13
            X.0iw r0 = (X.AnonymousClass0iw) r0
            r4.setUrl(r1, r0)
            r0 = 45
            X.C71408Ok7.A00(r4, r0, r15, r7)
            com.instagram.common.ui.base.IgTextView r6 = r12.A04
            java.lang.String r5 = r7.getUsername()
            boolean r1 = r14.A0A
            boolean r0 = r14.A0B
            if (r1 == 0) goto L_0x0243
            android.content.Context r4 = r3.getContext()
            r0 = 2131958876(0x7f131c5c, float:1.9554377E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r4, r0)
            r0 = 2131964456(0x7f133228, float:1.9565694E38)
            java.lang.String r5 = X.DbV.A0u(r4, r5, r1, r0)
            X.0qQ.A0A(r5)
        L_0x0082:
            X.DbZ.A14(r6, r5)
            r0 = 46
            X.C71408Ok7.A00(r6, r0, r15, r7)
        L_0x008a:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r5 = r12.A0E
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.A00 = r0
            X.3oV r1 = r12.A09
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x0240
            android.view.View r7 = r1.getView()
            android.widget.ImageView r7 = (android.widget.ImageView) r7
        L_0x009e:
            X.N37 r6 = r14.A02
            if (r6 != 0) goto L_0x00a6
            X.Jw3 r0 = r14.A01
            if (r0 == 0) goto L_0x0213
        L_0x00a6:
            com.instagram.common.session.UserSession r0 = r12.A03
            boolean r0 = X.AnonymousClass7K4.A01(r0)
            if (r0 == 0) goto L_0x0213
            com.instagram.common.ui.base.IgTextView r1 = r12.A04
            android.content.Context r8 = r3.getContext()
            r0 = 2130970279(0x7f0406a7, float:1.7549264E38)
            X.JTS.A0u(r8, r1, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r12.A05
            int r3 = X.JTR.A08(r8)
            android.content.Context r1 = X.DbS.A07(r12)
            r0 = 2130970345(0x7f0406e9, float:1.7549398E38)
            int r0 = X.AnonymousClass7TF.A03(r1, r0)
            r4.A0H(r3, r0)
            if (r7 == 0) goto L_0x00da
            r0 = 2130970241(0x7f040681, float:1.7549187E38)
            int r0 = X.2Yu.A0F(r8, r0)
            r7.setColorFilter(r0)
        L_0x00da:
            X.3oV r0 = r12.A07
            android.view.View r1 = r0.getView()
            r0 = 0
        L_0x00e1:
            r1.setVisibility(r0)
        L_0x00e4:
            java.lang.String r1 = r14.A07
            if (r1 == 0) goto L_0x00f7
            X.3oV r0 = r12.A0B
            X.C66580MXl.A1Q(r0, r11)
            android.view.View r0 = r0.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
        L_0x00f6:
            return
        L_0x00f7:
            if (r6 == 0) goto L_0x0186
            com.instagram.common.session.UserSession r0 = r12.A03
            boolean r0 = X.AnonymousClass7K4.A01(r0)
            if (r0 == 0) goto L_0x0143
            X.3oV r3 = r12.A06
            X.C66580MXl.A1Q(r3, r11)
            java.lang.String r1 = r12.A01
            java.lang.String r0 = r14.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0138
            boolean r0 = r3.CVM()
            if (r0 == 0) goto L_0x0138
            android.view.View r7 = r3.getView()
            com.instagram.common.ui.widget.imageview.IgImageView r7 = (com.instagram.common.ui.widget.imageview.IgImageView) r7
            if (r7 == 0) goto L_0x0138
            X.N2w r0 = r6.A00
            if (r0 == 0) goto L_0x0138
            java.lang.String r4 = r0.A06
            if (r4 == 0) goto L_0x0138
            int r3 = r7.getWidth()
            int r1 = r7.getHeight()
            com.instagram.model.mediasize.ExtendedImageUrl r0 = new com.instagram.model.mediasize.ExtendedImageUrl
            r0.<init>(r4, r3, r1)
            X.0iw r13 = (X.AnonymousClass0iw) r13
            r7.setUrl(r0, r13)
        L_0x0138:
            java.lang.Float r0 = r14.A04
            if (r0 == 0) goto L_0x0140
            float r2 = r0.floatValue()
        L_0x0140:
            r5.A00 = r2
            return
        L_0x0143:
            X.3oV r7 = r12.A08
            X.C66580MXl.A1Q(r7, r11)
            java.lang.String r1 = r12.A01
            java.lang.String r0 = r14.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00f6
            boolean r0 = r7.CVM()
            if (r0 == 0) goto L_0x00f6
            android.view.View r1 = r7.getView()
            r0 = 2131435878(0x7f0b2166, float:1.849361E38)
            com.instagram.common.ui.widget.imageview.IgImageView r5 = X.DbT.A0b(r1, r0)
            if (r5 == 0) goto L_0x00f6
            X.N2w r0 = r6.A00
            if (r0 == 0) goto L_0x00f6
            java.lang.String r4 = r0.A06
            if (r4 == 0) goto L_0x00f6
            int r3 = r5.getWidth()
            int r1 = r5.getHeight()
            com.instagram.model.mediasize.ExtendedImageUrl r0 = new com.instagram.model.mediasize.ExtendedImageUrl
            r0.<init>(r4, r3, r1)
            X.0iw r13 = (X.AnonymousClass0iw) r13
            r5.setUrl(r0, r13)
            android.view.View r5 = r7.getView()
            com.instagram.ui.widget.framelayout.MediaFrameLayout r5 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r5
            goto L_0x0138
        L_0x0186:
            X.Jw3 r6 = r14.A01
            if (r6 == 0) goto L_0x00f6
            java.lang.Object r0 = r6.A02
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            java.lang.String r1 = r0.getUrl()
            X.0TC r0 = new X.0TC
            r0.<init>()
            android.net.Uri r0 = X.0cp.A00(r0, r1)
            if (r0 == 0) goto L_0x00f6
            java.lang.String r4 = r0.getPath()
            if (r4 == 0) goto L_0x00f6
            com.instagram.common.session.UserSession r0 = r12.A03
            boolean r0 = X.AnonymousClass7K4.A01(r0)
            if (r0 == 0) goto L_0x01d9
            X.3oV r3 = r12.A06
            X.C66580MXl.A1Q(r3, r11)
            java.lang.String r1 = r12.A01
            java.lang.String r0 = r14.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0138
            boolean r0 = r3.CVM()
            if (r0 == 0) goto L_0x0138
            android.view.View r7 = r3.getView()
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x0138
            int r3 = r6.A01
            int r1 = r6.A00
            int r0 = X.1MF.A00(r4)
            android.graphics.Bitmap r0 = X.1MF.A0F(r4, r3, r1, r0)
            r7.setImageBitmap(r0)
            goto L_0x0138
        L_0x01d9:
            X.3oV r3 = r12.A08
            X.C66580MXl.A1Q(r3, r11)
            android.view.View r1 = r3.getView()
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r1
            java.lang.Float r0 = r14.A04
            if (r0 == 0) goto L_0x01ec
            float r2 = r0.floatValue()
        L_0x01ec:
            r1.A00 = r2
            java.lang.String r1 = r12.A01
            java.lang.String r0 = r14.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00f6
            android.view.View r1 = r3.getView()
            r0 = 2131435878(0x7f0b2166, float:1.849361E38)
            android.widget.ImageView r3 = X.DbU.A0F(r1, r0)
            int r2 = r6.A01
            int r1 = r6.A00
            int r0 = X.1MF.A00(r4)
            android.graphics.Bitmap r0 = X.1MF.A0F(r4, r2, r1, r0)
            r3.setImageBitmap(r0)
            return
        L_0x0213:
            com.instagram.common.ui.base.IgTextView r4 = r12.A04
            android.content.Context r1 = r3.getContext()
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
            X.JTS.A0u(r1, r4, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r12.A05
            r0.setStrokeAlpha(r11)
            if (r7 == 0) goto L_0x0230
            r0 = 2130970306(0x7f0406c2, float:1.7549318E38)
            int r0 = X.2Yu.A0F(r1, r0)
            r7.setColorFilter(r0)
        L_0x0230:
            X.3oV r1 = r12.A07
            boolean r0 = r1.CVM()
            if (r0 == 0) goto L_0x00e4
            android.view.View r1 = r1.getView()
            r0 = 8
            goto L_0x00e1
        L_0x0240:
            r7 = 0
            goto L_0x009e
        L_0x0243:
            if (r0 == 0) goto L_0x0082
            android.content.Context r9 = r3.getContext()
            r0 = 2131958884(0x7f131c64, float:1.9554393E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r9, r0)
            r0 = 2131964456(0x7f133228, float:1.9565694E38)
            java.lang.String r5 = X.DbV.A0u(r9, r5, r1, r0)
            X.0qQ.A07(r5)
            int r4 = X.00l.A08(r5, r1, r11, r11)
            java.util.regex.Pattern r0 = X.0mp.A06
            int r1 = r5.length()
            android.text.SpannableString r5 = X.C66580MXl.A0D(r5)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r10)
            r8 = 33
            r5.setSpan(r0, r4, r1, r8)
            r0 = 2130970250(0x7f04068a, float:1.7549205E38)
            int r0 = X.AnonymousClass7TF.A03(r9, r0)
            android.text.style.ForegroundColorSpan r0 = X.C66580MXl.A0E(r0)
            r5.setSpan(r0, r4, r1, r8)
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68047MzE.A00(androidx.fragment.app.Fragment, X.OuB, X.Mtw):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68047MzE(View view, UserSession userSession, OE1 oe1) {
        super(view);
        AnonymousClass7TG.A1O(view, userSession);
        this.A02 = view;
        this.A03 = userSession;
        this.A0D = oe1;
        this.A0E = (MediaFrameLayout) AnonymousClass7TF.A0F(view, R.id.card);
        this.A05 = DbX.A0a(view, R.id.profile_picture);
        this.A04 = DbX.A0Z(view, R.id.username);
        this.A0B = DbU.A0Z(view, R.id.text);
        this.A07 = DbU.A0Z(view, R.id.media_overlay_gradient);
        this.A06 = DbU.A0Z(view, R.id.full_bleed_media);
        this.A08 = DbU.A0Z(view, R.id.media_container);
        this.A09 = DbU.A0Z(view, R.id.overflow_menu);
        this.A0C = DbU.A0Z(view, R.id.upvote_pill);
        this.A0A = DbU.A0Z(view, R.id.reply_pill);
    }
}
