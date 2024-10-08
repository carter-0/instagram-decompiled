package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C48116EWi;
import X.C49261Es4;
import X.DbS;
import X.Dba;
import androidx.fragment.app.Fragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.L;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalsQueryResponse;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundSignalRowViewHolder;

public final class CreatorInspirationSignalsPlaygroundSignalsFragment$signalDelegate$1 implements CreatorInspirationSignalsPlaygroundSignalRowViewHolder.Delegate {
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundSignalsFragment this$0;

    public void onSignalRowClick(CreatorInspirationSignalsPlaygroundSignalsQueryResponse.XdtGetCreatorsSignalPlayground.Signals signals) {
        String name;
        Fragment newInstance;
        String name2;
        0qQ.A0B(signals, 0);
        if (signals.getIdentifier() != null && signals.getDisplayName() != null && signals.getEntityTypeV2() != null) {
            if (L.ig_android_lumen_signals_dogfooding.skip_select_user.getAndExpose(AnonymousClass7TE.A0l(this.this$0.session$delegate)).booleanValue()) {
                String identifier = signals.getIdentifier();
                if (identifier != null) {
                    String displayName = signals.getDisplayName();
                    if (displayName != null) {
                        C48116EWi entityTypeV2 = signals.getEntityTypeV2();
                        if (entityTypeV2 == null || (name2 = entityTypeV2.name()) == null) {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        newInstance = C49261Es4.A00(identifier, displayName, name2, AnonymousClass7TE.A0l(this.this$0.session$delegate).A06);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                CreatorInspirationSignalsPlaygroundTestUsersFragment.Companion companion = CreatorInspirationSignalsPlaygroundTestUsersFragment.Companion;
                String identifier2 = signals.getIdentifier();
                if (identifier2 != null) {
                    String displayName2 = signals.getDisplayName();
                    if (displayName2 != null) {
                        C48116EWi entityTypeV22 = signals.getEntityTypeV2();
                        if (entityTypeV22 == null || (name = entityTypeV22.name()) == null) {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        newInstance = companion.newInstance(identifier2, displayName2, name);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            0qQ.A0A(newInstance);
            Dba.A12(newInstance, DbS.A0M(this.this$0.requireActivity(), AnonymousClass7TE.A0l(this.this$0.session$delegate)));
        }
    }

    public CreatorInspirationSignalsPlaygroundSignalsFragment$signalDelegate$1(CreatorInspirationSignalsPlaygroundSignalsFragment creatorInspirationSignalsPlaygroundSignalsFragment) {
        this.this$0 = creatorInspirationSignalsPlaygroundSignalsFragment;
    }
}
