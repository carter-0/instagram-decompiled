package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.002;
import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import com.google.gson.annotations.SerializedName;

public final class ReelsData extends AnonymousClass0T0 {
    @SerializedName("author")
    public final String author;
    @SerializedName("avatar_url")
    public final String profilePictureUrl;
    @SerializedName("reels_url")
    public final String reelsUrl;
    @SerializedName("thumbnail_url")
    public final String thumbnailUrl;

    public final String component1() {
        return this.reelsUrl;
    }

    public final String component2() {
        return this.thumbnailUrl;
    }

    public final String component3() {
        return this.author;
    }

    public final String component4() {
        return this.profilePictureUrl;
    }

    public final ReelsData copy(String str, String str2, String str3, String str4) {
        return new ReelsData(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReelsData) {
                ReelsData reelsData = (ReelsData) obj;
                if (!0qQ.A0K(this.reelsUrl, reelsData.reelsUrl) || !0qQ.A0K(this.thumbnailUrl, reelsData.thumbnailUrl) || !0qQ.A0K(this.author, reelsData.author) || !0qQ.A0K(this.profilePictureUrl, reelsData.profilePictureUrl)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return 002.A17("ReelsData(reelsUrl=", this.reelsUrl, ", thumbnailUrl=", this.thumbnailUrl, ", author=", this.author, AnonymousClass000.A00(401), this.profilePictureUrl, ')');
    }

    public static /* synthetic */ ReelsData copy$default(ReelsData reelsData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reelsData.reelsUrl;
        }
        if ((i & 2) != 0) {
            str2 = reelsData.thumbnailUrl;
        }
        if ((i & 4) != 0) {
            str3 = reelsData.author;
        }
        if ((i & 8) != 0) {
            str4 = reelsData.profilePictureUrl;
        }
        return new ReelsData(str, str2, str3, str4);
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public final String getReelsUrl() {
        return this.reelsUrl;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.reelsUrl) * 31) + AnonymousClass7TG.A0E(this.thumbnailUrl)) * 31) + AnonymousClass7TG.A0E(this.author)) * 31) + C41845B3m.A00(this.profilePictureUrl);
    }

    public ReelsData(String str, String str2, String str3, String str4) {
        this.reelsUrl = str;
        this.thumbnailUrl = str2;
        this.author = str3;
        this.profilePictureUrl = str4;
    }
}
