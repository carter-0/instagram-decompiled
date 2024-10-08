package X;

import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

public final class LN4 {
    public Boolean A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = C66294MMd.A01(this, 22);
    public final PromptStickerModel A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public LN4(AnonymousClass0iw r2, UserSession userSession, PromptStickerModel promptStickerModel, String str, String str2, String str3) {
        C51974G9v.A0d(1, userSession, str2, str3, promptStickerModel);
        this.A02 = userSession;
        this.A01 = r2;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A04 = promptStickerModel;
    }

    public static final void A00(LN4 ln4, String str, String str2) {
        long j;
        Long l;
        try {
            PromptStickerModel promptStickerModel = ln4.A04;
            if (promptStickerModel.A03() != StoryPromptType.ELECTION) {
                0Aj A0e = AnonymousClass7TE.A0e((0wc) ln4.A03.getValue(), "reel_prompt_sticker_interaction");
                String str3 = ln4.A05;
                if (str3 == null) {
                    str3 = promptStickerModel.A05();
                }
                C51965G9l.A1I(A0e, str3);
                DbS.A1J(A0e, str);
                String str4 = promptStickerModel.A03;
                0qQ.A0B(str4, 0);
                Long A0n = 00y.A0n(10, str4);
                if (A0n != null) {
                    j = A0n.longValue();
                } else {
                    j = -1;
                }
                A0e.A9F("prompt_id", Long.valueOf(j));
                A0e.A9F("prompt_participant_count", DbS.A0j(promptStickerModel.A00.Bak()));
                A0e.AAJ("tray_session_id", ln4.A06);
                C51965G9l.A1O(A0e, ln4.A07);
                if (str2 != null) {
                    l = 00y.A0n(10, str2);
                } else {
                    l = null;
                }
                A0e.A9F("prompt_participant_id", l);
                A0e.A7p("prompt_attribution_showing", ln4.A00);
                A0e.Cgf();
            }
        } catch (NumberFormatException e) {
            0KC.A0C("PromptStickerLogger", e.getMessage());
        }
    }
}
