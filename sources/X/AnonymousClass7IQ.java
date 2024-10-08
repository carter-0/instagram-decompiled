package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.DirectPromptTypes;
import java.util.Map;

/* renamed from: X.7IQ  reason: invalid class name */
public final class AnonymousClass7IQ implements AnonymousClass0lh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9L0(this, 24));
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new AnonymousClass9L0(this, 25));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new AnonymousClass9L0(this, 26));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new AnonymousClass9L0(this, 27));

    public final void A00(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i == 29) {
                C72195OyG.A00((C72195OyG) this.A02.getValue(), Integer.valueOf(i2), str, str2, "direct_all_responses_tab_add_response", "tap", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
                return;
            } else if (i != 61) {
                0wc r2 = ((C70846ONz) this.A05.getValue()).A00;
                0Aj A002 = r2.A00(r2.A00, "direct_all_responses_tab_add_response");
                if (A002.isSampled()) {
                    Map A0M = 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01));
                    A002.AAJ("action", "tap");
                    A002.AAJ("source", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                    A002.A9H("extra", A0M);
                    A002.Cgf();
                    return;
                }
                return;
            }
        }
        C72196OyH.A00(C48147EZp.RESPONSE, C48146EZo.THREAD_VIEW, (C72196OyH) this.A04.getValue(), "direct_all_responses_tab_add_response", "tap", 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
    }

    public final void A01(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i == 29) {
                C72195OyG.A00((C72195OyG) this.A02.getValue(), Integer.valueOf(i2), str, str2, "direct_open_question_tab", "impression", "prompt", 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
                return;
            } else if (i != 61) {
                0wc r2 = ((C70846ONz) this.A05.getValue()).A00;
                0Aj A002 = r2.A00(r2.A00, "direct_open_question_tab");
                Map A0M = 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01));
                if (A002.isSampled()) {
                    A002.AAJ("action", "impression");
                    A002.AAJ("source", "question");
                    A002.A9H("extra", A0M);
                    A002.Cgf();
                    return;
                }
                return;
            }
        }
        C72196OyH.A00(C48147EZp.PROMPT, C48146EZo.THREAD_VIEW, (C72196OyH) this.A04.getValue(), "direct_open_question_tab", "impression", 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
    }

    public final void A02(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i == 29) {
                C72195OyG.A00((C72195OyG) this.A02.getValue(), Integer.valueOf(i2), str, str2, "remove_user_response_attempt", "tap", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
                return;
            } else if (i != 61) {
                return;
            }
        }
        C72196OyH.A00(C48147EZp.RESPONSE, C48146EZo.THREAD_VIEW, (C72196OyH) this.A04.getValue(), "remove_user_response_attempt", "tap", 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
    }

    public final void A03(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i == 29) {
                C72195OyG.A00((C72195OyG) this.A02.getValue(), Integer.valueOf(i2), str, str2, "remove_user_response_error", "impression", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
                return;
            } else if (i != 61) {
                return;
            }
        }
        C72196OyH.A00(C48147EZp.RESPONSE, C48146EZo.THREAD_VIEW, (C72196OyH) this.A04.getValue(), "remove_user_response_error", "impression", 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
    }

    public final void A04(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i == 29) {
                C72195OyG.A00((C72195OyG) this.A02.getValue(), Integer.valueOf(i2), str, str2, "remove_user_response_success", "impression", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
                return;
            } else if (i != 61) {
                return;
            }
        }
        C72196OyH.A00(C48147EZp.RESPONSE, C48146EZo.THREAD_VIEW, (C72196OyH) this.A04.getValue(), "remove_user_response_success", "impression", 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
    }

    public final void A05(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i == 29) {
                C72195OyG.A00((C72195OyG) this.A02.getValue(), Integer.valueOf(i2), str, str2, "direct_question_sticker", "tap", "prompt", 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
                return;
            } else if (i != 61) {
                return;
            }
        }
        C72196OyH.A00(C48147EZp.PROMPT, C48146EZo.THREAD_VIEW, (C72196OyH) this.A04.getValue(), "direct_question_sticker", "tap", 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
    }

    public final void A06(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i == 29) {
                C72195OyG.A00((C72195OyG) this.A02.getValue(), Integer.valueOf(i2), str, str2, "unsend_response_attempt", "tap", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
                return;
            } else if (i != 61) {
                return;
            }
        }
        C72196OyH.A00(C48147EZp.RESPONSE, C48146EZo.THREAD_VIEW, (C72196OyH) this.A04.getValue(), "unsend_response_attempt", "tap", 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
    }

    public final void A07(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i == 29) {
                C72195OyG.A00((C72195OyG) this.A02.getValue(), Integer.valueOf(i2), str, str2, "unsend_response_error", "impression", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
                return;
            } else if (i != 61) {
                return;
            }
        }
        C72196OyH.A00(C48147EZp.RESPONSE, C48146EZo.THREAD_VIEW, (C72196OyH) this.A04.getValue(), "unsend_response_error", "impression", 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
    }

    public final void A08(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2) {
        if (i != 28) {
            if (i == 29) {
                C72195OyG.A00((C72195OyG) this.A02.getValue(), Integer.valueOf(i2), str, str2, "unsend_response_success", "impression", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
                return;
            } else if (i != 61) {
                return;
            }
        }
        C72196OyH.A00(C48147EZp.RESPONSE, C48146EZo.THREAD_VIEW, (C72196OyH) this.A04.getValue(), "unsend_response_success", "impression", 0se.A0M(new 0eP("prompt_type", directPromptTypes.A01)));
    }

    public final void A09(DirectPromptTypes directPromptTypes, String str, String str2, int i, int i2, boolean z) {
        String str3;
        String str4;
        int i3 = i;
        if (i3 != 28) {
            if (i3 == 29) {
                C72195OyG oyG = (C72195OyG) this.A02.getValue();
                Integer valueOf = Integer.valueOf(i2);
                0eP r3 = new 0eP("prompt_type", directPromptTypes.A01);
                if (z) {
                    str4 = "True";
                } else {
                    str4 = "False";
                }
                C72195OyG.A00(oyG, valueOf, str, str2, "direct_question_tab_send_attempt", "tap", "prompt", 0Yt.A06(new 0eP[]{r3, new 0eP("did_user_tap_on_dice_roll", str4)}));
                return;
            } else if (i3 != 61) {
                ((C70846ONz) this.A05.getValue()).A04(directPromptTypes, false);
                return;
            }
        }
        C72196OyH oyH = (C72196OyH) this.A04.getValue();
        C48147EZp eZp = C48147EZp.PROMPT;
        C48146EZo eZo = C48146EZo.THREAD_VIEW;
        0eP r32 = new 0eP("prompt_type", directPromptTypes.A01);
        if (z) {
            str3 = "True";
        } else {
            str3 = "False";
        }
        C72196OyH.A00(eZp, eZo, oyH, "direct_question_tab_send_attempt", "tap", 0Yt.A06(new 0eP[]{r32, new 0eP("did_user_tap_on_dice_roll", str3)}));
    }

    public final void onSessionWillEnd() {
        this.A01.A03(AnonymousClass7IQ.class);
    }

    public AnonymousClass7IQ(AnonymousClass0iw r3, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r3;
    }
}
