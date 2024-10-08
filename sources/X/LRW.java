package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

public final class LRW {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new MM7(this, 44));

    public LRW(UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }

    public final void A04(String str) {
        0qQ.A0B(str, 0);
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            A002.A0l("ai_home_see_all_button_clicked");
            A002.A0x(DbY.A0p("section_name", str, AnonymousClass7TE.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A01)));
            A01(A002, this);
        }
        C64831Lis.A00((C64831Lis) this.A03.getValue(), "ai_home_see_all_clicked", str);
    }

    public static final 1Ln A00(LRW lrw) {
        return C51965G9l.A0U(AnonymousClass7TE.A0e(AnonymousClass0kN.A02(lrw.A00), "gen_ai_studio_ig_client_event"), 161);
    }

    public static void A01(1Ln r1, LRW lrw) {
        r1.A0v(lrw.A02);
        r1.Cgf();
    }

    public final void A02(IGAIAgentType iGAIAgentType, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String str8;
        String str9;
        String str10 = str2;
        String str11 = str6;
        String str12 = str5;
        0qQ.A0B(str12, 5);
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            A002.A0l("ai_home_agent_clicked");
            0eP A1L = AnonymousClass7TE.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, this.A01);
            0eP A1L2 = AnonymousClass7TE.A1L("index", String.valueOf(i));
            0eP A1L3 = AnonymousClass7TE.A1L("persona_name", str3);
            0eP A1L4 = AnonymousClass7TE.A1L("screen", str4);
            0eP A1L5 = AnonymousClass7TE.A1L("section_name", str12);
            Long l = null;
            if (num != null) {
                str9 = num.toString();
            } else {
                str9 = null;
            }
            String str13 = "";
            if (str9 == null) {
                str9 = str13;
            }
            0eP A1L6 = AnonymousClass7TE.A1L("section_index", str9);
            0eP A1L7 = AnonymousClass7TE.A1L("agent_type", iGAIAgentType.A00);
            if (str6 == null) {
                str11 = str13;
            }
            0eP A1L8 = AnonymousClass7TE.A1L("creator_igid", str11);
            if (str2 == null) {
                str10 = str13;
            }
            0eP A1L9 = AnonymousClass7TE.A1L("bot_id", str10);
            if (str7 != null) {
                str13 = str7;
            }
            A002.A0x(0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, AnonymousClass7TE.A1L("icebreaker_prompt_text", str13)}));
            String str14 = str;
            if (str != null) {
                l = 00y.A0n(10, str14);
            }
            A002.A0j(l);
            A01(A002, this);
        }
        C64831Lis lis = (C64831Lis) this.A03.getValue();
        if (str7 != null) {
            str8 = "ice_breaker_clicked";
        } else {
            str8 = "agent_clicked";
        }
        C64831Lis.A00(lis, str8, (String) null);
    }

    public final void A03(String str) {
        1Ln A002 = A00(this);
        if (DbT.A1Y(A002)) {
            A002.A0l("ai_home_create_button_clicked");
            A002.A0x(AnonymousClass7TF.A0w(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str));
            A01(A002, this);
        }
        C64831Lis.A00((C64831Lis) this.A03.getValue(), "create_ai_button_clicked", str);
    }
}
