package X;

import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6bb  reason: invalid class name and case insensitive filesystem */
public abstract class C310776bb implements C230332pS {
    public final C310756bZ A00;

    public 0xI A00(C310756bZ r26, C254213s7 r27, Object obj, Object obj2, String str) {
        C250973mM r10;
        C255773uh r9;
        boolean z;
        C309426Yf r7;
        int i;
        String str2;
        Object obj3 = obj;
        Object obj4 = obj2;
        C310756bZ r14 = r26;
        0qQ.A0B(r14, 0);
        boolean z2 = this instanceof C306156La;
        boolean z3 = z2;
        if (z2) {
            r10 = (C250973mM) obj3;
            0qQ.A0B(r10, 0);
        } else {
            AnonymousClass6YY r1 = (AnonymousClass6YY) obj4;
            0qQ.A0B(r1, 1);
            r10 = r1.A00;
        }
        if (this instanceof C310766ba) {
            r9 = (C255773uh) obj3;
            0qQ.A0B(r9, 0);
        } else {
            C306176Ld r12 = (C306176Ld) obj4;
            0qQ.A0B(r12, 1);
            r9 = r12.A01;
        }
        if (z3) {
            C306176Ld r0 = (C306176Ld) obj4;
            z = true;
            0qQ.A0B(r0, 1);
            r7 = r0.A02;
        } else {
            AnonymousClass6YY r02 = (AnonymousClass6YY) obj4;
            z = true;
            0qQ.A0B(r02, 1);
            r7 = r02.A02;
        }
        UserSession userSession = r14.A00;
        AnonymousClass4DU r15 = r14.A01;
        String str3 = r14.A05;
        AnonymousClass3BQ r23 = r14.A02;
        1Ua r22 = r14.A04;
        C249763kK r17 = r14.A03;
        String str4 = r14.A07;
        Reel reel = r10.A0H;
        Integer num = reel.A0g;
        if (182.A06(0Tu.A05, userSession, 36312604162917573L)) {
            r15 = new AnonymousClass6KG(r15, reel, r23);
        }
        double d = ((double) (r7.A0B * r7.A0A)) / 1000.0d;
        0xI A002 = 0xI.A00(r15, str3);
        A002.A0C("viewer_session_id", r17.getSessionId());
        A002.A0C("tray_session_id", str4);
        A002.A0C("reel_id", r9.A0k);
        A002.A0C("m_pk", r9.A0j);
        A002.A08(Integer.valueOf(r10.A0E), "tray_position");
        A002.A08(Integer.valueOf(r10.A02(userSession)), "reel_size");
        A002.A08(Integer.valueOf(C250973mM.A00(userSession, r10).indexOf(r9)), "reel_position");
        A002.A0C("reel_type", reel.A0H(userSession));
        String A003 = AnonymousClass6LA.A00(userSession, r15, r9);
        if (A003 != null) {
            A002.A0C("tracking_token", A003);
        }
        if (r9.A0C() != null) {
            i = r9.A0C().A00;
        } else {
            i = -1;
        }
        A002.A08(Integer.valueOf(i), "m_t");
        A002.A0A("time_elapsed", Double.valueOf(d));
        A002.A0A("time_remaining", Double.valueOf((((double) r7.A0A) / 1000.0d) - d));
        A002.A0A("time_paused", Double.valueOf(r7.A03));
        if (z3) {
            C306176Ld r122 = (C306176Ld) obj4;
            0qQ.A0B(r122, z ? 1 : 0);
            StringBuilder sb = new StringBuilder();
            sb.append("carousel_transformation_reel_item_");
            C255773uh r3 = r122.A01;
            sb.append(r3.A0j);
            sb.append("_segment_");
            sb.append(r122.A00);
            sb.append("_token_");
            sb.append(r3.ByO(((C306156La) this).A00.A00));
            str2 = sb.toString();
        } else {
            C255773uh r13 = (C255773uh) obj3;
            0qQ.A0B(r13, 0);
            str2 = r13.A0j;
            0qQ.A07(str2);
        }
        A002.A09("client_sub_impression", Boolean.valueOf(!r22.A02(str2)));
        A002.A09("is_media_loaded", Boolean.valueOf(r7.A0l));
        A002.A09("is_highlights_sourced", Boolean.valueOf(r9.A1J()));
        A002.A0C("story_ranking_token", r14.A06);
        A002.A0C("nav_chain", str);
        A002.A09("has_translation", Boolean.valueOf(r9.A10()));
        A002.A08(num, "dynamic_story_duration");
        C254213s7 r32 = r27;
        C300025wP.A00(A002, r32);
        if (r9.CcK()) {
            List list = reel.A0w;
            if (list != null) {
                int indexOf = C250973mM.A00(userSession, r10).indexOf(r9);
                A002.A0D("carousel_transformation_cards", AnonymousClass6LD.A00(list));
                A002.A08(Integer.valueOf(C297785sK.A03(list)), "reel_size");
                A002.A08(Integer.valueOf(C297785sK.A04(list, indexOf)), "reel_position");
                A002.A08(Integer.valueOf(list.size()), "segment_count");
                A002.A08(Integer.valueOf(indexOf), "segment_index");
            }
            boolean z4 = false;
            if (r7.A0V != null) {
                z4 = true;
            }
            A002.A09("is_end_scene_shown", Boolean.valueOf(z4));
            A002.A0C("end_scene_subtitle", r7.A0Y);
            0Tu r72 = 0Tu.A06;
            A002.A09("is_merlin_double_logging_enabled", Boolean.valueOf(182.A06(r72, userSession, 36313437387229161L)));
            if (new C234002wp(userSession).A04()) {
                C234002wp r16 = new C234002wp(userSession);
                1Xj r03 = r9.A0b;
                C234032ws r6 = r16.A04;
                boolean A05 = r16.A05(r03);
                boolean z5 = true;
                if (r23 != AnonymousClass3BQ.ADS_HISTORY) {
                    z5 = false;
                }
                if (A05) {
                    ArrayList arrayList = new ArrayList();
                    if (!182.A06(r72, r6.A00, 36324840524820886L)) {
                        arrayList.add("launcher_not_enabled");
                    }
                    if (HQQ.A03) {
                        arrayList.add("delay_skip_in_progress");
                    }
                    if (HQQ.A02) {
                        arrayList.add("cap_rule_not_expired");
                    }
                    if (z5) {
                        arrayList.add("unsupported_viewer_source");
                    }
                    if (arrayList.isEmpty()) {
                        A002.A09("is_rendered_as_delayed_skip", Boolean.valueOf(z));
                    } else {
                        A002.A09("is_rendered_as_delayed_skip", false);
                        A002.A0D("delayed_skip_ad_ineligible_reasons", arrayList);
                    }
                }
            }
            if (!r9.A1m() && (r32.A04 >= 2000 || r32.A05 >= 2000)) {
                A002.A09("is_ad_engaged_view", Boolean.valueOf(z));
            }
        } else {
            A002.A09("is_merlin_double_logging_enabled", Boolean.valueOf(182.A06(0Tu.A06, userSession, 36313437386639328L)));
        }
        IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
        if (intentAwareAdsInfo != null) {
            A002.A09("is_multi_ads", Boolean.valueOf(z));
            A002.A08(intentAwareAdsInfo.A02, "multi_ads_type");
            A002.A0C("hscroll_seed_ad_id", intentAwareAdsInfo.A07);
            A002.A0C("multi_ads_unit_id", intentAwareAdsInfo.A06);
            A002.A0C("intent_aware_ads_trigger_type", intentAwareAdsInfo.A09);
        }
        A002.A08(24, "imp_logger_ver");
        return A002;
    }

    public final /* bridge */ /* synthetic */ Object AGb(C254213s7 r32, Object obj, Object obj2, String str) {
        C255773uh r1;
        boolean z;
        Long l;
        String str2;
        int i;
        String str3;
        C2801750l BDc;
        List AZX;
        C2801550j r0;
        List list;
        Object obj3 = obj2;
        Object obj4 = obj;
        C254213s7 r10 = r32;
        0qQ.A0B(r10, 2);
        boolean z2 = this instanceof C310766ba;
        if (z2) {
            r1 = (C255773uh) obj4;
            0qQ.A0B(r1, 0);
        } else {
            C306176Ld r12 = (C306176Ld) obj3;
            0qQ.A0B(r12, 1);
            r1 = r12.A01;
        }
        String str4 = str;
        if (!r1.CcK()) {
            C310756bZ r7 = this.A00;
            UserSession userSession = r7.A00;
            0Tu r26 = 0Tu.A06;
            if (!182.A06(r26, userSession, 36313437386639328L)) {
                if (!z2) {
                    return null;
                }
                C255773uh r8 = (C255773uh) obj4;
                AnonymousClass6YY r2 = (AnonymousClass6YY) obj3;
                0qQ.A0B(r8, 1);
                0qQ.A0B(r2, 2);
                C250973mM r9 = r2.A00;
                AnonymousClass3BQ r3 = r7.A02;
                AnonymousClass4DU r11 = r7.A01;
                Reel reel = r9.A0H;
                Integer num = reel.A0g;
                if (182.A06(0Tu.A05, userSession, 36312604162917573L)) {
                    r11 = new AnonymousClass6KG(r11, reel, r3);
                }
                0wc A01 = AnonymousClass0kN.A01(r11, userSession);
                0Aj A002 = A01.A00(A01.A00, "instagram_organic_vpvd_imp");
                if (!A002.isSampled()) {
                    return null;
                }
                1Ua r29 = r7.A04;
                C249763kK r28 = r7.A03;
                String str5 = r7.A07;
                C309426Yf r4 = r2.A02;
                double d = ((double) (r4.A0B * r4.A0A)) / 1000.0d;
                int indexOf = C250973mM.A00(userSession, r9).indexOf(r8);
                if (r9.A06 || r4.A00 < 0.25d) {
                    z = false;
                } else {
                    z = true;
                    r9.A06 = true;
                }
                Long l2 = null;
                if (num != null) {
                    l = Long.valueOf((long) num.intValue());
                } else {
                    l = null;
                }
                1Xj r02 = r8.A0b;
                if (r02 == null || (BDc = r02.A0C.BDc()) == null || (AZX = BDc.AZX()) == null || (r0 = (C2801550j) AZX.get(0)) == null) {
                    str2 = null;
                } else {
                    str2 = r0.Bkc();
                    if (str2 != null) {
                        List A03 = new 11S(":").A03(str2);
                        if (!A03.isEmpty()) {
                            ListIterator listIterator = A03.listIterator(A03.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (((String) listIterator.previous()).length() != 0) {
                                        list = 00k.A0d(A03, listIterator.nextIndex() + 1);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            l2 = Long.valueOf(Long.parseLong(((String[]) list.toArray(new String[0]))[1]));
                        }
                        list = 0sn.A00;
                        l2 = Long.valueOf(Long.parseLong(((String[]) list.toArray(new String[0]))[1]));
                    }
                }
                A002.A8D("max_duration_ms", Double.valueOf((double) r10.A04));
                A002.A8D("sum_duration_ms", Double.valueOf((double) r10.A05));
                A002.A8D("legacy_duration_ms", Double.valueOf((double) r10.A02));
                A002.AAJ("tracking_token", AnonymousClass6LA.A00(userSession, r11, r8));
                String str6 = r8.A0j;
                A002.AAJ("m_pk", str6);
                if (r8.A0C() != null) {
                    i = r8.A0C().A00;
                } else {
                    i = -1;
                }
                A002.AAJ("m_t", String.valueOf(i));
                A002.AAJ("reel_id", r8.A0k);
                A002.AAJ("tray_session_id", str5);
                A002.AAJ("viewer_session_id", r28.getSessionId());
                A002.A9F("reel_position", Long.valueOf((long) indexOf));
                A002.A9F("reel_viewer_position", Long.valueOf((long) r4.A0I));
                A002.AAJ("reel_type", reel.A0H(userSession));
                A002.A9F("reel_size", Long.valueOf((long) r9.A02(userSession)));
                A002.A9F("tray_position", Long.valueOf((long) r9.A0E));
                A002.A8D("time_elapsed", Double.valueOf(d));
                A002.A8D("time_remaining", Double.valueOf((((double) r4.A0A) / 1000.0d) - d));
                A002.A8D("time_paused", Double.valueOf(r4.A03));
                A002.A7p("is_highlights_sourced", Boolean.valueOf(r8.A1J()));
                A002.AAJ("story_ranking_token", r7.A06);
                A002.A8D("client_receive_time", Double.valueOf((double) TimeUnit.MILLISECONDS.toSeconds(1Au.A00(userSession).A01.getLong("last_stories_tray_request_timestamp", -1))));
                A002.A7p("client_sub_impression", Boolean.valueOf(!r29.A02(str6)));
                A002.A7p("is_media_loaded", Boolean.valueOf(r4.A0l));
                A002.AAJ("nav_chain", str4);
                A002.A7p("is_merlin_double_logging_enabled", Boolean.valueOf(182.A06(r26, userSession, 36313437386639328L)));
                A002.A7p("is_from_merlin_infra", false);
                A002.A7p("has_translation", Boolean.valueOf(r8.A10()));
                A002.AAe("attribution_type", Collections.unmodifiableList(r4.A1D));
                A002.A9F("highlight_id", l2);
                A002.AAJ("highlight_reel_id", str2);
                A002.A7p("is_stories_pog_impression", Boolean.valueOf(z));
                A002.A9F("dynamic_story_duration", l);
                AnonymousClass3HV r03 = reel.A0M;
                if (!(r03 == null || (str3 = r03.A0X) == null)) {
                    A002.AAJ("ranking_info_token", str3);
                }
                A002.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
                A002.AAJ("canonical_nav_chain_previous", AnonymousClass3LH.A00);
                A002.A9F("canonical_nav_chain_delta_ms_since_last_update", Long.valueOf(AnonymousClass3LI.A01.now() - AnonymousClass3LI.A00));
                A002.AAJ("device_aspect_ratio_category", C254473sX.A00);
                A002.AAJ("device_fold_orientation", C254483sY.A00);
                A002.AAJ("device_fold_state", C254493sZ.A00);
                A002.A7p("device_is_in_multi_window_mode", C254503sa.A00);
                A002.Cgf();
                return null;
            }
        }
        return A00(this.A00, r10, obj4, obj3, str4);
    }

    public final /* bridge */ /* synthetic */ 0xI AM0(Object obj) {
        0xI r2 = (0xI) obj;
        0qQ.A0B(r2, 0);
        return r2;
    }

    public C310776bb(C310756bZ r1) {
        this.A00 = r1;
    }
}
