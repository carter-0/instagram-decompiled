package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JbO  reason: case insensitive filesystem */
public final class C59899JbO implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "CreationLogger";
    public 28D A00 = 28D.A5J;
    public 28t A01 = 28t.A04;
    public String A02;
    public boolean A03;
    public final 0wc A04;
    public final UserSession A05;

    public final void A07(28D r4) {
        0qQ.A0B(r4, 0);
        if (this.A03) {
            String str = this.A02;
            if (str != null) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("sessionId: ");
                A1A.append(str);
                0kD.A08("CreationLogger#duplicateStartGallerySession", AnonymousClass7TG.A0m(r4, " entryPoint: ", A1A), (Throwable) null);
            }
            UserSession userSession = this.A05;
            String A0g = AnonymousClass7TF.A0g(userSession);
            this.A02 = A0g;
            if (A0g == null) {
                this.A02 = C360918fM.A00(userSession).A00();
            }
            this.A00 = r4;
            0Aj A0e = AnonymousClass7TE.A0e(this.A04, "ig_feed_gallery_start_session");
            if (A0e.isSampled()) {
                JTO.A1S(A0e, A03(this));
                DbS.A1F(this.A00, A0e);
                AnonymousClass7TE.A1W(A0e, "event_type", 1);
                A0e.AAJ("gallery_type", "old_gallery");
                DbS.A1K(A0e, "ig_creation_client_events");
                AnonymousClass7TH.A0V(A0e);
            }
        }
    }

    public final void A0E(String str, int i, int i2, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A04, "instagram_tag_limit_reached");
        A0e.AAJ("waterfall_id", A02(A0e, this, "session_instance_id", A02(A0e, this, "prior_module", str)));
        A0e.A7p("is_organic_product_tagging", JTP.A0g(A0e, "usage", "feed_sharing", z));
        A0e.A9F("products_tagged_count", JTT.A0l(A0e, DbS.A0j(i), "users_tagged_count", i2));
        A0e.AAJ("prior_submodule", (String) null);
        A0e.Cgf();
    }

    public final String getModuleName() {
        return "ig_creation_client_events";
    }

    public static 0Aj A01(AnonymousClass0Ac r3, C59899JbO jbO) {
        0wc r2 = jbO.A04;
        0Aj A002 = r2.A00(r2.A00, "ig_ads_conversion_funnel");
        A002.A8M(r3, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A002.AAJ("seller_igid", jbO.A05.A06);
        return A002;
    }

    public static String A03(C59899JbO jbO) {
        String str = jbO.A02;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final void A04(C59899JbO jbO, String str) {
        27r A012 = 27p.A01(jbO.A05);
        String A032 = A03(jbO);
        28D r5 = jbO.A00;
        28t r4 = jbO.A01;
        29Z r1 = A012.A0F;
        AnonymousClass7TF.A1C(r5, 2, r4);
        0Aj A0d = JTR.A0d(r1);
        if (A0d.isSampled()) {
            JTO.A1O(AnonymousClass80P.ASPECT_RATIO, A0d);
            A0d.AAJ("camera_session_id", JTS.A0j(A0d, r1, "IG_FEED_GALLERY_ASPECT_RATIO_TOGGLE"));
            A0d.AAJ("camera_session_id", A032);
            A0d.AAJ("crop_action", str);
            JTS.A15(r5, A0d, 2);
            A0d.AAJ("gallery_type", "old_gallery");
            JTO.A1P(r4, A0d);
            AnonymousClass7TH.A0U(A0d);
            AnonymousClass7TH.A0V(A0d);
        }
    }

    public final void A05() {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(this.A04, "ig_camera_invite_collaborator_person_removed");
        if (A0e.isSampled() && (str = this.A02) != null) {
            JTO.A1S(A0e, str);
            JTP.A1H(A0e);
            A0e.A8M(C360948fP.FEED, "capture_type");
            JTS.A14(this.A00, A0e);
            JTO.A1P(this.A01, A0e);
            DbS.A1K(A0e, "ig_creation_client_events");
            C51965G9l.A1A(C59725JVj.SHARE_SHEET, A0e);
            AnonymousClass7TH.A0V(A0e);
        }
    }

    public final void A06(C279294yP r10, 28t r11, List list, List list2, List list3, List list4, int i) {
        if (this.A00 == 28D.A5J) {
            this.A00 = 27p.A01(this.A05).A04.A09;
        }
        this.A01 = r11;
        UserSession userSession = this.A05;
        String A0g = AnonymousClass7TF.A0g(userSession);
        if (A0g != null) {
            this.A02 = A0g;
        }
        29f A0c = JTO.A0c(userSession);
        String A032 = A03(this);
        28D r6 = this.A00;
        boolean A1Y = DbW.A1Y(r6);
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(A0c.A01, "ig_camera_start_post_capture_session"), 203);
        if (DbT.A1Y(A0U)) {
            C279294yP r4 = C279294yP.FEED;
            A0U.A0a(r4);
            A0U.A0S("camera_tools_struct", 0sn.A00);
            A0U.A0V(3);
            JTO.A1U(A0U, A032);
            A0U.A0Q("capture_format_index", C51971G9r.A0m());
            A0U.A0M(C360948fP.FEED, "capture_type");
            A0U.A0M(r6, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0U.A0W(A1Y ? 1 : 0);
            A0U.A0c(r11);
            JTQ.A1A(A0U);
            A0U.A0M(C59725JVj.POST_CAPTURE, "surface");
            A0U.A0R("composition_str_id", "");
            A0U.A0M((AnonymousClass0Ac) null, "composition_media_type");
            A0U.A0O("is_panavision", false);
            A0U.A0O("is_feed_fork", false);
            AnonymousClass7TF.A18(A0U);
            A0U.A0Q(C273654mx.A00(3016), DbS.A0j(i));
            A0U.A0S("height_width", list);
            A0U.A0S("original_height_width", list2);
            A0U.A0S("bitrate_list", list3);
            if (r10 == null) {
                r10 = r4;
            }
            A0U.A0M(r10, "bottom_camera_dial_selected");
            if (C367178qJ.A00(A0c.A03).booleanValue()) {
                0nY.A00().ATE(new C15870Uju(A0U, A0c, list4));
            } else {
                A0U.Cgf();
            }
        }
    }

    public final void A08(28t r9) {
        27r A012 = 27p.A01(this.A05);
        28D r6 = this.A00;
        String A032 = A03(this);
        AnonymousClass29Q r2 = A012.A07;
        0qQ.A0B(r6, 0);
        0Aj A0e = AnonymousClass7TE.A0e(r2.A01, "ig_camera_end_session");
        if (A0e.isSampled()) {
            JTO.A1Q(A0e, "POST_CAPTURE");
            A0e.AAJ("camera_session_id", JTS.A0j(A0e, r2, "IG_CAMERA_END_POST_CAPTURE_SESSION"));
            JTP.A1H(A0e);
            A0e.AAe("camera_tools_struct", Collections.emptyList());
            AnonymousClass7TE.A1W(A0e, "camera_position", 3);
            A0e.AAJ("camera_session_id", A032);
            JTS.A16(A0e);
            A0e.A8M(C360948fP.FEED, "capture_type");
            JTS.A15(r6, A0e, 1);
            JTO.A1P(r9, A0e);
            AnonymousClass7TH.A0U(A0e);
            JTP.A1F(A0e);
            A0e.AAJ("composition_str_id", "");
            A0e.A8M(28t.A03, "composition_media_type");
            A0e.A7p("is_panavision", false);
            DbY.A1C(A0e);
            JTT.A18(A0e);
        }
    }

    public final void A09(28t r7, int i) {
        27r A012 = 27p.A01(this.A05);
        if (r7 == null) {
            r7 = this.A01;
        }
        String A032 = A03(this);
        28D r4 = this.A00;
        AnonymousClass29Q r2 = A012.A07;
        0qQ.A0B(r4, 3);
        0Aj A0e = AnonymousClass7TE.A0e(r2.A01, "ig_camera_end_session");
        if (A0e.isSampled()) {
            JTO.A1Q(A0e, "GALLERY_FEED_TEMP");
            JTO.A1T(A0e, "IG_FEED_GALLERY_END_SESSION");
            AnonymousClass283 r22 = r2.A04;
            A0e.AAJ("camera_session_id", JTP.A0p(r22));
            A0e.AAJ("camera_session_id", A032);
            DbS.A1F(r4, A0e);
            AnonymousClass7TE.A1W(A0e, "exit_point", i);
            AnonymousClass7TE.A1W(A0e, "event_type", 1);
            A0e.AAJ("gallery_type", "old_gallery");
            if (r7 == null) {
                r7 = r22.A0A;
            }
            JTO.A1P(r7, A0e);
            C51973G9u.A14(A0e, "module", 27x.A08.getModuleName());
            JTT.A18(A0e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0159, code lost:
        if (r1.A0L() != false) goto L_0x015b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.28t r66, com.instagram.reels.prompt.model.PromptStickerModel r67, java.util.List r68) {
        /*
            r65 = this;
            r37 = -1
            r3 = 1
            r8 = 0
            r0 = r65
            X.0wc r6 = r0.A04
            java.lang.String r1 = "ig_feed_gallery_end_share_session"
            X.0kJ r4 = r6.A00
            X.0Aj r5 = r6.A00(r4, r1)
            boolean r1 = r5.isSampled()
            r10 = r66
            if (r1 == 0) goto L_0x0033
            X.28D r1 = r0.A00
            X.JTS.A15(r1, r5, r3)
            java.lang.String r2 = "old_gallery"
            java.lang.String r1 = "gallery_type"
            java.lang.String r1 = A02(r5, r0, r1, r2)
            X.JTO.A1S(r5, r1)
            X.JTO.A1P(r10, r5)
            java.lang.String r1 = "ig_creation_client_events"
            X.DbS.A1K(r5, r1)
            X.AnonymousClass7TH.A0V(r5)
        L_0x0033:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r29 = r68
            java.util.Iterator r7 = r29.iterator()
        L_0x003d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.String r2 = X.AnonymousClass7TE.A18(r7)
            r1 = 0
            java.lang.Long r1 = X.C51971G9r.A0n(r1, r2)
            if (r1 != 0) goto L_0x005f
            java.lang.String r1 = "numberToParse: "
            java.lang.String r2 = X.002.A0R(r1, r2)
            java.lang.String r1 = "CreationLogger#invalidStringInSafeParseLong"
            X.0kD.A08(r1, r2, r8)
            r1 = 0
        L_0x005b:
            X.AnonymousClass7TE.A1Y(r5, r1)
            goto L_0x003d
        L_0x005f:
            long r1 = r1.longValue()
            goto L_0x005b
        L_0x0064:
            java.lang.String r1 = "ig_feed_gallery_share_media"
            X.0Aj r4 = r6.A00(r4, r1)
            boolean r1 = r4.isSampled()
            if (r1 == 0) goto L_0x00a7
            X.28D r1 = r0.A00
            X.JTS.A14(r1, r4)
            java.lang.String r1 = "applied_effect_ids"
            r4.AAe(r1, r5)
            java.lang.String r2 = "old_gallery"
            java.lang.String r1 = "gallery_type"
            r4.AAJ(r1, r2)
            X.KkU r2 = X.C62668KkU.FEED
            java.lang.String r1 = "share_destination"
            r4.A8M(r2, r1)
            X.28D r2 = r0.A00
            X.28D r1 = X.28D.A2d
            if (r2 != r1) goto L_0x012a
            X.JYm r2 = X.C59793JYm.OTHER
        L_0x0090:
            java.lang.String r1 = "media_source"
            r4.A8M(r2, r1)
            X.JTO.A1P(r10, r4)
            java.lang.String r1 = A03(r0)
            X.JTO.A1S(r4, r1)
            java.lang.String r1 = "ig_creation_client_events"
            X.DbS.A1K(r4, r1)
            X.AnonymousClass7TH.A0V(r4)
        L_0x00a7:
            r39 = 0
            r1 = r67
            if (r67 == 0) goto L_0x0128
            java.lang.String r2 = r1.A04
        L_0x00af:
            java.lang.String r23 = X.C358188aV.A01(r2)
            X.KkU r2 = X.C62668KkU.FEED
            X.KkU[] r2 = new X.C62668KkU[]{r2}
            java.util.ArrayList r47 = X.0sr.A1M(r2)
            java.util.Iterator r4 = r47.iterator()
        L_0x00c1:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x012e
            java.lang.Object r12 = r4.next()
            X.KkU r12 = (X.C62668KkU) r12
            com.instagram.common.session.UserSession r2 = r0.A05
            X.29f r7 = X.JTO.A0c(r2)
            X.JYm r9 = X.C59793JYm.GALLERY
            r38 = 12
            java.util.List r28 = java.util.Collections.emptyList()
            X.0qQ.A07(r28)
            X.8jC r14 = X.C363138jC.A00
            java.util.List r31 = java.util.Collections.emptyList()
            java.util.Map r36 = java.util.Collections.emptyMap()
            X.JVj r13 = X.C59725JVj.SHARE_SHEET
            java.lang.String r22 = "ig_creation_client_events"
            if (r67 == 0) goto L_0x00f6
            boolean r2 = r1.A0L()
            r45 = 1
            if (r2 == 0) goto L_0x00f8
        L_0x00f6:
            r45 = 0
        L_0x00f8:
            java.lang.String r27 = A03(r0)
            r11 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r8
            r20 = r8
            r21 = r8
            r24 = r8
            r25 = r8
            r26 = r8
            r30 = r29
            r32 = r8
            r33 = r8
            r34 = r8
            r35 = r8
            r40 = r39
            r41 = r3
            r42 = r39
            r43 = r39
            r44 = r39
            r7.A0U(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            goto L_0x00c1
        L_0x0128:
            r2 = r8
            goto L_0x00af
        L_0x012a:
            X.JYm r2 = X.C59793JYm.GALLERY
            goto L_0x0090
        L_0x012e:
            com.instagram.common.session.UserSession r2 = r0.A05
            X.29f r32 = X.JTO.A0c(r2)
            X.JYm r34 = X.C59793JYm.GALLERY
            r49 = 12
            java.util.List r43 = java.util.Collections.emptyList()
            X.0qQ.A07(r43)
            X.8jC r38 = X.C363138jC.A00
            java.util.List r46 = java.util.Collections.emptyList()
            java.util.Map r48 = java.util.Collections.emptyMap()
            android.util.Pair r33 = A00(r8)
            X.JVj r36 = X.C59725JVj.SHARE_SHEET
            java.lang.String r40 = "ig_creation_client_events"
            if (r67 == 0) goto L_0x015b
            boolean r1 = r1.A0L()
            r51 = 1
            if (r1 == 0) goto L_0x015d
        L_0x015b:
            r51 = 0
        L_0x015d:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r37 = new com.instagram.common.gallery.metadata.MediaUploadMetadata
            r52 = r37
            r53 = r8
            r54 = r8
            r55 = r8
            r56 = r8
            r57 = r8
            r58 = r8
            r59 = r8
            r60 = r8
            r61 = r8
            r62 = r8
            r63 = r8
            r64 = r39
            r52.<init>(r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            java.lang.String r42 = A03(r0)
            r35 = r10
            r39 = r8
            r41 = r23
            r44 = r29
            r45 = r29
            r50 = r3
            r32.A0V(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            r0.A09(r10, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59899JbO.A0A(X.28t, com.instagram.reels.prompt.model.PromptStickerModel, java.util.List):void");
    }

    public final void A0B(C16581Uxb uxb, String str, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A04, "instagram_shopping_product_tagging_row_impression");
        A0e.AAJ("waterfall_id", A02(A0e, this, "session_instance_id", A02(A0e, this, "prior_module", str)));
        A0e.AAJ("usage", uxb.A00);
        JTU.A12(A0e, z);
    }

    public final void A0C(C16581Uxb uxb, String str, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A04, "instagram_shopping_product_tagging_row_tap");
        A0e.AAJ("waterfall_id", A02(A0e, this, "session_instance_id", A02(A0e, this, "prior_module", str)));
        A0e.AAJ("usage", uxb.A00);
        JTU.A12(A0e, z);
    }

    public final void A0D(String str) {
        String str2 = this.A02;
        if (str2 != null) {
            27p.A01(this.A05).A0F.A0T(this.A00, str2, str);
        }
    }

    public final void A0F(List list) {
        27r A012 = 27p.A01(this.A05);
        String A032 = A03(this);
        28D r4 = this.A00;
        29Z r1 = A012.A0F;
        0qQ.A0B(r4, 2);
        0Aj A0d = JTR.A0d(r1);
        if (A0d.isSampled()) {
            JTO.A1O(AnonymousClass80P.TEMP_FEED_ALBUM_SELECT, A0d);
            A0d.AAJ("camera_session_id", JTS.A0j(A0d, r1, "IG_FEED_GALLERY_SELECT_ALBUM"));
            A0d.AAJ("camera_session_id", A032);
            JTS.A15(r4, A0d, 2);
            A0d.AAJ("gallery_type", "old_gallery");
            C51973G9u.A14(A0d, "module", 27x.A08.getModuleName());
            A0d.A7p("has_rbs_folder", Boolean.valueOf(27x.A0H(list)));
            A0d.Cgf();
        }
    }

    public final void A0G(List list) {
        27r A012 = 27p.A01(this.A05);
        28D r5 = this.A00;
        String A032 = A03(this);
        29Z r1 = A012.A0F;
        0qQ.A0B(r5, 1);
        0Aj A0d = JTR.A0d(r1);
        if (A0d.isSampled()) {
            JTO.A1O(AnonymousClass80P.TEMP_FEED_GALLERY_ALBUM_PICKER, A0d);
            A0d.AAJ("camera_session_id", JTS.A0j(A0d, r1, "IG_FEED_GALLERY_TAP_ALBUM_PICKER"));
            JTS.A15(r5, A0d, 2);
            A0d.AAJ("camera_session_id", A032);
            AnonymousClass7TH.A0U(A0d);
            C51973G9u.A14(A0d, "gallery_type", "old_gallery");
            A0d.A7p("has_rbs_folder", Boolean.valueOf(27x.A0H(list)));
            A0d.Cgf();
        }
    }

    public C59899JbO(UserSession userSession) {
        this.A05 = userSession;
        this.A04 = AnonymousClass0kN.A01(this, userSession);
    }

    public static final Pair A00(AnonymousClass3Q2 r5) {
        C2802250u r0;
        int i;
        String str;
        C387379m7 r02;
        List list;
        List list2;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (r5 != null) {
            A6E a6e = r5.A18;
            if (!(a6e == null || (list2 = a6e.A02) == null)) {
                A1C.addAll(list2);
            }
            List A0L = r5.A0L();
            if (A0L != null && AnonymousClass7TE.A1b(A0L)) {
                Iterator A0g = JTQ.A0g(r5);
                while (A0g.hasNext()) {
                    A6E a6e2 = JTO.A0m(A0g).A18;
                    if (!(a6e2 == null || (list = a6e2.A02) == null)) {
                        A1C.addAll(list);
                    }
                }
            }
        }
        if (!DbT.A1b(A1C)) {
            return null;
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            A6D a6d = (A6D) it.next();
            AnonymousClass513 r03 = a6d.A00;
            if (!(r03 == null || (r02 = r03.A0E) == null)) {
                String A002 = r02.BkW().A00();
                0qQ.A07(A002);
                A1C2.add(A002);
                A1C3.add(AnonymousClass000.A00(5012));
            }
            AnonymousClass513 r04 = a6d.A00;
            if (!(r04 == null || (r0 = r04.A0X) == null)) {
                C2802550x r05 = r0.A0D;
                if (r05 == null || (str = r05.A00) == null) {
                    i = 0;
                } else {
                    i = str.hashCode();
                }
                A1C2.add(002.A0O("text_sticker_", i));
                A1C3.add(AnonymousClass000.A00(379));
            }
        }
        return new Pair(A1C2, A1C3);
    }

    public static String A02(0Aj r0, C59899JbO jbO, String str, String str2) {
        r0.AAJ(str, str2);
        String str3 = jbO.A02;
        if (str3 == null) {
            return "";
        }
        return str3;
    }
}
