package com.facebook.falco.fabric;

public class FFSingletonJNILogger$CollectionControlDecision {
    public long collectionControlChecksum;
    public long sampleRate;
    public FFSingletonJNILogger$CollectionControlDecisionStatus status;
    public long timeInMs;
    public boolean timeIsUnadjusted;

    public FFSingletonJNILogger$CollectionControlDecision(long j, long j2, long j3, boolean z, int i) {
        this.sampleRate = j;
        this.collectionControlChecksum = j2;
        this.timeInMs = j3;
        this.timeIsUnadjusted = z;
        this.status = FFSingletonJNILogger$CollectionControlDecisionStatus.fromVal(i);
    }
}
