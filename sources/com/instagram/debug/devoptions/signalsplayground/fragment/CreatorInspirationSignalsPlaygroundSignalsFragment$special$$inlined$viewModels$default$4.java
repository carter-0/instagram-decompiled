package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.0Yg;
import X.AnonymousClass07P;
import X.AnonymousClass07g;
import X.AnonymousClass0eM;
import X.AnonymousClass2YP;
import X.AnonymousClass2YQ;
import X.C62320sa;

public final class CreatorInspirationSignalsPlaygroundSignalsFragment$special$$inlined$viewModels$default$4 extends 0Yg implements C62320sa {
    public final /* synthetic */ C62320sa $extrasProducer;
    public final /* synthetic */ AnonymousClass0eM $owner$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundSignalsFragment$special$$inlined$viewModels$default$4(C62320sa r2, AnonymousClass0eM r3) {
        super(0);
        this.$extrasProducer = r2;
        this.$owner$delegate = r3;
    }

    public final AnonymousClass2YQ invoke() {
        AnonymousClass07P r1;
        AnonymousClass2YQ r0;
        C62320sa r02 = this.$extrasProducer;
        if (r02 != null && (r0 = (AnonymousClass2YQ) r02.invoke()) != null) {
            return r0;
        }
        AnonymousClass07g r12 = (AnonymousClass07g) this.$owner$delegate.getValue();
        if (!(r12 instanceof AnonymousClass07P) || (r1 = (AnonymousClass07P) r12) == null) {
            return AnonymousClass2YP.A00;
        }
        return r1.getDefaultViewModelCreationExtras();
    }
}
