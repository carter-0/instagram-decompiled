package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchMediaModel {
    public final boolean containsLicensedMusic;
    public final String dashManifest;
    public final long expirationTimestampMs;
    public final CowatchExternalMediaConfig externalMediaConfig;
    public final boolean isLive;
    public final String logInfo;
    public final float mediaAspectRatio;
    public final String mediaAuthor;
    public final String mediaDescription;
    public final String mediaFallbackURL;
    public final String mediaID;
    public final long mediaLastWatchedPositionMs;
    public final String mediaRankingRequestId;
    public final String mediaSource;
    public final long mediaStartPlayPositionMs;
    public final String mediaSubtitle;
    public final String mediaTitle;
    public final int mediaType;
    public final String mediaURL;
    public final boolean ownerIsVerified;
    public final long playableDurationMs;
    public final int tapAction;
    public final String thumbnailURL;
    public final String tracking;

    public static native CowatchMediaModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchMediaModel)) {
                return false;
            }
            CowatchMediaModel cowatchMediaModel = (CowatchMediaModel) obj;
            if (!this.mediaID.equals(cowatchMediaModel.mediaID) || !this.mediaSource.equals(cowatchMediaModel.mediaSource)) {
                return false;
            }
            String str = this.mediaURL;
            String str2 = cowatchMediaModel.mediaURL;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.mediaAspectRatio != cowatchMediaModel.mediaAspectRatio) {
                return false;
            }
            String str3 = this.dashManifest;
            String str4 = cowatchMediaModel.dashManifest;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.mediaType != cowatchMediaModel.mediaType) {
                return false;
            }
            String str5 = this.thumbnailURL;
            String str6 = cowatchMediaModel.thumbnailURL;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.mediaTitle;
            String str8 = cowatchMediaModel.mediaTitle;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.mediaAuthor;
            String str10 = cowatchMediaModel.mediaAuthor;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            String str11 = this.mediaSubtitle;
            String str12 = cowatchMediaModel.mediaSubtitle;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            String str13 = this.mediaDescription;
            String str14 = cowatchMediaModel.mediaDescription;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            String str15 = this.mediaFallbackURL;
            String str16 = cowatchMediaModel.mediaFallbackURL;
            if (str15 == null) {
                if (str16 != null) {
                    return false;
                }
            } else if (!str15.equals(str16)) {
                return false;
            }
            if (this.expirationTimestampMs != cowatchMediaModel.expirationTimestampMs || this.playableDurationMs != cowatchMediaModel.playableDurationMs || this.mediaLastWatchedPositionMs != cowatchMediaModel.mediaLastWatchedPositionMs || this.ownerIsVerified != cowatchMediaModel.ownerIsVerified || this.isLive != cowatchMediaModel.isLive) {
                return false;
            }
            String str17 = this.mediaRankingRequestId;
            String str18 = cowatchMediaModel.mediaRankingRequestId;
            if (str17 == null) {
                if (str18 != null) {
                    return false;
                }
            } else if (!str17.equals(str18)) {
                return false;
            }
            if (this.containsLicensedMusic != cowatchMediaModel.containsLicensedMusic) {
                return false;
            }
            String str19 = this.logInfo;
            String str20 = cowatchMediaModel.logInfo;
            if (str19 == null) {
                if (str20 != null) {
                    return false;
                }
            } else if (!str19.equals(str20)) {
                return false;
            }
            if (this.tapAction != cowatchMediaModel.tapAction) {
                return false;
            }
            String str21 = this.tracking;
            String str22 = cowatchMediaModel.tracking;
            if (str21 == null) {
                if (str22 != null) {
                    return false;
                }
            } else if (!str21.equals(str22)) {
                return false;
            }
            if (this.mediaStartPlayPositionMs != cowatchMediaModel.mediaStartPlayPositionMs) {
                return false;
            }
            CowatchExternalMediaConfig cowatchExternalMediaConfig = this.externalMediaConfig;
            CowatchExternalMediaConfig cowatchExternalMediaConfig2 = cowatchMediaModel.externalMediaConfig;
            if (cowatchExternalMediaConfig != null) {
                return cowatchExternalMediaConfig.equals(cowatchExternalMediaConfig2);
            }
            if (cowatchExternalMediaConfig2 != null) {
                return false;
            }
        }
    }

    public final int hashCode() {
        int A06 = C66583MXo.A06(this.mediaID);
        int A01 = AnonymousClass7TF.A01(this.playableDurationMs, AnonymousClass7TF.A01(this.expirationTimestampMs, (((((((((((((((AnonymousClass7TF.A00((AnonymousClass7TF.A08(this.mediaSource, A06) + AnonymousClass7TG.A0E(this.mediaURL)) * 31, this.mediaAspectRatio) + AnonymousClass7TG.A0E(this.dashManifest)) * 31) + this.mediaType) * 31) + AnonymousClass7TG.A0E(this.thumbnailURL)) * 31) + AnonymousClass7TG.A0E(this.mediaTitle)) * 31) + AnonymousClass7TG.A0E(this.mediaAuthor)) * 31) + AnonymousClass7TG.A0E(this.mediaSubtitle)) * 31) + AnonymousClass7TG.A0E(this.mediaDescription)) * 31) + AnonymousClass7TG.A0E(this.mediaFallbackURL)) * 31));
        return AnonymousClass7TF.A01(this.mediaStartPlayPositionMs, (((((((((((((AnonymousClass7TF.A01(this.mediaLastWatchedPositionMs, A01) + (this.ownerIsVerified ? 1 : 0)) * 31) + (this.isLive ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.mediaRankingRequestId)) * 31) + (this.containsLicensedMusic ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.logInfo)) * 31) + this.tapAction) * 31) + AnonymousClass7TG.A0E(this.tracking)) * 31) + AnonymousClass7TE.A0L(this.externalMediaConfig);
    }

    public CowatchMediaModel(String str, String str2, String str3, float f, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, long j, long j2, long j3, boolean z, boolean z2, String str11, boolean z3, String str12, int i2, String str13, long j4, CowatchExternalMediaConfig cowatchExternalMediaConfig) {
        str.getClass();
        str2.getClass();
        this.mediaID = str;
        this.mediaSource = str2;
        this.mediaURL = str3;
        this.mediaAspectRatio = f;
        this.dashManifest = str4;
        this.mediaType = i;
        this.thumbnailURL = str5;
        this.mediaTitle = str6;
        this.mediaAuthor = str7;
        this.mediaSubtitle = str8;
        this.mediaDescription = str9;
        this.mediaFallbackURL = str10;
        this.expirationTimestampMs = j;
        this.playableDurationMs = j2;
        this.mediaLastWatchedPositionMs = j3;
        this.ownerIsVerified = z;
        this.isLive = z2;
        this.mediaRankingRequestId = str11;
        this.containsLicensedMusic = z3;
        this.logInfo = str12;
        this.tapAction = i2;
        this.tracking = str13;
        this.mediaStartPlayPositionMs = j4;
        this.externalMediaConfig = cowatchExternalMediaConfig;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchMediaModel{mediaID=");
        A1A.append(this.mediaID);
        A1A.append(",mediaSource=");
        A1A.append(this.mediaSource);
        A1A.append(",mediaURL=");
        A1A.append(this.mediaURL);
        A1A.append(",mediaAspectRatio=");
        A1A.append(this.mediaAspectRatio);
        A1A.append(",dashManifest=");
        A1A.append(this.dashManifest);
        A1A.append(",mediaType=");
        A1A.append(this.mediaType);
        A1A.append(",thumbnailURL=");
        A1A.append(this.thumbnailURL);
        A1A.append(",mediaTitle=");
        A1A.append(this.mediaTitle);
        A1A.append(",mediaAuthor=");
        A1A.append(this.mediaAuthor);
        A1A.append(",mediaSubtitle=");
        A1A.append(this.mediaSubtitle);
        A1A.append(",mediaDescription=");
        A1A.append(this.mediaDescription);
        A1A.append(",mediaFallbackURL=");
        A1A.append(this.mediaFallbackURL);
        A1A.append(",expirationTimestampMs=");
        A1A.append(this.expirationTimestampMs);
        A1A.append(",playableDurationMs=");
        A1A.append(this.playableDurationMs);
        A1A.append(",mediaLastWatchedPositionMs=");
        A1A.append(this.mediaLastWatchedPositionMs);
        A1A.append(",ownerIsVerified=");
        A1A.append(this.ownerIsVerified);
        A1A.append(",isLive=");
        A1A.append(this.isLive);
        A1A.append(",mediaRankingRequestId=");
        A1A.append(this.mediaRankingRequestId);
        A1A.append(",containsLicensedMusic=");
        A1A.append(this.containsLicensedMusic);
        A1A.append(",logInfo=");
        A1A.append(this.logInfo);
        A1A.append(",tapAction=");
        A1A.append(this.tapAction);
        A1A.append(",tracking=");
        A1A.append(this.tracking);
        A1A.append(",mediaStartPlayPositionMs=");
        A1A.append(this.mediaStartPlayPositionMs);
        A1A.append(",externalMediaConfig=");
        return C66582MXn.A0v(this.externalMediaConfig, A1A);
    }
}
