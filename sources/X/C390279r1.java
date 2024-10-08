package X;

import android.graphics.RectF;
import android.view.ViewGroup;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.api.schemas.StoryTemplateDict;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.9r1  reason: invalid class name and case insensitive filesystem */
public final class C390279r1 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelStoriesTemplateCreationFragment";
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A02, new MJ2(this, 5));
    public final AnonymousClass0eM A01 = new C227862kA(new MJ2(this, 6), new MJ2(this, 7), new MJ5(2, (Object) null, this), new 0Yh(StoriesTemplateParticipationViewModel.class));

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 0);
        int A09 = 0nA.A09(requireContext());
        RectF A0C = AnonymousClass7TF.A0C((float) A09, (float) 0nA.A08(requireContext()));
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A002, this);
        AnonymousClass80D.A09(AnonymousClass7TE.A0k(this), AnonymousClass80H.A02, A002, this);
        A002.A09 = viewGroup2;
        AnonymousClass80D.A07(28D.A4Y, this, A002);
        AnonymousClass80D.A02(A0C, (RectF) null, A002);
        AnonymousClass80D.A0A(A002);
        this.A01.getValue();
        PromptStickerModel promptStickerModel = new PromptStickerModel((GenAIToolInfoDict) null, StoryPromptType.STORY_TEMPLATE, (User) null, AnonymousClass05K.A00, "", "", (String) null, (String) null, (String) null, AnonymousClass7TE.A1I(AnonymousClass7TF.A0Q(AnonymousClass7TE.A0k(this))), 0, 0, false, false, false);
        C39890ADo aDo = new C39890ADo();
        ABC.A01(aDo, Float.valueOf(0.75f));
        A002.A12 = new C3499382n((StoryTemplateDict) null, promptStickerModel, new C310416b1(aDo), (HashMap) this.A00.getValue(), A09, true, false);
        A002.A3Q = true;
        return A002;
    }

    public final String getModuleName() {
        return "reel_prompt_template_creation";
    }
}
