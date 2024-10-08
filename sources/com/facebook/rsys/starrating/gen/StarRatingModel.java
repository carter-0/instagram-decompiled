package com.facebook.rsys.starrating.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public class StarRatingModel {
    public static 2LV CONVERTER = C22181Xwr.A00(57);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native StarRatingModel createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i, boolean z, int i2, String str, int i3, int i4, Long l);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native String getBlackboxTraceId();

    public native int getCallEndDelayAfterRatingSeconds();

    public native Long getRatingStyle();

    public native int getShouldShowStarRating();

    public native int getStarRating();

    public native boolean getStarRatingRecorded();

    public native int getThresholdForSurvey();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StarRatingModel)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public StarRatingModel(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public StarRatingModel(int i, boolean z, int i2, String str, int i3, int i4, Long l) {
        this.mNativeHolder = initNativeHolder(i, z, i2, str, i3, i4, l);
    }
}
