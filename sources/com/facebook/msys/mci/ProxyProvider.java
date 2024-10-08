package com.facebook.msys.mci;

import X.C21540XeB;
import com.facebook.msys.util.Provider;

public final class ProxyProvider {
    public final Provider mAnalyticsProvider;
    public final Provider mCryptoProvider;
    public final Provider mDeviceBackupProvider = null;
    public final Provider mExecutionIdleProvider;
    public final Provider mMediaTranscoderProvider;

    public ProxyProvider(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.mAnalyticsProvider = provider;
        this.mCryptoProvider = provider2;
        this.mMediaTranscoderProvider = provider4;
        this.mExecutionIdleProvider = provider3;
    }

    private Analytics getAnalytics() {
        Provider provider = this.mAnalyticsProvider;
        if (provider == null) {
            return null;
        }
        Object obj = provider.get();
        if (obj != null) {
            return (Analytics) obj;
        }
        throw new IllegalArgumentException("Msys proxy was null when provider.get called.  Please ensure that all providers given to ProxyProvider do not return null.");
    }

    private Crypto getCrypto() {
        Object obj = this.mCryptoProvider.get();
        if (obj != null) {
            return (Crypto) obj;
        }
        throw new IllegalArgumentException("Msys proxy was null when provider.get called.  Please ensure that all providers given to ProxyProvider do not return null.");
    }

    private DeviceBackup getDeviceBackup() {
        Provider provider = this.mDeviceBackupProvider;
        if (provider == null) {
            return null;
        }
        Object obj = provider.get();
        if (obj != null) {
            return (DeviceBackup) obj;
        }
        throw new IllegalArgumentException("Msys proxy was null when provider.get called.  Please ensure that all providers given to ProxyProvider do not return null.");
    }

    private C21540XeB getExecutionIdle() {
        Object obj = this.mExecutionIdleProvider.get();
        if (obj != null) {
            return (C21540XeB) obj;
        }
        throw new IllegalArgumentException("Msys proxy was null when provider.get called.  Please ensure that all providers given to ProxyProvider do not return null.");
    }

    public MediaTranscoder getMediaTranscoder() {
        Object obj = this.mMediaTranscoderProvider.get();
        if (obj != null) {
            return (MediaTranscoder) obj;
        }
        throw new IllegalArgumentException("Msys proxy was null when provider.get called.  Please ensure that all providers given to ProxyProvider do not return null.");
    }
}
