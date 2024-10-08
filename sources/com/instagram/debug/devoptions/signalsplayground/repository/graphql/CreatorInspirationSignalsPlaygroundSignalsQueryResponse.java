package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.C250673ls;
import X.C48116EWi;
import com.google.common.collect.ImmutableList;

public interface CreatorInspirationSignalsPlaygroundSignalsQueryResponse extends C250673ls {

    public interface XdtGetCreatorsSignalPlayground extends C250673ls {

        public interface Signals extends C250673ls {
            String getDisplayName();

            C48116EWi getEntityTypeV2();

            String getIdentifier();
        }

        ImmutableList getSignals();
    }

    XdtGetCreatorsSignalPlayground getXdtGetCreatorsSignalPlayground();
}
