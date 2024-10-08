package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Map;

public final class LTH {
    public final UserSession A00;

    public LTH(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A06(UtmMetadata utmMetadata, String str, String str2) {
        String str3;
        String str4;
        String str5;
        1Ln A01 = A01(this, str, 0);
        if (DbT.A1Y(A01)) {
            A01.A0l("creation_nux_screen_shown");
            0eP A1L = AnonymousClass7TE.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            String str6 = null;
            if (utmMetadata != null) {
                str3 = utmMetadata.A03;
            } else {
                str3 = null;
            }
            0eP A1L2 = AnonymousClass7TE.A1L("utm_source", str3);
            if (utmMetadata != null) {
                str4 = utmMetadata.A02;
            } else {
                str4 = null;
            }
            0eP A1L3 = AnonymousClass7TE.A1L("utm_medium", str4);
            if (utmMetadata != null) {
                str5 = utmMetadata.A00;
            } else {
                str5 = null;
            }
            0eP A1L4 = AnonymousClass7TE.A1L("utm_campaign", str5);
            if (utmMetadata != null) {
                str6 = utmMetadata.A01;
            }
            JTT.A1I(A01, str2, JTU.A0Z(str6, A1L, A1L2, A1L3, A1L4));
        }
    }

    public final void A0C(String str, String str2) {
        1Ln A01 = A01(this, str, 0);
        if (DbT.A1Y(A01)) {
            A01.A0l("advanced_settings_screen_field_regeneration_icon_clicked");
            A01.A0x(DbY.A0p("field_to_regenerate", str2, AnonymousClass7TE.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str)));
            A01.Cgf();
        }
    }

    public final void A0R(String str, String str2, String str3) {
        1Ln A002;
        String str4;
        0qQ.A0B(str, 0);
        if (str.equals("settings_add_instruction")) {
            A002 = A00(this);
            if (DbT.A1Y(A002)) {
                str4 = "settings_add_instruction_back_clicked";
            } else {
                return;
            }
        } else if (str.equals("settings_edit_instruction")) {
            A002 = A00(this);
            if (DbT.A1Y(A002)) {
                str4 = "settings_edit_instruction_back_clicked";
            } else {
                return;
            }
        } else {
            return;
        }
        A04(A002, JTU.A0W(A002, str4, str2), str3);
        A002.Cgf();
    }

    public static final 1Ln A00(LTH lth) {
        return C51965G9l.A0U(AnonymousClass7TE.A0e(AnonymousClass0kN.A02(lth.A00), "gen_ai_studio_ig_client_event"), 161);
    }

    public static final boolean A05(IGAIAgentType iGAIAgentType) {
        if (iGAIAgentType == IGAIAgentType.A08 || iGAIAgentType == IGAIAgentType.A04) {
            return true;
        }
        return false;
    }

    public final void A08(IGAIAgentType iGAIAgentType, String str, boolean z) {
        String str2;
        String str3;
        if (!0qQ.A0K(str, C66579MXk.A00(50))) {
            1Ln A002 = A00(this);
            if (DbT.A1Y(A002)) {
                A002.A0l("ai_agent_story_posted");
                Long l = null;
                if (str != null) {
                    l = AnonymousClass7TE.A10(str);
                }
                A002.A0j(l);
                if (iGAIAgentType == null || (str2 = iGAIAgentType.A00) == null) {
                    str2 = "";
                }
                0eP A1L = AnonymousClass7TE.A1L("agent_type", str2);
                if (z) {
                    str3 = "agent_share";
                } else {
                    str3 = "snippet_share";
                }
                A002.A0x(DbY.A0p(TraceFieldType.ContentType, str3, A1L));
                A002.Cgf();
            }
        }
    }

    public final void A09(IGAIAgentType iGAIAgentType, String str, boolean z, boolean z2) {
        String str2;
        String str3;
        String str4;
        if (!z || A05(iGAIAgentType)) {
            1Ln A002 = A00(this);
            if (DbT.A1Y(A002)) {
                A002.A0l("ai_agent_story_link_clicked");
                Long l = null;
                if (str != null) {
                    l = AnonymousClass7TE.A10(str);
                }
                A002.A0j(l);
                if (iGAIAgentType == null || (str2 = iGAIAgentType.A00) == null) {
                    str2 = "";
                }
                0eP A1L = AnonymousClass7TE.A1L("agent_type", str2);
                if (z) {
                    str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                } else {
                    str3 = "0";
                }
                0eP A1L2 = AnonymousClass7TE.A1L("is_user_eligible", str3);
                if (z2) {
                    str4 = "agent_share";
                } else {
                    str4 = "snippet_share";
                }
                A002.A0x(DbY.A0q(TraceFieldType.ContentType, str4, A1L, A1L2));
                A002.Cgf();
            }
        }
    }

    public static 1Ln A01(LTH lth, Object obj, int i) {
        0qQ.A0B(obj, i);
        return A00(lth);
    }

    public static 1Ln A02(AnonymousClass0eM r0) {
        return A00((LTH) r0.getValue());
    }

    public static LTH A03(AnonymousClass0eM r1) {
        return new LTH((UserSession) r1.getValue());
    }

    public static void A04(1Ln r2, Long l, Object obj) {
        r2.A0j(l);
        r2.A0x(0se.A0M(new 0eP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, obj)));
    }

    public final void A07(IGAIAgentType iGAIAgentType, String str, boolean z) {
        String str2;
        String str3;
        if (A05(iGAIAgentType)) {
            1Ln A002 = A00(this);
            if (DbT.A1Y(A002)) {
                A002.A0l("share_sheet_add_to_story_clicked");
                Long l = null;
                if (str != null) {
                    l = AnonymousClass7TE.A10(str);
                }
                A002.A0j(l);
                if (iGAIAgentType == null || (str2 = iGAIAgentType.A00) == null) {
                    str2 = "";
                }
                0eP A1L = AnonymousClass7TE.A1L("agent_type", str2);
                if (z) {
                    str3 = "agent_share";
                } else {
                    str3 = "snippet_share";
                }
                A002.A0x(DbY.A0p(TraceFieldType.ContentType, str3, A1L));
                A002.Cgf();
            }
        }
    }

    public final void A0A(String str) {
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            A002.A0j(JTU.A0W(A002, "direct_thread_edit_ai_icon_shown", str));
            A002.Cgf();
        }
    }

    public final void A0B(String str) {
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            A002.A0j(JTU.A0W(A002, "thread_view_bar_ai_studio_button_shown", str));
            A002.Cgf();
        }
    }

    public final void A0D(String str, String str2) {
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            A04(A002, JTU.A0W(A002, "settings_edit_instruction_delete_clicked", str), str2);
            A002.Cgf();
        }
    }

    public final void A0E(String str, String str2) {
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            A04(A002, JTU.A0W(A002, "settings_edit_instruction_delete_confirmation_cancel_clicked", str), str2);
            A002.Cgf();
        }
    }

    public final void A0F(String str, String str2) {
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            A04(A002, JTU.A0W(A002, "settings_edit_instruction_delete_confirmation_delete_clicked", str), str2);
            A002.Cgf();
        }
    }

    public final void A0G(String str, String str2) {
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            A04(A002, JTU.A0W(A002, "settings_edit_instruction_delete_confirmation_dialog_shown", str), str2);
            A002.Cgf();
        }
    }

    public final void A0H(String str, String str2) {
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            A04(A002, JTU.A0W(A002, "settings_edit_example_dialogue_delete_button_clicked", str), str2);
            A002.Cgf();
        }
    }

    public final void A0I(String str, String str2) {
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            A04(A002, JTU.A0W(A002, "settings_edit_example_dialogue_delete_confirmation_cancel_clicked", str), str2);
            A002.Cgf();
        }
    }

    public final void A0J(String str, String str2) {
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            A04(A002, JTU.A0W(A002, "settings_edit_example_dialogue_delete_confirmation_delete_clicked", str), str2);
            A002.Cgf();
        }
    }

    public final void A0K(String str, String str2) {
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            A04(A002, JTU.A0W(A002, "settings_edit_example_dialogue_delete_confirmation_dialog_shown", str), str2);
            A002.Cgf();
        }
    }

    public final void A0L(String str, String str2, String str3) {
        1Ln A002;
        String str4;
        int A0F = JTR.A0F(str);
        if (A0F != 1466595302) {
            if (A0F != 1872262023) {
                if (A0F == 2070440838 && str.equals("settings_edit_example_dialogue")) {
                    A002 = A00(this);
                    if (DbT.A1Y(A002)) {
                        str4 = "settings_edit_example_dialogue_back_button_clicked";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str.equals("settings_add_example_dialogue")) {
                A002 = A00(this);
                if (DbT.A1Y(A002)) {
                    str4 = "settings_add_example_dialogue_back_button_clicked";
                } else {
                    return;
                }
            } else {
                return;
            }
            A04(A002, JTU.A0W(A002, str4, str2), str3);
        } else if (str.equals("in_thread_add_example_dialogue")) {
            A002 = A00(this);
            if (DbT.A1Y(A002)) {
                A002.A0j(JTU.A0W(A002, "thread_view_add_example_dialogue_back_clicked", str2));
            } else {
                return;
            }
        } else {
            return;
        }
        A002.Cgf();
    }

    public final void A0M(String str, String str2, String str3) {
        1Ln A002;
        String str4;
        int A0F = JTR.A0F(str);
        if (A0F != 1466595302) {
            if (A0F != 1872262023) {
                if (A0F == 2070440838 && str.equals("settings_edit_example_dialogue")) {
                    A002 = A00(this);
                    if (DbT.A1Y(A002)) {
                        str4 = "settings_edit_example_dialogue_done_button_clicked";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str.equals("settings_add_example_dialogue")) {
                A002 = A00(this);
                if (DbT.A1Y(A002)) {
                    str4 = "settings_add_example_dialogue_done_button_clicked";
                } else {
                    return;
                }
            } else {
                return;
            }
            A04(A002, JTU.A0W(A002, str4, str2), str3);
        } else if (str.equals("in_thread_add_example_dialogue")) {
            A002 = A00(this);
            if (DbT.A1Y(A002)) {
                A002.A0j(JTU.A0W(A002, "thread_view_add_example_dialogue_done_clicked", str2));
            } else {
                return;
            }
        } else {
            return;
        }
        A002.Cgf();
    }

    public final void A0N(String str, String str2, String str3) {
        1Ln A002;
        String str4;
        int A0F = JTR.A0F(str);
        if (A0F != 1466595302) {
            if (A0F != 1872262023) {
                if (A0F == 2070440838 && str.equals("settings_edit_example_dialogue")) {
                    A002 = A00(this);
                    if (DbT.A1Y(A002)) {
                        str4 = "settings_edit_example_dialogue_exit_back_button_clicked";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str.equals("settings_add_example_dialogue")) {
                A002 = A00(this);
                if (DbT.A1Y(A002)) {
                    str4 = "settings_add_example_dialogue_exit_back_button_clicked";
                } else {
                    return;
                }
            } else {
                return;
            }
            A04(A002, JTU.A0W(A002, str4, str2), str3);
        } else if (str.equals("in_thread_add_example_dialogue")) {
            A002 = A00(this);
            if (DbT.A1Y(A002)) {
                A002.A0j(JTU.A0W(A002, "thread_view_add_example_dialogue_exit_confirmation_dialog_shown", str2));
            } else {
                return;
            }
        } else {
            return;
        }
        A002.Cgf();
    }

    public final void A0O(String str, String str2, String str3) {
        1Ln A002;
        String str4;
        int A0F = JTR.A0F(str);
        if (A0F != 1466595302) {
            if (A0F != 1872262023) {
                if (A0F == 2070440838 && str.equals("settings_edit_example_dialogue")) {
                    A002 = A00(this);
                    if (DbT.A1Y(A002)) {
                        str4 = "settings_edit_example_dialogue_exit_confirmation_cancel_clicked";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str.equals("settings_add_example_dialogue")) {
                A002 = A00(this);
                if (DbT.A1Y(A002)) {
                    str4 = "settings_add_example_dialogue_exit_confirmation_cancel_clicked";
                } else {
                    return;
                }
            } else {
                return;
            }
            A04(A002, JTU.A0W(A002, str4, str2), str3);
        } else if (str.equals("in_thread_add_example_dialogue")) {
            A002 = A00(this);
            if (DbT.A1Y(A002)) {
                A002.A0j(JTU.A0W(A002, "thread_view_add_example_dialogue_exit_confirmation_cancel_clicked", str2));
            } else {
                return;
            }
        } else {
            return;
        }
        A002.Cgf();
    }

    public final void A0P(String str, String str2, String str3) {
        1Ln A002;
        String str4;
        int A0F = JTR.A0F(str);
        if (A0F != 1466595302) {
            if (A0F != 1872262023) {
                if (A0F == 2070440838 && str.equals("settings_edit_example_dialogue")) {
                    A002 = A00(this);
                    if (DbT.A1Y(A002)) {
                        str4 = "settings_edit_example_dialogue_exit_confirmation_discard_changes_clicked";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str.equals("settings_add_example_dialogue")) {
                A002 = A00(this);
                if (DbT.A1Y(A002)) {
                    str4 = "settings_add_example_dialogue_exit_confirmation_discard_changes_clicked";
                } else {
                    return;
                }
            } else {
                return;
            }
            A04(A002, JTU.A0W(A002, str4, str2), str3);
        } else if (str.equals("in_thread_add_example_dialogue")) {
            A002 = A00(this);
            if (DbT.A1Y(A002)) {
                A002.A0j(JTU.A0W(A002, "thread_view_add_example_dialogue_exit_confirmation_discard_changes_clicked", str2));
            } else {
                return;
            }
        } else {
            return;
        }
        A002.Cgf();
    }

    public final void A0Q(String str, String str2, String str3) {
        1Ln A002;
        String str4;
        int A0F = JTR.A0F(str);
        if (A0F != 1466595302) {
            if (A0F != 1872262023) {
                if (A0F == 2070440838 && str.equals("settings_edit_example_dialogue")) {
                    A002 = A00(this);
                    if (DbT.A1Y(A002)) {
                        str4 = "settings_edit_example_dialogue_screen_shown";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str.equals("settings_add_example_dialogue")) {
                A002 = A00(this);
                if (DbT.A1Y(A002)) {
                    str4 = "settings_add_example_dialogue_screen_shown";
                } else {
                    return;
                }
            } else {
                return;
            }
            A04(A002, JTU.A0W(A002, str4, str2), str3);
        } else if (str.equals("in_thread_add_example_dialogue")) {
            A002 = A00(this);
            if (DbT.A1Y(A002)) {
                A002.A0j(JTU.A0W(A002, "thread_view_add_example_dialogue_screen_shown", str2));
            } else {
                return;
            }
        } else {
            return;
        }
        A002.Cgf();
    }

    public final void A0S(String str, String str2, String str3) {
        1Ln A002;
        0eP A1L;
        Map map;
        int A0F = JTR.A0F(str);
        if (A0F != -867825035) {
            if (A0F != -339786284) {
                if (A0F == 1866510131 && str.equals("in_thread_instruction")) {
                    A002 = A00(this);
                    if (DbT.A1Y(A002)) {
                        A002.A0j(JTU.A0W(A002, "thread_view_add_instruction_done_clicked", str2));
                        A1L = AnonymousClass7TE.A1L("has_changed", "true");
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str.equals("settings_add_instruction")) {
                A002 = A00(this);
                if (DbT.A1Y(A002)) {
                    A002.A0j(JTU.A0W(A002, "settings_add_instruction_done_clicked", str2));
                    map = DbY.A0p("has_changed", "true", AnonymousClass7TE.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3));
                    A002.A0x(map);
                    A002.Cgf();
                }
                return;
            } else {
                return;
            }
        } else if (str.equals("settings_edit_instruction")) {
            A002 = A00(this);
            if (DbT.A1Y(A002)) {
                A002.A0j(JTU.A0W(A002, "settings_edit_instruction_done_clicked", str2));
                A1L = AnonymousClass7TE.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
            } else {
                return;
            }
        } else {
            return;
        }
        map = 0se.A0M(A1L);
        A002.A0x(map);
        A002.Cgf();
    }

    public final void A0T(String str, String str2, String str3) {
        1Ln r1;
        String str4;
        int A0F = JTR.A0F(str);
        if (A0F != -867825035) {
            if (A0F != -339786284) {
                if (A0F == 1866510131 && str.equals("in_thread_instruction")) {
                    r1 = A00(this);
                    if (DbT.A1Y(r1)) {
                        r1.A0j(JTU.A0W(r1, "thread_view_add_instruction_exit_confirmation_cancel_clicked", str2));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str.equals("settings_add_instruction")) {
                r1 = A00(this);
                if (DbT.A1Y(r1)) {
                    str4 = "settings_add_instruction_exit_confirmation_cancel_clicked";
                    A04(r1, JTU.A0W(r1, str4, str2), str3);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (str.equals("settings_edit_instruction")) {
            r1 = A00(this);
            if (DbT.A1Y(r1)) {
                str4 = "settings_edit_instruction_exit_confirmation_cancel_clicked";
                A04(r1, JTU.A0W(r1, str4, str2), str3);
            } else {
                return;
            }
        } else {
            return;
        }
        r1.Cgf();
    }

    public final void A0U(String str, String str2, String str3) {
        1Ln r1;
        String str4;
        int A0F = JTR.A0F(str);
        if (A0F != -867825035) {
            if (A0F != -339786284) {
                if (A0F == 1866510131 && str.equals("in_thread_instruction")) {
                    r1 = A00(this);
                    if (DbT.A1Y(r1)) {
                        r1.A0j(JTU.A0W(r1, "thread_view_add_instruction_exit_confirmation_dialog_shown", str2));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str.equals("settings_add_instruction")) {
                r1 = A00(this);
                if (DbT.A1Y(r1)) {
                    str4 = "Settings_add_instruction_exit_confirmation_dialog_shown";
                    A04(r1, JTU.A0W(r1, str4, str2), str3);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (str.equals("settings_edit_instruction")) {
            r1 = A00(this);
            if (DbT.A1Y(r1)) {
                str4 = "settings_edit_instruction_exit_confirmation_dialog_shown";
                A04(r1, JTU.A0W(r1, str4, str2), str3);
            } else {
                return;
            }
        } else {
            return;
        }
        r1.Cgf();
    }

    public final void A0V(String str, String str2, String str3) {
        1Ln r1;
        String str4;
        int A0F = JTR.A0F(str);
        if (A0F != -867825035) {
            if (A0F != -339786284) {
                if (A0F == 1866510131 && str.equals("in_thread_instruction")) {
                    r1 = A00(this);
                    if (DbT.A1Y(r1)) {
                        r1.A0j(JTU.A0W(r1, "thread_view_add_instruction_exit_confirmation_discard_clicked", str2));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str.equals("settings_add_instruction")) {
                r1 = A00(this);
                if (DbT.A1Y(r1)) {
                    str4 = "settings_add_instruction_exit_confirmation_discard_changes_clicked";
                    A04(r1, JTU.A0W(r1, str4, str2), str3);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (str.equals("settings_edit_instruction")) {
            r1 = A00(this);
            if (DbT.A1Y(r1)) {
                str4 = "settings_edit_instruction_exit_confirmation_discard_changes_clicked";
                A04(r1, JTU.A0W(r1, str4, str2), str3);
            } else {
                return;
            }
        } else {
            return;
        }
        r1.Cgf();
    }

    public final void A0W(String str, String str2, String str3) {
        1Ln r1;
        String str4;
        int A0F = JTR.A0F(str);
        if (A0F != -867825035) {
            if (A0F != -339786284) {
                if (A0F == 1866510131 && str.equals("in_thread_instruction")) {
                    r1 = A00(this);
                    if (DbT.A1Y(r1)) {
                        r1.A0j(JTU.A0W(r1, "thread_view_add_instruction_screen_shown", str2));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str.equals("settings_add_instruction")) {
                r1 = A00(this);
                if (DbT.A1Y(r1)) {
                    str4 = "settings_add_instruction_screen_shown";
                    A04(r1, JTU.A0W(r1, str4, str2), str3);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (str.equals("settings_edit_instruction")) {
            r1 = A00(this);
            if (DbT.A1Y(r1)) {
                str4 = "settings_edit_instruction_screen_shown";
                A04(r1, JTU.A0W(r1, str4, str2), str3);
            } else {
                return;
            }
        } else {
            return;
        }
        r1.Cgf();
    }
}
