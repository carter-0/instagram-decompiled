package X;

import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.3v5  reason: invalid class name and case insensitive filesystem */
public abstract class C256013v5 {
    public static final C246453ed A00 = new C256023v6();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3v7, java.lang.Object] */
    public static final C256033v7 A00(ViewStub viewStub) {
        ? obj = new Object();
        obj.A00 = viewStub;
        obj.A01 = null;
        obj.A04 = null;
        obj.A07 = null;
        obj.A06 = null;
        obj.A05 = null;
        obj.A02 = null;
        obj.A08 = null;
        obj.A03 = null;
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r15 != null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C242553Us r12, X.AnonymousClass77D r13, X.C256033v7 r14, int[] r15, boolean r16) {
        /*
            r3 = 0
            X.0qQ.A0B(r14, r3)
            com.instagram.feed.widget.IgProgressImageView r2 = r14.A07
            if (r2 == 0) goto L_0x003b
            r4 = 0
            r11 = 0
            r0 = 127(0x7f, float:1.78E-43)
            X.7Df r1 = new X.7Df
            r1.<init>(r4, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A02(r12, r0)
            android.graphics.drawable.ShapeDrawable r7 = new android.graphics.drawable.ShapeDrawable
            r7.<init>(r1)
            r9 = r15
            if (r16 == 0) goto L_0x003c
            if (r15 == 0) goto L_0x0052
            int r1 = r15.length
            r0 = 1
            if (r1 <= r0) goto L_0x003e
            r10 = 1145044992(0x44400000, float:768.0)
            android.graphics.drawable.shapes.Shape r8 = r7.getShape()
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            android.graphics.Paint$Cap r5 = android.graphics.Paint.Cap.BUTT
            X.C308486Ul.A01(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0031:
            r2.setBackground(r7)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.getIgImageView()
            r0.setImageRendererAndReset(r13)
        L_0x003b:
            return
        L_0x003c:
            if (r15 == 0) goto L_0x0052
        L_0x003e:
            java.lang.Integer r0 = X.03t.A04(r15, r3)
            if (r0 == 0) goto L_0x0052
            int r0 = r0.intValue()
        L_0x0048:
            android.graphics.drawable.shapes.Shape r3 = r7.getShape()
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            X.C308486Ul.A02(r1, r7, r3, r11, r0)
            goto L_0x0031
        L_0x0052:
            android.content.Context r1 = r2.getContext()
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            int r0 = r1.getColor(r0)
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256013v5.A01(X.3Us, X.77D, X.3v7, int[], boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass0iw r11, X.C246633ev r12, X.C256033v7 r13, float[] r14, boolean r15, boolean r16, boolean r17) {
        /*
            r4 = 0
            X.0qQ.A0B(r13, r4)
            r3 = 4
            X.0qQ.A0B(r11, r3)
            r2 = 6
            if (r12 != 0) goto L_0x0013
            java.lang.String r1 = "MediaOverlayCoverViewBinder"
            java.lang.String r0 = "Media is not covered"
            X.0wb.A03(r1, r0)
            return
        L_0x0013:
            android.view.ViewStub r5 = r13.A00
            if (r5 == 0) goto L_0x004e
            android.widget.FrameLayout r0 = r13.A01
            if (r0 != 0) goto L_0x004e
            if (r16 == 0) goto L_0x0023
            r0 = 2131627762(0x7f0e0ef2, float:1.8882798E38)
            r5.setLayoutResource(r0)
        L_0x0023:
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout"
            android.view.View r1 = r5.inflate()
            X.0qQ.A0C(r1, r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            if (r16 == 0) goto L_0x00a1
            r0 = 2131627762(0x7f0e0ef2, float:1.8882798E38)
            r5.setLayoutResource(r0)
            r0 = 2131434058(0x7f0b1a4a, float:1.848992E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r13.A02 = r0
            r0 = 2131437679(0x7f0b286f, float:1.8497263E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.A06 = r0
        L_0x004c:
            r13.A01 = r1
        L_0x004e:
            r6 = 8
            if (r16 == 0) goto L_0x00f0
            android.widget.ImageView r0 = r13.A02
            if (r0 == 0) goto L_0x0059
            r0.setVisibility(r4)
        L_0x0059:
            android.widget.TextView r0 = r13.A06
            if (r0 == 0) goto L_0x0060
            r0.setVisibility(r4)
        L_0x0060:
            android.widget.ImageView r2 = r13.A02
            if (r2 == 0) goto L_0x0077
            android.widget.FrameLayout r0 = r13.A01
            if (r0 == 0) goto L_0x009f
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x009f
            int r0 = r12.A00
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
        L_0x0074:
            r2.setImageDrawable(r0)
        L_0x0077:
            android.widget.ImageView r0 = r13.A02
            if (r0 == 0) goto L_0x0086
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            if (r1 == 0) goto L_0x0086
            android.graphics.PorterDuffColorFilter r0 = X.C52501GVd.A01
            r1.setColorFilter(r0)
        L_0x0086:
            java.lang.String r1 = r12.A05
            android.widget.TextView r0 = r13.A06
            if (r1 == 0) goto L_0x0092
            if (r0 == 0) goto L_0x0091
            r0.setText(r1)
        L_0x0091:
            return
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            r0.setVisibility(r6)
        L_0x0097:
            android.widget.ImageView r0 = r13.A02
            if (r0 == 0) goto L_0x0091
            r0.setVisibility(r6)
            return
        L_0x009f:
            r0 = 0
            goto L_0x0074
        L_0x00a1:
            r0 = 2131434692(0x7f0b1cc4, float:1.8491205E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r13.A04 = r0
            r0 = 2131428822(0x7f0b05d6, float:1.84793E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.feed.widget.IgProgressImageView r0 = (com.instagram.feed.widget.IgProgressImageView) r0
            r13.A07 = r0
            r0 = 2131439962(0x7f0b315a, float:1.8501894E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.A06 = r0
            r0 = 2131439961(0x7f0b3159, float:1.8501892E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.A05 = r0
            r0 = 2131434058(0x7f0b1a4a, float:1.848992E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r13.A02 = r0
            r0 = 2131428897(0x7f0b0621, float:1.8479451E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r0
            r13.A08 = r0
            r0 = 2131429754(0x7f0b097a, float:1.848119E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r13.A03 = r0
            goto L_0x004c
        L_0x00f0:
            com.instagram.feed.widget.IgProgressImageView r7 = r13.A07
            java.lang.String r1 = "Required value was null."
            if (r7 == 0) goto L_0x02bf
            r7.setVisibility(r4)
            android.widget.ImageView r0 = r13.A02
            if (r0 == 0) goto L_0x02b9
            r0.setVisibility(r4)
            android.widget.TextView r0 = r13.A06
            if (r0 == 0) goto L_0x02b3
            r0.setVisibility(r4)
            android.widget.TextView r0 = r13.A05
            if (r0 == 0) goto L_0x02ad
            r0.setVisibility(r4)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r13.A08
            if (r0 == 0) goto L_0x02a7
            r0.setVisibility(r6)
            android.widget.LinearLayout r5 = r13.A04
            if (r5 == 0) goto L_0x02a1
            r0 = -1
            r5.setGravity(r0)
            android.widget.LinearLayout r5 = r13.A03
            if (r5 == 0) goto L_0x029b
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            r0.height = r4
            android.view.ViewGroup$LayoutParams r8 = r5.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            X.0qQ.A0C(r8, r0)
            android.widget.LinearLayout$LayoutParams r8 = (android.widget.LinearLayout.LayoutParams) r8
            r5 = 1065353216(0x3f800000, float:1.0)
            r8.weight = r5
            if (r17 == 0) goto L_0x0148
            android.widget.TextView r0 = r13.A05
            if (r0 == 0) goto L_0x013f
            r0.setMaxLines(r3)
        L_0x013f:
            android.widget.TextView r3 = r13.A05
            if (r3 == 0) goto L_0x0148
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r0)
        L_0x0148:
            android.content.Context r3 = r7.getContext()
            boolean r0 = r12.A08
            if (r0 == 0) goto L_0x01f3
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r7.getIgImageView()
            r0 = 2130970328(0x7f0406d8, float:1.7549363E38)
            int r0 = X.2Yu.A0H(r3, r0)
            int r0 = r3.getColor(r0)
            r2.setBackgroundColor(r0)
        L_0x0162:
            r7.setEnableProgressBar(r4)
        L_0x0165:
            android.widget.ImageView r2 = r13.A02
            if (r2 == 0) goto L_0x0295
            int r0 = r12.A00
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r2.setImageDrawable(r0)
            android.widget.ImageView r0 = r13.A02
            if (r0 == 0) goto L_0x028f
            android.graphics.drawable.Drawable r2 = r0.getDrawable()
            if (r2 == 0) goto L_0x0289
            android.graphics.PorterDuffColorFilter r0 = X.C52501GVd.A01
            r2.setColorFilter(r0)
            java.lang.String r2 = r12.A05
            android.widget.TextView r0 = r13.A06
            if (r2 == 0) goto L_0x01ed
            if (r0 == 0) goto L_0x027d
            r0.setText(r2)
        L_0x018c:
            X.9IV r7 = r12.A01
            java.lang.Object r2 = r7.A01
            X.0sK r2 = (X.0sK) r2
            android.widget.FrameLayout r0 = r13.A01
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r15)
            java.lang.Object r3 = r2.invoke(r3, r0, r6)
            android.text.SpannableStringBuilder r3 = (android.text.SpannableStringBuilder) r3
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x01b4
            android.widget.TextView r2 = r13.A05
            if (r2 == 0) goto L_0x0277
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r0)
            android.widget.TextView r0 = r13.A05
            if (r0 == 0) goto L_0x0271
            r0.setHighlightColor(r4)
        L_0x01b4:
            android.widget.TextView r0 = r13.A05
            if (r0 == 0) goto L_0x026b
            r0.setText(r3)
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x01de
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r13.A08
            if (r0 == 0) goto L_0x0265
            r0.setVisibility(r4)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r3 = r13.A08
            if (r3 == 0) goto L_0x025f
            java.lang.String r0 = r12.A04
            r3.setLabel(r0)
            java.lang.Object r2 = r7.A00
            X.0sL r2 = (X.0sL) r2
            android.widget.FrameLayout r0 = r13.A01
            java.lang.Object r0 = r2.invoke(r0, r6)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            X.AnonymousClass0fU.A00(r0, r3)
        L_0x01de:
            android.widget.FrameLayout r0 = r13.A01
            if (r0 == 0) goto L_0x0259
            r0.setVisibility(r4)
            android.widget.FrameLayout r0 = r13.A01
            if (r0 == 0) goto L_0x0253
            r0.setAlpha(r5)
            return
        L_0x01ed:
            if (r0 == 0) goto L_0x0283
            r0.setVisibility(r6)
            goto L_0x018c
        L_0x01f3:
            com.instagram.common.typedurl.ImageUrl r9 = r12.A02
            if (r9 == 0) goto L_0x020f
            com.instagram.common.ui.widget.imageview.IgImageView r10 = r7.getIgImageView()
            r0 = 2131099784(0x7f060088, float:1.781193E38)
            int r8 = r3.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = X.C52501GVd.A00
            r10.setColorFilter(r8, r0)
            r7.setMiniPreviewBlurRadius(r2)
            r7.setUrl(r9, r11)
            goto L_0x0165
        L_0x020f:
            com.instagram.common.typedurl.ImageUrl r8 = r12.A03
            if (r8 == 0) goto L_0x0162
            if (r17 == 0) goto L_0x0162
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r2 < r0) goto L_0x0247
            r7.setUrl(r8, r11)
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            r0 = 1092616192(0x41200000, float:10.0)
            android.graphics.RenderEffect r2 = android.graphics.RenderEffect.createBlurEffect(r0, r0, r2)
            X.0qQ.A07(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.getIgImageView()
            r0.setRenderEffect(r2)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setCornerRadii(r14)
            r0 = 2131099796(0x7f060094, float:1.7811955E38)
        L_0x023b:
            int r0 = r3.getColor(r0)
            r2.setColor(r0)
            r7.setForeground(r2)
            goto L_0x0165
        L_0x0247:
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setCornerRadii(r14)
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            goto L_0x023b
        L_0x0253:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0259:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x025f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0265:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x026b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0271:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0277:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x027d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0283:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0289:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x028f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0295:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x029b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02a7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02ad:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02b3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02b9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02bf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C256013v5.A02(X.0iw, X.3ev, X.3v7, float[], boolean, boolean, boolean):void");
    }

    public static final void A03(C256033v7 r1) {
        FrameLayout frameLayout;
        if (r1 != null && (frameLayout = r1.A01) != null) {
            frameLayout.setVisibility(8);
        }
    }

    public static final void A04(C256033v7 r2) {
        IgdsMediaButton igdsMediaButton = r2.A08;
        if (igdsMediaButton != null) {
            igdsMediaButton.setVisibility(8);
        }
        TextView textView = r2.A06;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = r2.A05;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }
}
