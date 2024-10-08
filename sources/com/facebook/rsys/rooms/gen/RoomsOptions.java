package com.facebook.rsys.rooms.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class RoomsOptions {
    public final boolean disableRoomOwnerAutoJoin;
    public final RoomPollingOptions pollingOptions;
    public final boolean shouldAttemptRetryOnFailedResolve;
    public final boolean shouldEnableGVCLink;
    public final boolean shouldEnableGVCLinkCallExperience;
    public final boolean shouldEnableRoomsUIForGVCLink;
    public final boolean shouldSkipEnterRoomSproc;

    public static native RoomsOptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RoomsOptions)) {
                return false;
            }
            RoomsOptions roomsOptions = (RoomsOptions) obj;
            if (this.shouldSkipEnterRoomSproc != roomsOptions.shouldSkipEnterRoomSproc || this.shouldEnableGVCLink != roomsOptions.shouldEnableGVCLink || this.shouldEnableRoomsUIForGVCLink != roomsOptions.shouldEnableRoomsUIForGVCLink || this.shouldEnableGVCLinkCallExperience != roomsOptions.shouldEnableGVCLinkCallExperience || this.shouldAttemptRetryOnFailedResolve != roomsOptions.shouldAttemptRetryOnFailedResolve) {
                return false;
            }
            RoomPollingOptions roomPollingOptions = this.pollingOptions;
            RoomPollingOptions roomPollingOptions2 = roomsOptions.pollingOptions;
            if (roomPollingOptions == null) {
                if (roomPollingOptions2 != null) {
                    return false;
                }
            } else if (!roomPollingOptions.equals(roomPollingOptions2)) {
                return false;
            }
            return this.disableRoomOwnerAutoJoin == roomsOptions.disableRoomOwnerAutoJoin;
        }
    }

    public final int hashCode() {
        return ((((((((((C66583MXo.A01(this.shouldSkipEnterRoomSproc ? 1 : 0) + (this.shouldEnableGVCLink ? 1 : 0)) * 31) + (this.shouldEnableRoomsUIForGVCLink ? 1 : 0)) * 31) + (this.shouldEnableGVCLinkCallExperience ? 1 : 0)) * 31) + (this.shouldAttemptRetryOnFailedResolve ? 1 : 0)) * 31) + AnonymousClass7TG.A0C(this.pollingOptions)) * 31) + (this.disableRoomOwnerAutoJoin ? 1 : 0);
    }

    public RoomsOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, RoomPollingOptions roomPollingOptions, boolean z6) {
        this.shouldSkipEnterRoomSproc = z;
        this.shouldEnableGVCLink = z2;
        this.shouldEnableRoomsUIForGVCLink = z3;
        this.shouldEnableGVCLinkCallExperience = z4;
        this.shouldAttemptRetryOnFailedResolve = z5;
        this.pollingOptions = roomPollingOptions;
        this.disableRoomOwnerAutoJoin = z6;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RoomsOptions{shouldSkipEnterRoomSproc=");
        A1A.append(this.shouldSkipEnterRoomSproc);
        A1A.append(",shouldEnableGVCLink=");
        A1A.append(this.shouldEnableGVCLink);
        A1A.append(",shouldEnableRoomsUIForGVCLink=");
        A1A.append(this.shouldEnableRoomsUIForGVCLink);
        A1A.append(",shouldEnableGVCLinkCallExperience=");
        A1A.append(this.shouldEnableGVCLinkCallExperience);
        A1A.append(",shouldAttemptRetryOnFailedResolve=");
        A1A.append(this.shouldAttemptRetryOnFailedResolve);
        A1A.append(",pollingOptions=");
        A1A.append(this.pollingOptions);
        A1A.append(",disableRoomOwnerAutoJoin=");
        return C66584MXp.A0b(A1A, this.disableRoomOwnerAutoJoin);
    }
}
