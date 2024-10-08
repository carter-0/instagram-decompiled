package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;

/* renamed from: X.74R  reason: invalid class name */
public final class AnonymousClass74R implements AnonymousClass7D2 {
    public boolean A00;
    public AnonymousClass9HC A01;
    public Integer A02;
    public AnonymousClass0eK A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final C332827Wn A06;
    public final AnonymousClass7DZ A07;
    public final MYd A08;
    public final C331037Pg A09;
    public final boolean A0A;
    public final boolean A0B;

    private void A00(TextView textView) {
        Integer num = this.A02;
        if (this.A0B && num != null) {
            textView.setTextColor(num.intValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b1, code lost:
        if (X.182.A06(X.0Tu.A05, r8.A05, 36321245637190849L) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass0iw r14, com.instagram.common.typedurl.ImageUrl r15, X.AnonymousClass74R r16, X.AnonymousClass776 r17, com.instagram.feed.widget.IgProgressImageView r18, com.instagram.model.direct.messageid.DirectMessageIdentifier r19, boolean r20, boolean r21, boolean r22) {
        /*
            r6 = r19
            X.2FW r1 = r6.A01
            X.2FW r0 = X.2FW.A0J
            r5 = 0
            r4 = r18
            r8 = r16
            if (r1 == r0) goto L_0x000f
            if (r22 == 0) goto L_0x00a2
        L_0x000f:
            X.9HC r0 = r8.A01
            X.0eM r0 = r0.A0N
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00a2
        L_0x001f:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.getIgImageView()
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            boolean r0 = r1 instanceof X.C321016tR
            if (r0 == 0) goto L_0x0037
            X.6tR r1 = (X.C321016tR) r1
            java.lang.String r1 = r1.A0k
            java.lang.String r0 = r6.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008d
        L_0x0037:
            r2 = r17
            java.lang.Integer r0 = r2.A05
            if (r0 == 0) goto L_0x009f
            android.content.Context r1 = r4.getContext()
            int r0 = r0.intValue()
            float r0 = X.0nA.A04(r1, r0)
            int r3 = (int) r0
        L_0x004a:
            java.lang.Integer r0 = r2.A04
            if (r0 == 0) goto L_0x009c
            android.content.Context r1 = r4.getContext()
            int r0 = r0.intValue()
            float r0 = X.0nA.A04(r1, r0)
            int r2 = (int) r0
        L_0x005b:
            android.content.Context r9 = r4.getContext()
            com.instagram.common.session.UserSession r10 = r8.A05
            java.lang.String r12 = r15.getUrl()
            r11 = 0
            java.lang.String r14 = r6.A00
            X.0qQ.A0B(r9, r5)
            r1 = 1
            X.0qQ.A0B(r10, r1)
            r0 = 2
            X.0qQ.A0B(r12, r0)
            r18 = r20
            r13 = r11
            r15 = r11
            r21 = r1
            r22 = r5
            r17 = r3
            r19 = r1
            r20 = r5
            r16 = r2
            android.graphics.drawable.Drawable r0 = X.C320996tP.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r4.setEnableProgressBar(r5)
            r4.setImageDrawable(r0)
        L_0x008d:
            android.content.Context r1 = r4.getContext()
            r0 = 2131958639(0x7f131b6f, float:1.9553896E38)
            java.lang.String r0 = r1.getString(r0)
            r4.setContentDescription(r0)
            return
        L_0x009c:
            r2 = 330(0x14a, float:4.62E-43)
            goto L_0x005b
        L_0x009f:
            r3 = 330(0x14a, float:4.62E-43)
            goto L_0x004a
        L_0x00a2:
            if (r21 == 0) goto L_0x00b5
            com.instagram.common.session.UserSession r3 = r8.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321245637190849(0x8109fb000124c1, double:3.033040222651962E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00b5
            goto L_0x001f
        L_0x00b5:
            r4.setUrl(r15, r14)
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74R.A01(X.0iw, com.instagram.common.typedurl.ImageUrl, X.74R, X.776, com.instagram.feed.widget.IgProgressImageView, com.instagram.model.direct.messageid.DirectMessageIdentifier, boolean, boolean, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.instagram.common.ui.widget.imageview.CircularImageView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(X.AnonymousClass0iw r27, X.AnonymousClass77D r28, X.C332827Wn r29, X.AnonymousClass9HC r30, X.C3257073v r31, X.AnonymousClass776 r32, com.instagram.model.direct.messageid.DirectMessageIdentifier r33, com.instagram.model.mediasize.ImageInfo r34, java.lang.String r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40) {
        /*
            r26 = this;
            r9 = r29
            r25 = r31
            r0 = r25
            X.2eb r0 = r0.A0G
            android.view.View r10 = r0.A01()
            com.instagram.ui.widget.framelayout.MediaFrameLayout r10 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r10
            r0 = 2131434002(0x7f0b1a12, float:1.8489806E38)
            android.view.View r1 = r10.findViewById(r0)
            r0 = 0
            r18 = r39
            if (r1 == 0) goto L_0x0020
            if (r39 != 0) goto L_0x001d
            r0 = 4
        L_0x001d:
            r1.setVisibility(r0)
        L_0x0020:
            X.744 r6 = r25.A03()
            com.instagram.feed.widget.IgProgressImageView r5 = r6.A04
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r6.A00
            com.instagram.feed.widget.IgProgressImageView r8 = r6.A05
            r3 = 8
            r5.setVisibility(r3)
            r4.setVisibility(r3)
            r8.setVisibility(r3)
            android.view.View r16 = r25.BJd()
            android.view.ViewGroup$LayoutParams r1 = r16.getLayoutParams()
            android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
            r7 = r32
            if (r1 == 0) goto L_0x007a
            if (r2 == 0) goto L_0x007a
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r7.A01
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0291
            r0 = -2
            r1.width = r0
            java.lang.Integer r0 = r7.A05
            if (r0 == 0) goto L_0x0067
            android.content.Context r1 = r10.getContext()
            int r0 = r0.intValue()
            float r0 = X.0nA.A04(r1, r0)
            int r0 = (int) r0
            r2.width = r0
        L_0x0067:
            java.lang.Integer r0 = r7.A04
            if (r0 == 0) goto L_0x007a
            android.content.Context r1 = r10.getContext()
            int r0 = r0.intValue()
            float r0 = X.0nA.A04(r1, r0)
            int r0 = (int) r0
        L_0x0078:
            r2.height = r0
        L_0x007a:
            if (r39 == 0) goto L_0x0279
            X.744 r0 = r25.A03()
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r11 = r0.A06
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            r0 = -1
            r1.width = r0
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            boolean r0 = r0 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x009b
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.weight = r0
        L_0x009b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x009d:
            r10.A00 = r0
            com.instagram.common.typedurl.ImageUrl r12 = r7.A00
            r17 = r12
            r13 = r30
            r11 = r34
            if (r34 == 0) goto L_0x00c2
            X.0eM r1 = r13.A0z
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00c2
            int r10 = r2.width
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            com.instagram.model.mediasize.ExtendedImageUrl r1 = X.1iI.A05(r11, r1, r10)
            if (r1 == 0) goto L_0x00c2
            r12 = r1
        L_0x00c2:
            boolean r1 = X.C253833rU.A02(r12)
            if (r1 != 0) goto L_0x026d
            r1 = 0
            r19 = r40
            r15 = r33
            if (r39 == 0) goto L_0x0220
            r4.setVisibility(r1)
        L_0x00d2:
            java.lang.String r0 = r12.getUrl()
            boolean r13 = android.webkit.URLUtil.isContentUrl(r0)
            r24 = r38
            r10 = r27
            r11 = r26
            if (r13 != 0) goto L_0x016b
            boolean r13 = android.webkit.URLUtil.isFileUrl(r0)
            if (r13 != 0) goto L_0x016b
            X.2FW r14 = r15.A01
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r24)
            boolean r13 = A05(r14, r13)
            if (r13 != 0) goto L_0x016b
            if (r36 == 0) goto L_0x0159
            java.lang.String r2 = ".webp"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0159
            if (r39 == 0) goto L_0x0150
            android.graphics.drawable.Drawable r2 = r4.getDrawable()
        L_0x0104:
            boolean r2 = r2 instanceof X.C321016tR
            if (r2 != 0) goto L_0x012c
            android.content.Context r8 = r16.getContext()
            com.instagram.common.session.UserSession r9 = r11.A05
            java.lang.Integer r2 = r7.A05
            r13 = 124(0x7c, float:1.74E-43)
            if (r2 == 0) goto L_0x014d
            int r12 = r2.intValue()
        L_0x0118:
            java.lang.Integer r2 = r7.A04
            if (r2 == 0) goto L_0x0120
            int r13 = r2.intValue()
        L_0x0120:
            r10 = r35
            r11 = r0
            X.NdJ r0 = X.C70013Nvr.A00(r8, r9, r10, r11, r12, r13)
            if (r39 == 0) goto L_0x0146
            r4.setImageDrawable(r0)
        L_0x012c:
            r1 = 0
        L_0x012d:
            java.lang.Integer r2 = r7.A03
            X.3oV r0 = r6.A03
            if (r2 == 0) goto L_0x0299
            r0.setVisibility(r1)
            X.0eM r0 = r6.A07
            java.lang.Object r1 = r0.getValue()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r0 = r2.intValue()
            r1.setImageResource(r0)
            return
        L_0x0146:
            r5.setEnableProgressBar(r1)
            r5.setImageDrawable(r0)
            goto L_0x012c
        L_0x014d:
            r12 = 124(0x7c, float:1.74E-43)
            goto L_0x0118
        L_0x0150:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r5.getIgImageView()
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            goto L_0x0104
        L_0x0159:
            if (r39 == 0) goto L_0x015f
            r4.setUrl(r12, r10)
            goto L_0x012c
        L_0x015f:
            com.instagram.common.session.UserSession r0 = r11.A05
            if (r40 == 0) goto L_0x0167
            r8.setUrl(r0, r12, r10)
            goto L_0x012c
        L_0x0167:
            r5.setUrl(r0, r12, r10)
            goto L_0x012c
        L_0x016b:
            X.2FW r13 = r15.A01
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r24)
            boolean r12 = A05(r13, r12)
            if (r12 == 0) goto L_0x01bb
            boolean r2 = X.C66834MdS.A08(r0)
            r4.setVisibility(r3)
            r8.setVisibility(r3)
            r23 = r37
            if (r2 == 0) goto L_0x01a7
            r5.setVisibility(r1)
            X.7X5 r9 = (X.AnonymousClass7X5) r9
            X.P94 r1 = new X.P94
            r16 = r10
            r17 = r11
            r18 = r25
            r19 = r7
            r20 = r5
            r21 = r15
            r22 = r23
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            X.O6r r1 = r9.Cg8(r1, r0)
            r0 = r25
            r0.A00 = r1
            goto L_0x012c
        L_0x01a7:
            r5.setVisibility(r1)
            r18 = r11
            r19 = r7
            r20 = r5
            r21 = r15
            r22 = r1
            r16 = r10
            A01(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x012c
        L_0x01bb:
            X.MYd r12 = r11.A08
            java.lang.String r11 = r12.A00(r0)
            if (r11 == 0) goto L_0x0205
            if (r39 == 0) goto L_0x01d8
            r5.setVisibility(r3)
            r8.setVisibility(r3)
            r4.setVisibility(r1)
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r11)
            r4.setUrl(r0, r10)
            goto L_0x012c
        L_0x01d8:
            if (r40 == 0) goto L_0x01f2
            r5.setVisibility(r3)
            r4.setVisibility(r3)
            r8.setVisibility(r1)
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r11)
            r8.setUrl(r0, r10)
            int r0 = r2.width
            X.I7E.A06(r8, r0)
            goto L_0x012c
        L_0x01f2:
            r4.setVisibility(r3)
            r8.setVisibility(r3)
            r5.setVisibility(r1)
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r11)
            r5.setUrl(r0, r10)
            goto L_0x012c
        L_0x0205:
            boolean r1 = r12.A02(r0)
            if (r1 != 0) goto L_0x012c
            r12.A01(r0)
            r1 = 0
            X.P9D r12 = new X.P9D
            r13 = r2
            r14 = r10
            r15 = r4
            r16 = r5
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r9.CgK(r12, r0)
            goto L_0x012d
        L_0x0220:
            if (r40 == 0) goto L_0x022c
            r8.setVisibility(r1)
            int r0 = r2.width
            X.I7E.A06(r8, r0)
            goto L_0x00d2
        L_0x022c:
            r5.setVisibility(r1)
            r5.setAspectRatio(r0)
            X.2FW r10 = r15.A01
            X.2FW r0 = X.2FW.A1v
            r11 = r28
            if (r10 == r0) goto L_0x0242
            X.2FW r0 = X.2FW.A1s
            if (r10 == r0) goto L_0x0242
            X.2FW r0 = X.2FW.A1E
            if (r10 != r0) goto L_0x0268
        L_0x0242:
            X.0eM r0 = r13.A0m
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0268
            X.7Qg r13 = r11.A04
            android.content.Context r10 = r5.getContext()
            r0 = 2130970330(0x7f0406da, float:1.7549367E38)
            int r0 = X.2Yu.A0H(r10, r0)
            int r10 = r10.getColor(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            r13.A02(r10, r0, r1)
            r11.A03 = r1
        L_0x0268:
            r5.setPostProcessor(r11)
            goto L_0x00d2
        L_0x026d:
            r1 = 0
            r4.setVisibility(r3)
            r5.setVisibility(r3)
            r8.setVisibility(r3)
            goto L_0x012d
        L_0x0279:
            r11 = 1061997773(0x3f4ccccd, float:0.8)
            java.lang.Float r0 = r7.A02
            r1 = 1072986849(0x3ff47ae1, float:1.91)
            if (r0 == 0) goto L_0x028b
            float r0 = r0.floatValue()
            float r1 = java.lang.Math.min(r1, r0)
        L_0x028b:
            float r0 = java.lang.Math.max(r11, r1)
            goto L_0x009d
        L_0x0291:
            int r0 = r1.width
            r2.width = r0
            int r0 = r1.height
            goto L_0x0078
        L_0x0299:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74R.A02(X.0iw, X.77D, X.7Wn, X.9HC, X.73v, X.776, com.instagram.model.direct.messageid.DirectMessageIdentifier, com.instagram.model.mediasize.ImageInfo, java.lang.String, boolean, boolean, boolean, boolean, boolean):void");
    }

    private void A04(AnonymousClass743 r14, C328667Fr r15) {
        String str;
        C331037Pg r4 = this.A09;
        if (r4 != null) {
            IgImageView igImageView = r14.A00;
            AnonymousClass9J0 r0 = r15.A05;
            if (r0 == null || (str = r0.A01) == null || (r15.A0g && !str.matches("^https://p.scdn.co/mp3-preview/.*$"))) {
                igImageView.setVisibility(8);
                return;
            }
            C71090Oc5 A002 = C71090Oc5.A0C.A00(igImageView);
            igImageView.setVisibility(0);
            DirectMessageIdentifier directMessageIdentifier = r15.A0L;
            float f = 0.0f;
            C21297XTr xTr = (C21297XTr) r4.A0B.A01(directMessageIdentifier);
            if (xTr != null) {
                f = ((float) xTr.A00) / ((float) xTr.A01);
            }
            A002.A01.cancel();
            C71090Oc5.A01(A002, f);
            if (r4.A0E(directMessageIdentifier)) {
                A002.A04();
            } else {
                A002.A03();
            }
            AnonymousClass7L2 r02 = r15.A0C.A03;
            0qQ.A0B(r02, 0);
            int[] iArr = r02.A06.A0B;
            Context context = A002.A06;
            float dimension = context.getResources().getDimension(R.dimen.afi_indicator_arrow_margin_top);
            int length = iArr.length;
            ShapeDrawable shapeDrawable = A002.A07;
            if (length > 1) {
                C308486Ul.A01((Bitmap) null, Paint.Cap.ROUND, Paint.Style.STROKE, shapeDrawable, shapeDrawable.getShape(), iArr, (float) new AnonymousClass7I8(context).A00(), dimension);
                A002.A02 = true;
            } else {
                C308486Ul.A02(Paint.Style.STROKE, shapeDrawable, shapeDrawable.getShape(), dimension, iArr[0]);
                A002.A02 = false;
            }
            AnonymousClass0fU.A00(new C71333Oii(this, r14, r15), igImageView);
            r4.A09(r14, directMessageIdentifier);
        }
    }

    public static boolean A05(2FW r1, Boolean bool) {
        if (r1 == 2FW.A0O || r1 == 2FW.A0J) {
            return true;
        }
        if (r1 != 2FW.A0m || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: A06 */
    public final C3257073v ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean booleanValue = ((Boolean) this.A03.get()).booleanValue();
        int i = R.layout.direct_generic_xma_message;
        if (booleanValue) {
            i = R.layout.direct_generic_xma_message_optimized;
        }
        C3257073v r1 = new C3257073v(layoutInflater.inflate(i, viewGroup, false), booleanValue);
        this.A07.A00(r1);
        return r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: android.text.SpannableStringBuilder} */
    /* JADX WARNING: type inference failed for: r0v10, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v24, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v29, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v30, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v31, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v47, types: [com.instagram.common.ui.widget.imageview.CircularImageView, com.instagram.common.ui.widget.imageview.IgImageView] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0206  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(android.content.Context r14, X.AnonymousClass0iw r15, X.C3257073v r16, X.C328667Fr r17) {
        /*
            r13 = this;
            r10 = r17
            X.74T r9 = r10.A0D
            X.Jw0 r3 = r10.A09
            android.content.res.Resources r0 = r14.getResources()
            r1 = 2131165218(0x7f070022, float:1.7944647E38)
            int r2 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r14.getResources()
            int r1 = r0.getDimensionPixelSize(r1)
            r8 = 8
            r5 = r16
            if (r9 == 0) goto L_0x02b1
            if (r3 != 0) goto L_0x02b1
            X.2eb r0 = r5.A0B
            r4 = 0
            r0.A03(r4)
            android.view.View r0 = r0.A01()
            X.745 r7 = r5.A01()
            r0.setPadding(r2, r1, r2, r1)
            java.lang.CharSequence r2 = r9.A09
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 2147483647(0x7fffffff, float:NaN)
            android.widget.TextView r3 = r7.A04
            if (r0 != 0) goto L_0x02ac
            r3.setVisibility(r4)
            r3.setText(r2)
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r2 = r0.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r6 = r2.getDimensionPixelSize(r0)
            X.3tD r2 = r10.A0J
            X.3tD r0 = X.C254883tD.CIRCULAR
            if (r2 != r0) goto L_0x02a7
            int r5 = r10.A02
            r2 = 1
            if (r5 == r2) goto L_0x0063
            r0 = 4
            if (r5 == r0) goto L_0x0063
            r2 = 0
        L_0x0063:
            X.C244273av.A0A(r3, r6, r2)
        L_0x0066:
            r13.A00(r3)
            int r0 = r9.A00
            if (r0 <= 0) goto L_0x02a2
            r3.setMaxLines(r0)
        L_0x0070:
            java.lang.CharSequence r6 = r9.A05
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r5 = 1
            r11 = 2
            android.widget.TextView r2 = r7.A02
            if (r0 != 0) goto L_0x029d
            r2.setVisibility(r4)
            int r0 = r10.A02
            if (r0 != r11) goto L_0x0298
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r6)
            X.C244273av.A08(r14, r0, r5)
            r2.setText(r0)
        L_0x008e:
            r13.A00(r2)
            java.lang.Integer r0 = r9.A0A
            if (r0 == 0) goto L_0x0293
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0293
            r2.setMaxLines(r0)
        L_0x009e:
            java.lang.CharSequence r6 = r9.A08
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            android.widget.TextView r2 = r7.A03
            if (r0 != 0) goto L_0x0287
            r2.setVisibility(r4)
            r2.setText(r6)
            r13.A00(r2)
            java.lang.Integer r0 = r9.A0D
            if (r0 == 0) goto L_0x0282
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0282
            r2.setMaxLines(r0)
        L_0x00be:
            java.lang.Integer r0 = r9.A0C
            if (r0 == 0) goto L_0x027b
            r6 = 0
            int r1 = r0.intValue()
            if (r1 == r5) goto L_0x0260
            if (r1 == r11) goto L_0x024c
            r0 = 3
            if (r1 == r0) goto L_0x0238
            r0 = 4
            if (r1 == r0) goto L_0x0224
            r0 = 5
            if (r1 != r0) goto L_0x00f1
            com.instagram.common.session.UserSession r12 = r13.A05
            X.0Tu r11 = X.0Tu.A05
            r0 = 36322594256857379(0x810b3500002923, double:3.0338930951595313E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x00f1
            r0 = 2131237883(0x7f081bfb, float:1.809203E38)
        L_0x00e6:
            android.graphics.drawable.Drawable r0 = r14.getDrawable(r0)
            r0.getClass()
            android.graphics.drawable.Drawable r6 = r0.mutate()
        L_0x00f1:
            java.lang.CharSequence r1 = r9.A04
            android.widget.TextView r0 = r7.A01
            if (r1 == 0) goto L_0x021f
            r0.setVisibility(r4)
            r0.setText(r1)
        L_0x00fd:
            java.lang.CharSequence r11 = r9.A07
            android.view.View r0 = r7.A00
            if (r11 == 0) goto L_0x021a
            r0.setVisibility(r4)
            android.widget.TextView r1 = r7.A06
            java.lang.Integer r12 = r9.A0B
            if (r12 == 0) goto L_0x0217
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0217
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r11)
            X.C244273av.A08(r14, r0, r5)
        L_0x011e:
            r1.setText(r0)
            android.widget.TextView r1 = r7.A05
            java.lang.CharSequence r0 = r9.A06
            r1.setText(r0)
            com.instagram.common.typedurl.ImageUrl r1 = r9.A02
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A08
            if (r1 == 0) goto L_0x021a
            r0.setUrl(r1, r15)
        L_0x0131:
            if (r6 == 0) goto L_0x027b
            r0 = 2130970306(0x7f0406c2, float:1.7549318E38)
            int r0 = X.2Yu.A0H(r14, r0)
            int r0 = r14.getColor(r0)
            r6.setTint(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A0B
            r0.setImageDrawable(r6)
            r0.setVisibility(r4)
        L_0x0149:
            com.instagram.common.typedurl.ImageUrl r1 = r9.A01
            if (r1 == 0) goto L_0x0206
            X.3tE r6 = r9.A03
            if (r6 == 0) goto L_0x01f5
            X.3tE r0 = X.C254893tE.DEFAULT
            if (r0 == r6) goto L_0x01f5
            X.3tE r0 = X.C254893tE.ROUNDED
            if (r0 != r6) goto L_0x01e0
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A07
            r0.setVisibility(r8)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r6 = r7.A0C
            r6.setVisibility(r4)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A0A
            r0.setVisibility(r8)
            X.3MJ r0 = X.AnonymousClass3MJ.CENTER_CROP
            r6.setBitmapShaderScaleType(r0)
        L_0x016d:
            r6.setUrl(r1, r15)
        L_0x0170:
            X.9J0 r1 = r10.A05
            if (r1 == 0) goto L_0x018e
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x018e
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x018e
            r13.A04(r7, r10)
        L_0x017f:
            int r0 = X.AnonymousClass7PV.A00(r14, r4)
            r3.setMaxWidth(r0)
            int r0 = X.AnonymousClass7PV.A00(r14, r4)
            r2.setMaxWidth(r0)
            return
        L_0x018e:
            X.9J6 r0 = r10.A07
            if (r0 == 0) goto L_0x01d5
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r7.A09
            java.lang.String r9 = r0.A00
            if (r9 == 0) goto L_0x01c3
            r6.setVisibility(r4)
            android.content.Context r7 = r6.getContext()
            com.instagram.common.session.UserSession r8 = r13.A05
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131165193(0x7f070009, float:1.7944596E38)
            int r10 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r7.getResources()
            int r11 = r0.getDimensionPixelSize(r1)
            X.0qQ.A0B(r8, r5)
            boolean r12 = X.C63282KuR.A00(r8)
            android.graphics.drawable.Drawable r0 = X.C320996tP.A02(r7, r8, r9, r10, r11, r12)
            r6.setImageDrawable(r0)
            goto L_0x017f
        L_0x01c3:
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x01dc
            r6.setVisibility(r4)
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
            X.0iw r0 = r13.A04
            r6.setUrl(r1, r0)
            goto L_0x017f
        L_0x01d5:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A00
            r0.setVisibility(r8)
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r7.A09
        L_0x01dc:
            r6.setVisibility(r8)
            goto L_0x017f
        L_0x01e0:
            X.3tE r0 = X.C254893tE.TEMPLATE_ASSET
            if (r0 != r6) goto L_0x0170
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A07
            r0.setVisibility(r8)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r7.A0C
            r0.setVisibility(r8)
            com.instagram.common.ui.widget.imageview.IgImageView r6 = r7.A0A
            r6.setVisibility(r4)
            goto L_0x016d
        L_0x01f5:
            com.instagram.common.ui.widget.imageview.CircularImageView r6 = r7.A07
            r6.setVisibility(r4)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r7.A0C
            r0.setVisibility(r8)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A0A
            r0.setVisibility(r8)
            goto L_0x016d
        L_0x0206:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A07
            r0.setVisibility(r8)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r7.A0C
            r0.setVisibility(r8)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A0A
            r0.setVisibility(r8)
            goto L_0x0170
        L_0x0217:
            r0 = r11
            goto L_0x011e
        L_0x021a:
            r0.setVisibility(r8)
            goto L_0x0131
        L_0x021f:
            r0.setVisibility(r8)
            goto L_0x00fd
        L_0x0224:
            com.instagram.common.session.UserSession r12 = r13.A05
            X.0Tu r11 = X.0Tu.A05
            r0 = 36322594256857379(0x810b3500002923, double:3.0338930951595313E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x00f1
            r0 = 2131237893(0x7f081c05, float:1.809205E38)
            goto L_0x00e6
        L_0x0238:
            com.instagram.common.session.UserSession r12 = r13.A05
            X.0Tu r11 = X.0Tu.A05
            r0 = 36322594256857379(0x810b3500002923, double:3.0338930951595313E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x00f1
            r0 = 2131238333(0x7f081dbd, float:1.8092942E38)
            goto L_0x00e6
        L_0x024c:
            com.instagram.common.session.UserSession r12 = r13.A05
            X.0Tu r11 = X.0Tu.A05
            r0 = 36322594256857379(0x810b3500002923, double:3.0338930951595313E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x00f1
            r0 = 2131238293(0x7f081d95, float:1.809286E38)
            goto L_0x00e6
        L_0x0260:
            com.instagram.common.session.UserSession r12 = r13.A05
            X.0Tu r11 = X.0Tu.A05
            r0 = 36320163305365577(0x8108ff00002049, double:3.03235575164746E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x00f1
            r0 = 2131237897(0x7f081c09, float:1.8092057E38)
            android.graphics.drawable.Drawable r6 = r14.getDrawable(r0)
            r6.getClass()
            goto L_0x00f1
        L_0x027b:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A0B
            r0.setVisibility(r8)
            goto L_0x0149
        L_0x0282:
            r2.setMaxLines(r1)
            goto L_0x00be
        L_0x0287:
            if (r6 == 0) goto L_0x028e
            r2.setVisibility(r4)
            goto L_0x00be
        L_0x028e:
            r2.setVisibility(r8)
            goto L_0x00be
        L_0x0293:
            r2.setMaxLines(r1)
            goto L_0x009e
        L_0x0298:
            r2.setText(r6)
            goto L_0x008e
        L_0x029d:
            r2.setVisibility(r8)
            goto L_0x009e
        L_0x02a2:
            r3.setMaxLines(r1)
            goto L_0x0070
        L_0x02a7:
            X.C244273av.A0A(r3, r6, r4)
            goto L_0x0066
        L_0x02ac:
            r3.setVisibility(r8)
            goto L_0x0070
        L_0x02b1:
            X.2eb r0 = r5.A0B
            r0.A03(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74R.A07(android.content.Context, X.0iw, X.73v, X.7Fr):void");
    }

    /* JADX WARNING: type inference failed for: r4v88, types: [X.7Ws] */
    /* JADX WARNING: type inference failed for: r7v12, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r14v11, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02cf, code lost:
        if (r0.isEmpty() != false) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02d7, code lost:
        if (r7 != false) goto L_0x02d9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0530 A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x053c A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0560 A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x05e0 A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x05ef A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0605 A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0735 A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0742 A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x074e A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0758 A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x07ba A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0938 A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x099c A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0a02 A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0a22 A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0a2e A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0a32 A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0a3c A[Catch:{ all -> 0x0b5c, all -> 0x0b61 }] */
    /* renamed from: A08 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ADp(X.C3257073v r49, X.C328667Fr r50) {
        /*
            r48 = this;
            java.lang.String r0 = "GenericXmaContentDefinition.bindViewHolder"
            X.0lp r26 = X.0lq.A00(r0)
            r1 = r50
            X.7FE r0 = r1.A0C     // Catch:{ all -> 0x0b5c }
            r47 = r0
            X.7L2 r0 = r0.A03     // Catch:{ all -> 0x0b5c }
            r46 = r0
            r9 = 0
            int r0 = X.AnonymousClass7FB.A01(r0, r9)     // Catch:{ all -> 0x0b5c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0b5c }
            r3 = r48
            r3.A02 = r0     // Catch:{ all -> 0x0b5c }
            r2 = r49
            android.widget.FrameLayout r7 = r2.A0A     // Catch:{ all -> 0x0b5c }
            r7.setVisibility(r9)     // Catch:{ all -> 0x0b5c }
            android.content.Context r6 = r7.getContext()     // Catch:{ all -> 0x0b5c }
            X.9HC r0 = r3.A01     // Catch:{ all -> 0x0b5c }
            r45 = r0
            X.0eM r0 = r0.A1B     // Catch:{ all -> 0x0b5c }
            r44 = r0
            java.lang.Object r0 = r44.getValue()     // Catch:{ all -> 0x0b5c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0b5c }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x0044
            X.774 r0 = r1.A0E     // Catch:{ all -> 0x0b5c }
            if (r0 != 0) goto L_0x0044
            X.777 r0 = r1.A0F     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x0052
        L_0x0044:
            X.9Iu r0 = r1.A03     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x0237
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0b5c }
            X.OMk r0 = (X.C70815OMk) r0     // Catch:{ all -> 0x0b5c }
            X.Nj6 r4 = r0.A00     // Catch:{ all -> 0x0b5c }
            X.Nj6 r0 = X.C69305Nj6.PRIVATE     // Catch:{ all -> 0x0b5c }
            if (r4 != r0) goto L_0x0237
        L_0x0052:
            android.view.View r0 = r2.BJd()     // Catch:{ all -> 0x0b5c }
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()     // Catch:{ all -> 0x0b5c }
            r4.getClass()     // Catch:{ all -> 0x0b5c }
            r0 = -2
            r4.width = r0     // Catch:{ all -> 0x0b5c }
            android.view.View r0 = r2.BJd()     // Catch:{ all -> 0x0b5c }
            r0.setLayoutParams(r4)     // Catch:{ all -> 0x0b5c }
            com.instagram.ui.widget.base.BoundedLinearLayout r4 = r2.A0I     // Catch:{ all -> 0x0b5c }
            int r0 = X.AnonymousClass7PV.A00(r6, r9)     // Catch:{ all -> 0x0b5c }
            r4.setMaxWidth(r0)     // Catch:{ all -> 0x0b5c }
        L_0x0070:
            boolean r0 = r3.A0A     // Catch:{ all -> 0x0b5c }
            r20 = r0
            if (r0 == 0) goto L_0x0084
            boolean r0 = r1.A0j     // Catch:{ all -> 0x0b5c }
            if (r0 != 0) goto L_0x0084
            r0 = 2131237395(0x7f081a13, float:1.809104E38)
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)     // Catch:{ all -> 0x0b5c }
            r7.setForeground(r0)     // Catch:{ all -> 0x0b5c }
        L_0x0084:
            boolean r0 = r1.A0l     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x0091
            com.instagram.ui.widget.base.BoundedLinearLayout r0 = r2.A0I     // Catch:{ all -> 0x0b5c }
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()     // Catch:{ all -> 0x0b5c }
            r0 = -1
            r4.height = r0     // Catch:{ all -> 0x0b5c }
        L_0x0091:
            java.util.LinkedHashSet r19 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0b5c }
            r19.<init>()     // Catch:{ all -> 0x0b5c }
            java.util.LinkedHashSet r18 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0b5c }
            r18.<init>()     // Catch:{ all -> 0x0b5c }
            java.util.LinkedHashSet r17 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0b5c }
            r17.<init>()     // Catch:{ all -> 0x0b5c }
            java.util.LinkedHashSet r16 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0b5c }
            r16.<init>()     // Catch:{ all -> 0x0b5c }
            java.util.LinkedHashSet r25 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0b5c }
            r25.<init>()     // Catch:{ all -> 0x0b5c }
            java.util.LinkedHashSet r24 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0b5c }
            r24.<init>()     // Catch:{ all -> 0x0b5c }
            java.util.LinkedHashSet r22 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0b5c }
            r22.<init>()     // Catch:{ all -> 0x0b5c }
            java.util.LinkedHashSet r23 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0b5c }
            r23.<init>()     // Catch:{ all -> 0x0b5c }
            X.774 r8 = r1.A0E     // Catch:{ all -> 0x0b5c }
            r5 = 8
            if (r8 == 0) goto L_0x0276
            X.2eb r7 = r2.A0D     // Catch:{ all -> 0x0b5c }
            r10 = 0
            r7.A03(r10)     // Catch:{ all -> 0x0b5c }
            X.742 r9 = r2.A02()     // Catch:{ all -> 0x0b5c }
            android.content.res.Resources r4 = r6.getResources()     // Catch:{ all -> 0x0b5c }
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            int r0 = r4.getDimensionPixelSize(r0)     // Catch:{ all -> 0x0b5c }
            android.view.View r4 = r7.A01()     // Catch:{ all -> 0x0b5c }
            r4.setPadding(r0, r0, r0, r0)     // Catch:{ all -> 0x0b5c }
            android.graphics.drawable.Drawable r0 = r8.A00     // Catch:{ all -> 0x0b5c }
            r27 = r0
            if (r0 == 0) goto L_0x018c
            android.graphics.drawable.Drawable r15 = r8.A01     // Catch:{ all -> 0x0b5c }
            if (r15 == 0) goto L_0x018c
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r9.A04     // Catch:{ all -> 0x0b5c }
            r0.setVisibility(r5)     // Catch:{ all -> 0x0b5c }
            com.instagram.common.ui.widget.imageview.CircularImageView r14 = r9.A03     // Catch:{ all -> 0x0b5c }
            r14.setVisibility(r10)     // Catch:{ all -> 0x0b5c }
            android.content.res.Resources r12 = r6.getResources()     // Catch:{ all -> 0x0b5c }
            int r11 = r14.getPaddingLeft()     // Catch:{ all -> 0x0b5c }
            int r7 = r14.getPaddingRight()     // Catch:{ all -> 0x0b5c }
            int r4 = r14.getPaddingTop()     // Catch:{ all -> 0x0b5c }
            int r13 = r14.getPaddingBottom()     // Catch:{ all -> 0x0b5c }
            java.lang.Integer r0 = r8.A06     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x010f
            int r0 = r0.intValue()     // Catch:{ all -> 0x0b5c }
            int r11 = r12.getDimensionPixelSize(r0)     // Catch:{ all -> 0x0b5c }
        L_0x010f:
            java.lang.Integer r0 = r8.A07     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x011b
            int r0 = r0.intValue()     // Catch:{ all -> 0x0b5c }
            int r7 = r12.getDimensionPixelSize(r0)     // Catch:{ all -> 0x0b5c }
        L_0x011b:
            java.lang.Integer r0 = r8.A08     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x0127
            int r0 = r0.intValue()     // Catch:{ all -> 0x0b5c }
            int r4 = r12.getDimensionPixelSize(r0)     // Catch:{ all -> 0x0b5c }
        L_0x0127:
            java.lang.Integer r0 = r8.A05     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x0133
            int r0 = r0.intValue()     // Catch:{ all -> 0x0b5c }
            int r13 = r12.getDimensionPixelSize(r0)     // Catch:{ all -> 0x0b5c }
        L_0x0133:
            r14.setPadding(r11, r4, r7, r13)     // Catch:{ all -> 0x0b5c }
            android.view.ViewGroup$LayoutParams r13 = r14.getLayoutParams()     // Catch:{ all -> 0x0b5c }
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13     // Catch:{ all -> 0x0b5c }
            android.content.res.Resources r21 = r6.getResources()     // Catch:{ all -> 0x0b5c }
            int r4 = r13.leftMargin     // Catch:{ all -> 0x0b5c }
            int r12 = r13.rightMargin     // Catch:{ all -> 0x0b5c }
            int r11 = r13.topMargin     // Catch:{ all -> 0x0b5c }
            int r7 = r13.bottomMargin     // Catch:{ all -> 0x0b5c }
            java.lang.Integer r0 = r8.A04     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x0156
            int r4 = r0.intValue()     // Catch:{ all -> 0x0b5c }
            r0 = r21
            int r4 = r0.getDimensionPixelSize(r4)     // Catch:{ all -> 0x0b5c }
        L_0x0156:
            r13.setMargins(r4, r11, r12, r7)     // Catch:{ all -> 0x0b5c }
            r14.setBackground(r15)     // Catch:{ all -> 0x0b5c }
            r0 = r27
            r14.setImageDrawable(r0)     // Catch:{ all -> 0x0b5c }
        L_0x0161:
            java.lang.CharSequence r0 = r8.A03     // Catch:{ all -> 0x0b5c }
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0b5c }
            if (r4 != 0) goto L_0x027c
            android.widget.TextView r12 = r9.A02     // Catch:{ all -> 0x0b5c }
            r12.setVisibility(r10)     // Catch:{ all -> 0x0b5c }
            r12.setText(r0)     // Catch:{ all -> 0x0b5c }
            r3.A00(r12)     // Catch:{ all -> 0x0b5c }
            android.content.Context r0 = r12.getContext()     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x0281
            android.content.res.Resources r4 = r6.getResources()     // Catch:{ all -> 0x0b5c }
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r11 = r4.getDimensionPixelSize(r0)     // Catch:{ all -> 0x0b5c }
            int r7 = r1.A02     // Catch:{ all -> 0x0b5c }
            r4 = 1
            if (r7 == r4) goto L_0x0272
            goto L_0x026e
        L_0x018c:
            java.util.List r11 = r8.A0A     // Catch:{ all -> 0x0b5c }
            int r0 = r11.size()     // Catch:{ all -> 0x0b5c }
            r4 = 1
            if (r0 != r4) goto L_0x0200
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r9.A04     // Catch:{ all -> 0x0b5c }
            r0.setVisibility(r5)     // Catch:{ all -> 0x0b5c }
            com.instagram.common.ui.widget.imageview.CircularImageView r12 = r9.A03     // Catch:{ all -> 0x0b5c }
            r12.setVisibility(r10)     // Catch:{ all -> 0x0b5c }
            java.lang.Object r4 = r11.get(r10)     // Catch:{ all -> 0x0b5c }
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4     // Catch:{ all -> 0x0b5c }
            X.0iw r11 = r3.A04     // Catch:{ all -> 0x0b5c }
            java.lang.String r7 = r4.getUrl()     // Catch:{ all -> 0x0b5c }
            boolean r0 = android.webkit.URLUtil.isContentUrl(r7)     // Catch:{ all -> 0x0b5c }
            if (r0 != 0) goto L_0x01d1
            boolean r0 = android.webkit.URLUtil.isFileUrl(r7)     // Catch:{ all -> 0x0b5c }
            if (r0 != 0) goto L_0x01d1
        L_0x01b7:
            r12.setUrl(r4, r11)     // Catch:{ all -> 0x0b5c }
        L_0x01ba:
            android.view.ViewGroup$LayoutParams r7 = r12.getLayoutParams()     // Catch:{ all -> 0x0b5c }
            android.content.res.Resources r4 = r12.getResources()     // Catch:{ all -> 0x0b5c }
            r0 = 2131165205(0x7f070015, float:1.794462E38)
            int r0 = r4.getDimensionPixelSize(r0)     // Catch:{ all -> 0x0b5c }
            r7.width = r0     // Catch:{ all -> 0x0b5c }
            r7.height = r0     // Catch:{ all -> 0x0b5c }
            r12.setLayoutParams(r7)     // Catch:{ all -> 0x0b5c }
            goto L_0x0161
        L_0x01d1:
            X.MYd r4 = r3.A08     // Catch:{ all -> 0x0b5c }
            java.lang.String r0 = r4.A00(r7)     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x01df
            com.instagram.common.typedurl.SimpleImageUrl r4 = new com.instagram.common.typedurl.SimpleImageUrl     // Catch:{ all -> 0x0b5c }
            r4.<init>(r0)     // Catch:{ all -> 0x0b5c }
            goto L_0x01b7
        L_0x01df:
            boolean r0 = r4.A02(r7)     // Catch:{ all -> 0x0b5c }
            if (r0 != 0) goto L_0x01ba
            r4.A01(r7)     // Catch:{ all -> 0x0b5c }
            X.OKi r0 = r9.A00     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x01ef
            r0.A00()     // Catch:{ all -> 0x0b5c }
        L_0x01ef:
            r0 = 0
            r9.A00 = r0     // Catch:{ all -> 0x0b5c }
            X.7Wn r4 = r3.A06     // Catch:{ all -> 0x0b5c }
            X.Acj r0 = new X.Acj     // Catch:{ all -> 0x0b5c }
            r0.<init>(r11, r12, r9)     // Catch:{ all -> 0x0b5c }
            X.OKi r0 = r4.CgK(r0, r7)     // Catch:{ all -> 0x0b5c }
            r9.A00 = r0     // Catch:{ all -> 0x0b5c }
            goto L_0x01ba
        L_0x0200:
            int r0 = r11.size()     // Catch:{ all -> 0x0b5c }
            com.instagram.common.ui.widget.imageview.CircularImageView r7 = r9.A03     // Catch:{ all -> 0x0b5c }
            r7.setVisibility(r5)     // Catch:{ all -> 0x0b5c }
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r9.A04     // Catch:{ all -> 0x0b5c }
            if (r0 <= r4) goto L_0x0232
            r7.setVisibility(r10)     // Catch:{ all -> 0x0b5c }
            android.content.res.Resources r4 = r6.getResources()     // Catch:{ all -> 0x0b5c }
            r0 = 2131165205(0x7f070015, float:1.794462E38)
            int r32 = r4.getDimensionPixelSize(r0)     // Catch:{ all -> 0x0b5c }
            r0 = r46
            X.7Ky r0 = r0.A03     // Catch:{ all -> 0x0b5c }
            int r4 = r0.A04     // Catch:{ all -> 0x0b5c }
            int r0 = r1.A01     // Catch:{ all -> 0x0b5c }
            r27 = r3
            r28 = r7
            r29 = r11
            r30 = r0
            r31 = r4
            r27.A03(r28, r29, r30, r31, r32)     // Catch:{ all -> 0x0b5c }
            goto L_0x0161
        L_0x0232:
            r7.setVisibility(r5)     // Catch:{ all -> 0x0b5c }
            goto L_0x0161
        L_0x0237:
            android.view.View r0 = r2.BJd()     // Catch:{ all -> 0x0b5c }
            android.content.Context r0 = r0.getContext()     // Catch:{ all -> 0x0b5c }
            int r8 = X.AnonymousClass7PV.A00(r0, r9)     // Catch:{ all -> 0x0b5c }
            android.content.res.Resources r4 = r6.getResources()     // Catch:{ all -> 0x0b5c }
            r0 = 2131165283(0x7f070063, float:1.7944779E38)
            int r5 = r4.getDimensionPixelSize(r0)     // Catch:{ all -> 0x0b5c }
            if (r8 >= r5) goto L_0x0251
            r9 = 1
        L_0x0251:
            r3.A00 = r9     // Catch:{ all -> 0x0b5c }
            android.view.View r0 = r2.BJd()     // Catch:{ all -> 0x0b5c }
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()     // Catch:{ all -> 0x0b5c }
            r4.getClass()     // Catch:{ all -> 0x0b5c }
            boolean r0 = r3.A00     // Catch:{ all -> 0x0b5c }
            if (r0 != 0) goto L_0x0263
            r8 = r5
        L_0x0263:
            r4.width = r8     // Catch:{ all -> 0x0b5c }
            android.view.View r0 = r2.BJd()     // Catch:{ all -> 0x0b5c }
            r0.setLayoutParams(r4)     // Catch:{ all -> 0x0b5c }
            goto L_0x0070
        L_0x026e:
            r0 = 3
            if (r7 == r0) goto L_0x0272
            r4 = 0
        L_0x0272:
            X.C244273av.A0A(r12, r11, r4)     // Catch:{ all -> 0x0b5c }
            goto L_0x0281
        L_0x0276:
            X.2eb r0 = r2.A0D     // Catch:{ all -> 0x0b5c }
            r0.A03(r5)     // Catch:{ all -> 0x0b5c }
            goto L_0x029f
        L_0x027c:
            android.widget.TextView r0 = r9.A02     // Catch:{ all -> 0x0b5c }
            r0.setVisibility(r5)     // Catch:{ all -> 0x0b5c }
        L_0x0281:
            java.lang.CharSequence r4 = r8.A02     // Catch:{ all -> 0x0b5c }
            boolean r7 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0b5c }
            android.widget.TextView r0 = r9.A01     // Catch:{ all -> 0x0b5c }
            if (r7 != 0) goto L_0x02be
            r0.setVisibility(r10)     // Catch:{ all -> 0x0b5c }
            r0.setText(r4)     // Catch:{ all -> 0x0b5c }
            r3.A00(r0)     // Catch:{ all -> 0x0b5c }
        L_0x0294:
            X.9J0 r0 = r1.A05     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x02b8
            boolean r0 = r0.A02     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x02b8
            r3.A04(r9, r1)     // Catch:{ all -> 0x0b5c }
        L_0x029f:
            X.777 r4 = r1.A0F     // Catch:{ all -> 0x0b5c }
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r1.A0L     // Catch:{ all -> 0x0b5c }
            r43 = r0
            X.2FW r7 = r0.A01     // Catch:{ all -> 0x0b5c }
            boolean r0 = r1.A0i     // Catch:{ all -> 0x0b5c }
            r42 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r42)     // Catch:{ all -> 0x0b5c }
            boolean r0 = A05(r7, r0)     // Catch:{ all -> 0x0b5c }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02f5
            goto L_0x02c2
        L_0x02b8:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r9.A00     // Catch:{ all -> 0x0b5c }
            r0.setVisibility(r5)     // Catch:{ all -> 0x0b5c }
            goto L_0x029f
        L_0x02be:
            r0.setVisibility(r5)     // Catch:{ all -> 0x0b5c }
            goto L_0x0294
        L_0x02c2:
            r10 = 0
            if (r8 == 0) goto L_0x02c6
            r10 = 1
        L_0x02c6:
            java.util.List r0 = r1.A0b     // Catch:{ all -> 0x0b5c }
            if (r0 == 0) goto L_0x02d1
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0b5c }
            r7 = 1
            if (r0 == 0) goto L_0x02d2
        L_0x02d1:
            r7 = 0
        L_0x02d2:
            X.74T r0 = r1.A0D     // Catch:{ all -> 0x0b5c }
            if (r0 != 0) goto L_0x02d9
            r11 = 0
            if (r7 == 0) goto L_0x02da
        L_0x02d9:
            r11 = 1
        L_0x02da:
            r0 = r47
            boolean r7 = r0.A00     // Catch:{ all -> 0x0b5c }
            boolean r0 = r0.A01     // Catch:{ all -> 0x0b5c }
            X.7Fo r9 = X.C328037De.A01(r7, r0)     // Catch:{ all -> 0x0b5c }
            r0 = r46
            X.7Ky r0 = r0.A03     // Catch:{ all -> 0x0b5c }
            X.7FU r7 = r1.A00     // Catch:{ all -> 0x0b5c }
            boolean r12 = r7.CU2()     // Catch:{ all -> 0x0b5c }
            r7 = r0
            r8 = r6
            X.3Us r11 = r7.A05(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0b5c }
            goto L_0x02f7
        L_0x02f5:
            X.3Us r11 = X.C242553Us.A02     // Catch:{ all -> 0x0b5c }
        L_0x02f7:
            X.7Df r10 = new X.7Df     // Catch:{ all -> 0x0b5c }
            r10.<init>()     // Catch:{ all -> 0x0b5c }
            r0 = 0
            X.0qQ.A0B(r11, r0)     // Catch:{ all -> 0x0b5c }
            java.lang.Integer r21 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0b5c }
            r7 = r21
            r10.A02(r11, r7)     // Catch:{ all -> 0x0b5c }
            r7 = 1
            X.77E r9 = X.AnonymousClass77E.A00     // Catch:{ all -> 0x0b5c }
            X.77D r8 = new X.77D     // Catch:{ all -> 0x0b5c }
            r8.<init>(r10, r9)     // Catch:{ all -> 0x0b5c }
            X.3tD r9 = r1.A0J     // Catch:{ all -> 0x0b5c }
            r39 = r9
            int r10 = r39.ordinal()     // Catch:{ all -> 0x0b5c }
            if (r10 == r0) goto L_0x03cd
            r9 = 4
            if (r10 == r9) goto L_0x03cd
            r9 = 817892914(0x30c00e32, float:1.3973873E-9)
            if (r10 == r7) goto L_0x033a
            r11 = 2
            if (r10 == r11) goto L_0x06a4
            X.0wj r10 = X.0wj.A01     // Catch:{ all -> 0x0b5c }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b5c }
            r8.<init>()     // Catch:{ all -> 0x0b5c }
            java.lang.String r4 = "GenericXmaContentDefinition: Unsupported layout type detected: "
            r8.append(r4)     // Catch:{ all -> 0x0b5c }
            r4 = r39
            r8.append(r4)     // Catch:{ all -> 0x0b5c }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x0b5c }
            goto L_0x03ac
        L_0x033a:
            X.2eb r4 = r2.A0G     // Catch:{ all -> 0x0b5c }
            r4.A03(r5)     // Catch:{ all -> 0x0b5c }
            X.0iw r11 = r3.A04     // Catch:{ all -> 0x0b5c }
            java.util.List r10 = r1.A0d     // Catch:{ all -> 0x0b5c }
            if (r10 == 0) goto L_0x03b5
            boolean r4 = r10.isEmpty()     // Catch:{ all -> 0x0b5c }
            if (r4 != 0) goto L_0x03b5
            X.2eb r4 = r2.A0H     // Catch:{ all -> 0x0b5c }
            r4.A03(r0)     // Catch:{ all -> 0x0b5c }
            android.view.View r8 = r4.A01()     // Catch:{ all -> 0x0b5c }
            boolean r4 = r3.A00     // Catch:{ all -> 0x0b5c }
            X.O7k r12 = new X.O7k     // Catch:{ all -> 0x0b5c }
            r12.<init>(r8, r7, r4)     // Catch:{ all -> 0x0b5c }
            r4 = r47
            X.3Us r15 = X.C3265577g.A01(r6, r4)     // Catch:{ all -> 0x0b5c }
            X.3Us r4 = r15.A04()     // Catch:{ all -> 0x0b5c }
            X.77D r8 = X.C3265577g.A02(r4)     // Catch:{ all -> 0x0b5c }
            X.7Qg r14 = r8.A04     // Catch:{ all -> 0x0b5c }
            X.0qQ.A0B(r14, r0)     // Catch:{ all -> 0x0b5c }
            X.7Df r13 = r14.A00()     // Catch:{ all -> 0x0b5c }
            if (r13 == 0) goto L_0x03c4
            r4 = r25
            r4.add(r14)     // Catch:{ all -> 0x0b5c }
            r4 = r24
            r4.add(r13)     // Catch:{ all -> 0x0b5c }
            X.3Us r4 = r15.A04()     // Catch:{ all -> 0x0b5c }
            X.77D r13 = X.C3265577g.A03(r4)     // Catch:{ all -> 0x0b5c }
            X.7Qg r15 = r13.A04     // Catch:{ all -> 0x0b5c }
            X.0qQ.A0B(r15, r0)     // Catch:{ all -> 0x0b5c }
            X.7Df r14 = r15.A00()     // Catch:{ all -> 0x0b5c }
            if (r14 == 0) goto L_0x03bb
            r4 = r22
            r4.add(r15)     // Catch:{ all -> 0x0b5c }
            r4 = r23
            r4.add(r14)     // Catch:{ all -> 0x0b5c }
            r4 = 3
            X.0qQ.A0B(r11, r4)     // Catch:{ all -> 0x0b5c }
            com.instagram.direct.ui.thumbnailgrid.ThumbnailGridView r4 = r12.A00     // Catch:{ all -> 0x0b5c }
            r4.setThumbnailPreviews(r10, r8, r13, r11)     // Catch:{ all -> 0x0b5c }
        L_0x03a4:
            X.9Iu r4 = r1.A03     // Catch:{ all -> 0x0b5c }
            if (r4 == 0) goto L_0x072c
            X.0wj r10 = X.0wj.A01     // Catch:{ all -> 0x0b5c }
            java.lang.String r4 = "GenericXmaContentDefinition: Content gating unsupported for grid view 3x2 layout type"
        L_0x03ac:
            X.0f9 r4 = r10.AEf(r4, r9)     // Catch:{ all -> 0x0b5c }
            r4.report()     // Catch:{ all -> 0x0b5c }
            goto L_0x072c
        L_0x03b5:
            X.2eb r4 = r2.A0H     // Catch:{ all -> 0x0b5c }
            r4.A03(r5)     // Catch:{ all -> 0x0b5c }
            goto L_0x03a4
        L_0x03bb:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b5c }
            r1.<init>(r0)     // Catch:{ all -> 0x0b5c }
            goto L_0x0b5b
        L_0x03c4:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b5c }
            r1.<init>(r0)     // Catch:{ all -> 0x0b5c }
            goto L_0x0b5b
        L_0x03cd:
            X.2eb r9 = r2.A0H     // Catch:{ all -> 0x0b5c }
            r9.A03(r5)     // Catch:{ all -> 0x0b5c }
            X.7Qg r9 = r8.A04     // Catch:{ all -> 0x0b5c }
            X.0qQ.A0B(r9, r0)     // Catch:{ all -> 0x0b5c }
            X.7Df r10 = r9.A00()     // Catch:{ all -> 0x0b5c }
            if (r10 == 0) goto L_0x0b4c
            r12 = r19
            r12.add(r9)     // Catch:{ all -> 0x0b5c }
            r12 = r18
            r12.add(r10)     // Catch:{ all -> 0x0b5c }
            r12 = r17
            r12.add(r9)     // Catch:{ all -> 0x0b5c }
            r9 = r16
            r9.add(r10)     // Catch:{ all -> 0x0b5c }
            if (r4 == 0) goto L_0x069d
            X.2eb r9 = r2.A0G     // Catch:{ all -> 0x0b5c }
            r38 = r9
            r9.A03(r0)     // Catch:{ all -> 0x0b5c }
            X.744 r9 = r2.A03()     // Catch:{ all -> 0x0b5c }
            com.instagram.common.ui.widget.imageview.IgImageView r9 = r9.A01     // Catch:{ all -> 0x0b5c }
            r9.setVisibility(r5)     // Catch:{ all -> 0x0b5c }
            com.instagram.common.session.UserSession r9 = r3.A05     // Catch:{ all -> 0x0b5c }
            r37 = r9
            X.9Iu r10 = r1.A03     // Catch:{ all -> 0x0b5c }
            if (r10 == 0) goto L_0x044c
            r9 = r43
            java.lang.String r14 = r9.A02     // Catch:{ all -> 0x0b5c }
            X.3t3 r9 = r1.A0M     // Catch:{ all -> 0x0b5c }
            if (r9 == 0) goto L_0x047e
            X.3t0 r9 = X.C300965yF.A02(r9)     // Catch:{ all -> 0x0b5c }
            if (r9 == 0) goto L_0x047e
            java.lang.String r13 = r9.A00     // Catch:{ all -> 0x0b5c }
            if (r13 == 0) goto L_0x047e
            X.2Dm r9 = X.2L2.A00(r37)     // Catch:{ all -> 0x0b5c }
            X.2Dr r9 = (X.2Dr) r9     // Catch:{ all -> 0x0b5c }
            X.3U9 r27 = r9.A0N(r13)     // Catch:{ all -> 0x0b5c }
            if (r27 == 0) goto L_0x047e
            int r12 = r27.C6a()     // Catch:{ all -> 0x0b5c }
            r9 = 29
            r15 = 0
            if (r12 != r9) goto L_0x0433
            r15 = 1
        L_0x0433:
            r9 = r37
            X.0qQ.A0B(r9, r7)     // Catch:{ all -> 0x0b5c }
            r31 = 0
            java.lang.String r9 = "direct_thread"
            X.0xG r12 = new X.0xG     // Catch:{ all -> 0x0b5c }
            r12.<init>(r9)     // Catch:{ all -> 0x0b5c }
            r9 = r37
            X.0wc r12 = X.AnonymousClass0kN.A01(r12, r9)     // Catch:{ all -> 0x0b5c }
            if (r14 == 0) goto L_0x056d
            if (r15 == 0) goto L_0x056d
            goto L_0x045d
        L_0x044c:
            X.77G r9 = r2.A00()     // Catch:{ all -> 0x0b5c }
            X.AnonymousClass77H.A03(r9)     // Catch:{ all -> 0x0b5c }
            android.view.View r9 = r38.A01()     // Catch:{ all -> 0x0b5c }
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r9 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout) r9     // Catch:{ all -> 0x0b5c }
            r9.setRadius(r0)     // Catch:{ all -> 0x0b5c }
            goto L_0x04c2
        L_0x045d:
            java.lang.Boolean r9 = X.O0U.A00(r37)     // Catch:{ all -> 0x0b5c }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0b5c }
            if (r9 == 0) goto L_0x056d
            java.lang.Object r9 = r10.A00     // Catch:{ all -> 0x0b5c }
            X.OMk r9 = (X.C70815OMk) r9     // Catch:{ all -> 0x0b5c }
            java.lang.String r15 = r9.A02     // Catch:{ all -> 0x0b5c }
            java.lang.Integer r28 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0b5c }
            boolean r9 = r9.A03     // Catch:{ all -> 0x0b5c }
            r27 = r12
            r29 = r14
            r30 = r13
            r32 = r15
            r33 = r9
            X.O0T.A00(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0b5c }
        L_0x047e:
            r12 = 0
            boolean r9 = r4 instanceof X.AnonymousClass776     // Catch:{ all -> 0x0b5c }
            if (r9 == 0) goto L_0x0488
            r9 = r4
            X.776 r9 = (X.AnonymousClass776) r9     // Catch:{ all -> 0x0b5c }
            com.instagram.common.typedurl.ImageUrl r12 = r9.A00     // Catch:{ all -> 0x0b5c }
        L_0x0488:
            X.77G r34 = r2.A00()     // Catch:{ all -> 0x0b5c }
            r36 = 0
            X.0iw r9 = r3.A04     // Catch:{ all -> 0x0b5c }
            r27 = r6
            r28 = r11
            r29 = r10
            r30 = r9
            r31 = r37
            r32 = r12
            r33 = r8
            r35 = r46
            X.AnonymousClass77H.A01(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0b5c }
            X.77G r9 = r2.A00()     // Catch:{ all -> 0x0b5c }
            X.3v7 r9 = r9.A00     // Catch:{ all -> 0x0b5c }
            com.instagram.igds.components.mediabutton.IgdsMediaButton r9 = r9.A08     // Catch:{ all -> 0x0b5c }
            if (r9 == 0) goto L_0x04b0
            r9.setVisibility(r5)     // Catch:{ all -> 0x0b5c }
        L_0x04b0:
            android.view.View r12 = r38.A01()     // Catch:{ all -> 0x0b5c }
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r12 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout) r12     // Catch:{ all -> 0x0b5c }
            float[] r9 = r11.A01     // Catch:{ all -> 0x0b5c }
            r10 = 4
            r11 = r9[r10]     // Catch:{ all -> 0x0b5c }
            r10 = 6
            r10 = r9[r10]     // Catch:{ all -> 0x0b5c }
            r9 = 0
            r12.A01(r9, r9, r11, r10)     // Catch:{ all -> 0x0b5c }
        L_0x04c2:
            boolean r9 = r4 instanceof X.AnonymousClass776     // Catch:{ all -> 0x0b5c }
            if (r9 == 0) goto L_0x064f
            boolean r9 = r1.A0k     // Catch:{ all -> 0x0b5c }
            if (r9 == 0) goto L_0x060c
            X.776 r4 = (X.AnonymousClass776) r4     // Catch:{ all -> 0x0b5c }
            android.view.View r14 = r38.A01()     // Catch:{ all -> 0x0b5c }
            com.instagram.ui.widget.framelayout.MediaFrameLayout r14 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r14     // Catch:{ all -> 0x0b5c }
            X.744 r12 = r2.A03()     // Catch:{ all -> 0x0b5c }
            com.instagram.feed.widget.IgProgressImageView r11 = r12.A04     // Catch:{ all -> 0x0b5c }
            android.view.View r9 = r2.BJd()     // Catch:{ all -> 0x0b5c }
            android.view.ViewGroup$LayoutParams r13 = r9.getLayoutParams()     // Catch:{ all -> 0x0b5c }
            android.view.ViewGroup$LayoutParams r10 = r14.getLayoutParams()     // Catch:{ all -> 0x0b5c }
            com.instagram.common.typedurl.ImageUrl r9 = r4.A00     // Catch:{ all -> 0x0b5c }
            r32 = r9
            java.lang.String r31 = r32.getUrl()     // Catch:{ all -> 0x0b5c }
            java.lang.String r30 = ".webp"
            r15 = r31
            r9 = r30
            boolean r29 = r15.contains(r9)     // Catch:{ all -> 0x0b5c }
            r9 = -2
            r13.width = r9     // Catch:{ all -> 0x0b5c }
            r13.height = r9     // Catch:{ all -> 0x0b5c }
            android.content.Context r28 = r11.getContext()     // Catch:{ all -> 0x0b5c }
            r9 = r28
            X.0qQ.A0B(r9, r0)     // Catch:{ all -> 0x0b5c }
            android.content.res.Resources r9 = r28.getResources()     // Catch:{ all -> 0x0b5c }
            r15 = 2131165273(0x7f070059, float:1.7944758E38)
            int r27 = r9.getDimensionPixelSize(r15)     // Catch:{ all -> 0x0b5c }
            if (r29 != 0) goto L_0x0564
            java.lang.Integer r9 = r4.A05     // Catch:{ all -> 0x0b5c }
            r15 = r9
            if (r9 == 0) goto L_0x0564
            java.lang.Integer r9 = r4.A04     // Catch:{ all -> 0x0b5c }
            if (r9 == 0) goto L_0x0564
            int r15 = r15.intValue()     // Catch:{ all -> 0x0b5c }
            int r9 = r9.intValue()     // Catch:{ all -> 0x0b5c }
            if (r15 > r9) goto L_0x0564
            r9 = r27
            r10.height = r9     // Catch:{ all -> 0x0b5c }
            int r9 = r13.width     // Catch:{ all -> 0x0b5c }
            r10.width = r9     // Catch:{ all -> 0x0b5c }
        L_0x052c:
            java.lang.Float r9 = r4.A02     // Catch:{ all -> 0x0b5c }
            if (r9 == 0) goto L_0x0560
            float r9 = r9.floatValue()     // Catch:{ all -> 0x0b5c }
        L_0x0534:
            r14.A00 = r9     // Catch:{ all -> 0x0b5c }
            boolean r13 = X.C253833rU.A02(r32)     // Catch:{ all -> 0x0b5c }
            if (r13 != 0) goto L_0x05e0
            r11.setVisibility(r0)     // Catch:{ all -> 0x0b5c }
            r11.setAspectRatio(r9)     // Catch:{ all -> 0x0b5c }
            r11.setPostProcessor(r8)     // Catch:{ all -> 0x0b5c }
            r9 = r31
            r8 = r30
            boolean r8 = r9.contains(r8)     // Catch:{ all -> 0x0b5c }
            if (r8 == 0) goto L_0x05e4
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r11.getIgImageView()     // Catch:{ all -> 0x0b5c }
            android.graphics.drawable.Drawable r9 = r8.getDrawable()     // Catch:{ all -> 0x0b5c }
            r8 = r43
            java.lang.String r8 = r8.A02     // Catch:{ all -> 0x0b5c }
            r36 = r31
            if (r8 == 0) goto L_0x05bc
            goto L_0x05ba
        L_0x0560:
            r9 = 1072986849(0x3ff47ae1, float:1.91)
            goto L_0x0534
        L_0x0564:
            r9 = r27
            r10.width = r9     // Catch:{ all -> 0x0b5c }
            int r9 = r13.height     // Catch:{ all -> 0x0b5c }
            r10.height = r9     // Catch:{ all -> 0x0b5c }
            goto L_0x052c
        L_0x056d:
            int r13 = r27.C6a()     // Catch:{ all -> 0x0b5c }
            r9 = 24
            if (r13 == r9) goto L_0x047e
            r9 = 26
            if (r13 == r9) goto L_0x047e
            java.lang.Object r9 = r10.A00     // Catch:{ all -> 0x0b5c }
            X.OMk r9 = (X.C70815OMk) r9     // Catch:{ all -> 0x0b5c }
            java.lang.String r15 = r9.A02     // Catch:{ all -> 0x0b5c }
            if (r15 == 0) goto L_0x047e
            boolean r14 = r9.A03     // Catch:{ all -> 0x0b5c }
            X.0qQ.A0B(r15, r7)     // Catch:{ all -> 0x0b5c }
            java.lang.String r13 = "mwb_igd_inform_treatment_event"
            X.0kJ r9 = r12.A00     // Catch:{ all -> 0x0b5c }
            X.0Aj r12 = r12.A00(r9, r13)     // Catch:{ all -> 0x0b5c }
            r9 = 342(0x156, float:4.79E-43)
            X.1Ln r13 = new X.1Ln     // Catch:{ all -> 0x0b5c }
            r13.<init>(r12, r9)     // Catch:{ all -> 0x0b5c }
            X.0Aj r9 = r13.A00     // Catch:{ all -> 0x0b5c }
            boolean r9 = r9.isSampled()     // Catch:{ all -> 0x0b5c }
            if (r9 == 0) goto L_0x047e
            X.Nlg r12 = X.C69436Nlg.A02     // Catch:{ all -> 0x0b5c }
            java.lang.String r9 = "event_name"
            r13.A0M(r12, r9)     // Catch:{ all -> 0x0b5c }
            java.lang.String r9 = "inform_treatment_name"
            r13.A0R(r9, r15)     // Catch:{ all -> 0x0b5c }
            if (r14 == 0) goto L_0x05ae
            java.lang.String r12 = "media_label"
            goto L_0x05b0
        L_0x05ae:
            java.lang.String r12 = "warning_screens"
        L_0x05b0:
            java.lang.String r9 = "inform_treatment_type"
            r13.A0R(r9, r12)     // Catch:{ all -> 0x0b5c }
            r13.Cgf()     // Catch:{ all -> 0x0b5c }
            goto L_0x047e
        L_0x05ba:
            r36 = r8
        L_0x05bc:
            boolean r8 = r9 instanceof X.C321016tR     // Catch:{ all -> 0x0b5c }
            if (r8 != 0) goto L_0x05eb
            int r13 = r10.width     // Catch:{ all -> 0x0b5c }
            int r9 = r10.height     // Catch:{ all -> 0x0b5c }
            android.content.res.Resources$Theme r34 = r28.getTheme()     // Catch:{ all -> 0x0b5c }
            X.8N6 r8 = new X.8N6     // Catch:{ all -> 0x0b5c }
            r32 = r8
            r33 = r28
            r35 = r37
            r37 = r31
            r38 = r13
            r39 = r9
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0b5c }
            r11.setEnableProgressBar(r0)     // Catch:{ all -> 0x0b5c }
            r11.setImageDrawable(r8)     // Catch:{ all -> 0x0b5c }
            goto L_0x05eb
        L_0x05e0:
            r11.setVisibility(r5)     // Catch:{ all -> 0x0b5c }
            goto L_0x05eb
        L_0x05e4:
            X.0iw r9 = r3.A04     // Catch:{ all -> 0x0b5c }
            r8 = r32
            r11.setUrl(r8, r9)     // Catch:{ all -> 0x0b5c }
        L_0x05eb:
            java.lang.Integer r8 = r4.A03     // Catch:{ all -> 0x0b5c }
            if (r8 == 0) goto L_0x0605
            X.3oV r4 = r12.A03     // Catch:{ all -> 0x0b5c }
            r4.setVisibility(r0)     // Catch:{ all -> 0x0b5c }
            X.0eM r4 = r12.A07     // Catch:{ all -> 0x0b5c }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0b5c }
            android.widget.ImageView r4 = (android.widget.ImageView) r4     // Catch:{ all -> 0x0b5c }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0b5c }
            r4.setImageResource(r8)     // Catch:{ all -> 0x0b5c }
            goto L_0x072c
        L_0x0605:
            X.3oV r4 = r12.A03     // Catch:{ all -> 0x0b5c }
            r4.setVisibility(r5)     // Catch:{ all -> 0x0b5c }
            goto L_0x072c
        L_0x060c:
            X.9J6 r9 = r1.A08     // Catch:{ all -> 0x0b5c }
            java.lang.String r10 = r9.A01     // Catch:{ all -> 0x0b5c }
            java.lang.String r9 = "quick_snap_details"
            boolean r41 = r10.contains(r9)     // Catch:{ all -> 0x0b5c }
            X.776 r4 = (X.AnonymousClass776) r4     // Catch:{ all -> 0x0b5c }
            com.instagram.model.mediasize.ImageInfo r15 = r1.A0O     // Catch:{ all -> 0x0b5c }
            X.7Wn r14 = r3.A06     // Catch:{ all -> 0x0b5c }
            X.0iw r13 = r3.A04     // Catch:{ all -> 0x0b5c }
            X.7FU r9 = r1.A00     // Catch:{ all -> 0x0b5c }
            java.lang.String r36 = r9.Bze()     // Catch:{ all -> 0x0b5c }
            boolean r12 = r1.A0f     // Catch:{ all -> 0x0b5c }
            boolean r11 = r1.A0h     // Catch:{ all -> 0x0b5c }
            X.3tD r10 = X.C254883tD.CIRCULAR     // Catch:{ all -> 0x0b5c }
            r40 = 0
            r9 = r39
            if (r9 != r10) goto L_0x0632
            r40 = 1
        L_0x0632:
            r27 = r3
            r28 = r13
            r29 = r8
            r30 = r14
            r31 = r45
            r32 = r2
            r33 = r4
            r34 = r43
            r35 = r15
            r37 = r12
            r38 = r11
            r39 = r42
            r27.A02(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0b5c }
            goto L_0x072c
        L_0x064f:
            boolean r8 = r4 instanceof X.C68851NZj     // Catch:{ all -> 0x0b5c }
            if (r8 == 0) goto L_0x0690
            android.view.View r10 = r38.A01()     // Catch:{ all -> 0x0b5c }
            com.instagram.ui.widget.framelayout.MediaFrameLayout r10 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r10     // Catch:{ all -> 0x0b5c }
            X.744 r4 = r2.A03()     // Catch:{ all -> 0x0b5c }
            com.instagram.feed.widget.IgProgressImageView r9 = r4.A04     // Catch:{ all -> 0x0b5c }
            android.view.ViewGroup$LayoutParams r4 = r10.getLayoutParams()     // Catch:{ all -> 0x0b5c }
            if (r4 == 0) goto L_0x0687
            android.view.ViewGroup$LayoutParams r8 = r10.getLayoutParams()     // Catch:{ all -> 0x0b5c }
            android.content.res.Resources r11 = r6.getResources()     // Catch:{ all -> 0x0b5c }
            r4 = 2131165467(0x7f07011b, float:1.7945152E38)
            int r4 = r11.getDimensionPixelSize(r4)     // Catch:{ all -> 0x0b5c }
            r8.height = r4     // Catch:{ all -> 0x0b5c }
            android.view.ViewGroup$LayoutParams r8 = r10.getLayoutParams()     // Catch:{ all -> 0x0b5c }
            android.content.res.Resources r11 = r6.getResources()     // Catch:{ all -> 0x0b5c }
            r4 = 2131165226(0x7f07002a, float:1.7944663E38)
            int r4 = r11.getDimensionPixelSize(r4)     // Catch:{ all -> 0x0b5c }
            r8.width = r4     // Catch:{ all -> 0x0b5c }
        L_0x0687:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10.A00 = r4     // Catch:{ all -> 0x0b5c }
            r9.setVisibility(r5)     // Catch:{ all -> 0x0b5c }
            goto L_0x072c
        L_0x0690:
            boolean r4 = r4 instanceof X.C68850NZi     // Catch:{ all -> 0x0b5c }
            if (r4 != 0) goto L_0x072c
            java.lang.String r0 = "Unsupported MediaFields subtype"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0b5c }
            r1.<init>(r0)     // Catch:{ all -> 0x0b5c }
            goto L_0x0b5b
        L_0x069d:
            X.2eb r10 = r2.A0G     // Catch:{ all -> 0x0b5c }
        L_0x069f:
            r10.A03(r5)     // Catch:{ all -> 0x0b5c }
            goto L_0x072c
        L_0x06a4:
            X.2eb r9 = r2.A0H     // Catch:{ all -> 0x0b5c }
            r9.A03(r5)     // Catch:{ all -> 0x0b5c }
            X.7Qg r11 = r8.A04     // Catch:{ all -> 0x0b5c }
            X.0qQ.A0B(r11, r0)     // Catch:{ all -> 0x0b5c }
            X.7Df r10 = r11.A00()     // Catch:{ all -> 0x0b5c }
            if (r10 == 0) goto L_0x0b54
            r9 = r19
            r9.add(r11)     // Catch:{ all -> 0x0b5c }
            r9 = r18
            r9.add(r10)     // Catch:{ all -> 0x0b5c }
            r9 = r17
            r9.add(r11)     // Catch:{ all -> 0x0b5c }
            r9 = r16
            r9.add(r10)     // Catch:{ all -> 0x0b5c }
            boolean r9 = r4 instanceof X.AnonymousClass776     // Catch:{ all -> 0x0b5c }
            X.2eb r10 = r2.A0G     // Catch:{ all -> 0x0b5c }
            if (r9 == 0) goto L_0x069f
            r10.A03(r0)     // Catch:{ all -> 0x0b5c }
            X.776 r4 = (X.AnonymousClass776) r4     // Catch:{ all -> 0x0b5c }
            r35 = 0
            X.7Wn r12 = r3.A06     // Catch:{ all -> 0x0b5c }
            X.0iw r11 = r3.A04     // Catch:{ all -> 0x0b5c }
            X.7FU r9 = r1.A00     // Catch:{ all -> 0x0b5c }
            java.lang.String r36 = r9.Bze()     // Catch:{ all -> 0x0b5c }
            boolean r10 = r1.A0f     // Catch:{ all -> 0x0b5c }
            boolean r9 = r1.A0h     // Catch:{ all -> 0x0b5c }
            r27 = r3
            r28 = r11
            r29 = r8
            r30 = r12
            r31 = r45
            r32 = r2
            r33 = r4
            r34 = r43
            r37 = r10
            r38 = r9
            r39 = r42
            r40 = r0
            r41 = r0
            r27.A02(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0b5c }
            java.util.List r8 = r1.A0c     // Catch:{ all -> 0x0b5c }
            if (r8 == 0) goto L_0x072c
            boolean r4 = r8.isEmpty()     // Catch:{ all -> 0x0b5c }
            if (r4 != 0) goto L_0x072c
            android.content.res.Resources r9 = r6.getResources()     // Catch:{ all -> 0x0b5c }
            r4 = 2131165236(0x7f070034, float:1.7944683E38)
            int r14 = r9.getDimensionPixelSize(r4)     // Catch:{ all -> 0x0b5c }
            X.744 r4 = r2.A03()     // Catch:{ all -> 0x0b5c }
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r4.A01     // Catch:{ all -> 0x0b5c }
            int r12 = r8.size()     // Catch:{ all -> 0x0b5c }
            r9 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r13 = r6.getColor(r9)     // Catch:{ all -> 0x0b5c }
            r9 = r3
            r10 = r4
            r11 = r8
            r9.A03(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0b5c }
        L_0x072c:
            X.9Iu r11 = r1.A04     // Catch:{ all -> 0x0b5c }
            X.0iw r4 = r3.A04     // Catch:{ all -> 0x0b5c }
            r42 = r4
            r8 = 0
            if (r11 == 0) goto L_0x0742
            java.lang.Object r10 = r11.A00     // Catch:{ all -> 0x0b5c }
            com.instagram.model.mediasize.ExtendedImageUrl r10 = (com.instagram.model.mediasize.ExtendedImageUrl) r10     // Catch:{ all -> 0x0b5c }
        L_0x0739:
            X.2eb r4 = r2.A0G     // Catch:{ all -> 0x0b5c }
            int r4 = r4.A00()     // Catch:{ all -> 0x0b5c }
            if (r4 != 0) goto L_0x0797
            goto L_0x0744
        L_0x0742:
            r10 = r8
            goto L_0x0739
        L_0x0744:
            if (r10 == 0) goto L_0x0797
            X.744 r4 = r2.A03()     // Catch:{ all -> 0x0b5c }
            com.instagram.common.ui.widget.imageview.IgImageView r9 = r4.A02     // Catch:{ all -> 0x0b5c }
            if (r11 == 0) goto L_0x0750
            java.lang.String r8 = r11.A01     // Catch:{ all -> 0x0b5c }
        L_0x0750:
            java.lang.String r4 = "pin"
            boolean r4 = r4.equals(r8)     // Catch:{ all -> 0x0b5c }
            if (r4 == 0) goto L_0x07ba
            X.0qQ.A0B(r6, r0)     // Catch:{ all -> 0x0b5c }
            r4 = 50
            float r4 = X.0nA.A04(r6, r4)     // Catch:{ all -> 0x0b5c }
            int r33 = X.AnonymousClass1GB.A01(r4)     // Catch:{ all -> 0x0b5c }
            r8 = 0
            r32 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r31 = "media_map"
            X.Uo6 r4 = new X.Uo6     // Catch:{ all -> 0x0b5c }
            r27 = r4
            r28 = r6
            r29 = r8
            r30 = r10
            r34 = r0
            r35 = r0
            r36 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0b5c }
            r4.A0E = r0     // Catch:{ all -> 0x0b5c }
            r4.setCallback(r8)     // Catch:{ all -> 0x0b5c }
            float r8 = r4.A03     // Catch:{ all -> 0x0b5c }
            int r10 = java.lang.Math.round(r8)     // Catch:{ all -> 0x0b5c }
            float r8 = r4.A00     // Catch:{ all -> 0x0b5c }
            int r8 = java.lang.Math.round(r8)     // Catch:{ all -> 0x0b5c }
            r4.setBounds(r0, r0, r10, r8)     // Catch:{ all -> 0x0b5c }
            r9.setImageDrawable(r4)     // Catch:{ all -> 0x0b5c }
        L_0x0794:
            r9.setVisibility(r0)     // Catch:{ all -> 0x0b5c }
        L_0x0797:
            r4 = r42
            r3.A07(r6, r4, r2, r1)     // Catch:{ all -> 0x0b5c }
            X.7Wn r4 = r3.A06     // Catch:{ all -> 0x0b5c }
            r41 = r4
            android.content.res.Resources r8 = r6.getResources()     // Catch:{ all -> 0x0b5c }
            r4 = 2131165218(0x7f070022, float:1.7944647E38)
            int r32 = r8.getDimensionPixelSize(r4)     // Catch:{ all -> 0x0b5c }
            X.Jw0 r4 = r1.A09     // Catch:{ all -> 0x0b5c }
            r31 = r4
            java.util.List r8 = r1.A0b     // Catch:{ all -> 0x0b5c }
            if (r8 == 0) goto L_0x0910
            boolean r4 = r8.isEmpty()     // Catch:{ all -> 0x0b5c }
            if (r4 != 0) goto L_0x0910
            goto L_0x07c0
        L_0x07ba:
            r4 = r42
            r9.setUrl(r10, r4)     // Catch:{ all -> 0x0b5c }
            goto L_0x0794
        L_0x07c0:
            if (r20 != 0) goto L_0x0910
            if (r31 != 0) goto L_0x0910
            int r5 = r8.size()     // Catch:{ all -> 0x0b5c }
            r30 = 2
            r4 = r30
            if (r5 != r4) goto L_0x07fa
            java.lang.Object r4 = r8.get(r0)     // Catch:{ all -> 0x0b5c }
            X.9JN r4 = (X.AnonymousClass9JN) r4     // Catch:{ all -> 0x0b5c }
            java.lang.String r4 = r4.A06     // Catch:{ all -> 0x0b5c }
            if (r4 == 0) goto L_0x07fa
            java.lang.Object r4 = r8.get(r0)     // Catch:{ all -> 0x0b5c }
            X.9JN r4 = (X.AnonymousClass9JN) r4     // Catch:{ all -> 0x0b5c }
            java.lang.String r5 = r4.A06     // Catch:{ all -> 0x0b5c }
            java.lang.String r4 = "collab_action"
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x0b5c }
            if (r4 == 0) goto L_0x07fa
            com.instagram.common.session.UserSession r10 = r3.A05     // Catch:{ all -> 0x0b5c }
            X.0Tu r9 = X.0Tu.A05     // Catch:{ all -> 0x0b5c }
            r4 = 36324522697240708(0x810cf600013084, double:3.035112648623155E-306)
            boolean r4 = X.182.A06(r9, r10, r4)     // Catch:{ all -> 0x0b5c }
            if (r4 != 0) goto L_0x07fa
            r8.remove(r0)     // Catch:{ all -> 0x0b5c }
        L_0x07fa:
            X.2eb r4 = r2.A0C     // Catch:{ all -> 0x0b5c }
            r40 = r4
            r4.A03(r0)     // Catch:{ all -> 0x0b5c }
            java.lang.Object r4 = r44.getValue()     // Catch:{ all -> 0x0b5c }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0b5c }
            boolean r29 = r4.booleanValue()     // Catch:{ all -> 0x0b5c }
            X.F0E r10 = r2.A01     // Catch:{ all -> 0x0b5c }
            if (r10 != 0) goto L_0x081a
            android.view.View r4 = r40.A01()     // Catch:{ all -> 0x0b5c }
            X.F0E r10 = new X.F0E     // Catch:{ all -> 0x0b5c }
            r10.<init>(r4)     // Catch:{ all -> 0x0b5c }
            r2.A01 = r10     // Catch:{ all -> 0x0b5c }
        L_0x081a:
            r9 = 0
        L_0x081b:
            int r4 = r8.size()     // Catch:{ all -> 0x0b5c }
            if (r9 >= r4) goto L_0x0916
            java.lang.Object r28 = r8.get(r9)     // Catch:{ all -> 0x0b5c }
            r4 = r28
            X.9JN r4 = (X.AnonymousClass9JN) r4     // Catch:{ all -> 0x0b5c }
            r28 = r4
            if (r9 == 0) goto L_0x0841
            if (r9 == r7) goto L_0x083a
            r4 = r30
            if (r9 != r4) goto L_0x0907
            android.view.View r4 = r10.A02     // Catch:{ all -> 0x0b5c }
            r39 = r4
            com.instagram.igds.components.button.IgdsButton r5 = r10.A05     // Catch:{ all -> 0x0b5c }
            goto L_0x0847
        L_0x083a:
            android.view.View r4 = r10.A01     // Catch:{ all -> 0x0b5c }
            r39 = r4
            com.instagram.igds.components.button.IgdsButton r5 = r10.A04     // Catch:{ all -> 0x0b5c }
            goto L_0x0847
        L_0x0841:
            android.view.View r4 = r10.A00     // Catch:{ all -> 0x0b5c }
            r39 = r4
            com.instagram.igds.components.button.IgdsButton r5 = r10.A03     // Catch:{ all -> 0x0b5c }
        L_0x0847:
            if (r29 == 0) goto L_0x08d9
            int r4 = r8.size()     // Catch:{ all -> 0x0b5c }
            int r4 = r4 - r7
            if (r9 != r4) goto L_0x08d9
            r4 = r47
            boolean r11 = r4.A00     // Catch:{ all -> 0x0b5c }
            boolean r4 = r4.A01     // Catch:{ all -> 0x0b5c }
            X.7Fo r35 = X.C328037De.A01(r11, r4)     // Catch:{ all -> 0x0b5c }
            r4 = r46
            X.7Ky r11 = r4.A03     // Catch:{ all -> 0x0b5c }
            X.7FU r4 = r1.A00     // Catch:{ all -> 0x0b5c }
            boolean r38 = r4.CU2()     // Catch:{ all -> 0x0b5c }
            r33 = r11
            r34 = r6
            r36 = r7
            r37 = r0
            X.3Us r12 = r33.A05(r34, r35, r36, r37, r38)     // Catch:{ all -> 0x0b5c }
            X.7Df r11 = new X.7Df     // Catch:{ all -> 0x0b5c }
            r11.<init>()     // Catch:{ all -> 0x0b5c }
            X.0qQ.A0B(r12, r0)     // Catch:{ all -> 0x0b5c }
            r4 = r21
            r11.A02(r12, r4)     // Catch:{ all -> 0x0b5c }
            android.graphics.drawable.ShapeDrawable r12 = new android.graphics.drawable.ShapeDrawable     // Catch:{ all -> 0x0b5c }
            r12.<init>(r11)     // Catch:{ all -> 0x0b5c }
            android.graphics.drawable.ShapeDrawable r27 = new android.graphics.drawable.ShapeDrawable     // Catch:{ all -> 0x0b5c }
            r4 = r27
            r4.<init>(r11)     // Catch:{ all -> 0x0b5c }
            r4 = 2130970213(0x7f040665, float:1.754913E38)
            int r4 = X.2Yu.A0H(r6, r4)     // Catch:{ all -> 0x0b5c }
            int r11 = r6.getColor(r4)     // Catch:{ all -> 0x0b5c }
            android.graphics.drawable.shapes.Shape r4 = r12.getShape()     // Catch:{ all -> 0x0b5c }
            android.graphics.Paint$Style r14 = android.graphics.Paint.Style.FILL     // Catch:{ all -> 0x0b5c }
            r20 = 0
            r13 = r4
            r4 = r20
            X.C308486Ul.A02(r14, r12, r13, r4, r11)     // Catch:{ all -> 0x0b5c }
            int r4 = X.2Yu.A0C(r6)     // Catch:{ all -> 0x0b5c }
            int r11 = r6.getColor(r4)     // Catch:{ all -> 0x0b5c }
            android.graphics.drawable.shapes.Shape r4 = r27.getShape()     // Catch:{ all -> 0x0b5c }
            r15 = r14
            r14 = r4
            r13 = r11
            r11 = r20
            r4 = r27
            X.C308486Ul.A02(r15, r4, r14, r11, r13)     // Catch:{ all -> 0x0b5c }
            android.graphics.Paint r4 = X.AnonymousClass3JT.A00     // Catch:{ all -> 0x0b5c }
            r4 = 128(0x80, float:1.794E-43)
            r12.setAlpha(r4)     // Catch:{ all -> 0x0b5c }
            int[] r4 = new int[r0]     // Catch:{ all -> 0x0b5c }
            r11 = r4
            r4 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r4 = new int[]{r4}     // Catch:{ all -> 0x0b5c }
            android.graphics.drawable.StateListDrawable r13 = new android.graphics.drawable.StateListDrawable     // Catch:{ all -> 0x0b5c }
            r13.<init>()     // Catch:{ all -> 0x0b5c }
            r13.addState(r4, r12)     // Catch:{ all -> 0x0b5c }
            r4 = r27
            r13.addState(r11, r4)     // Catch:{ all -> 0x0b5c }
            r5.setBackground(r13)     // Catch:{ all -> 0x0b5c }
        L_0x08d9:
            X.4lo r4 = X.C273014lo.SECONDARY     // Catch:{ all -> 0x0b5c }
            r5.setStyle(r4)     // Catch:{ all -> 0x0b5c }
            r4 = r39
            r4.setVisibility(r0)     // Catch:{ all -> 0x0b5c }
            X.Oih r11 = new X.Oih     // Catch:{ all -> 0x0b5c }
            r4 = r41
            r11.<init>(r4, r1, r9)     // Catch:{ all -> 0x0b5c }
            X.AnonymousClass0fU.A00(r11, r5)     // Catch:{ all -> 0x0b5c }
            r4 = r28
            java.lang.String r4 = r4.A04     // Catch:{ all -> 0x0b5c }
            r5.setText((java.lang.String) r4)     // Catch:{ all -> 0x0b5c }
            r4 = r28
            java.lang.String r11 = r4.A05     // Catch:{ all -> 0x0b5c }
            java.lang.String r4 = "xma_disabled_cta"
            boolean r4 = r11.equals(r4)     // Catch:{ all -> 0x0b5c }
            if (r4 == 0) goto L_0x0903
            r5.setEnabled(r0)     // Catch:{ all -> 0x0b5c }
        L_0x0903:
            int r9 = r9 + 1
            goto L_0x081b
        L_0x0907:
            java.lang.String r0 = "More than 3 CTAs on message not supported."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b5c }
            r1.<init>(r0)     // Catch:{ all -> 0x0b5c }
            goto L_0x0b5b
        L_0x0910:
            X.2eb r4 = r2.A0C     // Catch:{ all -> 0x0b5c }
            r4.A03(r5)     // Catch:{ all -> 0x0b5c }
            goto L_0x0923
        L_0x0916:
            X.74T r4 = r1.A0D     // Catch:{ all -> 0x0b5c }
            if (r4 != 0) goto L_0x0923
            android.view.View r5 = r40.A01()     // Catch:{ all -> 0x0b5c }
            r4 = r32
            r5.setPadding(r0, r4, r0, r0)     // Catch:{ all -> 0x0b5c }
        L_0x0923:
            com.instagram.common.session.UserSession r13 = r3.A05     // Catch:{ all -> 0x0b5c }
            r4 = r47
            X.0eM r4 = r4.A05     // Catch:{ all -> 0x0b5c }
            r9 = 0
            if (r4 == 0) goto L_0x099c
            java.lang.Object r10 = r4.getValue()     // Catch:{ all -> 0x0b5c }
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10     // Catch:{ all -> 0x0b5c }
            if (r10 == 0) goto L_0x099c
            boolean r4 = r1.A0j     // Catch:{ all -> 0x0b5c }
            if (r4 != 0) goto L_0x099c
            com.instagram.ui.widget.base.BoundedLinearLayout r5 = r2.A0I     // Catch:{ all -> 0x0b5c }
            r4 = r47
            X.C3265577g.A06(r10, r5, r4, r7)     // Catch:{ all -> 0x0b5c }
            java.util.WeakHashMap r4 = X.C331277Qg.A06     // Catch:{ all -> 0x0b5c }
            java.lang.Object r10 = r4.get(r10)     // Catch:{ all -> 0x0b5c }
            X.7Qg r10 = (X.C331277Qg) r10     // Catch:{ all -> 0x0b5c }
            if (r10 == 0) goto L_0x0997
            r4 = r45
            X.0eM r4 = r4.A0m     // Catch:{ all -> 0x0b5c }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0b5c }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x0b5c }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x0b5c }
            if (r4 == 0) goto L_0x0969
            r4 = 2130970330(0x7f0406da, float:1.7549367E38)
            int r4 = X.2Yu.A0H(r6, r4)     // Catch:{ all -> 0x0b5c }
            int r5 = r6.getColor(r4)     // Catch:{ all -> 0x0b5c }
            r4 = 1073741824(0x40000000, float:2.0)
            r10.A02(r5, r4, r0)     // Catch:{ all -> 0x0b5c }
        L_0x0969:
            X.7Df r5 = r10.A00()     // Catch:{ all -> 0x0b5c }
            if (r5 == 0) goto L_0x0b44
            r4 = r19
            r4.add(r10)     // Catch:{ all -> 0x0b5c }
            r4 = r18
            r4.add(r5)     // Catch:{ all -> 0x0b5c }
            r4 = r17
            r4.add(r10)     // Catch:{ all -> 0x0b5c }
            r4 = r16
            r4.add(r5)     // Catch:{ all -> 0x0b5c }
            r4 = r25
            r4.add(r10)     // Catch:{ all -> 0x0b5c }
            r4 = r24
            r4.add(r5)     // Catch:{ all -> 0x0b5c }
            r4 = r22
            r4.add(r10)     // Catch:{ all -> 0x0b5c }
            r4 = r23
            r4.add(r5)     // Catch:{ all -> 0x0b5c }
        L_0x0997:
            X.3t3 r5 = r1.A0M     // Catch:{ all -> 0x0b5c }
            if (r5 == 0) goto L_0x0a1d
            goto L_0x09a2
        L_0x099c:
            com.instagram.ui.widget.base.BoundedLinearLayout r4 = r2.A0I     // Catch:{ all -> 0x0b5c }
            r4.setBackground(r9)     // Catch:{ all -> 0x0b5c }
            goto L_0x0997
        L_0x09a2:
            if (r8 == 0) goto L_0x0a1d
            boolean r4 = r8.isEmpty()     // Catch:{ all -> 0x0b5c }
            if (r4 != 0) goto L_0x0a1d
            int r4 = r8.size()     // Catch:{ all -> 0x0b5c }
            if (r4 != r7) goto L_0x0a1d
            java.lang.Object r4 = r8.get(r0)     // Catch:{ all -> 0x0b5c }
            X.9JN r4 = (X.AnonymousClass9JN) r4     // Catch:{ all -> 0x0b5c }
            java.lang.String r8 = r4.A06     // Catch:{ all -> 0x0b5c }
            if (r8 == 0) goto L_0x0a1d
            java.lang.String r4 = "instagram://memu_onboarding"
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x0b5c }
            if (r4 == 0) goto L_0x0a1d
            X.3t0 r4 = X.C300965yF.A02(r5)     // Catch:{ all -> 0x0b5c }
            if (r4 == 0) goto L_0x0a1d
            java.lang.String r12 = r4.A00     // Catch:{ all -> 0x0b5c }
            if (r12 == 0) goto L_0x0a1d
            X.2Dm r4 = X.2L2.A00(r13)     // Catch:{ all -> 0x0b5c }
            X.2Dr r4 = (X.2Dr) r4     // Catch:{ all -> 0x0b5c }
            X.3U9 r5 = r4.A0N(r12)     // Catch:{ all -> 0x0b5c }
            if (r5 == 0) goto L_0x0a1d
            X.HOj r4 = X.C54678HOj.XMA     // Catch:{ all -> 0x0b5c }
            X.Hzj r11 = new X.Hzj     // Catch:{ all -> 0x0b5c }
            r11.<init>(r4, r13, r9)     // Catch:{ all -> 0x0b5c }
            int r5 = r5.C6a()     // Catch:{ all -> 0x0b5c }
            java.lang.String r4 = ""
            java.lang.String r10 = X.002.A03(r5, r4)     // Catch:{ all -> 0x0b5c }
            X.0qQ.A0B(r10, r7)     // Catch:{ all -> 0x0b5c }
            X.0eM r4 = r11.A01     // Catch:{ all -> 0x0b5c }
            java.lang.Object r8 = r4.getValue()     // Catch:{ all -> 0x0b5c }
            X.0wc r8 = (X.0wc) r8     // Catch:{ all -> 0x0b5c }
            java.lang.String r5 = "meta_ai_memu_onboarding"
            X.0kJ r4 = r8.A00     // Catch:{ all -> 0x0b5c }
            X.0Aj r8 = r8.A00(r4, r5)     // Catch:{ all -> 0x0b5c }
            boolean r4 = r8.isSampled()     // Catch:{ all -> 0x0b5c }
            if (r4 == 0) goto L_0x0a1d
            X.HOs r5 = X.C54687HOs.A0G     // Catch:{ all -> 0x0b5c }
            java.lang.String r4 = "event_type"
            r8.A8M(r5, r4)     // Catch:{ all -> 0x0b5c }
            X.HOj r5 = r11.A00     // Catch:{ all -> 0x0b5c }
            java.lang.String r4 = "entry_point"
            r8.A8M(r5, r4)     // Catch:{ all -> 0x0b5c }
            java.lang.String r4 = "surface_session_id"
            r8.AAJ(r4, r12)     // Catch:{ all -> 0x0b5c }
            java.lang.String r4 = "thread_type"
            r8.AAJ(r4, r10)     // Catch:{ all -> 0x0b5c }
            r8.Cgf()     // Catch:{ all -> 0x0b5c }
        L_0x0a1d:
            X.9J6 r4 = r1.A06     // Catch:{ all -> 0x0b5c }
            r8 = 0
            if (r4 == 0) goto L_0x0a2e
            java.lang.String r9 = r4.A01     // Catch:{ all -> 0x0b5c }
            java.lang.String r5 = r4.A00     // Catch:{ all -> 0x0b5c }
        L_0x0a26:
            android.view.View r4 = r2.BJd()     // Catch:{ all -> 0x0b5c }
            r4.setContentDescription(r9)     // Catch:{ all -> 0x0b5c }
            goto L_0x0a30
        L_0x0a2e:
            r5 = r9
            goto L_0x0a26
        L_0x0a30:
            if (r5 == 0) goto L_0x0a37
            X.U7F r8 = new X.U7F     // Catch:{ all -> 0x0b5c }
            r8.<init>(r5)     // Catch:{ all -> 0x0b5c }
        L_0x0a37:
            X.03v.A0B(r4, r8)     // Catch:{ all -> 0x0b5c }
            if (r31 == 0) goto L_0x0b23
            X.Ett r5 = r2.A03     // Catch:{ all -> 0x0b5c }
            if (r5 != 0) goto L_0x0a4d
            X.2eb r4 = r2.A0E     // Catch:{ all -> 0x0b5c }
            android.view.View r4 = r4.A01()     // Catch:{ all -> 0x0b5c }
            X.Ett r5 = new X.Ett     // Catch:{ all -> 0x0b5c }
            r5.<init>(r4)     // Catch:{ all -> 0x0b5c }
            r2.A03 = r5     // Catch:{ all -> 0x0b5c }
        L_0x0a4d:
            com.instagram.igds.components.button.IgdsButton r12 = r5.A00     // Catch:{ all -> 0x0b5c }
            r4 = r31
            java.lang.Object r11 = r4.A00     // Catch:{ all -> 0x0b5c }
            X.9JN r11 = (X.AnonymousClass9JN) r11     // Catch:{ all -> 0x0b5c }
            X.EwC r4 = r2.A04     // Catch:{ all -> 0x0b5c }
            if (r4 != 0) goto L_0x0a66
            X.2eb r4 = r2.A0F     // Catch:{ all -> 0x0b5c }
            android.view.View r5 = r4.A01()     // Catch:{ all -> 0x0b5c }
            X.EwC r4 = new X.EwC     // Catch:{ all -> 0x0b5c }
            r4.<init>(r5)     // Catch:{ all -> 0x0b5c }
            r2.A04 = r4     // Catch:{ all -> 0x0b5c }
        L_0x0a66:
            com.instagram.common.ui.widget.imageview.IgImageView r10 = r4.A01     // Catch:{ all -> 0x0b5c }
            android.widget.TextView r9 = r4.A00     // Catch:{ all -> 0x0b5c }
            android.content.res.Resources r5 = r6.getResources()     // Catch:{ all -> 0x0b5c }
            r4 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r8 = r5.getDimensionPixelSize(r4)     // Catch:{ all -> 0x0b5c }
            android.content.res.Resources r5 = r6.getResources()     // Catch:{ all -> 0x0b5c }
            r4 = 2131165293(0x7f07006d, float:1.79448E38)
            int r5 = r5.getDimensionPixelSize(r4)     // Catch:{ all -> 0x0b5c }
            X.74T r14 = r1.A0D     // Catch:{ all -> 0x0b5c }
            if (r14 == 0) goto L_0x0aaa
            X.745 r4 = r2.A01()     // Catch:{ all -> 0x0b5c }
            android.widget.TextView r4 = r4.A04     // Catch:{ all -> 0x0b5c }
            r4.setVisibility(r0)     // Catch:{ all -> 0x0b5c }
            X.745 r4 = r2.A01()     // Catch:{ all -> 0x0b5c }
            android.widget.TextView r13 = r4.A04     // Catch:{ all -> 0x0b5c }
            java.lang.CharSequence r4 = r14.A09     // Catch:{ all -> 0x0b5c }
            r13.setText(r4)     // Catch:{ all -> 0x0b5c }
            X.745 r4 = r2.A01()     // Catch:{ all -> 0x0b5c }
            android.widget.TextView r4 = r4.A04     // Catch:{ all -> 0x0b5c }
            r3.A00(r4)     // Catch:{ all -> 0x0b5c }
            X.745 r4 = r2.A01()     // Catch:{ all -> 0x0b5c }
            android.widget.TextView r4 = r4.A04     // Catch:{ all -> 0x0b5c }
            r4.setMaxLines(r7)     // Catch:{ all -> 0x0b5c }
        L_0x0aaa:
            X.2eb r4 = r2.A0B     // Catch:{ all -> 0x0b5c }
            r4.A03(r0)     // Catch:{ all -> 0x0b5c }
            android.view.View r4 = r4.A01()     // Catch:{ all -> 0x0b5c }
            r4.setPadding(r8, r8, r8, r5)     // Catch:{ all -> 0x0b5c }
            X.2eb r4 = r2.A0E     // Catch:{ all -> 0x0b5c }
            r4.A03(r0)     // Catch:{ all -> 0x0b5c }
            X.2eb r4 = r2.A0F     // Catch:{ all -> 0x0b5c }
            r4.A03(r0)     // Catch:{ all -> 0x0b5c }
            r0 = 2131237875(0x7f081bf3, float:1.8092013E38)
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)     // Catch:{ all -> 0x0b5c }
            r10.setImageDrawable(r0)     // Catch:{ all -> 0x0b5c }
            r0 = r31
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0b5c }
            r9.setText(r0)     // Catch:{ all -> 0x0b5c }
            android.content.res.Resources r4 = r6.getResources()     // Catch:{ all -> 0x0b5c }
            r0 = 2131100403(0x7f0602f3, float:1.7813186E38)
            int r0 = r4.getColor(r0)     // Catch:{ all -> 0x0b5c }
            r10.setColorFilter(r0)     // Catch:{ all -> 0x0b5c }
            r0 = 2131960232(0x7f1321a8, float:1.9557127E38)
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x0b5c }
            r12.setText((java.lang.String) r0)     // Catch:{ all -> 0x0b5c }
            X.4lo r0 = X.C273014lo.PRIMARY_ON_COLOR     // Catch:{ all -> 0x0b5c }
            r12.setStyle(r0)     // Catch:{ all -> 0x0b5c }
            if (r11 == 0) goto L_0x0aff
            java.lang.String r4 = r11.A02     // Catch:{ all -> 0x0b5c }
            java.lang.String r0 = ""
            X.2HF.A00(r4, r0)     // Catch:{ all -> 0x0b5c }
            X.Oj2 r0 = new X.Oj2     // Catch:{ all -> 0x0b5c }
            r0.<init>(r6, r3, r1, r4)     // Catch:{ all -> 0x0b5c }
            X.AnonymousClass0fU.A00(r0, r12)     // Catch:{ all -> 0x0b5c }
        L_0x0aff:
            X.2el r6 = X.AnonymousClass2hM.A00(r12)     // Catch:{ all -> 0x0b5c }
            r0 = r43
            java.lang.String r5 = r0.A02     // Catch:{ all -> 0x0b5c }
            if (r6 == 0) goto L_0x0b23
            if (r5 == 0) goto L_0x0b23
            X.30Y r0 = X.AnonymousClass30Y.A07     // Catch:{ all -> 0x0b5c }
            X.30a r4 = new X.30a     // Catch:{ all -> 0x0b5c }
            r0 = r42
            r4.<init>(r5, r0, r5)     // Catch:{ all -> 0x0b5c }
            X.OzZ r0 = new X.OzZ     // Catch:{ all -> 0x0b5c }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0b5c }
            r4.A00(r0)     // Catch:{ all -> 0x0b5c }
            X.30Y r0 = r4.A01()     // Catch:{ all -> 0x0b5c }
            r6.A05(r12, r0)     // Catch:{ all -> 0x0b5c }
        L_0x0b23:
            X.746 r0 = new X.746     // Catch:{ all -> 0x0b5c }
            r4 = r0
            r5 = r25
            r6 = r24
            r7 = r22
            r8 = r23
            r9 = r19
            r10 = r18
            r11 = r17
            r12 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0b5c }
            r2.A05 = r0     // Catch:{ all -> 0x0b5c }
            X.7DZ r0 = r3.A07     // Catch:{ all -> 0x0b5c }
            r0.A02(r2, r1)     // Catch:{ all -> 0x0b5c }
            r26.close()
            return
        L_0x0b44:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b5c }
            r1.<init>(r0)     // Catch:{ all -> 0x0b5c }
            goto L_0x0b5b
        L_0x0b4c:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b5c }
            r1.<init>(r0)     // Catch:{ all -> 0x0b5c }
            goto L_0x0b5b
        L_0x0b54:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0b5c }
            r1.<init>(r0)     // Catch:{ all -> 0x0b5c }
        L_0x0b5b:
            throw r1     // Catch:{ all -> 0x0b5c }
        L_0x0b5c:
            r1 = move-exception
            r26.close()     // Catch:{ all -> 0x0b61 }
            throw r1
        L_0x0b61:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74R.ADp(X.73v, X.7Fr):void");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004e, code lost:
        r1 = r0.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void FIP(X.C328007Db r7) {
        /*
            r6 = this;
            X.73v r7 = (X.C3257073v) r7
            r5 = 0
            r7.A05 = r5
            X.7DZ r0 = r6.A07
            r0.A01(r7)
            X.7Pg r1 = r6.A09
            if (r1 == 0) goto L_0x001c
            X.745 r0 = r7.A01()
            r1.A06(r0)
            X.742 r0 = r7.A02()
            r1.A06(r0)
        L_0x001c:
            X.744 r0 = r7.A03()
            com.instagram.feed.widget.IgProgressImageView r0 = r0.A04
            r0.A04()
            android.widget.FrameLayout r1 = r7.A0A
            r0 = 8
            r1.setVisibility(r0)
            X.742 r0 = r7.A02()
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r0.A03
            r0.setBackground(r5)
            r4 = 0
            r0.setPadding(r4, r4, r4, r4)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            if (r3 == 0) goto L_0x004a
            int r2 = r3.topMargin
            int r1 = r3.rightMargin
            int r0 = r3.bottomMargin
            r3.setMargins(r4, r2, r1, r0)
        L_0x004a:
            X.Ett r0 = r7.A03
            if (r0 == 0) goto L_0x0059
            com.instagram.igds.components.button.IgdsButton r1 = r0.A00
            X.2el r0 = X.AnonymousClass2hM.A00(r1)
            if (r0 == 0) goto L_0x0059
            r0.A04(r1)
        L_0x0059:
            X.742 r1 = r7.A02
            if (r1 == 0) goto L_0x0066
            X.OKi r0 = r1.A00
            if (r0 == 0) goto L_0x0064
            r0.A00()
        L_0x0064:
            r1.A00 = r5
        L_0x0066:
            X.O6r r0 = r7.A00
            if (r0 == 0) goto L_0x0070
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A00
            r0 = 1
            r1.set(r0)
        L_0x0070:
            r7.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74R.FIP(X.7Db):void");
    }

    public AnonymousClass74R(AnonymousClass0iw r2, UserSession userSession, C332827Wn r4, AnonymousClass9HC r5, C331037Pg r6, List list, boolean z, boolean z2) {
        this.A05 = userSession;
        this.A04 = r2;
        this.A07 = new AnonymousClass7DZ(list);
        this.A06 = r4;
        this.A09 = r6;
        this.A01 = r5;
        this.A08 = AnonymousClass6FA.A00(userSession);
        this.A03 = new AnonymousClass74S(userSession);
        this.A0A = z;
        this.A0B = z2;
    }

    private void A03(IgImageView igImageView, List list, int i, int i2, int i3) {
        int i4;
        if (!list.isEmpty()) {
            Context context = igImageView.getContext();
            if (i > list.size()) {
                i4 = i - Math.min(list.size(), 3);
            } else {
                i4 = 0;
            }
            igImageView.setVisibility(0);
            ON3 on3 = new ON3(context, this.A04.getModuleName(), list, i3);
            on3.A0B = true;
            on3.A0F = false;
            on3.A07 = AnonymousClass05K.A00;
            on3.A00 = 0.3f;
            on3.A01(6);
            on3.A0G = true;
            on3.A02 = i4;
            on3.A05 = Integer.valueOf(context.getColor(2Yu.A07(context)));
            on3.A08 = Integer.valueOf(i2);
            on3.A01 = 3;
            on3.A04 = Integer.valueOf(context.getColor(2Yu.A0H(context, R.attr.igds_color_stroke)));
            on3.A0A = true;
            igImageView.setImageDrawable(on3.A00());
        }
    }
}
