package X;

import java.io.IOException;

/* renamed from: X.4vD  reason: invalid class name and case insensitive filesystem */
public abstract class C277464vD {
    public static C277954w0 parseFromJson(16F r35) {
        0LH r1;
        String str;
        16F r2 = r35;
        0qQ.A0B(r2, 0);
        try {
            if (r2.A11() != 16L.A0D) {
                r2.A0z();
                return null;
            }
            C277844vp r20 = null;
            C277934vy r28 = null;
            C277484vF r21 = null;
            C277694va r23 = null;
            C277904vv r22 = null;
            C277754vg r24 = null;
            C277784vj r25 = null;
            C277604vR r26 = null;
            C277634vU r27 = null;
            C277664vX r29 = null;
            C277874vs r30 = null;
            C277724vd r31 = null;
            C277544vL r32 = null;
            C277514vI r33 = null;
            C277814vm r34 = null;
            C277574vO r352 = null;
            while (r2.A1J() != 16L.A09) {
                String A0q = r2.A0q();
                r2.A1J();
                if ("ig_allow_4p_live_with".equals(A0q)) {
                    r20 = C277834vo.parseFromJson(r2);
                } else if ("ig_live_android_games".equals(A0q)) {
                    r28 = C277924vx.parseFromJson(r2);
                } else if ("ig_live_audio_video_toggle".equals(A0q)) {
                    r21 = C277474vE.parseFromJson(r2);
                } else if ("ig_live_badges_ufi".equals(A0q)) {
                    r23 = C277684vZ.parseFromJson(r2);
                } else if ("ig_live_bff_upsell".equals(A0q)) {
                    r22 = C277894vu.parseFromJson(r2);
                } else if ("ig_live_comment_interactions".equals(A0q)) {
                    r24 = C277744vf.parseFromJson(r2);
                } else if ("ig_live_comment_subscription".equals(A0q)) {
                    r25 = C277774vi.parseFromJson(r2);
                } else if ("ig_live_emoji_reactions".equals(A0q)) {
                    r26 = C277594vQ.parseFromJson(r2);
                } else if ("ig_live_friend_chat".equals(A0q)) {
                    r27 = C277624vT.parseFromJson(r2);
                } else if ("ig_live_halo_call_controls".equals(A0q)) {
                    r29 = C277654vW.parseFromJson(r2);
                } else if ("ig_live_invite_only".equals(A0q)) {
                    r30 = C277864vr.parseFromJson(r2);
                } else if ("ig_live_share_system_comment".equals(A0q)) {
                    r31 = C277714vc.parseFromJson(r2);
                } else if ("ig_live_upvoteable_qa".equals(A0q)) {
                    r32 = C277534vK.parseFromJson(r2);
                } else if ("ig_live_use_rsys_rtc_infra".equals(A0q)) {
                    r33 = C277504vH.parseFromJson(r2);
                } else if ("ig_live_viewer_redesign_broadcaster_v1".equals(A0q)) {
                    r34 = C277804vl.parseFromJson(r2);
                } else if ("ig_live_viewer_to_viewer_waves".equals(A0q)) {
                    r352 = C277564vN.parseFromJson(r2);
                }
                r2.A0z();
            }
            if (r20 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("ig_allow_4p_live_with", "IGLiveBroadcastExperiments");
            } else if (r28 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("ig_live_android_games", "IGLiveBroadcastExperiments");
            } else if (r21 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("ig_live_audio_video_toggle", "IGLiveBroadcastExperiments");
            } else if (r23 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("ig_live_badges_ufi", "IGLiveBroadcastExperiments");
            } else if (r22 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("ig_live_bff_upsell", "IGLiveBroadcastExperiments");
            } else if (r24 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("ig_live_comment_interactions", "IGLiveBroadcastExperiments");
            } else if (r25 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("ig_live_comment_subscription", "IGLiveBroadcastExperiments");
            } else if (r26 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("ig_live_emoji_reactions", "IGLiveBroadcastExperiments");
            } else if (r27 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("ig_live_friend_chat", "IGLiveBroadcastExperiments");
            } else if (r29 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("ig_live_halo_call_controls", "IGLiveBroadcastExperiments");
            } else if (r30 == null && (r2 instanceof 0c9)) {
                ((0c9) r2).A03.A00("ig_live_invite_only", "IGLiveBroadcastExperiments");
            } else if (r31 != null || !(r2 instanceof 0c9)) {
                if (r32 == null && (r2 instanceof 0c9)) {
                    r1 = ((0c9) r2).A03;
                    str = "ig_live_upvoteable_qa";
                } else if (r33 == null && (r2 instanceof 0c9)) {
                    r1 = ((0c9) r2).A03;
                    str = "ig_live_use_rsys_rtc_infra";
                } else if (r34 == null && (r2 instanceof 0c9)) {
                    r1 = ((0c9) r2).A03;
                    str = "ig_live_viewer_redesign_broadcaster_v1";
                } else if (r352 != null || !(r2 instanceof 0c9)) {
                    return new C277954w0(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r352);
                } else {
                    r1 = ((0c9) r2).A03;
                    str = "ig_live_viewer_to_viewer_waves";
                }
                r1.A00(str, "IGLiveBroadcastExperiments");
            } else {
                ((0c9) r2).A03.A00("ig_live_share_system_comment", "IGLiveBroadcastExperiments");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r3, C277954w0 r4) {
        r3.A0c();
        C277854vq r1 = r4.A00;
        if (r1 != null) {
            r3.A0q("ig_allow_4p_live_with");
            C277844vp F40 = r1.F40();
            r3.A0c();
            r3.A0S("allow", F40.A00);
            r3.A0Z();
        }
        C277944vz r12 = r4.A08;
        if (r12 != null) {
            r3.A0q("ig_live_android_games");
            C277934vy F4V = r12.F4V();
            r3.A0c();
            r3.A0S("viewer_poll_enabled", F4V.A00);
            r3.A0Z();
        }
        C277484vF r2 = r4.A01;
        if (r2 != null) {
            r3.A0q("ig_live_audio_video_toggle");
            r3.A0c();
            r3.A0S("audio_toggle_enabled", r2.A00);
            r3.A0S("video_toggle_enabled", r2.A01);
            r3.A0Z();
        }
        C277704vb r13 = r4.A03;
        if (r13 != null) {
            r3.A0q("ig_live_badges_ufi");
            C277694va F4P = r13.F4P();
            r3.A0c();
            r3.A0S("badges_always_on_enabled", F4P.A00);
            r3.A0Z();
        }
        C277904vv r14 = r4.A02;
        if (r14 != null) {
            r3.A0q("ig_live_bff_upsell");
            r3.A0c();
            r3.A0S("show_join_live_sheet", r14.A00);
            r3.A0Z();
        }
        C277764vh r15 = r4.A04;
        if (r15 != null) {
            r3.A0q("ig_live_comment_interactions");
            C277754vg F4R = r15.F4R();
            r3.A0c();
            r3.A0S("android_is_required_mvvm_enabled", F4R.A00);
            r3.A0S("is_broadcast_level_expand_enabled", F4R.A01);
            r3.A0S("is_host_comment_liking_enabled", F4R.A02);
            r3.A0S("is_host_comment_reply_redesign_enabled", F4R.A03);
            r3.A0Z();
        }
        C277794vk r16 = r4.A05;
        if (r16 != null) {
            r3.A0q("ig_live_comment_subscription");
            C277784vj F4S = r16.F4S();
            r3.A0c();
            r3.A0S("dont_change_comments_height", F4S.A00);
            r3.A0S("is_broadcast_enabled", F4S.A01);
            r3.A0Z();
        }
        C277614vS r17 = r4.A06;
        if (r17 != null) {
            r3.A0q("ig_live_emoji_reactions");
            C277604vR F4T = r17.F4T();
            r3.A0c();
            r3.A0S("is_host_enabled", F4T.A00);
            r3.A0S("use_emoji_set_2", F4T.A01);
            r3.A0Z();
        }
        C277644vV r18 = r4.A07;
        if (r18 != null) {
            r3.A0q("ig_live_friend_chat");
            C277634vU F4U = r18.F4U();
            r3.A0c();
            r3.A0S("is_enabled_for_broadcast", F4U.A00);
            r3.A0Z();
        }
        C277674vY r19 = r4.A09;
        if (r19 != null) {
            r3.A0q("ig_live_halo_call_controls");
            C277664vX F4W = r19.F4W();
            r3.A0c();
            r3.A0S("tap_state_animation_enabled", F4W.A00);
            r3.A0S("tap_state_bottom_call_controls_enabled", F4W.A01);
            r3.A0S("tap_to_show_pill_enabled", F4W.A02);
            r3.A0Z();
        }
        C277884vt r110 = r4.A0A;
        if (r110 != null) {
            r3.A0q("ig_live_invite_only");
            C277874vs F4X = r110.F4X();
            r3.A0c();
            r3.A0S("is_invite_only_branding_enabled", F4X.A00);
            r3.A0Z();
        }
        C277734ve r111 = r4.A0B;
        if (r111 != null) {
            r3.A0q("ig_live_share_system_comment");
            C277724vd F4Y = r111.F4Y();
            r3.A0c();
            r3.A0S("join_request_system_comment_delay_5_else_0", F4Y.A00);
            r3.A0S("share_system_comment_delay_10_else_5", F4Y.A01);
            r3.A0S("show_join_request_system_comment", F4Y.A02);
            r3.A0S("show_share_system_comment", F4Y.A03);
            r3.A0Z();
        }
        C277554vM r112 = r4.A0C;
        if (r112 != null) {
            r3.A0q("ig_live_upvoteable_qa");
            C277544vL F4Z = r112.F4Z();
            r3.A0c();
            r3.A0S("enabled", F4Z.A00);
            r3.A0Z();
        }
        C277524vJ r113 = r4.A0D;
        if (r113 != null) {
            r3.A0q("ig_live_use_rsys_rtc_infra");
            C277514vI F4a = r113.F4a();
            r3.A0c();
            r3.A0S("enabled", F4a.A00);
            r3.A0Z();
        }
        C277824vn r114 = r4.A0E;
        if (r114 != null) {
            r3.A0q("ig_live_viewer_redesign_broadcaster_v1");
            C277814vm F4b = r114.F4b();
            r3.A0c();
            r3.A0S("aspect_ratio_change_enabled", F4b.A00);
            r3.A0S("comment_redesign_combined_test_enabled", F4b.A01);
            r3.A0S("is_aspect_ratio_16_9", F4b.A02);
            r3.A0S("viewer_redesign_combined_test_enabled", F4b.A03);
            r3.A0S("viewer_redesign_v2_combined_test_enabled", F4b.A04);
            r3.A0Z();
        }
        C277584vP r115 = r4.A0F;
        if (r115 != null) {
            r3.A0q("ig_live_viewer_to_viewer_waves");
            C277574vO F4c = r115.F4c();
            r3.A0c();
            r3.A0S("enabled", F4c.A00);
            r3.A0Z();
        }
        r3.A0Z();
    }
}
