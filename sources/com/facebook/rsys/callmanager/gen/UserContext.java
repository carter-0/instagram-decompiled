package com.facebook.rsys.callmanager.gen;

import X.2LV;
import X.C66581MXm;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.RedactedString;
import com.facebook.rsys.audio.gen.AudioPipelineContext;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;
import com.facebook.rsys.filelogging.gen.LargeLogUploadProxy;
import com.facebook.rsys.log.gen.LogPersistenceProxy;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.perf.holders.gen.PerfLoggerHolder;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.rsys.turnallocation.gen.TurnAllocationProxy;
import com.facebook.simplejni.NativeHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.ArrayList;

public class UserContext {
    public static 2LV CONVERTER = C71546Omh.A00(21);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native UserContext createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, RedactedString redactedString, AppInfo appInfo, CryptoContextHolder cryptoContextHolder, SignalingTransportProxy signalingTransportProxy, AudioPipelineContext audioPipelineContext, LogPersistenceProxy logPersistenceProxy, LargeLogUploadProxy largeLogUploadProxy, byte[] bArr, OverlayConfigManagerHolder overlayConfigManagerHolder, TurnAllocationProxy turnAllocationProxy, String str2, ArrayList arrayList, XAnalyticsHolder xAnalyticsHolder, PerfLoggerHolder perfLoggerHolder);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native AppInfo getAppInfo();

    public native AudioPipelineContext getAudioPipelineContext();

    public native RedactedString getAuthDataAccessToken();

    public native byte[] getCapabilities();

    public native CryptoContextHolder getCryptoContext();

    public native LargeLogUploadProxy getLargeLogUploader();

    public native String getLogDirectory();

    public native LogPersistenceProxy getLogPersister();

    public native OverlayConfigManagerHolder getOverlayConfigManager();

    public native PerfLoggerHolder getPerfLogger();

    public native SignalingTransportProxy getSignalingTransport();

    public native XAnalyticsHolder getStructuredlogger();

    @Deprecated
    public native ArrayList getSupportedCodecs();

    public native TurnAllocationProxy getTurnAllocationProxy();

    public native String getUserId();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UserContext)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public UserContext(String str, RedactedString redactedString, AppInfo appInfo, CryptoContextHolder cryptoContextHolder, SignalingTransportProxy signalingTransportProxy, AudioPipelineContext audioPipelineContext, LogPersistenceProxy logPersistenceProxy, LargeLogUploadProxy largeLogUploadProxy, byte[] bArr, OverlayConfigManagerHolder overlayConfigManagerHolder, TurnAllocationProxy turnAllocationProxy, String str2, ArrayList arrayList, XAnalyticsHolder xAnalyticsHolder, PerfLoggerHolder perfLoggerHolder) {
        String str3 = str;
        AppInfo appInfo2 = appInfo;
        LogPersistenceProxy logPersistenceProxy2 = logPersistenceProxy;
        C66581MXm.A1R(str3, appInfo2, logPersistenceProxy2);
        XAnalyticsHolder xAnalyticsHolder2 = xAnalyticsHolder;
        OverlayConfigManagerHolder overlayConfigManagerHolder2 = overlayConfigManagerHolder;
        TurnAllocationProxy turnAllocationProxy2 = turnAllocationProxy;
        C66581MXm.A1R(overlayConfigManagerHolder2, turnAllocationProxy2, xAnalyticsHolder2);
        RedactedString redactedString2 = redactedString;
        CryptoContextHolder cryptoContextHolder2 = cryptoContextHolder;
        SignalingTransportProxy signalingTransportProxy2 = signalingTransportProxy;
        AudioPipelineContext audioPipelineContext2 = audioPipelineContext;
        LargeLogUploadProxy largeLogUploadProxy2 = largeLogUploadProxy;
        byte[] bArr2 = bArr;
        this.mNativeHolder = initNativeHolder(str3, redactedString2, appInfo2, cryptoContextHolder2, signalingTransportProxy2, audioPipelineContext2, logPersistenceProxy2, largeLogUploadProxy2, bArr2, overlayConfigManagerHolder2, turnAllocationProxy2, str2, arrayList, xAnalyticsHolder2, perfLoggerHolder);
    }

    public UserContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
