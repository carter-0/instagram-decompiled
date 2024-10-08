package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.I7v  reason: case insensitive filesystem */
public final class C56689I7v implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass4X0 A00;
    public final /* synthetic */ C354808Nl A01;
    public final /* synthetic */ PromptStickerModel A02;

    public C56689I7v(AnonymousClass4X0 r1, C354808Nl r2, PromptStickerModel promptStickerModel) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = promptStickerModel;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float A002 = AnonymousClass7TH.A00(valueAnimator);
        this.A01.EVv(1.0f - (0.7f * A002));
        AnonymousClass4X0 r5 = this.A00;
        PromptStickerModel promptStickerModel = this.A02;
        String str = "primaryCardView";
        if (AnonymousClass4X0.A03(promptStickerModel)) {
            C252063oV r0 = r5.A06;
            if (r0 == null) {
                str = "secondaryCardViewStubber";
            } else {
                View view = r0.getView();
                View view2 = r5.A00;
                if (view2 != null) {
                    view.setRotation(view2.getRotation() + (-5.0f * A002));
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        if (AnonymousClass4X0.A04(promptStickerModel)) {
            C252063oV r02 = r5.A07;
            if (r02 == null) {
                str = "tertiaryCardViewStubber";
            } else {
                View view3 = r02.getView();
                View view4 = r5.A00;
                if (view4 != null) {
                    view3.setRotation(view4.getRotation() + (7.0f * A002));
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        if (A002 == 1.0f) {
            r5.A0I.add(promptStickerModel);
        }
    }
}
