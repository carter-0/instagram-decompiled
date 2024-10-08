package com.instagram.debug.devoptions.signalsplayground.repository;

import X.AnonymousClass4D7;
import X.AnonymousClass972;
import X.C64101El;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository", f = "CreatorInspirationSignalsPlaygroundRepository.kt", i = {0, 0, 0}, l = {116}, m = "fetchSignalRecommendations", n = {"this", "identifier", "userId"}, s = {"L$0", "L$1", "L$2"})
public final class CreatorInspirationSignalsPlaygroundRepository$fetchSignalRecommendations$1 extends C64101El {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundRepository$fetchSignalRecommendations$1(CreatorInspirationSignalsPlaygroundRepository creatorInspirationSignalsPlaygroundRepository, AnonymousClass4D7 r2) {
        super(r2);
        this.this$0 = creatorInspirationSignalsPlaygroundRepository;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository$fetchSignalRecommendations$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.this$0.fetchSignalRecommendations((String) null, (String) null, this);
    }
}
