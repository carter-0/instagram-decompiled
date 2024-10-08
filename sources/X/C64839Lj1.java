package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lj1  reason: case insensitive filesystem */
public abstract class C64839Lj1 implements 0lm {
    public static final C63900LBg A0F = new Object();
    public AnonymousClass818 A00;
    public C331157Pu A01;
    public C363548ju A02;
    public C363008it A03;
    public C49887FBn A04;
    public MUE A05;
    public C66461MSp A06;
    public C66462MSq A07;
    public LBI A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final UserSession A0E;

    public C64839Lj1(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A0E = userSession;
    }

    public final Bundle A01() {
        Bundle bundle;
        String str;
        String str2;
        String str3;
        0xa A0q;
        String str4;
        int i;
        int i2;
        if (this instanceof KYZ) {
            KYZ kyz = (KYZ) this;
            UserSession userSession = kyz.A0E;
            boolean A002 = C363018iu.A00(userSession);
            boolean A003 = C363558jv.A00(userSession);
            AnonymousClass818 r8 = kyz.A00;
            if (r8 != null) {
                AnonymousClass819 r7 = kyz.A00;
                if (r7 == null) {
                    str3 = "upsellVariant";
                } else {
                    int A072 = kyz.A07();
                    C49887FBn fBn = kyz.A04;
                    if (fBn != null) {
                        i2 = fBn.A00;
                    } else {
                        i2 = 0;
                    }
                    boolean z = kyz.A0C;
                    String str5 = kyz.A09;
                    str = "";
                    if (str5 == null) {
                        str5 = str;
                    }
                    String str6 = kyz.A0A;
                    if (str6 != null) {
                        str = str6;
                    }
                    bundle = AnonymousClass7TE.A0a();
                    bundle.putBoolean("args_is_story_enabled", A002);
                    bundle.putBoolean("args_is_post_enabled", A003);
                    A00(bundle, r8, r7, A072);
                    bundle.putInt("arg_nux_attempt_qpl_instance_key", i2);
                    bundle.putBoolean("args_is_after_fbc", z);
                    bundle.putString("args_media_id", str5);
                    str2 = "args_waterfall_id";
                    bundle.putString(str2, str);
                    return bundle;
                }
            }
            str3 = "entrypoint";
        } else {
            C62052KYa kYa = (C62052KYa) this;
            AnonymousClass818 r9 = kYa.A00;
            if (r9 != null) {
                int ordinal = kYa.A00.ordinal();
                if (ordinal == 29) {
                    A0q = AnonymousClass7TE.A0q(kYa.A0E);
                    str4 = "reels_ccp_user_migration_feed_upsell_display_count";
                } else if (ordinal == 34) {
                    A0q = AnonymousClass7TE.A0q(kYa.A0E);
                    str4 = "story_reels_ccp_user_migration_feed_upsell_display_count";
                } else if (ordinal != 30) {
                    A0q = 1Au.A00(kYa.A0E).A01;
                    if (ordinal != 15) {
                        str4 = "xpost_unified_onboarding_upsell_display_count";
                    } else {
                        str4 = "feed_reels_ccp_user_migration_story_upsell_display_count";
                    }
                } else {
                    A0q = AnonymousClass7TE.A0q(kYa.A0E);
                    str4 = "reels_ccp_user_migration_story_upsell_display_count";
                }
                int A004 = DbT.A00(A0q, str4);
                boolean z2 = kYa.A0C;
                C49887FBn fBn2 = kYa.A04;
                if (fBn2 != null) {
                    i = fBn2.A00;
                } else {
                    i = 0;
                }
                AnonymousClass819 r4 = kYa.A00;
                String str7 = kYa.A09;
                String str8 = "";
                if (str7 == null) {
                    str7 = str8;
                }
                String str9 = kYa.A0A;
                if (str9 != null) {
                    str8 = str9;
                }
                LBI lbi = kYa.A08;
                AnonymousClass7TG.A1R(r4, str7);
                bundle = AnonymousClass7TE.A0a();
                A00(bundle, r9, r4, A004);
                bundle.putBoolean("args_is_after_fbc", z2);
                bundle.putInt("arg_nux_attempt_qpl_instance_key", i);
                bundle.putString("args_media_id", str7);
                bundle.putString("args_waterfall_id", str8);
                if (lbi != null) {
                    bundle.putString("args_title", lbi.A0B);
                    bundle.putString("args_body_icon_name_1", lbi.A00);
                    bundle.putString("args_body_icon_variant_1", lbi.A03);
                    bundle.putString("args_body_markdown_text_1", lbi.A06);
                    bundle.putString("args_body_icon_name_2", lbi.A01);
                    bundle.putString("args_body_icon_variant_2", lbi.A04);
                    bundle.putString("args_body_markdown_text_2", lbi.A07);
                    bundle.putString("args_body_icon_name_3", lbi.A02);
                    bundle.putString("args_body_icon_variant_3", lbi.A05);
                    bundle.putString("args_body_markdown_text_3", lbi.A08);
                    bundle.putString("args_primary_button_text", lbi.A09);
                    str = lbi.A0A;
                    str2 = "args_secondary_button_text";
                    bundle.putString(str2, str);
                }
                return bundle;
            }
            str3 = "entrypoint";
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A02() {
        UserSession userSession = this.A0E;
        if (!AnonymousClass8PU.A04(userSession) || (C363558jv.A00(userSession) && C363018iu.A00(userSession))) {
            C363558jv r1 = C363548ju.A03;
            if (!C363558jv.A00(userSession)) {
                r1.A01(userSession, (Integer) null, "upsell", true, true);
                C363548ju r12 = this.A02;
                if (r12 == null) {
                    r12 = LJr.A00(userSession);
                    this.A02 = r12;
                }
                0qQ.A0C(r12, "null cannot be cast to non-null type com.instagram.share.facebook.FeedShareToFBController");
                r12.A01(userSession, "upsell", true);
            }
            C363018iu r13 = C363008it.A05;
            if (!C363018iu.A00(userSession)) {
                r13.A01(userSession, (Integer) null, "upsell", true, true);
                C363008it r14 = this.A03;
                if (r14 == null) {
                    r14 = LJr.A01(userSession, (C358118aO) null);
                    this.A03 = r14;
                }
                0qQ.A0C(r14, "null cannot be cast to non-null type com.instagram.share.facebook.StoryShareToFBController");
                r14.A05(true, "upsell");
                return;
            }
            return;
        }
        new C64369Lal(userSession).A01(0sr.A1P(new C39876ACx[]{new C39876ACx("FEED", true), new C39876ACx("STORY", true)}), C66276MLl.A00, C66277MLm.A00);
    }

    public final void A03() {
        C363558jv r1 = C363548ju.A03;
        UserSession userSession = this.A0E;
        if (!C363558jv.A00(userSession)) {
            r1.A01(userSession, (Integer) null, "upsell", true, true);
            C363548ju r12 = this.A02;
            if (r12 == null) {
                r12 = LJr.A00(userSession);
                this.A02 = r12;
            }
            0qQ.A0C(r12, "null cannot be cast to non-null type com.instagram.share.facebook.FeedShareToFBController");
            r12.A01(userSession, "upsell", true);
        }
    }

    public final void A04() {
        C363018iu r1 = C363008it.A05;
        UserSession userSession = this.A0E;
        if (!C363018iu.A00(userSession)) {
            r1.A01(userSession, (Integer) null, "upsell", true, true);
            C363008it r12 = this.A03;
            if (r12 == null) {
                r12 = LJr.A01(userSession, (C358118aO) null);
                this.A03 = r12;
            }
            0qQ.A0C(r12, "null cannot be cast to non-null type com.instagram.share.facebook.StoryShareToFBController");
            r12.A05(true, "upsell");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.KYa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.KYZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.KYa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.KYa} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r1 == null) goto L_0x0081;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(android.app.Activity r9) {
        /*
            r8 = this;
            boolean r0 = r8.A0D
            if (r0 == 0) goto L_0x0016
            X.FBn r1 = r8.A04
            if (r1 == 0) goto L_0x000d
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A03(r0)
        L_0x000d:
            X.Lyt r0 = new X.Lyt
            r0.<init>(r8)
            r0.Cyc()
        L_0x0015:
            return
        L_0x0016:
            r4 = 1
            r8.A0D = r4
            X.37D r0 = X.DbT.A0i(r9)
            if (r0 == 0) goto L_0x01ad
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != r4) goto L_0x01ad
            X.FBn r0 = r8.A04
            if (r0 == 0) goto L_0x0035
            X.02m r3 = r0.A01
            int r2 = r0.A00
            r1 = 383649364(0x16de0654, float:3.5870028E-25)
            java.lang.String r0 = "is_modal"
            r3.markerAnnotate(r1, r2, r0, r4)
        L_0x0035:
            android.os.Bundle r2 = r8.A01()
            r0 = 4
            java.lang.String r1 = X.C66579MXk.A00(r0)
            r0 = 1249(0x4e1, float:1.75E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r1, r0)
            com.instagram.common.session.UserSession r0 = r8.A0E
            X.JTU.A0e(r9, r2, r0)
        L_0x004c:
            r5 = r8
            boolean r0 = r8 instanceof X.KYZ
            if (r0 == 0) goto L_0x00a8
            X.KYZ r5 = (X.KYZ) r5
            com.instagram.common.session.UserSession r4 = r5.A0E
            X.1Av r2 = X.1Au.A00(r4)
            X.819 r1 = r5.A00
            java.lang.String r3 = "upsellVariant"
            if (r1 == 0) goto L_0x0081
            X.819 r0 = X.AnonymousClass819.BOTTOMSHEET_MIGRATION_STORIES_WAVE2
            if (r1 != r0) goto L_0x0089
            boolean r0 = r5.A06()
            if (r0 != 0) goto L_0x0076
            X.0xa r1 = r2.A01
            java.lang.String r0 = "story_xpost_user_migration_upsell_second_wave_display_count"
            int r0 = X.DbT.A00(r1, r0)
            int r0 = r0 + 1
            r2.A0Z(r0)
        L_0x0076:
            long r0 = X.JTR.A0L()
            r2.A0k(r0)
        L_0x007d:
            X.819 r1 = r5.A00
            if (r1 != 0) goto L_0x012a
        L_0x0081:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0089:
            X.819 r0 = X.AnonymousClass819.BOTTOMSHEET_MIGRATION_FEED_WAVE2
            if (r1 != r0) goto L_0x007d
            boolean r0 = r5.A06()
            if (r0 != 0) goto L_0x00a0
            X.0xa r1 = r2.A01
            java.lang.String r0 = "feed_xpost_user_migration_upsell_second_wave_display_count"
            int r0 = X.DbT.A00(r1, r0)
            int r0 = r0 + 1
            r2.A0X(r0)
        L_0x00a0:
            long r0 = X.JTR.A0L()
            r2.A0h(r0)
            goto L_0x007d
        L_0x00a8:
            X.KYa r5 = (X.C62052KYa) r5
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x0015
            com.instagram.common.session.UserSession r4 = r5.A0E
            X.1Av r3 = X.1Au.A00(r4)
            X.819 r0 = r5.A00
            int r1 = r0.ordinal()
            r0 = 29
            if (r1 == r0) goto L_0x018f
            r0 = 34
            if (r1 == r0) goto L_0x0176
            r0 = 30
            if (r1 == r0) goto L_0x015d
            r0 = 15
            if (r1 == r0) goto L_0x0144
            X.818 r1 = r5.A00
            if (r1 == 0) goto L_0x01a9
            X.818 r0 = X.AnonymousClass818.IG_AFTER_FEED_SHARE
            if (r1 == r0) goto L_0x0015
            X.818 r0 = X.AnonymousClass818.IG_AFTER_STORY_SHARE
            if (r1 == r0) goto L_0x0015
            boolean r0 = r5.A06()
            r7 = 33
            r6 = 14
            if (r0 != 0) goto L_0x00fd
            X.0xa r2 = r3.A01
            java.lang.String r0 = "xpost_unified_onboarding_upsell_display_count"
            r1 = 0
            int r0 = r2.getInt(r0, r1)
            int r0 = r0 + 1
            r3.A0a(r0)
            X.819 r0 = r5.A00
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x0141
            if (r0 != r7) goto L_0x00fd
            java.lang.String r0 = "xpost_bottomsheet_story_upsell_display_count"
        L_0x00fa:
            X.JTS.A1S(r2, r0, r1)
        L_0x00fd:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r2.toSeconds(r0)
            r3.A0m(r0)
            X.819 r0 = r5.A00
            int r0 = r0.ordinal()
            if (r0 == r6) goto L_0x0132
            if (r0 != r7) goto L_0x0128
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r2.toSeconds(r0)
            X.0xY r3 = X.AnonymousClass7TE.A0p(r3)
            java.lang.String r2 = "xpost_bottomsheet_story_upsell_last_seen_sec"
        L_0x0122:
            r3.E5c(r2, r0)
            r3.apply()
        L_0x0128:
            X.819 r1 = r5.A00
        L_0x012a:
            X.818 r0 = r5.A00
            if (r0 == 0) goto L_0x01a9
            X.C367998ru.A01(r0, r1, r4)
            return
        L_0x0132:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r2.toSeconds(r0)
            X.0xY r3 = X.AnonymousClass7TE.A0p(r3)
            java.lang.String r2 = "xpost_bottomsheet_feed_upsell_last_seen_sec"
            goto L_0x0122
        L_0x0141:
            java.lang.String r0 = "xpost_bottomsheet_feed_upsell_display_count"
            goto L_0x00fa
        L_0x0144:
            boolean r0 = r5.A06()
            if (r0 != 0) goto L_0x0152
            X.0xa r2 = r3.A01
            java.lang.String r1 = "feed_reels_ccp_user_migration_story_upsell_display_count"
            r0 = 0
            X.JTS.A1S(r2, r1, r0)
        L_0x0152:
            long r0 = X.JTR.A0L()
            X.0xY r3 = X.AnonymousClass7TE.A0p(r3)
            java.lang.String r2 = "feed_reels_ccp_user_migration_story_upsell_last_seen_sec"
            goto L_0x0122
        L_0x015d:
            boolean r0 = r5.A06()
            if (r0 != 0) goto L_0x016b
            X.0xa r2 = r3.A01
            java.lang.String r1 = "reels_ccp_user_migration_story_upsell_display_count"
            r0 = 0
            X.JTS.A1S(r2, r1, r0)
        L_0x016b:
            long r0 = X.JTR.A0L()
            X.0xY r3 = X.AnonymousClass7TE.A0p(r3)
            java.lang.String r2 = "reels_ccp_user_migration_story_upsell_last_seen_sec"
            goto L_0x0122
        L_0x0176:
            boolean r0 = r5.A06()
            if (r0 != 0) goto L_0x0184
            X.0xa r2 = r3.A01
            java.lang.String r1 = "story_reels_ccp_user_migration_feed_upsell_display_count"
            r0 = 0
            X.JTS.A1S(r2, r1, r0)
        L_0x0184:
            long r0 = X.JTR.A0L()
            X.0xY r3 = X.AnonymousClass7TE.A0p(r3)
            java.lang.String r2 = "story_reels_ccp_user_migration_feed_upsell_last_seen_sec"
            goto L_0x0122
        L_0x018f:
            boolean r0 = r5.A06()
            if (r0 != 0) goto L_0x019d
            X.0xa r2 = r3.A01
            java.lang.String r1 = "reels_ccp_user_migration_feed_upsell_display_count"
            r0 = 0
            X.JTS.A1S(r2, r1, r0)
        L_0x019d:
            long r0 = X.JTR.A0L()
            X.0xY r3 = X.AnonymousClass7TE.A0p(r3)
            java.lang.String r2 = "reels_ccp_user_migration_feed_upsell_last_seen_sec"
            goto L_0x0122
        L_0x01a9:
            java.lang.String r3 = "entrypoint"
            goto L_0x0081
        L_0x01ad:
            X.FBn r0 = r8.A04
            if (r0 == 0) goto L_0x01be
            r4 = 0
            X.02m r3 = r0.A01
            int r2 = r0.A00
            r1 = 383649364(0x16de0654, float:3.5870028E-25)
            java.lang.String r0 = "is_modal"
            r3.markerAnnotate(r1, r2, r0, r4)
        L_0x01be:
            android.os.Handler r1 = X.AnonymousClass7TF.A0D()
            X.M7y r0 = new X.M7y
            r0.<init>(r9, r8)
            r1.post(r0)
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64839Lj1.A05(android.app.Activity):void");
    }

    public final boolean A06() {
        AnonymousClass818 r2 = this.A00;
        if (r2 == null) {
            0qQ.A0F("entrypoint");
            throw AnonymousClass00P.createAndThrow();
        } else if (r2 == AnonymousClass818.IG_SELF_STORY_VIEW_FB_BUTTON || r2 == AnonymousClass818.IG_SELF_STORY_VIEW_FB_BUTTON_POST_ACCOUNT_LINK) {
            return true;
        } else {
            return false;
        }
    }

    public static void A00(BaseBundle baseBundle, Object obj, Object obj2, int i) {
        baseBundle.putString("args_entrypoint", obj.toString());
        baseBundle.putString("args_upsell_variant", obj2.toString());
        baseBundle.putInt("args_num_of_views", i);
    }
}
