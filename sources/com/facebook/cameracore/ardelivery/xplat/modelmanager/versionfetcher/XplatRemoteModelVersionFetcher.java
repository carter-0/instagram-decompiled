package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import X.002;
import X.0Gb;
import X.0qQ;
import X.2Og;
import X.AnonymousClass05K;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class XplatRemoteModelVersionFetcher {
    public final 0Gb errorReporter;
    public final RemoteModelVersionFetcher modelVersionFetcher;

    public XplatRemoteModelVersionFetcher(RemoteModelVersionFetcher remoteModelVersionFetcher, 0Gb r3) {
        0qQ.A0B(remoteModelVersionFetcher, 1);
        0qQ.A0B(r3, 2);
        this.modelVersionFetcher = remoteModelVersionFetcher;
        this.errorReporter = r3;
    }

    public final void fetchServerPreferredVersions(List list, XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback) {
        String str;
        0qQ.A0B(list, 0);
        0qQ.A0B(xplatRemoteModelVersionFetchCompletionCallback, 1);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VersionedCapability fromXplatValue = VersionedCapability.fromXplatValue(((Number) it.next()).intValue());
            if (fromXplatValue != null) {
                arrayList.add(fromXplatValue);
            }
        }
        try {
            this.modelVersionFetcher.fetchServerPreferredVersions(arrayList, xplatRemoteModelVersionFetchCompletionCallback);
        } catch (IllegalStateException e) {
            this.errorReporter.EFW("ArDelivery", AnonymousClass05K.A00, 002.A0R("XplatRemoteModelVersionFetcher hits illegal state exception: ", 2Og.A00(e)));
            str = "XplatRemoteModelVersionFetcher hits illegal state exception";
            xplatRemoteModelVersionFetchCompletionCallback.onFailure(str);
        } catch (IllegalArgumentException e2) {
            this.errorReporter.EFW("ArDelivery", AnonymousClass05K.A00, 002.A0R("XplatRemoteModelVersionFetcher hits illegal argument exception: ", 2Og.A00(e2)));
            str = "XplatRemoteModelVersionFetcher hits illegal argument exception";
            xplatRemoteModelVersionFetchCompletionCallback.onFailure(str);
        } catch (Exception e3) {
            this.errorReporter.EFW("ArDelivery", AnonymousClass05K.A00, 002.A0R("XplatRemoteModelVersionFetcher hits exception: ", 2Og.A00(e3)));
            str = "XplatRemoteModelVersionFetcher hits exception";
            xplatRemoteModelVersionFetchCompletionCallback.onFailure(str);
        }
    }
}
