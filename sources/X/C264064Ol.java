package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Ol  reason: invalid class name and case insensitive filesystem */
public final class C264064Ol implements AnonymousClass0iw, C264074Om {
    public static final String __redex_internal_original_name = "ARPlatformLoggerImpl";
    public final 0wc A00;
    public final UserSession A01;
    public final 02m A02;
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();

    public final void Chl(C279294yP r5, AnonymousClass90C r6, String str, String str2) {
        0qQ.A0B(r6, 3);
        29R r3 = 27p.A01(this.A01).A09;
        1Ln A08 = 1Ln.A08(r3.A01);
        if (A08.A00.isSampled()) {
            A08.A0t("IG_EFFECT_DISCOVERY_CATEGORY_TAP");
            A08.A0r("EFFECT_DISCOVERY_CATEGORY_TAP");
            29R.A00(A08, r3);
            A08.A0b(28D.A5J);
            A08.A0W(2);
            A08.A0d(C59725JVj.EFFECT_DISCOVERY);
            A08.A0R("discovery_session_id", str);
            A08.A0R("effect_collection", str2);
            A08.A0M(r6, "effect_gallery_type");
            A08.A0a(r5);
            A08.A0u(AnonymousClass1QI.A00.A02.A00);
            A08.A0N(2AL.A07(r3.A00, r3.A03), "system_info");
            A08.Cgf();
        }
    }

    public final void Chm(28D r7, String str, String str2) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        29R r5 = 27p.A01(this.A01).A09;
        Long A0n = 00y.A0n(10, str);
        Long A0n2 = 00y.A0n(10, str2);
        if (A0n != null && A0n2 != null) {
            1Ln A08 = 1Ln.A08(r5.A01);
            if (A08.A00.isSampled()) {
                A08.A0t("IG_CAMERA_EFFECT_GALLERY_PICKER_BUTTON_TAPPED");
                A08.A0r("EFFECT_GALLERY_PICKER_BUTTON_TAPPED");
                29R.A00(A08, r5);
                List singletonList = Collections.singletonList(A0n);
                0qQ.A07(singletonList);
                A08.A0S("applied_effect_ids", singletonList);
                List singletonList2 = Collections.singletonList(A0n2);
                0qQ.A07(singletonList2);
                A08.A0S(AnonymousClass000.A00(67), singletonList2);
                A08.A0b(r7);
                A08.A0W(2);
                A08.A0n(27x.A08.getModuleName());
                A08.A0d(C59725JVj.EFFECT_DISCOVERY);
                A08.A0u(AnonymousClass1QI.A00.A02.A00);
                A08.Cgf();
            }
        }
    }

    public final void Chn(28D r7, 28t r8, String str, String str2) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 3);
        29R r3 = 27p.A01(this.A01).A09;
        Long A08 = 2AL.A08(str);
        Long A082 = 2AL.A08(str2);
        if (A08 != null && A082 != null) {
            1Ln A083 = 1Ln.A08(r3.A01);
            if (A083.A00.isSampled()) {
                A083.A0t("IG_CAMERA_EFFECT_GALLERY_PICKER_MEDIA_SELECTED");
                A083.A0r("EFFECT_GALLERY_PICKER_MEDIA_SELECTED");
                29R.A00(A083, r3);
                List singletonList = Collections.singletonList(A08);
                0qQ.A07(singletonList);
                A083.A0S("applied_effect_ids", singletonList);
                List singletonList2 = Collections.singletonList(A082);
                0qQ.A07(singletonList2);
                A083.A0S(AnonymousClass000.A00(67), singletonList2);
                A083.A0V(3);
                A083.A0Q(AnonymousClass000.A00(137), 0L);
                A083.A0M(C360948fP.GALLERY, "capture_type");
                A083.A0b(r7);
                A083.A0T();
                A083.A0c(r8);
                A083.A0n(27x.A08.getModuleName());
                A083.A0d(C59725JVj.PRE_CAPTURE);
                A083.A0u(AnonymousClass1QI.A00.A02.A00);
                A083.A0N(2AL.A07(r3.A00, r3.A03), "system_info");
                A083.Cgf();
            }
        }
    }

    public final void Cho(C279294yP r5, C391589tK r6, 28D r7, C59725JVj jVj, String str) {
        0qQ.A0B(r6, 2);
        0qQ.A0B(jVj, 4);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_effect_page_open");
        if (A002.isSampled()) {
            if (r7 == null) {
                r7 = 28D.A5J;
            }
            A002.A8M(r7, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.A8k("event_type", 2);
            A002.AAJ("module", str);
            A002.A8M(jVj, "surface");
            A002.A8M(r6, "effect_page_entry_point");
            A002.A8M(r5, "camera_destination");
            String str2 = 27p.A01(this.A01).A04.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A002.AAJ("camera_session_id", str2);
            A002.Cgf();
        }
    }

    public final void Chp(C279294yP r17, AnonymousClass0iw r18, String str, String str2, String str3, List list, List list2) {
        String str4 = str;
        0qQ.A0B(str4, 0);
        List list3 = list;
        0qQ.A0B(list3, 3);
        AnonymousClass0iw r10 = r18;
        0qQ.A0B(r10, 6);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "effect_gallery_search_result");
        List list4 = list2;
        String str5 = str3;
        String str6 = str2;
        C279294yP r3 = r17;
        if (A002.isSampled()) {
            A002.A8k("event_type", 2);
            A002.AAJ("module", r10.getModuleName());
            A002.AAJ("query_text", str4);
            A002.AAe("results_creator_list", list3);
            A002.AAe("results_effect_list", list4);
            A002.A8M(C59725JVj.EFFECT_DISCOVERY, "surface");
            A002.AAJ("camera_session_id", 27p.A01(this.A01).A04.A0L);
            A002.AAJ("discovery_session_id", str6);
            A002.A8M((AnonymousClass0Ac) null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.AAJ("search_session_id", str5);
            A002.A8M(r3, "camera_destination");
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.Cgf();
        }
        AnonymousClass29S r6 = 27p.A01(this.A01).A08;
        0wc r12 = r6.A01;
        String A003 = AnonymousClass000.A00(303);
        0kJ r11 = r12.A00;
        0Aj A004 = r12.A00(r11, A003);
        if (A004.isSampled()) {
            A004.AAJ("entity", "EFFECT_GALLERY_SEARCH_RESULT");
            AnonymousClass283 r14 = r6.A04;
            A004.A8M(r14.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A004.A8k("event_type", 2);
            A004.A8M(C59725JVj.EFFECT_DISCOVERY, "surface");
            String str7 = r14.A0L;
            if (str7 == null) {
                str7 = "";
            }
            A004.AAJ("camera_session_id", str7);
            A004.AAJ("module", r10.getModuleName());
            A004.AAJ("legacy_falco_event_name", "EFFECT_GALLERY_SEARCH_RESULT");
            A004.AAJ("query_text", str4);
            A004.AAe("results_creator_list", list3);
            A004.AAe("results_effect_list", list4);
            A004.AAJ("discovery_session_id", str6);
            A004.AAJ("search_session_id", str5);
            A004.A8M(r3, "camera_destination");
            A004.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A004.Cgf();
        }
        0Aj A005 = r12.A00(r11, AnonymousClass000.A00(1431));
        if (A005.isSampled()) {
            A005.AAJ("legacy_falco_event_name", "EFFECT_GALLERY_SEARCH_RESULT");
            A005.AAJ("entity", "EFFECT_GALLERY_SEARCH_RESULT");
            A005.A8k("event_type", 2);
            A005.AAJ("module", r10.getModuleName());
            A005.AAJ("query_text", str4);
            A005.AAe("results_creator_list", list3);
            A005.AAe("results_effect_list", list4);
            A005.A8M(C59725JVj.EFFECT_DISCOVERY, "surface");
            A005.AAJ("camera_session_id", r6.A04.A0L);
            A005.AAJ("discovery_session_id", str6);
            A005.A8M((AnonymousClass0Ac) null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A005.AAJ("search_session_id", str5);
            A005.A8M(r3, "camera_destination");
            A005.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A005.Cgf();
        }
    }

    public final void Chq(AnonymousClass0iw r5, String str, String str2) {
        0qQ.A0B(r5, 2);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "effect_gallery_search_session_initiated");
        if (A002.isSampled()) {
            A002.AAJ("discovery_session_id", str);
            A002.A8k("event_type", 2);
            A002.AAJ("module", r5.getModuleName());
            A002.AAJ("search_session_id", str2);
            A002.A8M(C59725JVj.EFFECT_DISCOVERY, "surface");
            A002.AAJ("camera_session_id", 27p.A01(this.A01).A04.A0L);
            A002.A8M((AnonymousClass0Ac) null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.Cgf();
        }
    }

    public final void Chr(28D r7, AnonymousClass0iw r8, String str, String str2) {
        0qQ.A0B(r8, 3);
        String str3 = (String) this.A03.get(str);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "ig_camera_effect_try_it_tapped");
        A002.AAJ("effect_id", str);
        UserSession userSession = this.A01;
        A002.AAE(C263944Ny.A00(userSession.A06), "pk");
        A002.A8M(r7, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A002.A9F("media_attributed_author_id", 2AL.A08(str2));
        A002.AAJ("module", r8.getModuleName());
        if (str3 == null) {
            str3 = "";
        }
        A002.AAJ("channel_pk", str3);
        A002.AAJ("discovery_session_id", (String) this.A04.get(str));
        A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
        A002.AAK(2AL.A07(this.A02, userSession), "system_info");
        A002.Cgf();
    }

    public final void Cjh(String str, String str2, int i, int i2) {
        0qQ.A0B(str2, 1);
        AnonymousClass0iw r5 = C17169VKy.A05;
        0qQ.A08(r5);
        Long A0n = 00y.A0n(10, str2);
        if (A0n == null) {
            0wb.A03(__redex_internal_original_name, 002.A0R("logEffectVideoTap has invalid effectId: ", str2));
            return;
        }
        0wc r3 = this.A00;
        0Aj A002 = r3.A00(r3.A00, "ig_effect_discovery_video_tap");
        if (A002.isSampled()) {
            String str3 = 27p.A01(this.A01).A04.A0L;
            if (str3 == null) {
                str3 = "";
            }
            A002.AAJ("camera_session_id", str3);
            A002.AAJ("discovery_item_type", "grid_item");
            A002.AAJ("discovery_session_id", str);
            A002.A8M(28D.A5J, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.A8k("event_type", 2);
            A002.AAJ("module", r5.getModuleName());
            Long valueOf = Long.valueOf((long) i);
            A002.A9F("position", valueOf);
            Long valueOf2 = Long.valueOf((long) i2);
            A002.A9F("row", valueOf2);
            A002.A8M(C59725JVj.EFFECT_DISCOVERY, "surface");
            A002.A9F("video_position_in_row", valueOf);
            A002.A9F("video_row", valueOf2);
            A002.A8k("camera_position", 3);
            A002.A9F(AnonymousClass000.A00(137), 0L);
            A002.A8M(C360948fP.NORMAL, "capture_type");
            A002.AAJ("channel_pk", "effect_profile_tab");
            A002.A9F("effect_id", A0n);
            A002.AAJ("grouping_pk", "");
            A002.A8M(28t.A06, "media_type");
            A002.AAJ("search_session_id", "");
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.Cgf();
        }
    }

    public final void CkB(C391589tK r7, 28D r8, String str, String str2, String str3, String str4) {
        String A0R;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        0qQ.A0B(str4, 3);
        UserSession userSession = this.A01;
        if (2AL.A08(userSession.A06) == null) {
            A0R = "logSaveEffect has invalid userId.";
        } else {
            Long A0n = 00y.A0n(10, str);
            if (A0n == null) {
                A0R = 002.A0R("logSaveEffect has invalid effectId: ", str);
            } else {
                Long A08 = 2AL.A08(str3);
                0wc r2 = this.A00;
                0Aj A002 = r2.A00(r2.A00, "ig_camera_save_effect_to_camera");
                List singletonList = Collections.singletonList(A0n);
                0qQ.A07(singletonList);
                A002.AAe("applied_effect_ids", singletonList);
                A002.A8k("event_type", 2);
                A002.AAJ("module", str4);
                A002.AAJ("save_effect_surface", str2);
                A002.A8M(r7, "effect_page_entry_point");
                A002.A8M(r8, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                List singletonList2 = Collections.singletonList(A0n);
                0qQ.A07(singletonList2);
                A002.AAe(AnonymousClass000.A00(67), singletonList2);
                A002.A8M(C360948fP.NORMAL, "capture_type");
                A002.AAJ("camera_session_id", 27p.A01(userSession).A04.A0L);
                A002.A9F("media_attributed_author_id", A08);
                A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A002.AAK(2AL.A07(this.A02, userSession), "system_info");
                A002.Cgf();
                return;
            }
        }
        0wb.A03(__redex_internal_original_name, A0R);
    }

    public final void CkY(C279294yP r7, AnonymousClass90C r8, String str, int i) {
        AnonymousClass0iw r5;
        0qQ.A0B(r8, 3);
        UserSession userSession = this.A01;
        if (2AL.A08(userSession.A06) == null) {
            0wb.A03(__redex_internal_original_name, "logStartEffectDiscoverySession has invalid data.");
            return;
        }
        if (i == 1) {
            r5 = C17169VKy.A07;
        } else if (i != 2) {
            if (i != 17) {
                switch (i) {
                    case 4:
                    case 6:
                        r5 = C17169VKy.A02;
                        break;
                    case 5:
                        r5 = C17169VKy.A05;
                        break;
                    case 7:
                        r5 = C17169VKy.A06;
                        break;
                    case 8:
                        r5 = C17169VKy.A03;
                        break;
                    case 9:
                    case 10:
                    case 13:
                    case 14:
                        break;
                    case 11:
                        r5 = C17169VKy.A0C;
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        r5 = C17169VKy.A0A;
                        break;
                    default:
                        0wb.A03("ARPlatformLoggerHelper", "getAnalyticsModule() unknown entry point.");
                        r5 = C17169VKy.A02;
                        break;
                }
            }
            r5 = C17169VKy.A04;
        } else {
            r5 = C17169VKy.A01;
        }
        this.A05.put(str, r5);
        0wc A012 = AnonymousClass0kN.A01(r5, userSession);
        0Aj A002 = A012.A00(A012.A00, "ig_effect_discovery_entry");
        int i2 = 2;
        A002.A8k("event_type", 2);
        A002.A8M(C59725JVj.EFFECT_DISCOVERY, "surface");
        A002.AAJ("module", r5.getModuleName());
        A002.AAJ("discovery_session_id", str);
        String str2 = 27p.A01(userSession).A04.A0L;
        if (str2 == null) {
            str2 = "";
        }
        A002.AAJ("camera_session_id", str2);
        A002.AAe("camera_tools", 0sn.A00);
        A002.A8M(r7, "camera_destination");
        A002.A8M(r8, "effect_gallery_type");
        if (i != 9) {
            if (i == 10) {
                i2 = 1;
            } else if (i == 13) {
                i2 = 3;
            } else if (i != 14) {
                i2 = 5;
                if (i != 17) {
                    i2 = AnonymousClass972.MUTABLE_FLAG_MASK;
                }
            } else {
                i2 = 4;
            }
        }
        if (i2 != Integer.MIN_VALUE) {
            A002.A8k("mini_gallery_entry_point", Integer.valueOf(i2));
        } else {
            A002.AAJ("mini_gallery_entry_point", (String) null);
        }
        A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
        A002.AAK(2AL.A07(this.A02, userSession), "system_info");
        A002.Cgf();
    }

    public final void Ckq(28D r5, String str) {
        0qQ.A0B(r5, 1);
        Long A0n = 00y.A0n(10, str);
        if (A0n != null) {
            0wc r2 = this.A00;
            0Aj A002 = r2.A00(r2.A00, "ig_effect_stories_tap");
            A002.A8M(r5, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            List singletonList = Collections.singletonList(A0n);
            0qQ.A07(singletonList);
            A002.AAe("applied_effect_ids", singletonList);
            A002.Cgf();
        }
    }

    public final void Cl0(C391589tK r7, 28D r8, String str, String str2, String str3) {
        String A0R;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        0qQ.A0B(str3, 2);
        UserSession userSession = this.A01;
        if (2AL.A08(userSession.A06) == null) {
            A0R = "logUnSaveEffect has invalid userId";
        } else {
            Long A0n = 00y.A0n(10, str);
            if (A0n == null) {
                A0R = 002.A0R("logUnSaveEffect has invalid effectId: ", str);
            } else {
                0wc r2 = this.A00;
                0Aj A002 = r2.A00(r2.A00, "ig_camera_unsave_effect_to_camera");
                List singletonList = Collections.singletonList(A0n);
                0qQ.A07(singletonList);
                A002.AAe("applied_effect_ids", singletonList);
                List singletonList2 = Collections.singletonList(A0n);
                0qQ.A07(singletonList2);
                A002.AAe(AnonymousClass000.A00(67), singletonList2);
                A002.A8k("event_type", 2);
                A002.AAJ("module", str3);
                A002.AAJ("save_effect_surface", str2);
                A002.A8M(r7, "effect_page_entry_point");
                A002.A8M(r8, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A002.AAJ("camera_session_id", 27p.A01(userSession).A04.A0L);
                A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A002.Cgf();
                return;
            }
        }
        0wb.A03(__redex_internal_original_name, A0R);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void AAT(String str, String str2) {
        if (str != null && str2 != null) {
            this.A04.put(str, str2);
        }
    }

    public final String AmH(String str) {
        if (str == null) {
            return null;
        }
        return (String) this.A03.get(str);
    }

    public final String Bss(String str) {
        return (String) this.A04.get(str);
    }

    public final void Chu(String str) {
        UserSession userSession = this.A01;
        if (2AL.A08(userSession.A06) == null) {
            0wb.A03(__redex_internal_original_name, "logEndEffectDiscoverySession has invalid data.");
            return;
        }
        Map map = this.A05;
        AnonymousClass0iw r2 = (AnonymousClass0iw) map.get(str);
        if (r2 != null) {
            0wc A012 = AnonymousClass0kN.A01(r2, userSession);
            0Aj A002 = A012.A00(A012.A00, "ig_effect_discovery_exit");
            A002.AAJ("discovery_session_id", str);
            A002.A8M(27p.A01(userSession).A04.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.A8k("event_type", 2);
            A002.AAJ("module", __redex_internal_original_name);
            A002.AAJ("search_session_id", "");
            A002.A8M(C59725JVj.EFFECT_DISCOVERY, "surface");
            String str2 = 27p.A01(userSession).A04.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A002.AAJ("camera_session_id", str2);
            A002.AAJ("collection_pk", "");
            A002.AAJ("grouping_pk", "");
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.Cgf();
            map.remove(str);
            if (C17169VKy.A01.equals(r2) || C17169VKy.A07.equals(r2) || C17169VKy.A03.equals(r2) || C17169VKy.A05.equals(r2) || C17169VKy.A04.equals(r2)) {
                this.A04.clear();
                this.A03.clear();
            }
        }
    }

    public final void Ckr(AnonymousClass0iw r17, String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        String str7 = str;
        AnonymousClass0iw r9 = r17;
        0qQ.A0B(r9, 6);
        0wc r2 = this.A00;
        0Aj A002 = r2.A00(r2.A00, "tap_effect_gallery_search_result");
        String str8 = str3;
        String str9 = str4;
        String str10 = str2;
        if (A002.isSampled()) {
            A002.A8k("event_type", 2);
            A002.AAJ("module", r9.getModuleName());
            if (str == null) {
                str6 = "";
            } else {
                str6 = str7;
            }
            A002.AAJ("query_text", str6);
            A002.AAJ("selected_id", str9);
            A002.A9F("selected_position", -1L);
            A002.AAJ("selected_type", "effect");
            A002.A8M(C59725JVj.EFFECT_DISCOVERY, "surface");
            A002.AAJ("camera_session_id", 27p.A01(this.A01).A04.A0L);
            A002.AAJ("discovery_session_id", str10);
            A002.A8M((AnonymousClass0Ac) null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.AAJ("search_session_id", str8);
            A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A002.Cgf();
        }
        AnonymousClass29S r5 = 27p.A01(this.A01).A08;
        0wc r11 = r5.A01;
        String A003 = AnonymousClass000.A00(303);
        0kJ r22 = r11.A00;
        0Aj A004 = r11.A00(r22, A003);
        if (A004.isSampled()) {
            A004.AAJ("entity", "TAP_EFFECT_GALLERY_SEARCH_RESULT");
            AnonymousClass283 r13 = r5.A04;
            A004.A8M(r13.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A004.A8k("event_type", 2);
            A004.A8M(C59725JVj.EFFECT_DISCOVERY, "surface");
            String str11 = r13.A0L;
            if (str11 == null) {
                str11 = "";
            }
            A004.AAJ("camera_session_id", str11);
            A004.AAJ("module", r9.getModuleName());
            A004.AAJ("legacy_falco_event_name", "TAP_EFFECT_GALLERY_SEARCH_RESULT");
            String str12 = str7;
            if (str == null) {
                str12 = "";
            }
            A004.AAJ("query_text", str12);
            A004.AAJ("selected_id", str9);
            A004.A9F("selected_position", -1L);
            A004.AAJ("selected_type", "effect");
            A004.AAJ("discovery_session_id", str10);
            A004.AAJ("search_session_id", str8);
            A004.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A004.Cgf();
        }
        0Aj A005 = r11.A00(r22, AnonymousClass000.A00(1431));
        if (A005.isSampled()) {
            A005.AAJ("legacy_falco_event_name", "TAP_EFFECT_GALLERY_SEARCH_RESULT");
            A005.AAJ("entity", "TAP_EFFECT_GALLERY_SEARCH_RESULT");
            A005.A8k("event_type", 2);
            A005.AAJ("module", r9.getModuleName());
            if (str == null) {
                str7 = "";
            }
            A005.AAJ("query_text", str7);
            A005.AAJ("selected_id", str9);
            A005.A9F("selected_position", -1L);
            A005.AAJ("selected_type", "effect");
            A005.A8M(C59725JVj.EFFECT_DISCOVERY, "surface");
            A005.AAJ("camera_session_id", r5.A04.A0L);
            A005.AAJ("discovery_session_id", str10);
            A005.A8M((AnonymousClass0Ac) null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A005.AAJ("search_session_id", str8);
            A005.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
            A005.Cgf();
        }
    }

    public C264064Ol(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A01(this, userSession);
        02m r0 = 02m.A0p;
        0qQ.A07(r0);
        this.A02 = r0;
    }
}
