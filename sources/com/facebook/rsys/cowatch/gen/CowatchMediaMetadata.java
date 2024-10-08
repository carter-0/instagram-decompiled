package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C51972G9s;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchMediaMetadata {
    public final boolean containsLicensedMusic;
    public final String contentRating;
    public final String dashManifest;
    public final long durationMs;
    public final boolean isLive;
    public final boolean isReel;
    public final boolean isReportable;
    public final float mediaAspectRatio;
    public final String mediaSubtitle;
    public final String mediaTitle;
    public final String mediaURL;
    public final String ownerAvatarURL;
    public final String ownerName;
    public final CowatchReelsMediaInfoModel reelsMediaMetadata;

    public static native CowatchMediaMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchMediaMetadata)) {
                return false;
            }
            CowatchMediaMetadata cowatchMediaMetadata = (CowatchMediaMetadata) obj;
            String str = this.mediaURL;
            String str2 = cowatchMediaMetadata.mediaURL;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.dashManifest;
            String str4 = cowatchMediaMetadata.dashManifest;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.isLive != cowatchMediaMetadata.isLive || this.durationMs != cowatchMediaMetadata.durationMs || this.mediaAspectRatio != cowatchMediaMetadata.mediaAspectRatio) {
                return false;
            }
            String str5 = this.mediaTitle;
            String str6 = cowatchMediaMetadata.mediaTitle;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.mediaSubtitle;
            String str8 = cowatchMediaMetadata.mediaSubtitle;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            if (this.containsLicensedMusic != cowatchMediaMetadata.containsLicensedMusic || this.isReportable != cowatchMediaMetadata.isReportable) {
                return false;
            }
            String str9 = this.contentRating;
            String str10 = cowatchMediaMetadata.contentRating;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            if (this.isReel != cowatchMediaMetadata.isReel) {
                return false;
            }
            String str11 = this.ownerName;
            String str12 = cowatchMediaMetadata.ownerName;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            String str13 = this.ownerAvatarURL;
            String str14 = cowatchMediaMetadata.ownerAvatarURL;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel = this.reelsMediaMetadata;
            CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel2 = cowatchMediaMetadata.reelsMediaMetadata;
            if (cowatchReelsMediaInfoModel != null) {
                return cowatchReelsMediaInfoModel.equals(cowatchReelsMediaInfoModel2);
            }
            if (cowatchReelsMediaInfoModel2 != null) {
                return false;
            }
        }
    }

    public final int hashCode() {
        return ((((((((((((((((AnonymousClass7TF.A00(C51972G9s.A07(this.durationMs, (((C66583MXo.A01(AnonymousClass7TG.A0E(this.mediaURL)) + AnonymousClass7TG.A0E(this.dashManifest)) * 31) + (this.isLive ? 1 : 0)) * 31), this.mediaAspectRatio) + AnonymousClass7TG.A0E(this.mediaTitle)) * 31) + AnonymousClass7TG.A0E(this.mediaSubtitle)) * 31) + (this.containsLicensedMusic ? 1 : 0)) * 31) + (this.isReportable ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.contentRating)) * 31) + (this.isReel ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.ownerName)) * 31) + AnonymousClass7TG.A0E(this.ownerAvatarURL)) * 31) + AnonymousClass7TE.A0L(this.reelsMediaMetadata);
    }

    public CowatchMediaMetadata(String str, String str2, boolean z, long j, float f, String str3, String str4, boolean z2, boolean z3, String str5, boolean z4, String str6, String str7, CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel) {
        this.mediaURL = str;
        this.dashManifest = str2;
        this.isLive = z;
        this.durationMs = j;
        this.mediaAspectRatio = f;
        this.mediaTitle = str3;
        this.mediaSubtitle = str4;
        this.containsLicensedMusic = z2;
        this.isReportable = z3;
        this.contentRating = str5;
        this.isReel = z4;
        this.ownerName = str6;
        this.ownerAvatarURL = str7;
        this.reelsMediaMetadata = cowatchReelsMediaInfoModel;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchMediaMetadata{mediaURL=");
        A1A.append(this.mediaURL);
        A1A.append(",dashManifest=");
        A1A.append(this.dashManifest);
        A1A.append(",isLive=");
        A1A.append(this.isLive);
        A1A.append(",durationMs=");
        A1A.append(this.durationMs);
        A1A.append(",mediaAspectRatio=");
        A1A.append(this.mediaAspectRatio);
        A1A.append(",mediaTitle=");
        A1A.append(this.mediaTitle);
        A1A.append(",mediaSubtitle=");
        A1A.append(this.mediaSubtitle);
        A1A.append(",containsLicensedMusic=");
        A1A.append(this.containsLicensedMusic);
        A1A.append(",isReportable=");
        A1A.append(this.isReportable);
        A1A.append(",contentRating=");
        A1A.append(this.contentRating);
        A1A.append(",isReel=");
        A1A.append(this.isReel);
        A1A.append(",ownerName=");
        A1A.append(this.ownerName);
        A1A.append(",ownerAvatarURL=");
        A1A.append(this.ownerAvatarURL);
        A1A.append(",reelsMediaMetadata=");
        return C66582MXn.A0v(this.reelsMediaMetadata, A1A);
    }
}
