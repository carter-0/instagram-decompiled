package X;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

public final class W2G {
    public static boolean A00 = true;
    public static C58840Ae A01;
    public static C18648Vw0 A02;
    public static C17689VcK A03;
    public static VRE A04;
    public static C18446Vrt A05;
    public static VZC A06;
    public static AnonymousClass0xM A07;
    public static 0lg A08;
    public static AnonymousClass3L3 A09;
    public static Integer A0A = AnonymousClass05K.A01;
    public static boolean A0B;
    public static boolean A0C;
    public static final Handler A0D = AnonymousClass7TF.A0D();
    public static final W2G A0E = new Object();
    public static final Runnable A0F = new C20360Wpz();
    public static final 0s0 A0G = new C20796Wz8(true, 0);
    public static final 0s0 A0H = new C20796Wz8(true, 1);
    public static final AnonymousClass0hF A0I = WE7.A00;
    public static final /* synthetic */ AnonymousClass0YZ[] A0J;

    public final void A04(Activity activity, C58840Ae r10, 0lg r11, AnonymousClass3L3 r12, boolean z) {
        AnonymousClass07Z r9;
        AnonymousClass07V lifecycle;
        0qQ.A0B(r12, 4);
        A0B = z;
        A08 = r11;
        A01 = r10;
        A09 = r12;
        0Tu r3 = 0Tu.A05;
        String A042 = 182.A04(r3, r11, 36878637903118532L);
        if (00l.A0W(A042)) {
            A042 = "{\n  \"version\":\"0.0.1\",\n  \"events\": [{\n  \"name\": \"gnv_generic_click\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"like\": \"secondary\",\n    \"unlike\": \"secondary\",\n    \"comment\": \"secondary\",\n    \"save\": \"secondary\",\n    \"unsave\": \"secondary\",\n    \"ad_share\": \"secondary\",\n    \"reshare\": \"secondary\",\n    \"follow\": \"secondary\",\n    \"unfollow\": \"secondary\",\n    \"story_reply\": \"secondary\"\n  },\n  \"two_measurement_categorization\": {\n    \"like\": [\n      {\n        \"content_is_liked\": \"false\",\n        \"clicked_target_description\": \"like_button\"\n      },\n      {\n        \"content_is_liked\": \"false\",\n        \"clicked_target_description\": \"tap_media\",\n        \"tap_index\": \"1\"\n      }\n    ],\n    \"unlike\": [\n      {\n        \"content_is_liked\": \"true\",\n        \"clicked_target_description\": \"like_button\"\n      }\n    ],\n    \"comment\": [\n      {\n        \"clicked_target_description\": \"comment_send_button\"\n      }\n    ],\n    \"save\": [\n      {\n          \"content_is_saved\":\"false\",\n          \"clicked_target_description\":\"save_button\"\n      }\n    ],\n    \"unsave\": [\n      {\n        \"content_is_saved\": \"true\",\n        \"clicked_target_description\": \"save_button\"\n      }\n    ],\n    \"ad_share\": [\n      {\n        \"clicked_target_description\": \"share_button\",\n        \"tracking_models\":\"@REGEX(.*\\\"is_sponsored\\\":true.*)\"\n      }\n    ],\n    \"reshare\": [\n      {\n        \"clicked_target_description\": \"share_button\"\n      }\n    ],\n    \"follow\": [\n      {\n        \"clicked_target_description\": \"follow_button\",\n        \"clicked_target_is_selected\": \"true\"\n      }\n    ],\n    \"unfollow\": [\n      {\n        \"clicked_target_description\": \"follow_button\",\n        \"clicked_target_is_selected\": \"false\"\n      }\n    ],\n    \"story_reply\":[\n      {\n        \"clicked_target_description\": \"reply_send_button\"\n      },  \n      {\n        \"clicked_target_description\": \"story_quick_reaction\"\n      }\n    ]\n  },\n  \"two_measurement_matching\": {\n     \"like\": {\n      \"media_id\": \"@JOIN(content_id,content_owner_id,_)\"\n     },\n     \"save\": {\n      \"media_id\": \"@JOIN(content_id,content_owner_id,_)\"\n     },\n     \"unsave\": {\n      \"media_id\": \"@JOIN(content_id,content_owner_id,_)\"\n     },\n     \"comment\": {\n      \"media_id\": \"@JOIN(content_id,content_owner_id,_)\"\n     },\n     \"ad_share\":{\n      \"m_pk\":\"@JOIN(content_id,content_owner_id,_)\"\n     },\n     \"reshare\": {\n      \"m_pk\": \"@JOIN(content_id,content_owner_id,_)\"\n     },\n     \"follow\": {\n      \"follow_user_id\": \"content_owner_id\"\n     },\n     \"unfollow\":{\n      \"follow_user_id\": \"content_owner_id\"\n     }\n  },\n  \"validation_rule\": {\n    \"like\": {\n      \"nav_chain\":\"@NONNULL\",\n      \"module\":\"@NONNULL\",\n      \"tracking_nodes\":\"@NONNULL\",\n      \"tracking_models\":\"@NONNULL\"\n    },\n    \"unlike\": {\n      \"nav_chain\":\"@NONNULL\",\n      \"module\":\"@NONNULL\",\n      \"tracking_nodes\":\"@NONNULL\",\n      \"tracking_models\":\"@NONNULL\"\n    },\n    \"save\":{\n        \"nav_chain\":\"@NONNULL\",\n        \"module\":\"@NONNULL\",\n        \"tracking_nodes\":\"@NONNULL\",\n        \"tracking_models\":\"@NONNULL\",\n        \"tap_index\":\"0\"\n    },\n    \"unsave\":{\n        \"nav_chain\":\"@NONNULL\",\n        \"module\":\"@NONNULL\",\n        \"tracking_models\":\"@NONNULL\",\n        \"gesture_type\":\"1\",\n        \"tap_index\":\"0\"\n    },\n    \"comment\":{\n        \"nav_chain\":\"@NONNULL\",\n        \"module\":\"@NONNULL\",\n        \"tracking_models\":\"@NONNULL\",\n        \"gesture_type\":\"1\",\n        \"tap_index\":\"0\"\n    },\n    \"reshare\":{\n        \"nav_chain\":\"@NONNULL\",\n        \"module\":\"@NONNULL\",\n        \"tracking_models\":\"@NONNULL\",\n        \"tap_index\":\"0\"\n    },\n    \"follow\":{\n        \"nav_chain\":\"@NONNULL\",\n        \"module\":\"@NONNULL\"\n    },\n    \"unfollow\":{\n        \"nav_chain\":\"@NONNULL\",\n        \"module\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"central_nav_from_gesture\",\n  \"two_measurement_info\": {\n    \"link_click\": \"secondary\"\n  },\n  \"two_measurement_categorization\": {\n  },\n  \"two_measurement_matching\": {},\n  \"validation_rule\": {\n    \"link_click\":\n    { \"after_module\":\"@NONNULL\",\n      \"before_module\":\"@NONNULL\",\n      \"before_tracking_models\":\"@NONNULL\",\n      \"before_tracking_nodes\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"distillery_like\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"like\": \"primary\"\n  },\n  \"validation_rule\": {\n    \"like\": {\n      \"nav_chain\":\"@NONNULL\",\n      \"container_module\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"link_click_virtual_event\",\n  \"two_measurement_info\": {\n    \"link_click\": \"primary\"\n  },\n  \"validation_rule\": {\n    \"link_click\": {\n      \"tracking\":\"@NONNULL\",\n      \"tracking_nodes\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"distillery_unlike\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"unlike\": \"primary\"\n  },\n  \"validation_rule\": {\n    \"unlike\": {\n      \"nav_chain\":\"@NONNULL\",\n      \"container_module\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"distillery_save\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"save\": \"primary\"\n  },\n  \"validation_rule\": {\n    \"save\": {\n      \"nav_chain\":\"@NONNULL\",\n      \"module_name\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"distillery_unsave\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"unsave\": \"primary\"\n  },\n  \"validation_rule\": {\n    \"unsave\": {\n      \"nav_chain\":\"@NONNULL\",\n      \"module_name\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"distillery_comment\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"comment\": \"primary\"\n  },\n  \"validation_rule\": {\n    \"comment\": {\n      \"nav_chain\":\"@NONNULL\",\n      \"container_module\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"direct_reshare_send\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"reshare\": \"primary\"\n  },\n  \"validation_rule\": {\n    \"reshare\": {\n      \"module\":\"@NONNULL\"\n    }\n  }\n},\n{\n  \"name\": \"distillery_follow\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"follow\": \"primary\"\n  },\n  \"validation_rule\": {\n  }\n},\n{\n  \"name\": \"distillery_unfollow\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"unfollow\": \"primary\"\n  },\n  \"validation_rule\": {\n  }\n},\n{\n  \"name\": \"reel_compose_message\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"story_reply\": \"primary\"\n  },\n  \"two_measurement_categorization\": {\n    \"story_reply\": [\n      {\n        \"reel_type\":\"story\"\n      }\n    ]\n  },\n  \"validation_rule\": {\n  }\n},\n{\n  \"name\": \"instagram_ad_direct_reshare_send\",\n  \"error_handling_level\": \"monitor\",\n  \"two_measurement_info\": {\n    \"ad_share\": \"primary\"\n  },\n  \"validation_rule\": {\n  }\n},\n{\n    \"name\":\"instagram_ad_impression\",\n     \"two_measurement_info\": {\n         \"ad_impression\": \"scan\"\n     },\n    \"validation_rule\":{\n      \"ad_impression\":{\n            \"ad_id\":\"@NONNULL\",\n            \"a_pk\":\"@NONNULL\",\n            \"nav_chain\":\"@NONNULL\",\n            \"m_pk\":\"@NONNULL\",\n            \"tracking_token\":\"@NONNULL\"\n      }\n    }\n  },\n{\n    \"name\":\"instagram_organic_impression\",\n     \"two_measurement_info\": {\n         \"organic_imp\": \"scan\"\n     },\n    \"validation_rule\":{\n      \"organic_imp\":{\n            \"ad_id\":\"\",\n            \"a_pk\":\"@NONNULL\",\n            \"nav_chain\":\"@NONNULL\",\n            \"m_pk\":\"@NONNULL\",\n            \"tracking_token\":\"@NONNULL\"\n      }\n    }\n }\n]}";
        }
        C18648Vw0 vw0 = new C18648Vw0(A042);
        A02 = vw0;
        if (A06 == null) {
            A06 = new VZC(this, vw0);
        }
        if (A05 == null) {
            A05 = new C18446Vrt(vw0);
        }
        if (A04 == null) {
            A04 = new VRE(vw0);
        }
        if (A03 == null) {
            A03 = new C17689VcK(this);
        }
        0lg r2 = A08;
        if (r2 != null) {
            A00 = !182.A06(r3, r2, 36315687949569516L);
            A07 = AnonymousClass0xM.A00();
            JsonObject A032 = C271114hv.A03((JsonElement) C250863mB.A03.A00("{ \"http_event_name_signature\": \n  { \"https://i.instagram.com/api/v1/media/\\\\w+/like/\": \"distillery_like\",\n    \"https://i.instagram.com/api/v1/media/\\\\w+/unlike/\": \"distillery_unlike\",\n    \"https://i.instagram.com/api/v1/media/\\\\w+/comment/\": \"distillery_comment\",\n    \"https://i.instagram.com/api/v1/media/\\\\w+/save/\": \"distillery_save\",\n    \"https://i.instagram.com/api/v1/media/\\\\w+/unsave/\": \"distillery_unsave\",\n    \"api/v1/friendships/create/\\\\d+\": \"distillery_follow\", \n    \"api/v1/friendships/destroy/\\\\d+\": \"distillery_unfollow\" \n    }, \n    \"http_event_url_fields\": { \n      \"distillery_like\": { \"media_id\": \"\\\\d+_\\\\d+\" }, \n      \"distillery_unlike\": { \"media_id\": \"\\\\d+_\\\\d+\" }, \n      \"distillery_comment\": { \"media_id\": \"\\\\d+_\\\\d+\" }, \n      \"distillery_save\": { \"media_id\": \"\\\\d+_\\\\d+\" }, \n      \"distillery_unsave\": { \"media_id\": \"\\\\d+_\\\\d+\" },\n      \"distillery_follow\": { \"follow_user_id\": \"\\\\d{2,}\"},\n      \"distillery_unfollow\": { \"follow_user_id\": \"\\\\d{2,}\"}\n      }, \n      \"http_event_body_fields\": {} }", JsonElementSerializer.A00));
            JsonElement jsonElement = (JsonElement) A032.get("http_event_name_signature");
            if (jsonElement != null) {
                Iterator it = C271114hv.A03(jsonElement).entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(it);
                    C17148VKa.A00.put(new 11S(DbT.A13(A1J)), 00l.A0M(A1J.getValue().toString(), new char[]{'\"'}));
                }
            }
            JsonElement jsonElement2 = (JsonElement) A032.get("http_event_url_fields");
            if (jsonElement2 != null) {
                Iterator it2 = C271114hv.A03(jsonElement2).entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry A1J2 = AnonymousClass7TE.A1J(it2);
                    C17148VKa.A01.put(A1J2.getKey(), 0Yt.A0B(C271114hv.A03((JsonElement) A1J2.getValue())));
                }
            }
            AnonymousClass0xM r0 = A07;
            if (r0 != null) {
                r0.A00.A02();
            }
            AnonymousClass1Mv.A01.A02();
            if (!(!(activity instanceof AnonymousClass07Z) || (r9 = (AnonymousClass07Z) activity) == null || (lifecycle = r9.getLifecycle()) == null)) {
                lifecycle.A09(A0I);
            }
            if (!A0C) {
                A0D.post(A0F);
                A0C = true;
                return;
            }
            return;
        }
        DbS.A17();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.W2G, java.lang.Object] */
    static {
        Class<W2G> cls = W2G.class;
        A0J = new AnonymousClass0YZ[]{new 015(cls, "eventScannerModeEnabled", "getEventScannerModeEnabled()Z", 0), new 015(cls, "secondChannelModeEnabled", "getSecondChannelModeEnabled()Z", 0)};
    }

    public static final void A00(Activity activity, W2G w2g, boolean z) {
        ViewGroup viewGroup;
        TabLayout tabLayout;
        ImageView imageView;
        View findViewById;
        C17689VcK vcK = A03;
        if (vcK == null) {
            0qQ.A0F("eventOverlay");
            throw AnonymousClass00P.createAndThrow();
        } else if (z) {
            0qQ.A0B(activity, 0);
            View rootView = C66581MXm.A0A(activity).getRootView();
            C66580MXl.A1R(rootView);
            vcK.A08 = new WeakReference(rootView);
            AnonymousClass2Fj r4 = vcK.A09;
            r4.A0B(AnonymousClass7TE.A0v());
            ViewGroup viewGroup2 = (ViewGroup) vcK.A08.get();
            if (viewGroup2 != null) {
                View inflate = DbV.A0D(viewGroup2).inflate(R.layout.main_log_overlay, viewGroup2, false);
                vcK.A03 = inflate;
                viewGroup2.addView(inflate);
            }
            View view = vcK.A03;
            LinearLayout linearLayout = null;
            if (view != null) {
                tabLayout = (TabLayout) view.findViewById(R.id.event_debugger_tab_layout);
            } else {
                tabLayout = null;
            }
            vcK.A07 = tabLayout;
            if (tabLayout != null) {
                tabLayout.A0D(new C71806Or7(vcK, 0));
            }
            View view2 = vcK.A03;
            if (!(view2 == null || (findViewById = view2.findViewById(R.id.reset_indicator)) == null)) {
                C18887WAz.A00(findViewById, 15, vcK);
            }
            View view3 = vcK.A03;
            if (view3 != null) {
                imageView = DbS.A0G(view3, R.id.overlay_show_hide_indicator);
            } else {
                imageView = null;
            }
            0qQ.A0C(imageView, C273654mx.A00(86));
            vcK.A04 = imageView;
            if (imageView != null) {
                C18887WAz.A00(imageView, 14, vcK);
            }
            View view4 = vcK.A03;
            View view5 = null;
            if (view4 != null) {
                linearLayout = (LinearLayout) view4.findViewById(R.id.overlay_display);
            }
            0qQ.A0C(linearLayout, C273654mx.A00(1));
            0qQ.A0B(linearLayout, 0);
            vcK.A05 = linearLayout;
            View view6 = vcK.A03;
            if (view6 != null) {
                view5 = view6.findViewById(R.id.overlay_drag_indicator);
            }
            0qQ.A0C(view5, AnonymousClass000.A00(0));
            0qQ.A0B(view5, 0);
            vcK.A02 = view5;
            WC3.A00(view5, 3, vcK);
            r4.A09(new C64319LZu(37, new MP6(vcK, 12)));
            A01(w2g);
        } else {
            View view7 = vcK.A03;
            if (!(view7 == null || (viewGroup = (ViewGroup) vcK.A08.get()) == null)) {
                viewGroup.removeView(view7);
            }
            vcK.A03 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012f A[LOOP:3: B:44:0x0129->B:46:0x012f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x023a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.W2G r17) {
        /*
            java.lang.Integer r1 = A0A
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3 = r17
            if (r1 != r0) goto L_0x0178
            X.0s0 r2 = A0H
            X.0YZ[] r1 = A0J
            r0 = 1
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            if (r0 == 0) goto L_0x0178
            X.VZC r3 = A06
            if (r3 != 0) goto L_0x0021
            java.lang.String r0 = "secondChannelEventHandler"
        L_0x0019:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0021:
            java.util.List r1 = r3.A01
            java.util.List r5 = r3.A02
            java.util.List r0 = r3.A03
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0030:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r1 = r2.next()
            X.X8K r1 = (X.X8K) r1
            X.JwM r0 = new X.JwM
            r0.<init>((X.X8K) r1)
            r4.add(r0)
            goto L_0x0030
        L_0x0045:
            java.util.Iterator r2 = r5.iterator()
        L_0x0049:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r1 = r2.next()
            X.X8K r1 = (X.X8K) r1
            X.JwM r0 = new X.JwM
            r0.<init>((X.X8K) r1)
            r4.add(r0)
            goto L_0x0049
        L_0x005e:
            r1 = 6
            X.WqD r0 = new X.WqD
            r0.<init>(r1)
            java.util.List r2 = X.00k.A0g(r4, r0)
            java.util.Date r17 = new java.util.Date
            r17.<init>()
            java.lang.String r0 = "<b>Two Measurement Current Logged Events:</b><br>"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r1 = "Version: "
            X.Vw0 r8 = r3.A00
            X.VuS r0 = r8.A00
            java.lang.String r0 = r0.A00
            java.lang.String r6 = "<br>"
            java.lang.String r0 = X.002.A0g(r1, r0, r6)
            r7.append(r0)
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r16 = r2.iterator()
        L_0x008d:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0166
            java.lang.Object r13 = r16.next()
            X.JwM r13 = (X.C61084JwM) r13
            java.lang.Object r3 = r13.A02
            X.X8K r3 = (X.X8K) r3
            r15 = 1
            boolean r1 = X.AnonymousClass7TF.A1V(r3)
            java.lang.Object r2 = r13.A01
            java.util.List r2 = (java.util.List) r2
            boolean r0 = r2.isEmpty()
            if (r1 == 0) goto L_0x0163
            if (r0 == 0) goto L_0x0163
        L_0x00ae:
            java.lang.Object r4 = r13.A00
            X.X8K r4 = (X.X8K) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.String r0 = r4.BwS()
            java.lang.String r1 = X.C16817V6y.A00(r0)
            java.lang.String r0 = "primary"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r14 = r3
            if (r0 == 0) goto L_0x00c8
            r14 = r4
        L_0x00c8:
            java.lang.String r0 = r4.BwS()
            java.lang.String r1 = X.C16817V6y.A00(r0)
            java.lang.String r0 = "secondary"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00d9
            r3 = r4
        L_0x00d9:
            java.lang.String r4 = r8.A01(r4)
            long r11 = r17.getTime()
            r9 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = r13.A00
            X.X8K r0 = (X.X8K) r0
            long r0 = r0.C7M()
            long r11 = r11 - r0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            if (r15 == 0) goto L_0x015e
            java.lang.String r0 = "<font color='#18de46'>"
        L_0x00fb:
            r9.append(r0)
        L_0x00fe:
            r9.append(r4)
            if (r15 != 0) goto L_0x0105
            if (r1 == 0) goto L_0x010a
        L_0x0105:
            java.lang.String r0 = "</font>"
            r9.append(r0)
        L_0x010a:
            r9.append(r6)
            if (r14 == 0) goto L_0x015b
            java.lang.String r0 = r14.getDisplayName()
        L_0x0113:
            r9.append(r0)
            r9.append(r6)
            if (r3 == 0) goto L_0x0158
            java.lang.String r0 = r3.getDisplayName()
        L_0x011f:
            r9.append(r0)
            r9.append(r6)
            java.util.Iterator r4 = r2.iterator()
        L_0x0129:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r4.next()
            X.X8L r0 = (X.X8L) r0
            java.lang.String r3 = "expect:\n"
            java.lang.String r2 = r0.B2e()
            java.lang.String r1 = "\nactual:"
            java.lang.String r0 = r0.AYp()
            java.lang.String r0 = X.002.A0u(r3, r2, r1, r0)
            r9.append(r0)
            r9.append(r6)
            goto L_0x0129
        L_0x014c:
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r6, r9)
            X.0qQ.A07(r0)
            r5.add(r0)
            goto L_0x008d
        L_0x0158:
            java.lang.String r0 = "waiting for secondary event"
            goto L_0x011f
        L_0x015b:
            java.lang.String r0 = "waiting for primary event"
            goto L_0x0113
        L_0x015e:
            if (r1 == 0) goto L_0x00fe
            java.lang.String r0 = "<font color='#ff6054'>"
            goto L_0x00fb
        L_0x0163:
            r15 = 0
            goto L_0x00ae
        L_0x0166:
            java.util.Iterator r1 = r5.iterator()
        L_0x016a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0221
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            r7.append(r0)
            goto L_0x016a
        L_0x0178:
            java.lang.Integer r1 = A0A
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0226
            X.0s0 r2 = A0G
            X.0YZ[] r1 = A0J
            r0 = 0
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            if (r0 == 0) goto L_0x0226
            X.VRE r3 = A04
            if (r3 != 0) goto L_0x0191
            java.lang.String r0 = "generalModeEventHandler"
            goto L_0x0019
        L_0x0191:
            java.util.List r2 = r3.A01
            int r1 = r2.size()
            r0 = 1
            if (r1 <= r0) goto L_0x01a3
            r1 = 5
            X.WqD r0 = new X.WqD
            r0.<init>(r1)
            X.01V.A1D(r2, r0)
        L_0x01a3:
            java.lang.String r0 = "<b>Logged Events Validation:</b><br>"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            X.Vw0 r6 = r3.A00
            X.VuS r0 = r6.A00
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "Version: "
            X.C66580MXl.A1V(r0, r1, r7)
            java.lang.String r5 = "<br>"
            r7.append(r5)
            java.util.Iterator r8 = r2.iterator()
        L_0x01be:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0221
            java.lang.Object r0 = r8.next()
            X.JwM r0 = (X.C61084JwM) r0
            java.lang.Object r3 = r0.A00
            X.X8K r3 = (X.X8K) r3
            java.lang.String r2 = r6.A01(r3)
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x021e
            java.lang.String r0 = "<font color='#ff6054'>"
        L_0x01de:
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = "</font>"
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = r3.getDisplayName()
            r7.append(r0)
            r7.append(r5)
            java.util.Iterator r4 = r1.iterator()
        L_0x01fa:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x021a
            java.lang.Object r0 = r4.next()
            X.X8L r0 = (X.X8L) r0
            java.lang.String r3 = "expect:"
            java.lang.String r2 = r0.B2e()
            java.lang.String r1 = "<br>actual:"
            java.lang.String r0 = r0.AYp()
            java.lang.String r0 = X.002.A11(r3, r2, r1, r0, r5)
            r7.append(r0)
            goto L_0x01fa
        L_0x021a:
            r7.append(r5)
            goto L_0x01be
        L_0x021e:
            java.lang.String r0 = "<font color='#18de46'>"
            goto L_0x01de
        L_0x0221:
            java.lang.String r2 = X.DbT.A10(r7)
            goto L_0x0228
        L_0x0226:
            java.lang.String r2 = "Mode not enabled"
        L_0x0228:
            X.VcK r0 = A03
            if (r0 == 0) goto L_0x023a
            android.widget.TextView r1 = r0.A06
            if (r1 == 0) goto L_0x0239
            r0 = 63
            android.text.Spanned r0 = android.text.Html.fromHtml(r2, r0)
            r1.setText(r0)
        L_0x0239:
            return
        L_0x023a:
            java.lang.String r0 = "eventOverlay"
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2G.A01(X.W2G):void");
    }

    public static final void A02(W2G w2g, boolean z, boolean z2) {
        if (z || z2) {
            if (!A0C) {
                A0D.post(A0F);
                A0C = true;
            }
            A01(w2g);
            return;
        }
        if (A0C) {
            A0D.removeCallbacks(A0F);
            A0C = false;
        }
        w2g.A03();
    }

    public final void A03() {
        String str;
        VRE vre = A04;
        if (vre == null) {
            str = "generalModeEventHandler";
        } else {
            vre.A01.clear();
            VZC vzc = A06;
            if (vzc == null) {
                str = "secondChannelEventHandler";
            } else {
                vzc.A01.clear();
                vzc.A02.clear();
                vzc.A03.clear();
                A01(this);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
