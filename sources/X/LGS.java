package X;

import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.List;

public abstract class LGS {
    public AnonymousClass819 A01() {
        if (this instanceof KZY) {
            return AnonymousClass819.BOTTOMSHEET_UNLINKED_USER_STORY;
        }
        if (this instanceof KZX) {
            return AnonymousClass819.BOTTOMSHEET_UNIFIED_STORIES_FEED;
        }
        if (this instanceof KZW) {
            return AnonymousClass819.BOTTOMSHEET_STORY_REEL_CCP_MIGRATION_FEED;
        }
        if (this instanceof KZV) {
            return AnonymousClass819.BOTTOMSHEET_STORY;
        }
        if (this instanceof KZU) {
            return AnonymousClass819.BOTTOMSHEET_FEED;
        }
        if (this instanceof KZT) {
            return AnonymousClass819.BOTTOMSHEET_REEL_CCP_MIGRATION_STORY;
        }
        if (this instanceof KZS) {
            return AnonymousClass819.BOTTOMSHEET_REEL_CCP_MIGRATION_FEED;
        }
        if (this instanceof KZZ) {
            return ((KZZ) this).A00;
        }
        if (this instanceof KZR) {
            return AnonymousClass819.BOTTOMSHEET_MIGRATION_STORIES_WAVE2;
        }
        if (this instanceof KZQ) {
            return AnonymousClass819.BOTTOMSHEET_MIGRATION_FEED_WAVE2;
        }
        if (this instanceof KZP) {
            return AnonymousClass819.BOTTOMSHEET_FEED_REEL_CCP_MIGRATION_STORY;
        }
        if (this instanceof KZO) {
            return AnonymousClass819.DIALOG_STORY;
        }
        if (this instanceof KZN) {
            return AnonymousClass819.DIALOG_FEED;
        }
        if (this instanceof C62070KZa) {
            return ((C62070KZa) this).A00;
        }
        if (this instanceof KZM) {
            return AnonymousClass819.BOTTOMSHEET_FEED_THREADS_CONFIRMATION;
        }
        return AnonymousClass819.BOTTOMSHEET_FEED_THREADS;
    }

    public AnonymousClass9I7 A02(AnonymousClass818 r6, UserSession userSession, CXPNoticeStateRepository cXPNoticeStateRepository) {
        if (this instanceof KZY) {
            0qQ.A0B(cXPNoticeStateRepository, 2);
            return A00(cXPNoticeStateRepository, "BOTTOMSHEET_UNLINKED_USER_STORY");
        } else if (this instanceof KZX) {
            DbY.A1S(userSession, cXPNoticeStateRepository);
            AnonymousClass9I7 A00 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_UNIFIED_STORIES_FEED");
            0xa A0q = AnonymousClass7TE.A0q(userSession);
            return A00.A00(DbT.A00(A0q, "xpost_unified_onboarding_upsell_display_count"), (int) DbW.A06(A0q, "xpost_unified_onboarding_upsell_last_seen_sec"));
        } else if (this instanceof KZW) {
            DbY.A1S(userSession, cXPNoticeStateRepository);
            AnonymousClass9I7 A002 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_STORY_REEL_CCP_MIGRATION_FEED");
            0xa A0q2 = AnonymousClass7TE.A0q(userSession);
            return A002.A00(DbT.A00(A0q2, "story_reels_ccp_user_migration_feed_upsell_display_count"), (int) DbW.A06(A0q2, "story_reels_ccp_user_migration_feed_upsell_last_seen_sec"));
        } else if (this instanceof KZV) {
            DbY.A1S(userSession, cXPNoticeStateRepository);
            AnonymousClass9I7 A003 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_STORY");
            0xa A0q3 = AnonymousClass7TE.A0q(userSession);
            return A003.A00(DbT.A00(A0q3, "xpost_unified_onboarding_upsell_display_count"), (int) DbW.A06(A0q3, "xpost_unified_onboarding_upsell_last_seen_sec"));
        } else if (this instanceof KZU) {
            DbY.A1S(userSession, cXPNoticeStateRepository);
            AnonymousClass9I7 A004 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_FEED");
            0xa A0q4 = AnonymousClass7TE.A0q(userSession);
            return A004.A00(DbT.A00(A0q4, "xpost_unified_onboarding_upsell_display_count"), (int) DbW.A06(A0q4, "xpost_unified_onboarding_upsell_last_seen_sec"));
        } else if (this instanceof KZT) {
            DbY.A1S(userSession, cXPNoticeStateRepository);
            AnonymousClass9I7 A005 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_REEL_CCP_MIGRATION_STORY");
            0xa A0q5 = AnonymousClass7TE.A0q(userSession);
            return A005.A00(DbT.A00(A0q5, "reels_ccp_user_migration_story_upsell_display_count"), (int) DbW.A06(A0q5, "reels_ccp_user_migration_story_upsell_last_seen_sec"));
        } else if (this instanceof KZS) {
            DbY.A1S(userSession, cXPNoticeStateRepository);
            AnonymousClass9I7 A006 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_REEL_CCP_MIGRATION_FEED");
            0xa A0q6 = AnonymousClass7TE.A0q(userSession);
            return A006.A00(DbT.A00(A0q6, "reels_ccp_user_migration_feed_upsell_display_count"), (int) DbW.A06(A0q6, "reels_ccp_user_migration_feed_upsell_last_seen_sec"));
        } else if (this instanceof KZZ) {
            0qQ.A0B(cXPNoticeStateRepository, 2);
            return A00(cXPNoticeStateRepository, "BOTTOMSHEET_CCP_REELS_AGGREGATED_FEEDBACK_DISCLOSURE");
        } else if (this instanceof KZR) {
            DbY.A1S(userSession, cXPNoticeStateRepository);
            AnonymousClass9I7 A007 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_MIGRATION_STORIES_WAVE2");
            0xa A0q7 = AnonymousClass7TE.A0q(userSession);
            return A007.A00(DbT.A00(A0q7, "story_xpost_user_migration_upsell_second_wave_display_count"), (int) DbW.A06(A0q7, "story_xpost_user_migration_upsell_second_wave_last_seen_sec"));
        } else if (this instanceof KZQ) {
            DbY.A1S(userSession, cXPNoticeStateRepository);
            AnonymousClass9I7 A008 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_MIGRATION_FEED_WAVE2");
            0xa A0q8 = AnonymousClass7TE.A0q(userSession);
            return A008.A00(DbT.A00(A0q8, "feed_xpost_user_migration_upsell_second_wave_display_count"), (int) DbW.A06(A0q8, "feed_xpost_user_migration_upsell_second_wave_last_seen_sec"));
        } else if (this instanceof KZP) {
            DbY.A1S(userSession, cXPNoticeStateRepository);
            AnonymousClass9I7 A009 = A00(cXPNoticeStateRepository, "BOTTOMSHEET_FEED_REEL_CCP_MIGRATION_STORY");
            0xa A0q9 = AnonymousClass7TE.A0q(userSession);
            return A009.A00(DbT.A00(A0q9, "feed_reels_ccp_user_migration_story_upsell_display_count"), (int) DbW.A06(A0q9, "feed_reels_ccp_user_migration_story_upsell_last_seen_sec"));
        } else if (this instanceof KZO) {
            DbY.A1S(userSession, cXPNoticeStateRepository);
            return A00(cXPNoticeStateRepository, "DIALOG_STORY").A00(DbT.A00(AnonymousClass7TE.A0q(userSession), "direct_sharesheet_auto_share_to_fb_dialog_display_count"), (int) DbW.A06(AnonymousClass7TE.A0q(userSession), "last_seen_direct_sharesheet_auto_share_to_fb_dialog_sec"));
        } else if (this instanceof KZN) {
            DbY.A1S(userSession, cXPNoticeStateRepository);
            return A00(cXPNoticeStateRepository, "DIALOG_FEED").A00(AnonymousClass7TE.A0q(userSession).getInt("feed_fb_autoshare_upsell_dialog_display_count", 0), (int) DbW.A06(AnonymousClass7TE.A0q(userSession), "feed_fb_autoshare_upsell_dialog_last_seen_sec"));
        } else if (this instanceof C62070KZa) {
            0qQ.A0B(cXPNoticeStateRepository, 2);
            return A00(cXPNoticeStateRepository, ((C62070KZa) this).A01);
        } else if (this instanceof KZM) {
            0qQ.A0B(cXPNoticeStateRepository, 2);
            return A00(cXPNoticeStateRepository, "BOTTOMSHEET_FEED_THREADS_CONFIRMATION");
        } else {
            0qQ.A0B(cXPNoticeStateRepository, 2);
            return A00(cXPNoticeStateRepository, "BOTTOMSHEET_FEED_THREADS");
        }
    }

    public String A03() {
        if (this instanceof KZY) {
            return "BOTTOMSHEET_UNLINKED_USER_STORY";
        }
        if (this instanceof KZX) {
            return "BOTTOMSHEET_UNIFIED_STORIES_FEED";
        }
        if (this instanceof KZW) {
            return "BOTTOMSHEET_STORY_REEL_CCP_MIGRATION_FEED";
        }
        if (this instanceof KZV) {
            return "BOTTOMSHEET_STORY";
        }
        if (this instanceof KZU) {
            return "BOTTOMSHEET_FEED";
        }
        if (this instanceof KZT) {
            return "BOTTOMSHEET_REEL_CCP_MIGRATION_STORY";
        }
        if (this instanceof KZS) {
            return "BOTTOMSHEET_REEL_CCP_MIGRATION_FEED";
        }
        if (this instanceof KZZ) {
            return "BOTTOMSHEET_CCP_REELS_AGGREGATED_FEEDBACK_DISCLOSURE";
        }
        if (this instanceof KZR) {
            return "BOTTOMSHEET_MIGRATION_STORIES_WAVE2";
        }
        if (this instanceof KZQ) {
            return "BOTTOMSHEET_MIGRATION_FEED_WAVE2";
        }
        if (this instanceof KZP) {
            return "BOTTOMSHEET_FEED_REEL_CCP_MIGRATION_STORY";
        }
        if (this instanceof KZO) {
            return "DIALOG_STORY";
        }
        if (this instanceof KZN) {
            return "DIALOG_FEED";
        }
        if (this instanceof C62070KZa) {
            return ((C62070KZa) this).A01;
        }
        if (this instanceof KZM) {
            return "BOTTOMSHEET_FEED_THREADS_CONFIRMATION";
        }
        return "BOTTOMSHEET_FEED_THREADS";
    }

    public List A04() {
        if (this instanceof KZY) {
            return ((KZY) this).A00;
        }
        if (this instanceof KZX) {
            return ((KZX) this).A00;
        }
        if (this instanceof KZW) {
            return ((KZW) this).A00;
        }
        if (this instanceof KZV) {
            return ((KZV) this).A00;
        }
        if (this instanceof KZU) {
            return ((KZU) this).A00;
        }
        if (this instanceof KZT) {
            return ((KZT) this).A00;
        }
        if (this instanceof KZS) {
            return ((KZS) this).A00;
        }
        if (this instanceof KZZ) {
            return ((KZZ) this).A01;
        }
        if (this instanceof KZR) {
            return ((KZR) this).A00;
        }
        if (this instanceof KZQ) {
            return ((KZQ) this).A00;
        }
        if (this instanceof KZP) {
            return ((KZP) this).A00;
        }
        if (this instanceof KZO) {
            return ((KZO) this).A00;
        }
        if (this instanceof KZN) {
            return ((KZN) this).A00;
        }
        if (this instanceof C62070KZa) {
            return ((C62070KZa) this).A02;
        }
        if (this instanceof KZM) {
            return ((KZM) this).A00;
        }
        return ((KZL) this).A00;
    }

    /* JADX WARNING: type inference failed for: r9v16, types: [X.MSq] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(X.LBK r15) {
        /*
            r14 = this;
            boolean r0 = r14 instanceof X.KZY
            if (r0 == 0) goto L_0x0091
            android.content.Context r3 = r15.A01
            if (r3 == 0) goto L_0x008f
            com.instagram.common.session.UserSession r2 = r15.A05
            r0 = 22
            X.Phb r1 = new X.Phb
            r1.<init>(r2, r0)
            java.lang.Class<X.M1N> r0 = X.M1N.class
            java.lang.Object r4 = r2.A01(r0, r1)
            X.M1N r4 = (X.M1N) r4
            X.LBI r5 = r15.A0A
            r0 = 0
            if (r5 == 0) goto L_0x0020
            java.lang.String r0 = r5.A0B
        L_0x0020:
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0025
            r0 = r1
        L_0x0025:
            r4.A07 = r0
            if (r5 == 0) goto L_0x002d
            java.lang.String r0 = r5.A00
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r0 = r1
        L_0x002e:
            r4.A01 = r0
            if (r5 == 0) goto L_0x0036
            java.lang.String r0 = r5.A03
            if (r0 != 0) goto L_0x0037
        L_0x0036:
            r0 = r1
        L_0x0037:
            r4.A03 = r0
            if (r5 == 0) goto L_0x003f
            java.lang.String r0 = r5.A06
            if (r0 != 0) goto L_0x0040
        L_0x003f:
            r0 = r1
        L_0x0040:
            r4.A05 = r0
            if (r5 == 0) goto L_0x0048
            java.lang.String r0 = r5.A01
            if (r0 != 0) goto L_0x0049
        L_0x0048:
            r0 = r1
        L_0x0049:
            r4.A02 = r0
            if (r5 == 0) goto L_0x0051
            java.lang.String r0 = r5.A04
            if (r0 != 0) goto L_0x0052
        L_0x0051:
            r0 = r1
        L_0x0052:
            r4.A04 = r0
            if (r5 == 0) goto L_0x005a
            java.lang.String r0 = r5.A07
            if (r0 != 0) goto L_0x005b
        L_0x005a:
            r0 = r1
        L_0x005b:
            r4.A06 = r0
            if (r5 == 0) goto L_0x0063
            java.lang.String r0 = r5.A09
            if (r0 != 0) goto L_0x0064
        L_0x0063:
            r0 = r1
        L_0x0064:
            r4.A08 = r0
            if (r5 == 0) goto L_0x006d
            java.lang.String r0 = r5.A0A
            if (r0 == 0) goto L_0x006d
            r1 = r0
        L_0x006d:
            r4.A09 = r1
            com.instagram.common.typedurl.ImageUrl r0 = r15.A06
            r4.A00 = r0
            X.6nu r1 = X.C317816nt.A00(r2)
            java.util.List r0 = r15.A0D
            r1.A00 = r0
            r0 = 1
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r3, r0)
            java.lang.String r0 = "IG_FB_STORY_CROSS_POSTING_AFTER_SHARE_UPSELL"
            X.KRs r2 = X.C63267KuC.A00(r3, r2, r0)
            r1 = 0
            android.app.Activity r0 = r15.A00
            r2.showUpsell(r1, r0)
        L_0x008f:
            r11 = 1
        L_0x0090:
            return r11
        L_0x0091:
            boolean r0 = r14 instanceof X.KZX
            if (r0 == 0) goto L_0x00b7
            X.MSp r7 = r15.A08
            if (r7 != 0) goto L_0x009b
            X.LxZ r7 = X.C65658LxZ.A00
        L_0x009b:
            X.LRS r1 = X.C62052KYa.A03
            android.app.Activity r2 = r15.A00
            androidx.fragment.app.Fragment r3 = r15.A02
            com.instagram.common.session.UserSession r6 = r15.A05
            X.818 r4 = r15.A03
            java.lang.String r8 = r15.A0B
            java.lang.String r9 = ""
            if (r8 != 0) goto L_0x00ac
            r8 = r9
        L_0x00ac:
            java.lang.String r0 = r15.A0C
            if (r0 == 0) goto L_0x00b1
            r9 = r0
        L_0x00b1:
            X.819 r5 = X.AnonymousClass819.BOTTOMSHEET_UNIFIED_STORIES_FEED
        L_0x00b3:
            r1.A03(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x008f
        L_0x00b7:
            boolean r0 = r14 instanceof X.KZW
            if (r0 == 0) goto L_0x00da
            X.MSp r7 = r15.A08
            if (r7 != 0) goto L_0x00c1
            X.LxY r7 = X.C65657LxY.A00
        L_0x00c1:
            X.LRS r1 = X.C62052KYa.A03
            android.app.Activity r2 = r15.A00
            androidx.fragment.app.Fragment r3 = r15.A02
            com.instagram.common.session.UserSession r6 = r15.A05
            X.818 r4 = r15.A03
            java.lang.String r8 = r15.A0B
            java.lang.String r9 = ""
            if (r8 != 0) goto L_0x00d2
            r8 = r9
        L_0x00d2:
            java.lang.String r0 = r15.A0C
            if (r0 == 0) goto L_0x00d7
            r9 = r0
        L_0x00d7:
            X.819 r5 = X.AnonymousClass819.BOTTOMSHEET_STORY_REEL_CCP_MIGRATION_FEED
            goto L_0x00b3
        L_0x00da:
            boolean r0 = r14 instanceof X.KZV
            if (r0 == 0) goto L_0x0105
            r13 = 0
            X.MSp r8 = r15.A08
            if (r8 != 0) goto L_0x00e5
            X.LxX r8 = X.C65656LxX.A00
        L_0x00e5:
            X.LRS r1 = X.C62052KYa.A03
            android.app.Activity r2 = r15.A00
            androidx.fragment.app.Fragment r3 = r15.A02
            com.instagram.common.session.UserSession r6 = r15.A05
            X.818 r4 = r15.A03
            java.lang.String r11 = r15.A0B
            java.lang.String r12 = ""
            if (r11 != 0) goto L_0x00f6
            r11 = r12
        L_0x00f6:
            java.lang.String r0 = r15.A0C
            if (r0 == 0) goto L_0x00fb
            r12 = r0
        L_0x00fb:
            r7 = 0
            X.819 r5 = X.AnonymousClass819.BOTTOMSHEET_STORY
        L_0x00fe:
            X.LBI r10 = r15.A0A
            r9 = r7
            r1.A02(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x008f
        L_0x0105:
            boolean r0 = r14 instanceof X.KZU
            if (r0 == 0) goto L_0x012a
            r13 = 0
            X.MSp r8 = r15.A08
            if (r8 != 0) goto L_0x0110
            X.LxW r8 = X.C65655LxW.A00
        L_0x0110:
            X.LRS r1 = X.C62052KYa.A03
            android.app.Activity r2 = r15.A00
            androidx.fragment.app.Fragment r3 = r15.A02
            com.instagram.common.session.UserSession r6 = r15.A05
            X.818 r4 = r15.A03
            java.lang.String r11 = r15.A0B
            java.lang.String r12 = ""
            if (r11 != 0) goto L_0x0121
            r11 = r12
        L_0x0121:
            java.lang.String r0 = r15.A0C
            if (r0 == 0) goto L_0x0126
            r12 = r0
        L_0x0126:
            r7 = 0
            X.819 r5 = X.AnonymousClass819.BOTTOMSHEET_FEED
            goto L_0x00fe
        L_0x012a:
            boolean r0 = r14 instanceof X.KZT
            if (r0 == 0) goto L_0x014e
            X.MSp r7 = r15.A08
            if (r7 != 0) goto L_0x0134
            X.LxV r7 = X.C65654LxV.A00
        L_0x0134:
            X.LRS r1 = X.C62052KYa.A03
            android.app.Activity r2 = r15.A00
            androidx.fragment.app.Fragment r3 = r15.A02
            com.instagram.common.session.UserSession r6 = r15.A05
            X.818 r4 = r15.A03
            java.lang.String r8 = r15.A0B
            java.lang.String r9 = ""
            if (r8 != 0) goto L_0x0145
            r8 = r9
        L_0x0145:
            java.lang.String r0 = r15.A0C
            if (r0 == 0) goto L_0x014a
            r9 = r0
        L_0x014a:
            X.819 r5 = X.AnonymousClass819.BOTTOMSHEET_REEL_CCP_MIGRATION_STORY
            goto L_0x00b3
        L_0x014e:
            boolean r0 = r14 instanceof X.KZS
            if (r0 == 0) goto L_0x0172
            X.MSp r7 = r15.A08
            if (r7 != 0) goto L_0x0158
            X.LxU r7 = X.C65653LxU.A00
        L_0x0158:
            X.LRS r1 = X.C62052KYa.A03
            android.app.Activity r2 = r15.A00
            androidx.fragment.app.Fragment r3 = r15.A02
            com.instagram.common.session.UserSession r6 = r15.A05
            X.818 r4 = r15.A03
            java.lang.String r8 = r15.A0B
            java.lang.String r9 = ""
            if (r8 != 0) goto L_0x0169
            r8 = r9
        L_0x0169:
            java.lang.String r0 = r15.A0C
            if (r0 == 0) goto L_0x016e
            r9 = r0
        L_0x016e:
            X.819 r5 = X.AnonymousClass819.BOTTOMSHEET_REEL_CCP_MIGRATION_FEED
            goto L_0x00b3
        L_0x0172:
            boolean r0 = r14 instanceof X.KZZ
            if (r0 == 0) goto L_0x01da
            r11 = 0
            com.instagram.common.session.UserSession r10 = r15.A05
            android.app.Activity r7 = r15.A00
            r0 = 1
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r7, r0)
            X.818 r0 = r15.A03
            java.lang.String r2 = X.C368298sO.A00(r0)
            if (r2 == 0) goto L_0x0090
            X.0iw r0 = r15.A04
            if (r0 == 0) goto L_0x0195
            java.lang.String r9 = r0.getModuleName()
            if (r9 != 0) goto L_0x0197
        L_0x0195:
            java.lang.String r9 = ""
        L_0x0197:
            r8 = 1
            r6 = 0
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>(r8)
            java.lang.String r0 = "entrypoint"
            r5.put(r0, r2)
            r1.set(r11)
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.DbS.A0N(r10)
            r2.A0R = r9
            int r0 = r1.nextClearBit(r11)
            if (r0 < r8) goto L_0x0287
            java.util.HashMap r1 = X.C359608dC.A01(r5)
            java.lang.String r0 = "com.bloks.www.ccp.aggregated_feedback.disclosure"
            X.DiU r1 = X.C46649DiU.A06(r0, r1, r4)
            r0 = -1
            X.C46649DiU.A0B(r1, r0)
            r1.A03 = r6
            r1.A02 = r6
            r1.A04 = r6
            r1.A0H(r3)
            r1.A0E(r7, r2)
            goto L_0x008f
        L_0x01da:
            boolean r0 = r14 instanceof X.KZR
            if (r0 == 0) goto L_0x0202
            r10 = 0
            X.MSp r7 = r15.A08
            if (r7 != 0) goto L_0x01e5
            X.LxT r7 = X.C65652LxT.A00
        L_0x01e5:
            X.LBi r1 = X.KYZ.A01
            android.app.Activity r2 = r15.A00
            androidx.fragment.app.Fragment r3 = r15.A02
            com.instagram.common.session.UserSession r6 = r15.A05
            X.818 r4 = r15.A03
            X.819 r5 = X.AnonymousClass819.BOTTOMSHEET_MIGRATION_STORIES_WAVE2
        L_0x01f1:
            java.lang.String r8 = r15.A0B
            java.lang.String r0 = ""
            if (r8 != 0) goto L_0x01f8
            r8 = r0
        L_0x01f8:
            java.lang.String r9 = r15.A0C
            if (r9 != 0) goto L_0x01fd
            r9 = r0
        L_0x01fd:
            r1.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x008f
        L_0x0202:
            boolean r0 = r14 instanceof X.KZQ
            if (r0 == 0) goto L_0x021a
            r10 = 0
            X.MSp r7 = r15.A08
            if (r7 != 0) goto L_0x020d
            X.LxS r7 = X.C65651LxS.A00
        L_0x020d:
            X.LBi r1 = X.KYZ.A01
            android.app.Activity r2 = r15.A00
            androidx.fragment.app.Fragment r3 = r15.A02
            com.instagram.common.session.UserSession r6 = r15.A05
            X.818 r4 = r15.A03
            X.819 r5 = X.AnonymousClass819.BOTTOMSHEET_MIGRATION_FEED_WAVE2
            goto L_0x01f1
        L_0x021a:
            boolean r0 = r14 instanceof X.KZP
            if (r0 == 0) goto L_0x023e
            X.MSp r7 = r15.A08
            if (r7 != 0) goto L_0x0224
            X.LxR r7 = X.C65650LxR.A00
        L_0x0224:
            X.LRS r1 = X.C62052KYa.A03
            android.app.Activity r2 = r15.A00
            androidx.fragment.app.Fragment r3 = r15.A02
            com.instagram.common.session.UserSession r6 = r15.A05
            X.818 r4 = r15.A03
            java.lang.String r8 = r15.A0B
            java.lang.String r9 = ""
            if (r8 != 0) goto L_0x0235
            r8 = r9
        L_0x0235:
            java.lang.String r0 = r15.A0C
            if (r0 == 0) goto L_0x023a
            r9 = r0
        L_0x023a:
            X.819 r5 = X.AnonymousClass819.BOTTOMSHEET_FEED_REEL_CCP_MIGRATION_STORY
            goto L_0x00b3
        L_0x023e:
            boolean r0 = r14 instanceof X.KZO
            if (r0 == 0) goto L_0x0267
            r11 = 0
            android.content.Context r4 = r15.A01
            if (r4 == 0) goto L_0x0090
            X.8it r3 = r15.A07
            if (r3 == 0) goto L_0x0090
            com.instagram.common.session.UserSession r2 = r15.A05
            r0 = 1
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r4, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.share.facebook.StoryShareToFBController"
            X.0qQ.A0C(r3, r0)
            java.lang.String r1 = r15.A0C
            if (r1 != 0) goto L_0x0260
            java.lang.String r1 = ""
        L_0x0260:
            X.MSp r0 = r15.A08
            X.C64370Lam.A00(r4, r2, r3, r0, r1)
            goto L_0x008f
        L_0x0267:
            boolean r0 = r14 instanceof X.KZN
            if (r0 == 0) goto L_0x0292
            r11 = 0
            android.content.Context r3 = r15.A01
            if (r3 == 0) goto L_0x0090
            com.instagram.common.session.UserSession r2 = r15.A05
            r0 = 1
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r3, r0)
            X.MSp r1 = r15.A08
            java.lang.String r0 = r15.A0C
            if (r0 != 0) goto L_0x0282
            java.lang.String r0 = ""
        L_0x0282:
            X.C64373Lap.A01(r3, r2, r1, r0)
            goto L_0x008f
        L_0x0287:
            r0 = 457(0x1c9, float:6.4E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0292:
            boolean r0 = r14 instanceof X.C62070KZa
            if (r0 == 0) goto L_0x02c5
            r2 = r14
            X.KZa r2 = (X.C62070KZa) r2
            com.instagram.common.session.UserSession r10 = r15.A05
            X.8jd r1 = X.C363388je.A00(r10)
            java.lang.String r0 = "CrosspostingBloksUpsell"
            boolean r0 = X.Dbb.A1Z(r1, r0)
            X.818 r7 = r15.A03
            X.819 r8 = r2.A00
            X.81A r9 = X.JTO.A0O()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A09(r0)
            r11 = 1
            X.81D r6 = new X.81D
            r6.<init>(r7, r8, r9, r10, r11)
            android.app.Activity r1 = r15.A00
            X.LxF r0 = new X.LxF
            r0.<init>()
            r6.A02(r1, r0)
            return r11
        L_0x02c5:
            boolean r0 = r14 instanceof X.KZM
            if (r0 == 0) goto L_0x02ef
            r3 = 0
            X.K6Q r2 = new X.K6Q
            r2.<init>()
            r11 = 1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>(r11)
            java.lang.String r0 = "is_new_user_activation_flow"
            r1.putBoolean(r0, r3)
            r2.setArguments(r1)
            com.instagram.common.session.UserSession r0 = r15.A05
            X.7Pr r1 = X.DbS.A0W(r0)
            r1.A0k = r11
        L_0x02e5:
            X.7Pu r1 = r1.A00()
            android.app.Activity r0 = r15.A00
            r1.A02(r0, r2)
            return r11
        L_0x02ef:
            X.K7L r2 = new X.K7L
            r2.<init>()
            com.instagram.common.session.UserSession r0 = r15.A05
            X.7Pr r1 = X.DbS.A0W(r0)
            r11 = 1
            r1.A0k = r11
            r0 = 21
            X.C65745Lyz.A00(r1, r15, r0)
            goto L_0x02e5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LGS.A05(X.LBK):boolean");
    }

    public static AnonymousClass9I7 A00(CXPNoticeStateRepository cXPNoticeStateRepository, String str) {
        2DQ A00 = 2DQ.A00(str);
        0qQ.A07(A00);
        return cXPNoticeStateRepository.A00(A00);
    }
}
