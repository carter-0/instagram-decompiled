package X;

import com.google.common.collect.MapMakerInternalMap;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.6c3  reason: invalid class name and case insensitive filesystem */
public final class C311056c3 implements C250603lj {
    public static final C311066c4 A05 = new Object();
    public final 0wc A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final Map A03;
    public final Map A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.XQ6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.XQ6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.XQ6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.XQ6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.XQ6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.XQ6} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0389, code lost:
        if (r1 != 0) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0460, code lost:
        if (r10 != null) goto L_0x0412;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r21, X.C252093oY r22) {
        /*
            r20 = this;
            r0 = 0
            r3 = r21
            X.0qQ.A0B(r3, r0)
            r10 = 1
            r0 = r22
            X.0qQ.A0B(r0, r10)
            java.lang.Integer r1 = r0.CEk(r3)
            X.0qQ.A07(r1)
            java.lang.Object r8 = r3.A03
            X.3uh r8 = (X.C255773uh) r8
            r9 = r20
            java.util.Map r2 = r9.A04
            java.lang.Object r6 = r2.get(r8)
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L_0x0275
            X.1Xj r7 = r8.A0b
            if (r7 == 0) goto L_0x0275
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0279
            X.3mL r1 = r8.A0e
            X.3mL r0 = X.C250963mL.BRAND_SURVEY
            if (r1 == r0) goto L_0x0275
            X.0wc r3 = r9.A00
            java.lang.String r1 = "instagram_ad_rendering_event"
            X.0kJ r0 = r3.A00
            X.0Aj r6 = r3.A00(r0, r1)
            java.util.Map r0 = r9.A03
            java.lang.Object r5 = r0.get(r8)
            X.XQ6 r5 = (X.XQ6) r5
            if (r5 != 0) goto L_0x004d
            X.XQ6 r5 = new X.XQ6
            r5.<init>()
            r0.put(r8, r5)
        L_0x004d:
            java.lang.String r17 = "Required value was null."
            X.B8e r4 = new X.B8e
            r4.<init>()
            java.lang.String r1 = r5.A05
            java.lang.String r0 = "perceptual_hash"
            r4.A06(r0, r1)
            java.lang.String r1 = r5.A09
            java.lang.String r0 = "scaled_bitmap"
            r4.A06(r0, r1)
            int r0 = r5.A02
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.String r13 = "displayed_height"
            r4.A04(r13, r0)
            int r0 = r5.A03
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.String r14 = "displayed_width"
            r4.A04(r14, r0)
            java.lang.String r1 = r5.A07
            java.lang.String r0 = "media_url"
            r4.A06(r0, r1)
            java.util.List r1 = r5.A06
            java.lang.String r0 = "thumbnails_info"
            r4.A07(r0, r1)
            java.lang.Object r0 = r2.get(r8)
            android.view.View r0 = (android.view.View) r0
            com.instagram.common.session.UserSession r12 = r9.A01
            boolean r16 = X.C311066c4.A00(r0, r12, r8)
            if (r0 == 0) goto L_0x00b9
            android.content.Context r1 = r0.getContext()
            X.0qQ.A07(r1)
            int r0 = X.AnonymousClass4EQ.A02(r1)
            double r2 = (double) r0
            int r0 = X.0nA.A09(r1)
            double r0 = (double) r0
            java.lang.Double r3 = java.lang.Double.valueOf(r2)
            java.lang.String r2 = "viewport_height"
            r4.A04(r2, r3)
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "viewport_width"
            r4.A04(r0, r1)
        L_0x00b9:
            if (r16 == 0) goto L_0x00cf
            int r0 = r5.A02
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A04(r13, r0)
            int r0 = r5.A03
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A04(r14, r0)
        L_0x00cf:
            X.B8i r11 = new X.B8i
            r11.<init>()
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "ad_title"
            r11.A06(r0, r1)
            java.lang.String r1 = r5.A0C
            java.lang.String r0 = "sponsored_label"
            r11.A06(r0, r1)
            X.B8d r10 = new X.B8d
            r10.<init>()
            java.lang.String r1 = r5.A03
            java.lang.String r0 = "call_to_action_title"
            r10.A06(r0, r1)
            X.B8j r3 = new X.B8j
            r3.<init>()
            java.lang.String r1 = r5.A06
            java.lang.String r0 = "caption"
            r3.A06(r0, r1)
            java.lang.String r1 = r5.A04
            java.lang.String r0 = "more_line"
            r3.A06(r0, r1)
            java.lang.String r1 = r5.A08
            java.lang.String r0 = "political_ad_authorization_disclaimer"
            r3.A06(r0, r1)
            if (r16 == 0) goto L_0x0122
            int r0 = r5.A04
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "text_height"
            r3.A05(r0, r1)
            int r0 = r5.A05
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "text_width"
            r3.A05(r0, r1)
        L_0x0122:
            X.B8k r2 = new X.B8k
            r2.<init>()
            boolean r0 = r8.A1m()
            if (r0 == 0) goto L_0x0186
            X.3WR r15 = r7.CEL()
            double r0 = r5.A01
            r18 = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r18)
            r2.A04(r14, r0)
            double r0 = r5.A00
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A04(r13, r0)
            boolean r0 = r5.A0E
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_subtitle"
            r2.A03(r0, r1)
            boolean r0 = r5.A0D
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_audio"
            r2.A03(r0, r1)
            java.lang.String r1 = r15.A0I
            java.lang.String r0 = "subtitle_url"
            r2.A06(r0, r1)
            java.util.List r1 = r15.A06()
            java.lang.String r0 = "video_urls"
            r2.A07(r0, r1)
            java.util.List r1 = r15.A05()
            java.lang.String r0 = "video_ids"
            r2.A07(r0, r1)
            long r0 = r7.A1B()
            double r13 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r13)
            r0 = 5371(0x14fb, float:7.526E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A04(r0, r1)
        L_0x0186:
            X.5te r13 = new X.5te
            r13.<init>()
            int r0 = r5.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "number_of_cards"
            r13.A05(r0, r1)
            int r0 = r5.A01
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "index_of_card"
            r13.A05(r0, r1)
            java.lang.String r14 = r8.ByO(r12)
            if (r14 != 0) goto L_0x01ad
            java.lang.String r14 = r7.A2v()
        L_0x01ad:
            com.instagram.user.model.User r15 = r7.A2A(r12)
            if (r15 == 0) goto L_0x0519
            com.instagram.user.model.FollowStatus r0 = r15.B6o()
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "follow_status"
            r6.AAJ(r0, r1)
            java.lang.String r1 = r7.getId()
            if (r1 == 0) goto L_0x0511
            java.lang.String r0 = "m_pk"
            r6.AAJ(r0, r1)
            X.4DU r0 = r9.A02
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "source_of_action"
            r6.AAJ(r0, r1)
            if (r14 != 0) goto L_0x01da
            java.lang.String r14 = ""
        L_0x01da:
            java.lang.String r0 = "tracking_token"
            r6.AAJ(r0, r14)
            X.1iA r0 = r7.BR7()
            int r0 = r0.A00
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "m_t"
            r6.A9F(r0, r1)
            java.lang.String r0 = r15.getId()
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "a_pk"
            r6.A9F(r0, r1)
            java.lang.String r1 = r8.A0U(r12)
            if (r1 == 0) goto L_0x0276
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r1)
            if (r0 == 0) goto L_0x0276
            long r0 = r0.longValue()
        L_0x0212:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "ad_id"
            r6.A9F(r0, r1)
            X.1iA r0 = r7.BR7()
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "media_type"
            r6.AAJ(r0, r1)
            java.lang.String r0 = "media_info"
            r6.AAK(r4, r0)
            java.lang.String r0 = "video_info"
            r6.AAK(r2, r0)
            java.lang.String r0 = "profile_header"
            r6.AAK(r11, r0)
            java.lang.String r0 = "text_info"
            r6.AAK(r3, r0)
            java.lang.String r0 = "cta"
            r6.AAK(r10, r0)
            java.lang.String r0 = "carousel_info"
            r6.AAK(r13, r0)
            X.0lZ r0 = X.0la.A02
            X.0la r0 = r0.A00()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "release_channel"
            r6.AAJ(r0, r1)
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "locale"
            r6.AAJ(r0, r1)
            if (r16 == 0) goto L_0x0272
            java.lang.String r1 = r5.A0B
            java.lang.String r0 = "sn_template_name"
            r6.AAJ(r0, r1)
            java.lang.String r1 = r5.A0A
            java.lang.String r0 = "sn_client_name"
            r6.AAJ(r0, r1)
        L_0x0272:
            r6.Cgf()
        L_0x0275:
            return
        L_0x0276:
            r0 = 0
            goto L_0x0212
        L_0x0279:
            java.lang.Object r0 = r3.A04
            X.6YY r0 = (X.AnonymousClass6YY) r0
            X.3mM r5 = r0.A00
            java.util.Map r0 = r9.A03
            java.lang.Object r4 = r0.get(r8)
            X.XQ6 r4 = (X.XQ6) r4
            if (r4 != 0) goto L_0x0291
            X.XQ6 r4 = new X.XQ6
            r4.<init>()
            r0.put(r8, r4)
        L_0x0291:
            r0 = 2131439724(0x7f0b306c, float:1.8501411E38)
            android.view.View r1 = r6.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x02d9
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x02b8
            java.lang.CharSequence r0 = r1.getText()
            if (r0 == 0) goto L_0x02b8
            int r0 = r0.length()
            if (r0 == 0) goto L_0x02b8
            java.lang.CharSequence r0 = r1.getText()
            java.lang.String r0 = r0.toString()
            r4.A02 = r0
        L_0x02b8:
            r0 = 2131439696(0x7f0b3050, float:1.8501354E38)
            android.view.View r3 = r6.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2 = 0
            if (r3 == 0) goto L_0x02d7
            java.lang.CharSequence r0 = r3.getText()
            if (r0 == 0) goto L_0x02d7
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L_0x02d7
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x02d7
            r2 = r1
        L_0x02d7:
            r4.A0C = r2
        L_0x02d9:
            r0 = 2131431095(0x7f0b0eb7, float:1.848391E38)
            android.view.View r1 = r6.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0300
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0300
            java.lang.CharSequence r0 = r1.getText()
            if (r0 == 0) goto L_0x0300
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0300
            java.lang.CharSequence r0 = r1.getText()
            java.lang.String r0 = r0.toString()
            r4.A03 = r0
        L_0x0300:
            boolean r1 = r8.A1A()
            r0 = 2131429607(0x7f0b08e7, float:1.8480892E38)
            if (r1 == 0) goto L_0x030c
            r0 = 2131430394(0x7f0b0bfa, float:1.8482488E38)
        L_0x030c:
            android.view.View r1 = r6.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0343
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0330
            java.lang.CharSequence r0 = r1.getText()
            if (r0 == 0) goto L_0x0330
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0330
            java.lang.CharSequence r0 = r1.getText()
            java.lang.String r0 = r0.toString()
            r4.A06 = r0
        L_0x0330:
            boolean r0 = r8.A1A()
            if (r0 != 0) goto L_0x0343
            android.content.Context r1 = r1.getContext()
            r0 = 2131954763(0x7f130c4b, float:1.9546034E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A04 = r0
        L_0x0343:
            r0 = 2131439369(0x7f0b2f09, float:1.8500691E38)
            android.view.View r1 = r6.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x04f8
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x04f8
            java.lang.CharSequence r0 = r1.getText()
            java.lang.String r0 = r0.toString()
        L_0x035c:
            r4.A08 = r0
            boolean r0 = r8.A1m()
            if (r0 == 0) goto L_0x0463
            r0 = 2131439721(0x7f0b3069, float:1.8501405E38)
            android.view.View r2 = r6.findViewById(r0)
            if (r2 == 0) goto L_0x0394
            int r0 = r2.getHeight()
            double r0 = (double) r0
            r4.A00 = r0
            int r0 = r2.getWidth()
            double r0 = (double) r0
            r4.A01 = r0
            r0 = 2131443765(0x7f0b4035, float:1.8509607E38)
            android.view.View r0 = r6.findViewById(r0)
            if (r0 == 0) goto L_0x038b
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x038c
        L_0x038b:
            r0 = 0
        L_0x038c:
            r4.A0E = r0
            boolean r0 = r7.A4Y()
            r4.A0D = r0
        L_0x0394:
            com.instagram.common.session.UserSession r0 = r9.A01
            boolean r0 = X.C311066c4.A00(r6, r0, r8)
            if (r0 == 0) goto L_0x03d5
            java.lang.String r1 = "text"
            r0 = 2131441619(0x7f0b37d3, float:1.8505255E38)
            android.view.View r0 = r6.findViewById(r0)
            com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView r0 = (com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView) r0
            if (r0 == 0) goto L_0x03c1
            com.google.common.collect.ImmutableMap r0 = r0.getRenderingComponentInfos()
            if (r0 == 0) goto L_0x03c1
            java.lang.Object r0 = r0.get(r1)
            X.S1s r0 = (X.S1s) r0
            if (r0 == 0) goto L_0x03c1
            X.S2k r1 = r0.A00
            int r0 = r1.A00
            r4.A04 = r0
            int r0 = r1.A01
            r4.A05 = r0
        L_0x03c1:
            X.1Xy r0 = r7.A0C
            com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf r1 = r0.BwB()
            if (r1 == 0) goto L_0x03d5
            java.lang.String r0 = r1.Anf()
            r4.A0A = r0
            java.lang.String r0 = r1.C4b()
            r4.A0B = r0
        L_0x03d5:
            r0 = 2131442764(0x7f0b3c4c, float:1.8507577E38)
            android.view.View r8 = r6.findViewById(r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 == 0) goto L_0x04fd
            boolean r0 = r8.isShown()
            if (r0 == 0) goto L_0x04fd
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5 = 0
            int r3 = r8.getChildCount()
        L_0x03f0:
            if (r5 >= r3) goto L_0x04fb
            X.B8f r2 = new X.B8f
            r2.<init>()
            android.view.View r9 = r8.getChildAt(r5)
            com.instagram.common.ui.widget.imageview.IgImageView r9 = (com.instagram.common.ui.widget.imageview.IgImageView) r9
            if (r9 == 0) goto L_0x0452
            com.instagram.common.typedurl.ImageUrl r10 = r9.A0C
            boolean r0 = r9.A0N
            if (r0 == 0) goto L_0x0455
            if (r10 == 0) goto L_0x0455
            r0 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "thumbnail_load_status"
            r2.A05(r0, r1)
        L_0x0412:
            java.lang.String r1 = r10.getUrl()
            java.lang.String r0 = "media_url"
            r2.A06(r0, r1)
        L_0x041b:
            int r0 = r9.A01
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_height"
            r2.A05(r0, r1)
            int r0 = r9.A02
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_width"
            r2.A05(r0, r1)
            int r0 = r9.getMeasuredHeight()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "displayed_height"
            r2.A05(r0, r1)
            int r0 = r9.getMeasuredWidth()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "displayed_width"
            r2.A05(r0, r1)
            r7.add(r2)
        L_0x0452:
            int r5 = r5 + 1
            goto L_0x03f0
        L_0x0455:
            r0 = 2
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "thumbnail_load_status"
            r2.A05(r0, r1)
            if (r10 == 0) goto L_0x041b
            goto L_0x0412
        L_0x0463:
            boolean r0 = X.C297785sK.A0d(r8)
            if (r0 == 0) goto L_0x049c
            com.instagram.common.session.UserSession r0 = r9.A01
            boolean r0 = X.C311066c4.A00(r6, r0, r8)
            if (r0 == 0) goto L_0x0394
            java.lang.String r1 = "image"
            r0 = 2131441619(0x7f0b37d3, float:1.8505255E38)
            android.view.View r0 = r6.findViewById(r0)
            com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView r0 = (com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView) r0
            if (r0 == 0) goto L_0x0394
            com.google.common.collect.ImmutableMap r0 = r0.getRenderingComponentInfos()
            if (r0 == 0) goto L_0x0394
            java.lang.Object r0 = r0.get(r1)
            X.S1s r0 = (X.S1s) r0
            if (r0 == 0) goto L_0x0394
            X.S2k r1 = r0.A00
            int r0 = r1.A00
            r4.A02 = r0
            int r0 = r1.A01
            r4.A03 = r0
            java.lang.String r3 = r1.A02
        L_0x0498:
            r4.A07 = r3
            goto L_0x0394
        L_0x049c:
            com.instagram.common.session.UserSession r0 = r9.A01
            boolean r1 = X.C297785sK.A0L(r0, r8, r5)
            r0 = 2131439659(0x7f0b302b, float:1.850128E38)
            if (r1 == 0) goto L_0x04aa
            r0 = 2131435890(0x7f0b2172, float:1.8493635E38)
        L_0x04aa:
            android.view.View r11 = r6.findViewById(r0)
            com.instagram.feed.widget.IgProgressImageView r11 = (com.instagram.feed.widget.IgProgressImageView) r11
            if (r11 == 0) goto L_0x0394
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r11.getIgImageView()
            r0 = 144(0x90, float:2.02E-43)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r0)
            com.instagram.common.typedurl.ImageUrl r2 = r5.A0C
            java.lang.Long r0 = r5.A08(r12)
            r3 = 0
            if (r0 == 0) goto L_0x04f6
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r10)
            java.lang.String r0 = "%016X"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.0qQ.A07(r0)
        L_0x04d7:
            r4.A05 = r0
            java.lang.String r0 = r12.toString()
            r4.A09 = r0
            int r0 = r11.getHeight()
            r4.A02 = r0
            int r0 = r11.getWidth()
            r4.A03 = r0
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x0498
            if (r2 == 0) goto L_0x0498
            java.lang.String r3 = r2.getUrl()
            goto L_0x0498
        L_0x04f6:
            r0 = r3
            goto L_0x04d7
        L_0x04f8:
            r0 = 0
            goto L_0x035c
        L_0x04fb:
            r4.A06 = r7
        L_0x04fd:
            r0 = 2131439689(0x7f0b3049, float:1.850134E38)
            android.view.View r1 = r6.findViewById(r0)
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r1 = (com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar) r1
            if (r1 == 0) goto L_0x0275
            int r0 = r1.A04
            r4.A00 = r0
            int r0 = r1.A03
            r4.A01 = r0
            return
        L_0x0511:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r17
            r1.<init>(r0)
            throw r1
        L_0x0519:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r17
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C311056c3.ATF(X.30Y, X.3oY):void");
    }

    public C311056c3(UserSession userSession, AnonymousClass4DU r4) {
        this.A01 = userSession;
        this.A02 = r4;
        this.A00 = AnonymousClass0kN.A00(r4, 0kJ.A05, userSession);
        17j r0 = new 17j();
        MapMakerInternalMap.Strength strength = MapMakerInternalMap.Strength.A01;
        r0.A04(strength);
        r0.A01();
        this.A04 = r0.A00();
        17j r02 = new 17j();
        r02.A04(strength);
        this.A03 = r02.A00();
    }
}
