package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6jC  reason: invalid class name and case insensitive filesystem */
public final class C315006jC {
    public AnonymousClass5Gv A00;
    public AnonymousClass6Z3 A01;
    public Runnable A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final ReelViewerConfig A05;
    public final Map A06;

    public C315006jC(Context context, AnonymousClass0iw r5, UserSession userSession, ReelViewerConfig reelViewerConfig, AnonymousClass3BQ r8) {
        HashMap hashMap = new HashMap();
        this.A06 = hashMap;
        this.A04 = userSession;
        this.A03 = r5;
        this.A05 = reelViewerConfig;
        hashMap.put(C315016jD.CREATE_FROM_STORY, new Object());
        hashMap.put(C315016jD.ONE_TAP_FB_SHARE, new Object());
        hashMap.put(C315016jD.HIGHLIGHTS, new Object());
        hashMap.put(C315016jD.SLIDER_VOTERS_RESULTS, new Object());
        hashMap.put(C315016jD.QUESTION_VIEWER, new Object());
        hashMap.put(C315016jD.QUESTION_VOTERS_RESULTS, new Object());
        hashMap.put(C315016jD.QUIZ_VIEWER, new Object());
        hashMap.put(C315016jD.QUIZ_ANSWERS_RESULTS, new Object());
        hashMap.put(C315016jD.COUNTDOWN, new Object());
        hashMap.put(C315016jD.SLIDER, new Object());
        hashMap.put(C315016jD.POLL, new Object());
        hashMap.put(C315016jD.CLOSE_FRIENDS_BADGE, new C315146jQ(userSession));
        hashMap.put(C315016jD.EXCLUSIVE_STORY_BADGE, new C315156jR(userSession));
        hashMap.put(C315016jD.PRODUCT_STICKER, new Object());
        hashMap.put(C315016jD.MULTI_AUTHOR_STORY_VIEW_COUNT, new Object());
        hashMap.put(C315016jD.PROMOTE, new Object());
        hashMap.put(C315016jD.PROMOTE_STORY_WITH_ELIGIBLE_STICKER, new Object());
        hashMap.put(C315016jD.SAVED_EFFECTS_NUX, new C315206jW(context, userSession));
        hashMap.put(C315016jD.BLOKS_TAPPABLE, new C315216jX(userSession));
        hashMap.put(C315016jD.SHARE_PROFESSIONAL_PROFILE, new Object());
        hashMap.put(C315016jD.STORY_LIKES_FACEPILE_NUX, new C315236jZ(userSession));
        hashMap.put(C315016jD.ADD_MENTIONS, new Object());
        hashMap.put(C315016jD.AVATAR_STICKER, new C315256jb());
        hashMap.put(C315016jD.TAPPABLE_REACTION_STICKER, new Object());
        hashMap.put(C315016jD.REACTION_STICKER_FACEPILE_NUX, new Object());
        hashMap.put(C315016jD.SHARE_BUTTON_LOCATION_NUX, new Object());
        hashMap.put(C315016jD.STORIES_TEMPLATES, new Object());
        hashMap.put(C315016jD.BOOSTED_STORY_MENTIONS_SETTINGS, new C315306jg(r8));
        hashMap.put(C315016jD.STORY_COMMENTS, new Object());
        hashMap.put(C315016jD.BOOSTED_RESHARED_MEDIA_SETTINGS, new C315326ji(r8));
        hashMap.put(C315016jD.ACHIEVEMENT_STICKER_NUX, new Object());
    }

    public static void A00(ViewGroup viewGroup, C255773uh r4, C250973mM r5, C316026kz r6, C315036jF r7, C315006jC r8) {
        View C8E = r7.C8E(r4, r6);
        if (C8E == null) {
            AnonymousClass9UE C8F = r7.C8F(r8.A04, r4, r6);
            if (C8F != null) {
                C8E = C8F.A01;
            } else {
                return;
            }
        }
        C73414PcB pcB = new C73414PcB(C8E.getContext(), C8E, viewGroup, r4, r5, r6, r7, r8);
        r8.A02 = pcB;
        C8E.post(pcB);
    }
}
