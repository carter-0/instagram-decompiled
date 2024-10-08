package com.facebook.cameracore.ardelivery.xplat.modelmanager;

import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class XplatModelMetadataResponse {
    public final VersionedCapability jVersionedCapability;
    public final List modelAssets;
    public final List remoteAssetAdapters;
    public final int requestId;
    public final int version;

    public XplatModelMetadataResponse(int i, VersionedCapability versionedCapability, int i2, List list) {
        AnonymousClass7TF.A1D(versionedCapability, 2, list);
        this.requestId = i;
        this.jVersionedCapability = versionedCapability;
        this.version = i2;
        this.modelAssets = list;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(new XplatRemoteAsset((ARRequestAsset) it.next()));
        }
        this.remoteAssetAdapters = A0r;
    }

    public final List getRemoteAssetAdapters() {
        return this.remoteAssetAdapters;
    }

    public final int getRequestId() {
        return this.requestId;
    }

    public final int getVersion() {
        return this.version;
    }

    public final int getVersionedCapability() {
        return this.jVersionedCapability.getXplatValue();
    }
}
