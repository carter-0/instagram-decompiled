package com.instagram.debug.devoptions.signalsplayground.viewmodel;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C60340gF;
import com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$fetchSignalRecommendations$1", f = "CreatorInspirationSignalsPlaygroundRecommendationsViewModel.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
public final class CreatorInspirationSignalsPlaygroundRecommendationsViewModel$fetchSignalRecommendations$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ String $identifier;
    public final /* synthetic */ String $userId;
    public int label;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundRecommendationsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundRecommendationsViewModel$fetchSignalRecommendations$1(CreatorInspirationSignalsPlaygroundRecommendationsViewModel creatorInspirationSignalsPlaygroundRecommendationsViewModel, String str, String str2, AnonymousClass4D7 r5) {
        super(2, r5);
        this.this$0 = creatorInspirationSignalsPlaygroundRecommendationsViewModel;
        this.$identifier = str;
        this.$userId = str2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$fetchSignalRecommendations$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        return new CreatorInspirationSignalsPlaygroundRecommendationsViewModel$fetchSignalRecommendations$1(this.this$0, this.$identifier, this.$userId, r6);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return ((CreatorInspirationSignalsPlaygroundRecommendationsViewModel$fetchSignalRecommendations$1) create(r3, r4)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$fetchSignalRecommendations$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r4 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            CreatorInspirationSignalsPlaygroundRepository creatorInspirationSignalsPlaygroundRepository = this.this$0.repository;
            String str = this.$identifier;
            String str2 = this.$userId;
            this.label = 1;
            if (creatorInspirationSignalsPlaygroundRepository.fetchSignalRecommendations(str, str2, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            0eS.A00(obj);
        } else {
            throw AnonymousClass7TE.A0x();
        }
        return C60340gF.A00;
    }
}
