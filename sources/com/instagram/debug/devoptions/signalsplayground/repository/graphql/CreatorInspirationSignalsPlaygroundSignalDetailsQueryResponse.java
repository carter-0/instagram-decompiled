package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.C250673ls;
import com.google.common.collect.ImmutableList;

public interface CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse extends C250673ls {

    public interface XdtGetCreatorsSignalPlayground extends C250673ls {

        public interface Signal extends C250673ls {

            public interface TestCases extends C250673ls {

                public interface User extends C250673ls {
                    CreatorInspirationSignalsPlaygroundTestUser asCreatorInspirationSignalsPlaygroundTestUser();
                }

                User getUser();
            }

            ImmutableList getTestCases();
        }

        Signal getSignal();
    }

    XdtGetCreatorsSignalPlayground getXdtGetCreatorsSignalPlayground();
}
