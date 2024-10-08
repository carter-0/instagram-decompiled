package com.facebook.rsys.moderator.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class ModeratorModel {
    public static 2LV CONVERTER = C22181Xwr.A00(15);
    public static long sMcfTypeId;
    public final boolean allowsJoinRequestApproval;
    public final boolean allowsKickAndEndCall;
    public final boolean allowsRemoveUser;
    public final boolean allowsScreenShare;
    public final String allowsScreenShareActorId;
    public final ArrayList callModeratorsUuids;
    public final boolean desiredAllowsScreenShare;
    public final ArrayList softMutableUsers;

    public static native ModeratorModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ModeratorModel)) {
                return false;
            }
            ModeratorModel moderatorModel = (ModeratorModel) obj;
            if (this.allowsScreenShare != moderatorModel.allowsScreenShare) {
                return false;
            }
            String str = this.allowsScreenShareActorId;
            String str2 = moderatorModel.allowsScreenShareActorId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!(this.desiredAllowsScreenShare == moderatorModel.desiredAllowsScreenShare && this.allowsJoinRequestApproval == moderatorModel.allowsJoinRequestApproval && this.allowsKickAndEndCall == moderatorModel.allowsKickAndEndCall && this.allowsRemoveUser == moderatorModel.allowsRemoveUser && this.callModeratorsUuids.equals(moderatorModel.callModeratorsUuids) && this.softMutableUsers.equals(moderatorModel.softMutableUsers))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.softMutableUsers, AnonymousClass7TF.A07(this.callModeratorsUuids, (((((((((C66583MXo.A01(this.allowsScreenShare ? 1 : 0) + AnonymousClass7TG.A0E(this.allowsScreenShareActorId)) * 31) + (this.desiredAllowsScreenShare ? 1 : 0)) * 31) + (this.allowsJoinRequestApproval ? 1 : 0)) * 31) + (this.allowsKickAndEndCall ? 1 : 0)) * 31) + (this.allowsRemoveUser ? 1 : 0)) * 31));
    }

    public ModeratorModel(boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.allowsScreenShare = z;
        this.allowsScreenShareActorId = str;
        this.desiredAllowsScreenShare = z2;
        this.allowsJoinRequestApproval = z3;
        this.allowsKickAndEndCall = z4;
        this.allowsRemoveUser = z5;
        this.callModeratorsUuids = arrayList;
        this.softMutableUsers = arrayList2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ModeratorModel{allowsScreenShare=");
        A1A.append(this.allowsScreenShare);
        A1A.append(",allowsScreenShareActorId=");
        A1A.append(this.allowsScreenShareActorId);
        A1A.append(",desiredAllowsScreenShare=");
        A1A.append(this.desiredAllowsScreenShare);
        A1A.append(",allowsJoinRequestApproval=");
        A1A.append(this.allowsJoinRequestApproval);
        A1A.append(",allowsKickAndEndCall=");
        A1A.append(this.allowsKickAndEndCall);
        A1A.append(",allowsRemoveUser=");
        A1A.append(this.allowsRemoveUser);
        A1A.append(",callModeratorsUuids=");
        A1A.append(this.callModeratorsUuids);
        A1A.append(",softMutableUsers=");
        return C66582MXn.A0v(this.softMutableUsers, A1A);
    }
}
