package com.instagram.debug.devoptions.signalsplayground.viewmodel;

import X.0V2;
import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C60340gF;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$1$1", f = "CreatorInspirationSignalsPlaygroundRecommendationsViewModel.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
public final class CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$1$1 extends AnonymousClass1Ek implements 0sL {
    public int label;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundRecommendationsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$1$1(CreatorInspirationSignalsPlaygroundRecommendationsViewModel creatorInspirationSignalsPlaygroundRecommendationsViewModel, AnonymousClass4D7 r3) {
        super(2, r3);
        this.this$0 = creatorInspirationSignalsPlaygroundRecommendationsViewModel;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$1$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        return new CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$1$1(this.this$0, r4);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return new CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$1$1(this.this$0, r4).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$1$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r3 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            0V2 r1 = this.this$0._viewEffect;
            CreatorInspirationSignalsPlaygroundRecommendationsViewModel.ViewEffect.ScrollToNextPosition scrollToNextPosition = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.ViewEffect.ScrollToNextPosition.INSTANCE;
            this.label = 1;
            if (r1.emit(scrollToNextPosition, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            0eS.A00(obj);
        } else {
            throw AnonymousClass7TE.A0x();
        }
        return C60340gF.A00;
    }
}
