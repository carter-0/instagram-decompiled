package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.0qQ;
import X.AnonymousClass0T0;
import X.G9w;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

public final class ImagineViewModel extends AnonymousClass0T0 {
    @SerializedName("imagine_raw_data")
    public final ImagineRawData[] imagineRawData;

    public final ImagineRawData[] component1() {
        return this.imagineRawData;
    }

    public final ImagineViewModel copy(ImagineRawData[] imagineRawDataArr) {
        return new ImagineViewModel(imagineRawDataArr);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ImagineViewModel) && 0qQ.A0K(this.imagineRawData, ((ImagineViewModel) obj).imagineRawData));
    }

    public int hashCode() {
        ImagineRawData[] imagineRawDataArr = this.imagineRawData;
        if (imagineRawDataArr == null) {
            return 0;
        }
        return Arrays.hashCode(imagineRawDataArr);
    }

    public static /* synthetic */ ImagineViewModel copy$default(ImagineViewModel imagineViewModel, ImagineRawData[] imagineRawDataArr, int i, Object obj) {
        if ((i & 1) != 0) {
            imagineRawDataArr = imagineViewModel.imagineRawData;
        }
        return new ImagineViewModel(imagineRawDataArr);
    }

    public final ImagineRawData[] getImagineRawData() {
        return this.imagineRawData;
    }

    public String toString() {
        return G9w.A0k("ImagineViewModel(imagineRawData=", Arrays.toString(this.imagineRawData));
    }

    public ImagineViewModel(ImagineRawData[] imagineRawDataArr) {
        this.imagineRawData = imagineRawDataArr;
    }
}
