package com.facebook.ppml.enigma;

import X.0qQ;

public final class InstallReferrerEventV2 {
    public final int activityType;
    public final String assetID;
    public final int assetType = 1;
    public final String installReferrer;
    public final String packageName;
    public final long timestamp;

    public InstallReferrerEventV2(String str, int i, int i2, String str2, long j, String str3) {
        0qQ.A0B(str2, 4);
        this.assetID = str;
        this.activityType = i2;
        this.installReferrer = str2;
        this.timestamp = j;
        this.packageName = str3;
    }
}
