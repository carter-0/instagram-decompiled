package com.instagram.debug.devoptions.sandboxselector;

import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.DbY;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.DevserverInfo;
import com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class DevServerEntityConverterKt {
    public static final List pandoToEntities(List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories devserverCategories = (DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories) it.next();
            String name = devserverCategories.getName();
            boolean supportsVpnless = devserverCategories.getSupportsVpnless();
            ImmutableList devserverInfos = devserverCategories.getDevserverInfos();
            ArrayList A0p2 = AnonymousClass7TF.A0p(devserverInfos);
            Iterator it2 = devserverInfos.iterator();
            while (it2.hasNext()) {
                DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories.DevserverInfos devserverInfos2 = (DevserversCategoryInfoResponse.XdtApiV1DevserversListCategorized.DevserverCategories.DevserverInfos) it2.next();
                String url = devserverInfos2.getUrl();
                String description = devserverInfos2.getDescription();
                if (description == null) {
                    description = "";
                }
                DbY.A1U(new DevServerEntity(url, name, description, supportsVpnless, AnonymousClass7TG.A0I()), A0q, A0p2);
            }
            A0p.add(A0p2);
        }
        return A0q;
    }

    public static final List pandoToEntitiesOld(List list) {
        0qQ.A0B(list, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DevserverInfo devserverInfo = (DevserverInfo) it.next();
            String url = devserverInfo.getUrl();
            String hostType = devserverInfo.getHostType();
            String description = devserverInfo.getDescription();
            if (description == null) {
                description = "";
            }
            A0r.add(new DevServerEntity(url, hostType, description, false, AnonymousClass7TG.A0I()));
        }
        return A0r;
    }
}
