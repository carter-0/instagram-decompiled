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

@DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalDetailsViewModel$fetchSignalDetails$1", f = "CreatorInspirationSignalsPlaygroundSignalDetailsViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
public final class CreatorInspirationSignalsPlaygroundSignalDetailsViewModel$fetchSignalDetails$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ String $identifier;
    public int label;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundSignalDetailsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundSignalDetailsViewModel$fetchSignalDetails$1(CreatorInspirationSignalsPlaygroundSignalDetailsViewModel creatorInspirationSignalsPlaygroundSignalDetailsViewModel, String str, AnonymousClass4D7 r4) {
        super(2, r4);
        this.this$0 = creatorInspirationSignalsPlaygroundSignalDetailsViewModel;
        this.$identifier = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalDetailsViewModel$fetchSignalDetails$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        return new CreatorInspirationSignalsPlaygroundSignalDetailsViewModel$fetchSignalDetails$1(this.this$0, this.$identifier, r5);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return ((CreatorInspirationSignalsPlaygroundSignalDetailsViewModel$fetchSignalDetails$1) create(r3, r4)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalDetailsViewModel$fetchSignalDetails$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r3 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            CreatorInspirationSignalsPlaygroundRepository creatorInspirationSignalsPlaygroundRepository = this.this$0.repository;
            String str = this.$identifier;
            this.label = 1;
            if (creatorInspirationSignalsPlaygroundRepository.fetchSignalDetails(str, this) == r3) {
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
