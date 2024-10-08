package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import X.0qQ;
import X.1Ef;
import X.1vo;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C312946fT;
import X.C41845B3m;
import X.C41847B3o;
import X.C45466Cx2;
import X.C45917DEx;
import X.C45930DFk;
import X.CU7;
import X.DFW;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ARDRemoteModelVersionFetcher implements RemoteModelVersionFetcher {
    public static final CU7 Companion = new Object();
    public static final int REQUEST_CACHE_TTL_SECONDS = 3600;
    public static final String TAG = "ARDRemoteModelVersionFetcher";
    public final C312946fT forceDownloadFlagHandler;
    public final 1vo graphQLQueryExecutor;

    public void fetchServerPreferredVersions(List list, XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback) {
        List list2 = list;
        XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback2 = xplatRemoteModelVersionFetchCompletionCallback;
        AnonymousClass7TG.A1N(list, xplatRemoteModelVersionFetchCompletionCallback);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String serverValue = ((VersionedCapability) it.next()).toServerValue();
            0qQ.A07(serverValue);
            A1C.add(serverValue);
        }
        try {
            C45930DFk dFk = (C45930DFk) C41847B3o.A17(C45466Cx2.class, "create", 0);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A1C);
            dFk.A00.A05("capability_types", copyOf);
            dFk.A02 = AnonymousClass7TF.A1V(copyOf);
            1Ef build = dFk.build();
            this.graphQLQueryExecutor.ATL(new C45917DEx(xplatRemoteModelVersionFetchCompletionCallback, 0), new DFW(0, list2, this, A1C, xplatRemoteModelVersionFetchCompletionCallback2), build);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C41845B3m.A0j(e);
        }
    }

    public ARDRemoteModelVersionFetcher(1vo r1, C312946fT r2) {
        AnonymousClass7TG.A1O(r1, r2);
        this.graphQLQueryExecutor = r1;
        this.forceDownloadFlagHandler = r2;
    }
}
