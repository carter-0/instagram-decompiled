package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;

/* renamed from: X.Ugp  reason: case insensitive filesystem */
public final class C15684Ugp extends C252233om {
    public FragmentActivity A00;
    public C18643Vvl A01;
    public PromoteData A02;
    public C18784W1k A03;
    public PromoteState A04;
    public final WGU A05;
    public final X7h A06;

    public C15684Ugp(X7h x7h) {
        0qQ.A0B(x7h, 1);
        this.A06 = x7h;
        XAI requireActivity = x7h.requireActivity();
        this.A00 = requireActivity;
        0qQ.A0C(requireActivity, AnonymousClass000.A00(86));
        this.A02 = requireActivity.Bhh();
        XA9 xa9 = this.A00;
        0qQ.A0C(xa9, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteState.Delegate");
        this.A04 = xa9.Bhj();
        this.A03 = x7h.AvJ();
        FragmentActivity fragmentActivity = this.A00;
        0qQ.A0C(fragmentActivity, AnonymousClass000.A00(50));
        2dZ AYJ = ((C249453jo) fragmentActivity).AYJ();
        if (AYJ != null) {
            this.A01 = new C18643Vvl(fragmentActivity, AYJ);
            this.A05 = WGU.A00(this.A02.A0y);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0182, code lost:
        if (r2 != null) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00() {
        /*
            r22 = this;
            r3 = r22
            com.instagram.business.promote.model.PromoteData r2 = r3.A02
            java.lang.String r0 = r2.A1J
            r5 = 0
            if (r0 == 0) goto L_0x0195
            com.instagram.business.promote.model.PromoteDataSnapshot r4 = r2.A0s
            if (r4 == 0) goto L_0x0195
            java.lang.String r1 = r4.A0A
            java.lang.String r0 = r2.A1I
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0055
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r1 = r4.A04
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r0 = r2.A0a
            if (r1 != r0) goto L_0x0055
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r4.A05
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r2.A0b
            if (r1 != r0) goto L_0x0055
            boolean r1 = r4.A0C
            boolean r0 = r2.A2e
            if (r1 != r0) goto L_0x0055
            java.lang.String r1 = r4.A0B
            java.lang.String r0 = r2.A1Z
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0055
            int r1 = r4.A01
            int r0 = r2.A0A
            if (r1 != r0) goto L_0x0055
            int r1 = r4.A00
            int r0 = r2.A07
            if (r1 != r0) goto L_0x0055
            java.util.List r1 = r4.A0D
            java.util.List r0 = r2.A21
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0055
            com.instagram.business.boost.model.AdCreativeAuthorizationCategory r1 = r4.A08
            com.instagram.business.boost.model.AdCreativeAuthorizationCategory r0 = r2.A0k
            if (r1 != r0) goto L_0x0055
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r4.A06
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r2.A0e
            if (r1 == r0) goto L_0x0195
        L_0x0055:
            X.W1k r9 = r3.A03
            java.lang.String r12 = "ads/promote/update_draft_promotion/"
            int r0 = r12.length()
            r19 = 1
            int r0 = r0 - r19
            java.lang.String r2 = X.C13991Tnr.A0a(r0, r12)
            X.WGU r1 = r3.A05
            r0 = 2
            X.UcZ r8 = new X.UcZ
            r8.<init>(r1, r3, r2, r0)
            com.instagram.business.promote.model.PromoteData r3 = r9.A03
            com.instagram.business.promote.model.PromoteAudience r2 = r3.A07()
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r3.A0i
            com.instagram.api.schemas.XIGIGBoostCallToAction r18 = X.C18677Vwa.A01(r0, r3)
            java.lang.String r1 = r3.A1J
            java.lang.String r0 = "draftId cannot be null while deleting drafts."
            X.17k.A07(r1, r0)
            com.instagram.common.session.UserSession r0 = r3.A0y
            r21 = r0
            java.lang.String r11 = r3.A1J
            java.lang.String r10 = r3.A1A
            com.instagram.api.schemas.XIGIGBoostDestination r4 = r3.A0i
            boolean r1 = r3.A2e
            java.util.ArrayList r17 = X.W3x.A0J(r4, r0, r1)
            com.instagram.business.boost.model.AdCreativeAuthorizationCategory r0 = r3.A0k
            r20 = r0
            com.instagram.api.schemas.XIGIGBoostDestination r13 = r3.A0i
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r7 = r3.A0a
            java.lang.String r6 = r3.A1I
            com.instagram.leadgen.core.api.LeadForm r0 = r3.A16
            r5 = 0
            if (r0 == 0) goto L_0x0192
            java.lang.String r4 = r0.A03
        L_0x00a1:
            int r0 = r3.A07
            if (r0 != 0) goto L_0x018c
            r0 = r5
        L_0x00a6:
            int r1 = r3.A0A
            if (r1 != 0) goto L_0x0186
            r1 = r5
        L_0x00ab:
            com.google.common.collect.ImmutableList r16 = r3.A03()
            if (r2 == 0) goto L_0x0181
            com.instagram.api.schemas.BoostedPostAudienceOption r14 = r2.A03
            if (r14 == 0) goto L_0x0181
            int r15 = r14.ordinal()
            r14 = 17
            if (r15 != r14) goto L_0x017d
            com.instagram.api.schemas.BoostedPostAudienceOption r15 = com.instagram.api.schemas.BoostedPostAudienceOption.IG_PROMOTED_POST_AUTO
        L_0x00bf:
            boolean r2 = X.W3x.A0P(r2)
            if (r2 != 0) goto L_0x00c7
            java.lang.String r5 = r3.A1Z
        L_0x00c7:
            java.lang.String r14 = r3.A09()
            java.util.ArrayList r2 = r3.A0A()
            if (r2 == 0) goto L_0x017a
            java.lang.String r3 = X.Pxf.A0f(r2)
        L_0x00d5:
            X.1NY r2 = X.DbU.A0N(r21)
            r2.A0A(r12)
            java.lang.String r12 = "draft_id"
            r2.A9m(r12, r11)
            java.lang.String r11 = "fb_auth_token"
            r2.A9m(r11, r10)
            java.lang.String r11 = X.C51970G9q.A0k(r17)
            java.lang.String r10 = "additional_publisher_platforms"
            r2.A9m(r10, r11)
            java.lang.String r11 = r20.toString()
            java.lang.String r10 = "authorization_category"
            r2.A9m(r10, r11)
            r10 = 0
            if (r13 != 0) goto L_0x0175
            r12 = r10
        L_0x00fc:
            java.lang.String r11 = "destination"
            r2.A0G(r11, r12)
            if (r7 != 0) goto L_0x0170
            r11 = r10
        L_0x0104:
            java.lang.String r7 = "ctx_welcome_message_status"
            r2.A0G(r7, r11)
            if (r18 != 0) goto L_0x016b
            r11 = r10
        L_0x010c:
            java.lang.String r7 = "call_to_action"
            r2.A0G(r7, r11)
            java.lang.String r7 = "website_url"
            r2.A0G(r7, r6)
            java.lang.String r6 = "lead_gen_form_id"
            r2.A0G(r6, r4)
            r4 = 581(0x245, float:8.14E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            r2.A09(r0, r4)
            java.lang.String r0 = "duration_in_days"
            r2.A09(r1, r0)
            if (r16 != 0) goto L_0x0166
            r1 = r10
        L_0x012c:
            java.lang.String r0 = "regulated_categories"
            r2.A0G(r0, r1)
            if (r15 == 0) goto L_0x0137
            java.lang.String r10 = r15.toString()
        L_0x0137:
            java.lang.String r0 = "audience_code"
            r2.A0G(r0, r10)
            java.lang.String r0 = "audience_id"
            r2.A0G(r0, r5)
            java.lang.Class<X.UXB> r1 = X.UXB.class
            java.lang.Class<X.Vme> r0 = X.C18164Vme.class
            r2.A0R(r1, r0)
            boolean r0 = X.0mp.A0B(r14)
            if (r0 != 0) goto L_0x0153
            java.lang.String r0 = "messaging_destinations"
            r2.A9m(r0, r14)
        L_0x0153:
            boolean r0 = X.0mp.A0B(r3)
            if (r0 != 0) goto L_0x015e
            java.lang.String r0 = "ad_format_preferences"
            r2.A9m(r0, r3)
        L_0x015e:
            X.1OC r0 = r2.A0M()
            X.C18784W1k.A02(r9, r8, r0)
            return r19
        L_0x0166:
            java.lang.String r1 = X.C51970G9q.A0k(r16)
            goto L_0x012c
        L_0x016b:
            java.lang.String r11 = r18.toString()
            goto L_0x010c
        L_0x0170:
            java.lang.String r11 = r7.toString()
            goto L_0x0104
        L_0x0175:
            java.lang.String r12 = r13.toString()
            goto L_0x00fc
        L_0x017a:
            r3 = 0
            goto L_0x00d5
        L_0x017d:
            com.instagram.api.schemas.BoostedPostAudienceOption r15 = com.instagram.api.schemas.BoostedPostAudienceOption.SAVED_AUDIENCE
            goto L_0x00bf
        L_0x0181:
            r15 = r5
            if (r2 == 0) goto L_0x00c7
            goto L_0x00bf
        L_0x0186:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00ab
        L_0x018c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00a6
        L_0x0192:
            r4 = r5
            goto L_0x00a1
        L_0x0195:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15684Ugp.A00():boolean");
    }
}
