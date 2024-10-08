package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import java.util.Map;

public final class GIG extends C251343mx {
    public final UserSession A00;
    public final JTI A01;
    public final C52085GEf A02;
    public final boolean A03;
    public final long A04;

    private final Drawable A00(C70832Wc r19, ImageUrl imageUrl, List list) {
        GJO gjo;
        C70832Wc r7 = r19;
        Context context = r7.Aqq().A0C;
        Resources A0A = AnonymousClass7TF.A0A(context);
        int dimensionPixelSize = A0A.getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
        int dimensionPixelSize2 = A0A.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        int dimensionPixelSize3 = A0A.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        int color = context.getColor(R.color.canvas_bottom_sheet_description_text_color);
        int dimensionPixelSize4 = A0A.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        Map map = GJN.A02;
        UserSession userSession = this.A00;
        C67231sQ A0n = C51966G9m.A0n(this.A02.A02);
        0Tu A0J = DbS.A0J(userSession, 0);
        if (182.A06(A0J, userSession, 36319330081840259L)) {
            gjo = GJO.MUSIC_ICON_V2;
        } else if (182.A06(A0J, userSession, 36319330081971333L)) {
            gjo = GJO.MUSIC_ICON_V3;
        } else if (182.A06(A0J, userSession, 36319330081709185L)) {
            gjo = GJO.MUSIC_ICON;
        } else if (!C263304Kd.A06(A0n, userSession) || !182.A06(A0J, userSession, 36320382349418879L)) {
            gjo = null;
        } else {
            gjo = GJO.AUDIO_FILTER;
        }
        GIH gih = new GIH(context, gjo, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, color, dimensionPixelSize4, -1, false);
        List list2 = list;
        if (list != null) {
            gih.A05(list2);
            return gih;
        }
        ImageUrl imageUrl2 = imageUrl;
        if (imageUrl != null) {
            gih.A04(imageUrl2);
            return gih;
        }
        Drawable A0K = C51968G9o.A0K(r7, R.drawable.instagram_music_outline_44);
        C51973G9u.A0x(A0K, r7, R.color.canvas_bottom_sheet_description_text_color);
        return A0K;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x00b2, code lost:
        if (r1 != null) goto L_0x00b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r18) {
        /*
            r17 = this;
            r5 = r18
            boolean r15 = X.C51966G9m.A1Z(r5)
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r15)
            r4 = 4
            X.9JS r0 = X.C51965G9l.A0d(r9, r8, r4)
            r13 = 0
            X.2WX r2 = X.C51965G9l.A0X(r13, r0)
            r7 = r17
            long r0 = r7.A04
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            X.2WX r3 = X.AnonymousClass9JR.A00(r2, r6, r15, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.9JR r0 = X.C51965G9l.A0c(r2, r15, r0)
            X.2WX r0 = X.C51973G9u.A0T(r3, r0, r9, r8, r4)
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            X.2WX r0 = X.C51971G9r.A0Y(r0, r10, r8, r4)
            X.3Zh r1 = X.C243573Zh.CENTER
            r9 = 3
            X.2WX r0 = X.C51971G9r.A0Y(r0, r6, r1, r9)
            X.2WX r4 = r0.A00(r13)
            X.2Wb r3 = X.C51972G9s.A0Q(r5)
            r0 = 0
            X.2V5 r11 = X.C51968G9o.A0Z(r5, r0)
            X.2WX r1 = X.C51971G9r.A0Y(r13, r6, r1, r9)
            r0 = 1120403456(0x42c80000, float:100.0)
            X.2WX r0 = X.C51974G9v.A0O(r1, r6, r2, r0, r15)
            java.lang.Boolean r12 = X.AnonymousClass7TE.A0v()
            r8 = 4
            X.2WX r1 = X.C51971G9r.A0Y(r0, r2, r12, r8)
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            X.2WX r1 = X.C51971G9r.A0Y(r1, r0, r12, r8)
            r0 = 2131955230(0x7f130e1e, float:1.9546982E38)
            java.lang.String r0 = X.C244013aV.A0E(r3, r0)
            X.2WX r10 = X.C51971G9r.A0Y(r1, r10, r0, r15)
            X.3b9 r1 = X.C244413b9.ABSOLUTE
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            X.2WX r1 = X.C51971G9r.A0Y(r10, r0, r1, r9)
            r0 = 37
            X.J6J r0 = X.J6J.A00(r7, r0)
            java.lang.Integer r10 = X.AnonymousClass05K.A1F
            X.2WX r1 = X.C51971G9r.A0Y(r1, r10, r0, r8)
            X.9JS r0 = new X.9JS
            r0.<init>(r11, r10)
            X.2WX r1 = X.C51974G9v.A0A(r11, r1, r0)
            r0 = 38
            X.J6J r0 = X.J6J.A00(r11, r0)
            X.2WX r0 = X.C51971G9r.A0Z(r1, r6, r0, r13)
            X.2WX r14 = X.C51972G9s.A0U(r0, r2, r15)
            X.GEf r0 = r7.A02
            X.1Xj r6 = r0.A02
            X.1sQ r1 = X.C51966G9m.A0n(r6)
            X.1Xy r0 = r6.A0C
            X.1dn r11 = r0.getMusicMetadata()
            boolean r0 = r6.CcK()
            r2 = 0
            if (r0 == 0) goto L_0x00e8
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r6)
            if (r0 == 0) goto L_0x00f7
            com.instagram.common.typedurl.ImageUrl r6 = r0.Bh3()
        L_0x00b2:
            if (r1 == 0) goto L_0x011d
        L_0x00b4:
            com.instagram.api.schemas.OriginalSoundDataIntf r10 = r1.BZB()
            if (r10 == 0) goto L_0x011d
            com.instagram.api.schemas.OriginalAudioSubtype r1 = X.C291335gz.A00(r1)
            com.instagram.api.schemas.OriginalAudioSubtype r0 = com.instagram.api.schemas.OriginalAudioSubtype.A06
            if (r1 != r0) goto L_0x011d
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.List r0 = r10.Adj()
            if (r0 == 0) goto L_0x0100
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.OriginalAudioPartMetadataIntf r0 = (com.instagram.api.schemas.OriginalAudioPartMetadataIntf) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.C72()
            r10.add(r0)
            goto L_0x00d4
        L_0x00e8:
            if (r1 == 0) goto L_0x00f0
            com.instagram.common.typedurl.ImageUrl r6 = X.C291335gz.A02(r1)
            if (r6 != 0) goto L_0x00b4
        L_0x00f0:
            if (r11 == 0) goto L_0x00f7
            com.instagram.common.typedurl.ImageUrl r6 = X.C52366GPn.A00(r11)
            goto L_0x00b2
        L_0x00f7:
            r6 = r13
            goto L_0x00b2
        L_0x00f9:
            java.util.List r0 = X.00k.A0d(r10, r8)
            r2.addAll(r0)
        L_0x0100:
            int r1 = r2.size()
            r0 = 2
            if (r1 != r0) goto L_0x010f
            java.util.List r0 = X.00k.A0Y(r2)
            r2.addAll(r0)
            goto L_0x0159
        L_0x010f:
            int r0 = r2.size()
            if (r0 != r9) goto L_0x0159
            java.lang.Object r0 = r2.get(r15)
            r2.add(r0)
            goto L_0x0159
        L_0x011d:
            if (r11 == 0) goto L_0x0159
            com.instagram.api.schemas.OriginalSoundDataIntf r9 = r11.BZB()
            if (r9 == 0) goto L_0x0159
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r11.BZB()
            if (r0 == 0) goto L_0x0153
            com.instagram.api.schemas.OriginalAudioSubtype r1 = r0.BYy()
        L_0x012f:
            com.instagram.api.schemas.OriginalAudioSubtype r0 = com.instagram.api.schemas.OriginalAudioSubtype.A06
            if (r1 != r0) goto L_0x0159
            java.util.List r0 = r9.Adj()
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x013f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0155
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.OriginalAudioPartMetadataIntf r0 = (com.instagram.api.schemas.OriginalAudioPartMetadataIntf) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.C72()
            r2.add(r0)
            goto L_0x013f
        L_0x0153:
            r1 = 0
            goto L_0x012f
        L_0x0155:
            java.util.List r2 = X.00k.A0d(r2, r8)
        L_0x0159:
            com.instagram.common.session.UserSession r8 = r7.A00
            X.0Tu r9 = X.DbS.A0J(r8, r15)
            r0 = 36319330081905796(0x81083d00031c84, double:3.031828817776373E-306)
            boolean r0 = X.182.A06(r9, r8, r0)
            if (r0 == 0) goto L_0x01a0
            r0 = 17
            X.MMS r1 = new X.MMS
            r1.<init>(r8, r0)
            java.lang.Class<X.WT4> r0 = X.WT4.class
            java.lang.Object r8 = r8.A01(r0, r1)
            X.WT4 r8 = (X.WT4) r8
            java.lang.StringBuilder r9 = X.AnonymousClass7TE.A1A()
            if (r6 == 0) goto L_0x0186
            java.lang.String r0 = r6.getUrl()
            r9.append(r0)
        L_0x0186:
            if (r2 == 0) goto L_0x01a5
            java.util.Iterator r1 = r2.iterator()
        L_0x018c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01a5
            java.lang.Object r0 = r1.next()
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            java.lang.String r0 = r0.getUrl()
            r9.append(r0)
            goto L_0x018c
        L_0x01a0:
            android.graphics.drawable.Drawable r11 = r7.A00(r3, r6, r2)
            goto L_0x01ba
        L_0x01a5:
            java.lang.String r1 = X.DbT.A10(r9)
            android.util.LruCache r0 = r8.A00
            java.lang.Object r11 = r0.get(r1)
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11
            if (r11 != 0) goto L_0x01ba
            android.graphics.drawable.Drawable r11 = r7.A00(r3, r6, r2)
            r0.put(r1, r11)
        L_0x01ba:
            android.widget.ImageView$ScaleType r12 = android.widget.ImageView.ScaleType.FIT_CENTER
            X.3bS r10 = new X.3bS
            r16 = r15
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.2Tp r0 = X.C51967G9n.A0O(r10, r3, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GIG.A0X(X.3Y5):X.3mp");
    }

    public GIG(UserSession userSession, JTI jti, C52085GEf gEf, long j, boolean z) {
        AnonymousClass7TG.A1O(jti, gEf);
        this.A01 = jti;
        this.A02 = gEf;
        this.A03 = z;
        this.A00 = userSession;
        this.A04 = j;
    }
}
