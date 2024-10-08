package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.878  reason: invalid class name */
public final class AnonymousClass878 {
    public final UserSession A00;
    public final String A01;
    public final int A02;

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0249, code lost:
        r9.setContentDescription(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0253, code lost:
        r1 = r7.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0255, code lost:
        if (r1 == null) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0257, code lost:
        r1.setBackground(r11.A00.getDrawable(com.instagram.android.R.drawable.circle_shadow));
        r1.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0266, code lost:
        X.AnonymousClass0fU.A00(new X.C371048xU(r8, r13, r7, r11, r6), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0141, code lost:
        if (r15 != false) goto L_0x0144;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass87G r23, X.AnonymousClass0iw r24, X.AnonymousClass877 r25, X.C370978xN r26, X.AnonymousClass8DT r27, int r28, int r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r22 = this;
            r5 = 0
            r7 = r26
            X.0qQ.A0B(r7, r5)
            r4 = 1
            r8 = r23
            X.0qQ.A0B(r8, r4)
            r0 = 2
            r11 = r24
            X.0qQ.A0B(r11, r0)
            r6 = r28
            r7.A00 = r6
            r7.A01 = r8
            android.widget.ImageView r0 = r7.A06
            r3 = 8
            if (r0 == 0) goto L_0x0021
            r0.setVisibility(r3)
        L_0x0021:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r7.A08
            if (r2 == 0) goto L_0x0028
            r2.setVisibility(r3)
        L_0x0028:
            r10 = 1
            r15 = 0
            r14 = r29
            if (r6 != r14) goto L_0x0058
            r15 = 1
            if (r33 == 0) goto L_0x0058
            android.view.View r1 = r7.A03
            if (r1 == 0) goto L_0x0058
            boolean r0 = r1.isEnabled()
            if (r0 != r4) goto L_0x0058
            android.graphics.drawable.GradientDrawable r4 = r7.A02
            android.content.Context r2 = r1.getContext()
            int r0 = X.2Yu.A05(r2)
            int r0 = r2.getColor(r0)
            r4.setColor(r0)
            r1.setBackground(r4)
            r1.setVisibility(r5)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A07
            r0.setVisibility(r3)
            return
        L_0x0058:
            android.view.View r0 = r7.A03
            if (r0 == 0) goto L_0x005f
            r0.setVisibility(r3)
        L_0x005f:
            com.instagram.common.ui.widget.imageview.IgImageView r9 = r7.A07
            r9.setVisibility(r5)
            X.87G r1 = r7.A01
            r0 = r22
            if (r1 == 0) goto L_0x0077
            boolean r1 = r1.A03()
            if (r1 != 0) goto L_0x0077
            android.graphics.drawable.GradientDrawable r12 = r7.A02
            int r1 = r0.A02
            r12.setColor(r1)
        L_0x0077:
            android.graphics.drawable.GradientDrawable r1 = r7.A02
            r9.setBackground(r1)
            com.instagram.model.shopping.ProductItemWithAR r12 = r8.A06
            if (r12 == 0) goto L_0x02c3
            com.instagram.model.shopping.ProductArEffectMetadata r12 = r12.A00
            com.instagram.model.shopping.EffectThumbnailImageDict r12 = r12.A02
            if (r12 == 0) goto L_0x02c3
            com.instagram.common.typedurl.ImageUrl r12 = r12.A00
        L_0x0088:
            if (r12 != 0) goto L_0x008e
            android.graphics.drawable.Drawable r12 = r8.A01
            if (r12 == 0) goto L_0x02be
        L_0x008e:
            java.lang.String r12 = r8.A0D
            if (r12 != 0) goto L_0x0097
            java.lang.String r12 = r8.A0G
            X.0qQ.A07(r12)
        L_0x0097:
            r9.setContentDescription(r12)
            boolean r12 = r8.A03()
            r13 = 0
            if (r12 == 0) goto L_0x028b
            android.graphics.drawable.Drawable r11 = r8.A01
            if (r11 != 0) goto L_0x00e9
            android.view.View r11 = r7.A05
            android.content.Context r17 = r11.getContext()
            android.content.res.Resources r12 = r17.getResources()
            r11 = 2131165286(0x7f070066, float:1.7944785E38)
            int r11 = r12.getDimensionPixelSize(r11)
            int r21 = r11 * 2
            com.instagram.common.session.UserSession r13 = r0.A00
            com.instagram.model.shopping.ProductItemWithAR r0 = r8.A06
            if (r0 == 0) goto L_0x0287
            com.instagram.model.shopping.ProductArEffectMetadata r0 = r0.A00
            com.instagram.model.shopping.EffectThumbnailImageDict r0 = r0.A02
            if (r0 == 0) goto L_0x0287
            com.instagram.common.typedurl.ImageUrl r0 = r0.A00
        L_0x00c6:
            if (r0 == 0) goto L_0x00ce
            java.lang.String r20 = r0.getUrl()
            if (r20 != 0) goto L_0x00d0
        L_0x00ce:
            java.lang.String r20 = ""
        L_0x00d0:
            android.graphics.drawable.GradientDrawable$Orientation r12 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            int[] r11 = X.AnonymousClass6LW.A07
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r12, r11)
            r0.setShape(r4)
            X.Jd8 r11 = new X.Jd8
            r16 = r11
            r18 = r0
            r19 = r13
            r16.<init>(r17, r18, r19, r20, r21)
            r8.A01 = r11
        L_0x00e9:
            A00(r8, r7)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.ImageView"
            X.0qQ.A0C(r9, r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r9.setScaleType(r0)
        L_0x00f6:
            X.8xS r0 = new X.8xS
            r13 = r25
            r0.<init>(r8, r13, r6)
            X.AnonymousClass0fU.A00(r0, r9)
            r11 = r27
            if (r27 == 0) goto L_0x0128
            if (r14 != r6) goto L_0x027f
            r14 = 1
            X.8xT r0 = new X.8xT
            r0.<init>(r7)
        L_0x010c:
            X.03v.A0B(r9, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r12 = r7.A09
            if (r12 == 0) goto L_0x011b
            r0 = 8
            if (r14 == 0) goto L_0x0118
            r0 = 0
        L_0x0118:
            r12.setVisibility(r0)
        L_0x011b:
            X.87I r0 = r8.A04
            if (r0 != 0) goto L_0x0121
            X.87I r0 = X.AnonymousClass87I.EMPTY
        L_0x0121:
            int r0 = r0.ordinal()
            switch(r0) {
                case 2: goto L_0x01a4;
                case 16: goto L_0x0152;
                case 22: goto L_0x0191;
                case 23: goto L_0x0180;
                case 28: goto L_0x020b;
                case 30: goto L_0x024c;
                case 33: goto L_0x0224;
                default: goto L_0x0128;
            }
        L_0x0128:
            if (r15 != 0) goto L_0x013e
            if (r30 == 0) goto L_0x013e
            r9.setVisibility(r3)
        L_0x012f:
            if (r31 == 0) goto L_0x0144
            r9.setEnabled(r5)
            r0 = 1050253722(0x3e99999a, float:0.3)
            r9.setAlpha(r0)
        L_0x013a:
            r9.setImportantForAccessibility(r10)
            return
        L_0x013e:
            r9.setVisibility(r5)
            if (r15 != 0) goto L_0x0144
            goto L_0x012f
        L_0x0144:
            r9.setEnabled(r4)
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.setAlpha(r0)
            if (r15 == 0) goto L_0x013a
            if (r32 != 0) goto L_0x013a
            r10 = 2
            goto L_0x013a
        L_0x0152:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            r9.setScaleType(r0)
            X.8DS r2 = r11.A04
            java.lang.String r0 = r2.Brf()
            if (r0 == 0) goto L_0x017e
            java.lang.String r1 = r8.A0G
            java.lang.String r0 = r2.Brf()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x017e
            android.content.Context r1 = r11.A00
            r0 = 2131099787(0x7f06008b, float:1.7811937E38)
            int r0 = r1.getColor(r0)
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r0)
        L_0x0179:
            r9.setForeground(r1)
            goto L_0x0253
        L_0x017e:
            r1 = 0
            goto L_0x0179
        L_0x0180:
            r9.A09()
            com.instagram.ui.widget.bubblespinner.BubbleSpinner r1 = r7.A0B
            if (r1 == 0) goto L_0x0253
            r1.setVisibility(r5)
            X.8YA r0 = X.AnonymousClass8YA.LOADING
            r1.setLoadingStatus(r0)
            goto L_0x0253
        L_0x0191:
            r9.A09()
            android.graphics.drawable.Drawable r0 = r11.A01
            r9.setImageDrawable(r0)
            android.content.Context r1 = r11.A00
            r0 = 2131960861(0x7f13241d, float:1.9558403E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0249
        L_0x01a4:
            boolean r0 = r8.A0N
            if (r0 == 0) goto L_0x01e3
            r0 = -5068377(0xffffffffffb2a9a7, float:NaN)
            r1.setColor(r0)
            r0 = 120(0x78, float:1.68E-43)
            r1.setAlpha(r0)
            r9.A09()
            X.8DS r0 = r11.A04
            boolean r0 = r0.EsW()
            if (r0 == 0) goto L_0x0200
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
        L_0x01c0:
            r9.setScaleType(r0)
            r9.setBackground(r1)
            X.8DV r12 = r11.A02
            r1 = 17
            int r0 = r12.A03
            if (r0 == r1) goto L_0x01d5
            r12.A03 = r1
            r12.A05 = r4
            r12.invalidateSelf()
        L_0x01d5:
            r0 = -1
            r9.setColorFilter(r0)
            r9.setImageDrawable(r12)
            com.instagram.ui.widget.bubblespinner.BubbleSpinner r0 = r7.A0B
            if (r0 == 0) goto L_0x01e3
            r0.setVisibility(r3)
        L_0x01e3:
            com.instagram.camera.effect.models.CameraAREffect r1 = r8.A00()
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x0253
            if (r2 == 0) goto L_0x0253
            if (r1 == 0) goto L_0x0203
            boolean r0 = r1.A0j
            if (r0 != r4) goto L_0x0203
            boolean r0 = r8.A0M
            if (r0 == 0) goto L_0x0203
            android.view.View[] r1 = new android.view.View[]{r2}
            r0 = 0
            X.C294975nL.A04(r0, r1, r4)
            goto L_0x0253
        L_0x0200:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            goto L_0x01c0
        L_0x0203:
            android.view.View[] r0 = new android.view.View[]{r2}
            X.C294975nL.A05(r0, r5)
            goto L_0x0253
        L_0x020b:
            X.8DS r2 = r11.A04
            int r0 = r2.B0t()
            r1.setColor(r0)
            r9.A09()
            r9.setBackground(r1)
            android.graphics.drawable.Drawable r0 = r2.B0v()
            r9.setImageDrawable(r0)
            java.lang.String r0 = r8.A0G
            goto L_0x0249
        L_0x0224:
            X.8DS r2 = r11.A04
            int r0 = r2.B0t()
            r1.setColor(r0)
            r9.A09()
            boolean r0 = r2.EsW()
            if (r0 == 0) goto L_0x027c
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
        L_0x0238:
            r9.setScaleType(r0)
            r9.setBackground(r1)
            android.graphics.drawable.Drawable r0 = r2.B0v()
            r9.setImageDrawable(r0)
            java.lang.String r0 = r2.B0u()
        L_0x0249:
            r9.setContentDescription(r0)
        L_0x024c:
            com.instagram.ui.widget.bubblespinner.BubbleSpinner r0 = r7.A0B
            if (r0 == 0) goto L_0x0253
            r0.setVisibility(r3)
        L_0x0253:
            android.view.View r1 = r7.A04
            if (r1 == 0) goto L_0x0266
            android.content.Context r2 = r11.A00
            r0 = 2131231347(0x7f080273, float:1.8078772E38)
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r1.setBackground(r0)
            r1.setVisibility(r5)
        L_0x0266:
            X.8xU r0 = new X.8xU
            r16 = r0
            r17 = r8
            r18 = r13
            r19 = r7
            r20 = r11
            r21 = r6
            r16.<init>(r17, r18, r19, r20, r21)
            X.AnonymousClass0fU.A00(r0, r9)
            goto L_0x0128
        L_0x027c:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            goto L_0x0238
        L_0x027f:
            r14 = 0
            X.8xV r0 = new X.8xV
            r0.<init>()
            goto L_0x010c
        L_0x0287:
            com.instagram.common.typedurl.ImageUrl r0 = r8.A05
            goto L_0x00c6
        L_0x028b:
            com.instagram.model.shopping.ProductItemWithAR r12 = r8.A06
            if (r12 == 0) goto L_0x02a3
            com.instagram.model.shopping.ProductArEffectMetadata r12 = r12.A00
            com.instagram.model.shopping.EffectThumbnailImageDict r12 = r12.A02
            if (r12 == 0) goto L_0x02a3
            com.instagram.common.typedurl.ImageUrl r12 = r12.A00
        L_0x0297:
            if (r12 == 0) goto L_0x02a6
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.typedurl.ImageUrl"
            X.0qQ.A0C(r12, r0)
            r9.setUrl(r12, r11)
            goto L_0x00f6
        L_0x02a3:
            com.instagram.common.typedurl.ImageUrl r12 = r8.A05
            goto L_0x0297
        L_0x02a6:
            android.graphics.drawable.Drawable r11 = r8.A01
            if (r11 == 0) goto L_0x02af
            A00(r8, r7)
            goto L_0x00f6
        L_0x02af:
            java.lang.String r12 = r0.A01
            java.lang.String r11 = "Thumbnail url empty for effect="
            java.lang.String r0 = r8.getId()
            java.lang.String r0 = X.002.A0R(r11, r0)
            X.0kD.A07(r12, r0, r13)
        L_0x02be:
            r9.A09()
            goto L_0x00f6
        L_0x02c3:
            com.instagram.common.typedurl.ImageUrl r12 = r8.A05
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass878.A01(X.87G, X.0iw, X.877, X.8xN, X.8DT, int, int, boolean, boolean, boolean, boolean):void");
    }

    public static final void A00(AnonymousClass87G r4, C370978xN r5) {
        IgImageView igImageView = r5.A07;
        igImageView.A09();
        igImageView.setImageDrawable(r4.A01);
        Drawable drawable = r4.A01;
        if (drawable instanceof BitmapDrawable) {
            C231672s5 r1 = r5.A0A;
            0qQ.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap != null) {
                r1.EF5(bitmap, igImageView);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public AnonymousClass878(Context context, UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = context.getColor(R.color.grey_10);
    }
}
