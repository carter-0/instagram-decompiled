package com.facebook.rsys.cowatch.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class CowatchBrowseSurfaceApi {

    public final class CProxy extends CowatchBrowseSurfaceApi {
        public final NativeHolder mNativeHolder;

        public static native CowatchBrowseSurfaceApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void back();

        public native void dismiss();

        public native void dismissSeasonPickerAction();

        public native void expandMediaCellView(String str);

        public native int hashCode();

        public native void loadNextPage();

        public native void open(String str, boolean z, String str2, int i);

        public native void privacyNuxShown();

        public native void search(String str);

        public native void selectSearchField();

        public native void selectShow(long j, long j2, int i);

        public native void selectShowSeason(String str, int i);

        public native void selectTabClientActionCreate(long j, boolean z);

        public native void showSeasonPicker();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchBrowseSurfaceApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void back();

    public abstract void dismiss();

    public abstract void dismissSeasonPickerAction();

    public abstract void expandMediaCellView(String str);

    public abstract void loadNextPage();

    public abstract void open(String str, boolean z, String str2, int i);

    public abstract void privacyNuxShown();

    public abstract void search(String str);

    public abstract void selectSearchField();

    public abstract void selectShow(long j, long j2, int i);

    public abstract void selectShowSeason(String str, int i);

    public abstract void selectTabClientActionCreate(long j, boolean z);

    public abstract void showSeasonPicker();
}
