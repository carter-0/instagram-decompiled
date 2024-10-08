package com.facebook.rsys.cowatch.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C66579MXk;
import X.C66581MXm;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchMediaInfoModel {
    public static 2LV CONVERTER = C22180Xwq.A00(32);
    public static long sMcfTypeId;
    public final ArrayList captionAvailableLanguages;
    public final boolean containsLicensedMusic;
    public final String contentRating;
    public final String dashManifest;
    public final long durationMs;
    public final long expirationTimestampMs;
    public final boolean isLive;
    public final boolean isNonInteractable;
    public final boolean isReel;
    public final boolean isReportable;
    public final float mediaAspectRatio;
    public final String mediaFallbackURL;
    public final String mediaID;
    public final String mediaSource;
    public final String mediaSubtitle;
    public final String mediaTitle;
    public final int mediaType;
    public final String mediaURL;
    public final String ownerAvatarURL;
    public final String ownerId;
    public final String ownerName;
    public final String placeholderMessage;
    public final String placeholderTitle;
    public final CowatchReelsMediaInfoModel reelsMediaInfoModel;
    public final String thumbnailFallbackUrl;
    public final String thumbnailUrl;
    public final long thumbnailUrlExpirationTimestampMs;
    public final String tracking;

    public static native CowatchMediaInfoModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchMediaInfoModel)) {
                return false;
            }
            CowatchMediaInfoModel cowatchMediaInfoModel = (CowatchMediaInfoModel) obj;
            if (!this.mediaID.equals(cowatchMediaInfoModel.mediaID) || !this.mediaSource.equals(cowatchMediaInfoModel.mediaSource)) {
                return false;
            }
            String str = this.mediaURL;
            String str2 = cowatchMediaInfoModel.mediaURL;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.mediaAspectRatio != cowatchMediaInfoModel.mediaAspectRatio) {
                return false;
            }
            String str3 = this.dashManifest;
            String str4 = cowatchMediaInfoModel.dashManifest;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.mediaFallbackURL;
            String str6 = cowatchMediaInfoModel.mediaFallbackURL;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.ownerName;
            String str8 = cowatchMediaInfoModel.ownerName;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.ownerAvatarURL;
            String str10 = cowatchMediaInfoModel.ownerAvatarURL;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            String str11 = this.ownerId;
            String str12 = cowatchMediaInfoModel.ownerId;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            if (this.expirationTimestampMs != cowatchMediaInfoModel.expirationTimestampMs) {
                return false;
            }
            String str13 = this.mediaTitle;
            String str14 = cowatchMediaInfoModel.mediaTitle;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            String str15 = this.mediaSubtitle;
            String str16 = cowatchMediaInfoModel.mediaSubtitle;
            if (str15 == null) {
                if (str16 != null) {
                    return false;
                }
            } else if (!str15.equals(str16)) {
                return false;
            }
            String str17 = this.placeholderTitle;
            String str18 = cowatchMediaInfoModel.placeholderTitle;
            if (str17 == null) {
                if (str18 != null) {
                    return false;
                }
            } else if (!str17.equals(str18)) {
                return false;
            }
            String str19 = this.placeholderMessage;
            String str20 = cowatchMediaInfoModel.placeholderMessage;
            if (str19 == null) {
                if (str20 != null) {
                    return false;
                }
            } else if (!str19.equals(str20)) {
                return false;
            }
            String str21 = this.thumbnailUrl;
            String str22 = cowatchMediaInfoModel.thumbnailUrl;
            if (str21 == null) {
                if (str22 != null) {
                    return false;
                }
            } else if (!str21.equals(str22)) {
                return false;
            }
            String str23 = this.thumbnailFallbackUrl;
            String str24 = cowatchMediaInfoModel.thumbnailFallbackUrl;
            if (str23 == null) {
                if (str24 != null) {
                    return false;
                }
            } else if (!str23.equals(str24)) {
                return false;
            }
            if (this.thumbnailUrlExpirationTimestampMs != cowatchMediaInfoModel.thumbnailUrlExpirationTimestampMs || this.isLive != cowatchMediaInfoModel.isLive || this.durationMs != cowatchMediaInfoModel.durationMs || !this.captionAvailableLanguages.equals(cowatchMediaInfoModel.captionAvailableLanguages) || this.mediaType != cowatchMediaInfoModel.mediaType || this.isNonInteractable != cowatchMediaInfoModel.isNonInteractable || this.containsLicensedMusic != cowatchMediaInfoModel.containsLicensedMusic) {
                return false;
            }
            String str25 = this.contentRating;
            String str26 = cowatchMediaInfoModel.contentRating;
            if (str25 == null) {
                if (str26 != null) {
                    return false;
                }
            } else if (!str25.equals(str26)) {
                return false;
            }
            if (this.isReportable != cowatchMediaInfoModel.isReportable) {
                return false;
            }
            String str27 = this.tracking;
            String str28 = cowatchMediaInfoModel.tracking;
            if (str27 == null) {
                if (str28 != null) {
                    return false;
                }
            } else if (!str27.equals(str28)) {
                return false;
            }
            if (this.isReel != cowatchMediaInfoModel.isReel) {
                return false;
            }
            CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel = this.reelsMediaInfoModel;
            CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel2 = cowatchMediaInfoModel.reelsMediaInfoModel;
            if (cowatchReelsMediaInfoModel != null) {
                return cowatchReelsMediaInfoModel.equals(cowatchReelsMediaInfoModel2);
            }
            if (cowatchReelsMediaInfoModel2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        int A06 = C66583MXo.A06(this.mediaID);
        long j = this.expirationTimestampMs;
        long j2 = this.thumbnailUrlExpirationTimestampMs;
        return ((((((((((((((AnonymousClass7TF.A07(this.captionAvailableLanguages, AnonymousClass7TF.A01(this.durationMs, (AnonymousClass7TF.A01(j2, (((((((((((AnonymousClass7TF.A01(j, (((((((((AnonymousClass7TF.A00((AnonymousClass7TF.A08(this.mediaSource, A06) + AnonymousClass7TG.A0E(this.mediaURL)) * 31, this.mediaAspectRatio) + AnonymousClass7TG.A0E(this.dashManifest)) * 31) + AnonymousClass7TG.A0E(this.mediaFallbackURL)) * 31) + AnonymousClass7TG.A0E(this.ownerName)) * 31) + AnonymousClass7TG.A0E(this.ownerAvatarURL)) * 31) + AnonymousClass7TG.A0E(this.ownerId)) * 31) + AnonymousClass7TG.A0E(this.mediaTitle)) * 31) + AnonymousClass7TG.A0E(this.mediaSubtitle)) * 31) + AnonymousClass7TG.A0E(this.placeholderTitle)) * 31) + AnonymousClass7TG.A0E(this.placeholderMessage)) * 31) + AnonymousClass7TG.A0E(this.thumbnailUrl)) * 31) + AnonymousClass7TG.A0E(this.thumbnailFallbackUrl)) * 31) + (this.isLive ? 1 : 0)) * 31)) + this.mediaType) * 31) + (this.isNonInteractable ? 1 : 0)) * 31) + (this.containsLicensedMusic ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.contentRating)) * 31) + (this.isReportable ? 1 : 0)) * 31) + AnonymousClass7TG.A0E(this.tracking)) * 31) + (this.isReel ? 1 : 0)) * 31) + AnonymousClass7TE.A0L(this.reelsMediaInfoModel);
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchMediaInfoModel{mediaID=");
        A1A.append(this.mediaID);
        A1A.append(",mediaSource=");
        A1A.append(this.mediaSource);
        A1A.append(",mediaURL=");
        A1A.append(this.mediaURL);
        A1A.append(",mediaAspectRatio=");
        A1A.append(this.mediaAspectRatio);
        A1A.append(",dashManifest=");
        A1A.append(this.dashManifest);
        A1A.append(",mediaFallbackURL=");
        A1A.append(this.mediaFallbackURL);
        A1A.append(",ownerName=");
        A1A.append(this.ownerName);
        A1A.append(",ownerAvatarURL=");
        A1A.append(this.ownerAvatarURL);
        A1A.append(",ownerId=");
        A1A.append(this.ownerId);
        A1A.append(",expirationTimestampMs=");
        A1A.append(this.expirationTimestampMs);
        A1A.append(",mediaTitle=");
        A1A.append(this.mediaTitle);
        A1A.append(",mediaSubtitle=");
        A1A.append(this.mediaSubtitle);
        A1A.append(",placeholderTitle=");
        A1A.append(this.placeholderTitle);
        A1A.append(",placeholderMessage=");
        A1A.append(this.placeholderMessage);
        A1A.append(C66579MXk.A00(458));
        A1A.append(this.thumbnailUrl);
        A1A.append(",thumbnailFallbackUrl=");
        A1A.append(this.thumbnailFallbackUrl);
        A1A.append(",thumbnailUrlExpirationTimestampMs=");
        A1A.append(this.thumbnailUrlExpirationTimestampMs);
        A1A.append(",isLive=");
        A1A.append(this.isLive);
        A1A.append(",durationMs=");
        A1A.append(this.durationMs);
        A1A.append(",captionAvailableLanguages=");
        A1A.append(this.captionAvailableLanguages);
        A1A.append(",mediaType=");
        A1A.append(this.mediaType);
        A1A.append(",isNonInteractable=");
        A1A.append(this.isNonInteractable);
        A1A.append(",containsLicensedMusic=");
        A1A.append(this.containsLicensedMusic);
        A1A.append(",contentRating=");
        A1A.append(this.contentRating);
        A1A.append(",isReportable=");
        A1A.append(this.isReportable);
        A1A.append(",tracking=");
        A1A.append(this.tracking);
        A1A.append(",isReel=");
        A1A.append(this.isReel);
        A1A.append(",reelsMediaInfoModel=");
        return C66582MXn.A0v(this.reelsMediaInfoModel, A1A);
    }

    public CowatchMediaInfoModel(String str, String str2, String str3, float f, String str4, String str5, String str6, String str7, String str8, long j, String str9, String str10, String str11, String str12, String str13, String str14, long j2, boolean z, long j3, ArrayList arrayList, int i, boolean z2, boolean z3, String str15, boolean z4, String str16, boolean z5, CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel) {
        ArrayList arrayList2 = arrayList;
        C66581MXm.A1R(str, str2, arrayList2);
        this.mediaID = str;
        this.mediaSource = str2;
        this.mediaURL = str3;
        this.mediaAspectRatio = f;
        this.dashManifest = str4;
        this.mediaFallbackURL = str5;
        this.ownerName = str6;
        this.ownerAvatarURL = str7;
        this.ownerId = str8;
        this.expirationTimestampMs = j;
        this.mediaTitle = str9;
        this.mediaSubtitle = str10;
        this.placeholderTitle = str11;
        this.placeholderMessage = str12;
        this.thumbnailUrl = str13;
        this.thumbnailFallbackUrl = str14;
        this.thumbnailUrlExpirationTimestampMs = j2;
        this.isLive = z;
        this.durationMs = j3;
        this.captionAvailableLanguages = arrayList2;
        this.mediaType = i;
        this.isNonInteractable = z2;
        this.containsLicensedMusic = z3;
        this.contentRating = str15;
        this.isReportable = z4;
        this.tracking = str16;
        this.isReel = z5;
        this.reelsMediaInfoModel = cowatchReelsMediaInfoModel;
    }
}
