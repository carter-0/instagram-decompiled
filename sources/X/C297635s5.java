package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.List;

/* renamed from: X.5s5  reason: invalid class name and case insensitive filesystem */
public final class C297635s5 {
    public static boolean A00;
    public static final C297635s5 A01 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        if (X.C243353Yk.A00.A04(r9, r10) != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (r1 != com.instagram.api.schemas.RIXUCoverElementMetadataType.A0B) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        if (r1 == com.instagram.api.schemas.RIXUCoverElementMetadataType.A07) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c2, code lost:
        if (r2 != null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        if (r2.isEmpty() != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cc, code lost:
        if (r1 == com.instagram.api.schemas.RIXUCoverElementMetadataType.A09) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d0, code lost:
        if (r1 == com.instagram.api.schemas.RIXUCoverElementMetadataType.A07) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d4, code lost:
        if (r1 != com.instagram.api.schemas.RIXUCoverElementMetadataType.A08) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d6, code lost:
        A01(r8, r11.A08, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00db, code lost:
        if (r4 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00df, code lost:
        if (r1 == com.instagram.api.schemas.RIXUCoverElementMetadataType.A0B) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e1, code lost:
        if (r2 == null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e7, code lost:
        if (r2.isEmpty() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00eb, code lost:
        if (r1 != com.instagram.api.schemas.RIXUCoverElementMetadataType.A07) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ed, code lost:
        r5 = r11.A09;
        r4 = r6.getResources();
        r1 = java.lang.Integer.valueOf(r10.A0v());
        X.0qQ.A0A(r4);
        r2 = true;
        r1 = X.C253673rC.A04(r4, r1, org.webrtc.CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false);
        r0 = X.AnonymousClass3f0.A00(r4, r10.A0v());
        r5.setText(r1);
        r5.setContentDescription(r0);
        r5.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011e, code lost:
        if (r2.isEmpty() != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r6, X.C61080JwI r7, X.AnonymousClass0iw r8, com.instagram.common.session.UserSession r9, X.1Xj r10, X.C297595s1 r11) {
        /*
            java.lang.Object r1 = r7.A00
            com.instagram.api.schemas.RIXUCoverElementMetadataType r1 = (com.instagram.api.schemas.RIXUCoverElementMetadataType) r1
            if (r1 == 0) goto L_0x008d
            int r0 = r1.ordinal()
            r2 = 1
            if (r0 == r2) goto L_0x0121
            r5 = 10
            if (r0 != r5) goto L_0x008d
            X.1Xy r0 = r10.A0C
            java.util.List r0 = r0.BxO()
            if (r0 == 0) goto L_0x0136
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r0.iterator()
        L_0x0022:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.3yf r0 = (X.C258223yf) r0
            com.instagram.api.schemas.SocialContextType r1 = r0.BxW()
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.TEMPLATE_USED_BY_FRIENDS
            if (r1 != r0) goto L_0x0022
            r6.add(r3)
            goto L_0x0022
        L_0x003b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0044:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r6.next()
            X.3yf r0 = (X.C258223yf) r0
            java.util.List r1 = r0.BxQ()
            int r0 = X.0Yv.A1E(r1, r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0061:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.Object r0 = r1.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.50R r0 = X.AnonymousClass50Q.A00(r0)
            r3.add(r0)
            goto L_0x0061
        L_0x0075:
            X.018.A16(r3, r4)
            goto L_0x0044
        L_0x0079:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0136
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r11.A0F
            r0 = 0
            r1.setVisibility(r0)
            A00 = r2
            com.instagram.common.ui.base.IgSimpleImageView r0 = r11.A08
            A01(r8, r0, r4)
            return
        L_0x008d:
            X.3Yy r0 = X.C243483Yy.A00
            java.util.List r2 = r0.A05(r9, r10)
            int r0 = r10.A0v()
            if (r0 <= 0) goto L_0x00a2
            X.3Yk r0 = X.C243353Yk.A00
            boolean r0 = r0.A04(r9, r10)
            r4 = 1
            if (r0 == 0) goto L_0x00a3
        L_0x00a2:
            r4 = 0
        L_0x00a3:
            if (r2 == 0) goto L_0x00af
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00af
            com.instagram.api.schemas.RIXUCoverElementMetadataType r0 = com.instagram.api.schemas.RIXUCoverElementMetadataType.LIKED_BY_FACEPILE_WITH_HEART
            if (r1 == r0) goto L_0x00b9
        L_0x00af:
            if (r4 == 0) goto L_0x0118
            com.instagram.api.schemas.RIXUCoverElementMetadataType r0 = com.instagram.api.schemas.RIXUCoverElementMetadataType.LIKE_COUNT_WITH_HEART
            if (r1 == r0) goto L_0x00b9
        L_0x00b5:
            com.instagram.api.schemas.RIXUCoverElementMetadataType r0 = com.instagram.api.schemas.RIXUCoverElementMetadataType.FACEPILE_OR_LIKE_COUNT_WITH_HEART
            if (r1 != r0) goto L_0x00c2
        L_0x00b9:
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r11.A0D
            r0 = 0
            r3.setVisibility(r0)
            r0 = 1
            A00 = r0
        L_0x00c2:
            if (r2 == 0) goto L_0x00db
        L_0x00c4:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00db
            com.instagram.api.schemas.RIXUCoverElementMetadataType r0 = com.instagram.api.schemas.RIXUCoverElementMetadataType.LIKED_BY_FACEPILE_WITH_HEART
            if (r1 == r0) goto L_0x00d6
            com.instagram.api.schemas.RIXUCoverElementMetadataType r0 = com.instagram.api.schemas.RIXUCoverElementMetadataType.FACEPILE_OR_LIKE_COUNT_WITH_HEART
            if (r1 == r0) goto L_0x00d6
            com.instagram.api.schemas.RIXUCoverElementMetadataType r0 = com.instagram.api.schemas.RIXUCoverElementMetadataType.LIKED_BY_FACEPILE
            if (r1 != r0) goto L_0x00db
        L_0x00d6:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r11.A08
            A01(r8, r0, r2)
        L_0x00db:
            if (r4 == 0) goto L_0x0136
            com.instagram.api.schemas.RIXUCoverElementMetadataType r0 = com.instagram.api.schemas.RIXUCoverElementMetadataType.LIKE_COUNT_WITH_HEART
            if (r1 == r0) goto L_0x00ed
            if (r2 == 0) goto L_0x00e9
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0136
        L_0x00e9:
            com.instagram.api.schemas.RIXUCoverElementMetadataType r0 = com.instagram.api.schemas.RIXUCoverElementMetadataType.FACEPILE_OR_LIKE_COUNT_WITH_HEART
            if (r1 != r0) goto L_0x0136
        L_0x00ed:
            com.instagram.common.ui.base.IgTextView r5 = r11.A09
            android.content.res.Resources r4 = r6.getResources()
            int r0 = r10.A0v()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.0qQ.A0A(r4)
            r3 = 0
            r0 = 10000(0x2710, float:1.4013E-41)
            r2 = 1
            java.lang.String r1 = X.C253673rC.A04(r4, r1, r0, r3, r3)
            int r0 = r10.A0v()
            java.lang.String r0 = X.AnonymousClass3f0.A00(r4, r0)
            r5.setText(r1)
            r5.setContentDescription(r0)
            r5.setVisibility(r3)
            goto L_0x0134
        L_0x0118:
            if (r2 == 0) goto L_0x0136
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00b5
            goto L_0x00c4
        L_0x0121:
            com.instagram.user.model.User r0 = r10.A2A(r9)
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = r0.getUsername()
            com.instagram.common.ui.base.IgTextView r1 = r11.A0A
            r1.setText(r0)
            r0 = 0
            r1.setVisibility(r0)
        L_0x0134:
            A00 = r2
        L_0x0136:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C297635s5.A00(android.content.Context, X.JwI, X.0iw, com.instagram.common.session.UserSession, X.1Xj, X.5s1):void");
    }

    public static final void A01(AnonymousClass0iw r16, IgSimpleImageView igSimpleImageView, List list) {
        IgSimpleImageView igSimpleImageView2 = igSimpleImageView;
        Context context = igSimpleImageView2.getContext();
        0qQ.A07(context);
        String moduleName = r16.getModuleName();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        igSimpleImageView2.setImageDrawable(C244283aw.A00(context, (Drawable) null, Float.valueOf(0.3f), AnonymousClass05K.A00, 3, (Integer) null, (Integer) null, (Integer) null, moduleName, list, dimensionPixelSize, true, false, true, true, false));
        igSimpleImageView2.setVisibility(0);
        A00 = true;
    }
}
