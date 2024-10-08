package X;

import com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.9yK  reason: invalid class name and case insensitive filesystem */
public abstract class C394569yK {
    public static final Set A00(CaptureRuleSystemState captureRuleSystemState) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (captureRuleSystemState.A0n) {
            linkedHashSet.add(new C39787A9h(C347677xC.IG_RESHARED_STORY));
        }
        if (captureRuleSystemState.A0f) {
            linkedHashSet.add(new C39787A9h(C347677xC.IG_SHOPPING_STICKER));
        }
        if (captureRuleSystemState.A0k) {
            linkedHashSet.add(new C39787A9h(C347677xC.IG_RESHARED_REELS));
        }
        if (captureRuleSystemState.A0c) {
            linkedHashSet.add(new C39787A9h(C347677xC.IG_QUESTION_STICKER));
        }
        if (captureRuleSystemState.A02 > 0) {
            linkedHashSet.add(new C39787A9h(C347677xC.IG_INTERNAL_STICKER));
        }
        return 00k.A0k(linkedHashSet);
    }
}
