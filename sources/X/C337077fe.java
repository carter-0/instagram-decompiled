package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.7fe  reason: invalid class name and case insensitive filesystem */
public abstract class C337077fe {
    public static IgFrameLayout A00(Context context, int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, -2);
        IgFrameLayout igFrameLayout = new IgFrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.emoji_row_item_contents, igFrameLayout, true);
        igFrameLayout.setLayoutParams(layoutParams);
        igFrameLayout.setTag(new C337057fc(igFrameLayout, i));
        return igFrameLayout;
    }

    public static IgFrameLayout A01(Context context, int i, boolean z) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        if (z) {
            layoutParams.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material));
        }
        IgFrameLayout igFrameLayout = new IgFrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.emoji_row_item_contents, igFrameLayout, true);
        igFrameLayout.setLayoutParams(layoutParams);
        igFrameLayout.setTag(new C337057fc(igFrameLayout, i));
        return igFrameLayout;
    }

    public static void A02(AnonymousClass0iw r7, UserSession userSession, C317486nL r9, AnonymousClass7Q6 r10, C337057fc r11) {
        A03(r7, userSession, r9, r10, r11, 1.0f, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.instagram.common.ui.widget.imageview.ConstrainedImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: com.instagram.common.ui.widget.imageview.ConstrainedImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: android.view.View} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0078, code lost:
        if (r0 != null) goto L_0x007a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.AnonymousClass0iw r16, com.instagram.common.session.UserSession r17, X.C317486nL r18, X.AnonymousClass7Q6 r19, X.C337057fc r20, float r21, boolean r22) {
        /*
            r8 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x0010
            r1 = 1455262663(0x56bd8bc7, float:1.04204018E14)
            java.lang.String r0 = "EmojiGridRowItemViewBinder.bindView"
            X.0fS.A01(r0, r1)
        L_0x0010:
            r2 = r20
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r3 = r2.A08     // Catch:{ all -> 0x00bf }
            android.content.Context r11 = r3.getContext()     // Catch:{ all -> 0x00bf }
            android.content.res.Resources r1 = r11.getResources()     // Catch:{ all -> 0x00bf }
            X.3NM r0 = r2.A06     // Catch:{ all -> 0x00bf }
            r0.A02()     // Catch:{ all -> 0x00bf }
            r4 = 0
            r15 = r18
            X.0qQ.A0B(r15, r4)     // Catch:{ all -> 0x00bf }
            int r0 = r15.A00     // Catch:{ all -> 0x00bf }
            if (r0 >= 0) goto L_0x002d
            r7 = -1
            goto L_0x002f
        L_0x002d:
            int r7 = r0 % 6
        L_0x002f:
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            int r0 = r1.getDimensionPixelSize(r0)     // Catch:{ all -> 0x00bf }
            float r6 = (float) r0     // Catch:{ all -> 0x00bf }
            android.graphics.Matrix r5 = r2.A04     // Catch:{ all -> 0x00bf }
            int r0 = -r7
            float r1 = (float) r0     // Catch:{ all -> 0x00bf }
            float r1 = r1 * r6
            r0 = 0
            r5.setTranslate(r1, r0)     // Catch:{ all -> 0x00bf }
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()     // Catch:{ all -> 0x00bf }
            int r0 = r2.A03     // Catch:{ all -> 0x00bf }
            r1.width = r0     // Catch:{ all -> 0x00bf }
            r1.height = r0     // Catch:{ all -> 0x00bf }
            r3.setLayoutParams(r1)     // Catch:{ all -> 0x00bf }
            float r0 = r2.A01     // Catch:{ all -> 0x00bf }
            r5.postScale(r0, r0)     // Catch:{ all -> 0x00bf }
            r13 = r16
            r14 = r17
            if (r7 >= 0) goto L_0x006a
            r0 = 0
            r3.setImageMatrix(r0)     // Catch:{ all -> 0x00bf }
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ all -> 0x00bf }
            r3.setScaleType(r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r1 = r15.A01     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r15.A02     // Catch:{ all -> 0x00bf }
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C336957fS.A00(r1, r0)     // Catch:{ all -> 0x00bf }
            goto L_0x007a
        L_0x006a:
            r3.setImageMatrix(r5)     // Catch:{ all -> 0x00bf }
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ all -> 0x00bf }
            r3.setScaleType(r0)     // Catch:{ all -> 0x00bf }
            int r0 = r2.A02     // Catch:{ all -> 0x00bf }
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C337087ff.A00(r14, r15, r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x007d
        L_0x007a:
            r3.setUrl(r0, r13)     // Catch:{ all -> 0x00bf }
        L_0x007d:
            java.lang.String r0 = r15.A02     // Catch:{ all -> 0x00bf }
            r3.setContentDescription(r0)     // Catch:{ all -> 0x00bf }
            r0 = 1
            r3.setFocusable(r0)     // Catch:{ all -> 0x00bf }
            r1 = 0
            r3.setVisibility(r4)     // Catch:{ all -> 0x00bf }
            r18 = r22
            if (r22 == 0) goto L_0x0097
            boolean r0 = X.C337097fg.A00(r15)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0097
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r0 = r2.A07     // Catch:{ all -> 0x00bf }
            goto L_0x009b
        L_0x0097:
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r0 = r2.A07     // Catch:{ all -> 0x00bf }
            r1 = 8
        L_0x009b:
            r0.setVisibility(r1)     // Catch:{ all -> 0x00bf }
            r0 = r21
            r3.setAlpha(r0)     // Catch:{ all -> 0x00bf }
            android.content.res.Resources r12 = r11.getResources()     // Catch:{ all -> 0x00bf }
            X.7fk r10 = new X.7fk     // Catch:{ all -> 0x00bf }
            r16 = r19
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00bf }
            r2.A00 = r10     // Catch:{ all -> 0x00bf }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x00be
            r0 = -186951077(0xfffffffff4db5a5b, float:-1.3903145E32)
            X.0fS.A00(r0)
        L_0x00be:
            return
        L_0x00bf:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x00cc
            r0 = 1251405705(0x4a96ef89, float:4945860.5)
            X.0fS.A00(r0)
        L_0x00cc:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337077fe.A03(X.0iw, com.instagram.common.session.UserSession, X.6nL, X.7Q6, X.7fc, float, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public static void A04(C337057fc r2) {
        AnonymousClass3NM r0 = r2.A06;
        r0.A02();
        r0.A03();
        r2.A00 = null;
        r2.A08.setVisibility(4);
        r2.A07.setVisibility(8);
    }
}
