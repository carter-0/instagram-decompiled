package com.facebook.rsys.rooms.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66581MXm;
import X.C66583MXo;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;

public class RoomParticipantInfo {
    public static 2LV CONVERTER = new C71545Omg(0);
    public static long sMcfTypeId;
    public final int blockedByViewerStatus;
    public final int capabilities;
    public final long capabilities2;
    public final String firstName;
    public final String fullName;
    public final String profilePictureFallbackUrl;
    public final String profilePictureUrl;
    public final long profilePictureUrlExpirationTimestampMs;
    public final String userId;

    public static native RoomParticipantInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RoomParticipantInfo)) {
                return false;
            }
            RoomParticipantInfo roomParticipantInfo = (RoomParticipantInfo) obj;
            if (!this.userId.equals(roomParticipantInfo.userId) || !this.fullName.equals(roomParticipantInfo.fullName) || !this.firstName.equals(roomParticipantInfo.firstName)) {
                return false;
            }
            String str = this.profilePictureUrl;
            String str2 = roomParticipantInfo.profilePictureUrl;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.profilePictureFallbackUrl;
            String str4 = roomParticipantInfo.profilePictureFallbackUrl;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (!(this.profilePictureUrlExpirationTimestampMs == roomParticipantInfo.profilePictureUrlExpirationTimestampMs && this.blockedByViewerStatus == roomParticipantInfo.blockedByViewerStatus && this.capabilities == roomParticipantInfo.capabilities && this.capabilities2 == roomParticipantInfo.capabilities2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.fullName, C66583MXo.A06(this.userId));
        long j = this.profilePictureUrlExpirationTimestampMs;
        long j2 = this.capabilities2;
        return ((((AnonymousClass7TF.A01(j, (((AnonymousClass7TF.A08(this.firstName, A08) + AnonymousClass7TG.A0E(this.profilePictureUrl)) * 31) + C41845B3m.A00(this.profilePictureFallbackUrl)) * 31) + this.blockedByViewerStatus) * 31) + this.capabilities) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public RoomParticipantInfo(String str, String str2, String str3, String str4, String str5, long j, int i, int i2, long j2) {
        C66581MXm.A1R(str, str2, str3);
        this.userId = str;
        this.fullName = str2;
        this.firstName = str3;
        this.profilePictureUrl = str4;
        this.profilePictureFallbackUrl = str5;
        this.profilePictureUrlExpirationTimestampMs = j;
        this.blockedByViewerStatus = i;
        this.capabilities = i2;
        this.capabilities2 = j2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RoomParticipantInfo{userId=");
        A1A.append(this.userId);
        A1A.append(",fullName=");
        A1A.append(this.fullName);
        A1A.append(",firstName=");
        A1A.append(this.firstName);
        A1A.append(",profilePictureUrl=");
        A1A.append(this.profilePictureUrl);
        A1A.append(",profilePictureFallbackUrl=");
        A1A.append(this.profilePictureFallbackUrl);
        A1A.append(",profilePictureUrlExpirationTimestampMs=");
        A1A.append(this.profilePictureUrlExpirationTimestampMs);
        A1A.append(",blockedByViewerStatus=");
        A1A.append(this.blockedByViewerStatus);
        A1A.append(",capabilities=");
        A1A.append(this.capabilities);
        A1A.append(",capabilities2=");
        A1A.append(this.capabilities2);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
