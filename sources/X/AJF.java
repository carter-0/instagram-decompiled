package X;

import android.animation.Animator;
import com.instagram.reels.common.ui.StoryTypeSelectorView;

public final class AJF implements Animator.AnimatorListener {
    public final /* synthetic */ StoryTypeSelectorView A00;

    public final void onAnimationRepeat(Animator animator) {
    }

    public AJF(StoryTypeSelectorView storyTypeSelectorView) {
        this.A00 = storyTypeSelectorView;
    }

    public final void onAnimationCancel(Animator animator) {
        StoryTypeSelectorView storyTypeSelectorView = this.A00;
        storyTypeSelectorView.A03 = false;
        StoryTypeSelectorView.A01(storyTypeSelectorView);
    }

    public final void onAnimationEnd(Animator animator) {
        this.A00.A03 = false;
    }

    public final void onAnimationStart(Animator animator) {
        this.A00.A03 = true;
    }
}
