package com.facebook.rsys.callinfo.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C66583MXo;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;

public class UserProfile {
    public static 2LV CONVERTER = C71546Omh.A00(15);
    public static long sMcfTypeId;
    public final String actorId;
    public final boolean authTypeIsAnonymousUser;
    public final int blockedByViewerStatus;
    public final boolean canViewerMessage;
    public final int capabilities;
    public final long capabilities2;
    public final int contactTypeExact;
    public final String firstName;
    public final int friendshipStatus;
    public final boolean isGuest;
    public final String name;
    public final String profilePictureUrl;
    public final long profilePictureUrlExpirationTimestampMs;
    public final String profilePictureUrlFallback;
    public final String secondaryName;
    public final String thirdPartyId;
    public final String userId;
    public final int userProfileState;

    public static native UserProfile createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UserProfile)) {
                return false;
            }
            UserProfile userProfile = (UserProfile) obj;
            if (this.userProfileState != userProfile.userProfileState || !this.userId.equals(userProfile.userId)) {
                return false;
            }
            String str = this.actorId;
            String str2 = userProfile.actorId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.thirdPartyId;
            String str4 = userProfile.thirdPartyId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.firstName;
            String str6 = userProfile.firstName;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.name;
            String str8 = userProfile.name;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.profilePictureUrl;
            String str10 = userProfile.profilePictureUrl;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            String str11 = this.profilePictureUrlFallback;
            String str12 = userProfile.profilePictureUrlFallback;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            if (this.profilePictureUrlExpirationTimestampMs != userProfile.profilePictureUrlExpirationTimestampMs || this.isGuest != userProfile.isGuest || this.blockedByViewerStatus != userProfile.blockedByViewerStatus || this.contactTypeExact != userProfile.contactTypeExact) {
                return false;
            }
            String str13 = this.secondaryName;
            String str14 = userProfile.secondaryName;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            if (!(this.canViewerMessage == userProfile.canViewerMessage && this.authTypeIsAnonymousUser == userProfile.authTypeIsAnonymousUser && this.friendshipStatus == userProfile.friendshipStatus && this.capabilities == userProfile.capabilities && this.capabilities2 == userProfile.capabilities2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A01 = C66583MXo.A01(this.userProfileState);
        long j = this.profilePictureUrlExpirationTimestampMs;
        long j2 = this.capabilities2;
        return ((((((((((((((((AnonymousClass7TF.A01(j, (((((((((((AnonymousClass7TF.A08(this.userId, A01) + AnonymousClass7TG.A0E(this.actorId)) * 31) + AnonymousClass7TG.A0E(this.thirdPartyId)) * 31) + AnonymousClass7TG.A0E(this.firstName)) * 31) + AnonymousClass7TG.A0E(this.name)) * 31) + AnonymousClass7TG.A0E(this.profilePictureUrl)) * 31) + AnonymousClass7TG.A0E(this.profilePictureUrlFallback)) * 31) + (this.isGuest ? 1 : 0)) * 31) + this.blockedByViewerStatus) * 31) + this.contactTypeExact) * 31) + C41845B3m.A00(this.secondaryName)) * 31) + (this.canViewerMessage ? 1 : 0)) * 31) + (this.authTypeIsAnonymousUser ? 1 : 0)) * 31) + this.friendshipStatus) * 31) + this.capabilities) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public UserProfile(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, int i2, int i3, String str8, boolean z2, boolean z3, int i4, int i5, long j2) {
        str.getClass();
        this.userProfileState = i;
        this.userId = str;
        this.actorId = str2;
        this.thirdPartyId = str3;
        this.firstName = str4;
        this.name = str5;
        this.profilePictureUrl = str6;
        this.profilePictureUrlFallback = str7;
        this.profilePictureUrlExpirationTimestampMs = j;
        this.isGuest = z;
        this.blockedByViewerStatus = i2;
        this.contactTypeExact = i3;
        this.secondaryName = str8;
        this.canViewerMessage = z2;
        this.authTypeIsAnonymousUser = z3;
        this.friendshipStatus = i4;
        this.capabilities = i5;
        this.capabilities2 = j2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UserProfile{userProfileState=");
        A1A.append(this.userProfileState);
        A1A.append(",userId=");
        A1A.append(this.userId);
        A1A.append(",actorId=");
        A1A.append(this.actorId);
        A1A.append(",thirdPartyId=");
        A1A.append(this.thirdPartyId);
        A1A.append(",firstName=");
        A1A.append(this.firstName);
        A1A.append(",name=");
        A1A.append(this.name);
        A1A.append(",profilePictureUrl=");
        A1A.append(this.profilePictureUrl);
        A1A.append(",profilePictureUrlFallback=");
        A1A.append(this.profilePictureUrlFallback);
        A1A.append(",profilePictureUrlExpirationTimestampMs=");
        A1A.append(this.profilePictureUrlExpirationTimestampMs);
        A1A.append(",isGuest=");
        A1A.append(this.isGuest);
        A1A.append(",blockedByViewerStatus=");
        A1A.append(this.blockedByViewerStatus);
        A1A.append(",contactTypeExact=");
        A1A.append(this.contactTypeExact);
        A1A.append(",secondaryName=");
        A1A.append(this.secondaryName);
        A1A.append(",canViewerMessage=");
        A1A.append(this.canViewerMessage);
        A1A.append(",authTypeIsAnonymousUser=");
        A1A.append(this.authTypeIsAnonymousUser);
        A1A.append(",friendshipStatus=");
        A1A.append(this.friendshipStatus);
        A1A.append(",capabilities=");
        A1A.append(this.capabilities);
        A1A.append(",capabilities2=");
        A1A.append(this.capabilities2);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
