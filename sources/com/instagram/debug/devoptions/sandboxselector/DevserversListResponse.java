package com.instagram.debug.devoptions.sandboxselector;

import X.C21014X9q;
import X.C250673ls;
import com.google.common.collect.ImmutableList;

public interface DevserversListResponse extends C250673ls {

    public interface XdtApiV1DevserversList extends C250673ls {

        public interface DevserverInfos extends C250673ls {
            DevServerInfoDescription asDevServerInfoDescription();

            boolean getFragmentDevServerInfoDescriptionIsFulfilled();

            String getHostType();

            String getUrl();

            boolean hasFragmentDevServerInfoDescriptionIsFulfilled();
        }

        ImmutableList getDevserverInfos();

        ImmutableList getErrorMessages();

        boolean hasIsInternal();

        boolean isInternal();
    }

    XdtApiV1DevserversList getXdtApiV1DevserversList();

    C21014X9q getXdtApiV1DevserversListAsApiTypeModel();
}
