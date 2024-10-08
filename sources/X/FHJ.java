package X;

import android.animation.Animator;
import com.instagram.model.mediatype.ProductType;

public final class FHJ implements Animator.AnimatorListener {
    public final /* synthetic */ ProductType A00;
    public final /* synthetic */ C314996jB A01;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public FHJ(ProductType productType, C314996jB r2) {
        this.A00 = productType;
        this.A01 = r2;
    }

    public final void onAnimationEnd(Animator animator) {
        long currentTimeMillis;
        0xY AR4;
        String str;
        int ordinal = this.A00.ordinal();
        if (ordinal == 1) {
            0xa r2 = this.A01.A01;
            AnonymousClass7TG.A1M(r2, "exclusive_content_animation_post_count", DbT.A00(r2, "exclusive_content_animation_post_count") + 1);
            currentTimeMillis = System.currentTimeMillis();
            AR4 = r2.AR4();
            str = "exclusive_content_animation_post_timestamp";
        } else if (ordinal == 9) {
            0xa r22 = this.A01.A01;
            AnonymousClass7TG.A1M(r22, "exclusive_content_animation_story_count", DbT.A00(r22, "exclusive_content_animation_story_count") + 1);
            currentTimeMillis = System.currentTimeMillis();
            AR4 = r22.AR4();
            str = "exclusive_content_animation_story_timestamp";
        } else if (ordinal == 13) {
            0xa r23 = this.A01.A01;
            AnonymousClass7TG.A1M(r23, "exclusive_content_animation_tall_video_count", DbT.A00(r23, "exclusive_content_animation_tall_video_count") + 1);
            currentTimeMillis = System.currentTimeMillis();
            AR4 = r23.AR4();
            str = "exclusive_content_animation_tall_video_timestamp";
        } else {
            throw AnonymousClass7TE.A1B("ProductType does not match");
        }
        AR4.E5c(str, currentTimeMillis);
        AR4.apply();
    }
}
