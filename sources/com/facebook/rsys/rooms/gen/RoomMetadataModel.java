package com.facebook.rsys.rooms.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class RoomMetadataModel {
    public static 2LV CONVERTER = C22181Xwr.A00(52);
    public static long sMcfTypeId;
    public final boolean canViewerModerateRoom;
    public final boolean canViewerReportToAdmins;
    public final boolean canViewerReportToFb;
    public final String groupReportableId;
    public final int linkSurface;
    public final String roomBroadcastId;
    public final String roomName;
    public final String roomSubtitleName;
    public final String workoomsCollaborationSpaceLink;

    public static native RoomMetadataModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RoomMetadataModel)) {
                return false;
            }
            RoomMetadataModel roomMetadataModel = (RoomMetadataModel) obj;
            String str = this.roomName;
            String str2 = roomMetadataModel.roomName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.roomSubtitleName;
            String str4 = roomMetadataModel.roomSubtitleName;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.linkSurface != roomMetadataModel.linkSurface || this.canViewerReportToFb != roomMetadataModel.canViewerReportToFb || this.canViewerReportToAdmins != roomMetadataModel.canViewerReportToAdmins) {
                return false;
            }
            String str5 = this.groupReportableId;
            String str6 = roomMetadataModel.groupReportableId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.roomBroadcastId;
            String str8 = roomMetadataModel.roomBroadcastId;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.workoomsCollaborationSpaceLink;
            String str10 = roomMetadataModel.workoomsCollaborationSpaceLink;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            return this.canViewerModerateRoom == roomMetadataModel.canViewerModerateRoom;
        }
    }

    public int hashCode() {
        return ((((((((((((((C66583MXo.A01(AnonymousClass7TG.A0E(this.roomName)) + AnonymousClass7TG.A0E(this.roomSubtitleName)) * 31) + this.linkSurface) * 31) + (this.canViewerReportToFb ? 1 : 0)) * 31) + (this.canViewerReportToAdmins ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.groupReportableId)) * 31) + AnonymousClass7TG.A0E(this.roomBroadcastId)) * 31) + C41845B3m.A00(this.workoomsCollaborationSpaceLink)) * 31) + (this.canViewerModerateRoom ? 1 : 0);
    }

    public RoomMetadataModel(String str, String str2, int i, boolean z, boolean z2, String str3, String str4, String str5, boolean z3) {
        this.roomName = str;
        this.roomSubtitleName = str2;
        this.linkSurface = i;
        this.canViewerReportToFb = z;
        this.canViewerReportToAdmins = z2;
        this.groupReportableId = str3;
        this.roomBroadcastId = str4;
        this.workoomsCollaborationSpaceLink = str5;
        this.canViewerModerateRoom = z3;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RoomMetadataModel{roomName=");
        A1A.append(this.roomName);
        A1A.append(",roomSubtitleName=");
        A1A.append(this.roomSubtitleName);
        A1A.append(",linkSurface=");
        A1A.append(this.linkSurface);
        A1A.append(",canViewerReportToFb=");
        A1A.append(this.canViewerReportToFb);
        A1A.append(",canViewerReportToAdmins=");
        A1A.append(this.canViewerReportToAdmins);
        A1A.append(",groupReportableId=");
        A1A.append(this.groupReportableId);
        A1A.append(",roomBroadcastId=");
        A1A.append(this.roomBroadcastId);
        A1A.append(",workoomsCollaborationSpaceLink=");
        A1A.append(this.workoomsCollaborationSpaceLink);
        A1A.append(",canViewerModerateRoom=");
        return C66584MXp.A0b(A1A, this.canViewerModerateRoom);
    }
}
