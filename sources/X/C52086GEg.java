package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.ClipChainType;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GEg  reason: case insensitive filesystem */
public abstract class C52086GEg {
    public static final void A05(AnonymousClass5OC r5, C52236GKd gKd, GJB gjb, AnonymousClass0iw r8, UserSession userSession, AnonymousClass93U r10, Integer num, Long l, Long l2, int i, long j) {
        0wc A0Z = C51967G9n.A0Z(r8, userSession, gKd, 7);
        0kJ r2 = A0Z.A00;
        0Aj A00 = A0Z.A00(r2, "instagram_clips_viewer_link_impression");
        if (A00.isSampled()) {
            DbW.A16(A00, r8);
            C51974G9v.A0l(A00, i, j);
            C51970G9q.A1E(A00, r10);
            C51973G9u.A14(A00, "chaining_session_id", r10.AmZ());
            A00.A8M(gjb, "delivery_class");
            A00.A8k("link_index", num);
            A00.A9F("app_attribution_id", l);
            C51965G9l.A19(gKd, A00);
            C51965G9l.A1C(r5, A00);
            A00.Cgf();
        }
        if (gKd == C52236GKd.A0q) {
            0Aj A002 = A0Z.A00(r2, "ig_nme_benefits");
            if (A002.isSampled() && l2 != null) {
                G9w.A1A(A002, l2, "impression");
            }
        }
    }

    public static final void A07(AnonymousClass5OC r5, C52236GKd gKd, AnonymousClass0iw r7, UserSession userSession, AnonymousClass93U r9, Integer num, Long l, Long l2, String str, int i, long j) {
        C51973G9u.A0t(2, r9, gKd, r5);
        0wc A01 = AnonymousClass0kN.A01(r7, userSession);
        0kJ r2 = A01.A00;
        0Aj A00 = A01.A00(r2, "instagram_clips_viewer_link_tap");
        if (A00.isSampled()) {
            DbW.A16(A00, r7);
            C51974G9v.A0l(A00, i, j);
            C51970G9q.A1E(A00, r9);
            C51965G9l.A19(gKd, A00);
            C51965G9l.A1C(r5, A00);
            C51970G9q.A1F(A00, r9);
            C51965G9l.A1Q(A00, str);
            A00.A9F("link_index", DbZ.A0c(num));
            A00.A9F("app_attribution_id", l);
            AnonymousClass7TH.A0V(A00);
        }
        if (gKd == C52236GKd.A0q) {
            0Aj A002 = A01.A00(r2, "ig_nme_benefits");
            if (A002.isSampled() && l2 != null) {
                G9w.A1A(A002, l2, "click");
            }
        }
    }

    public static final void A09(AnonymousClass5OC r5, C52236GKd gKd, UserSession userSession, 1Xj r8, AnonymousClass4DU r9, AnonymousClass93U r10, int i) {
        long j;
        Long l;
        String attributionAppId;
        Long A10;
        0qQ.A0B(r10, 2);
        0Aj A0O = C51972G9s.A0O(r9, userSession);
        if (A0O.isSampled()) {
            DbW.A16(A0O, r9);
            String A2n = r8.A2n();
            if (A2n == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51974G9v.A0l(A0O, i, j);
            C51970G9q.A1E(A0O, r10);
            User A11 = C51966G9m.A11(r8);
            Long l2 = null;
            if (A11 != null) {
                l = C51972G9s.A0h(A11);
            } else {
                l = null;
            }
            C51965G9l.A1H(A0O, l);
            A0O.AAJ("chaining_session_id", r10.AmZ());
            C51972G9s.A14(A0O, r8);
            C51965G9l.A19(gKd, A0O);
            C51965G9l.A1C(r5, A0O);
            A0O.AAJ("chaining_session_id", r10.AmZ());
            A0O.A8M(GJB.AD, "delivery_class");
            A0O.A9F("link_index", 1L);
            DUF A0j = C51965G9l.A0j(r8);
            if (!(A0j == null || (attributionAppId = A0j.getAttributionAppId()) == null)) {
                l2 = AnonymousClass7TE.A10(attributionAppId);
            }
            A0O.A9F("app_attribution_id", l2);
            A0O.A9F("link_index", 1L);
            A0O.Cgf();
        }
    }

    public static final void A0A(AnonymousClass5OC r2, AnonymousClass0iw r3, UserSession userSession, 1Xj r5, AnonymousClass93U r6, String str, long j) {
        0qQ.A0B(r6, 2);
        AnonymousClass7TG.A1S(userSession, r3);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "instagram_clips_comment_tap");
        DbW.A16(A0e, r3);
        String id = r5.getId();
        if (id != null) {
            C51965G9l.A1P(A0e, id);
            C51974G9v.A0q(A0e, r6, j);
            C51965G9l.A1C(r2, A0e);
            C51965G9l.A1F(A0e, (Long) null);
            A0e.AAJ("viewer_init_media_compound_key", str);
            C51974G9v.A0o(A0e, r5);
            AnonymousClass7TH.A0V(A0e);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0B(C52236GKd gKd, AnonymousClass0iw r7, UserSession userSession, 1Xj r9, String str, String str2, boolean z, boolean z2, boolean z3) {
        long j;
        C7215Pzj pzj;
        C7215Pzj pzj2;
        Long A10;
        int i = 0;
        0qQ.A0B(r7, 0);
        0Aj A0O = C51972G9s.A0O(r7, userSession);
        if (A0O.isSampled()) {
            DbW.A16(A0O, r7);
            String A2n = r9.A2n();
            if (A2n == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A18(A0O, j);
            int i2 = 0;
            C51969G9p.A16(A0O, 0);
            C51967G9n.A17(A0O);
            C51965G9l.A19(gKd, A0O);
            C51965G9l.A1C(AnonymousClass5OC.CAPTIONS_VIEW, A0O);
            C7215Pzj[] values = C7215Pzj.values();
            int length = values.length;
            while (true) {
                pzj = null;
                if (i >= length) {
                    pzj2 = null;
                    break;
                }
                pzj2 = values[i];
                if (0qQ.A0K(pzj2.A00, str)) {
                    break;
                }
                i++;
            }
            A0O.A8M(pzj2, "original_language");
            C7215Pzj[] values2 = C7215Pzj.values();
            int length2 = values2.length;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                C7215Pzj pzj3 = values2[i2];
                if (0qQ.A0K(pzj3.A00, str2)) {
                    pzj = pzj3;
                    break;
                }
                i2++;
            }
            A03(pzj, A0O, z);
            String str3 = "on";
            String str4 = "off";
            if (z2) {
                str4 = str3;
            }
            A0O.AAJ("translation_consumption_setting", str4);
            if (!z3) {
                str3 = "off";
            }
            A0O.AAJ("caption_consumption_setting", str3);
            A0O.Cgf();
        }
    }

    public static final void A0C(C52236GKd gKd, UserSession userSession, 1Xj r8, AnonymousClass4DU r9, Boolean bool, String str) {
        long j;
        Long l;
        C7215Pzj pzj;
        Long A10;
        C51973G9u.A1E(userSession, r9, r8);
        0Aj A0u = G9t.A0u(r9, userSession);
        if (A0u.isSampled()) {
            DbW.A16(A0u, r9);
            String A2n = r8.A2n();
            if (A2n == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A18(A0u, j);
            int i = 0;
            C51969G9p.A16(A0u, 0);
            C51967G9n.A17(A0u);
            A0u.AAJ("link_type", str);
            A0u.AAJ("link_format", "tag_below_profile");
            C51965G9l.A19(gKd, A0u);
            C51965G9l.A1C(AnonymousClass5OC.TAG_BELOW_PROFILE, A0u);
            C7215Pzj[] values = C7215Pzj.values();
            int length = values.length;
            while (true) {
                l = null;
                if (i >= length) {
                    pzj = null;
                    break;
                }
                pzj = values[i];
                if (0qQ.A0K(pzj.A00, AnonymousClass1Q2.A02().getLanguage())) {
                    break;
                }
                i++;
            }
            A0u.A8M(pzj, "translated_language");
            A0u.A7p("is_translated", bool);
            User A11 = C51966G9m.A11(r8);
            if (A11 != null) {
                l = C51972G9s.A0h(A11);
            }
            C51965G9l.A1H(A0u, l);
            A0u.Cgf();
        }
    }

    public static final void A0D(C52236GKd gKd, UserSession userSession, 1Xj r8, AnonymousClass4DU r9, String str, boolean z) {
        long j;
        C7215Pzj pzj;
        Long A10;
        C51973G9u.A1E(userSession, r9, r8);
        0Aj A0O = C51972G9s.A0O(r9, userSession);
        if (A0O.isSampled()) {
            DbW.A16(A0O, r9);
            String A2n = r8.A2n();
            if (A2n == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A18(A0O, j);
            int i = 0;
            C51969G9p.A16(A0O, 0);
            C51967G9n.A17(A0O);
            A0O.AAJ("link_type", str);
            A0O.AAJ("link_format", "tag_below_profile");
            C51965G9l.A19(gKd, A0O);
            C51965G9l.A1C(AnonymousClass5OC.TAG_BELOW_PROFILE, A0O);
            C7215Pzj[] values = C7215Pzj.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    pzj = null;
                    break;
                }
                pzj = values[i];
                if (C51973G9u.A1V(pzj)) {
                    break;
                }
                i++;
            }
            A03(pzj, A0O, z);
            A0O.Cgf();
        }
    }

    public static final void A0H(HOL hol, AnonymousClass8ZN r4, C320506sU r5, AnonymousClass0iw r6, UserSession userSession, Long l, String str, String str2, String str3, String str4, String str5) {
        DbW.A1N(userSession, 0, r6);
        0qQ.A0B(r5, 8);
        if (l != null) {
            Long A0j = C51972G9s.A0j(str2);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), AnonymousClass000.A00(3375));
            DbW.A16(A0e, r6);
            C51965G9l.A1F(A0e, l);
            G9t.A1G(A0e);
            C51965G9l.A1E(A0e, C51972G9s.A0i(str));
            C51965G9l.A1H(A0e, A0j);
            C51973G9u.A14(A0e, "ranking_info_token", str3);
            A0e.A9F("audio_owner_id", A0j);
            A0e.A8M(hol, "audio_type");
            A0e.AAJ("audio_sub_type", str4);
            if (r4 == null) {
                r4 = r5.A02;
            }
            A0e.A8M(r4, "pivot_page_entry_point");
            A0e.AAJ("pivot_page_session_id", r5.getSessionId());
            A0e.AAJ("trending_tab_category", str5);
            A0e.Cgf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0097, code lost:
        if (r9 == X.AnonymousClass8IJ.A0C) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0I(X.HOL r5, X.C320506sU r6, X.AnonymousClass0iw r7, com.instagram.common.session.UserSession r8, X.AnonymousClass8IJ r9, java.lang.Long r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18) {
        /*
            r4 = 0
            X.DbY.A1S(r7, r8)
            r0 = 10
            X.0qQ.A0B(r6, r0)
            if (r10 == 0) goto L_0x00cc
            java.lang.Long r2 = X.C51970G9q.A0i(r13)
            X.0wc r1 = X.AnonymousClass0kN.A01(r7, r8)
            java.lang.String r0 = "instagram_organic_use_audio"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            X.DbW.A16(r3, r7)
            X.C51965G9l.A1F(r3, r10)
            X.C51965G9l.A1N(r3, r11)
            java.lang.Long r0 = X.C51970G9q.A0i(r12)
            X.C51965G9l.A1E(r3, r0)
            X.C51965G9l.A1H(r3, r2)
            X.C51965G9l.A1Q(r3, r14)
            java.lang.Long r1 = X.C51970G9q.A0i(r15)
            java.lang.String r0 = "music_canonical_segment_id"
            r3.A9F(r0, r1)
            X.DbY.A1C(r3)
            java.lang.String r0 = "audio_owner_id"
            r3.A9F(r0, r2)
            java.lang.String r0 = "audio_type"
            r3.A8M(r5, r0)
            java.lang.String r0 = "audio_sub_type"
            r1 = r16
            r3.AAJ(r0, r1)
            X.C51973G9u.A11(r3, r6)
            java.lang.Long r1 = X.C51970G9q.A0i(r17)
            java.lang.String r0 = "best_audio_cluster_id"
            r3.A9F(r0, r1)
            java.lang.String r0 = "parent_audio_asset_id"
            r3.A9F(r0, r4)
            X.6zg r0 = X.C324636ze.A00(r8)
            com.instagram.search.common.analytics.SearchContext r5 = r0.A00
            if (r5 == 0) goto L_0x00db
            X.Gk9 r2 = new X.Gk9
            r2.<init>()
            java.lang.String r1 = r5.A05
            java.lang.String r0 = "search_session_id"
            r2.A06(r0, r1)
            java.lang.String r1 = r5.A03
            java.lang.String r0 = "rank_token"
            r2.A06(r0, r1)
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "query_text"
            r2.A06(r0, r1)
            java.lang.String r1 = r5.A06
            java.lang.String r0 = "serp_session_id"
            r2.A06(r0, r1)
            java.lang.String r1 = r5.A00
            java.lang.String r0 = "click_id"
            r2.A06(r0, r1)
        L_0x008d:
            java.lang.String r0 = "search_context"
            r3.AAK(r2, r0)
            if (r9 == 0) goto L_0x0099
            X.8IJ r0 = X.AnonymousClass8IJ.A0C
            r8 = 1
            if (r9 != r0) goto L_0x009a
        L_0x0099:
            r8 = 0
        L_0x009a:
            if (r8 == 0) goto L_0x00b9
            if (r9 == 0) goto L_0x00b9
            X.80P[] r7 = X.AnonymousClass80P.values()
            r6 = 0
            int r5 = r7.length
        L_0x00a4:
            if (r6 >= r5) goto L_0x00b9
            r2 = r7[r6]
            java.lang.String r1 = r2.name()
            com.instagram.api.schemas.AudioFilterType r0 = r9.A04
            java.lang.String r0 = r0.name()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00d8
            r4 = r2
        L_0x00b9:
            java.lang.String r0 = "filter_type"
            r3.A8M(r4, r0)
            if (r8 == 0) goto L_0x00d0
            if (r18 == 0) goto L_0x00cd
            java.lang.String r1 = "USE_FILTERED_MIX"
        L_0x00c4:
            java.lang.String r0 = "button_text"
            r3.AAJ(r0, r1)
            r3.Cgf()
        L_0x00cc:
            return
        L_0x00cd:
            java.lang.String r1 = "USE_FILTERED_AUDIO"
            goto L_0x00c4
        L_0x00d0:
            if (r18 == 0) goto L_0x00d5
            java.lang.String r1 = "USE_AUDIO_MIX"
            goto L_0x00c4
        L_0x00d5:
            java.lang.String r1 = "USE AUDIO"
            goto L_0x00c4
        L_0x00d8:
            int r6 = r6 + 1
            goto L_0x00a4
        L_0x00db:
            r2 = r4
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52086GEg.A0I(X.HOL, X.6sU, X.0iw, com.instagram.common.session.UserSession, X.8IJ, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static final void A0L(C54689HOu hOu, AnonymousClass8ZN r4, UserSession userSession, 1Xj r6, AnonymousClass4DU r7, String str, String str2, String str3, long j, long j2) {
        DbW.A1N(userSession, 1, r6);
        0Aj A0e = AnonymousClass7TE.A0e(C51967G9n.A0Z(r7, userSession, str2, 7), "instagram_organic_effect_tap");
        DbW.A16(A0e, r7);
        String id = r6.getId();
        if (id != null) {
            C51965G9l.A1P(A0e, id);
            C51965G9l.A1C(hOu, A0e);
            C51973G9u.A13(A0e, str, j);
            C51970G9q.A19(A0e, j2);
            C51965G9l.A1O(A0e, str2);
            A0e.AAJ("viewer_init_media_compound_key", str3);
            C51972G9s.A15(A0e, r6);
            C51973G9u.A14(A0e, "ranking_info_token", DbT.A0x(r6));
            A0e.A8M(r4, "pivot_page_entry_point");
            A0e.Cgf();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0R(C54689HOu hOu, UserSession userSession, 1Xj r5, AnonymousClass4DU r6, String str, String str2, int i) {
        0Aj A0e = AnonymousClass7TE.A0e(C51967G9n.A0Z(r6, userSession, str, 3), "instagram_organic_see_all_effect_tap");
        DbW.A16(A0e, r6);
        String id = r5.getId();
        if (id != null) {
            C51965G9l.A1P(A0e, id);
            C51965G9l.A1C(hOu, A0e);
            G9t.A1G(A0e);
            C51970G9q.A19(A0e, (long) i);
            C51965G9l.A1O(A0e, str);
            A0e.AAJ("viewer_init_media_compound_key", str2);
            C51974G9v.A0o(A0e, r5);
            AnonymousClass7TH.A0V(A0e);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0U(C267324bN r2, UserSession userSession, AnonymousClass4DU r4, SearchContext searchContext, String str) {
        C254523sc A01;
        0qQ.A0B(searchContext, 4);
        String A00 = C273654mx.A00(856);
        if (r2.A02 != null && (A01 = A01(r2, userSession, r4, A00)) != null) {
            A01.A6L = str;
            A01.A6r = searchContext.A05;
            A01.A6Y = searchContext.A03;
            A01.A6W = searchContext.A02;
            C233822wX.A0I(userSession, A01, r4, AnonymousClass05K.A00);
        }
    }

    public static final void A0X(AnonymousClass0iw r7, UserSession userSession, 1Xj r9) {
        List list;
        long j;
        String A30;
        Long A10;
        AnonymousClass7TF.A1H(userSession, r7);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "instagram_clips_subtitles_impression");
        if (A0e.isSampled()) {
            String str = null;
            if (r9 != null) {
                list = C51965G9l.A0w(r9);
                str = C51966G9m.A1D(r9);
            } else {
                list = null;
            }
            DbW.A16(A0e, r7);
            if (r9 == null || (A30 = r9.A30()) == null || (A10 = AnonymousClass7TE.A10(A30)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51974G9v.A0l(A0e, 0, j);
            String str2 = "";
            C51965G9l.A1O(A0e, str2);
            A0e.AAJ("original_language", AnonymousClass3WP.A01(str));
            if (list != null && AnonymousClass7TE.A1b(list)) {
                str2 = ((C276074sR) list.get(0)).BKV();
            }
            A0e.AAJ("translated_language", str2);
            String str3 = "on";
            String str4 = "off";
            if (AnonymousClass3WP.A07(userSession)) {
                str4 = str3;
            }
            A0e.AAJ("caption_consumption_setting", str4);
            if (!AnonymousClass3WS.A06(userSession)) {
                str3 = "off";
            }
            A0e.AAJ("translation_consumption_setting", str3);
            A0e.Cgf();
        }
    }

    public static final void A0a(AnonymousClass0iw r5, UserSession userSession, 1Xj r7, String str, String str2, String str3) {
        C51974G9v.A1M(str, str2, str3);
        1Ln A0I = 1Ln.A0I(AnonymousClass0kN.A01(r5, userSession));
        User A2A = r7.A2A(userSession);
        if (A2A != null) {
            A0I.A0Q("a_pk", DbV.A0q(A2A.getId()));
            User A2A2 = r7.A2A(userSession);
            if (A2A2 != null) {
                A0I.A0R("follow_status", A2A2.B6o().toString());
                A0I.A0R("is_coming_from", "clips");
                A0I.A0O(C273654mx.A00(315), false);
                String id = r7.getId();
                if (id != null) {
                    A0I.A0m(id);
                    A0I.A0Q("m_t", C51972G9s.A0g(r7));
                    A0I.A0R(AnonymousClass000.A00(53), "");
                    Long A0m = C51971G9r.A0m();
                    C51976G9y.A0Z(A0I, r5, A0m);
                    A0I.A0R("sticker_id", str);
                    C51976G9y.A0b(A0I, userSession, A0m, str2);
                    A0I.A0R("viewer_session_id", str3);
                    A0I.Cgf();
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A0b(AnonymousClass0iw r8, UserSession userSession, 1Xj r10, String str, boolean z) {
        C52236GKd gKd;
        String str2;
        long j;
        C7215Pzj pzj;
        String A2n;
        Long A10;
        0Aj A0u = G9t.A0u(r8, userSession);
        if (A0u.isSampled()) {
            if (z) {
                gKd = C52236GKd.A1A;
                str2 = "show_original_text";
            } else {
                gKd = C52236GKd.A1B;
                str2 = "show_translated_text";
            }
            DbW.A16(A0u, r8);
            if (r10 == null || (A2n = r10.A2n()) == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A18(A0u, j);
            int i = 0;
            C51969G9p.A16(A0u, 0);
            C51965G9l.A1O(A0u, str);
            A0u.AAJ("link_format", AnonymousClass000.A00(379));
            A0u.AAJ("link_type", str2);
            C51965G9l.A19(gKd, A0u);
            C51965G9l.A1C(AnonymousClass5OC.TEXT_STICKER, A0u);
            C7215Pzj[] values = C7215Pzj.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    pzj = null;
                    break;
                }
                pzj = values[i];
                if (C51973G9u.A1V(pzj)) {
                    break;
                }
                i++;
            }
            A03(pzj, A0u, true);
            A0u.Cgf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r2.isEmpty() != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0j(com.instagram.common.session.UserSession r8, X.1Xj r9, X.AnonymousClass4DU r10, X.AnonymousClass93U r11, java.lang.String r12, long r13) {
        /*
            r5 = 0
            r3 = 0
            if (r12 == 0) goto L_0x0094
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312183257236419(0x8101bd001103c3, double:3.0273091370775056E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 != 0) goto L_0x0094
            java.util.List r2 = X.C51965G9l.A0w(r9)
            if (r2 == 0) goto L_0x001e
            boolean r1 = r2.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            r6 = 0
            if (r0 != 0) goto L_0x0098
            boolean r0 = X.AnonymousClass3WS.A07(r8)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r2.get(r3)
            X.4sR r0 = (X.C276074sR) r0
            java.lang.String r7 = r0.BKV()
            if (r7 == 0) goto L_0x003a
            X.Dd8 r0 = X.Dd8.CLOSED_CAPTION
            java.util.List r6 = X.AnonymousClass7TE.A1I(r0)
        L_0x003a:
            X.0wc r1 = X.AnonymousClass0kN.A01(r10, r8)
            java.lang.String r0 = "instagram_clips_see_less"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "see_less_hide"
            X.DbS.A1J(r4, r0)
            X.DbW.A16(r4, r10)
            java.lang.String r0 = r9.A2n()
            r2 = 0
            if (r0 == 0) goto L_0x0095
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0095
            long r0 = r0.longValue()
        L_0x005e:
            X.C51970G9q.A18(r4, r0)
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r9)
            if (r0 == 0) goto L_0x006f
            java.lang.Long r0 = X.C51972G9s.A0h(r0)
            long r2 = X.C51967G9n.A08(r0, r2)
        L_0x006f:
            X.C51970G9q.A1C(r4, r2)
            int r0 = (int) r13
            X.C51969G9p.A16(r4, r0)
            X.C51970G9q.A1E(r4, r11)
            X.C51970G9q.A1F(r4, r11)
            X.C51972G9s.A14(r4, r9)
            X.C51972G9s.A15(r4, r9)
            java.lang.String r0 = "sfplt_reason"
            X.C51973G9u.A14(r4, r0, r5)
            java.lang.String r0 = "translated_language"
            r4.AAJ(r0, r7)
            java.lang.String r0 = "translation_delivery_method"
            r4.AAe(r0, r6)
            r4.Cgf()
        L_0x0094:
            return
        L_0x0095:
            r0 = 0
            goto L_0x005e
        L_0x0098:
            r7 = r5
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52086GEg.A0j(com.instagram.common.session.UserSession, X.1Xj, X.4DU, X.93U, java.lang.String, long):void");
    }

    public static void A03(AnonymousClass0Ac r1, 0Aj r2, boolean z) {
        r2.A8M(r1, "translated_language");
        r2.A7p("is_translated", Boolean.valueOf(z));
    }

    public static void A04(0Aj r2, CreatorViewerSignalModel creatorViewerSignalModel, Long l, int i) {
        r2.A9F("media_ig_id", l);
        r2.AAJ("signal", creatorViewerSignalModel.BwM().toString());
        r2.AAJ("signal_text_enum", creatorViewerSignalModel.getTitle());
        r2.AAJ("metric_name", "");
        r2.A9F("position", Long.valueOf((long) (i + 1)));
        r2.A9F(AnonymousClass000.A00(ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS), (Long) null);
        r2.AAJ("category", creatorViewerSignalModel.BwM().toString());
    }

    public static final void A06(AnonymousClass5OC r12, C52236GKd gKd, C267324bN r14, AnonymousClass0iw r15, UserSession userSession, 1Xj r17, AnonymousClass93U r18, Integer num, int i) {
        long j;
        String attributionAppId;
        Long A10;
        1Xj r1 = r17;
        AnonymousClass93U r5 = r18;
        C51972G9s.A1D(r5, r1);
        String A2n = r1.A2n();
        if (A2n == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        DUF A0j = C51965G9l.A0j(r1);
        Long l = null;
        if (!(A0j == null || (attributionAppId = A0j.getAttributionAppId()) == null)) {
            l = AnonymousClass7TE.A10(attributionAppId);
        }
        UserSession userSession2 = userSession;
        Long A0T = C51974G9v.A0T(userSession2, r1);
        A05(r12, gKd, A00(r14), r15, userSession2, r5, num, l, A0T, i, j);
    }

    public static final void A08(AnonymousClass5OC r5, C52236GKd gKd, AnonymousClass0iw r7, UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "instagram_clips_dialog_tap");
        if (A0e.isSampled()) {
            DbW.A16(A0e, r7);
            C51974G9v.A0l(A0e, 0, Long.parseLong(str));
            C51965G9l.A1O(A0e, "");
            C51965G9l.A19(gKd, A0e);
            C51965G9l.A1C(r5, A0e);
            C51973G9u.A10(A0e);
            DbX.A1L(A0e);
        }
    }

    public static final void A0K(C54689HOu hOu, AnonymousClass8ZN r8, AnonymousClass0iw r9, UserSession userSession, 1Xj r11, SearchContext searchContext, Boolean bool, Boolean bool2, Boolean bool3, Long l, String str, String str2, String str3, String str4, String str5, String str6, long j, long j2) {
        String str7;
        String str8;
        String str9;
        String str10 = str;
        boolean A1b = C51973G9u.A1b(r9, userSession, str10);
        String str11 = str4;
        DbW.A1P(str11, 10, searchContext);
        Boolean valueOf = Boolean.valueOf(A1b);
        String str12 = null;
        if (0qQ.A0K(bool2, valueOf) && 0qQ.A0K(bool3, valueOf)) {
            str7 = "audio_multitrack_filter";
        } else if (0qQ.A0K(bool3, valueOf)) {
            str7 = "audio_filter";
        } else if (0qQ.A0K(bool2, valueOf)) {
            str7 = "audio_multitrack";
        } else {
            str7 = null;
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r9, userSession), AnonymousClass000.A00(162));
        DbW.A16(A0e, r9);
        if (r11 == null || (str8 = r11.getId()) == null) {
            str8 = "";
        }
        C51965G9l.A1P(A0e, str8);
        C51965G9l.A1C(hOu, A0e);
        C51973G9u.A13(A0e, str10, j);
        C51970G9q.A19(A0e, j2);
        C51965G9l.A1O(A0e, str2);
        A0e.AAJ("viewer_init_media_compound_key", str3);
        if (r11 != null) {
            str9 = r11.A0C.getMezqlToken();
        } else {
            str9 = null;
        }
        A0e.AAJ("mezql_token", str9);
        if (r11 != null) {
            str12 = DbT.A0x(r11);
        }
        C51973G9u.A14(A0e, "ranking_info_token", str12);
        C51971G9r.A16(r8, A0e, str11);
        A0e.A9F("best_audio_cluster_id", C51972G9s.A0i(str5));
        A0e.AAJ("search_session_id", searchContext.A05);
        A0e.AAJ("rank_token", searchContext.A03);
        A0e.AAJ("query_text", searchContext.A02);
        A0e.AAJ("link_type", str7);
        A0e.A7p("is_audio_unavailable", bool);
        C51965G9l.A1F(A0e, l);
        A0e.AAJ("trending_tab_category", str6);
        DbX.A1L(A0e);
    }

    public static final void A0Y(AnonymousClass0iw r27, UserSession userSession, 1Xj r29, C249763kK r30, String str, int i) {
        String str2;
        String str3;
        Long l;
        String str4;
        String str5;
        String str6;
        ClipChainType Ans;
        AnonymousClass0iw r8 = r27;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1N(r8, userSession2);
        1Xj r1 = r29;
        User A2A = r1.A2A(userSession2);
        C319976rX r7 = C319976rX.A00;
        String id = r1.getId();
        if (id != null) {
            1iA BR7 = r1.BR7();
            List A3g = r1.A3g();
            ArrayList A3C = r1.A3C();
            String A0x = DbT.A0x(r1);
            DUF A0j = C51965G9l.A0j(r1);
            if (A0j != null) {
                str2 = A0j.getAttributionAppId();
            } else {
                str2 = null;
            }
            DTA Anl = r1.A0C.Anl();
            if (Anl == null || (Ans = Anl.Ans()) == null) {
                str3 = null;
            } else {
                str3 = Ans.A00;
            }
            DTA Anl2 = r1.A0C.Anl();
            if (Anl2 != null) {
                l = DbS.A0j(Anl2.Anm());
            } else {
                l = null;
            }
            if (A2A != null) {
                str4 = A2A.getId();
                str5 = A2A.getUsername();
            } else {
                str4 = null;
                str5 = null;
            }
            int i2 = i / 3;
            int i3 = i % 3;
            if (r30 != null) {
                str6 = r30.getSessionId();
            } else {
                str6 = null;
            }
            r7.A0C(r8, userSession2, BR7, l, id, A0x, str2, str3, str4, str5, str, str6, A3g, A3C, i2, i3);
            User A11 = C51966G9m.A11(r1);
            String str7 = C71342cb.A00(userSession2).A08;
            String str8 = C71342cb.A00(userSession2).A09;
            if (A11 != null) {
                C319986rY A0O = Dbb.A0O(userSession2, A11);
                String str9 = userSession2.A06;
                String A00 = AnonymousClass000.A00(4084);
                0qQ.A0B(A0O, 3);
                String str10 = str9;
                C319976rX.A02((C3263576k) null, (C69445Nlp) null, r8, userSession2, A0O, (Boolean) null, (Boolean) null, (Integer) null, (Long) null, (Long) null, (Long) null, A00, str10, "clips_tab", r1.getId(), r1.C9L(), (String) null, str7, str8, (String) null, (String) null, (String) null, (String) null, DbT.A0x(r1), (String) null, (String) null, (String) null);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0g(AnonymousClass0iw r5, UserSession userSession, boolean z, boolean z2) {
        AnonymousClass5OC r4;
        if (z) {
            r4 = AnonymousClass5OC.CLIPS_DOWNLOAD_ALLOWED_TOGGLE_AUTO;
        } else {
            r4 = AnonymousClass5OC.CLIPS_DOWNLOAD_ALLOWED_TOGGLE_USER;
        }
        C52236GKd gKd = C52236GKd.A0U;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "instagram_toggle_third_party_downloads_allowed_setting");
        C51965G9l.A19(gKd, A0e);
        A0e.A7p("toggled_setting_new_value", Boolean.valueOf(z2));
        DbW.A16(A0e, r5);
        C51969G9p.A16(A0e, -1);
        C51965G9l.A1C(r4, A0e);
        AnonymousClass7TH.A0V(A0e);
    }

    public static final GJB A00(C267324bN r1) {
        if (r1.CcK()) {
            return GJB.AD;
        }
        if (r1.A0G()) {
            return GJB.NETEGO;
        }
        if (r1.A01 == C295365o2.ORGANIC) {
            return GJB.ORGANIC;
        }
        return GJB.UNKNOWN;
    }

    public static final C254523sc A01(C267324bN r4, UserSession userSession, AnonymousClass4DU r6, String str) {
        UserSession userSession2 = userSession;
        AnonymousClass4DU r3 = r6;
        if (r4.CcK()) {
            return C254513sb.A01(userSession2, (1Xj) null, r3, r4.A06(), (C249763kK) null, (Integer) null, str);
        }
        1Xj r0 = r4.A02;
        if (r0 != null) {
            return C51967G9n.A0c(userSession, r0, r6, str);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final String A02(SocialContextType socialContextType) {
        int ordinal = socialContextType.ordinal();
        if (ordinal == 9) {
            return "like";
        }
        if (ordinal == 7) {
            return "follow";
        }
        if (ordinal == 2) {
            return "comment_reaction";
        }
        if (ordinal == 3) {
            return GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
        }
        if (ordinal != 8) {
            return null;
        }
        return "follower_count";
    }

    public static final void A0E(HOL hol, C54689HOu hOu, AnonymousClass8ZN r5, C320506sU r6, AnonymousClass0iw r7, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, long j) {
        AnonymousClass7TG.A1N(userSession, r7);
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "instagram_organic_audio_save_tap"), 297);
        A0U.A0R("containermodule", r7.getModuleName());
        A0U.A0Q("container_id", Long.valueOf(j));
        A0U.A0M(hOu, "action_source");
        A0U.A0Q("media_id", C51972G9s.A0j(str2));
        A0U.A0R("ranking_info_token", str3);
        A0U.A0R("media_tap_token", AnonymousClass7TF.A0b());
        A0U.A0Q("music_canonical_segment_id", C51972G9s.A0j(str4));
        AnonymousClass7TF.A18(A0U);
        A0U.A0M(hol, "audio_type");
        A0U.A0R("audio_sub_type", str5);
        A0U.A0Q("media_author_id", C51972G9s.A0j(str));
        A0U.A0Q("audio_owner_id", C51972G9s.A0i(str));
        A0U.A0R("trending_tab_category", str6);
        if (r6 != null) {
            if (r5 == null) {
                r5 = r6.A02;
            }
            A0U.A0M(r5, "pivot_page_entry_point");
            A0U.A0R("pivot_page_session_id", r6.getSessionId());
        }
        A0U.Cgf();
    }

    public static final void A0F(HOL hol, C54689HOu hOu, OriginalAudioSubtype originalAudioSubtype, C320506sU r7, AnonymousClass0iw r8, UserSession userSession, String str, String str2, String str3, int i, long j, boolean z) {
        String str4;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r8, userSession), "instagram_organic_audio_page_audio_mix_tap");
        if (A0e.isSampled()) {
            DbW.A16(A0e, r8);
            C51970G9q.A1A(A0e, j);
            if (str3 == null) {
                str3 = "";
            }
            C51965G9l.A1N(A0e, str3);
            String str5 = null;
            C51965G9l.A1E(A0e, C51972G9s.A0j(str));
            C51965G9l.A1H(A0e, C51972G9s.A0j(str2));
            A0e.A8M(hol, "audio_type");
            A0e.AAJ("audio_sub_type", "mix");
            C51973G9u.A11(A0e, r7);
            C51965G9l.A1C(hOu, A0e);
            A0e.A9F("audio_mix_position", DbS.A0j(i));
            if (z) {
                str5 = "MULTI_TRACKS_OVERFLOW_SHEET";
            }
            A0e.AAJ("overflow_sheet", str5);
            int ordinal = originalAudioSubtype.ordinal();
            if (ordinal == 3) {
                str4 = "multitrack";
            } else if (ordinal != 1) {
                str4 = null;
            } else {
                str4 = "partial_attribution";
            }
            A0e.AAJ("contained_audio_relationship", str4);
            A0e.Cgf();
        }
    }

    public static final void A0G(HOL hol, AnonymousClass8ZN r4, C320506sU r5, AnonymousClass0iw r6, UserSession userSession, Long l, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1N(r6, userSession);
        0qQ.A0B(r5, 7);
        if (l != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), AnonymousClass000.A00(3374));
            DbW.A16(A0e, r6);
            C51965G9l.A1F(A0e, l);
            G9t.A1G(A0e);
            C51973G9u.A14(A0e, "ranking_info_token", str);
            A0e.A9F("audio_owner_id", DbZ.A0d(str2));
            A0e.A8M(hol, "audio_type");
            A0e.AAJ("audio_sub_type", str3);
            if (r4 == null) {
                r4 = r5.A02;
            }
            A0e.A8M(r4, "pivot_page_entry_point");
            A0e.AAJ("pivot_page_session_id", r5.getSessionId());
            A0e.AAJ("trending_tab_category", str4);
            A0e.Cgf();
        }
    }

    public static final void A0J(C54689HOu hOu, AnonymousClass8ZN r4, C320506sU r5, AnonymousClass0iw r6, UserSession userSession, String str, String str2, String str3, String str4, long j) {
        AnonymousClass7TG.A1N(userSession, r6);
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_organic_audio_unsave_tap"), 298);
        A0U.A0R("containermodule", r6.getModuleName());
        A0U.A0Q("container_id", Long.valueOf(j));
        A0U.A0M(hOu, "action_source");
        A0U.A0Q("media_id", C51972G9s.A0j(str2));
        A0U.A0R("ranking_info_token", str3);
        A0U.A0R("media_tap_token", AnonymousClass7TF.A0b());
        AnonymousClass7TF.A18(A0U);
        A0U.A0Q("media_author_id", C51972G9s.A0i(str));
        A0U.A0R("trending_tab_category", str4);
        if (r5 != null) {
            if (r4 == null) {
                r4 = r5.A02;
            }
            A0U.A0M(r4, "pivot_page_entry_point");
            A0U.A0R("pivot_page_session_id", r5.getSessionId());
        }
        A0U.Cgf();
    }

    public static final void A0M(C54689HOu hOu, C320506sU r4, AnonymousClass0iw r5, UserSession userSession, String str, String str2, long j, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "instagram_organic_audio_trending_label_impression");
        if (A0e.isSampled()) {
            C51965G9l.A1C(hOu, A0e);
            DbW.A16(A0e, r5);
            C51970G9q.A1A(A0e, j);
            A0e.A9F("is_trending_label", Long.valueOf(G9t.A0k(z ? 1 : 0)));
            C263944Ny r1 = null;
            if (str2 != null) {
                r1 = C263944Ny.A00(str2);
            }
            A0e.AAE(r1, "media_author_id");
            C51965G9l.A1E(A0e, C51972G9s.A0i(str));
            C51973G9u.A11(A0e, r4);
            AnonymousClass7TH.A0V(A0e);
        }
    }

    public static final void A0N(C54689HOu hOu, AnonymousClass0iw r4, UserSession userSession, 1Xj r6, String str, String str2, int i) {
        C51972G9s.A1B(userSession, str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "instagram_organic_clips_remix_option_impression");
        DbW.A16(A0e, r4);
        String A30 = r6.A30();
        if (A30 != null) {
            G9t.A1J(A0e, A30);
            C51965G9l.A1C(hOu, A0e);
            C263944Ny r1 = null;
            C51965G9l.A1F(A0e, C51972G9s.A0j(str2));
            if (r6.A2A(userSession) != null) {
                r1 = C263944Ny.A00(C51972G9s.A0r(userSession, r6));
            }
            A0e.AAE(r1, "media_author_id");
            C51970G9q.A19(A0e, (long) i);
            C51965G9l.A1N(A0e, str);
            C51974G9v.A0o(A0e, r6);
            AnonymousClass7TH.A0V(A0e);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0O(C54689HOu hOu, AnonymousClass0iw r5, UserSession userSession, 1Xj r7, String str, String str2, long j) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "instagram_organic_location_tap");
        C51965G9l.A1C(hOu, A0e);
        DbW.A16(A0e, r5);
        String A30 = r7.A30();
        if (A30 != null) {
            G9t.A1J(A0e, A30);
            A0e.A9F("target_id", DbV.A0q(str2));
            User A2A = r7.A2A(userSession);
            if (A2A != null) {
                A0e.AAE(C263944Ny.A00(A2A.getId()), "media_author_id");
                C51970G9q.A19(A0e, j);
                C51965G9l.A1N(A0e, str);
                C51974G9v.A0o(A0e, r7);
                A0e.Cgf();
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A0P(C54689HOu hOu, AnonymousClass0iw r4, UserSession userSession, String str, String str2, String str3, long j) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0O(r4, userSession), "instagram_organic_audio_trending_tap");
        if (A0e.isSampled()) {
            C51965G9l.A1C(hOu, A0e);
            DbW.A16(A0e, r4);
            C51970G9q.A1A(A0e, j);
            C51973G9u.A14(A0e, "media_tap_token", str);
            A0e.A9F("audio_owner_id", C51972G9s.A0j(str2));
            C51965G9l.A1E(A0e, C51972G9s.A0i(str3));
            A0e.Cgf();
        }
    }

    public static final void A0Q(C54689HOu hOu, UserSession userSession, 1Xj r8, AnonymousClass4DU r9, int i) {
        AnonymousClass4DU r1 = r9;
        A0N(hOu, r1, userSession, r8, AnonymousClass7TG.A0j(), (String) null, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0S(com.instagram.api.schemas.SocialContextType r6, com.instagram.common.session.UserSession r7, X.1Xj r8, X.AnonymousClass4DU r9, X.AnonymousClass93U r10, int r11) {
        /*
            X.0Aj r2 = X.C51972G9s.A0O(r9, r7)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00c2
            X.1Xy r0 = r8.A0C
            java.util.List r0 = r0.BxO()
            r4 = 0
            if (r0 == 0) goto L_0x0054
            java.util.Iterator r3 = r0.iterator()
        L_0x0017:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.3yf r0 = (X.C258223yf) r0
            com.instagram.api.schemas.SocialContextType r0 = r0.BxW()
            if (r0 != r6) goto L_0x0017
        L_0x002a:
            X.3yf r1 = (X.C258223yf) r1
            if (r1 == 0) goto L_0x0054
            java.util.List r0 = r1.BxQ()
            if (r0 == 0) goto L_0x0054
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x003c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = X.DbS.A0q(r0)
            long r0 = java.lang.Long.parseLong(r0)
            X.AnonymousClass7TE.A1Y(r3, r0)
            goto L_0x003c
        L_0x0052:
            r1 = r4
            goto L_0x002a
        L_0x0054:
            r3 = r4
        L_0x0055:
            X.DbW.A16(r2, r9)
            java.lang.String r0 = r8.A2n()
            if (r0 == 0) goto L_0x00c5
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x00c5
            long r0 = r0.longValue()
        L_0x0068:
            X.C51974G9v.A0l(r2, r11, r0)
            X.C51970G9q.A1E(r2, r10)
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r8)
            if (r0 == 0) goto L_0x00c3
            java.lang.Long r0 = X.C51972G9s.A0h(r0)
        L_0x0078:
            X.C51965G9l.A1H(r2, r0)
            X.C51970G9q.A1F(r2, r10)
            X.C51972G9s.A14(r2, r8)
            java.lang.String r1 = "tag_above_profile"
            java.lang.String r0 = "link_format"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "link_index"
            r2.A9F(r0, r4)
            X.DbY.A1C(r2)
            X.DUF r0 = X.C51965G9l.A0j(r8)
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = r0.getAttributionAppId()
            java.lang.Long r4 = X.C51972G9s.A0i(r0)
        L_0x009e:
            java.lang.String r0 = "app_attribution_id"
            r2.A9F(r0, r4)
            X.GKd r0 = X.C52236GKd.A1C
            X.C51965G9l.A19(r0, r2)
            X.5OC r0 = X.AnonymousClass5OC.TAG_BELOW_PROFILE
            X.C51965G9l.A1C(r0, r2)
            java.lang.String r0 = "facepile_user_ids"
            r2.AAe(r0, r3)
            java.lang.String r1 = A02(r6)
            if (r1 != 0) goto L_0x00ba
            java.lang.String r1 = "unknown"
        L_0x00ba:
            java.lang.String r0 = "social_context_type"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x00c2:
            return
        L_0x00c3:
            r0 = r4
            goto L_0x0078
        L_0x00c5:
            r0 = 0
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52086GEg.A0S(com.instagram.api.schemas.SocialContextType, com.instagram.common.session.UserSession, X.1Xj, X.4DU, X.93U, int):void");
    }

    public static final void A0T(C267324bN r7, AnonymousClass0iw r8, UserSession userSession, Integer num, String str, boolean z) {
        long j;
        AnonymousClass5OC r0;
        C7215Pzj pzj;
        Long A10;
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, r8);
        0Aj A0u = G9t.A0u(r8, userSession);
        if (A0u.isSampled()) {
            DbW.A16(A0u, r8);
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A18(A0u, j);
            int i = 0;
            C51969G9p.A16(A0u, AnonymousClass7TG.A0A(num));
            C51967G9n.A17(A0u);
            C51965G9l.A19(C52236GKd.A0v, A0u);
            if (z) {
                r0 = AnonymousClass5OC.TAG_PROFILE_BYLINE;
            } else {
                r0 = AnonymousClass5OC.ATTRIBUTE_PILLS;
            }
            C51965G9l.A1C(r0, A0u);
            C7215Pzj[] values = C7215Pzj.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    pzj = null;
                    break;
                }
                pzj = values[i];
                if (C51973G9u.A1V(pzj)) {
                    break;
                }
                i++;
            }
            A03(pzj, A0u, A1Z);
            if (r7 != null) {
                A0u.A8M(A00(r7), "delivery_class");
            }
            A0u.Cgf();
        }
    }

    public static final void A0V(C267324bN r7, UserSession userSession, AnonymousClass4DU r9, Integer num, String str, boolean z) {
        long j;
        AnonymousClass5OC r0;
        C7215Pzj pzj;
        Long A10;
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, r9);
        0Aj A0O = C51972G9s.A0O(r9, userSession);
        if (A0O.isSampled()) {
            DbW.A16(A0O, r9);
            if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A18(A0O, j);
            int i = 0;
            C51969G9p.A16(A0O, AnonymousClass7TG.A0A(num));
            C51967G9n.A17(A0O);
            C51965G9l.A19(C52236GKd.A0v, A0O);
            if (z) {
                r0 = AnonymousClass5OC.TAG_PROFILE_BYLINE;
            } else {
                r0 = AnonymousClass5OC.ATTRIBUTE_PILLS;
            }
            C51965G9l.A1C(r0, A0O);
            C7215Pzj[] values = C7215Pzj.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    pzj = null;
                    break;
                }
                pzj = values[i];
                if (C51973G9u.A1V(pzj)) {
                    break;
                }
                i++;
            }
            A03(pzj, A0O, A1Z);
            if (r7 != null) {
                A0O.A8M(A00(r7), "delivery_class");
            }
            A0O.Cgf();
        }
    }

    public static final void A0W(AnonymousClass0iw r2, UserSession userSession) {
        0wc A01 = AnonymousClass0kN.A01(r2, userSession);
        userSession.A01(C234212xH.class, C234202xG.A00);
        0Aj A0e = AnonymousClass7TE.A0e(A01, C66579MXk.A00(122));
        if (A0e.isSampled()) {
            A0e.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "quick_send_reels");
            A0e.Cgf();
        }
    }

    public static final void A0Z(AnonymousClass0iw r2, UserSession userSession, 1Xj r4, String str, String str2, long j) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "instagram_clips_overflow_menu_option_tap");
        if (A0e.isSampled()) {
            DbW.A16(A0e, r2);
            A0e.AAJ("menu_option", str);
            String A30 = r4.A30();
            if (A30 != null) {
                G9t.A1J(A0e, A30);
                C51970G9q.A19(A0e, j);
                if (str2 == null) {
                    str2 = "";
                }
                C51965G9l.A1O(A0e, str2);
                C51973G9u.A10(A0e);
                DbX.A1L(A0e);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A0c(AnonymousClass0iw r7, UserSession userSession, 1Xj r9, List list, int i) {
        Long A0n;
        CreatorViewerSignalModel creatorViewerSignalModel;
        AnonymousClass7TG.A1N(r7, userSession);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "ig_lumen_recipe_sheet_overflow_tip_impression");
        String A2n = r9.A2n();
        if (A2n != null && (A0n = 00y.A0n(10, A2n)) != null && (creatorViewerSignalModel = (CreatorViewerSignalModel) 00k.A0O(list, i)) != null && A0e.isSampled()) {
            ArrayList A0p = AnonymousClass7TF.A0p(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C51974G9v.A0v(new 0bb(), (CreatorViewerSignalModel) it.next(), A0p);
            }
            A04(A0e, creatorViewerSignalModel, A0n, i);
            C51969G9p.A1A(A0e, r7);
            DbS.A1G(A0e, "recipe_sheet");
            A0e.AAe("recommendation_info", A0p);
            DbX.A1L(A0e);
        }
    }

    public static final void A0d(AnonymousClass0iw r7, UserSession userSession, 1Xj r9, List list, int i) {
        Long A0n;
        CreatorViewerSignalModel creatorViewerSignalModel;
        C51974G9v.A1O(r7, userSession, r9, list);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "ig_lumen_recipe_sheet_overflow_tip_tap");
        String A2n = r9.A2n();
        if (A2n != null && (A0n = 00y.A0n(10, A2n)) != null && (creatorViewerSignalModel = (CreatorViewerSignalModel) 00k.A0O(list, i)) != null && A0e.isSampled()) {
            ArrayList A0p = AnonymousClass7TF.A0p(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C51974G9v.A0v(new 0bb(), (CreatorViewerSignalModel) it.next(), A0p);
            }
            A04(A0e, creatorViewerSignalModel, A0n, i);
            C51969G9p.A1A(A0e, r7);
            DbS.A1G(A0e, "recipe_sheet");
            A0e.AAe("recommendation_info", A0p);
            DbX.A1L(A0e);
        }
    }

    public static final void A0e(AnonymousClass0iw r1, UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0O(r1, userSession), AnonymousClass000.A00(1428));
        if (A0e.isSampled()) {
            A0e.AAJ(TraceFieldType.AdhocEventName, AnonymousClass000.A00(4196));
            A0e.AAJ("entrypoint", str);
            A0e.Cgf();
        }
    }

    public static final void A0f(AnonymousClass0iw r6, UserSession userSession, String str, String str2, String str3, List list, long j) {
        String str4;
        AnonymousClass7TG.A1N(r6, userSession);
        0Aj A0e = AnonymousClass7TE.A0e(C51967G9n.A0Z(r6, userSession, str, 4), "ig_lumen_midcard_element_tap");
        if (A0e.isSampled()) {
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                0bb r2 = new 0bb();
                r2.A06("signal", ((InspirationSignalType) it.next()).A00);
                A0r.add(r2);
            }
            0bb r1 = new 0bb();
            r1.A06("button_text_enum", str);
            List A1I = AnonymousClass7TE.A1I(r1);
            A0e.A9F("media_ig_id", Long.valueOf(j));
            InspirationSignalType inspirationSignalType = (InspirationSignalType) 00k.A0J(list);
            if (inspirationSignalType == null || (str4 = inspirationSignalType.A00) == null) {
                str4 = InspirationSignalType.UNRECOGNIZED.A00;
            }
            A0e.AAJ("signal", str4);
            A0e.AAe("recommendation_info", A0r);
            A0e.AAe("button_info", A1I);
            C51969G9p.A1A(A0e, r6);
            A0e.AAJ("layout", str2);
            A0e.AAJ("midcard_type", str3);
            A0e.Cgf();
        }
    }

    public static final void A0h(UserSession userSession, AnonymousClass0iw r2, String str, String str2, String str3, int i) {
        AnonymousClass7TG.A1N(r2, userSession);
        0Aj A0M = C51972G9s.A0M(r2, userSession);
        if (A0M.isSampled()) {
            A0M.AAJ("organic_tap_action", str);
            A0M.AAJ("organic_tap_action_source", str2);
            DbW.A16(A0M, r2);
            C51969G9p.A16(A0M, i);
            if (str3 == null) {
                str3 = "";
            }
            C51965G9l.A1O(A0M, str3);
            A0M.Cgf();
        }
    }

    public static final void A0i(UserSession userSession, 1Xj r5, AnonymousClass4DU r6, AnonymousClass93U r7, Long l, String str, String str2, String str3, int i, int i2) {
        long j;
        String str4;
        String id;
        User A11;
        String pkId;
        Long A10;
        AnonymousClass7TG.A1N(r6, userSession);
        0qQ.A0B(r7, 4);
        if (str2 != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_clips_viewer_exit");
            DbW.A16(A0e, r6);
            long j2 = -1;
            if (r5 == null || (A11 = C51966G9m.A11(r5)) == null || (pkId = A11.A03.getPkId()) == null || (A10 = AnonymousClass7TE.A10(pkId)) == null) {
                j = -1;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A1C(A0e, j);
            if (!(r5 == null || (id = r5.getId()) == null)) {
                j2 = C51967G9n.A08(AnonymousClass7TE.A10(id), -1);
            }
            C51974G9v.A0l(A0e, i, j2);
            C51973G9u.A10(A0e);
            A0e.AAJ("viewer_exit_action_source", str);
            C51970G9q.A1E(A0e, r7);
            C51970G9q.A1F(A0e, r7);
            if (r5 != null) {
                str4 = DbT.A0x(r5);
            } else {
                str4 = null;
            }
            C51965G9l.A1Q(A0e, str4);
            if (l != null) {
                long longValue = l.longValue();
                0jB A0k = C51965G9l.A0k();
                0j9 r1 = C271774jZ.A23;
                boolean z = true;
                C51967G9n.A1J(r1, A0k, true);
                0j9 r72 = C271774jZ.A22;
                if (i2 == 0) {
                    z = false;
                }
                C51967G9n.A1J(r72, A0k, z);
                0j9 r62 = C271774jZ.A21;
                A0k.A04(r62, Integer.valueOf(i2));
                0j9 r3 = C271774jZ.A0C;
                A0k.A04(r3, Long.valueOf(longValue));
                0bb r2 = new 0bb();
                r2.A03("is_delayed_skip_ad", (Boolean) A0k.A01(r1));
                r2.A03("is_action_on_unskippable", (Boolean) A0k.A01(r72));
                r2.A05(AnonymousClass000.A00(2575), DbZ.A0c((Number) A0k.A01(r62)));
                r2.A05("ad_id", C51966G9m.A13(r3, A0k));
                A0e.AAK(r2, AnonymousClass000.A00(3864));
            }
            if (str3 != null) {
                A0e.A9F("blend_id", DbV.A0q(str3));
            }
            A0e.Cgf();
        }
    }

    public static final void A0k(UserSession userSession, 1Xj r3, AnonymousClass4DU r4, AnonymousClass93U r5, String str, String str2, int i) {
        C51974G9v.A1K(r4, userSession, r5);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "instagram_clips_create_clips");
        DbW.A16(A0e, r4);
        C51974G9v.A0q(A0e, r5, (long) i);
        C51965G9l.A1F(A0e, (Long) null);
        C51965G9l.A1P(A0e, r3.getId());
        C51970G9q.A1F(A0e, r5);
        A0e.AAJ("viewer_init_media_compound_key", str);
        C51974G9v.A0o(A0e, r3);
        A0e.A9F("best_audio_cluster_id", C51972G9s.A0i(str2));
        AnonymousClass7TH.A0V(A0e);
    }

    public static final void A0l(UserSession userSession, 1Xj r9, AnonymousClass4DU r10, String str, String str2, long j) {
        C267284bJ BZ6;
        C51974G9v.A1L(userSession, r9, str);
        0qQ.A0B(str2, 5);
        C67161s9 A1N = r9.A1N();
        if (A1N != null && (BZ6 = A1N.BZ6()) != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r10, userSession), "instagram_organic_clips_remix_owner_tap");
            DbS.A1J(A0e, AnonymousClass000.A00(2664));
            DbW.A16(A0e, r10);
            C51965G9l.A1O(A0e, str);
            A0e.A9F("media_type", C51972G9s.A0g(r9));
            A0e.A9F("media_creation_product_type", 16L);
            String A30 = r9.A30();
            if (A30 != null) {
                C51965G9l.A1J(A0e, A30);
                C51970G9q.A19(A0e, j);
                User A2A = r9.A2A(userSession);
                if (A2A != null) {
                    A0e.AAJ("media_author_id", A2A.getId());
                    String A0t = C51965G9l.A0t(r9);
                    if (A0t == null) {
                        A0t = "";
                    }
                    A0e.AAJ("inventory_source", A0t);
                    A0e.AAJ("ranking_session_id", str2);
                    A0e.A9F("chaining_seed_author_id", Long.valueOf(DbY.A04(00y.A0n(10, BZ6.CCd().getId()))));
                    String pk = BZ6.getPk();
                    0qQ.A0B(pk, 0);
                    A0e.A9F("chaining_seed_media_id", Long.valueOf(C51967G9n.A08(00y.A0n(10, pk), 0)));
                    C51974G9v.A0o(A0e, r9);
                    C51965G9l.A1L(A0e, r9.C9L());
                    A0e.Cgf();
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
