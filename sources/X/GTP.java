package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.search.common.analytics.SearchContext;
import go.Seq;
import java.util.Arrays;
import java.util.Set;

public final class GTP extends C231632rz implements C231652s1 {
    public AnonymousClass310 A00;
    public GUD A01;
    public C252643pR A02;
    public AnonymousClass2xS A03;
    public C55908HpV A04;
    public GU8 A05;
    public C54481HFj A06;
    public AnonymousClass3TC A07;
    public GUE A08;
    public AnonymousClass33L A09;
    public C62938Koq A0A;
    public AnonymousClass41M A0B;
    public AnonymousClass41P A0C;
    public C258383yv A0D;
    public C258383yv A0E;
    public C258383yv A0F;
    public C258383yv A0G;
    public C258383yv A0H;
    public C258383yv A0I;
    public C258383yv A0J;
    public C258383yv A0K;
    public C258383yv A0L;
    public C258383yv A0M;
    public C258383yv A0N;
    public AnonymousClass33R A0O;
    public AnonymousClass3z4 A0P;
    public GUA A0Q;
    public AnonymousClass417 A0R;
    public AnonymousClass33Q A0S;
    public C2607346v A0T;
    public AnonymousClass334 A0U;
    public C56589I2t A0V;
    public C2362933e A0W;
    public C56533I0e A0X;
    public AnonymousClass4EZ A0Y;
    public C2363633l A0Z;
    public GUB A0a;
    public boolean A0b;
    public final Context A0c;
    public final FragmentActivity A0d;
    public final C229382nI A0e;
    public final UserSession A0f;
    public final AnonymousClass2oD A0g;
    public final AnonymousClass4DU A0h;
    public final C243393Yp A0i;
    public final 0Pl A0j;
    public final String A0k;
    public final AnonymousClass0eM A0l;
    public final AnonymousClass0eM A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final AnonymousClass07Z A0s;
    public final 0xF A0t;
    public final C231672s5 A0u;
    public final AnonymousClass57L A0v;
    public final AnonymousClass2kR A0w;
    public final C231502rm A0x;
    public final SearchContext A0y;
    public final C249763kK A0z;
    public final Integer A10;
    public final Integer A11;
    public final boolean A12;
    public final boolean A13;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r9.A69() != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass3YB A01(X.GTP r8, X.1Xj r9, X.AnonymousClass3W1 r10) {
        /*
            r1 = 0
            java.lang.String r5 = ""
            boolean r0 = r8.A0b
            if (r0 != 0) goto L_0x0012
            boolean r0 = r10.A2a
            if (r0 != 0) goto L_0x0012
            boolean r0 = r9.A69()
            r6 = 0
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r6 = 1
        L_0x0013:
            java.lang.Integer r4 = r8.A11
            r7 = 0
            X.0qQ.A0B(r4, r7)
            com.instagram.search.common.analytics.SearchContext r3 = r8.A0y
            X.3YB r0 = new X.3YB
            r2 = r1
            r8 = r7
            r9 = r7
            r10 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GTP.A01(X.GTP, X.1Xj, X.3W1):X.3YB");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cb, code lost:
        if (r2.A0G == false) goto L_0x00cd;
     */
    /* renamed from: A02 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void buildRowViewTypes(X.C232672uC r20, X.1Xj r21, X.AnonymousClass3W1 r22) {
        /*
            r19 = this;
            r0 = 0
            r7 = r20
            X.0qQ.A0B(r7, r0)
            r10 = 1
            r6 = r21
            X.0qQ.A0B(r6, r10)
            r0 = 2
            r5 = r22
            X.0qQ.A0B(r5, r0)
            r1 = r19
            X.0eM r0 = r1.A0m
            java.lang.Object r4 = r0.getValue()
            X.GTQ r4 = (X.GTQ) r4
            r0 = 43
            X.J6H r11 = new X.J6H
            r11.<init>(r1, r0)
            X.310 r9 = r4.A03
            X.3WV r0 = r9.BRO()
            r0.E49(r6, r5)
            X.33X r3 = r4.A04
            boolean r0 = r3.A08(r7, r6, r5)
            if (r0 != 0) goto L_0x0080
            boolean r0 = r5.A3F
            if (r0 == 0) goto L_0x003e
            X.2rv r1 = X.C231592rv.MEDIA_AYSF
            r0 = 0
            X.GTQ.A01(r7, r1, r4, r0, r0)
        L_0x003e:
            X.1Xy r0 = r6.A0C
            X.DUN r0 = r0.BQb()
            if (r0 == 0) goto L_0x004b
            X.2rv r0 = X.C231592rv.MEDIA_NOTICE
            X.GTQ.A01(r7, r0, r4, r6, r5)
        L_0x004b:
            java.lang.String r8 = r4.A0B
            boolean r1 = r3.A0A(r6, r5, r8)
            boolean r0 = r3.A09(r6)
            if (r1 == 0) goto L_0x00c2
            X.3YW r0 = X.GTQ.A00(r4, r6, r5)
            r3.A02(r7, r0, r6, r5)
        L_0x005e:
            com.instagram.common.session.UserSession r0 = r4.A02
            X.4dE r0 = X.C268334dD.A00(r0)
            java.lang.String r1 = r6.A2n()
            if (r1 == 0) goto L_0x037e
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            X.4dG r0 = (X.C268364dG) r0
            if (r0 == 0) goto L_0x0081
            X.UxV r1 = r0.A02
            X.UxV r0 = X.C16576UxV.FEATURED_PRODUCTS
            if (r1 == r0) goto L_0x0081
            X.2rv r1 = X.C231592rv.PRODUCT_HSCROLL
            r0 = 0
            X.GTQ.A01(r7, r1, r4, r0, r0)
        L_0x0080:
            return
        L_0x0081:
            X.2rv r2 = X.C231592rv.GAP
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.4Ec r0 = new X.4Ec
            r0.<init>(r6, r1)
            X.GTQ.A01(r7, r2, r4, r0, r5)
            r6.A3q()
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x009a
            X.2rv r1 = X.C231592rv.ACCESSIBLE_ACTIONS
            r0 = 0
            X.GTQ.A01(r7, r1, r4, r0, r0)
        L_0x009a:
            boolean r0 = r5.A3G
            if (r0 == 0) goto L_0x00a4
            X.2rv r1 = X.C231592rv.MEDIA_AYSF
            r0 = 0
            X.GTQ.A01(r7, r1, r4, r0, r0)
        L_0x00a4:
            boolean r1 = r5.A3C
            if (r1 != 0) goto L_0x00b0
            boolean r0 = r5.A39
            if (r0 != 0) goto L_0x00b0
            boolean r0 = r5.A3B
            if (r0 == 0) goto L_0x0080
        L_0x00b0:
            if (r1 == 0) goto L_0x00b8
            X.2rv r0 = X.C231592rv.TOMBSTONE_AD_BREAK
        L_0x00b4:
            X.GTQ.A01(r7, r0, r4, r6, r5)
            return
        L_0x00b8:
            boolean r0 = r5.A3B
            if (r0 == 0) goto L_0x00bf
            X.2rv r0 = X.C231592rv.TOMBSTONE_REDESIGN_AD_BREAK
            goto L_0x00b4
        L_0x00bf:
            X.2rv r0 = X.C231592rv.TOMBSTONE_PERSISTENT_AD_BREAK
            goto L_0x00b4
        L_0x00c2:
            if (r0 == 0) goto L_0x0258
            r3.A03(r7, r6, r5)
            X.2rm r2 = r4.A0A
            boolean r0 = r2.A0G
            if (r0 != 0) goto L_0x00d7
        L_0x00cd:
            boolean r0 = r5.A2v
            if (r0 == 0) goto L_0x00d7
            X.2rv r1 = X.C231592rv.MEDIA_AYSF
            r0 = 0
            X.GTQ.A01(r7, r1, r4, r0, r0)
        L_0x00d7:
            r3.A05(r7, r6, r5, r8)
            r3.A04(r7, r6, r5)
            boolean r0 = r6.A5H()
            if (r0 != 0) goto L_0x0105
            boolean r0 = r6.CcK()
            if (r0 != 0) goto L_0x00f7
            X.1Xy r0 = r6.A0C
            X.5HT r0 = r0.BYk()
            if (r0 == 0) goto L_0x00f7
            X.2rv r1 = X.C231592rv.PROFESSIONAL_ORGANIC_MEDIA_BAR_CTA
            r0 = 0
            X.GTQ.A01(r7, r1, r4, r0, r0)
        L_0x00f7:
            X.1Xy r0 = r6.A0C
            X.1eb r0 = r0.BFi()
            if (r0 == 0) goto L_0x0105
            X.2rv r1 = X.C231592rv.IGBIO_PRODUCT_MEDIA_BAR_CTA
            r0 = 0
            X.GTQ.A01(r7, r1, r4, r0, r0)
        L_0x0105:
            X.1Xy r0 = r6.A0C
            X.DTn r0 = r0.B4x()
            if (r0 == 0) goto L_0x0117
            boolean r0 = r5.A1k
            if (r0 != 0) goto L_0x0117
            X.2rv r1 = X.C231592rv.FEATURED_PRODUCTS_UPSELL_CTA
            r0 = 0
            X.GTQ.A01(r7, r1, r4, r0, r0)
        L_0x0117:
            X.1Xy r0 = r6.A0C
            X.DUO r0 = r0.BQi()
            if (r0 == 0) goto L_0x0125
            X.2rv r1 = X.C231592rv.FEED_ADD_YOURS_CTA
            r0 = 0
            X.GTQ.A01(r7, r1, r4, r0, r0)
        L_0x0125:
            java.lang.Object r0 = r11.invoke(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0137
            X.2rv r1 = X.C231592rv.UNIFIED_FEEDBACK_DISCLOSURE_NUX
            r0 = 0
            X.GTQ.A01(r7, r1, r4, r0, r0)
        L_0x0137:
            int r0 = r6.A0q()
            if (r0 <= 0) goto L_0x0152
            com.instagram.common.session.UserSession r11 = r4.A02
            X.0Tu r8 = X.0Tu.A05
            r0 = 2342163288483831967(0x2081091a000a209f, double:4.065822677624597E-152)
            boolean r0 = X.182.A06(r8, r11, r0)
            if (r0 == 0) goto L_0x0152
            X.2rv r1 = X.C231592rv.MEDIA_OPEN_CAROUSEL_REVIEW_CTA
            r0 = 0
            X.GTQ.A01(r7, r1, r4, r0, r0)
        L_0x0152:
            X.3YU r0 = X.AnonymousClass3YS.A01
            com.instagram.common.session.UserSession r14 = r4.A02
            boolean r0 = r0.A00(r14, r6, r5)
            if (r0 == 0) goto L_0x0162
            X.2rv r1 = X.C231592rv.MEDIA_OPEN_CAROUSEL_TURN_ON_CTA
            r0 = 0
            X.GTQ.A01(r7, r1, r4, r0, r0)
        L_0x0162:
            boolean r0 = r6.A4g()
            r8 = 0
            if (r0 == 0) goto L_0x022a
            X.1Xy r0 = r6.A0C
            X.1bS r0 = r0.B8b()
            if (r0 == 0) goto L_0x0227
            com.instagram.model.fundraiser.FundraiserCampaignTypeEnum r1 = r0.B8e()
        L_0x0175:
            com.instagram.model.fundraiser.FundraiserCampaignTypeEnum r0 = com.instagram.model.fundraiser.FundraiserCampaignTypeEnum.IG_CHARITY_BUSINESS_PROFILE
            if (r1 != r0) goto L_0x0220
            X.0Tu r11 = X.0Tu.A05
            r0 = 36318522627922141(0x810781000118dd, double:3.031318180625753E-306)
            boolean r0 = X.182.A06(r11, r14, r0)
            if (r0 == 0) goto L_0x0220
            X.2rv r0 = X.C231592rv.MEDIA_FUNDRAISER_DONATE_BUTTON
            X.GTQ.A01(r7, r0, r4, r8, r8)
        L_0x018b:
            X.1Xy r0 = r6.A0C
            X.DSX r0 = r0.Aqj()
            if (r0 == 0) goto L_0x0198
            X.2rv r0 = X.C231592rv.SCHEDULED_CONTENT_PUBLISH_TIME
            X.GTQ.A01(r7, r0, r4, r8, r8)
        L_0x0198:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.1sy r0 = r5.A0o
            boolean r0 = X.AnonymousClass3YR.A05(r14, r6, r0, r1, r10)
            if (r0 == 0) goto L_0x01a7
            X.2rv r0 = X.C231592rv.MEDIA_INSIGHTS
            X.GTQ.A01(r7, r0, r4, r8, r8)
        L_0x01a7:
            X.2rv r1 = X.C231592rv.APP_INSTALL_CTA
            boolean r0 = X.AnonymousClass3YQ.A00(r1, r6)
            if (r0 == 0) goto L_0x01b2
            X.GTQ.A01(r7, r1, r4, r8, r8)
        L_0x01b2:
            boolean r0 = X.AnonymousClass3YV.A08(r14, r6)
            if (r0 == 0) goto L_0x01e1
            X.2rv r0 = X.C231592rv.COLLABORATIVE_INVITE
            X.GTQ.A01(r7, r0, r4, r8, r8)
            X.0Tu r10 = X.0Tu.A05
            r0 = 36324363783581737(0x810cd100033029, double:3.0350121509853275E-306)
            boolean r0 = X.182.A06(r10, r14, r0)
            if (r0 == 0) goto L_0x01e1
            java.lang.String r1 = r6.getId()
            if (r1 == 0) goto L_0x0080
            X.4DU r0 = r4.A07
            java.util.HashMap r16 = X.AnonymousClass3YV.A00(r14, r0, r1)
            if (r16 == 0) goto L_0x0080
            android.content.Context r13 = r4.A00
            r17 = 3600(0xe10, double:1.7786E-320)
            java.lang.String r15 = "com.instagram.creator_connections.screens.collab_accept_bottom_sheet_screen.component.view"
            X.C55175HdR.A00(r13, r14, r15, r16, r17)
        L_0x01e1:
            X.1Xy r0 = r6.A0C
            X.47o r0 = r0.Amn()
            if (r0 == 0) goto L_0x01fb
            X.0Tu r10 = X.0Tu.A05
            r0 = 36318230570407949(0x81073d0005180d, double:3.031133482277757E-306)
            boolean r0 = X.182.A06(r10, r14, r0)
            if (r0 == 0) goto L_0x01fb
            X.2rv r0 = X.C231592rv.CHANNEL_CTA
            X.GTQ.A01(r7, r0, r4, r6, r5)
        L_0x01fb:
            X.2rq r1 = X.C231542rq.COALESCED_FOOTER
            X.4DU r11 = r4.A07
            java.lang.String r0 = r11.getModuleName()
            boolean r1 = r2.A03(r6, r1, r0)
            boolean r0 = r6.A5D()
            if (r0 == 0) goto L_0x021e
            int r0 = r5.A03
            X.1Xj r10 = r6.A1c(r0)
        L_0x0213:
            if (r1 == 0) goto L_0x0274
            X.3YW r0 = X.GTQ.A00(r4, r6, r5)
            r3.A01(r7, r0, r6, r5)
            goto L_0x005e
        L_0x021e:
            r10 = r6
            goto L_0x0213
        L_0x0220:
            X.2rv r0 = X.C231592rv.MEDIA_FUNDRAISER
            X.GTQ.A01(r7, r0, r4, r8, r8)
            goto L_0x018b
        L_0x0227:
            r1 = r8
            goto L_0x0175
        L_0x022a:
            int r0 = r5.A03
            X.1Xj r0 = r6.A1c(r0)
            if (r0 != 0) goto L_0x0233
            r0 = r6
        L_0x0233:
            boolean r0 = r0.A6M()
            if (r0 == 0) goto L_0x018b
            X.0Tu r11 = X.0Tu.A05
            r0 = 36326150489781819(0x810e710000363b, double:3.036142071180748E-306)
            boolean r0 = X.182.A06(r11, r14, r0)
            if (r0 == 0) goto L_0x0251
            X.2nI r0 = r4.A01
            if (r0 == 0) goto L_0x0251
            X.2rv r0 = r2.A03
            X.GTQ.A01(r7, r0, r4, r8, r8)
            goto L_0x018b
        L_0x0251:
            X.2rv r0 = X.C231592rv.MEDIA_OVERLAY_CTA
            X.GTQ.A01(r7, r0, r4, r8, r8)
            goto L_0x018b
        L_0x0258:
            X.2rq r1 = X.C231542rq.MEDIA_HEADER
            X.4DU r0 = r4.A07
            java.lang.String r0 = r0.getModuleName()
            X.2rm r2 = r4.A0A
            X.2rv r0 = r2.A00(r6, r1, r0)
            int r1 = r0.ordinal()
            X.2rv[] r0 = X.C231592rv.A02
            r1 = r0[r1]
            r0 = 0
            X.GTQ.A01(r7, r1, r4, r0, r0)
            goto L_0x00cd
        L_0x0274:
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x028d
            X.2rq r1 = X.C231542rq.MEDIA_UFI
            java.lang.String r0 = r11.getModuleName()
            X.2rv r0 = r2.A00(r6, r1, r0)
            int r1 = r0.ordinal()
            X.2rv[] r0 = X.C231592rv.A02
            r0 = r0[r1]
            X.GTQ.A01(r7, r0, r4, r8, r8)
        L_0x028d:
            X.2rv r0 = X.C231592rv.MEDIA_FEEDBACK
            X.GTQ.A01(r7, r0, r4, r8, r8)
            if (r10 == 0) goto L_0x02a3
            boolean r0 = r10.A4k()
            if (r0 == 0) goto L_0x02a3
            X.2rv r0 = X.C231592rv.MEDIA_HEADLINE
            int r0 = r0.ordinal()
            r7.A7V(r0, r6, r5)
        L_0x02a3:
            boolean r0 = r6.A4z()
            if (r0 == 0) goto L_0x02ba
            boolean r0 = r6.CcK()
            if (r0 == 0) goto L_0x02ba
            boolean r0 = X.C231122qu.A0P(r14, r6)
            if (r0 != 0) goto L_0x02ba
            X.2rv r0 = X.C231592rv.BRANDED_CONTENT_LABEL
            X.GTQ.A01(r7, r0, r4, r8, r8)
        L_0x02ba:
            X.3YW r11 = X.GTQ.A00(r4, r6, r5)
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x02df
            X.3gp r10 = r11.A00()
            X.1Xj r1 = r11.A01
            int r0 = r11.A04
            X.3dY r2 = new X.3dY
            r2.<init>(r10, r1, r5, r0)
            X.2rv r0 = X.C231592rv.MEDIA_COMMENT
            int r1 = r0.ordinal()
            r7.A7V(r1, r6, r2)
            X.3WV r0 = r9.BRO()
            r0.A85(r2, r1)
        L_0x02df:
            boolean r0 = r6.A4c()
            if (r0 == 0) goto L_0x02f0
            boolean r0 = X.2R8.A02(r14, r6)
            if (r0 == 0) goto L_0x02f0
            X.2rv r0 = X.C231592rv.MEDIA_VIEW_COMMENT_CONTROLS
            X.GTQ.A01(r7, r0, r4, r8, r8)
        L_0x02f0:
            boolean r10 = r11.A06
            if (r10 != 0) goto L_0x0324
            boolean r0 = r11.A08
            if (r0 == 0) goto L_0x0301
            boolean r0 = r4.A0I
            if (r0 != 0) goto L_0x0301
            X.2rv r0 = X.C231592rv.MEDIA_VIEW_ALL_COMMENTS
            X.GTQ.A01(r7, r0, r4, r8, r8)
        L_0x0301:
            X.1Xy r0 = r6.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x0343
            com.instagram.api.schemas.TestimonialDict r0 = r0.C4j()
            if (r0 == 0) goto L_0x0343
            X.2rv r0 = X.C231592rv.LITHO_TESTIMONIAL
            X.GTQ.A01(r7, r0, r4, r8, r8)
        L_0x0314:
            X.3DI r0 = X.AnonymousClass3DI.A00
            boolean r0 = r0.A04(r14)
            if (r0 == 0) goto L_0x0324
            X.2rv r0 = X.C231592rv.LITHO_SOCIAL_CONTEXT_BUBBLES
            X.GTQ.A01(r7, r0, r4, r8, r8)
            r3.A07(r11, r5)
        L_0x0324:
            X.2oD r0 = r4.A06
            if (r0 == 0) goto L_0x032d
            X.2rv r0 = X.C231592rv.MEDIA_INLINE_COMPOSER
            X.GTQ.A01(r7, r0, r4, r8, r8)
        L_0x032d:
            X.1Xy r0 = r6.A0C
            X.DSX r0 = r0.Aqj()
            if (r0 != 0) goto L_0x033a
            X.2rv r0 = X.C231592rv.MEDIA_LABEL_BELOW_COMMENTS
            X.GTQ.A01(r7, r0, r4, r8, r8)
        L_0x033a:
            if (r10 == 0) goto L_0x005e
            X.2rv r0 = X.C231592rv.COMMENTS_LOADING_SPINNER
            X.GTQ.A01(r7, r0, r4, r8, r8)
            goto L_0x005e
        L_0x0343:
            boolean r0 = r11.A07
            if (r0 == 0) goto L_0x0314
            boolean r0 = r4.A0I
            if (r0 != 0) goto L_0x0314
            java.util.List r0 = r11.A02
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x0355:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0314
            java.lang.Object r12 = r13.next()
            X.3gp r12 = (X.C247733gp) r12
            X.0qQ.A0A(r12)
            X.1Xj r1 = r11.A01
            int r0 = r11.A04
            X.3dY r2 = new X.3dY
            r2.<init>(r12, r1, r5, r0)
            X.2rv r0 = X.C231592rv.MEDIA_COMMENT
            int r1 = r0.ordinal()
            r7.A7V(r1, r6, r2)
            X.3WV r0 = r9.BRO()
            r0.A85(r2, r1)
            goto L_0x0355
        L_0x037e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GTP.buildRowViewTypes(X.2uC, X.1Xj, X.3W1):void");
    }

    public final void E3r(1Xj r2, AnonymousClass3W1 r3, Integer num, int i) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        0qQ.A0B(num, 3);
        C2362933e r0 = this.A0W;
        if (r0 == null) {
            0qQ.A0F("lithoFeedBinderGroup");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.E3r(r2, r3, num, i);
        }
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        if (C231592rv.A02[i] != C231592rv.MEDIA_COMMENT) {
            return Arrays.hashCode(new Object[]{((1Xl) obj).BPf().getId(), Integer.valueOf(i)});
        }
        C245833dY r5 = (C245833dY) obj2;
        if (r5 != null) {
            return r5.A01.hashCode();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        1Xj BPf = ((1Xl) obj).BPf();
        AnonymousClass33Z r7 = (AnonymousClass33Z) ((GTQ) this.A0m.getValue()).A0D.getValue();
        C231592rv[] r9 = C231592rv.A02;
        C231592rv r2 = r9[i];
        Set set = AnonymousClass2u0.A05;
        0qQ.A0B(r2, 0);
        if (set.contains(r2)) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        switch (r2.ordinal()) {
            case 0:
                return 2131952046;
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 16:
            case 27:
            case 33:
            case 34:
            case 44:
            case 47:
            case 48:
            case 49:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
            case 51:
            case 55:
            case 62:
            case 65:
            case 66:
            case 67:
            case 69:
            case 71:
            case 75:
            case 76:
                return AnonymousClass972.MUTABLE_FLAG_MASK;
            case 6:
                return C262614Ff.A00(this.A0f, BPf);
            case 8:
                if (BPf.A0C.Amn() != null) {
                    return ((GY9) r7.A0A.getValue()).A01(BPf);
                }
                return AnonymousClass972.MUTABLE_FLAG_MASK;
            case 9:
                0qQ.A0B(BPf, 0);
                return Arrays.hashCode(new Object[]{BPf.getId(), BPf.A0C.getCoauthorProducers()});
            case 10:
            case 15:
            case Seq.NULL_REFNUM:
            case 56:
            case 57:
            case 77:
            case 78:
                return Integer.MAX_VALUE;
            case 24:
                C262434Ec r12 = (C262434Ec) obj;
                Context context = this.A0c;
                0qQ.A0B(r12, 0);
                0qQ.A0B(context, 1);
                return ((C248083hO) r7.A0N.getValue()).A00(context, r12.A00, r12.A01);
            case 35:
                C245833dY r13 = (C245833dY) obj2;
                if (r13 != null) {
                    return C268384dI.A00(r13);
                }
                throw new IllegalStateException("Required value was null.");
            case 36:
                AnonymousClass3W1 r132 = (AnonymousClass3W1) obj2;
                if (r132 != null) {
                    return C243163Xq.A00(this.A0f, BPf, this.A0h, r132);
                }
                throw new IllegalStateException("Required value was null.");
            case 39:
                return ((C243283Yd) r7.A0S.getValue()).A00(BPf);
            case 40:
                return C54982HaF.A00(BPf);
            case 43:
                C242923Ws A012 = r7.A01();
                boolean z = this.A0b;
                0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.ui.state.MediaState");
                return A012.A03(this.A0f, BPf, (AnonymousClass3W1) obj2, z);
            case 45:
                if (this.A0g != null) {
                    r7.A0L.getValue();
                    0qQ.A0B(BPf, 0);
                    return Arrays.hashCode(new Object[]{Boolean.valueOf(BPf.A4c())});
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Could not get ViewModel hash for item type ");
                sb.append(r9[i]);
                throw new IllegalStateException(sb.toString());
            case 53:
                r7.A0P.getValue();
                0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.ui.state.MediaState");
                AnonymousClass3W1 r133 = (AnonymousClass3W1) obj2;
                0qQ.A0B(r133, 0);
                return Arrays.hashCode(new Object[]{r133.A3b.A00});
            case 58:
                0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.feed.ui.state.MediaState");
                1Xj A1c = BPf.A1c(((AnonymousClass3W1) obj2).A03);
                if (A1c == null) {
                    A1c = BPf;
                }
                return C56655I6k.A00(A1c);
            case 60:
                return r7.A00().A01(BPf);
            case 61:
                return ((C252903pt) r7.A0j.getValue()).A00(this.A0f, BPf);
            case 63:
                r7.A0c.getValue();
                return C56531I0c.A00(BPf);
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not get ViewModel hash for item type ");
                sb2.append(r9[i]);
                throw new IllegalStateException(sb2.toString());
        }
    }

    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        0qQ.A0B(view, 0);
        if (C231592rv.A02[i] == C231592rv.AD_CTA) {
            Object tag = view.getTag();
            if (tag == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if ((tag instanceof C254073rt) && this.A0D != null) {
                Object tag2 = view.getTag();
                if (tag2 != null) {
                    C254073rt r1 = (C254073rt) tag2;
                    if (this.A0D == null) {
                        0qQ.A0F("adMediaCTABarViewBinder");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    1wn r2 = r1.A03;
                    if (r2 != null) {
                        AnonymousClass1Nd.A00(r1.A0N).A02(r2, C57070INk.class);
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    public static C282785Es A00(AnonymousClass33Z r0) {
        return (C282785Es) r0.A0R.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x025a, code lost:
        if (r11.A0n != false) goto L_0x025c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass310 r50) {
        /*
            r49 = this;
            r11 = r49
            r25 = r50
            r0 = r25
            r11.A00 = r0
            android.content.Context r13 = r11.A0c
            com.instagram.common.session.UserSession r15 = r11.A0f
            X.4DU r14 = r11.A0h
            boolean r12 = r11.A12
            androidx.fragment.app.FragmentActivity r10 = r11.A0d
            X.0Pl r9 = r11.A0j
            X.2xS r8 = r11.A03
            java.lang.String r16 = "feedVideoModule"
            if (r8 == 0) goto L_0x007b
            X.3kK r0 = r11.A0z
            r30 = r0
            X.2s5 r7 = r11.A0u
            boolean r6 = r11.A0b
            boolean r5 = r11.A0r
            boolean r4 = r11.A13
            java.lang.String r3 = r11.A0k
            X.07Z r2 = r11.A0s
            X.2rm r1 = r11.A0x
            X.2nI r0 = r11.A0e
            r22 = r0
            r21 = 0
            java.lang.String r32 = "MediaBinderGroup"
            X.334 r0 = new X.334
            r29 = r8
            r31 = r3
            r33 = r12
            r34 = r6
            r35 = r5
            r36 = r4
            r23 = r15
            r24 = r7
            r26 = r14
            r27 = r9
            r28 = r1
            r17 = r0
            r18 = r13
            r19 = r10
            r20 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r11.A0U = r0
            X.0eM r0 = r0.A10
            java.lang.Object r0 = r0.getValue()
            X.33l r0 = (X.C2363633l) r0
            r11.A0Z = r0
            X.2oD r0 = r11.A0g
            java.lang.String r2 = "binders"
            if (r0 == 0) goto L_0x008a
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0W
            java.lang.Object r1 = r0.getValue()
            X.33Q r1 = (X.AnonymousClass33Q) r1
            r11.A0S = r1
            if (r1 != 0) goto L_0x0083
            java.lang.String r16 = "feedInlineComposerButtonViewBinder"
        L_0x007b:
            X.0qQ.A0F(r16)
        L_0x007e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0083:
            X.33R r0 = new X.33R
            r0.<init>(r13, r1)
            r11.A0O = r0
        L_0x008a:
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0g
            java.lang.Object r0 = r0.getValue()
            X.3pR r0 = (X.C252643pR) r0
            r11.A02 = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0n
            java.lang.Object r0 = r0.getValue()
            X.4EZ r0 = (X.AnonymousClass4EZ) r0
            r11.A0Y = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0m
            java.lang.Object r0 = r0.getValue()
            X.3z4 r0 = (X.AnonymousClass3z4) r0
            r11.A0P = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0d
            java.lang.Object r0 = r0.getValue()
            X.41M r0 = (X.AnonymousClass41M) r0
            r11.A0B = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0c
            java.lang.Object r0 = r0.getValue()
            X.41P r0 = (X.AnonymousClass41P) r0
            r11.A0C = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0I
            java.lang.Object r0 = r0.getValue()
            X.3TC r0 = (X.AnonymousClass3TC) r0
            r11.A07 = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0H
            java.lang.Object r0 = r0.getValue()
            X.HFj r0 = (X.C54481HFj) r0
            r11.A06 = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0A
            java.lang.Object r0 = r0.getValue()
            X.3yv r0 = (X.C258383yv) r0
            r11.A0D = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0v
            java.lang.Object r0 = r0.getValue()
            X.3yv r0 = (X.C258383yv) r0
            r11.A0L = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0X
            java.lang.Object r0 = r0.getValue()
            X.3yv r0 = (X.C258383yv) r0
            r11.A0G = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0R
            java.lang.Object r0 = r0.getValue()
            X.Koq r0 = (X.C62938Koq) r0
            r11.A0A = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0N
            java.lang.Object r0 = r0.getValue()
            X.3yv r0 = (X.C258383yv) r0
            r11.A0F = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A12
            java.lang.Object r0 = r0.getValue()
            X.3yv r0 = (X.C258383yv) r0
            r11.A0M = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A13
            java.lang.Object r0 = r0.getValue()
            X.3yv r0 = (X.C258383yv) r0
            r11.A0N = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0t
            java.lang.Object r0 = r0.getValue()
            X.GUD r0 = (X.GUD) r0
            r11.A01 = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            X.3yv r0 = (X.C258383yv) r0
            r11.A0E = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0s
            java.lang.Object r0 = r0.getValue()
            X.3yv r0 = (X.C258383yv) r0
            r11.A0K = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0b
            java.lang.Object r0 = r0.getValue()
            X.3yv r0 = (X.C258383yv) r0
            r11.A0H = r0
            X.334 r1 = r11.A0U
            if (r1 == 0) goto L_0x0292
            X.33L r0 = r1.A03
            r11.A09 = r0
            X.0eM r0 = r1.A0O
            java.lang.Object r0 = r0.getValue()
            X.GUE r0 = (X.GUE) r0
            r11.A08 = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0S
            java.lang.Object r0 = r0.getValue()
            X.417 r0 = (X.AnonymousClass417) r0
            r11.A0R = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0F
            java.lang.Object r0 = r0.getValue()
            X.GU8 r0 = (X.GU8) r0
            r11.A05 = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A14
            java.lang.Object r0 = r0.getValue()
            X.46v r0 = (X.C2607346v) r0
            r11.A0T = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0P
            java.lang.Object r0 = r0.getValue()
            X.GUA r0 = (X.GUA) r0
            r11.A0Q = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.HpV r0 = (X.C55908HpV) r0
            r11.A04 = r0
            X.3Yp r1 = r11.A0i
            if (r1 == 0) goto L_0x01e8
            X.32m r0 = r25.C86()
            r1.A02 = r0
        L_0x01e8:
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A11
            java.lang.Object r0 = r0.getValue()
            X.GUB r0 = (X.GUB) r0
            r11.A0a = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0M
            java.lang.Object r0 = r0.getValue()
            X.I2t r0 = (X.C56589I2t) r0
            r11.A0V = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0i
            java.lang.Object r0 = r0.getValue()
            X.I0e r0 = (X.C56533I0e) r0
            r11.A0X = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0o
            java.lang.Object r0 = r0.getValue()
            X.3yv r0 = (X.C258383yv) r0
            r11.A0I = r0
            X.334 r0 = r11.A0U
            if (r0 == 0) goto L_0x0292
            X.0eM r0 = r0.A0q
            java.lang.Object r0 = r0.getValue()
            X.3yv r0 = (X.C258383yv) r0
            r11.A0J = r0
            X.2kR r8 = r11.A0w
            X.0eM r1 = r11.A0m
            java.lang.Object r0 = r1.getValue()
            X.GTQ r0 = (X.GTQ) r0
            X.0eM r0 = r0.A0D
            java.lang.Object r7 = r0.getValue()
            X.33Z r7 = (X.AnonymousClass33Z) r7
            java.lang.Object r0 = r1.getValue()
            X.GTQ r0 = (X.GTQ) r0
            X.0eM r0 = r0.A0C
            java.lang.Object r6 = r0.getValue()
            X.33d r6 = (X.C2362833d) r6
            X.334 r5 = r11.A0U
            if (r5 == 0) goto L_0x0292
            boolean r0 = r11.A0q
            if (r0 != 0) goto L_0x025c
            boolean r0 = r11.A0n
            r48 = 0
            if (r0 == 0) goto L_0x025e
        L_0x025c:
            r48 = 1
        L_0x025e:
            r0 = 43
            X.JGK r47 = X.JGK.A01(r11, r0)
            X.2xS r4 = r11.A03
            if (r4 == 0) goto L_0x007b
            java.lang.Integer r3 = r11.A10
            X.57L r2 = r11.A0v
            X.0xF r1 = r11.A0t
            X.33e r0 = new X.33e
            r33 = r0
            r34 = r22
            r35 = r1
            r36 = r2
            r37 = r6
            r38 = r7
            r39 = r8
            r40 = r5
            r41 = r4
            r42 = r30
            r43 = r3
            r44 = r32
            r45 = r21
            r46 = r21
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r11.A0W = r0
            return
        L_0x0292:
            X.0qQ.A0F(r2)
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GTP.A03(X.310):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005b, code lost:
        if (r12.A00(r8, r19, (X.1Xj) r1, (X.AnonymousClass3W1) r2) == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0592, code lost:
        r4.A07(r10, (X.AnonymousClass3V3) r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        X.AnonymousClass0fD.A0A(r1, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0085, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x09e6, code lost:
        r10.A02(r7.A00((X.AnonymousClass3YT) r4, r6, r0.A0h, r5), r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0ae7, code lost:
        r7.A02(r10.A00((X.AnonymousClass3YT) r4, r9, r0.A0h, r5), r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0b1d, code lost:
        X.0qQ.A0F("feedVideoModule");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r39, android.view.View r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            r38 = this;
            r1 = r41
            r2 = r42
            r0 = 1039018222(0x3dee28ee, float:0.116289005)
            int r16 = X.AnonymousClass0fD.A03(r0)
            r6 = 1
            r8 = r40
            X.DbZ.A0t(r6, r8, r1, r2)
            r0 = r38
            X.0eM r9 = r0.A0m
            java.lang.Object r3 = r9.getValue()
            X.GTQ r3 = (X.GTQ) r3
            X.0eM r3 = r3.A0D
            java.lang.Object r5 = r3.getValue()
            X.33Z r5 = (X.AnonymousClass33Z) r5
            java.lang.Object r3 = r9.getValue()
            X.GTQ r3 = (X.GTQ) r3
            X.0eM r3 = r3.A0C
            java.lang.Object r10 = r3.getValue()
            X.33d r10 = (X.C2362833d) r10
            X.2rv[] r3 = X.C231592rv.A02
            r18 = r39
            r19 = r3[r39]
            boolean r4 = r1 instanceof X.1Xj
            r3 = 0
            if (r4 == 0) goto L_0x005d
            boolean r4 = r2 instanceof X.AnonymousClass3W1
            if (r4 == 0) goto L_0x005d
            X.33e r12 = r0.A0W
            if (r12 != 0) goto L_0x004e
            java.lang.String r11 = "lithoFeedBinderGroup"
        L_0x0046:
            X.0qQ.A0F(r11)
        L_0x0049:
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x004e:
            r11 = r1
            X.1Xj r11 = (X.1Xj) r11
            r7 = r2
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            r4 = r19
            boolean r7 = r12.A00(r8, r4, r11, r7)
            r4 = 1
            if (r7 != 0) goto L_0x005e
        L_0x005d:
            r4 = 0
        L_0x005e:
            java.lang.String r17 = "delegate"
            if (r4 != 0) goto L_0x0af2
            int r7 = r19.ordinal()
            java.lang.String r11 = "binders"
            java.lang.String r4 = "tombstoneViewBinder"
            java.lang.String r21 = "feedVideoModule"
            java.lang.String r20 = "Required value was null."
            switch(r7) {
                case 0: goto L_0x0145;
                case 1: goto L_0x0178;
                case 2: goto L_0x01a2;
                case 3: goto L_0x0071;
                case 4: goto L_0x01cc;
                case 5: goto L_0x0071;
                case 6: goto L_0x0200;
                case 7: goto L_0x025a;
                case 8: goto L_0x0086;
                case 9: goto L_0x02a8;
                case 10: goto L_0x02e4;
                case 11: goto L_0x030e;
                case 12: goto L_0x00b3;
                case 13: goto L_0x0071;
                case 14: goto L_0x0071;
                case 15: goto L_0x038d;
                case 16: goto L_0x03b1;
                case 17: goto L_0x0071;
                case 18: goto L_0x0071;
                case 19: goto L_0x0071;
                case 20: goto L_0x0071;
                case 21: goto L_0x0071;
                case 22: goto L_0x0071;
                case 23: goto L_0x0071;
                case 24: goto L_0x00cb;
                case 25: goto L_0x0071;
                case 26: goto L_0x0071;
                case 27: goto L_0x03e3;
                case 28: goto L_0x0071;
                case 29: goto L_0x0071;
                case 30: goto L_0x0071;
                case 31: goto L_0x0071;
                case 32: goto L_0x0071;
                case 33: goto L_0x040f;
                case 34: goto L_0x049f;
                case 35: goto L_0x04de;
                case 36: goto L_0x0525;
                case 37: goto L_0x0071;
                case 38: goto L_0x0071;
                case 39: goto L_0x05a2;
                case 40: goto L_0x05e6;
                case 41: goto L_0x0617;
                case 42: goto L_0x0071;
                case 43: goto L_0x0641;
                case 44: goto L_0x0691;
                case 45: goto L_0x06d1;
                case 46: goto L_0x0071;
                case 47: goto L_0x0719;
                case 48: goto L_0x0727;
                case 49: goto L_0x0735;
                case 50: goto L_0x077a;
                case 51: goto L_0x0788;
                case 52: goto L_0x0071;
                case 53: goto L_0x07c7;
                case 54: goto L_0x0071;
                case 55: goto L_0x07fd;
                case 56: goto L_0x0841;
                case 57: goto L_0x086d;
                case 58: goto L_0x0899;
                case 59: goto L_0x0071;
                case 60: goto L_0x08cb;
                case 61: goto L_0x0905;
                case 62: goto L_0x093e;
                case 63: goto L_0x0071;
                case 64: goto L_0x096b;
                case 65: goto L_0x098f;
                case 66: goto L_0x09c5;
                case 67: goto L_0x09fc;
                case 68: goto L_0x0071;
                case 69: goto L_0x0a2e;
                case 70: goto L_0x0071;
                case 71: goto L_0x00eb;
                case 72: goto L_0x0111;
                case 73: goto L_0x0111;
                case 74: goto L_0x0111;
                case 75: goto L_0x00eb;
                case 76: goto L_0x0a5a;
                case 77: goto L_0x0a8f;
                case 78: goto L_0x0ac0;
                default: goto L_0x0071;
            }
        L_0x0071:
            java.lang.String r1 = "Unhandled view type, view type = "
            r0 = r18
            java.lang.String r0 = X.002.A0O(r1, r0)
            java.lang.UnsupportedOperationException r2 = X.AnonymousClass7TE.A1B(r0)
            r1 = -1229547806(0xffffffffb6b696e2, float:-5.4415877E-6)
        L_0x0080:
            r0 = r16
            X.AnonymousClass0fD.A0A(r1, r0)
            throw r2
        L_0x0086:
            X.334 r3 = r0.A0U
            if (r3 == 0) goto L_0x0046
            X.0eM r3 = r3.A0G
            r3.getValue()
            java.lang.Object r6 = r8.getTag()
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.feed.adapter.row.channel.BroadcastChannelCTABarViewBinder.Holder"
            X.0qQ.A0C(r6, r3)
            X.IO5 r6 = (X.IO5) r6
            X.0eM r3 = r5.A0A
            java.lang.Object r4 = r3.getValue()
            X.GY9 r4 = (X.GY9) r4
            r3 = r1
            X.1Xj r3 = (X.1Xj) r3
            X.9JA r5 = r4.A02(r3)
            X.4DU r4 = r0.A0h
            r3 = r2
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            X.C56530I0b.A00(r5, r4, r6, r3)
            goto L_0x0af2
        L_0x00b3:
            java.lang.Object r4 = r8.getTag()
            r3 = 3660(0xe4c, float:5.129E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            X.0qQ.A0C(r4, r3)
            X.Gim r4 = (X.C53114Gim) r4
            com.instagram.ui.widget.spinner.SpinnerImageView r4 = r4.A00
            X.3uy r3 = X.C255943uy.LOADING
            r4.setLoadingStatus(r3)
            goto L_0x0af2
        L_0x00cb:
            X.0eM r4 = r5.A0N
            java.lang.Object r9 = r4.getValue()
            X.3hO r9 = (X.C248083hO) r9
            r7 = r1
            X.4Ec r7 = (X.C262434Ec) r7
            android.content.Context r5 = r0.A0c
            X.0qQ.A0B(r7, r3)
            X.0qQ.A0B(r5, r6)
            X.1Xj r4 = r7.A00
            java.lang.Integer r3 = r7.A01
            int r3 = r9.A00(r5, r4, r3)
            X.0nA.A0V(r8, r3)
            goto L_0x0af2
        L_0x00eb:
            X.33l r9 = r0.A0Z
            if (r9 != 0) goto L_0x00f4
            X.0qQ.A0F(r4)
            goto L_0x0049
        L_0x00f4:
            com.instagram.common.session.UserSession r7 = r0.A0f
            r6 = r1
            X.1Xj r6 = (X.1Xj) r6
            X.0eM r3 = r5.A0h
            java.lang.Object r4 = r3.getValue()
            X.I4I r4 = (X.I4I) r4
            r3 = r2
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            X.JwH r11 = r4.A02(r6, r3)
            r10 = r8
            r12 = r7
            r13 = r6
            r14 = r2
            r9.A00(r10, r11, r12, r13, r14)
            goto L_0x0af2
        L_0x0111:
            X.334 r3 = r0.A0U
            if (r3 == 0) goto L_0x0046
            X.0eM r3 = r3.A08
            java.lang.Object r7 = r3.getValue()
            X.Vw2 r7 = (X.C18650Vw2) r7
            java.lang.Object r6 = r8.getTag()
            r3 = 3659(0xe4b, float:5.127E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            X.0qQ.A0C(r6, r3)
            X.VcF r6 = (X.C17684VcF) r6
            X.0eM r3 = r5.A06
            java.lang.Object r5 = r3.getValue()
            X.Hph r5 = (X.C55920Hph) r5
            r4 = r1
            X.1Xj r4 = (X.1Xj) r4
            r3 = r2
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            X.JwM r4 = r5.A00(r4, r3)
            X.4DU r3 = r0.A0h
            r7.A04(r4, r3, r6)
            goto L_0x0af2
        L_0x0145:
            boolean r3 = r0.A12
            if (r3 == 0) goto L_0x0af2
            X.0eM r3 = r5.A05
            java.lang.Object r7 = r3.getValue()
            X.HqX r7 = (X.C55966HqX) r7
            X.1Xj r6 = X.1Xi.A02(r1)
            if (r6 == 0) goto L_0x016f
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            X.4DU r4 = r0.A0h
            X.3kK r3 = r0.A0z
            X.3ha r4 = r7.A00(r6, r4, r5, r3)
            X.HpV r3 = r0.A04
            if (r3 != 0) goto L_0x016a
            java.lang.String r11 = "accessiblePostActionsViewBinder"
            goto L_0x0046
        L_0x016a:
            r3.A00(r8, r4)
            goto L_0x0af2
        L_0x016f:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -408390604(0xffffffffe7a87434, float:-1.5910023E24)
            goto L_0x0080
        L_0x0178:
            X.3yv r7 = r0.A0D
            if (r7 != 0) goto L_0x0180
            java.lang.String r11 = "adMediaCTABarViewBinder"
            goto L_0x0046
        L_0x0180:
            java.lang.Object r6 = r8.getTag()
            if (r6 == 0) goto L_0x0199
            X.3rt r6 = (X.C254073rt) r6
            X.5Es r10 = A00(r5)
            r9 = r1
            X.1Xj r9 = (X.1Xj) r9
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            X.3yy r4 = new X.3yy
            r4.<init>()
            goto L_0x0ae7
        L_0x0199:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 1027201697(0x3d39daa1, float:0.045374516)
            goto L_0x0080
        L_0x01a2:
            X.3yv r10 = r0.A0E
            if (r10 != 0) goto L_0x01aa
            java.lang.String r11 = "appInstallMediaCTABarViewBinder"
            goto L_0x0046
        L_0x01aa:
            java.lang.Object r9 = r8.getTag()
            X.3rt r9 = (X.C254073rt) r9
            if (r9 == 0) goto L_0x01c3
            X.5Es r7 = A00(r5)
            r6 = r1
            X.1Xj r6 = (X.1Xj) r6
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            X.IS3 r4 = new X.IS3
            r4.<init>()
            goto L_0x09e6
        L_0x01c3:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -681646313(0xffffffffd75ee717, float:-2.45084105E14)
            goto L_0x0080
        L_0x01cc:
            X.GU8 r3 = r0.A05
            if (r3 != 0) goto L_0x01d4
            java.lang.String r11 = "brandedContentTagViewBinder"
            goto L_0x0046
        L_0x01d4:
            java.lang.Object r7 = r8.getTag()
            if (r7 == 0) goto L_0x01f7
            X.49I r7 = (X.AnonymousClass49I) r7
            X.0eM r3 = r5.A09
            java.lang.Object r6 = r3.getValue()
            X.3Yh r6 = (X.C243323Yh) r6
            android.content.Context r5 = r0.A0c
            r4 = r1
            X.1Xj r4 = (X.1Xj) r4
            r3 = r2
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            X.JwM r4 = r6.A00(r5, r4, r3)
            X.4DU r3 = r0.A0h
            X.GU8.A00(r4, r7, r3)
            goto L_0x0af2
        L_0x01f7:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 928771045(0x375bebe5, float:1.3108341E-5)
            goto L_0x0080
        L_0x0200:
            X.3TC r12 = r0.A07
            if (r12 != 0) goto L_0x0208
            java.lang.String r11 = "carouselMediaViewBinder"
            goto L_0x0046
        L_0x0208:
            java.lang.Object r11 = r8.getTag()
            if (r11 == 0) goto L_0x0251
            X.3TR r11 = (X.AnonymousClass3TR) r11
            X.0eM r4 = r5.A0B
            java.lang.Object r9 = r4.getValue()
            X.4Fq r9 = (X.C262714Fq) r9
            r7 = r1
            X.1Xj r7 = (X.1Xj) r7
            r6 = r2
            X.3W1 r6 = (X.AnonymousClass3W1) r6
            int r25 = r6.getPosition()
            android.content.Context r5 = r0.A0c
            X.4DU r4 = r0.A0h
            r22 = r7
            r23 = r4
            r24 = r6
            r26 = r3
            r20 = r9
            r21 = r5
            X.4Fw r23 = r20.A01(r21, r22, r23, r24, r25, r26)
            X.0eM r3 = r10.A02
            java.lang.Object r5 = r3.getValue()
            X.4Fy r5 = (X.C262774Fy) r5
            X.2nI r3 = r0.A0e
            r24 = r11
            r25 = r4
            r26 = r6
            r20 = r12
            r21 = r3
            r22 = r5
            r20.A02(r21, r22, r23, r24, r25, r26)
            goto L_0x0af2
        L_0x0251:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 1594885196(0x5f10044c, float:1.0377503E19)
            goto L_0x0080
        L_0x025a:
            androidx.fragment.app.FragmentActivity r11 = r0.A0d
            java.lang.Object r7 = r8.getTag()
            if (r7 == 0) goto L_0x029f
            X.3z5 r7 = (X.C258453z5) r7
            r9 = r1
            X.1Xj r9 = (X.1Xj) r9
            boolean r26 = r9.A5D()
            int r25 = r9.A0s()
            boolean r27 = r9.A5D()
            X.3ff r22 = X.C247033ff.DEFAULT
            X.3fh r23 = X.C247053fh.DEFAULT
            com.instagram.common.session.UserSession r6 = r0.A0f
            X.0Tu r10 = X.0Tu.A05
            r4 = 36324694495998201(0x810d1e000230f9, double:3.0352212948491714E-306)
            boolean r28 = X.182.A06(r10, r6, r4)
            r21 = 0
            X.3fn r20 = new X.3fn
            r24 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            android.content.Context r4 = r0.A0c
            r9 = r11
            r10 = r4
            r11 = r6
            r12 = r7
            r13 = r20
            r14 = r5
            r15 = r3
            X.C271274ia.A00(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0af2
        L_0x029f:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 178551847(0xaa47c27, float:1.5839326E-32)
            goto L_0x0080
        L_0x02a8:
            r6 = r1
            X.1Xj r6 = (X.1Xj) r6
            X.0eM r3 = r5.A0F
            java.lang.Object r5 = r3.getValue()
            X.I6D r5 = (X.I6D) r5
            android.content.Context r3 = r0.A0c
            X.Hij r4 = new X.Hij
            r4.<init>(r3)
            X.310 r3 = r0.A00
            if (r3 == 0) goto L_0x0b22
            X.JPP r3 = r3.AoY()
            X.JM7 r4 = r5.A04(r6, r3, r4)
            X.I2t r3 = r0.A0V
            if (r3 != 0) goto L_0x02ce
            java.lang.String r11 = "collaborativePostInviteLegacyBinder"
            goto L_0x0046
        L_0x02ce:
            java.lang.Object r3 = r8.getTag()
            if (r3 == 0) goto L_0x02db
            X.HnH r3 = (X.C55782HnH) r3
            X.C56589I2t.A01(r3, r4)
            goto L_0x0af2
        L_0x02db:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 779432116(0x2e7530b4, float:5.5749808E-11)
            goto L_0x0080
        L_0x02e4:
            X.3yv r7 = r0.A0F
            if (r7 != 0) goto L_0x02ec
            java.lang.String r11 = "collectionMediaCTABarViewBinder"
            goto L_0x0046
        L_0x02ec:
            java.lang.Object r6 = r8.getTag()
            if (r6 == 0) goto L_0x0305
            X.3rt r6 = (X.C254073rt) r6
            X.5Es r10 = A00(r5)
            r9 = r1
            X.1Xj r9 = (X.1Xj) r9
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            X.LrF r4 = new X.LrF
            r4.<init>()
            goto L_0x0ae7
        L_0x0305:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -2137685115(0xffffffff80958385, float:-1.3730669E-38)
            goto L_0x0080
        L_0x030e:
            r13 = r1
            X.1Xj r13 = (X.1Xj) r13
            X.1Xj r10 = r13.A1b()
            java.lang.Object r12 = r8.getTag()
            if (r12 == 0) goto L_0x0384
            X.3V2 r12 = (X.AnonymousClass3V2) r12
            X.GUE r11 = r0.A08
            if (r11 != 0) goto L_0x0325
            java.lang.String r11 = "collectionTopMainBottomThumbnailsViewBinder"
            goto L_0x0046
        L_0x0325:
            X.0eM r4 = r5.A0G
            java.lang.Object r7 = r4.getValue()
            X.Hqq r7 = (X.C55985Hqq) r7
            r9 = r2
            X.3W1 r9 = (X.AnonymousClass3W1) r9
            X.4DU r14 = r0.A0h
            X.310 r4 = r0.A00
            if (r4 == 0) goto L_0x0b22
            X.JQG r24 = r4.Aoj()
            int r30 = r9.getPosition()
            android.content.Context r6 = r0.A0c
            X.2xS r5 = r0.A03
            if (r5 == 0) goto L_0x0b1d
            androidx.fragment.app.FragmentActivity r4 = r0.A0d
            X.2dZ r15 = X.2dY.A00(r4)
            if (r15 == 0) goto L_0x0350
            int r3 = r15.AYI()
        L_0x0350:
            r27 = r14
            r28 = r9
            r29 = r5
            r31 = r3
            r22 = r7
            r23 = r6
            r25 = r12
            r26 = r13
            X.GmH r25 = r22.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.2s5 r3 = r0.A0u
            r22 = r11
            r23 = r4
            r24 = r3
            r26 = r12
            r22.A00(r23, r24, r25, r26, r27, r28)
            X.2xS r4 = r0.A03
            if (r4 == 0) goto L_0x0b1d
            java.lang.Object r3 = r8.getTag()
            if (r3 != 0) goto L_0x0592
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -391530841(0xffffffffe8a9b6a7, float:-6.411594E24)
            goto L_0x0080
        L_0x0384:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -1490416503(0xffffffffa72a0c89, float:-2.3599035E-15)
            goto L_0x0080
        L_0x038d:
            X.33L r6 = r0.A09
            if (r6 != 0) goto L_0x0395
            java.lang.String r11 = "featuredProductsUpsellCTAViewBinder"
            goto L_0x0046
        L_0x0395:
            java.lang.Object r5 = r8.getTag()
            if (r5 == 0) goto L_0x03a8
            X.GjS r5 = (X.C53156GjS) r5
            r4 = r1
            X.1Xj r4 = (X.1Xj) r4
            r3 = r2
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            r6.A00(r5, r4, r3)
            goto L_0x0af2
        L_0x03a8:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 316776404(0x12e19fd4, float:1.4238897E-27)
            goto L_0x0080
        L_0x03b1:
            X.Koq r7 = r0.A0A
            if (r7 != 0) goto L_0x03b9
            java.lang.String r11 = "feedAddYoursMediaCTABarViewBinder"
            goto L_0x0046
        L_0x03b9:
            java.lang.Object r6 = r8.getTag()
            if (r6 == 0) goto L_0x03da
            X.L9A r6 = (X.L9A) r6
            X.0eM r3 = r5.A0J
            java.lang.Object r5 = r3.getValue()
            X.Hqr r5 = (X.C55986Hqr) r5
            r4 = r1
            X.1Xj r4 = (X.1Xj) r4
            r3 = r2
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            X.Jvv r4 = r5.A00(r4, r3)
            X.4DU r3 = r0.A0h
            r7.A00(r4, r3, r6)
            goto L_0x0af2
        L_0x03da:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 790876044(0x2f23cf8c, float:1.4898499E-10)
            goto L_0x0080
        L_0x03e3:
            X.3yv r10 = r0.A0H
            if (r10 != 0) goto L_0x03eb
            java.lang.String r11 = "igbioProductMediaCTABarViewBinder"
            goto L_0x0046
        L_0x03eb:
            java.lang.Object r9 = r8.getTag()
            X.3rt r9 = (X.C254073rt) r9
            if (r9 == 0) goto L_0x0406
            X.5Es r7 = A00(r5)
            r6 = r1
            X.1Xj r6 = (X.1Xj) r6
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            com.instagram.common.session.UserSession r3 = r0.A0f
            X.AdJ r4 = new X.AdJ
            r4.<init>(r3)
            goto L_0x09e6
        L_0x0406:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 1841252443(0x6dbf485b, float:7.3998887E27)
            goto L_0x0080
        L_0x040f:
            com.instagram.common.session.UserSession r11 = r0.A0f
            X.IOg r6 = X.C55171HdN.A00(r11)
            r12 = r1
            X.1Xj r12 = (X.1Xj) r12
            com.instagram.user.model.User r4 = r12.A2A(r11)
            if (r4 == 0) goto L_0x0496
            java.lang.String r5 = r4.getId()
            java.util.Map r4 = r6.A00
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            X.ToV r10 = new X.ToV
            r10.<init>(r4)
            X.ToZ r21 = X.C14148Tqk.A00
            android.content.Context r15 = r0.A0c
            androidx.fragment.app.FragmentActivity r14 = r0.A0d
            X.4DU r13 = r0.A0h
            java.lang.Object r9 = r8.getTag()
            if (r9 == 0) goto L_0x048d
            X.Tqg r9 = (X.C14144Tqg) r9
            X.310 r4 = r0.A00
            if (r4 == 0) goto L_0x0b22
            X.3Ww r36 = r4.BwU()
            r7 = r2
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            java.lang.Integer r6 = r0.A10
            X.57L r5 = r0.A0v
            X.0xF r4 = r0.A0t
            X.HBL r28 = new X.HBL
            r29 = r14
            r30 = r13
            r31 = r4
            r32 = r11
            r33 = r5
            r34 = r12
            r35 = r7
            r37 = r6
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.IV5 r5 = new X.IV5
            r5.<init>(r2)
            r32 = 0
            android.os.Parcelable r6 = r7.A0d
            r26 = r4
            r27 = r11
            r29 = r10
            r30 = r9
            r31 = r5
            r33 = r32
            r34 = r32
            r35 = r3
            r36 = r3
            r22 = r15
            r23 = r6
            r24 = r14
            r25 = r13
            r21.A01(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x0af2
        L_0x048d:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 1291210905(0x4cf65099, float:1.29139912E8)
            goto L_0x0080
        L_0x0496:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 713608250(0x2a88cc3a, float:2.4300164E-13)
            goto L_0x0080
        L_0x049f:
            java.lang.Object r6 = r8.getTag()
            if (r6 == 0) goto L_0x04d5
            X.Gj0 r6 = (X.C53128Gj0) r6
            r5 = r1
            X.1Xj r5 = (X.1Xj) r5
            r4 = r2
            X.3W1 r4 = (X.AnonymousClass3W1) r4
            int r4 = r4.A03
            X.1Xj r4 = r5.A1c(r4)
            if (r4 != 0) goto L_0x04b6
            r4 = r5
        L_0x04b6:
            X.4g6 r5 = r4.A06
            if (r5 == 0) goto L_0x04cc
            X.2nI r4 = r0.A0e
            if (r4 == 0) goto L_0x04c3
            X.C56311HwO.A01(r4, r5, r6, r3, r3)
            goto L_0x0af2
        L_0x04c3:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -1865243319(0xffffffff90d2a549, float:-8.308506E-29)
            goto L_0x0080
        L_0x04cc:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 690274584(0x2924c118, float:3.6582797E-14)
            goto L_0x0080
        L_0x04d5:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -1931746319(0xffffffff8cdbe3f1, float:-3.387948E-31)
            goto L_0x0080
        L_0x04de:
            boolean r3 = r0.A0p
            if (r3 != 0) goto L_0x0af2
            r9 = r2
            X.3dY r9 = (X.C245833dY) r9
            X.1Xj r4 = X.1Xi.A02(r1)
            if (r4 == 0) goto L_0x051c
            X.3W1 r3 = r9.A03
            int r3 = X.AnonymousClass3YX.A00(r4, r3, r6)
            r9.A00 = r3
            r7 = r1
            X.1Xj r7 = (X.1Xj) r7
            X.417 r6 = r0.A0R
            if (r6 != 0) goto L_0x04fe
            java.lang.String r11 = "feedCommentRowViewBinder"
            goto L_0x0046
        L_0x04fe:
            java.lang.Object r5 = r8.getTag()
            if (r5 == 0) goto L_0x0513
            X.419 r5 = (X.AnonymousClass419) r5
            com.instagram.common.session.UserSession r3 = r0.A0f
            X.4DU r4 = r0.A0h
            X.9It r3 = X.C268384dI.A01(r3, r7, r4, r9)
            r6.A06(r3, r5, r4, r9)
            goto L_0x0af2
        L_0x0513:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 1850201759(0x6e47d69f, float:1.5461744E28)
            goto L_0x0080
        L_0x051c:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 437814870(0x1a188656, float:3.154138E-23)
            goto L_0x0080
        L_0x0525:
            r9 = 0
            r4 = -1
            androidx.fragment.app.FragmentActivity r7 = r0.A0d
            X.2dZ r7 = X.2dY.A00(r7)
            if (r7 == 0) goto L_0x0533
            int r4 = r7.AYI()
        L_0x0533:
            X.4JV r11 = new X.4JV
            r11.<init>(r9, r4, r3, r3)
            r10 = r1
            X.1Xj r10 = (X.1Xj) r10
            X.4EZ r12 = r0.A0Y
            if (r12 != 0) goto L_0x0543
            java.lang.String r11 = "mediaViewBinder"
            goto L_0x0046
        L_0x0543:
            java.lang.Object r7 = r8.getTag()
            if (r7 == 0) goto L_0x0599
            X.4EA r7 = (X.AnonymousClass4EA) r7
            X.0eM r3 = r5.A0a
            java.lang.Object r13 = r3.getValue()
            X.3dW r13 = (X.C245813dW) r13
            r9 = r2
            X.3W1 r9 = (X.AnonymousClass3W1) r9
            X.2xS r5 = r0.A03
            if (r5 == 0) goto L_0x0b1d
            android.content.Context r4 = r0.A0c
            X.4DU r3 = r0.A0h
            r22 = r13
            r23 = r4
            r24 = r10
            r25 = r3
            r26 = r9
            r27 = r5
            X.3et r25 = r22.A00(r23, r24, r25, r26, r27)
            int r27 = r9.getPosition()
            r28 = r6
            r22 = r12
            r23 = r3
            r24 = r11
            r26 = r7
            r22.A07(r23, r24, r25, r26, r27, r28)
            X.2xS r4 = r0.A03
            if (r4 == 0) goto L_0x0b1d
            java.lang.Object r3 = r8.getTag()
            if (r3 != 0) goto L_0x0592
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -249810890(0xfffffffff11c3036, float:-7.734071E29)
            goto L_0x0080
        L_0x0592:
            X.3V3 r3 = (X.AnonymousClass3V3) r3
            r4.A07(r10, r3, r9)
            goto L_0x0af2
        L_0x0599:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 12774235(0xc2eb5b, float:1.7900516E-38)
            goto L_0x0080
        L_0x05a2:
            boolean r3 = r0.A0p
            if (r3 != 0) goto L_0x0af2
            r11 = r1
            X.1Xj r11 = (X.1Xj) r11
            r9 = r2
            X.3W1 r9 = (X.AnonymousClass3W1) r9
            X.41M r7 = r0.A0B
            if (r7 != 0) goto L_0x05b4
            java.lang.String r11 = "mediaFeedbackViewBinder"
            goto L_0x0046
        L_0x05b4:
            android.content.Context r6 = r0.A0c
            X.0eM r3 = r5.A0S
            java.lang.Object r10 = r3.getValue()
            X.3Yd r10 = (X.C243283Yd) r10
            X.4DU r4 = r0.A0h
            X.0eM r3 = r5.A0d
            java.lang.Object r3 = r3.getValue()
            X.3fU r3 = (X.C246943fU) r3
            boolean r3 = r3.A02(r11, r4, r9)
            X.3gj r4 = r10.A01(r11, r4, r9, r3)
            java.lang.Object r3 = r8.getTag()
            if (r3 == 0) goto L_0x05dd
            X.3ro r3 = (X.C254023ro) r3
            r7.A06(r6, r3, r4, r9)
            goto L_0x0af2
        L_0x05dd:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 30905505(0x1d794a1, float:7.91918E-38)
            goto L_0x0080
        L_0x05e6:
            r4 = r1
            X.1Xj r4 = (X.1Xj) r4
            androidx.fragment.app.FragmentActivity r7 = r0.A0d
            java.lang.Object r6 = r8.getTag()
            if (r6 == 0) goto L_0x060e
            X.GjG r6 = (X.C53144GjG) r6
            X.0eM r3 = r5.A0T
            java.lang.Object r3 = r3.getValue()
            X.Hpi r3 = (X.C55921Hpi) r3
            X.JM5 r5 = r3.A00(r4)
            X.0eM r3 = r10.A03
            java.lang.Object r4 = r3.getValue()
            X.Hnm r4 = (X.C55806Hnm) r4
            X.2nI r3 = r0.A0e
            X.C56302HwF.A01(r7, r3, r4, r5, r6)
            goto L_0x0af2
        L_0x060e:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -352657769(0xffffffffeafade97, float:-1.516413E26)
            goto L_0x0080
        L_0x0617:
            X.3yv r10 = r0.A0G
            if (r10 != 0) goto L_0x061f
            java.lang.String r11 = "fundraiserMediaCTABarViewBinder"
            goto L_0x0046
        L_0x061f:
            java.lang.Object r9 = r8.getTag()
            if (r9 == 0) goto L_0x0638
            X.3rt r9 = (X.C254073rt) r9
            X.5Es r7 = A00(r5)
            r6 = r1
            X.1Xj r6 = (X.1Xj) r6
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            X.IS4 r4 = new X.IS4
            r4.<init>()
            goto L_0x09e6
        L_0x0638:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 314406141(0x12bd74fd, float:1.1956417E-27)
            goto L_0x0080
        L_0x0641:
            r7 = r2
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            r10 = r1
            X.1Xj r10 = (X.1Xj) r10
            X.3YB r24 = A01(r0, r10, r7)
            X.3pR r6 = r0.A02
            if (r6 != 0) goto L_0x0653
            java.lang.String r11 = "mediaHeaderViewBinder"
            goto L_0x0046
        L_0x0653:
            java.lang.Object r4 = r8.getTag()
            if (r4 == 0) goto L_0x0688
            X.3rl r4 = (X.C253993rl) r4
            X.3Ws r20 = r5.A01()
            android.content.Context r9 = r0.A0c
            X.4DU r3 = r0.A0h
            r26 = 0
            r21 = r9
            r22 = r10
            r23 = r3
            r25 = r7
            X.3Zb r13 = r20.A04(r21, r22, r23, r24, r25, r26)
            X.3Ws r9 = r5.A01()
            X.3Zn r5 = new X.3Zn
            r5.<init>(r9)
            int r15 = r7.getPosition()
            r9 = r6
            r10 = r3
            r11 = r5
            r12 = r4
            r14 = r7
            r9.A06(r10, r11, r12, r13, r14, r15)
            goto L_0x0af2
        L_0x0688:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 966103872(0x39959340, float:2.8529204E-4)
            goto L_0x0080
        L_0x0691:
            android.content.Context r11 = r0.A0c
            boolean r10 = r0.A12
            java.lang.Object r9 = r8.getTag()
            if (r9 == 0) goto L_0x06c8
            X.5w1 r9 = (X.AnonymousClass5w1) r9
            r4 = r1
            X.1Xj r4 = (X.1Xj) r4
            X.0qQ.A0B(r4, r3)
            r3 = 14
            X.9IE r7 = new X.9IE
            r7.<init>((X.1Xj) r4, (int) r3)
            r6 = r2
            X.3W1 r6 = (X.AnonymousClass3W1) r6
            X.0Pl r5 = r0.A0j
            X.4DU r4 = r0.A0h
            com.instagram.common.session.UserSession r3 = r0.A0f
            r25 = r6
            r26 = r5
            r27 = r10
            r20 = r11
            r21 = r7
            r22 = r3
            r23 = r9
            r24 = r4
            X.AnonymousClass5w0.A01(r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0af2
        L_0x06c8:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 1314911402(0x4e5ff4aa, float:9.3933837E8)
            goto L_0x0080
        L_0x06d1:
            X.2oD r3 = r0.A0g
            if (r3 == 0) goto L_0x0af2
            X.33Q r7 = r0.A0S
            if (r7 != 0) goto L_0x06dd
            java.lang.String r11 = "feedInlineComposerButtonViewBinder"
            goto L_0x0046
        L_0x06dd:
            java.lang.Object r6 = r8.getTag()
            if (r6 == 0) goto L_0x070a
            X.3Oz r6 = (X.C241383Oz) r6
            java.lang.Object r3 = r9.getValue()
            X.GTQ r3 = (X.GTQ) r3
            X.0eM r3 = r3.A0D
            java.lang.Object r3 = r3.getValue()
            X.33Z r3 = (X.AnonymousClass33Z) r3
            X.0eM r3 = r3.A0L
            java.lang.Object r5 = r3.getValue()
            X.3gm r5 = (X.C247703gm) r5
            r3 = r1
            X.1Xj r3 = (X.1Xj) r3
            r4 = r2
            X.3W1 r4 = (X.AnonymousClass3W1) r4
            X.9J0 r3 = r5.A00(r3, r4)
            r7.A01(r3, r6, r4)
            goto L_0x0af2
        L_0x070a:
            r0 = 3661(0xe4d, float:5.13E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.NullPointerException r2 = X.AnonymousClass7TE.A11(r0)
            r1 = -1432977882(0xffffffffaa967e26, float:-2.6732886E-13)
            goto L_0x0080
        L_0x0719:
            X.1Xj r1 = (X.1Xj) r1
            r1.A3q()
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 969834438(0x39ce7fc6, float:3.938658E-4)
            goto L_0x0080
        L_0x0727:
            X.1Xj r1 = (X.1Xj) r1
            r1.A3q()
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -1176505716(0xffffffffb9dff28c, float:-4.2714586E-4)
            goto L_0x0080
        L_0x0735:
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            X.Hkw r4 = r2.A05()
            int r3 = r2.getPosition()
            X.IUl r2 = r4.A01
            r2.A00(r3)
            X.IUm r2 = r4.A00
            r2.A00(r3)
            X.3Yp r3 = r0.A0i
            if (r3 == 0) goto L_0x0771
            X.1Xj r1 = (X.1Xj) r1
            r3.A02(r1)
            X.310 r0 = r0.A00
            if (r0 == 0) goto L_0x0b22
            X.4DV r0 = r0.BqC()
            X.3Ar r2 = r0.getScrollingViewProxy()
            X.VuD r0 = new X.VuD
            r0.<init>(r3, r2)
            r3.A01 = r0
            r1.A3q()
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -2145569793(0xffffffff801d33ff, float:-2.681882E-39)
            goto L_0x0080
        L_0x0771:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 371177160(0x161fb6c8, float:1.2901593E-25)
            goto L_0x0080
        L_0x077a:
            X.1Xj r1 = (X.1Xj) r1
            r1.A3q()
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -892406967(0xffffffffcacef349, float:-6781348.5)
            goto L_0x0080
        L_0x0788:
            r7 = r1
            X.1Xj r7 = (X.1Xj) r7
            boolean r3 = r0.A0p
            if (r3 != 0) goto L_0x0af2
            X.TsF r9 = X.C14232TsF.A00
            java.lang.Object r6 = r8.getTag()
            if (r6 == 0) goto L_0x07be
            X.TsI r6 = (X.C14235TsI) r6
            X.0eM r3 = r5.A0V
            java.lang.Object r4 = r3.getValue()
            X.GV6 r4 = (X.GV6) r4
            X.310 r3 = r0.A00
            if (r3 == 0) goto L_0x0b22
            X.41J r3 = r3.BQP()
            X.TsG r11 = r4.A00(r3, r7)
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            X.4DU r4 = r0.A0h
            com.instagram.common.session.UserSession r3 = r0.A0f
            r14 = r4
            r15 = r5
            r10 = r3
            r12 = r6
            r13 = r7
            r9.A01(r10, r11, r12, r13, r14, r15)
            goto L_0x0af2
        L_0x07be:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 1037033326(0x3dcfdf6e, float:0.10150038)
            goto L_0x0080
        L_0x07c7:
            boolean r3 = r0.A0p
            if (r3 != 0) goto L_0x0af2
            X.41P r9 = r0.A0C
            if (r9 != 0) goto L_0x07d3
            java.lang.String r11 = "labelBelowCommentsViewBinder"
            goto L_0x0046
        L_0x07d3:
            java.lang.Object r7 = r8.getTag()
            if (r7 == 0) goto L_0x07f4
            X.3rp r7 = (X.C254033rp) r7
            X.0eM r3 = r5.A0P
            java.lang.Object r6 = r3.getValue()
            X.3go r6 = (X.C247723go) r6
            android.content.Context r5 = r0.A0c
            r4 = r1
            X.1Xj r4 = (X.1Xj) r4
            r3 = r2
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            X.9IP r3 = r6.A00(r5, r4, r3)
            r9.A01(r3, r7)
            goto L_0x0af2
        L_0x07f4:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -2074507570(0xffffffff845986ce, float:-2.5570127E-36)
            goto L_0x0080
        L_0x07fd:
            X.I0e r9 = r0.A0X
            if (r9 != 0) goto L_0x0805
            java.lang.String r11 = "mediaNoticeViewBinder"
            goto L_0x0046
        L_0x0805:
            java.lang.Object r7 = r8.getTag()
            X.Hnn r7 = (X.C55807Hnn) r7
            if (r7 == 0) goto L_0x0838
            X.0eM r3 = r5.A0X
            java.lang.Object r3 = r3.getValue()
            X.CwN r3 = (X.C45440CwN) r3
            r6 = r1
            X.1Xj r6 = (X.1Xj) r6
            X.Jvj r5 = r3.A00(r6)
            X.0eM r3 = r10.A04
            java.lang.Object r4 = r3.getValue()
            X.HmQ r4 = (X.C55729HmQ) r4
            java.lang.String r3 = r6.A2n()
            if (r3 == 0) goto L_0x082f
            r9.A00(r5, r4, r7, r3)
            goto L_0x0af2
        L_0x082f:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 1894639941(0x70ede945, float:5.8903962E29)
            goto L_0x0080
        L_0x0838:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 849176242(0x329d66b2, float:1.8323906E-8)
            goto L_0x0080
        L_0x0841:
            X.3yv r7 = r0.A0I
            if (r7 != 0) goto L_0x0849
            java.lang.String r11 = "openCarouselReviewMediaCTABarViewBinder"
            goto L_0x0046
        L_0x0849:
            java.lang.Object r6 = r8.getTag()
            if (r6 == 0) goto L_0x0864
            X.3rt r6 = (X.C254073rt) r6
            X.5Es r10 = A00(r5)
            r9 = r1
            X.1Xj r9 = (X.1Xj) r9
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            com.instagram.common.session.UserSession r3 = r0.A0f
            X.IS5 r4 = new X.IS5
            r4.<init>(r3)
            goto L_0x0ae7
        L_0x0864:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -1919196436(0xffffffff8d9b62ec, float:-9.576427E-31)
            goto L_0x0080
        L_0x086d:
            X.3yv r7 = r0.A0J
            if (r7 != 0) goto L_0x0875
            java.lang.String r11 = "openCarouselTurnOnMediaCTABarViewBinder"
            goto L_0x0046
        L_0x0875:
            java.lang.Object r6 = r8.getTag()
            if (r6 == 0) goto L_0x0890
            X.3rt r6 = (X.C254073rt) r6
            X.5Es r10 = A00(r5)
            r9 = r1
            X.1Xj r9 = (X.1Xj) r9
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            com.instagram.common.session.UserSession r3 = r0.A0f
            X.3YS r4 = new X.3YS
            r4.<init>(r3)
            goto L_0x0ae7
        L_0x0890:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 1444945946(0x5620201a, float:4.4014934E13)
            goto L_0x0080
        L_0x0899:
            X.0eM r3 = r5.A0Y
            java.lang.Object r5 = r3.getValue()
            X.A8e r5 = (X.C39764A8e) r5
            r4 = r1
            X.1Xj r4 = (X.1Xj) r4
            r3 = r2
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            X.JwK r6 = r5.A00(r4, r3)
            java.lang.Object r5 = r8.getTag()
            if (r5 == 0) goto L_0x08c2
            X.GjL r5 = (X.C53149GjL) r5
            X.310 r3 = r0.A00
            if (r3 == 0) goto L_0x0b22
            X.6mq r4 = r3.BQe()
            X.4DU r3 = r0.A0h
            X.C56655I6k.A03(r6, r3, r5, r4)
            goto L_0x0af2
        L_0x08c2:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -2091034609(0xffffffff835d580f, float:-6.504715E-37)
            goto L_0x0080
        L_0x08cb:
            X.3z4 r6 = r0.A0P
            if (r6 != 0) goto L_0x08d3
            java.lang.String r11 = "mediaUFIViewBinder"
            goto L_0x0046
        L_0x08d3:
            X.3Yc r10 = r5.A00()
            android.content.Context r9 = r0.A0c
            r7 = r1
            X.1Xj r7 = (X.1Xj) r7
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            X.4DU r4 = r0.A0h
            X.3fY r3 = new X.3fY
            r3.<init>(r9)
            r15 = r5
            r11 = r9
            r12 = r3
            r13 = r7
            r14 = r4
            X.3gM r4 = r10.A02(r11, r12, r13, r14, r15)
            java.lang.Object r3 = r8.getTag()
            if (r3 == 0) goto L_0x08fc
            X.3rn r3 = (X.C254013rn) r3
            r6.A06(r3, r4, r5)
            goto L_0x0af2
        L_0x08fc:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 532426733(0x1fbc2fed, float:7.9700384E-20)
            goto L_0x0080
        L_0x0905:
            X.46v r3 = r0.A0T
            if (r3 != 0) goto L_0x090d
            java.lang.String r11 = "viewAllCommentsViewBinder"
            goto L_0x0046
        L_0x090d:
            java.lang.Object r4 = r8.getTag()
            if (r4 == 0) goto L_0x0935
            X.49J r4 = (X.AnonymousClass49J) r4
            X.0eM r3 = r5.A0j
            java.lang.Object r9 = r3.getValue()
            X.3pt r9 = (X.C252903pt) r9
            r12 = r1
            X.1Xj r12 = (X.1Xj) r12
            r14 = r2
            X.3W1 r14 = (X.AnonymousClass3W1) r14
            android.content.Context r10 = r0.A0c
            X.5DR r11 = new X.5DR
            r11.<init>(r10)
            X.4DU r13 = r0.A0h
            X.9If r3 = r9.A01(r10, r11, r12, r13, r14)
            X.C2607346v.A00(r3, r4)
            goto L_0x0af2
        L_0x0935:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -104112903(0xfffffffff9cb5cf9, float:-1.3199025E35)
            goto L_0x0080
        L_0x093e:
            X.GUA r7 = r0.A0Q
            if (r7 != 0) goto L_0x0946
            java.lang.String r11 = "commentsOffManageControlsViewBinder"
            goto L_0x0046
        L_0x0946:
            java.lang.Object r6 = r8.getTag()
            if (r6 == 0) goto L_0x0962
            X.Gin r6 = (X.C53115Gin) r6
            X.0eM r3 = r5.A0H
            java.lang.Object r4 = r3.getValue()
            X.A8f r4 = (X.C39765A8f) r4
            r3 = r1
            X.1Xj r3 = (X.1Xj) r3
            X.JwG r3 = r4.A00(r3)
            r7.A00(r3, r6)
            goto L_0x0af2
        L_0x0962:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -191870450(0xfffffffff4904a0e, float:-9.145419E31)
            goto L_0x0080
        L_0x096b:
            java.lang.Object r0 = r8.getTag()
            if (r0 == 0) goto L_0x0986
            android.content.Context r0 = r8.getContext()
            X.0qQ.A07(r0)
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            r2.getPosition()
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -1715089396(0xffffffff99c5d00c, float:-2.0453352E-23)
            goto L_0x0080
        L_0x0986:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -1234531501(0xffffffffb66a8b53, float:-3.4949815E-6)
            goto L_0x0080
        L_0x098f:
            android.content.Context r9 = r0.A0c
            com.instagram.common.session.UserSession r11 = r0.A0f
            X.4DU r10 = r0.A0h
            java.lang.Object r13 = r8.getTag()
            if (r13 == 0) goto L_0x09bc
            X.UDs r13 = (X.C14890UDs) r13
            X.310 r3 = r0.A00
            if (r3 == 0) goto L_0x0b22
            X.2ql r12 = r3.BgC()
            r3 = r1
            X.1Xj r3 = (X.1Xj) r3
            java.lang.String r14 = r3.A2n()
            if (r14 == 0) goto L_0x09b3
            X.C18696Vwu.A02(r9, r10, r11, r12, r13, r14)
            goto L_0x0af2
        L_0x09b3:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 1677689327(0x63ff81ef, float:9.426565E21)
            goto L_0x0080
        L_0x09bc:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -1281023957(0xffffffffb3a5202b, float:-7.6892626E-8)
            goto L_0x0080
        L_0x09c5:
            X.3yv r10 = r0.A0K
            if (r10 != 0) goto L_0x09cd
            java.lang.String r11 = "professionalOrganicMediaCTABarViewBinder"
            goto L_0x0046
        L_0x09cd:
            java.lang.Object r9 = r8.getTag()
            X.3rt r9 = (X.C254073rt) r9
            if (r9 == 0) goto L_0x09f3
            X.5Es r7 = A00(r5)
            r6 = r1
            X.1Xj r6 = (X.1Xj) r6
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            com.instagram.common.session.UserSession r3 = r0.A0f
            X.IS6 r4 = new X.IS6
            r4.<init>(r3)
        L_0x09e6:
            X.3YT r4 = (X.AnonymousClass3YT) r4
            X.4DU r3 = r0.A0h
            X.5Ev r3 = r7.A00(r4, r6, r3, r5)
            r10.A02(r3, r9, r5)
            goto L_0x0af2
        L_0x09f3:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -969387713(0xffffffffc638513f, float:-11796.312)
            goto L_0x0080
        L_0x09fc:
            java.lang.Object r6 = r8.getTag()
            if (r6 == 0) goto L_0x0a25
            X.Giu r6 = (X.C53122Giu) r6
            X.GUD r4 = r0.A01
            if (r4 != 0) goto L_0x0a0c
            java.lang.String r11 = "scheduledContentPublishTimeViewBinder"
            goto L_0x0046
        L_0x0a0c:
            r3 = r1
            X.1Xj r3 = (X.1Xj) r3
            r4.A02(r6, r3)
            r3 = 2
            X.INz r5 = new X.INz
            r5.<init>(r3, r6, r0)
            com.instagram.common.session.UserSession r3 = r0.A0f
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.Lfs> r3 = X.C64666Lfs.class
            r4.A01(r5, r3)
            goto L_0x0af2
        L_0x0a25:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 1626862434(0x60f7f362, float:1.42933855E20)
            goto L_0x0080
        L_0x0a2e:
            X.3yv r7 = r0.A0L
            if (r7 != 0) goto L_0x0a36
            java.lang.String r11 = "shoppingMediaCTABarViewBinder"
            goto L_0x0046
        L_0x0a36:
            java.lang.Object r6 = r8.getTag()
            if (r6 == 0) goto L_0x0a51
            X.3rt r6 = (X.C254073rt) r6
            X.5Es r10 = A00(r5)
            r9 = r1
            X.1Xj r9 = (X.1Xj) r9
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            com.instagram.common.session.UserSession r3 = r0.A0f
            X.IS7 r4 = new X.IS7
            r4.<init>(r3)
            goto L_0x0ae7
        L_0x0a51:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -705299641(0xffffffffd5f5fb47, float:-3.38074471E13)
            goto L_0x0080
        L_0x0a5a:
            X.GUB r10 = r0.A0a
            if (r10 != 0) goto L_0x0a62
            java.lang.String r11 = "unifiedFeedbackDisclosureNuxBarViewBinder"
            goto L_0x0046
        L_0x0a62:
            java.lang.Object r9 = r8.getTag()
            if (r9 == 0) goto L_0x0a86
            X.Gj9 r9 = (X.C53137Gj9) r9
            X.0eM r3 = r5.A0i
            java.lang.Object r7 = r3.getValue()
            X.3YK r7 = (X.AnonymousClass3YK) r7
            r6 = r1
            X.1Xj r6 = (X.1Xj) r6
            android.content.Context r5 = r0.A0c
            com.instagram.common.session.UserSession r4 = r0.A0f
            X.3YL r3 = new X.3YL
            r3.<init>(r5, r4)
            X.9IE r3 = r7.A00(r6, r3)
            r10.A00(r3, r9)
            goto L_0x0af2
        L_0x0a86:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -1107523949(0xffffffffbdfc8693, float:-0.123303555)
            goto L_0x0080
        L_0x0a8f:
            X.3yv r7 = r0.A0M
            if (r7 != 0) goto L_0x0a97
            java.lang.String r11 = "upcomingLiveEventMediaCTABarViewBinder"
            goto L_0x0046
        L_0x0a97:
            java.lang.Object r6 = r8.getTag()
            if (r6 == 0) goto L_0x0ab7
            X.3rt r6 = (X.C254073rt) r6
            X.5Es r10 = A00(r5)
            r9 = r1
            X.1Xj r9 = (X.1Xj) r9
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            X.310 r3 = r0.A00
            if (r3 == 0) goto L_0x0b22
            X.DQu r3 = r3.CC3()
            X.AdK r4 = new X.AdK
            r4.<init>(r3)
            goto L_0x0ae7
        L_0x0ab7:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = -894956568(0xffffffffcaa80be8, float:-5506548.0)
            goto L_0x0080
        L_0x0ac0:
            X.3yv r7 = r0.A0N
            if (r7 != 0) goto L_0x0ac8
            java.lang.String r11 = "upcomingOnlineEventMediaCTABarViewBinder"
            goto L_0x0046
        L_0x0ac8:
            java.lang.Object r6 = r8.getTag()
            if (r6 == 0) goto L_0x0b14
            X.3rt r6 = (X.C254073rt) r6
            X.5Es r10 = A00(r5)
            r9 = r1
            X.1Xj r9 = (X.1Xj) r9
            r5 = r2
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            X.310 r3 = r0.A00
            if (r3 == 0) goto L_0x0b22
            X.DQv r3 = r3.CC5()
            X.AdL r4 = new X.AdL
            r4.<init>(r3)
        L_0x0ae7:
            X.3YT r4 = (X.AnonymousClass3YT) r4
            X.4DU r3 = r0.A0h
            X.5Ev r3 = r10.A00(r4, r9, r3, r5)
            r7.A02(r3, r6, r5)
        L_0x0af2:
            r3 = r19
            boolean r3 = r3.A01
            if (r3 == 0) goto L_0x0afe
            X.2rm r3 = r0.A0x
            boolean r3 = r3.A0V
            if (r3 != 0) goto L_0x0b0b
        L_0x0afe:
            X.310 r0 = r0.A00
            if (r0 == 0) goto L_0x0b22
            X.3WV r3 = r0.BRO()
            r0 = r18
            r3.ECB(r8, r0, r1, r2)
        L_0x0b0b:
            r1 = -6709890(0xffffffffff999d7e, float:NaN)
            r0 = r16
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0b14:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r20)
            r1 = 106704624(0x65c2ef0, float:4.1411885E-35)
            goto L_0x0080
        L_0x0b1d:
            X.0qQ.A0F(r21)
            goto L_0x0049
        L_0x0b22:
            X.0qQ.A0F(r17)
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GTP.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final int getViewTypeCount() {
        return C231592rv.A02.length;
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.2s5, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005a, code lost:
        if (X.2eO.A00(r2) == false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GTP(androidx.fragment.app.FragmentActivity r5, X.AnonymousClass07Z r6, X.C229382nI r7, X.0xF r8, X.AnonymousClass57L r9, X.AnonymousClass2oD r10, X.AnonymousClass2kR r11, X.C243393Yp r12, X.0Pl r13, com.instagram.search.common.analytics.SearchContext r14, X.C249763kK r15, java.lang.Integer r16, java.lang.Integer r17, java.lang.String r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25) {
        /*
            r4 = this;
            r4.<init>()
            r4.A0e = r7
            r4.A0d = r5
            r4.A0s = r6
            r0 = r19
            r4.A0b = r0
            r0 = r20
            r4.A13 = r0
            r0 = r16
            r4.A11 = r0
            r0 = r21
            r4.A0o = r0
            r4.A0w = r11
            r3 = r22
            r4.A0r = r3
            r4.A0j = r13
            r0 = r17
            r4.A10 = r0
            r4.A0v = r9
            r4.A0t = r8
            r0 = r23
            r4.A0n = r0
            r0 = r24
            r4.A0p = r0
            r4.A0i = r12
            r4.A0g = r10
            r0 = r25
            r4.A0q = r0
            r0 = r18
            r4.A0k = r0
            r4.A0z = r15
            r4.A0y = r14
            android.content.Context r2 = r11.A00
            r4.A0c = r2
            com.instagram.common.session.UserSession r1 = r11.A01
            r4.A0f = r1
            X.4DU r0 = r11.A02
            r4.A0h = r0
            X.2rm r0 = X.C231492rl.A00(r1)
            r4.A0x = r0
            if (r22 != 0) goto L_0x005c
            boolean r1 = X.2eO.A00(r2)
            r0 = 1
            if (r1 != 0) goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            r4.A12 = r0
            X.2s4 r0 = new X.2s4
            r0.<init>()
            r4.A0u = r0
            X.0eO r2 = X.0eO.A04
            r1 = 44
            X.Ivt r0 = new X.Ivt
            r0.<init>(r4, r1)
            X.0eM r0 = X.AnonymousClass0eN.A00(r2, r0)
            r4.A0l = r0
            r0 = 45
            X.0t0 r0 = X.C58684Ivt.A00(r4, r0)
            r4.A0m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GTP.<init>(androidx.fragment.app.FragmentActivity, X.07Z, X.2nI, X.0xF, X.57L, X.2oD, X.2kR, X.3Yp, X.0Pl, com.instagram.search.common.analytics.SearchContext, X.3kK, java.lang.Integer, java.lang.Integer, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final void AHO(1Xj r2, AnonymousClass3W1 r3, int i) {
        AnonymousClass7TG.A1O(r2, r3);
        C2362933e r0 = this.A0W;
        if (r0 == null) {
            0qQ.A0F("lithoFeedBinderGroup");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.AHO(r2, r3, i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v61, types: [X.3YT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v71, types: [X.3YT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v84, types: [X.3YT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v89, types: [X.3YT, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02e3, code lost:
        r3 = ((X.C232502tp) r0.getValue()).A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02ef, code lost:
        X.0qQ.A0F("binders");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02f9, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0300, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0301, code lost:
        r3 = r1.A04(r12.A0c, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x041b, code lost:
        X.AnonymousClass0fD.A0A(-182388335, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0421, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002c, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(int r13, android.view.ViewGroup r14) {
        /*
            r12 = this;
            r0 = -513453536(0xffffffffe1655220, float:-2.6438888E20)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r3 = 1
            r8 = r14
            X.0qQ.A0B(r14, r3)
            X.2rv[] r0 = X.C231592rv.A02
            r0 = r0[r13]
            int r0 = r0.ordinal()
            java.lang.String r6 = "delegate"
            java.lang.String r1 = "binders"
            r7 = 0
            switch(r0) {
                case 0: goto L_0x0311;
                case 1: goto L_0x01be;
                case 2: goto L_0x00e2;
                case 3: goto L_0x001c;
                case 4: goto L_0x0376;
                case 5: goto L_0x001c;
                case 6: goto L_0x026f;
                case 7: goto L_0x03c0;
                case 8: goto L_0x00a0;
                case 9: goto L_0x0296;
                case 10: goto L_0x024a;
                case 11: goto L_0x03d7;
                case 12: goto L_0x0399;
                case 13: goto L_0x001c;
                case 14: goto L_0x001c;
                case 15: goto L_0x03e4;
                case 16: goto L_0x022a;
                case 17: goto L_0x001c;
                case 18: goto L_0x001c;
                case 19: goto L_0x001c;
                case 20: goto L_0x001c;
                case 21: goto L_0x034d;
                case 22: goto L_0x001c;
                case 23: goto L_0x001c;
                case 24: goto L_0x03b9;
                case 25: goto L_0x001c;
                case 26: goto L_0x001c;
                case 27: goto L_0x00b4;
                case 28: goto L_0x001c;
                case 29: goto L_0x001c;
                case 30: goto L_0x001c;
                case 31: goto L_0x001c;
                case 32: goto L_0x001c;
                case 33: goto L_0x038e;
                case 34: goto L_0x0366;
                case 35: goto L_0x0178;
                case 36: goto L_0x02b3;
                case 37: goto L_0x001c;
                case 38: goto L_0x001c;
                case 39: goto L_0x028f;
                case 40: goto L_0x0355;
                case 41: goto L_0x0127;
                case 42: goto L_0x001c;
                case 43: goto L_0x02f3;
                case 44: goto L_0x03b0;
                case 45: goto L_0x002d;
                case 46: goto L_0x001c;
                case 47: goto L_0x033d;
                case 48: goto L_0x0343;
                case 49: goto L_0x034d;
                case 50: goto L_0x0332;
                case 51: goto L_0x03fb;
                case 52: goto L_0x001c;
                case 53: goto L_0x0180;
                case 54: goto L_0x001c;
                case 55: goto L_0x0309;
                case 56: goto L_0x01a7;
                case 57: goto L_0x0190;
                case 58: goto L_0x036c;
                case 59: goto L_0x001c;
                case 60: goto L_0x02a5;
                case 61: goto L_0x0170;
                case 62: goto L_0x0150;
                case 63: goto L_0x02c1;
                case 64: goto L_0x0402;
                case 65: goto L_0x035d;
                case 66: goto L_0x00cb;
                case 67: goto L_0x00f9;
                case 68: goto L_0x001c;
                case 69: goto L_0x0213;
                case 70: goto L_0x001c;
                case 71: goto L_0x0409;
                case 72: goto L_0x008c;
                case 73: goto L_0x0078;
                case 74: goto L_0x0043;
                case 75: goto L_0x0413;
                case 76: goto L_0x0107;
                case 77: goto L_0x01f4;
                case 78: goto L_0x01d5;
                case 79: goto L_0x001c;
                case 80: goto L_0x02ac;
                case 81: goto L_0x02dd;
                case 82: goto L_0x02ba;
                case 83: goto L_0x02d6;
                case 84: goto L_0x02cf;
                case 85: goto L_0x02c8;
                case 86: goto L_0x001c;
                case 87: goto L_0x02c1;
                case 88: goto L_0x001c;
                case 89: goto L_0x001c;
                case 90: goto L_0x001c;
                case 91: goto L_0x0281;
                case 92: goto L_0x0288;
                case 93: goto L_0x013e;
                case 94: goto L_0x001c;
                case 95: goto L_0x0261;
                default: goto L_0x001c;
            }
        L_0x001c:
            java.lang.String r0 = "Unhandled view type, view type = "
            java.lang.String r0 = X.002.A0O(r0, r13)
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass7TE.A1B(r0)
            r0 = 1620282418(0x60938c32, float:8.505542E19)
        L_0x0029:
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        L_0x002d:
            X.2oD r0 = r12.A0g
            if (r0 == 0) goto L_0x0039
            X.33R r0 = r12.A0O
            if (r0 != 0) goto L_0x0057
            java.lang.String r6 = "mediaRowsPreparer"
            goto L_0x02f9
        L_0x0039:
            java.lang.String r0 = "Unhandled view type, no delegate available for MEDIA_INLINE_COMPOSER"
            java.lang.UnsupportedOperationException r1 = X.AnonymousClass7TE.A1B(r0)
            r0 = -1179472990(0xffffffffb9b2aba2, float:-3.4078682E-4)
            goto L_0x0029
        L_0x0043:
            X.334 r0 = r12.A0U
            if (r0 == 0) goto L_0x02ef
            X.0eM r0 = r0.A08
            java.lang.Object r1 = r0.getValue()
            X.Vw2 r1 = (X.C18650Vw2) r1
            android.content.Context r0 = r12.A0c
            android.view.View r3 = r1.A01(r0, r14)
            goto L_0x041b
        L_0x0057:
            X.33S r0 = r0.A00
            java.util.List r1 = r0.A01
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x006a
            r0 = 0
            java.lang.Object r3 = r1.remove(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 != 0) goto L_0x041b
        L_0x006a:
            X.33Q r0 = r12.A0S
            if (r0 != 0) goto L_0x0072
            java.lang.String r6 = "feedInlineComposerButtonViewBinder"
            goto L_0x02f9
        L_0x0072:
            android.view.View r3 = r0.A00(r14)
            goto L_0x041b
        L_0x0078:
            X.334 r0 = r12.A0U
            if (r0 == 0) goto L_0x02ef
            X.0eM r0 = r0.A08
            java.lang.Object r1 = r0.getValue()
            X.Vw2 r1 = (X.C18650Vw2) r1
            android.content.Context r0 = r12.A0c
            android.view.View r3 = r1.A02(r0, r14)
            goto L_0x041b
        L_0x008c:
            X.334 r0 = r12.A0U
            if (r0 == 0) goto L_0x02ef
            X.0eM r0 = r0.A08
            java.lang.Object r1 = r0.getValue()
            X.Vw2 r1 = (X.C18650Vw2) r1
            android.content.Context r0 = r12.A0c
            android.view.View r3 = r1.A03(r0, r14)
            goto L_0x041b
        L_0x00a0:
            X.334 r0 = r12.A0U
            if (r0 == 0) goto L_0x02ef
            X.0eM r0 = r0.A0G
            java.lang.Object r1 = r0.getValue()
            X.I0b r1 = (X.C56530I0b) r1
            android.content.Context r0 = r12.A0c
            android.view.View r3 = r1.A01(r0, r14)
            goto L_0x041b
        L_0x00b4:
            X.3yv r4 = r12.A0H
            if (r4 != 0) goto L_0x00bc
            java.lang.String r6 = "igbioProductMediaCTABarViewBinder"
            goto L_0x02f9
        L_0x00bc:
            android.content.Context r3 = r12.A0c
            com.instagram.common.session.UserSession r1 = r12.A0f
            X.AdJ r0 = new X.AdJ
            r0.<init>(r1)
            android.view.View r3 = r4.A00(r3, r14, r1, r0)
            goto L_0x041b
        L_0x00cb:
            X.3yv r4 = r12.A0K
            if (r4 != 0) goto L_0x00d3
            java.lang.String r6 = "professionalOrganicMediaCTABarViewBinder"
            goto L_0x02f9
        L_0x00d3:
            android.content.Context r3 = r12.A0c
            com.instagram.common.session.UserSession r1 = r12.A0f
            X.IS6 r0 = new X.IS6
            r0.<init>(r1)
            android.view.View r3 = r4.A00(r3, r14, r1, r0)
            goto L_0x041b
        L_0x00e2:
            X.3yv r4 = r12.A0E
            if (r4 != 0) goto L_0x00ea
            java.lang.String r6 = "appInstallMediaCTABarViewBinder"
            goto L_0x02f9
        L_0x00ea:
            android.content.Context r3 = r12.A0c
            com.instagram.common.session.UserSession r1 = r12.A0f
            X.IS3 r0 = new X.IS3
            r0.<init>()
            android.view.View r3 = r4.A00(r3, r14, r1, r0)
            goto L_0x041b
        L_0x00f9:
            X.GUD r0 = r12.A01
            if (r0 != 0) goto L_0x0101
            java.lang.String r6 = "scheduledContentPublishTimeViewBinder"
            goto L_0x02f9
        L_0x0101:
            android.view.View r3 = X.GUD.A00(r14)
            goto L_0x041b
        L_0x0107:
            X.GUB r4 = r12.A0a
            if (r4 != 0) goto L_0x010f
            java.lang.String r6 = "unifiedFeedbackDisclosureNuxBarViewBinder"
            goto L_0x02f9
        L_0x010f:
            android.content.Context r0 = r12.A0c
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
            r1 = 2131629757(0x7f0e16bd, float:1.8886844E38)
            r0 = 0
            android.view.View r3 = X.DbU.A09(r3, r14, r1, r0)
            X.Gj9 r0 = new X.Gj9
            r0.<init>(r3, r4)
            r3.setTag(r0)
            goto L_0x041b
        L_0x0127:
            X.3yv r4 = r12.A0G
            if (r4 != 0) goto L_0x012f
            java.lang.String r6 = "fundraiserMediaCTABarViewBinder"
            goto L_0x02f9
        L_0x012f:
            android.content.Context r3 = r12.A0c
            com.instagram.common.session.UserSession r1 = r12.A0f
            X.IS4 r0 = new X.IS4
            r0.<init>()
            android.view.View r3 = r4.A00(r3, r14, r1, r0)
            goto L_0x041b
        L_0x013e:
            X.334 r0 = r12.A0U
            if (r0 == 0) goto L_0x02ef
            X.0eM r0 = r0.A0C
            java.lang.Object r0 = r0.getValue()
            X.2tp r0 = (X.C232502tp) r0
            com.facebook.litho.LithoView r3 = r0.A03()
            goto L_0x041b
        L_0x0150:
            X.GUA r0 = r12.A0Q
            if (r0 != 0) goto L_0x0158
            java.lang.String r6 = "commentsOffManageControlsViewBinder"
            goto L_0x02f9
        L_0x0158:
            android.content.Context r0 = r12.A0c
            r3 = 0
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131629041(0x7f0e13f1, float:1.8885392E38)
            android.view.View r3 = X.DbU.A09(r1, r14, r0, r3)
            X.Gin r0 = new X.Gin
            r0.<init>(r3)
            r3.setTag(r0)
            goto L_0x041b
        L_0x0170:
            X.46v r1 = r12.A0T
            if (r1 != 0) goto L_0x0301
            java.lang.String r6 = "viewAllCommentsViewBinder"
            goto L_0x02f9
        L_0x0178:
            X.417 r1 = r12.A0R
            if (r1 != 0) goto L_0x0301
            java.lang.String r6 = "feedCommentRowViewBinder"
            goto L_0x02f9
        L_0x0180:
            X.41P r0 = r12.A0C
            if (r0 != 0) goto L_0x0188
            java.lang.String r6 = "labelBelowCommentsViewBinder"
            goto L_0x02f9
        L_0x0188:
            android.content.Context r0 = r12.A0c
            android.view.View r3 = X.AnonymousClass41P.A00(r0, r14)
            goto L_0x041b
        L_0x0190:
            X.3yv r4 = r12.A0J
            if (r4 != 0) goto L_0x0198
            java.lang.String r6 = "openCarouselTurnOnMediaCTABarViewBinder"
            goto L_0x02f9
        L_0x0198:
            android.content.Context r3 = r12.A0c
            com.instagram.common.session.UserSession r1 = r12.A0f
            X.3YS r0 = new X.3YS
            r0.<init>(r1)
            android.view.View r3 = r4.A00(r3, r14, r1, r0)
            goto L_0x041b
        L_0x01a7:
            X.3yv r4 = r12.A0I
            if (r4 != 0) goto L_0x01af
            java.lang.String r6 = "openCarouselReviewMediaCTABarViewBinder"
            goto L_0x02f9
        L_0x01af:
            android.content.Context r3 = r12.A0c
            com.instagram.common.session.UserSession r1 = r12.A0f
            X.IS5 r0 = new X.IS5
            r0.<init>(r1)
            android.view.View r3 = r4.A00(r3, r14, r1, r0)
            goto L_0x041b
        L_0x01be:
            X.3yv r4 = r12.A0D
            if (r4 != 0) goto L_0x01c6
            java.lang.String r6 = "adMediaCTABarViewBinder"
            goto L_0x02f9
        L_0x01c6:
            android.content.Context r3 = r12.A0c
            com.instagram.common.session.UserSession r1 = r12.A0f
            X.3yy r0 = new X.3yy
            r0.<init>()
            android.view.View r3 = r4.A00(r3, r14, r1, r0)
            goto L_0x041b
        L_0x01d5:
            X.3yv r5 = r12.A0N
            if (r5 != 0) goto L_0x01dd
            java.lang.String r6 = "upcomingOnlineEventMediaCTABarViewBinder"
            goto L_0x02f9
        L_0x01dd:
            android.content.Context r4 = r12.A0c
            com.instagram.common.session.UserSession r3 = r12.A0f
            X.310 r0 = r12.A00
            if (r0 == 0) goto L_0x02f9
            X.DQv r1 = r0.CC5()
            X.AdL r0 = new X.AdL
            r0.<init>(r1)
            android.view.View r3 = r5.A00(r4, r14, r3, r0)
            goto L_0x041b
        L_0x01f4:
            X.3yv r5 = r12.A0M
            if (r5 != 0) goto L_0x01fc
            java.lang.String r6 = "upcomingLiveEventMediaCTABarViewBinder"
            goto L_0x02f9
        L_0x01fc:
            android.content.Context r4 = r12.A0c
            com.instagram.common.session.UserSession r3 = r12.A0f
            X.310 r0 = r12.A00
            if (r0 == 0) goto L_0x02f9
            X.DQu r1 = r0.CC3()
            X.AdK r0 = new X.AdK
            r0.<init>(r1)
            android.view.View r3 = r5.A00(r4, r14, r3, r0)
            goto L_0x041b
        L_0x0213:
            X.3yv r4 = r12.A0L
            if (r4 != 0) goto L_0x021b
            java.lang.String r6 = "shoppingMediaCTABarViewBinder"
            goto L_0x02f9
        L_0x021b:
            android.content.Context r3 = r12.A0c
            com.instagram.common.session.UserSession r1 = r12.A0f
            X.IS7 r0 = new X.IS7
            r0.<init>(r1)
            android.view.View r3 = r4.A00(r3, r14, r1, r0)
            goto L_0x041b
        L_0x022a:
            X.Koq r0 = r12.A0A
            if (r0 != 0) goto L_0x0232
            java.lang.String r6 = "feedAddYoursMediaCTABarViewBinder"
            goto L_0x02f9
        L_0x0232:
            android.content.Context r0 = r12.A0c
            r3 = 0
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131625474(0x7f0e0602, float:1.8878157E38)
            android.view.View r3 = X.DbU.A0A(r1, r14, r0, r3)
            X.L9A r0 = new X.L9A
            r0.<init>(r3)
            r3.setTag(r0)
            goto L_0x041b
        L_0x024a:
            X.3yv r4 = r12.A0F
            if (r4 != 0) goto L_0x0252
            java.lang.String r6 = "collectionMediaCTABarViewBinder"
            goto L_0x02f9
        L_0x0252:
            android.content.Context r3 = r12.A0c
            com.instagram.common.session.UserSession r1 = r12.A0f
            X.LrF r0 = new X.LrF
            r0.<init>()
            android.view.View r3 = r4.A00(r3, r14, r1, r0)
            goto L_0x041b
        L_0x0261:
            X.HFj r0 = r12.A06
            if (r0 != 0) goto L_0x0269
            java.lang.String r6 = "carouselMediaLithoBinder"
            goto L_0x02f9
        L_0x0269:
            com.facebook.litho.LithoView r3 = r0.A03()
            goto L_0x041b
        L_0x026f:
            X.3TC r3 = r12.A07
            if (r3 != 0) goto L_0x0277
            java.lang.String r6 = "carouselMediaViewBinder"
            goto L_0x02f9
        L_0x0277:
            android.content.Context r1 = r12.A0c
            X.4DU r0 = r12.A0h
            X.3TP r3 = r3.A01(r1, r14, r0)
            goto L_0x041b
        L_0x0281:
            X.334 r0 = r12.A0U
            if (r0 == 0) goto L_0x02ef
            X.0eM r0 = r0.A0z
            goto L_0x02e3
        L_0x0288:
            X.334 r0 = r12.A0U
            if (r0 == 0) goto L_0x02ef
            X.0eM r0 = r0.A0w
            goto L_0x02e3
        L_0x028f:
            X.41M r1 = r12.A0B
            if (r1 != 0) goto L_0x0301
            java.lang.String r6 = "mediaFeedbackViewBinder"
            goto L_0x02f9
        L_0x0296:
            X.I2t r0 = r12.A0V
            if (r0 != 0) goto L_0x029d
            java.lang.String r6 = "collaborativePostInviteLegacyBinder"
            goto L_0x02f9
        L_0x029d:
            android.content.Context r0 = r12.A0c
            android.view.View r3 = X.C56589I2t.A00(r0, r14)
            goto L_0x041b
        L_0x02a5:
            X.3z4 r1 = r12.A0P
            if (r1 != 0) goto L_0x0301
            java.lang.String r6 = "mediaUFIViewBinder"
            goto L_0x02f9
        L_0x02ac:
            X.334 r0 = r12.A0U
            if (r0 == 0) goto L_0x02ef
            X.0eM r0 = r0.A0l
            goto L_0x02e3
        L_0x02b3:
            X.4EZ r1 = r12.A0Y
            if (r1 != 0) goto L_0x0301
            java.lang.String r6 = "mediaViewBinder"
            goto L_0x02f9
        L_0x02ba:
            X.334 r0 = r12.A0U
            if (r0 == 0) goto L_0x02ef
            X.0eM r0 = r0.A09
            goto L_0x02e3
        L_0x02c1:
            X.334 r0 = r12.A0U
            if (r0 == 0) goto L_0x02ef
            X.0eM r0 = r0.A0h
            goto L_0x02e3
        L_0x02c8:
            X.334 r0 = r12.A0U
            if (r0 == 0) goto L_0x02ef
            X.0eM r0 = r0.A0J
            goto L_0x02e3
        L_0x02cf:
            X.334 r0 = r12.A0U
            if (r0 == 0) goto L_0x02ef
            X.0eM r0 = r0.A0K
            goto L_0x02e3
        L_0x02d6:
            X.334 r0 = r12.A0U
            if (r0 == 0) goto L_0x02ef
            X.0eM r0 = r0.A0L
            goto L_0x02e3
        L_0x02dd:
            X.334 r0 = r12.A0U
            if (r0 == 0) goto L_0x02ef
            X.0eM r0 = r0.A0f
        L_0x02e3:
            java.lang.Object r0 = r0.getValue()
            X.2tp r0 = (X.C232502tp) r0
            com.facebook.litho.LithoView r3 = r0.A03()
            goto L_0x041b
        L_0x02ef:
            X.0qQ.A0F(r1)
            goto L_0x02fc
        L_0x02f3:
            X.3pR r1 = r12.A02
            if (r1 != 0) goto L_0x0301
            java.lang.String r6 = "mediaHeaderViewBinder"
        L_0x02f9:
            X.0qQ.A0F(r6)
        L_0x02fc:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0301:
            android.content.Context r0 = r12.A0c
            android.view.View r3 = r1.A04(r0, r14)
            goto L_0x041b
        L_0x0309:
            android.content.Context r0 = r12.A0c
            android.view.View r3 = X.C55011Hai.A00(r0, r14)
            goto L_0x041b
        L_0x0311:
            boolean r0 = r12.A12
            if (r0 == 0) goto L_0x0329
            android.content.Context r1 = r12.A0c
            r0 = 0
            X.0qQ.A0B(r1, r0)
            android.view.View r3 = new android.view.View
            r3.<init>(r1)
            int r0 = X.2Yu.A04(r1)
            X.DbT.A16(r1, r3, r0)
            goto L_0x041b
        L_0x0329:
            android.content.Context r0 = r12.A0c
            android.view.View r3 = new android.view.View
            r3.<init>(r0)
            goto L_0x041b
        L_0x0332:
            android.content.Context r3 = r12.A0c
            r1 = 3
            java.lang.String r0 = "v1"
            android.view.View r3 = X.C2363733m.A00(r3, r14, r0, r1)
            goto L_0x041b
        L_0x033d:
            android.view.View r3 = X.W2c.A01(r14)
            goto L_0x041b
        L_0x0343:
            com.instagram.common.session.UserSession r1 = r12.A0f
            java.lang.String r0 = "v1"
            android.view.View r3 = X.C18719Vys.A00(r14, r1, r0)
            goto L_0x041b
        L_0x034d:
            android.content.Context r0 = r12.A0c
            android.view.View r3 = X.C18200VnN.A00(r0, r14)
            goto L_0x041b
        L_0x0355:
            android.content.Context r0 = r12.A0c
            android.view.View r3 = X.C56302HwF.A00(r0, r14)
            goto L_0x041b
        L_0x035d:
            android.content.Context r1 = r12.A0c
            r0 = 0
            android.view.View r3 = X.C18696Vwu.A00(r1, r14, r0)
            goto L_0x041b
        L_0x0366:
            android.widget.FrameLayout r3 = X.C56311HwO.A00(r14)
            goto L_0x041b
        L_0x036c:
            android.content.Context r1 = r12.A0c
            com.instagram.common.session.UserSession r0 = r12.A0f
            android.view.View r3 = X.C56655I6k.A01(r1, r14, r0)
            goto L_0x041b
        L_0x0376:
            android.content.Context r0 = r12.A0c
            r3 = 0
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131629027(0x7f0e13e3, float:1.8885363E38)
            android.view.View r3 = X.DbU.A09(r1, r14, r0, r3)
            X.49I r0 = new X.49I
            r0.<init>(r3)
            r3.setTag(r0)
            goto L_0x041b
        L_0x038e:
            android.content.Context r6 = r12.A0c
            r9 = 0
            r10 = r9
            r11 = r9
            android.view.View r3 = X.C14033ToZ.A00(r6, r7, r8, r9, r10, r11)
            goto L_0x041b
        L_0x0399:
            android.content.Context r0 = r12.A0c
            r3 = 0
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131629074(0x7f0e1412, float:1.8885459E38)
            android.view.View r3 = X.DbU.A09(r1, r14, r0, r3)
            X.Gim r0 = new X.Gim
            r0.<init>(r3)
            r3.setTag(r0)
            goto L_0x041b
        L_0x03b0:
            android.content.Context r1 = r12.A0c
            X.0Pl r0 = r12.A0j
            android.view.View r3 = X.AnonymousClass5w0.A00(r1, r14, r0)
            goto L_0x041b
        L_0x03b9:
            android.content.Context r0 = r12.A0c
            android.view.View r3 = X.AnonymousClass3S7.A00(r0)
            goto L_0x041b
        L_0x03c0:
            android.content.Context r0 = r12.A0c
            r3 = 0
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131624452(0x7f0e0204, float:1.8876084E38)
            android.view.View r3 = X.DbU.A0A(r1, r14, r0, r3)
            X.3z5 r0 = new X.3z5
            r0.<init>(r3)
            r3.setTag(r0)
            goto L_0x041b
        L_0x03d7:
            android.content.Context r4 = r12.A0c
            com.instagram.common.session.UserSession r3 = r12.A0f
            X.4DU r1 = r12.A0h
            androidx.fragment.app.FragmentActivity r0 = r12.A0d
            android.view.View r3 = X.AnonymousClass3UW.A00(r4, r14, r0, r1, r3)
            goto L_0x041b
        L_0x03e4:
            android.content.Context r0 = r12.A0c
            r3 = 0
            android.view.LayoutInflater r1 = X.DbT.A0B(r0)
            r0 = 2131629083(0x7f0e141b, float:1.8885477E38)
            android.view.View r3 = X.DbU.A09(r1, r14, r0, r3)
            X.GjS r0 = new X.GjS
            r0.<init>(r3)
            r3.setTag(r0)
            goto L_0x041b
        L_0x03fb:
            android.content.Context r0 = r12.A0c
            android.view.View r3 = X.C14232TsF.A00(r0, r14)
            goto L_0x041b
        L_0x0402:
            X.4DU r0 = r12.A0h
            android.view.View r3 = X.Hd2.A00(r14, r0)
            goto L_0x041b
        L_0x0409:
            android.content.Context r3 = r12.A0c
            r1 = 0
            java.lang.String r0 = "v1"
            android.view.View r3 = X.C2363733m.A00(r3, r14, r0, r1)
            goto L_0x041b
        L_0x0413:
            android.content.Context r1 = r12.A0c
            java.lang.String r0 = "v1"
            android.view.View r3 = X.C2363733m.A00(r1, r14, r0, r3)
        L_0x041b:
            r0 = -182388335(0xfffffffff520f991, float:-2.0405989E32)
            X.AnonymousClass0fD.A0A(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GTP.createView(int, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GTP(androidx.fragment.app.FragmentActivity r23, X.AnonymousClass07Z r24, X.AnonymousClass2kR r25, boolean r26, boolean r27) {
        /*
            r22 = this;
            r15 = 0
            r0 = 6
            r7 = r25
            X.0qQ.A0B(r7, r0)
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            X.0Pk r2 = X.0Pl.A0n
            android.content.Context r1 = r7.A00
            com.instagram.common.session.UserSession r0 = r7.A01
            X.0Pl r9 = r2.A00(r1, r0)
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
            r3 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r16 = r26
            r17 = r27
            r4 = r3
            r5 = r3
            r6 = r3
            r8 = r3
            r10 = r3
            r11 = r3
            r14 = r3
            r18 = r15
            r19 = r15
            r20 = r15
            r21 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GTP.<init>(androidx.fragment.app.FragmentActivity, X.07Z, X.2kR, boolean, boolean):void");
    }
}
