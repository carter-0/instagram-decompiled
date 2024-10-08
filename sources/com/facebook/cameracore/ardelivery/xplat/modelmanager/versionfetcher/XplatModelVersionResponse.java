package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import X.0Yv;
import X.0qQ;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class XplatModelVersionResponse {
    public final List forcedDownloadFlags;
    public final List jVersionedCapabilities;
    public final List versionedCapabilities;
    public final List versions;

    public XplatModelVersionResponse(List list, List list2, List list3) {
        0qQ.A0B(list, 1);
        0qQ.A0B(list2, 2);
        0qQ.A0B(list3, 3);
        this.forcedDownloadFlags = list;
        this.jVersionedCapabilities = list2;
        this.versions = list3;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((VersionedCapability) it.next()).getXplatValue()));
        }
        this.versionedCapabilities = arrayList;
    }

    public final List getForcedDownloadFlags() {
        return this.forcedDownloadFlags;
    }

    public final List getVersionedCapabilities() {
        return this.versionedCapabilities;
    }

    public final List getVersions() {
        return this.versions;
    }
}
