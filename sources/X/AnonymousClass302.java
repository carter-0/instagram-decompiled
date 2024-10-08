package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.302  reason: invalid class name */
public final class AnonymousClass302 extends C235422zt {
    public final Context A00;
    public final 0wc A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        if (r1 == 0) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ad, code lost:
        if (r1 == 0) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r22, X.C252093oY r23) {
        /*
            r21 = this;
            r19 = 0
            r1 = r22
            r0 = r19
            X.0qQ.A0B(r1, r0)
            r13 = 1
            r0 = r23
            X.0qQ.A0B(r0, r13)
            java.lang.Object r8 = r1.A03
            X.0qQ.A06(r8)
            X.1Xj r8 = (X.1Xj) r8
            r9 = r21
            X.59J r7 = r9.A02(r8)
            java.lang.Integer r1 = r0.CEk(r1)
            X.0qQ.A07(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x002e
            long r0 = java.lang.System.currentTimeMillis()
            r7.A01 = r0
        L_0x002d:
            return
        L_0x002e:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x002d
            long r0 = java.lang.System.currentTimeMillis()
            r7.A00 = r0
            boolean r0 = r7.A0I
            if (r0 == 0) goto L_0x02dd
            boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x02dd
            X.B8i r3 = new X.B8i
            r3.<init>()
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = "ad_title"
            r3.A06(r0, r1)
            java.lang.String r0 = r7.A0B
            if (r0 == 0) goto L_0x0057
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r4 = "has_fully_rendered"
            r3.A03(r4, r0)
            java.lang.String r1 = r7.A0C
            java.lang.String r0 = "sponsored_label"
            r3.A06(r0, r1)
            java.lang.Integer r0 = r7.A06
            if (r0 == 0) goto L_0x0081
            int r0 = r0.intValue()
            java.lang.String r1 = "#"
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "title_text_color"
            r3.A06(r0, r1)
        L_0x0081:
            java.lang.Integer r0 = r7.A05
            if (r0 == 0) goto L_0x0098
            int r0 = r0.intValue()
            java.lang.String r1 = "#"
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "sponsored_text_color"
            r3.A06(r0, r1)
        L_0x0098:
            X.B8d r2 = new X.B8d
            r2.<init>()
            java.lang.String r1 = r7.A09
            java.lang.String r0 = "call_to_action_title"
            r2.A06(r0, r1)
            java.lang.String r0 = r7.A09
            if (r0 == 0) goto L_0x00af
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x00b0
        L_0x00af:
            r0 = 1
        L_0x00b0:
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A03(r4, r0)
            X.B8g r12 = new X.B8g
            r12.<init>()
            java.lang.String r1 = r7.A0A
            java.lang.String r0 = "pill_name"
            r12.A06(r0, r1)
            java.lang.Long r1 = r7.A08
            java.lang.String r0 = "pill_type"
            r12.A05(r0, r1)
            X.B8e r11 = new X.B8e
            r11.<init>()
            int r0 = r7.A02
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r18 = "displayed_height"
            r0 = r18
            r11.A04(r0, r1)
            int r0 = r7.A03
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.String r10 = "displayed_width"
            r11.A04(r10, r0)
            X.3Nk r0 = r7.A03
            if (r0 == 0) goto L_0x034a
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "media_url"
            r11.A06(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
        L_0x00fa:
            r11.A03(r4, r0)
            java.lang.Long r0 = r7.A07
            if (r0 == 0) goto L_0x0347
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r13)
            java.lang.String r0 = "%016X"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r1)
        L_0x0112:
            java.lang.String r0 = "perceptual_hash"
            r11.A06(r0, r1)
            java.lang.String r1 = r7.A09
            java.lang.String r0 = "scaled_bitmap"
            r11.A06(r0, r1)
            java.util.List r1 = r7.A0E
            java.lang.String r0 = "thumbnails_info"
            r11.A07(r0, r1)
            X.1Xj r6 = r7.A0K
            r0 = r19
            X.0qQ.A0B(r6, r0)
            X.1Xy r0 = r6.A0C
            X.3xj r0 = r0.AsQ()
            if (r0 == 0) goto L_0x0141
            boolean r0 = r6.A5H()
            if (r0 != 0) goto L_0x0141
            java.lang.String r1 = r7.A07
            java.lang.String r0 = "media_url"
            r11.A06(r0, r1)
        L_0x0141:
            X.B8j r5 = new X.B8j
            r5.<init>()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r5.A03(r4, r13)
            android.content.Context r0 = r9.A00
            r20 = r0
            r1 = 2131954762(0x7f130c4a, float:1.9546032E38)
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r0 = "more_line"
            r5.A06(r0, r1)
            java.lang.String r1 = r7.A06
            java.lang.String r0 = "caption"
            r5.A06(r0, r1)
            java.lang.String r1 = r7.A08
            java.lang.String r0 = "political_ad_authorization_disclaimer"
            r5.A06(r0, r1)
            java.util.List r1 = r7.A0D
            java.lang.String r0 = "text_color"
            r5.A07(r0, r1)
            X.1Xy r0 = r6.A0C
            X.3xj r0 = r0.AsQ()
            if (r0 == 0) goto L_0x0198
            boolean r0 = r6.A5H()
            if (r0 != 0) goto L_0x0198
            int r0 = r7.A05
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "text_width"
            r5.A05(r0, r1)
            int r0 = r7.A04
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "text_height"
            r5.A05(r0, r1)
        L_0x0198:
            X.0wc r4 = r9.A01
            java.lang.String r1 = "instagram_ad_rendering_event"
            X.0kJ r0 = r4.A00
            X.0Aj r4 = r4.A00(r0, r1)
            com.instagram.common.session.UserSession r0 = r9.A02
            java.lang.String r14 = X.C231122qu.A07(r0, r6)
            java.lang.String r1 = r6.A2v()
            com.instagram.user.model.User r16 = r6.A2A(r0)
            if (r16 == 0) goto L_0x0350
            X.1iA r17 = r6.BR7()
            com.instagram.user.model.FollowStatus r0 = r16.B6o()
            java.lang.String r15 = r0.name()
            java.lang.String r0 = "follow_status"
            r4.AAJ(r0, r15)
            java.lang.String r0 = r6.getId()
            java.lang.String r15 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "m_pk"
            r4.AAJ(r0, r15)
            X.4DU r0 = r9.A03
            java.lang.String r15 = r0.getModuleName()
            java.lang.String r0 = "source_of_action"
            r4.AAJ(r0, r15)
            if (r1 != 0) goto L_0x01df
            java.lang.String r1 = ""
        L_0x01df:
            java.lang.String r0 = "tracking_token"
            r4.AAJ(r0, r1)
            r0 = r17
            int r0 = r0.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "m_t"
            r4.A9F(r0, r1)
            java.lang.String r0 = r16.getId()
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "a_pk"
            r4.A9F(r0, r1)
            r15 = 0
            if (r14 == 0) goto L_0x0343
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r14)
            if (r0 == 0) goto L_0x0343
            long r0 = r0.longValue()
        L_0x0213:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "ad_id"
            r4.A9F(r0, r1)
            java.lang.String r0 = "production_build"
            r4.A7p(r0, r13)
            java.lang.String r0 = "profile_header"
            r4.AAK(r3, r0)
            java.lang.String r1 = r17.name()
            java.lang.String r0 = "media_type"
            r4.AAJ(r0, r1)
            java.lang.String r0 = "cta"
            r4.AAK(r2, r0)
            long r2 = r7.A00
            long r0 = r7.A01
            long r2 = r2 - r0
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "time_spent"
            r4.A8D(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r19)
            java.lang.String r0 = "enable_update_component_info"
            r4.A7p(r0, r1)
            java.lang.String r0 = "text_info"
            r4.AAK(r5, r0)
            r1 = 0
            java.lang.String r0 = "text_info_political"
            r4.AAK(r1, r0)
            java.lang.String r0 = "pill_button"
            r4.AAK(r12, r0)
            java.util.Map r1 = r7.A0H
            java.lang.String r0 = "product_tags"
            r4.A9H(r0, r1)
            java.lang.String r0 = "media_info"
            r4.AAK(r11, r0)
            X.5te r1 = r7.A02
            java.lang.String r0 = "carousel_info"
            r4.AAK(r1, r0)
            java.lang.String r1 = X.C61930qI.A00()
            java.lang.String r0 = "locale"
            r4.AAJ(r0, r1)
            X.0lZ r0 = X.0la.A02
            X.0la r0 = r0.A00()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "release_channel"
            r4.AAJ(r0, r1)
            X.B8c r2 = new X.B8c
            r2.<init>()
            java.lang.String r1 = r7.A0C
            java.lang.String r0 = "sponsor_name"
            r2.A06(r0, r1)
            java.lang.Boolean r1 = r7.A04
            if (r1 == 0) goto L_0x029c
            java.lang.String r0 = "is_paid_partnership_label_visible"
            r2.A03(r0, r1)
        L_0x029c:
            java.lang.String r0 = "branded_content"
            r4.AAK(r2, r0)
            boolean r0 = r6.CeS()
            if (r0 != 0) goto L_0x02e7
            r11 = 0
        L_0x02a8:
            java.lang.String r0 = "video_info"
            r4.AAK(r11, r0)
            boolean r0 = X.AnonymousClass3HA.A00(r20)
            if (r0 == 0) goto L_0x02b5
            r15 = 1
        L_0x02b5:
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
            java.lang.String r0 = "is_dark_mode"
            r4.A9F(r0, r1)
            X.1Xy r0 = r6.A0C
            X.3xj r0 = r0.AsQ()
            if (r0 == 0) goto L_0x02da
            boolean r0 = r6.A5H()
            if (r0 != 0) goto L_0x02da
            java.lang.String r1 = r7.A0A
            java.lang.String r0 = "sn_client_name"
            r4.AAJ(r0, r1)
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = "sn_template_name"
            r4.AAJ(r0, r1)
        L_0x02da:
            r4.Cgf()
        L_0x02dd:
            java.util.Map r1 = r9.A00
            java.lang.String r0 = r8.getId()
            r1.remove(r0)
            return
        L_0x02e7:
            X.B8k r11 = new X.B8k
            r11.<init>()
            X.3WR r5 = r6.CEL()
            double r0 = r7.A01
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r11.A04(r10, r0)
            double r0 = r7.A00
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            r0 = r18
            r11.A04(r0, r1)
            boolean r0 = r7.A0E
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_subtitle"
            r11.A03(r0, r1)
            boolean r0 = r7.A0D
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_audio"
            r11.A03(r0, r1)
            long r2 = r6.A1B()
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "video_length"
            r11.A04(r0, r1)
            java.util.List r1 = r5.A06()
            java.lang.String r0 = "video_urls"
            r11.A07(r0, r1)
            java.util.List r1 = r5.A05()
            java.lang.String r0 = "video_ids"
            r11.A07(r0, r1)
            java.lang.String r1 = r5.A0I
            java.lang.String r0 = "subtitle_url"
            r11.A06(r0, r1)
            goto L_0x02a8
        L_0x0343:
            r0 = 0
            goto L_0x0213
        L_0x0347:
            r1 = 0
            goto L_0x0112
        L_0x034a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            goto L_0x00fa
        L_0x0350:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass302.ATF(X.30Y, X.3oY):void");
    }

    public AnonymousClass302(Context context, UserSession userSession, AnonymousClass4DU r4, Map map) {
        super(map);
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = r4;
        this.A01 = AnonymousClass0kN.A00(r4, 0kJ.A05, userSession);
    }
}
