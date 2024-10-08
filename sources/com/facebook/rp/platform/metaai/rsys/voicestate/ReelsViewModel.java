package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.002;
import X.0qQ;
import X.AnonymousClass0T0;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

public final class ReelsViewModel extends AnonymousClass0T0 {
    @SerializedName("reels_data")
    public final ReelsData[] reelsData;
    @SerializedName("reels_urls")
    public final String[] reelsUrls;

    public final String[] component1() {
        return this.reelsUrls;
    }

    public final ReelsData[] component2() {
        return this.reelsData;
    }

    public final ReelsViewModel copy(String[] strArr, ReelsData[] reelsDataArr) {
        return new ReelsViewModel(strArr, reelsDataArr);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReelsViewModel) {
                ReelsViewModel reelsViewModel = (ReelsViewModel) obj;
                if (!0qQ.A0K(this.reelsUrls, reelsViewModel.reelsUrls) || !0qQ.A0K(this.reelsData, reelsViewModel.reelsData)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String[] strArr = this.reelsUrls;
        int i = 0;
        int hashCode = (strArr == null ? 0 : Arrays.hashCode(strArr)) * 31;
        ReelsData[] reelsDataArr = this.reelsData;
        if (reelsDataArr != null) {
            i = Arrays.hashCode(reelsDataArr);
        }
        return hashCode + i;
    }

    public String toString() {
        return 002.A0v("ReelsViewModel(reelsUrls=", Arrays.toString(this.reelsUrls), ", reelsData=", Arrays.toString(this.reelsData), ')');
    }

    public static /* synthetic */ ReelsViewModel copy$default(ReelsViewModel reelsViewModel, String[] strArr, ReelsData[] reelsDataArr, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = reelsViewModel.reelsUrls;
        }
        if ((i & 2) != 0) {
            reelsDataArr = reelsViewModel.reelsData;
        }
        return new ReelsViewModel(strArr, reelsDataArr);
    }

    public final ReelsData[] getReelsData() {
        return this.reelsData;
    }

    public final String[] getReelsUrls() {
        return this.reelsUrls;
    }

    public ReelsViewModel(String[] strArr, ReelsData[] reelsDataArr) {
        this.reelsUrls = strArr;
        this.reelsData = reelsDataArr;
    }
}
