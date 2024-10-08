package X;

import android.graphics.drawable.Drawable;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.9Sv  reason: invalid class name */
public abstract class AnonymousClass9Sv {
    public static final boolean A00(Drawable drawable) {
        C59812JZg jZg;
        PromptStickerModel promptStickerModel;
        if (drawable instanceof C347017w8) {
            C347017w8 r2 = (C347017w8) drawable;
            if (r2.A04() instanceof C59812JZg) {
                Drawable A04 = r2.A04();
                StoryPromptType storyPromptType = null;
                if (!(!(A04 instanceof C59812JZg) || (jZg = (C59812JZg) A04) == null || (promptStickerModel = jZg.A06) == null)) {
                    storyPromptType = promptStickerModel.A03();
                }
                if (storyPromptType != StoryPromptType.ELECTION) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean A01(Drawable drawable) {
        C369768vI r1;
        C318046oG r12;
        if (!(drawable instanceof C347017w8)) {
            return false;
        }
        C347017w8 r3 = (C347017w8) drawable;
        if (!(r3.A04() instanceof C369768vI)) {
            return false;
        }
        Drawable A04 = r3.A04();
        if (!(A04 instanceof C369768vI) || (r1 = (C369768vI) A04) == null || (r12 = r1.A0M) == C318046oG.AVATAR_STATIC || r12 == C318046oG.AVATAR_ANIMATED) {
            return false;
        }
        return true;
    }

    public static final boolean A02(Drawable drawable) {
        if (!(drawable instanceof C347017w8) || !(((C347017w8) drawable).A04() instanceof C321016tR)) {
            return false;
        }
        return true;
    }
}
