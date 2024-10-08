package com.facebook.ffmpeg;

import X.C7235Q0h;

public class FFMpegMediaMetadataRetriever {
    public final C7235Q0h mFFMpegLib;
    public long mNativeContext;
    public final String mPath;

    private native void nativeFinalize();

    private native int nativeGetAudioBitRate();

    private native String nativeGetAudioCodecType();

    private native int nativeGetBitRate();

    private native String nativeGetCodecType();

    private native String nativeGetColorTransferType();

    private native String nativeGetComment();

    private native String nativeGetComposer();

    private native String nativeGetCopyright();

    private native String nativeGetCreationTime();

    private native long nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetRotation();

    private native String nativeGetSphericalMetadataXml();

    private native int nativeGetWidth();

    private native void nativeInit(String str);

    private native void nativeRelease();

    public FFMpegMediaMetadataRetriever initialize() {
        this.mFFMpegLib.A00();
        nativeInit(this.mPath);
        return this;
    }

    public FFMpegMediaMetadataRetriever(C7235Q0h q0h, String str) {
        this.mFFMpegLib = q0h;
        this.mPath = str;
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getAudioBitRate() {
        return nativeGetAudioBitRate();
    }

    public String getAudioCodecType() {
        return nativeGetAudioCodecType();
    }

    public int getBitRate() {
        return nativeGetBitRate();
    }

    public String getCodecType() {
        return nativeGetCodecType();
    }

    public String getColorTransferType() {
        return nativeGetColorTransferType();
    }

    public String getComment() {
        return nativeGetComment();
    }

    public String getComposer() {
        return nativeGetComposer();
    }

    public String getCopyright() {
        return nativeGetCopyright();
    }

    public String getCreationTime() {
        return nativeGetCreationTime();
    }

    public long getDurationMs() {
        return nativeGetDurationMs();
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getRotation() {
        return nativeGetRotation();
    }

    public String getSphericalMetadataXml() {
        return nativeGetSphericalMetadataXml();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    public void release() {
        nativeRelease();
    }
}
