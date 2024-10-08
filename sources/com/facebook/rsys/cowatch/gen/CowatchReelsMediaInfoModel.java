package com.facebook.rsys.cowatch.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22180Xwq;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchReelsMediaInfoModel {
    public static 2LV CONVERTER = C22180Xwq.A00(37);
    public static long sMcfTypeId;
    public final String commentCount;
    public final String effectsTitle;
    public final String effectsUri;
    public final ArrayList hashtags;
    public final boolean isViewerLiked;
    public final String likeCount;
    public final String musicAlbumArtUri;
    public final String musicTitle;
    public final String privacyScopeImage;
    public final String privacyScopeLabel;
    public final int reelsMediaSource;
    public final String shareCount;

    public static native CowatchReelsMediaInfoModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchReelsMediaInfoModel)) {
                return false;
            }
            CowatchReelsMediaInfoModel cowatchReelsMediaInfoModel = (CowatchReelsMediaInfoModel) obj;
            String str = this.musicTitle;
            String str2 = cowatchReelsMediaInfoModel.musicTitle;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.musicAlbumArtUri;
            String str4 = cowatchReelsMediaInfoModel.musicAlbumArtUri;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.effectsTitle;
            String str6 = cowatchReelsMediaInfoModel.effectsTitle;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.effectsUri;
            String str8 = cowatchReelsMediaInfoModel.effectsUri;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            if (!this.hashtags.equals(cowatchReelsMediaInfoModel.hashtags)) {
                return false;
            }
            String str9 = this.privacyScopeLabel;
            String str10 = cowatchReelsMediaInfoModel.privacyScopeLabel;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            String str11 = this.privacyScopeImage;
            String str12 = cowatchReelsMediaInfoModel.privacyScopeImage;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            if (this.reelsMediaSource != cowatchReelsMediaInfoModel.reelsMediaSource) {
                return false;
            }
            String str13 = this.likeCount;
            String str14 = cowatchReelsMediaInfoModel.likeCount;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            String str15 = this.commentCount;
            String str16 = cowatchReelsMediaInfoModel.commentCount;
            if (str15 == null) {
                if (str16 != null) {
                    return false;
                }
            } else if (!str15.equals(str16)) {
                return false;
            }
            String str17 = this.shareCount;
            String str18 = cowatchReelsMediaInfoModel.shareCount;
            if (str17 == null) {
                if (str18 != null) {
                    return false;
                }
            } else if (!str17.equals(str18)) {
                return false;
            }
            return this.isViewerLiked == cowatchReelsMediaInfoModel.isViewerLiked;
        }
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass7TF.A07(this.hashtags, (((((C66583MXo.A01(AnonymousClass7TG.A0E(this.musicTitle)) + AnonymousClass7TG.A0E(this.musicAlbumArtUri)) * 31) + AnonymousClass7TG.A0E(this.effectsTitle)) * 31) + AnonymousClass7TG.A0E(this.effectsUri)) * 31) + AnonymousClass7TG.A0E(this.privacyScopeLabel)) * 31) + AnonymousClass7TG.A0E(this.privacyScopeImage)) * 31) + this.reelsMediaSource) * 31) + AnonymousClass7TG.A0E(this.likeCount)) * 31) + AnonymousClass7TG.A0E(this.commentCount)) * 31) + C41845B3m.A00(this.shareCount)) * 31) + (this.isViewerLiked ? 1 : 0);
    }

    public CowatchReelsMediaInfoModel(String str, String str2, String str3, String str4, ArrayList arrayList, String str5, String str6, int i, String str7, String str8, String str9, boolean z) {
        arrayList.getClass();
        this.musicTitle = str;
        this.musicAlbumArtUri = str2;
        this.effectsTitle = str3;
        this.effectsUri = str4;
        this.hashtags = arrayList;
        this.privacyScopeLabel = str5;
        this.privacyScopeImage = str6;
        this.reelsMediaSource = i;
        this.likeCount = str7;
        this.commentCount = str8;
        this.shareCount = str9;
        this.isViewerLiked = z;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchReelsMediaInfoModel{musicTitle=");
        A1A.append(this.musicTitle);
        A1A.append(",musicAlbumArtUri=");
        A1A.append(this.musicAlbumArtUri);
        A1A.append(",effectsTitle=");
        A1A.append(this.effectsTitle);
        A1A.append(",effectsUri=");
        A1A.append(this.effectsUri);
        A1A.append(",hashtags=");
        A1A.append(this.hashtags);
        A1A.append(",privacyScopeLabel=");
        A1A.append(this.privacyScopeLabel);
        A1A.append(",privacyScopeImage=");
        A1A.append(this.privacyScopeImage);
        A1A.append(",reelsMediaSource=");
        A1A.append(this.reelsMediaSource);
        A1A.append(",likeCount=");
        A1A.append(this.likeCount);
        A1A.append(",commentCount=");
        A1A.append(this.commentCount);
        A1A.append(",shareCount=");
        A1A.append(this.shareCount);
        A1A.append(",isViewerLiked=");
        return C66584MXp.A0b(A1A, this.isViewerLiked);
    }
}
