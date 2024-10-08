package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2z7  reason: invalid class name */
public final class AnonymousClass2z7 implements C230332pS {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C228182kv A02;
    public final C249763kK A03;
    public final 1Ua A04;
    public final String A05;

    public AnonymousClass2z7(UserSession userSession, AnonymousClass4DU r3, C228182kv r4, C249763kK r5, 1Ua r6, String str) {
        0qQ.A0B(r6, 2);
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = str;
        this.A00 = userSession;
        this.A03 = r5;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ Object AGb(C254213s7 r26, Object obj, Object obj2, String str) {
        0jB r10;
        C294175lz r5;
        String str2;
        Long l;
        String str3;
        String str4;
        Long l2;
        Double d;
        String str5;
        Long l3;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Boolean bool;
        List list;
        Long l4;
        String Bmx;
        int position;
        C53246Gku gku;
        1Xj r7 = (1Xj) obj;
        AnonymousClass4HA r2 = (AnonymousClass4HA) obj2;
        0qQ.A0B(r7, 0);
        0qQ.A0B(r2, 1);
        C254213s7 r8 = r26;
        0qQ.A0B(r8, 2);
        String str14 = this.A05;
        0xI r9 = null;
        String str15 = str;
        if (0qQ.A0K(str14, "instagram_ad_carousel_vpvd_imp")) {
            C235002z3 r92 = AnonymousClass2z2.A08;
            AnonymousClass4DU r52 = this.A01;
            UserSession userSession = this.A00;
            AnonymousClass3W1 r3 = r2.A01;
            r9 = r92.A00(userSession, r7, r52, r3, this.A03, r8, str14, str15);
            1Xj A1c = r7.A1c(0);
            int i = r2.A00;
            1Xj A1c2 = r7.A1c(i);
            if (!(A1c == null || A1c2 == null)) {
                r9.A08(Integer.valueOf(r7.A0o()), "carousel_size");
                r9.A0C("carousel_cover_media_id", A1c.getId());
                r9.A0C("carousel_media_id", A1c2.getId());
                r9.A08(Integer.valueOf(A1c2.BR7().A00), "carousel_m_t");
                r9.A08(Integer.valueOf(i), "carousel_index");
                String BOq = r7.A0C.BOq();
                if (BOq != null) {
                    r9.A0C("main_feed_carousel_starting_media_id", BOq);
                }
                1Ua r1 = this.A04;
                String A2n = A1c2.A2n();
                if (A2n != null) {
                    r9.A09("client_sub_impression", Boolean.valueOf(!r1.A02(A2n)));
                    if (182.A06(0Tu.A05, userSession, 36312127421678510L)) {
                        r9.A08(Integer.valueOf(r3.A02()), "media_loading_progress");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (r7.CcK() && (gku = r7.A0B) != null) {
                r9.A09("is_multi_ads", true);
                r9.A08(Integer.valueOf(gku.A00), "multi_ads_type");
                r9.A0C("multi_ads_unit_id", gku.A01);
                if (!gku.A04) {
                    r9.A0C("hscroll_seed_ad_id", gku.A03);
                }
            }
        } else if (0qQ.A0K(str14, "instagram_organic_carousel_vpvd_imp")) {
            AnonymousClass4DU r14 = this.A01;
            UserSession userSession2 = this.A00;
            AnonymousClass3W1 r23 = r2.A01;
            C249763kK r22 = this.A03;
            C228182kv r12 = this.A02;
            int i2 = r2.A00;
            1Ua r11 = this.A04;
            0qQ.A0B(r11, 9);
            AnonymousClass0kM r32 = new AnonymousClass0kM(userSession2);
            r32.A00 = r14;
            r32.A01(0kJ.A03);
            0wc A002 = r32.A00();
            0t0 A012 = AnonymousClass0eN.A01(new C58179Inj(userSession2, 20));
            0Aj A003 = A002.A00(A002.A00, "instagram_organic_carousel_vpvd_imp");
            if (A003.isSampled()) {
                1Xj A1c3 = r7.A1c(0);
                1Xj A1c4 = r7.A1c(i2);
                if (A1c4 != null && !A1c4.A5k()) {
                    if (r14 instanceof C232682uF) {
                        r10 = ((C232682uF) r14).E4l(r7);
                    } else {
                        r10 = null;
                    }
                    ArrayList A3K = r7.A3K(true);
                    if (A3K == null || !(!A3K.isEmpty())) {
                        r5 = null;
                    } else {
                        r5 = C294165ly.A04(r7);
                    }
                    C232852uY r4 = new C232852uY(userSession2, r22);
                    if (r10 == null || (str2 = (String) r10.A01(C271774jZ.A9D)) == null || str2.length() == 0) {
                        C245923dh B2s = r7.A0C.B2s();
                        if (B2s != null) {
                            str2 = B2s.BIM();
                        } else {
                            str2 = null;
                        }
                    }
                    String A052 = 1Xv.A05(A1c4.getId());
                    A003.A8D("max_duration_ms", Double.valueOf((double) r8.A04));
                    A003.A9F("carousel_index", Long.valueOf((long) i2));
                    A003.AAJ("inventory_source", r7.A0C.BIl());
                    A003.AAJ("tracking_token", C254443sU.A0E(userSession2, r7, r14));
                    if (!r23.A0p() || (position = r23.getPosition()) == -1) {
                        l = null;
                    } else {
                        l = Long.valueOf((long) position);
                    }
                    A003.A9F("m_ix", l);
                    String id = r7.getId();
                    if (id != null) {
                        String A042 = 1Xv.A04(id);
                        0qQ.A0B(A042, 0);
                        A003.A9F("media_author_id", 00y.A0n(10, A042));
                        A003.AAJ("ranking_session_id", r22.getSessionId());
                        if (r12 != null) {
                            str3 = r12.A00;
                        } else {
                            str3 = null;
                        }
                        A003.AAJ("feed_session_id", str3);
                        if (r10 != null) {
                            str4 = (String) r10.A01(C271774jZ.A1C);
                        } else {
                            str4 = null;
                        }
                        A003.AAJ("chaining_session_id", str4);
                        if (r10 != null) {
                            l2 = (Long) r10.A01(C271774jZ.A1A);
                        } else {
                            l2 = null;
                        }
                        A003.A9F("chaining_position", l2);
                        A003.A9F("chaining_seed_author_id", (Long) null);
                        A003.A9F("chaining_seed_media_id", (Long) null);
                        A003.AAJ(C21058XCk.A01(21, 10, 4), C254443sU.A0A(r10, r4));
                        A003.AAJ("follow_status", C254443sU.A0D(userSession2, r7));
                        A003.A9F("media_index", (Long) null);
                        A003.A8D("sum_duration_ms", Double.valueOf((double) r8.A05));
                        String A2n2 = A1c4.A2n();
                        if (A2n2 != null) {
                            A003.A7p("client_sub_impression", Boolean.valueOf(!r11.A02(A2n2)));
                            long j = r8.A02;
                            if (j > 500) {
                                d = Double.valueOf((double) j);
                            } else {
                                d = null;
                            }
                            A003.A8D("legacy_duration_ms", d);
                            if (A1c3 != null) {
                                str5 = A1c3.getId();
                            } else {
                                str5 = null;
                            }
                            A003.AAJ("carousel_cover_media_id", str5);
                            A003.AAJ("carousel_media_id", A052);
                            A003.A9F("carousel_media_id_int", C254543se.A00(A052));
                            String BOq2 = r7.A0C.BOq();
                            if (BOq2 != null) {
                                l3 = 00y.A0n(10, BOq2);
                            } else {
                                l3 = null;
                            }
                            A003.A9F("carousel_starting_media_id", l3);
                            A003.A9F("carousel_container_media_id", (Long) null);
                            A003.A9F("carousel_cover_media_id_int", (Long) null);
                            A003.A8M(A1c4.BR7().A00(), "carousel_media_type");
                            A003.AAJ("delivery_flags", C243413Yr.A00(r7.A0e));
                            A003.A9F("media_loading_progress", Long.valueOf((long) r23.A02()));
                            A003.AAJ("topic_cluster_id", str2);
                            if (r10 != null) {
                                str6 = (String) r10.A01(C271774jZ.A9F);
                            } else {
                                str6 = null;
                            }
                            A003.AAJ("topic_cluster_title", str6);
                            if (r10 != null) {
                                str7 = (String) r10.A01(C271774jZ.A9G);
                            } else {
                                str7 = null;
                            }
                            A003.AAJ("topic_cluster_type", str7);
                            if (r10 != null) {
                                str8 = (String) r10.A01(C271774jZ.A9C);
                            } else {
                                str8 = null;
                            }
                            A003.AAJ("topic_cluster_debug_info", str8);
                            A003.AAJ("mezql_token", r7.A0C.getMezqlToken());
                            A003.AAJ("hashtag_follow_status", C254443sU.A0B(r10, r7));
                            A003.A9F("hashtag_id", C254443sU.A04(r10, r7));
                            A003.AAJ("hashtag_name", C254443sU.A0C(r10, r7));
                            A003.AAJ("nav_chain", str15);
                            if (r10 != null) {
                                str9 = (String) r10.A01(C297705sC.A06);
                            } else {
                                str9 = null;
                            }
                            A003.AAJ("entity_type", str9);
                            A003.A9F("entity_id", C254443sU.A02(r10));
                            if (r10 != null) {
                                str10 = (String) r10.A01(C297705sC.A02);
                            } else {
                                str10 = null;
                            }
                            A003.AAJ("entity_name", str10);
                            A003.AAJ("entity_page_name", C254443sU.A09(r10));
                            A003.A9F("entity_page_id", C254443sU.A03(r10));
                            if (r10 != null) {
                                str11 = (String) r10.A01(AnonymousClass5m1.A00);
                            } else {
                                str11 = null;
                            }
                            A003.AAJ("media_thumbnail_section", str11);
                            if (r10 != null) {
                                str12 = (String) r10.A01(C52240GKh.A00);
                            } else {
                                str12 = null;
                            }
                            A003.AAJ("collection_id", str12);
                            if (r10 != null) {
                                str13 = (String) r10.A01(C52240GKh.A01);
                            } else {
                                str13 = null;
                            }
                            A003.AAJ("collection_name", str13);
                            A003.AAJ("action", C254443sU.A0F(r7));
                            A003.AAK((0bb) null, "location_info");
                            A003.AAJ("module_name", (String) null);
                            A003.AAJ("source_of_like", (String) null);
                            A003.AAJ("ranking_info_token", r7.A0C.getLoggingInfoToken());
                            A003.AAJ("feed_request_id", r7.A0R);
                            int i3 = r23.A0W;
                            Long l5 = null;
                            if (!(Integer.valueOf(i3) == null || i3 == -1)) {
                                l5 = Long.valueOf((long) i3);
                            }
                            A003.A9F("recs_ix", l5);
                            A003.A9F("product_id", (Long) null);
                            A003.A9F("merchant_id", (Long) null);
                            if (r5 != null) {
                                bool = r5.A01;
                            } else {
                                bool = null;
                            }
                            A003.A7p("is_checkout_enabled", bool);
                            A003.A7p("can_add_to_bag", (Boolean) null);
                            if (r5 != null) {
                                list = r5.A03;
                            } else {
                                list = null;
                            }
                            A003.AAe("product_ids", list);
                            A003.AAe("drop_product_ids", (List) null);
                            A003.AAe("shared_product_ids", (List) null);
                            A003.A7p("is_user_following_merchant", (Boolean) null);
                            A003.A9H("product_merchant_ids", (Map) null);
                            A003.A9F("reel_size", (Long) null);
                            A003.A9F("reel_position", (Long) null);
                            A003.A9F("tray_position", (Long) null);
                            A003.A9F("reel_viewer_position", (Long) null);
                            A012.getValue();
                            A003.AAJ("direct_reshare_hub_session_id", (String) null);
                            0bb r33 = new 0bb();
                            r33.A05("view_height", Long.valueOf((long) r8.A00));
                            r33.A05("view_width", Long.valueOf((long) r8.A01));
                            r33.A03("is_paged", Boolean.valueOf(C294375mL.A00(r23)));
                            r33.A03("motion_tilt", false);
                            A003.AAK(r33, "view_metadata");
                            C46300DUd Bmy = r7.A0C.Bmy();
                            if (Bmy == null || (Bmx = Bmy.Bmx()) == null) {
                                l4 = null;
                            } else {
                                l4 = 00y.A0n(10, Bmx);
                            }
                            A003.A9F("repost_id", l4);
                            A003.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                            A003.AAJ("device_aspect_ratio_category", C254473sX.A00);
                            A003.AAJ("device_fold_orientation", C254483sY.A00);
                            A003.AAJ("device_fold_state", C254493sZ.A00);
                            A003.A7p("device_is_in_multi_window_mode", C254503sa.A00);
                            A003.Cgf();
                            return null;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        return r9;
    }

    public final /* bridge */ /* synthetic */ 0xI AM0(Object obj) {
        0xI r2 = (0xI) obj;
        0qQ.A0B(r2, 0);
        return r2;
    }
}
