package com.facebook.rsys.grid.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C21056XCh;
import X.C22180Xwq;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class GridOrderingParameters {
    public static 2LV CONVERTER = C22180Xwq.A00(55);
    public static long sMcfTypeId;
    public final boolean considerPinnedPeers;
    public final boolean considerRecentDominantSpeakers;
    public final boolean considerRecentlyConnectedPeers;
    public final boolean considerScreensharingPeers;
    public final boolean considerVideoStreamingPeers;
    public final GridDisplayEligibleStates displayEligibleStates;
    public final int maxPeersVisible;
    public final int orderingPreset;

    public static native GridOrderingParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridOrderingParameters)) {
            return false;
        }
        GridOrderingParameters gridOrderingParameters = (GridOrderingParameters) obj;
        return this.considerRecentlyConnectedPeers == gridOrderingParameters.considerRecentlyConnectedPeers && this.considerRecentDominantSpeakers == gridOrderingParameters.considerRecentDominantSpeakers && this.considerScreensharingPeers == gridOrderingParameters.considerScreensharingPeers && this.considerPinnedPeers == gridOrderingParameters.considerPinnedPeers && this.considerVideoStreamingPeers == gridOrderingParameters.considerVideoStreamingPeers && this.displayEligibleStates.equals(gridOrderingParameters.displayEligibleStates) && this.maxPeersVisible == gridOrderingParameters.maxPeersVisible && this.orderingPreset == gridOrderingParameters.orderingPreset;
    }

    public int hashCode() {
        return ((AnonymousClass7TF.A07(this.displayEligibleStates, (((((((C66583MXo.A01(this.considerRecentlyConnectedPeers ? 1 : 0) + (this.considerRecentDominantSpeakers ? 1 : 0)) * 31) + (this.considerScreensharingPeers ? 1 : 0)) * 31) + (this.considerPinnedPeers ? 1 : 0)) * 31) + (this.considerVideoStreamingPeers ? 1 : 0)) * 31) + this.maxPeersVisible) * 31) + this.orderingPreset;
    }

    public GridOrderingParameters(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, GridDisplayEligibleStates gridDisplayEligibleStates, int i, int i2) {
        gridDisplayEligibleStates.getClass();
        this.considerRecentlyConnectedPeers = z;
        this.considerRecentDominantSpeakers = z2;
        this.considerScreensharingPeers = z3;
        this.considerPinnedPeers = z4;
        this.considerVideoStreamingPeers = z5;
        this.displayEligibleStates = gridDisplayEligibleStates;
        this.maxPeersVisible = i;
        this.orderingPreset = i2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GridOrderingParameters{considerRecentlyConnectedPeers=");
        A1A.append(this.considerRecentlyConnectedPeers);
        A1A.append(",considerRecentDominantSpeakers=");
        A1A.append(this.considerRecentDominantSpeakers);
        A1A.append(",considerScreensharingPeers=");
        A1A.append(this.considerScreensharingPeers);
        A1A.append(",considerPinnedPeers=");
        A1A.append(this.considerPinnedPeers);
        A1A.append(",considerVideoStreamingPeers=");
        A1A.append(this.considerVideoStreamingPeers);
        A1A.append(",displayEligibleStates=");
        A1A.append(this.displayEligibleStates);
        A1A.append(",maxPeersVisible=");
        A1A.append(this.maxPeersVisible);
        A1A.append(",orderingPreset=");
        return C21056XCh.A0A(A1A, this.orderingPreset);
    }
}
