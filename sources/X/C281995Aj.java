package X;

import com.instagram.api.schemas.StoryPromptDisablementState;

/* renamed from: X.5Aj  reason: invalid class name and case insensitive filesystem */
public abstract class C281995Aj {
    public static final StoryPromptDisablementState A00(String str) {
        StoryPromptDisablementState storyPromptDisablementState = (StoryPromptDisablementState) StoryPromptDisablementState.A01.get(str);
        if (storyPromptDisablementState == null) {
            return StoryPromptDisablementState.UNRECOGNIZED;
        }
        return storyPromptDisablementState;
    }
}
