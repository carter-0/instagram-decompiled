package com.facebook.rsys.cowatch.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C51972G9s;
import X.C66579MXk;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchPlayerModel {
    public static 2LV CONVERTER = C22180Xwq.A00(35);
    public static long sMcfTypeId;
    public final CowatchAdminMessageModel adminMessage;
    public final CowatchCaptionLocale captionSelectedLanguage;
    public final int contentAvailability;
    public final CowatchPlayerInternalModel internal;
    public final CowatchPlayerIosModel iosModel;
    public final boolean isStartedFromAutoplay;
    public final String mediaID;
    public final CowatchMediaInfoModel mediaInfo;
    public final int mediaPlaybackState;
    public final long mediaPositionMs;
    public final String mediaSource;
    public final CowatchSuggestedContentQueueModel suggestedContentQueue;

    public static native CowatchPlayerModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchPlayerModel)) {
                return false;
            }
            CowatchPlayerModel cowatchPlayerModel = (CowatchPlayerModel) obj;
            String str = this.mediaID;
            String str2 = cowatchPlayerModel.mediaID;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.mediaSource;
            String str4 = cowatchPlayerModel.mediaSource;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.mediaPlaybackState != cowatchPlayerModel.mediaPlaybackState || this.mediaPositionMs != cowatchPlayerModel.mediaPositionMs) {
                return false;
            }
            CowatchCaptionLocale cowatchCaptionLocale = this.captionSelectedLanguage;
            CowatchCaptionLocale cowatchCaptionLocale2 = cowatchPlayerModel.captionSelectedLanguage;
            if (cowatchCaptionLocale == null) {
                if (cowatchCaptionLocale2 != null) {
                    return false;
                }
            } else if (!cowatchCaptionLocale.equals(cowatchCaptionLocale2)) {
                return false;
            }
            CowatchMediaInfoModel cowatchMediaInfoModel = this.mediaInfo;
            CowatchMediaInfoModel cowatchMediaInfoModel2 = cowatchPlayerModel.mediaInfo;
            if (cowatchMediaInfoModel == null) {
                if (cowatchMediaInfoModel2 != null) {
                    return false;
                }
            } else if (!cowatchMediaInfoModel.equals(cowatchMediaInfoModel2)) {
                return false;
            }
            CowatchAdminMessageModel cowatchAdminMessageModel = this.adminMessage;
            CowatchAdminMessageModel cowatchAdminMessageModel2 = cowatchPlayerModel.adminMessage;
            if (cowatchAdminMessageModel == null) {
                if (cowatchAdminMessageModel2 != null) {
                    return false;
                }
            } else if (!cowatchAdminMessageModel.equals(cowatchAdminMessageModel2)) {
                return false;
            }
            if (this.contentAvailability != cowatchPlayerModel.contentAvailability || !this.iosModel.equals(cowatchPlayerModel.iosModel) || this.isStartedFromAutoplay != cowatchPlayerModel.isStartedFromAutoplay || !this.internal.equals(cowatchPlayerModel.internal)) {
                return false;
            }
            CowatchSuggestedContentQueueModel cowatchSuggestedContentQueueModel = this.suggestedContentQueue;
            CowatchSuggestedContentQueueModel cowatchSuggestedContentQueueModel2 = cowatchPlayerModel.suggestedContentQueue;
            if (cowatchSuggestedContentQueueModel != null) {
                return cowatchSuggestedContentQueueModel.equals(cowatchSuggestedContentQueueModel2);
            }
            if (cowatchSuggestedContentQueueModel2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        long j = this.mediaPositionMs;
        CowatchPlayerIosModel cowatchPlayerIosModel = this.iosModel;
        return AnonymousClass7TF.A07(this.internal, (AnonymousClass7TF.A07(cowatchPlayerIosModel, (((((((C51972G9s.A07(j, (((C66583MXo.A01(AnonymousClass7TG.A0E(this.mediaID)) + AnonymousClass7TG.A0E(this.mediaSource)) * 31) + this.mediaPlaybackState) * 31) + AnonymousClass7TG.A0C(this.captionSelectedLanguage)) * 31) + AnonymousClass7TG.A0C(this.mediaInfo)) * 31) + AnonymousClass7TG.A0C(this.adminMessage)) * 31) + this.contentAvailability) * 31) + (this.isStartedFromAutoplay ? 1 : 0)) * 31) + AnonymousClass7TE.A0L(this.suggestedContentQueue);
    }

    public CowatchPlayerModel(String str, String str2, int i, long j, CowatchCaptionLocale cowatchCaptionLocale, CowatchMediaInfoModel cowatchMediaInfoModel, CowatchAdminMessageModel cowatchAdminMessageModel, int i2, CowatchPlayerIosModel cowatchPlayerIosModel, boolean z, CowatchPlayerInternalModel cowatchPlayerInternalModel, CowatchSuggestedContentQueueModel cowatchSuggestedContentQueueModel) {
        cowatchPlayerIosModel.getClass();
        cowatchPlayerInternalModel.getClass();
        this.mediaID = str;
        this.mediaSource = str2;
        this.mediaPlaybackState = i;
        this.mediaPositionMs = j;
        this.captionSelectedLanguage = cowatchCaptionLocale;
        this.mediaInfo = cowatchMediaInfoModel;
        this.adminMessage = cowatchAdminMessageModel;
        this.contentAvailability = i2;
        this.iosModel = cowatchPlayerIosModel;
        this.isStartedFromAutoplay = z;
        this.internal = cowatchPlayerInternalModel;
        this.suggestedContentQueue = cowatchSuggestedContentQueueModel;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchPlayerModel{mediaID=");
        A1A.append(this.mediaID);
        A1A.append(",mediaSource=");
        A1A.append(this.mediaSource);
        A1A.append(",mediaPlaybackState=");
        A1A.append(this.mediaPlaybackState);
        A1A.append(C66579MXk.A00(453));
        A1A.append(this.mediaPositionMs);
        A1A.append(",captionSelectedLanguage=");
        A1A.append(this.captionSelectedLanguage);
        A1A.append(",mediaInfo=");
        A1A.append(this.mediaInfo);
        A1A.append(C66579MXk.A00(449));
        A1A.append(this.adminMessage);
        A1A.append(",contentAvailability=");
        A1A.append(this.contentAvailability);
        A1A.append(",iosModel=");
        A1A.append(this.iosModel);
        A1A.append(",isStartedFromAutoplay=");
        A1A.append(this.isStartedFromAutoplay);
        A1A.append(",internal=");
        A1A.append(this.internal);
        A1A.append(",suggestedContentQueue=");
        return C66582MXn.A0v(this.suggestedContentQueue, A1A);
    }
}
