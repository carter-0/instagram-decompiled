package com.facebook.rsys.grid.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C21056XCh;
import X.C22180Xwq;
import X.C41845B3m;
import X.C66581MXm;
import X.C66582MXn;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class GridModel {
    public static 2LV CONVERTER = C22180Xwq.A00(54);
    public static long sMcfTypeId;
    public final HashSet explicitlyPinnedPeerIds;
    public final String gridDominantSpeakerId;
    public final Map groups;
    public final String newParticipantsDefaultGridGroupId;
    public final ArrayList operationalRaisedHandsQueueUserIds;
    public final GridOrderingParameters orderingParameters;
    public final Map participantsToGroup;
    public final ArrayList peerIdsOrdered;
    public final ArrayList recencyQueue;

    public static native GridModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GridModel)) {
                return false;
            }
            GridModel gridModel = (GridModel) obj;
            if (!this.peerIdsOrdered.equals(gridModel.peerIdsOrdered) || !this.explicitlyPinnedPeerIds.equals(gridModel.explicitlyPinnedPeerIds) || !this.orderingParameters.equals(gridModel.orderingParameters) || !this.recencyQueue.equals(gridModel.recencyQueue) || !this.groups.equals(gridModel.groups) || !this.participantsToGroup.equals(gridModel.participantsToGroup)) {
                return false;
            }
            String str = this.newParticipantsDefaultGridGroupId;
            String str2 = gridModel.newParticipantsDefaultGridGroupId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.gridDominantSpeakerId;
            String str4 = gridModel.gridDominantSpeakerId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            return this.operationalRaisedHandsQueueUserIds.equals(gridModel.operationalRaisedHandsQueueUserIds);
        }
    }

    public int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.orderingParameters, AnonymousClass7TF.A07(this.explicitlyPinnedPeerIds, C21056XCh.A01(this.peerIdsOrdered)));
        return AnonymousClass7TE.A0N(this.operationalRaisedHandsQueueUserIds, (((((((AnonymousClass7TF.A07(this.recencyQueue, A07) + this.groups.hashCode()) * 31) + this.participantsToGroup.hashCode()) * 31) + AnonymousClass7TG.A0E(this.newParticipantsDefaultGridGroupId)) * 31) + C41845B3m.A00(this.gridDominantSpeakerId)) * 31);
    }

    public GridModel(ArrayList arrayList, HashSet hashSet, GridOrderingParameters gridOrderingParameters, ArrayList arrayList2, Map map, Map map2, String str, String str2, ArrayList arrayList3) {
        C66581MXm.A1R(arrayList, hashSet, gridOrderingParameters);
        C66581MXm.A1R(arrayList2, map, map2);
        arrayList3.getClass();
        this.peerIdsOrdered = arrayList;
        this.explicitlyPinnedPeerIds = hashSet;
        this.orderingParameters = gridOrderingParameters;
        this.recencyQueue = arrayList2;
        this.groups = map;
        this.participantsToGroup = map2;
        this.newParticipantsDefaultGridGroupId = str;
        this.gridDominantSpeakerId = str2;
        this.operationalRaisedHandsQueueUserIds = arrayList3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("GridModel{peerIdsOrdered=");
        A1A.append(this.peerIdsOrdered);
        A1A.append(",explicitlyPinnedPeerIds=");
        A1A.append(this.explicitlyPinnedPeerIds);
        A1A.append(",orderingParameters=");
        A1A.append(this.orderingParameters);
        A1A.append(",recencyQueue=");
        A1A.append(this.recencyQueue);
        A1A.append(",groups=");
        A1A.append(this.groups);
        A1A.append(",participantsToGroup=");
        A1A.append(this.participantsToGroup);
        A1A.append(",newParticipantsDefaultGridGroupId=");
        A1A.append(this.newParticipantsDefaultGridGroupId);
        A1A.append(",gridDominantSpeakerId=");
        A1A.append(this.gridDominantSpeakerId);
        A1A.append(",operationalRaisedHandsQueueUserIds=");
        return C66582MXn.A0v(this.operationalRaisedHandsQueueUserIds, A1A);
    }
}
