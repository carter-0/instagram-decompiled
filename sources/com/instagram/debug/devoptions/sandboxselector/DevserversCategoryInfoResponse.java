package com.instagram.debug.devoptions.sandboxselector;

import X.C250673ls;
import com.google.common.collect.ImmutableList;

public interface DevserversCategoryInfoResponse extends C250673ls {

    public interface XdtApiV1DevserversListCategorized extends C250673ls {

        public interface DevserverCategories extends C250673ls {

            public interface DevserverInfos extends C250673ls {
                String getDescription();

                String getHostType();

                String getUrl();
            }

            ImmutableList getDevserverInfos();

            String getName();

            boolean getSupportsVpnless();

            boolean hasSupportsVpnless();
        }

        ImmutableList getDevserverCategories();

        ImmutableList getErrorMessages();

        boolean hasIsInternal();

        boolean isInternal();
    }

    XdtApiV1DevserversListCategorized getXdtApiV1DevserversListCategorized();
}
