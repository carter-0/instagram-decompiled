package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass7TE;
import X.Pxe;

public class ARModelMetadataRequest {
    public VersionedCapability mCapability;
    public boolean mForceDownload;
    public boolean mIsMinVersionTranslatedToNmlml;
    public int mMinVersion;
    public int mPreferredVersion;
    public int mRequestId;

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public boolean getForceDownloadFlag() {
        return this.mForceDownload;
    }

    public boolean getIsMinVersionTranslatedToNmlmlFlag() {
        return this.mIsMinVersionTranslatedToNmlml;
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public int getPreferredVersion() {
        return this.mPreferredVersion;
    }

    public int getRequestId() {
        return this.mRequestId;
    }

    public ARModelMetadataRequest(int i, int i2, int i3) {
        this(VersionedCapability.fromXplatValue(i), i2, i2, false);
        this.mRequestId = i3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.mCapability);
        A1A.append("-");
        A1A.append(this.mMinVersion);
        A1A.append("-");
        return Pxe.A0z(A1A, this.mPreferredVersion);
    }

    public ARModelMetadataRequest(VersionedCapability versionedCapability, int i, int i2, boolean z, boolean z2) {
        this.mCapability = versionedCapability;
        this.mMinVersion = i;
        this.mPreferredVersion = i2;
        this.mForceDownload = z;
        this.mIsMinVersionTranslatedToNmlml = z2;
    }

    public ARModelMetadataRequest(VersionedCapability versionedCapability, int i, int i2, boolean z) {
        this.mCapability = versionedCapability;
        this.mMinVersion = i;
        this.mPreferredVersion = i2;
        this.mForceDownload = z;
        this.mIsMinVersionTranslatedToNmlml = false;
    }
}
