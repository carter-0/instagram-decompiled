package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Map;

/* renamed from: X.FYu  reason: case insensitive filesystem */
public final class C50337FYu implements AnonymousClass0lh {
    public String A00;
    public final 0wc A01;
    public final UserSession A02;

    public final void A03() {
        A02(this);
        C48146EZo eZo = C48146EZo.STORY;
        A01(C48147EZp.CREATE_BUTTON, eZo, this, "publish_story_with_subscriber_join_chat_sticker", "tap", (Map) null);
    }

    public final void A04(boolean z, String str) {
        String str2;
        0qQ.A0B(str, 1);
        this.A00 = "";
        C48146EZo eZo = C48146EZo.THREAD_DETAILS;
        if (z) {
            str2 = "thread_end_cancel";
        } else {
            str2 = "thread_end";
        }
        A01(C48147EZp.END_CHAT_DIALOG, eZo, this, str2, "tap", AnonymousClass7TF.A0w(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str));
    }

    public final void onSessionWillEnd() {
        this.A00 = null;
        this.A02.A03(C50337FYu.class);
    }

    public static final void A01(C48147EZp eZp, C48146EZo eZo, C50337FYu fYu, String str, String str2, Map map) {
        if (fYu.A00 != null) {
            try {
                0Aj A0e = AnonymousClass7TE.A0e(fYu.A01, C66579MXk.A00(898));
                if (A0e.isSampled()) {
                    A0e.A9F("actor_id", DbV.A0q(fYu.A02.A06));
                    A0e.AAJ("parent_surface", "instagram");
                    DbS.A1I(A0e, str);
                    DbS.A1J(A0e, str2);
                    A0e.A8M(eZp, "source");
                    A0e.A8M(eZo, "surface");
                    A0e.AAJ(AnonymousClass9PN.A01(), fYu.A00);
                    if (map != null) {
                        A0e.A9H("extra", map);
                    }
                    A0e.Cgf();
                }
            } catch (NumberFormatException e) {
                0wb.A06("CreatorSubscriberChatLogger", "Failed to convert user id to long", e);
            }
        }
    }

    public C50337FYu(UserSession userSession) {
        this.A02 = userSession;
        AnonymousClass0kM A0M = DbY.A0M(userSession);
        A0M.A01 = C66579MXk.A00(743);
        this.A01 = A0M.A00();
    }

    public static final 0eP A00(C69318NjJ njJ) {
        C48146EZo eZo;
        C48147EZp eZp;
        int ordinal = njJ.ordinal();
        if (ordinal != 14) {
            if (ordinal == 0) {
                eZo = C48146EZo.STORY;
            } else if (ordinal != 10) {
                return null;
            } else {
                eZo = C48146EZo.DIRECT_INVITE_NOTIFICATION;
            }
            eZp = C48147EZp.SUBSCRIBER_JOIN_CHAT_SHEET;
        } else {
            eZo = C48146EZo.SSC_LIST_IN_SUBSCRIPTION_SETTINGS;
            eZp = C48147EZp.CHANNEL_ROW;
        }
        return AnonymousClass7TE.A1L(eZo, eZp);
    }

    public static final void A02(C50337FYu fYu) {
        fYu.A00 = AnonymousClass7TF.A0b();
    }
}
